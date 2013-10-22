// Generated from ABCMusicBody.g4 by ANTLR 4.0

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
public class ABCMusicBodyLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		W=1, V=2, FIELD_VOICE=3, ACCIDENTAL=4, BASE_NOTE=5, REST=6, BAR_LINE=7, 
		NTH_REPEAT=8, KEY_ACCIDENTAL=9, MODE_MINOR=10, NOTE_LENGTH_STRICT=11, 
		EQUALS=12, OCTAVE=13, OPEN_PAREN=14, OPEN_BRACK=15, CLOSED_BRACK=16, DIVIDE=17, 
		DIGIT=18, SPACE=19, LINE_FEED=20, PERCENT=21, LYRIC_TEXT=22, LYRIC_ELEMENTS=23, 
		METER_VARIANTS=24, METER_FRACTION=25, METER=26, NOTE=27, NOTE_OR_REST=28, 
		PITCH=29, NOTE_LENGTH=30, TEMPO=31, KEY=32, KEY_NOTE=33, COMMENT=34, EOL=35, 
		MULTI_NOTE=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'w:'", "'V:'", "FIELD_VOICE", "ACCIDENTAL", "BASE_NOTE", "'z'", "BAR_LINE", 
		"NTH_REPEAT", "KEY_ACCIDENTAL", "'m'", "NOTE_LENGTH_STRICT", "'='", "OCTAVE", 
		"'('", "'['", "']'", "'/'", "DIGIT", "' '", "LINE_FEED", "'%'", "LYRIC_TEXT", 
		"LYRIC_ELEMENTS", "METER_VARIANTS", "METER_FRACTION", "METER", "NOTE", 
		"NOTE_OR_REST", "PITCH", "NOTE_LENGTH", "TEMPO", "KEY", "KEY_NOTE", "COMMENT", 
		"EOL", "MULTI_NOTE"
	};
	public static final String[] ruleNames = {
		"W", "V", "FIELD_VOICE", "ACCIDENTAL", "BASE_NOTE", "REST", "BAR_LINE", 
		"NTH_REPEAT", "KEY_ACCIDENTAL", "MODE_MINOR", "NOTE_LENGTH_STRICT", "EQUALS", 
		"OCTAVE", "OPEN_PAREN", "OPEN_BRACK", "CLOSED_BRACK", "DIVIDE", "DIGIT", 
		"SPACE", "LINE_FEED", "PERCENT", "LYRIC_TEXT", "LYRIC_ELEMENTS", "METER_VARIANTS", 
		"METER_FRACTION", "METER", "NOTE", "NOTE_OR_REST", "PITCH", "NOTE_LENGTH", 
		"TEMPO", "KEY", "KEY_NOTE", "COMMENT", "EOL", "MULTI_NOTE"
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


	public ABCMusicBodyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ABCMusicBody.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4&\u011a\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\6\4T\n\4\r\4\16\4U\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5a\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\br\n\b\3\t\3\t\3\t\3\t\5\tx\n\t\3\n\3\n\3\13\3\13\3\f\6\f\177\n\f"+
		"\r\f\16\f\u0080\3\f\3\f\6\f\u0085\n\f\r\f\16\f\u0086\3\r\3\r\3\16\6\16"+
		"\u008c\n\16\r\16\16\16\u008d\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\6\23\u0099\n\23\r\23\16\23\u009a\3\24\3\24\3\25\5\25\u00a0\n\25\3"+
		"\25\3\25\5\25\u00a4\n\25\3\26\3\26\3\27\3\27\3\30\6\30\u00ab\n\30\r\30"+
		"\16\30\u00ac\3\30\3\30\3\30\3\30\5\30\u00b3\n\30\3\31\3\31\3\31\5\31\u00b8"+
		"\n\31\3\32\6\32\u00bb\n\32\r\32\16\32\u00bc\3\32\3\32\6\32\u00c1\n\32"+
		"\r\32\16\32\u00c2\3\33\3\33\5\33\u00c7\n\33\3\34\3\34\5\34\u00cb\n\34"+
		"\3\35\3\35\5\35\u00cf\n\35\3\36\5\36\u00d2\n\36\3\36\3\36\5\36\u00d6\n"+
		"\36\3\37\6\37\u00d9\n\37\r\37\16\37\u00da\3\37\3\37\6\37\u00df\n\37\r"+
		"\37\16\37\u00e0\3\37\3\37\6\37\u00e5\n\37\r\37\16\37\u00e6\3\37\6\37\u00ea"+
		"\n\37\r\37\16\37\u00eb\3\37\3\37\3\37\6\37\u00f1\n\37\r\37\16\37\u00f2"+
		"\3\37\5\37\u00f6\n\37\3 \3 \3 \6 \u00fb\n \r \16 \u00fc\3!\3!\5!\u0101"+
		"\n!\3\"\3\"\5\"\u0105\n\"\3#\3#\6#\u0109\n#\r#\16#\u010a\3#\3#\3$\3$\5"+
		"$\u0111\n$\3%\3%\6%\u0115\n%\r%\16%\u0116\3%\3%\2&\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32"+
		"\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1\3"+
		"\2\n\4\f\f\17\17\4CIci\4%%dd\4))..\3\62;\4C\\c|\6,,//aa\u0080\u0080\4"+
		"\f\f\17\17\u0145\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5N\3\2\2\2\7Q\3\2\2\2\t`\3\2"+
		"\2\2\13b\3\2\2\2\rd\3\2\2\2\17q\3\2\2\2\21w\3\2\2\2\23y\3\2\2\2\25{\3"+
		"\2\2\2\27~\3\2\2\2\31\u0088\3\2\2\2\33\u008b\3\2\2\2\35\u008f\3\2\2\2"+
		"\37\u0091\3\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2%\u0098\3\2\2\2\'\u009c"+
		"\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7\3\2\2\2/\u00b2\3\2\2\2\61"+
		"\u00b7\3\2\2\2\63\u00ba\3\2\2\2\65\u00c6\3\2\2\2\67\u00c8\3\2\2\29\u00ce"+
		"\3\2\2\2;\u00d1\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2\2\2A\u00fe\3\2\2\2C"+
		"\u0102\3\2\2\2E\u0106\3\2\2\2G\u0110\3\2\2\2I\u0112\3\2\2\2KL\7y\2\2L"+
		"M\7<\2\2M\4\3\2\2\2NO\7X\2\2OP\7<\2\2P\6\3\2\2\2QS\5\5\3\2RT\n\2\2\2S"+
		"R\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\5G$\2X\b\3\2\2\2Y"+
		"a\7`\2\2Z[\7`\2\2[a\7`\2\2\\a\7a\2\2]^\7a\2\2^a\7a\2\2_a\7?\2\2`Y\3\2"+
		"\2\2`Z\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`_\3\2\2\2a\n\3\2\2\2bc\t\3\2\2c\f"+
		"\3\2\2\2de\7|\2\2e\16\3\2\2\2fr\7~\2\2gh\7~\2\2hr\7~\2\2ij\7]\2\2jr\7"+
		"~\2\2kl\7~\2\2lr\7_\2\2mn\7<\2\2nr\7~\2\2op\7~\2\2pr\7<\2\2qf\3\2\2\2"+
		"qg\3\2\2\2qi\3\2\2\2qk\3\2\2\2qm\3\2\2\2qo\3\2\2\2r\20\3\2\2\2st\7]\2"+
		"\2tx\7\63\2\2uv\7]\2\2vx\7\64\2\2ws\3\2\2\2wu\3\2\2\2x\22\3\2\2\2yz\t"+
		"\4\2\2z\24\3\2\2\2{|\7o\2\2|\26\3\2\2\2}\177\5%\23\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\5#\22\2\u0083\u0085\5%\23\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\30\3\2\2\2\u0088\u0089"+
		"\7?\2\2\u0089\32\3\2\2\2\u008a\u008c\t\5\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\34\3\2\2"+
		"\2\u008f\u0090\7*\2\2\u0090\36\3\2\2\2\u0091\u0092\7]\2\2\u0092 \3\2\2"+
		"\2\u0093\u0094\7_\2\2\u0094\"\3\2\2\2\u0095\u0096\7\61\2\2\u0096$\3\2"+
		"\2\2\u0097\u0099\t\6\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b&\3\2\2\2\u009c\u009d\7\"\2\2"+
		"\u009d(\3\2\2\2\u009e\u00a0\7\17\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a4\7\f\2\2\u00a2\u00a4\7\17\2\2\u00a3"+
		"\u009f\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4*\3\2\2\2\u00a5\u00a6\7\'\2\2"+
		"\u00a6,\3\2\2\2\u00a7\u00a8\t\7\2\2\u00a8.\3\2\2\2\u00a9\u00ab\7\"\2\2"+
		"\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00b3\t\b\2\2\u00af\u00b0\7^\2\2\u00b0"+
		"\u00b3\7/\2\2\u00b1\u00b3\7~\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ae\3\2\2"+
		"\2\u00b2\u00af\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\60\3\2\2\2\u00b4\u00b8"+
		"\7E\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b8\7~\2\2\u00b7\u00b4\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\62\3\2\2\2\u00b9\u00bb\5%\23\2\u00ba\u00b9\3\2\2"+
		"\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c0\5#\22\2\u00bf\u00c1\5%\23\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\64\3\2\2"+
		"\2\u00c4\u00c7\5\61\31\2\u00c5\u00c7\5\63\32\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\66\3\2\2\2\u00c8\u00ca\59\35\2\u00c9\u00cb\5=\37"+
		"\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb8\3\2\2\2\u00cc\u00cf"+
		"\5;\36\2\u00cd\u00cf\5\r\7\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		":\3\2\2\2\u00d0\u00d2\5\t\5\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d3\3\2\2\2\u00d3\u00d5\5\13\6\2\u00d4\u00d6\5\33\16\2\u00d5"+
		"\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6<\3\2\2\2\u00d7\u00d9\5%\23\2"+
		"\u00d8\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\5#\22\2\u00dd\u00df\5%\23\2\u00de"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00f6\3\2\2\2\u00e2\u00e4\5#\22\2\u00e3\u00e5\5%\23\2\u00e4"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00f6\3\2\2\2\u00e8\u00ea\5%\23\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\5#\22\2\u00ee\u00f6\3\2\2\2\u00ef\u00f1\5%\23\2\u00f0"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f6\5#\22\2\u00f5\u00d8\3\2\2\2\u00f5"+
		"\u00e2\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f4\3\2"+
		"\2\2\u00f6>\3\2\2\2\u00f7\u00f8\5\63\32\2\u00f8\u00fa\5\31\r\2\u00f9\u00fb"+
		"\5%\23\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd@\3\2\2\2\u00fe\u0100\5C\"\2\u00ff\u0101\5\25\13\2"+
		"\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101B\3\2\2\2\u0102\u0104\5"+
		"\13\6\2\u0103\u0105\5\23\n\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"D\3\2\2\2\u0106\u0108\5+\26\2\u0107\u0109\n\t\2\2\u0108\u0107\3\2\2\2"+
		"\u0109\u010a\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010d\5)\25\2\u010dF\3\2\2\2\u010e\u0111\5E#\2\u010f\u0111"+
		"\5)\25\2\u0110\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111H\3\2\2\2\u0112"+
		"\u0114\5\37\20\2\u0113\u0115\5\67\34\2\u0114\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u0119\5!\21\2\u0119J\3\2\2\2#\2U`qw\u0080\u0086\u008d\u009a\u009f\u00a3"+
		"\u00ac\u00b2\u00b7\u00bc\u00c2\u00c6\u00ca\u00ce\u00d1\u00d5\u00da\u00e0"+
		"\u00e6\u00eb\u00f2\u00f5\u00fc\u0100\u0104\u010a\u0110\u0116";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}