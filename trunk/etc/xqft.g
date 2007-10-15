grammar xqft;

options { 
    k = 3;
    //output=AST;
    //ASTLabelType=Object;
}
//@parser::header {
	//package no.ntnu.xqft.parse;
	//import no.ntnu.xqft.lex.*;
//}
//@lexer::header {
	//package no.ntnu.xqft.lex;
	//import no.ntnu.xqft.parse.*;
//}

//@members {
	
//}
/* Lexer */
/* See http://www.w3.org/TR/REC-xml/#CharClasses */
Letter              : BaseChar | Ideographic ;
BaseChar            : '\u0041'..'\u005A' | '\u0061'..'\u007A' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u00FF' | '\u0100'..'\u0131' | '\u0134'..'\u013E' | '\u0141'..'\u0148' | '\u014A'..'\u017E' | '\u0180'..'\u01C3' | '\u01CD'..'\u01F0' | '\u01F4'..'\u01F5' | '\u01FA'..'\u0217' | '\u0250'..'\u02A8' | '\u02BB'..'\u02C1' | '\u0386' | '\u0388'..'\u038A' | '\u038C' | '\u038E'..'\u03A1' | '\u03A3'..'\u03CE' | '\u03D0'..'\u03D6' | '\u03DA' | '\u03DC' | '\u03DE' | '\u03E0' | '\u03E2'..'\u03F3' | '\u0401'..'\u040C' | '\u040E'..'\u044F' | '\u0451'..'\u045C' | '\u045E'..'\u0481' | '\u0490'..'\u04C4' | '\u04C7'..'\u04C8' | '\u04CB'..'\u04CC' | '\u04D0'..'\u04EB' | '\u04EE'..'\u04F5' | '\u04F8'..'\u04F9' | '\u0531'..'\u0556' | '\u0559' | '\u0561'..'\u0586' | '\u05D0'..'\u05EA' | '\u05F0'..'\u05F2' | '\u0621'..'\u063A' | '\u0641'..'\u064A' | '\u0671'..'\u06B7' | '\u06BA'..'\u06BE' | '\u06C0'..'\u06CE' | '\u06D0'..'\u06D3' | '\u06D5' | '\u06E5'..'\u06E6' | '\u0905'..'\u0939' | '\u093D' | '\u0958'..'\u0961' | '\u0985'..'\u098C' | '\u098F'..'\u0990' | '\u0993'..'\u09A8' | '\u09AA'..'\u09B0' | '\u09B2' | '\u09B6'..'\u09B9' | '\u09DC'..'\u09DD' | '\u09DF'..'\u09E1' | '\u09F0'..'\u09F1' | '\u0A05'..'\u0A0A' | '\u0A0F'..'\u0A10' | '\u0A13'..'\u0A28' | '\u0A2A'..'\u0A30' | '\u0A32'..'\u0A33' | '\u0A35'..'\u0A36' | '\u0A38'..'\u0A39' | '\u0A59'..'\u0A5C' | '\u0A5E' | '\u0A72'..'\u0A74' | '\u0A85'..'\u0A8B' | '\u0A8D' | '\u0A8F'..'\u0A91' | '\u0A93'..'\u0AA8' | '\u0AAA'..'\u0AB0' | '\u0AB2'..'\u0AB3' | '\u0AB5'..'\u0AB9' | '\u0ABD' | '\u0AE0' | '\u0B05'..'\u0B0C' | '\u0B0F'..'\u0B10' | '\u0B13'..'\u0B28' | '\u0B2A'..'\u0B30' | '\u0B32'..'\u0B33' | '\u0B36'..'\u0B39' | '\u0B3D' | '\u0B5C'..'\u0B5D' | '\u0B5F'..'\u0B61' | '\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B95' | '\u0B99'..'\u0B9A' | '\u0B9C' | '\u0B9E'..'\u0B9F' | '\u0BA3'..'\u0BA4' | '\u0BA8'..'\u0BAA' | '\u0BAE'..'\u0BB5' | '\u0BB7'..'\u0BB9' | '\u0C05'..'\u0C0C' | '\u0C0E'..'\u0C10' | '\u0C12'..'\u0C28' | '\u0C2A'..'\u0C33' | '\u0C35'..'\u0C39' | '\u0C60'..'\u0C61' | '\u0C85'..'\u0C8C' | '\u0C8E'..'\u0C90' | '\u0C92'..'\u0CA8' | '\u0CAA'..'\u0CB3' | '\u0CB5'..'\u0CB9' | '\u0CDE' | '\u0CE0'..'\u0CE1' | '\u0D05'..'\u0D0C' | '\u0D0E'..'\u0D10' | '\u0D12'..'\u0D28' | '\u0D2A'..'\u0D39' | '\u0D60'..'\u0D61' | '\u0E01'..'\u0E2E' | '\u0E30' | '\u0E32'..'\u0E33' | '\u0E40'..'\u0E45' | '\u0E81'..'\u0E82' | '\u0E84' | '\u0E87'..'\u0E88' | '\u0E8A' | '\u0E8D' | '\u0E94'..'\u0E97' | '\u0E99'..'\u0E9F' | '\u0EA1'..'\u0EA3' | '\u0EA5' | '\u0EA7' | '\u0EAA'..'\u0EAB' | '\u0EAD'..'\u0EAE' | '\u0EB0' | '\u0EB2'..'\u0EB3' | '\u0EBD' | '\u0EC0'..'\u0EC4' | '\u0F40'..'\u0F47' | '\u0F49'..'\u0F69' | '\u10A0'..'\u10C5' | '\u10D0'..'\u10F6' | '\u1100' | '\u1102'..'\u1103' | '\u1105'..'\u1107' | '\u1109' | '\u110B'..'\u110C' | '\u110E'..'\u1112' | '\u113C' | '\u113E' | '\u1140' | '\u114C' | '\u114E' | '\u1150' | '\u1154'..'\u1155' | '\u1159' | '\u115F'..'\u1161' | '\u1163' | '\u1165' | '\u1167' | '\u1169' | '\u116D'..'\u116E' | '\u1172'..'\u1173' | '\u1175' | '\u119E' | '\u11A8' | '\u11AB' | '\u11AE'..'\u11AF' | '\u11B7'..'\u11B8' | '\u11BA' | '\u11BC'..'\u11C2' | '\u11EB' | '\u11F0' | '\u11F9' | '\u1E00'..'\u1E9B' | '\u1EA0'..'\u1EF9' | '\u1F00'..'\u1F15' | '\u1F18'..'\u1F1D' | '\u1F20'..'\u1F45' | '\u1F48'..'\u1F4D' | '\u1F50'..'\u1F57' | '\u1F59' | '\u1F5B' | '\u1F5D' | '\u1F5F'..'\u1F7D' | '\u1F80'..'\u1FB4' | '\u1FB6'..'\u1FBC' | '\u1FBE' | '\u1FC2'..'\u1FC4' | '\u1FC6'..'\u1FCC' | '\u1FD0'..'\u1FD3' | '\u1FD6'..'\u1FDB' | '\u1FE0'..'\u1FEC' | '\u1FF2'..'\u1FF4' | '\u1FF6'..'\u1FFC' | '\u2126' | '\u212A'..'\u212B' | '\u212E' | '\u2180'..'\u2182' | '\u3041'..'\u3094' | '\u30A1'..'\u30FA' | '\u3105'..'\u312C' | '\uAC00'..'\uD7A3';

Ideographic         : '\u4E00'..'\u9FA5' | '\u3007' | '\u3021'..'\u3029'; 
CombiningChar       : '\u0300'..'\u0345' | '\u0360'..'\u0361' | '\u0483'..'\u0486' | '\u0591'..'\u05A1' | '\u05A3'..'\u05B9' | '\u05BB'..'\u05BD' | '\u05BF' | '\u05C1'..'\u05C2' | '\u05C4' | '\u064B'..'\u0652' | '\u0670' | '\u06D6'..'\u06DC' | '\u06DD'..'\u06DF' | '\u06E0'..'\u06E4' | '\u06E7'..'\u06E8' | '\u06EA'..'\u06ED' | '\u0901'..'\u0903' | '\u093C' | '\u093E'..'\u094C' | '\u094D' | '\u0951'..'\u0954' | '\u0962'..'\u0963' | '\u0981'..'\u0983' | '\u09BC' | '\u09BE' | '\u09BF' | '\u09C0'..'\u09C4' | '\u09C7'..'\u09C8' | '\u09CB'..'\u09CD' | '\u09D7' | '\u09E2'..'\u09E3' | '\u0A02' | '\u0A3C' | '\u0A3E' | '\u0A3F' | '\u0A40'..'\u0A42' | '\u0A47'..'\u0A48' | '\u0A4B'..'\u0A4D' | '\u0A70'..'\u0A71' | '\u0A81'..'\u0A83' | '\u0ABC' | '\u0ABE'..'\u0AC5' | '\u0AC7'..'\u0AC9' | '\u0ACB'..'\u0ACD' | '\u0B01'..'\u0B03' | '\u0B3C' | '\u0B3E'..'\u0B43' | '\u0B47'..'\u0B48' | '\u0B4B'..'\u0B4D' | '\u0B56'..'\u0B57' | '\u0B82'..'\u0B83' | '\u0BBE'..'\u0BC2' | '\u0BC6'..'\u0BC8' | '\u0BCA'..'\u0BCD' | '\u0BD7' | '\u0C01'..'\u0C03' | '\u0C3E'..'\u0C44' | '\u0C46'..'\u0C48' | '\u0C4A'..'\u0C4D' | '\u0C55'..'\u0C56' | '\u0C82'..'\u0C83' | '\u0CBE'..'\u0CC4' | '\u0CC6'..'\u0CC8' | '\u0CCA'..'\u0CCD' | '\u0CD5'..'\u0CD6' | '\u0D02'..'\u0D03' | '\u0D3E'..'\u0D43' | '\u0D46'..'\u0D48' | '\u0D4A'..'\u0D4D' | '\u0D57' | '\u0E31' | '\u0E34'..'\u0E3A' | '\u0E47'..'\u0E4E' | '\u0EB1' | '\u0EB4'..'\u0EB9' | '\u0EBB'..'\u0EBC' | '\u0EC8'..'\u0ECD' | '\u0F18'..'\u0F19' | '\u0F35' | '\u0F37' | '\u0F39' | '\u0F3E' | '\u0F3F' | '\u0F71'..'\u0F84' | '\u0F86'..'\u0F8B' | '\u0F90'..'\u0F95' | '\u0F97' | '\u0F99'..'\u0FAD' | '\u0FB1'..'\u0FB7' | '\u0FB9' | '\u20D0'..'\u20DC' | '\u20E1' | '\u302A'..'\u302F' | '\u3099' | '\u309A';
Digit               : '\u0030'..'\u0039' | '\u0660'..'\u0669' | '\u06F0'..'\u06F9' | '\u0966'..'\u096F' | '\u09E6'..'\u09EF' | '\u0A66'..'\u0A6F' | '\u0AE6'..'\u0AEF' | '\u0B66'..'\u0B6F' | '\u0BE7'..'\u0BEF' | '\u0C66'..'\u0C6F' | '\u0CE6'..'\u0CEF' | '\u0D66'..'\u0D6F' | '\u0E50'..'\u0E59' | '\u0ED0'..'\u0ED9' | '\u0F20'..'\u0F29' ;
Extender            : '\u00B7' | '\u02D0' | '\u02D1' | '\u0387' | '\u0640' | '\u0E46' | '\u0EC6' | '\u3005' | '\u3031'..'\u3035' | '\u309D'..'\u309E' | '\u30FC'..'\u30FE';

/* See http://www.w3.org/TR/xquery-full-text/#grammar-terminals */
IntegerLiteral      : Digits;
DecimalLiteral      : ('.' Digits) | (Digits '.' ('0'..'9')*);
DoubleLiteral       : (('.' Digits) | (Digits ('.' ('0'..'9')*)?)) ('e'|'E') ('+'|'-')? Digits;

/* StringLiteral       : ('"' (PredefinedEntityRef | CharRef | EscapeQuot | [^"&])* '"') | ("'" (PredefinedEntityRef | CharRef | EscapeApos | [^'&])* "'") */
StringLiteral	    : ('"' (PredefinedEntityRef | CharRef | EscapeQuot | ~('"'|'&'))* '"') | ('\'' (PredefinedEntityRef | CharRef | EscapeApos | ~('\''|'&'))* '\'');
PredefinedEntityRef : '&' ('lt' | 'gt' | 'amp' | 'quot' | 'apos') ';';
EscapeQuot          : '""';
EscapeApos          : '\'''\'';

/* Original:
ElementContentChar	: Char ~ ('{'|'}'|'<'|'&');
QuotAttrContentChar	: Char ~ ('"'|'{'|'}'|'<'|'&');
AposAttrContentChar	: Char ~ ('\''|'{'|'}'|'<'|'&');
*/
//--------------------------------------- New ------------------------------------------------
ElementContentChar	: c=Char {(!$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;
QuotAttrContentChar	: c=Char {(!$c.getText().equals("\"") && !$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;
AposAttrContentChar	: c=Char {(!$.getText()c.equals("'") && !$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;
//--------------------------------------- weN ------------------------------------------------


Comment             :'(:' (CommentContents | Comment)* ':)';

NameChar            : Letter | Digit | '.' | '-' | '_' | ':' | CombiningChar | Extender;
Name                : (Letter | '_' | ':') (NameChar)*;
Names               : Name ('\u0020' Name)*;
Nmtoken             : (NameChar)+;
Nmtokens            : Nmtoken ('\u0020' Nmtoken)*;

/* See: http://www.w3.org/TR/REC-xml/#NT-PITarget */
/* Original:
PI                  : '<?' PITarget (S (Char* ~ (Char* '?>' Char*)))? '?>';
PITarget            : Name ~ (('X' | 'x') ('M' | 'm') ('L' | 'l'));
ZeroOrMoreChar
*/
//--------------------------------------- New ------------------------------------------------
PI                  : '<?' PITarget (S (zoom=ZeroOrMoreChar))? '?>' {!$zoom.getText().contains("?>")}?;
PITarget            : n=Name { !$n.getText().equalsIgnoreCase("XML") }?;
//--------------------------------------- weN ------------------------------------------------

/* See: http://www.w3.org/TR/REC-xml/#NT-CharRef */
CharRef             : '&#' ('0'..'9')+ ';' | '&#x' ('0'..'9'|'a'..'f'|'A'..'F')+ ';';
			
/* See: http://www.w3.org/TR/REC-xml-names/#NT-QName */
QName               : PrefixedName | UnprefixedName;
PrefixedName        : Prefix ':' LocalPart ;
UnprefixedName      : LocalPart ;
Prefix              : NCName;
LocalPart           : NCName;

/* See: http://www.w3.org/TR/REC-xml-names/#NT-NCName */
NCName              : NCNameStartChar NCNameChar*;
/*NCNameChar          : NameChar ~ ':';*/
//--------------------------------------- New ------------------------------------------------
NCNameChar          : nc=NameChar {!$nc.getText().equals(":")}?;
//--------------------------------------- weN ------------------------------------------------
NCNameStartChar     : Letter | '_';

/* See: http://www.w3.org/TR/REC-xml/#NT-S */
S                   : ('\u0020' | '\u0009' | '\u000D' | '\u000A')+;

/* See: http://www.w3.org/TR/xquery-full-text/#prod-xquery-Char */
Char                : '\u0009' | '\u000A' | '\u000D' | ('\u0020'..'\uD7FF') | ('\uE000'..'\uFFFD'); /* Dropped temporarily | [\u10000-\u10FFFF] */

/* See http://www.w3.org/TR/xquery-full-text/#prod-xquery-Digits */
Digits              : ('0'..'9')+;

//CommentContents     : (Char+ ~ (Char* ('(:' | ':)') Char*));

//-------------------------------------------- New ---------------------------------------------------------------
CommentContents	    : m=OneOrMoreChar {((!$m.equals("(:")) && (!$m.equals(":)") ))}?;
//-------------------------------------------- weN ---------------------------------------------------------------



/* Parser */
//-------------------------------------------- New ---------------------------------------------------------------
ZeroOrMoreChar		    : Char*;
OneOrMoreChar		    : Char+;
fragment charNotMinus		    : m=Char{ !$m.equals("-") }?;  //NB small first letter
//-------------------------------------------- weN ---------------------------------------------------------------

module                      : versionDecl? (libraryModule | mainModule);

versionDecl                 : 'xquery' 'version' StringLiteral (('encoding' StringLiteral)|) Separator;

mainModule                  : prolog queryBody;

libraryModule               : moduleDecl prolog;

moduleDecl                  : 'module' 'namespace' NCName '=' uriLiteral Separator;

prolog                      : ((defaultNamespaceDecl | setter | namespaceDecl | import) Separator)* ((varDecl | functionDecl | optionDecl | ftOptionDecl) Separator)*;

setter                      : boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl;

import                      : schemaImport | moduleImport;

Separator                   : ';';

namespaceDecl               : 'declare' 'namespace' NCName '=' uriLiteral;

boundarySpaceDecl           : 'declare' 'boundary-space' ('preserve' | 'strip');

defaultNamespaceDecl        : 'declare' 'default' ('element' | 'function') 'namespace' uriLiteral;

optionDecl                  : 'declare' 'option' QName StringLiteral;

ftOptionDecl                : 'declare' 'ft-option' ftMatchOptions;

orderingModeDecl            : 'declare' 'ordering' ('ordered' | 'unordered');

emptyOrderDecl              : 'declare' 'default' 'order' 'empty' ('greatest' | 'least');

copyNamespacesDecl          : 'declare' 'copy-namespaces' preserveMode ',' inheritMode;

preserveMode                : 'preserve' | 'no-preserve';

inheritMode                 : 'inherit' | 'no-inherit';

defaultCollationDecl        : 'declare' 'default' 'collation' uriLiteral;

baseURIDecl                 : 'declare' 'base-uri' uriLiteral;

schemaImport                : 'import' 'schema' SchemaPrefix? uriLiteral ('at' uriLiteral (',' uriLiteral)*)?;

SchemaPrefix                : ('namespace' NCName '=') | ('default' 'element' 'namespace');

moduleImport                : 'import' 'module' ('namespace' NCName '=')? uriLiteral ('at' uriLiteral (',' uriLiteral)*)?;

varDecl                     : 'declare' 'variable' '$' QName typeDeclaration? ((':=' exprSingle) | 'external');

constructionDecl            : 'declare' 'construction' ('strip' | 'preserve');

functionDecl                : 'declare' 'function' QName '(' paramList? ')' ('as' sequenceType)? (enclosedExpr | 'external');

paramList                   : param (',' param)*;

param                       : '$' QName typeDeclaration?;

enclosedExpr                : '{' expr '}';

queryBody                   : expr;

expr                        : exprSingle (',' exprSingle)*;

exprSingle                  : fLWORExpr
                                | quantifiedExpr
                                | typeswitchExpr
                                | ifExpr
                                | orExpr;

fLWORExpr                   : (forClause | letClause)+ whereClause? orderByClause? 'return' exprSingle;

forClause                   : 'for' '$' VarName typeDeclaration? positionalVar? ftScoreVar? 'in' exprSingle (',' '$' VarName typeDeclaration? positionalVar? ftScoreVar? 'in' exprSingle)*;

positionalVar               : 'at' '$' VarName;

ftScoreVar                  : 'score' '$' VarName;

letClause                   : (('let' '$' VarName typeDeclaration?) | ('let' 'score' '$' VarName)) ':=' exprSingle (',' (('$' VarName typeDeclaration?) | ftScoreVar) ':=' exprSingle)*;

whereClause                 : 'where' exprSingle;

orderByClause               : (('order' 'by') | ('stable' 'order' 'by')) orderSpecList;

orderSpecList               : orderSpec (',' orderSpec)*;

orderSpec                   : exprSingle orderModifier;

orderModifier               : ('ascending' | 'descending')? ('empty' ('greatest' | 'least'))? ('collation' uriLiteral)?;
quantifiedExpr              : ('some' | 'every') '$' VarName typeDeclaration? 'in' exprSingle (',' '$' VarName typeDeclaration? 'in' exprSingle)* 'satisfies' exprSingle;

typeswitchExpr              : 'typeswitch' '(' expr ')' caseClause+ 'default' ('$' VarName)? 'return' exprSingle;

caseClause                  : 'case' ('$' VarName 'as')? sequenceType 'return' exprSingle;

ifExpr                      : 'if' '(' expr ')' 'then' exprSingle 'else' exprSingle;

orExpr                      : andExpr ( 'or' andExpr )*;

andExpr                     : comparisonExpr ( 'and' comparisonExpr )*;

comparisonExpr              : ftContainsExpr ( (ValueComp
                                | GeneralComp
                                | NodeComp) ftContainsExpr )?;

ftContainsExpr              : rangeExpr ( 'ftcontains' ftSelection ftIgnoreOption? )?;

rangeExpr                   : additiveExpr ( 'to' additiveExpr )?;

additiveExpr                : multiplicativeExpr ( ('+' | '-') multiplicativeExpr )*;

multiplicativeExpr          : unionExpr ( ('*' | 'div' | 'idiv' | 'mod') unionExpr )*;

unionExpr                   : intersectExceptExpr ( ('union' | '|') intersectExceptExpr )*;

intersectExceptExpr         : instanceofExpr ( ('intersect' | 'except') instanceofExpr )*;

instanceofExpr              : treatExpr ( 'instance' 'of' sequenceType )?;

treatExpr                   : castableExpr ( 'treat' 'as' sequenceType )?;

castableExpr                : castExpr ( 'castable' 'as' singleType )?;

castExpr                    : unaryExpr ( 'cast' 'as' singleType )?;

unaryExpr                   : ('-' | '+')* valueExpr;

valueExpr                   : validateExpr | pathExpr | extensionExpr;

GeneralComp                 : '=' | '!=' | '<' | '<=' | '>' | '>=';

ValueComp                   : 'eq' | 'ne' | 'lt' | 'le' | 'gt' | 'ge';

NodeComp                    : 'is' | '<<' | '>>';

validateExpr                : 'validate' ValidationMode? '{' expr '}';

ValidationMode              : 'lax' | 'strict';

extensionExpr               : pragma+ '{' expr? '}';

pragma                      : '(#' S? QName (S PragmaContents)? '#)'; /* ws: explicit */

//PragmaContents              : (Char* ~ (Char* '#)' Char*));

//--------------------------------------- New ------------------------------------------------
PragmaContents        : m=ZeroOrMoreChar{ !$m.getText().contains("#") }?  ;
//--------------------------------------- weN ------------------------------------------------

pathExpr                    :   	('/' relativePathExpr?)
                                | ('//' relativePathExpr)
                                | relativePathExpr;	/* xgc: leading-lone-slashXQ */

relativePathExpr            : stepExpr (('/' | '//') stepExpr)*;

stepExpr                    : filterExpr | axisStep;

axisStep                    : (reverseStep | forwardStep) predicateList;

forwardStep                 : (ForwardAxis nodeTest) | abbrevForwardStep;

ForwardAxis                 : ('child' '::')
                                | ('descendant' '::')
                                | ('attribute' '::')
                                | ('self' '::')
                                | ('descendant-or-self' '::')
                                | ('following-sibling' '::')
                                | ('following' '::');

abbrevForwardStep           : '@'? nodeTest;

reverseStep                 : (ReverseAxis nodeTest) | AbbrevReverseStep;

ReverseAxis                 : ('parent' '::')
                                | ('ancestor' '::')
                                | ('preceding-sibling' '::')
                                | ('preceding' '::')
                                | ('ancestor-or-self' '::');

AbbrevReverseStep           : '..';

nodeTest                    : kindTest | nameTest;

nameTest                    : QName | Wildcard;

Wildcard                    : '*'
                                | (NCName ':' '*')
                                | ('*' ':' NCName); /* ws: explicitXQ */

filterExpr                  : primaryExpr predicateList;

predicateList               : predicate*;

predicate                   : '[' expr ']';

primaryExpr                 : literal | varRef | parenthesizedExpr | ContextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor;

literal                     : numericLiteral | StringLiteral;

numericLiteral              : IntegerLiteral | DecimalLiteral | DoubleLiteral;

varRef                      : '$' VarName;

VarName                     : QName;

parenthesizedExpr           : '(' expr? ')';

ContextItemExpr             : '.';

orderedExpr                 : 'ordered' '{' expr '}';

unorderedExpr               : 'unordered' '{' expr '}';

functionCall                : QName '(' (exprSingle (',' exprSingle)*)? ')'; /* xgc: reserved-function-namesXQ */
                                                                                /* gn: parensXQ */

constructor                 : directConstructor
                                | computedConstructor;

directConstructor           : dirElemConstructor
                                | dirCommentConstructor
                                | dirPIConstructor;

dirElemConstructor          : '<' QName dirAttributeList ('/>' | ('>' dirElemContent* '</' QName S? '>')); /* ws: explicitXQ */
dirAttributeList            : (S (QName S? '=' S? dirAttributeValue)?)*; /* ws: explicitXQ */

dirAttributeValue           : ('"' (EscapeQuot | quotAttrValueContent)* '"')
                                | ('\'' (EscapeApos | aposAttrValueContent)* '\''); /* ws: explicitXQ */

quotAttrValueContent	    : QuotAttrContentChar
                                | commonContent;

aposAttrValueContent        : AposAttrContentChar
                                | commonContent;

dirElemContent              : directConstructor
                                | cDataSection
                                | commonContent
                                | ElementContentChar;

commonContent               : PredefinedEntityRef | CharRef | '{{' | '}}' | enclosedExpr;

dirCommentConstructor       : '<!--' dirCommentContents '-->'; /* ws: explicitXQ */


//dirCommentContents          : ((Char ~ '-') | ('-' (Char ~ '-')))*; /* ws: explicitXQ */

//--------------------------------------- New ------------------------------------------------
dirCommentContents             : (charNotMinus | ('-' charNotMinus))*; /* ws: explicitXQ */ 
//--------------------------------------- weN ------------------------------------------------

dirPIConstructor            : '<?' PITarget (S DirPIContents)? '?>'; /* ws: explicitXQ */


//DirPIContents               : (Char* ~ (Char* '?>' Char*)); /* ws: explicitXQ */

//--------------------------------------- New ------------------------------------------------
DirPIContents               : m=ZeroOrMoreChar{ !$m.getText().contains("?>") }?  ;
//--------------------------------------- weN ------------------------------------------------

cDataSection                : '<![CDATA[' cDataSectionContents ']]>'; /* ws: explicitXQ */



//cDataSectionContents        : (Char* ~ (Char* ']]>' Char*)); /* ws: explicitXQ */

//--------------------------------------- New ------------------------------------------------
cDataSectionContents        : m=ZeroOrMoreChar{ !$m.getText().contains("]]>") }?  ;
//--------------------------------------- weN ------------------------------------------------

computedConstructor         : compDocConstructor
                                | compElemConstructor
                                | compAttrConstructor
                                | compTextConstructor
                                | compCommentConstructor
                                | compPIConstructor;

compDocConstructor          : 'document' '{' expr '}';

compElemConstructor         : 'element' (QName | ('{' expr '}')) '{' contentExpr? '}';

contentExpr                 : expr;

compAttrConstructor         : 'attribute' (QName | ('{' expr '}')) '{' expr? '}';

compTextConstructor         : 'text' '{' expr '}';

compCommentConstructor      : 'comment' '{' expr '}';

compPIConstructor           : 'processing-instruction' (NCName | ('{' expr '}')) '{' expr? '}';

singleType                  : AtomicType '?'?;

typeDeclaration             : 'as' sequenceType;

sequenceType                : ('empty-sequence' '(' ')')
                                | (itemType OccurrenceIndicator?);

OccurrenceIndicator         : '?' | '*' | '+'; /* xgc: occurrence-indicatorsXQ */

itemType                    : kindTest | ('item' '(' ')') | AtomicType;

AtomicType                  : QName;

kindTest                    : documentTest
                                | elementTest
                                | attributeTest
                                | schemaElementTest
                                | schemaAttributeTest
                                | piTest
                                | commentTest
                                | textTest
                                | anyKindTest;

anyKindTest                 : 'node' '(' ')';

documentTest                : 'document-node' '(' (elementTest | schemaElementTest)? ')';

textTest                    : 'text' '(' ')';

commentTest                 : 'comment' '(' ')';

piTest                      : 'processing-instruction' '(' (NCName | StringLiteral)? ')';

attributeTest               : 'attribute' '(' (AttribNameOrWildcard (',' TypeName)?)? ')';

AttribNameOrWildcard        : AttributeName | '*';

schemaAttributeTest         : 'schema-attribute' '(' attributeDeclaration ')';

attributeDeclaration        : AttributeName;

elementTest                 : 'element' '(' (ElementNameOrWildcard (',' TypeName '?'?)?)? ')';

ElementNameOrWildcard       : ElementName | '*';

schemaElementTest           : 'schema-element' '(' ElementDeclaration ')';

ElementDeclaration          : ElementName;

AttributeName               : QName;

ElementName                 : QName;

TypeName                    : QName;

uriLiteral                  : StringLiteral;

ftSelection                 : ftOr ftPosFilter* ('weight' rangeExpr)?;

ftOr                        : ftAnd ( 'ftor' ftAnd )*;

ftAnd                       : ftMildNot ( 'ftand' ftMildNot )*;

ftMildNot                   : ftUnaryNot ( 'not' 'in' ftUnaryNot )*;

ftUnaryNot                  : ('ftnot')? ftPrimaryWithOptions;

ftPrimaryWithOptions        : ftPrimary ftMatchOptions?;

ftPrimary                   : (ftWords ftTimes?) | ('(' ftSelection ')') | ftExtensionSelection;

ftWords                     : ftWordsValue ftAnyallOption?;

ftWordsValue                : literal | ('{' expr '}');

ftExtensionSelection        : pragma+ '{' ftSelection? '}';

ftAnyallOption              : ('any' 'word'?) | ('all' 'words'?) | 'phrase';

ftTimes                     : 'occurs' ftRange 'times';


ftRange                     : ('exactly' additiveExpr)
                                | ('at' 'least' additiveExpr)
                                | ('at' 'most' additiveExpr)
                                | ('from' additiveExpr 'to' additiveExpr);

ftPosFilter                 : FTOrder | ftWindow | ftDistance | FTScope | FTContent;

FTOrder                     : 'ordered';

ftWindow                    : 'window' additiveExpr FTUnit;

ftDistance                  : 'distance' ftRange FTUnit;

FTUnit                      : 'words' | 'sentences' | 'paragraphs';

FTScope                     : ('same' | 'different') FTBigUnit;

FTBigUnit                   : 'sentence' | 'paragraph';

FTContent                   : ('at' 'start') | ('at' 'end') | ('entire' 'content');

ftMatchOptions              : ftMatchOption+;     /* xgc: multiple-match-options */

ftMatchOption               : ftLanguageOption
                                | ftWildCardOption
                                | ftThesaurusOption
                                | ftStemOption
                                | ftCaseOption
                                | ftDiacriticsOption
                                | ftStopwordOption
                                | ftExtensionOption;

ftCaseOption                : ('case' 'insensitive')
                                | ('case' 'sensitive')
                                | 'lowercase'
                                | 'uppercase';

ftDiacriticsOption          : ('diacritics' 'insensitive')
                                | ('diacritics' 'sensitive');

ftStemOption                : ('with' 'stemming') | ('without' 'stemming');

ftThesaurusOption	        : ('with' 'thesaurus' (ftThesaurusID | 'default'))
                                | ('with' 'thesaurus' '(' (ftThesaurusID | 'default') (',' ftThesaurusID)* ')')
                                | ('without' 'thesaurus');

ftThesaurusID               : 'at' uriLiteral ('relationship' StringLiteral)? (ftRange 'levels')?;

ftStopwordOption            : ('with' 'stop' 'words' ftRefOrList ftInclExclStringLiteral*)
                                | ('without' 'stop' 'words')
                                | ('with' 'default' 'stop' 'words' ftInclExclStringLiteral*);

ftRefOrList                 : ('at' uriLiteral)
                                | ('(' StringLiteral (',' StringLiteral)* ')');

ftInclExclStringLiteral     : ('union' | 'except') ftRefOrList;
ftLanguageOption            : 'language' StringLiteral;
ftWildCardOption            : ('with' 'wildcards') | ('without' 'wildcards');
ftExtensionOption           : 'option' QName StringLiteral;
ftIgnoreOption              : 'without' 'content' unionExpr;
