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
        
        Chord chord1 = new Chord(pitches1);
        Chord chord2 = new Chord(pitches2);
        Chord chord3 = new Chord(pitches3);
        
        Note note1 = new Note(chord1, new Fraction(1, 4));
        Note note2 = new Note(chord1, new Fraction(1, 2));
        Note note3 = new Note(chord2, new Fraction(1, 2));
        Note note4 = new Note(chord3, new Fraction(1, 4));
        Note note5 = new Note(chord2, new Fraction(1, 4));
        
        assertEquals(true, note1.equals(note1));
        assertEquals(true, note1.equals(note5));
        assertEquals(true, note2.equals(note3));
        assertEquals(false, note1.equals(note4));
        assertEquals(false, note1.equals(note2));
	}
	
	@Test
	public void testNoteHashCode() {
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
        
        Chord chord1 = new Chord(pitches1);
        Chord chord2 = new Chord(pitches2);
        
        Note note1 = new Note(chord1, new Fraction(1, 4));
        Note note5 = new Note(chord2, new Fraction(1, 4));
        
        assertEquals(true, note1.hashCode() == note1.hashCode());
        assertEquals(true, note1.hashCode() == note5.hashCode());
	}
	
	@Test
	public void testNoteClone() {
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
        
        Chord chord1 = new Chord(pitches1);
        
        Note note1 = new Note(chord1, new Fraction(1, 4));
        Note clone = note1.clone();
        
        assertEquals(true, note1.equals(clone));
        assertEquals(true, note1.hashCode() == clone.hashCode());
        assertEquals(true, note1.toString().equals(clone.toString()));
	}
	
	@Test
	public void testNoteGetDuration() {
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
        
        Chord chord1 = new Chord(pitches1);
        Chord chord2 = new Chord(pitches2);
        
        Note note1 = new Note(chord1, new Fraction(1, 4));
        Note note2 = new Note(chord1, new Fraction(1, 2));
        Note note3 = new Note(chord2, new Fraction(1, 2));
        Note note5 = new Note(chord2, new Fraction(1, 4));
        
        assertEquals(true, note1.getDuration().equals(note5.getDuration()));
        assertEquals(true, note2.getDuration().equals(note3.getDuration()));
        assertEquals(true, note1.getDuration().equals(new Fraction(1, 4)));
	}
	
	@Test
	public void testNoteGetChord() {
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
        
        Chord chord1 = new Chord(pitches1);
        Chord chord2 = new Chord(pitches2);
        Chord chord3 = new Chord(pitches3);
        
        Note note1 = new Note(chord1, new Fraction(1, 4));
        Note note2 = new Note(chord1, new Fraction(1, 2));
        Note note4 = new Note(chord3, new Fraction(1, 4));
        
        assertEquals(true, note1.getChord().equals(note2.getChord()));
        assertEquals(true, note1.getChord().equals(chord1));
        assertEquals(true, note1.getChord().equals(chord2));
        assertEquals(false, note1.getChord().equals(note4.getChord()));
	}
	
	@Test
	public void testNoteToString() {
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
        
        Chord chord1 = new Chord(pitches1);
        Chord chord2 = new Chord(pitches2);
        Chord chord3 = new Chord(pitches3);
        
        Note note1 = new Note(chord1, new Fraction(1, 4));
        Note note2 = new Note(chord1, new Fraction(1, 2));
        Note note4 = new Note(chord3, new Fraction(1, 4));
        Note note5 = new Note(chord2, new Fraction(1, 4));
        
        assertEquals(true, note1.toString().equals(note5.toString()));
        assertEquals(false, note1.toString().equals(note2.toString()));
        assertEquals(true, note1.toString().equals("CEG:1/4"));
        assertEquals(true, note4.toString().equals("CEF:1/4"));
	}
	
	@Test
	public void testNoteGetTicksPerWholeNote() {
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
        
        Chord chord1 = new Chord(pitches1);
        Chord chord2 = new Chord(pitches2);
        Chord chord3 = new Chord(pitches3);
        
        Note note1 = new Note(chord1, new Fraction(1, 4));
        Note note2 = new Note(chord1, new Fraction(1, 2));
        Note note4 = new Note(chord3, new Fraction(1, 4));
        Note note5 = new Note(chord2, new Fraction(1, 4));
        
        assertEquals(true, note1.getTicksPerWholeNote() == 4);
        assertEquals(true, note2.getTicksPerWholeNote() == 2);
        assertEquals(true, note4.getTicksPerWholeNote() == note5.getTicksPerWholeNote());
	}
}
