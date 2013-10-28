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
		X=1, T=2, C=3, L=4, M=5, Q=6, V=7, K=8, BASE_NOTE=9, KEY_ACCIDENTAL=10, 
		MODE_MINOR=11, EQUALS=12, OCTAVE=13, DIGIT=14, LINE_FEED=15, PERCENT=16, 
		METER_VARIANTS=17, METER_FRACTION=18, COLON=19, TEMPO_FRACTION=20, TEMPO_EQUALS=21, 
		TEMPO_NUMBER=22, TITLE_TEXT=23, END_TITLE=24, COMPOSER_TEXT=25, END_COMPOSER=26, 
		VOICE_TEXT=27, END_VOICE=28, COMMENT_TEXT=29, END_COMMENT=30, KEY_NOTE=31;
	public static final int enter_tempo = 1;
	public static final int enter_title = 2;
	public static final int enter_composer = 3;
	public static final int enter_voice = 4;
	public static final int enter_comment = 5;
	public static final int enter_key = 6;
	public static String[] modeNames = {
		"DEFAULT_MODE", "enter_tempo", "enter_title", "enter_composer", "enter_voice", 
		"enter_comment", "enter_key"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "BASE_NOTE", 
		"KEY_ACCIDENTAL", "'m'", "EQUALS", "OCTAVE", "DIGIT", "LINE_FEED", "'%'", 
		"METER_VARIANTS", "METER_FRACTION", "':'", "TEMPO_FRACTION", "TEMPO_EQUALS", 
		"TEMPO_NUMBER", "TITLE_TEXT", "END_TITLE", "COMPOSER_TEXT", "END_COMPOSER", 
		"VOICE_TEXT", "END_VOICE", "COMMENT_TEXT", "END_COMMENT", "KEY_NOTE"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "BASE_NOTE", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "EQUALS", "OCTAVE", "DIGIT", "LINE_FEED", "PERCENT", "METER_VARIANTS", 
		"METER_FRACTION", "COLON", "TEMPO_FRACTION", "TEMPO_EQUALS", "TEMPO_NUMBER", 
		"TITLE_TEXT", "END_TITLE", "COMPOSER_TEXT", "END_COMPOSER", "VOICE_TEXT", 
		"END_VOICE", "COMMENT_TEXT", "END_COMMENT", "KEY_NOTE"
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

		case 7: K_action((RuleContext)_localctx, actionIndex); break;

		case 15: PERCENT_action((RuleContext)_localctx, actionIndex); break;

		case 21: TEMPO_NUMBER_action((RuleContext)_localctx, actionIndex); break;

		case 22: TITLE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 23: END_TITLE_action((RuleContext)_localctx, actionIndex); break;

		case 24: COMPOSER_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 25: END_COMPOSER_action((RuleContext)_localctx, actionIndex); break;

		case 26: VOICE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 27: END_VOICE_action((RuleContext)_localctx, actionIndex); break;

		case 28: COMMENT_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 29: END_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 30: KEY_NOTE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void VOICE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: popMode();  break;
		}
	}
	private void PERCENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: pushMode(enter_comment);  break;
		}
	}
	private void C_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: pushMode(enter_composer);  break;
		}
	}
	private void END_COMPOSER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: popMode();  break;
		}
	}
	private void END_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: popMode();  break;
		}
	}
	private void END_TITLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: popMode();  break;
		}
	}
	private void COMPOSER_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: popMode();  break;
		}
	}
	private void K_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: pushMode(enter_key);  break;
		}
	}
	private void TEMPO_NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: popMode();  break;
		}
	}
	private void END_VOICE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: popMode();  break;
		}
	}
	private void T_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: pushMode(enter_title);  break;
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
	private void KEY_NOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: popMode();  break;
		}
	}
	private void COMMENT_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: popMode();  break;
		}
	}
	private void TITLE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: popMode();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4!\u00eb\b\1\b\1\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t"+
		"\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4"+
		"\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4"+
		"\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4"+
		"\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\6\16s\n\16\r\16\16\16t\3\17\6\17x\n\17\r\17\16\17y\3\20\3\20"+
		"\3\20\5\20\177\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u0088\n\22"+
		"\3\23\6\23\u008b\n\23\r\23\16\23\u008c\3\23\3\23\6\23\u0091\n\23\r\23"+
		"\16\23\u0092\3\24\3\24\3\25\6\25\u0098\n\25\r\25\16\25\u0099\3\25\3\25"+
		"\6\25\u009e\n\25\r\25\16\25\u009f\3\26\3\26\3\27\6\27\u00a5\n\27\r\27"+
		"\16\27\u00a6\3\27\3\27\3\30\6\30\u00ac\n\30\r\30\16\30\u00ad\3\30\3\30"+
		"\3\31\3\31\3\31\5\31\u00b5\n\31\3\31\3\31\3\32\6\32\u00ba\n\32\r\32\16"+
		"\32\u00bb\3\32\3\32\3\33\3\33\3\33\5\33\u00c3\n\33\3\33\3\33\3\34\6\34"+
		"\u00c8\n\34\r\34\16\34\u00c9\3\34\3\34\3\35\3\35\3\35\5\35\u00d1\n\35"+
		"\3\35\3\35\3\36\6\36\u00d6\n\36\r\36\16\36\u00d7\3\36\3\36\3\37\3\37\3"+
		"\37\5\37\u00df\n\37\3\37\3\37\3 \3 \5 \u00e5\n \3 \5 \u00e8\n \3 \3 \2"+
		"!\t\3\1\13\4\2\r\5\3\17\6\1\21\7\1\23\b\4\25\t\5\27\n\6\31\13\1\33\f\1"+
		"\35\r\1\37\16\1!\17\1#\20\1%\21\1\'\22\7)\23\1+\24\1-\25\1/\26\1\61\27"+
		"\1\63\30\b\65\31\t\67\32\n9\33\13;\34\f=\35\r?\36\16A\37\17C \20E!\21"+
		"\t\2\3\4\5\6\7\b\24\4CIci\4%%dd\4))..\3\62;\4\f\f\17\17\3\62;\3\62;\3"+
		"\62;\3\62;\3\62;\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f"+
		"\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\u00f7\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\3/\3\2\2\2\3\61\3\2\2\2\3\63\3\2\2\2\4\65\3\2\2\2\4\67\3\2\2\2\59\3"+
		"\2\2\2\5;\3\2\2\2\6=\3\2\2\2\6?\3\2\2\2\7A\3\2\2\2\7C\3\2\2\2\bE\3\2\2"+
		"\2\tG\3\2\2\2\13J\3\2\2\2\rO\3\2\2\2\17T\3\2\2\2\21W\3\2\2\2\23Z\3\2\2"+
		"\2\25_\3\2\2\2\27d\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2"+
		"\2\2!r\3\2\2\2#w\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0087\3\2\2\2+\u008a"+
		"\3\2\2\2-\u0094\3\2\2\2/\u0097\3\2\2\2\61\u00a1\3\2\2\2\63\u00a4\3\2\2"+
		"\2\65\u00ab\3\2\2\2\67\u00b4\3\2\2\29\u00b9\3\2\2\2;\u00c2\3\2\2\2=\u00c7"+
		"\3\2\2\2?\u00d0\3\2\2\2A\u00d5\3\2\2\2C\u00de\3\2\2\2E\u00e2\3\2\2\2G"+
		"H\7Z\2\2HI\7<\2\2I\n\3\2\2\2JK\7V\2\2KL\7<\2\2LM\3\2\2\2MN\b\3\2\2N\f"+
		"\3\2\2\2OP\7E\2\2PQ\7<\2\2QR\3\2\2\2RS\b\4\3\2S\16\3\2\2\2TU\7N\2\2UV"+
		"\7<\2\2V\20\3\2\2\2WX\7O\2\2XY\7<\2\2Y\22\3\2\2\2Z[\7S\2\2[\\\7<\2\2\\"+
		"]\3\2\2\2]^\b\7\4\2^\24\3\2\2\2_`\7X\2\2`a\7<\2\2ab\3\2\2\2bc\b\b\5\2"+
		"c\26\3\2\2\2de\7M\2\2ef\7<\2\2fg\3\2\2\2gh\b\t\6\2h\30\3\2\2\2ij\t\2\2"+
		"\2j\32\3\2\2\2kl\t\3\2\2l\34\3\2\2\2mn\7o\2\2n\36\3\2\2\2op\7?\2\2p \3"+
		"\2\2\2qs\t\4\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\"\3\2\2\2vx"+
		"\t\5\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z$\3\2\2\2{\177\t\6\2"+
		"\2|}\7\17\2\2}\177\7\f\2\2~{\3\2\2\2~|\3\2\2\2\177&\3\2\2\2\u0080\u0081"+
		"\7\'\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\21\7\2\u0083(\3\2\2\2\u0084"+
		"\u0088\7E\2\2\u0085\u0086\7E\2\2\u0086\u0088\7~\2\2\u0087\u0084\3\2\2"+
		"\2\u0087\u0085\3\2\2\2\u0088*\3\2\2\2\u0089\u008b\t\7\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\7\61\2\2\u008f\u0091\t\b\2\2\u0090\u008f\3"+
		"\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		",\3\2\2\2\u0094\u0095\7<\2\2\u0095.\3\2\2\2\u0096\u0098\t\t\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009d\7\61\2\2\u009c\u009e\t\n\2\2\u009d"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\62\3\2\2\2\u00a3\u00a5"+
		"\t\13\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2"+
		"\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\27\b\2\u00a9\64"+
		"\3\2\2\2\u00aa\u00ac\n\f\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\30"+
		"\t\2\u00b0\66\3\2\2\2\u00b1\u00b5\t\r\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b5"+
		"\7\f\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\b\31\n\2\u00b78\3\2\2\2\u00b8\u00ba\n\16\2\2\u00b9\u00b8\3\2\2"+
		"\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00be\b\32\13\2\u00be:\3\2\2\2\u00bf\u00c3\t\17\2\2\u00c0"+
		"\u00c1\7\17\2\2\u00c1\u00c3\7\f\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b\33\f\2\u00c5<\3\2\2\2\u00c6\u00c8"+
		"\n\20\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\34\r\2\u00cc>\3"+
		"\2\2\2\u00cd\u00d1\t\21\2\2\u00ce\u00cf\7\17\2\2\u00cf\u00d1\7\f\2\2\u00d0"+
		"\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\35"+
		"\16\2\u00d3@\3\2\2\2\u00d4\u00d6\n\22\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\b\36\17\2\u00daB\3\2\2\2\u00db\u00df\t\23\2\2\u00dc\u00dd\7\17"+
		"\2\2\u00dd\u00df\7\f\2\2\u00de\u00db\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\b\37\20\2\u00e1D\3\2\2\2\u00e2\u00e4\5\31\n"+
		"\2\u00e3\u00e5\5\33\13\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00e8\5\35\f\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b \21\2\u00eaF\3\2\2\2\34\2\3\4"+
		"\5\6\7\bty~\u0087\u008c\u0092\u0099\u009f\u00a6\u00ad\u00b4\u00bb\u00c2"+
		"\u00c9\u00d0\u00d7\u00de\u00e4\u00e7";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}