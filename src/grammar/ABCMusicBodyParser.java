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
		VOICE_TEXT=25, OPEN_BRACK=12, PERCENT=18, BASE_NOTE=19, END_COMMENT=21, 
		REST=4, END_LYRIC=22, LYRIC_TEXT=23, NTH_REPEAT=6, OCTAVE=10, LINE_FEED=17, 
		W=1, OPEN_PAREN=11, V=2, ACCIDENTAL=3, NOTE_LENGTH_STRICT=9, COMMENT_TEXT=20, 
		DIGIT=15, KEY_ACCIDENTAL=7, LYRICAL_ELEMENTS=24, SPACE=16, MODE_MINOR=8, 
		DIVIDE=14, CLOSED_BRACK=13, BAR_LINE=5;
	public static final String[] tokenNames = {
		"<INVALID>", "'w:'", "'V:'", "ACCIDENTAL", "'z'", "BAR_LINE", "NTH_REPEAT", 
		"KEY_ACCIDENTAL", "'m'", "NOTE_LENGTH_STRICT", "OCTAVE", "'('", "'['", 
		"']'", "'/'", "DIGIT", "' '", "LINE_FEED", "'%'", "BASE_NOTE", "COMMENT_TEXT", 
		"END_COMMENT", "END_LYRIC", "LYRIC_TEXT", "LYRICAL_ELEMENTS", "VOICE_TEXT"
	};
	public static final int
		RULE_abc_tune_body = 0, RULE_abc_music = 1, RULE_abc_line = 2, RULE_bar_line = 3, 
		RULE_nth_repeat = 4, RULE_space = 5, RULE_element = 6, RULE_note_element = 7, 
		RULE_note_length = 8, RULE_measure = 9, RULE_note = 10, RULE_multi_note = 11, 
		RULE_note_or_rest = 12, RULE_pitch = 13, RULE_key = 14, RULE_key_note = 15, 
		RULE_tuplet_element = 16, RULE_tuplet_spec = 17, RULE_mid_tune_field = 18, 
		RULE_field_voice = 19, RULE_lyric = 20, RULE_comment = 21, RULE_eol = 22;
	public static final String[] ruleNames = {
		"abc_tune_body", "abc_music", "abc_line", "bar_line", "nth_repeat", "space", 
		"element", "note_element", "note_length", "measure", "note", "multi_note", 
		"note_or_rest", "pitch", "key", "key_note", "tuplet_element", "tuplet_spec", 
		"mid_tune_field", "field_voice", "lyric", "comment", "eol"
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
			setState(46); abc_music();
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
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49); abc_line();
				}
				}
				setState(52); 
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
			setState(65);
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
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54); element();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << SPACE) | (1L << BASE_NOTE))) != 0) );
				setState(59); match(LINE_FEED);
				setState(61);
				_la = _input.LA(1);
				if (_la==W) {
					{
					setState(60); lyric();
					}
				}

				}
				break;
			case V:
				enterOuterAlt(_localctx, 2);
				{
				setState(63); mid_tune_field();
				}
				break;
			case PERCENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(64); comment();
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
			setState(67); match(BAR_LINE);
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
			setState(69); match(NTH_REPEAT);
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
			setState(71); match(SPACE);
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
		enterRule(_localctx, 12, RULE_element);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case NTH_REPEAT:
			case OPEN_PAREN:
			case OPEN_BRACK:
			case SPACE:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); measure();
				}
				break;
			case BAR_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); bar_line();
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
		enterRule(_localctx, 14, RULE_note_element);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case REST:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); note();
				}
				break;
			case OPEN_BRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); multi_note();
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
		enterRule(_localctx, 16, RULE_note_length);
		int _la;
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(81); match(DIGIT);
					}
					}
					setState(84); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86); match(DIGIT);
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(91); match(DIVIDE);
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(92); match(DIGIT);
					}
					}
					setState(95); 
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
				setState(97); match(DIVIDE);
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98); match(DIGIT);
					}
					}
					setState(101); 
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
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(103); match(DIGIT);
					}
					}
					setState(106); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
				setState(108); match(DIVIDE);
				}
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(109); match(DIVIDE);
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
		enterRule(_localctx, 18, RULE_measure);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(116);
					switch (_input.LA(1)) {
					case ACCIDENTAL:
					case REST:
					case OPEN_BRACK:
					case BASE_NOTE:
						{
						setState(112); note_element();
						}
						break;
					case OPEN_PAREN:
						{
						setState(113); tuplet_element();
						}
						break;
					case NTH_REPEAT:
						{
						setState(114); nth_repeat();
						}
						break;
					case SPACE:
						{
						setState(115); space();
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
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(120); note_or_rest();
			setState(122);
			_la = _input.LA(1);
			if (_la==DIVIDE || _la==DIGIT) {
				{
				setState(121); note_length();
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
			setState(124); match(OPEN_BRACK);
			setState(126); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(125); note();
				}
				}
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCIDENTAL) | (1L << REST) | (1L << BASE_NOTE))) != 0) );
			setState(130); match(CLOSED_BRACK);
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
		enterRule(_localctx, 24, RULE_note_or_rest);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case ACCIDENTAL:
			case BASE_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(132); pitch();
				}
				break;
			case REST:
				enterOuterAlt(_localctx, 2);
				{
				setState(133); match(REST);
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
		enterRule(_localctx, 26, RULE_pitch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if (_la==ACCIDENTAL) {
				{
				setState(136); match(ACCIDENTAL);
				}
			}

			setState(139); match(BASE_NOTE);
			setState(141);
			_la = _input.LA(1);
			if (_la==OCTAVE) {
				{
				setState(140); match(OCTAVE);
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
		enterRule(_localctx, 28, RULE_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); key_note();
			setState(145);
			_la = _input.LA(1);
			if (_la==MODE_MINOR) {
				{
				setState(144); match(MODE_MINOR);
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
		enterRule(_localctx, 30, RULE_key_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(BASE_NOTE);
			setState(149);
			_la = _input.LA(1);
			if (_la==KEY_ACCIDENTAL) {
				{
				setState(148); match(KEY_ACCIDENTAL);
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
		enterRule(_localctx, 32, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151); tuplet_spec();
			setState(153); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(152); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(155); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		enterRule(_localctx, 34, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(OPEN_PAREN);
			setState(158); match(DIGIT);
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
		enterRule(_localctx, 36, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); field_voice();
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
		enterRule(_localctx, 38, RULE_field_voice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(V);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163); match(VOICE_TEXT);
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOICE_TEXT );
			setState(168); eol();
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
		enterRule(_localctx, 40, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(W);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LYRIC_TEXT || _la==LYRICAL_ELEMENTS) {
				{
				{
				setState(171);
				_la = _input.LA(1);
				if ( !(_la==LYRIC_TEXT || _la==LYRICAL_ELEMENTS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177); match(END_LYRIC);
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
		enterRule(_localctx, 42, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); match(PERCENT);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMENT_TEXT) {
				{
				{
				setState(180); match(COMMENT_TEXT);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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
		enterRule(_localctx, 44, RULE_eol);
		try {
			setState(190);
			switch (_input.LA(1)) {
			case PERCENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(188); comment();
				}
				break;
			case LINE_FEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); match(LINE_FEED);
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
		"\2\3\33\u00c3\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\4\30\t\30\3\2\3\2\3\2\3\3\6\3\65\n\3\r\3\16\3\66\3\4\6\4:\n\4\r\4"+
		"\16\4;\3\4\3\4\5\4@\n\4\3\4\3\4\5\4D\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\5\bN\n\b\3\t\3\t\5\tR\n\t\3\n\6\nU\n\n\r\n\16\nV\3\n\6\nZ\n\n\r\n\16"+
		"\n[\3\n\3\n\6\n`\n\n\r\n\16\na\3\n\3\n\6\nf\n\n\r\n\16\ng\3\n\6\nk\n\n"+
		"\r\n\16\nl\3\n\3\n\5\nq\n\n\3\13\3\13\3\13\3\13\6\13w\n\13\r\13\16\13"+
		"x\3\f\3\f\5\f}\n\f\3\r\3\r\6\r\u0081\n\r\r\r\16\r\u0082\3\r\3\r\3\16\3"+
		"\16\5\16\u0089\n\16\3\17\5\17\u008c\n\17\3\17\3\17\5\17\u0090\n\17\3\20"+
		"\3\20\5\20\u0094\n\20\3\21\3\21\5\21\u0098\n\21\3\22\3\22\6\22\u009c\n"+
		"\22\r\22\16\22\u009d\3\23\3\23\3\23\3\24\3\24\3\25\3\25\6\25\u00a7\n\25"+
		"\r\25\16\25\u00a8\3\25\3\25\3\26\3\26\7\26\u00af\n\26\f\26\16\26\u00b2"+
		"\13\26\3\26\3\26\3\27\3\27\7\27\u00b8\n\27\f\27\16\27\u00bb\13\27\3\27"+
		"\3\27\3\30\3\30\5\30\u00c1\n\30\3\30\2\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\4\3\31\32\4\23\23\27\27\u00cb\2\60\3\2\2\2\4\64\3"+
		"\2\2\2\6C\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fI\3\2\2\2\16M\3\2\2\2\20Q\3\2"+
		"\2\2\22p\3\2\2\2\24v\3\2\2\2\26z\3\2\2\2\30~\3\2\2\2\32\u0088\3\2\2\2"+
		"\34\u008b\3\2\2\2\36\u0091\3\2\2\2 \u0095\3\2\2\2\"\u0099\3\2\2\2$\u009f"+
		"\3\2\2\2&\u00a2\3\2\2\2(\u00a4\3\2\2\2*\u00ac\3\2\2\2,\u00b5\3\2\2\2."+
		"\u00c0\3\2\2\2\60\61\5\4\3\2\61\62\7\1\2\2\62\3\3\2\2\2\63\65\5\6\4\2"+
		"\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\2"+
		"8:\5\16\b\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\7\23\2"+
		"\2>@\5*\26\2?>\3\2\2\2?@\3\2\2\2@D\3\2\2\2AD\5&\24\2BD\5,\27\2C9\3\2\2"+
		"\2CA\3\2\2\2CB\3\2\2\2D\7\3\2\2\2EF\7\7\2\2F\t\3\2\2\2GH\7\b\2\2H\13\3"+
		"\2\2\2IJ\7\22\2\2J\r\3\2\2\2KN\5\24\13\2LN\5\b\5\2MK\3\2\2\2ML\3\2\2\2"+
		"N\17\3\2\2\2OR\5\26\f\2PR\5\30\r\2QO\3\2\2\2QP\3\2\2\2R\21\3\2\2\2SU\7"+
		"\21\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2Wq\3\2\2\2XZ\7\21\2\2Y"+
		"X\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7\20\2\2^`\7\21"+
		"\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2bq\3\2\2\2ce\7\20\2\2df\7"+
		"\21\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2hq\3\2\2\2ik\7\21\2\2j"+
		"i\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2mn\3\2\2\2nq\7\20\2\2oq\7\20\2"+
		"\2pT\3\2\2\2pY\3\2\2\2pc\3\2\2\2pj\3\2\2\2po\3\2\2\2q\23\3\2\2\2rw\5\20"+
		"\t\2sw\5\"\22\2tw\5\n\6\2uw\5\f\7\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3"+
		"\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\25\3\2\2\2z|\5\32\16\2{}\5\22\n"+
		"\2|{\3\2\2\2|}\3\2\2\2}\27\3\2\2\2~\u0080\7\16\2\2\177\u0081\5\26\f\2"+
		"\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\17\2\2\u0085\31\3\2\2\2\u0086"+
		"\u0089\5\34\17\2\u0087\u0089\7\6\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3"+
		"\2\2\2\u0089\33\3\2\2\2\u008a\u008c\7\5\2\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\25\2\2\u008e\u0090\7"+
		"\f\2\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\35\3\2\2\2\u0091"+
		"\u0093\5 \21\2\u0092\u0094\7\n\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\37\3\2\2\2\u0095\u0097\7\25\2\2\u0096\u0098\7\t\2\2\u0097\u0096"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098!\3\2\2\2\u0099\u009b\5$\23\2\u009a"+
		"\u009c\5\20\t\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e#\3\2\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1"+
		"\7\21\2\2\u00a1%\3\2\2\2\u00a2\u00a3\5(\25\2\u00a3\'\3\2\2\2\u00a4\u00a6"+
		"\7\4\2\2\u00a5\u00a7\7\33\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab"+
		"\5.\30\2\u00ab)\3\2\2\2\u00ac\u00b0\7\3\2\2\u00ad\u00af\t\2\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\30\2\2\u00b4"+
		"+\3\2\2\2\u00b5\u00b9\7\24\2\2\u00b6\u00b8\7\26\2\2\u00b7\u00b6\3\2\2"+
		"\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\t\3\2\2\u00bd-\3\2\2\2\u00be"+
		"\u00c1\5,\27\2\u00bf\u00c1\7\23\2\2\u00c0\u00be\3\2\2\2\u00c0\u00bf\3"+
		"\2\2\2\u00c1/\3\2\2\2\34\66;?CMQV[aglpvx|\u0082\u0088\u008b\u008f\u0093"+
		"\u0097\u009d\u00a8\u00b0\u00b9\u00c0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}