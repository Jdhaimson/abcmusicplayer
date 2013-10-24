// Generated from ABCMusicHeader.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicHeaderLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		X=1, T=2, C=3, L=4, M=5, Q=6, V=7, K=8, W=9, BASE_NOTE=10, KEY_ACCIDENTAL=11, 
		MODE_MINOR=12, EQUALS=13, OCTAVE=14, DIGIT=15, LINE_FEED=16, PERCENT=17, 
		METER_VARIANTS=18, METER_FRACTION=19, TEXT=20, COLON=21, TEMPO=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "'w:'", 
		"BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "'='", "OCTAVE", "DIGIT", "LINE_FEED", 
		"'%'", "METER_VARIANTS", "METER_FRACTION", "TEXT", "':'", "TEMPO"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "W", "BASE_NOTE", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "EQUALS", "OCTAVE", "DIGIT", "LINE_FEED", "PERCENT", "METER_VARIANTS", 
		"METER_FRACTION", "TEXT", "COLON", "TEMPO"
	};


	    // This method makes the lexer or parser stop running if it encounters
	    // invalid input and throw a RuntimeException.
	    public void reportErrorsAsExceptions() {
	        removeErrorListeners();
	        addErrorListener(new ExceptionThrowingErrorListener());
	    }

	    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
	        @Override
	        public void syntaxError(Recognizer<?, ?> recognizer,
	                Object offendingSymbol, int line, int charPositionInLine,
	                String msg, RecognitionException e) {
	            throw new RuntimeException(msg);
	        }
	    }


	public ABCMusicHeaderLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusicHeader.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\30\u0081\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\6\17T\n\17\r\17\16\17U\3\20\6\20Y\n\20\r\20\16\20Z\3\21"+
		"\3\21\3\21\5\21`\n\21\3\22\3\22\3\23\3\23\3\23\5\23g\n\23\3\24\6\24j\n"+
		"\24\r\24\16\24k\3\24\3\24\6\24p\n\24\r\24\16\24q\3\25\6\25u\n\25\r\25"+
		"\16\25v\3\26\3\26\3\27\3\27\3\27\6\27~\n\27\r\27\16\27\177\2\30\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31"+
		"\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30"+
		"\1\3\2\n\4CIci\4%%dd\4))..\3\62;\4\f\f\17\17\3\62;\3\62;\7\f\f\17\17\'"+
		"\'\61\61<<\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\65\3\2\2\2\t8\3\2\2\2\13;\3\2\2\2\r>"+
		"\3\2\2\2\17A\3\2\2\2\21D\3\2\2\2\23G\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31"+
		"N\3\2\2\2\33P\3\2\2\2\35S\3\2\2\2\37X\3\2\2\2!_\3\2\2\2#a\3\2\2\2%f\3"+
		"\2\2\2\'i\3\2\2\2)t\3\2\2\2+x\3\2\2\2-z\3\2\2\2/\60\7Z\2\2\60\61\7<\2"+
		"\2\61\4\3\2\2\2\62\63\7V\2\2\63\64\7<\2\2\64\6\3\2\2\2\65\66\7E\2\2\66"+
		"\67\7<\2\2\67\b\3\2\2\289\7N\2\29:\7<\2\2:\n\3\2\2\2;<\7O\2\2<=\7<\2\2"+
		"=\f\3\2\2\2>?\7S\2\2?@\7<\2\2@\16\3\2\2\2AB\7X\2\2BC\7<\2\2C\20\3\2\2"+
		"\2DE\7M\2\2EF\7<\2\2F\22\3\2\2\2GH\7y\2\2HI\7<\2\2I\24\3\2\2\2JK\t\2\2"+
		"\2K\26\3\2\2\2LM\t\3\2\2M\30\3\2\2\2NO\7o\2\2O\32\3\2\2\2PQ\7?\2\2Q\34"+
		"\3\2\2\2RT\t\4\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\36\3\2\2\2"+
		"WY\t\5\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[ \3\2\2\2\\`\t\6\2"+
		"\2]^\7\17\2\2^`\7\f\2\2_\\\3\2\2\2_]\3\2\2\2`\"\3\2\2\2ab\7\'\2\2b$\3"+
		"\2\2\2cg\7E\2\2de\7E\2\2eg\7~\2\2fc\3\2\2\2fd\3\2\2\2g&\3\2\2\2hj\t\7"+
		"\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mo\7\61\2\2np\t"+
		"\b\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r(\3\2\2\2su\n\t\2\2ts\3"+
		"\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w*\3\2\2\2xy\7<\2\2y,\3\2\2\2z{\5"+
		"\'\24\2{}\5\33\16\2|~\5\37\20\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080.\3\2\2\2\13\2UZ_fkqv\177";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}