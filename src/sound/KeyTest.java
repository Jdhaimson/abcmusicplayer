package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeyTest {
    
    /*
     * Testing Strategy
     * 
     * 
     */

	@Test
	public void tesKeyMinor() {
		Key key = new Key("Em");
		assertEquals(true, key.getPitch("C"). equals(new Pitch("C")));
		assertEquals(true, key.getPitch("D"). equals(new Pitch("D")));
		assertEquals(true, key.getPitch("E"). equals(new Pitch("E")));
		assertEquals(true, key.getPitch("F").equals(new Pitch("^F")));
		assertEquals(true, key.getPitch("G"). equals(new Pitch("G")));
		assertEquals(true, key.getPitch("A"). equals(new Pitch("A")));
		assertEquals(true, key.getPitch("B"). equals(new Pitch("B")));
	}
	
	@Test
	public void testKeyEquals() {
	    Key key1 = new Key("Em");
	    Key key2 = new Key("Em");
	    Key key3 = new Key("E");
	    Key key4 = new Key();
	    Key key5 = new Key();
	    
	    assertEquals(true, key1.equals(key2));
	    assertEquals(true, key1.equals(key1));
	    assertEquals(false, key1.equals(key3));
	    assertEquals(false, key1.equals(key4));
	    assertEquals(true, key4.equals(key5));
	}
	
	@Test
	public void testKeyHashCode() {
	    Key key1 = new Key("Em");
        Key key2 = new Key("Em");
        Key key3 = new Key();
        Key key4 = new Key();
        
	    assertEquals(true, key1.hashCode() == key1.hashCode());
	    assertEquals(true, key1.hashCode() == key2.hashCode());  
	    assertEquals(true, key3.hashCode() == key4.hashCode());
	    assertEquals(true, key3.hashCode() == key3.hashCode());
	}

	//TODO: Finish toString Testing
	@Test
	public void testKeyToString() {
	    Key key1 = new Key("Em");
	    Key key2 = new Key("G");
	    assertEquals(key1.toString(), key2.toString());
	}
	
	@Test
	public void testKeyContainsNote() {
	    Key gMajor = new Key("G");
	    Key aMajor = new Key("A");
	    
	    assertEquals(true, gMajor.containsNote("G"));
	    assertEquals(false, gMajor.containsNote("g"));
	    assertEquals(false, gMajor.containsNote("^F"));
	    assertEquals(false, gMajor.containsNote("^f"));
	    assertEquals(true, gMajor.containsNote("B"));
	    assertEquals(false, gMajor.containsNote("b"));
	    assertEquals(true, gMajor.containsNote("A") == aMajor.containsNote("A"));
	    assertEquals(false, aMajor.containsNote("^C"));
	    assertEquals(false, aMajor.containsNote("^C") == gMajor.containsNote("^C"));
	}
	
}
