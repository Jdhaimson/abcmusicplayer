package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class NoteTest {

	/*
	 * Testing Strategy:
	 * 
	 * We tested each of Note's toString(), equals(), and hashCode() methods by way of creating several instances of Note, each slightly different than the others.
	 * We tested used these instances to check that structural equivalent Note's would be .equal(), would return the same hashCode() output, and would have equivalent toString() outputs.
	 * We tested clone() by checking that the output would have equivalent toString() and hashCode() values as the object getting cloned, and that both the original and the clone were structurally equivalent.
	 * We tested getDuration() and getPitches() in a similar way as toString(), equals(), and hashCode()
	 * We created instances of Note slightly each slightly different than the others and tested for equivalence or inequivalence depending on what differed between the instances.
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
        
        assertEquals(4, note1.getTicksPerWholeNote());
        assertEquals(2, note4.getTicksPerWholeNote());
        assertEquals(true, note4.getTicksPerWholeNote() == note5.getTicksPerWholeNote());
	}
}
