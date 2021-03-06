package sound;

import java.util.HashMap;
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
	 * Empty Constructor for Key Object - used to keep track of accidentals
	 */
	public Key() {
		this.keySignature = new HashMap<String, Pitch>();
		this.keyName = "Accidentals";
	}
	
	/**
	 * Constructor for Key Object
	 * @param keyName Name of key. First letter must be capital.
	 */
	public Key(String keyName) {
		this.keySignature = this.getBaseKey(keyName);
		this.keyName = keyName;
	}
	
	/**
	 * Alters Key with accidental on note
	 * Ex. alterKey('C', 1) makes all C's a C#
	 * @param note Note to be altered in Key signature
	 * @param accidentalString string of accidentals to apply to note
	 */
	public void alterKey(String note, String accidentalString) {
		int semitonesUp = 0;
      	semitonesUp += accidentalString.replaceAll("[^^]", "").length();
    	semitonesUp -= accidentalString.replaceAll("[^_]", "").length();
    	
		Pitch currentPitch = new Pitch(note);
		Pitch transPitch = currentPitch.accidentalTranspose(semitonesUp);
		this.keySignature.put(note, transPitch);
	}
	
	/**
	 * Method to test if a note is in this key
	 * @param note String representing the note
	 * @return True if string in key
	 */
	public boolean containsNote(String note) {
		return this.keySignature.containsKey(note);
	}
	
	/**
	 * Returns the correct pitch for the key
	 * @param noteName: Input note name - does not contain any accidental notation
	 * 					but can contain octave notation
	 * @return Pitch with the correct accidental for the key 
	 */
	public Pitch getPitch(String noteName) {
		if (this.keySignature.containsKey(noteName)) {
			return this.keySignature.get(noteName);
		}
		else {
			// Remove octave notation leaving only the base note
			String baseNote = noteName.toUpperCase().replaceAll("[^A-G]", "");
			Pitch basePitch = this.keySignature.get(baseNote);
			// Make new pitch in the right octave with the basenote's accidental 	
			return new Pitch(noteName).accidentalTranspose(basePitch.getAccidental());
		}
	}
	
	/**
	 * Returns the key for a given key signature
	 * @param key String representing desired key signature
	 * @return map of strings to pitches representing the pitch of each note
	 * 		    in that key
	 */
	private Map<String, Pitch> getBaseKey(String key) {
		String majorKey = this.getRelativeMajor(key);
		
		// Designate order of sharps and flats in key signature
		// Starting with empty string so index represents num flats or sharps
		final String[] flatOrder = {"", "B", "E", "A", "D", "G", "C", "F"};
		final String[] sharpOrder = {"", "F", "C", "G", "D", "A", "E", "B"};

		// Make the circle of fifths
		final String[] flats = {"C", "F", "Bb", "Eb", "Ab", "Db", "Gb", "Cb"};
		final String[] sharps = {"C", "G", "D", "A", "E", "B", "F#", "C#"};
		
		int numFlats = 0;
		int numSharps = 0;
		
		// Go around the circle of fifths to find num of sharps/flats
		for (int i=0; i<flats.length; i++) {
			if (flats[i].equals(majorKey)) {
				numFlats = i;
			}
			// flats.length = sharps.length so we can do this
			if (sharps[i].equals(majorKey)) {
				numSharps = i;
			}
		}

		Map<String, Pitch> keySignature = new HashMap<String, Pitch>();
		// Add num flats and sharps to key
		for (int i=1; i <= numFlats; i++) {
			keySignature.put(flatOrder[i], new Pitch(flatOrder[i] + "_"));
		}
		for (int i=1; i <= numSharps; i++) {
			keySignature.put(sharpOrder[i], new Pitch(sharpOrder[i] + "^"));
		}
			
		// Fill in the rest of the notes with naturals
		for (int i=1; i < flatOrder.length; i++) {
			// Both flatOrder and sharpOrder contain all of the notes so we can iterate through either
			if (!(keySignature.containsKey(flatOrder[i]))) {	
				keySignature.put(flatOrder[i], new Pitch(flatOrder[i]));
			}
		}
	
		return keySignature;
	}
	
	/**
	 * Returns relative major of a string representing a minor key. If input key
	 * is already major, it will just return the input
	 * @param key String representing major or minor key
	 * @return Relative major of input if input is minor, or input if input is major
	 */
	private String getRelativeMajor(String key) {
		Map<String, String> relativeMajor = new HashMap<String, String>();
		relativeMajor.put("Abm", "Cb");
		relativeMajor.put("Am", "C");
		relativeMajor.put("A#m", "C#");
		relativeMajor.put("Bbm", "Db");
		relativeMajor.put("Bm", "D");
		relativeMajor.put("Cm", "Eb");
		relativeMajor.put("C#m", "E");
		relativeMajor.put("Dm", "F");
		relativeMajor.put("D#m", "F#");
		relativeMajor.put("Ebm", "Gb");
		relativeMajor.put("Em", "G");
		relativeMajor.put("Fm", "Ab");
		relativeMajor.put("F#m", "A");
		relativeMajor.put("Gm", "Bb");
		relativeMajor.put("G#m", "B");
		
		if (relativeMajor.containsKey(key)) {
			return relativeMajor.get(key);
		} else {
			// Key is already major
			return key;
		}
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.keyName + " " + this.keySignature.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((keyName == null) ? 0 : keyName.hashCode());
		result = prime * result
				+ ((keySignature == null) ? 0 : keySignature.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Key)) {
			return false;
		}
		Key other = (Key) obj;
		if (keyName == null) {
			if (other.keyName != null) {
				return false;
			}
		} else if (!keyName.equals(other.keyName)) {
			return false;
		}
		if (keySignature == null) {
			if (other.keySignature != null) {
				return false;
			}
		} else if (!keySignature.equals(other.keySignature)) {
			return false;
		}
		return true;
	}
	
	
}
