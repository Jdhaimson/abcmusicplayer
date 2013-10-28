package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ChordTest {

	@Test
	public void testEquals() {
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
        
        assertEquals(true, chord1.equals(chord2));
        assertEquals(true, chord1.equals(chord1));
        assertEquals(false, chord1.equals(chord3));
	}
	
	@Test
	public void testChordHashCode() {
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
        
        assertEquals(true, chord1.hashCode() == chord1.hashCode());
        assertEquals(true, chord1.hashCode() == chord2.hashCode());
        assertEquals(false, chord1.hashCode() == chord3.hashCode());
	}
	
	@Test
	public void testChordGetPitches() {
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
        
        assertEquals(true, chord1.getPitches().equals(pitches1));
        assertEquals(true, chord1.getPitches().equals(chord2.getPitches()));
        assertEquals(false, chord1.getClass().equals(chord3.getPitches()));
	}
	
	@Test
	public void testChordToString() {
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
        
        assertEquals(true, chord1.toString().equals("CEG"));
        assertEquals(true, chord1.toString().equals(chord2.toString()));
        assertEquals(false, chord1.toString().equals(chord3.toString()));
	}

}
