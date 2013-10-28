package sound;

/**
 * Immutable object representing a Rest in a piece
 * @author Josh
 *
 */
public class Rest implements MusicalElement {

	private double duration;
	
	/**
	 * Immutable object representing a Rest
	 * @param duration: Length of rest (.25 => 1/4 note, .125 => 1/8, etc)
	 */
	public Rest(double duration) {
		this.duration = duration;
	}
	
	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getDuration()
	 */
	public double getDuration() {
		return this.duration;
	}

	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getTicksPerWholeNote()
	 */
	public int getTicksPerWholeNote() {
		return (int)(1.0/this.getDuration());
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Rest clone() {
		return new Rest(this.duration);
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "z:" + Double.toString(this.duration); 
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(duration);
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
		if (!(obj instanceof Rest)) {
			return false;
		}
		Rest other = (Rest) obj;
		if (Double.doubleToLongBits(duration) != Double
				.doubleToLongBits(other.duration)) {
			return false;
		}
		return true;
	}
	
}
