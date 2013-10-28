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
		PERCENT=18, METER_VARIANTS=19, METER_FRACTION=20, COLON=21, TEMPO_FRACTION=22, 
		TEMPO_EQUALS=23, TEMPO_NUMBER=24, TITLE_TEXT=25, END_TITLE=26, COMPOSER_TEXT=27, 
		END_COMPOSER=28, VOICE_TEXT=29, END_VOICE=30, COMMENT_TEXT=31, END_COMMENT=32;
	public static final int enter_tempo = 1;
	public static final int enter_title = 2;
	public static final int enter_composer = 3;
	public static final int enter_voice = 4;
	public static final int enter_comment = 5;
	public static String[] modeNames = {
		"DEFAULT_MODE", "enter_tempo", "enter_title", "enter_composer", "enter_voice", 
		"enter_comment"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "'w:'", 
		"BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "KEY_NOTE", "EQUALS", "OCTAVE", 
		"DIGIT", "LINE_FEED", "'%'", "METER_VARIANTS", "METER_FRACTION", "':'", 
		"TEMPO_FRACTION", "TEMPO_EQUALS", "TEMPO_NUMBER", "TITLE_TEXT", "END_TITLE", 
		"COMPOSER_TEXT", "END_COMPOSER", "VOICE_TEXT", "END_VOICE", "COMMENT_TEXT", 
		"END_COMMENT"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "W", "BASE_NOTE", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "KEY_NOTE", "EQUALS", "OCTAVE", "DIGIT", "LINE_FEED", "PERCENT", 
		"METER_VARIANTS", "METER_FRACTION", "COLON", "TEMPO_FRACTION", "TEMPO_EQUALS", 
		"TEMPO_NUMBER", "TITLE_TEXT", "END_TITLE", "COMPOSER_TEXT", "END_COMPOSER", 
		"VOICE_TEXT", "END_VOICE", "COMMENT_TEXT", "END_COMMENT"
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

		case 5: Q_action((RuleContext)_localctx, actionIndex); break;

		case 6: V_action((RuleContext)_localctx, actionIndex); break;

		case 17: PERCENT_action((RuleContext)_localctx, actionIndex); break;

		case 23: TEMPO_NUMBER_action((RuleContext)_localctx, actionIndex); break;

		case 24: TITLE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 25: END_TITLE_action((RuleContext)_localctx, actionIndex); break;

		case 26: COMPOSER_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 27: END_COMPOSER_action((RuleContext)_localctx, actionIndex); break;

		case 28: VOICE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 29: END_VOICE_action((RuleContext)_localctx, actionIndex); break;

		case 30: COMMENT_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 31: END_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void VOICE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: popMode();  break;
		}
	}
	private void PERCENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: pushMode(enter_comment);  break;
		}
	}
	private void C_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: pushMode(enter_composer);  break;
		}
	}
	private void END_COMPOSER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: popMode();  break;
		}
	}
	private void END_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: popMode();  break;
		}
	}
	private void END_TITLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: popMode();  break;
		}
	}
	private void COMPOSER_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: popMode();  break;
		}
	}
	private void TEMPO_NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: popMode();  break;
		}
	}
	private void T_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: pushMode(enter_title);  break;
		}
	}
	private void END_VOICE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: popMode();  break;
		}
	}
	private void V_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: pushMode(enter_voice);  break;
		}
	}
	private void Q_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: pushMode(enter_tempo);  break;
		}
	}
	private void COMMENT_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: popMode();  break;
		}
	}
	private void TITLE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: popMode();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\"\u00eb\b\1\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4"+
		"\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16"+
		"\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25"+
		"\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34"+
		"\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\5\16t\n\16\3\16\5\16w\n\16\3\17\3\17\3\20\6\20|\n\20\r"+
		"\20\16\20}\3\21\6\21\u0081\n\21\r\21\16\21\u0082\3\22\3\22\3\22\5\22\u0088"+
		"\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0091\n\24\3\25\6\25\u0094"+
		"\n\25\r\25\16\25\u0095\3\25\3\25\6\25\u009a\n\25\r\25\16\25\u009b\3\26"+
		"\3\26\3\27\6\27\u00a1\n\27\r\27\16\27\u00a2\3\27\3\27\6\27\u00a7\n\27"+
		"\r\27\16\27\u00a8\3\30\3\30\3\31\6\31\u00ae\n\31\r\31\16\31\u00af\3\31"+
		"\3\31\3\32\6\32\u00b5\n\32\r\32\16\32\u00b6\3\32\3\32\3\33\3\33\3\33\5"+
		"\33\u00be\n\33\3\33\3\33\3\34\6\34\u00c3\n\34\r\34\16\34\u00c4\3\34\3"+
		"\34\3\35\3\35\3\35\5\35\u00cc\n\35\3\35\3\35\3\36\6\36\u00d1\n\36\r\36"+
		"\16\36\u00d2\3\36\3\36\3\37\3\37\3\37\5\37\u00da\n\37\3\37\3\37\3 \6 "+
		"\u00df\n \r \16 \u00e0\3 \3 \3!\3!\3!\5!\u00e8\n!\3!\3!\2\"\b\3\1\n\4"+
		"\2\f\5\3\16\6\1\20\7\1\22\b\4\24\t\5\26\n\1\30\13\1\32\f\1\34\r\1\36\16"+
		"\1 \17\1\"\20\1$\21\1&\22\1(\23\1*\24\6,\25\1.\26\1\60\27\1\62\30\1\64"+
		"\31\1\66\32\78\33\b:\34\t<\35\n>\36\13@\37\fB \rD!\16F\"\17\b\2\3\4\5"+
		"\6\7\24\4CIci\4%%dd\4))..\3\62;\4\f\f\17\17\3\62;\3\62;\3\62;\3\62;\3"+
		"\62;\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f"+
		"\17\17\4\f\f\17\17\4\f\f\17\17\u00f8\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2"+
		"\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2"+
		"\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2"+
		"\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2"+
		"\2\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\48\3\2\2\2\4:\3\2"+
		"\2\2\5<\3\2\2\2\5>\3\2\2\2\6@\3\2\2\2\6B\3\2\2\2\7D\3\2\2\2\7F\3\2\2\2"+
		"\bH\3\2\2\2\nK\3\2\2\2\fP\3\2\2\2\16U\3\2\2\2\20X\3\2\2\2\22[\3\2\2\2"+
		"\24`\3\2\2\2\26e\3\2\2\2\30h\3\2\2\2\32k\3\2\2\2\34m\3\2\2\2\36o\3\2\2"+
		"\2 q\3\2\2\2\"x\3\2\2\2${\3\2\2\2&\u0080\3\2\2\2(\u0087\3\2\2\2*\u0089"+
		"\3\2\2\2,\u0090\3\2\2\2.\u0093\3\2\2\2\60\u009d\3\2\2\2\62\u00a0\3\2\2"+
		"\2\64\u00aa\3\2\2\2\66\u00ad\3\2\2\28\u00b4\3\2\2\2:\u00bd\3\2\2\2<\u00c2"+
		"\3\2\2\2>\u00cb\3\2\2\2@\u00d0\3\2\2\2B\u00d9\3\2\2\2D\u00de\3\2\2\2F"+
		"\u00e7\3\2\2\2HI\7Z\2\2IJ\7<\2\2J\t\3\2\2\2KL\7V\2\2LM\7<\2\2MN\3\2\2"+
		"\2NO\b\3\2\2O\13\3\2\2\2PQ\7E\2\2QR\7<\2\2RS\3\2\2\2ST\b\4\3\2T\r\3\2"+
		"\2\2UV\7N\2\2VW\7<\2\2W\17\3\2\2\2XY\7O\2\2YZ\7<\2\2Z\21\3\2\2\2[\\\7"+
		"S\2\2\\]\7<\2\2]^\3\2\2\2^_\b\7\4\2_\23\3\2\2\2`a\7X\2\2ab\7<\2\2bc\3"+
		"\2\2\2cd\b\b\5\2d\25\3\2\2\2ef\7M\2\2fg\7<\2\2g\27\3\2\2\2hi\7y\2\2ij"+
		"\7<\2\2j\31\3\2\2\2kl\t\2\2\2l\33\3\2\2\2mn\t\3\2\2n\35\3\2\2\2op\7o\2"+
		"\2p\37\3\2\2\2qs\5\32\13\2rt\5\34\f\2sr\3\2\2\2st\3\2\2\2tv\3\2\2\2uw"+
		"\5\36\r\2vu\3\2\2\2vw\3\2\2\2w!\3\2\2\2xy\7?\2\2y#\3\2\2\2z|\t\4\2\2{"+
		"z\3\2\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~%\3\2\2\2\177\u0081\t\5\2\2\u0080"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\'\3\2\2\2\u0084\u0088\t\6\2\2\u0085\u0086\7\17\2\2\u0086\u0088"+
		"\7\f\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0088)\3\2\2\2\u0089"+
		"\u008a\7\'\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\23\6\2\u008c+\3\2\2\2"+
		"\u008d\u0091\7E\2\2\u008e\u008f\7E\2\2\u008f\u0091\7~\2\2\u0090\u008d"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0091-\3\2\2\2\u0092\u0094\t\7\2\2\u0093"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0099\7\61\2\2\u0098\u009a\t\b\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c/\3\2\2\2\u009d\u009e\7<\2\2\u009e\61\3\2\2\2\u009f\u00a1\t"+
		"\t\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\61\2\2\u00a5\u00a7\t"+
		"\n\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\63\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\65\3\2\2\2\u00ac"+
		"\u00ae\t\13\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\31\7\2\u00b2"+
		"\67\3\2\2\2\u00b3\u00b5\n\f\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2"+
		"\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\b\32\b\2\u00b99\3\2\2\2\u00ba\u00be\t\r\2\2\u00bb\u00bc\7\17\2\2\u00bc"+
		"\u00be\7\f\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\b\33\t\2\u00c0;\3\2\2\2\u00c1\u00c3\n\16\2\2\u00c2\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c7\b\34\n\2\u00c7=\3\2\2\2\u00c8\u00cc\t\17\2"+
		"\2\u00c9\u00ca\7\17\2\2\u00ca\u00cc\7\f\2\2\u00cb\u00c8\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\35\13\2\u00ce?\3\2\2"+
		"\2\u00cf\u00d1\n\20\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\36"+
		"\f\2\u00d5A\3\2\2\2\u00d6\u00da\t\21\2\2\u00d7\u00d8\7\17\2\2\u00d8\u00da"+
		"\7\f\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\b\37\r\2\u00dcC\3\2\2\2\u00dd\u00df\n\22\2\2\u00de\u00dd\3\2\2"+
		"\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2\u00e3\b \16\2\u00e3E\3\2\2\2\u00e4\u00e8\t\23\2\2\u00e5"+
		"\u00e6\7\17\2\2\u00e6\u00e8\7\f\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b!\17\2\u00eaG\3\2\2\2\33\2\3\4"+
		"\5\6\7sv}\u0082\u0087\u0090\u0095\u009b\u00a2\u00a8\u00af\u00b6\u00bd"+
		"\u00c4\u00cb\u00d2\u00d9\u00e0\u00e7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}