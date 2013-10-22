package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoiceTest {
	/*
	 * Testing Strategy:
	 * NONE
	 */

	@Test
	public void testVoiceName() {
		Voice v = new Voice("Test", 100);
		assertEquals("Test", v.toString());
	}

}
