//---------------------------------------------- DONE ----------------------------------------------------

valueExpr                   			: validateExpr | pathExpr | extensionExpr;


	validateExpr                			: VALIDATE validationMode? LEFTBRACESi expr RIGHTBRACESi;
		validationMode              			: LAX | STRICT;
		expr                        			: exprSingle (COMMASi exprSingle)*;
			exprSingle								: #PÅ EGET#
			
			
	pathExpr                    			: (DOUBLESLASH relativePathExpr)=> DOUBLESLASH relativePathExpr 
											| (SLASH relativePathExpr) => SLASH relativePathExpr
											| SLASH
											| relativePathExpr;
		relativePathExpr            			: stepExpr ((SLASH | DOUBLESLASH) stepExpr)*;		
			stepExpr                    			: filterExpr | axisStep;
				filterExpr#								: #PÅ EGET#
			axisStep                    			: (reverseStep | forwardStep) predicateList;
			
				reverseStep                 			: reverseAxis nodeTest | abbrevReverseStep;
					reverseAxis                 			: (PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF) DOUBLECOLON;
					nodeTest                    			: kindTest | nameTest;
						kindTest#								: #SE sequenceType->itemType->kindTest#
						nameTest                    			: qName | wildcard;
							wildcard                    			: (STARSi COLONSi NCName) => STARSi COLONSi NCName			/* ws: explicitXQ */
																	| STARSi
                                									| NCName COLONSi STARSi; 
                    abbrevReverseStep           			: DOTDOT;
                    
                forwardStep                 			: forwardAxis nodeTest | abbrevForwardStep;    
                	forwardAxis                 			: (CHILD | DESCENDANT | ATTRIBUTE | SELF 
                												|DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING) DOUBLECOLON;
					nodeTest                    			: kindTest | nameTest;
						kindTest#								: #SE sequenceType->itemType->kindTest#
						nameTest                    			: qName | wildcard;
							wildcard                    			: (STARSi COLONSi NCName) => STARSi COLONSi NCName			/* ws: explicitXQ */
																	| STARSi
                                									| NCName COLONSi STARSi; 
					abbrevForwardStep           			: ATSi? nodeTest;                	
                
                predicateList               			: predicate*;     									
                	predicate                   			: LEFTBRACKETSi expr RIGHTBRACKETSi;
						expr                        			: exprSingle (COMMASi exprSingle)*;
							exprSingle#								: #PÅ EGET#            									
				
    
    extensionExpr               			: pragma+ LEFTBRACESi expr? RIGHTBRACESi; 
    	pragma                      			: LEFTPRAGMA S? qName (S pragmaContents)? RIGHTPRAGMA; 							/* ws: explicit */  
    		pragmaContents        					: m=ZeroOrMoreChar				{ !$m.getText().contains("#") }?;
		expr                        			: exprSingle (COMMASi exprSingle)*;
			exprSingle#								: #PÅ EGET#            									
    	