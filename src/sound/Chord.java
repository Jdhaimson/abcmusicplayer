package sound;

import java.util.LinkedList;
import java.util.List;

/**
 * Immutable object representing chords or single notes
 * @author Josh
 *
 */
public class Chord {

	private List<Pitch> pitches;
	
	/**
	 * Chord object which contains a set of one or more pitches
	 * @param pitches
	 */
	public Chord(List<Pitch> pitches) {
		this.pitches = pitches;
	}

	/**
	 * Gets list of all pitches in chord
	 * @return list of all pitches in chord
	 */
	public List<Pitch> getPitches() {
		List<Pitch> clonedPitches = new LinkedList<Pitch>();
		for(Pitch pitch: this.pitches){
			clonedPitches.add(pitch.clone());
		}
		return clonedPitches;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder noteString = new StringBuilder();
		for(Pitch pitch: this.pitches) {
			noteString.append(pitch.toString());
		}		
		return noteString.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pitches == null) ? 0 : pitches.hashCode());
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
		if (!(obj instanceof Chord)) {
			return false;
		}
		Chord other = (Chord) obj;
		if (pitches == null) {
			if (other.pitches != null) {
				return false;
			}
		} else if (!pitches.equals(other.pitches)) {
			return false;
		}
		return true;
	}
	
	
	
}

