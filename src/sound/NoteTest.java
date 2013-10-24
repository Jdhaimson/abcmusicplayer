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
	
	@Test
	public void testNoteToString() {
	    List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));
        
        List<Pitch> pitches2 = new LinkedList<Pitch>();
        pitches2.add(new Pitch('C'));
        pitches2.add(new Pitch('F'));
        pitches2.add(new Pitch('G'));
        
        Note note1 = new Note(pitches1, 2);
        Note note2 = new Note(pitches1, 4);
        Note note3 = new Note(pitches2, 2);
        
        assertEquals(true, note1.toString().equals("CEG:2"));
        assertEquals(false, note1.toString().equals(note2.toString()));
        assertEquals(false, note1.toString().equals(note3.toString()));
	}
	
	@Test
	public void testNoteEquals(){
	    List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));
        
        List<Pitch> pitches2 = new LinkedList<Pitch>();
        pitches2.add(new Pitch('C'));
        pitches2.add(new Pitch('F'));
        pitches2.add(new Pitch('G'));
        
        Note note1 = new Note(pitches1, 2);
        Note note2 = new Note(pitches1, 4);
        Note note3 = new Note(pitches2, 2);
        Note note4 = new Note(pitches1, 2);
        Note note5 = new Note(pitches2, 4);
        
        assertEquals(true, note1.equals(note1));
        assertEquals(false, note1.equals(note2));
        assertEquals(false, note1.equals(note3));
        assertEquals(true, note1.equals(note4));
        assertEquals(false, note1.equals(note5));
	}
	
	@Test
	public void testNoteHashCode() {
	    List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));
        
        List<Pitch> pitches2 = new LinkedList<Pitch>();
        pitches2.add(new Pitch('C'));
        pitches2.add(new Pitch('F'));
        pitches2.add(new Pitch('G'));
        
        Note note1 = new Note(pitches1, 2);
        Note note4 = new Note(pitches1, 2);
        
        assertEquals(true, note1.hashCode() == note1.hashCode());
        assertEquals(true, note1.hashCode() == note4.hashCode());

	}
	
	@Test
	public void testNoteClone() {
	    List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));
        
        Note note1 = new Note(pitches1, 2);
        Note note2 = note1.clone();
        
        assertEquals(true, note1.equals(note2));
        assertEquals(true, note1.toString().equals(note2.toString()));
        assertEquals(true, note1.hashCode() == note2.hashCode());
	}
	
	@Test
	public void testNoteGetDuration() {
	    List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));
        
        Note note1 = new Note(pitches1, 4);
        Note note2 = new Note(pitches1, 2);
        
        assertEquals(true, note1.getDuration() == 4);
        assertEquals(true, note2.getDuration() == 2);
        assertEquals(false, note1.getDuration() == note2.getDuration());
	}
	
	@Test
	public void testNoteGetPitches() {
	    List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));
        
        List<Pitch> pitches2 = new LinkedList<Pitch>();
        pitches2.add(new Pitch('C'));
        pitches2.add(new Pitch('E'));
        pitches2.add(new Pitch('G'));
        
        List<Pitch> pitches3 = new LinkedList<Pitch>();
        pitches3.add(new Pitch('C'));
        pitches3.add(new Pitch('E'));
        pitches3.add(new Pitch('F'));
        
        Note note1 = new Note(pitches1, 4);
        
        assertEquals(true, note1.getPitches().equals(pitches1));
        assertEquals(true, note1.getPitches().equals(pitches2));
        assertEquals(false, note1.getPitches().equals(pitches3));
	}
	
	
}
