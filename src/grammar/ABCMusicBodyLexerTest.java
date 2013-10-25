package grammar;

import static org.junit.Assert.*;

import java.util.List;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.junit.Test;

public class ABCMusicBodyLexerTest {

	@Test
    //Multi-Note Test
    public void testMultiNoteLexer() {
    	verifyLexer("[abcd]", new String[] {"[abcd]"} );
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
