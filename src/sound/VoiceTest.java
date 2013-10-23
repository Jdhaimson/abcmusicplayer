package sound;

import static org.junit.Assert.*;

import org.junit.Test;

public class VoiceTest {
	/*
	 * Testing Strategy:
	 * NONE
	 */

	@Test
	public void testVoiceConstructor() {
		Voice v = new Voice("Test", 100);
		assertEquals("Test", v.toString());
	}

	
	@Test
	public void testVoiceEquals() {
	    Voice voice1 = new Voice("Bass", 100);
	    Voice voice2 = new Voice("Bass", 100);
	    Voice voice3 = new Voice("Soprano", 100);
	    Voice voice4 = new Voice("Bass", 150);
	    Voice voice5 = new Voice("Soprano", 200);
	    
	    assertEquals(true, voice1.equals(voice2));
	    assertEquals(true, voice1.equals(voice1));
	    assertEquals(false, voice1.equals(voice3));
	    assertEquals(false, voice1.equals(voice4));
	    assertEquals(false, voice1.equals(voice5));
	}
	
	@Test
	public void testVoiceHashCode(){
	    Voice voice1 = new Voice("Bass", 100);
        Voice voice2 = new Voice("Bass", 100);
        
        assertEquals(true, voice1.hashCode() == voice1.hashCode());
        assertEquals(true, voice1.hashCode() == voice2.hashCode());

	}
	
	@Test
	public void testVoiceToString() {
	    Voice voice1 = new Voice("Bass", 100);
        Voice voice2 = new Voice("Bass", 100);
        Voice voice3 = new Voice("Soprano", 100);
        Voice voice4 = new Voice("Bass", 150);
        Voice voice5 = new Voice("Soprano", 200);
        
        assertEquals(true, voice1.toString().equals(voice2.toString()));
        assertEquals(true, voice1.toString().equals(voice1.toString()));
        assertEquals(false, voice1.toString().equals(voice3.toString()));
        assertEquals(true, voice1.toString().equals(voice4.toString()));
        assertEquals(false, voice1.toString().equals(voice5.toString()));
	}
	
	@Test
	public void testVoiceTestGetTicksPerVoice() {
	    Voice voice1 = new Voice("Bass", 100);
        Voice voice2 = new Voice("Bass", 100);
        Voice voice3 = new Voice("Soprano", 100);
        Voice voice4 = new Voice("Bass", 150);
        Voice voice5 = new Voice("Soprano", 200);
        
        assertEquals(true, voice1.getTicksPerVoice() == 100);
        assertEquals(false, voice1.getTicksPerVoice() == 150);
        assertEquals(true, voice1.getTicksPerVoice() == voice2.getTicksPerVoice());
        assertEquals(true, voice1.getTicksPerVoice() == voice3.getTicksPerVoice());
        assertEquals(false, voice1.getTicksPerVoice() == voice4.getTicksPerVoice());
        assertEquals(false, voice1.getTicksPerVoice() == voice5.getTicksPerVoice());
	}
	
	@Test
	public void testVoiceClone() {
	    Voice voice1 = new Voice("Bass", 100);
        Voice voice2 = new Voice("Bass", 100);
        Voice voice3 = new Voice("Soprano", 100);
        Voice voice4 = new Voice("Bass", 150);
        Voice voice5 = new Voice("Soprano", 200);
        Voice voice6 = voice1.clone();
        
        assertEquals(true, voice6.equals(voice2));
        assertEquals(true, voice6.equals(voice1));
        assertEquals(false, voice6.equals(voice3));
        assertEquals(false, voice6.equals(voice4));
        assertEquals(false, voice6.equals(voice5));
        assertEquals(true, voice1.equals(voice6));
	}
	
	
	public void testVoiceAddNote() {
	    Voice voice1 = new Voice("Bass", 50);
	    Pitch myPitchBiggerThanABridge = new Pitch('C');
	    Note myNote = new Note(myPitchBiggerThanABridge, 6);
	}
}
