parser grammar ABCMusicHeaderParser;

options { tokenVocab=ABCMusicHeaderLexer; }

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
 
abc_tune_header : abc_header EOF;

abc_header : field_number comment* field_title other_fields* field_key ;

field_number : X DIGIT eol ;
field_title : T TITLE_TEXT+ eol ;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | comment ;
field_composer : C COMPOSER_TEXT+ eol ;
field_default_length : L METER_FRACTION eol ;
field_meter : M meter eol ;
field_tempo : Q TEMPO eol ;
field_voice : V VOICE_TEXT+ eol ;
field_key : K key eol ;

eol : comment | LINE_FEED ;
meter : METER_FRACTION | METER_VARIANTS  ;

key : key_note MODE_MINOR? ;
key_note : BASE_NOTE KEY_ACCIDENTAL? ;

comment : PERCENT COMMENT_TEXT* LINE_FEED ;