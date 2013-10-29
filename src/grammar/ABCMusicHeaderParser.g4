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

field_number : X number? eol ;
field_title : T title_text? (END_TITLE | eol) ;
other_fields : field_composer | field_default_length | field_meter | field_tempo | field_voice | comment ;
field_composer : C composer_text? (END_COMPOSER | eol) ;
field_default_length : L length_fraction? eol ;
field_meter : M meter? eol ;
field_tempo : Q tempo? eol ;
field_voice : V voice_text? (END_VOICE | eol) ;
field_key : K key_note? eol ;

tempo_fraction : TEMPO_FRACTION ;
tempo_number : TEMPO_NUMBER ;

eol : comment | LINE_FEED ;
meter : METER_FRACTION | METER_VARIANTS  ;
tempo : tempo_fraction TEMPO_EQUALS tempo_number ;
voice_text: VOICE_TEXT+ ;
length_fraction : LENGTH_FRACTION ;
composer_text : COMPOSER_TEXT+ ;
title_text : TITLE_TEXT+ ;
number : INDEX ;

key_note : KEY_NOTE ;

comment : PERCENT COMMENT_TEXT* (END_COMMENT | LINE_FEED) ;
