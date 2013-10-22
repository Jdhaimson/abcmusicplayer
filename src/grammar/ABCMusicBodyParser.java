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
		W=1, V=2, FIELD_VOICE=3, ACCIDENTAL=4, BASE_NOTE=5, REST=6, BAR_LINE=7, 
		NTH_REPEAT=8, KEY_ACCIDENTAL=9, MODE_MINOR=10, NOTE_LENGTH_STRICT=11, 
		EQUALS=12, OCTAVE=13, OPEN_PAREN=14, OPEN_BRACK=15, CLOSED_BRACK=16, DIVIDE=17, 
		DIGIT=18, SPACE=19, LINE_FEED=20, PERCENT=21, LYRIC_TEXT=22, LYRIC_ELEMENTS=23, 
		METER_VARIANTS=24, METER_FRACTION=25, METER=26, NOTE=27, NOTE_OR_REST=28, 
		PITCH=29, NOTE_LENGTH=30, TEMPO=31, KEY=32, KEY_NOTE=33, COMMENT=34, EOL=35, 
		MULTI_NOTE=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'w:'", "'V:'", "FIELD_VOICE", "ACCIDENTAL", "BASE_NOTE", 
		"'z'", "BAR_LINE", "NTH_REPEAT", "KEY_ACCIDENTAL", "'m'", "NOTE_LENGTH_STRICT", 
		"'='", "OCTAVE", "'('", "'['", "']'", "'/'", "DIGIT", "' '", "LINE_FEED", 
		"'%'", "LYRIC_TEXT", "LYRIC_ELEMENTS", "METER_VARIANTS", "METER_FRACTION", 
		"METER", "NOTE", "NOTE_OR_REST", "PITCH", "NOTE_LENGTH", "TEMPO", "KEY", 
		"KEY_NOTE", "COMMENT", "EOL", "MULTI_NOTE"
	};
	public static final int
		RULE_abc_tune_body = 0, RULE_abc_music = 1, RULE_abc_line = 2, RULE_element = 3, 
		RULE_note_element = 4, RULE_tuplet_element = 5, RULE_tuplet_spec = 6, 
		RULE_mid_tune_field = 7, RULE_lyric = 8, RULE_lyrical_element = 9;
	public static final String[] ruleNames = {
		"abc_tune_body", "abc_music", "abc_line", "element", "note_element", "tuplet_element", 
		"tuplet_spec", "mid_tune_field", "lyric", "lyrical_element"
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
			setState(20); abc_music();
			setState(21); match(EOF);
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
			setState(24); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23); abc_line();
				}
				}
				setState(26); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIELD_VOICE) | (1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << SPACE) | (1L << NOTE) | (1L << COMMENT) | (1L << MULTI_NOTE))) != 0) );
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
			setState(41);
			switch (_input.LA(1)) {
			case BAR_LINE:
			case NTH_REPEAT:
			case OPEN_PAREN:
			case SPACE:
			case NOTE:
			case MULTI_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(28); element();
					}
					}
					setState(31); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BAR_LINE) | (1L << NTH_REPEAT) | (1L << OPEN_PAREN) | (1L << SPACE) | (1L << NOTE) | (1L << MULTI_NOTE))) != 0) );
				setState(33); match(LINE_FEED);
				setState(37);
				_la = _input.LA(1);
				if (_la==W) {
					{
					setState(34); lyric();
					setState(35); match(LINE_FEED);
					}
				}

				}
				break;
			case FIELD_VOICE:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); mid_tune_field();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(40); match(COMMENT);
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
			setState(48);
			switch (_input.LA(1)) {
			case NOTE:
			case MULTI_NOTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); note_element();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); tuplet_element();
				}
				break;
			case BAR_LINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); match(BAR_LINE);
				}
				break;
			case NTH_REPEAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); match(NTH_REPEAT);
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(47); match(SPACE);
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
		public TerminalNode MULTI_NOTE() { return getToken(ABCMusicBodyParser.MULTI_NOTE, 0); }
		public TerminalNode NOTE() { return getToken(ABCMusicBodyParser.NOTE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !(_la==NOTE || _la==MULTI_NOTE) ) {
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
		enterRule(_localctx, 10, RULE_tuplet_element);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52); tuplet_spec();
			setState(54); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(53); note_element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56); 
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
		enterRule(_localctx, 12, RULE_tuplet_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(OPEN_PAREN);
			setState(59); match(DIGIT);
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
		enterRule(_localctx, 14, RULE_mid_tune_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(FIELD_VOICE);
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
		public TerminalNode W() { return getToken(ABCMusicBodyParser.W, 0); }
		public Lyrical_elementContext lyrical_element(int i) {
			return getRuleContext(Lyrical_elementContext.class,i);
		}
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
		enterRule(_localctx, 16, RULE_lyric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(W);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LYRIC_TEXT || _la==LYRIC_ELEMENTS) {
				{
				{
				setState(64); lyrical_element();
				}
				}
				setState(69);
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
		public List<TerminalNode> LYRIC_TEXT() { return getTokens(ABCMusicBodyParser.LYRIC_TEXT); }
		public TerminalNode LYRIC_TEXT(int i) {
			return getToken(ABCMusicBodyParser.LYRIC_TEXT, i);
		}
		public TerminalNode LYRIC_ELEMENTS() { return getToken(ABCMusicBodyParser.LYRIC_ELEMENTS, 0); }
		public Lyrical_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lyrical_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).enterLyrical_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ABCMusicBodyListener ) ((ABCMusicBodyListener)listener).exitLyrical_element(this);
		}
	}

	public final Lyrical_elementContext lyrical_element() throws RecognitionException {
		Lyrical_elementContext _localctx = new Lyrical_elementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lyrical_element);
		try {
			int _alt;
			setState(76);
			switch (_input.LA(1)) {
			case LYRIC_ELEMENTS:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(LYRIC_ELEMENTS);
				}
				break;
			case LYRIC_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(71); match(LYRIC_TEXT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(74); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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
		"\2\3&Q\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t"+
		"\4\n\t\n\4\13\t\13\3\2\3\2\3\2\3\3\6\3\33\n\3\r\3\16\3\34\3\4\6\4 \n\4"+
		"\r\4\16\4!\3\4\3\4\3\4\3\4\5\4(\n\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\63\n\5\3\6\3\6\3\7\3\7\6\79\n\7\r\7\16\7:\3\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\7\nD\n\n\f\n\16\nG\13\n\3\13\3\13\6\13K\n\13\r\13\16\13L\5\13O"+
		"\n\13\3\13\2\f\2\4\6\b\n\f\16\20\22\24\2\3\4\35\35&&S\2\26\3\2\2\2\4\32"+
		"\3\2\2\2\6+\3\2\2\2\b\62\3\2\2\2\n\64\3\2\2\2\f\66\3\2\2\2\16<\3\2\2\2"+
		"\20?\3\2\2\2\22A\3\2\2\2\24N\3\2\2\2\26\27\5\4\3\2\27\30\7\1\2\2\30\3"+
		"\3\2\2\2\31\33\5\6\4\2\32\31\3\2\2\2\33\34\3\2\2\2\34\32\3\2\2\2\34\35"+
		"\3\2\2\2\35\5\3\2\2\2\36 \5\b\5\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2"+
		"!\"\3\2\2\2\"#\3\2\2\2#\'\7\26\2\2$%\5\22\n\2%&\7\26\2\2&(\3\2\2\2\'$"+
		"\3\2\2\2\'(\3\2\2\2(,\3\2\2\2),\5\20\t\2*,\7$\2\2+\37\3\2\2\2+)\3\2\2"+
		"\2+*\3\2\2\2,\7\3\2\2\2-\63\5\n\6\2.\63\5\f\7\2/\63\7\t\2\2\60\63\7\n"+
		"\2\2\61\63\7\25\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2"+
		"\62\61\3\2\2\2\63\t\3\2\2\2\64\65\t\2\2\2\65\13\3\2\2\2\668\5\16\b\2\67"+
		"9\5\n\6\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\r\3\2\2\2<=\7\20"+
		"\2\2=>\7\24\2\2>\17\3\2\2\2?@\7\5\2\2@\21\3\2\2\2AE\7\3\2\2BD\5\24\13"+
		"\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\23\3\2\2\2GE\3\2\2\2HO\7\31"+
		"\2\2IK\7\30\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NH\3"+
		"\2\2\2NJ\3\2\2\2O\25\3\2\2\2\13\34!\'+\62:ELN";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}