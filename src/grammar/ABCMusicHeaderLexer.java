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
		MODE_MINOR=12, EQUALS=13, OCTAVE=14, DIGIT=15, SPACE=16, LINE_FEED=17, 
		PERCENT=18, METER_VARIANTS=19, METER_FRACTION=20, TEXT=21, COLON=22, TEMPO=23, 
		COMMENT=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "'w:'", 
		"BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "'='", "OCTAVE", "DIGIT", "' '", 
		"LINE_FEED", "'%'", "METER_VARIANTS", "METER_FRACTION", "TEXT", "':'", 
		"TEMPO", "COMMENT"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "W", "BASE_NOTE", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "EQUALS", "OCTAVE", "DIGIT", "SPACE", "LINE_FEED", "PERCENT", 
		"METER_VARIANTS", "METER_FRACTION", "TEXT", "COLON", "TEMPO", "COMMENT"
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
		"\2\4\32\u0090\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17X\n\17\r\17\16\17Y\3\20\6\20"+
		"]\n\20\r\20\16\20^\3\21\3\21\3\22\3\22\3\22\5\22f\n\22\3\23\3\23\3\24"+
		"\3\24\3\24\5\24m\n\24\3\25\6\25p\n\25\r\25\16\25q\3\25\3\25\6\25v\n\25"+
		"\r\25\16\25w\3\26\6\26{\n\26\r\26\16\26|\3\27\3\27\3\30\3\30\3\30\6\30"+
		"\u0084\n\30\r\30\16\30\u0085\3\31\3\31\3\31\6\31\u008b\n\31\r\31\16\31"+
		"\u008c\3\31\3\31\2\32\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\3\2\n\4CIci\4%%dd\4))..\3"+
		"\62;\4\f\f\17\17\3\62;\3\62;\6\f\f\17\17\61\61<<\u0099\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3"+
		"\63\3\2\2\2\5\66\3\2\2\2\79\3\2\2\2\t<\3\2\2\2\13?\3\2\2\2\rB\3\2\2\2"+
		"\17E\3\2\2\2\21H\3\2\2\2\23K\3\2\2\2\25N\3\2\2\2\27P\3\2\2\2\31R\3\2\2"+
		"\2\33T\3\2\2\2\35W\3\2\2\2\37\\\3\2\2\2!`\3\2\2\2#e\3\2\2\2%g\3\2\2\2"+
		"\'l\3\2\2\2)o\3\2\2\2+z\3\2\2\2-~\3\2\2\2/\u0080\3\2\2\2\61\u0087\3\2"+
		"\2\2\63\64\7Z\2\2\64\65\7<\2\2\65\4\3\2\2\2\66\67\7V\2\2\678\7<\2\28\6"+
		"\3\2\2\29:\7E\2\2:;\7<\2\2;\b\3\2\2\2<=\7N\2\2=>\7<\2\2>\n\3\2\2\2?@\7"+
		"O\2\2@A\7<\2\2A\f\3\2\2\2BC\7S\2\2CD\7<\2\2D\16\3\2\2\2EF\7X\2\2FG\7<"+
		"\2\2G\20\3\2\2\2HI\7M\2\2IJ\7<\2\2J\22\3\2\2\2KL\7y\2\2LM\7<\2\2M\24\3"+
		"\2\2\2NO\t\2\2\2O\26\3\2\2\2PQ\t\3\2\2Q\30\3\2\2\2RS\7o\2\2S\32\3\2\2"+
		"\2TU\7?\2\2U\34\3\2\2\2VX\t\4\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z\36\3\2\2\2[]\t\5\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_"+
		" \3\2\2\2`a\7\"\2\2a\"\3\2\2\2bf\t\6\2\2cd\7\17\2\2df\7\f\2\2eb\3\2\2"+
		"\2ec\3\2\2\2f$\3\2\2\2gh\7\'\2\2h&\3\2\2\2im\7E\2\2jk\7E\2\2km\7~\2\2"+
		"li\3\2\2\2lj\3\2\2\2m(\3\2\2\2np\t\7\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2rs\3\2\2\2su\7\61\2\2tv\t\b\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2"+
		"\2wx\3\2\2\2x*\3\2\2\2y{\n\t\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2},\3\2\2\2~\177\7<\2\2\177.\3\2\2\2\u0080\u0081\5)\25\2\u0081\u0083"+
		"\5\33\16\2\u0082\u0084\5\37\20\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\60\3\2\2\2\u0087\u008a"+
		"\5%\23\2\u0088\u008b\5+\26\2\u0089\u008b\5-\27\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\5#\22\2\u008f\62\3\2\2\2\r\2Y^el"+
		"qw|\u0085\u008a\u008c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}