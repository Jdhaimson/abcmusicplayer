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
		BASE_NOTE=19, COMMENT_TEXT=20, END_COMMENT=21, END_LYRIC=22, LYRIC_TEXT=23, 
		LYRICAL_ELEMENTS=24, VOICE_TEXT=25;
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
		"' '", "LINE_FEED", "'%'", "BASE_NOTE", "COMMENT_TEXT", "END_COMMENT", 
		"END_LYRIC", "LYRIC_TEXT", "LYRICAL_ELEMENTS", "VOICE_TEXT"
	};
	public static final String[] ruleNames = {
		"W", "V", "ACCIDENTAL", "REST", "BAR_LINE", "NTH_REPEAT", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "NOTE_LENGTH_STRICT", "OCTAVE", "OPEN_PAREN", "OPEN_BRACK", 
		"CLOSED_BRACK", "DIVIDE", "DIGIT", "SPACE", "LINE_FEED", "PERCENT", "BASE_NOTE", 
		"COMMENT_TEXT", "END_COMMENT", "END_LYRIC", "LYRIC_TEXT", "LYRICAL_ELEMENTS", 
		"VOICE_TEXT"
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

		case 19: COMMENT_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 20: END_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 21: END_LYRIC_action((RuleContext)_localctx, actionIndex); break;

		case 24: VOICE_TEXT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void VOICE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: popMode();  break;
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
	private void END_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: popMode();  break;
		}
	}
	private void END_LYRIC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: popMode();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\33\u00b7\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6"+
		"\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4"+
		"\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4"+
		"\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6\3\7\3\7\3\7\3\7\5\7_\n"+
		"\7\3\b\3\b\3\t\3\t\3\n\6\nf\n\n\r\n\16\ng\3\n\3\n\6\nl\n\n\r\n\16\nm\3"+
		"\13\6\13q\n\13\r\13\16\13r\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\5\22\u0084\n\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\25\6\25\u008d\n\25\r\25\16\25\u008e\3\25\3\25\3\26\3\26\3\26\5"+
		"\26\u0096\n\26\3\26\3\26\3\27\3\27\3\27\5\27\u009d\n\27\3\27\3\27\3\30"+
		"\6\30\u00a2\n\30\r\30\16\30\u00a3\3\31\6\31\u00a7\n\31\r\31\16\31\u00a8"+
		"\3\31\3\31\3\31\3\31\5\31\u00af\n\31\3\32\6\32\u00b2\n\32\r\32\16\32\u00b3"+
		"\3\32\3\32\2\33\6\3\2\b\4\3\n\5\1\f\6\1\16\7\1\20\b\1\22\t\1\24\n\1\26"+
		"\13\1\30\f\1\32\r\1\34\16\1\36\17\1 \20\1\"\21\1$\22\1&\23\1(\24\4*\25"+
		"\1,\26\5.\27\6\60\30\7\62\31\1\64\32\1\66\33\b\6\2\3\4\5\r\4%%dd\4))."+
		".\3\62;\4\f\f\17\17\4CIci\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\b\f\f\17"+
		"\17\"\"//~~\u0080\u0080\6,,//aa\u0080\u0080\4\f\f\17\17\u00ca\2\6\3\2"+
		"\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22"+
		"\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2"+
		"\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2"+
		"\2\2\2*\3\2\2\2\3,\3\2\2\2\3.\3\2\2\2\4\60\3\2\2\2\4\62\3\2\2\2\4\64\3"+
		"\2\2\2\5\66\3\2\2\2\68\3\2\2\2\b=\3\2\2\2\nI\3\2\2\2\fK\3\2\2\2\16X\3"+
		"\2\2\2\20^\3\2\2\2\22`\3\2\2\2\24b\3\2\2\2\26e\3\2\2\2\30p\3\2\2\2\32"+
		"t\3\2\2\2\34v\3\2\2\2\36x\3\2\2\2 z\3\2\2\2\"|\3\2\2\2$~\3\2\2\2&\u0083"+
		"\3\2\2\2(\u0085\3\2\2\2*\u0089\3\2\2\2,\u008c\3\2\2\2.\u0095\3\2\2\2\60"+
		"\u009c\3\2\2\2\62\u00a1\3\2\2\2\64\u00ae\3\2\2\2\66\u00b1\3\2\2\289\7"+
		"y\2\29:\7<\2\2:;\3\2\2\2;<\b\2\2\2<\7\3\2\2\2=>\7X\2\2>?\7<\2\2?@\3\2"+
		"\2\2@A\b\3\3\2A\t\3\2\2\2BJ\7`\2\2CD\7`\2\2DJ\7`\2\2EJ\7a\2\2FG\7a\2\2"+
		"GJ\7a\2\2HJ\7?\2\2IB\3\2\2\2IC\3\2\2\2IE\3\2\2\2IF\3\2\2\2IH\3\2\2\2J"+
		"\13\3\2\2\2KL\7|\2\2L\r\3\2\2\2MY\7~\2\2NO\7~\2\2OY\7~\2\2PQ\7]\2\2QY"+
		"\7~\2\2RS\7~\2\2SY\7_\2\2TU\7<\2\2UY\7~\2\2VW\7~\2\2WY\7<\2\2XM\3\2\2"+
		"\2XN\3\2\2\2XP\3\2\2\2XR\3\2\2\2XT\3\2\2\2XV\3\2\2\2Y\17\3\2\2\2Z[\7]"+
		"\2\2[_\7\63\2\2\\]\7]\2\2]_\7\64\2\2^Z\3\2\2\2^\\\3\2\2\2_\21\3\2\2\2"+
		"`a\t\2\2\2a\23\3\2\2\2bc\7o\2\2c\25\3\2\2\2df\5\"\20\2ed\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7\61\2\2jl\5\"\20\2kj\3\2\2\2lm\3"+
		"\2\2\2mk\3\2\2\2mn\3\2\2\2n\27\3\2\2\2oq\t\3\2\2po\3\2\2\2qr\3\2\2\2r"+
		"p\3\2\2\2rs\3\2\2\2s\31\3\2\2\2tu\7*\2\2u\33\3\2\2\2vw\7]\2\2w\35\3\2"+
		"\2\2xy\7_\2\2y\37\3\2\2\2z{\7\61\2\2{!\3\2\2\2|}\t\4\2\2}#\3\2\2\2~\177"+
		"\7\"\2\2\177%\3\2\2\2\u0080\u0084\t\5\2\2\u0081\u0082\7\17\2\2\u0082\u0084"+
		"\7\f\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0084\'\3\2\2\2\u0085"+
		"\u0086\7\'\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\23\4\2\u0088)\3\2\2\2"+
		"\u0089\u008a\t\6\2\2\u008a+\3\2\2\2\u008b\u008d\n\7\2\2\u008c\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\b\25\5\2\u0091-\3\2\2\2\u0092\u0096\t\b\2\2"+
		"\u0093\u0094\7\17\2\2\u0094\u0096\7\f\2\2\u0095\u0092\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\26\6\2\u0098/\3\2\2\2\u0099"+
		"\u009d\t\t\2\2\u009a\u009b\7\17\2\2\u009b\u009d\7\f\2\2\u009c\u0099\3"+
		"\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\27\7\2\u009f"+
		"\61\3\2\2\2\u00a0\u00a2\n\n\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2"+
		"\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\63\3\2\2\2\u00a5\u00a7"+
		"\7\"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00af\3\2\2\2\u00aa\u00af\t\13\2\2\u00ab\u00ac\7"+
		"^\2\2\u00ac\u00af\7/\2\2\u00ad\u00af\7~\2\2\u00ae\u00a6\3\2\2\2\u00ae"+
		"\u00aa\3\2\2\2\u00ae\u00ab\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\65\3\2\2"+
		"\2\u00b0\u00b2\n\f\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\b\32\b\2"+
		"\u00b6\67\3\2\2\2\24\2\3\4\5IX^gmr\u0083\u008e\u0095\u009c\u00a3\u00a8"+
		"\u00ae\u00b3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}