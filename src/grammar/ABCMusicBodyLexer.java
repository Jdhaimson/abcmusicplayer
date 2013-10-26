// Generated from ABCMusicBodyLexer.g4 by ANTLR 4.0

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
		W=1, V=2, ACCIDENTAL=3, REST=4, BAR_LINE=5, NTH_REPEAT=6, KEY_ACCIDENTAL=7, 
		MODE_MINOR=8, NOTE_LENGTH_STRICT=9, OCTAVE=10, OPEN_PAREN=11, OPEN_BRACK=12, 
		CLOSED_BRACK=13, DIVIDE=14, DIGIT=15, SPACE=16, LINE_FEED=17, PERCENT=18, 
		METER_VARIANTS=19, METER_FRACTION=20, BASE_NOTE=21, TEMPO=22, COMMENT_TEXT=23, 
		END_LYRIC=24, LYRIC_TEXT=25, LYRICAL_ELEMENTS=26, VOICE_TEXT=27;
	public static final int enter_comment = 1;
	public static final int enter_lyrics = 2;
	public static final int enter_voice = 3;
	public static String[] modeNames = {
		"DEFAULT_MODE", "enter_comment", "enter_lyrics", "enter_voice"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'w:'", "'V:'", "ACCIDENTAL", "'z'", "BAR_LINE", "NTH_REPEAT", "KEY_ACCIDENTAL", 
		"'m'", "NOTE_LENGTH_STRICT", "OCTAVE", "'('", "'['", "']'", "'/'", "DIGIT", 
		"' '", "LINE_FEED", "'%'", "METER_VARIANTS", "METER_FRACTION", "BASE_NOTE", 
		"TEMPO", "COMMENT_TEXT", "END_LYRIC", "LYRIC_TEXT", "LYRICAL_ELEMENTS", 
		"VOICE_TEXT"
	};
	public static final String[] ruleNames = {
		"W", "V", "ACCIDENTAL", "REST", "BAR_LINE", "NTH_REPEAT", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "NOTE_LENGTH_STRICT", "OCTAVE", "OPEN_PAREN", "OPEN_BRACK", 
		"CLOSED_BRACK", "DIVIDE", "DIGIT", "SPACE", "LINE_FEED", "PERCENT", "METER_VARIANTS", 
		"METER_FRACTION", "BASE_NOTE", "TEMPO", "COMMENT_TEXT", "END_LYRIC", "LYRIC_TEXT", 
		"LYRICAL_ELEMENTS", "VOICE_TEXT"
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
	public String getGrammarFileName() { return "ABCMusicBodyLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0: W_action((RuleContext)_localctx, actionIndex); break;

		case 1: V_action((RuleContext)_localctx, actionIndex); break;

		case 17: PERCENT_action((RuleContext)_localctx, actionIndex); break;

		case 22: COMMENT_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 23: END_LYRIC_action((RuleContext)_localctx, actionIndex); break;

		case 26: VOICE_TEXT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void VOICE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: popMode();  break;
		}
	}
	private void W_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: pushMode(enter_lyrics);  break;
		}
	}
	private void V_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: pushMode(enter_voice);  break;
		}
	}
	private void COMMENT_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: popMode();  break;
		}
	}
	private void PERCENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: pushMode(enter_comment);  break;
		}
	}
	private void END_LYRIC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: popMode();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\35\u00cb\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6"+
		"\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4"+
		"\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4"+
		"\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"N\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7"+
		"\3\7\3\7\3\7\5\7c\n\7\3\b\3\b\3\t\3\t\3\n\6\nj\n\n\r\n\16\nk\3\n\3\n\6"+
		"\np\n\n\r\n\16\nq\3\13\6\13u\n\13\r\13\16\13v\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\5\22\u0088\n\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\5\24\u0091\n\24\3\25\6\25\u0094\n\25\r\25\16"+
		"\25\u0095\3\25\3\25\6\25\u009a\n\25\r\25\16\25\u009b\3\26\3\26\3\27\3"+
		"\27\3\27\6\27\u00a3\n\27\r\27\16\27\u00a4\3\30\6\30\u00a8\n\30\r\30\16"+
		"\30\u00a9\3\30\3\30\3\31\3\31\3\31\5\31\u00b1\n\31\3\31\3\31\3\32\6\32"+
		"\u00b6\n\32\r\32\16\32\u00b7\3\33\6\33\u00bb\n\33\r\33\16\33\u00bc\3\33"+
		"\3\33\3\33\3\33\5\33\u00c3\n\33\3\34\6\34\u00c6\n\34\r\34\16\34\u00c7"+
		"\3\34\3\34\2\35\6\3\2\b\4\3\n\5\1\f\6\1\16\7\1\20\b\1\22\t\1\24\n\1\26"+
		"\13\1\30\f\1\32\r\1\34\16\1\36\17\1 \20\1\"\21\1$\22\1&\23\1(\24\4*\25"+
		"\1,\26\1.\27\1\60\30\1\62\31\5\64\32\6\66\33\18\34\1:\35\7\6\2\3\4\5\f"+
		"\4%%dd\4))..\3\62;\4\f\f\17\17\4CIci\4\f\f\17\17\4\f\f\17\17\4\f\f\17"+
		"\17\6,,//aa\u0080\u0080\4\f\f\17\17\u00e1\2\6\3\2\2\2\2\b\3\2\2\2\2\n"+
		"\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2"+
		"\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2"+
		" \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3"+
		"\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\3\62\3\2\2\2\4\64\3\2\2\2\4\66\3\2\2\2"+
		"\48\3\2\2\2\5:\3\2\2\2\6<\3\2\2\2\bA\3\2\2\2\nM\3\2\2\2\fO\3\2\2\2\16"+
		"\\\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24f\3\2\2\2\26i\3\2\2\2\30t\3\2\2\2"+
		"\32x\3\2\2\2\34z\3\2\2\2\36|\3\2\2\2 ~\3\2\2\2\"\u0080\3\2\2\2$\u0082"+
		"\3\2\2\2&\u0087\3\2\2\2(\u0089\3\2\2\2*\u0090\3\2\2\2,\u0093\3\2\2\2."+
		"\u009d\3\2\2\2\60\u009f\3\2\2\2\62\u00a7\3\2\2\2\64\u00b0\3\2\2\2\66\u00b5"+
		"\3\2\2\28\u00c2\3\2\2\2:\u00c5\3\2\2\2<=\7y\2\2=>\7<\2\2>?\3\2\2\2?@\b"+
		"\2\2\2@\7\3\2\2\2AB\7X\2\2BC\7<\2\2CD\3\2\2\2DE\b\3\3\2E\t\3\2\2\2FN\7"+
		"`\2\2GH\7`\2\2HN\7`\2\2IN\7a\2\2JK\7a\2\2KN\7a\2\2LN\7?\2\2MF\3\2\2\2"+
		"MG\3\2\2\2MI\3\2\2\2MJ\3\2\2\2ML\3\2\2\2N\13\3\2\2\2OP\7|\2\2P\r\3\2\2"+
		"\2Q]\7~\2\2RS\7~\2\2S]\7~\2\2TU\7]\2\2U]\7~\2\2VW\7~\2\2W]\7_\2\2XY\7"+
		"<\2\2Y]\7~\2\2Z[\7~\2\2[]\7<\2\2\\Q\3\2\2\2\\R\3\2\2\2\\T\3\2\2\2\\V\3"+
		"\2\2\2\\X\3\2\2\2\\Z\3\2\2\2]\17\3\2\2\2^_\7]\2\2_c\7\63\2\2`a\7]\2\2"+
		"ac\7\64\2\2b^\3\2\2\2b`\3\2\2\2c\21\3\2\2\2de\t\2\2\2e\23\3\2\2\2fg\7"+
		"o\2\2g\25\3\2\2\2hj\5\"\20\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l"+
		"m\3\2\2\2mo\7\61\2\2np\5\"\20\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2r\27\3\2\2\2su\t\3\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\31\3"+
		"\2\2\2xy\7*\2\2y\33\3\2\2\2z{\7]\2\2{\35\3\2\2\2|}\7_\2\2}\37\3\2\2\2"+
		"~\177\7\61\2\2\177!\3\2\2\2\u0080\u0081\t\4\2\2\u0081#\3\2\2\2\u0082\u0083"+
		"\7\"\2\2\u0083%\3\2\2\2\u0084\u0088\t\5\2\2\u0085\u0086\7\17\2\2\u0086"+
		"\u0088\7\f\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0088\'\3\2\2\2"+
		"\u0089\u008a\7\'\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\23\4\2\u008c)\3"+
		"\2\2\2\u008d\u0091\7E\2\2\u008e\u008f\7E\2\2\u008f\u0091\7~\2\2\u0090"+
		"\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0091+\3\2\2\2\u0092\u0094\5\"\20\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7\61\2\2\u0098\u009a\5\"\20\2"+
		"\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c-\3\2\2\2\u009d\u009e\t\6\2\2\u009e/\3\2\2\2\u009f\u00a0"+
		"\5,\25\2\u00a0\u00a2\7?\2\2\u00a1\u00a3\5\"\20\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\61\3\2\2"+
		"\2\u00a6\u00a8\n\7\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\30\5\2"+
		"\u00ac\63\3\2\2\2\u00ad\u00b1\t\b\2\2\u00ae\u00af\7\17\2\2\u00af\u00b1"+
		"\7\f\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\b\31\6\2\u00b3\65\3\2\2\2\u00b4\u00b6\n\t\2\2\u00b5\u00b4\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\67"+
		"\3\2\2\2\u00b9\u00bb\7\"\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c3\3\2\2\2\u00be\u00c3\t\n"+
		"\2\2\u00bf\u00c0\7^\2\2\u00c0\u00c3\7/\2\2\u00c1\u00c3\7~\2\2\u00c2\u00ba"+
		"\3\2\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"9\3\2\2\2\u00c4\u00c6\n\13\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca"+
		"\b\34\7\2\u00ca;\3\2\2\2\27\2\3\4\5M\\bkqv\u0087\u0090\u0095\u009b\u00a4"+
		"\u00a9\u00b0\u00b7\u00bc\u00c2\u00c7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}