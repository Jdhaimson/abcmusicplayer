// Generated from ABCMusic.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicListener extends ParseTreeListener {
	void enterField_tempo(ABCMusicParser.Field_tempoContext ctx);
	void exitField_tempo(ABCMusicParser.Field_tempoContext ctx);

	void enterElement(ABCMusicParser.ElementContext ctx);
	void exitElement(ABCMusicParser.ElementContext ctx);

	void enterLyrical_element(ABCMusicParser.Lyrical_elementContext ctx);
	void exitLyrical_element(ABCMusicParser.Lyrical_elementContext ctx);

	void enterMid_tune_field(ABCMusicParser.Mid_tune_fieldContext ctx);
	void exitMid_tune_field(ABCMusicParser.Mid_tune_fieldContext ctx);

	void enterAbc_music(ABCMusicParser.Abc_musicContext ctx);
	void exitAbc_music(ABCMusicParser.Abc_musicContext ctx);

	void enterOther_fields(ABCMusicParser.Other_fieldsContext ctx);
	void exitOther_fields(ABCMusicParser.Other_fieldsContext ctx);

	void enterAbc_header(ABCMusicParser.Abc_headerContext ctx);
	void exitAbc_header(ABCMusicParser.Abc_headerContext ctx);

	void enterMulti_note(ABCMusicParser.Multi_noteContext ctx);
	void exitMulti_note(ABCMusicParser.Multi_noteContext ctx);

	void enterNote_element(ABCMusicParser.Note_elementContext ctx);
	void exitNote_element(ABCMusicParser.Note_elementContext ctx);

	void enterAbc_line(ABCMusicParser.Abc_lineContext ctx);
	void exitAbc_line(ABCMusicParser.Abc_lineContext ctx);

	void enterTuplet_spec(ABCMusicParser.Tuplet_specContext ctx);
	void exitTuplet_spec(ABCMusicParser.Tuplet_specContext ctx);

	void enterNote_length(ABCMusicParser.Note_lengthContext ctx);
	void exitNote_length(ABCMusicParser.Note_lengthContext ctx);

	void enterField_composer(ABCMusicParser.Field_composerContext ctx);
	void exitField_composer(ABCMusicParser.Field_composerContext ctx);

	void enterAbc_tune(ABCMusicParser.Abc_tuneContext ctx);
	void exitAbc_tune(ABCMusicParser.Abc_tuneContext ctx);

	void enterNote_or_rest(ABCMusicParser.Note_or_restContext ctx);
	void exitNote_or_rest(ABCMusicParser.Note_or_restContext ctx);

	void enterField_key(ABCMusicParser.Field_keyContext ctx);
	void exitField_key(ABCMusicParser.Field_keyContext ctx);

	void enterLyric(ABCMusicParser.LyricContext ctx);
	void exitLyric(ABCMusicParser.LyricContext ctx);

	void enterField_default_length(ABCMusicParser.Field_default_lengthContext ctx);
	void exitField_default_length(ABCMusicParser.Field_default_lengthContext ctx);

	void enterField_meter(ABCMusicParser.Field_meterContext ctx);
	void exitField_meter(ABCMusicParser.Field_meterContext ctx);

	void enterField_number(ABCMusicParser.Field_numberContext ctx);
	void exitField_number(ABCMusicParser.Field_numberContext ctx);

	void enterTuplet_element(ABCMusicParser.Tuplet_elementContext ctx);
	void exitTuplet_element(ABCMusicParser.Tuplet_elementContext ctx);

	void enterField_title(ABCMusicParser.Field_titleContext ctx);
	void exitField_title(ABCMusicParser.Field_titleContext ctx);

	void enterPitch(ABCMusicParser.PitchContext ctx);
	void exitPitch(ABCMusicParser.PitchContext ctx);

	void enterNote(ABCMusicParser.NoteContext ctx);
	void exitNote(ABCMusicParser.NoteContext ctx);

	void enterField_voice(ABCMusicParser.Field_voiceContext ctx);
	void exitField_voice(ABCMusicParser.Field_voiceContext ctx);
}