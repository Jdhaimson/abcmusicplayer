package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class LyricTest {

	@Test
	public void testBasicLyric() {
		String lString = "I Love it when you call me big poppa";
		Lyric l = new Lyric(lString, 10);
		assertEquals(lString, l.toString());
	}

}
