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
		VOICE_TEXT=23, OPEN_BRACK=10, PERCENT=16, TUPLET_DIGIT=25, END_COMMENT=19, 
		REST=4, END_LYRIC=20, BASE_NOTE_OCTAVE=17, LYRIC_TEXT=21, END_VOICE=24, 
		NTH_REPEAT=6, LINE_FEED=15, W=1, OPEN_PAREN=9, V=2, ACCIDENTAL=3, NOTE_LENGTH_STRICT=8, 
		COMMENT_TEXT=18, DIGIT=13, LYRICAL_ELEMENTS=22, SPACE=14, NOTE_LENGTH=7, 
		DIVIDE=12, CLOSED_BRACK=11, BAR_LINE=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'w:'", "'V:'", "ACCIDENTAL", "'z'", "BAR_LINE", "NTH_REPEAT", 
		"NOTE_LENGTH", "NOTE_LENGTH_STRICT", "'('", "'['", "']'", "'/'", "DIGIT", 
		"' '", "LINE_FEED", "'%'", "BASE_NOTE_OCTAVE", "COMMENT_TEXT", "END_COMMENT", 
		"END_LYRIC", "LYRIC_TEXT", "LYRICAL_ELEMENTS", "VOICE_TEXT", "END_VOICE", 
		"TUPLET_DIGIT"
	};
	public static final int
		RULE_abc_tune_body = 0, RULE_abc_music = 1, RULE_abc_line = 2, RULE_bar_line = 3, 
		RULE_nth_repeat = 4, RULE_space = 5, RULE_measure = 6, RULE_element = 7, 
		RULE_note_element = 8, RULE_note_length = 9, RULE_note = 10, RULE_multi_note = 11, 
		RULE_note_or_rest = 12, RULE_rest = 13, RULE_pitch = 14, RULE_base_note_octave = 15, 
		RULE_accidental = 16, RULE_tuplet_element = 17, RULE_tuplet_spec = 18, 
		RULE_tuplet_digit = 19, RULE_mid_tune_field = 20, RULE_field_voice = 21, 
		RULE_voice = 22, RULE_lyric = 23, RULE_lyric_text = 24, RULE_lyric_element = 25, 
		RULE_comment = 26, RULE_eol = 27;
	public static final String[] ruleNames = {
		"abc_tune_body", "abc_music", "abc_line", "bar_line", "nth_repeat", "space", 
		"measure", "element", "note_element", "note_length", "note", "multi_note", 
		"note_or_rest", "rest", "pitch", "base_note_octave", "accidental", "tuplet_element", 
		"tuplet_spec", "tuplet_digit", "mid_tune_field", "field_voice", "voice", 
		"lyric", "lyric_text", "lyric_element", "comment", "eol"
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
			setState(56); abc_music();
			setState(57); match(EOF);
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
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59); abc_line();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << V) | (1L << ACCIDENTAL) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE) | (1L << PERCENT) | (1L << BASE_NOTE_OCTAVE))) != 0) );
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
			setState(75);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BAR_LINE:
			case NTH_REPEAT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case SPACE:
			case BASE_NOTE_OCTAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64); element();
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE) | (1L << BASE_NOTE_OCTAVE))) != 0) );
				setState(69); match(LINE_FEED);
				setState(71);
				_la = _input.LA(1);
				if (_la==W) {
					{
					setState(70); lyric();
					}
				}

				}
				break;
			case V:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); mid_tune_field();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
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

	public static class Bar_lineContext extends ParserRuleContext {
		public TerminalNode BAR_LINE() { return getToken(ABCMusicBodyParser.BAR_LINE, 0); }
		public Bar_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bar_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterBar_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitBar_line(this);
		}
	}

	public final Bar_lineContext bar_line() throws RecognitionException {
		Bar_lineContext _localctx = new Bar_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bar_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); match(BAR_LINE);
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

	public static class Nth_repeatContext extends ParserRuleContext {
		public TerminalNode NTH_REPEAT() { return getToken(ABCMusicBodyParser.NTH_REPEAT, 0); }
		public Nth_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nth_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterNth_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitNth_repeat(this);
		}
	}

	public final Nth_repeatContext nth_repeat() throws RecognitionException {
		Nth_repeatContext _localctx = new Nth_repeatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nth_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(NTH_REPEAT);
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

	public static class SpaceContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(ABCMusicBodyParser.SPACE, 0); }
		public SpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_space; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitSpace(this);
		}
	}

	public final SpaceContext space() throws RecognitionException {
		SpaceContext _localctx = new SpaceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_space);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(SPACE);
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

	public static class MeasureContext extends ParserRuleContext {
		public Tuplet_elementContext tuplet_element(int i) {
			return getRuleContext(Tuplet_elementContext.class,i);
		}
		public Note_elementContext note_element(int i) {
			return getRuleContext(Note_elementContext.class,i);
		}
		public Nth_repeatContext nth_repeat(int i) {
			return getRuleContext(Nth_repeatContext.class,i);
		}
		public SpaceContext space(int i) {
			return getRuleContext(SpaceContext.class,i);
		}
		public List<Note_elementContext> note_element() {
			return getRuleContexts(Note_elementContext.class);
		}
		public List<SpaceContext> space() {
			return getRuleContexts(SpaceContext.class);
		}
		public List<Tuplet_elementContext> tuplet_element() {
			return getRuleContexts(Tuplet_elementContext.class);
		}
		public List<Nth_repeatContext> nth_repeat() {
			return getRuleContexts(Nth_repeatContext.class);
		}
		public MeasureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterMeasure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitMeasure(this);
		}
	}

	public final MeasureContext measure() throws RecognitionException {
		MeasureContext _localctx = new MeasureContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_measure);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(87);
					switch (_input.LA(1)) {
					case ACCIDENTAL:
					case REST:
					case OPEN_BRACK:
					case BASE_NOTE_OCTAVE:
						{
						setState(83); note_element();
						}
						break;
					case OPEN_PAREN:
						{
						setState(84); tuplet_element();
						}
						break;
					case NTH_REPEAT:
						{
						setState(85); nth_repeat();
						}
						break;
					case SPACE:
						{
						setState(86); space();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(89); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ElementContext extends ParserRuleContext {
		public MeasureContext measure() {
			return getRuleContext(MeasureContext.class,0);
		}
		public Bar_lineContext bar_line() {
			return getRuleContext(Bar_lineContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_element);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case NTH_REPEAT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case SPACE:
			case BASE_NOTE_OCTAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); measure();
				}
				break;
			case BAR_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); bar_line();
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
		enterRule(_localctx, 16, RULE_note_element);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BASE_NOTE_OCTAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); note();
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); multi_note();
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
		public TerminalNode NOTE_LENGTH() { return getToken(ABCMusicBodyParser.NOTE_LENGTH, 0); }
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
		enterRule(_localctx, 18, RULE_note_length);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(NOTE_LENGTH);
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
		enterRule(_localctx, 20, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); note_or_rest();
			setState(103);
			_la = _input.LA(1);
			if (_la==NOTE_LENGTH) {
				{
				setState(102); note_length();
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
		enterRule(_localctx, 22, RULE_multi_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); match(OPEN_BRACK);
			setState(107); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106); note();
				}
				}
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BASE_NOTE_OCTAVE))) != 0) );
			setState(111); match(CLOSED_BRACK);
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
		public RestContext rest() {
			return getRuleContext(RestContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_note_or_rest);
		try {
			setState(115);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASE_NOTE_OCTAVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(113); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(114); rest();
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

	public static class RestContext extends ParserRuleContext {
		public TerminalNode REST() { return getToken(ABCMusicBodyParser.REST, 0); }
		public RestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitRest(this);
		}
	}

	public final RestContext rest() throws RecognitionException {
		RestContext _localctx = new RestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(REST);
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
		public AccidentalContext accidental() {
			return getRuleContext(AccidentalContext.class,0);
		}
		public Base_note_octaveContext base_note_octave() {
			return getRuleContext(Base_note_octaveContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(119); accidental();
				}
			}

			setState(122); base_note_octave();
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

	public static class Base_note_octaveContext extends ParserRuleContext {
		public TerminalNode BASE_NOTE_OCTAVE() { return getToken(ABCMusicBodyParser.BASE_NOTE_OCTAVE, 0); }
		public Base_note_octaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base_note_octave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterBase_note_octave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitBase_note_octave(this);
		}
	}

	public final Base_note_octaveContext base_note_octave() throws RecognitionException {
		Base_note_octaveContext _localctx = new Base_note_octaveContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_base_note_octave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(BASE_NOTE_OCTAVE);
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

	public static class AccidentalContext extends ParserRuleContext {
		public TerminalNode ACCIDENTAL() { return getToken(ABCMusicBodyParser.ACCIDENTAL, 0); }
		public AccidentalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accidental; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterAccidental(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitAccidental(this);
		}
	}

	public final AccidentalContext accidental() throws RecognitionException {
		AccidentalContext _localctx = new AccidentalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_accidental);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(ACCIDENTAL);
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
		enterRule(_localctx, 34, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128); tuplet_spec();
			setState(130); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(129); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(132); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		public Tuplet_digitContext tuplet_digit() {
			return getRuleContext(Tuplet_digitContext.class,0);
		}
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
		enterRule(_localctx, 36, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(OPEN_PAREN);
			setState(135); tuplet_digit();
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

	public static class Tuplet_digitContext extends ParserRuleContext {
		public TerminalNode TUPLET_DIGIT() { return getToken(ABCMusicBodyParser.TUPLET_DIGIT, 0); }
		public Tuplet_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplet_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterTuplet_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitTuplet_digit(this);
		}
	}

	public final Tuplet_digitContext tuplet_digit() throws RecognitionException {
		Tuplet_digitContext _localctx = new Tuplet_digitContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tuplet_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(TUPLET_DIGIT);
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
		enterRule(_localctx, 40, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); field_voice();
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
		public TerminalNode END_VOICE() { return getToken(ABCMusicBodyParser.END_VOICE, 0); }
		public TerminalNode V() { return getToken(ABCMusicBodyParser.V, 0); }
		public VoiceContext voice() {
			return getRuleContext(VoiceContext.class,0);
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
		enterRule(_localctx, 42, RULE_field_voice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(V);
			setState(142); voice();
			setState(145);
			switch (_input.LA(1)) {
			case END_VOICE:
				{
				setState(143); match(END_VOICE);
				}
				break;
			case LINE_FEED:
			case PERCENT:
				{
				setState(144); eol();
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

	public static class VoiceContext extends ParserRuleContext {
		public List<TerminalNode> VOICE_TEXT() { return getTokens(ABCMusicBodyParser.VOICE_TEXT); }
		public TerminalNode VOICE_TEXT(int i) {
			return getToken(ABCMusicBodyParser.VOICE_TEXT, i);
		}
		public VoiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterVoice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitVoice(this);
		}
	}

	public final VoiceContext voice() throws RecognitionException {
		VoiceContext _localctx = new VoiceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_voice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOICE_TEXT) {
				{
				{
				setState(147); match(VOICE_TEXT);
				}
				}
				setState(152);
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

	public static class LyricContext extends ParserRuleContext {
		public Lyric_elementContext lyric_element(int i) {
			return getRuleContext(Lyric_elementContext.class,i);
		}
		public TerminalNode W() { return getToken(ABCMusicBodyParser.W, 0); }
		public List<Lyric_elementContext> lyric_element() {
			return getRuleContexts(Lyric_elementContext.class);
		}
		public Lyric_textContext lyric_text(int i) {
			return getRuleContext(Lyric_textContext.class,i);
		}
		public List<Lyric_textContext> lyric_text() {
			return getRuleContexts(Lyric_textContext.class);
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
		enterRule(_localctx, 46, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(W);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LYRIC_TEXT || _la==LYRICAL_ELEMENTS) {
				{
				setState(156);
				switch (_input.LA(1)) {
				case LYRIC_TEXT:
					{
					setState(154); lyric_text();
					}
					break;
				case LYRICAL_ELEMENTS:
					{
					setState(155); lyric_element();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161); match(END_LYRIC);
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

	public static class Lyric_textContext extends ParserRuleContext {
		public TerminalNode LYRIC_TEXT() { return getToken(ABCMusicBodyParser.LYRIC_TEXT, 0); }
		public Lyric_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterLyric_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitLyric_text(this);
		}
	}

	public final Lyric_textContext lyric_text() throws RecognitionException {
		Lyric_textContext _localctx = new Lyric_textContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_lyric_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); match(LYRIC_TEXT);
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

	public static class Lyric_elementContext extends ParserRuleContext {
		public TerminalNode LYRICAL_ELEMENTS() { return getToken(ABCMusicBodyParser.LYRICAL_ELEMENTS, 0); }
		public Lyric_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyric_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).enterLyric_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyParserListener ) ((ABCMusicBodyParserListener)listener).exitLyric_element(this);
		}
	}

	public final Lyric_elementContext lyric_element() throws RecognitionException {
		Lyric_elementContext _localctx = new Lyric_elementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lyric_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(LYRICAL_ELEMENTS);
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
		public TerminalNode END_COMMENT() { return getToken(ABCMusicBodyParser.END_COMMENT, 0); }
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
		enterRule(_localctx, 52, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); match(PERCENT);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
				setState(168); match(COMMENT_TEXT);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
		enterRule(_localctx, 54, RULE_eol);
		try {
			setState(178);
			switch (_input.LA(1)) {
			case PERCENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(176); comment();
				}
				break;
			case LINE_FEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); match(LINE_FEED);
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
		"\2\3\33\u00b7\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3"+
		"\2\3\2\3\3\6\3?\n\3\r\3\16\3@\3\4\6\4D\n\4\r\4\16\4E\3\4\3\4\5\4J\n\4"+
		"\3\4\3\4\5\4N\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\6\bZ\n\b\r\b"+
		"\16\b[\3\t\3\t\5\t`\n\t\3\n\3\n\5\nd\n\n\3\13\3\13\3\f\3\f\5\fj\n\f\3"+
		"\r\3\r\6\rn\n\r\r\r\16\ro\3\r\3\r\3\16\3\16\5\16v\n\16\3\17\3\17\3\20"+
		"\5\20{\n\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\6\23\u0085\n\23\r"+
		"\23\16\23\u0086\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u0094\n\27\3\30\7\30\u0097\n\30\f\30\16\30\u009a\13\30\3\31\3\31"+
		"\3\31\7\31\u009f\n\31\f\31\16\31\u00a2\13\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\7\34\u00ac\n\34\f\34\16\34\u00af\13\34\3\34\3\34\3\35"+
		"\3\35\5\35\u00b5\n\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668\2\3\4\21\21\25\25\u00b0\2:\3\2\2\2\4>\3\2\2\2\6"+
		"M\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fS\3\2\2\2\16Y\3\2\2\2\20_\3\2\2\2\22"+
		"c\3\2\2\2\24e\3\2\2\2\26g\3\2\2\2\30k\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2"+
		"\36z\3\2\2\2 ~\3\2\2\2\"\u0080\3\2\2\2$\u0082\3\2\2\2&\u0088\3\2\2\2("+
		"\u008b\3\2\2\2*\u008d\3\2\2\2,\u008f\3\2\2\2.\u0098\3\2\2\2\60\u009b\3"+
		"\2\2\2\62\u00a5\3\2\2\2\64\u00a7\3\2\2\2\66\u00a9\3\2\2\28\u00b4\3\2\2"+
		"\2:;\5\4\3\2;<\7\1\2\2<\3\3\2\2\2=?\5\6\4\2>=\3\2\2\2?@\3\2\2\2@>\3\2"+
		"\2\2@A\3\2\2\2A\5\3\2\2\2BD\5\20\t\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3"+
		"\2\2\2FG\3\2\2\2GI\7\21\2\2HJ\5\60\31\2IH\3\2\2\2IJ\3\2\2\2JN\3\2\2\2"+
		"KN\5*\26\2LN\5\66\34\2MC\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\7\3\2\2\2OP\7\7"+
		"\2\2P\t\3\2\2\2QR\7\b\2\2R\13\3\2\2\2ST\7\20\2\2T\r\3\2\2\2UZ\5\22\n\2"+
		"VZ\5$\23\2WZ\5\n\6\2XZ\5\f\7\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2"+
		"Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\17\3\2\2\2]`\5\16\b\2^`\5\b\5\2_]\3"+
		"\2\2\2_^\3\2\2\2`\21\3\2\2\2ad\5\26\f\2bd\5\30\r\2ca\3\2\2\2cb\3\2\2\2"+
		"d\23\3\2\2\2ef\7\t\2\2f\25\3\2\2\2gi\5\32\16\2hj\5\24\13\2ih\3\2\2\2i"+
		"j\3\2\2\2j\27\3\2\2\2km\7\f\2\2ln\5\26\f\2ml\3\2\2\2no\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2pq\3\2\2\2qr\7\r\2\2r\31\3\2\2\2sv\5\36\20\2tv\5\34\17\2u"+
		"s\3\2\2\2ut\3\2\2\2v\33\3\2\2\2wx\7\6\2\2x\35\3\2\2\2y{\5\"\22\2zy\3\2"+
		"\2\2z{\3\2\2\2{|\3\2\2\2|}\5 \21\2}\37\3\2\2\2~\177\7\23\2\2\177!\3\2"+
		"\2\2\u0080\u0081\7\5\2\2\u0081#\3\2\2\2\u0082\u0084\5&\24\2\u0083\u0085"+
		"\5\22\n\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087%\3\2\2\2\u0088\u0089\7\13\2\2\u0089\u008a\5"+
		"(\25\2\u008a\'\3\2\2\2\u008b\u008c\7\33\2\2\u008c)\3\2\2\2\u008d\u008e"+
		"\5,\27\2\u008e+\3\2\2\2\u008f\u0090\7\4\2\2\u0090\u0093\5.\30\2\u0091"+
		"\u0094\7\32\2\2\u0092\u0094\58\35\2\u0093\u0091\3\2\2\2\u0093\u0092\3"+
		"\2\2\2\u0094-\3\2\2\2\u0095\u0097\7\31\2\2\u0096\u0095\3\2\2\2\u0097\u009a"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099/\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u00a0\7\3\2\2\u009c\u009f\5\62\32\2\u009d\u009f\5"+
		"\64\33\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\7\26\2\2\u00a4\61\3\2\2\2\u00a5\u00a6\7\27\2\2\u00a6"+
		"\63\3\2\2\2\u00a7\u00a8\7\30\2\2\u00a8\65\3\2\2\2\u00a9\u00ad\7\22\2\2"+
		"\u00aa\u00ac\7\24\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b1\t\2\2\2\u00b1\67\3\2\2\2\u00b2\u00b5\5\66\34\2\u00b3\u00b5\7\21"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b59\3\2\2\2\25@EIMY[_"+
		"ciouz\u0086\u0093\u0098\u009e\u00a0\u00ad\u00b4";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}