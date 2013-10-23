// Generated from ABCMusicHeader.g4 by ANTLR 4.0

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
		X=1, T=2, C=3, L=4, M=5, Q=6, V=7, K=8, W=9, BASE_NOTE=10, KEY_ACCIDENTAL=11, 
		MODE_MINOR=12, EQUALS=13, OCTAVE=14, DIGIT=15, SPACE=16, LINE_FEED=17, 
		PERCENT=18, METER_VARIANTS=19, METER_FRACTION=20, TEXT=21, COLON=22, TEMPO=23, 
		COMMENT=24;
	public static final String[] tokenNames = {
		"<INVALID>", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
		"'w:'", "BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "'='", "OCTAVE", "DIGIT", 
		"' '", "LINE_FEED", "'%'", "METER_VARIANTS", "METER_FRACTION", "TEXT", 
		"':'", "TEMPO", "COMMENT"
	};
	public static final int
		RULE_abc_tune_header = 0, RULE_abc_header = 1, RULE_field_number = 2, 
		RULE_field_title = 3, RULE_other_fields = 4, RULE_field_composer = 5, 
		RULE_field_default_length = 6, RULE_field_meter = 7, RULE_field_tempo = 8, 
		RULE_field_voice = 9, RULE_field_key = 10, RULE_eol = 11, RULE_meter = 12, 
		RULE_key = 13, RULE_key_note = 14;
	public static final String[] ruleNames = {
		"abc_tune_header", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "eol", "meter", "key", "key_note"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusicHeader.g4"; }

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
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterAbc_tune_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitAbc_tune_header(this);
		}
	}

	public final Abc_tune_headerContext abc_tune_header() throws RecognitionException {
		Abc_tune_headerContext _localctx = new Abc_tune_headerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); abc_header();
			setState(31); match(EOF);
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
		public List<TerminalNode> COMMENT() { return getTokens(ABCMusicHeaderParser.COMMENT); }
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(ABCMusicHeaderParser.COMMENT, i);
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
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); field_number();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(34); match(COMMENT);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40); field_title();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(41); other_fields();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47); field_key();
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
		public TerminalNode DIGIT() { return getToken(ABCMusicHeaderParser.DIGIT, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode X() { return getToken(ABCMusicHeaderParser.X, 0); }
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(X);
			setState(50); match(DIGIT);
			setState(51); eol();
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
		public List<TerminalNode> COLON() { return getTokens(ABCMusicHeaderParser.COLON); }
		public TerminalNode T() { return getToken(ABCMusicHeaderParser.T, 0); }
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicHeaderParser.TEXT); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(ABCMusicHeaderParser.COLON, i);
		}
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_title);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(T);
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==COLON );
			setState(59); eol();
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
		public TerminalNode COMMENT() { return getToken(ABCMusicHeaderParser.COMMENT, 0); }
		public Field_meterContext field_meter() {
			return getRuleContext(Field_meterContext.class,0);
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
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_other_fields);
		try {
			setState(67);
			switch (_input.LA(1)) {
			case C:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); field_composer();
				}
				break;
			case L:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); field_default_length();
				}
				break;
			case M:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); field_meter();
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); field_tempo();
				}
				break;
			case V:
				enterOuterAlt(_localctx, 5);
				{
				setState(65); field_voice();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(66); match(COMMENT);
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
		public List<TerminalNode> COLON() { return getTokens(ABCMusicHeaderParser.COLON); }
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicHeaderParser.TEXT); }
		public TerminalNode C() { return getToken(ABCMusicHeaderParser.C, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(ABCMusicHeaderParser.COLON, i);
		}
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_composer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); match(C);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==COLON );
			setState(75); eol();
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
		public TerminalNode METER_FRACTION() { return getToken(ABCMusicHeaderParser.METER_FRACTION, 0); }
		public TerminalNode L() { return getToken(ABCMusicHeaderParser.L, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(L);
			setState(78); match(METER_FRACTION);
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
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(M);
			setState(82); meter();
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

	public static class Field_tempoContext extends ParserRuleContext {
		public TerminalNode Q() { return getToken(ABCMusicHeaderParser.Q, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode TEMPO() { return getToken(ABCMusicHeaderParser.TEMPO, 0); }
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(Q);
			setState(86); match(TEMPO);
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

	public static class Field_voiceContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(ABCMusicHeaderParser.COLON); }
		public TerminalNode V() { return getToken(ABCMusicHeaderParser.V, 0); }
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicHeaderParser.TEXT); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode COLON(int i) {
			return getToken(ABCMusicHeaderParser.COLON, i);
		}
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_voice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(V);
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==COLON );
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
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public TerminalNode K() { return getToken(ABCMusicHeaderParser.K, 0); }
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(K);
			setState(98); key();
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
		public TerminalNode COMMENT() { return getToken(ABCMusicHeaderParser.COMMENT, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==LINE_FEED || _la==COMMENT) ) {
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

	public static class MeterContext extends ParserRuleContext {
		public TerminalNode METER_VARIANTS() { return getToken(ABCMusicHeaderParser.METER_VARIANTS, 0); }
		public TerminalNode METER_FRACTION() { return getToken(ABCMusicHeaderParser.METER_FRACTION, 0); }
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_meter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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

	public static class KeyContext extends ParserRuleContext {
		public TerminalNode MODE_MINOR() { return getToken(ABCMusicHeaderParser.MODE_MINOR, 0); }
		public Key_noteContext key_note() {
			return getRuleContext(Key_noteContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); key_note();
			setState(107);
			_la = _input.LA(1);
			if (_la==MODE_MINOR) {
				{
				setState(106); match(MODE_MINOR);
				}
			}

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
		public TerminalNode KEY_ACCIDENTAL() { return getToken(ABCMusicHeaderParser.KEY_ACCIDENTAL, 0); }
		public TerminalNode BASE_NOTE() { return getToken(ABCMusicHeaderParser.BASE_NOTE, 0); }
		public Key_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterKey_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitKey_note(this);
		}
	}

	public final Key_noteContext key_note() throws RecognitionException {
		Key_noteContext _localctx = new Key_noteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_key_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(BASE_NOTE);
			setState(111);
			_la = _input.LA(1);
			if (_la==KEY_ACCIDENTAL) {
				{
				setState(110); match(KEY_ACCIDENTAL);
				}
			}

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
		"\2\3\32t\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2"+
		"\3\2\3\2\3\3\3\3\7\3&\n\3\f\3\16\3)\13\3\3\3\3\3\7\3-\n\3\f\3\16\3\60"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6F\n\6\3\7\3\7\6\7J\n\7\r\7\16\7K\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\6\13^\n\13\r\13\16"+
		"\13_\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\5\17n\n\17"+
		"\3\20\3\20\5\20r\n\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		"\2\7\3\27\30\3\27\30\3\27\30\4\23\23\32\32\3\25\26p\2 \3\2\2\2\4#\3\2"+
		"\2\2\6\63\3\2\2\2\b\67\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16O\3\2\2\2\20S\3"+
		"\2\2\2\22W\3\2\2\2\24[\3\2\2\2\26c\3\2\2\2\30g\3\2\2\2\32i\3\2\2\2\34"+
		"k\3\2\2\2\36o\3\2\2\2 !\5\4\3\2!\"\7\1\2\2\"\3\3\2\2\2#\'\5\6\4\2$&\7"+
		"\32\2\2%$\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2\2\2"+
		"*.\5\b\5\2+-\5\n\6\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2"+
		"\2\2\60.\3\2\2\2\61\62\5\26\f\2\62\5\3\2\2\2\63\64\7\3\2\2\64\65\7\21"+
		"\2\2\65\66\5\30\r\2\66\7\3\2\2\2\679\7\4\2\28:\t\2\2\298\3\2\2\2:;\3\2"+
		"\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\5\30\r\2>\t\3\2\2\2?F\5\f\7\2@F\5"+
		"\16\b\2AF\5\20\t\2BF\5\22\n\2CF\5\24\13\2DF\7\32\2\2E?\3\2\2\2E@\3\2\2"+
		"\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\13\3\2\2\2GI\7\5\2\2HJ\t\3"+
		"\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\5\30\r\2N\r\3"+
		"\2\2\2OP\7\6\2\2PQ\7\26\2\2QR\5\30\r\2R\17\3\2\2\2ST\7\7\2\2TU\5\32\16"+
		"\2UV\5\30\r\2V\21\3\2\2\2WX\7\b\2\2XY\7\31\2\2YZ\5\30\r\2Z\23\3\2\2\2"+
		"[]\7\t\2\2\\^\t\4\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`a\3\2\2"+
		"\2ab\5\30\r\2b\25\3\2\2\2cd\7\n\2\2de\5\34\17\2ef\5\30\r\2f\27\3\2\2\2"+
		"gh\t\5\2\2h\31\3\2\2\2ij\t\6\2\2j\33\3\2\2\2km\5\36\20\2ln\7\16\2\2ml"+
		"\3\2\2\2mn\3\2\2\2n\35\3\2\2\2oq\7\f\2\2pr\7\r\2\2qp\3\2\2\2qr\3\2\2\2"+
		"r\37\3\2\2\2\n\'.;EK_mq";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}