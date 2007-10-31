//-------------------------------------------------------- DONE ------------------------------------------------------

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
											| WITH THESAURUS LEFTPARENTHESISSi (ftThesaurusID | DEFAULT) (COMMASi ftThesaurusID)* RIGHTPARENTHESISSi
			                                | WITHOUT THESAURUS
			                                ;
		ftThesaurusID               			: AT uriLiteral (RELATIONSHIP StringLiteral)? (ftRange LEVELS)?;
			uriLiteral                  			: StringLiteral; 						
			ftRange                     			: (EXACTLY additiveExpr) 				
    												| (AT LEAST additiveExpr)				
   					 								| (AT MOST additiveExpr) 				
					                                | (FROM additiveExpr TO additiveExpr)
					                                ;	
				additiveExpr# 							: #SE comparisonExpr (ftContainsExpr -> rangeExpr)#
				
				
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
												| LEFTPARENTHESISSi StringLiteral (COMMASi StringLiteral)* RIGHTPARENTHESISSi;
			uriLiteral                  			: StringLiteral; 				//DOBBELT OPP
		ftInclExclStringLiteral     			: (UNION | EXCEPT) ftRefOrList;
		
									
	ftExtensionOption           			: OPTION qName StringLiteral;
	
