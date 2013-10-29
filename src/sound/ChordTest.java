package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ChordTest {

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

}
