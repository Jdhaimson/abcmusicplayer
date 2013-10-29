package grammar;

import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.*;
import grammar.ABCMusicHeaderParser;

/**
 * HEADER LISTENER
 */
public class HeaderListener extends ABCMusicHeaderParserBaseListener {
	
	private Song song;
	private int field_number;
	private String field_title;
	private String field_composer;
	private Key field_key;
	private Fraction field_meter;
	private Fraction field_default_length;
	private Fraction field_tempo_fraction;
	private int field_tempo_number;
	
        
	@Override 
	public void exitComposer_text(ABCMusicHeaderParser.Composer_textContext ctx) { 
		field_composer = ctx.getText();
	}


	@Override 
	public void exitTempo_fraction(ABCMusicHeaderParser.Tempo_fractionContext ctx) {
		String[] fraction = ctx.getText().split("/");
		field_tempo_fraction = new Fraction(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
	}
	
	@Override
	public void exitTempo_number(ABCMusicHeaderParser.Tempo_numberContext ctx) {
		field_tempo_number = Integer.parseInt(ctx.getText()) ;
	}

	@Override 
	public void exitKey_note(ABCMusicHeaderParser.Key_noteContext ctx) { 
		field_key = new Key(ctx.getText());
	}

	@Override 
	public void exitNumber(ABCMusicHeaderParser.NumberContext ctx) { 
		field_number = Integer.parseInt(ctx.getText());
	}

	@Override 
	public void exitMeter(ABCMusicHeaderParser.MeterContext ctx) {
		String context = ctx.getText();
		if (context.equals("C")){
			field_meter = new Fraction(4,4);
		}
		else if (context.equals("C|")){
			field_meter = new Fraction(2,2);
		}
		else{
			String[] fraction = context.split("/");
			field_meter = new Fraction(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
		}
	}

	@Override
	public void exitTitle_text(ABCMusicHeaderParser.Title_textContext ctx) { 
		field_title = ctx.getText();
	}

	@Override 
	public void exitLength_fraction(ABCMusicHeaderParser.Length_fractionContext ctx) { 
		String[] fraction = ctx.getText().split("/");
		field_default_length = new Fraction(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
	}

	@Override 
	public void exitAbc_tune_header(ABCMusicHeaderParser.Abc_tune_headerContext ctx) {
		song = new Song(field_number, field_title, field_key);
		
		if (field_composer != null){
			song.setComposer(field_composer);
		}
		if (field_meter != null){
			song.setMeter(field_meter);
		}
		if (field_default_length != null){
			song.setLength(field_default_length);
		}
		if (field_tempo_fraction != null){
			song.setTempo(field_tempo_fraction, field_tempo_number);
		}
		
//		System.out.println("field_number: " + field_number);
//		System.out.println("field_title: " + field_title);
//		System.out.println("field_composer: " + field_composer);
//		System.out.println("field_key: " + field_key);
//		System.out.println("field_meter: " + field_meter);
//		System.out.println("field_default_length: " + field_default_length);
//		System.out.println("field_tempo_fraction: " + field_tempo_fraction);
//		System.out.println("field_tempo_number: " + field_tempo_number);
	}
	
	public Song getSong(){
		return this.song;
	}
}