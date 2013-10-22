/**
 * This file is the grammar file used by ANTLR.
 *
 * In order to compile this file, navigate to this directory
 * (<src/grammar>) and run the following command:
 *
 * java -jar ../../antlr.jar ABCMusic.g4
 */

grammar ABCMusic;

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
 
/* 
 * WHITESPACE : [ \t\r\n]+ -> skip ;
 */
COMPOSER : ANYTHING* [\r\n] ;
KEY : 'K:' [a-zA-Z]+ [\r\n] ;
LENGTH : 'L:' NUMERATOR DENOMINATOR? [\r\n] ;
NUMERATOR: [0-9]+ ;
DENOMINATOR: '/'[0-9]+ ;
ANYTHING : [a-zA-Z] ;
METER: 'M:' NUMERATOR DENOMINATOR [\r\n] ;
TEMPO: 'Q:' NUMERATOR DENOMINATOR '=' NUMERATOR [\r\n] ;
TITLE: 'T:' ANYTHING* [\r\n];
INDEX: 'X:' NUMERATOR [\r\n];

HEADER: INDEX TITLE [ COMPOSER | LENGTH | METER | TEMPO ]* KEY ;

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
 
/*
 line     : ANYTHING EOF;
 */
