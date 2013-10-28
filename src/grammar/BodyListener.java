package grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import sound.*;
import grammar.ABCMusicBodyParser;

/**
 * BODY LISTENER
 */
public class BodyListener extends ABCMusicBodyParserBaseListener {
	private ArrayList<Measure> measures = new ArrayList<Measure>();
	private int voiceStartMeasure = 0;
	private int currentMeasure = 0;
	private Voice currentVoice;
	private String currentVoiceName = "default";
	private HashMap<String, Boolean> voicesAdded = new HashMap<String, Boolean>();
	private Queue<MusicalElement> currentElements = new LinkedList<MusicalElement>();
	private Queue<Note> currentNotes = new LinkedList<Note>();
	private String currentPitchStr;
	private Fraction currentLen;
	private int openRepeat;
	private int altEnding1;
	private Song song;
	
	/**
	 * Constructor for BodyListener object - requires that a pre-initialized song created by
	 * Header Listener be passed in as parameter
	 * @param s: Song created by HeaderListener
	 */
	public BodyListener(Song s) {
		super();
		this.song = s;
	}


	@Override public void enterVoice(ABCMusicBodyParser.VoiceContext ctx) { 
		this.currentVoiceName = ctx.getText();
		if (this.voicesAdded.containsKey(this.currentVoiceName)) {
			// Hitting the next section of voices - move measure tracker forward
			this.voiceStartMeasure = this.currentMeasure;	
			this.voicesAdded.clear();
		} else {
			// Hitting new voice which is same set of measures as last voice
			this.currentMeasure = this.voiceStartMeasure;
		}
	}
	@Override 
	public void exitVoice(ABCMusicBodyParser.VoiceContext ctx) {
		// Keep track of voices that have alread been added
		voicesAdded.put(currentVoiceName, new Boolean(true));
	}

	// Keep track of alternate endings for measure
	@Override public void enterNth_repeat(ABCMusicBodyParser.Nth_repeatContext ctx) { }
	@Override public void exitNth_repeat(ABCMusicBodyParser.Nth_repeatContext ctx) { }
	
	@Override 
	public void enterMeasure(ABCMusicBodyParser.MeasureContext ctx) { 
		// Add new measure to list
		Measure measure = new Measure(this.song.getNotesPerMeasure(), currentMeasure);
		measures.add(measure);
		// 
		this.currentVoice = new Voice(this.currentVoiceName, this.song.getNotesPerMeasure());
	}
	@Override public void exitMeasure(ABCMusicBodyParser.MeasureContext ctx) {
		// Add voice to currentMeasure
		this.measures.get(this.currentMeasure).addVoice(this.currentVoice);
		// Increment measure tracker
		this.currentMeasure ++;
	}

	
	
	
	@Override 
	public void enterMulti_note(ABCMusicBodyParser.Multi_noteContext ctx) {
		
	}
	@Override public void exitMulti_note(ABCMusicBodyParser.Multi_noteContext ctx) { }

	@Override public void enterAccidental(ABCMusicBodyParser.AccidentalContext ctx) { }
	@Override 
	public void exitAccidental(ABCMusicBodyParser.AccidentalContext ctx) {
		//add this accidental to the note
	}
	
	@Override public void enterNote(ABCMusicBodyParser.NoteContext ctx) { }
	@Override 
	public void exitNote(ABCMusicBodyParser.NoteContext ctx) {
		if (this.currentPitchStr.equals("z")) {
			this.currentElements.add(new Rest(this.currentLen));
		} else {
			// add new note or chord or whatever
			this.currentElements.add(new Note(this.currentPitchStr));
		}
		this.currentLen = this.song.getDefaultNoteLen();
	}

	@Override public void enterNote_or_rest(ABCMusicBodyParser.Note_or_restContext ctx) { }
	@Override public void exitNote_or_rest(ABCMusicBodyParser.Note_or_restContext ctx) { }
	
	@Override public void enterPitch(ABCMusicBodyParser.PitchContext ctx) { }
	@Override public void exitPitch(ABCMusicBodyParser.PitchContext ctx) { }
	
	@Override public void enterBase_note_octave(ABCMusicBodyParser.Base_note_octaveContext ctx) { }
	@Override public void exitBase_note_octave(ABCMusicBodyParser.Base_note_octaveContext ctx) {
		this.currentPitchStr = ctx.getText();
	}	

	@Override public void enterRest(ABCMusicBodyParser.RestContext ctx) { }
	@Override public void exitRest(ABCMusicBodyParser.RestContext ctx) {
		this.currentPitchStr = ctx.getText();
	}
	
	@Override public void enterNote_length(ABCMusicBodyParser.Note_lengthContext ctx) { }
	@Override 
	public void exitNote_length(ABCMusicBodyParser.Note_lengthContext ctx) {
		// Code to handle all cases of note length
		//ctx.getText().split("/")
		// this.currentLen =
	}
	
	
	
	
	@Override public void enterLyric_element(ABCMusicBodyParser.Lyric_elementContext ctx) { }
	@Override public void exitLyric_element(ABCMusicBodyParser.Lyric_elementContext ctx) { }

	@Override public void enterLyric_text(ABCMusicBodyParser.Lyric_textContext ctx) { }
	@Override public void exitLyric_text(ABCMusicBodyParser.Lyric_textContext ctx) { }



	@Override public void enterTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx) { }
	@Override public void exitTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx) { }

	@Override public void enterTuplet_digit(ABCMusicBodyParser.Tuplet_digitContext ctx) { }
	@Override public void exitTuplet_digit(ABCMusicBodyParser.Tuplet_digitContext ctx) { }

	@Override public void enterTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx) { }
	@Override public void exitTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx) { }


	@Override public void enterLyric(ABCMusicBodyParser.LyricContext ctx) { }
	@Override public void exitLyric(ABCMusicBodyParser.LyricContext ctx) { }




	
	
	
//	@Override public void enterField_voice(ABCMusicBodyParser.Field_voiceContext ctx) { }
//	@Override public void exitField_voice(ABCMusicBodyParser.Field_voiceContext ctx) { }
//	
//	@Override public void enterBar_line(ABCMusicBodyParser.Bar_lineContext ctx) { }
//	@Override public void exitBar_line(ABCMusicBodyParser.Bar_lineContext ctx) { }
//	
//	@Override public void enterNote_element(ABCMusicBodyParser.Note_elementContext ctx) { }
//	@Override public void exitNote_element(ABCMusicBodyParser.Note_elementContext ctx) { }
//	
//	@Override public void enterAbc_music(ABCMusicBodyParser.Abc_musicContext ctx) { }
//	@Override public void exitAbc_music(ABCMusicBodyParser.Abc_musicContext ctx) { }
//	
//	@Override public void enterAbc_line(ABCMusicBodyParser.Abc_lineContext ctx) { }
//	@Override public void exitAbc_line(ABCMusicBodyParser.Abc_lineContext ctx) { }
//
//	@Override public void enterElement(ABCMusicBodyParser.ElementContext ctx) { }
//	@Override public void exitElement(ABCMusicBodyParser.ElementContext ctx) { }
//
//	@Override public void enterMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx) { }
//	@Override public void exitMid_tune_field(ABCMusicBodyParser.Mid_tune_fieldContext ctx) { }
//	
//	@Override public void enterComment(ABCMusicBodyParser.CommentContext ctx) { }
//	@Override public void exitComment(ABCMusicBodyParser.CommentContext ctx) { }
//	
//	@Override public void enterSpace(ABCMusicBodyParser.SpaceContext ctx) { }
//	@Override public void exitSpace(ABCMusicBodyParser.SpaceContext ctx) { }
//
//	@Override public void enterAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx) { }
//	@Override public void exitAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx) { }
//
//	@Override public void enterEol(ABCMusicBodyParser.EolContext ctx) { }
//	@Override public void exitEol(ABCMusicBodyParser.EolContext ctx) { }
}