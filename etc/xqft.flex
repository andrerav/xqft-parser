package no.ntnu.xqft.lex;

 
import java_cup.runtime.*;

/** 
 * A lexer for XQuery 1.0 with full-text extensions
 * 
 * See: http://www.w3.org/TR/xquery-full-text/#grammar-terminals
 *
 */
%%

%class XQFTLexer
%cupsym XQFTSymbols
%unicode
%cup
%line
%char
%public
%column

%{  
  private Symbol symbol(int type, Object value) {
  	Symbol tmp = new Symbol(type, yyline, yychar, value);
    return tmp;
  }
%}

LineTerminator    = \r|\n|\r\n
WhiteSpace        = {LineTerminator} | [ \t\f]

Char              = \x9 | \xA | \xD | [\u0020-\uD7FF] | [\uE000-\uFFFD] | [\u10000-\u10FFFF]
Digits            = [0-9]+
CommentContents   = (Char+ - (Char* ('(:' | ':)') Char*))

%%

<YYINITIAL> {

  /* literals */
  {Word}                         { /*return symbol(DocumentSymbols.WORD, yytext());*/ }
  {Combined_Word}                { /*return symbol(DocumentSymbols.WORD, yytext());*/ }
  {DQuote}                       { /* ignore */ }
  {Decimal}                      { /*return symbol(DocumentSymbols.DECIMAL, yytext());*/  }
  {Number}                       { /*return symbol(DocumentSymbols.NUMBER, yytext());*/ }


  /* whitespace */
  {WhiteSpace}                   { /* ignore */ }
}

/* Fallback */
.|\n                             { /* ignore */ }
