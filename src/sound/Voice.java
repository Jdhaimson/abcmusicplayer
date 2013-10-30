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
	private List<MusicalElement> notes = new LinkedList<MusicalElement>();
	private List<String> lyrics = new LinkedList<String>();
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
	 * Returns the name of the voice
	 * @return
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Adds element  to voice
	 * @param element
	 */
	public void addMusicalElement(MusicalElement element) {
		this.notes.add(element);
		this.sumCurrentNotes += element.getDuration().evaluate();
	}
	
	/**
	 * Add a lyric to this voice
	 * @param lyric: lyric to add to measure
	 * @return true if there are enough free notes for lyric to be added to
	 */
	public boolean addLyric(String lyric) {
		System.out.println(lyric);
		if (this.lyrics.size() + 1 < this.getNumNotes()) {
			this.lyrics.add(lyric);
			System.out.println("Added!");
			System.out.println(this.lyrics.size());
			return true;
		} else {
			return false;
		}
	}
	
	
	/**
	 * Returns list of notes in voice
	 * @return list of notes in voice in order they should be played
	 */
	public List<MusicalElement> getMusicalElements() {
		List<MusicalElement> clonedElements = new LinkedList<MusicalElement>();
		for (MusicalElement element: this.notes){
			clonedElements.add(element);
		}
		
		return clonedElements;
	}
	
	/**
	 * Returns list of lyrics in voice
	 * @return list of lyrics in voice in order they should be displayed
	 */
	public List<String> getLyrics() {
		System.out.println(this.lyrics.size());
		List<String> clonedLyrics = new LinkedList<String>();
		for (String lyric: this.lyrics){
			clonedLyrics.add(lyric);
		}
		
		return clonedLyrics;
	}
	
	/**
	 * Returns number of notes and chords in voice
	 * (Each note in tuplet counted and rests ignored)
	 * @return
	 */
	public int getNumNotes() {
		int count = 0;
		for (MusicalElement element: this.notes) {
			if (element instanceof Tuplet) {
				Tuplet tuplet = (Tuplet) element;
				count += tuplet.getElements().size();
			} else if (element instanceof Note || 
					   element instanceof Chord) {
				count += 1;
			}
		}
		return count;
	}
	
	/**
	 * Returns max amount of notes in voice
	 * @return max amount of notes in voice
	 */
	public double getNotesPerVoice() {
		return this.maxNotes;
	}
	
	/**
	 * Returns the ticks per whole note required to play this voice
	 * @return int: ticks per whole note
	 */
	public int getTicksPerWholeNote() {
		int maxTicks = 0;
		for (MusicalElement elem: this.getMusicalElements()) {
			int ticks = elem.getTicksPerWholeNote();
			
			if (ticks > maxTicks) {
				maxTicks = ticks;
			}
		}
		
		return maxTicks;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Voice clone() {
		Voice clonedVoice = new Voice(this.name, this.maxNotes);
		for(MusicalElement elem: this.getMusicalElements()) {
			clonedVoice.addMusicalElement(elem);
		}
		for(String lyric: this.getLyrics()) {
			clonedVoice.addLyric(lyric);
		}
		
		return clonedVoice;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		//return this.name;
		StringBuilder voiceStrings = new StringBuilder();
    	for(MusicalElement note : this.notes){
    		voiceStrings.append(note.toString()+" ");
    	}
    	voiceStrings.insert(0, this.name+"   ");
    	return voiceStrings.toString();
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
