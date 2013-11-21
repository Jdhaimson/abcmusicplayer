package grammar;

import sound.*;
import grammar.ABCMusicHeaderParser;

/**
 * HEADER LISTENER - Observes and stores all fields in the header of the song.
 * 					 Creates Song object using the fields that were found (only index, title, and key are required fields).
 */
public class HeaderListener extends ABCMusicHeaderParserBaseListener {
	
	//all applicable fields found in a song's header (excludes voices and comments)
	private Song song;
	private int field_index;
	private String field_title;
	private String field_composer;
	private Key field_key;
	private Fraction field_meter;
	private Fraction field_default_length;
	private Fraction field_tempo_fraction;
	private int field_tempo_number;
	
        
	@Override //storing name of composer as String
	public void exitComposer_text(ABCMusicHeaderParser.Composer_textContext ctx) { 
		field_composer = ctx.getText();
	}


	@Override //storing tempo as a Fraction
	public void exitTempo_fraction(ABCMusicHeaderParser.Tempo_fractionContext ctx) {
		String[] fraction = ctx.getText().split("/"); //extracting numerator and denominator
		field_tempo_fraction = new Fraction(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
	}
	
	@Override //storing beat size as integer
	public void exitTempo_number(ABCMusicHeaderParser.Tempo_numberContext ctx) {
		field_tempo_number = Integer.parseInt(ctx.getText()) ;
	}

	@Override //storing key as Key object
	public void exitKey_note(ABCMusicHeaderParser.Key_noteContext ctx) { 
		field_key = new Key(ctx.getText());
	}

	@Override //storing index as integer
	public void exitNumber(ABCMusicHeaderParser.NumberContext ctx) { 
		field_index = Integer.parseInt(ctx.getText());
	}

	@Override //storing meter as Fraction
	public void exitMeter(ABCMusicHeaderParser.MeterContext ctx) {
		String context = ctx.getText();
		//preset token "C" = 4/4
		if (context.equals("C")){
			field_meter = new Fraction(4,4);
		}
		//preset token "C|" = 2/2
		else if (context.equals("C|")){
			field_meter = new Fraction(2,2);
		}
		else{
			String[] fraction = context.split("/"); //extracting numerator and denominator
			field_meter = new Fraction(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
		}
	}

	@Override //storing title as String
	public void exitTitle_text(ABCMusicHeaderParser.Title_textContext ctx) { 
		field_title = ctx.getText();
	}

	@Override //storing default length as Fraction
	public void exitLength_fraction(ABCMusicHeaderParser.Length_fractionContext ctx) { 
		String[] fraction = ctx.getText().split("/"); //extracting numerator and denominator
		field_default_length = new Fraction(Integer.parseInt(fraction[0]), Integer.parseInt(fraction[1]));
	}

	@Override //create new Song object upon leaving header
	public void exitAbc_tune_header(ABCMusicHeaderParser.Abc_tune_headerContext ctx) {
		try{
			song = new Song(field_index, field_title, field_key);
		}
		catch (Exception e){
			throw new RuntimeException("Index, Title, and Key are required fields");
		}
		
		//below are the optional fields; if they were found, we add them to the Song object
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
	}
	
	//returns the Song object created
	public Song getSong(){
		return this.song;
	}
}