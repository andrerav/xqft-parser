//------------------------------------------------------- DONE ---------------------------------------------------------

filterExpr                  			: primaryExpr predicateList;


	primaryExpr                 			: literal 
											| varRef 
											| parenthesizedExpr 
											| contextItemExpr 
											| functionCall 
											| orderedExpr 
											| unorderedExpr 
											| constructor;
		
		literal                     			: numericLiteral | StringLiteral;
			numericLiteral              			: IntegerLiteral | DecimalLiteral | DoubleLiteral;
		varRef                      			: DOLLARSi varName;
			varName                     			: qName;
		parenthesizedExpr           			: LEFTPARENTHESISSi expr? RIGHTPARENTHESISSi;
			expr                        			: exprSingle (COMMASi exprSingle)*;
				exprSingle#								: #PÅ EGET#
		contextItemExpr             			: DOT;
		functionCall                			: qName LEFTPARENTHESISSi /* xgc: reserved-function-namesXQ */
													(exprSingle (COMMASi exprSingle)*)? 
													RIGHTPARENTHESISSi; 
			exprSingle#								: #PÅ EGET#
		orderedExpr                 			: ORDERED LEFTBRACESi expr RIGHTBRACESi;
			expr                        			: exprSingle (COMMASi exprSingle)*;
				exprSingle#								: #PÅ EGET#
		unorderedExpr               			: UNORDERED LEFTBRACESi expr RIGHTBRACESi;	
			expr                        			: exprSingle (COMMASi exprSingle)*;
				exprSingle#								: #PÅ EGET#
		constructor                 			: directConstructor | computedConstructor;	
		
												
			directConstructor           			: dirElemConstructor
					                                | dirCommentConstructor
                									| dirPIConstructor;
                									
            	dirElemConstructor          			: LESSTHANSi qName dirAttributeList 			/* ws: explicitXQ */
            											(RIGHTSELFTERMINATOR 
            											| BIGGERTHANSi dirElemContent* LEFTENDTAG qName S? BIGGERTHANSi); 
            		dirAttributeList            			: (S (qName S? EQUALSi S? dirAttributeValue)?)*; 	/* ws: explicitXQ */
            			dirAttributeValue           			: DOUBLEQUOTESi   /* ws: explicitXQ */
            														(EscapeQuot | quotAttrValueContent)* 
            														DOUBLEQUOTESi
                												| SINGLEQUOTE 
                													(EscapeApos | aposAttrValueContent)* 
                													SINGLEQUOTE; 
                			quotAttrValueContent	    			: QuotAttrContentChar | commonContent;
                				commonContent               			: PredefinedEntityRef|CharRef|DOUBLELEFTBRACES|DOUBLERIGHTBRACES|enclosedExpr;
                					enclosedExpr                			: LEFTBRACESi expr RIGHTBRACESi
                						expr                        			: exprSingle (COMMASi exprSingle)*;
											exprSingle#								: #PÅ EGET#
					dirElemContent              			: directConstructor | cDataSection | commonContent | ElementContentChar;
						directConstructor#						: #SE filterExpr->primaryExpr->constructor->directConstructor#
						cDataSection                			: LEFTCDATA cDataSectionContents RIGHTCDATA; 				/* ws: explicitXQ */
							cDataSectionContents        			: m=ZeroOrMoreChar			{ !$m.getText().contains("]]>") }?  ;
           				commonContent               			: PredefinedEntityRef | CharRef | DOUBLELEFTBRACES| DOUBLERIGHTBRACES| enclosedExpr;
            					enclosedExpr                			: LEFTBRACESi expr RIGHTBRACESi
            						expr                        			: exprSingle (COMMASi exprSingle)*;
										exprSingle#								: #PÅ EGET#
					
				dirCommentConstructor       			: LEFTXMLCOMMENT dirCommentContents RIGHTXMLCOMMENT;
					dirCommentContents             			: (CharNotMinus | MINUSSi CharNotMinus)*; 		/* ws: explicitXQ */ 
				
				dirPIConstructor            			: LEFTPITARGET piTarget (S dirPIContents)? RIGHTPITARGET; 	/* ws:explicitXQ */
					piTarget            					: n=Name 					{ !$n.getText().equalsIgnoreCase("XML") }?;
					dirPIContents               			: m=ZeroOrMoreChar			{ !$m.getText().contains("?>") }?  ;
				
				
			computedConstructor         			: compDocConstructor
					                                | compElemConstructor
					                                | compAttrConstructor
					                                | compTextConstructor
					                                | compCommentConstructor
					                                | compPIConstructor; 
			
				compDocConstructor          			: DOCUMENT LEFTBRACESi expr RIGHTBRACESi;
					expr                        			: exprSingle (COMMASi exprSingle)*;
						exprSingle#								: #PÅ EGET#
				
				compElemConstructor         			: ELEMENT (qName | LEFTBRACESi expr RIGHTBRACESi) 
															LEFTBRACESi contentExpr? RIGHTBRACESi;
					expr                        			: exprSingle (COMMASi exprSingle)*;
						exprSingle#								: #PÅ EGET#
					contentExpr                 			: expr;																
						expr                        			: exprSingle (COMMASi exprSingle)*;
							exprSingle#								: #PÅ EGET#
				
				compAttrConstructor         			: ATTRIBUTE (qName | (LEFTBRACESi expr RIGHTBRACESi)) 
															LEFTBRACESi expr? RIGHTBRACESi;									
				
				compTextConstructor         			: TEXT LEFTBRACESi expr RIGHTBRACESi;
				
				compCommentConstructor      			: COMMENT LEFTBRACESi expr RIGHTBRACESi;
				
				compPIConstructor           			: PROCESSING_INSTRUCTION (NCName | (LEFTBRACESi expr RIGHTBRACESi)) 
															LEFTBRACESi expr? RIGHTBRACESi;
															
	predicateList               			: predicate*;
		predicate                   			: LEFTBRACKETSi expr RIGHTBRACKETSi;