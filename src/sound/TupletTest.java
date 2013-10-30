package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class TupletTest {

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
     * To test getElement(), we created tuplets whose notes differed on duration and pitch and tested to make sure that these differences were reflected in the output of getElements().
     * We wanted to make sure that getElement() took into account both pitch and duration.
     * 
     * To test getDuration() and getTicksPerWholeNote, we created tuplets whose notes differed on duration and pitch and made sure that tuplets that were comprised of notes of equivlanet duration, independent of pitch, returned the same values.
     * We wanted to make sure that these methods were independent of pitch.
     * 
     * To test getType(), we created tuplets whose notes differed on duration and pitch. Made sure that getType was independent of pitch and duration, and that tuplets with two notes returned to same type, that tuplets with 3 notes returned the same type, and that tuplets with 4 notes returned the same type.
     * 
     */

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
        Tuplet tup4 = new Tuplet(notes4);


        assertEquals(true, tup1.hashCode() == tup1.hashCode());
        assertEquals(true, tup1.hashCode() == tup4.hashCode());
    }

    @Test
    public void testTupletGetElements() {
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
    
    @Test
    public void testTupletTicksPerElement() {
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
        
        assertEquals(3, tup1.getTicksPerElement(8));
        assertEquals(2, tup5.getTicksPerElement(24));
    }



}
