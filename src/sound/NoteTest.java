package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class NoteTest {

	/*
	 * Testing Strategy:
	 * NONE
	 */
	
	@Test
	public void testNoteBasicChord() {
		
		// Make a C chord
		List<Pitch> pitches = new LinkedList<Pitch>();
		pitches.add(new Pitch('C'));
		pitches.add(new Pitch('E'));
		pitches.add(new Pitch('G'));
		
		Note n = new Note(pitches, 2);
		assertEquals("CEG:2", n.toString());
	}

}
