package sound;

import java.util.LinkedList;
import java.util.List;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Song {

	// Header information
	private String title, composer;
	private double noteLength, meter;
	private int index, tempo, ticksPerBeat;
	private Key key;
	
	private List<Measure> measures = new LinkedList<Measure>();
	
	
	/**
	 * Song object
	 * @param title
	 * @param composer
	 * @param noteLength: default duration of note
	 * @param meter: sum of durations of all notes within a bar
	 * @param ticksPerBeat: Amount of ticks for each beat used by MIDI sequence player
	 * @param index: index number to determine play order if in playlist
	 * @param tempo: number of given-length notes per minute
	 * @param key: key signature of piece
	 */
	public Song(String title, String composer, double noteLength, double meter,
				int ticksPerBeat, int index, int tempo, Key key) {
		this.title = title;
		this.composer = composer;
		this.noteLength = noteLength;
		this.meter = meter;
		this.ticksPerBeat = ticksPerBeat; 
		this.index = index;
		this.tempo = tempo;
		this.key = key;
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
	 */
	public void playSong() {
		
	}
	
	/**
	 * Outputs SequencePlayer to be played by MIDI player
	 * @return
	 */
	public SequencePlayer toSequence(SequencePlayer sp, LyricListener ll) {
		//SequencePlayer sp;
		try {
			/*LyricListener ll = new LyricListener() {
	            public void processLyricEvent(String text) {
	                System.out.println(text);
	            }
	        };*/
	        
			sp = new SequencePlayer(tempo, ticksPerBeat, ll);
		}  catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
		
		return sp;
	}
}
