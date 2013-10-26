// Generated from ABCMusicBodyParser.g4 by ANTLR 4.0

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
		VOICE_TEXT=27, OPEN_BRACK=12, PERCENT=18, BASE_NOTE=21, REST=4, END_LYRIC=24, 
		OCTAVE=10, NTH_REPEAT=6, OPEN_PAREN=11, W=1, V=2, ACCIDENTAL=3, METER_VARIANTS=19, 
		COMMENT_TEXT=23, KEY_ACCIDENTAL=7, METER_FRACTION=20, MODE_MINOR=8, SPACE=16, 
		LYRIC_TEXT=25, LINE_FEED=17, NOTE_LENGTH_STRICT=9, DIGIT=15, LYRICAL_ELEMENTS=26, 
		TEMPO=22, DIVIDE=14, CLOSED_BRACK=13, BAR_LINE=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'w:'", "'V:'", "ACCIDENTAL", "'z'", "BAR_LINE", "NTH_REPEAT", 
		"KEY_ACCIDENTAL", "'m'", "NOTE_LENGTH_STRICT", "OCTAVE", "'('", "'['", 
		"']'", "'/'", "DIGIT", "' '", "LINE_FEED", "'%'", "METER_VARIANTS", "METER_FRACTION", 
		"BASE_NOTE", "TEMPO", "COMMENT_TEXT", "END_LYRIC", "LYRIC_TEXT", "LYRICAL_ELEMENTS", 
		"VOICE_TEXT"
	};
	public static final int
		RULE_abc_tune_body = 0, RULE_abc_music = 1, RULE_abc_line = 2, RULE_element = 3, 
		RULE_note_element = 4, RULE_note_length = 5, RULE_note = 6, RULE_multi_note = 7, 
		RULE_note_or_rest = 8, RULE_pitch = 9, RULE_meter = 10, RULE_key = 11, 
		RULE_key_note = 12, RULE_tuplet_element = 13, RULE_tuplet_spec = 14, RULE_mid_tune_field = 15, 
		RULE_field_voice = 16, RULE_lyric = 17, RULE_comment = 18, RULE_eol = 19;
	public static final String[] ruleNames = {
		"abc_tune_body", "abc_music", "abc_line", "element", "note_element", "note_length", 
		"note", "multi_note", "note_or_rest", "pitch", "meter", "key", "key_note", 
		"tuplet_element", "tuplet_spec", "mid_tune_field", "field_voice", "lyric", 
		"comment", "eol"
	};

	@Override
	public String getGrammarFileName() { return "ABCMusicBodyParser.g4"; }

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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterAbc_tune_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitAbc_tune_body(this);
		}
	}

	public final Abc_tune_bodyContext abc_tune_body() throws RecognitionException {
		Abc_tune_bodyContext _localctx = new Abc_tune_bodyContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_abc_tune_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); abc_music();
			setState(41); match(EOF);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterAbc_music(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitAbc_music(this);
		}
	}

	public final Abc_musicContext abc_music() throws RecognitionException {
		Abc_musicContext _localctx = new Abc_musicContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abc_music);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43); abc_line();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << V) | (1L << ACCIDENTAL) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE) | (1L << PERCENT) | (1L << BASE_NOTE))) != 0) );
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
		public TerminalNode LINE_FEED() { return getToken(ABCMusicBodyParser.LINE_FEED, 0); }
		public LyricContext lyric() {
			return getRuleContext(LyricContext.class,0);
		}
		public Mid_tune_fieldContext mid_tune_field() {
			return getRuleContext(Mid_tune_fieldContext.class,0);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Abc_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abc_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterAbc_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitAbc_line(this);
		}
	}

	public final Abc_lineContext abc_line() throws RecognitionException {
		Abc_lineContext _localctx = new Abc_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_abc_line);
		int _la;
		try {
			setState(59);
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
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(48); element();
					}
					}
					setState(51); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE) | (1L << BASE_NOTE))) != 0) );
				setState(53); match(LINE_FEED);
				setState(55);
				_la = _input.LA(1);
				if (_la==W) {
					{
					setState(54); lyric();
					}
				}

				}
				break;
			case V:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); mid_tune_field();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); comment();
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(66);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case OPEN_BRACK:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); note_element();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); tuplet_element();
				}
				break;
			case BAR_LINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); match(BAR_LINE);
				}
				break;
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); match(NTH_REPEAT);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(65); match(SPACE);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterNote_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitNote_element(this);
		}
	}

	public final Note_elementContext note_element() throws RecognitionException {
		Note_elementContext _localctx = new Note_elementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_note_element);
		try {
			setState(70);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); note();
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(69); multi_note();
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterNote_length(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitNote_length(this);
		}
	}

	public final Note_lengthContext note_length() throws RecognitionException {
		Note_lengthContext _localctx = new Note_lengthContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_note_length);
		int _la;
		try {
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(72); match(DIGIT);
					}
					}
					setState(75); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77); match(DIGIT);
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(82); match(DIVIDE);
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(83); match(DIGIT);
					}
					}
					setState(86); 
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
				setState(88); match(DIVIDE);
				setState(90); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(89); match(DIGIT);
					}
					}
					setState(92); 
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
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94); match(DIGIT);
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(99); match(DIVIDE);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100); match(DIVIDE);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterNote(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitNote(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); note_or_rest();
			setState(105);
			_la = _input.LA(1);
			if (_la==DIVIDE || _la==DIGIT) {
				{
				setState(104); note_length();
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterMulti_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitMulti_note(this);
		}
	}

	public final Multi_noteContext multi_note() throws RecognitionException {
		Multi_noteContext _localctx = new Multi_noteContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(OPEN_BRACK);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108); note();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BASE_NOTE))) != 0) );
			setState(113); match(CLOSED_BRACK);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterNote_or_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitNote_or_rest(this);
		}
	}

	public final Note_or_restContext note_or_rest() throws RecognitionException {
		Note_or_restContext _localctx = new Note_or_restContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_note_or_rest);
		try {
			setState(117);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(115); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(116); match(REST);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterPitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitPitch(this);
		}
	}

	public final PitchContext pitch() throws RecognitionException {
		PitchContext _localctx = new PitchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(119); match(ACCIDENTAL);
				}
			}

			setState(122); match(BASE_NOTE);
			setState(124);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(123); match(OCTAVE);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterMeter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitMeter(this);
		}
	}

	public final MeterContext meter() throws RecognitionException {
		MeterContext _localctx = new MeterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_meter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitKey(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128); key_note();
			setState(130);
			_la = _input.LA(1);
			if (_la==MODE_MINOR) {
				{
				setState(129); match(MODE_MINOR);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterKey_note(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitKey_note(this);
		}
	}

	public final Key_noteContext key_note() throws RecognitionException {
		Key_noteContext _localctx = new Key_noteContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_key_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(BASE_NOTE);
			setState(134);
			_la = _input.LA(1);
			if (_la==KEY_ACCIDENTAL) {
				{
				setState(133); match(KEY_ACCIDENTAL);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterTuplet_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitTuplet_element(this);
		}
	}

	public final Tuplet_elementContext tuplet_element() throws RecognitionException {
		Tuplet_elementContext _localctx = new Tuplet_elementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136); tuplet_spec();
			setState(138); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(137); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(140); 
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterTuplet_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitTuplet_spec(this);
		}
	}

	public final Tuplet_specContext tuplet_spec() throws RecognitionException {
		Tuplet_specContext _localctx = new Tuplet_specContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(OPEN_PAREN);
			setState(143); match(DIGIT);
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
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterMid_tune_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitMid_tune_field(this);
		}
	}

	public final Mid_tune_fieldContext mid_tune_field() throws RecognitionException {
		Mid_tune_fieldContext _localctx = new Mid_tune_fieldContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); field_voice();
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
		public List<TerminalNode> VOICE_TEXT() { return getTokens(ABCMusicBodyParser.VOICE_TEXT); }
		public TerminalNode V() { return getToken(ABCMusicBodyParser.V, 0); }
		public TerminalNode VOICE_TEXT(int i) {
			return getToken(ABCMusicBodyParser.VOICE_TEXT, i);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public Field_voiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterField_voice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitField_voice(this);
		}
	}

	public final Field_voiceContext field_voice() throws RecognitionException {
		Field_voiceContext _localctx = new Field_voiceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_field_voice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(V);
			setState(149); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(148); match(VOICE_TEXT);
				}
				}
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOICE_TEXT );
			setState(153); eol();
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
		public TerminalNode W() { return getToken(ABCMusicBodyParser.W, 0); }
		public TerminalNode LYRICAL_ELEMENTS(int i) {
			return getToken(ABCMusicBodyParser.LYRICAL_ELEMENTS, i);
		}
		public List<TerminalNode> LYRICAL_ELEMENTS() { return getTokens(ABCMusicBodyParser.LYRICAL_ELEMENTS); }
		public TerminalNode LYRIC_TEXT(int i) {
			return getToken(ABCMusicBodyParser.LYRIC_TEXT, i);
		}
		public TerminalNode END_LYRIC() { return getToken(ABCMusicBodyParser.END_LYRIC, 0); }
		public LyricContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterLyric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitLyric(this);
		}
	}

	public final LyricContext lyric() throws RecognitionException {
		LyricContext _localctx = new LyricContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(W);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LYRIC_TEXT || _la==LYRICAL_ELEMENTS) {
				{
				{
				setState(156);
				_la = _input.LA(1);
				if ( !(_la==LYRIC_TEXT || _la==LYRICAL_ELEMENTS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162); match(END_LYRIC);
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
		public TerminalNode LINE_FEED() { return getToken(ABCMusicBodyParser.LINE_FEED, 0); }
		public List<TerminalNode> COMMENT_TEXT() { return getTokens(ABCMusicBodyParser.COMMENT_TEXT); }
		public TerminalNode PERCENT() { return getToken(ABCMusicBodyParser.PERCENT, 0); }
		public TerminalNode COMMENT_TEXT(int i) {
			return getToken(ABCMusicBodyParser.COMMENT_TEXT, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(PERCENT);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
				setState(165); match(COMMENT_TEXT);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171); match(LINE_FEED);
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
		public TerminalNode LINE_FEED() { return getToken(ABCMusicBodyParser.LINE_FEED, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eol);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case PERCENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); comment();
				}
				break;
			case LINE_FEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); match(LINE_FEED);
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

	public static final String _serializedATN =
		"\2\3\35\u00b4\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3"+
		"\6\3/\n\3\r\3\16\3\60\3\4\6\4\64\n\4\r\4\16\4\65\3\4\3\4\5\4:\n\4\3\4"+
		"\3\4\5\4>\n\4\3\5\3\5\3\5\3\5\3\5\5\5E\n\5\3\6\3\6\5\6I\n\6\3\7\6\7L\n"+
		"\7\r\7\16\7M\3\7\6\7Q\n\7\r\7\16\7R\3\7\3\7\6\7W\n\7\r\7\16\7X\3\7\3\7"+
		"\6\7]\n\7\r\7\16\7^\3\7\6\7b\n\7\r\7\16\7c\3\7\3\7\5\7h\n\7\3\b\3\b\5"+
		"\bl\n\b\3\t\3\t\6\tp\n\t\r\t\16\tq\3\t\3\t\3\n\3\n\5\nx\n\n\3\13\5\13"+
		"{\n\13\3\13\3\13\5\13\177\n\13\3\f\3\f\3\r\3\r\5\r\u0085\n\r\3\16\3\16"+
		"\5\16\u0089\n\16\3\17\3\17\6\17\u008d\n\17\r\17\16\17\u008e\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\6\22\u0098\n\22\r\22\16\22\u0099\3\22\3\22\3"+
		"\23\3\23\7\23\u00a0\n\23\f\23\16\23\u00a3\13\23\3\23\3\23\3\24\3\24\7"+
		"\24\u00a9\n\24\f\24\16\24\u00ac\13\24\3\24\3\24\3\25\3\25\5\25\u00b2\n"+
		"\25\3\25\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\4\3\25\26"+
		"\3\33\34\u00be\2*\3\2\2\2\4.\3\2\2\2\6=\3\2\2\2\bD\3\2\2\2\nH\3\2\2\2"+
		"\fg\3\2\2\2\16i\3\2\2\2\20m\3\2\2\2\22w\3\2\2\2\24z\3\2\2\2\26\u0080\3"+
		"\2\2\2\30\u0082\3\2\2\2\32\u0086\3\2\2\2\34\u008a\3\2\2\2\36\u0090\3\2"+
		"\2\2 \u0093\3\2\2\2\"\u0095\3\2\2\2$\u009d\3\2\2\2&\u00a6\3\2\2\2(\u00b1"+
		"\3\2\2\2*+\5\4\3\2+,\7\1\2\2,\3\3\2\2\2-/\5\6\4\2.-\3\2\2\2/\60\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2"+
		"\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\679\7\23\2\2"+
		"8:\5$\23\298\3\2\2\29:\3\2\2\2:>\3\2\2\2;>\5 \21\2<>\5&\24\2=\63\3\2\2"+
		"\2=;\3\2\2\2=<\3\2\2\2>\7\3\2\2\2?E\5\n\6\2@E\5\34\17\2AE\7\7\2\2BE\7"+
		"\b\2\2CE\7\22\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\t"+
		"\3\2\2\2FI\5\16\b\2GI\5\20\t\2HF\3\2\2\2HG\3\2\2\2I\13\3\2\2\2JL\7\21"+
		"\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2Nh\3\2\2\2OQ\7\21\2\2PO\3"+
		"\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TV\7\20\2\2UW\7\21\2\2V"+
		"U\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Yh\3\2\2\2Z\\\7\20\2\2[]\7\21\2"+
		"\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_h\3\2\2\2`b\7\21\2\2a`\3"+
		"\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2eh\7\20\2\2fh\7\20\2\2g"+
		"K\3\2\2\2gP\3\2\2\2gZ\3\2\2\2ga\3\2\2\2gf\3\2\2\2h\r\3\2\2\2ik\5\22\n"+
		"\2jl\5\f\7\2kj\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mo\7\16\2\2np\5\16\b\2on\3"+
		"\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\17\2\2t\21\3\2\2\2"+
		"ux\5\24\13\2vx\7\6\2\2wu\3\2\2\2wv\3\2\2\2x\23\3\2\2\2y{\7\5\2\2zy\3\2"+
		"\2\2z{\3\2\2\2{|\3\2\2\2|~\7\27\2\2}\177\7\f\2\2~}\3\2\2\2~\177\3\2\2"+
		"\2\177\25\3\2\2\2\u0080\u0081\t\2\2\2\u0081\27\3\2\2\2\u0082\u0084\5\32"+
		"\16\2\u0083\u0085\7\n\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\31\3\2\2\2\u0086\u0088\7\27\2\2\u0087\u0089\7\t\2\2\u0088\u0087\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\33\3\2\2\2\u008a\u008c\5\36\20\2\u008b\u008d"+
		"\5\n\6\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\35\3\2\2\2\u0090\u0091\7\r\2\2\u0091\u0092\7\21\2"+
		"\2\u0092\37\3\2\2\2\u0093\u0094\5\"\22\2\u0094!\3\2\2\2\u0095\u0097\7"+
		"\4\2\2\u0096\u0098\7\35\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\5("+
		"\25\2\u009c#\3\2\2\2\u009d\u00a1\7\3\2\2\u009e\u00a0\t\3\2\2\u009f\u009e"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\32\2\2\u00a5%\3\2\2\2"+
		"\u00a6\u00aa\7\24\2\2\u00a7\u00a9\7\31\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7\23\2\2\u00ae\'\3\2\2\2\u00af\u00b2\5&\24"+
		"\2\u00b0\u00b2\7\23\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2"+
		")\3\2\2\2\32\60\659=DHMRX^cgkqwz~\u0084\u0088\u008e\u0099\u00a1\u00aa"+
		"\u00b1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}