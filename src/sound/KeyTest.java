package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeyTest {

	@Test
	public void testeMinor() {
		Key key = new Key("e");
		assertEquals(true, key.getPitch("C"). equals(new Pitch("C")));
		assertEquals(true, key.getPitch("D"). equals(new Pitch("D")));
		assertEquals(true, key.getPitch("E"). equals(new Pitch("E")));
		assertEquals(true, key.getPitch("F").equals(new Pitch("^F")));
		assertEquals(true, key.getPitch("G"). equals(new Pitch("G")));
		assertEquals(true, key.getPitch("A"). equals(new Pitch("A")));
		assertEquals(true, key.getPitch("B"). equals(new Pitch("B")));
	}

}
