grammar XQFT;

options { 
//filter=true;
  // k = 1;
    output=AST;
    ASTLabelType=XQFTTree;
} 
tokens{
ALL;
ANY;
ANCESTOR;
ANCESTOR_OR_SELF;
AND;
AS;
ASCENDING;
AT;
ATTRIBUTE;
BASE_URI;
BY;
BOUNDARYSPACE;
CASE;
CAST;
CASTABLE;
CHILD;
COLLATION;
COMMENT;
CONSTRUCTION;
CONTENT;
COPY_NAMESPACES;
DECLARE;
DEFAULT;
DESCENDANT;
DESCENDANT_OR_SELF;
DESCENDING;
DIACRITICS;
DIFFERENT;
DISTANCE;
DIV;
DOCUMENT;
DOCUMENT_NODE;
ELEMENT;
ELSE;
ENCODING;
END;
ENTIRE;
EMPTY;
EMPTY_SEQUENCE;
EQ;
EVERY;
EXACTLY;
EXCEPT;
EXTERNAL;
FOLLOWING;
FOLLOWING_SIBLING;
FOR;
FROM;
FTAND;
FTCONTAINS;
FTNOT;
FTOPTION;
FTOR;
FUNCTION;
GE;
GREATEST;
GT;
IDIV;
IF;
IMPORT;
IN;
INHERIT;
INSENSITIVE;
INSTANCE;
INTERSECT;
IS;
ITEM;
LANGUAGE;
LAX;
LE;
LEAST;
LET;
LEVELS;
LOWERCASE;
LT;
MOD;
MODULE;
MOST;
NAMESPACE;
NE;
NODE;
NOINHERIT;
NOPRESERVE;
NOT;
OCCURS;
OF;
OPTION;
OR;
ORDER;
ORDERED;
ORDERING;
PARAGRAPH;
PARAGRAPHS;
PARENT;
PHRASE;
PRECEDING;
PRECEDING_SIBLING;
PRESERVE;
PROCESSING_INSTRUCTION;
RELATIONSHIP;
RETURN;
SAME;
SATISFIES;
SCHEMA;
SCHEMAATTRIBUTE;
SCHEMAELEMENT;
SCORE;
SELF;
SENSITIVE;
SENTENCES;
SENTENCE;
SOME;
STABLE;
START;
STEMMING;
STOP;
STRICT;
STRIP;
TEXT;
THESAURUS;
THEN;
TIMES;
TO;
TREAT;
TYPESWITCH;
UNION;
UNORDERED;
UPPERCASE;
VALIDATE;
VARIABLE;
VERSION;
WEIGHT;
WHERE;
WILDCARDS;
WINDOW;
WITH;
WITHOUT;
WORD;
WORDS;
XQUERY;

/* Imaginary tokens */
AST_FLWOR;
AST_FORCLAUSE;
AST_LETCLAUSE;
AST_ORDERBYCLAUSE;
AST_WHERECLAUSE;
AST_RETURNCLAUSE;
AST_QUANTIFIEDEXPR;
AST_TYPESWITCHEXPR;
AST_CASECLAUSE;
AST_IFEXPR;
AST_FTSELECTION;
AST_FTPOSFILTER;
AST_FUNCTIONCALL;

AST_DIRELEMCONSTRUCTOR;
AST_DIRELEMCONTENT;


}

@parser::header {
	package no.ntnu.xqft.parse;
}

@lexer::header {
	package no.ntnu.xqft.parse;	
}

@parser::members {
	
	/* Root scope */
	//Scope currentScope = new Scope();	   // @init-ting her ogsaa
	XQFTLexer lexer;
/*
	public void setTokenStream(TokenStream input) {
				String inputz =  "<html> \n" +                                                   //1
                        "{ \n"+                                                         //2
                        "for \$act in doc(\"hamlet.xml\")//ACT\n" +                      //3
                        "let \$speakers := distinct-values(\$act//SPEAKER)\n"+            //4
                        "return\n"+                                                     //5
                        "<span>\n"+                                                     //6
                        "<h1>{ \$act/TITLE/text() }</h1>\n"+                             //7
                        "<ul>\n"+                                                       //8
                        "{\n"+                                                          //9
                        "for \$speaker in \$speakers\n"+                                  //10
                        "return <li>{ \$speaker }</li>\n"+                               //11
                        "}\n"+                                                          //12
                        "</ul>\n"+                                                      //13
                        "</span>\n"+                                                    //14
                        "}\n"+                                                          //15
                        "</html>\n";                                                    //16
                        	CharStream cs = new ANTLRStringStream(inputz);
		lexer = (XQFTLexer)input.getTokenSource();
		lexer.setCharStream(cs);
		UnbufferedCommonTokenStream tokenz = new UnbufferedCommonTokenStream();
		tokenz.setTokenSource(lexer);
		super.setTokenStream(tokenz);
 	
	}*/
	public void setLexer(XQFTLexer lex)
	{
		this.lexer=lex;
	}

    protected void mismatch(IntStream input, int ttype, BitSet follow)
        throws RecognitionException
    {
        throw new MismatchedTokenException(ttype, input);
    }

    public void recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
        throws RecognitionException
    {
        throw e;
    }

}

@rulecatch {
    catch (RecognitionException e) {
        throw e;
    }
}

@lexer::members {
    
    public int state = 0;
    public State stack = new State();		//FLYTTE TIL @init ellernoe?
    
    private int tokenType = -1;										// used to pass type from fragment to fragment in LexLiterals
    private ArrayList<Token> tokens = new ArrayList<Token>();
    
    public void emit(Token token) {
    	this.token = token;
    	tokens.add(token);
    	}
    	
    public Token nextToken() {
    	if(tokens.size() > 0)
    		return tokens.remove(0);
    	super.nextToken();
    	if ( tokens.size()==0 ) {
    	    return Token.EOF_TOKEN;
    	}
    	return tokens.remove(0);
    	}
    
    public void prepareSubToken(){
    	tokenStartCharIndex = input.index();
    	tokenStartCharPositionInLine = input.getCharPositionInLine();
    	tokenStartLine = input.getLine();
    	text = null;
    }

    protected void mismatch(IntStream input, int ttype, BitSet follow)
        throws RecognitionException
    {
        throw new MismatchedTokenException(ttype, input);
    }

    public void recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
        throws RecognitionException
    {
        throw e;
    }

}

//----------------------------------------------------- Module -------------------------------------------------------

module                     				: versionDecl? (libraryModule | mainModule);

	versionDecl                 			: XQUERY VERSION StringLiteral (ENCODING StringLiteral)? separator;
		separator                   			: SEMICOLONSi;
		
	libraryModule               			: moduleDecl prolog;
		moduleDecl                  			: MODULE NAMESPACE NCName EQSi uriLiteral separator;
			uriLiteral                  			: StringLiteral;
//		prolog# 											: #PAA EGET#
		
	mainModule                  			: prolog queryBody;
//		prolog#									: #PAA EGET#
		queryBody                   			: expr;
			expr                        			: exprSingle (COMMASi exprSingle)* 
                                                        -> exprSingle+;
//				exprSingle#								: #PAA EGET#
												

//----------------------------------------------------- Prolog ------------------------------------------

prolog                      			: 	(
											(defaultNamespaceDecl | setter | namespaceDecl | importStmt) 
											separator
											)* 
											(
											(varDecl | functionDecl | optionDecl | ftOptionDecl)
											separator
											)*;


defaultNamespaceDecl        			: DECLARE DEFAULT (ELEMENT | FUNCTION) NAMESPACE uriLiteral;

setter                      			: boundarySpaceDecl 
										| defaultCollationDecl 
										| baseURIDecl 
										| constructionDecl 
										| orderingModeDecl 
										| emptyOrderDecl 
										| copyNamespacesDecl;
	boundarySpaceDecl           			: DECLARE BOUNDARYSPACE (PRESERVE | STRIP);
	defaultCollationDecl        			: DECLARE DEFAULT COLLATION uriLiteral;
	baseURIDecl                 			: DECLARE BASE_URI uriLiteral;
	constructionDecl            			: DECLARE CONSTRUCTION (STRIP | PRESERVE);
	orderingModeDecl           				: DECLARE ORDERING (ORDERED | UNORDERED);
	emptyOrderDecl              			: DECLARE DEFAULT ORDER EMPTY (GREATEST | LEAST);
	copyNamespacesDecl          			: DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode;
		preserveMode                			: PRESERVE | NOPRESERVE;
		inheritMode                 			: INHERIT | NOINHERIT;	
		
namespaceDecl               			: DECLARE NAMESPACE NCName EQSi uriLiteral;

importStmt                  			: schemaImport | moduleImport;
	schemaImport                			: IMPORT SCHEMA schemaPrefix? uriLiteral (AT uriLiteral (COMMASi uriLiteral)*)?;
		schemaPrefix                			: (NAMESPACE NCName EQSi) | (DEFAULT ELEMENT NAMESPACE);
	moduleImport                			: IMPORT MODULE (NAMESPACE NCName EQSi)? uriLiteral (AT uriLiteral (COMMASi uriLiteral)*)?;
	
varDecl                     			: DECLARE VARIABLE DOLLARSi qName typeDeclaration? ((ASSIGNSi exprSingle) | EXTERNAL);
	qName returns [String text]			    : (nc1=NCName c=COLONSi)? nc2=NCName { $text = $nc2.text + ($c != null ? $c.text + $nc1.text : ""); };
	typeDeclaration             			: AS sequenceType;
//		sequenceType# 							: #PAA EGET#
//	exprSingle# 							: #PAA EGET#
	
functionDecl                			: DECLARE FUNCTION qName LPARSi paramList? RPARSi 
											(AS sequenceType)? (enclosedExpr | EXTERNAL);
	paramList                   			: param (COMMASi param)*;
		param                       			: DOLLARSi qName typeDeclaration?;
//			qName						 			: (NCName COLONSi)? NCName;	  
//			typeDeclaration             			: AS sequenceType;	 
//	sequenceType# 							: #PAA EGET#

// TODO: enter/exit new scope
	enclosedExpr                			: 
												LBRACESi! //{Scope parent = this.currentScope; this.currentScope = new Scope(); this.currentScope.setParent(parent); }
												expr 
												RBRACSi! //{ this.currentScope = this.currentScope.getParent(); }
											;

//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle# 							: #PAA EGET#
			
optionDecl                  			: DECLARE OPTION qName StringLiteral;

ftOptionDecl                			: DECLARE FTOPTION ftMatchOptions;
	ftMatchOptions              			: ftMatchOption+;     					/* xgc: multiple-match-options */
//		ftMatchOption# 							: #PAA EGET#
	
	
//--------------------------------------------------------- SequenceType -----------------------------------------

sequenceType                			: (itemType occurrenceIndicator) => itemType occurrenceIndicator
										| itemType
										| EMPTY_SEQUENCE LPARSi RPARSi
										;
	itemType                    			: (kindTest | (ITEM LPARSi RPARSi) | atomicType);
		kindTest                    			: documentTest
				                                | elementTest
                				                | attributeTest
                               					| schemaElementTest
				                                | schemaAttributeTest
                				                | piTest
				                                | commentTest
                				                | textTest
                                				| anyKindTest;
			documentTest                			: DOCUMENT_NODE LPARSi (elementTest | schemaElementTest)? RPARSi;
				elementTest  			            	: ELEMENT LPARSi (elementNameOrWildcard (COMMASi typeName QUESTIONSi?)?)? RPARSi;                                				
					elementNameOrWildcard       			: elementName | STARSi;
						elementName                 			: qName;
					typeName                    			: qName;
				schemaElementTest           		 	: SCHEMAELEMENT LPARSi elementDeclaration RPARSi;
					elementDeclaration          			: elementName;
//						elementName                 			: qName; 
//			elementTest                 			: ELEMENT LPARSi (elementNameOrWildcard (COMMASi typeName QUESTIONSi?)?)? RPARSi; //DOBBELT OPP
//				elementNameOrWildcard       			: elementName | STARSi; 
//						elementName                 			: qName; 
//				typeName                    			: qName; 
			attributeTest               			: ATTRIBUTE LPARSi (attribNameOrWildcard (COMMASi typeName)?)? RPARSi;
				attribNameOrWildcard        			: attributeName | STARSi;
					attributeName               			: qName;
//				typeName                    			: qName;
//			schemaElementTest           			: SCHEMAELEMENT LPARSi elementDeclaration RPARSi;
//				elementDeclaration          			: elementName;
//					elementName                 			: qName; 
			schemaAttributeTest         			: SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi;
				attributeDeclaration        			: attributeName;
//					attributeName               			: qName;
			piTest                      			: PROCESSING_INSTRUCTION LPARSi (NCName | StringLiteral)? RPARSi;
			commentTest                 			: COMMENT LPARSi RPARSi;
			textTest                    			: TEXT LPARSi RPARSi;
			anyKindTest                 			: NODE LPARSi RPARSi;
	occurrenceIndicator         			: QUESTIONSi | STARSi | PLUSSi; /* xgc: occurrence-indicatorsXQ */
	
//---------------------------------------------------------- ExprSingle ---------------------------------------------------------

exprSingle                  			: fLWORExpr
                                		| quantifiedExpr
                                		| typeswitchExpr
                                		| ifExpr
                                		| orExpr
                                		;
	fLWORExpr                   			: (fc+=forClause | lc+=letClause)+ whereClause? orderByClause? RETURN exprSingle
                                                -> ^(AST_FLWOR $fc* $lc* whereClause? orderByClause? exprSingle);
	
		forClause                   			: FOR forClauseTupletDef (COMMASi forClauseTupletDef)*
                                                    -> ^(AST_FORCLAUSE forClauseTupletDef+);
            forClauseTupletDef                  : DOLLARSi! varName typeDeclaration? positionalVar? ftScoreVar? IN! exprSingle;

			varName returns [String name]          : qn=qName {$name = $qn.text;};
//			typeDeclaration             			: AS sequenceType;
//				sequenceType# 							: #PAA EGET#
			positionalVar               			: AT DOLLARSi varName;
//				varName                    				: qName; 	
			ftScoreVar                  			: SCORE DOLLARSi varName;
//				varName                    				: qName; 
//			exprSingle# 									: #PAA EGET (DETTE)#
            
		letClause                           : LET varBinding (COMMASi varBinding)*
                                                    -> ^(AST_LETCLAUSE varBinding+);
		varBinding :
			(DOLLARSi v=varName typeDeclaration? | SCORE DOLLARSi v=varName )
            ASSIGNSi exprSingle
            -> SCORE? $v typeDeclaration? exprSingle;


//			varName                    				: qName; 
//			typeDeclaration             			: AS sequenceType;
//				sequenceType# 							: #PAA EGET#
//			exprSingle#								: #PAA EGET (DETTE)#
//			ftScoreVar                  			: SCORE DOLLARSi varName; 
//				varName                    				: qName; 
		
		whereClause                 		: WHERE exprSingle
                                                -> ^(AST_WHERECLAUSE exprSingle);
//			exprSingle#							: #PAA EGET (DETTE)#
			
		orderByClause               		: (ORDER BY | STABLE ORDER BY) orderSpecList
                                                    -> ^(AST_ORDERBYCLAUSE STABLE? orderSpecList);

			orderSpecList               		: orderSpec (COMMASi orderSpec)*
                                                    -> orderSpec+;

				orderSpec                   		: exprSingle orderModifier;
//					exprSingle#							: #PAA EGET (DETTE)#
					orderModifier               		: (ASCENDING | DESCENDING)? (EMPTY (GREATEST | LEAST))? (COLLATION uriLiteral)?;
//						uriLiteral                  		: StringLiteral;
		
//		exprSingle# 						: #PAA EGET (DETTE)#
		

	quantifiedExpr              			: quant=(SOME | EVERY) quantifiedExprTupleDef
												(COMMASi quantifiedExprTupleDef)* SATISFIES exprSingle
                                                -> ^(AST_QUANTIFIEDEXPR $quant quantifiedExprTupleDef+ exprSingle);

        quantifiedExprTupleDef              : DOLLARSi varName typeDeclaration? exprSingle
                                                -> varName typeDeclaration? exprSingle; /* TODO: Add imaginary token? */

//		#SE forClause# :

	typeswitchExpr              			: TYPESWITCH LPARSi expr RPARSi caseClause+ 
												DEFAULT (DOLLARSi varName)? RETURN exprSingle
                                                -> ^(AST_TYPESWITCHEXPR expr caseClause+ varName? exprSingle);

//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle# 							: #PAA EGET (DETTE)#
		caseClause                  			: CASE (DOLLARSi varName AS)? sequenceType RETURN exprSingle
                                                    -> ^(AST_CASECLAUSE varName? sequenceType exprSingle);
//			varName                    				: qName; 
//			sequenceType#							: #PAA EGET#
//			exprSingle# 							: #PAA EGET (DETTE)#
//		varName                    				: qName; 
//		exprSingle# 							: #PAA EGET (DETTE)#
	
	
	ifExpr                      			: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
                                                -> ^(AST_IFEXPR expr exprSingle exprSingle);

//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle#								: #PAA EGET (DETTE)#
//		exprSingle# 								: #PAA EGET (DETTE)#
		
		
	orExpr                      			: andExpr ( OR^ andExpr )*;
		andExpr                     			: comparisonExpr ( AND^ comparisonExpr )*;
//			comparisonExpr# 						: #PAA EGET#
			

//------------------------------------------------------- ComparisonExpr -------------------------------------

comparisonExpr              			: ftContainsExpr ( (valueComp | generalComp | nodeComp)^ ftContainsExpr )?;


	ftContainsExpr              			: rangeExpr ( FTCONTAINS^ ftSelection ftIgnoreOption? )?;
	
		rangeExpr                   			: additiveExpr ( TO^ additiveExpr )?;
			additiveExpr                			: multiplicativeExpr ( (PLUSSi | MINUSSi)^ multiplicativeExpr )*;
				multiplicativeExpr          			: unionExpr ( (STARSi | DIV | IDIV | MOD)^ unionExpr )*;
					unionExpr                   			: intersectExceptExpr ( (UNION | PIPESi)^ intersectExceptExpr )*;
						intersectExceptExpr        				: instanceofExpr ( (INTERSECT | EXCEPT)^ instanceofExpr )*;
							instanceofExpr              			: treatExpr ( INSTANCE^ OF! sequenceType )?;
								treatExpr                   			: castableExpr ( TREAT^ AS! sequenceType )?;
									castableExpr                			: castExpr ( CASTABLE^ AS! singleType )?;
										castExpr                    			: unaryExpr ( CAST^ AS! singleType )?;
											unaryExpr                   			: ((MINUSSi | PLUSSi)*)^ valueExpr;
//												valueExpr# 								: #PAA EGET#
											singleType                  			: atomicType QUESTIONSi?;
												atomicType                  			: qName;
//										singleType                  			: atomicType QUESTIONSi?; 
//											atomicType                  			: qName; 
//									sequenceType# 							: #PAA EGET#	
//								sequenceType# 							: #PAA EGET#		
		
//		ftSelection#								: #PAA EGET#
		
		ftIgnoreOption              			: WITHOUT CONTENT unionExpr;
//			unionExpr#								: #SE DETTE -> ftContainsExpr->rangeExpr->additiveExpr->miltiplicativeExpr->unionExpr#


	valueComp                   			: EQ | NE | LT | LE | GT | GE;


	generalComp                 			: EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi;


	nodeComp                    			: IS | NODEBEFORESi | NODEAFTERSi;

//--------------------------------------------------------- FtSelection ---------------------------------------------

ftSelection                 			: ftOr ftPosFilter* (WEIGHT rangeExpr)?
												-> ^(AST_FTSELECTION ftOr ftPosFilter* ^(WEIGHT rangeExpr)?);
	ftOr                        			: ftAnd ( FTOR^ ftAnd )*;
		ftAnd                       			: ftMildNot ( FTAND^ ftMildNot )*;
			ftMildNot                   			: ftUnaryNot ( NOT^ IN! ftUnaryNot )*;
				ftUnaryNot                  			: (FTNOT^)? ftPrimaryWithOptions;
					ftPrimaryWithOptions        			: ftPrimary ftMatchOptions?;
					
						ftPrimary                   			: ftWords ftTimes? 
																| LPARSi ftSelection RPARSi 
																| ftExtensionSelection
																;
							ftWords                     			: ftWordsValue ftAnyallOption?;
								ftWordsValue                			: literal | (LBRACESi! expr RBRACSi!);
									literal                     			: numericLiteral | StringLiteral;
										numericLiteral              			: IntegerLiteral | DecimalLiteral | DoubleLiteral;
								ftAnyallOption              			: (ANY WORD?) | (ALL WORDS?) | PHRASE;
							ftTimes                     			: OCCURS! ftRange TIMES!;
								ftRange                     			: (EXACTLY additiveExpr)
                        												| (AT LEAST additiveExpr)
                       					 								| (AT MOST additiveExpr)
										                                | (FROM additiveExpr TO additiveExpr);
//									additiveExpr# 							: #SE comparisonExpr (ftContainsExpr -> rangeExpr)#
//							ftSelection# 							: #PAA EGET (DETTE)#
							ftExtensionSelection        			: pragma+ LBRACESi! ftSelection? RBRACSi!;
								pragma                      			: LPRAGSi! qName PragmaContents? RPRAGSi!;
//								ftSelection# 							: #PAA EGET (DETTE)#
								
//						ftMatchOptions              			: ftMatchOption+;     						/* xgc: multiple-match-options */
//							ftMatchOption#							: #SE EGET#
							
							
	ftPosFilter                 			: ftOrder | ftWindow | ftDistance | ftScope | ftContent;
		ftOrder                     			: ORDERED;
		ftWindow                    			: WINDOW additiveExpr ftUnit;
//			additiveExpr# 							: #SE comparisonExpr (ftContainsExpr -> rangeExpr)#
			ftUnit                      			: WORDS | SENTENCES | PARAGRAPHS;	
		ftDistance                  			: DISTANCE ftRange ftUnit;
//			ftRange                     			: (EXACTLY additiveExpr)
//    												| (AT LEAST additiveExpr)
// 					 								| (AT MOST additiveExpr)
//					                                | (FROM additiveExpr TO additiveExpr);
//				additiveExpr# 							: #SE comparisonExpr (ftContainsExpr -> rangeExpr)#
//			ftUnit                      			: WORDS | SENTENCES | PARAGRAPHS;						
		ftScope                     			: (SAME | DIFFERENT) ftBigUnit;
			ftBigUnit                   			: SENTENCE | PARAGRAPH;	
		ftContent                   			: AT START | AT END | ENTIRE CONTENT;		
		
		
//	rangeExpr                   			: additiveExpr ( TO additiveExpr )?;
//		additiveExpr# 							: #SE comparisonExpr (ftContainsExpr -> rangeExpr)#


//-------------------------------------------------------- ftMatchOption ------------------------------------------------------

ftMatchOption               			: ftLanguageOption
		                                | ftWildCardOption
		                                | ftThesaurusOption
		                                | ftStemOption
		                                | ftCaseOption
		                                | ftDiacriticsOption
		                                | ftStopwordOption
		                                | ftExtensionOption;
		                                
		                                	                                
	ftLanguageOption            			: LANGUAGE StringLiteral;
	
	
	ftWildCardOption            			: WITH WILDCARDS | WITHOUT WILDCARDS;
	
	
	ftThesaurusOption	        			: WITH THESAURUS (ftThesaurusID | DEFAULT)
											| WITH THESAURUS LPARSi (ftThesaurusID | DEFAULT) (COMMASi ftThesaurusID)* RPARSi
			                                | WITHOUT THESAURUS
			                                ;
		ftThesaurusID               			: AT uriLiteral (RELATIONSHIP StringLiteral)? (ftRange LEVELS)?;
//			uriLiteral                  			: StringLiteral; 						
//			ftRange                     			: (EXACTLY additiveExpr) 				
//    												| (AT LEAST additiveExpr)				
// 					 								| (AT MOST additiveExpr) 				
//					                                | (FROM additiveExpr TO additiveExpr)
//					                                ;	
//				additiveExpr# 							: #SE comparisonExpr (ftContainsExpr -> rangeExpr)#
				
				
	ftStemOption                			: WITH STEMMING | WITHOUT STEMMING;
	
	
	ftCaseOption                			: CASE INSENSITIVE
			                                | CASE SENSITIVE
			                                | LOWERCASE
			                                | UPPERCASE
			                                ;		  
			                                
			                                                              
	ftDiacriticsOption          			: DIACRITICS INSENSITIVE
											| DIACRITICS SENSITIVE;	
											
																				
	ftStopwordOption            			: WITH STOP WORDS ftRefOrList ftInclExclStringLiteral*
											| WITHOUT STOP WORDS
			                                | WITH DEFAULT STOP WORDS ftInclExclStringLiteral*
			                                ;
		ftRefOrList                 			: (AT uriLiteral)
												| LPARSi StringLiteral (COMMASi StringLiteral)* RPARSi;
//			uriLiteral                  			: StringLiteral; 				//DOBBELT OPP
		ftInclExclStringLiteral     			: (UNION | EXCEPT) ftRefOrList;
		
									
	ftExtensionOption           			: OPTION qName StringLiteral;
	
//---------------------------------------------- ValueExpr ----------------------------------------------------

valueExpr                   			: validateExpr | pathExpr | extensionExpr;


	validateExpr                			: VALIDATE validationMode? LBRACESi! expr RBRACSi!;
		validationMode              			: LAX | STRICT;
//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle#								: #PAA EGET#
			
			
	pathExpr                    			: {input.LA(1)=='/' && input.LA(2)=='/'}? DBLSLASHSi relativePathExpr 
											| {input.LA(2)=='*'}? SLASHSi relativePathExpr
											| SLASHSi
											| relativePathExpr;
		relativePathExpr            			: stepExpr ((SLASHSi | DBLSLASHSi)^ stepExpr)*;

			stepExpr                    			: axisStep
													| filterExpr
													;
//				filterExpr#								: #PAA EGET#
			axisStep                    			: (reverseStep | forwardStep)^ predicateList;
			
				reverseStep                 			: reverseAxis nodeTest | abbrevReverseStep;
					reverseAxis                 			: (PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF) DBLCOLONSi;
					nodeTest                    			: kindTest | nameTest;
//						kindTest#								: #SE sequenceType->itemType->kindTest#
						nameTest                    			: qName | wildcard;
							wildcard                    			: (STARSi COLONSi NCName) => STARSi COLONSi NCName			/* ws: explicitXQ */
																	| STARSi
                                									| NCName COLONSi STARSi; 
                    abbrevReverseStep           			: DOTDOTSi;
                    
                forwardStep                 			: forwardAxis nodeTest | abbrevForwardStep;    
                	forwardAxis                 			: (CHILD | DESCENDANT | ATTRIBUTE | SELF 
                												|DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING) DBLCOLONSi;
//					nodeTest                    			: kindTest | nameTest;
//						kindTest#								: #SE sequenceType->itemType->kindTest#
//						nameTest                    			: qName | wildcard;
//							wildcard                    			: (STARSi COLONSi NCName) => STARSi COLONSi NCName			/* ws: explicitXQ */
//																	| STARSi
//                                									| NCName COLONSi STARSi; 
					abbrevForwardStep           			: ATSi? nodeTest;                	
                
                predicateList               			: predicate*;     									
                	predicate                   			: LBRACKSi! expr RBRACKSi!;
//						expr                        			: exprSingle (COMMASi exprSingle)*
//							exprSingle#								: #PAA EGET#            									
				
    
    extensionExpr               			: pragma+ LBRACESi! expr? RBRACSi!; 
//    	pragma                      			: LPRAGSi qName PragmaContents? RPRAGSi; 
//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle#								: #PAA EGET#            									


//------------------------------------------------------- FilterExpr ---------------------------------------------------------

filterExpr                  			: primaryExpr predicateList;


	primaryExpr                 			: literal 
											| varRef 
											| parenthesizedExpr 
											| contextItemExpr 
											| functionCall 
											| orderedExpr 
											| unorderedExpr 
											| constructor;
		
//		literal                     			: numericLiteral | StringLiteral;
//			numericLiteral              			: IntegerLiteral | DecimalLiteral | DoubleLiteral;
		varRef                      			: DOLLARSi! varName;
//			varName                     			: qName;
		parenthesizedExpr           			: LPARSi! expr? RPARSi!;
//			expr                        			: exprSingle (COMMASi exprSingle)*;
//				exprSingle#								: #PAA EGET#
		contextItemExpr             			: DOTSi;
		functionCall                			: qName LPARSi /* xgc: reserved-function-namesXQ */
													(exprSingle (COMMASi exprSingle)*)? 
													RPARSi
                                                    -> ^(AST_FUNCTIONCALL qName exprSingle+);

//			exprSingle#								: #PAA EGET#
		orderedExpr                 			: ORDERED LBRACESi! expr RBRACSi!;
//			expr                        			: exprSingle (COMMASi exprSingle)*;
//				exprSingle#								: #PAA EGET#
		unorderedExpr               			: UNORDERED LBRACESi! expr RBRACSi!;	
//			expr                        			: exprSingle (COMMASi exprSingle)*;
//				exprSingle#								: #PAA EGET#
		constructor                 			: directConstructor | computedConstructor;	
		
												
			directConstructor           			: dirElemConstructor
					                                | dirCommentConstructor
                									| dirPIConstructor;
                									
            	dirElemConstructor          			: LTSi {lexer.stack.pushState(lexer.state); lexer.state=State.IN_TAG;}
                                                            qn=qName dirAttributeList
                                                            (RSELFTERMSi
                                                                {lexer.state=lexer.stack.pop();}
            										        |  GTSi 
                                                                {lexer.state=State.IN_ELEMENT;}

            												 dirElemContent* 
            												 LENDTAGSi {lexer.state=State.IN_TAG;}
            												 	qName 
            												 	GTSi {lexer.state=lexer.stack.pop();}
            												 	)
                                                            -> ^(AST_DIRELEMCONSTRUCTOR $qn dirAttributeList dirElemContent*);

            		dirAttributeList            			: (qName EQSi dirAttributeValue)*; 
            			dirAttributeValue           			: QUOTSi {lexer.state=State.IN_QUOT_ATTRIBUTE;}
            														(QuotAttributeContent | xmlEnclosedExpr)* 
            													  QUOTSi {lexer.state=State.IN_TAG;}
                												| APOSSi {lexer.state=State.IN_APOS_ATTRIBUTE;}
                													(AposAttributeContent | xmlEnclosedExpr)* 
                												  APOSSi {lexer.state=State.IN_TAG;}; 
        					xmlEnclosedExpr                			: LBRACESi! {lexer.stack.pushState(lexer.state);System.out.println("Pushstate: " +lexer.state); lexer.state=State.DEFAULT;}
        																expr 
        																{lexer.state = lexer.stack.pop(); System.err.println("Setter nå state til " +lexer.state);}
        															  RBRACSi! ;
//        						expr                        			: exprSingle (COMMASi exprSingle)*;
//									exprSingle#								: #PAA EGET#

					dirElemContent              			: dc=directConstructor | cd=cDataSection | ec=ElementContent | xe=xmlEnclosedExpr
                                                                -> ^(AST_DIRELEMCONTENT $dc? $cd? $ec? $xe?);

//						directConstructor#						: #SE filterExpr->primaryExpr->constructor->directConstructor#
						cDataSection							: LCDATASi CDataContents RCDATASi;
//            				enclosedExpr                			: LBRACESi expr RBRACSi
//            					expr                        			: exprSingle (COMMASi exprSingle)*;
//									exprSingle#								: #PAA EGET#
				
				dirCommentConstructor					: LCOMMENTSi DirCommentContent RCOMMENTSi;
				
				dirPIConstructor						: LPISi PiTarget DirPiContents? RPISi;
				
			computedConstructor         			: compDocConstructor
					                                | compElemConstructor
					                                | compAttrConstructor
					                                | compTextConstructor
					                                | compCommentConstructor
					                                | compPIConstructor; 
			
				compDocConstructor          			: DOCUMENT LBRACESi expr RBRACSi;
//					expr                        			: exprSingle (COMMASi exprSingle)*;
//						exprSingle#								: #PAA EGET#
				
				compElemConstructor         			: ELEMENT (qName | LBRACESi expr RBRACSi) 
															LBRACESi contentExpr? RBRACSi;
//					expr                        			: exprSingle (COMMASi exprSingle)*;
//						exprSingle#								: #PAA EGET#
					contentExpr                 			: expr;																
//						expr                        			: exprSingle (COMMASi exprSingle)*;
//							exprSingle#								: #PAA EGET#
				
				compAttrConstructor         			: ATTRIBUTE (qName | (LBRACESi expr RBRACSi)) 
															LBRACESi expr? RBRACSi;									
				
				compTextConstructor         			: TEXT LBRACESi expr RBRACSi;
				
				compCommentConstructor      			: COMMENT LBRACESi expr RBRACSi;
				
				compPIConstructor           			: PROCESSING_INSTRUCTION (NCName | (LBRACESi expr RBRACSi)) 
															LBRACESi expr? RBRACSi;
															
//	predicateList               			: predicate*;
//		predicate                   			: LBRACKSi expr RBRACKSi;   	


//-------------------------------------------------- NCName or Keyword? --------------------------------------------------
/*
ncNameorKeyword							: NCName
										| ALL
										| ANY
										| ANCESTOR
										| ANCESTOR_OR_SELF
										| AND
										| AS
										| ASCENDING
										| AT
										| ATTRIBUTE
										| BASE_URI
										| BY
										| BOUNDARYSPACE
										| CASE
										| CAST
										| CASTABLE
										| CHILD
										| COLLATION
										| COMMENT
										| CONSTRUCTION
										| CONTENT
										| COPY_NAMESPACES
										| DECLARE
										| DEFAULT
										| DESCENDANT
										| DESCENDANT_OR_SELF
										| DESCENDING
										| DIACRITICS
										| DIFFERENT
										| DISTANCE
										| DIV
										| DOCUMENT
										| DOCUMENT_NODE
										| ELEMENT
										| ELSE
										| ENCODING
										| END
										| ENTIRE
										| EMPTY
										| EMPTY_SEQUENCE
										| EQ
										| EVERY
										| EXACTLY
										| EXCEPT
										| EXTERNAL
										| FOLLOWING
										| FOLLOWING_SIBLING
										| FOR
										| FROM
										| FTAND
										| FTCONTAINS
										| FTNOT
										| FTOPTION
										| FTOR
										| FUNCTION
										| GE
										| GREATEST
										| GT
										| IDIV
										| IF
										| IMPORT
										| IN
										| INHERIT
										| INSENSITIVE
										| INSTANCE
										| INTERSECT
										| IS
										| ITEM
										| LANGUAGE
										| LAX
										| LE
										| LEAST
										| LET
										| LEVELS
										| LOWERCASE
										| LT
										| MOD
										| MODULE
										| MOST
										| NAMESPACE
										| NE
										| NODE
										| NOINHERIT
										| NOPRESERVE
										| NOT
										| OCCURS
										| OF
										| OPTION
										| OR
										| ORDER
										| ORDERED
										| ORDERING
										| PARAGRAPH
										| PARAGRAPHS
										| PARENT
										| PHRASE
										| PRECEDING
										| PRECEDING_SIBLING
										| PRESERVE
										| PROCESSING_INSTRUCTION
										| RELATIONSHIP
										| RETURN
										| SAME
										| SATISFIES
										| SCHEMA
										| SCHEMAATTRIBUTE
										| SCHEMAELEMENT
										| SCORE
										| SELF
										| SENSITIVE
										| SENTENCES
										| SENTENCE
										| SOME
										| STABLE
										| START
										| STEMMING
										| STOP
										| STRICT
										| STRIP
										| TEXT
										| THESAURUS
										| THEN
										| TIMES
										| TO
										| TREAT
										| TYPESWITCH
										| UNION
										| UNORDERED
										| UPPERCASE
										| VALIDATE
										| VARIABLE
										| VERSION
										| WEIGHT
										| WHERE
										| WILDCARDS
										| WINDOW
										| WITH
										| WITHOUT
										| WORD
										| WORDS
										| XQUERY
										;
					
*/


//---------------------------------------------------- Lexer ---------------------------------------------------
/*
Productions with -LEX suffix are productions with similar named parser productions. The ones in the lexer generally emits more
than one token, and will not generate a token of it self.

Productions with a -Si suffix are productions consisting of only matching a special character or a series of special characters,
eg. QUESTIONSi = '?' and DBLSLASHSi = '//'
*/


TOKENSWITCH				: {System.out.println("State is: " + state);}(
						  {state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE}?=>
                          n=CDataSectionLEX						// emits subtokens
						| {state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE}?=>
						  n=DirPIConstructor					// emits subtokens
						| {state!=State.IN_TAG && state!=State.IN_QUOT_ATTRIBUTE && state!=State.IN_APOS_ATTRIBUTE}?=>
						  n=DirCommentConstLEX					// emits subtokens
						| {state==State.IN_ELEMENT}?=>
						  n=LENDTAGSi 							{$type=LENDTAGSi;}
  					  	| {state==State.IN_ELEMENT}? =>
						  n=ElementContent						{$type=ElementContent;}	  
						| {state==State.DEFAULT}?=>
						  n=PragmaLEX							// emits subtokens
						| {state==State.DEFAULT}?=>
						  n=Comment								{$type=Comment; $channel=HIDDEN;}
						| {state==State.DEFAULT}?=> 
						  n=NumberLEX							{$type=this.tokenType;}
						| {state==State.DEFAULT}?=>
						  n=LexSigns							{$type=this.tokenType;}
						| {(state==State.DEFAULT || state==State.IN_TAG)}?=>
						  n=S									{$type=S; $channel=HIDDEN;}
						| {state==State.DEFAULT}?=>
						  n=StringLiteral						{$type=StringLiteral;}
						| {(state==State.DEFAULT || state==State.IN_TAG)}?=>
						  n=LexLiterals							{$type=this.tokenType;}						  
						| {state==State.IN_QUOT_ATTRIBUTE}?=>
						  n=QuotAttributeContent				{$type=QuotAttributeContent;}
						| {state==State.IN_APOS_ATTRIBUTE}?=>
						  n=AposAttributeContent				{$type=AposAttributeContent;}
						| {state==State.IN_TAG}?=>
						  n=RSELFTERMSi							{$type=RSELFTERMSi;}
						| n=QUOTSi								{$type=QUOTSi;}
						| n=DOLLARSi							{$type=DOLLARSi;}				
						| n=APOSSi 								{$type=APOSSi;}
						| n=LPARSi 								{$type=LPARSi;}
						| n=RPARSi								{$type=RPARSi;}
						| n=STARSi								{$type=STARSi;}
						| n=PLUSSi								{$type=PLUSSi;}
						| n=COMMASi								{$type=COMMASi;}
						| n=MINUSSi								{$type=MINUSSi;}
						| n=DOTSi								{$type=DOTSi;}
						| n=SLASHSi								{$type=SLASHSi;}
						| n=COLONSi								{$type=COLONSi;}
						| n=SEMICOLONSi							{$type=SEMICOLONSi;}
						| n=LTSi								{$type=LTSi;}
						| n=EQSi								{$type=EQSi;}
						| n=GTSi								{$type=GTSi;}
						| n=QUESTIONSi							{$type=QUESTIONSi;}
						| n=ATSi								{$type=ATSi;}
						| n=LBRACKSi							{$type=LBRACKSi;}
						| n=RBRACKSi							{$type=RBRACKSi;}
						| n=LBRACESi							{$type=LBRACESi;}
						| n=PIPESi								{$type=PIPESi;}
						| n=RBRACSi								{$type=RBRACSi;})
						{System.out.println(XQFTParser.tokenNames[$type] + " xx"+ $n.text +"xx in state: " + state);}	
						;

fragment S                   		: ('\u0020' | '\u0009' | '\u000D' | '\u000A')+;



//---------------------------------------- StringLiteral and XML contents -------------------------------------------------------


fragment StringLiteral	    		: QUOTSi 
										(PredefinedEntityRef | CharRef | {(input.LA(1)=='"' && input.LA(2)=='"')}?=> QUOTSi QUOTSi | ~(NotChar | QUOTSi|AMPERSi))* 
										QUOTSi 
									| APOSSi 
										(PredefinedEntityRef | CharRef | {(input.LA(1)=='\'' && input.LA(2)=='\'')}?=> APOSSi APOSSi | ~(NotChar | APOSSi|AMPERSi))* 
										APOSSi
									;

fragment QuotAttributeContent		: (PredefinedEntityRef | CharRef | QuotAttrContentChar)*;
fragment AposAttributeContent		: (PredefinedEntityRef | CharRef | AposAttrContentChar)*;
fragment ElementContent				: (PredefinedEntityRef | CharRef | ElementContentChar)*;

	fragment PredefinedEntityRef	: AMPERSi ('lt' | 'gt' | 'amp' | 'quot' | 'apos') SEMICOLONSi;
	
	fragment CharRef             	: CREFDECSi ('0'..'9')+ SEMICOLONSi 
									| CREFHEXSi ('0'..'9'|'a'..'f'|'A'..'F')+ SEMICOLONSi;
		fragment CREFDECSi				: '&#';
		fragment CREFHEXSi				: '&#x';
	
//	fragment LDBLBRACSi 			: '{{';
//	fragment RDBLBRACSi 			: '}}';
	
//	fragment ESCQUOTSi        		: '""';
//	fragment ESCAPOSSi 	 	  		: '\'\'';
/*
	fragment ElementContentChar		: CleanChar | QUOTSi | APOSSi | MINUSSi;
	fragment QuotAttrContentChar	: CleanChar | APOSSi | MINUSSi;
	fragment AposAttrContentChar	: CleanChar | QUOTSi | MINUSSi;
*/
	fragment ElementContentChar		: ({(input.LA(1)=='{' && input.LA(2)=='{')}?=> LBRACESi LBRACESi 
									|  {(input.LA(1)=='}' && input.LA(2)=='}')}?=> RBRACSi RBRACSi 
									| ~(NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi ));
	fragment QuotAttrContentChar	: ({(input.LA(1)=='"' && input.LA(2)=='"')}?=> QUOTSi QUOTSi
									| {(input.LA(1)=='{' && input.LA(2)=='{')}?=> LBRACESi LBRACESi 
									| {(input.LA(1)=='}' && input.LA(2)=='}')}?=> RBRACSi RBRACSi 
									| ~(NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi));
	fragment AposAttrContentChar	: ({(input.LA(1)=='\'' && input.LA(2)=='\'')}?=> APOSSi APOSSi
									| {(input.LA(1)=='{' && input.LA(2)=='{')}?=> LBRACESi LBRACESi 
									| {(input.LA(1)=='}' && input.LA(2)=='}')}?=> RBRACSi RBRACSi 
									| ~(NotChar | LBRACESi | RBRACSi | LTSi | AMPERSi | APOSSi ));
//---------------------------------------- Enclosed composite tokens -------------------------------------------------------------


fragment CDataSectionLEX			: {prepareSubToken();} 	LCDATASi 		{this.type=LCDATASi; emit();}		/* ws: explicitXQ */
									  {prepareSubToken();} 	CDataContents 	{this.type=CDataContents; emit();}
							  		  {prepareSubToken();} 	RCDATASi 		{this.type=RCDATASi; emit();};
	fragment LCDATASi					: '<![CDATA[';
	fragment CDataContents				: ({!(input.LA(2)==']' && input.LA(3)=='>')}?=> RBRACKSi | ~(RBRACKSi | NotChar))* ;
	fragment RCDATASi 					: ']]>';


fragment DirPIConstructor			: {prepareSubToken();}	LPISi			{this.type=LPISi; emit();} /* ws:explicitXQ */
									  {prepareSubToken();}	PiTarget 		{this.type=PiTarget; emit();}
						  	 		  (S 
						  	  		  {prepareSubToken();}	d=DirPiContents	{if(d!=null){this.type=DirPiContents; emit();}} )?
						  	  		  {prepareSubToken();}	RPISi 			{this.type=RPISi; emit();};
	fragment LPISi 						: '<?';
	fragment PiTarget					: n=Name{ !$n.getText().equalsIgnoreCase("XML") }?;
		fragment Name       				: (Letter | UNDERSCORESi | COLONSi) (NameChar)*;
		fragment NameChar					: Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | COLONSi | CombiningChar | Extender;
	fragment DirPiContents				: ({(input.LA(2)!='>')}?=>QUESTIONSi | ~(NotChar | QUESTIONSi))*;
	fragment RPISi 						: '?>';


fragment DirCommentConstLEX			: {prepareSubToken();}	LCOMMENTSi 			{this.type=LCOMMENTSi; emit();}
						  	  		  {prepareSubToken();}	DirCommentContent	{this.type=DirCommentContent; emit();}
						  	  		  {prepareSubToken();}	RCOMMENTSi			{this.type=RCOMMENTSi; emit();};
	fragment LCOMMENTSi 				: '<!--';
	fragment DirCommentContent			: ({(input.LA(2)!='-')}?=> MINUSSi | ~(NotChar | MINUSSi))* ;
	fragment RCOMMENTSi					: '-->';


fragment PragmaLEX			: {prepareSubToken();}	LPRAGSi					{this.type=LPRAGSi; emit();} 
							  S? 
							  {prepareSubToken();}	NCName					{this.type=NCName; emit();}
							  (
							  	{prepareSubToken();}	c=COLONSi			{if(c!=null){this.type=COLONSi; emit();}}
							  	{prepareSubToken();}	n=NCName			{if(n!=null){this.type=NCName; emit();}}
							  	)?
							  (S 
							  	{prepareSubToken();}	p=PragmaContents	{if(p!=null){this.type=PragmaContents; emit();}}
							  	)? 
							  {prepareSubToken();}	RPRAGSi					{this.type=RPRAGSi; emit();}; 
	fragment LPRAGSi			: '(#';										  
	fragment PragmaContents		: ({(input.LA(2)!=')')}?=> SHARPSi | ~(NotChar | SHARPSi))*;
	fragment RPRAGSi 			: '#)';


fragment Comment       		: LXQCOMMENTSi 
								({(input.LA(1)=='(' && input.LA(2)==':')}?Comment 		// if it looks like a comment...
								| {input.LA(2)!=')'}?=>COLONSi							// Hide if next char is )
								| {input.LA(2)!=':'}?=>LPARSi 							// Hide if next char is :
								| ~(LPARSi | COLONSi | NotChar))* 						// ( and : have to be handled by two earlier alt
						  	  RXQCOMMENTSi;
	fragment LXQCOMMENTSi		: '(:';
	fragment RXQCOMMENTSi		: ':)';



//--------------------------------------------- Litterals ----------------------------------------------------------------------
fragment NumberLEX					: (DoubleLiteral)=>	DoubleLiteral				{this.tokenType=DoubleLiteral;}
								  	| (DecimalLiteral)=>DecimalLiteral				{this.tokenType=DecimalLiteral;}
									| (IntegerLiteral)=>IntegerLiteral				{this.tokenType=IntegerLiteral;}
									;
									
fragment IntegerLiteral				: Digits;
fragment DecimalLiteral				: DOTSi Digits 
									| Digits DOTSi ('0'..'9')*;
fragment DoubleLiteral				: (
										DOTSi Digits 
										| Digits ( DOTSi ('0'..'9')* )?
									  ) 
									  ('e'|'E') (PLUSSi|MINUSSi)? Digits;

fragment NCName              			: NCNameStartChar NCNameChar*;
	fragment NCNameChar					   	: Letter | Digit | DOTSi | MINUSSi | UNDERSCORESi | CombiningChar | Extender;
	fragment NCNameStartChar     			: Letter | UNDERSCORESi;


//All keywords and NCName. Made a fragmen so they will not be matched when in ElementContent or AttributeContent.
fragment LexLiterals	: n=NCName{
		if(state != State.IN_TAG){
				 if($n.getText().equals("all")) this.tokenType=ALL;
				 else if($n.getText().equals("any")) this.tokenType=ANY;
				 else if($n.getText().equals("ancestor")) this.tokenType=ANCESTOR;
				 else if($n.getText().equals("ancestor-or-self")) this.tokenType=ANCESTOR_OR_SELF;
				 else if($n.getText().equals("and")) this.tokenType=AND;
				 else if($n.getText().equals("as")) this.tokenType=AS;
				 else if($n.getText().equals("ascending")) this.tokenType=ASCENDING;
				 else if($n.getText().equals("at")) this.tokenType=AT;
				 else if($n.getText().equals("attribute")) this.tokenType=ATTRIBUTE;
				 else if($n.getText().equals("base-uri")) this.tokenType=BASE_URI;
				 else if($n.getText().equals("by")) this.tokenType=BY;
				 else if($n.getText().equals("boundary-space")) this.tokenType=BOUNDARYSPACE;
				 else if($n.getText().equals("case")) this.tokenType=CASE;
				 else if($n.getText().equals("cast")) this.tokenType=CAST;
				 else if($n.getText().equals("castable")) this.tokenType=CASTABLE;
				 else if($n.getText().equals("child")) this.tokenType=CHILD;
				 else if($n.getText().equals("collation")) this.tokenType=COLLATION;
				 else if($n.getText().equals("comment")) this.tokenType=COMMENT;
				 else if($n.getText().equals("construction")) this.tokenType=CONSTRUCTION;
				 else if($n.getText().equals("content")) this.tokenType=CONTENT;
				 else if($n.getText().equals("copy-namespaces")) this.tokenType=COPY_NAMESPACES;
				 else if($n.getText().equals("declare")) this.tokenType=DECLARE;
				 else if($n.getText().equals("default")) this.tokenType=DEFAULT;
				 else if($n.getText().equals("descendant")) this.tokenType=DESCENDANT;
				 else if($n.getText().equals("descendant-or-self")) this.tokenType=DESCENDANT_OR_SELF;
				 else if($n.getText().equals("descending")) this.tokenType=DESCENDING;
				 else if($n.getText().equals("diacritics")) this.tokenType=DIACRITICS;
				 else if($n.getText().equals("different")) this.tokenType=DIFFERENT;
				 else if($n.getText().equals("distance")) this.tokenType=DISTANCE;
				 else if($n.getText().equals("div")) this.tokenType=DIV;
				 else if($n.getText().equals("document")) this.tokenType=DOCUMENT;
				 else if($n.getText().equals("document-node")) this.tokenType=DOCUMENT_NODE;
				 else if($n.getText().equals("element")) this.tokenType=ELEMENT;
				 else if($n.getText().equals("else")) this.tokenType=ELSE;
				 else if($n.getText().equals("encoding")) this.tokenType=ENCODING;
				 else if($n.getText().equals("end")) this.tokenType=END;
				 else if($n.getText().equals("entire")) this.tokenType=ENTIRE;
				 else if($n.getText().equals("empty")) this.tokenType=EMPTY;
				 else if($n.getText().equals("empty-sequence")) this.tokenType=EMPTY_SEQUENCE;
				 else if($n.getText().equals("eq")) this.tokenType=EQ;
				 else if($n.getText().equals("every")) this.tokenType=EVERY;
				 else if($n.getText().equals("exactly")) this.tokenType=EXACTLY;
				 else if($n.getText().equals("except")) this.tokenType=EXCEPT;
				 else if($n.getText().equals("external")) this.tokenType=EXTERNAL;
				 else if($n.getText().equals("following")) this.tokenType=FOLLOWING;
				 else if($n.getText().equals("following-sibling")) this.tokenType=FOLLOWING_SIBLING;
				 else if($n.getText().equals("for")) this.tokenType=FOR;
				 else if($n.getText().equals("from")) this.tokenType=FROM;
				 else if($n.getText().equals("ftand")) this.tokenType=FTAND;
				 else if($n.getText().equals("ftcontains")) this.tokenType=FTCONTAINS;
				 else if($n.getText().equals("ftnot")) this.tokenType=FTNOT;
				 else if($n.getText().equals("ft-option")) this.tokenType=FTOPTION;
				 else if($n.getText().equals("ftor")) this.tokenType=FTOR;
				 else if($n.getText().equals("function")) this.tokenType=FUNCTION;
				 else if($n.getText().equals("ge")) this.tokenType=GE;
				 else if($n.getText().equals("greatest")) this.tokenType=GREATEST;
				 else if($n.getText().equals("gt")) this.tokenType=GT;
				 else if($n.getText().equals("idiv")) this.tokenType=IDIV;
				 else if($n.getText().equals("if")) this.tokenType=IF;
				 else if($n.getText().equals("import")) this.tokenType=IMPORT;
				 else if($n.getText().equals("in")) this.tokenType=IN;
				 else if($n.getText().equals("inherit")) this.tokenType=INHERIT;
				 else if($n.getText().equals("insensitive")) this.tokenType=INSENSITIVE;
				 else if($n.getText().equals("instance")) this.tokenType=INSTANCE;
				 else if($n.getText().equals("intersect")) this.tokenType=INTERSECT;
				 else if($n.getText().equals("is")) this.tokenType=IS;
				 else if($n.getText().equals("item")) this.tokenType=ITEM;
				 else if($n.getText().equals("language")) this.tokenType=LANGUAGE;
				 else if($n.getText().equals("lax")) this.tokenType=LAX;
				 else if($n.getText().equals("le")) this.tokenType=LE;
				 else if($n.getText().equals("least")) this.tokenType=LEAST;
				 else if($n.getText().equals("let")) this.tokenType=LET;
				 else if($n.getText().equals("levels")) this.tokenType=LEVELS;
				 else if($n.getText().equals("lowercase")) this.tokenType=LOWERCASE;
				 else if($n.getText().equals("lt")) this.tokenType=LT;
				 else if($n.getText().equals("mod")) this.tokenType=MOD;
				 else if($n.getText().equals("module")) this.tokenType=MODULE;
				 else if($n.getText().equals("most")) this.tokenType=MOST;
				 else if($n.getText().equals("namespace")) this.tokenType=NAMESPACE;
				 else if($n.getText().equals("ne")) this.tokenType=NE;
				 else if($n.getText().equals("node")) this.tokenType=NODE;
				 else if($n.getText().equals("no-inherit")) this.tokenType=NOINHERIT;
				 else if($n.getText().equals("no-preserve")) this.tokenType=NOPRESERVE;
				 else if($n.getText().equals("not")) this.tokenType=NOT;
				 else if($n.getText().equals("occurs")) this.tokenType=OCCURS;
				 else if($n.getText().equals("of")) this.tokenType=OF;
				 else if($n.getText().equals("option")) this.tokenType=OPTION;
				 else if($n.getText().equals("or")) this.tokenType=OR;
				 else if($n.getText().equals("order")) this.tokenType=ORDER;
				 else if($n.getText().equals("ordered")) this.tokenType=ORDERED;
				 else if($n.getText().equals("ordering")) this.tokenType=ORDERING;
				 else if($n.getText().equals("paragraph")) this.tokenType=PARAGRAPH;
				 else if($n.getText().equals("paragraphs")) this.tokenType=PARAGRAPHS;
				 else if($n.getText().equals("parent")) this.tokenType=PARENT;
				 else if($n.getText().equals("phrase")) this.tokenType=PHRASE;
				 else if($n.getText().equals("preceding")) this.tokenType=PRECEDING;
				 else if($n.getText().equals("preceding-sibling")) this.tokenType=PRECEDING_SIBLING;
				 else if($n.getText().equals("preserve")) this.tokenType=PRESERVE;
				 else if($n.getText().equals("processing-instruction")) this.tokenType=PROCESSING_INSTRUCTION;
				 else if($n.getText().equals("relationship")) this.tokenType=RELATIONSHIP;
				 else if($n.getText().equals("return")) this.tokenType=RETURN;
				 else if($n.getText().equals("same")) this.tokenType=SAME;
				 else if($n.getText().equals("satisfies")) this.tokenType=SATISFIES;
				 else if($n.getText().equals("schema")) this.tokenType=SCHEMA;
				 else if($n.getText().equals("schema-attribute")) this.tokenType=SCHEMAATTRIBUTE;
				 else if($n.getText().equals("schema-element")) this.tokenType=SCHEMAELEMENT;
				 else if($n.getText().equals("score")) this.tokenType=SCORE;
				 else if($n.getText().equals("self")) this.tokenType=SELF;
				 else if($n.getText().equals("sensitive")) this.tokenType=SENSITIVE;
				 else if($n.getText().equals("sentences")) this.tokenType=SENTENCES;
				 else if($n.getText().equals("sentence")) this.tokenType=SENTENCE;
				 else if($n.getText().equals("some")) this.tokenType=SOME;
				 else if($n.getText().equals("stable")) this.tokenType=STABLE;
				 else if($n.getText().equals("start")) this.tokenType=START;
				 else if($n.getText().equals("stemming")) this.tokenType=STEMMING;
				 else if($n.getText().equals("stop")) this.tokenType=STOP;
				 else if($n.getText().equals("strict")) this.tokenType=STRICT;
				 else if($n.getText().equals("strip")) this.tokenType=STRIP;
				 else if($n.getText().equals("text")) this.tokenType=TEXT;
				 else if($n.getText().equals("thesaurus")) this.tokenType=THESAURUS;
				 else if($n.getText().equals("then")) this.tokenType=THEN;
				 else if($n.getText().equals("times")) this.tokenType=TIMES;
				 else if($n.getText().equals("to")) this.tokenType=TO;
				 else if($n.getText().equals("treat")) this.tokenType=TREAT;
				 else if($n.getText().equals("typeswitch")) this.tokenType=TYPESWITCH;
				 else if($n.getText().equals("union")) this.tokenType=UNION;
				 else if($n.getText().equals("unordered")) this.tokenType=UNORDERED;
				 else if($n.getText().equals("uppercase")) this.tokenType=UPPERCASE;
				 else if($n.getText().equals("validate")) this.tokenType=VALIDATE;
				 else if($n.getText().equals("variable")) this.tokenType=VARIABLE;
				 else if($n.getText().equals("version")) this.tokenType=VERSION;
				 else if($n.getText().equals("weight")) this.tokenType=WEIGHT;
				 else if($n.getText().equals("where")) this.tokenType=WHERE;
				 else if($n.getText().equals("wildcards")) this.tokenType=WILDCARDS;
				 else if($n.getText().equals("window")) this.tokenType=WINDOW;
				 else if($n.getText().equals("with")) this.tokenType=WITH;
				 else if($n.getText().equals("without")) this.tokenType=WITHOUT;
				 else if($n.getText().equals("word")) this.tokenType=WORD;
				 else if($n.getText().equals("words")) this.tokenType=WORDS;
				 else if($n.getText().equals("xquery")) this.tokenType=XQUERY;
				 else this.tokenType=NCName;
		}
		else
			this.tokenType=NCName;
				};
						
// Sign sequences of two or more characters had to be made fragment so they won't be matched 
// when in ElementContent or AttributeContent						
fragment LexSigns		: NODEBEFORESi 				{ this.tokenType=NODEBEFORESi;} 			
						| LTOREQSi 	    			{ this.tokenType=LTOREQSi;} 				
						| GTOREQSi 					{ this.tokenType=GTOREQSi;} 				
						| NODEAFTERSi 				{ this.tokenType=NODEAFTERSi;} 			
						| DBLCOLONSi 				{ this.tokenType=DBLCOLONSi;} 			
						| ASSIGNSi  				{ this.tokenType=ASSIGNSi;}				
						| DBLSLASHSi 				{ this.tokenType=DBLSLASHSi;} 								
						| DOTDOTSi  				{ this.tokenType=DOTDOTSi;}				
						| NEQSi  					{ this.tokenType=NEQSi;}				
						;


fragment NODEBEFORESi 			: '<<';
fragment LTOREQSi 				: '<=';
fragment GTOREQSi 				: '>=';
fragment NODEAFTERSi 			: '>>';
fragment DBLCOLONSi 			: '::';
fragment ASSIGNSi 				: ':=';
fragment DBLSLASHSi 			: '//';
fragment DOTDOTSi 				: '..';
fragment NEQSi 					: '!=';

fragment LENDTAGSi 				: '</';
fragment RSELFTERMSi 			: '/>';
fragment EXCLSi					: '!';					// not used in parser
fragment QUOTSi 				: '"';
fragment SHARPSi				: '#';					// not used in parser
fragment DOLLARSi 				: '$';
fragment AMPERSi				: '&';					// not used in parser
fragment APOSSi 				: '\'';
fragment LPARSi 				: '(';
fragment RPARSi 				: ')';
fragment STARSi 				: '*';
fragment PLUSSi 				: '+';
fragment COMMASi 				: ',';
fragment MINUSSi 				: '-';
fragment DOTSi 					: '.';
fragment SLASHSi 				: '/';
fragment COLONSi 				: ':';
fragment SEMICOLONSi			: ';';
fragment LTSi 					: '<';
fragment EQSi 					: '=';
fragment GTSi 					: '>';
fragment QUESTIONSi 			: '?';
fragment ATSi 					: '@';
fragment LBRACKSi 				: '[';
fragment BACKSLASHSi			: '\\'; 				// not used in parser
fragment RBRACKSi				: ']';
fragment UNDERSCORESi 			: '_';					// not used in parser
fragment LBRACESi 				: '{';
fragment PIPESi 				: '|';
fragment RBRACSi 				: '}';



fragment ALL 					: 'all';
fragment ANY 					: 'any';
fragment ANCESTOR 				: 'ancestor';
fragment ANCESTOR_OR_SELF 		: 'ancestor-or-self';
fragment AND 					: 'and';
fragment AS 					: 'as';
fragment ASCENDING 				: 'ascending';
fragment AT 					: 'at';
fragment ATTRIBUTE 				: 'attribute';
fragment BASE_URI 				: 'base-uri';
fragment BY 					: 'by';
fragment BOUNDARYSPACE 			: 'boundary-space';
fragment CASE 					: 'case';
fragment CAST 					: 'cast';
fragment CASTABLE 				: 'castable';
fragment CHILD 					: 'child';
fragment COLLATION 				: 'collation';
fragment COMMENT 				: 'comment';
fragment CONSTRUCTION 			: 'construction';
fragment CONTENT 				: 'content';
fragment COPY_NAMESPACES 		: 'copy-namespaces';
fragment DECLARE			 	: 'declare';
fragment DEFAULT 				: 'default';
fragment DESCENDANT 			: 'descendant';
fragment DESCENDANT_OR_SELF 	: 'descendant-or-self';
fragment DESCENDING 			: 'descending';
fragment DIACRITICS 			: 'diacritics';
fragment DIFFERENT 				: 'different';
fragment DISTANCE 				: 'distance';
fragment DIV 					: 'div';
fragment DOCUMENT 				: 'document';
fragment DOCUMENT_NODE 			: 'document-node';
fragment ELEMENT 				: 'element';
fragment ELSE 					: 'else';
fragment ENCODING 				: 'encoding';
fragment END 					: 'end';
fragment ENTIRE 				: 'entire';
fragment EMPTY 					: 'empty';
fragment EMPTY_SEQUENCE 		: 'empty-sequence';
fragment EQ 					: 'eq';
fragment EVERY 					: 'every';
fragment EXACTLY 				: 'exactly';
fragment EXCEPT 				: 'except';
fragment EXTERNAL 				: 'external';
fragment FOLLOWING 				: 'following';
fragment FOLLOWING_SIBLING 		: 'following-sibling';
fragment FOR 					: 'for';
fragment FROM 					: 'from';
fragment FTAND 					: 'ftand';
fragment FTCONTAINS 			: 'ftcontains';
fragment FTNOT 					: 'ftnot';
fragment FTOPTION 				: 'ft-option';
fragment FTOR 					: 'ftor';
fragment FUNCTION 				: 'function';
fragment GE 					: 'ge';
fragment GREATEST 				: 'greatest';
fragment GT 					: 'gt';
fragment IDIV 					: 'idiv';
fragment IF 					: 'if';
fragment IMPORT 				: 'import';
fragment IN 					: 'in';
fragment INHERIT 				: 'inherit';
fragment INSENSITIVE 			: 'insensitive';
fragment INSTANCE 				: 'instance';
fragment INTERSECT 				: 'intersect';
fragment IS 					: 'is';
fragment ITEM 					: 'item';
fragment LANGUAGE 				: 'language';
fragment LAX 					: 'lax';
fragment LE 					: 'le';
fragment LEAST 					: 'least';
fragment LET 					: 'let';
fragment LEVELS 				: 'levels';
fragment LOWERCASE 				: 'lowercase';
fragment LT 					: 'lt';
fragment MOD 					: 'mod';
fragment MODULE 				: 'module';
fragment MOST 					: 'most';
fragment NAMESPACE 				: 'namespace';
fragment NE 					: 'ne';
fragment NODE 					: 'node';
fragment NOINHERIT 				: 'no-inherit';
fragment NOPRESERVE 			: 'no-preserve';
fragment NOT 					: 'not';
fragment OCCURS 				: 'occurs';
fragment OF 					: 'of';
fragment OPTION 				: 'option';
fragment OR 					: 'or';
fragment ORDER 					: 'order';
fragment ORDERED 				: 'ordered';
fragment ORDERING 				: 'ordering';
fragment PARAGRAPH 				: 'paragraph';
fragment PARAGRAPHS 			: 'paragraphs';
fragment PARENT 				: 'parent';
fragment PHRASE 				: 'phrase';
fragment PRECEDING 				: 'preceding';
fragment PRECEDING_SIBLING 		: 'preceding-sibling';
fragment PRESERVE 				: 'preserve';
fragment PROCESSING_INSTRUCTION	: 'processing-instruction';
fragment RELATIONSHIP 			: 'relationship';
fragment RETURN 				: 'return';
fragment SAME 					: 'same';
fragment SATISFIES 				: 'satisfies';
fragment SCHEMA 				: 'schema';
fragment SCHEMAATTRIBUTE 		: 'schema-attribute';
fragment SCHEMAELEMENT 			: 'schema-element';
fragment SCORE 					: 'score';
fragment SELF 					: 'self';
fragment SENSITIVE 				: 'sensitive';
fragment SENTENCES 				: 'sentences';
fragment SENTENCE 				: 'sentence';
fragment SOME 					: 'some';
fragment STABLE 				: 'stable';
fragment START 					: 'start';
fragment STEMMING 				: 'stemming';
fragment STOP 					: 'stop';
fragment STRICT 				: 'strict';
fragment STRIP 					: 'strip';
fragment TEXT 					: 'text';
fragment THESAURUS 				: 'thesaurus';
fragment THEN 					: 'then';
fragment TIMES 					: 'times';
fragment TO 					: 'to';
fragment TREAT 					: 'treat';
fragment TYPESWITCH 			: 'typeswitch';
fragment UNION 					: 'union';
fragment UNORDERED 				: 'unordered';
fragment UPPERCASE 				: 'uppercase';
fragment VALIDATE 				: 'validate';
fragment VARIABLE 				: 'variable';
fragment VERSION 				: 'version';
fragment WEIGHT 				: 'weight';
fragment WHERE 					: 'where';
fragment WILDCARDS 				: 'wildcards';
fragment WINDOW 				: 'window';
fragment WITH 					: 'with';
fragment WITHOUT 				: 'without';
fragment WORD 					: 'word';
fragment WORDS 					: 'words';
fragment XQUERY					: 'xquery';



//----------------------------------------------- Character classes ---------------------------------------------------------


fragment ExtraChar						: '\u0025' | '\u005E' | '\u0060' | '\u007E'..'\u00B6' | '\u00B8'..'\u00BF' | '\u00D7' | '\u00F7' | '\u0132'..'\u0133' | '\u013F'..'\u0140' | '\u0149' | '\u017F' | '\u01C4'..'\u01CC' | '\u01F1'..'\u01F3' | '\u01F6'..'\u01F9' | '\u0218'..'\u024F' | '\u02A9'..'\u02BA' | '\u02C2'..'\u02CF' | '\u02D2'..'\u02FF' | '\u0346'..'\u035F' | '\u0362'..'\u0385' | '\u038B' | '\u038D' | '\u03A2' | '\u03CF' | '\u03D7'..'\u03D9' | '\u03DB' | '\u03DD' | '\u03DF' | '\u03E1' | '\u03F4'..'\u0400' | '\u040D' | '\u0450' | '\u045D' | '\u0482' | '\u0487'..'\u048F' | '\u04C5'..'\u04C6' | '\u04C9'..'\u04CA' | '\u04CD'..'\u04CF' | '\u04EC'..'\u04ED' | '\u04F6'..'\u04F7' | '\u04FA'..'\u0530' | '\u0557'..'\u0558' | '\u055A'..'\u0560' | '\u0587'..'\u0590' | '\u05A2' | '\u05BA' | '\u05BE' | '\u05C0' | '\u05C3' | '\u05C5'..'\u05CF' | '\u05EB'..'\u05EF' | '\u05F3'..'\u0620' | '\u063B'..'\u063F' | '\u0653'..'\u065F' | '\u066A'..'\u066F' | '\u06B8'..'\u06B9' | '\u06BF' | '\u06CF' | '\u06D4' | '\u06E9' | '\u06EE'..'\u06EF' | '\u06FA'..'\u0900' | '\u0904' | '\u093A'..'\u093B' | '\u094E'..'\u0950' | '\u0955'..'\u0957' | '\u0964'..'\u0965' | '\u0970'..'\u0980' | '\u0984' | '\u098D'..'\u098E' | '\u0991'..'\u0992' | '\u09A9' | '\u09B1' | '\u09B3'..'\u09B5' | '\u09BA'..'\u09BB' | '\u09BD' | '\u09C5'..'\u09C6' | '\u09C9'..'\u09CA' | '\u09CE'..'\u09D6' | '\u09D8'..'\u09DB' | '\u09DE' | '\u09E4'..'\u09E5' | '\u09F2'..'\u0A01' | '\u0A03'..'\u0A04' | '\u0A0B'..'\u0A0E' | '\u0A11'..'\u0A12' | '\u0A29' | '\u0A31' | '\u0A34' | '\u0A37' | '\u0A3A'..'\u0A3B' | '\u0A3D' | '\u0A43'..'\u0A46' | '\u0A49'..'\u0A4A' | '\u0A4E'..'\u0A58' | '\u0A5D' | '\u0A5F'..'\u0A65' | '\u0A75'..'\u0A80' | '\u0A84' | '\u0A8C' | '\u0A8E' | '\u0A92' | '\u0AA9' | '\u0AB1' | '\u0AB4' | '\u0ABA'..'\u0ABB' | '\u0AC6' | '\u0ACA' | '\u0ACE'..'\u0ADF' | '\u0AE1'..'\u0AE5' | '\u0AF0'..'\u0B00' | '\u0B04' | '\u0B0D'..'\u0B0E' | '\u0B11'..'\u0B12' | '\u0B29' | '\u0B31' | '\u0B34'..'\u0B35' | '\u0B3A'..'\u0B3B' | '\u0B44'..'\u0B46' | '\u0B49'..'\u0B4A' | '\u0B4E'..'\u0B55' | '\u0B58'..'\u0B5B' | '\u0B5E' | '\u0B62'..'\u0B65' | '\u0B70'..'\u0B81' | '\u0B84' | '\u0B8B'..'\u0B8D' | '\u0B91' | '\u0B96'..'\u0B98' | '\u0B9B' | '\u0B9D' | '\u0BA0'..'\u0BA2' | '\u0BA5'..'\u0BA7' | '\u0BAB'..'\u0BAD' | '\u0BB6' | '\u0BBA'..'\u0BBD' | '\u0BC3'..'\u0BC5' | '\u0BC9' | '\u0BCE'..'\u0BD6' | '\u0BD8'..'\u0BE6' | '\u0BF0'..'\u0C00' | '\u0C04' | '\u0C0D' | '\u0C11' | '\u0C29' | '\u0C34' | '\u0C3A'..'\u0C3D' | '\u0C45' | '\u0C49' | '\u0C4E'..'\u0C54' | '\u0C57'..'\u0C5F' | '\u0C62'..'\u0C65' | '\u0C70'..'\u0C81' | '\u0C84' | '\u0C8D' | '\u0C91' | '\u0CA9' | '\u0CB4' | '\u0CBA'..'\u0CBD' | '\u0CC5' | '\u0CC9' | '\u0CCE'..'\u0CD4' | '\u0CD7'..'\u0CDD' | '\u0CDF' | '\u0CE2'..'\u0CE5' | '\u0CF0'..'\u0D01' | '\u0D04' | '\u0D0D' | '\u0D11' | '\u0D29' | '\u0D3A'..'\u0D3D' | '\u0D44'..'\u0D45' | '\u0D49' | '\u0D4E'..'\u0D56' | '\u0D58'..'\u0D5F' | '\u0D62'..'\u0D65' | '\u0D70'..'\u0E00' | '\u0E2F' | '\u0E3B'..'\u0E3F' | '\u0E4F' | '\u0E5A'..'\u0E80' | '\u0E83' | '\u0E85'..'\u0E86' | '\u0E89' | '\u0E8B'..'\u0E8C' | '\u0E8E'..'\u0E93' | '\u0E98' | '\u0EA0' | '\u0EA4' | '\u0EA6' | '\u0EA8'..'\u0EA9' | '\u0EAC' | '\u0EAF' | '\u0EBA' | '\u0EBE'..'\u0EBF' | '\u0EC5' | '\u0EC7' | '\u0ECE'..'\u0ECF' | '\u0EDA'..'\u0F17' | '\u0F1A'..'\u0F1F' | '\u0F2A'..'\u0F34' | '\u0F36' | '\u0F38' | '\u0F3A'..'\u0F3D' | '\u0F48' | '\u0F6A'..'\u0F70' | '\u0F85' | '\u0F8C'..'\u0F8F' | '\u0F96' | '\u0F98' | '\u0FAE'..'\u0FB0' | '\u0FB8' | '\u0FBA'..'\u109F' | '\u10C6'..'\u10CF' | '\u10F7'..'\u10FF' | '\u1101' | '\u1104' | '\u1108' | '\u110A' | '\u110D' | '\u1113'..'\u113B' | '\u113D' | '\u113F' | '\u1141'..'\u114B' | '\u114D' | '\u114F' | '\u1151'..'\u1153' | '\u1156'..'\u1158' | '\u115A'..'\u115E' | '\u1162' | '\u1164' | '\u1166' | '\u1168' | '\u116A'..'\u116C' | '\u116F'..'\u1171' | '\u1174' | '\u1176'..'\u119D' | '\u119F'..'\u11A7' | '\u11A9'..'\u11AA' | '\u11AC'..'\u11AD' | '\u11B0'..'\u11B6' | '\u11B9' | '\u11BB' | '\u11C3'..'\u11EA' | '\u11EC'..'\u11EF' | '\u11F1'..'\u11F8' | '\u11FA'..'\u1DFF' | '\u1E9C'..'\u1E9F' | '\u1EFA'..'\u1EFF' | '\u1F16'..'\u1F17' | '\u1F1E'..'\u1F1F' | '\u1F46'..'\u1F47' | '\u1F4E'..'\u1F4F' | '\u1F58' | '\u1F5A' | '\u1F5C' | '\u1F5E' | '\u1F7E'..'\u1F7F' | '\u1FB5' | '\u1FBD' | '\u1FBF'..'\u1FC1' | '\u1FC5' | '\u1FCD'..'\u1FCF' | '\u1FD4'..'\u1FD5' | '\u1FDC'..'\u1FDF' | '\u1FED'..'\u1FF1' | '\u1FF5' | '\u1FFD'..'\u20CF' | '\u20DD'..'\u20E0' | '\u20E2'..'\u2125' | '\u2127'..'\u2129' | '\u212C'..'\u212D' | '\u212F'..'\u217F' | '\u2183'..'\u3004' | '\u3006' | '\u3008'..'\u3020' | '\u3030' | '\u3036'..'\u3040' | '\u3095'..'\u3098' | '\u309B'..'\u309C' | '\u309F'..'\u30A0' | '\u30FB' | '\u30FF'..'\u3104' | '\u312D'..'\u4DFF' | '\u9FA6'..'\uABFF' | '\uD7A4'..'\uD7FF' | '\uE000'..'\uFFFD';
// Can now be removed - only reference to CleanChar is in Char
fragment CleanChar						: S | BaseChar | Ideographic | CombiningChar | Extender | Digit | ExtraChar 
										| EXCLSi | SHARPSi | DOLLARSi | LPARSi | RPARSi | STARSi | PLUSSi | COMMASi 
										| DOTSi | SLASHSi | COLONSi | SEMICOLONSi | EQSi | GTSi | QUESTIONSi | ATSi 
										| LBRACKSi | BACKSLASHSi | RBRACKSi	| UNDERSCORESi | PIPESi
										;
fragment Char							: CleanChar | LBRACESi | RBRACSi | LTSi | AMPERSi | QUOTSi | APOSSi | MINUSSi;
fragment NotChar						: '\u0001'..'\u0008' | '\u000B' | '\u000C' | '\u000E'..'\u001F' | '\uD800'..'\uDFFF' 
										/*| '\uFFFE' | '\uFFFF'*/;
										 

fragment Digits              			: ('0'..'9')+;
//"Tall + asiatiske tall" 
fragment Digit               			: '\u0030'..'\u0039' | '\u0660'..'\u0669' | '\u06F0'..'\u06F9' | '\u0966'..'\u096F' | '\u09E6'..'\u09EF' | '\u0A66'..'\u0A6F' | '\u0AE6'..'\u0AEF' | '\u0B66'..'\u0B6F' | '\u0BE7'..'\u0BEF' | '\u0C66'..'\u0C6F' | '\u0CE6'..'\u0CEF' | '\u0D66'..'\u0D6F' | '\u0E50'..'\u0E59' | '\u0ED0'..'\u0ED9' | '\u0F20'..'\u0F29' ;

fragment Letter							: BaseChar | Ideographic ;
//"Bokstaver"
fragment BaseChar            			: '\u0041'..'\u005A' | '\u0061'..'\u007A' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u00FF' | '\u0100'..'\u0131' | '\u0134'..'\u013E' | '\u0141'..'\u0148' | '\u014A'..'\u017E' | '\u0180'..'\u01C3' | '\u01CD'..'\u01F0' | '\u01F4'..'\u01F5' | '\u01FA'..'\u0217' | '\u0250'..'\u02A8' | '\u02BB'..'\u02C1' | '\u0386' | '\u0388'..'\u038A' | '\u038C' | '\u038E'..'\u03A1' | '\u03A3'..'\u03CE' | '\u03D0'..'\u03D6' | '\u03DA' | '\u03DC' | '\u03DE' | '\u03E0' | '\u03E2'..'\u03F3' | '\u0401'..'\u040C' | '\u040E'..'\u044F' | '\u0451'..'\u045C' | '\u045E'..'\u0481' | '\u0490'..'\u04C4' | '\u04C7'..'\u04C8' | '\u04CB'..'\u04CC' | '\u04D0'..'\u04EB' | '\u04EE'..'\u04F5' | '\u04F8'..'\u04F9' | '\u0531'..'\u0556' | '\u0559' | '\u0561'..'\u0586' | '\u05D0'..'\u05EA' | '\u05F0'..'\u05F2' | '\u0621'..'\u063A' | '\u0641'..'\u064A' | '\u0671'..'\u06B7' | '\u06BA'..'\u06BE' | '\u06C0'..'\u06CE' | '\u06D0'..'\u06D3' | '\u06D5' | '\u06E5'..'\u06E6' | '\u0905'..'\u0939' | '\u093D' | '\u0958'..'\u0961' | '\u0985'..'\u098C' | '\u098F'..'\u0990' | '\u0993'..'\u09A8' | '\u09AA'..'\u09B0' | '\u09B2' | '\u09B6'..'\u09B9' | '\u09DC'..'\u09DD' | '\u09DF'..'\u09E1' | '\u09F0'..'\u09F1' | '\u0A05'..'\u0A0A' | '\u0A0F'..'\u0A10' | '\u0A13'..'\u0A28' | '\u0A2A'..'\u0A30' | '\u0A32'..'\u0A33' | '\u0A35'..'\u0A36' | '\u0A38'..'\u0A39' | '\u0A59'..'\u0A5C' | '\u0A5E' | '\u0A72'..'\u0A74' | '\u0A85'..'\u0A8B' | '\u0A8D' | '\u0A8F'..'\u0A91' | '\u0A93'..'\u0AA8' | '\u0AAA'..'\u0AB0' | '\u0AB2'..'\u0AB3' | '\u0AB5'..'\u0AB9' | '\u0ABD' | '\u0AE0' | '\u0B05'..'\u0B0C' | '\u0B0F'..'\u0B10' | '\u0B13'..'\u0B28' | '\u0B2A'..'\u0B30' | '\u0B32'..'\u0B33' | '\u0B36'..'\u0B39' | '\u0B3D' | '\u0B5C'..'\u0B5D' | '\u0B5F'..'\u0B61' | '\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B95' | '\u0B99'..'\u0B9A' | '\u0B9C' | '\u0B9E'..'\u0B9F' | '\u0BA3'..'\u0BA4' | '\u0BA8'..'\u0BAA' | '\u0BAE'..'\u0BB5' | '\u0BB7'..'\u0BB9' | '\u0C05'..'\u0C0C' | '\u0C0E'..'\u0C10' | '\u0C12'..'\u0C28' | '\u0C2A'..'\u0C33' | '\u0C35'..'\u0C39' | '\u0C60'..'\u0C61' | '\u0C85'..'\u0C8C' | '\u0C8E'..'\u0C90' | '\u0C92'..'\u0CA8' | '\u0CAA'..'\u0CB3' | '\u0CB5'..'\u0CB9' | '\u0CDE' | '\u0CE0'..'\u0CE1' | '\u0D05'..'\u0D0C' | '\u0D0E'..'\u0D10' | '\u0D12'..'\u0D28' | '\u0D2A'..'\u0D39' | '\u0D60'..'\u0D61' | '\u0E01'..'\u0E2E' | '\u0E30' | '\u0E32'..'\u0E33' | '\u0E40'..'\u0E45' | '\u0E81'..'\u0E82' | '\u0E84' | '\u0E87'..'\u0E88' | '\u0E8A' | '\u0E8D' | '\u0E94'..'\u0E97' | '\u0E99'..'\u0E9F' | '\u0EA1'..'\u0EA3' | '\u0EA5' | '\u0EA7' | '\u0EAA'..'\u0EAB' | '\u0EAD'..'\u0EAE' | '\u0EB0' | '\u0EB2'..'\u0EB3' | '\u0EBD' | '\u0EC0'..'\u0EC4' | '\u0F40'..'\u0F47' | '\u0F49'..'\u0F69' | '\u10A0'..'\u10C5' | '\u10D0'..'\u10F6' | '\u1100' | '\u1102'..'\u1103' | '\u1105'..'\u1107' | '\u1109' | '\u110B'..'\u110C' | '\u110E'..'\u1112' | '\u113C' | '\u113E' | '\u1140' | '\u114C' | '\u114E' | '\u1150' | '\u1154'..'\u1155' | '\u1159' | '\u115F'..'\u1161' | '\u1163' | '\u1165' | '\u1167' | '\u1169' | '\u116D'..'\u116E' | '\u1172'..'\u1173' | '\u1175' | '\u119E' | '\u11A8' | '\u11AB' | '\u11AE'..'\u11AF' | '\u11B7'..'\u11B8' | '\u11BA' | '\u11BC'..'\u11C2' | '\u11EB' | '\u11F0' | '\u11F9' | '\u1E00'..'\u1E9B' | '\u1EA0'..'\u1EF9' | '\u1F00'..'\u1F15' | '\u1F18'..'\u1F1D' | '\u1F20'..'\u1F45' | '\u1F48'..'\u1F4D' | '\u1F50'..'\u1F57' | '\u1F59' | '\u1F5B' | '\u1F5D' | '\u1F5F'..'\u1F7D' | '\u1F80'..'\u1FB4' | '\u1FB6'..'\u1FBC' | '\u1FBE' | '\u1FC2'..'\u1FC4' | '\u1FC6'..'\u1FCC' | '\u1FD0'..'\u1FD3' | '\u1FD6'..'\u1FDB' | '\u1FE0'..'\u1FEC' | '\u1FF2'..'\u1FF4' | '\u1FF6'..'\u1FFC' | '\u2126' | '\u212A'..'\u212B' | '\u212E' | '\u2180'..'\u2182' | '\u3041'..'\u3094' | '\u30A1'..'\u30FA' | '\u3105'..'\u312C' | '\uAC00'..'\uD7A3';
//"Asiatiske tegn"
fragment Ideographic        			: '\u4E00'..'\u9FA5' | '\u3007' | '\u3021'..'\u3029'; 
//"Astatiske hjelpetegn"
fragment CombiningChar       			: '\u0300'..'\u0345' | '\u0360'..'\u0361' | '\u0483'..'\u0486' | '\u0591'..'\u05A1' | '\u05A3'..'\u05B9' | '\u05BB'..'\u05BD' | '\u05BF' | '\u05C1'..'\u05C2' | '\u05C4' | '\u064B'..'\u0652' | '\u0670' | '\u06D6'..'\u06DC' | '\u06DD'..'\u06DF' | '\u06E0'..'\u06E4' | '\u06E7'..'\u06E8' | '\u06EA'..'\u06ED' | '\u0901'..'\u0903' | '\u093C' | '\u093E'..'\u094C' | '\u094D' | '\u0951'..'\u0954' | '\u0962'..'\u0963' | '\u0981'..'\u0983' | '\u09BC' | '\u09BE' | '\u09BF' | '\u09C0'..'\u09C4' | '\u09C7'..'\u09C8' | '\u09CB'..'\u09CD' | '\u09D7' | '\u09E2'..'\u09E3' | '\u0A02' | '\u0A3C' | '\u0A3E' | '\u0A3F' | '\u0A40'..'\u0A42' | '\u0A47'..'\u0A48' | '\u0A4B'..'\u0A4D' | '\u0A70'..'\u0A71' | '\u0A81'..'\u0A83' | '\u0ABC' | '\u0ABE'..'\u0AC5' | '\u0AC7'..'\u0AC9' | '\u0ACB'..'\u0ACD' | '\u0B01'..'\u0B03' | '\u0B3C' | '\u0B3E'..'\u0B43' | '\u0B47'..'\u0B48' | '\u0B4B'..'\u0B4D' | '\u0B56'..'\u0B57' | '\u0B82'..'\u0B83' | '\u0BBE'..'\u0BC2' | '\u0BC6'..'\u0BC8' | '\u0BCA'..'\u0BCD' | '\u0BD7' | '\u0C01'..'\u0C03' | '\u0C3E'..'\u0C44' | '\u0C46'..'\u0C48' | '\u0C4A'..'\u0C4D' | '\u0C55'..'\u0C56' | '\u0C82'..'\u0C83' | '\u0CBE'..'\u0CC4' | '\u0CC6'..'\u0CC8' | '\u0CCA'..'\u0CCD' | '\u0CD5'..'\u0CD6' | '\u0D02'..'\u0D03' | '\u0D3E'..'\u0D43' | '\u0D46'..'\u0D48' | '\u0D4A'..'\u0D4D' | '\u0D57' | '\u0E31' | '\u0E34'..'\u0E3A' | '\u0E47'..'\u0E4E' | '\u0EB1' | '\u0EB4'..'\u0EB9' | '\u0EBB'..'\u0EBC' | '\u0EC8'..'\u0ECD' | '\u0F18'..'\u0F19' | '\u0F35' | '\u0F37' | '\u0F39' | '\u0F3E' | '\u0F3F' | '\u0F71'..'\u0F84' | '\u0F86'..'\u0F8B' | '\u0F90'..'\u0F95' | '\u0F97' | '\u0F99'..'\u0FAD' | '\u0FB1'..'\u0FB7' | '\u0FB9' | '\u20D0'..'\u20DC' | '\u20E1' | '\u302A'..'\u302F' | '\u3099' | '\u309A';
//"Asiatiske talltillegg?"
fragment Extender    			        : '\u00B7' | '\u02D0' | '\u02D1' | '\u0387' | '\u0640' | '\u0E46' | '\u0EC6' | '\u3005' | '\u3031'..'\u3035' | '\u309D'..'\u309E' | '\u30FC'..'\u30FE';
