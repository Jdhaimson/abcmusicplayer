package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeasureTest {

    /*
     * Testing Strategy
     * 
     * 
     */

    @Test
    public void testMeasureEquals() {
        Measure m1 = new Measure(16, 3);
        Measure m2 = new Measure(16, 4);
        Measure m3 = new Measure(9, 3);
        Measure m4 = new Measure(12, 74);
        Measure m5 = new Measure(16, 3);

        assertEquals(true, m1.equals(m1));
        assertEquals(false, m1.equals(m2));
        assertEquals(false, m1.equals(m3));
        assertEquals(false, m1.equals(m4));
        assertEquals(true, m1.equals(m5));
    }

    @Test
    public void testGetMeasureNum() {
        Measure m1 = new Measure(16, 3);
        Measure m2 = new Measure(16, 4);
        Measure m4 = new Measure(12, 74);

        assertEquals(3, m1.getMeasureNum());
        assertEquals(74, m4.getMeasureNum());
        assertEquals(false, m1.getMeasureNum() == m2.getMeasureNum());
    }
    
    @Test
    public void testHashCode() {
        Measure m1 = new Measure(16, 3);
        Measure m5 = new Measure(16, 3);
        
        assertEquals(m1.hashCode(), m5.hashCode());
        assertEquals(m1.hashCode(), m1.hashCode());
        
    }
    
    @Test
    public void testToString() {
        Measure m1 = new Measure(16, 3);
        Measure m2 = new Measure(16, 4);
        Measure m3 = new Measure(9, 3);
        Measure m4 = new Measure(12, 74);
        Measure m5 = new Measure(16, 3);
    }
}
