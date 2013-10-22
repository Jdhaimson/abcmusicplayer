// Generated from ABCMusicHeader.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicHeaderListener extends ParseTreeListener {
	void enterField_tempo(ABCMusicHeaderParser.Field_tempoContext ctx);
	void exitField_tempo(ABCMusicHeaderParser.Field_tempoContext ctx);

	void enterField_key(ABCMusicHeaderParser.Field_keyContext ctx);
	void exitField_key(ABCMusicHeaderParser.Field_keyContext ctx);

	void enterField_default_length(ABCMusicHeaderParser.Field_default_lengthContext ctx);
	void exitField_default_length(ABCMusicHeaderParser.Field_default_lengthContext ctx);

	void enterOther_fields(ABCMusicHeaderParser.Other_fieldsContext ctx);
	void exitOther_fields(ABCMusicHeaderParser.Other_fieldsContext ctx);

	void enterAbc_header(ABCMusicHeaderParser.Abc_headerContext ctx);
	void exitAbc_header(ABCMusicHeaderParser.Abc_headerContext ctx);

	void enterField_meter(ABCMusicHeaderParser.Field_meterContext ctx);
	void exitField_meter(ABCMusicHeaderParser.Field_meterContext ctx);

	void enterField_number(ABCMusicHeaderParser.Field_numberContext ctx);
	void exitField_number(ABCMusicHeaderParser.Field_numberContext ctx);

	void enterField_title(ABCMusicHeaderParser.Field_titleContext ctx);
	void exitField_title(ABCMusicHeaderParser.Field_titleContext ctx);

	void enterField_composer(ABCMusicHeaderParser.Field_composerContext ctx);
	void exitField_composer(ABCMusicHeaderParser.Field_composerContext ctx);

	void enterAbc_tune_header(ABCMusicHeaderParser.Abc_tune_headerContext ctx);
	void exitAbc_tune_header(ABCMusicHeaderParser.Abc_tune_headerContext ctx);

	void enterField_voice(ABCMusicHeaderParser.Field_voiceContext ctx);
	void exitField_voice(ABCMusicHeaderParser.Field_voiceContext ctx);
}