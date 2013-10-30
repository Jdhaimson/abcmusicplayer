package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class PitchTest {

	/*
	 * Testing Strategy:
	 * NONE
	 */
	
	@Test
	public void testBasicPitchTranspose() {
		Pitch p = new Pitch('C').accidentalTranspose(1);
		assertEquals("^C", p.toString());
	}
	
	@Test
	public void testPitchEquals() {
	    Pitch pitch1 = new Pitch('C');
	    Pitch pitch2 = new Pitch('C');
	    Pitch pitch3 = new Pitch('G');
	    Pitch pitch4 = new Pitch('C').accidentalTranspose(1);
	    Pitch pitch5 = new Pitch('C').accidentalTranspose(-1);
	    Pitch pitch6 = new Pitch('C').accidentalTranspose(0);
	    Pitch pitch7 = new Pitch('C').octaveTranspose(1);
	    Pitch pitch8 = new Pitch('C').octaveTranspose(-1);
	    Pitch pitch9 = new Pitch('C').octaveTranspose(0);
	    Pitch pitch10 = new Pitch('C').transpose(1);
	    Pitch pitch11 = new Pitch('C').transpose(-1);
	    Pitch pitch12 = new Pitch('C').transpose(0);
	    
	    assertEquals(true, pitch1.equals(pitch1));
	    assertEquals(true, pitch1.equals(pitch2));
	    assertEquals(false, pitch1.equals(pitch3));
	    assertEquals(false, pitch1.equals(pitch4));
	    assertEquals(false, pitch1.equals(pitch5));
	    assertEquals(true, pitch1.equals(pitch6));
	    assertEquals(false, pitch1.equals(pitch7));
	    assertEquals(false, pitch1.equals(pitch8));
	    assertEquals(true, pitch1.equals(pitch9));
	    assertEquals(false, pitch1.equals(pitch10));
	    assertEquals(false, pitch1.equals(pitch11));
	    assertEquals(true, pitch1.equals(pitch12));
	}
	
	@Test
	public void testPitchHashCode() {
	    Pitch pitch1 = new Pitch('C');
        Pitch pitch2 = new Pitch('C');
        
        assertEquals(true, pitch1.hashCode() == pitch1.hashCode());
        assertEquals(true, pitch1.hashCode() == pitch2.hashCode());
	}
	

}
