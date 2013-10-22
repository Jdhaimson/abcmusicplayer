/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusicHeader;

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

X: 'X:' ;
T: 'T:' ;
C: 'C:' ;
L: 'L:' ;
M: 'M:' ;
Q: 'Q:' ;
V: 'V:' ;
K: 'K:' ;
W: 'w:' ;

BASE_NOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'
        | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b' ;

KEY_ACCIDENTAL : '#' | 'b' ;
MODE_MINOR : 'm' ;

NOTE_LENGTH_STRICT : DIGIT+ DIVIDE DIGIT+ ;

EQUALS : '=' ;

OCTAVE : [',]+ ;

DIVIDE : '/' ;
DIGIT : [0-9]+ ;
SPACE : ' ' ;
LINE_FEED : ('\r'? '\n') | '\r' ;
PERCENT : '%' ;

TEXT : ~[:\r\n]+ ;
COLON : ':' ;

METER_VARIANTS : 'C' | 'C|' ;
METER_FRACTION : DIGIT+ DIVIDE DIGIT+ ;
METER : METER_VARIANTS | METER_FRACTION ;

TEMPO : METER_FRACTION EQUALS DIGIT+ ;

KEY : KEY_NOTE MODE_MINOR? ;
KEY_NOTE : BASE_NOTE KEY_ACCIDENTAL? ;

COMMENT : PERCENT (TEXT | COLON)+ LINE_FEED ;
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
 
abc_tune_header : abc_header EOF;

abc_header : field_number COMMENT* field_title other_fields* field_key ;

field_number : X DIGIT+ EOL ;
field_title : T (TEXT | COLON)+ EOL ;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | COMMENT ;
field_composer : C (TEXT | COLON)+ EOL ;
field_default_length : L NOTE_LENGTH_STRICT EOL ;
field_meter : M METER EOL ;
field_tempo : Q TEMPO EOL ;
field_voice : V (TEXT | COLON)+ EOL ;
field_key : K KEY EOL ;
