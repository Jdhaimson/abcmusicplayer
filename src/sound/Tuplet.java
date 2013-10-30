package sound;

import java.util.LinkedList;
import java.util.List;

/**
 * Immutable object representing a tuplet
 * @author Josh
 *
 */
public class Tuplet implements MusicalElement {
	private List<MusicalElement> elements;
	private Fraction duration;
	private int type;
	
	/**
	 * Object representing Tuplet
	 * @param elements: List of elements in tuplet, length of list is type of tuplet
	 * Currently only implements subset of ABC notation required, thus list
	 * cannot be longer than 4 notes
	 */
	public Tuplet(List<MusicalElement> elements) {
		this.elements = elements;
		this.type = elements.size();
		if (this.type > 4 || this.type < 2) {
			throw new IllegalArgumentException("Only supports Duplets, Triplets or Quadruplets");
		}
		Fraction elementDuration = this.elements.get(0).getDuration();
		int numeratorModifier = 1;
		if (this.type == 4) {
			// Quadruplets last for 3* the length of each individual note
			numeratorModifier = 3;	
		} else if (this.type == 3) {
			// Triplets last for 2* the length of each individual note
			numeratorModifier = 2;
		} else { // type == 2 
			// Duplets last for 3* the length of each individual note
			numeratorModifier = 3;
		}
		this.duration = new Fraction(elementDuration.getNumerator()*numeratorModifier, elementDuration.getDenominator());
	}
	
	/**
	 * Returns list of elements in tuplet
	 * @return: list of elements in tuplet
	 */
	public List<MusicalElement> getElements() {
		List<MusicalElement> clonedElements= new LinkedList<MusicalElement>();
		for (MusicalElement element: this.elements){
			clonedElements.add(element);
		}
		return clonedElements;
	}
	
	/**
	 * Returns type of tuplet (2 => duplet, 3 => triplet, 4 => quadruplet)
	 * @return int representing type of quadruplet
	 */
	public int getType() {
		return this.type;
	}
	
	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getDuration()
	 */
	public Fraction getDuration() {
		return this.duration;
	}
	
	public int getTicksPerElement(int ticksPerWholeNote) {
		return (int)(((double)ticksPerWholeNote*this.duration.evaluate())/(double)this.type);
	}
	
	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getTicksPerWholeNote()
	 */
	public int getTicksPerWholeNote() {
		// For Duplets
		if (this.type == 2) {
			// Duplets equally distribute 2 notes into the length of 3
			// Thus we have (2*3) ticks for the whole duplet
			// We then multiply by (1/duration) to figure out how many ticks per whole note
			return (int)((2*3)*(1/this.duration.evaluate()));
		} else if (this.type == 3) {
			// Triplets distribute 3 notes into length of 2, by the same logic we get
			return (int)((3*2)*(1/this.duration.evaluate()));
		} else if (this.type == 4) {
			// Quadruplets distribute 4 notes into length of 3, by the same logic we get
			return (int)((4*3)*(1/this.duration.evaluate()));
		} else {
			throw new IllegalArgumentException("ABC player only supports duplets, triplets and quadruplets");
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	public Tuplet clone() {
		return new Tuplet(this.getElements());
	}
	
	@Override
	public String toString(){
		StringBuilder tupletStrings = new StringBuilder();
    	for(MusicalElement element : this.elements){
    		tupletStrings.append(element.toString());
    	}
    	tupletStrings.insert(0, "(" + this.type); 
    	tupletStrings.append(":" + this.duration.toString());
    	return tupletStrings.toString();
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
        result = prime * result
                + ((elements == null) ? 0 : elements.hashCode());
        result = prime * result + type;
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
        if (!(obj instanceof Tuplet)) {
            return false;
        }
        Tuplet other = (Tuplet) obj;
        if (duration == null) {
            if (other.duration != null) {
                return false;
            }
        } else if (!duration.equals(other.duration)) {
            return false;
        }
        if (elements == null) {
            if (other.elements != null) {
                return false;
            }
        } else if (!elements.equals(other.elements)) {
            return false;
        }
        if (type != other.type) {
            return false;
        }
        return true;
    }
	
	
}
