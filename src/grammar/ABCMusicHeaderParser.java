// Generated from ABCMusicHeaderParser.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ABCMusicHeaderParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOICE_TEXT=25, PERCENT=18, C=3, BASE_NOTE=10, L=4, M=5, K=8, T=2, OCTAVE=15, 
		W=9, V=7, Q=6, EQUALS=14, KEY_NOTE=13, METER_VARIANTS=19, COMMENT_TEXT=26, 
		KEY_ACCIDENTAL=11, METER_FRACTION=20, MODE_MINOR=12, X=1, COLON=21, COMPOSER_TEXT=24, 
		LINE_FEED=17, DIGIT=16, TITLE_TEXT=23, TEMPO=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
		"'w:'", "BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "KEY_NOTE", "'='", "OCTAVE", 
		"DIGIT", "LINE_FEED", "'%'", "METER_VARIANTS", "METER_FRACTION", "':'", 
		"TEMPO", "TITLE_TEXT", "COMPOSER_TEXT", "VOICE_TEXT", "COMMENT_TEXT"
	};
	public static final int
		RULE_abc_tune_header = 0, RULE_abc_header = 1, RULE_field_number = 2, 
		RULE_field_title = 3, RULE_other_fields = 4, RULE_field_composer = 5, 
		RULE_field_default_length = 6, RULE_field_meter = 7, RULE_field_tempo = 8, 
		RULE_field_voice = 9, RULE_field_key = 10, RULE_eol = 11, RULE_meter = 12, 
		RULE_tempo = 13, RULE_voice_text = 14, RULE_meter_fraction = 15, RULE_composer_text = 16, 
		RULE_title_text = 17, RULE_number = 18, RULE_key_note = 19, RULE_comment = 20;
	public static final String[] ruleNames = {
		"abc_tune_header", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "eol", "meter", "tempo", "voice_text", "meter_fraction", 
		"composer_text", "title_text", "number", "key_note", "comment"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusicHeaderParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public ABCMusicHeaderParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_tune_headerContext extends ParserRuleContext {
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicHeaderParser.EOF, 0); }
		public Abc_tune_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterAbc_tune_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitAbc_tune_header(this);
		}
	}

	public final Abc_tune_headerContext abc_tune_header() throws RecognitionException {
		Abc_tune_headerContext _localctx = new Abc_tune_headerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); abc_header();
			setState(43); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abc_headerContext extends ParserRuleContext {
		public Field_keyContext field_key() {
			return getRuleContext(Field_keyContext.class,0);
		}
		public List<Other_fieldsContext> other_fields() {
			return getRuleContexts(Other_fieldsContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public Field_titleContext field_title() {
			return getRuleContext(Field_titleContext.class,0);
		}
		public Abc_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45); field_number();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT) {
				{
				{
				setState(46); comment();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); field_title();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(53); other_fields();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); field_key();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_numberContext extends ParserRuleContext {
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode X() { return getToken(ABCMusicHeaderParser.X, 0); }
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(X);
			setState(62); number();
			setState(63); eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_titleContext extends ParserRuleContext {
		public TerminalNode T() { return getToken(ABCMusicHeaderParser.T, 0); }
		public Title_textContext title_text() {
			return getRuleContext(Title_textContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(T);
			setState(66); title_text();
			setState(67); eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_fieldsContext extends ParserRuleContext {
		public Field_tempoContext field_tempo() {
			return getRuleContext(Field_tempoContext.class,0);
		}
		public Field_default_lengthContext field_default_length() {
			return getRuleContext(Field_default_lengthContext.class,0);
		}
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Field_composerContext field_composer() {
			return getRuleContext(Field_composerContext.class,0);
		}
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Other_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_other_fields);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case C:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); field_composer();
				}
				break;
			case L:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); field_default_length();
				}
				break;
			case M:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); field_meter();
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); field_tempo();
				}
				break;
			case V:
				enterOuterAlt(_localctx, 5);
				{
				setState(73); field_voice();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(74); comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_composerContext extends ParserRuleContext {
		public Composer_textContext composer_text() {
			return getRuleContext(Composer_textContext.class,0);
		}
		public TerminalNode C() { return getToken(ABCMusicHeaderParser.C, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(C);
			setState(78); composer_text();
			setState(79); eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_default_lengthContext extends ParserRuleContext {
		public TerminalNode L() { return getToken(ABCMusicHeaderParser.L, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Meter_fractionContext meter_fraction() {
			return getRuleContext(Meter_fractionContext.class,0);
		}
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(L);
			setState(82); meter_fraction();
			setState(83); eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_meterContext extends ParserRuleContext {
		public MeterContext meter() {
			return getRuleContext(MeterContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode M() { return getToken(ABCMusicHeaderParser.M, 0); }
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(M);
			setState(86); meter();
			setState(87); eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_tempoContext extends ParserRuleContext {
		public TerminalNode Q() { return getToken(ABCMusicHeaderParser.Q, 0); }
		public TempoContext tempo() {
			return getRuleContext(TempoContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(Q);
			setState(90); tempo();
			setState(91); eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_voiceContext extends ParserRuleContext {
		public TerminalNode V() { return getToken(ABCMusicHeaderParser.V, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Voice_textContext voice_text() {
			return getRuleContext(Voice_textContext.class,0);
		}
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); match(V);
			setState(94); voice_text();
			setState(95); eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_keyContext extends ParserRuleContext {
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Key_noteContext key_note() {
			return getRuleContext(Key_noteContext.class,0);
		}
		public TerminalNode K() { return getToken(ABCMusicHeaderParser.K, 0); }
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(K);
			setState(98); key_note();
			setState(99); eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public TerminalNode LINE_FEED() { return getToken(ABCMusicHeaderParser.LINE_FEED, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eol);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case PERCENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); comment();
				}
				break;
			case LINE_FEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); match(LINE_FEED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MeterContext extends ParserRuleContext {
		public TerminalNode METER_VARIANTS() { return getToken(ABCMusicHeaderParser.METER_VARIANTS, 0); }
		public TerminalNode METER_FRACTION() { return getToken(ABCMusicHeaderParser.METER_FRACTION, 0); }
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_meter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(_la==METER_VARIANTS || _la==METER_FRACTION) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TempoContext extends ParserRuleContext {
		public TerminalNode TEMPO() { return getToken(ABCMusicHeaderParser.TEMPO, 0); }
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterTempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitTempo(this);
		}
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(TEMPO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Voice_textContext extends ParserRuleContext {
		public List<TerminalNode> VOICE_TEXT() { return getTokens(ABCMusicHeaderParser.VOICE_TEXT); }
		public TerminalNode VOICE_TEXT(int i) {
			return getToken(ABCMusicHeaderParser.VOICE_TEXT, i);
		}
		public Voice_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterVoice_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitVoice_text(this);
		}
	}

	public final Voice_textContext voice_text() throws RecognitionException {
		Voice_textContext _localctx = new Voice_textContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_voice_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109); match(VOICE_TEXT);
				}
				}
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOICE_TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Meter_fractionContext extends ParserRuleContext {
		public TerminalNode METER_FRACTION() { return getToken(ABCMusicHeaderParser.METER_FRACTION, 0); }
		public Meter_fractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterMeter_fraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitMeter_fraction(this);
		}
	}

	public final Meter_fractionContext meter_fraction() throws RecognitionException {
		Meter_fractionContext _localctx = new Meter_fractionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_meter_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(METER_FRACTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Composer_textContext extends ParserRuleContext {
		public TerminalNode COMPOSER_TEXT(int i) {
			return getToken(ABCMusicHeaderParser.COMPOSER_TEXT, i);
		}
		public List<TerminalNode> COMPOSER_TEXT() { return getTokens(ABCMusicHeaderParser.COMPOSER_TEXT); }
		public Composer_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_composer_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterComposer_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitComposer_text(this);
		}
	}

	public final Composer_textContext composer_text() throws RecognitionException {
		Composer_textContext _localctx = new Composer_textContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_composer_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116); match(COMPOSER_TEXT);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMPOSER_TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Title_textContext extends ParserRuleContext {
		public List<TerminalNode> TITLE_TEXT() { return getTokens(ABCMusicHeaderParser.TITLE_TEXT); }
		public TerminalNode TITLE_TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TITLE_TEXT, i);
		}
		public Title_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterTitle_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitTitle_text(this);
		}
	}

	public final Title_textContext title_text() throws RecognitionException {
		Title_textContext _localctx = new Title_textContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_title_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(121); match(TITLE_TEXT);
				}
				}
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TITLE_TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ABCMusicHeaderParser.DIGIT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(DIGIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Key_noteContext extends ParserRuleContext {
		public TerminalNode KEY_NOTE() { return getToken(ABCMusicHeaderParser.KEY_NOTE, 0); }
		public Key_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterKey_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitKey_note(this);
		}
	}

	public final Key_noteContext key_note() throws RecognitionException {
		Key_noteContext _localctx = new Key_noteContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_key_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(KEY_NOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode LINE_FEED() { return getToken(ABCMusicHeaderParser.LINE_FEED, 0); }
		public List<TerminalNode> COMMENT_TEXT() { return getTokens(ABCMusicHeaderParser.COMMENT_TEXT); }
		public TerminalNode PERCENT() { return getToken(ABCMusicHeaderParser.PERCENT, 0); }
		public TerminalNode COMMENT_TEXT(int i) {
			return getToken(ABCMusicHeaderParser.COMMENT_TEXT, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(PERCENT);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
				setState(131); match(COMMENT_TEXT);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137); match(LINE_FEED);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\34\u008e\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3"+
		"\2\3\2\3\3\3\3\7\3\62\n\3\f\3\16\3\65\13\3\3\3\3\3\7\39\n\3\f\3\16\3<"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6N\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\rj\n\r\3\16\3\16\3"+
		"\17\3\17\3\20\6\20q\n\20\r\20\16\20r\3\21\3\21\3\22\6\22x\n\22\r\22\16"+
		"\22y\3\23\6\23}\n\23\r\23\16\23~\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u0087"+
		"\n\26\f\26\16\26\u008a\13\26\3\26\3\26\3\26\2\27\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*\2\3\3\25\26\u0084\2,\3\2\2\2\4/\3\2\2\2\6?\3"+
		"\2\2\2\bC\3\2\2\2\nM\3\2\2\2\fO\3\2\2\2\16S\3\2\2\2\20W\3\2\2\2\22[\3"+
		"\2\2\2\24_\3\2\2\2\26c\3\2\2\2\30i\3\2\2\2\32k\3\2\2\2\34m\3\2\2\2\36"+
		"p\3\2\2\2 t\3\2\2\2\"w\3\2\2\2$|\3\2\2\2&\u0080\3\2\2\2(\u0082\3\2\2\2"+
		"*\u0084\3\2\2\2,-\5\4\3\2-.\7\1\2\2.\3\3\2\2\2/\63\5\6\4\2\60\62\5*\26"+
		"\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2"+
		"\2\65\63\3\2\2\2\66:\5\b\5\2\679\5\n\6\28\67\3\2\2\29<\3\2\2\2:8\3\2\2"+
		"\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\5\26\f\2>\5\3\2\2\2?@\7\3\2\2@A\5&"+
		"\24\2AB\5\30\r\2B\7\3\2\2\2CD\7\4\2\2DE\5$\23\2EF\5\30\r\2F\t\3\2\2\2"+
		"GN\5\f\7\2HN\5\16\b\2IN\5\20\t\2JN\5\22\n\2KN\5\24\13\2LN\5*\26\2MG\3"+
		"\2\2\2MH\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\13\3\2\2\2O"+
		"P\7\5\2\2PQ\5\"\22\2QR\5\30\r\2R\r\3\2\2\2ST\7\6\2\2TU\5 \21\2UV\5\30"+
		"\r\2V\17\3\2\2\2WX\7\7\2\2XY\5\32\16\2YZ\5\30\r\2Z\21\3\2\2\2[\\\7\b\2"+
		"\2\\]\5\34\17\2]^\5\30\r\2^\23\3\2\2\2_`\7\t\2\2`a\5\36\20\2ab\5\30\r"+
		"\2b\25\3\2\2\2cd\7\n\2\2de\5(\25\2ef\5\30\r\2f\27\3\2\2\2gj\5*\26\2hj"+
		"\7\23\2\2ig\3\2\2\2ih\3\2\2\2j\31\3\2\2\2kl\t\2\2\2l\33\3\2\2\2mn\7\30"+
		"\2\2n\35\3\2\2\2oq\7\33\2\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\37"+
		"\3\2\2\2tu\7\26\2\2u!\3\2\2\2vx\7\32\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2"+
		"yz\3\2\2\2z#\3\2\2\2{}\7\31\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177%\3\2\2\2\u0080\u0081\7\22\2\2\u0081\'\3\2\2\2\u0082\u0083\7\17"+
		"\2\2\u0083)\3\2\2\2\u0084\u0088\7\24\2\2\u0085\u0087\7\34\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\23\2\2\u008c+\3\2\2\2"+
		"\n\63:Miry~\u0088";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}