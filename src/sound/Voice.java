package sound;

import java.util.LinkedList;
import java.util.List;

public class Voice {
	// Stores list of notes
	private List<Note> notes = new LinkedList<Note>();
	private int ticksPerVoice;
	private int sumCurrentTicks = 0;
	private String name;
	
	/**
	 * Represents a voice in a measure
	 * @param name: Name of voice
	 * @param ticksPerVoice: Total amount of "ticks" in the measure
	 */
	public Voice(String name, int ticksPerVoice) {
		this.name = name;
		this.ticksPerVoice = ticksPerVoice;
	}
	
	/**
	 * Add note to voice
	 * @param note
	 */
	public void addNote(Note note) {
		
	}
	
	
}
