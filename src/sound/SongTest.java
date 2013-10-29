package sound;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class SongTest {
    
    /*
     * Testing Strategy
     * 
     * 
     */

	/*
	 * public Song(String title, String composer, double noteLength, double meter,
				int ticksPerBeat, int index, int tempo, Key key) {
	 */
	
	@Test
	public void testBasicSong() throws Exception {
		Song song = new Song(1, "Title", new Key("Am"));
		song.setMeter(new Fraction(4,4));
		song.setTempo(new Fraction(1,4), 120);
		Measure m = new Measure(1.0, 0);
		Voice v = new Voice("Upper", 1.0);
		Pitch p1 = new Pitch("C");
		Note n1 = new Note(p1, new Fraction(1,4));
		Pitch p2 = new Pitch("E");
		Note n2 = new Note(p2, new Fraction(1,2));
		Pitch p3 = new Pitch("G");
		Note n3 = new Note(p3, new Fraction(1,4));
		
		List<Note> chordNotes = new LinkedList<Note>();
		chordNotes.add(n1);
		chordNotes.add(n2);
		chordNotes.add(n3);
		Chord c = new Chord(chordNotes);
		
		v.addMusicalElement(n1);
		v.addMusicalElement(c);
		//v.addMusicalElement(n3);
		m.addVoice(v);
		song.addMeasure(m);
		song.play();
		//Measure m = new Measure
	}

}
