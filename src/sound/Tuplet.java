package sound;

import java.util.LinkedList;
import java.util.List;

/**
 * Immutable object representing a tuplet
 * @author Josh
 *
 */
public class Tuplet implements MusicalElement {
	private List<Chord> chords;
	private Fraction duration;
	private int type;
	
	/**
	 * Object representing Tuplet
	 * @param chords: List of chords in tuplet, length of list is type of tuplet
	 * Currently only implements subset of ABC notation required, thus list
	 * cannot be longer than 4 notes
	 * @param duration: duration of tuplet as fraction
	 */
	public Tuplet(List<Chord> chords, Fraction duration) {
		this.chords = chords;
		this.duration = duration;
		this.type = chords.size();
		if (this.type > 4) {
			throw new IllegalArgumentException("Only supports Duplets, Triplets or Quadruplets");
		}
	}
	
	/**
	 * Returns list of chords in tuplet
	 * @return: list of chords in tuplet
	 */
	public List<Chord> getChords() {
		List<Chord> clonedChords= new LinkedList<Chord>();
		for (Chord chord: this.chords){
			clonedChords.add(chord);
		}
		return clonedChords;
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
	
	/*
	 * (non-Javadoc)
	 * @see sound.MusicalElement#getTicksPerWholeNote()
	 */
	public int getTicksPerWholeNote() {
		// For Duplets
		if (type == 2) {
			// Duplets equally distribute 2 notes into the length of 3
			// Thus we have (2*3) ticks for the whole duplet
			// We then multiply by (1/duration) to figure out how many ticks per whole note
			return (int)((2*3)*(1/this.duration.evaluate()));
		} else if (type == 3) {
			// Triplets distribute 3 notes into length of 2, by the same logic we get
			return (int)((3*2)*(1/this.duration.evaluate()));
		} else if (type == 4) {
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
		return new Tuplet(this.getChords(), this.duration);
	}
}
