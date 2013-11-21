package grammar;

import static org.junit.Assert.*;
import sound.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/*
 * We are testing that our body gets parsed correctly.  We test that measures get added correctly.  
 * We also test that errors are thrown for invalid inputs.  Invalid inputs may include empty body, 
 * no newline, lyrics only, and general invalid tokens.
 */

public class ABCMusicBodyParserTest {

    @Test
    public void testBasicBodyParser() {
        Song song = new Song(7, "Basic Song", new Key("A"));
        MusicPlayerBody body = new MusicPlayerBody(song);
        Measure measure = new Measure(1,1);
        
        Voice voice = new Voice("default",1);
        Note note = new Note(new Pitch("B"), new Fraction(1,8));
        voice.addMusicalElement(note);
        measure.addVoice(voice);
        
        Song expectedSong = new Song(3, "Song", new Key("D"));
        expectedSong.addMeasure(measure);
        
        assertTrue(expectedSong.getMeasures().size() == body.parse("B\n").getMeasures().size());
    }
    
    @Test
    (expected = RuntimeException.class)
    public void testEmptyBodyParserTest() {
    	 Song song = new Song(7, "Basic Song", new Key("A"));
         MusicPlayerBody body = new MusicPlayerBody(song);
         Measure measure = new Measure(1,1);
         
         body.parse("\n");
    }
    
    @Test
    (expected = RuntimeException.class)
    public void testSimplyLyricsBodyParserTest() {
    	 Song song = new Song(7, "Basic Song", new Key("A"));
         MusicPlayerBody body = new MusicPlayerBody(song);
         Measure measure = new Measure(1,1);
         
         body.parse("w: Once up-on a time\n");
    }
    
    @Test
    (expected = RuntimeException.class)
    public void testInvalidTokensBodyParserTest() {
    	 Song song = new Song(7, "Basic Song", new Key("A"));
         MusicPlayerBody body = new MusicPlayerBody(song);
         Measure measure = new Measure(1,1);
         
         body.parse("A*\n");
    }
    
    @Test
    (expected = RuntimeException.class)
    public void testMissingNewlineBodyParserTest() {
    	 Song song = new Song(7, "Basic Song", new Key("A"));
         MusicPlayerBody body = new MusicPlayerBody(song);
         Measure measure = new Measure(1,1);
         
         body.parse("A B C D");
    }
}
