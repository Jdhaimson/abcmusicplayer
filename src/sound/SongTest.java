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
	
	//@Test
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
	
	//@Test
	public void testTuplet() throws Exception {
		Song song = new Song(1, "Title", new Key("C"));
		song.setMeter(new Fraction(4,4));
		song.setTempo(new Fraction(1,4), 120);
		Measure m = new Measure(1.0, 0);
		Voice v1 = new Voice("Upper", 1.0);
		
			
		Note n1 = new Note(new Pitch("C"), new Fraction(1,4));
		Note n2 = new Note(new Pitch("C"), new Fraction(1,8));
		Note n3 = new Note(new Pitch("G"), new Fraction(1,8));
		
		List<Note> chordNotes = new LinkedList<Note>();
		chordNotes.add(new Note(new Pitch("C,"), new Fraction (1,8)));
		chordNotes.add(new Note(new Pitch("E,"), new Fraction (1,8)));
		chordNotes.add(new Note(new Pitch("G,"), new Fraction (1,8)));
		Chord c = new Chord(chordNotes);
		
		List<MusicalElement> tupletElements = new LinkedList<MusicalElement>();
		tupletElements.add(n2);
		tupletElements.add(c);
		tupletElements.add(n3);
		
		Tuplet t = new Tuplet(tupletElements);
		
		v1.addMusicalElement(n1);
		v1.addMusicalElement(n1);
		v1.addMusicalElement(t);

		m.addVoice(v1);
		song.addMeasure(m);
		song.play();
	}	

	@Test
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
	
}
