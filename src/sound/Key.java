package sound;

import java.util.Map;

/**
 * Mutable Key object that stores the default accidentals of each note
 * @author Josh
 *
 */
public class Key {
	// Stores the Key - maps notes to their proper accidentals in this key
	private Map<String, Pitch> keySignature;
	private String keyName;
	
	/**
	 * Constructor for Key Object
	 * @param keyName: Name of key
	 */
	public Key(String keyName) {

	}
	
	/**
	 * Alters Key with accidental on note
	 * @param note: Note to be altered in Key signature
	 * @param accidental: Accidental to apply to note
	 */
	public void alterKey(String note, String accidental) {
		
	}
	
	/**
	 * Returns the correct pitch for the key
	 * @param noteName: Input note name
	 * @return Pitch with the correct accidental for the key 
	 */
	public Pitch getPitch(String noteName) {
		return new Pitch('C');
	}
}
