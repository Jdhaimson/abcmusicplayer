package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class VoiceTest {
	/*
	 * Testing Strategy:
	 * NONE
	 */

	@Test
	public void testVoiceConstructor() {
		Voice v = new Voice("Test", 1.0);
		assertEquals("Test", v.toString());
	}

	
	@Test
	public void testVoiceEquals() {
	    Voice voice1 = new Voice("Bass", 1.0);
	    Voice voice2 = new Voice("Bass", 1.0);
	    Voice voice3 = new Voice("Soprano", 1.0);
	    Voice voice4 = new Voice("Bass", 1.5);
	    Voice voice5 = new Voice("Soprano", 2.0);
	    
	    assertEquals(true, voice1.equals(voice2));
	    assertEquals(true, voice1.equals(voice1));
	    assertEquals(false, voice1.equals(voice3));
	    assertEquals(false, voice1.equals(voice4));
	    assertEquals(false, voice1.equals(voice5));
	}
	
	@Test
	public void testVoiceHashCode(){
	    Voice voice1 = new Voice("Bass", 1.0);
        Voice voice2 = new Voice("Bass", 1.0);
        
        assertEquals(true, voice1.hashCode() == voice1.hashCode());
        assertEquals(true, voice1.hashCode() == voice2.hashCode());

	}
	
	@Test
	public void testVoiceToString() {
	    Voice voice1 = new Voice("Bass", 1.0);
        Voice voice2 = new Voice("Bass", 1.0);
        Voice voice3 = new Voice("Soprano", 1.0);
        Voice voice4 = new Voice("Bass", 1.5);
        Voice voice5 = new Voice("Soprano", 2.0);
        
        assertEquals(true, voice1.toString().equals(voice2.toString()));
        assertEquals(true, voice1.toString().equals(voice1.toString()));
        assertEquals(false, voice1.toString().equals(voice3.toString()));
        assertEquals(true, voice1.toString().equals(voice4.toString()));
        assertEquals(false, voice1.toString().equals(voice5.toString()));
	}
	
	@Test
	public void testVoiceTestGetTicksPerVoice() {
	    Voice voice1 = new Voice("Bass", 1.0);
        Voice voice2 = new Voice("Bass", 1.0);
        Voice voice3 = new Voice("Soprano", 1.0);
        Voice voice4 = new Voice("Bass", 1.5);
        Voice voice5 = new Voice("Soprano", 2.0);
        
        assertEquals(true, voice1.getNotesPerVoice() == 1.0);
        assertEquals(false, voice1.getNotesPerVoice() == 1.5);
        assertEquals(true, voice1.getNotesPerVoice() == voice2.getNotesPerVoice());
        assertEquals(true, voice1.getNotesPerVoice() == voice3.getNotesPerVoice());
        assertEquals(false, voice1.getNotesPerVoice() == voice4.getNotesPerVoice());
        assertEquals(false, voice1.getNotesPerVoice() == voice5.getNotesPerVoice());
	}
	
	@Test
	public void testVoiceClone() {
	    Voice voice1 = new Voice("Bass", 1.0);
        Voice voice2 = new Voice("Bass", 1.0);
        Voice voice3 = new Voice("Soprano", 1.0);
        Voice voice4 = new Voice("Bass", 1.5);
        Voice voice5 = new Voice("Soprano", 2.0);
        Voice voice6 = voice1.clone();
        
        assertEquals(true, voice6.equals(voice2));
        assertEquals(true, voice6.equals(voice1));
        assertEquals(false, voice6.equals(voice3));
        assertEquals(false, voice6.equals(voice4));
        assertEquals(false, voice6.equals(voice5));
        assertEquals(true, voice1.equals(voice6));
	}
	
	
	public void testVoiceAddNote() {
	    Voice voice1 = new Voice("Bass", 1.0);
	    
	    List<Note> notesToCheck = new LinkedList<Note>();
	    
	    List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));
        
        List<Pitch> pitches2 = new LinkedList<Pitch>();
        pitches2.add(new Pitch('C'));
        pitches2.add(new Pitch('F'));
        pitches2.add(new Pitch('G'));
        
        Note note1 = new Note(pitches1, .25);
        Note note2 = new Note(pitches1, .5);
        Note note3 = new Note(pitches2, .25);
        
        try {
            voice1.addNote(note1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        notesToCheck.add(note1);
        assertEquals(true, voice1.getNotes().equals(notesToCheck));
        
        try {
            voice1.addNote(note1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        notesToCheck.add(note1);
        assertEquals(true, voice1.getNotes().equals(notesToCheck));
        
        try {
            voice1.addNote(note2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        notesToCheck.add(note2);
        assertEquals(true, voice1.getNotes().equals(notesToCheck));
	}
	
	@Test(expected = Exception.class) 
	public void testVoiceException() throws Exception{
	    Voice voice1 = new Voice("Bass", .25);
        
        List<Pitch> pitches1 = new LinkedList<Pitch>();
        pitches1.add(new Pitch('C'));
        pitches1.add(new Pitch('E'));
        pitches1.add(new Pitch('G'));
        
        List<Pitch> pitches2 = new LinkedList<Pitch>();
        pitches2.add(new Pitch('C'));
        pitches2.add(new Pitch('F'));
        pitches2.add(new Pitch('G'));
        
        Note note2 = new Note(pitches1, .5);
        
        voice1.addNote(note2);

        
	}
}
