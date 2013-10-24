// Generated from ABCMusicBody.g4 by ANTLR 4.0

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
public class ABCMusicBodyParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		W=1, V=2, ACCIDENTAL=3, FIELD_VOICE=4, REST=5, BAR_LINE=6, NTH_REPEAT=7, 
		KEY_ACCIDENTAL=8, MODE_MINOR=9, NOTE_LENGTH_STRICT=10, OCTAVE=11, OPEN_PAREN=12, 
		OPEN_BRACK=13, CLOSED_BRACK=14, DIVIDE=15, DIGIT=16, SPACE=17, LINE_FEED=18, 
		PERCENT=19, COMMENT=20, METER_VARIANTS=21, METER_FRACTION=22, BASE_NOTE=23, 
		TEMPO=24, LYRIC_TEXT=25, LYRICAL_ELEMENTS=26, EOL=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'w:'", "'V:'", "ACCIDENTAL", "FIELD_VOICE", "'z'", "BAR_LINE", 
		"NTH_REPEAT", "KEY_ACCIDENTAL", "'m'", "NOTE_LENGTH_STRICT", "OCTAVE", 
		"'('", "'['", "']'", "'/'", "DIGIT", "' '", "LINE_FEED", "'%'", "COMMENT", 
		"METER_VARIANTS", "METER_FRACTION", "BASE_NOTE", "TEMPO", "LYRIC_TEXT", 
		"LYRICAL_ELEMENTS", "EOL"
	};
	public static final int
		RULE_abc_tune_body = 0, RULE_abc_music = 1, RULE_abc_line = 2, RULE_element = 3, 
		RULE_note_element = 4, RULE_note_length = 5, RULE_note = 6, RULE_multi_note = 7, 
		RULE_note_or_rest = 8, RULE_pitch = 9, RULE_meter = 10, RULE_key = 11, 
		RULE_key_note = 12, RULE_tuplet_element = 13, RULE_tuplet_spec = 14, RULE_mid_tune_field = 15, 
		RULE_lyric = 16;
	public static final String[] ruleNames = {
		"abc_tune_body", "abc_music", "abc_line", "element", "note_element", "note_length", 
		"note", "multi_note", "note_or_rest", "pitch", "meter", "key", "key_note", 
		"tuplet_element", "tuplet_spec", "mid_tune_field", "lyric"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusicBody.g4"; }

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

	public ABCMusicBodyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Abc_tune_bodyContext extends ParserRuleContext {
		public Abc_musicContext abc_music() {
			return getRuleContext(Abc_musicContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ABCMusicBodyParser.EOF, 0); }
		public Abc_tune_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_tune_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterAbc_tune_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitAbc_tune_body(this);
		}
	}

	public final Abc_tune_bodyContext abc_tune_body() throws RecognitionException {
		Abc_tune_bodyContext _localctx = new Abc_tune_bodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); abc_music();
			setState(35); match(EOF);
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
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37); abc_line();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << FIELD_VOICE) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE) | (1L << COMMENT) | (1L << BASE_NOTE))) != 0) );
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
		public List<TerminalNode> LINE_FEED() { return getTokens(ABCMusicBodyParser.LINE_FEED); }
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(ABCMusicBodyParser.COMMENT, 0); }
		public TerminalNode LINE_FEED(int i) {
			return getToken(ABCMusicBodyParser.LINE_FEED, i);
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
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_abc_line);
		int _la;
		try {
			setState(55);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BAR_LINE:
			case NTH_REPEAT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case SPACE:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(42); element();
					}
					}
					setState(45); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE) | (1L << BASE_NOTE))) != 0) );
				setState(47); match(LINE_FEED);
				setState(51);
				_la = _input.LA(1);
				if (_la==W) {
					{
					setState(48); lyric();
					setState(49); match(LINE_FEED);
					}
				}

				}
				break;
			case FIELD_VOICE:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); mid_tune_field();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(54); match(COMMENT);
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
		public TerminalNode NTH_REPEAT() { return getToken(ABCMusicBodyParser.NTH_REPEAT, 0); }
		public TerminalNode SPACE() { return getToken(ABCMusicBodyParser.SPACE, 0); }
		public Note_elementContext note_element() {
			return getRuleContext(Note_elementContext.class,0);
		}
		public Tuplet_elementContext tuplet_element() {
			return getRuleContext(Tuplet_elementContext.class,0);
		}
		public TerminalNode BAR_LINE() { return getToken(ABCMusicBodyParser.BAR_LINE, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(62);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case OPEN_BRACK:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); note_element();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); tuplet_element();
				}
				break;
			case BAR_LINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(59); match(BAR_LINE);
				}
				break;
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(60); match(NTH_REPEAT);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); match(SPACE);
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
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_note_element);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); note();
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); multi_note();
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

	public static class Note_lengthContext extends ParserRuleContext {
		public TerminalNode DIGIT(int i) {
			return getToken(ABCMusicBodyParser.DIGIT, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(ABCMusicBodyParser.DIGIT); }
		public TerminalNode DIVIDE() { return getToken(ABCMusicBodyParser.DIVIDE, 0); }
		public Note_lengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_note_length);
		int _la;
		try {
			setState(97);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68); match(DIGIT);
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73); match(DIGIT);
					}
					}
					setState(76); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(78); match(DIVIDE);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79); match(DIGIT);
					}
					}
					setState(82); 
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
				setState(84); match(DIVIDE);
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(85); match(DIGIT);
					}
					}
					setState(88); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90); match(DIGIT);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(95); match(DIVIDE);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96); match(DIVIDE);
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
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); note_or_rest();
			setState(101);
			_la = _input.LA(1);
			if (_la==DIVIDE || _la==DIGIT) {
				{
				setState(100); note_length();
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

	public static class Multi_noteContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACK() { return getToken(ABCMusicBodyParser.OPEN_BRACK, 0); }
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public TerminalNode CLOSED_BRACK() { return getToken(ABCMusicBodyParser.CLOSED_BRACK, 0); }
		public Multi_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterMulti_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitMulti_note(this);
		}
	}

	public final Multi_noteContext multi_note() throws RecognitionException {
		Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(OPEN_BRACK);
			setState(105); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(104); note();
				}
				}
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BASE_NOTE))) != 0) );
			setState(109); match(CLOSED_BRACK);
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
		public TerminalNode REST() { return getToken(ABCMusicBodyParser.REST, 0); }
		public PitchContext pitch() {
			return getRuleContext(PitchContext.class,0);
		}
		public Note_or_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_or_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_note_or_rest);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); match(REST);
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
		public TerminalNode OCTAVE() { return getToken(ABCMusicBodyParser.OCTAVE, 0); }
		public TerminalNode ACCIDENTAL() { return getToken(ABCMusicBodyParser.ACCIDENTAL, 0); }
		public TerminalNode BASE_NOTE() { return getToken(ABCMusicBodyParser.BASE_NOTE, 0); }
		public PitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pitch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(115); match(ACCIDENTAL);
				}
			}

			setState(118); match(BASE_NOTE);
			setState(120);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(119); match(OCTAVE);
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

	public static class MeterContext extends ParserRuleContext {
		public TerminalNode METER_VARIANTS() { return getToken(ABCMusicBodyParser.METER_VARIANTS, 0); }
		public TerminalNode METER_FRACTION() { return getToken(ABCMusicBodyParser.METER_FRACTION, 0); }
		public MeterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_meter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
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
		public TerminalNode MODE_MINOR() { return getToken(ABCMusicBodyParser.MODE_MINOR, 0); }
		public Key_noteContext key_note() {
			return getRuleContext(Key_noteContext.class,0);
		}
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); key_note();
			setState(126);
			_la = _input.LA(1);
			if (_la==MODE_MINOR) {
				{
				setState(125); match(MODE_MINOR);
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
		public TerminalNode KEY_ACCIDENTAL() { return getToken(ABCMusicBodyParser.KEY_ACCIDENTAL, 0); }
		public TerminalNode BASE_NOTE() { return getToken(ABCMusicBodyParser.BASE_NOTE, 0); }
		public Key_noteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key_note; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterKey_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitKey_note(this);
		}
	}

	public final Key_noteContext key_note() throws RecognitionException {
		Key_noteContext _localctx = new Key_noteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_key_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(BASE_NOTE);
			setState(130);
			_la = _input.LA(1);
			if (_la==KEY_ACCIDENTAL) {
				{
				setState(129); match(KEY_ACCIDENTAL);
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
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132); tuplet_spec();
			setState(134); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(133); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(136); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		public TerminalNode OPEN_PAREN() { return getToken(ABCMusicBodyParser.OPEN_PAREN, 0); }
		public TerminalNode DIGIT() { return getToken(ABCMusicBodyParser.DIGIT, 0); }
		public Tuplet_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterTuplet_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitTuplet_spec(this);
		}
	}

	public final Tuplet_specContext tuplet_spec() throws RecognitionException {
		Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(OPEN_PAREN);
			setState(139); match(DIGIT);
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
		public TerminalNode FIELD_VOICE() { return getToken(ABCMusicBodyParser.FIELD_VOICE, 0); }
		public Mid_tune_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mid_tune_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(FIELD_VOICE);
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
		public List<TerminalNode> LYRIC_TEXT() { return getTokens(ABCMusicBodyParser.LYRIC_TEXT); }
		public TerminalNode SPACE(int i) {
			return getToken(ABCMusicBodyParser.SPACE, i);
		}
		public List<TerminalNode> OCTAVE() { return getTokens(ABCMusicBodyParser.OCTAVE); }
		public TerminalNode W() { return getToken(ABCMusicBodyParser.W, 0); }
		public TerminalNode OCTAVE(int i) {
			return getToken(ABCMusicBodyParser.OCTAVE, i);
		}
		public TerminalNode BASE_NOTE(int i) {
			return getToken(ABCMusicBodyParser.BASE_NOTE, i);
		}
		public TerminalNode LYRICAL_ELEMENTS(int i) {
			return getToken(ABCMusicBodyParser.LYRICAL_ELEMENTS, i);
		}
		public List<TerminalNode> BASE_NOTE() { return getTokens(ABCMusicBodyParser.BASE_NOTE); }
		public TerminalNode LYRIC_TEXT(int i) {
			return getToken(ABCMusicBodyParser.LYRIC_TEXT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(ABCMusicBodyParser.SPACE); }
		public List<TerminalNode> LYRICAL_ELEMENTS() { return getTokens(ABCMusicBodyParser.LYRICAL_ELEMENTS); }
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lyric);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(W);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAVE) | (1L << SPACE) | (1L << BASE_NOTE) | (1L << LYRIC_TEXT) | (1L << LYRICAL_ELEMENTS))) != 0)) {
				{
				setState(151);
				switch (_input.LA(1)) {
				case LYRICAL_ELEMENTS:
					{
					setState(144); match(LYRICAL_ELEMENTS);
					}
					break;
				case OCTAVE:
				case BASE_NOTE:
				case LYRIC_TEXT:
					{
					setState(146); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(145);
							_la = _input.LA(1);
							if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAVE) | (1L << BASE_NOTE) | (1L << LYRIC_TEXT))) != 0)) ) {
							_errHandler.recoverInline(this);
							}
							consume();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(148); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
					} while ( _alt!=2 && _alt!=-1 );
					}
					break;
				case SPACE:
					{
					setState(150); match(SPACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(155);
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

	public static final String _serializedATN =
		"\2\3\35\u009f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\3\2\3\2\3\2\3\3\6\3)\n\3\r\3\16\3*\3\4\6\4.\n"+
		"\4\r\4\16\4/\3\4\3\4\3\4\3\4\5\4\66\n\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5A\n\5\3\6\3\6\5\6E\n\6\3\7\6\7H\n\7\r\7\16\7I\3\7\6\7M\n\7\r"+
		"\7\16\7N\3\7\3\7\6\7S\n\7\r\7\16\7T\3\7\3\7\6\7Y\n\7\r\7\16\7Z\3\7\6\7"+
		"^\n\7\r\7\16\7_\3\7\3\7\5\7d\n\7\3\b\3\b\5\bh\n\b\3\t\3\t\6\tl\n\t\r\t"+
		"\16\tm\3\t\3\t\3\n\3\n\5\nt\n\n\3\13\5\13w\n\13\3\13\3\13\5\13{\n\13\3"+
		"\f\3\f\3\r\3\r\5\r\u0081\n\r\3\16\3\16\5\16\u0085\n\16\3\17\3\17\6\17"+
		"\u0089\n\17\r\17\16\17\u008a\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\6"+
		"\22\u0095\n\22\r\22\16\22\u0096\3\22\7\22\u009a\n\22\f\22\16\22\u009d"+
		"\13\22\3\22\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\3\27\30"+
		"\5\r\r\31\31\33\33\u00ac\2$\3\2\2\2\4(\3\2\2\2\69\3\2\2\2\b@\3\2\2\2\n"+
		"D\3\2\2\2\fc\3\2\2\2\16e\3\2\2\2\20i\3\2\2\2\22s\3\2\2\2\24v\3\2\2\2\26"+
		"|\3\2\2\2\30~\3\2\2\2\32\u0082\3\2\2\2\34\u0086\3\2\2\2\36\u008c\3\2\2"+
		"\2 \u008f\3\2\2\2\"\u0091\3\2\2\2$%\5\4\3\2%&\7\1\2\2&\3\3\2\2\2\')\5"+
		"\6\4\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\5\3\2\2\2,.\5\b\5\2-"+
		",\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\65\7\24\2\2"+
		"\62\63\5\"\22\2\63\64\7\24\2\2\64\66\3\2\2\2\65\62\3\2\2\2\65\66\3\2\2"+
		"\2\66:\3\2\2\2\67:\5 \21\28:\7\26\2\29-\3\2\2\29\67\3\2\2\298\3\2\2\2"+
		":\7\3\2\2\2;A\5\n\6\2<A\5\34\17\2=A\7\b\2\2>A\7\t\2\2?A\7\23\2\2@;\3\2"+
		"\2\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\t\3\2\2\2BE\5\16\b\2CE\5"+
		"\20\t\2DB\3\2\2\2DC\3\2\2\2E\13\3\2\2\2FH\7\22\2\2GF\3\2\2\2HI\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2Jd\3\2\2\2KM\7\22\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OP\3\2\2\2PR\7\21\2\2QS\7\22\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2"+
		"\2\2TU\3\2\2\2Ud\3\2\2\2VX\7\21\2\2WY\7\22\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3"+
		"\2\2\2Z[\3\2\2\2[d\3\2\2\2\\^\7\22\2\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2"+
		"_`\3\2\2\2`a\3\2\2\2ad\7\21\2\2bd\7\21\2\2cG\3\2\2\2cL\3\2\2\2cV\3\2\2"+
		"\2c]\3\2\2\2cb\3\2\2\2d\r\3\2\2\2eg\5\22\n\2fh\5\f\7\2gf\3\2\2\2gh\3\2"+
		"\2\2h\17\3\2\2\2ik\7\17\2\2jl\5\16\b\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2m"+
		"n\3\2\2\2no\3\2\2\2op\7\20\2\2p\21\3\2\2\2qt\5\24\13\2rt\7\7\2\2sq\3\2"+
		"\2\2sr\3\2\2\2t\23\3\2\2\2uw\7\5\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xz\7"+
		"\31\2\2y{\7\r\2\2zy\3\2\2\2z{\3\2\2\2{\25\3\2\2\2|}\t\2\2\2}\27\3\2\2"+
		"\2~\u0080\5\32\16\2\177\u0081\7\13\2\2\u0080\177\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\31\3\2\2\2\u0082\u0084\7\31\2\2\u0083\u0085\7\n\2\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\33\3\2\2\2\u0086\u0088\5\36\20"+
		"\2\u0087\u0089\5\n\6\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\35\3\2\2\2\u008c\u008d\7\16\2\2\u008d"+
		"\u008e\7\22\2\2\u008e\37\3\2\2\2\u008f\u0090\7\6\2\2\u0090!\3\2\2\2\u0091"+
		"\u009b\7\3\2\2\u0092\u009a\7\34\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u009a\7\23\2\2\u0099\u0092\3\2\2\2\u0099\u0094\3"+
		"\2\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c#\3\2\2\2\u009d\u009b\3\2\2\2\31*/\659@DINTZ_cgms"+
		"vz\u0080\u0084\u008a\u0096\u0099\u009b";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}