package grammar;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import grammar.ABCMusicBodyBaseListener;
import grammar.ABCMusicBodyParser;

/**
 * BODY LISTENER
 */
public class BodyListener extends ABCMusicBodyBaseListener {

	@Override public void exitElement(ABCMusicBodyParser.ElementContext ctx) { System.out.println("Exiting: Element"); }

	@Override public void exitAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx) { System.out.println("Exiting: ABC Tune Body"); }

	@Override public void exitMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx) { System.out.println("Exiting: Mid Tune Field"); }

	@Override public void exitAbc_music(ABCMusicBodyParser.Abc_musicContext ctx) { System.out.println("Exiting: ABC Music"); }

	@Override public void exitNote_element(ABCMusicBodyParser.Note_elementContext ctx) { System.out.println("Exiting: Note Element"); }

	@Override public void exitAbc_line(ABCMusicBodyParser.Abc_lineContext ctx) { System.out.println("Exiting: ABC Line"); }

	@Override public void exitTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx) { System.out.println("Exiting: Tuplet Spec"); }

	@Override public void exitTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx) { System.out.println("Exiting: Tuplet Element"); }
}