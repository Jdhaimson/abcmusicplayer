package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

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
        Measure m5 = new Measure(16, 3);
        
        assertEquals(m1.toString(), m1.toString());
        assertEquals(m1.toString(), m5.toString());
        
    }
    
    @Test
    public void testSetRepeat() {
        Measure m1 = new Measure(16, 3);
        Measure m2 = new Measure(16, 4);
        Measure m3 = new Measure(9, 3);
        
        m1.setRepeat(4);
        m2.setRepeat(72);
        m3.setRepeat(64);
    }
    
    @Test
    public void testSetAlternateEnding() {
        Measure m1 = new Measure(16, 3);
        Measure m2 = new Measure(16, 4);
        Measure m3 = new Measure(9, 3);
        Measure m4 = new Measure(12, 74);
        Measure m5 = new Measure(16, 3);
        
        m1.setAlternateEnding(35);
        m2.setAlternateEnding(3);
        m3.setAlternateEnding(1);
        m4.setAlternateEnding(17);
        m5.setAlternateEnding(53);
    }
    
    @Test
    public void testModifyKey() {
        Measure m1 = new Measure(16, 3);
        Measure m2 = new Measure(16, 4);
        
        m1.modifyKey("^F", "F");
        m2.modifyKey("^G", "GG");
        
        assertEquals(true, m1.isPitchInAccidentalKey("^F"));
        assertEquals(true, m2.isPitchInAccidentalKey("^G"));
    }

    
    public void testAddVocie() {
        Voice voice1 = new Voice("Bass", 1.0);
        
        Measure m1 = new Measure(360, 1);

        List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));

        List<Pitch> pitches2 = new LinkedList<Pitch>();
        pitches2.add(new Pitch('C'));
        pitches2.add(new Pitch('F'));
        pitches2.add(new Pitch('G'));

        Note note1 = new Note(new Pitch('C'), new Fraction(1, 4));

        try {
            voice1.addMusicalElement(note1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        
        m1.addVoice(voice1);
        
        assertEquals(m1.getVoice("Bass"), voice1);
    }
    
}
