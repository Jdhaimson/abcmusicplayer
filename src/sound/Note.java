package sound;

import java.util.LinkedList;
import java.util.List;

public class Note {
	private List<Pitch> pitches = new LinkedList<Pitch>();
	private int duration; // stored as 'ticks' used by sequenceplayer
	
	/**
	 * Constructor of Note Object
	 * @param pitch: Single pitch of note object
	 * @param duration: Number of 'ticks' that note is played for
	 */
	public Note(Pitch pitch, int duration) {
		
	}
	
	/**
	 * Alternate constructor for chords
	 * @param pitches: List of pitches in chord
	 * @param duration: Number of 'ticks' that note is played for
	 */
	public Note(List<Pitch> pitches, int duration) {
		
	}
}
