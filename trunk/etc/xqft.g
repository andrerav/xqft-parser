lexer grammar xqft;

@parser::header {
	//package no.ntnu.xqft.parse;
	//import no.ntnu.xqft.lex.*;
}
@lexer::header {
	//package no.ntnu.xqft.lex;
	//import no.ntnu.xqft.parse.*;
}

@members {
	
}
/* Lexer */
/* See http://www.w3.org/TR/xquery-full-text/#grammar-terminals */
IntegerLiteral      : Digits;
DecimalLiteral      : ('.' Digits) | (Digits '.' ('0'..'9')*);
DoubleLiteral       : (('.' Digits) | (Digits ('.' ('0'..'9')*)?)) ('e'|'E') ('+'|'-')? Digits;
StringLiteral	    : ('"' (PredefinedEntityRef | CharRef | EscapeQuot | ~('"'|'&'))* '"') | ('\'' (PredefinedEntityRef | CharRef | EscapeApos | ~('\''|'&'))* '\'');
PredefinedEntityRef : '&' ('lt' | 'gt' | 'amp' | 'quot' | 'apos') ';';
EscapeQuot          : '""';
EscapeApos          : '\'''\'';
ElementContentChar	: Char ~ ('{'|'}'|'<'|'&');
QuotAttrContentChar	: Char ~ ('"'|'{'|'}'|'<'|'&');
AposAttrContentChar	: Char ~ ('\''|'{'|'}'|'<'|'&');
Comment             :'(:' (CommentContents | Comment)* ':)';

NameChar            : Letter | Digit | '.' | '-' | '_' | ':' | CombiningChar | Extender;
Name                : (Letter | '_' | ':') (NameChar)*;
Names               : Name ('\u0020' Name)*;
Nmtoken             : (NameChar)+;
Nmtokens            : Nmtoken (#x20 Nmtoken)*;

/* See: http://www.w3.org/TR/REC-xml/#NT-PITarget */
PI                  : '<?' PITarget (S (Char* ~ (Char* '?>' Char*)))? '?>';
PITarget            : Name ~ (('X' | 'x') ('M' | 'm') ('L' | 'l'));

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
NCNameChar          : NameChar ~ ':';
NCNameStartChar     : Letter | '_';

/* See: http://www.w3.org/TR/REC-xml/#NT-S */
S                   : ('\u0020' | '\u0009' | '\u000D' | '\u000A')+;

/* See: http://www.w3.org/TR/xquery-full-text/#prod-xquery-Char */
Char                : '\u0009' | '\u000A' | '\u000D' | ('\u0020'..'\uD7FF') | ('\uE000'..'\uFFFD'); /* Dropped temporarily | [\u10000-\u10FFFF] */

/* See http://www.w3.org/TR/xquery-full-text/#prod-xquery-Digits */
Digits              : ('0'..'9')+;
CommentContents     : (Char+ ~ (Char* ('(:' | ':)') Char*));




/* Parser */
Module                      : VersionDecl? (LibraryModule | MainModule);

VersionDecl                 : 'xquery' 'version' StringLiteral (('encoding' StringLiteral)|) Separator;

MainModule                  : Prolog QueryBody;

LibraryModule               : ModuleDecl Prolog;

ModuleDecl                  : 'module' 'namespace' NCName '=' URILiteral Separator;

Prolog                      : ((DefaultNamespaceDecl | Setter | NamespaceDecl | Import) Separator)* ((VarDecl | FunctionDecl | OptionDecl | FTOptionDecl) Separator)*;

Setter                      : BoundarySpaceDecl | DefaultCollationDecl | BaseURIDecl | ConstructionDecl | OrderingModeDecl | EmptyOrderDecl | CopyNamespacesDecl;

Import                      : SchemaImport | ModuleImport;

Separator                   : ';';

NamespaceDecl               : 'declare' 'namespace' NCName '=' URILiteral;

BoundarySpaceDecl           : 'declare' 'boundary-space' ('preserve' | 'strip');

DefaultNamespaceDecl        : 'declare' 'default' ('element' | 'function') 'namespace' URILiteral;

OptionDecl                  : 'declare' 'option' QName StringLiteral;

FTOptionDecl                : 'declare' 'ft-option' FTMatchOptions;

OrderingModeDecl            : 'declare' 'ordering' ('ordered' | 'unordered');

EmptyOrderDecl              : 'declare' 'default' 'order' 'empty' ('greatest' | 'least');

CopyNamespacesDecl          : 'declare' 'copy-namespaces' PreserveMode ',' InheritMode;

PreserveMode                : 'preserve' | 'no-preserve';

InheritMode                 : 'inherit' | 'no-inherit';

DefaultCollationDecl        : 'declare' 'default' 'collation' URILiteral;

BaseURIDecl                 : 'declare' 'base-uri' URILiteral;

SchemaImport                : 'import' 'schema' SchemaPrefix? URILiteral ('at' URILiteral (',' URILiteral)*)?;

SchemaPrefix                : ('namespace' NCName '=') | ('default' 'element' 'namespace');

ModuleImport                : 'import' 'module' ('namespace' NCName '=')? URILiteral ('at' URILiteral (',' URILiteral)*)?;

VarDecl                     : 'declare' 'variable' '$' QName TypeDeclaration? ((':=' ExprSingle) | 'external');

ConstructionDecl            : 'declare' 'construction' ('strip' | 'preserve');

FunctionDecl                : 'declare' 'function' QName '(' ParamList? ')' ('as' SequenceType)? (EnclosedExpr | 'external');

ParamList                   : Param (',' Param)*;

Param                       : '$' QName TypeDeclaration?;

EnclosedExpr                : '{' Expr '}';

QueryBody                   : Expr;

Expr                        : ExprSingle (',' ExprSingle)*;

ExprSingle                  : FLWORExpr
                                | QuantifiedExpr
                                | TypeswitchExpr
                                | IfExpr
                                | OrExpr;

FLWORExpr                   : (ForClause | LetClause)+ WhereClause? OrderByClause? 'return' ExprSingle;

ForClause                   : 'for' '$' VarName TypeDeclaration? PositionalVar? FTScoreVar? 'in' ExprSingle (',' '$' VarName TypeDeclaration? PositionalVar? FTScoreVar? 'in' ExprSingle)*;

PositionalVar               : 'at' '$' VarName;

FTScoreVar                  : 'score' '$' VarName;

LetClause                   : (('let' '$' VarName TypeDeclaration?) | ('let' 'score' '$' VarName)) ':=' ExprSingle (',' (('$' VarName TypeDeclaration?) | FTScoreVar) ':=' ExprSingle)*;

WhereClause                 : 'where' ExprSingle;

OrderByClause               : (('order' 'by') | ('stable' 'order' 'by')) OrderSpecList;

OrderSpecList               : OrderSpec (',' OrderSpec)*;

OrderSpec                   : ExprSingle OrderModifier;

OrderModifier               : ('ascending' | 'descending')? ('empty' ('greatest' | 'least'))? ('collation' URILiteral)?;
QuantifiedExpr              : ('some' | 'every') '$' VarName TypeDeclaration? 'in' ExprSingle (',' '$' VarName TypeDeclaration? 'in' ExprSingle)* 'satisfies' ExprSingle;

TypeswitchExpr              : 'typeswitch' '(' Expr ')' CaseClause+ 'default' ('$' VarName)? 'return' ExprSingle;

CaseClause                  : 'case' ('$' VarName 'as')? SequenceType 'return' ExprSingle;

IfExpr                      : 'if' '(' Expr ')' 'then' ExprSingle 'else' ExprSingle;

OrExpr                      : AndExpr ( 'or' AndExpr )*;

AndExpr                     : ComparisonExpr ( 'and' ComparisonExpr )*;

ComparisonExpr              : FTContainsExpr ( (ValueComp
                                | GeneralComp
                                | NodeComp) FTContainsExpr )?;

FTContainsExpr              : RangeExpr ( 'ftcontains' FTSelection FTIgnoreOption? )?;

RangeExpr                   : AdditiveExpr ( 'to' AdditiveExpr )?;

AdditiveExpr                : MultiplicativeExpr ( ('+' | '-') MultiplicativeExpr )*;

MultiplicativeExpr          : UnionExpr ( ('*' | 'div' | 'idiv' | 'mod') UnionExpr )*;

UnionExpr                   : IntersectExceptExpr ( ('union' | '|') IntersectExceptExpr )*;

IntersectExceptExpr         : InstanceofExpr ( ('intersect' | 'except') InstanceofExpr )*;

InstanceofExpr              : TreatExpr ( 'instance' 'of' SequenceType )?;

TreatExpr                   : CastableExpr ( 'treat' 'as' SequenceType )?;

CastableExpr                : CastExpr ( 'castable' 'as' SingleType )?;

CastExpr                    : UnaryExpr ( 'cast' 'as' SingleType )?;

UnaryExpr                   : ('-' | '+')* ValueExpr;

ValueExpr                   : ValidateExpr | PathExpr | ExtensionExpr;

GeneralComp                 : '=' | '!=' | '<' | '<=' | '>' | '>=';

ValueComp                   : 'eq' | 'ne' | 'lt' | 'le' | 'gt' | 'ge';

NodeComp                    : 'is' | '<<' | '>>';

ValidateExpr                : 'validate' ValidationMode? '{' Expr '}';

ValidationMode              : 'lax' | 'strict';

ExtensionExpr               : Pragma+ '{' Expr? '}';

Pragma                      : '(#' S? QName (S PragmaContents)? '#)'; /* ws: explicit */

PragmaContents              : (Char* ~ (Char* '#)' Char*));

PathExpr                    :   	('/' RelativePathExpr?)
                                | ('//' RelativePathExpr)
                                | RelativePathExpr;	/* xgc: leading-lone-slashXQ */

RelativePathExpr            : StepExpr (('/' | '//') StepExpr)*;

StepExpr                    : FilterExpr | AxisStep;

AxisStep                    : (ReverseStep | ForwardStep) PredicateList;

ForwardStep                 : (ForwardAxis NodeTest) | AbbrevForwardStep;

ForwardAxis                 : ('child' '::')
                                | ('descendant' '::')
                                | ('attribute' '::')
                                | ('self' '::')
                                | ('descendant-or-self' '::')
                                | ('following-sibling' '::')
                                | ('following' '::');

AbbrevForwardStep           : '@'? NodeTest;

ReverseStep                 : (ReverseAxis NodeTest) | AbbrevReverseStep;

ReverseAxis                 : ('parent' '::')
                                | ('ancestor' '::')
                                | ('preceding-sibling' '::')
                                | ('preceding' '::')
                                | ('ancestor-or-self' '::');

AbbrevReverseStep           : '..';

NodeTest                    : KindTest | NameTest;

NameTest                    : QName | Wildcard;

Wildcard                    : '*'
                                | (NCName ':' '*')
                                | ('*' ':' NCName); /* ws: explicitXQ */

FilterExpr                  : PrimaryExpr PredicateList;

PredicateList               : Predicate*;

Predicate                   : '[' Expr ']';

PrimaryExpr                 : Literal | VarRef | ParenthesizedExpr | ContextItemExpr | FunctionCall | OrderedExpr | UnorderedExpr | Constructor;

Literal                     : NumericLiteral | StringLiteral;

NumericLiteral              : IntegerLiteral | DecimalLiteral | DoubleLiteral;

VarRef                      : '$' VarName;

VarName                     : QName;

ParenthesizedExpr           : '(' Expr? ')';

ContextItemExpr             : '.';

OrderedExpr                 : 'ordered' '{' Expr '}';

UnorderedExpr               : 'unordered' '{' Expr '}';

FunctionCall                : QName '(' (ExprSingle (',' ExprSingle)*)? ')'; /* xgc: reserved-function-namesXQ */
                                                                                /* gn: parensXQ */

Constructor                 : DirectConstructor
                                | ComputedConstructor;

DirectConstructor           : DirElemConstructor
                                | DirCommentConstructor
                                | DirPIConstructor;

DirElemConstructor          : '<' QName DirAttributeList ('/>' | ('>' DirElemContent* '</' QName S? '>')); /* ws: explicitXQ */
DirAttributeList            : (S (QName S? '=' S? DirAttributeValue)?)*; /* ws: explicitXQ */

DirAttributeValue           : ('"' (EscapeQuot | QuotAttrValueContent)* '"')
                                | ('\'' (EscapeApos | AposAttrValueContent)* '\''); /* ws: explicitXQ */

QuotAttrValueContent	    : QuotAttrContentChar
                                | CommonContent;

AposAttrValueContent        : AposAttrContentChar
                                | CommonContent;

DirElemContent              : DirectConstructor
                                | CDataSection
                                | CommonContent
                                | ElementContentChar;

CommonContent               : PredefinedEntityRef | CharRef | '{{' | '}}' | EnclosedExpr;

DirCommentConstructor       : '<!--' DirCommentContents '-->'; /* ws: explicitXQ */

DirCommentContents          : ((Char ~ '-') | ('-' (Char ~ '-')))*; /* ws: explicitXQ */

DirPIConstructor            : '<?' PITarget (S DirPIContents)? '?>'; /* ws: explicitXQ */

DirPIContents               : (Char* ~ (Char* '?>' Char*)); /* ws: explicitXQ */

CDataSection                : '<![CDATA[' CDataSectionContents ']]>'; /* ws: explicitXQ */

CDataSectionContents        : (Char* ~ (Char* ']]>' Char*)); /* ws: explicitXQ */

ComputedConstructor         : CompDocConstructor
                                | CompElemConstructor
                                | CompAttrConstructor
                                | CompTextConstructor
                                | CompCommentConstructor
                                | CompPIConstructor;

CompDocConstructor          : 'document' '{' Expr '}';

CompElemConstructor         : 'element' (QName | ('{' Expr '}')) '{' ContentExpr? '}';

ContentExpr                 : Expr;

CompAttrConstructor         : 'attribute' (QName | ('{' Expr '}')) '{' Expr? '}';

CompTextConstructor         : 'text' '{' Expr '}';

CompCommentConstructor      : 'comment' '{' Expr '}';

CompPIConstructor           : 'processing-instruction' (NCName | ('{' Expr '}')) '{' Expr? '}';

SingleType                  : AtomicType '?'?;

TypeDeclaration             : 'as' SequenceType;

SequenceType                : ('empty-sequence' '(' ')')
                                | (ItemType OccurrenceIndicator?);

OccurrenceIndicator         : '?' | '*' | '+'; /* xgc: occurrence-indicatorsXQ */

ItemType                    : KindTest | ('item' '(' ')') | AtomicType;

AtomicType                  : QName;

KindTest                    : DocumentTest
                                | ElementTest
                                | AttributeTest
                                | SchemaElementTest
                                | SchemaAttributeTest
                                | PITest
                                | CommentTest
                                | TextTest
                                | AnyKindTest;

AnyKindTest                 : 'node' '(' ')';

DocumentTest                : 'document-node' '(' (ElementTest | SchemaElementTest)? ')';

TextTest                    : 'text' '(' ')';

CommentTest                 : 'comment' '(' ')';

PITest                      : 'processing-instruction' '(' (NCName | StringLiteral)? ')';

AttributeTest               : 'attribute' '(' (AttribNameOrWildcard (',' TypeName)?)? ')';

AttribNameOrWildcard        : AttributeName | '*';

SchemaAttributeTest         : 'schema-attribute' '(' AttributeDeclaration ')';

AttributeDeclaration        : AttributeName;

ElementTest                 : 'element' '(' (ElementNameOrWildcard (',' TypeName '?'?)?)? ')';

ElementNameOrWildcard       : ElementName | '*';

SchemaElementTest           : 'schema-element' '(' ElementDeclaration ')';

ElementDeclaration          : ElementName;

AttributeName               : QName;

ElementName                 : QName;

TypeName                    : QName;

URILiteral                  : StringLiteral;

FTSelection                 : FTOr FTPosFilter* ('weight' RangeExpr)?;

FTOr                        : FTAnd ( 'ftor' FTAnd )*;

FTAnd                       : FTMildNot ( 'ftand' FTMildNot )*;

FTMildNot                   : FTUnaryNot ( 'not' 'in' FTUnaryNot )*;

FTUnaryNot                  : ('ftnot')? FTPrimaryWithOptions;

FTPrimaryWithOptions        : FTPrimary FTMatchOptions?;

FTPrimary                   : (FTWords FTTimes?) | ('(' FTSelection ')') | FTExtensionSelection;

FTWords                     : FTWordsValue FTAnyallOption?;

FTWordsValue                : Literal | ('{' Expr '}');

FTExtensionSelection        : Pragma+ '{' FTSelection? '}';

FTAnyallOption              : ('any' 'word'?) | ('all' 'words'?) | 'phrase';

FTTimes                     : 'occurs' FTRange 'times';


FTRange                     : ('exactly' AdditiveExpr)
                                | ('at' 'least' AdditiveExpr)
                                | ('at' 'most' AdditiveExpr)
                                | ('from' AdditiveExpr 'to' AdditiveExpr);

FTPosFilter                 : FTOrder | FTWindow | FTDistance | FTScope | FTContent;

FTOrder                     : 'ordered';

FTWindow                    : 'window' AdditiveExpr FTUnit;

FTDistance                  : 'distance' FTRange FTUnit;

FTUnit                      : 'words' | 'sentences' | 'paragraphs';

FTScope                     : ('same' | 'different') FTBigUnit;

FTBigUnit                   : 'sentence' | 'paragraph';

FTContenT                   : ('at' 'start') | ('at' 'end') | ('entire' 'content');

FTMatchOptions              : FTMatchOption+;     /* xgc: multiple-match-options */

FTMatchOption               : FTLanguageOption
                                | FTWildCardOption
                                | FTThesaurusOption
                                | FTStemOption
                                | FTCaseOption
                                | FTDiacriticsOption
                                | FTStopwordOption
                                | FTExtensionOption;

FTCaseOption                : ('case' 'insensitive')
                                | ('case' 'sensitive')
                                | 'lowercase'
                                | 'uppercase';

FTDiacriticsOption          : ('diacritics' 'insensitive')
                                | ('diacritics' 'sensitive');

FTStemOptioN                : ('with' 'stemming') | ('without' 'stemming');

FTThesaurusOption	        : ('with' 'thesaurus' (FTThesaurusID | 'default'))
                                | ('with' 'thesaurus' '(' (FTThesaurusID | 'default') (',' FTThesaurusID)* ')')
                                | ('without' 'thesaurus');

FTThesaurusID               : 'at' URILiteral ('relationship' StringLiteral)? (FTRange 'levels')?;

FTStopwordOption            : ('with' 'stop' 'words' FTRefOrList FTInclExclStringLiteral*)
                                | ('without' 'stop' 'words')
                                | ('with' 'default' 'stop' 'words' FTInclExclStringLiteral*);

FTRefOrList                 : ('at' URILiteral)
                                | ('(' StringLiteral (',' StringLiteral)* ')');

FTInclExclStringLiteral     : ('union' | 'except') FTRefOrList;
FTLanguageOption            : 'language' StringLiteral;
FTWildCardOption            : ('with' 'wildcards') | ('without' 'wildcards');
FTExtensionOption           : 'option' QName StringLiteral;
FTIgnoreOption              : 'without' 'content' UnionExpr;
