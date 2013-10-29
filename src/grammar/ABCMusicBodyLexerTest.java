package grammar;

import static org.junit.Assert.*;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

public class ABCMusicBodyLexerTest {
    /*
     * TESTING STRATEGY
     * 
     * 
     */

	@Test
    //Multi-Note Test
    public void testMultiNoteLexer() {
    	verifyLexer("[abcd]", new String[] {"[", "a", "b", "c", "d", "]"} );
    }
	
	@Test
	public void testSpace() {
	    verifyLexer(" ", new String[] {" "});
	}
	
	
	@Test
	public void testSingleNote() {
	    verifyLexer("A", new String[] {"A"});
	    //verifyLexer("A/2", new String[] {"A/2"});
	    //verifyLexer("A1/2", new String[] {"A1/2"});
	}
	
	@Test
	public void testNoteWithLengthNoNum() {
	    verifyLexer("A/2", new String[] {"A", "/2"});
	}
	
	@Test
	public void testNoteWithJustSlash() {
	    verifyLexer("A/", new String[] {"A", "/"});
	}
	
	@Test 
	public void testNoteWithLengthWithNum() {
	    verifyLexer("A1/2", new String[] {"A", "1/2"});
	}
	
	@Test
	public void testNoteWithLengthGreaterThanDefault() {
	    verifyLexer("A2", new String[] {"A", "2"});
	}
	
	@Test
	public void testMultipleNotes() {
	    verifyLexer("A B C D", new String[] {"A", " ", "B"," ", "C"," ", "D"});
	}
	
	@Test
	public void testMultipleNotesWithDifferentLengths() {
	    verifyLexer("A B/2 C/ D2", new String[] {"A", " ", "B","/2", " ", "C", "/"," ", "D", "2"});
	}
	
	@Test
	public void testNoteWithAccidentalSharp() {
	    verifyLexer("^A", new String[] {"^", "A"});
	}
	
	@Test
	public void testNoteWithAccidentalFlat() {
	    verifyLexer("_A", new String[] {"_", "A"});
	}
	
	@Test
	public void testNoteWithDoubleFlat() {
	    verifyLexer("__A", new String[] {"__", "A"});
	}
	
	@Test
	public void testNoteWithDoubleSharp() {
	    verifyLexer("^^A", new String[] {"^^", "A"});
	}
	
	@Test
	public void testNotesWithOctaveAlterationUp() {
	    verifyLexer("a''", new String[] {"a''"});
	}
	
	@Test
	public void testNotesWithOctaveAlterationDown() {
	    verifyLexer("A,,", new String[] {"A,,"});
	}
	
	@Test
	public void testNotesCombinationOctaveAlteration() {
	    verifyLexer("A,, B, C d e' f''", new String[] {"A,,", " " ,"B,", " ", "C", " ", "d"," ", "e'", " ", "f''"} );
	}
	
	@Test
	public void testBar() {
	    verifyLexer("|", new String[] {"|"});
	}
	
	@Test
	public void testDoubleBar() {
	    verifyLexer("||", new String[] {"||"});
	}
	
	
	@Test
	public void testNotesWithBar() {
	    verifyLexer("A| B", new String[] {"A", "|", " ", "B"});
	}
	
	@Test
	public void testBasicChord() {
	    verifyLexer("[abcd]", new String[] {"[", "a", "b", "c", "d", "]"} );
	}
	
	@Test
	public void testChordWithAccidental() {
	    verifyLexer("[^a_b^^c__de]", new String[] {"[", "^", "a", "_", "b","^^", "c","__", "d","e", "]"} );
	}
	
	@Test
	public void testBasicTupletTriplet() {
	    verifyLexer("(3ABC", new String[] {"(", "3", "A", "B","C"});
	}
	
	@Test
    public void testBasicTupletDuplet() {
        verifyLexer("(2AB", new String[] {"(", "2", "A", "B"});
    }
	
	@Test
	public void testBasicTupetQuadruplet() {
	    verifyLexer("(4ABCD", new String[] {"(", "4", "A", "B", "C", "D"});
	}
	
	@Test
	public void testTupletWithAccidentalsAndOctaves() {
	    verifyLexer("(2^a__B", new String[] {"(", "2", "^", "a", "__", "B"});
	}
	
	@Test
	public void testAccidentalWithOctave() {
	    verifyLexer("^^A,, ^B, _C,, __a' ^^b'", new String[] {"^^", "A,,", " ", "^", "B,", " ", "_", "C,,", " ", "__", "a'", " ", "^^", "b'"});
	}
	
	@Test
	public void testWomboCombo() {
	    verifyLexer("^^A/ __a'1/2 _A,/ | (3^a'__B,,C C/4 B,1/4 ||", new String[] {"^^", "A","/", " ", "__", "a'", "1/2"," ", "_", "A,","/", " ", "|", " ", "(", "3", "^", "a'", "__", "B,,", "C", " ", "C", "/4", " ", "B,", "1/4", " ", "||"});
	}
	
	
	
	
	
	
	public void verifyLexer(String input, String[] expectedTokens) {
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicBodyLexer lexer = new ABCMusicBodyLexer(stream);
        lexer.reportErrorsAsExceptions();
        List<? extends Token> actualTokens = lexer.getAllTokens();

        assertEquals(expectedTokens.length, actualTokens.size());
        
        for(int i = 0; i < actualTokens.size(); i++) {
             String actualToken = actualTokens.get(i).getText();
             String expectedToken = expectedTokens[i];
             assertEquals(actualToken, expectedToken);
        }
    }

}
