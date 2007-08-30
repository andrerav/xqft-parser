package no.ntnu.xqft.lex;

 
import java_cup.runtime.*;

/** 
 * A lexer for XQuery 1.0 with full-text extensions
 * Based on specification working draft 18. may 2007
 * 
 * See: http://www.w3.org/TR/xquery-full-text/#grammar-terminals
 *      http://www.w3.org/TR/xquery-xpath-parsing/
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

/* Macros */

/* See http://www.w3.org/TR/xquery-full-text/#grammar-terminals */
IntegerLiteral      = Digits
DecimalLiteral      = ("." Digits) | (Digits "." [0-9]*)
DoubleLiteral       = (("." Digits) | (Digits ("." [0-9]*)?)) [eE] [+-]? Digits
StringLiteral	    = (\" (PredefinedEntityRef | CharRef | EscapeQuot | [^\"&])* \") | (\' (PredefinedEntityRef | CharRef | EscapeApos | [^\'&])* \')
PredefinedEntityRef = "&" ("lt" | "gt" | "amp" | "quot" | "apos") ";"
EscapeQuot          = \"\"
EscapeApos          = \'\'
ElementContentChar	= Char - [{}<&]
QuotAttrContentChar	= Char - [\"{}<&]
AposAttrContentChar	= Char - [\'{}<&]
Comment             ="(:" (CommentContents | Comment)* ":)"

/* See: http://www.w3.org/TR/REC-xml/#NT-PITarget */
PI                  = '<?' PITarget (S (Char* - (Char* '?>' Char*)))? '?>'
PITarget            = Name - (('X' | 'x') ('M' | 'm') ('L' | 'l'))

/* See: http://www.w3.org/TR/REC-xml/#NT-CharRef */
CharRef             = '&#' [0-9]+ ';' | '&#x' [0-9a-fA-F]+ ';'
			
/* See: http://www.w3.org/TR/REC-xml-names/#NT-QName */
QName               = PrefixedName | UnprefixedName
PrefixedName        = Prefix ':' LocalPart 
UnprefixedName      = LocalPart 
Prefix              = NCName
LocalPart           = NCName

/* See: http://www.w3.org/TR/REC-xml-names/#NT-NCName */
NCName              = NCNameStartChar NCNameChar*
NCNameChar          = NameChar - ':'
NCNameStartChar     = Letter | '_'

/* See: http://www.w3.org/TR/REC-xml/#NT-S */
S                   = (\x20 | \x9 | \xD | \xA)+

/* See: http://www.w3.org/TR/xquery-full-text/#prod-xquery-Char */
Char                = \x9 | \xA | \xD | [\u0020-\uD7FF] | [\uE000-\uFFFD] | [\u10000-\u10FFFF]

/* See http://www.w3.org/TR/xquery-full-text/#prod-xquery-Digits */
Digits              = [0-9]+
CommentContents     = (Char+ - (Char* ('(:' | ':)') Char*))

%%

<YYINITIAL> {

  /* literals */
  {CommentContents}              { /*return symbol(DocumentSymbols.WORD, yytext());*/ }

}

/* Fallback */
.|\n                             { /* ignore */ }
