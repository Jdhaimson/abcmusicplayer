package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class SongTest {
    
    /*
     * Testing Strategy
     * 
     * To test equals(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences. 
     * Tested to make sure equals() was reflexive and that two structurally equal instances were equals().
     * 
     * To test toString(), we created instances of each class, each varying by the others slightly. We created instances that reflected different combinations of differences. 
     * Tested to make sure instances returned the correct string and that structurally equivalent instances returned the same string.
     * 
     * To test hashCode(), we tested to be sure that structurally equivalent instances returned the same hash code and that hashCode() was reflexive.
     * 
     * To test clone(), we tested to be sure that a clone of an instance was equals() to its parent, returned equivalent strings, and returned equivalent hash codes.
     *
     */

	
//	@Test
	public void testBasicSong() throws Exception {
		Song song = new Song(1, "Title", new Key("C"));
		song.setMeter(new Fraction(4,4));
		song.setTempo(new Fraction(1,4), 120);
		Measure m = new Measure(1.0, 0);
		Voice v1 = new Voice("Upper", 1.0);
		Voice v2 = new Voice("Lower", 1.0);
		
		Pitch p1 = new Pitch("C");
		Note n1 = new Note(p1, new Fraction(1,4));
		Pitch p2 = new Pitch("E");
		Note n2 = new Note(p2, new Fraction(1,4));
		Pitch p3 = new Pitch("G");
		Note n3 = new Note(p3, new Fraction(1,2));
		
		List<Note> chordNotes = new LinkedList<Note>();
		chordNotes.add(new Note(new Pitch("C,"), new Fraction (1,1)));
		chordNotes.add(new Note(new Pitch("E,"), new Fraction (1,1)));
		chordNotes.add(new Note(new Pitch("G,"), new Fraction (1,1)));
		Chord c = new Chord(chordNotes);
		
		v1.addMusicalElement(n1);
		v1.addMusicalElement(n2);
		v1.addMusicalElement(n3);
		v2.addMusicalElement(c);

		m.addVoice(v1);
		m.addVoice(v2);
		song.addMeasure(m);
		song.play();

	}
		

//	@Test
	public void testRepeat() throws Exception {
		Song song = new Song(1, "Title", new Key("C"));
		song.setMeter(new Fraction(4,4));
		song.setTempo(new Fraction(1,4), 120);
		Measure m1 = new Measure(1.0, 0);
		Measure m2 = new Measure(1.0, 1);
		Measure m3 = new Measure(1.0, 2);
		Voice v1 = new Voice("Upper", 1.0);
		Voice v2 = new Voice("Upper", 1.0);
		Voice v3 = new Voice("Upper", 1.0);
		
		Note n1 = new Note(new Pitch("C"), new Fraction(1,4));
		Note n2 = new Note(new Pitch("E"), new Fraction(1,4));
		Note n3 = new Note(new Pitch("G"), new Fraction(1,2));
		
		v1.addMusicalElement(n1);
		v1.addMusicalElement(n2);
		v1.addMusicalElement(n3);
		v2.addMusicalElement(n3);
		v2.addMusicalElement(n2);
		v2.addMusicalElement(n1);
		v3.addMusicalElement(n1);
		v3.addMusicalElement(n3);
		v3.addMusicalElement(n1);

		m1.addVoice(v1);
		m2.addVoice(v2);
		m3.addVoice(v3);
		m2.setRepeat(0);
		m2.setAlternateEnding(2);
		
		song.addMeasure(m1);
		song.addMeasure(m2);
		song.addMeasure(m3);
		song.play();

	}
	
//	@Test
	public void testSetComposer() {
	    Song song = new Song(1, "Title", new Key("E"));
	    Song songToCheck = new Song(1, "Title", new Key("E"));
	    
	    assertEquals(true, song.equals(songToCheck));
	    
	    songToCheck.setComposer("Gabe");
	    song.setComposer("Gabe");
	    
	    assertEquals(true, song.equals(songToCheck));
	    
	    songToCheck.setComposer("Tyler");
	    
	    assertEquals(false, song.equals(songToCheck));
	}
	
	//@Test
	public void testSetMeter() {
        Song song = new Song(1, "Title", new Key("E"));
        Song songToCheck = new Song(1, "Title", new Key("E"));
        
        assertEquals(true, song.equals(songToCheck));
        
        songToCheck.setMeter(new Fraction(1, 4));
        song.setMeter(new Fraction(1, 4));
        
        assertEquals(true, song.equals(songToCheck));
        
        songToCheck.setMeter(new Fraction(1, 2));
        
        assertEquals(false, song.equals(songToCheck));
	}
	
//	@Test
	public void testSetLength() {
        Song song = new Song(1, "Title", new Key("E"));
        Song songToCheck = new Song(1, "Title", new Key("E"));
        
        assertEquals(true, song.equals(songToCheck));
        
        songToCheck.setLength(new Fraction(1, 4));
        song.setLength(new Fraction(1, 4));
        
        assertEquals(true, song.equals(songToCheck));
        
        songToCheck.setLength(new Fraction(1, 2));
        
        assertEquals(false, song.equals(songToCheck));
	}
	
//	@Test
	public void testSetTempo() {
        Song song = new Song(1, "Title", new Key("E"));
        Song songToCheck = new Song(1, "Title", new Key("E"));
        
        assertEquals(true, song.equals(songToCheck));
        
        songToCheck.setTempo(new Fraction(1, 4), 100);
        song.setTempo(new Fraction(1, 4), 100);
        
        assertEquals(true, song.equals(songToCheck));
        
        songToCheck.setTempo(new Fraction(1, 4), 150);
        
        assertEquals(false, song.equals(songToCheck));
        
        songToCheck.setTempo(new Fraction(1, 2), 100);
        
        assertEquals(false, song.equals(songToCheck));
	}
	
//	@Test
	public void testGetNotesPerMeasure() {
        Song song = new Song(1, "Title", new Key("E"));

        
        assertEquals(true, song.getNotesPerMeasure() == 1);

        song.setMeter(new Fraction(1, 4));
        
        assertEquals(true, song.getNotesPerMeasure() == 0.25);
        
        song.setMeter(new Fraction(1, 2));
        
        assertEquals(true, song.getNotesPerMeasure() == 0.5);
        
        song.setMeter(new Fraction(3, 4));
        
        assertEquals(true, song.getNotesPerMeasure() == 0.75);
	    
	}
	
//	@Test
	public void testGetPitchInKey() {
	    //Tests major keys
	    Song song = new Song(1, "Piece in G Major", new Key("G"));
	    
	    assertEquals(new Pitch("^F"), song.getPitchInKey("F"));
	    assertEquals(new Pitch("G"), song.getPitchInKey("G"));
	    
	    //Tests minor keys
	    Song song2 = new Song(1, "Piece in C Minor", new Key("Cm"));
	    
	    assertEquals(new Pitch("C"), song2.getPitchInKey("C"));
	    assertEquals(new Pitch("_E"), song2.getPitchInKey("E"));
	}
}
