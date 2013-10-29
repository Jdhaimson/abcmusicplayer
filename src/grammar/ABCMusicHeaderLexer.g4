lexer grammar ABCMusicHeaderLexer;

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

X: 'X:' -> pushMode(enter_index) ;
T: 'T:' -> pushMode(enter_title) ;
C: 'C:' -> pushMode(enter_composer) ;
L: 'L:' -> pushMode(enter_length) ;
M: 'M:' -> pushMode(enter_meter) ;
Q: 'Q:' -> pushMode(enter_tempo) ;
V: 'V:' -> pushMode(enter_voice) ;
K: 'K:' -> pushMode(enter_key) ;

BASE_NOTE : 'C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B'
        | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b' ;

KEY_ACCIDENTAL : '#' | 'b' ;
MODE_MINOR : 'm' ;

EQUALS : '=' ;

SPACE : ' ' ;

OCTAVE : [',]+ ;

DIGIT : [0-9]+ ;
LINE_FEED : '\n' | '\r' | '\r\n' ;
PERCENT : '%' -> pushMode(enter_comment) ;

COLON : ':' ;

mode enter_tempo;
WS_TEMPO : [ ] -> skip ;
TEMPO_FRACTION : [0-9]+ '/' [0-9]+ ;
TEMPO_EQUALS : '=' ;
TEMPO_NUMBER : [0-9]+ -> popMode ;

mode enter_title;
TITLE_TEXT : ~[\r\n]+ -> popMode ;
END_TITLE : ('\n' | '\r' | '\r\n') -> popMode ;

mode enter_composer;
COMPOSER_TEXT : ~[\r\n]+ -> popMode ;
END_COMPOSER : ('\n' | '\r' | '\r\n') -> popMode ;

mode enter_voice;
VOICE_TEXT : ~[\r\n]+ -> popMode ;
END_VOICE : ('\n' | '\r' | '\r\n') -> popMode ;

mode enter_comment;
COMMENT_TEXT : ~[\r\n]+ -> popMode ;
END_COMMENT : ('\n' | '\r' | '\r\n') -> popMode ;

mode enter_key;
WS_KEY : [ ] -> skip ;
KEY_NOTE : BASE_NOTE KEY_ACCIDENTAL? MODE_MINOR? -> popMode ;

mode enter_index;
WS_INDEX : [ ] -> skip ;
INDEX : [0-9]+ -> popMode ;

mode enter_meter;
WS_METER : [ ] -> skip ;
METER_VARIANTS : ('C' | 'C|') -> popMode ;
METER_FRACTION : ([0-9]+ '/' [0-9]+) -> popMode ;

mode enter_length;
WS_LENGTH : [ ] -> skip ;
LENGTH_FRACTION : ([0-9]+ '/' [0-9]+) -> popMode ;
