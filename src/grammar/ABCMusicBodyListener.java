// Generated from ABCMusicBody.g4 by ANTLR 4.0

package grammar;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ABCMusicBodyListener extends ParseTreeListener {
	void enterElement(ABCMusicBodyParser.ElementContext ctx);
	void exitElement(ABCMusicBodyParser.ElementContext ctx);

	void enterLyrical_element(ABCMusicBodyParser.Lyrical_elementContext ctx);
	void exitLyrical_element(ABCMusicBodyParser.Lyrical_elementContext ctx);

	void enterAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx);
	void exitAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx);

	void enterLyric(ABCMusicBodyParser.LyricContext ctx);
	void exitLyric(ABCMusicBodyParser.LyricContext ctx);

	void enterMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx);
	void exitMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx);

	void enterAbc_music(ABCMusicBodyParser.Abc_musicContext ctx);
	void exitAbc_music(ABCMusicBodyParser.Abc_musicContext ctx);

	void enterNote_element(ABCMusicBodyParser.Note_elementContext ctx);
	void exitNote_element(ABCMusicBodyParser.Note_elementContext ctx);

	void enterAbc_line(ABCMusicBodyParser.Abc_lineContext ctx);
	void exitAbc_line(ABCMusicBodyParser.Abc_lineContext ctx);

	void enterTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx);
	void exitTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx);

	void enterTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx);
	void exitTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx);
}