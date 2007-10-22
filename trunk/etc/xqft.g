grammar xqft;

//options { 
    //k = 1;
    //output=AST;
    //ASTLabelType=Object;
//}
/*Si-suffix indicates that its a sign
*/
tokens{
PIPESi = '|';
BIGGERTHANSi = '>';
BIGGERTHANOREQUALSi = '>=';
LESSTHANOREQUALSi = '<=';
ASCENDING = 'ascending';
IDIV = 'idiv';
WHERE = 'where';
PHRASE = 'phrase';
CONTENT = 'content';
VERSION = 'version';
LEFTBRACESi = '{';
EQUALSi = '=';
NOTEQUALSi = '!=';
STOP = 'stop';
TYPESWITCH = 'typeswitch';
ANY = 'any';
BOUNDARYSPACE = 'boundary-space';
DOLLARSi = '$';
XQUERY = 'xquery';
CAST = 'cast';
DISTANCE = 'distance';
LEFTPRAGMA = '(#';
ORDERED = 'ordered';
DOCUMENTNODE = 'document-node';
ELSE = 'else';
LESSTHANSi = '<';
TREAT = 'treat';
UPPERCASE = 'uppercase';
ALL = 'all';
WORD = 'words';
RIGHTPRAGMA = '#)';
INHERIT = 'inherit';
SLASH = '/';
ORDERING = 'ordering';
RIGHTPITARGET = '?>';
EVERY = 'every';
CASTABLE = 'castable';
ITEM = 'item';
FOR = 'for';
INSTANCE = 'instance';
DOUBLEQUOTESi = '"';
EXCEPT = 'except';
TO = 'to';
CONSTRUCTION = 'construction';
WEIGHT = 'weight';
FTOPTION = 'ft-option';
SATISFIES = 'satisfies';
WORD = 'word';
COLONSi = ':';
SEMICOLONSi = ';';
SINGLEQUOTE = '\'';
UNDERSCORE = '_';
EMPTY = 'empty';
MOST = 'most';
CASE = 'case';
PROCESSING_INSTRUCTION = 'processing-instruction';
IMPORT = 'import';
MINUSSi = '-';
RIGHTSELFTERMINATOR = '/>';
DOCUMENT = 'document';
LEFTCDATA = '<![CDATA[';
VALIDATE = 'validate';
EMPTY_SEQUENCE = 'empty-sequence';
INSENSITIVE = 'insensitive';
NOPRESERVE = 'no-preserve';
THEN = 'then';
COMMASi = ',';
LET = 'let';
WINDOW = 'window';
SCORE = 'score';
LANGUAGE = 'language';
OPTION = 'option';
STEMMING = 'stemming';
RIGHTBRACKETSi = ']';
GREATEST = 'greatest';
LEVELS = 'levels';
SENSITIVE = 'sensitive';
FTNOT = 'ftnot';
DIV = 'div';
PLUSSi = '+';
FTAND = 'ftand';
AT = 'at';
SCHEMAATTRIBUTE = 'schema-attribute';
ORDER ='order';
OF = 'of';
UNION = 'union';
FROM = 'from';
COLLATION = 'collation';
DOUBLERIGHTBRACES = '}}';
VARIABLE = 'variable';
OR = 'or';
FTOR = 'ftor';
DOUBLESLASH = '//';
LEAST = 'least';
IF = 'if';
BASEURI = 'base-uri';
DESCENDING = 'descending';
STARSi = '*';
NAMESPACE = 'namespace';
AS = 'as';
LEFTXMLCOMMENT = '<!--';
BY = 'by';
TEXT = 'text';
STABLE = 'stable';
LEFTBRACKETSi = '[';
UNORDERED = 'unordered';
RIGHTCDATA = ']]>';
EXACTLY = 'exactly';
WITH = 'with';
LEFTPITARGET = '<?';
WITHOUT = 'without';
DIACRITICS = 'diacritics';
EXTERNAL = 'external';
RIGHTPARENTHESISSi = ')';
RIGHTXMLCOMMENT = '-->';
MODULE = 'module';
RETURN = 'return';
COMMENT = 'comment';
DEFAULT = 'default';
OCCURS = 'occurs';
ENCODING = 'encoding';
DOUBLELEFTBRACES = '{{';
SCHEMA = 'schema';
ELEMENT = 'element';
LEFTPARENTHESISSi = '(';
COPYNAMESPACES = 'copy-namespaces';
WILDCARDS = 'wildcards';
DECLARE = 'declare';
AND = 'and';
PRESERVE = 'preserve';
NOINHERIT = 'no-inherit';
NOT = 'not';
INTERSECT = 'intersect';
FUNCTION = 'function';
ATSi = '@';
TIMES = 'times';
ATTRIBUTE = 'attribute';
ASSIGNMENTOPERATOR = ':=';
FTCONTAINS = 'ftcontains';
RELATIONSHIP = 'relationship';
THESAURUS = 'thesaurus';
MOD = 'mod';
RIGHTBRACESi = '}';
NODE = 'node';
SOME = 'some';
QUESTIONMARKSi = '?';
STRIP = 'strip';
LOWERCASE = 'lowercase';
IN = 'in';
SCHEMAELEMENT = 'schema-element';
LEFTENDTAG = '</';
STEMMING = 'stemming';
EQ = 'eq';
NE = 'ne';
LT = 'lt';
LE = 'le';
GT = 'gt';
GE = 'ge';
IS = 'is';
NODEBEFORESi = '<<';
NODEAFTERSi = '>>';
LAX = 'lax';
STRICT = 'strict';
CHILD = 'child';
DOUBLECOLON = '::';
DESCENDANT = 'descendant';
SELF = 'self';
DESCENDANT_OR_SELF = 'descendant-or-self';
FOLLOWING_SIBLING = 'following-sibling';
FOLLOWING = 'following';
PARENT = 'parent';
ANCESTOR = 'ancestor';
PRECEDING_SIBLING = 'preceding-sibling';
PRECEDING = 'preceding';
ANCESTOR_OR_SELF = 'ancestor-or-self';
DOT = '.';
DOTDOT = '..';
WORDS = 'words';
SENTENCES = 'sentences';
PARAGRAPHS = 'paragraphs';
SENTENCE = 'sentence';
PARAGRAPH = 'paragraph';
SAME = 'same';
DIFFERENT = 'different';
START = 'start';
END = 'end';
ENTIRE = 'entire';
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
fragment Letter              : BaseChar | Ideographic ;
fragment BaseChar            : '\u0041'..'\u005A' | '\u0061'..'\u007A' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u00FF' | '\u0100'..'\u0131' | '\u0134'..'\u013E' | '\u0141'..'\u0148' | '\u014A'..'\u017E' | '\u0180'..'\u01C3' | '\u01CD'..'\u01F0' | '\u01F4'..'\u01F5' | '\u01FA'..'\u0217' | '\u0250'..'\u02A8' | '\u02BB'..'\u02C1' | '\u0386' | '\u0388'..'\u038A' | '\u038C' | '\u038E'..'\u03A1' | '\u03A3'..'\u03CE' | '\u03D0'..'\u03D6' | '\u03DA' | '\u03DC' | '\u03DE' | '\u03E0' | '\u03E2'..'\u03F3' | '\u0401'..'\u040C' | '\u040E'..'\u044F' | '\u0451'..'\u045C' | '\u045E'..'\u0481' | '\u0490'..'\u04C4' | '\u04C7'..'\u04C8' | '\u04CB'..'\u04CC' | '\u04D0'..'\u04EB' | '\u04EE'..'\u04F5' | '\u04F8'..'\u04F9' | '\u0531'..'\u0556' | '\u0559' | '\u0561'..'\u0586' | '\u05D0'..'\u05EA' | '\u05F0'..'\u05F2' | '\u0621'..'\u063A' | '\u0641'..'\u064A' | '\u0671'..'\u06B7' | '\u06BA'..'\u06BE' | '\u06C0'..'\u06CE' | '\u06D0'..'\u06D3' | '\u06D5' | '\u06E5'..'\u06E6' | '\u0905'..'\u0939' | '\u093D' | '\u0958'..'\u0961' | '\u0985'..'\u098C' | '\u098F'..'\u0990' | '\u0993'..'\u09A8' | '\u09AA'..'\u09B0' | '\u09B2' | '\u09B6'..'\u09B9' | '\u09DC'..'\u09DD' | '\u09DF'..'\u09E1' | '\u09F0'..'\u09F1' | '\u0A05'..'\u0A0A' | '\u0A0F'..'\u0A10' | '\u0A13'..'\u0A28' | '\u0A2A'..'\u0A30' | '\u0A32'..'\u0A33' | '\u0A35'..'\u0A36' | '\u0A38'..'\u0A39' | '\u0A59'..'\u0A5C' | '\u0A5E' | '\u0A72'..'\u0A74' | '\u0A85'..'\u0A8B' | '\u0A8D' | '\u0A8F'..'\u0A91' | '\u0A93'..'\u0AA8' | '\u0AAA'..'\u0AB0' | '\u0AB2'..'\u0AB3' | '\u0AB5'..'\u0AB9' | '\u0ABD' | '\u0AE0' | '\u0B05'..'\u0B0C' | '\u0B0F'..'\u0B10' | '\u0B13'..'\u0B28' | '\u0B2A'..'\u0B30' | '\u0B32'..'\u0B33' | '\u0B36'..'\u0B39' | '\u0B3D' | '\u0B5C'..'\u0B5D' | '\u0B5F'..'\u0B61' | '\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B95' | '\u0B99'..'\u0B9A' | '\u0B9C' | '\u0B9E'..'\u0B9F' | '\u0BA3'..'\u0BA4' | '\u0BA8'..'\u0BAA' | '\u0BAE'..'\u0BB5' | '\u0BB7'..'\u0BB9' | '\u0C05'..'\u0C0C' | '\u0C0E'..'\u0C10' | '\u0C12'..'\u0C28' | '\u0C2A'..'\u0C33' | '\u0C35'..'\u0C39' | '\u0C60'..'\u0C61' | '\u0C85'..'\u0C8C' | '\u0C8E'..'\u0C90' | '\u0C92'..'\u0CA8' | '\u0CAA'..'\u0CB3' | '\u0CB5'..'\u0CB9' | '\u0CDE' | '\u0CE0'..'\u0CE1' | '\u0D05'..'\u0D0C' | '\u0D0E'..'\u0D10' | '\u0D12'..'\u0D28' | '\u0D2A'..'\u0D39' | '\u0D60'..'\u0D61' | '\u0E01'..'\u0E2E' | '\u0E30' | '\u0E32'..'\u0E33' | '\u0E40'..'\u0E45' | '\u0E81'..'\u0E82' | '\u0E84' | '\u0E87'..'\u0E88' | '\u0E8A' | '\u0E8D' | '\u0E94'..'\u0E97' | '\u0E99'..'\u0E9F' | '\u0EA1'..'\u0EA3' | '\u0EA5' | '\u0EA7' | '\u0EAA'..'\u0EAB' | '\u0EAD'..'\u0EAE' | '\u0EB0' | '\u0EB2'..'\u0EB3' | '\u0EBD' | '\u0EC0'..'\u0EC4' | '\u0F40'..'\u0F47' | '\u0F49'..'\u0F69' | '\u10A0'..'\u10C5' | '\u10D0'..'\u10F6' | '\u1100' | '\u1102'..'\u1103' | '\u1105'..'\u1107' | '\u1109' | '\u110B'..'\u110C' | '\u110E'..'\u1112' | '\u113C' | '\u113E' | '\u1140' | '\u114C' | '\u114E' | '\u1150' | '\u1154'..'\u1155' | '\u1159' | '\u115F'..'\u1161' | '\u1163' | '\u1165' | '\u1167' | '\u1169' | '\u116D'..'\u116E' | '\u1172'..'\u1173' | '\u1175' | '\u119E' | '\u11A8' | '\u11AB' | '\u11AE'..'\u11AF' | '\u11B7'..'\u11B8' | '\u11BA' | '\u11BC'..'\u11C2' | '\u11EB' | '\u11F0' | '\u11F9' | '\u1E00'..'\u1E9B' | '\u1EA0'..'\u1EF9' | '\u1F00'..'\u1F15' | '\u1F18'..'\u1F1D' | '\u1F20'..'\u1F45' | '\u1F48'..'\u1F4D' | '\u1F50'..'\u1F57' | '\u1F59' | '\u1F5B' | '\u1F5D' | '\u1F5F'..'\u1F7D' | '\u1F80'..'\u1FB4' | '\u1FB6'..'\u1FBC' | '\u1FBE' | '\u1FC2'..'\u1FC4' | '\u1FC6'..'\u1FCC' | '\u1FD0'..'\u1FD3' | '\u1FD6'..'\u1FDB' | '\u1FE0'..'\u1FEC' | '\u1FF2'..'\u1FF4' | '\u1FF6'..'\u1FFC' | '\u2126' | '\u212A'..'\u212B' | '\u212E' | '\u2180'..'\u2182' | '\u3041'..'\u3094' | '\u30A1'..'\u30FA' | '\u3105'..'\u312C' | '\uAC00'..'\uD7A3';

fragment Ideographic         : '\u4E00'..'\u9FA5' | '\u3007' | '\u3021'..'\u3029'; 
fragment CombiningChar       : '\u0300'..'\u0345' | '\u0360'..'\u0361' | '\u0483'..'\u0486' | '\u0591'..'\u05A1' | '\u05A3'..'\u05B9' | '\u05BB'..'\u05BD' | '\u05BF' | '\u05C1'..'\u05C2' | '\u05C4' | '\u064B'..'\u0652' | '\u0670' | '\u06D6'..'\u06DC' | '\u06DD'..'\u06DF' | '\u06E0'..'\u06E4' | '\u06E7'..'\u06E8' | '\u06EA'..'\u06ED' | '\u0901'..'\u0903' | '\u093C' | '\u093E'..'\u094C' | '\u094D' | '\u0951'..'\u0954' | '\u0962'..'\u0963' | '\u0981'..'\u0983' | '\u09BC' | '\u09BE' | '\u09BF' | '\u09C0'..'\u09C4' | '\u09C7'..'\u09C8' | '\u09CB'..'\u09CD' | '\u09D7' | '\u09E2'..'\u09E3' | '\u0A02' | '\u0A3C' | '\u0A3E' | '\u0A3F' | '\u0A40'..'\u0A42' | '\u0A47'..'\u0A48' | '\u0A4B'..'\u0A4D' | '\u0A70'..'\u0A71' | '\u0A81'..'\u0A83' | '\u0ABC' | '\u0ABE'..'\u0AC5' | '\u0AC7'..'\u0AC9' | '\u0ACB'..'\u0ACD' | '\u0B01'..'\u0B03' | '\u0B3C' | '\u0B3E'..'\u0B43' | '\u0B47'..'\u0B48' | '\u0B4B'..'\u0B4D' | '\u0B56'..'\u0B57' | '\u0B82'..'\u0B83' | '\u0BBE'..'\u0BC2' | '\u0BC6'..'\u0BC8' | '\u0BCA'..'\u0BCD' | '\u0BD7' | '\u0C01'..'\u0C03' | '\u0C3E'..'\u0C44' | '\u0C46'..'\u0C48' | '\u0C4A'..'\u0C4D' | '\u0C55'..'\u0C56' | '\u0C82'..'\u0C83' | '\u0CBE'..'\u0CC4' | '\u0CC6'..'\u0CC8' | '\u0CCA'..'\u0CCD' | '\u0CD5'..'\u0CD6' | '\u0D02'..'\u0D03' | '\u0D3E'..'\u0D43' | '\u0D46'..'\u0D48' | '\u0D4A'..'\u0D4D' | '\u0D57' | '\u0E31' | '\u0E34'..'\u0E3A' | '\u0E47'..'\u0E4E' | '\u0EB1' | '\u0EB4'..'\u0EB9' | '\u0EBB'..'\u0EBC' | '\u0EC8'..'\u0ECD' | '\u0F18'..'\u0F19' | '\u0F35' | '\u0F37' | '\u0F39' | '\u0F3E' | '\u0F3F' | '\u0F71'..'\u0F84' | '\u0F86'..'\u0F8B' | '\u0F90'..'\u0F95' | '\u0F97' | '\u0F99'..'\u0FAD' | '\u0FB1'..'\u0FB7' | '\u0FB9' | '\u20D0'..'\u20DC' | '\u20E1' | '\u302A'..'\u302F' | '\u3099' | '\u309A';
fragment Digit               : '\u0030'..'\u0039' | '\u0660'..'\u0669' | '\u06F0'..'\u06F9' | '\u0966'..'\u096F' | '\u09E6'..'\u09EF' | '\u0A66'..'\u0A6F' | '\u0AE6'..'\u0AEF' | '\u0B66'..'\u0B6F' | '\u0BE7'..'\u0BEF' | '\u0C66'..'\u0C6F' | '\u0CE6'..'\u0CEF' | '\u0D66'..'\u0D6F' | '\u0E50'..'\u0E59' | '\u0ED0'..'\u0ED9' | '\u0F20'..'\u0F29' ;
fragment Extender            : '\u00B7' | '\u02D0' | '\u02D1' | '\u0387' | '\u0640' | '\u0E46' | '\u0EC6' | '\u3005' | '\u3031'..'\u3035' | '\u309D'..'\u309E' | '\u30FC'..'\u30FE';

/* See http://www.w3.org/TR/xquery-full-text/#grammar-terminals */
IntegerLiteral      : Digits;
DecimalLiteral      : (DOT Digits) | (Digits DOT ('0'..'9')*);
DoubleLiteral       : ((DOT Digits) | (Digits (DOT ('0'..'9')*)?)) ('e'|'E') (PLUSSi|MINUSSi)? Digits;

/* StringLiteral       : ('"' (PredefinedEntityRef | CharRef | EscapeQuot | [^"&])* '"') | ("'" (PredefinedEntityRef | CharRef | EscapeApos | [^'&])* "'") */
StringLiteral	    : ('"' (PredefinedEntityRef | CharRef | EscapeQuot | ~(DOUBLEQUOTESi|'&'))* DOUBLEQUOTESi) | (SINGLEQUOTE (PredefinedEntityRef | CharRef | EscapeApos | ~(SINGLEQUOTE|'&'))* SINGLEQUOTE);
PredefinedEntityRef : '&' ('lt' | 'gt' | 'amp' | 'quot' | 'apos') SEMICOLONSi;
EscapeQuot          : '""';
EscapeApos          : '\'\'';

/* Original:
ElementContentChar	: Char ~ ('{'|'}'|'<'|'&');
QuotAttrContentChar	: Char ~ ('"'|'{'|'}'|'<'|'&');
AposAttrContentChar	: Char ~ ('\''|'{'|'}'|'<'|'&');
*/
//--------------------------------------- New ------------------------------------------------
fragment ElementContentChar	: c=Char {(!$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;
fragment QuotAttrContentChar	: c=Char {(!$c.getText().equals("\"") && !$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;
fragment AposAttrContentChar	: c=Char {(!$c.getText().equals("'") && !$c.getText().equals("{") && !$c.getText().equals("}") && !$c.getText().equals("<") && !$c.getText().equals("&")) }?;
//--------------------------------------- weN ------------------------------------------------


Comment             :'(:' (CommentCheck)* ':)' {$channel=HIDDEN;};
fragment CommentCheck: (Comment)=> Comment
					| CommentContents;
//CommentContents     : (Char+ ~ (Char* ('(:' | ':)') Char*));

//-------------------------------------------- New ---------------------------------------------------------------
fragment CommentContents	    : m=OneOrMoreChar {((!$m.equals("(:")) && (!$m.equals(":)") ))}?;
//-------------------------------------------- weN ---------------------------------------------------------------



fragment NameChar            : Letter | Digit | DOT | MINUSSi | UNDERSCORE | COLONSi | CombiningChar | Extender;
Name                : (Letter | UNDERSCORE | COLONSi) (NameChar)*;
Names               : Name ('\u0020' Name)*;
Nmtoken             : (NameChar)+;
Nmtokens            : Nmtoken ('\u0020' Nmtoken)*;

/* See: http://www.w3.org/TR/REC-xml/#NT-PITarget */
/* Original:
PI                  : LEFTPITARGET PITarget (S (Char* ~ (Char* '?>' Char*)))? '?>';
PITarget            : Name ~ (('X' | 'x') ('M' | 'm') ('L' | 'l'));
ZeroOrMoreChar
*/
//--------------------------------------- New ------------------------------------------------
/* Redundant
pi                  : LEFTPITARGET PITarget (S (zoom=ZeroOrMoreChar))? '?>' {!$zoom.getText().contains("?>")}?;
*/
piTarget            : n=Name { !$n.getText().equalsIgnoreCase("XML") }?;
//--------------------------------------- weN ------------------------------------------------

/* See: http://www.w3.org/TR/REC-xml/#NT-CharRef */
CharRef             : '&#' ('0'..'9')+ SEMICOLONSi | '&#x' ('0'..'9'|'a'..'f'|'A'..'F')+ SEMICOLONSi;
			
/* See: http://www.w3.org/TR/REC-xml-names/#NT-qName */
qName               : prefixedName | unprefixedName;
prefixedName        : prefix COLONSi localPart ;
unprefixedName      : localPart ;
prefix              : NCName;
localPart           : NCName;

/* See: http://www.w3.org/TR/REC-xml-names/#NT-NCName */
NCName              : NCNameStartChar NCNameChar*;
/*NCNameChar          : NameChar ~ ':';*/
//--------------------------------------- New ------------------------------------------------
NCNameChar          : nc=NameChar {!$nc.getText().equals(":")}?;
//--------------------------------------- weN ------------------------------------------------
NCNameStartChar     : Letter | UNDERSCORE;

/* See: http://www.w3.org/TR/REC-xml/#NT-S */
S                   : ('\u0020' | '\u0009' | '\u000D' | '\u000A')+;

/* See: http://www.w3.org/TR/xquery-full-text/#prod-xquery-Char */
Char                : '\u0009' | '\u000A' | '\u000D' | ('\u0020'..'\uD7FF') | ('\uE000'..'\uFFFD'); /* Dropped temporarily | [\u10000-\u10FFFF] */

/* See http://www.w3.org/TR/xquery-full-text/#prod-xquery-Digits */
Digits              : ('0'..'9')+;

/* Parser */
//-------------------------------------------- New ---------------------------------------------------------------
fragment ZeroOrMoreChar		    : Char*;
fragment OneOrMoreChar		    : Char+;
fragment charNotMinus	: m=Char{ !$m.equals("-") }?;  //NB small first letter
//-------------------------------------------- weN ---------------------------------------------------------------

module                      : versionDecl? (libraryModule | mainModule);

versionDecl                 : XQUERY VERSION StringLiteral ((ENCODING StringLiteral)|) separator;

mainModule                  : prolog queryBody;

libraryModule               : moduleDecl prolog;

moduleDecl                  : MODULE NAMESPACE NCName EQUALSi uriLiteral separator;

prolog                      : ((defaultNamespaceDecl | setter | namespaceDecl | importStmt) separator)* ((varDecl | functionDecl | optionDecl | ftOptionDecl) separator)*;

setter                      : boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl;

/* Using 'import' as name for this production caused error when compiling the parser */
importStmt                  : schemaImport | moduleImport;

separator                   : SEMICOLONSi;

namespaceDecl               : DECLARE NAMESPACE NCName EQUALSi uriLiteral;

boundarySpaceDecl           : DECLARE BOUNDARYSPACE (PRESERVE | STRIP);

defaultNamespaceDecl        : DECLARE DEFAULT (ELEMENT | FUNCTION) NAMESPACE uriLiteral;

optionDecl                  : DECLARE OPTION qName StringLiteral;

ftOptionDecl                : DECLARE FTOPTION ftMatchOptions;

orderingModeDecl            : DECLARE ORDERING (ORDERED | UNORDERED);

emptyOrderDecl              : DECLARE DEFAULT ORDER EMPTY (GREATEST | LEAST);

copyNamespacesDecl          : DECLARE COPYNAMESPACES preserveMode COMMASi inheritMode;

preserveMode                : PRESERVE | NOPRESERVE;

inheritMode                 : INHERIT | NOINHERIT;

defaultCollationDecl        : DECLARE DEFAULT COLLATION uriLiteral;

baseURIDecl                 : DECLARE BASEURI uriLiteral;

schemaImport                : IMPORT SCHEMA schemaPrefix? uriLiteral (AT uriLiteral (COMMASi uriLiteral)*)?;

schemaPrefix                : (NAMESPACE NCName EQUALSi) | (DEFAULT ELEMENT NAMESPACE);

moduleImport                : IMPORT MODULE (NAMESPACE NCName EQUALSi)? uriLiteral (AT uriLiteral (COMMASi uriLiteral)*)?;

varDecl                     : DECLARE VARIABLE DOLLARSi qName typeDeclaration? ((ASSIGNMENTOPERATOR exprSingle) | EXTERNAL);

constructionDecl            : DECLARE CONSTRUCTION (STRIP | PRESERVE);

functionDecl                : DECLARE FUNCTION qName LEFTPARENTHESISSi paramList? RIGHTPARENTHESISSi (AS sequenceType)? (enclosedExpr | EXTERNAL);

paramList                   : param (COMMASi param)*;

param                       : DOLLARSi qName typeDeclaration?;

enclosedExpr                : LEFTBRACESi expr RIGHTBRACESi;

queryBody                   : expr;

expr                        : exprSingle (COMMASi exprSingle)*;

exprSingle                  : fLWORExpr
                                | quantifiedExpr
                                | typeswitchExpr
                                | ifExpr
                                | orExpr;

fLWORExpr                   : (forClause | letClause)+ whereClause? orderByClause? RETURN exprSingle;

forClause                   : FOR DOLLARSi varName typeDeclaration? positionalVar? ftScoreVar? IN exprSingle (COMMASi DOLLARSi varName typeDeclaration? positionalVar? ftScoreVar? IN exprSingle)*;

positionalVar               : AT DOLLARSi varName;

ftScoreVar                  : SCORE DOLLARSi varName;

letClause                   : ((LET DOLLARSi varName typeDeclaration?) | (LET SCORE DOLLARSi varName)) ASSIGNMENTOPERATOR exprSingle (COMMASi ((DOLLARSi varName typeDeclaration?) | ftScoreVar) ASSIGNMENTOPERATOR exprSingle)*;

whereClause                 : WHERE exprSingle;

orderByClause               : ((ORDER BY) | (STABLE ORDER BY)) orderSpecList;

orderSpecList               : orderSpec (COMMASi orderSpec)*;

orderSpec                   : exprSingle orderModifier;

orderModifier               : (ASCENDING | DESCENDING)? (EMPTY (GREATEST | LEAST))? (COLLATION uriLiteral)?;

quantifiedExpr              : (SOME | EVERY) DOLLARSi varName typeDeclaration? IN exprSingle (COMMASi DOLLARSi varName typeDeclaration? IN exprSingle)* SATISFIES exprSingle;

typeswitchExpr              : TYPESWITCH LEFTPARENTHESISSi expr RIGHTPARENTHESISSi caseClause+ DEFAULT (DOLLARSi varName)? RETURN exprSingle;

caseClause                  : CASE (DOLLARSi varName AS)? sequenceType RETURN exprSingle;

ifExpr                      : IF LEFTPARENTHESISSi expr RIGHTPARENTHESISSi THEN exprSingle ELSE exprSingle;

orExpr                      : andExpr ( OR andExpr )*;

andExpr                     : comparisonExpr ( AND comparisonExpr )*;

comparisonExpr              : ftContainsExpr ( (valueComp | generalComp | nodeComp) ftContainsExpr )?;

ftContainsExpr              : rangeExpr ( FTCONTAINS ftSelection ftIgnoreOption? )?;

rangeExpr                   : additiveExpr ( TO additiveExpr )?;

additiveExpr                : multiplicativeExpr ( (PLUSSi | MINUSSi) multiplicativeExpr )*;

multiplicativeExpr          : unionExpr ( (STARSi | DIV | IDIV | MOD) unionExpr )*;

unionExpr                   : intersectExceptExpr ( (UNION | PIPESi) intersectExceptExpr )*;

intersectExceptExpr         : instanceofExpr ( (INTERSECT | EXCEPT) instanceofExpr )*;

instanceofExpr              : treatExpr ( INSTANCE OF sequenceType )?;

treatExpr                   : castableExpr ( TREAT AS sequenceType )?;

castableExpr                : castExpr ( CASTABLE AS singleType )?;

castExpr                    : unaryExpr ( CAST AS singleType )?;

unaryExpr                   : (MINUSSi | PLUSSi)* valueExpr;

valueExpr                   : validateExpr | pathExpr | extensionExpr;

generalComp                 : EQUALSi | NOTEQUALSi | LESSTHANSi | LESSTHANOREQUALSi | BIGGERTHANSi | BIGGERTHANOREQUALSi;

valueComp                   : EQ | NE | LT | LE | GT | GE;

nodeComp                    : IS | NODEBEFORESi | NODEAFTERSi;

validateExpr                : VALIDATE validationMode? LEFTBRACESi expr RIGHTBRACESi;

validationMode              : LAX | STRICT;

extensionExpr               : pragma+ LEFTBRACESi expr? RIGHTBRACESi;

pragma                      : LEFTPRAGMA S? qName (S pragmaContents)? RIGHTPRAGMA; /* ws: explicit */

//PragmaContents              : (Char* ~ (Char* '#)' Char*));

//--------------------------------------- New ------------------------------------------------
pragmaContents        : m=ZeroOrMoreChar{ !$m.getText().contains("#") }?  ;
//--------------------------------------- weN ------------------------------------------------
/* added syntactic predicate */
pathExpr                    : (DOUBLESLASH relativePathExpr)=> DOUBLESLASH relativePathExpr 
								| (SLASH? relativePathExpr);
							/*	| (SLASH relativePathExpr?)
                                | relativePathExpr;	*/
                                /* xgc: leading-lone-slashXQ */

relativePathExpr            : stepExpr ((SLASH | DOUBLESLASH) stepExpr)*;

stepExpr                    : filterExpr | axisStep;

axisStep                    : (reverseStep | forwardStep) predicateList;

forwardStep                 : (forwardAxis nodeTest) | abbrevForwardStep;


forwardAxis                 : (CHILD | DESCENDANT | ATTRIBUTE | SELF | 
							  DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING) 
							  DOUBLECOLON;


/*forwardAxis                 : (CHILD DOUBLECOLON)
                                | (DESCENDANT DOUBLECOLON)
                                | (ATTRIBUTE DOUBLECOLON)
                                | (SELF DOUBLECOLON)
                                | (DESCENDANT_OR_SELF DOUBLECOLON)
                                | (FOLLOWING_SIBLING DOUBLECOLON)
                                | (FOLLOWING DOUBLECOLON);
*/
abbrevForwardStep           : ATSi? nodeTest;

reverseStep                 : (reverseAxis nodeTest) | abbrevReverseStep;

reverseAxis                 : (PARENT | ANCESTOR | PRECEDING_SIBLING 
								| PRECEDING | ANCESTOR_OR_SELF) 
								DOUBLECOLON;

/*
reverseAxis                 : (PARENT DOUBLECOLON)
                                | (ANCESTOR DOUBLECOLON)
                                | (PRECEDING_SIBLING DOUBLECOLON)
                                | (PRECEDING DOUBLECOLON)
                                | (ANCESTOR_OR_SELF DOUBLECOLON);
*/
abbrevReverseStep           : DOTDOT;

nodeTest                    : kindTest | nameTest;

nameTest                    : qName | wildcard;


/* added syntactic predicate */
wildcard                    : (STARSi COLONSi NCName) => STARSi COLONSi NCName
								|STARSi
                                | (NCName COLONSi STARSi); /* ws: explicitXQ */


filterExpr                  : primaryExpr predicateList;

predicateList               : predicate*;

predicate                   : LEFTBRACKETSi expr RIGHTBRACKETSi;

primaryExpr                 : literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor;

literal                     : numericLiteral | StringLiteral;

numericLiteral              : IntegerLiteral | DecimalLiteral | DoubleLiteral;

varRef                      : DOLLARSi varName;

varName                     : qName;

parenthesizedExpr           : LEFTPARENTHESISSi expr? RIGHTPARENTHESISSi;

contextItemExpr             : DOT;

orderedExpr                 : ORDERED LEFTBRACESi expr RIGHTBRACESi;

unorderedExpr               : UNORDERED LEFTBRACESi expr RIGHTBRACESi;

functionCall                : qName LEFTPARENTHESISSi (exprSingle (COMMASi exprSingle)*)? RIGHTPARENTHESISSi; /* xgc: reserved-function-namesXQ */
                                                                                /* gn: parensXQ */

constructor                 : directConstructor
                                | computedConstructor;

directConstructor           : dirElemConstructor
                                | dirCommentConstructor
                                | dirPIConstructor;

dirElemConstructor          : LESSTHANSi qName dirAttributeList (RIGHTSELFTERMINATOR | (BIGGERTHANSi dirElemContent* LEFTENDTAG qName S? BIGGERTHANSi)); /* ws: explicitXQ */

dirAttributeList            : (S (qName S? EQUALSi S? dirAttributeValue)?)*; /* ws: explicitXQ */

dirAttributeValue           : (DOUBLEQUOTESi (EscapeQuot | quotAttrValueContent)* DOUBLEQUOTESi)
                                | (SINGLEQUOTE (EscapeApos | aposAttrValueContent)* SINGLEQUOTE); /* ws: explicitXQ */

quotAttrValueContent	    : QuotAttrContentChar
                                | commonContent;

aposAttrValueContent        : AposAttrContentChar
                                | commonContent;

dirElemContent              : directConstructor
                                | cDataSection
                                | commonContent
                                | ElementContentChar;

commonContent               : PredefinedEntityRef | CharRef | DOUBLELEFTBRACES | DOUBLERIGHTBRACES | enclosedExpr;

dirCommentConstructor       : LEFTXMLCOMMENT dirCommentContents RIGHTXMLCOMMENT; /* ws: explicitXQ */


//dirCommentContents          : ((Char ~ '-') | ('-' (Char ~ '-')))*; /* ws: explicitXQ */

//--------------------------------------- New ------------------------------------------------
dirCommentContents             : (charNotMinus | (MINUSSi charNotMinus))*; /* ws: explicitXQ */ 
//--------------------------------------- weN ------------------------------------------------

dirPIConstructor            : LEFTPITARGET piTarget (S dirPIContents)? RIGHTPITARGET; /* ws: explicitXQ */


//DirPIContents               : (Char* ~ (Char* '?>' Char*)); /* ws: explicitXQ */

//--------------------------------------- New ------------------------------------------------
dirPIContents               : m=ZeroOrMoreChar{ !$m.getText().contains("?>") }?  ;
//--------------------------------------- weN ------------------------------------------------

cDataSection                : LEFTCDATA cDataSectionContents RIGHTCDATA; /* ws: explicitXQ */



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

compDocConstructor          : DOCUMENT LEFTBRACESi expr RIGHTBRACESi;

compElemConstructor         : ELEMENT (qName | (LEFTBRACESi expr RIGHTBRACESi)) LEFTBRACESi contentExpr? RIGHTBRACESi;

contentExpr                 : expr;

compAttrConstructor         : ATTRIBUTE (qName | (LEFTBRACESi expr RIGHTBRACESi)) LEFTBRACESi expr? RIGHTBRACESi;

compTextConstructor         : TEXT LEFTBRACESi expr RIGHTBRACESi;

compCommentConstructor      : COMMENT LEFTBRACESi expr RIGHTBRACESi;

compPIConstructor           : PROCESSING_INSTRUCTION (NCName | (LEFTBRACESi expr RIGHTBRACESi)) LEFTBRACESi expr? RIGHTBRACESi;

singleType                  : atomicType QUESTIONMARKSi?;

typeDeclaration             : AS sequenceType;

sequenceType                : (EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi)
                                | (itemType occurrenceIndicator?);

occurrenceIndicator         : QUESTIONMARKSi | STARSi | PLUSSi; /* xgc: occurrence-indicatorsXQ */

itemType                    : kindTest | (ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi) | atomicType;

atomicType                  : qName;

kindTest                    : documentTest
                                | elementTest
                                | attributeTest
                                | schemaElementTest
                                | schemaAttributeTest
                                | piTest
                                | commentTest
                                | textTest
                                | anyKindTest;

anyKindTest                 : NODE LEFTPARENTHESISSi RIGHTPARENTHESISSi;

documentTest                : DOCUMENTNODE LEFTPARENTHESISSi (elementTest | schemaElementTest)? RIGHTPARENTHESISSi;

textTest                    : TEXT LEFTPARENTHESISSi RIGHTPARENTHESISSi;

commentTest                 : COMMENT LEFTPARENTHESISSi RIGHTPARENTHESISSi;

piTest                      : PROCESSING_INSTRUCTION LEFTPARENTHESISSi (NCName | StringLiteral)? RIGHTPARENTHESISSi;

attributeTest               : ATTRIBUTE LEFTPARENTHESISSi (attribNameOrWildcard (COMMASi typeName)?)? RIGHTPARENTHESISSi;

attribNameOrWildcard        : attributeName | STARSi;

schemaAttributeTest         : SCHEMAATTRIBUTE LEFTPARENTHESISSi attributeDeclaration RIGHTPARENTHESISSi;

attributeDeclaration        : attributeName;

elementTest                 : ELEMENT LEFTPARENTHESISSi (elementNameOrWildcard (COMMASi typeName QUESTIONMARKSi?)?)? RIGHTPARENTHESISSi;

elementNameOrWildcard       : elementName | STARSi;

schemaElementTest           : SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi;

elementDeclaration          : elementName;

attributeName               : qName;

elementName                 : qName;

typeName                    : qName;

uriLiteral                  : StringLiteral;

ftSelection                 : ftOr ftPosFilter* (WEIGHT rangeExpr)?;

ftOr                        : ftAnd ( FTOR ftAnd )*;

ftAnd                       : ftMildNot ( FTAND ftMildNot )*;

ftMildNot                   : ftUnaryNot ( NOT IN ftUnaryNot )*;

ftUnaryNot                  : (FTNOT)? ftPrimaryWithOptions;

ftPrimaryWithOptions        : ftPrimary ftMatchOptions?;

ftPrimary                   : (ftWords ftTimes?) | (LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi) | ftExtensionSelection;

ftWords                     : ftWordsValue ftAnyallOption?;

ftWordsValue                : literal | (LEFTBRACESi expr RIGHTBRACESi);

ftExtensionSelection        : pragma+ LEFTBRACESi ftSelection? RIGHTBRACESi;

ftAnyallOption              : (ANY WORD?) | (ALL WORDS?) | PHRASE;

ftTimes                     : OCCURS ftRange TIMES;


ftRange                     : (EXACTLY additiveExpr)
                                | (AT LEAST additiveExpr)
                                | (AT MOST additiveExpr)
                                | (FROM additiveExpr TO additiveExpr);

ftPosFilter                 : ftOrder | ftWindow | ftDistance | ftScope | ftContent;

ftOrder                     : ORDERED;

ftWindow                    : WINDOW additiveExpr ftUnit;

ftDistance                  : DISTANCE ftRange ftUnit;

ftUnit                      : WORDS | SENTENCES | PARAGRAPHS;

ftScope                     : (SAME | DIFFERENT) ftBigUnit;

ftBigUnit                   : SENTENCE | PARAGRAPH;

ftContent                   : (AT START) | (AT END) | (ENTIRE CONTENT);

ftMatchOptions              : ftMatchOption+;     /* xgc: multiple-match-options */

ftMatchOption               : ftLanguageOption
                                | ftWildCardOption
                                | ftThesaurusOption
                                | ftStemOption
                                | ftCaseOption
                                | ftDiacriticsOption
                                | ftStopwordOption
                                | ftExtensionOption;

ftCaseOption                : (CASE INSENSITIVE)
                                | (CASE SENSITIVE)
                                | LOWERCASE
                                | UPPERCASE;

ftDiacriticsOption          : (DIACRITICS INSENSITIVE)
                                | (DIACRITICS SENSITIVE);

ftStemOption                : (WITH STEMMING) | (WITHOUT STEMMING);

ftThesaurusOption	        : (WITH THESAURUS (ftThesaurusID | DEFAULT))
                                | (WITH THESAURUS LEFTPARENTHESISSi (ftThesaurusID | DEFAULT) (COMMASi ftThesaurusID)* RIGHTPARENTHESISSi)
                                | (WITHOUT THESAURUS);

ftThesaurusID               : AT uriLiteral (RELATIONSHIP StringLiteral)? (ftRange LEVELS)?;

ftStopwordOption            : (WITH STOP WORDS ftRefOrList ftInclExclStringLiteral*)
                                | (WITHOUT STOP WORDS)
                                | (WITH DEFAULT STOP WORDS ftInclExclStringLiteral*);

ftRefOrList                 : (AT uriLiteral)
                                | (LEFTPARENTHESISSi StringLiteral (COMMASi StringLiteral)* RIGHTPARENTHESISSi);

ftInclExclStringLiteral     : (UNION | EXCEPT) ftRefOrList;
ftLanguageOption            : LANGUAGE StringLiteral;
ftWildCardOption            : (WITH WILDCARDS) | (WITHOUT WILDCARDS);
ftExtensionOption           : OPTION qName StringLiteral;
ftIgnoreOption              : WITHOUT CONTENT unionExpr;
