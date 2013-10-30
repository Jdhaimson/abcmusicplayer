package sound;

import java.util.LinkedList;
import java.util.List;

/**
 * Immutable object representing chords or single notes
 * @author Josh
 *
 */
public class Chord implements MusicalElement {

	private List<Note> notes;
	
	/**
	 * Chord object which contains a set of one or more Notes
	 * @param notes the Note objects within the Chord
	 */
	public Chord(List<Note> notes) {
		this.notes = notes;
	}

	/**
	 * Gets list of all Notes in Chord
	 * @return list of all Notes in Chord
	 */
	public List<Note> getNotes() {
		List<Note> clonedNotes = new LinkedList<Note>();
		for(Note note: this.notes){
			clonedNotes.add(note.clone());
		}
		return clonedNotes;
	}

	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getDuration()
	 */
	public Fraction getDuration() {
		//Duration of Chord is determined by the duration of the first Note in that Chord
		return this.notes.get(0).getDuration();
	}
	
	
	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getTicksPerWholeNote()
	 */
	public int getTicksPerWholeNote() {
		int maxTicks = 0;
		for (Note note: this.notes) {
			int ticks = note.getTicksPerWholeNote();
			if (ticks > maxTicks) {
				maxTicks = ticks;
			}
		}
		return maxTicks;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder noteString = new StringBuilder();
		for(Note note: this.notes) {
			noteString.append(note.toString());
		}		
		return noteString.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Chord clone() {
		return new Chord(this.getNotes());
	}

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
        if (notes == null) {
            if (other.notes != null) {
                return false;
            }
        } else if (!notes.equals(other.notes)) {
            return false;
        }
        return true;
    }

}

