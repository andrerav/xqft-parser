//--------------------------------------------------------- DONE -----------------------------------------

sequenceType                			: (itemType occurrenceIndicator) => itemType occurrenceIndicator
										| itemType
										| EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi
										;
	itemType                    			: (kindTest | (ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi) | atomicType);
		kindTest                    			: documentTest
				                                | elementTest
                				                | attributeTest
                               					| schemaElementTest
				                                | schemaAttributeTest
                				                | piTest
				                                | commentTest
                				                | textTest
                                				| anyKindTest;
			documentTest                			: DOCUMENTNODE LEFTPARENTHESISSi (elementTest | schemaElementTest)? RIGHTPARENTHESISSi;
				elementTest  			            	: ELEMENT LEFTPARENTHESISSi (elementNameOrWildcard (COMMASi typeName QUESTIONMARKSi?)?)? RIGHTPARENTHESISSi;                                				
					elementNameOrWildcard       			: elementName | STARSi;
						elementName                 			: qName;
					typeName                    			: qName;
				schemaElementTest           		 	: SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi;
					elementDeclaration          			: elementName;
						elementName                 			: qName; //DOBBELT OPP
			elementTest                 			: ELEMENT LEFTPARENTHESISSi (elementNameOrWildcard (COMMASi typeName QUESTIONMARKSi?)?)? RIGHTPARENTHESISSi; //DOBBELT OPP
				elementNameOrWildcard       			: elementName | STARSi; //DOBBELT OPP
						elementName                 			: qName; //DOBBELT OPP
				typeName                    			: qName; //DOBBELT OPP
			attributeTest               			: ATTRIBUTE LEFTPARENTHESISSi (attribNameOrWildcard (COMMASi typeName)?)? RIGHTPARENTHESISSi;
				attribNameOrWildcard        			: attributeName | STARSi;
					attributeName               			: qName;
				typeName                    			: qName;
			schemaElementTest           			: SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi;
				elementDeclaration          			: elementName;
					elementName                 			: qName; //DOBBELT OPP
			schemaAttributeTest         			: SCHEMAATTRIBUTE LEFTPARENTHESISSi attributeDeclaration RIGHTPARENTHESISSi;
				attributeDeclaration        			: attributeName;
					attributeName               			: qName; //DOBBELT OPP
			piTest                      			: PROCESSING_INSTRUCTION LEFTPARENTHESISSi (NCName | StringLiteral)? RIGHTPARENTHESISSi;
			commentTest                 			: COMMENT LEFTPARENTHESISSi RIGHTPARENTHESISSi;
			textTest                    			: TEXT LEFTPARENTHESISSi RIGHTPARENTHESISSi;
			anyKindTest                 			: NODE LEFTPARENTHESISSi RIGHTPARENTHESISSi;
	occurrenceIndicator         			: QUESTIONMARKSi | STARSi | PLUSSi; /* xgc: occurrence-indicatorsXQ */