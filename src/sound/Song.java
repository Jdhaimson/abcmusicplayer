	package sound;

import java.util.LinkedList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

/**
 * Mutable Song object which represents an entire piece of ABC music
 * @author Josh
 *
 */
public class Song {

	// Header information
	private String title, composer;
	private Fraction defaultLength, meter, tempoNoteType;
	private int index, tempoNPM, ticksPerWholeNote;
	private Key key;
	
	private List<Measure> measures = new LinkedList<Measure>();
	
	
	/**	
	 * Song object
	 * @param title
	 * @param composer
	 * @param noteLength: default duration of note
	 * @param meter: sum of durations of all notes within a bar
	 * @param index: index number to determine play order if in playlist
	 * @param tempoNPM: Amount of notes of given type per minute
	 * @param tempoNoteType: type of note that tempoNPM applies to
	 * @param key: key signature of piece
	 */
	public Song(int index, String title, Key key) {
		//Required fields
		this.index = index;
		this.title = title;
		this.key = key;
		
		//Defaults
		this.composer = "default";
		this.meter = new Fraction(4,4);
		this.defaultLength = new Fraction(1,8);
		this.tempoNoteType = this.defaultLength;
		this.tempoNPM = 100;
	}
	
	public void setComposer(String composer){
		this.composer = composer;
	}
	
	public void setMeter(Fraction meter) {
		this.meter = meter;
		double meterValue = ((double)meter.getNumerator())/((double)meter.getDenominator());
		if (meterValue < 0.75){
			this.defaultLength = new Fraction(1,16);
		}
		this.tempoNoteType = this.defaultLength;
	}
	
	public void setLength(Fraction length){
		this.defaultLength = length;
		this.tempoNoteType = this.defaultLength;
	}
	
	public void setTempo(Fraction tempoNoteType, int tempoNPM){
		this.tempoNoteType = tempoNoteType;
		this.tempoNPM = tempoNPM;
	}
	

	/**
	 * Returns the given note with proper accidentals for the song's key
	 * @param note: String representing name of note
	 * @return Pitch with proper accidentals for key
	 */
	public Pitch getPitchInKey(String note) {
		return this.key.getPitch(note);
	}
	
	/**
	 * 
	 * @return
	 */
	public double getNotesPerMeasure() {
		return this.meter.evaluate();
	}
	
	/**
	 * Adds measure to end of current measures
	 * @param measure
	 */
	public void addMeasure(Measure measure) {
		this.measures.add(measure);
	}
	
	/**
	 * Adds measures to end of current measures
	 * @param measures
	 */
	public void addMeasures(List<Measure> measures) {
		this.measures.addAll(measures);
	}
	
	
	/**
	 * Returns default note length for the song
	 * @return
	 */
	public Fraction getDefaultNoteLen() {
		return this.defaultLength;
	}
	
	public List<Measure> getMeasures() {
		return this.measures;
	}
	
	/**
	 * Returns the duration which is the fraction represented by the string s 
	 * times default note length
	 * @param s: string representing note duration (A1/4, s would be "1/4" and 
	 * @return Fraction which is input fraction * default length
	 */
	public Fraction parseDurationFromString(String s) {
		Fraction def = this.defaultLength;

		if (s.matches("[0-9]*/[0-9]*")) {
			// We know it is a fraction
			String[] split = s.split("/");
		
			if (split.length == 0) {
				// The string was just "/" we default to 1/2
				return new Fraction(def.getNumerator(), 2*def.getDenominator());
			} 
			else if(split.length == 1) {
				// "1/" => ["1"] - 
				// default denominator to 2, numerator comes from string		
				int num = Integer.parseInt(split[0]);
				return new Fraction(num*def.getNumerator(), 2*def.getDenominator());
			} 
			else if(split.length == 2) {
				if (split[0].equals("")) {				
					// "/2" => ["", "2"]
					// Default numerator to 1, get denom from string
					int denom = Integer.parseInt(split[1]);
					return new Fraction(def.getNumerator(), denom*def.getDenominator());
				} 
				else {
					// "1/4" => ["1","4"]
					// get fraction from string
					int num = Integer.parseInt(split[0]);
					int denom = Integer.parseInt(split[1]);
					return new Fraction(num*def.getNumerator(), denom*def.getDenominator());
				}
			} 
			else {
				throw new IllegalArgumentException("The duration can only have one / in it");
			}
		} 
		else {
			// String is just a number
			int num = Integer.parseInt(s);
			return new Fraction(num*def.getNumerator(), def.getDenominator());
		}
	}
	
	/**
	 * Play song object
	 * @throws InvalidMidiDataException 
	 * @throws MidiUnavailableException 
	 */
	public void play() throws MidiUnavailableException, InvalidMidiDataException {
		LyricListener ll = this.getBasicLyricListener();
		SequencePlayer sp = this.createSequencePlayer(ll);
		this.scheduleSequence(sp);
		sp.play();
	}
	
	/**
	 * Returns the smallest amount of ticks per whole note required of the sequence player
	 * @return int: representing the smallest amount of ticks per note
	 */
	public int getTicksPerWholeNote() {
		int maxTicks = 0;
		for (Measure m: this.measures) {
			int ticks = m.getTicksPerWholeNote();
			if (ticks > maxTicks) {
				maxTicks = ticks;
			}
		}
		return maxTicks;
	}

	

	
	
	/**
	 * Creates a basic lyric listener object
	 * @return LyricListener: basic lyric listener object
	 */
	public LyricListener getBasicLyricListener() {
		LyricListener ll = new LyricListener() {
            public void processLyricEvent(String text) {
                System.out.println(text);
            }
        };
        
        return ll;
	}
	
	/**
	 * Creates a SequencePlayer with the right timing for ticks and tempo
	 * @param ll: LyricListener to pass into the SequencePlayer
	 * @return SequencePlayer object with the right tempo
	 * @throws InvalidMidiDataException 
	 * @throws MidiUnavailableException 
	 */
	public SequencePlayer createSequencePlayer(LyricListener ll)
			throws MidiUnavailableException, InvalidMidiDataException {
		
		SequencePlayer sp;
		/*
	     * @param beatsPerMinute the number of beats per minute
	     * @param ticksPerBeat the number of ticks per beat
	     * 
	     * @param meter
	     * @param tempoNPM: Amount of notes of given type per minute
	     * @param tempoNoteType: type of note that tempoNPM applies to
		*/
		
		// Derived from basic musical relationships
		this.ticksPerWholeNote = this.getTicksPerWholeNote();
		Fraction beat = new Fraction(1,this.meter.getDenominator());
		int ticksPerBeat = this.ticksPerWholeNote / this.meter.getDenominator();
		
		int beatsPerMinute = (int)(beat.evaluate()/this.tempoNoteType.evaluate())*(this.tempoNPM);

		sp = new SequencePlayer(beatsPerMinute, ticksPerBeat, ll);
		return sp;
	}
	
	/**
	 * Loops through entire song scheduling MIDI and lyric events in sequencePlayer
	 * @param sp: SequencePlayer object to get scheduled on
	 * @return void
	 */
	public void scheduleSequence(SequencePlayer sp) {
		int tickTracker = 0;
		for(Measure measure: this.measures) {
			for(Voice voice: measure.getVoices()) {

				int voiceTicks = tickTracker;
				for(MusicalElement element: voice.getMusicalElements()) {
					int ticks = (int)((double) this.ticksPerWholeNote*element.getDuration().evaluate());

					if (element instanceof Note) {
						Note note = (Note) element;
						sp.addNote(note.getPitch().toMidiNote(), voiceTicks, ticks);
						System.out.println("Scheduled " + note.toString() + " at tick #" + voiceTicks);
					} 
					else if (element instanceof Chord) {
						Chord chord = (Chord) element;
						List<Note> notes = chord.getNotes();
						for (Note note: notes) {
							int noteDuration = (int) note.getDuration().evaluate()*this.getTicksPerWholeNote();
							sp.addNote(note.getPitch().toMidiNote(), voiceTicks, noteDuration);
						}
						System.out.println("Scheduled " + chord.toString() + " at tick #" + voiceTicks);
					}
					
					
					voiceTicks += ticks;
				}
			}
			
			tickTracker += (int) ((double) this.ticksPerWholeNote * this.meter.evaluate());
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.title + "\n" + this.composer + "\n" + this.meter + "\n" + this.defaultLength
				+ "\n" + this.tempoNoteType + "\n" + this.tempoNPM + "\n" + this.key;
	}
}
