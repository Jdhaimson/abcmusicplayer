package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ChordTest {
    
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
     * To test clone(), we tested to be sure that a clone of an instance was equals() to its parent, returned equivalent strings, and returned equivalent hash codes.
     * 
     * To test getDuration(), getNotes(), and getTicksPerWholteNote(), we used instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences.
     * We created instances who's notes varied on pitch, duration, or both. We tested to make sure that getTicksPerWholeNote() was independent of pitch and only depended on durations of the notes.
     * We tested to make sure that getDuration was dependent on the durations of the notes, not the pitches.
     * We tested to make sure that getNotes returned the proper list of notes and took into account both pitch and duration.
     */

	@Test
	public void testEquals() {
        
        List<Note> notes = new LinkedList<Note>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<Note> notes2 = new LinkedList<Note>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<Note> notes3 = new LinkedList<Note>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<Note> notes4 = new LinkedList<Note>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        Chord chord1 = new Chord(notes);
        Chord chord2 = new Chord(notes2);
        Chord chord3 = new Chord(notes3);
        Chord chord4 = new Chord(notes4);
        
        assertEquals(true, chord1.equals(chord1));
        assertEquals(false, chord1.equals(chord2));
        assertEquals(false, chord1.equals(chord3));
        assertEquals(true, chord1.equals(chord4));
	}
	
	@Test
	public void testChordHashCode() {
        List<Note> notes = new LinkedList<Note>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<Note> notes2 = new LinkedList<Note>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<Note> notes3 = new LinkedList<Note>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<Note> notes4 = new LinkedList<Note>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        Chord chord1 = new Chord(notes);
        Chord chord2 = new Chord(notes2);
        Chord chord3 = new Chord(notes3);
        Chord chord4 = new Chord(notes4);
        
        assertEquals(true, chord1.hashCode() == chord1.hashCode());
        assertEquals(true, chord1.hashCode() == chord4.hashCode());
        assertEquals(false, chord1.hashCode() == chord2.hashCode());
        assertEquals(false, chord1.hashCode() == chord3.hashCode());
	}
	
	@Test
	public void testChordToString() {
	    List<Note> notes = new LinkedList<Note>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<Note> notes2 = new LinkedList<Note>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<Note> notes3 = new LinkedList<Note>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<Note> notes4 = new LinkedList<Note>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        Chord chord1 = new Chord(notes);
        Chord chord2 = new Chord(notes2);
        Chord chord3 = new Chord(notes3);
        Chord chord4 = new Chord(notes4);

        assertEquals(true, chord1.toString().equals(chord4.toString()));
        assertEquals(false, chord1.toString().equals(chord2.toString()));
        assertEquals(false, chord1.toString().equals(chord3.toString()));
        assertEquals(true, chord1.toString().equals(chord1.toString()));
        assertEquals("C:1/4G:1/4", chord1.toString());
	}
	
	@Test
	public void testChordGetNotes() {
	       List<Note> notes = new LinkedList<Note>();
	        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
	        
	        List<Note> notes2 = new LinkedList<Note>();
	        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
	        
	        List<Note> notes3 = new LinkedList<Note>();
	        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
	        
	        List<Note> notes4 = new LinkedList<Note>();
	        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
	        
	        Chord chord1 = new Chord(notes);
	        Chord chord2 = new Chord(notes2);
	        Chord chord3 = new Chord(notes3);
	        Chord chord4 = new Chord(notes4);
	        
	        assertEquals(true, chord1.getNotes().equals(chord1.getNotes()));
	        assertEquals(true, chord1.getNotes().equals(chord4.getNotes()));
	        assertEquals(false, chord1.getNotes().equals(chord2.getNotes()));
	        assertEquals(false, chord1.getNotes().equals(chord3.getNotes()));
	}
	
	@Test
	public void testChordGetDuration(){
	       List<Note> notes = new LinkedList<Note>();
	        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
	        
	        List<Note> notes2 = new LinkedList<Note>();
	        notes2.add(new Note(new Pitch('C'), new Fraction(1, 2)));
	        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
	        
	        List<Note> notes3 = new LinkedList<Note>();
	        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
	        
	        List<Note> notes4 = new LinkedList<Note>();
	        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
	        
	        Chord chord1 = new Chord(notes);
	        Chord chord2 = new Chord(notes2);
	        Chord chord3 = new Chord(notes3);
	        Chord chord4 = new Chord(notes4);
	        
	        assertEquals(true, chord1.getDuration().equals(chord1.getDuration()));
	        assertEquals(true, chord1.getDuration().equals(chord4.getDuration()));
	        assertEquals(true, chord1.getDuration().equals(chord3.getDuration()));
	        assertEquals(false, chord1.getDuration().equals(chord2.getDuration()));
	        assertEquals(true, chord1.getDuration().equals(new Fraction(1, 4)));
	}
	
	@Test
	public void testChordGetTicksPerWholeNote() {
        List<Note> notes = new LinkedList<Note>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<Note> notes2 = new LinkedList<Note>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<Note> notes3 = new LinkedList<Note>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<Note> notes4 = new LinkedList<Note>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<Note> notes5 = new LinkedList<Note>();
        notes5.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        Chord chord1 = new Chord(notes);
        Chord chord2 = new Chord(notes2);
        Chord chord3 = new Chord(notes3);
        Chord chord4 = new Chord(notes4);
        Chord chord5 = new Chord(notes5);
        
        assertEquals(true, chord1.getTicksPerWholeNote() == chord1.getTicksPerWholeNote());
        assertEquals(true, chord1.getTicksPerWholeNote() == chord2.getTicksPerWholeNote());
        assertEquals(true, chord1.getTicksPerWholeNote() == chord3.getTicksPerWholeNote());
        assertEquals(true, chord1.getTicksPerWholeNote() == chord4.getTicksPerWholeNote());
        assertEquals(true, chord1.getTicksPerWholeNote() == chord5.getTicksPerWholeNote());
	}
	
	@Test
	public void testChordClone() {
        List<Note> notes3 = new LinkedList<Note>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        Chord chord1 = new Chord(notes3);
        Chord clone = chord1.clone();
        
        assertEquals(true, chord1.equals(clone));
        assertEquals(true, chord1.hashCode() == clone.hashCode());
        assertEquals(true, chord1.toString().equals(clone.toString()));
	}
}
