package grammar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
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
	// Keep track of measures
	private ArrayList<Measure> measures = new ArrayList<Measure>();
	private int currentMeasureNum = 0;
	private Measure currentMeasure;
	
	// Keep track of voices
	private Voice currentVoice;
	private int voiceStartMeasure = 0;
	private String currentVoiceName = "default";
	private HashMap<String, Boolean> voicesAdded = new HashMap<String, Boolean>();
	
	// Keep track of chords and elements
	// These will be populated to build out notes and chords while walking the tree
	private List<MusicalElement> currentElements = new LinkedList<MusicalElement>();
	private List<MusicalElement> chordElements = new LinkedList<MusicalElement>();
	private boolean inChord = false;
	
	// Track Note Pitches, lengths and accidentals
	private String currentPitchStr;
	private Fraction currentLen;
	private String currentAccidental = "";
	
	// Track Lyrics
	private int lyricStartMeasure;
	private int lyricNoteTracker;
	private String lyricBuffer = "";
	private boolean lyricMeasureChange = false;
	private List<String> currentLyrics = new LinkedList<String>();
	private List<String> currentLyricElements = new LinkedList<String>();

	// Track repeats
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
		this.currentLen = this.song.getDefaultNoteLen();
	}

	// Whole Song
	@Override public void enterAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx) { }
	@Override public void exitAbc_tune_body(ABCMusicBodyParser.Abc_tune_bodyContext ctx) { 
		this.song.addMeasures(this.measures);
	}
	
	
	// Voices
	@Override public void enterVoice(ABCMusicBodyParser.VoiceContext ctx) { 
		this.currentVoiceName = ctx.getText();
		if (this.voicesAdded.containsKey(this.currentVoiceName)) {
			// Hitting the next section of voices - move measure tracker forward
			this.voiceStartMeasure = this.currentMeasureNum;	
			this.voicesAdded.clear();
		} else {
			// Hitting new voice which is same set of measures as last voice
			this.currentMeasureNum = this.voiceStartMeasure;
		}
	}
	@Override 
	public void exitVoice(ABCMusicBodyParser.VoiceContext ctx) {
		// Keep track of voices that have already been added
		voicesAdded.put(currentVoiceName, new Boolean(true));		
	}

	// Measures
	@Override 
	public void enterMeasure(ABCMusicBodyParser.MeasureContext ctx) { 
		// Add new measure to list
		Measure measure;
		if (this.currentMeasureNum < this.measures.size()) {
			measure = this.measures.get(currentMeasureNum);
		} else {
			// Create new measure
			measure = new Measure(this.song.getNotesPerMeasure(), currentMeasureNum);
			this.measures.add(measure);	
		}
		this.currentMeasure = measure;
		// create current voice
		this.currentVoice = new Voice(this.currentVoiceName, this.song.getNotesPerMeasure());	
	}
	@Override public void exitMeasure(ABCMusicBodyParser.MeasureContext ctx) {
		// Add voice to currentMeasure
		this.currentMeasure.addVoice(this.currentVoice);
		// Increment measure tracker
		this.currentMeasureNum ++;	
	}
	// Keep track of alternate endings for measure
	@Override public void enterNth_repeat(ABCMusicBodyParser.Nth_repeatContext ctx) { }
	@Override public void exitNth_repeat(ABCMusicBodyParser.Nth_repeatContext ctx) { }

	// Keep track of repeats
	@Override public void enterBar_line(ABCMusicBodyParser.Bar_lineContext ctx) { }
	@Override public void exitBar_line(ABCMusicBodyParser.Bar_lineContext ctx) { }
	

	
	// Musical Elements - Notes, Rests, Chords and Tuplets
	@Override 
	public void enterMulti_note(ABCMusicBodyParser.Multi_noteContext ctx) {
		this.inChord = true;
	}
	@Override public void exitMulti_note(ABCMusicBodyParser.Multi_noteContext ctx) {
		List<Note> chordNotes = new LinkedList<Note>();
		for (int i=0; i<this.chordElements.size(); i++) {
			chordNotes.add((Note) this.chordElements.remove(0));
		}
		this.currentElements.add(new Chord(chordNotes));
		this.inChord = false;
	}

	@Override public void enterTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx) {}
	@Override public void exitTuplet_element(ABCMusicBodyParser.Tuplet_elementContext ctx) {
		List<MusicalElement> elements = new LinkedList<MusicalElement>();
		for (int i=0; i<this.currentElements.size(); i++) {
			elements.add(this.currentElements.remove(0));
		}
		this.currentElements.add(new Tuplet(elements));			
	}
	@Override public void enterNote_element(ABCMusicBodyParser.Note_elementContext ctx) {}
	@Override public void exitNote_element(ABCMusicBodyParser.Note_elementContext ctx) {
		try {
			this.currentVoice.addMusicalElement(this.currentElements.remove(0));
		} catch (Exception e) {
			// Should not happen because we are populating list before popping
			e.printStackTrace();
		}	
	}
	
	@Override public void enterNote(ABCMusicBodyParser.NoteContext ctx) {}
	@Override 
	public void exitNote(ABCMusicBodyParser.NoteContext ctx) {
		MusicalElement newElement;
		if (this.currentPitchStr.equals("z")) {
			newElement = new Rest(this.currentLen);
		} else {
			// add new note to currentElements
			Pitch pitch;
			if (this.currentMeasure.isPitchInAccidentalKey(this.currentPitchStr)) {
				pitch = this.currentMeasure.getPitchInAccidentalKey(this.currentPitchStr);
			} else {
				pitch = this.song.getPitchInKey(this.currentPitchStr);
			}
			newElement = new Note(pitch, this.currentLen);
			
		}
		
		//If we're constructing a chord, add to chord list instead of normal list 
		if(this.inChord) {
			this.chordElements.add(newElement);
		} else {
			this.currentElements.add(newElement);
		}
		
		this.currentLen = this.song.getDefaultNoteLen();		
	}
	
	@Override public void enterAccidental(ABCMusicBodyParser.AccidentalContext ctx) {}
	@Override 
	public void exitAccidental(ABCMusicBodyParser.AccidentalContext ctx) {
		this.currentAccidental = ctx.getText();		
	}
	
	@Override public void enterPitch(ABCMusicBodyParser.PitchContext ctx) { }
	@Override public void exitPitch(ABCMusicBodyParser.PitchContext ctx) {
		// Modify accidental key for measure
		if (this.currentAccidental != "") {
			this.currentMeasure.modifyKey(this.currentPitchStr, this.currentAccidental);
		}
		// Reset accidental string
		this.currentAccidental = "";
	}
	
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
		this.currentLen = this.song.parseDurationFromString(ctx.getText());
	}
	
	
	
	
	// Track measure number that line starts at to know what measure to come back to when adding lyrics
	@Override public void enterAbc_line(ABCMusicBodyParser.Abc_lineContext ctx) {
		this.lyricStartMeasure = this.currentMeasureNum;
	}
	@Override public void exitAbc_line(ABCMusicBodyParser.Abc_lineContext ctx) { }
	
	// add voice at first measure of lyric line to currentVoice
	@Override public void enterLyric_line(ABCMusicBodyParser.Lyric_lineContext ctx) { 
		Measure m = this.measures.get(this.lyricStartMeasure);
		this.currentVoice = m.getVoice(this.currentVoiceName);
	}
	@Override public void exitLyric_line(ABCMusicBodyParser.Lyric_lineContext ctx) { }
	
	@Override public void enterLyric_element(ABCMusicBodyParser.Lyric_elementContext ctx) { }
	@Override public void exitLyric_element(ABCMusicBodyParser.Lyric_elementContext ctx) { 
		this.currentLyricElements.add(ctx.getText());
	}

	@Override public void enterLyric_text(ABCMusicBodyParser.Lyric_textContext ctx) { }
	@Override public void exitLyric_text(ABCMusicBodyParser.Lyric_textContext ctx) { 
		this.currentLyrics.add(ctx.getText());
	}
	
	@Override public void enterLyric(ABCMusicBodyParser.LyricContext ctx) { }
	@Override public void exitLyric(ABCMusicBodyParser.LyricContext ctx) { 

		// Look at lyric symbols and do the proper thing for each
		// remove empty lyric elements
		Iterator<String> it = this.currentLyricElements.iterator();
		String element = it.toString();
		while(it.hasNext()) {
			// remove any number of spaces as elements
			if(element.matches(" +")) {
				it.remove();		
			}
			element = it.next();
		}
		
		// Count symbols, get type and check to make sure they're all the same
		if (this.currentLyricElements.size() > 0) {
			String elementType = this.currentLyricElements.get(0);
			int elementCount = 0;
			for (String s: this.currentLyricElements) {
				if (!s.equals(elementType)) {
					// If we're given two different types of elements throw error
					throw new IllegalArgumentException("Each Lyric can only have one type"
													 	+ " of modifying symbol");
				} else {
					elementCount ++;
				}
			}
			
			// Do specified action depending on symbol
			// Check symbol
			if (elementType.equals("-")) {
				// break between syllables within a word	
				// current lyric text applies to current note - if more than one, 
				// add blanks to the next notes
				for(int i=1; i<elementCount; i++) {
					this.currentLyrics.add("");
				}
			} else if (elementType.equals("_")) {
				// previous syllable is to be held for an extra note
				// add same syllable so it will still be displayed on next note
				for(int i=0; i<elementCount; i++) {
					this.currentLyrics.add(this.currentLyrics.get(0));
				}
			} else if (elementType.equals("*")) {
				// one note is skipped (i.e. * is equivalent to a blank syllable)
				// add blank text as new lyric
				for(int i=0; i<elementCount; i++) {
					this.currentLyrics.add("");
				}
			} else if (elementType.equals("~")) {
				// appears as a space; aligns multiple words under one note
				// take lyric out of lyric list and add it to buffer
				this.lyricBuffer = this.currentLyrics.get(0) + " ";
				this.currentLyrics.remove(0);
			} else if (elementType.equals("\\-")) {
				// appears as hyphen; aligns multiple syllables under one note
				// take lyric out of lyric list and add it to buffer
				this.lyricBuffer = this.currentLyrics.get(0) + "-";
				this.currentLyrics.remove(0);
			} else if (elementType.equals("|")) {
				// Move to next measure after this lyric
				// flag measure to change after lyric added
				this.lyricMeasureChange = true;
			}
		}
		// clear out the lyric elements
		this.currentLyricElements.clear();
		
		// add all elements in queue to voices
		while(this.currentLyrics.size() > 0) {
			// add lyric to voice - prepend anything in lyric buffer that needs to be combined
			String l = this.lyricBuffer + this.currentLyrics.get(0);
			this.lyricBuffer = "";
			
			// While loop to account for the case where we are at the end of a measure
			// and the next n measures are empty
			while(!this.currentVoice.addLyric(l)) {
				this.lyricStartMeasure += 1;
				if(this.lyricStartMeasure < this.measures.size()) {
					Measure m = this.measures.get(this.lyricStartMeasure);
					this.currentVoice = m.getVoice(this.currentVoiceName);
				} else { // we're at the end of the piece - don't add 
					break;
				}
			}
			// Remove voice from list now that it's been added
			this.currentLyrics.remove(0);			
		}
		
		// If there was a bar, skip ahead to next measure
		if(this.lyricMeasureChange) {
			this.lyricStartMeasure += 1;
			Measure m = this.measures.get(this.lyricStartMeasure);
			this.currentVoice = m.getVoice(this.currentVoiceName);
			this.lyricMeasureChange = false;
		}
	}



	

//	@Override public void enterTuplet_digit(ABCMusicBodyParser.Tuplet_digitContext ctx) { }
//	@Override public void exitTuplet_digit(ABCMusicBodyParser.Tuplet_digitContext ctx) { }
//	
//	@Override public void enterTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx) { }
//	@Override public void exitTuplet_spec(ABCMusicBodyParser.Tuplet_specContext ctx) { }
//	
//	
//	@Override public void enterField_voice(ABCMusicBodyParser.Field_voiceContext ctx) { }
//	@Override public void exitField_voice(ABCMusicBodyParser.Field_voiceContext ctx) { }
//	
	
//	@Override public void enterNote_or_rest(ABCMusicBodyParser.Note_or_restContext ctx) { }
//	@Override public void exitNote_or_rest(ABCMusicBodyParser.Note_or_restContext ctx) { }
//	
//	@Override public void enterAbc_music(ABCMusicBodyParser.Abc_musicContext ctx) { }
//	@Override public void exitAbc_music(ABCMusicBodyParser.Abc_musicContext ctx) { }

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

//
//	@Override public void enterEol(ABCMusicBodyParser.EolContext ctx) { }
//	@Override public void exitEol(ABCMusicBodyParser.EolContext ctx) { }
}