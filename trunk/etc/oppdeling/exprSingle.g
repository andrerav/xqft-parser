//---------------------------------------------------------- DONE ---------------------------------------------------------

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
			typeDeclaration             			: AS sequenceType;
				sequenceType# 							: #PÅ EGET#
			positionalVar               			: AT DOLLARSi varName;
				varName                    				: qName; 							//DOBBELT OPP
			ftScoreVar                  			: SCORE DOLLARSi varName;
				varName                    				: qName; 							//DOBBELT OPP
			exprSingle# 									: #PÅ EGET (DETTE)#
			
		letClause                   		: (
											 LET DOLLARSi varName typeDeclaration? 
											|LET SCORE DOLLARSi varName
											) 
											ASSIGNMENTOPERATOR exprSingle 
											(
											COMMASi 
												(
											  	DOLLARSi varName typeDeclaration? 
												| ftScoreVar
												) 
											ASSIGNMENTOPERATOR exprSingle
											)*;
			varName                    				: qName; 								//DOBBELT OPP
			typeDeclaration             			: AS sequenceType;
				sequenceType# 							: #PÅ EGET#
			exprSingle								: #PÅ EGET (DETTE)#
			ftScoreVar                  			: SCORE DOLLARSi varName; 				//DOBBELT OPP
				varName                    				: qName; 							//DOBBELT OPP
		
		whereClause                 		: WHERE exprSingle;	
			exprSingle#							: #PÅ EGET (DETTE)#
			
		orderByClause               		: (ORDER BY | STABLE ORDER BY) orderSpecList;
			orderSpecList               		: orderSpec (COMMASi orderSpec)*;
				orderSpec                   		: exprSingle orderModifier;
					exprSingle#							: #PÅ EGET (DETTE)#
					orderModifier               		: (ASCENDING | DESCENDING)? (EMPTY (GREATEST | LEAST))? (COLLATION uriLiteral)?;
						uriLiteral                  		: StringLiteral;
		
		exprSingle# 						: #PÅ EGET (DETTE)#
		

	quantifiedExpr              			: (SOME | EVERY) DOLLARSi varName typeDeclaration? IN exprSingle 
												(COMMASi DOLLARSi varName typeDeclaration? IN exprSingle)* SATISFIES exprSingle;			
		#SE forClause#
		
	
	typeswitchExpr              			: TYPESWITCH LEFTPARENTHESISSi expr RIGHTPARENTHESISSi caseClause+ 
												DEFAULT (DOLLARSi varName)? RETURN exprSingle;
		expr                        			: exprSingle (COMMASi exprSingle)*;
			exprSingle# 							: #PÅ EGET (DETTE)#
		caseClause                  			: CASE (DOLLARSi varName AS)? sequenceType RETURN exprSingle;
			varName                    				: qName; 									//DOBBELT OPP
			sequenceType#							: #PÅ EGET#
			exprSingle# 							: #PÅ EGET (DETTE)#
		varName                    				: qName; 										//DOBBELT OPP
		exprSingle# 							: #PÅ EGET (DETTE)#
	
	
	ifExpr                      			: IF LEFTPARENTHESISSi expr RIGHTPARENTHESISSi THEN exprSingle ELSE exprSingle;
		expr                        			: exprSingle (COMMASi exprSingle)*;
			exprSingle#								: #PÅ EGET (DETTE)#
		exprSingle# 								: #PÅ EGET (DETTE)#
		
		
	orExpr                      			: andExpr ( OR andExpr )*;
		andExpr                     			: comparisonExpr ( AND comparisonExpr )*;
			comparisonExpr# 						: #PÅ EGET#
			
			