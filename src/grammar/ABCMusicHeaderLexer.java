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
		MODE_MINOR=12, NOTE_LENGTH_STRICT=13, EQUALS=14, OCTAVE=15, DIVIDE=16, 
		DIGIT=17, SPACE=18, LINE_FEED=19, PERCENT=20, TEXT=21, COLON=22, METER_VARIANTS=23, 
		METER_FRACTION=24, METER=25, TEMPO=26, KEY=27, KEY_NOTE=28, COMMENT=29, 
		EOL=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "'w:'", 
		"BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "NOTE_LENGTH_STRICT", "'='", "OCTAVE", 
		"'/'", "DIGIT", "' '", "LINE_FEED", "'%'", "TEXT", "':'", "METER_VARIANTS", 
		"METER_FRACTION", "METER", "TEMPO", "KEY", "KEY_NOTE", "COMMENT", "EOL"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "W", "BASE_NOTE", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "NOTE_LENGTH_STRICT", "EQUALS", "OCTAVE", "DIVIDE", "DIGIT", 
		"SPACE", "LINE_FEED", "PERCENT", "TEXT", "COLON", "METER_VARIANTS", "METER_FRACTION", 
		"METER", "TEMPO", "KEY", "KEY_NOTE", "COMMENT", "EOL"
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
		"\2\4 \u00bb\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\6\16b\n\16\r\16\16\16c\3\16\3\16\6\16h\n\16\r\16\16\16"+
		"i\3\17\3\17\3\20\6\20o\n\20\r\20\16\20p\3\21\3\21\3\22\6\22v\n\22\r\22"+
		"\16\22w\3\23\3\23\3\24\5\24}\n\24\3\24\3\24\5\24\u0081\n\24\3\25\3\25"+
		"\3\26\6\26\u0086\n\26\r\26\16\26\u0087\3\27\3\27\3\30\3\30\3\30\5\30\u008f"+
		"\n\30\3\31\6\31\u0092\n\31\r\31\16\31\u0093\3\31\3\31\6\31\u0098\n\31"+
		"\r\31\16\31\u0099\3\32\3\32\5\32\u009e\n\32\3\33\3\33\3\33\6\33\u00a3"+
		"\n\33\r\33\16\33\u00a4\3\34\3\34\5\34\u00a9\n\34\3\35\3\35\5\35\u00ad"+
		"\n\35\3\36\3\36\3\36\6\36\u00b2\n\36\r\36\16\36\u00b3\3\36\3\36\3\37\3"+
		"\37\5\37\u00ba\n\37\2 \3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21"+
		"\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1"+
		"%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\1"+
		"9\36\1;\37\1= \1\3\2\7\4CIci\4%%dd\4))..\3\62;\5\f\f\17\17<<\u00cb\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7E\3\2\2\2\tH\3\2\2\2\13K\3\2\2\2"+
		"\rN\3\2\2\2\17Q\3\2\2\2\21T\3\2\2\2\23W\3\2\2\2\25Z\3\2\2\2\27\\\3\2\2"+
		"\2\31^\3\2\2\2\33a\3\2\2\2\35k\3\2\2\2\37n\3\2\2\2!r\3\2\2\2#u\3\2\2\2"+
		"%y\3\2\2\2\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0085\3\2\2\2-\u0089\3\2\2"+
		"\2/\u008e\3\2\2\2\61\u0091\3\2\2\2\63\u009d\3\2\2\2\65\u009f\3\2\2\2\67"+
		"\u00a6\3\2\2\29\u00aa\3\2\2\2;\u00ae\3\2\2\2=\u00b9\3\2\2\2?@\7Z\2\2@"+
		"A\7<\2\2A\4\3\2\2\2BC\7V\2\2CD\7<\2\2D\6\3\2\2\2EF\7E\2\2FG\7<\2\2G\b"+
		"\3\2\2\2HI\7N\2\2IJ\7<\2\2J\n\3\2\2\2KL\7O\2\2LM\7<\2\2M\f\3\2\2\2NO\7"+
		"S\2\2OP\7<\2\2P\16\3\2\2\2QR\7X\2\2RS\7<\2\2S\20\3\2\2\2TU\7M\2\2UV\7"+
		"<\2\2V\22\3\2\2\2WX\7y\2\2XY\7<\2\2Y\24\3\2\2\2Z[\t\2\2\2[\26\3\2\2\2"+
		"\\]\t\3\2\2]\30\3\2\2\2^_\7o\2\2_\32\3\2\2\2`b\5#\22\2a`\3\2\2\2bc\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\5!\21\2fh\5#\22\2gf\3\2\2\2hi\3\2"+
		"\2\2ig\3\2\2\2ij\3\2\2\2j\34\3\2\2\2kl\7?\2\2l\36\3\2\2\2mo\t\4\2\2nm"+
		"\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q \3\2\2\2rs\7\61\2\2s\"\3\2\2\2"+
		"tv\t\5\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x$\3\2\2\2yz\7\"\2\2"+
		"z&\3\2\2\2{}\7\17\2\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0081\7\f\2\2\177"+
		"\u0081\7\17\2\2\u0080|\3\2\2\2\u0080\177\3\2\2\2\u0081(\3\2\2\2\u0082"+
		"\u0083\7\'\2\2\u0083*\3\2\2\2\u0084\u0086\n\6\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088,\3"+
		"\2\2\2\u0089\u008a\7<\2\2\u008a.\3\2\2\2\u008b\u008f\7E\2\2\u008c\u008d"+
		"\7E\2\2\u008d\u008f\7~\2\2\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008f"+
		"\60\3\2\2\2\u0090\u0092\5#\22\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\5!\21\2\u0096\u0098\5#\22\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\62\3\2\2\2\u009b\u009e\5/\30"+
		"\2\u009c\u009e\5\61\31\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\64\3\2\2\2\u009f\u00a0\5\61\31\2\u00a0\u00a2\5\35\17\2\u00a1\u00a3\5"+
		"#\22\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\66\3\2\2\2\u00a6\u00a8\59\35\2\u00a7\u00a9\5\31\r"+
		"\2\u00a8\u00a7\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a98\3\2\2\2\u00aa\u00ac"+
		"\5\25\13\2\u00ab\u00ad\5\27\f\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2"+
		"\2\u00ad:\3\2\2\2\u00ae\u00b1\5)\25\2\u00af\u00b2\5+\26\2\u00b0\u00b2"+
		"\5-\27\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5\'"+
		"\24\2\u00b6<\3\2\2\2\u00b7\u00ba\5;\36\2\u00b8\u00ba\5\'\24\2\u00b9\u00b7"+
		"\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba>\3\2\2\2\24\2cipw|\u0080\u0087\u008e"+
		"\u0093\u0099\u009d\u00a4\u00a8\u00ac\u00b1\u00b3\u00b9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}