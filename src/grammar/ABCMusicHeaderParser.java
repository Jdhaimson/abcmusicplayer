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
		WS_METER=35, VOICE_TEXT=27, LENGTH_FRACTION=39, PERCENT=17, C=3, BASE_NOTE=9, 
		L=4, END_COMMENT=30, M=5, TEMPO_FRACTION=20, WS_TEMPO=19, K=8, TEMPO_NUMBER=22, 
		WS_KEY=31, T=2, OCTAVE=14, V=7, EQUALS=12, Q=6, METER_VARIANTS=36, WS_INDEX=33, 
		KEY_NOTE=32, COMMENT_TEXT=29, METER_FRACTION=37, KEY_ACCIDENTAL=10, TEMPO_EQUALS=21, 
		MODE_MINOR=11, SPACE=13, X=1, COLON=18, INDEX=34, END_COMPOSER=26, END_TITLE=24, 
		COMPOSER_TEXT=25, END_VOICE=28, LINE_FEED=16, WS_LENGTH=38, DIGIT=15, 
		TITLE_TEXT=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
		"BASE_NOTE", "KEY_ACCIDENTAL", "'m'", "EQUALS", "' '", "OCTAVE", "DIGIT", 
		"LINE_FEED", "'%'", "':'", "WS_TEMPO", "TEMPO_FRACTION", "TEMPO_EQUALS", 
		"TEMPO_NUMBER", "TITLE_TEXT", "END_TITLE", "COMPOSER_TEXT", "END_COMPOSER", 
		"VOICE_TEXT", "END_VOICE", "COMMENT_TEXT", "END_COMMENT", "WS_KEY", "KEY_NOTE", 
		"WS_INDEX", "INDEX", "WS_METER", "METER_VARIANTS", "METER_FRACTION", "WS_LENGTH", 
		"LENGTH_FRACTION"
	};
	public static final int
		RULE_abc_tune_header = 0, RULE_abc_header = 1, RULE_field_number = 2, 
		RULE_field_title = 3, RULE_other_fields = 4, RULE_field_composer = 5, 
		RULE_field_default_length = 6, RULE_field_meter = 7, RULE_field_tempo = 8, 
		RULE_field_voice = 9, RULE_field_key = 10, RULE_tempo_fraction = 11, RULE_tempo_number = 12, 
		RULE_eol = 13, RULE_meter = 14, RULE_tempo = 15, RULE_voice_text = 16, 
		RULE_length_fraction = 17, RULE_composer_text = 18, RULE_title_text = 19, 
		RULE_number = 20, RULE_key_note = 21, RULE_comment = 22;
	public static final String[] ruleNames = {
		"abc_tune_header", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "tempo_fraction", "tempo_number", "eol", "meter", 
		"tempo", "voice_text", "length_fraction", "composer_text", "title_text", 
		"number", "key_note", "comment"
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
			setState(46); abc_header();
			setState(47); match(EOF);
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
			setState(49); field_number();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERCENT) {
				{
				{
				setState(50); comment();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56); field_title();
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V) | (1L << PERCENT))) != 0)) {
				{
				{
				setState(57); other_fields();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63); field_key();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(X);
			setState(67);
			_la = _input.LA(1);
			if (_la==INDEX) {
				{
				setState(66); number();
				}
			}

			setState(69); eol();
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
		public TerminalNode END_TITLE() { return getToken(ABCMusicHeaderParser.END_TITLE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(T);
			setState(73);
			_la = _input.LA(1);
			if (_la==TITLE_TEXT) {
				{
				setState(72); title_text();
				}
			}

			setState(77);
			switch (_input.LA(1)) {
			case END_TITLE:
				{
				setState(75); match(END_TITLE);
				}
				break;
			case LINE_FEED:
			case PERCENT:
				{
				setState(76); eol();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(85);
			switch (_input.LA(1)) {
			case C:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); field_composer();
				}
				break;
			case L:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); field_default_length();
				}
				break;
			case M:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); field_meter();
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 4);
				{
				setState(82); field_tempo();
				}
				break;
			case V:
				enterOuterAlt(_localctx, 5);
				{
				setState(83); field_voice();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(84); comment();
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
		public TerminalNode END_COMPOSER() { return getToken(ABCMusicHeaderParser.END_COMPOSER, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(C);
			setState(89);
			_la = _input.LA(1);
			if (_la==COMPOSER_TEXT) {
				{
				setState(88); composer_text();
				}
			}

			setState(93);
			switch (_input.LA(1)) {
			case END_COMPOSER:
				{
				setState(91); match(END_COMPOSER);
				}
				break;
			case LINE_FEED:
			case PERCENT:
				{
				setState(92); eol();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Field_default_lengthContext extends ParserRuleContext {
		public TerminalNode L() { return getToken(ABCMusicHeaderParser.L, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Length_fractionContext length_fraction() {
			return getRuleContext(Length_fractionContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(L);
			setState(97);
			_la = _input.LA(1);
			if (_la==LENGTH_FRACTION) {
				{
				setState(96); length_fraction();
				}
			}

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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(M);
			setState(103);
			_la = _input.LA(1);
			if (_la==METER_VARIANTS || _la==METER_FRACTION) {
				{
				setState(102); meter();
				}
			}

			setState(105); eol();
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(Q);
			setState(109);
			_la = _input.LA(1);
			if (_la==TEMPO_FRACTION) {
				{
				setState(108); tempo();
				}
			}

			setState(111); eol();
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
		public TerminalNode END_VOICE() { return getToken(ABCMusicHeaderParser.END_VOICE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(V);
			setState(115);
			_la = _input.LA(1);
			if (_la==VOICE_TEXT) {
				{
				setState(114); voice_text();
				}
			}

			setState(119);
			switch (_input.LA(1)) {
			case END_VOICE:
				{
				setState(117); match(END_VOICE);
				}
				break;
			case LINE_FEED:
			case PERCENT:
				{
				setState(118); eol();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Field_keyContext extends ParserRuleContext {
		public Key_noteContext key_note() {
			return getRuleContext(Key_noteContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(K);
			setState(123);
			_la = _input.LA(1);
			if (_la==KEY_NOTE) {
				{
				setState(122); key_note();
				}
			}

			setState(125); eol();
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

	public static class Tempo_fractionContext extends ParserRuleContext {
		public TerminalNode TEMPO_FRACTION() { return getToken(ABCMusicHeaderParser.TEMPO_FRACTION, 0); }
		public Tempo_fractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterTempo_fraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitTempo_fraction(this);
		}
	}

	public final Tempo_fractionContext tempo_fraction() throws RecognitionException {
		Tempo_fractionContext _localctx = new Tempo_fractionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tempo_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(TEMPO_FRACTION);
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

	public static class Tempo_numberContext extends ParserRuleContext {
		public TerminalNode TEMPO_NUMBER() { return getToken(ABCMusicHeaderParser.TEMPO_NUMBER, 0); }
		public Tempo_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterTempo_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitTempo_number(this);
		}
	}

	public final Tempo_numberContext tempo_number() throws RecognitionException {
		Tempo_numberContext _localctx = new Tempo_numberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tempo_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(TEMPO_NUMBER);
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
		enterRule(_localctx, 26, RULE_eol);
		try {
			setState(133);
			switch (_input.LA(1)) {
			case PERCENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); comment();
				}
				break;
			case LINE_FEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(LINE_FEED);
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
		enterRule(_localctx, 28, RULE_meter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
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
		public Tempo_numberContext tempo_number() {
			return getRuleContext(Tempo_numberContext.class,0);
		}
		public Tempo_fractionContext tempo_fraction() {
			return getRuleContext(Tempo_fractionContext.class,0);
		}
		public TerminalNode TEMPO_EQUALS() { return getToken(ABCMusicHeaderParser.TEMPO_EQUALS, 0); }
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
		enterRule(_localctx, 30, RULE_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); tempo_fraction();
			setState(138); match(TEMPO_EQUALS);
			setState(139); tempo_number();
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
		enterRule(_localctx, 32, RULE_voice_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141); match(VOICE_TEXT);
				}
				}
				setState(144); 
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

	public static class Length_fractionContext extends ParserRuleContext {
		public TerminalNode LENGTH_FRACTION() { return getToken(ABCMusicHeaderParser.LENGTH_FRACTION, 0); }
		public Length_fractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length_fraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).enterLength_fraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicHeaderParserListener ) ((ABCMusicHeaderParserListener)listener).exitLength_fraction(this);
		}
	}

	public final Length_fractionContext length_fraction() throws RecognitionException {
		Length_fractionContext _localctx = new Length_fractionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_length_fraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(LENGTH_FRACTION);
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
		enterRule(_localctx, 36, RULE_composer_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148); match(COMPOSER_TEXT);
				}
				}
				setState(151); 
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
		enterRule(_localctx, 38, RULE_title_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153); match(TITLE_TEXT);
				}
				}
				setState(156); 
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
		public TerminalNode INDEX() { return getToken(ABCMusicHeaderParser.INDEX, 0); }
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
		enterRule(_localctx, 40, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(INDEX);
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
		enterRule(_localctx, 42, RULE_key_note);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(KEY_NOTE);
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
		public TerminalNode END_COMMENT() { return getToken(ABCMusicHeaderParser.END_COMMENT, 0); }
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
		enterRule(_localctx, 44, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(PERCENT);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
				setState(163); match(COMMENT_TEXT);
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			_la = _input.LA(1);
			if ( !(_la==LINE_FEED || _la==END_COMMENT) ) {
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

	public static final String _serializedATN =
		"\2\3)\u00ae\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\3\2\3\2\3\2\3\3\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\7\3="+
		"\n\3\f\3\16\3@\13\3\3\3\3\3\3\4\3\4\5\4F\n\4\3\4\3\4\3\5\3\5\5\5L\n\5"+
		"\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\5\7\\\n\7\3"+
		"\7\3\7\5\7`\n\7\3\b\3\b\5\bd\n\b\3\b\3\b\3\t\3\t\5\tj\n\t\3\t\3\t\3\n"+
		"\3\n\5\np\n\n\3\n\3\n\3\13\3\13\5\13v\n\13\3\13\3\13\5\13z\n\13\3\f\3"+
		"\f\5\f~\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\5\17\u0088\n\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\6\22\u0091\n\22\r\22\16\22\u0092\3\23\3\23"+
		"\3\24\6\24\u0098\n\24\r\24\16\24\u0099\3\25\6\25\u009d\n\25\r\25\16\25"+
		"\u009e\3\26\3\26\3\27\3\27\3\30\3\30\7\30\u00a7\n\30\f\30\16\30\u00aa"+
		"\13\30\3\30\3\30\3\30\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\2\4\3&\'\4\22\22  \u00ad\2\60\3\2\2\2\4\63\3\2\2\2\6C\3\2\2\2\b"+
		"I\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16a\3\2\2\2\20g\3\2\2\2\22m\3\2\2\2\24"+
		"s\3\2\2\2\26{\3\2\2\2\30\u0081\3\2\2\2\32\u0083\3\2\2\2\34\u0087\3\2\2"+
		"\2\36\u0089\3\2\2\2 \u008b\3\2\2\2\"\u0090\3\2\2\2$\u0094\3\2\2\2&\u0097"+
		"\3\2\2\2(\u009c\3\2\2\2*\u00a0\3\2\2\2,\u00a2\3\2\2\2.\u00a4\3\2\2\2\60"+
		"\61\5\4\3\2\61\62\7\1\2\2\62\3\3\2\2\2\63\67\5\6\4\2\64\66\5.\30\2\65"+
		"\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2"+
		"\2:>\5\b\5\2;=\5\n\6\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2"+
		"\2@>\3\2\2\2AB\5\26\f\2B\5\3\2\2\2CE\7\3\2\2DF\5*\26\2ED\3\2\2\2EF\3\2"+
		"\2\2FG\3\2\2\2GH\5\34\17\2H\7\3\2\2\2IK\7\4\2\2JL\5(\25\2KJ\3\2\2\2KL"+
		"\3\2\2\2LO\3\2\2\2MP\7\32\2\2NP\5\34\17\2OM\3\2\2\2ON\3\2\2\2P\t\3\2\2"+
		"\2QX\5\f\7\2RX\5\16\b\2SX\5\20\t\2TX\5\22\n\2UX\5\24\13\2VX\5.\30\2WQ"+
		"\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\13\3\2\2\2"+
		"Y[\7\5\2\2Z\\\5&\24\2[Z\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2]`\7\34\2\2^`\5\34"+
		"\17\2_]\3\2\2\2_^\3\2\2\2`\r\3\2\2\2ac\7\6\2\2bd\5$\23\2cb\3\2\2\2cd\3"+
		"\2\2\2de\3\2\2\2ef\5\34\17\2f\17\3\2\2\2gi\7\7\2\2hj\5\36\20\2ih\3\2\2"+
		"\2ij\3\2\2\2jk\3\2\2\2kl\5\34\17\2l\21\3\2\2\2mo\7\b\2\2np\5 \21\2on\3"+
		"\2\2\2op\3\2\2\2pq\3\2\2\2qr\5\34\17\2r\23\3\2\2\2su\7\t\2\2tv\5\"\22"+
		"\2ut\3\2\2\2uv\3\2\2\2vy\3\2\2\2wz\7\36\2\2xz\5\34\17\2yw\3\2\2\2yx\3"+
		"\2\2\2z\25\3\2\2\2{}\7\n\2\2|~\5,\27\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2"+
		"\2\177\u0080\5\34\17\2\u0080\27\3\2\2\2\u0081\u0082\7\26\2\2\u0082\31"+
		"\3\2\2\2\u0083\u0084\7\30\2\2\u0084\33\3\2\2\2\u0085\u0088\5.\30\2\u0086"+
		"\u0088\7\22\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2\2\u0088\35\3\2\2"+
		"\2\u0089\u008a\t\2\2\2\u008a\37\3\2\2\2\u008b\u008c\5\30\r\2\u008c\u008d"+
		"\7\27\2\2\u008d\u008e\5\32\16\2\u008e!\3\2\2\2\u008f\u0091\7\35\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093#\3\2\2\2\u0094\u0095\7)\2\2\u0095%\3\2\2\2\u0096\u0098\7\33"+
		"\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\'\3\2\2\2\u009b\u009d\7\31\2\2\u009c\u009b\3\2\2"+
		"\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f)"+
		"\3\2\2\2\u00a0\u00a1\7$\2\2\u00a1+\3\2\2\2\u00a2\u00a3\7\"\2\2\u00a3-"+
		"\3\2\2\2\u00a4\u00a8\7\23\2\2\u00a5\u00a7\7\37\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac/\3\2\2\2\25\67"+
		">EKOW[_ciouy}\u0087\u0092\u0099\u009e\u00a8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}