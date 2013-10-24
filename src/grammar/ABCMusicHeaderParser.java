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
		MODE_MINOR=12, EQUALS=13, OCTAVE=14, DIGIT=15, LINE_FEED=16, PERCENT=17, 
		METER_VARIANTS=18, METER_FRACTION=19, TEXT=20, COLON=21, TEMPO=22;
	public static final String[] tokenNames = {
		"<INVALID>", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
		"'w:'", "BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "'='", "OCTAVE", "DIGIT", 
		"LINE_FEED", "'%'", "METER_VARIANTS", "METER_FRACTION", "TEXT", "':'", 
		"TEMPO"
	};
	public static final int
		RULE_abc_tune_header = 0, RULE_abc_header = 1, RULE_field_number = 2, 
		RULE_field_title = 3, RULE_other_fields = 4, RULE_field_composer = 5, 
		RULE_field_default_length = 6, RULE_field_meter = 7, RULE_field_tempo = 8, 
		RULE_field_voice = 9, RULE_field_key = 10, RULE_eol = 11, RULE_meter = 12, 
		RULE_key = 13, RULE_key_note = 14, RULE_comment = 15;
	public static final String[] ruleNames = {
		"abc_tune_header", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "eol", "meter", "key", "key_note", "comment"
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
			setState(32); abc_header();
			setState(33); match(EOF);
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
			setState(35); field_number();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT) {
				{
				{
				setState(36); comment();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42); field_title();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(43); other_fields();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49); field_key();
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
			setState(51); match(X);
			setState(52); match(DIGIT);
			setState(53); eol();
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
		public TerminalNode PERCENT(int i) {
			return getToken(ABCMusicHeaderParser.PERCENT, i);
		}
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(ABCMusicHeaderParser.PERCENT); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(T);
			setState(57); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERCENT) | (1L << TEXT) | (1L << COLON))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(61); eol();
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
			setState(69);
			switch (_input.LA(1)) {
			case C:
				enterOuterAlt(_localctx, 1);
				{
				setState(63); field_composer();
				}
				break;
			case L:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); field_default_length();
				}
				break;
			case M:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); field_meter();
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 4);
				{
				setState(66); field_tempo();
				}
				break;
			case V:
				enterOuterAlt(_localctx, 5);
				{
				setState(67); field_voice();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(68); comment();
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
		public TerminalNode PERCENT(int i) {
			return getToken(ABCMusicHeaderParser.PERCENT, i);
		}
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(ABCMusicHeaderParser.PERCENT); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(C);
			setState(73); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(72);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERCENT) | (1L << TEXT) | (1L << COLON))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(75); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(77); eol();
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
			setState(79); match(L);
			setState(80); match(METER_FRACTION);
			setState(81); eol();
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
			setState(83); match(M);
			setState(84); meter();
			setState(85); eol();
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
			setState(87); match(Q);
			setState(88); match(TEMPO);
			setState(89); eol();
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
		public TerminalNode PERCENT(int i) {
			return getToken(ABCMusicHeaderParser.PERCENT, i);
		}
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(ABCMusicHeaderParser.PERCENT); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(V);
			setState(93); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(92);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PERCENT) | (1L << TEXT) | (1L << COLON))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(95); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(97); eol();
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
			setState(99); match(K);
			setState(100); key();
			setState(101); eol();
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
		try {
			setState(105);
			switch (_input.LA(1)) {
			case PERCENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); comment();
				}
				break;
			case LINE_FEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(104); match(LINE_FEED);
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
			setState(107);
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
			setState(109); key_note();
			setState(111);
			_la = _input.LA(1);
			if (_la==MODE_MINOR) {
				{
				setState(110); match(MODE_MINOR);
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
			setState(113); match(BASE_NOTE);
			setState(115);
			_la = _input.LA(1);
			if (_la==KEY_ACCIDENTAL) {
				{
				setState(114); match(KEY_ACCIDENTAL);
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

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(ABCMusicHeaderParser.COLON); }
		public TerminalNode LINE_FEED() { return getToken(ABCMusicHeaderParser.LINE_FEED, 0); }
		public TerminalNode BASE_NOTE(int i) {
			return getToken(ABCMusicHeaderParser.BASE_NOTE, i);
		}
		public TerminalNode TEXT(int i) {
			return getToken(ABCMusicHeaderParser.TEXT, i);
		}
		public TerminalNode PERCENT(int i) {
			return getToken(ABCMusicHeaderParser.PERCENT, i);
		}
		public List<TerminalNode> PERCENT() { return getTokens(ABCMusicHeaderParser.PERCENT); }
		public List<TerminalNode> TEXT() { return getTokens(ABCMusicHeaderParser.TEXT); }
		public List<TerminalNode> BASE_NOTE() { return getTokens(ABCMusicHeaderParser.BASE_NOTE); }
		public TerminalNode COLON(int i) {
			return getToken(ABCMusicHeaderParser.COLON, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderListener ) ((ABCMusicHeaderListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(PERCENT);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE_NOTE) | (1L << PERCENT) | (1L << TEXT) | (1L << COLON))) != 0)) {
				{
				{
				setState(118);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BASE_NOTE) | (1L << PERCENT) | (1L << TEXT) | (1L << COLON))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124); match(LINE_FEED);
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
		"\2\3\30\u0081\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\3\2\3\2\3\2\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\7\3"+
		"/\n\3\f\3\16\3\62\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\6\5<\n\5\r\5\16"+
		"\5=\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\6\7L\n\7\r\7\16\7"+
		"M\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\6"+
		"\13`\n\13\r\13\16\13a\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\5\rl\n\r\3\16"+
		"\3\16\3\17\3\17\5\17r\n\17\3\20\3\20\5\20v\n\20\3\21\3\21\7\21z\n\21\f"+
		"\21\16\21}\13\21\3\21\3\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \2\7\4\23\23\26\27\4\23\23\26\27\4\23\23\26\27\3\24\25\5\f\f\23"+
		"\23\26\27~\2\"\3\2\2\2\4%\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2\nG\3\2\2\2\f"+
		"I\3\2\2\2\16Q\3\2\2\2\20U\3\2\2\2\22Y\3\2\2\2\24]\3\2\2\2\26e\3\2\2\2"+
		"\30k\3\2\2\2\32m\3\2\2\2\34o\3\2\2\2\36s\3\2\2\2 w\3\2\2\2\"#\5\4\3\2"+
		"#$\7\1\2\2$\3\3\2\2\2%)\5\6\4\2&(\5 \21\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2"+
		"\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2,\60\5\b\5\2-/\5\n\6\2.-\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\5"+
		"\26\f\2\64\5\3\2\2\2\65\66\7\3\2\2\66\67\7\21\2\2\678\5\30\r\28\7\3\2"+
		"\2\29;\7\4\2\2:<\t\2\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2"+
		"\2\2?@\5\30\r\2@\t\3\2\2\2AH\5\f\7\2BH\5\16\b\2CH\5\20\t\2DH\5\22\n\2"+
		"EH\5\24\13\2FH\5 \21\2GA\3\2\2\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2GE\3\2\2"+
		"\2GF\3\2\2\2H\13\3\2\2\2IK\7\5\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2"+
		"\2\2MN\3\2\2\2NO\3\2\2\2OP\5\30\r\2P\r\3\2\2\2QR\7\6\2\2RS\7\25\2\2ST"+
		"\5\30\r\2T\17\3\2\2\2UV\7\7\2\2VW\5\32\16\2WX\5\30\r\2X\21\3\2\2\2YZ\7"+
		"\b\2\2Z[\7\30\2\2[\\\5\30\r\2\\\23\3\2\2\2]_\7\t\2\2^`\t\4\2\2_^\3\2\2"+
		"\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5\30\r\2d\25\3\2\2\2ef\7"+
		"\n\2\2fg\5\34\17\2gh\5\30\r\2h\27\3\2\2\2il\5 \21\2jl\7\22\2\2ki\3\2\2"+
		"\2kj\3\2\2\2l\31\3\2\2\2mn\t\5\2\2n\33\3\2\2\2oq\5\36\20\2pr\7\16\2\2"+
		"qp\3\2\2\2qr\3\2\2\2r\35\3\2\2\2su\7\f\2\2tv\7\r\2\2ut\3\2\2\2uv\3\2\2"+
		"\2v\37\3\2\2\2w{\7\23\2\2xz\t\6\2\2yx\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3"+
		"\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\22\2\2\177!\3\2\2\2\f)\60=GMakqu{";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}