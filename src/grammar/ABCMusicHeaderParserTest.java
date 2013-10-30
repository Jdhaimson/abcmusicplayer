package grammar;

import static org.junit.Assert.*;
import sound.*;

import java.util.List;

import org.junit.Test;

public class ABCMusicHeaderParserTest {

    
    @Test
    public void testBasicHeaderParser() {
        String s = "X:2167\n"+
                "T:Waxie's: Dargle\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "L:1/8\n"+
                "%\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n"+
                "K:D\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test
    public void testBasicHeaderParserDifferentOrderNoSetLength() {
        String s = "X:2167\n"+
                "T:Waxie's: Dargle\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "L:1/8\n"+
                "%\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n"+
                "C:Josh\n"+
                "K:D\n";
                
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));  
    }
    
    @Test
    public void testHeaderParserNoMeter() {
        String s = "X:2167\n"+
                "T:Waxie's: Dargle\n"+
                "%Random Comment % * $ ()\n"+
                "L:1/8\n"+
                "%\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n"+
                "C:Josh\n"+
                "K:D\n";
                
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput)); 
    }
    
    @Test
    public void testHeaderParserNoTempo() {
        String s = "X:2167\n"+
                "T:Waxie's: Dargle\n"+
                "%Random Comment % * $ ()\n"+
                "L:1/8\n"+
                "%\n"+
                "V:1\n"+
                "V:Austin\n"+
                "C:Josh\n"+
                "K:D\n";
                
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test
    public void testHeaderParserNoComposer() {
        String s = "X:2167\n"+
                "T:Waxie's: Dargle\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "L:1/8\n"+
                "%\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n"+
                "K:D\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test
    public void testHeaderParserNoDefaultNote() {
        String s = "X:2167\n"+
                "T:Waxie's: Dargle\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "%\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n"+
                "K:D\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test(expected = Exception.class) 
    public void testHeaderParserKeyNotLast() throws Exception{
        String s = "X:2167\n"+
                "T:Waxie's: Dargle\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "%\n"+
                "K:D\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test(expected = Exception.class) 
    public void testHeaderParserIndexNotFirst() throws Exception{
        String s = 
                "T:Waxie's: Dargle\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "%\n"+
                "X:2167\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n"+
                "K:D\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test(expected = Exception.class) 
    public void testHeaderParserTitleNotSecond() throws Exception{
        String s = "X:2167\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "%\n"+
                "Q:1/4=180\n"+
                
                "V:1\n"+
                "V:Austin\n"+
                "K:D\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test(expected = Exception.class) 
    public void testHeaderParserNotSeperateLines() throws Exception{
        String s = "X:2167\n"+
                "T:Waxie's: Dargle\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C"+
                "%\n"+
                "Q:1/4=180"+
                "T:Waxie's: Dargle\n"+
                "V:1\n"+
                "V:Austin"+
                "K:D\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test(expected = Exception.class)
    public void testHeaderParserNoTitle() throws Exception{
        String s = "X:2167\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "L:1/8\n"+
                "%\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n"+
                "K:D\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test(expected = Exception.class)
    public void testHeaderParserNoIndex() throws Exception{
        String s =
                "T:Waxie's Darge\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "L:1/8\n"+
                "%\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n"+
                "K:D\n";
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    
    @Test(expected = Exception.class)
    public void testHeaderParserNoKey() throws Exception{
        String s = "X:2167\n"+
                "T:Waxie's Darge\n"+
                "C:Josh\n"+
                "%Random Comment % * $ ()\n"+
                "M:C\n"+
                "L:1/8\n"+
                "%\n"+
                "Q:1/4=180\n"+
                "V:1\n"+
                "V:Austin\n";
        
        Song expectedOutput = new Song(2167, "Waxie's: Dargle", new Key("D") );
        expectedOutput.setComposer("Josh");
        expectedOutput.setLength(new Fraction(1, 8));
        expectedOutput.setMeter(new Fraction(4, 4));
        expectedOutput.setTempo(new Fraction(1,4), 180);
        
        assertEquals(true, new MusicPlayerHeader().parse(s).equals(expectedOutput));
    }
    

}
