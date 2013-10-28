package grammar;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import grammar.ABCMusicHeaderParser;

/**
 * HEADER LISTENER
 */
public class HeaderListener extends ABCMusicHeaderParserBaseListener {
	
	private String field_number;
	private String field_title;
	private String field_composer;
	private String field_key;
	private String field_meter;
	private String field_default_length;
	private String field_tempo;
	
        
	@Override 
	public void exitComposer_text(ABCMusicHeaderParser.Composer_textContext ctx) { 
		field_composer = ctx.getText();
	}

	@Override 
	public void exitTempo(ABCMusicHeaderParser.TempoContext ctx) { 
		field_tempo = ctx.getText();
	}

	@Override 
	public void exitKey_note(ABCMusicHeaderParser.Key_noteContext ctx) { 
		field_key = ctx.getText();
	}

	@Override 
	public void exitNumber(ABCMusicHeaderParser.NumberContext ctx) { 
		field_number = ctx.getText();
	}

	@Override 
	public void exitMeter(ABCMusicHeaderParser.MeterContext ctx) { 
		field_meter = ctx.getText();
	}

	@Override
	public void exitTitle_text(ABCMusicHeaderParser.Title_textContext ctx) { 
		field_title = ctx.getText();
	}

	@Override 
	public void exitMeter_fraction(ABCMusicHeaderParser.Meter_fractionContext ctx) { 
		field_default_length = ctx.getText();
	}
	
	//FOR NOW: IGNORE VOICES AND COMMENTS IN THE HEADER
	
//	@Override public void enterVoice_text(ABCMusicHeaderParser.Voice_textContext ctx) { }
//	@Override public void exitVoice_text(ABCMusicHeaderParser.Voice_textContext ctx) { }

//	@Override public void enterComment(ABCMusicHeaderParser.CommentContext ctx) { }
//	@Override public void exitComment(ABCMusicHeaderParser.CommentContext ctx) { }

	@Override 
	public void exitAbc_tune_header(ABCMusicHeaderParser.Abc_tune_headerContext ctx) {
		//Song song = new Song(...)
		System.out.println("field_number: " + field_number);
		System.out.println("field_title: " + field_title);
		System.out.println("field_composer: " + field_composer);
		System.out.println("field_key: " + field_key);
		System.out.println("field_meter: " + field_meter);
		System.out.println("field_default_length: " + field_default_length);
		System.out.println("field_tempo: " + field_tempo);
	}
}