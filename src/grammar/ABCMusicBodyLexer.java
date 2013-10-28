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
		W=1, V=2, ACCIDENTAL=3, REST=4, BAR_LINE=5, NTH_REPEAT=6, NOTE_LENGTH=7, 
		NOTE_LENGTH_STRICT=8, OPEN_PAREN=9, OPEN_BRACK=10, CLOSED_BRACK=11, DIVIDE=12, 
		DIGIT=13, SPACE=14, LINE_FEED=15, PERCENT=16, BASE_NOTE_OCTAVE=17, COMMENT_TEXT=18, 
		END_COMMENT=19, END_LYRIC=20, LYRIC_TEXT=21, LYRICAL_ELEMENTS=22, VOICE_TEXT=23, 
		TUPLET_DIGIT=24;
	public static final int enter_comment = 1;
	public static final int enter_lyrics = 2;
	public static final int enter_voice = 3;
	public static final int enter_tuplet = 4;
	public static String[] modeNames = {
		"DEFAULT_MODE", "enter_comment", "enter_lyrics", "enter_voice", "enter_tuplet"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'w:'", "'V:'", "ACCIDENTAL", "'z'", "BAR_LINE", "NTH_REPEAT", "NOTE_LENGTH", 
		"NOTE_LENGTH_STRICT", "'('", "'['", "']'", "'/'", "DIGIT", "' '", "LINE_FEED", 
		"'%'", "BASE_NOTE_OCTAVE", "COMMENT_TEXT", "END_COMMENT", "END_LYRIC", 
		"LYRIC_TEXT", "LYRICAL_ELEMENTS", "VOICE_TEXT", "TUPLET_DIGIT"
	};
	public static final String[] ruleNames = {
		"W", "V", "ACCIDENTAL", "REST", "BAR_LINE", "NTH_REPEAT", "NOTE_LENGTH", 
		"NOTE_LENGTH_STRICT", "OPEN_PAREN", "OPEN_BRACK", "CLOSED_BRACK", "DIVIDE", 
		"DIGIT", "SPACE", "LINE_FEED", "PERCENT", "BASE_NOTE_OCTAVE", "COMMENT_TEXT", 
		"END_COMMENT", "END_LYRIC", "LYRIC_TEXT", "LYRICAL_ELEMENTS", "VOICE_TEXT", 
		"TUPLET_DIGIT"
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

		case 8: OPEN_PAREN_action((RuleContext)_localctx, actionIndex); break;

		case 15: PERCENT_action((RuleContext)_localctx, actionIndex); break;

		case 17: COMMENT_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 18: END_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 19: END_LYRIC_action((RuleContext)_localctx, actionIndex); break;

		case 22: VOICE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 23: TUPLET_DIGIT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void VOICE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: popMode();  break;
		}
	}
	private void OPEN_PAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: pushMode(enter_tuplet);  break;
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
		case 4: popMode();  break;
		}
	}
	private void PERCENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: pushMode(enter_comment);  break;
		}
	}
	private void TUPLET_DIGIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: popMode();  break;
		}
	}
	private void END_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: popMode();  break;
		}
	}
	private void END_LYRIC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: popMode();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\32\u00c6\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6"+
		"\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t"+
		"\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t"+
		"\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4I\n\4\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\5\7^\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16}\n\16\r\16\16\16"+
		"~\3\17\3\17\3\20\3\20\3\20\5\20\u0086\n\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\6\22\u008e\n\22\r\22\16\22\u008f\5\22\u0092\n\22\3\23\6\23\u0095\n"+
		"\23\r\23\16\23\u0096\3\23\3\23\3\24\3\24\3\24\5\24\u009e\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\5\25\u00a5\n\25\3\25\3\25\3\26\6\26\u00aa\n\26\r\26\16"+
		"\26\u00ab\3\27\6\27\u00af\n\27\r\27\16\27\u00b0\3\27\3\27\3\27\3\27\5"+
		"\27\u00b7\n\27\3\30\6\30\u00ba\n\30\r\30\16\30\u00bb\3\30\3\30\3\31\6"+
		"\31\u00c1\n\31\r\31\16\31\u00c2\3\31\3\31\2\32\7\3\2\t\4\3\13\5\1\r\6"+
		"\1\17\7\1\21\b\1\23\t\1\25\n\1\27\13\4\31\f\1\33\r\1\35\16\1\37\17\1!"+
		"\20\1#\21\1%\22\5\'\23\1)\24\6+\25\7-\26\b/\27\1\61\30\1\63\31\t\65\32"+
		"\n\7\2\3\4\5\6\r\3\62;\4\f\f\17\17\4CIci\4))..\4\f\f\17\17\4\f\f\17\17"+
		"\4\f\f\17\17\b\f\f\17\17\"\"//~~\u0080\u0080\6,,//aa\u0080\u0080\4\f\f"+
		"\17\17\3\62;\u00dd\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\4-\3\2\2\2\4/\3\2\2\2\4\61"+
		"\3\2\2\2\5\63\3\2\2\2\6\65\3\2\2\2\7\67\3\2\2\2\t<\3\2\2\2\13H\3\2\2\2"+
		"\rJ\3\2\2\2\17W\3\2\2\2\21]\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27q\3\2\2"+
		"\2\31u\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37|\3\2\2\2!\u0080\3\2\2\2#\u0085"+
		"\3\2\2\2%\u0087\3\2\2\2\'\u008b\3\2\2\2)\u0094\3\2\2\2+\u009d\3\2\2\2"+
		"-\u00a4\3\2\2\2/\u00a9\3\2\2\2\61\u00b6\3\2\2\2\63\u00b9\3\2\2\2\65\u00c0"+
		"\3\2\2\2\678\7y\2\289\7<\2\29:\3\2\2\2:;\b\2\2\2;\b\3\2\2\2<=\7X\2\2="+
		">\7<\2\2>?\3\2\2\2?@\b\3\3\2@\n\3\2\2\2AI\7`\2\2BC\7`\2\2CI\7`\2\2DI\7"+
		"a\2\2EF\7a\2\2FI\7a\2\2GI\7?\2\2HA\3\2\2\2HB\3\2\2\2HD\3\2\2\2HE\3\2\2"+
		"\2HG\3\2\2\2I\f\3\2\2\2JK\7|\2\2K\16\3\2\2\2LX\7~\2\2MN\7~\2\2NX\7~\2"+
		"\2OP\7]\2\2PX\7~\2\2QR\7~\2\2RX\7_\2\2ST\7<\2\2TX\7~\2\2UV\7~\2\2VX\7"+
		"<\2\2WL\3\2\2\2WM\3\2\2\2WO\3\2\2\2WQ\3\2\2\2WS\3\2\2\2WU\3\2\2\2X\20"+
		"\3\2\2\2YZ\7]\2\2Z^\7\63\2\2[\\\7]\2\2\\^\7\64\2\2]Y\3\2\2\2][\3\2\2\2"+
		"^\22\3\2\2\2_l\5\37\16\2`a\5\37\16\2ab\5\35\r\2bc\5\37\16\2cl\3\2\2\2"+
		"de\5\35\r\2ef\5\37\16\2fl\3\2\2\2gh\5\37\16\2hi\5\35\r\2il\3\2\2\2jl\5"+
		"\35\r\2k_\3\2\2\2k`\3\2\2\2kd\3\2\2\2kg\3\2\2\2kj\3\2\2\2l\24\3\2\2\2"+
		"mn\5\37\16\2no\7\61\2\2op\5\37\16\2p\26\3\2\2\2qr\7*\2\2rs\3\2\2\2st\b"+
		"\n\4\2t\30\3\2\2\2uv\7]\2\2v\32\3\2\2\2wx\7_\2\2x\34\3\2\2\2yz\7\61\2"+
		"\2z\36\3\2\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		" \3\2\2\2\u0080\u0081\7\"\2\2\u0081\"\3\2\2\2\u0082\u0086\t\3\2\2\u0083"+
		"\u0084\7\17\2\2\u0084\u0086\7\f\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0086$\3\2\2\2\u0087\u0088\7\'\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\b\21\5\2\u008a&\3\2\2\2\u008b\u0091\t\4\2\2\u008c\u008e\t\5\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"(\3\2\2\2\u0093\u0095\n\6\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2"+
		"\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099"+
		"\b\23\6\2\u0099*\3\2\2\2\u009a\u009e\t\7\2\2\u009b\u009c\7\17\2\2\u009c"+
		"\u009e\7\f\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a0\b\24\7\2\u00a0,\3\2\2\2\u00a1\u00a5\t\b\2\2\u00a2\u00a3"+
		"\7\17\2\2\u00a3\u00a5\7\f\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\25\b\2\u00a7.\3\2\2\2\u00a8\u00aa\n"+
		"\t\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\60\3\2\2\2\u00ad\u00af\7\"\2\2\u00ae\u00ad\3\2\2"+
		"\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b7"+
		"\3\2\2\2\u00b2\u00b7\t\n\2\2\u00b3\u00b4\7^\2\2\u00b4\u00b7\7/\2\2\u00b5"+
		"\u00b7\7~\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b6\u00b3\3\2"+
		"\2\2\u00b6\u00b5\3\2\2\2\u00b7\62\3\2\2\2\u00b8\u00ba\n\13\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\b\30\t\2\u00be\64\3\2\2\2\u00bf\u00c1\t\f\2"+
		"\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\31\n\2\u00c5\66\3\2\2\2\27"+
		"\2\3\4\5\6HW]k~\u0085\u008f\u0091\u0096\u009d\u00a4\u00ab\u00b0\u00b6"+
		"\u00bb\u00c2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}