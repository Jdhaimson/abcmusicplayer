package grammar;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import grammar.ABCMusicHeaderBaseListener;
import grammar.ABCMusicHeaderParser;

/**
 * HEADER LISTENER
 */
public class HeaderListener extends ABCMusicHeaderBaseListener {
	
	@Override public void exitField_tempo(ABCMusicHeaderParser.Field_tempoContext ctx) { System.out.println("Exiting: Tempo"); }

	@Override public void exitField_key(ABCMusicHeaderParser.Field_keyContext ctx) { System.out.println("Exiting: Key"); }

	@Override public void exitField_default_length(ABCMusicHeaderParser.Field_default_lengthContext ctx) { System.out.println("Exiting: Length"); }

	@Override public void exitOther_fields(ABCMusicHeaderParser.Other_fieldsContext ctx) { System.out.println("Exiting: Other Fields"); }

	@Override public void exitAbc_header(ABCMusicHeaderParser.Abc_headerContext ctx) { System.out.println("Exiting: Header"); }

	@Override public void exitField_meter(ABCMusicHeaderParser.Field_meterContext ctx) { System.out.println("Exiting: Meter"); }

	@Override public void exitField_number(ABCMusicHeaderParser.Field_numberContext ctx) { System.out.println("Exiting: Number"); }

	@Override public void exitField_title(ABCMusicHeaderParser.Field_titleContext ctx) { System.out.println("Exiting: Title"); }

	@Override public void exitField_composer(ABCMusicHeaderParser.Field_composerContext ctx) { System.out.println("Exiting: Composer"); }

	@Override public void exitAbc_tune_header(ABCMusicHeaderParser.Abc_tune_headerContext ctx) { System.out.println("Exiting: Tune Header"); }

	@Override public void exitField_voice(ABCMusicHeaderParser.Field_voiceContext ctx) { System.out.println("Exiting: Voice"); }
}