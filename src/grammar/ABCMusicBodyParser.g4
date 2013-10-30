parser grammar ABCMusicBodyParser;

options { tokenVocab=ABCMusicBodyLexer; }

/*
 * This puts "package grammar;" at the top of the output Java files.
 * Do not change these lines unless you know what you're doing.
 */
 
@header {
package grammar;
}

/*
 * This adds code to the generated lexer and parser. This makes the lexer and
 * parser throw errors if they encounter invalid input. Do not change these
 * lines unless you know what you're doing.
 */
@members {
    // This method makes the lexer or parser stop running if it encounters
    // invalid input and throw a RuntimeException.
    public void reportErrorsAsExceptions() {
        removeErrorListeners();
        addErrorListener(new ExceptionThrowingErrorListener());
    }

    private static class ExceptionThrowingErrorListener extends BaseErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                Object offendingSymbol, int line, int charPositionInLine,
                String msg, RecognitionException e) {
            throw new RuntimeException(msg);
        }
    }
}


/*
 * These are the parser rules. They define the structures used by the parser.
 *
 * You should make sure you have one rule that describes the entire input.
 * This is the "start rule". The start rule should end with the special
 * predefined token EOF so that it describes the entire input. Below, we've made
 * "line" the start rule.
 *
 * For more information, see
 * http://www.antlr.org/wiki/display/ANTLR4/Parser+Rules#ParserRules-StartRulesandEOF
 */
 
abc_tune_body : abc_music EOF;

abc_music : abc_line+ ;
abc_line : element+ LINE_FEED lyric_line? | mid_tune_field | comment ;

bar_line : BAR_LINE ;
nth_repeat: NTH_REPEAT ;
space: SPACE ;

measure : (note_element | nth_repeat | space )+ ;
element : measure | bar_line ;
note_element : note | multi_note | tuplet_element;

note_length : NOTE_LENGTH ;

note : note_or_rest note_length? ;
multi_note : OPEN_BRACK note+ CLOSED_BRACK ;
note_or_rest : pitch | rest ;
rest : REST ;
pitch : accidental? base_note_octave ;
base_note_octave : BASE_NOTE_OCTAVE ;
accidental : ACCIDENTAL ;

// tuplets
tuplet_element : tuplet_spec (note | multi_note)+;
tuplet_spec : OPEN_PAREN tuplet_digit ;
tuplet_digit : TUPLET_DIGIT ;

// A voice field might reappear in the middle of a piece to indicate the change of a voice
mid_tune_field : field_voice ;

field_voice : V voice (END_VOICE | eol) ;
voice: VOICE_TEXT* ;

lyric_line :  W (lyric)* END_LYRIC  ;
lyric : lyric_element* lyric_text lyric_element*;
lyric_text : LYRIC_TEXT ;
lyric_element : LYRICAL_ELEMENTS ;

comment : PERCENT COMMENT_TEXT* (END_COMMENT | LINE_FEED) ;

eol : comment | LINE_FEED ;
