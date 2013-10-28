package sound;

import java.util.LinkedList;
import java.util.List;

/**
 * Voice is a mutable object that stores a list of notes in that voice
 * @author Josh
 *
 */
public class Voice {
	// Stores list of notes
	private List<Note> notes = new LinkedList<Note>();
	private double maxNotes;
	private double sumCurrentNotes = 0.0;
	private String name;
	
	/**
	 * Represents a voice in a measure
	 * @param name: Name of voice
	 * @param maxNotes: Max amount of notes in measure (ie, in 3/4 time should be .75)
	 */
	public Voice(String name, double maxNotes) {
		this.name = name;
		this.maxNotes = maxNotes;
	}
	
	/**
	 * Add note to voice
	 * @param note
	 * @throws Exception when note would make voice longer than maxNotes
	 */
	public void addNote(Note note) throws Exception {
		if (this.sumCurrentNotes + note.getDuration() <= this.maxNotes) {
			this.notes.add(note);
			this.sumCurrentNotes += note.getDuration();
		}
		else {
			throw new Exception("This voice cannot be longer than " + Double.toString(this.maxNotes) + " notes");
		}
	}
	
	/**
	 * Returns list of notes in voice
	 * @return list of notes in voice in order they should be played
	 */
	public List<Note> getNotes() {
		List<Note> clonedNotes = new LinkedList<Note>();
		for (Note note: this.notes){
			clonedNotes.add(note);
		}
		
		return clonedNotes;
	}
	
	/**
	 * Returns max amount of notes in voice
	 * @return max amount of notes in voice
	 */
	public double getNotesPerVoice() {
		return this.maxNotes;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Voice clone() {
		Voice clonedVoice = new Voice(this.name, this.maxNotes);
		for(Note note: this.getNotes()) {
			try {
				clonedVoice.addNote(note);
			} catch (Exception e) { 
				// Do nothing, Exception will never be hit because it would 
				// have been hit first while constructing the initial object
			}
		}
		
		return clonedVoice;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(maxNotes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		temp = Double.doubleToLongBits(sumCurrentNotes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (!(obj instanceof Voice)) {
			return false;
		}
		Voice other = (Voice) obj;
		if (Double.doubleToLongBits(maxNotes) != Double
				.doubleToLongBits(other.maxNotes)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (notes == null) {
			if (other.notes != null) {
				return false;
			}
		} else if (!notes.equals(other.notes)) {
			return false;
		}
		if (Double.doubleToLongBits(sumCurrentNotes) != Double
				.doubleToLongBits(other.sumCurrentNotes)) {
			return false;
		}
		return true;
	}
	
	
}
