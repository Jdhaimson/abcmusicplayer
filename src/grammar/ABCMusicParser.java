// Generated from ABCMusic.g4 by ANTLR 4.0

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
public class ABCMusicParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		X=1, T=2, C=3, L=4, M=5, Q=6, V=7, K=8, W=9, ACCIDENTAL=10, BASE_NOTE=11, 
		REST=12, BAR_LINE=13, NTH_REPEAT=14, KEY_ACCIDENTAL=15, MODE_MINOR=16, 
		EQUALS=17, OCTAVE=18, OPEN_PAREN=19, OPEN_BRACK=20, CLOSED_BRACK=21, DIVIDE=22, 
		DIGIT=23, SPACE=24, LINE_FEED=25, PERCENT=26, TEXT=27, LYRIC_TEXT=28, 
		LYRIC_ELEMENTS=29, METER_VARIANTS=30, METER_FRACTION=31, METER=32, TEMPO=33, 
		KEY=34, KEY_NOTE=35, COMMENT=36, EOL=37, NOTE_LENGTH_STRICT=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'X:'", "'T:'", "'C:'", "'L:'", "'M:'", "'Q:'", "'V:'", "'K:'", 
		"'w:'", "ACCIDENTAL", "BASE_NOTE", "'z'", "BAR_LINE", "NTH_REPEAT", "KEY_ACCIDENTAL", 
		"'m'", "'='", "OCTAVE", "'('", "'['", "']'", "'/'", "DIGIT", "' '", "LINE_FEED", 
		"'%'", "TEXT", "LYRIC_TEXT", "LYRIC_ELEMENTS", "METER_VARIANTS", "METER_FRACTION", 
		"METER", "TEMPO", "KEY", "KEY_NOTE", "COMMENT", "EOL", "NOTE_LENGTH_STRICT"
	};
	public static final int
		RULE_abc_tune = 0, RULE_abc_header = 1, RULE_field_number = 2, RULE_field_title = 3, 
		RULE_other_fields = 4, RULE_field_composer = 5, RULE_field_default_length = 6, 
		RULE_field_meter = 7, RULE_field_tempo = 8, RULE_field_voice = 9, RULE_field_key = 10, 
		RULE_abc_music = 11, RULE_abc_line = 12, RULE_element = 13, RULE_note_element = 14, 
		RULE_note = 15, RULE_note_or_rest = 16, RULE_pitch = 17, RULE_note_length = 18, 
		RULE_tuplet_element = 19, RULE_tuplet_spec = 20, RULE_multi_note = 21, 
		RULE_mid_tune_field = 22, RULE_lyric = 23, RULE_lyrical_element = 24;
	public static final String[] ruleNames = {
		"abc_tune", "abc_header", "field_number", "field_title", "other_fields", 
		"field_composer", "field_default_length", "field_meter", "field_tempo", 
		"field_voice", "field_key", "abc_music", "abc_line", "element", "note_element", 
		"note", "note_or_rest", "pitch", "note_length", "tuplet_element", "tuplet_spec", 
		"multi_note", "mid_tune_field", "lyric", "lyrical_element"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusic.g4"; }

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

	public ABCMusicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_tuneContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public Abc_headerContext abc_header() {
			return getRuleContext(Abc_headerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicParser.EOF, 0); }
		public Abc_tuneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_tune(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_tune(this);
		}
	}

	public final Abc_tuneContext abc_tune() throws RecognitionException {
		Abc_tuneContext _localctx = new Abc_tuneContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); abc_header();
			setState(51); abc_music();
			setState(52); match(EOF);
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
		public List<TerminalNode> COMMENT() { return getTokens(ABCMusicParser.COMMENT); }
		public Other_fieldsContext other_fields(int i) {
			return getRuleContext(Other_fieldsContext.class,i);
		}
		public Field_numberContext field_number() {
			return getRuleContext(Field_numberContext.class,0);
		}
		public TerminalNode COMMENT(int i) {
			return getToken(ABCMusicParser.COMMENT, i);
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
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_header(this);
		}
	}

	public final Abc_headerContext abc_header() throws RecognitionException {
		Abc_headerContext _localctx = new Abc_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); field_number();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT) {
				{
				{
				setState(55); match(COMMENT);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); field_title();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << C) | (1L << L) | (1L << M) | (1L << Q) | (1L << V) | (1L << COMMENT))) != 0)) {
				{
				{
				setState(62); other_fields();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68); field_key();
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
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public TerminalNode X() { return getToken(ABCMusicParser.X, 0); }
		public Field_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_number(this);
		}
	}

	public final Field_numberContext field_number() throws RecognitionException {
		Field_numberContext _localctx = new Field_numberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_field_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(X);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71); match(DIGIT);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(76); match(EOL);
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
		public TerminalNode T() { return getToken(ABCMusicParser.T, 0); }
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public Field_titleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_title(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_title(this);
		}
	}

	public final Field_titleContext field_title() throws RecognitionException {
		Field_titleContext _localctx = new Field_titleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(T);
			setState(79); match(TEXT);
			setState(80); match(EOL);
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
		public TerminalNode COMMENT() { return getToken(ABCMusicParser.COMMENT, 0); }
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
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterOther_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitOther_fields(this);
		}
	}

	public final Other_fieldsContext other_fields() throws RecognitionException {
		Other_fieldsContext _localctx = new Other_fieldsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_other_fields);
		try {
			setState(88);
			switch (_input.LA(1)) {
			case C:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); field_composer();
				}
				break;
			case L:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); field_default_length();
				}
				break;
			case M:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); field_meter();
				}
				break;
			case Q:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); field_tempo();
				}
				break;
			case V:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); field_voice();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(87); match(COMMENT);
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
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public TerminalNode C() { return getToken(ABCMusicParser.C, 0); }
		public Field_composerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_composer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_composer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_composer(this);
		}
	}

	public final Field_composerContext field_composer() throws RecognitionException {
		Field_composerContext _localctx = new Field_composerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field_composer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(C);
			setState(91); match(TEXT);
			setState(92); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public TerminalNode NOTE_LENGTH_STRICT() { return getToken(ABCMusicParser.NOTE_LENGTH_STRICT, 0); }
		public TerminalNode L() { return getToken(ABCMusicParser.L, 0); }
		public Field_default_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_default_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_default_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_default_length(this);
		}
	}

	public final Field_default_lengthContext field_default_length() throws RecognitionException {
		Field_default_lengthContext _localctx = new Field_default_lengthContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_field_default_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); match(L);
			setState(95); match(NOTE_LENGTH_STRICT);
			setState(96); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public TerminalNode METER() { return getToken(ABCMusicParser.METER, 0); }
		public TerminalNode M() { return getToken(ABCMusicParser.M, 0); }
		public Field_meterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_meter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_meter(this);
		}
	}

	public final Field_meterContext field_meter() throws RecognitionException {
		Field_meterContext _localctx = new Field_meterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_meter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(M);
			setState(99); match(METER);
			setState(100); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public TerminalNode Q() { return getToken(ABCMusicParser.Q, 0); }
		public TerminalNode TEMPO() { return getToken(ABCMusicParser.TEMPO, 0); }
		public Field_tempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_tempo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_tempo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_tempo(this);
		}
	}

	public final Field_tempoContext field_tempo() throws RecognitionException {
		Field_tempoContext _localctx = new Field_tempoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_field_tempo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(Q);
			setState(103); match(TEMPO);
			setState(104); match(EOL);
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
		public TerminalNode V() { return getToken(ABCMusicParser.V, 0); }
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public TerminalNode TEXT() { return getToken(ABCMusicParser.TEXT, 0); }
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(V);
			setState(107); match(TEXT);
			setState(108); match(EOL);
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
		public TerminalNode EOL() { return getToken(ABCMusicParser.EOL, 0); }
		public TerminalNode KEY() { return getToken(ABCMusicParser.KEY, 0); }
		public TerminalNode K() { return getToken(ABCMusicParser.K, 0); }
		public Field_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterField_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitField_key(this);
		}
	}

	public final Field_keyContext field_key() throws RecognitionException {
		Field_keyContext _localctx = new Field_keyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_field_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); match(K);
			setState(111); match(KEY);
			setState(112); match(EOL);
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

	public static class Abc_musicContext extends ParserRuleContext {
		public Abc_lineContext abc_line(int i) {
			return getRuleContext(Abc_lineContext.class,i);
		}
		public List<Abc_lineContext> abc_line() {
			return getRuleContexts(Abc_lineContext.class);
		}
		public Abc_musicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_music; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114); abc_line();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << V) | (1L << ACCIDENTAL) | (1L << BASE_NOTE) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE) | (1L << COMMENT))) != 0) );
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

	public static class Abc_lineContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public List<TerminalNode> LINE_FEED() { return getTokens(ABCMusicParser.LINE_FEED); }
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ABCMusicParser.COMMENT, 0); }
		public TerminalNode LINE_FEED(int i) {
			return getToken(ABCMusicParser.LINE_FEED, i);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_abc_line);
		int _la;
		try {
			setState(132);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASE_NOTE:
			case REST:
			case BAR_LINE:
			case NTH_REPEAT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(119); element();
					}
					}
					setState(122); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << BASE_NOTE) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE))) != 0) );
				setState(124); match(LINE_FEED);
				setState(128);
				_la = _input.LA(1);
				if (_la==W) {
					{
					setState(125); lyric();
					setState(126); match(LINE_FEED);
					}
				}

				}
				break;
			case V:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); mid_tune_field();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(131); match(COMMENT);
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

	public static class ElementContext extends ParserRuleContext {
		public TerminalNode NTH_REPEAT() { return getToken(ABCMusicParser.NTH_REPEAT, 0); }
		public TerminalNode SPACE() { return getToken(ABCMusicParser.SPACE, 0); }
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public TerminalNode BAR_LINE() { return getToken(ABCMusicParser.BAR_LINE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_element);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASE_NOTE:
			case REST:
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(134); note_element();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); tuplet_element();
				}
				break;
			case BAR_LINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(136); match(BAR_LINE);
				}
				break;
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(137); match(NTH_REPEAT);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(138); match(SPACE);
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

	public static class Note_elementContext extends ParserRuleContext {
		public Multi_noteContext multi_note() {
			return getRuleContext(Multi_noteContext.class,0);
		}
		public NoteContext note() {
			return getRuleContext(NoteContext.class,0);
		}
		public Note_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_note_element);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASE_NOTE:
			case REST:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); note();
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(142); multi_note();
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

	public static class NoteContext extends ParserRuleContext {
		public Note_or_restContext note_or_rest() {
			return getRuleContext(Note_or_restContext.class,0);
		}
		public Note_lengthContext note_length() {
			return getRuleContext(Note_lengthContext.class,0);
		}
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); note_or_rest();
			setState(147);
			_la = _input.LA(1);
			if (_la==DIVIDE || _la==DIGIT) {
				{
				setState(146); note_length();
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

	public static class Note_or_restContext extends ParserRuleContext {
		public TerminalNode REST() { return getToken(ABCMusicParser.REST, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public Note_or_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_or_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_note_or_rest);
		try {
			setState(151);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(149); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); match(REST);
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

	public static class PitchContext extends ParserRuleContext {
		public TerminalNode OCTAVE() { return getToken(ABCMusicParser.OCTAVE, 0); }
		public TerminalNode ACCIDENTAL() { return getToken(ABCMusicParser.ACCIDENTAL, 0); }
		public TerminalNode BASE_NOTE() { return getToken(ABCMusicParser.BASE_NOTE, 0); }
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(153); match(ACCIDENTAL);
				}
			}

			setState(156); match(BASE_NOTE);
			setState(158);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(157); match(OCTAVE);
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

	public static class Note_lengthContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicParser.DIGIT); }
		public TerminalNode DIVIDE() { return getToken(ABCMusicParser.DIVIDE, 0); }
		public Note_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_note_length);
		int _la;
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(161); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(160); match(DIGIT);
					}
					}
					setState(163); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(165); match(DIVIDE);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166); match(DIGIT);
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(171); match(DIVIDE);
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(172); match(DIGIT);
					}
					}
					setState(175); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177); match(DIGIT);
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(182); match(DIVIDE);
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183); match(DIGIT);
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(188); match(DIVIDE);
				}
				break;
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

	public static class Tuplet_elementContext extends ParserRuleContext {
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public Tuplet_specContext tuplet_spec() {
			return getRuleContext(Tuplet_specContext.class,0);
		}
		public Tuplet_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191); tuplet_spec();
			setState(193); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(192); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(195); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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

	public static class Tuplet_specContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ABCMusicParser.OPEN_PAREN, 0); }
		public TerminalNode DIGIT() { return getToken(ABCMusicParser.DIGIT, 0); }
		public Tuplet_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterTuplet_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitTuplet_spec(this);
		}
	}

	public final Tuplet_specContext tuplet_spec() throws RecognitionException {
		Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(OPEN_PAREN);
			setState(198); match(DIGIT);
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

	public static class Multi_noteContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(ABCMusicParser.OPEN_BRACK, 0); }
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public TerminalNode CLOSED_BRACK() { return getToken(ABCMusicParser.CLOSED_BRACK, 0); }
		public Multi_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMulti_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMulti_note(this);
		}
	}

	public final Multi_noteContext multi_note() throws RecognitionException {
		Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(OPEN_BRACK);
			setState(202); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(201); note();
				}
				}
				setState(204); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << BASE_NOTE) | (1L << REST))) != 0) );
			setState(206); match(CLOSED_BRACK);
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

	public static class Mid_tune_fieldContext extends ParserRuleContext {
		public Field_voiceContext field_voice() {
			return getRuleContext(Field_voiceContext.class,0);
		}
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); field_voice();
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

	public static class LyricContext extends ParserRuleContext {
		public List<Lyrical_elementContext> lyrical_element() {
			return getRuleContexts(Lyrical_elementContext.class);
		}
		public TerminalNode W() { return getToken(ABCMusicParser.W, 0); }
		public Lyrical_elementContext lyrical_element(int i) {
			return getRuleContext(Lyrical_elementContext.class,i);
		}
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(W);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LYRIC_TEXT || _la==LYRIC_ELEMENTS) {
				{
				{
				setState(211); lyrical_element();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Lyrical_elementContext extends ParserRuleContext {
		public TerminalNode LYRIC_TEXT() { return getToken(ABCMusicParser.LYRIC_TEXT, 0); }
		public TerminalNode LYRIC_ELEMENTS() { return getToken(ABCMusicParser.LYRIC_ELEMENTS, 0); }
		public Lyrical_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyrical_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).enterLyrical_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicListener ) ((ABCMusicListener)listener).exitLyrical_element(this);
		}
	}

	public final Lyrical_elementContext lyrical_element() throws RecognitionException {
		Lyrical_elementContext _localctx = new Lyrical_elementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lyrical_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_la = _input.LA(1);
			if ( !(_la==LYRIC_TEXT || _la==LYRIC_ELEMENTS) ) {
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
		"\2\3(\u00de\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\3\3\3\7\3;\n\3\f\3\16"+
		"\3>\13\3\3\3\3\3\7\3B\n\3\f\3\16\3E\13\3\3\3\3\3\3\4\3\4\6\4K\n\4\r\4"+
		"\16\4L\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6[\n\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\r\6\rv\n\r\r\r\16\rw\3\16\6\16{\n\16\r\16\16"+
		"\16|\3\16\3\16\3\16\3\16\5\16\u0083\n\16\3\16\3\16\5\16\u0087\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u008e\n\17\3\20\3\20\5\20\u0092\n\20\3\21\3"+
		"\21\5\21\u0096\n\21\3\22\3\22\5\22\u009a\n\22\3\23\5\23\u009d\n\23\3\23"+
		"\3\23\5\23\u00a1\n\23\3\24\6\24\u00a4\n\24\r\24\16\24\u00a5\3\24\3\24"+
		"\6\24\u00aa\n\24\r\24\16\24\u00ab\3\24\3\24\6\24\u00b0\n\24\r\24\16\24"+
		"\u00b1\3\24\6\24\u00b5\n\24\r\24\16\24\u00b6\3\24\3\24\6\24\u00bb\n\24"+
		"\r\24\16\24\u00bc\3\24\5\24\u00c0\n\24\3\25\3\25\6\25\u00c4\n\25\r\25"+
		"\16\25\u00c5\3\26\3\26\3\26\3\27\3\27\6\27\u00cd\n\27\r\27\16\27\u00ce"+
		"\3\27\3\27\3\30\3\30\3\31\3\31\7\31\u00d7\n\31\f\31\16\31\u00da\13\31"+
		"\3\32\3\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\2\3\3\36\37\u00e6\2\64\3\2\2\2\48\3\2\2\2\6H\3\2\2\2\bP\3\2\2\2\n"+
		"Z\3\2\2\2\f\\\3\2\2\2\16`\3\2\2\2\20d\3\2\2\2\22h\3\2\2\2\24l\3\2\2\2"+
		"\26p\3\2\2\2\30u\3\2\2\2\32\u0086\3\2\2\2\34\u008d\3\2\2\2\36\u0091\3"+
		"\2\2\2 \u0093\3\2\2\2\"\u0099\3\2\2\2$\u009c\3\2\2\2&\u00bf\3\2\2\2(\u00c1"+
		"\3\2\2\2*\u00c7\3\2\2\2,\u00ca\3\2\2\2.\u00d2\3\2\2\2\60\u00d4\3\2\2\2"+
		"\62\u00db\3\2\2\2\64\65\5\4\3\2\65\66\5\30\r\2\66\67\7\1\2\2\67\3\3\2"+
		"\2\28<\5\6\4\29;\7&\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2"+
		"\2\2><\3\2\2\2?C\5\b\5\2@B\5\n\6\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DF\3\2\2\2EC\3\2\2\2FG\5\26\f\2G\5\3\2\2\2HJ\7\3\2\2IK\7\31\2\2JI"+
		"\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\'\2\2O\7\3\2\2\2"+
		"PQ\7\4\2\2QR\7\35\2\2RS\7\'\2\2S\t\3\2\2\2T[\5\f\7\2U[\5\16\b\2V[\5\20"+
		"\t\2W[\5\22\n\2X[\5\24\13\2Y[\7&\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3"+
		"\2\2\2ZX\3\2\2\2ZY\3\2\2\2[\13\3\2\2\2\\]\7\5\2\2]^\7\35\2\2^_\7\'\2\2"+
		"_\r\3\2\2\2`a\7\6\2\2ab\7(\2\2bc\7\'\2\2c\17\3\2\2\2de\7\7\2\2ef\7\"\2"+
		"\2fg\7\'\2\2g\21\3\2\2\2hi\7\b\2\2ij\7#\2\2jk\7\'\2\2k\23\3\2\2\2lm\7"+
		"\t\2\2mn\7\35\2\2no\7\'\2\2o\25\3\2\2\2pq\7\n\2\2qr\7$\2\2rs\7\'\2\2s"+
		"\27\3\2\2\2tv\5\32\16\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\31\3"+
		"\2\2\2y{\5\34\17\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~"+
		"\u0082\7\33\2\2\177\u0080\5\60\31\2\u0080\u0081\7\33\2\2\u0081\u0083\3"+
		"\2\2\2\u0082\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0087\3\2\2\2\u0084"+
		"\u0087\5.\30\2\u0085\u0087\7&\2\2\u0086z\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\33\3\2\2\2\u0088\u008e\5\36\20\2\u0089\u008e\5(\25"+
		"\2\u008a\u008e\7\17\2\2\u008b\u008e\7\20\2\2\u008c\u008e\7\32\2\2\u008d"+
		"\u0088\3\2\2\2\u008d\u0089\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008d\u008c\3\2\2\2\u008e\35\3\2\2\2\u008f\u0092\5 \21\2\u0090\u0092"+
		"\5,\27\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\37\3\2\2\2\u0093"+
		"\u0095\5\"\22\2\u0094\u0096\5&\24\2\u0095\u0094\3\2\2\2\u0095\u0096\3"+
		"\2\2\2\u0096!\3\2\2\2\u0097\u009a\5$\23\2\u0098\u009a\7\16\2\2\u0099\u0097"+
		"\3\2\2\2\u0099\u0098\3\2\2\2\u009a#\3\2\2\2\u009b\u009d\7\f\2\2\u009c"+
		"\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\7\r"+
		"\2\2\u009f\u00a1\7\24\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"%\3\2\2\2\u00a2\u00a4\7\31\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9"+
		"\7\30\2\2\u00a8\u00aa\7\31\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00c0\3\2\2\2\u00ad\u00af"+
		"\7\30\2\2\u00ae\u00b0\7\31\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2"+
		"\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00c0\3\2\2\2\u00b3\u00b5"+
		"\7\31\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00c0\7\30\2\2\u00b9\u00bb"+
		"\7\31\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2"+
		"\u00bc\u00bd\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00c0\7\30\2\2\u00bf\u00a3"+
		"\3\2\2\2\u00bf\u00ad\3\2\2\2\u00bf\u00b4\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\'\3\2\2\2\u00c1\u00c3\5*\26\2\u00c2\u00c4\5\36\20"+
		"\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6)\3\2\2\2\u00c7\u00c8\7\25\2\2\u00c8\u00c9\7\31\2\2\u00c9"+
		"+\3\2\2\2\u00ca\u00cc\7\26\2\2\u00cb\u00cd\5 \21\2\u00cc\u00cb\3\2\2\2"+
		"\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\7\27\2\2\u00d1-\3\2\2\2\u00d2\u00d3\5\24\13\2\u00d3"+
		"/\3\2\2\2\u00d4\u00d8\7\13\2\2\u00d5\u00d7\5\62\32\2\u00d6\u00d5\3\2\2"+
		"\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\61"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\t\2\2\2\u00dc\63\3\2\2\2\31<"+
		"CLZw|\u0082\u0086\u008d\u0091\u0095\u0099\u009c\u00a0\u00a5\u00ab\u00b1"+
		"\u00b6\u00bc\u00bf\u00c5\u00ce\u00d8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}