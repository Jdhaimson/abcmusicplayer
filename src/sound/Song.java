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
	private int index, tempoNPM;
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
	 * Play song object
	 * @throws InvalidMidiDataException 
	 * @throws MidiUnavailableException 
	 */
	public void playSong() throws MidiUnavailableException, InvalidMidiDataException {
		LyricListener ll = this.getBasicLyricListener();
		SequencePlayer sp = this.createSequencePlayer(ll);
	}
	
	/**
	 * Returns the smallest amount of ticks per whole note required of the sequence player
	 * @return int: representing the smallest amount of ticks per note
	 */
	public int getTicksPerWholeNote() {
		int maxTicks = 0;
		for (Measure m: this.measures) {
			int ticks = m.getTicksPerWholeNote();
			if (maxTicks > ticks) {
				maxTicks = ticks;
			}
		}
		
		return maxTicks;
	}
	
	/**
	 * Creates a basic lyric listener object
	 * @return LyricListener: basic lyrici listener object
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
		
		int ticksPerWholeNote = this.getTicksPerWholeNote();
		int ticksPerBeat = ticksPerWholeNote / this.meter.getDenominator();
		
		// FIX THIS CODE
		
		sp = new SequencePlayer(100, 11, ll);
		return sp;
	}
	
	/**
	 * Loops through entire song scheduling MIDI and lyric events in sequencePlayer
	 * @param sp: SequencePlayer object to get scheduled on
	 * @return
	 */
	public void addToSequence(SequencePlayer sp) {

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
