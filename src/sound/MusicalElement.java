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
	 * Returns the duration of the note as a Fraction
	 * @return Fraction: representing the duration of the note
	 */
	public Fraction getDuration();
	
	/**
	 * Returns clone of the element
	 * @return: Identical Musical Element 
	 */
	public MusicalElement clone();
}
