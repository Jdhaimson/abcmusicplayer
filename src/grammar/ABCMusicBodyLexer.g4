lexer grammar ABCMusicBodyLexer;

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

W: 'w:' -> pushMode(enter_lyrics) ;
V: 'V:' -> pushMode(enter_voice) ;

// "^" is sharp, "_" is flat, and "=" is neutral
ACCIDENTAL : '^' | '^^' | '_' | '__' | '=' ;

REST : 'z';

BAR_LINE : '|' | '||' | '[|' | '|]' | ':|' | '|:' ;
NTH_REPEAT : '[1' | '[2' ;

NOTE_LENGTH : DIGIT | (DIGIT DIVIDE DIGIT) | (DIVIDE DIGIT) | (DIGIT DIVIDE) | DIVIDE ;
NOTE_LENGTH_STRICT : DIGIT '/' DIGIT ;

//OCTAVE : [',]+ ;

OPEN_PAREN : '(' -> pushMode(enter_tuplet) ;

OPEN_BRACK : '[' ; 
CLOSED_BRACK : ']' ;

DIVIDE : '/' ;
DIGIT : [0-9]+ ;
SPACE : ' ' ;
LINE_FEED : '\n' | '\r' | '\r\n' ;
PERCENT : '%' -> pushMode(enter_comment) ;

BASE_NOTE_OCTAVE : ('C' | 'D' | 'E' | 'F' | 'G' | 'A' | 'B' | 'c' | 'd' | 'e' | 'f' | 'g' | 'a' | 'b') ([',]+)? ;

mode enter_comment;
COMMENT_TEXT : ~[\r\n]+ -> popMode ;
END_COMMENT : ('\n' | '\r' | '\r\n') -> popMode ;

mode enter_lyrics;
END_LYRIC : ('\n' | '\r' | '\r\n') -> popMode ;
LYRIC_TEXT : ~[\_\\-\*~\\-\| \r\n]+ ;
LYRICAL_ELEMENTS : ' '+ | '_' | '-' | '*' | '~' | '\-' | '|' ;

mode enter_voice;
VOICE_TEXT : ~[\r\n]+ -> popMode ;
END_VOICE : ('\n' | '\r' | '\r\n') -> popMode ;

mode enter_tuplet;
TUPLET_DIGIT : [0-9]+ -> popMode ;
