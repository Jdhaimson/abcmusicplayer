// Generated from ABCMusicHeaderParser.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicHeaderParserListener extends ParseTreeListener {
	void enterField_tempo(ABCMusicHeaderParser.Field_tempoContext ctx);
	void exitField_tempo(ABCMusicHeaderParser.Field_tempoContext ctx);

	void enterComposer_text(ABCMusicHeaderParser.Composer_textContext ctx);
	void exitComposer_text(ABCMusicHeaderParser.Composer_textContext ctx);

	void enterOther_fields(ABCMusicHeaderParser.Other_fieldsContext ctx);
	void exitOther_fields(ABCMusicHeaderParser.Other_fieldsContext ctx);

	void enterAbc_header(ABCMusicHeaderParser.Abc_headerContext ctx);
	void exitAbc_header(ABCMusicHeaderParser.Abc_headerContext ctx);

	void enterTempo(ABCMusicHeaderParser.TempoContext ctx);
	void exitTempo(ABCMusicHeaderParser.TempoContext ctx);

	void enterKey_note(ABCMusicHeaderParser.Key_noteContext ctx);
	void exitKey_note(ABCMusicHeaderParser.Key_noteContext ctx);

	void enterNumber(ABCMusicHeaderParser.NumberContext ctx);
	void exitNumber(ABCMusicHeaderParser.NumberContext ctx);

	void enterField_composer(ABCMusicHeaderParser.Field_composerContext ctx);
	void exitField_composer(ABCMusicHeaderParser.Field_composerContext ctx);

	void enterField_key(ABCMusicHeaderParser.Field_keyContext ctx);
	void exitField_key(ABCMusicHeaderParser.Field_keyContext ctx);

	void enterMeter(ABCMusicHeaderParser.MeterContext ctx);
	void exitMeter(ABCMusicHeaderParser.MeterContext ctx);

	void enterField_default_length(ABCMusicHeaderParser.Field_default_lengthContext ctx);
	void exitField_default_length(ABCMusicHeaderParser.Field_default_lengthContext ctx);

	void enterTitle_text(ABCMusicHeaderParser.Title_textContext ctx);
	void exitTitle_text(ABCMusicHeaderParser.Title_textContext ctx);

	void enterField_meter(ABCMusicHeaderParser.Field_meterContext ctx);
	void exitField_meter(ABCMusicHeaderParser.Field_meterContext ctx);

	void enterEol(ABCMusicHeaderParser.EolContext ctx);
	void exitEol(ABCMusicHeaderParser.EolContext ctx);

	void enterMeter_fraction(ABCMusicHeaderParser.Meter_fractionContext ctx);
	void exitMeter_fraction(ABCMusicHeaderParser.Meter_fractionContext ctx);

	void enterVoice_text(ABCMusicHeaderParser.Voice_textContext ctx);
	void exitVoice_text(ABCMusicHeaderParser.Voice_textContext ctx);

	void enterField_number(ABCMusicHeaderParser.Field_numberContext ctx);
	void exitField_number(ABCMusicHeaderParser.Field_numberContext ctx);

	void enterComment(ABCMusicHeaderParser.CommentContext ctx);
	void exitComment(ABCMusicHeaderParser.CommentContext ctx);

	void enterField_title(ABCMusicHeaderParser.Field_titleContext ctx);
	void exitField_title(ABCMusicHeaderParser.Field_titleContext ctx);

	void enterAbc_tune_header(ABCMusicHeaderParser.Abc_tune_headerContext ctx);
	void exitAbc_tune_header(ABCMusicHeaderParser.Abc_tune_headerContext ctx);

	void enterField_voice(ABCMusicHeaderParser.Field_voiceContext ctx);
	void exitField_voice(ABCMusicHeaderParser.Field_voiceContext ctx);
}