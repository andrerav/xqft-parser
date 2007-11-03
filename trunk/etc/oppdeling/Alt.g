//----------------------------------------------------- Module -------------------------------------------------------

module                     				: versionDecl? (libraryModule | mainModule);

	versionDecl                 			: XQUERY VERSION StringLiteral (ENCODING StringLiteral)? separator;
		separator                   			: SEMICOLONSi;
		
	libraryModule               			: moduleDecl prolog;
		moduleDecl                  			: MODULE NAMESPACE NCName EQSi uriLiteral separator;
			uriLiteral                  			: StringLiteral;
//		prolog# 											: #PÅ EGET#
		
	mainModule                  			: prolog queryBody;
//		prolog#									: #PÅ EGET#
		queryBody                   			: expr;
			expr                        			: exprSingle (COMMASi exprSingle)*;
//				exprSingle#								: #PÅ EGET#
												

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
	baseURIDecl                 			: DECLARE BASEURI uriLiteral;
	constructionDecl            			: DECLARE CONSTRUCTION (STRIP | PRESERVE);
	orderingModeDecl           				: DECLARE ORDERING (ORDERED | UNORDERED);
	emptyOrderDecl              			: DECLARE DEFAULT ORDER EMPTY (GREATEST | LEAST);
	copyNamespacesDecl          			: DECLARE COPYNAMESPACES preserveMode COMMASi inheritMode;
		preserveMode                			: PRESERVE | NOPRESERVE;
		inheritMode                 			: INHERIT | NOINHERIT;	
		
namespaceDecl               			: DECLARE NAMESPACE NCName EQSi uriLiteral;

importStmt                  			: schemaImport | moduleImport;
	schemaImport                			: IMPORT SCHEMA schemaPrefix? uriLiteral (AT uriLiteral (COMMASi uriLiteral)*)?;
		schemaPrefix                			: (NAMESPACE NCName EQSi) | (DEFAULT ELEMENT NAMESPACE);
	moduleImport                			: IMPORT MODULE (NAMESPACE NCName EQSi)? uriLiteral (AT uriLiteral (COMMASi uriLiteral)*)?;
	
varDecl                     			: DECLARE VARIABLE DOLLARSi qName typeDeclaration? ((ASSIGNSi exprSingle) | EXTERNAL);
	qName						 			: (NCName COLONSi)? NCName;
	typeDeclaration             			: AS sequenceType;
//		sequenceType# 							: #PÅ EGET#
//	exprSingle# 							: #PÅ EGET#
	
functionDecl                			: DECLARE FUNCTION qName LPARSi paramList? RPARSi 
											(AS sequenceType)? (enclosedExpr | EXTERNAL);
	paramList                   			: param (COMMASi param)*;
		param                       			: DOLLARSi qName typeDeclaration?;
//			qName						 			: (NCName COLONSi)? NCName;	  
//			typeDeclaration             			: AS sequenceType;	 
//	sequenceType# 							: #PÅ EGET#
	enclosedExpr                			: LBRACESi expr RBRACSi;
//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle# 							: #PÅ EGET#
			
optionDecl                  			: DECLARE OPTION qName StringLiteral;

ftOptionDecl                			: DECLARE FTOPTION ftMatchOptions;
	ftMatchOptions              			: ftMatchOption+;     					/* xgc: multiple-match-options */
//		ftMatchOption# 							: #PÅ EGET#
	
	
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
			documentTest                			: DOCUMENTNODE LPARSi (elementTest | schemaElementTest)? RPARSi;
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
	fLWORExpr                   			: (forClause | letClause)+ whereClause? orderByClause? RETURN exprSingle;
	
		forClause                   			: FOR DOLLARSi varName typeDeclaration? positionalVar? ftScoreVar? IN exprSingle 
													(COMMASi DOLLARSi varName typeDeclaration? positionalVar? ftScoreVar? IN exprSingle)*;
			varName                    				: qName;
//			typeDeclaration             			: AS sequenceType;
//				sequenceType# 							: #PÅ EGET#
			positionalVar               			: AT DOLLARSi varName;
//				varName                    				: qName; 	
			ftScoreVar                  			: SCORE DOLLARSi varName;
//				varName                    				: qName; 
//			exprSingle# 									: #PÅ EGET (DETTE)#
			
		letClause                   		: (
											 LET DOLLARSi varName typeDeclaration? 
											|LET SCORE DOLLARSi varName
											) 
											ASSIGNSi exprSingle 
											(
											COMMASi 
												(
											  	DOLLARSi varName typeDeclaration? 
												| ftScoreVar
												) 
											ASSIGNSi exprSingle
											)*;
//			varName                    				: qName; 
//			typeDeclaration             			: AS sequenceType;
//				sequenceType# 							: #PÅ EGET#
//			exprSingle#								: #PÅ EGET (DETTE)#
//			ftScoreVar                  			: SCORE DOLLARSi varName; 
//				varName                    				: qName; 
		
		whereClause                 		: WHERE exprSingle;	
//			exprSingle#							: #PÅ EGET (DETTE)#
			
		orderByClause               		: (ORDER BY | STABLE ORDER BY) orderSpecList;
			orderSpecList               		: orderSpec (COMMASi orderSpec)*;
				orderSpec                   		: exprSingle orderModifier;
//					exprSingle#							: #PÅ EGET (DETTE)#
					orderModifier               		: (ASCENDING | DESCENDING)? (EMPTY (GREATEST | LEAST))? (COLLATION uriLiteral)?;
//						uriLiteral                  		: StringLiteral;
		
//		exprSingle# 						: #PÅ EGET (DETTE)#
		

	quantifiedExpr              			: (SOME | EVERY) DOLLARSi varName typeDeclaration? IN exprSingle 
												(COMMASi DOLLARSi varName typeDeclaration? IN exprSingle)* SATISFIES exprSingle;			
//		#SE forClause# :
		
	
	typeswitchExpr              			: TYPESWITCH LPARSi expr RPARSi caseClause+ 
												DEFAULT (DOLLARSi varName)? RETURN exprSingle;
//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle# 							: #PÅ EGET (DETTE)#
		caseClause                  			: CASE (DOLLARSi varName AS)? sequenceType RETURN exprSingle;
//			varName                    				: qName; 
//			sequenceType#							: #PÅ EGET#
//			exprSingle# 							: #PÅ EGET (DETTE)#
//		varName                    				: qName; 
//		exprSingle# 							: #PÅ EGET (DETTE)#
	
	
	ifExpr                      			: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle;
//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle#								: #PÅ EGET (DETTE)#
//		exprSingle# 								: #PÅ EGET (DETTE)#
		
		
	orExpr                      			: andExpr ( OR andExpr )*;
		andExpr                     			: comparisonExpr ( AND comparisonExpr )*;
//			comparisonExpr# 						: #PÅ EGET#
			

//------------------------------------------------------- ComparisonExpr -------------------------------------

comparisonExpr              			: ftContainsExpr ( (valueComp | generalComp | nodeComp) ftContainsExpr )?;


	ftContainsExpr              			: rangeExpr ( FTCONTAINS ftSelection ftIgnoreOption? )?;
	
		rangeExpr                   			: additiveExpr ( TO additiveExpr )?;
			additiveExpr                			: multiplicativeExpr ( (PLUSSi | MINUSSi) multiplicativeExpr )*;
				multiplicativeExpr          			: unionExpr ( (STARSi | DIV | IDIV | MOD) unionExpr )*;
					unionExpr                   			: intersectExceptExpr ( (UNION | PIPESi) intersectExceptExpr )*;
						intersectExceptExpr        				: instanceofExpr ( (INTERSECT | EXCEPT) instanceofExpr )*;
							instanceofExpr              			: treatExpr ( INSTANCE OF sequenceType )?;
								treatExpr                   			: castableExpr ( TREAT AS sequenceType )?;
									castableExpr                			: castExpr ( CASTABLE AS singleType )?;
										castExpr                    			: unaryExpr ( CAST AS singleType )?;
											unaryExpr                   			: (MINUSSi | PLUSSi)* valueExpr;
//												valueExpr# 								: #PÅ EGET#
											singleType                  			: atomicType QUESTIONSi?;
												atomicType                  			: qName;
//										singleType                  			: atomicType QUESTIONSi?; 
//											atomicType                  			: qName; 
//									sequenceType# 							: #PÅ EGET#	
//								sequenceType# 							: #PÅ EGET#		
		
//		ftSelection#								: #PÅ EGET#
		
		ftIgnoreOption              			: WITHOUT CONTENT unionExpr;
//			unionExpr#								: #SE DETTE -> ftContainsExpr->rangeExpr->additiveExpr->miltiplicativeExpr->unionExpr#
	
	
	valueComp                   			: EQ | NE | LT | LE | GT | GE;
	
	
	generalComp                 			: EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi;
	
	
	nodeComp                    			: IS | NODEBEFORESi | NODEAFTERSi;	
	
//--------------------------------------------------------- FtSelection ---------------------------------------------

ftSelection                 			: ftOr ftPosFilter* (WEIGHT rangeExpr)?;


	ftOr                        			: ftAnd ( FTOR ftAnd )*;
		ftAnd                       			: ftMildNot ( FTAND ftMildNot )*;
			ftMildNot                   			: ftUnaryNot ( NOT IN ftUnaryNot )*;
				ftUnaryNot                  			: (FTNOT)? ftPrimaryWithOptions;
					ftPrimaryWithOptions        			: ftPrimary ftMatchOptions?;
					
						ftPrimary                   			: ftWords ftTimes? 
																| LPARSi ftSelection RPARSi 
																| ftExtensionSelection
																;
							ftWords                     			: ftWordsValue ftAnyallOption?;
								ftWordsValue                			: literal | (LBRACESi expr RBRACSi);
									literal                     			: numericLiteral | StringLiteral;
										numericLiteral              			: IntegerLiteral | DecimalLiteral | DoubleLiteral;
								ftAnyallOption              			: (ANY WORD?) | (ALL WORDS?) | PHRASE;
							ftTimes                     			: OCCURS ftRange TIMES;
								ftRange                     			: (EXACTLY additiveExpr)
                        												| (AT LEAST additiveExpr)
                       					 								| (AT MOST additiveExpr)
										                                | (FROM additiveExpr TO additiveExpr);
//									additiveExpr# 							: #SE comparisonExpr (ftContainsExpr -> rangeExpr)#
//							ftSelection# 							: #PÅ EGET (DETTE)#
							ftExtensionSelection        			: pragma+ LBRACESi ftSelection? RBRACSi;
								pragma                      			: LPRAGSi S? qName (S pragmaContents)? RPRAGSi; /* ws: explicit */
									pragmaContents        					: m=ZeroOrMoreChar				{ !$m.getText().contains("#") }?
//								ftSelection# 							: #PÅ EGET (DETTE)#
								
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


	validateExpr                			: VALIDATE validationMode? LBRACESi expr RBRACSi;
		validationMode              			: LAX | STRICT;
//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle#								: #PÅ EGET#
			
			
	pathExpr                    			: (DBLSLASHSi relativePathExpr)=> DBLSLASHSi relativePathExpr 
											| (SLASHSi relativePathExpr) => SLASHSi relativePathExpr
											| SLASHSi
											| relativePathExpr;
		relativePathExpr            			: stepExpr ((SLASHSi | DBLSLASHSi) stepExpr)*;		
			stepExpr                    			: filterExpr | axisStep;
//				filterExpr#								: #PÅ EGET#
			axisStep                    			: (reverseStep | forwardStep) predicateList;
			
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
                	predicate                   			: LBRACKSi expr RBRACKSi;
//						expr                        			: exprSingle (COMMASi exprSingle)*;
//							exprSingle#								: #PÅ EGET#            									
				
    
    extensionExpr               			: pragma+ LBRACESi expr? RBRACSi; 
//    	pragma                      			: LPRAGSi S? qName (S pragmaContents)? RPRAGSi; 							/* ws: explicit */  
//    		pragmaContents        					: m=ZeroOrMoreChar				{ !$m.getText().contains("#") }?;
//		expr                        			: exprSingle (COMMASi exprSingle)*;
//			exprSingle#								: #PÅ EGET#            									


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
		varRef                      			: DOLLARSi varName;
//			varName                     			: qName;
		parenthesizedExpr           			: LPARSi expr? RPARSi;
//			expr                        			: exprSingle (COMMASi exprSingle)*;
//				exprSingle#								: #PÅ EGET#
		contextItemExpr             			: DOTSi;
		functionCall                			: qName LPARSi /* xgc: reserved-function-namesXQ */
													(exprSingle (COMMASi exprSingle)*)? 
													RPARSi; 
//			exprSingle#								: #PÅ EGET#
		orderedExpr                 			: ORDERED LBRACESi expr RBRACSi;
//			expr                        			: exprSingle (COMMASi exprSingle)*;
//				exprSingle#								: #PÅ EGET#
		unorderedExpr               			: UNORDERED LBRACESi expr RBRACSi;	
//			expr                        			: exprSingle (COMMASi exprSingle)*;
//				exprSingle#								: #PÅ EGET#
		constructor                 			: directConstructor | computedConstructor;	
		
												
			directConstructor           			: dirElemConstructor
					                                | dirCommentConstructor
                									| dirPIConstructor;
                									
            	dirElemConstructor          			: LTSi qName dirAttributeList 			/* ws: explicitXQ */
            											(RSELFTERMSi 
            											| GTSi dirElemContent* LENDTAGSi qName S? GTSi); 
            		dirAttributeList            			: (S (qName S? EQSi S? dirAttributeValue)?)*; 	/* ws: explicitXQ */
            			dirAttributeValue           			: DBLQUOTSi   /* ws: explicitXQ */
            														(EscapeQuot | quotAttrValueContent)* 
            														DBLQUOTSi
                												| SQUOTSi 
                													(EscapeApos | aposAttrValueContent)* 
                													SQUOTSi; 
                			quotAttrValueContent	    			: QuotAttrContentChar | commonContent;
                				commonContent               			: PredefinedEntityRef|CharRef|LDBLBRACSi|RDBLBRACSi|enclosedExpr;
//                					enclosedExpr                			: LBRACESi expr RBRACSi
//                						expr                        			: exprSingle (COMMASi exprSingle)*;
//											exprSingle#								: #PÅ EGET#
					dirElemContent              			: directConstructor | cDataSection | commonContent | ElementContentChar;
//						directConstructor#						: #SE filterExpr->primaryExpr->constructor->directConstructor#
						cDataSection                			: LCDATASi cDataSectionContents RCDATASi; 				/* ws: explicitXQ */
							cDataSectionContents        			: m=ZeroOrMoreChar			{ !$m.getText().contains("]]>") }?  ;
//         				commonContent               			: PredefinedEntityRef | CharRef | LDBLBRACSi| RDBLBRACSi| enclosedExpr;
//            				enclosedExpr                			: LBRACESi expr RBRACSi
//            					expr                        			: exprSingle (COMMASi exprSingle)*;
//									exprSingle#								: #PÅ EGET#
					
				dirCommentConstructor       			: LCOMMENTSi dirCommentContents RCOMMENTSi;
					dirCommentContents             			: (CharNotMinus | MINUSSi CharNotMinus)*; 		/* ws: explicitXQ */ 
				
				dirPIConstructor            			: LPISi piTarget (S dirPIContents)? RPISi; 	/* ws:explicitXQ */
					piTarget            					: n=Name 					{ !$n.getText().equalsIgnoreCase("XML") }?;
					dirPIContents               			: m=ZeroOrMoreChar			{ !$m.getText().contains("?>") }?  ;
				
				
			computedConstructor         			: compDocConstructor
					                                | compElemConstructor
					                                | compAttrConstructor
					                                | compTextConstructor
					                                | compCommentConstructor
					                                | compPIConstructor; 
			
				compDocConstructor          			: DOCUMENT LBRACESi expr RBRACSi;
//					expr                        			: exprSingle (COMMASi exprSingle)*;
//						exprSingle#								: #PÅ EGET#
				
				compElemConstructor         			: ELEMENT (qName | LBRACESi expr RBRACSi) 
															LBRACESi contentExpr? RBRACSi;
//					expr                        			: exprSingle (COMMASi exprSingle)*;
//						exprSingle#								: #PÅ EGET#
					contentExpr                 			: expr;																
//						expr                        			: exprSingle (COMMASi exprSingle)*;
//							exprSingle#								: #PÅ EGET#
				
				compAttrConstructor         			: ATTRIBUTE (qName | (LBRACESi expr RBRACSi)) 
															LBRACESi expr? RBRACSi;									
				
				compTextConstructor         			: TEXT LBRACESi expr RBRACSi;
				
				compCommentConstructor      			: COMMENT LBRACESi expr RBRACSi;
				
				compPIConstructor           			: PROCESSING_INSTRUCTION (NCName | (LBRACESi expr RBRACSi)) 
															LBRACESi expr? RBRACSi;
															
//	predicateList               			: predicate*;
//		predicate                   			: LBRACKSi expr RBRACKSi;   	


//---------------------------------------------------- Lexer ---------------------------------------------------
LCDATASi 				: '<![CDATA[';
LCOMMENTSi 				: '<!--';
LPISi 					: '<?';
LENDTAGSi 				: '</';
NODEBEFORESi 			: '<<';
LTOREQSi 				: '<=';
LTSi 					: '<';

GTOREQSi 				: '>=';
NODEAFTERSi 			: '>>';
GTSi 					: '>';

LPRAGSi 				: '(#';
LPARSi 					: '(';
LXQCOMMENTSi			: '(:';

DOTDOTSi 				: '..';
DOTSi 					: '.';

DBLCOLONSi 				: '::';
RXQCOMMENTSi			: ':)';
ASSIGNSi 				: ':=';
COLONSi 				: ':';

DBLSLASHSi 				: '//';
RSELFTERMSi 			: '/>';
SLASHSi 				: '/';

LDBLBRACSi 				: '{{';
LBRACESi 				: '{';
RDBLBRACSi 				: '}}';
RBRACSi 				: '}';

RPISi 					: '?>';
QUESTIONSi 				: '?';

RCOMMENTSi 				: '-->';
MINUSSi 				: '-';

RCDATASi 				: ']]>';
RBRACKSi 				: ']';

EQSi 					: '=';
NEQSi 					: '!=';
DOLLARSi 				: '$';
RPRAGSi 				: '#)';
DBLQUOTSi 				: '"';
SEMICOLONSi 			: ';';
SQUOTSi 				: '\'';
UNDERSCORE 				: '_';
COMMASi 				: ',';
PLUSSi 					: '+';
STARSi 					: '*';
LBRACKSi 				: '[';
RPARSi 					: ')';
ATSi 					: '@';
PIPESi 					: '|';



ASCENDING 				: 'ascending';
IDIV 					: 'idiv';
WHERE 					: 'where';
PHRASE 					: 'phrase';
CONTENT 				: 'content';
VERSION 				: 'version';
STOP 					: 'stop';
TYPESWITCH 				: 'typeswitch';
ANY 					: 'any';
BOUNDARYSPACE 			: 'boundary-space';
XQUERY 					: 'xquery';
CAST 					: 'cast';
DISTANCE 				: 'distance';
ORDERED 				: 'ordered';
DOCUMENTNODE 			: 'document-node';
ELSE 					: 'else';
TREAT 					: 'treat';
UPPERCASE 				: 'uppercase';
ALL 					: 'all';
WORD 					: 'words';
INHERIT 				: 'inherit';
ORDERING 				: 'ordering';
EVERY 					: 'every';
CASTABLE 				: 'castable';
ITEM 					: 'item';
FOR 					: 'for';
INSTANCE 				: 'instance';
EXCEPT 					: 'except';
TO 						: 'to';
CONSTRUCTION 			: 'construction';
WEIGHT 					: 'weight';
FTOPTION 				: 'ft-option';
SATISFIES 				: 'satisfies';
WORD 					: 'word';
EMPTY 					: 'empty';
MOST 					: 'most';
CASE 					: 'case';
PROCESSING_INSTRUCTION 	: 'processing-instruction';
IMPORT 					: 'import';
DOCUMENT 				: 'document';
VALIDATE 				: 'validate';
EMPTY_SEQUENCE 			: 'empty-sequence';
INSENSITIVE 			: 'insensitive';
NOPRESERVE 				: 'no-preserve';
THEN 					: 'then';
LET 					: 'let';
WINDOW 					: 'window';
SCORE 					: 'score';
LANGUAGE 				: 'language';
OPTION 					: 'option';
STEMMING 				: 'stemming';
GREATEST 				: 'greatest';
LEVELS 					: 'levels';
SENSITIVE 				: 'sensitive';
FTNOT 					: 'ftnot';
DIV 					: 'div';
FTAND 					: 'ftand';
AT 						: 'at';
SCHEMAATTRIBUTE 		: 'schema-attribute';
ORDER 					: 'order';
OF 						: 'of';
UNION 					: 'union';
FROM 					: 'from';
COLLATION 				: 'collation';
VARIABLE 				: 'variable';
OR 						: 'or';
FTOR 					: 'ftor';
LEAST 					: 'least';
IF 						: 'if';
BASEURI 				: 'base-uri';
DESCENDING 				: 'descending';
NAMESPACE 				: 'namespace';
AS 						: 'as';
BY 						: 'by';
TEXT 					: 'text';
STABLE 					: 'stable';
UNORDERED 				: 'unordered';
EXACTLY 				: 'exactly';
WITH 					: 'with';
WITHOUT 				: 'without';
DIACRITICS 				: 'diacritics';
EXTERNAL 				: 'external';
MODULE 					: 'module';
RETURN 					: 'return';
COMMENT 				: 'comment';
DEFAULT 				: 'default';
OCCURS 					: 'occurs';
ENCODING 				: 'encoding';
SCHEMA 					: 'schema';
ELEMENT 				: 'element';
COPYNAMESPACES 			: 'copy-namespaces';
WILDCARDS 				: 'wildcards';
DECLARE			 		: 'declare';
AND 					: 'and';
PRESERVE 				: 'preserve';
NOINHERIT 				: 'no-inherit';
NOT 					: 'not';
INTERSECT 				: 'intersect';
FUNCTION 				: 'function';
TIMES 					: 'times';
ATTRIBUTE 				: 'attribute';
FTCONTAINS 				: 'ftcontains';
RELATIONSHIP 			: 'relationship';
THESAURUS 				: 'thesaurus';
MOD 					: 'mod';
NODE 					: 'node';
SOME 					: 'some';
STRIP 					: 'strip';
LOWERCASE 				: 'lowercase';
IN 						: 'in';
SCHEMAELEMENT 			: 'schema-element';
STEMMING 				: 'stemming';
EQ 						: 'eq';
NE 						: 'ne';
LT 						: 'lt';
LE 						: 'le';
GT 						: 'gt';
GE 						: 'ge';
IS 						: 'is';
LAX 					: 'lax';
STRICT 					: 'strict';
CHILD 					: 'child';
DESCENDANT 				: 'descendant';
SELF 					: 'self';
DESCENDANT_OR_SELF 		: 'descendant-or-self';
FOLLOWING_SIBLING 		: 'following-sibling';
FOLLOWING 				: 'following';
PARENT 					: 'parent';
ANCESTOR 				: 'ancestor';
PRECEDING_SIBLING 		: 'preceding-sibling';
PRECEDING 				: 'preceding';
ANCESTOR_OR_SELF 		: 'ancestor-or-self';
WORDS 					: 'words';
SENTENCES 				: 'sentences';
PARAGRAPHS 				: 'paragraphs';
SENTENCE 				: 'sentence';
PARAGRAPH 				: 'paragraph';
SAME 					: 'same';
DIFFERENT 				: 'different';
START 					: 'start';
END 					: 'end';
ENTIRE 					: 'entire';


NCName              					: NCNameStartChar NCNameChar*;
fragment NCNameChar					   	: Letter | Digit | DOTSi | MINUSSi | UNDERSCORE | CombiningChar | Extender;
fragment NCNameStartChar     			: Letter | UNDERSCORE;

StringLiteral	    					: DBLQUOTSi 
											(PredefinedEntityRef | CharRef | EscapeQuot | ~(DBLQUOTSi|'&'))* 
											DBLQUOTSi 
										| SQUOTSi 
											(PredefinedEntityRef | CharRef | EscapeApos | ~(SQUOTSi|'&'))* 
											SQUOTSi
										;

Comment            						: LXQCOMMENTSi (CommentCheck)* RXQCOMMENTSi 							{$channel=HIDDEN;};
fragment CommentCheck					: (Comment)=> Comment
fragment CommentContents	    		: m=OneOrMoreChar 									{((!$m.equals("(:")) && (!$m.equals(":)") ))}?;

CharRef             					: '&#' ('0'..'9')+ SEMICOLONSi 
										| '&#x' ('0'..'9'|'a'..'f'|'A'..'F')+ SEMICOLONSi;

S                   					: ('\u0020' | '\u0009' | '\u000D' | '\u000A')+		{$channel=HIDDEN;};


IntegerLiteral  	    				: Digits;
	
DecimalLiteral      					: DOTSi Digits 
										| Digits DOTSi ('0'..'9')*
										;
DoubleLiteral    		   				: 	(
											DOTSi Digits 
											| Digits ( DOTSi ('0'..'9')* )?
											) 
											('e'|'E') (PLUSSi|MINUSSi)? Digits
										;
	
									
fragment CleanChar						: ~('\u0001'..'\u0008' | '\u000B' | '\u000C' | '\u000E'..'\u001F' | '\uD800'..'\uDFFF' 
										| '\uFFFE' | '\uFFFF' | '{' | '}' | '<' | '&' | '"' | '\'' | '-' );
fragment Char							: CleanChar | '{' | '}' | '<' | '&' | '"' | '\'' | '-' ;

fragment ElementContentChar				: CleanChar | '"' | '\'' | '-';						//KOMMER ALDRI HIT
fragment QuotAttrContentChar			: CleanChar | '\'' | '-' ;							//
fragment AposAttrContentChar			: CleanChar | '"' | '-' ;							//
 
// Denne brukes bare i PITarget
fragment NameChar            			: Letter | Digit | DOTSi | MINUSSi | UNDERSCORE | COLONSi | CombiningChar | Extender;
fragment Name                			: (Letter | UNDERSCORE | COLONSi) (NameChar)*;

fragment ZeroOrMoreChar		    		: Char*;
fragment OneOrMoreChar		    		: Char+;
fragment CharNotMinus					: CleanChar | '{' | '}' | '<' | '&' | '"' | '\'';

fragment PredefinedEntityRef	 		: '&' ('lt' | 'gt' | 'amp' | 'quot' | 'apos') SEMICOLONSi;
fragment EscapeQuot      	    		: '""';
fragment EscapeApos 	      	   		: '\'\'';

fragment Digits              			: ('0'..'9')+;
//fragment Digit							: "Tall + asiatiske tall" 						//Tungvint
fragment Digit               			: '\u0030'..'\u0039' | '\u0660'..'\u0669' | '\u06F0'..'\u06F9' | '\u0966'..'\u096F' | '\u09E6'..'\u09EF' | '\u0A66'..'\u0A6F' | '\u0AE6'..'\u0AEF' | '\u0B66'..'\u0B6F' | '\u0BE7'..'\u0BEF' | '\u0C66'..'\u0C6F' | '\u0CE6'..'\u0CEF' | '\u0D66'..'\u0D6F' | '\u0E50'..'\u0E59' | '\u0ED0'..'\u0ED9' | '\u0F20'..'\u0F29' ;

fragment Letter							: BaseChar | Ideographic ;
//fragment BaseChar 					: "Bokstaver"
fragment BaseChar            			: '\u0041'..'\u005A' | '\u0061'..'\u007A' | '\u00C0'..'\u00D6' | '\u00D8'..'\u00F6' | '\u00F8'..'\u00FF' | '\u0100'..'\u0131' | '\u0134'..'\u013E' | '\u0141'..'\u0148' | '\u014A'..'\u017E' | '\u0180'..'\u01C3' | '\u01CD'..'\u01F0' | '\u01F4'..'\u01F5' | '\u01FA'..'\u0217' | '\u0250'..'\u02A8' | '\u02BB'..'\u02C1' | '\u0386' | '\u0388'..'\u038A' | '\u038C' | '\u038E'..'\u03A1' | '\u03A3'..'\u03CE' | '\u03D0'..'\u03D6' | '\u03DA' | '\u03DC' | '\u03DE' | '\u03E0' | '\u03E2'..'\u03F3' | '\u0401'..'\u040C' | '\u040E'..'\u044F' | '\u0451'..'\u045C' | '\u045E'..'\u0481' | '\u0490'..'\u04C4' | '\u04C7'..'\u04C8' | '\u04CB'..'\u04CC' | '\u04D0'..'\u04EB' | '\u04EE'..'\u04F5' | '\u04F8'..'\u04F9' | '\u0531'..'\u0556' | '\u0559' | '\u0561'..'\u0586' | '\u05D0'..'\u05EA' | '\u05F0'..'\u05F2' | '\u0621'..'\u063A' | '\u0641'..'\u064A' | '\u0671'..'\u06B7' | '\u06BA'..'\u06BE' | '\u06C0'..'\u06CE' | '\u06D0'..'\u06D3' | '\u06D5' | '\u06E5'..'\u06E6' | '\u0905'..'\u0939' | '\u093D' | '\u0958'..'\u0961' | '\u0985'..'\u098C' | '\u098F'..'\u0990' | '\u0993'..'\u09A8' | '\u09AA'..'\u09B0' | '\u09B2' | '\u09B6'..'\u09B9' | '\u09DC'..'\u09DD' | '\u09DF'..'\u09E1' | '\u09F0'..'\u09F1' | '\u0A05'..'\u0A0A' | '\u0A0F'..'\u0A10' | '\u0A13'..'\u0A28' | '\u0A2A'..'\u0A30' | '\u0A32'..'\u0A33' | '\u0A35'..'\u0A36' | '\u0A38'..'\u0A39' | '\u0A59'..'\u0A5C' | '\u0A5E' | '\u0A72'..'\u0A74' | '\u0A85'..'\u0A8B' | '\u0A8D' | '\u0A8F'..'\u0A91' | '\u0A93'..'\u0AA8' | '\u0AAA'..'\u0AB0' | '\u0AB2'..'\u0AB3' | '\u0AB5'..'\u0AB9' | '\u0ABD' | '\u0AE0' | '\u0B05'..'\u0B0C' | '\u0B0F'..'\u0B10' | '\u0B13'..'\u0B28' | '\u0B2A'..'\u0B30' | '\u0B32'..'\u0B33' | '\u0B36'..'\u0B39' | '\u0B3D' | '\u0B5C'..'\u0B5D' | '\u0B5F'..'\u0B61' | '\u0B85'..'\u0B8A' | '\u0B8E'..'\u0B90' | '\u0B92'..'\u0B95' | '\u0B99'..'\u0B9A' | '\u0B9C' | '\u0B9E'..'\u0B9F' | '\u0BA3'..'\u0BA4' | '\u0BA8'..'\u0BAA' | '\u0BAE'..'\u0BB5' | '\u0BB7'..'\u0BB9' | '\u0C05'..'\u0C0C' | '\u0C0E'..'\u0C10' | '\u0C12'..'\u0C28' | '\u0C2A'..'\u0C33' | '\u0C35'..'\u0C39' | '\u0C60'..'\u0C61' | '\u0C85'..'\u0C8C' | '\u0C8E'..'\u0C90' | '\u0C92'..'\u0CA8' | '\u0CAA'..'\u0CB3' | '\u0CB5'..'\u0CB9' | '\u0CDE' | '\u0CE0'..'\u0CE1' | '\u0D05'..'\u0D0C' | '\u0D0E'..'\u0D10' | '\u0D12'..'\u0D28' | '\u0D2A'..'\u0D39' | '\u0D60'..'\u0D61' | '\u0E01'..'\u0E2E' | '\u0E30' | '\u0E32'..'\u0E33' | '\u0E40'..'\u0E45' | '\u0E81'..'\u0E82' | '\u0E84' | '\u0E87'..'\u0E88' | '\u0E8A' | '\u0E8D' | '\u0E94'..'\u0E97' | '\u0E99'..'\u0E9F' | '\u0EA1'..'\u0EA3' | '\u0EA5' | '\u0EA7' | '\u0EAA'..'\u0EAB' | '\u0EAD'..'\u0EAE' | '\u0EB0' | '\u0EB2'..'\u0EB3' | '\u0EBD' | '\u0EC0'..'\u0EC4' | '\u0F40'..'\u0F47' | '\u0F49'..'\u0F69' | '\u10A0'..'\u10C5' | '\u10D0'..'\u10F6' | '\u1100' | '\u1102'..'\u1103' | '\u1105'..'\u1107' | '\u1109' | '\u110B'..'\u110C' | '\u110E'..'\u1112' | '\u113C' | '\u113E' | '\u1140' | '\u114C' | '\u114E' | '\u1150' | '\u1154'..'\u1155' | '\u1159' | '\u115F'..'\u1161' | '\u1163' | '\u1165' | '\u1167' | '\u1169' | '\u116D'..'\u116E' | '\u1172'..'\u1173' | '\u1175' | '\u119E' | '\u11A8' | '\u11AB' | '\u11AE'..'\u11AF' | '\u11B7'..'\u11B8' | '\u11BA' | '\u11BC'..'\u11C2' | '\u11EB' | '\u11F0' | '\u11F9' | '\u1E00'..'\u1E9B' | '\u1EA0'..'\u1EF9' | '\u1F00'..'\u1F15' | '\u1F18'..'\u1F1D' | '\u1F20'..'\u1F45' | '\u1F48'..'\u1F4D' | '\u1F50'..'\u1F57' | '\u1F59' | '\u1F5B' | '\u1F5D' | '\u1F5F'..'\u1F7D' | '\u1F80'..'\u1FB4' | '\u1FB6'..'\u1FBC' | '\u1FBE' | '\u1FC2'..'\u1FC4' | '\u1FC6'..'\u1FCC' | '\u1FD0'..'\u1FD3' | '\u1FD6'..'\u1FDB' | '\u1FE0'..'\u1FEC' | '\u1FF2'..'\u1FF4' | '\u1FF6'..'\u1FFC' | '\u2126' | '\u212A'..'\u212B' | '\u212E' | '\u2180'..'\u2182' | '\u3041'..'\u3094' | '\u30A1'..'\u30FA' | '\u3105'..'\u312C' | '\uAC00'..'\uD7A3';
//fragment Ideographic         			: "Asiatiske tegn"
fragment Ideographic        			: '\u4E00'..'\u9FA5' | '\u3007' | '\u3021'..'\u3029'; 
//fragment CombiningChar     			: "Astatiske hjelpetegn"
fragment CombiningChar       			: '\u0300'..'\u0345' | '\u0360'..'\u0361' | '\u0483'..'\u0486' | '\u0591'..'\u05A1' | '\u05A3'..'\u05B9' | '\u05BB'..'\u05BD' | '\u05BF' | '\u05C1'..'\u05C2' | '\u05C4' | '\u064B'..'\u0652' | '\u0670' | '\u06D6'..'\u06DC' | '\u06DD'..'\u06DF' | '\u06E0'..'\u06E4' | '\u06E7'..'\u06E8' | '\u06EA'..'\u06ED' | '\u0901'..'\u0903' | '\u093C' | '\u093E'..'\u094C' | '\u094D' | '\u0951'..'\u0954' | '\u0962'..'\u0963' | '\u0981'..'\u0983' | '\u09BC' | '\u09BE' | '\u09BF' | '\u09C0'..'\u09C4' | '\u09C7'..'\u09C8' | '\u09CB'..'\u09CD' | '\u09D7' | '\u09E2'..'\u09E3' | '\u0A02' | '\u0A3C' | '\u0A3E' | '\u0A3F' | '\u0A40'..'\u0A42' | '\u0A47'..'\u0A48' | '\u0A4B'..'\u0A4D' | '\u0A70'..'\u0A71' | '\u0A81'..'\u0A83' | '\u0ABC' | '\u0ABE'..'\u0AC5' | '\u0AC7'..'\u0AC9' | '\u0ACB'..'\u0ACD' | '\u0B01'..'\u0B03' | '\u0B3C' | '\u0B3E'..'\u0B43' | '\u0B47'..'\u0B48' | '\u0B4B'..'\u0B4D' | '\u0B56'..'\u0B57' | '\u0B82'..'\u0B83' | '\u0BBE'..'\u0BC2' | '\u0BC6'..'\u0BC8' | '\u0BCA'..'\u0BCD' | '\u0BD7' | '\u0C01'..'\u0C03' | '\u0C3E'..'\u0C44' | '\u0C46'..'\u0C48' | '\u0C4A'..'\u0C4D' | '\u0C55'..'\u0C56' | '\u0C82'..'\u0C83' | '\u0CBE'..'\u0CC4' | '\u0CC6'..'\u0CC8' | '\u0CCA'..'\u0CCD' | '\u0CD5'..'\u0CD6' | '\u0D02'..'\u0D03' | '\u0D3E'..'\u0D43' | '\u0D46'..'\u0D48' | '\u0D4A'..'\u0D4D' | '\u0D57' | '\u0E31' | '\u0E34'..'\u0E3A' | '\u0E47'..'\u0E4E' | '\u0EB1' | '\u0EB4'..'\u0EB9' | '\u0EBB'..'\u0EBC' | '\u0EC8'..'\u0ECD' | '\u0F18'..'\u0F19' | '\u0F35' | '\u0F37' | '\u0F39' | '\u0F3E' | '\u0F3F' | '\u0F71'..'\u0F84' | '\u0F86'..'\u0F8B' | '\u0F90'..'\u0F95' | '\u0F97' | '\u0F99'..'\u0FAD' | '\u0FB1'..'\u0FB7' | '\u0FB9' | '\u20D0'..'\u20DC' | '\u20E1' | '\u302A'..'\u302F' | '\u3099' | '\u309A';
//fragment Extender            			: "Asiatiske talltillegg?"
fragment Extender    			        : '\u00B7' | '\u02D0' | '\u02D1' | '\u0387' | '\u0640' | '\u0E46' | '\u0EC6' | '\u3005' | '\u3031'..'\u3035' | '\u309D'..'\u309E' | '\u30FC'..'\u30FE';
							