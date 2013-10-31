package sound;

/**
 * Note is an immutable object representing a note.  It contains a pitch
 * and the duration to play it for.
 * @author Josh
 *
 */
public class Note implements MusicalElement {
	private Pitch pitch;
	private Fraction duration; // i.e. quarter note, whole note, etc
	
	/**
	 * Constructor of Note object
	 * @param pitch: Pitch object of the note 
	 * @param duration: Fraction representing type of note
	 */
	public Note(Pitch pitch, Fraction duration) {
		this.pitch = pitch;
		this.duration = duration;
	}
	
	/**
	 * Gets pitch of note
	 * @return pitch for note
	 */
	public Pitch getPitch() {
		return this.pitch;
	}
	
	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getDuration()
	 */
	public Fraction getDuration() {
		return this.duration;
	}
	
	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getTicksPerWholeNote()
	 */
	public int getTicksPerWholeNote() {
		// Denominator is how many ticks need to be in this note - then multiply by ratio of 
		// whole note to total size of this note to get ticks per whole note
		return (this.getDuration().getDenominator())*(int)(1.0/this.getDuration().evaluate());
		//return (this.getDuration().getDenominator());
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Note clone() {
		return new Note(this.pitch, this.duration);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.pitch.toString() + ":" + this.duration.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((pitch == null) ? 0 : pitch.hashCode());
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
		if (duration == null) {
			if (other.duration != null) {
				return false;
			}
		} else if (!duration.equals(other.duration)) {
			return false;
		}
		if (pitch == null) {
			if (other.pitch != null) {
				return false;
			}
		} else if (!pitch.equals(other.pitch)) {
			return false;
		}
		return true;
	}

}
