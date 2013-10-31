// Generated from ABCMusicBodyParser.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicBodyParserListener extends ParseTreeListener {
	void enterLyric_element(ABCMusicBodyParser.Lyric_elementContext ctx);
	void exitLyric_element(ABCMusicBodyParser.Lyric_elementContext ctx);

	void enterMeasure(ABCMusicBodyParser.MeasureContext ctx);
	void exitMeasure(ABCMusicBodyParser.MeasureContext ctx);

	void enterAbc_music(ABCMusicBodyParser.Abc_musicContext ctx);
	void exitAbc_music(ABCMusicBodyParser.Abc_musicContext ctx);

	void enterVoice(ABCMusicBodyParser.VoiceContext ctx);
	void exitVoice(ABCMusicBodyParser.VoiceContext ctx);

	void enterMulti_note(ABCMusicBodyParser.Multi_noteContext ctx);
	void exitMulti_note(ABCMusicBodyParser.Multi_noteContext ctx);

	void enterNote_element(ABCMusicBodyParser.Note_elementContext ctx);
	void exitNote_element(ABCMusicBodyParser.Note_elementContext ctx);

	void enterBar_line(ABCMusicBodyParser.Bar_lineContext ctx);
	void exitBar_line(ABCMusicBodyParser.Bar_lineContext ctx);

	void enterNote_length(ABCMusicBodyParser.Note_lengthContext ctx);
	void exitNote_length(ABCMusicBodyParser.Note_lengthContext ctx);

	void enterSpace(ABCMusicBodyParser.SpaceContext ctx);
	void exitSpace(ABCMusicBodyParser.SpaceContext ctx);

	void enterAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx);
	void exitAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx);

	void enterEol(ABCMusicBodyParser.EolContext ctx);
	void exitEol(ABCMusicBodyParser.EolContext ctx);

	void enterAccidental(ABCMusicBodyParser.AccidentalContext ctx);
	void exitAccidental(ABCMusicBodyParser.AccidentalContext ctx);

	void enterTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx);
	void exitTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx);

	void enterNote(ABCMusicBodyParser.NoteContext ctx);
	void exitNote(ABCMusicBodyParser.NoteContext ctx);

	void enterElement(ABCMusicBodyParser.ElementContext ctx);
	void exitElement(ABCMusicBodyParser.ElementContext ctx);

	void enterMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx);
	void exitMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx);

	void enterTuplet_digit(ABCMusicBodyParser.Tuplet_digitContext ctx);
	void exitTuplet_digit(ABCMusicBodyParser.Tuplet_digitContext ctx);

	void enterLyric_text(ABCMusicBodyParser.Lyric_textContext ctx);
	void exitLyric_text(ABCMusicBodyParser.Lyric_textContext ctx);

	void enterAbc_line(ABCMusicBodyParser.Abc_lineContext ctx);
	void exitAbc_line(ABCMusicBodyParser.Abc_lineContext ctx);

	void enterTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx);
	void exitTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx);

	void enterBase_note_octave(ABCMusicBodyParser.Base_note_octaveContext ctx);
	void exitBase_note_octave(ABCMusicBodyParser.Base_note_octaveContext ctx);

	void enterLyric_line(ABCMusicBodyParser.Lyric_lineContext ctx);
	void exitLyric_line(ABCMusicBodyParser.Lyric_lineContext ctx);

	void enterNote_or_rest(ABCMusicBodyParser.Note_or_restContext ctx);
	void exitNote_or_rest(ABCMusicBodyParser.Note_or_restContext ctx);

	void enterLyric(ABCMusicBodyParser.LyricContext ctx);
	void exitLyric(ABCMusicBodyParser.LyricContext ctx);

	void enterRest(ABCMusicBodyParser.RestContext ctx);
	void exitRest(ABCMusicBodyParser.RestContext ctx);

	void enterComment(ABCMusicBodyParser.CommentContext ctx);
	void exitComment(ABCMusicBodyParser.CommentContext ctx);

	void enterPitch(ABCMusicBodyParser.PitchContext ctx);
	void exitPitch(ABCMusicBodyParser.PitchContext ctx);

	void enterNth_repeat(ABCMusicBodyParser.Nth_repeatContext ctx);
	void exitNth_repeat(ABCMusicBodyParser.Nth_repeatContext ctx);

	void enterField_voice(ABCMusicBodyParser.Field_voiceContext ctx);
	void exitField_voice(ABCMusicBodyParser.Field_voiceContext ctx);
}