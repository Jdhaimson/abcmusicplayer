// Generated from ABCMusicHeaderLexer.g4 by ANTLR 4.0

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
		METER_VARIANTS=18, METER_FRACTION=19, COLON=20, TEMPO=21, TITLE_TEXT=22, 
		COMPOSER_TEXT=23, VOICE_TEXT=24, COMMENT_TEXT=25;
	public static final int enter_title = 1;
	public static final int enter_composer = 2;
	public static final int enter_voice = 3;
	public static final int enter_comment = 4;
	public static String[] modeNames = {
		"DEFAULT_MODE", "enter_title", "enter_composer", "enter_voice", "enter_comment"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "'w:'", 
		"BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "'='", "OCTAVE", "DIGIT", "LINE_FEED", 
		"'%'", "METER_VARIANTS", "METER_FRACTION", "':'", "TEMPO", "TITLE_TEXT", 
		"COMPOSER_TEXT", "VOICE_TEXT", "COMMENT_TEXT"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "W", "BASE_NOTE", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "EQUALS", "OCTAVE", "DIGIT", "LINE_FEED", "PERCENT", "METER_VARIANTS", 
		"METER_FRACTION", "COLON", "TEMPO", "TITLE_TEXT", "COMPOSER_TEXT", "VOICE_TEXT", 
		"COMMENT_TEXT"
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
	public String getGrammarFileName() { return "ABCMusicHeaderLexer.g4"; }

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
		case 1: T_action((RuleContext)_localctx, actionIndex); break;

		case 2: C_action((RuleContext)_localctx, actionIndex); break;

		case 6: V_action((RuleContext)_localctx, actionIndex); break;

		case 16: PERCENT_action((RuleContext)_localctx, actionIndex); break;

		case 21: TITLE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 22: COMPOSER_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 23: VOICE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 24: COMMENT_TEXT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void VOICE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: popMode();  break;
		}
	}
	private void T_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: pushMode(enter_title);  break;
		}
	}
	private void V_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: pushMode(enter_voice);  break;
		}
	}
	private void COMMENT_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: popMode();  break;
		}
	}
	private void PERCENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: pushMode(enter_comment);  break;
		}
	}
	private void C_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: pushMode(enter_composer);  break;
		}
	}
	private void TITLE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: popMode();  break;
		}
	}
	private void COMPOSER_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: popMode();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\33\u00aa\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6"+
		"\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t"+
		"\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t"+
		"\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\6\17d\n\17\r\17\16\17e\3\20\6\20i\n\20\r\20\16\20j\3"+
		"\21\3\21\3\21\5\21p\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23y\n\23"+
		"\3\24\6\24|\n\24\r\24\16\24}\3\24\3\24\6\24\u0082\n\24\r\24\16\24\u0083"+
		"\3\25\3\25\3\26\3\26\3\26\6\26\u008b\n\26\r\26\16\26\u008c\3\27\6\27\u0090"+
		"\n\27\r\27\16\27\u0091\3\27\3\27\3\30\6\30\u0097\n\30\r\30\16\30\u0098"+
		"\3\30\3\30\3\31\6\31\u009e\n\31\r\31\16\31\u009f\3\31\3\31\3\32\6\32\u00a5"+
		"\n\32\r\32\16\32\u00a6\3\32\3\32\2\33\7\3\1\t\4\2\13\5\3\r\6\1\17\7\1"+
		"\21\b\1\23\t\4\25\n\1\27\13\1\31\f\1\33\r\1\35\16\1\37\17\1!\20\1#\21"+
		"\1%\22\1\'\23\5)\24\1+\25\1-\26\1/\27\1\61\30\6\63\31\7\65\32\b\67\33"+
		"\t\7\2\3\4\5\6\r\4CIci\4%%dd\4))..\3\62;\4\f\f\17\17\3\62;\3\62;\4\f\f"+
		"\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\u00b0\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\4\63\3\2\2\2\5\65\3\2\2\2\6\67\3"+
		"\2\2\2\79\3\2\2\2\t<\3\2\2\2\13A\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21L\3"+
		"\2\2\2\23O\3\2\2\2\25T\3\2\2\2\27W\3\2\2\2\31Z\3\2\2\2\33\\\3\2\2\2\35"+
		"^\3\2\2\2\37`\3\2\2\2!c\3\2\2\2#h\3\2\2\2%o\3\2\2\2\'q\3\2\2\2)x\3\2\2"+
		"\2+{\3\2\2\2-\u0085\3\2\2\2/\u0087\3\2\2\2\61\u008f\3\2\2\2\63\u0096\3"+
		"\2\2\2\65\u009d\3\2\2\2\67\u00a4\3\2\2\29:\7Z\2\2:;\7<\2\2;\b\3\2\2\2"+
		"<=\7V\2\2=>\7<\2\2>?\3\2\2\2?@\b\3\2\2@\n\3\2\2\2AB\7E\2\2BC\7<\2\2CD"+
		"\3\2\2\2DE\b\4\3\2E\f\3\2\2\2FG\7N\2\2GH\7<\2\2H\16\3\2\2\2IJ\7O\2\2J"+
		"K\7<\2\2K\20\3\2\2\2LM\7S\2\2MN\7<\2\2N\22\3\2\2\2OP\7X\2\2PQ\7<\2\2Q"+
		"R\3\2\2\2RS\b\b\4\2S\24\3\2\2\2TU\7M\2\2UV\7<\2\2V\26\3\2\2\2WX\7y\2\2"+
		"XY\7<\2\2Y\30\3\2\2\2Z[\t\2\2\2[\32\3\2\2\2\\]\t\3\2\2]\34\3\2\2\2^_\7"+
		"o\2\2_\36\3\2\2\2`a\7?\2\2a \3\2\2\2bd\t\4\2\2cb\3\2\2\2de\3\2\2\2ec\3"+
		"\2\2\2ef\3\2\2\2f\"\3\2\2\2gi\t\5\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk"+
		"\3\2\2\2k$\3\2\2\2lp\t\6\2\2mn\7\17\2\2np\7\f\2\2ol\3\2\2\2om\3\2\2\2"+
		"p&\3\2\2\2qr\7\'\2\2rs\3\2\2\2st\b\22\5\2t(\3\2\2\2uy\7E\2\2vw\7E\2\2"+
		"wy\7~\2\2xu\3\2\2\2xv\3\2\2\2y*\3\2\2\2z|\t\7\2\2{z\3\2\2\2|}\3\2\2\2"+
		"}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0081\7\61\2\2\u0080\u0082\t\b\2"+
		"\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084,\3\2\2\2\u0085\u0086\7<\2\2\u0086.\3\2\2\2\u0087\u0088"+
		"\5+\24\2\u0088\u008a\5\37\16\2\u0089\u008b\5#\20\2\u008a\u0089\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\60"+
		"\3\2\2\2\u008e\u0090\n\t\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\27"+
		"\6\2\u0094\62\3\2\2\2\u0095\u0097\n\n\2\2\u0096\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009b\b\30\7\2\u009b\64\3\2\2\2\u009c\u009e\n\13\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a2\b\31\b\2\u00a2\66\3\2\2\2\u00a3\u00a5\n\f\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\32\t\2\u00a98\3\2\2\2\22\2"+
		"\3\4\5\6ejox}\u0083\u008c\u0091\u0098\u009f\u00a6";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}