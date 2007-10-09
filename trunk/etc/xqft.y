/**
 * Copyright (c) 2007 Andreas Ravnestad, Mads Nyborg, 
 *                    Norwegian University of Science and Technology (NTNU),
 *                    Fast Search & Transfer
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the university nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY ITS COPYRIGHT HOLDERS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/* CUP specification for an XQuery parser with fulltext extensions */
/* TODO: This is just a temporary specification as of yet */
package no.ntnu.xqft.parse;

/* Imports */
import java_cup.runtime.*;
import java.util.*;
import no.ntnu.xqft.lex.*;

/* Terminals (tokens returned by the scanner). */
terminal String PLUS, MINUS, DQUOTE, CHARACTER;
terminal String WORD, NUMBER, DECIMAL;

/* Non-terminals */
non terminal Module, VersionDecl, VersionDeclOpt, MainModule, LibraryModule, ModuleDecl, Prolog, Setter;


/* EBNF */

// Module                      ::= VersionDecl? (LibraryModule | MainModule);               /*Original */
Module                      ::= VersionDeclOpt LibraryModule | VersionDeclOpt MainModule;   /* New */
VersionDeclOpt              ::= VersionDecl | ;                                             /* New */


// VersionDecl                 ::= "xquery" "version" StringLiteral (("encoding" StringLiteral)|) Separator; /* Original */
VersionDecl                 ::= "xquery" "version" StringLiteral VersionDeclEncoding Separator; /* New */
VersionDeclEncoding         ::= "encoding" StringLiteral |;                                     /* New */


MainModule                  ::= Prolog QueryBody;

LibraryModule               ::= ModuleDecl Prolog;

ModuleDecl                  ::= "module" "namespace" NCName "=" URILiteral Separator;

//Prolog                      ::= ((DefaultNamespaceDecl | Setter | NamespaceDecl | Import) Separator)* ((VarDecl | FunctionDecl | OptionDecl | FTOptionDecl) Separator)*; /* Original */
Prolog                      ::= NamespaceDeclList VarDeclList | NamespaceDeclList | VarDeclList | ;

NamespaceDeclList           ::= NamespaceDeclList NamespaceDeclListItem Separator | NamespaceDeclListItem;
NamespaceDeclListItem       ::= DefaultNamespaceDecl | Setter | NamespaceDecl | Import;

VarDeclList                 ::= VarDeclList VarDeclListItem Separator | VarDeclListItem;
VarDeclListItem             ::= VarDecl | FunctionDecl | OptionDecl | FTOptionDecl;

Setter                      ::= BoundarySpaceDecl | DefaultCollationDecl | BaseURIDecl | ConstructionDecl | OrderingModeDecl | EmptyOrderDecl | CopyNamespacesDecl;

Import                      ::= SchemaImport | ModuleImport;

Separator                   ::= ";";

NamespaceDecl               ::= "declare" "namespace" NCName "=" URILiteral;

BoundarySpaceDecl           ::= "declare" "boundary-space" ("preserve" | "strip");

DefaultNamespaceDecl        ::= "declare" "default" ("element" | "function") "namespace" URILiteral;

OptionDecl                  ::= "declare" "option" QName StringLiteral;

FTOptionDecl                ::= "declare" "ft-option" FTMatchOptions;

OrderingModeDecl            ::= "declare" "ordering" ("ordered" | "unordered");

EmptyOrderDecl              ::= "declare" "default" "order" "empty" ("greatest" | "least");

CopyNamespacesDecl          ::= "declare" "copy-namespaces" PreserveMode "," InheritMode;

PreserveMode                ::= "preserve" | "no-preserve";

InheritMode                 ::= "inherit" | "no-inherit";

DefaultCollationDecl        ::= "declare" "default" "collation" URILiteral;

BaseURIDecl                 ::= "declare" "base-uri" URILiteral;

SchemaImport                ::= "import" "schema" SchemaPrefix? URILiteral ("at" URILiteral ("," URILiteral)*)?;

SchemaPrefix                ::= ("namespace" NCName "=") | ("default" "element" "namespace");

ModuleImport                ::= "import" "module" ("namespace" NCName "=")? URILiteral ("at" URILiteral ("," URILiteral)*)?;

VarDecl                     ::= "declare" "variable" "$" QName TypeDeclaration? ((":=" ExprSingle) | "external");

ConstructionDecl            ::= "declare" "construction" ("strip" | "preserve");

FunctionDecl                ::= "declare" "function" QName "(" ParamList? ")" ("as" SequenceType)? (EnclosedExpr | "external");

ParamList                   ::= Param ("," Param)*;

Param                       ::= "$" QName TypeDeclaration?;

EnclosedExpr                ::= "{" Expr "}";

QueryBody                   ::= Expr;

Expr                        ::= ExprSingle ("," ExprSingle)*;

ExprSingle                  ::= FLWORExpr
                                | QuantifiedExpr
                                | TypeswitchExpr
                                | IfExpr
                                | OrExpr;

FLWORExpr                   ::= (ForClause | LetClause)+ WhereClause? OrderByClause? "return" ExprSingle;

ForClause                   ::= "for" "$" VarName TypeDeclaration? PositionalVar? FTScoreVar? "in" ExprSingle ("," "$" VarName TypeDeclaration? PositionalVar? FTScoreVar? "in" ExprSingle)*;

PositionalVar               ::= "at" "$" VarName;

FTScoreVar                  ::= "score" "$" VarName;

LetClause                   ::= (("let" "$" VarName TypeDeclaration?) | ("let" "score" "$" VarName)) ":=" ExprSingle ("," (("$" VarName TypeDeclaration?) | FTScoreVar) ":=" ExprSingle)*;

WhereClause                 ::= "where" ExprSingle;

OrderByClause               ::= (("order" "by") | ("stable" "order" "by")) OrderSpecList;

OrderSpecList               ::= OrderSpec ("," OrderSpec)*;

OrderSpec                   ::= ExprSingle OrderModifier;

OrderModifier               ::= ("ascending" | "descending")? ("empty" ("greatest" | "least"))? ("collation" URILiteral)?;
QuantifiedExpr              ::= ("some" | "every") "$" VarName TypeDeclaration? "in" ExprSingle ("," "$" VarName TypeDeclaration? "in" ExprSingle)* "satisfies" ExprSingle;

TypeswitchExpr              ::= "typeswitch" "(" Expr ")" CaseClause+ "default" ("$" VarName)? "return" ExprSingle;

CaseClause                  ::= "case" ("$" VarName "as")? SequenceType "return" ExprSingle;

IfExpr                      ::= "if" "(" Expr ")" "then" ExprSingle "else" ExprSingle;

OrExpr                      ::= AndExpr ( "or" AndExpr )*;

AndExpr                     ::= ComparisonExpr ( "and" ComparisonExpr )*;

ComparisonExpr              ::= FTContainsExpr ( (ValueComp
                                | GeneralComp
                                | NodeComp) FTContainsExpr )?;

FTContainsExpr              ::= RangeExpr ( "ftcontains" FTSelection FTIgnoreOption? )?;

RangeExpr                   ::= AdditiveExpr ( "to" AdditiveExpr )?;

AdditiveExpr                ::= MultiplicativeExpr ( ("+" | "-") MultiplicativeExpr )*;

MultiplicativeExpr          ::= UnionExpr ( ("*" | "div" | "idiv" | "mod") UnionExpr )*;

UnionExpr                   ::= IntersectExceptExpr ( ("union" | "|") IntersectExceptExpr )*;

IntersectExceptExpr         ::= InstanceofExpr ( ("intersect" | "except") InstanceofExpr )*;

InstanceofExpr              ::= TreatExpr ( "instance" "of" SequenceType )?;

TreatExpr                   ::= CastableExpr ( "treat" "as" SequenceType )?;

CastableExpr                ::= CastExpr ( "castable" "as" SingleType )?;

CastExpr                    ::= UnaryExpr ( "cast" "as" SingleType )?;

UnaryExpr                   ::= ("-" | "+")* ValueExpr;

ValueExpr                   ::= ValidateExpr | PathExpr | ExtensionExpr;

GeneralComp                 ::= "=" | "!=" | "<" | "<=" | ">" | ">=";

ValueComp                   ::= "eq" | "ne" | "lt" | "le" | "gt" | "ge";

NodeComp                    ::= "is" | "<<" | ">>";

ValidateExpr                ::= "validate" ValidationMode? "{" Expr "}";

ValidationMode              ::= "lax" | "strict";

ExtensionExpr               ::= Pragma+ "{" Expr? "}";

Pragma                      ::= "(#" S? QName (S PragmaContents)? "#)"; /* ws: explicit */

PragmaContents              ::= (Char* - (Char* '#)' Char*));

PathExpr                    ::=   	("/" RelativePathExpr?)
                                | ("//" RelativePathExpr)
                                | RelativePathExpr;	/* xgc: leading-lone-slashXQ */

RelativePathExpr            ::= StepExpr (("/" | "//") StepExpr)*;

StepExpr                    ::= FilterExpr | AxisStep;

AxisStep                    ::= (ReverseStep | ForwardStep) PredicateList;

ForwardStep                 ::= (ForwardAxis NodeTest) | AbbrevForwardStep;

ForwardAxis                 ::= ("child" "::")
                                | ("descendant" "::")
                                | ("attribute" "::")
                                | ("self" "::")
                                | ("descendant-or-self" "::")
                                | ("following-sibling" "::")
                                | ("following" "::");

AbbrevForwardStep           ::= "@"? NodeTest;

ReverseStep                 ::= (ReverseAxis NodeTest) | AbbrevReverseStep;

ReverseAxis                 ::= ("parent" "::")
                                | ("ancestor" "::")
                                | ("preceding-sibling" "::")
                                | ("preceding" "::")
                                | ("ancestor-or-self" "::");

AbbrevReverseStep           ::= "..";

NodeTest                    ::= KindTest | NameTest;

NameTest                    ::= QName | Wildcard;

Wildcard                    ::= "*"
                                | (NCName ":" "*")
                                | ("*" ":" NCName); /* ws: explicitXQ */

FilterExpr                  ::= PrimaryExpr PredicateList;

PredicateList               ::= Predicate*;

Predicate                   ::= "[" Expr "]";

PrimaryExpr                 ::= Literal | VarRef | ParenthesizedExpr | ContextItemExpr | FunctionCall | OrderedExpr | UnorderedExpr | Constructor;

Literal                     ::= NumericLiteral | StringLiteral;

NumericLiteral              ::= IntegerLiteral | DecimalLiteral | DoubleLiteral;

VarRef                      ::= "$" VarName;

VarName                     ::= QName;

ParenthesizedExpr           ::= "(" Expr? ")";

ContextItemExpr             ::= ".";

OrderedExpr                 ::= "ordered" "{" Expr "}";

UnorderedExpr               ::= "unordered" "{" Expr "}";

FunctionCall                ::= QName "(" (ExprSingle ("," ExprSingle)*)? ")"; /* xgc: reserved-function-namesXQ */
                                                                                /* gn: parensXQ */

Constructor                 ::= DirectConstructor
                                | ComputedConstructor;

DirectConstructor           ::= DirElemConstructor
                                | DirCommentConstructor
                                | DirPIConstructor;

DirElemConstructor          ::= "<" QName DirAttributeList ("/>" | (">" DirElemContent* "</" QName S? ">")); /* ws: explicitXQ */
DirAttributeList            ::= (S (QName S? "=" S? DirAttributeValue)?)*; /* ws: explicitXQ */

DirAttributeValue           ::= ('"' (EscapeQuot | QuotAttrValueContent)* '"')
                                | ("'" (EscapeApos | AposAttrValueContent)* "'"); /* ws: explicitXQ */

QuotAttrValueContent	    ::= QuotAttrContentChar
                                | CommonContent;

AposAttrValueContent        ::= AposAttrContentChar
                                | CommonContent;

DirElemContent              ::= DirectConstructor
                                | CDataSection
                                | CommonContent
                                | ElementContentChar;

CommonContent               ::= PredefinedEntityRef | CharRef | "{{" | "}}" | EnclosedExpr;

DirCommentConstructor       ::= "<!--" DirCommentContents "-->"; /* ws: explicitXQ */

DirCommentContents          ::= ((Char - '-') | ('-' (Char - '-')))*; /* ws: explicitXQ */

DirPIConstructor            ::= "<?" PITarget (S DirPIContents)? "?>"; /* ws: explicitXQ */

DirPIContents               ::= (Char* - (Char* '?>' Char*)); /* ws: explicitXQ */

CDataSection                ::= "<![CDATA[" CDataSectionContents "]]>"; /* ws: explicitXQ */

CDataSectionContents        ::= (Char* - (Char* ']]>' Char*)); /* ws: explicitXQ */

ComputedConstructor         ::= CompDocConstructor
                                | CompElemConstructor
                                | CompAttrConstructor
                                | CompTextConstructor
                                | CompCommentConstructor
                                | CompPIConstructor;

CompDocConstructor          ::= "document" "{" Expr "}";

CompElemConstructor         ::= "element" (QName | ("{" Expr "}")) "{" ContentExpr? "}";

ContentExpr                 ::= Expr;

CompAttrConstructor         ::= "attribute" (QName | ("{" Expr "}")) "{" Expr? "}";

CompTextConstructor         ::= "text" "{" Expr "}";

CompCommentConstructor      ::= "comment" "{" Expr "}";

CompPIConstructor           ::= "processing-instruction" (NCName | ("{" Expr "}")) "{" Expr? "}";

SingleType                  ::= AtomicType "?"?;

TypeDeclaration             ::= "as" SequenceType;

SequenceType                ::= ("empty-sequence" "(" ")")
                                | (ItemType OccurrenceIndicator?);

OccurrenceIndicator         ::= "?" | "*" | "+"; /* xgc: occurrence-indicatorsXQ */

ItemType                    ::= KindTest | ("item" "(" ")") | AtomicType;

AtomicType                  ::= QName;

KindTest                    ::= DocumentTest
                                | ElementTest
                                | AttributeTest
                                | SchemaElementTest
                                | SchemaAttributeTest
                                | PITest
                                | CommentTest
                                | TextTest
                                | AnyKindTest;

AnyKindTest                 ::= "node" "(" ")";

DocumentTest                ::= "document-node" "(" (ElementTest | SchemaElementTest)? ")";

TextTest                    ::= "text" "(" ")";

CommentTest                 ::= "comment" "(" ")";

PITest                      ::= "processing-instruction" "(" (NCName | StringLiteral)? ")";

AttributeTest               ::= "attribute" "(" (AttribNameOrWildcard ("," TypeName)?)? ")";

AttribNameOrWildcard        ::= AttributeName | "*";

SchemaAttributeTest         ::= "schema-attribute" "(" AttributeDeclaration ")";

AttributeDeclaration        ::= AttributeName;

ElementTest                 ::= "element" "(" (ElementNameOrWildcard ("," TypeName "?"?)?)? ")";

ElementNameOrWildcard       ::= ElementName | "*";

SchemaElementTest           ::= "schema-element" "(" ElementDeclaration ")";

ElementDeclaration          ::= ElementName;

AttributeName               ::= QName;

ElementName                 ::= QName;

TypeName                    ::= QName;

URILiteral                  ::= StringLiteral;

FTSelection                 ::= FTOr FTPosFilter* ("weight" RangeExpr)?;

FTOr                        ::= FTAnd ( "ftor" FTAnd )*;

FTAnd                       ::= FTMildNot ( "ftand" FTMildNot )*;

FTMildNot                   ::= FTUnaryNot ( "not" "in" FTUnaryNot )*;

FTUnaryNot                  ::= ("ftnot")? FTPrimaryWithOptions;

FTPrimaryWithOptions        ::= FTPrimary FTMatchOptions?;

FTPrimary                   ::= (FTWords FTTimes?) | ("(" FTSelection ")") | FTExtensionSelection;

FTWords                     ::= FTWordsValue FTAnyallOption?;

FTWordsValue                ::= Literal | ("{" Expr "}");

FTExtensionSelection        ::= Pragma+ "{" FTSelection? "}";

FTAnyallOption              ::= ("any" "word"?) | ("all" "words"?) | "phrase";

FTTimes                     ::= "occurs" FTRange "times";


FTRange                     ::= ("exactly" AdditiveExpr)
                                | ("at" "least" AdditiveExpr)
                                | ("at" "most" AdditiveExpr)
                                | ("from" AdditiveExpr "to" AdditiveExpr);

FTPosFilter                 ::= FTOrder | FTWindow | FTDistance | FTScope | FTContent;

FTOrder                     ::= "ordered";

FTWindow                    ::= "window" AdditiveExpr FTUnit;

FTDistance                  ::= "distance" FTRange FTUnit;

FTUnit                      ::= "words" | "sentences" | "paragraphs";

FTScope                     ::= ("same" | "different") FTBigUnit;

FTBigUnit                   ::= "sentence" | "paragraph";

FTContenT                   ::= ("at" "start") | ("at" "end") | ("entire" "content");

FTMatchOptions              ::= FTMatchOption+;     /* xgc: multiple-match-options */

FTMatchOption               ::= FTLanguageOption
                                | FTWildCardOption
                                | FTThesaurusOption
                                | FTStemOption
                                | FTCaseOption
                                | FTDiacriticsOption
                                | FTStopwordOption
                                | FTExtensionOption;

FTCaseOptioN                ::= ("case" "insensitive")
                                | ("case" "sensitive")
                                | "lowercase"
                                | "uppercase";

FTDiacriticsOption          ::= ("diacritics" "insensitive")
                                | ("diacritics" "sensitive");

FTStemOptioN                ::= ("with" "stemming") | ("without" "stemming");

/*
FTThesaurusOption	        ::= ("with" "thesaurus" (FTThesaurusID | "default"))
                                | ("with" "thesaurus" "(" (FTThesaurusID | "default") ("," FTThesaurusID)* ")")
                                | ("without" "thesaurus");
*/
FTThesaurusOption	        ::= "with" "thesaurus" "default"
				| "with" "thesaurus" FTThesaurusID 
                                | ("with" "thesaurus" "(" (FTThesaurusID | "default") ("," FTThesaurusID)* ")")
                                | ("without" "thesaurus");


/*
FTThesaurusID               ::= "at" URILiteral ("relationship" StringLiteral)? (FTRange "levels")?;
*/
FTThesaurusID               ::= "at" URILiteral 
				|"at" URILiteral "relationship" StringLiteral
				|"at" URILiteral FTRange "levels"
				|"at" URILiteral "relationship" StringLiteral FTRange "levels";
/*
FTStopwordOption            ::= ("with" "stop" "words" FTRefOrList FTInclExclStringLiteral*)
                                | ("without" "stop" "words")
                                | ("with" "default" "stop" "words" FTInclExclStringLiteral*);
*/
FTStopwordOption            ::= "with" "stop" "words" FTRefOrList FTIncExclStringLiteral_l
				| "with" "stop" "words" FTRefOrList 
                                | "without" "stop" "words"
				| "with" "default" "stop" "words" 
                                | "with" "default" "stop" "words" FTIncExclStringLiteral_l;
/* new */
FTIncExclStringLiteral_l    ::= FTIncExclStringLiteral_l FTInclExclStringLiteral
				| FTInclExclStringLiteral;

/*
FTRefOrList                 ::= ("at" URILiteral)
                                | ("(" StringLiteral ("," StringLiteral)* ")");
*/

FTRefOrList                 ::= "at" URILiteral
				| "(" StringLiteral_l ")";
/* new */
StringLiteral_l		    ::= StringLiteral_l "," StringLiteral  
				| StringLiteral;

/* divided in two, compared to (a |b ) c */
FTInclExclStringLiteral     ::= "union" FTRefOrList
				|"except" FTRefOrList;

FTLanguageOption            ::= "language" StringLiteral;

/* parantesis removed */
FTWildCardOption            ::= "with" "wildcards" | "without" "wildcards";

FTExtensionOption           ::= "option" QName StringLiteral;

FTIgnoreOption              ::= "without" "content" UnionExpr;


/* Grammar (standard BNF) */
/*
query 		::= empty {: RESULT = null; :}
				| term_list:tl {: RESULT = tl; :}
				;

term_list	::= term_list:tl term:t {: tl.getChildren().add(t); RESULT = tl; :} 
				| term:t {: RESULT = new Node(t); :} 
				;

term 		::= plus word:w 	{: RESULT = w; :}
				| minus word:w 	{: RESULT = w; :}
				| word:w 		{: RESULT = w; :}
				| phrase:p 		{: RESULT = p; :}
				;

phrase		::= DQUOTE word_list:wl DQUOTE {: RESULT = wl; :};

word_list	::= word:w {: RESULT = w; :} 
				| word_list:wl word:w {: wl.getChildren().add(w); RESULT = wl; :}
				;

word 		::= WORD:w			{: RESULT = new Node(w, wright); :} 
				| NUMBER:n		{: RESULT = new Node(n, nright); :}
				| DECIMAL:d 	{: RESULT = new Node(d, dright); :}
				| CHARACTER:c 	{: RESULT = new Node(c, cright); :}
				;

plus 		::= PLUS;
minus 		::= MINUS;

empty		::=  ;
*/
