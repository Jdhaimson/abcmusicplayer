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
		MODE_MINOR=11, EQUALS=12, SPACE=13, OCTAVE=14, DIGIT=15, LINE_FEED=16, 
		PERCENT=17, COLON=18, WS_TEMPO=19, TEMPO_FRACTION=20, TEMPO_EQUALS=21, 
		TEMPO_NUMBER=22, TITLE_TEXT=23, END_TITLE=24, COMPOSER_TEXT=25, END_COMPOSER=26, 
		VOICE_TEXT=27, END_VOICE=28, COMMENT_TEXT=29, END_COMMENT=30, WS_KEY=31, 
		KEY_NOTE=32, WS_INDEX=33, INDEX=34, WS_METER=35, METER_VARIANTS=36, METER_FRACTION=37, 
		WS_LENGTH=38, LENGTH_FRACTION=39;
	public static final int enter_tempo = 1;
	public static final int enter_title = 2;
	public static final int enter_composer = 3;
	public static final int enter_voice = 4;
	public static final int enter_comment = 5;
	public static final int enter_key = 6;
	public static final int enter_index = 7;
	public static final int enter_meter = 8;
	public static final int enter_length = 9;
	public static String[] modeNames = {
		"DEFAULT_MODE", "enter_tempo", "enter_title", "enter_composer", "enter_voice", 
		"enter_comment", "enter_key", "enter_index", "enter_meter", "enter_length"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", "BASE_NOTE", 
		"KEY_ACCIDENTAL", "'m'", "EQUALS", "' '", "OCTAVE", "DIGIT", "LINE_FEED", 
		"'%'", "':'", "WS_TEMPO", "TEMPO_FRACTION", "TEMPO_EQUALS", "TEMPO_NUMBER", 
		"TITLE_TEXT", "END_TITLE", "COMPOSER_TEXT", "END_COMPOSER", "VOICE_TEXT", 
		"END_VOICE", "COMMENT_TEXT", "END_COMMENT", "WS_KEY", "KEY_NOTE", "WS_INDEX", 
		"INDEX", "WS_METER", "METER_VARIANTS", "METER_FRACTION", "WS_LENGTH", 
		"LENGTH_FRACTION"
	};
	public static final String[] ruleNames = {
		"X", "T", "C", "L", "M", "Q", "V", "K", "BASE_NOTE", "KEY_ACCIDENTAL", 
		"MODE_MINOR", "EQUALS", "SPACE", "OCTAVE", "DIGIT", "LINE_FEED", "PERCENT", 
		"COLON", "WS_TEMPO", "TEMPO_FRACTION", "TEMPO_EQUALS", "TEMPO_NUMBER", 
		"TITLE_TEXT", "END_TITLE", "COMPOSER_TEXT", "END_COMPOSER", "VOICE_TEXT", 
		"END_VOICE", "COMMENT_TEXT", "END_COMMENT", "WS_KEY", "KEY_NOTE", "WS_INDEX", 
		"INDEX", "WS_METER", "METER_VARIANTS", "METER_FRACTION", "WS_LENGTH", 
		"LENGTH_FRACTION"
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
		case 0: X_action((RuleContext)_localctx, actionIndex); break;

		case 1: T_action((RuleContext)_localctx, actionIndex); break;

		case 2: C_action((RuleContext)_localctx, actionIndex); break;

		case 3: L_action((RuleContext)_localctx, actionIndex); break;

		case 4: M_action((RuleContext)_localctx, actionIndex); break;

		case 5: Q_action((RuleContext)_localctx, actionIndex); break;

		case 6: V_action((RuleContext)_localctx, actionIndex); break;

		case 7: K_action((RuleContext)_localctx, actionIndex); break;

		case 16: PERCENT_action((RuleContext)_localctx, actionIndex); break;

		case 18: WS_TEMPO_action((RuleContext)_localctx, actionIndex); break;

		case 21: TEMPO_NUMBER_action((RuleContext)_localctx, actionIndex); break;

		case 22: TITLE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 23: END_TITLE_action((RuleContext)_localctx, actionIndex); break;

		case 24: COMPOSER_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 25: END_COMPOSER_action((RuleContext)_localctx, actionIndex); break;

		case 26: VOICE_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 27: END_VOICE_action((RuleContext)_localctx, actionIndex); break;

		case 28: COMMENT_TEXT_action((RuleContext)_localctx, actionIndex); break;

		case 29: END_COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 30: WS_KEY_action((RuleContext)_localctx, actionIndex); break;

		case 31: KEY_NOTE_action((RuleContext)_localctx, actionIndex); break;

		case 32: WS_INDEX_action((RuleContext)_localctx, actionIndex); break;

		case 33: INDEX_action((RuleContext)_localctx, actionIndex); break;

		case 34: WS_METER_action((RuleContext)_localctx, actionIndex); break;

		case 35: METER_VARIANTS_action((RuleContext)_localctx, actionIndex); break;

		case 36: METER_FRACTION_action((RuleContext)_localctx, actionIndex); break;

		case 37: WS_LENGTH_action((RuleContext)_localctx, actionIndex); break;

		case 38: LENGTH_FRACTION_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void VOICE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: popMode();  break;
		}
	}
	private void WS_METER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: skip();  break;
		}
	}
	private void LENGTH_FRACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: popMode();  break;
		}
	}
	private void PERCENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: pushMode(enter_comment);  break;
		}
	}
	private void C_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: pushMode(enter_composer);  break;
		}
	}
	private void L_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: pushMode(enter_length);  break;
		}
	}
	private void M_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: pushMode(enter_meter);  break;
		}
	}
	private void END_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: popMode();  break;
		}
	}
	private void WS_TEMPO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: skip();  break;
		}
	}
	private void K_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: pushMode(enter_key);  break;
		}
	}
	private void TEMPO_NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: popMode();  break;
		}
	}
	private void T_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: pushMode(enter_title);  break;
		}
	}
	private void WS_KEY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: skip();  break;
		}
	}
	private void V_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: pushMode(enter_voice);  break;
		}
	}
	private void Q_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: pushMode(enter_tempo);  break;
		}
	}
	private void METER_VARIANTS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: popMode();  break;
		}
	}
	private void KEY_NOTE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: popMode();  break;
		}
	}
	private void WS_INDEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: skip();  break;
		}
	}
	private void COMMENT_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: popMode();  break;
		}
	}
	private void METER_FRACTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: popMode();  break;
		}
	}
	private void X_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: pushMode(enter_index);  break;
		}
	}
	private void INDEX_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: popMode();  break;
		}
	}
	private void END_COMPOSER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: popMode();  break;
		}
	}
	private void END_TITLE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: popMode();  break;
		}
	}
	private void COMPOSER_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: popMode();  break;
		}
	}
	private void END_VOICE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: popMode();  break;
		}
	}
	private void WS_LENGTH_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: skip();  break;
		}
	}
	private void TITLE_TEXT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: popMode();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4)\u0132\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4"+
		"\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t"+
		"\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23"+
		"\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32"+
		"\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\""+
		"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\6\17\u008e\n\17\r\17\16\17\u008f"+
		"\3\20\6\20\u0093\n\20\r\20\16\20\u0094\3\21\3\21\3\21\5\21\u009a\n\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\6\25\u00a7\n\25"+
		"\r\25\16\25\u00a8\3\25\3\25\6\25\u00ad\n\25\r\25\16\25\u00ae\3\26\3\26"+
		"\3\27\6\27\u00b4\n\27\r\27\16\27\u00b5\3\27\3\27\3\30\6\30\u00bb\n\30"+
		"\r\30\16\30\u00bc\3\30\3\30\3\31\3\31\3\31\5\31\u00c4\n\31\3\31\3\31\3"+
		"\32\6\32\u00c9\n\32\r\32\16\32\u00ca\3\32\3\32\3\33\3\33\3\33\5\33\u00d2"+
		"\n\33\3\33\3\33\3\34\6\34\u00d7\n\34\r\34\16\34\u00d8\3\34\3\34\3\35\3"+
		"\35\3\35\5\35\u00e0\n\35\3\35\3\35\3\36\6\36\u00e5\n\36\r\36\16\36\u00e6"+
		"\3\36\3\36\3\37\3\37\3\37\5\37\u00ee\n\37\3\37\3\37\3 \3 \3 \3 \3!\3!"+
		"\5!\u00f8\n!\3!\5!\u00fb\n!\3!\3!\3\"\3\"\3\"\3\"\3#\6#\u0104\n#\r#\16"+
		"#\u0105\3#\3#\3$\3$\3$\3$\3%\3%\3%\5%\u0111\n%\3%\3%\3&\6&\u0116\n&\r"+
		"&\16&\u0117\3&\3&\6&\u011c\n&\r&\16&\u011d\3&\3&\3\'\3\'\3\'\3\'\3(\6"+
		"(\u0127\n(\r(\16(\u0128\3(\3(\6(\u012d\n(\r(\16(\u012e\3(\3(\2)\f\3\2"+
		"\16\4\3\20\5\4\22\6\5\24\7\6\26\b\7\30\t\b\32\n\t\34\13\1\36\f\1 \r\1"+
		"\"\16\1$\17\1&\20\1(\21\1*\22\1,\23\n.\24\1\60\25\13\62\26\1\64\27\1\66"+
		"\30\f8\31\r:\32\16<\33\17>\34\20@\35\21B\36\22D\37\23F \24H!\25J\"\26"+
		"L#\27N$\30P%\31R&\32T\'\33V(\34X)\35\f\2\3\4\5\6\7\b\t\n\13\34\4CIci\4"+
		"%%dd\4))..\3\62;\4\f\f\17\17\3\"\"\3\62;\3\62;\3\62;\4\f\f\17\17\4\f\f"+
		"\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f\f\17\17\4\f"+
		"\f\17\17\3\"\"\3\"\"\3\62;\3\"\"\3\62;\3\62;\3\"\"\3\62;\3\62;\u013e\2"+
		"\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3"+
		"\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2"+
		"\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2"+
		".\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\48\3\2\2"+
		"\2\4:\3\2\2\2\5<\3\2\2\2\5>\3\2\2\2\6@\3\2\2\2\6B\3\2\2\2\7D\3\2\2\2\7"+
		"F\3\2\2\2\bH\3\2\2\2\bJ\3\2\2\2\tL\3\2\2\2\tN\3\2\2\2\nP\3\2\2\2\nR\3"+
		"\2\2\2\nT\3\2\2\2\13V\3\2\2\2\13X\3\2\2\2\fZ\3\2\2\2\16_\3\2\2\2\20d\3"+
		"\2\2\2\22i\3\2\2\2\24n\3\2\2\2\26s\3\2\2\2\30x\3\2\2\2\32}\3\2\2\2\34"+
		"\u0082\3\2\2\2\36\u0084\3\2\2\2 \u0086\3\2\2\2\"\u0088\3\2\2\2$\u008a"+
		"\3\2\2\2&\u008d\3\2\2\2(\u0092\3\2\2\2*\u0099\3\2\2\2,\u009b\3\2\2\2."+
		"\u009f\3\2\2\2\60\u00a1\3\2\2\2\62\u00a6\3\2\2\2\64\u00b0\3\2\2\2\66\u00b3"+
		"\3\2\2\28\u00ba\3\2\2\2:\u00c3\3\2\2\2<\u00c8\3\2\2\2>\u00d1\3\2\2\2@"+
		"\u00d6\3\2\2\2B\u00df\3\2\2\2D\u00e4\3\2\2\2F\u00ed\3\2\2\2H\u00f1\3\2"+
		"\2\2J\u00f5\3\2\2\2L\u00fe\3\2\2\2N\u0103\3\2\2\2P\u0109\3\2\2\2R\u0110"+
		"\3\2\2\2T\u0115\3\2\2\2V\u0121\3\2\2\2X\u0126\3\2\2\2Z[\7Z\2\2[\\\7<\2"+
		"\2\\]\3\2\2\2]^\b\2\2\2^\r\3\2\2\2_`\7V\2\2`a\7<\2\2ab\3\2\2\2bc\b\3\3"+
		"\2c\17\3\2\2\2de\7E\2\2ef\7<\2\2fg\3\2\2\2gh\b\4\4\2h\21\3\2\2\2ij\7N"+
		"\2\2jk\7<\2\2kl\3\2\2\2lm\b\5\5\2m\23\3\2\2\2no\7O\2\2op\7<\2\2pq\3\2"+
		"\2\2qr\b\6\6\2r\25\3\2\2\2st\7S\2\2tu\7<\2\2uv\3\2\2\2vw\b\7\7\2w\27\3"+
		"\2\2\2xy\7X\2\2yz\7<\2\2z{\3\2\2\2{|\b\b\b\2|\31\3\2\2\2}~\7M\2\2~\177"+
		"\7<\2\2\177\u0080\3\2\2\2\u0080\u0081\b\t\t\2\u0081\33\3\2\2\2\u0082\u0083"+
		"\t\2\2\2\u0083\35\3\2\2\2\u0084\u0085\t\3\2\2\u0085\37\3\2\2\2\u0086\u0087"+
		"\7o\2\2\u0087!\3\2\2\2\u0088\u0089\7?\2\2\u0089#\3\2\2\2\u008a\u008b\7"+
		"\"\2\2\u008b%\3\2\2\2\u008c\u008e\t\4\2\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\'\3\2\2\2\u0091"+
		"\u0093\t\5\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095)\3\2\2\2\u0096\u009a\t\6\2\2\u0097\u0098"+
		"\7\17\2\2\u0098\u009a\7\f\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2"+
		"\u009a+\3\2\2\2\u009b\u009c\7\'\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b"+
		"\22\n\2\u009e-\3\2\2\2\u009f\u00a0\7<\2\2\u00a0/\3\2\2\2\u00a1\u00a2\t"+
		"\7\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\24\13\2\u00a4\61\3\2\2\2\u00a5"+
		"\u00a7\t\b\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\7\61\2\2\u00ab"+
		"\u00ad\t\t\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\63\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\65"+
		"\3\2\2\2\u00b2\u00b4\t\n\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\b\27"+
		"\f\2\u00b8\67\3\2\2\2\u00b9\u00bb\n\13\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\b\30\r\2\u00bf9\3\2\2\2\u00c0\u00c4\t\f\2\2\u00c1\u00c2\7\17\2"+
		"\2\u00c2\u00c4\7\f\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\b\31\16\2\u00c6;\3\2\2\2\u00c7\u00c9\n\r\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\32\17\2\u00cd=\3\2\2\2\u00ce\u00d2"+
		"\t\16\2\2\u00cf\u00d0\7\17\2\2\u00d0\u00d2\7\f\2\2\u00d1\u00ce\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\b\33\20\2\u00d4?"+
		"\3\2\2\2\u00d5\u00d7\n\17\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\b\34\21\2\u00dbA\3\2\2\2\u00dc\u00e0\t\20\2\2\u00dd\u00de\7\17\2\2\u00de"+
		"\u00e0\7\f\2\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\b\35\22\2\u00e2C\3\2\2\2\u00e3\u00e5\n\21\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\b\36\23\2\u00e9E\3\2\2\2\u00ea\u00ee\t\22\2"+
		"\2\u00eb\u00ec\7\17\2\2\u00ec\u00ee\7\f\2\2\u00ed\u00ea\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\b\37\24\2\u00f0G\3\2\2"+
		"\2\u00f1\u00f2\t\23\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b \25\2\u00f4"+
		"I\3\2\2\2\u00f5\u00f7\5\34\n\2\u00f6\u00f8\5\36\13\2\u00f7\u00f6\3\2\2"+
		"\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00fb\5 \f\2\u00fa\u00f9"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\b!\26\2\u00fd"+
		"K\3\2\2\2\u00fe\u00ff\t\24\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\"\27"+
		"\2\u0101M\3\2\2\2\u0102\u0104\t\25\2\2\u0103\u0102\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\b#\30\2\u0108O\3\2\2\2\u0109\u010a\t\26\2\2\u010a\u010b\3\2\2\2"+
		"\u010b\u010c\b$\31\2\u010cQ\3\2\2\2\u010d\u0111\7E\2\2\u010e\u010f\7E"+
		"\2\2\u010f\u0111\7~\2\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0113\b%\32\2\u0113S\3\2\2\2\u0114\u0116\t\27\2\2"+
		"\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\61\2\2\u011a\u011c\t\30\2\2"+
		"\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b&\33\2\u0120U\3\2\2\2\u0121"+
		"\u0122\t\31\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\'\34\2\u0124W\3\2\2"+
		"\2\u0125\u0127\t\32\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\7\61"+
		"\2\2\u012b\u012d\t\33\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\b("+
		"\35\2\u0131Y\3\2\2\2\"\2\3\4\5\6\7\b\t\n\13\u008f\u0094\u0099\u00a8\u00ae"+
		"\u00b5\u00bc\u00c3\u00ca\u00d1\u00d8\u00df\u00e6\u00ed\u00f7\u00fa\u0105"+
		"\u0110\u0117\u011d\u0128\u012e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}