/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusicBody;

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
 * These are the lexical rules. They define the tokens used by the lexer.
 */

W: 'w:' ;
V: 'V:' ;

// "^" is sharp, "_" is flat, and "=" is neutral
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=' ;

FIELD_VOICE : V ~[\r\n]+ EOL ;

REST : 'z';

BAR_LINE : '|' | '||' | '[|' | '|]' | ':|' | '|:' ;
NTH_REPEAT : '[1' | '[2' ;

KEY_ACCIDENTAL : '#' | 'b' ;
MODE_MINOR : 'm' ;

NOTE_LENGTH_STRICT : DIGIT+ '/' DIGIT+ ;

OCTAVE : [',]+ ;

OPEN_PAREN : '(' ;

OPEN_BRACK : '[' ; 
CLOSED_BRACK : ']' ;

DIVIDE : '/' ;
DIGIT : [0-9] ;
SPACE : ' ' ;
LINE_FEED : '\n' | '\r' | '\r\n' ;
PERCENT : '%' ;

COMMENT : PERCENT ~[\r\n]+ LINE_FEED ;

METER_VARIANTS : 'C' | 'C|' ;
METER_FRACTION : DIGIT+ '/' DIGIT+ ;

BASE_NOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'
        | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b' ;

TEMPO : METER_FRACTION '=' DIGIT+ ;
        
LYRIC_TEXT : ~[abcdefgABCDEFG',_-*~\-| \r\n]+ ;
LYRICAL_ELEMENTS : ' '+ | '_' | '-' | '*' | '~' | '\-' | '|' ;

EOL : COMMENT | LINE_FEED ;

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
abc_line : element+ LINE_FEED (lyric LINE_FEED)? | mid_tune_field | COMMENT ;

element : note_element | tuplet_element | BAR_LINE | NTH_REPEAT | SPACE ;
note_element : note | multi_note ;

note_length : DIGIT+ | (DIGIT+ DIVIDE DIGIT+) | (DIVIDE DIGIT+) | (DIGIT+ DIVIDE) | DIVIDE ;

note : note_or_rest note_length? ;
multi_note : OPEN_BRACK note+ CLOSED_BRACK ;
note_or_rest : pitch | REST ;
pitch : ACCIDENTAL? BASE_NOTE OCTAVE? ;

meter : METER_VARIANTS | METER_FRACTION ;

key : key_note MODE_MINOR? ;
key_note : BASE_NOTE KEY_ACCIDENTAL? ;

// tuplets
tuplet_element : tuplet_spec note_element+;
tuplet_spec : OPEN_PAREN DIGIT ;

// A voice field might reappear in the middle of a piece to indicate the change of a voice
mid_tune_field : FIELD_VOICE ;

lyric : W (LYRICAL_ELEMENTS | (LYRIC_TEXT | BASE_NOTE | OCTAVE)+ | SPACE)* ;
