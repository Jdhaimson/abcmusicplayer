package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class LyricTest {

	@Test
	public void testBasicLyricToString() {
		String lString = "I Love it when you call me big poppa";
		Lyric l = new Lyric(lString, 10);
		
		String lString2 = "I Love it when you call me big poppa";
		Lyric l2 = new Lyric(lString2, 10);
		
		assertEquals(lString, l.toString());
		assertEquals(lString2, l2.toString());
		assertEquals(true, l.toString().equals(l2.toString()));
	}
	
	@Test
	public void testLyricEquals() {
	    Lyric lyric1 = new Lyric("Testing 123", 10);
	    Lyric lyric2 = new Lyric("Testing 123", 10);
	    Lyric lyric3 = new Lyric("Testing 123", 25);
	    Lyric lyric4 = new Lyric("This is different", 10);
	    Lyric lyric5 = new Lyric("This is totally different", 35);
	    
	    assertEquals(true, lyric1.equals(lyric2));
	    assertEquals(false, lyric1.equals(lyric3));
	    assertEquals(false, lyric1.equals(lyric4));
	    assertEquals(false, lyric1.equals(lyric5));
	}
	
	@Test
	public void testLyricHashCode() {
	    Lyric lyric1 = new Lyric("I will be testing hashCode here", 10);
	    Lyric lyric2 = new Lyric("This will be slightly different", 10);
	    Lyric lyric3 = new Lyric("I will be testing hashCode here", 25);
	    Lyric lyric4 = new Lyric("This is totally different", 35);
	    Lyric lyric5 = new Lyric("I will be testing hashCode here", 10);
	    
	    assertEquals(lyric1.hashCode(), lyric5.hashCode());
	    assertEquals(false, lyric1.hashCode() == lyric2.hashCode());
	    assertEquals(false, lyric1.hashCode() == lyric3.hashCode());
	    assertEquals(false, lyric1.hashCode() == lyric4.hashCode());
	    assertEquals(false, lyric2.hashCode() == lyric4.hashCode());
	}
	
	@Test
	public void testLyricGetDuration() {
	    Lyric lyric1 = new Lyric("This is for testing getDuration", 15);
	    Lyric lyric2 = new Lyric("This is also for testing getDuration", 15);
	    Lyric lyric3 = new Lyric("This is for testing getDuration", 25);
	    
	    assertEquals(true, lyric1.getDuration() == 15);
	    assertEquals(true, lyric1.getDuration() == lyric2.getDuration());
	    assertEquals(false, lyric3.getDuration() == 15);
	    assertEquals(false, lyric3.getDuration() == lyric1.getDuration());
	}
}
