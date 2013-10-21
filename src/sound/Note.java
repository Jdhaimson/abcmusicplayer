package sound;

import java.util.LinkedList;
import java.util.List;

/**
 * Note is an immutable object representing a note.  It contains a list of 
 * pitches and the duration to play them for
 * @author Josh
 *
 */
public class Note {
	private List<Pitch> pitches = new LinkedList<Pitch>();
	private int duration; // stored as 'ticks' used by sequenceplayer
	
	/**
	 * Constructor of Note Object
	 * @param pitch: Single pitch of note object
	 * @param duration: Number of 'ticks' that note is played for
	 */
	public Note(Pitch pitch, int duration) {
		this.pitches.add(pitch.clone());
		this.duration = duration;
	}
	
	/**
	 * Alternate constructor for chords
	 * @param pitches: List of pitches in chord
	 * @param duration: Number of 'ticks' that note is played for
	 */
	public Note(List<Pitch> pitches, int duration) {
		
		for(Pitch pitch: pitches) {
			this.pitches.add(pitch.clone());
		}
		
		this.duration = duration;
	}
	
	/**
	 * Gets list of all pitches in note
	 * @return list of all pitches in note
	 */
	public List<Pitch> getPitches() {
		List<Pitch> clonedPitches = new LinkedList<Pitch>();
		for(Pitch pitch: this.pitches){
			clonedPitches.add(pitch.clone());
		}
		return clonedPitches;
	}
	
	/**
	 * Returns duration of note in ticks
	 * @return duration of note in ticks
	 */
	public int getDuration() {
		return this.duration;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Note clone() {
		return new Note(this.getPitches(), this.duration);
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
		noteString.append(":").append(Integer.toString(this.duration));
		
		return noteString.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
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
		if (!(obj instanceof Note)) {
			return false;
		}
		Note other = (Note) obj;
		if (duration != other.duration) {
			return false;
		}
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
