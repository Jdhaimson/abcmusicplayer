package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestTest {

    @Test
    public void testRestGetDuration() {
        Rest r1 = new Rest(new Fraction(1/4));
        Rest r2 = new Rest(new Fraction(1/4));
        Rest r3 = new Rest(new Fraction(3/4));

        assertEquals(true, new Fraction(1/4).equals(r1.getDuration()));
        assertEquals(true, new Fraction(1/4).equals(r2.getDuration()));
        assertEquals(true, r1.getDuration().equals(r2.getDuration()));
        assertEquals(false, r1.getDuration().equals(r3.getDuration()));
    }

    @Test
    public void testRestGetTicksPerWholeNote() {
        Rest r1 = new Rest(new Fraction(1/4));
        Rest r2 = new Rest(new Fraction(1/4));
        Rest r3 = new Rest(new Fraction(3/4));

        assertEquals(true, r1.getTicksPerWholeNote() == 4);
        assertEquals(true, r2.getTicksPerWholeNote() == 4);
        assertEquals(true, r3.getTicksPerWholeNote() == 4);
    }

    @Test
    public void testRestClone() {
        Rest r1 = new Rest(new Fraction(1/4));
        Rest r2 = new Rest(new Fraction(1/4));
        Rest r3 = new Rest(new Fraction(3/4));
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
        Rest r1 = new Rest(new Fraction(1/4));
        Rest r2 = new Rest(new Fraction(1/4));
        Rest r3 = new Rest(new Fraction(3/4));

        assertEquals(true, r1.hashCode() == r1.hashCode());
        assertEquals(true, r1.hashCode() == r2.hashCode());
    }

    @Test
    public void testRestEquals() {
        Rest r1 = new Rest(new Fraction(1/4));
        Rest r2 = new Rest(new Fraction(1/4));
        Rest r3 = new Rest(new Fraction(3/4));

        assertEquals(true, r1.equals(r1));
        assertEquals(true, r1.equals(r2));
        assertEquals(false, r1.equals(r3));
    }

    @Test
    public void testRestToString() {
        Rest r1 = new Rest(new Fraction(1/4));
        Rest r2 = new Rest(new Fraction(1/4));
        Rest r3 = new Rest(new Fraction(3/4));

        assertEquals("z:1/4", r1.toString());
        assertEquals(true, r1.toString().equals(r2.toString()));
        assertEquals(true, r3.toString().equals("z:3/4"));
    }

}
