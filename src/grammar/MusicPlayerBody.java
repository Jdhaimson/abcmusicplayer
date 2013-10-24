package grammar;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import grammar.ABCMusicHeaderLexer;
import grammar.ABCMusicHeaderParser;

public class MusicPlayerBody {
   
    private void runListener(String input) {
        // Create a stream of tokens using the lexer.
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicBodyLexer lexer = new ABCMusicBodyLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);
        
        // Feed the tokens into the parser.
        ABCMusicBodyParser parser = new ABCMusicBodyParser(tokens);
        parser.reportErrorsAsExceptions();
        
        // Generate the parse tree using the starter rule.
        ParseTree tree;
        tree = parser.abc_tune_body(); // "abc_tune_header" is the starter rule.

        // debugging option #1: print the tree to the console
//      System.err.println(tree.toStringTree(parser));

      // debugging option #2: show the tree in a window
      ((RuleContext)tree).inspect(parser);

        // Walk the tree with the listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new BodyListener();
        walker.walk(listener, tree);
      
    }
    
    public static void main(String[] args) {
		MusicPlayerBody body = new MusicPlayerBody();
		String s = "gf|e2dc B2A2|B2G2 E2D2|G2G2 GABc|d4 B2gf|\n"+
				"w: Sa-ys my aul' wan to your aul' wan\n";
				
		body.runListener(s);
    }
    
}