package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestTest {
    
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
     * To test getDuration(),  and getTicksPerWholteNote(), we used instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences.
     * We created instances who's rests varied duration. We tested to make sure that getTicksPerWholeNote() was only depended on durations of the notes.
     * We tested to make sure that getDuration was only dependent on the durations of the rest.
     */

    @Test
    public void testRestGetDuration() {
        Rest r1 = new Rest(new Fraction(1,4));
        Rest r2 = new Rest(new Fraction(1,4));
        Rest r3 = new Rest(new Fraction(3,4));

        assertEquals(true, new Fraction(1,4).equals(r1.getDuration()));
        assertEquals(true, new Fraction(1,4).equals(r2.getDuration()));
        assertEquals(true, r1.getDuration().equals(r2.getDuration()));
        assertEquals(false, r1.getDuration().equals(r3.getDuration()));
    }

    @Test
    public void testRestGetTicksPerWholeNote() {
        Rest r1 = new Rest(new Fraction(1,4));
        Rest r2 = new Rest(new Fraction(1,4));
        Rest r3 = new Rest(new Fraction(3,4));

        assertEquals(16, r1.getTicksPerWholeNote());
        assertEquals(16, r2.getTicksPerWholeNote());
        assertEquals(4, r3.getTicksPerWholeNote());
    }

    @Test
    public void testRestClone() {
        Rest r1 = new Rest(new Fraction(1,4));
        Rest r2 = new Rest(new Fraction(1,4));
        Rest r3 = new Rest(new Fraction(3,4));
        Rest r1Clone = r1.clone();

        assertEquals(true, r1.equals(r1Clone));
        assertEquals(true, r1.equals(r2));
        assertEquals(true, r1Clone.equals(r2));
        assertEquals(false, r1Clone.equals(r3));
        assertEquals(true, r1.hashCode() == r1Clone.hashCode());
        assertEquals(true, r1.getDuration() == r1Clone.getDuration());
        assertEquals(true, r1.getTicksPerWholeNote() == r1Clone.getTicksPerWholeNote());
        assertEquals(true, r1.toString().equals(r1Clone.toString()));
    }

    @Test
    public void testRestHashCode() {
        Rest r1 = new Rest(new Fraction(1,4));
        Rest r2 = new Rest(new Fraction(1,4));

        assertEquals(true, r1.hashCode() == r1.hashCode());
        assertEquals(true, r1.hashCode() == r2.hashCode());
    }

    @Test
    public void testRestEquals() {
        Rest r1 = new Rest(new Fraction(1,4));
        Rest r2 = new Rest(new Fraction(1,4));
        Rest r3 = new Rest(new Fraction(3,4));

        assertEquals(true, r1.equals(r1));
        assertEquals(true, r1.equals(r2));
        assertEquals(false, r1.equals(r3));
    }

    @Test
    public void testRestToString() {
        Rest r1 = new Rest(new Fraction(1,4));
        Rest r2 = new Rest(new Fraction(1,4));
        Rest r3 = new Rest(new Fraction(3,4));

        assertEquals("z:1/4", r1.toString());
        assertEquals(true, r1.toString().equals(r2.toString()));
        assertEquals(true, r3.toString().equals("z:3/4"));
    }

}
