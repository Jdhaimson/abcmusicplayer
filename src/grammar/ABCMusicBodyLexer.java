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
		END_VOICE=24, TUPLET_DIGIT=25;
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
		"LYRIC_TEXT", "LYRICAL_ELEMENTS", "VOICE_TEXT", "END_VOICE", "TUPLET_DIGIT"
	};
	public static final String[] ruleNames = {
		"W", "V", "ACCIDENTAL", "REST", "BAR_LINE", "NTH_REPEAT", "NOTE_LENGTH", 
		"NOTE_LENGTH_STRICT", "OPEN_PAREN", "OPEN_BRACK", "CLOSED_BRACK", "DIVIDE", 
		"DIGIT", "SPACE", "LINE_FEED", "PERCENT", "BASE_NOTE_OCTAVE", "COMMENT_TEXT", 
		"END_COMMENT", "END_LYRIC", "LYRIC_TEXT", "LYRICAL_ELEMENTS", "VOICE_TEXT", 
		"END_VOICE", "TUPLET_DIGIT"
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

		case 23: END_VOICE_action((RuleContext)_localctx, actionIndex); break;

		case 24: TUPLET_DIGIT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void VOICE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: popMode();  break;
		}
	}
	private void END_VOICE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: popMode();  break;
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
		case 9: popMode();  break;
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
		"\2\4\33\u00cf\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6"+
		"\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t"+
		"\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t"+
		"\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7"+
		"\5\7`\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16\177\n"+
		"\16\r\16\16\16\u0080\3\17\3\17\3\20\3\20\3\20\5\20\u0088\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\6\22\u0090\n\22\r\22\16\22\u0091\5\22\u0094\n\22"+
		"\3\23\6\23\u0097\n\23\r\23\16\23\u0098\3\23\3\23\3\24\3\24\3\24\5\24\u00a0"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u00a7\n\25\3\25\3\25\3\26\6\26\u00ac"+
		"\n\26\r\26\16\26\u00ad\3\27\6\27\u00b1\n\27\r\27\16\27\u00b2\3\27\3\27"+
		"\3\27\3\27\5\27\u00b9\n\27\3\30\6\30\u00bc\n\30\r\30\16\30\u00bd\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u00c5\n\31\3\31\3\31\3\32\6\32\u00ca\n\32\r"+
		"\32\16\32\u00cb\3\32\3\32\2\33\7\3\2\t\4\3\13\5\1\r\6\1\17\7\1\21\b\1"+
		"\23\t\1\25\n\1\27\13\4\31\f\1\33\r\1\35\16\1\37\17\1!\20\1#\21\1%\22\5"+
		"\'\23\1)\24\6+\25\7-\26\b/\27\1\61\30\1\63\31\t\65\32\n\67\33\13\7\2\3"+
		"\4\5\6\16\3\62;\4\f\f\17\17\4CIci\4))..\4\f\f\17\17\4\f\f\17\17\4\f\f"+
		"\17\17\b\f\f\17\17\"\"//~~\u0080\u0080\6,,//aa\u0080\u0080\4\f\f\17\17"+
		"\4\f\f\17\17\3\62;\u00e7\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\4-\3\2\2\2\4/\3\2\2"+
		"\2\4\61\3\2\2\2\5\63\3\2\2\2\5\65\3\2\2\2\6\67\3\2\2\2\79\3\2\2\2\t>\3"+
		"\2\2\2\13J\3\2\2\2\rL\3\2\2\2\17Y\3\2\2\2\21_\3\2\2\2\23m\3\2\2\2\25o"+
		"\3\2\2\2\27s\3\2\2\2\31w\3\2\2\2\33y\3\2\2\2\35{\3\2\2\2\37~\3\2\2\2!"+
		"\u0082\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008d\3\2\2\2)\u0096\3"+
		"\2\2\2+\u009f\3\2\2\2-\u00a6\3\2\2\2/\u00ab\3\2\2\2\61\u00b8\3\2\2\2\63"+
		"\u00bb\3\2\2\2\65\u00c4\3\2\2\2\67\u00c9\3\2\2\29:\7y\2\2:;\7<\2\2;<\3"+
		"\2\2\2<=\b\2\2\2=\b\3\2\2\2>?\7X\2\2?@\7<\2\2@A\3\2\2\2AB\b\3\3\2B\n\3"+
		"\2\2\2CK\7`\2\2DE\7`\2\2EK\7`\2\2FK\7a\2\2GH\7a\2\2HK\7a\2\2IK\7?\2\2"+
		"JC\3\2\2\2JD\3\2\2\2JF\3\2\2\2JG\3\2\2\2JI\3\2\2\2K\f\3\2\2\2LM\7|\2\2"+
		"M\16\3\2\2\2NZ\7~\2\2OP\7~\2\2PZ\7~\2\2QR\7]\2\2RZ\7~\2\2ST\7~\2\2TZ\7"+
		"_\2\2UV\7<\2\2VZ\7~\2\2WX\7~\2\2XZ\7<\2\2YN\3\2\2\2YO\3\2\2\2YQ\3\2\2"+
		"\2YS\3\2\2\2YU\3\2\2\2YW\3\2\2\2Z\20\3\2\2\2[\\\7]\2\2\\`\7\63\2\2]^\7"+
		"]\2\2^`\7\64\2\2_[\3\2\2\2_]\3\2\2\2`\22\3\2\2\2an\5\37\16\2bc\5\37\16"+
		"\2cd\5\35\r\2de\5\37\16\2en\3\2\2\2fg\5\35\r\2gh\5\37\16\2hn\3\2\2\2i"+
		"j\5\37\16\2jk\5\35\r\2kn\3\2\2\2ln\5\35\r\2ma\3\2\2\2mb\3\2\2\2mf\3\2"+
		"\2\2mi\3\2\2\2ml\3\2\2\2n\24\3\2\2\2op\5\37\16\2pq\7\61\2\2qr\5\37\16"+
		"\2r\26\3\2\2\2st\7*\2\2tu\3\2\2\2uv\b\n\4\2v\30\3\2\2\2wx\7]\2\2x\32\3"+
		"\2\2\2yz\7_\2\2z\34\3\2\2\2{|\7\61\2\2|\36\3\2\2\2}\177\t\2\2\2~}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081 \3\2\2"+
		"\2\u0082\u0083\7\"\2\2\u0083\"\3\2\2\2\u0084\u0088\t\3\2\2\u0085\u0086"+
		"\7\17\2\2\u0086\u0088\7\f\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2"+
		"\u0088$\3\2\2\2\u0089\u008a\7\'\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b"+
		"\21\5\2\u008c&\3\2\2\2\u008d\u0093\t\4\2\2\u008e\u0090\t\5\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0094\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0094\3\2\2\2\u0094(\3\2\2\2"+
		"\u0095\u0097\n\6\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\23\6\2"+
		"\u009b*\3\2\2\2\u009c\u00a0\t\7\2\2\u009d\u009e\7\17\2\2\u009e\u00a0\7"+
		"\f\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a2\b\24\7\2\u00a2,\3\2\2\2\u00a3\u00a7\t\b\2\2\u00a4\u00a5\7\17\2"+
		"\2\u00a5\u00a7\7\f\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\b\25\b\2\u00a9.\3\2\2\2\u00aa\u00ac\n\t\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\60\3\2\2\2\u00af\u00b1\7\"\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b9\3\2\2\2\u00b4"+
		"\u00b9\t\n\2\2\u00b5\u00b6\7^\2\2\u00b6\u00b9\7/\2\2\u00b7\u00b9\7~\2"+
		"\2\u00b8\u00b0\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b7"+
		"\3\2\2\2\u00b9\62\3\2\2\2\u00ba\u00bc\n\13\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\b\30\t\2\u00c0\64\3\2\2\2\u00c1\u00c5\t\f\2\2\u00c2\u00c3"+
		"\7\17\2\2\u00c3\u00c5\7\f\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2"+
		"\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\31\n\2\u00c7\66\3\2\2\2\u00c8\u00ca"+
		"\t\r\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\32\13\2\u00ce8\3\2\2"+
		"\2\30\2\3\4\5\6JY_m\u0080\u0087\u0091\u0093\u0098\u009f\u00a6\u00ad\u00b2"+
		"\u00b8\u00bd\u00c4\u00cb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}