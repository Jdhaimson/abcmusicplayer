package sound;

/**
 * Interface for a all musical elements in a voice - namely Rest, Note and Tuplet
 * @author Josh
 *
 */
public interface MusicalElement {
	/**
	 * Returns the smallest amount of ticks per whole note required of the sequence player by this element
	 * @return int: representing the smallest amount of ticks per note
	 */
	public int getTicksPerWholeNote();
	
	/**
	 * Returns the duration of the note (.25 => 1/4 note, .125 => 1/8 note, etc)
	 * @return double: representing the duration of the note
	 */
	public double getDuration();
}
