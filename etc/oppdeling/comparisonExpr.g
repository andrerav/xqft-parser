//------------------------------------------------------- DONE -------------------------------------

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
												valueExpr# 								: #PÅ EGET#
											singleType                  			: atomicType QUESTIONMARKSi?;
												atomicType                  			: qName;
										singleType                  			: atomicType QUESTIONMARKSi?; 		//DOBBELT OPP
											atomicType                  			: qName; 						//DOBBELT OPP
									sequenceType# 							: #PÅ EGET#	
								sequenceType# 							: #PÅ EGET#		
		
		ftSelection								: #PÅ EGET#
		
		ftIgnoreOption              			: WITHOUT CONTENT unionExpr;
			unionExpr#								: #SE DETTE -> ftContainsExpr->rangeExpr->additiveExpr->miltiplicativeExpr->unionExpr#
	
	
	valueComp                   			: EQ | NE | LT | LE | GT | GE;
	
	
	generalComp                 			: EQUALSi | NOTEQUALSi | LESSTHANSi | LESSTHANOREQUALSi | BIGGERTHANSi | BIGGERTHANOREQUALSi;
	
	
	nodeComp                    			: IS | NODEBEFORESi | NODEAFTERSi;