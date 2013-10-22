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
		MODE_MINOR=12, NOTE_LENGTH_STRICT=13, EQUALS=14, OCTAVE=15, DIVIDE=16, 
		DIGIT=17, SPACE=18, LINE_FEED=19, PERCENT=20, TEXT=21, COLON=22, METER_VARIANTS=23, 
		METER_FRACTION=24, METER=25, TEMPO=26, KEY=27, KEY_NOTE=28, COMMENT=29, 
		EOL=30;
	public static final String[] tokenNames = {
		"<INVALID>", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
		"'w:'", "BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "NOTE_LENGTH_STRICT", "'='", 
		"OCTAVE", "'/'", "DIGIT", "' '", "LINE_FEED", "'%'", "TEXT", "':'", "METER_VARIANTS", 
		"METER_FRACTION", "METER", "TEMPO", "KEY", "KEY_NOTE", "COMMENT", "EOL"
	};
	public static final int
		RULE_abc_tune_header = 0, RULE_abc_header = 1, RULE_field_number = 2, 
		RULE_field_title = 3, RULE_other_fields = 4, RULE_field_composer = 5, 
		RULE_field_default_length = 6, RULE_field_meter = 7, RULE_field_tempo = 8, 
		RULE_field_voice = 9, RULE_field_key = 10;
	public static final String[] ruleNames = {
		"abc_tune_header", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key"
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
			setState(22); abc_header();
			setState(23); match(EOF);
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
			setState(25); field_number();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(26); match(COMMENT);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32); field_title();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(33); other_fields();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39); field_key();
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
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicHeaderParser.DIGIT, i);
		}
		public TerminalNode EOL() { return getToken(ABCMusicHeaderParser.EOL, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicHeaderParser.DIGIT); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(X);
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42); match(DIGIT);
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(47); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicHeaderParser.EOL, 0); }
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicHeaderParser.TEXT); }
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
			setState(49); match(T);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==COLON );
			setState(55); match(EOL);
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
			setState(63);
			switch (_input.LA(1)) {
			case C:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); field_composer();
				}
				break;
			case L:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); field_default_length();
				}
				break;
			case M:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); field_meter();
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 4);
				{
				setState(60); field_tempo();
				}
				break;
			case V:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); field_voice();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(62); match(COMMENT);
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
		public TerminalNode EOL() { return getToken(ABCMusicHeaderParser.EOL, 0); }
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicHeaderParser.TEXT); }
		public TerminalNode C() { return getToken(ABCMusicHeaderParser.C, 0); }
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
			setState(65); match(C);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==COLON );
			setState(71); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicHeaderParser.EOL, 0); }
		public TerminalNode NOTE_LENGTH_STRICT() { return getToken(ABCMusicHeaderParser.NOTE_LENGTH_STRICT, 0); }
		public TerminalNode L() { return getToken(ABCMusicHeaderParser.L, 0); }
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
			setState(73); match(L);
			setState(74); match(NOTE_LENGTH_STRICT);
			setState(75); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicHeaderParser.EOL, 0); }
		public TerminalNode METER() { return getToken(ABCMusicHeaderParser.METER, 0); }
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
			setState(77); match(M);
			setState(78); match(METER);
			setState(79); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicHeaderParser.EOL, 0); }
		public TerminalNode Q() { return getToken(ABCMusicHeaderParser.Q, 0); }
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
			setState(81); match(Q);
			setState(82); match(TEMPO);
			setState(83); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicHeaderParser.EOL, 0); }
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicHeaderParser.TEXT); }
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
			setState(85); match(V);
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==COLON) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT || _la==COLON );
			setState(91); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicHeaderParser.EOL, 0); }
		public TerminalNode KEY() { return getToken(ABCMusicHeaderParser.KEY, 0); }
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
			setState(93); match(K);
			setState(94); match(KEY);
			setState(95); match(EOL);
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
		"\2\3 d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\7\3\36\n\3\f\3\16\3!\13"+
		"\3\3\3\3\3\7\3%\n\3\f\3\16\3(\13\3\3\3\3\3\3\4\3\4\6\4.\n\4\r\4\16\4/"+
		"\3\4\3\4\3\5\3\5\6\5\66\n\5\r\5\16\5\67\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6B\n\6\3\7\3\7\6\7F\n\7\r\7\16\7G\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\6\13Z\n\13\r\13\16\13[\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\2\r\2\4\6\b\n\f\16\20\22\24\26\2\5\3\27\30\3\27\30"+
		"\3\27\30c\2\30\3\2\2\2\4\33\3\2\2\2\6+\3\2\2\2\b\63\3\2\2\2\nA\3\2\2\2"+
		"\fC\3\2\2\2\16K\3\2\2\2\20O\3\2\2\2\22S\3\2\2\2\24W\3\2\2\2\26_\3\2\2"+
		"\2\30\31\5\4\3\2\31\32\7\1\2\2\32\3\3\2\2\2\33\37\5\6\4\2\34\36\7\37\2"+
		"\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37"+
		"\3\2\2\2\"&\5\b\5\2#%\5\n\6\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2"+
		"\')\3\2\2\2(&\3\2\2\2)*\5\26\f\2*\5\3\2\2\2+-\7\3\2\2,.\7\23\2\2-,\3\2"+
		"\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7 \2\2\62\7\3"+
		"\2\2\2\63\65\7\4\2\2\64\66\t\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3"+
		"\2\2\2\678\3\2\2\289\3\2\2\29:\7 \2\2:\t\3\2\2\2;B\5\f\7\2<B\5\16\b\2"+
		"=B\5\20\t\2>B\5\22\n\2?B\5\24\13\2@B\7\37\2\2A;\3\2\2\2A<\3\2\2\2A=\3"+
		"\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\13\3\2\2\2CE\7\5\2\2DF\t\3\2\2E"+
		"D\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7 \2\2J\r\3\2\2\2"+
		"KL\7\6\2\2LM\7\17\2\2MN\7 \2\2N\17\3\2\2\2OP\7\7\2\2PQ\7\33\2\2QR\7 \2"+
		"\2R\21\3\2\2\2ST\7\b\2\2TU\7\34\2\2UV\7 \2\2V\23\3\2\2\2WY\7\t\2\2XZ\t"+
		"\4\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7 \2\2^\25"+
		"\3\2\2\2_`\7\n\2\2`a\7\35\2\2ab\7 \2\2b\27\3\2\2\2\t\37&/\67AG[";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}