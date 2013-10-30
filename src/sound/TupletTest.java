package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TupletTest {

	@Test
	public void testTupletEquals() {
	    List<MusicalElement> notes = new LinkedList<MusicalElement>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes2 = new LinkedList<MusicalElement>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<MusicalElement> notes3 = new LinkedList<MusicalElement>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<MusicalElement> notes4 = new LinkedList<MusicalElement>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes5 = new LinkedList<MusicalElement>();
        notes5.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('F'), new Fraction(1, 4)));
        
        Tuplet tup1 = new Tuplet(notes);
        Tuplet tup2 = new Tuplet(notes2);
        Tuplet tup3 = new Tuplet(notes3);
        Tuplet tup4 = new Tuplet(notes4);
        Tuplet tup5 = new Tuplet(notes5);
        
        assertEquals(true, tup1.equals(tup1));
        assertEquals(true, tup1.equals(tup4));
        assertEquals(false, tup1.equals(tup2));
        assertEquals(false, tup1.equals(tup3));
        assertEquals(false, tup1.equals(tup5));
	}
	
	@Test
	public void testTupletHashCode() {
	    List<MusicalElement> notes = new LinkedList<MusicalElement>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes2 = new LinkedList<MusicalElement>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<MusicalElement> notes3 = new LinkedList<MusicalElement>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<MusicalElement> notes4 = new LinkedList<MusicalElement>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes5 = new LinkedList<MusicalElement>();
        notes5.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('F'), new Fraction(1, 4)));
        
        Tuplet tup1 = new Tuplet(notes);
        Tuplet tup2 = new Tuplet(notes2);
        Tuplet tup3 = new Tuplet(notes3);
        Tuplet tup4 = new Tuplet(notes4);
        Tuplet tup5 = new Tuplet(notes5);
        
        assertEquals(true, tup1.hashCode() == tup1.hashCode());
        assertEquals(true, tup1.hashCode() == tup4.hashCode());
	}

	@Test
	public void testTupletyGetElements() {
	    List<MusicalElement> notes = new LinkedList<MusicalElement>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes2 = new LinkedList<MusicalElement>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<MusicalElement> notes3 = new LinkedList<MusicalElement>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<MusicalElement> notes4 = new LinkedList<MusicalElement>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes5 = new LinkedList<MusicalElement>();
        notes5.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('F'), new Fraction(1, 4)));
        
        Tuplet tup1 = new Tuplet(notes);
        Tuplet tup2 = new Tuplet(notes2);
        Tuplet tup3 = new Tuplet(notes3);
        Tuplet tup4 = new Tuplet(notes4);
        Tuplet tup5 = new Tuplet(notes5);
        
        assertEquals(true, tup1.getElements().equals(tup1.getElements()));
        assertEquals(true, tup1.getElements().equals(tup4.getElements()));
        assertEquals(false, tup1.getElements().equals(tup2.getElements()));
        assertEquals(false, tup1.getElements().equals(tup3.getElements()));
        assertEquals(false, tup1.getElements().equals(tup5.getElements()));
	}
	
	@Test
	public void testTupletGetType() {
	    List<MusicalElement> notes = new LinkedList<MusicalElement>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes2 = new LinkedList<MusicalElement>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<MusicalElement> notes3 = new LinkedList<MusicalElement>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<MusicalElement> notes4 = new LinkedList<MusicalElement>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes5 = new LinkedList<MusicalElement>();
        notes5.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        notes5.add(new Note(new Pitch('F'), new Fraction(1, 4)));
        
        Tuplet tup1 = new Tuplet(notes);
        Tuplet tup2 = new Tuplet(notes2);
        Tuplet tup3 = new Tuplet(notes3);
        Tuplet tup4 = new Tuplet(notes4);
        Tuplet tup5 = new Tuplet(notes5);
        
        assertEquals(true, tup1.getType() == tup1.getType());
        assertEquals(true, tup1.getType() == tup2.getType());
        assertEquals(false, tup1.getType() == tup5.getType());
	}
	
	@Test
	public void testTupletGetDuration() {
	       List<MusicalElement> notes = new LinkedList<MusicalElement>();
	        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
	        
	        List<MusicalElement> notes2 = new LinkedList<MusicalElement>();
	        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
	        
	        List<MusicalElement> notes3 = new LinkedList<MusicalElement>();
	        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
	        
	        List<MusicalElement> notes4 = new LinkedList<MusicalElement>();
	        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
	        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
	        
	        List<MusicalElement> notes5 = new LinkedList<MusicalElement>();
	        notes5.add(new Note(new Pitch('C'), new Fraction(1, 8)));
	        notes5.add(new Note(new Pitch('G'),new Fraction(1, 8)));
	        notes5.add(new Note(new Pitch('F'), new Fraction(1, 8)));
	        
	        Tuplet tup1 = new Tuplet(notes);
	        Tuplet tup2 = new Tuplet(notes2);
	        Tuplet tup3 = new Tuplet(notes3);
	        Tuplet tup4 = new Tuplet(notes4);
	        Tuplet tup5 = new Tuplet(notes5);
	        
	        assertEquals(true, tup1.getDuration().equals(new Fraction(3, 4)));
	        assertEquals(true, tup5.getDuration().equals(new Fraction(2, 8)));
	        assertEquals(true, tup1.getDuration().equals(tup2.getDuration()));
	        
	}
	
	@Test
	public void testTupletClone() {
	   
        List<MusicalElement> notes5 = new LinkedList<MusicalElement>();
        notes5.add(new Note(new Pitch('C'), new Fraction(1, 8)));
        notes5.add(new Note(new Pitch('G'),new Fraction(1, 8)));
        notes5.add(new Note(new Pitch('F'), new Fraction(1, 8)));
        
        Tuplet tup5 = new Tuplet(notes5);
        Tuplet clone = tup5.clone();
        
        assertEquals(true, tup5.equals(clone));
        assertEquals(true, tup5.hashCode() == clone.hashCode());
        assertEquals(true, tup5.toString().equals(clone.toString()));
	}
	
	@Test
	public void testTupletGetTicksPerWholeNote() {
	    List<MusicalElement> notes = new LinkedList<MusicalElement>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes2 = new LinkedList<MusicalElement>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<MusicalElement> notes3 = new LinkedList<MusicalElement>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<MusicalElement> notes4 = new LinkedList<MusicalElement>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes5 = new LinkedList<MusicalElement>();
        notes5.add(new Note(new Pitch('C'), new Fraction(1, 8)));
        notes5.add(new Note(new Pitch('G'),new Fraction(1, 8)));
        notes5.add(new Note(new Pitch('F'), new Fraction(1, 8)));
        
        Tuplet tup1 = new Tuplet(notes);
        Tuplet tup2 = new Tuplet(notes2);
        Tuplet tup5 = new Tuplet(notes5);
    
        assertEquals(true, tup1.getTicksPerWholeNote() == tup2.getTicksPerWholeNote());
        assertEquals(true, tup1.getTicksPerWholeNote() == tup1.getTicksPerWholeNote());
        assertEquals(8, tup1.getTicksPerWholeNote());
        assertEquals(24, tup5.getTicksPerWholeNote());   
	}
	
	@Test
	public void testTupletToString() {
	    List<MusicalElement> notes = new LinkedList<MusicalElement>();
        notes.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes2 = new LinkedList<MusicalElement>();
        notes2.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes2.add(new Note(new Pitch('F'),new Fraction(1, 4)));
        
        List<MusicalElement> notes3 = new LinkedList<MusicalElement>();
        notes3.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes3.add(new Note(new Pitch('G'),new Fraction(1, 2)));
        
        List<MusicalElement> notes4 = new LinkedList<MusicalElement>();
        notes4.add(new Note(new Pitch('C'), new Fraction(1, 4)));
        notes4.add(new Note(new Pitch('G'),new Fraction(1, 4)));
        
        List<MusicalElement> notes5 = new LinkedList<MusicalElement>();
        notes5.add(new Note(new Pitch('C'), new Fraction(1, 8)));
        notes5.add(new Note(new Pitch('G'),new Fraction(1, 8)));
        notes5.add(new Note(new Pitch('F'), new Fraction(1, 8)));
        
        Tuplet tup1 = new Tuplet(notes);
        Tuplet tup2 = new Tuplet(notes2);
        Tuplet tup3 = new Tuplet(notes3);
        Tuplet tup4 = new Tuplet(notes4);
        Tuplet tup5 = new Tuplet(notes5);
    
        assertEquals(true, tup1.toString().equals(tup1.toString()));
        assertEquals(true, tup1.toString().equals(tup4.toString()));
        assertEquals(false, tup1.toString().equals(tup2.toString()));
        assertEquals(false, tup1.toString().equals(tup3.toString()));
        assertEquals(false, tup1.toString().equals(tup5.toString()));
	}
	
	

}
