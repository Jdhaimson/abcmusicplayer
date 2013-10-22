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

}
