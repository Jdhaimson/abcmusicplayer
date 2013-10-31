package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class NoteTest {

	/*
	 * Testing Strategy
     * 
     * To test equals(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences. 
     * Tested to make sure equals() was reflexive and that two structurally equal instances were equals().
     * 
     * To test toString(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences. 
     * Tested to make sure instances returned the correct string and that structurally equivalent instances returned the same string.
     * 
     * To test hashCode(), we tested to be sure that structurally equivalent instances returned the same hash code and that hashCode() was reflexive.
     * 
     * To test getDuration() and getTicksPerWholteNote(), we used instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences.
     * We created instances who's notes varied on pitch, duration, or both. We tested to make sure that getTicksPerWholeNote() was independent of pitch and only depended on durations of the notes.
     * We tested to make sure that getDuration was dependent on the durations of the notes, not the pitches.
	 */
	
	@Test
	public void testNoteEquals(){
        
        Note note1 = new Note(new Pitch('C'), new Fraction(1, 4));
        Note note2 = new Note(new Pitch('E'), new Fraction(1, 4));
        Note note3 = new Note(new Pitch('G'), new Fraction(1, 4));
        Note note4 = new Note(new Pitch('C'), new Fraction(1, 2));
        Note note5 = new Note(new Pitch('E'), new Fraction(1, 2));
        Note note6 = new Note(new Pitch('C'), new Fraction(1, 4));
        
        assertEquals(true, note1.equals(note1));
        assertEquals(true, note1.equals(note6));
        assertEquals(false, note1.equals(note2));
        assertEquals(false, note1.equals(note3));
        assertEquals(false, note1.equals(note4));
        assertEquals(false, note1.equals(note5));
	}
	
	@Test
	public void testNoteHashCode() {
	    Note note1 = new Note(new Pitch('C'), new Fraction(1, 4));
        Note note6 = new Note(new Pitch('C'), new Fraction(1, 4));
        
        assertEquals(true, note1.hashCode() == note1.hashCode());
        assertEquals(true, note1.hashCode() == note6.hashCode());
	}
	
	@Test
	public void testNoteClone() {
        
        Note note1 = new Note(new Pitch('C'), new Fraction(1, 4));
        Note clone = note1.clone();
        
        assertEquals(true, note1.equals(clone));
        assertEquals(true, note1.hashCode() == clone.hashCode());
        assertEquals(true, note1.toString().equals(clone.toString()));
	}
	
	@Test
	public void testNoteGetDuration() {
        Note note1 = new Note(new Pitch('C'), new Fraction(1, 4));
        Note note2 = new Note(new Pitch('E'), new Fraction(1, 4));
        Note note4 = new Note(new Pitch('C'), new Fraction(1, 2));
        
        assertEquals(true, note1.getDuration().equals(note1.getDuration()));
        assertEquals(true, note1.getDuration().equals(note2.getDuration()));
        assertEquals(false, note1.getDuration().equals(note4.getDuration()));
        assertEquals(true, note1.getDuration().equals(new Fraction(1,4)));
	}
	
	@Test
	public void testNoteToString() {
        Note note1 = new Note(new Pitch('C'), new Fraction(1, 4));
        Note note2 = new Note(new Pitch('E'), new Fraction(1, 4));
        Note note4 = new Note(new Pitch('C'), new Fraction(1, 2));
        Note note6 = new Note(new Pitch('C'), new Fraction(1, 4));
        
        assertEquals(true, note1.toString().equals(note1.toString()));
        assertEquals(true, note1.toString().equals(note6.toString()));
        assertEquals(false, note1.toString().equals(note2.toString()));
        assertEquals(true, note1.toString().equals("C:1/4"));
        assertEquals(true, note4.toString().equals("C:1/2"));
	}
	
	@Test
	public void testNoteGetTicksPerWholeNote() {
        
        Note note1 = new Note(new Pitch('C'), new Fraction(1, 4));
        Note note4 = new Note(new Pitch('C'), new Fraction(1, 2));
        Note note5 = new Note(new Pitch('E'), new Fraction(1, 2));
        
        assertEquals(true, note1.getTicksPerWholeNote() == note1.getTicksPerWholeNote());
        assertEquals(true, note4.getTicksPerWholeNote() == note5.getTicksPerWholeNote());
        assertEquals(false, note1.getTicksPerWholeNote() == note5.getTicksPerWholeNote());

	}
	
}
