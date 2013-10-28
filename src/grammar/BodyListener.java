package grammar;

import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.*;
import grammar.ABCMusicBodyParser;

/**
 * BODY LISTENER
 */
public class BodyListener extends ABCMusicBodyParserBaseListener {
	private ArrayList<Measure> MeasureStack = new ArrayList<Measure>();
	private int currentLowestMeasure = 0;
	private int currentMeasure = 0;
	private Song song;
	
	public BodyListener(Song s) {
		super();
		this.song = s;
	}

	@Override public void enterLyric_element(ABCMusicBodyParser.Lyric_elementContext ctx) { }
	@Override public void exitLyric_element(ABCMusicBodyParser.Lyric_elementContext ctx) { }

	@Override 
	public void enterMeasure(ABCMusicBodyParser.MeasureContext ctx) { 
		Measure measure = new Measure(ctx.getText());
		MeasureStack.add(measure);
	}
	@Override public void exitMeasure(ABCMusicBodyParser.MeasureContext ctx) { }

//	@Override public void enterAbc_music(ABCMusicBodyParser.Abc_musicContext ctx) { }
//	@Override public void exitAbc_music(ABCMusicBodyParser.Abc_musicContext ctx) { }

	@Override public void enterVoice(ABCMusicBodyParser.VoiceContext ctx) { }
	@Override 
	public void exitVoice(ABCMusicBodyParser.VoiceContext ctx) {
		Voice voice = new Voice(ctx.getText());
//		add Voice to corresponding Measure
	}

	@Override 
	public void enterMulti_note(ABCMusicBodyParser.Multi_noteContext ctx) {
		Chord chord = new Chord();
	}
	@Override public void exitMulti_note(ABCMusicBodyParser.Multi_noteContext ctx) { }

//	@Override public void enterNote_element(ABCMusicBodyParser.Note_elementContext ctx) { }
//	@Override public void exitNote_element(ABCMusicBodyParser.Note_elementContext ctx) { }

	@Override public void enterBar_line(ABCMusicBodyParser.Bar_lineContext ctx) { }
	@Override public void exitBar_line(ABCMusicBodyParser.Bar_lineContext ctx) { }

	@Override public void enterNote_length(ABCMusicBodyParser.Note_lengthContext ctx) { }
	@Override 
	public void exitNote_length(ABCMusicBodyParser.Note_lengthContext ctx) {
		//add length to note stack
	}

	@Override public void enterSpace(ABCMusicBodyParser.SpaceContext ctx) { }
	@Override public void exitSpace(ABCMusicBodyParser.SpaceContext ctx) { }

	@Override public void enterAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx) { }
	@Override public void exitAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx) { }

	@Override public void enterEol(ABCMusicBodyParser.EolContext ctx) { }
	@Override public void exitEol(ABCMusicBodyParser.EolContext ctx) { }

	@Override public void enterAccidental(ABCMusicBodyParser.AccidentalContext ctx) { }
	@Override 
	public void exitAccidental(ABCMusicBodyParser.AccidentalContext ctx) {
		//add this accidental to the note
	}

	@Override public void enterTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx) { }
	@Override public void exitTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx) { }

	@Override public void enterNote(ABCMusicBodyParser.NoteContext ctx) { }
	@Override 
	public void exitNote(ABCMusicBodyParser.NoteContext ctx) {
		//new note, add to measure
		//if in multinote, add to multinote
	}

//	@Override public void enterElement(ABCMusicBodyParser.ElementContext ctx) { }
//	@Override public void exitElement(ABCMusicBodyParser.ElementContext ctx) { }

//	@Override public void enterMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx) { }
//	@Override public void exitMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx) { }
	
	@Override public void enterTuplet_digit(ABCMusicBodyParser.Tuplet_digitContext ctx) { }
	@Override public void exitTuplet_digit(ABCMusicBodyParser.Tuplet_digitContext ctx) { }

	@Override public void enterLyric_text(ABCMusicBodyParser.Lyric_textContext ctx) { }
	@Override public void exitLyric_text(ABCMusicBodyParser.Lyric_textContext ctx) { }

	@Override public void enterAbc_line(ABCMusicBodyParser.Abc_lineContext ctx) { }
	@Override public void exitAbc_line(ABCMusicBodyParser.Abc_lineContext ctx) { }

	@Override public void enterTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx) { }
	@Override public void exitTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx) { }

	@Override public void enterBase_note_octave(ABCMusicBodyParser.Base_note_octaveContext ctx) { }
	@Override public void exitBase_note_octave(ABCMusicBodyParser.Base_note_octaveContext ctx) { }

	@Override public void enterNote_or_rest(ABCMusicBodyParser.Note_or_restContext ctx) { }
	@Override public void exitNote_or_rest(ABCMusicBodyParser.Note_or_restContext ctx) { }

	@Override public void enterLyric(ABCMusicBodyParser.LyricContext ctx) { }
	@Override public void exitLyric(ABCMusicBodyParser.LyricContext ctx) { }

	@Override public void enterRest(ABCMusicBodyParser.RestContext ctx) { }
	@Override public void exitRest(ABCMusicBodyParser.RestContext ctx) { }

	@Override public void enterComment(ABCMusicBodyParser.CommentContext ctx) { }
	@Override public void exitComment(ABCMusicBodyParser.CommentContext ctx) { }

	@Override public void enterPitch(ABCMusicBodyParser.PitchContext ctx) { }
	@Override public void exitPitch(ABCMusicBodyParser.PitchContext ctx) { }

	@Override public void enterNth_repeat(ABCMusicBodyParser.Nth_repeatContext ctx) { }
	@Override public void exitNth_repeat(ABCMusicBodyParser.Nth_repeatContext ctx) { }

	@Override public void enterField_voice(ABCMusicBodyParser.Field_voiceContext ctx) { }
	@Override public void exitField_voice(ABCMusicBodyParser.Field_voiceContext ctx) { }
}