// Generated from ABCMusic.g4 by ANTLR 4.0

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
public class ABCMusicLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		X=1, T=2, C=3, L=4, M=5, Q=6, V=7, K=8, W=9, ACCIDENTAL=10, BASE_NOTE=11, 
		REST=12, BAR_LINE=13, NTH_REPEAT=14, KEY_ACCIDENTAL=15, MODE_MINOR=16, 
		EQUALS=17, OCTAVE=18, OPEN_PAREN=19, OPEN_BRACK=20, CLOSED_BRACK=21, DIVIDE=22, 
		DIGIT=23, SPACE=24, LINE_FEED=25, PERCENT=26, TEXT=27, LYRIC_ELEMENTS=28, 
		METER_VARIANTS=29, METER_FRACTION=30, METER=31, TEMPO=32, KEY=33, KEY_NOTE=34, 
		COMMENT=35, EOL=36, NOTE_LENGTH_STRICT=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "'w:'", 
		"ACCIDENTAL", "BASE_NOTE", "'z'", "BAR_LINE", "NTH_REPEAT", "KEY_ACCIDENTAL", 
		"'m'", "'='", "OCTAVE", "'('", "'['", "']'", "'/'", "DIGIT", "' '", "LINE_FEED", 
		"'%'", "TEXT", "LYRIC_ELEMENTS", "METER_VARIANTS", "METER_FRACTION", "METER", 
		"TEMPO", "KEY", "KEY_NOTE", "COMMENT", "EOL", "NOTE_LENGTH_STRICT"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "W", "ACCIDENTAL", "BASE_NOTE", 
		"REST", "BAR_LINE", "NTH_REPEAT", "KEY_ACCIDENTAL", "MODE_MINOR", "EQUALS", 
		"OCTAVE", "OPEN_PAREN", "OPEN_BRACK", "CLOSED_BRACK", "DIVIDE", "DIGIT", 
		"SPACE", "LINE_FEED", "PERCENT", "TEXT", "LYRIC_ELEMENTS", "METER_VARIANTS", 
		"METER_FRACTION", "METER", "TEMPO", "KEY", "KEY_NOTE", "COMMENT", "EOL", 
		"NOTE_LENGTH_STRICT"
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


	public ABCMusicLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\'\u00f1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13p"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0081\n\16\3\17\3\17\3\17\3\17\5\17\u0087\n\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\6\23\u0090\n\23\r\23\16\23\u0091\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\6\30\u009d\n\30\r\30\16\30\u009e\3\31\3"+
		"\31\3\32\5\32\u00a4\n\32\3\32\3\32\5\32\u00a8\n\32\3\33\3\33\3\34\6\34"+
		"\u00ad\n\34\r\34\16\34\u00ae\3\35\6\35\u00b2\n\35\r\35\16\35\u00b3\3\35"+
		"\3\35\3\35\3\35\5\35\u00ba\n\35\3\36\3\36\3\36\5\36\u00bf\n\36\3\37\6"+
		"\37\u00c2\n\37\r\37\16\37\u00c3\3\37\3\37\6\37\u00c8\n\37\r\37\16\37\u00c9"+
		"\3 \3 \5 \u00ce\n \3!\3!\3!\6!\u00d3\n!\r!\16!\u00d4\3\"\3\"\5\"\u00d9"+
		"\n\"\3#\3#\5#\u00dd\n#\3$\3$\3$\3$\3%\3%\5%\u00e5\n%\3&\6&\u00e8\n&\r"+
		"&\16&\u00e9\3&\3&\6&\u00ee\n&\r&\16&\u00ef\2\'\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63"+
		"\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1\3"+
		"\2\b\4CIci\4%%dd\4))..\3\62;\5\f\f\17\17<<\6,,//aa\u0080\u0080\u010d\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5P\3\2\2\2\7S\3\2\2\2\tV\3\2\2\2\13"+
		"Y\3\2\2\2\r\\\3\2\2\2\17_\3\2\2\2\21b\3\2\2\2\23e\3\2\2\2\25o\3\2\2\2"+
		"\27q\3\2\2\2\31s\3\2\2\2\33\u0080\3\2\2\2\35\u0086\3\2\2\2\37\u0088\3"+
		"\2\2\2!\u008a\3\2\2\2#\u008c\3\2\2\2%\u008f\3\2\2\2\'\u0093\3\2\2\2)\u0095"+
		"\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61\u00a0\3\2\2\2"+
		"\63\u00a7\3\2\2\2\65\u00a9\3\2\2\2\67\u00ac\3\2\2\29\u00b9\3\2\2\2;\u00be"+
		"\3\2\2\2=\u00c1\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C\u00d6\3\2\2\2E"+
		"\u00da\3\2\2\2G\u00de\3\2\2\2I\u00e4\3\2\2\2K\u00e7\3\2\2\2MN\7Z\2\2N"+
		"O\7<\2\2O\4\3\2\2\2PQ\7V\2\2QR\7<\2\2R\6\3\2\2\2ST\7E\2\2TU\7<\2\2U\b"+
		"\3\2\2\2VW\7N\2\2WX\7<\2\2X\n\3\2\2\2YZ\7O\2\2Z[\7<\2\2[\f\3\2\2\2\\]"+
		"\7S\2\2]^\7<\2\2^\16\3\2\2\2_`\7X\2\2`a\7<\2\2a\20\3\2\2\2bc\7M\2\2cd"+
		"\7<\2\2d\22\3\2\2\2ef\7y\2\2fg\7<\2\2g\24\3\2\2\2hp\7`\2\2ij\7`\2\2jp"+
		"\7`\2\2kp\7a\2\2lm\7a\2\2mp\7a\2\2np\7?\2\2oh\3\2\2\2oi\3\2\2\2ok\3\2"+
		"\2\2ol\3\2\2\2on\3\2\2\2p\26\3\2\2\2qr\t\2\2\2r\30\3\2\2\2st\7|\2\2t\32"+
		"\3\2\2\2u\u0081\7~\2\2vw\7~\2\2w\u0081\7~\2\2xy\7]\2\2y\u0081\7~\2\2z"+
		"{\7~\2\2{\u0081\7_\2\2|}\7<\2\2}\u0081\7~\2\2~\177\7~\2\2\177\u0081\7"+
		"<\2\2\u0080u\3\2\2\2\u0080v\3\2\2\2\u0080x\3\2\2\2\u0080z\3\2\2\2\u0080"+
		"|\3\2\2\2\u0080~\3\2\2\2\u0081\34\3\2\2\2\u0082\u0083\7]\2\2\u0083\u0087"+
		"\7\63\2\2\u0084\u0085\7]\2\2\u0085\u0087\7\64\2\2\u0086\u0082\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0087\36\3\2\2\2\u0088\u0089\t\3\2\2\u0089 \3\2\2"+
		"\2\u008a\u008b\7o\2\2\u008b\"\3\2\2\2\u008c\u008d\7?\2\2\u008d$\3\2\2"+
		"\2\u008e\u0090\t\4\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092&\3\2\2\2\u0093\u0094\7*\2\2\u0094("+
		"\3\2\2\2\u0095\u0096\7]\2\2\u0096*\3\2\2\2\u0097\u0098\7_\2\2\u0098,\3"+
		"\2\2\2\u0099\u009a\7\61\2\2\u009a.\3\2\2\2\u009b\u009d\t\5\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\60\3\2\2\2\u00a0\u00a1\7\"\2\2\u00a1\62\3\2\2\2\u00a2\u00a4\7\17\2\2"+
		"\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8"+
		"\7\f\2\2\u00a6\u00a8\7\17\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a6\3\2\2\2"+
		"\u00a8\64\3\2\2\2\u00a9\u00aa\7\'\2\2\u00aa\66\3\2\2\2\u00ab\u00ad\n\6"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af8\3\2\2\2\u00b0\u00b2\7\"\2\2\u00b1\u00b0\3\2\2\2"+
		"\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00ba"+
		"\3\2\2\2\u00b5\u00ba\t\7\2\2\u00b6\u00b7\7^\2\2\u00b7\u00ba\7/\2\2\u00b8"+
		"\u00ba\7~\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2"+
		"\2\2\u00b9\u00b8\3\2\2\2\u00ba:\3\2\2\2\u00bb\u00bf\7E\2\2\u00bc\u00bd"+
		"\7E\2\2\u00bd\u00bf\7~\2\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf"+
		"<\3\2\2\2\u00c0\u00c2\5/\30\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7"+
		"\5-\27\2\u00c6\u00c8\5/\30\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca>\3\2\2\2\u00cb\u00ce\5;\36\2"+
		"\u00cc\u00ce\5=\37\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce@\3"+
		"\2\2\2\u00cf\u00d0\5=\37\2\u00d0\u00d2\5#\22\2\u00d1\u00d3\5/\30\2\u00d2"+
		"\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5B\3\2\2\2\u00d6\u00d8\5E#\2\u00d7\u00d9\5!\21\2\u00d8\u00d7"+
		"\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9D\3\2\2\2\u00da\u00dc\5\27\f\2\u00db"+
		"\u00dd\5\37\20\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00ddF\3\2\2"+
		"\2\u00de\u00df\5\65\33\2\u00df\u00e0\5\67\34\2\u00e0\u00e1\5\63\32\2\u00e1"+
		"H\3\2\2\2\u00e2\u00e5\5G$\2\u00e3\u00e5\5\63\32\2\u00e4\u00e2\3\2\2\2"+
		"\u00e4\u00e3\3\2\2\2\u00e5J\3\2\2\2\u00e6\u00e8\5/\30\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ed\5-\27\2\u00ec\u00ee\5/\30\2\u00ed\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"L\3\2\2\2\27\2o\u0080\u0086\u0091\u009e\u00a3\u00a7\u00ae\u00b3\u00b9"+
		"\u00be\u00c3\u00c9\u00cd\u00d4\u00d8\u00dc\u00e4\u00e9\u00ef";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}