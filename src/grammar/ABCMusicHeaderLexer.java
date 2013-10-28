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
		MODE_MINOR=12, KEY_NOTE=13, EQUALS=14, OCTAVE=15, DIGIT=16, LINE_FEED=17, 
		PERCENT=18, METER_VARIANTS=19, METER_FRACTION=20, COLON=21, TEMPO=22, 
		TITLE_TEXT=23, COMPOSER_TEXT=24, VOICE_TEXT=25, COMMENT_TEXT=26;
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
		"BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "KEY_NOTE", "'='", "OCTAVE", "DIGIT", 
		"LINE_FEED", "'%'", "METER_VARIANTS", "METER_FRACTION", "':'", "TEMPO", 
		"TITLE_TEXT", "COMPOSER_TEXT", "VOICE_TEXT", "COMMENT_TEXT"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "W", "BASE_NOTE", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "KEY_NOTE", "EQUALS", "OCTAVE", "DIGIT", "LINE_FEED", "PERCENT", 
		"METER_VARIANTS", "METER_FRACTION", "COLON", "TEMPO", "TITLE_TEXT", "COMPOSER_TEXT", 
		"VOICE_TEXT", "COMMENT_TEXT"
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

		case 17: PERCENT_action((RuleContext)_localctx, actionIndex); break;

		case 22: TITLE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 23: COMPOSER_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 24: VOICE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 25: COMMENT_TEXT_action((RuleContext)_localctx, actionIndex); break;
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
		"\2\4\34\u00b3\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6"+
		"\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t"+
		"\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t"+
		"\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\5\16e\n\16\3\16\5\16h\n\16\3\17\3\17\3\20\6\20"+
		"m\n\20\r\20\16\20n\3\21\6\21r\n\21\r\21\16\21s\3\22\3\22\3\22\5\22y\n"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0082\n\24\3\25\6\25\u0085"+
		"\n\25\r\25\16\25\u0086\3\25\3\25\6\25\u008b\n\25\r\25\16\25\u008c\3\26"+
		"\3\26\3\27\3\27\3\27\6\27\u0094\n\27\r\27\16\27\u0095\3\30\6\30\u0099"+
		"\n\30\r\30\16\30\u009a\3\30\3\30\3\31\6\31\u00a0\n\31\r\31\16\31\u00a1"+
		"\3\31\3\31\3\32\6\32\u00a7\n\32\r\32\16\32\u00a8\3\32\3\32\3\33\6\33\u00ae"+
		"\n\33\r\33\16\33\u00af\3\33\3\33\2\34\7\3\1\t\4\2\13\5\3\r\6\1\17\7\1"+
		"\21\b\1\23\t\4\25\n\1\27\13\1\31\f\1\33\r\1\35\16\1\37\17\1!\20\1#\21"+
		"\1%\22\1\'\23\1)\24\5+\25\1-\26\1/\27\1\61\30\1\63\31\6\65\32\7\67\33"+
		"\b9\34\t\7\2\3\4\5\6\r\4CIci\4%%dd\4))..\3\62;\4\f\f\17\17\3\62;\3\62"+
		";\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\u00bb\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\63\3\2\2\2\4\65\3\2\2"+
		"\2\5\67\3\2\2\2\69\3\2\2\2\7;\3\2\2\2\t>\3\2\2\2\13C\3\2\2\2\rH\3\2\2"+
		"\2\17K\3\2\2\2\21N\3\2\2\2\23Q\3\2\2\2\25V\3\2\2\2\27Y\3\2\2\2\31\\\3"+
		"\2\2\2\33^\3\2\2\2\35`\3\2\2\2\37b\3\2\2\2!i\3\2\2\2#l\3\2\2\2%q\3\2\2"+
		"\2\'x\3\2\2\2)z\3\2\2\2+\u0081\3\2\2\2-\u0084\3\2\2\2/\u008e\3\2\2\2\61"+
		"\u0090\3\2\2\2\63\u0098\3\2\2\2\65\u009f\3\2\2\2\67\u00a6\3\2\2\29\u00ad"+
		"\3\2\2\2;<\7Z\2\2<=\7<\2\2=\b\3\2\2\2>?\7V\2\2?@\7<\2\2@A\3\2\2\2AB\b"+
		"\3\2\2B\n\3\2\2\2CD\7E\2\2DE\7<\2\2EF\3\2\2\2FG\b\4\3\2G\f\3\2\2\2HI\7"+
		"N\2\2IJ\7<\2\2J\16\3\2\2\2KL\7O\2\2LM\7<\2\2M\20\3\2\2\2NO\7S\2\2OP\7"+
		"<\2\2P\22\3\2\2\2QR\7X\2\2RS\7<\2\2ST\3\2\2\2TU\b\b\4\2U\24\3\2\2\2VW"+
		"\7M\2\2WX\7<\2\2X\26\3\2\2\2YZ\7y\2\2Z[\7<\2\2[\30\3\2\2\2\\]\t\2\2\2"+
		"]\32\3\2\2\2^_\t\3\2\2_\34\3\2\2\2`a\7o\2\2a\36\3\2\2\2bd\5\31\13\2ce"+
		"\5\33\f\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5\35\r\2gf\3\2\2\2gh\3\2\2\2"+
		"h \3\2\2\2ij\7?\2\2j\"\3\2\2\2km\t\4\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2o$\3\2\2\2pr\t\5\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"t&\3\2\2\2uy\t\6\2\2vw\7\17\2\2wy\7\f\2\2xu\3\2\2\2xv\3\2\2\2y(\3\2\2"+
		"\2z{\7\'\2\2{|\3\2\2\2|}\b\23\5\2}*\3\2\2\2~\u0082\7E\2\2\177\u0080\7"+
		"E\2\2\u0080\u0082\7~\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0082,\3\2\2"+
		"\2\u0083\u0085\t\7\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\7\61\2\2"+
		"\u0089\u008b\t\b\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d.\3\2\2\2\u008e\u008f\7<\2\2\u008f\60"+
		"\3\2\2\2\u0090\u0091\5-\25\2\u0091\u0093\5!\17\2\u0092\u0094\5%\21\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\62\3\2\2\2\u0097\u0099\n\t\2\2\u0098\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\b\30\6\2\u009d\64\3\2\2\2\u009e\u00a0\n\n\2\2\u009f\u009e\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\b\31\7\2\u00a4\66\3\2\2\2\u00a5\u00a7\n\13\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\b\32\b\2\u00ab8\3\2\2\2\u00ac\u00ae"+
		"\n\f\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\33\t\2\u00b2:\3\2\2\2"+
		"\24\2\3\4\5\6dgnsx\u0081\u0086\u008c\u0095\u009a\u00a1\u00a8\u00af";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}