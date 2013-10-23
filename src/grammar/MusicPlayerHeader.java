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

public class MusicPlayerHeader {
   
    private void runListener(String input) {
        // Create a stream of tokens using the lexer.
        CharStream stream = new ANTLRInputStream(input);
        ABCMusicHeaderLexer lexer = new ABCMusicHeaderLexer(stream);
        lexer.reportErrorsAsExceptions();
        TokenStream tokens = new CommonTokenStream(lexer);
        
        // Feed the tokens into the parser.
        ABCMusicHeaderParser parser = new ABCMusicHeaderParser(tokens);
        parser.reportErrorsAsExceptions();
        
        // Generate the parse tree using the starter rule.
        ParseTree tree;
        tree = parser.abc_tune_header(); // "abc_tune_header" is the starter rule.

        // debugging option #1: print the tree to the console
//      System.err.println(tree.toStringTree(parser));

      // debugging option #2: show the tree in a window
      ((RuleContext)tree).inspect(parser);

        // Walk the tree with the listener.
        ParseTreeWalker walker = new ParseTreeWalker();
        ParseTreeListener listener = new HeaderListener();
        walker.walk(listener, tree);
      
    }
    
    public static void main(String[] args) {
		MusicPlayerHeader header = new MusicPlayerHeader();
		String s = "X:2167\n"+
				"T:Waxie's Dargle\n"+
				"M:4/4\n"+
				"L:1/8\n"+
				"Q:1/4=180\n"+
				"K:G\n";
		header.runListener(s);
    }
    
}