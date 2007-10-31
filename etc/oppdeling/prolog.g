//----------------------------------------------------- DONE ------------------------------------------

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
		
namespaceDecl               			: DECLARE NAMESPACE NCName EQUALSi uriLiteral;

importStmt                  			: schemaImport | moduleImport;
	schemaImport                			: IMPORT SCHEMA schemaPrefix? uriLiteral (AT uriLiteral (COMMASi uriLiteral)*)?;
		schemaPrefix                			: (NAMESPACE NCName EQUALSi) | (DEFAULT ELEMENT NAMESPACE);
	moduleImport                			: IMPORT MODULE (NAMESPACE NCName EQUALSi)? uriLiteral (AT uriLiteral (COMMASi uriLiteral)*)?;
	
varDecl                     			: DECLARE VARIABLE DOLLARSi qName typeDeclaration? ((ASSIGNMENTOPERATOR exprSingle) | EXTERNAL);
	qName						 			: (NCName COLONSi)? NCName;
	typeDeclaration             			: AS sequenceType;
		sequenceType# 							: #PÅ EGET#
	exprSingle# 							: #PÅ EGET#
	
functionDecl                			: DECLARE FUNCTION qName LEFTPARENTHESISSi paramList? RIGHTPARENTHESISSi 
											(AS sequenceType)? (enclosedExpr | EXTERNAL);
	paramList                   			: param (COMMASi param)*;
		param                       			: DOLLARSi qName typeDeclaration?;
			qName						 			: (NCName COLONSi)? NCName;			// DOBBELT OPP
			typeDeclaration             			: AS sequenceType;					// DOBBELT OPP
	sequenceType# 							: #PÅ EGET#
	enclosedExpr                			: LEFTBRACESi expr RIGHTBRACESi;
		expr                        			: exprSingle (COMMASi exprSingle)*;
			exprSingle# 							: #PÅ EGET#
			
optionDecl                  			: DECLARE OPTION qName StringLiteral;

ftOptionDecl                			: DECLARE FTOPTION ftMatchOptions;
	ftMatchOptions              			: ftMatchOption+;     /* xgc: multiple-match-options */
		ftMatchOption# 							: #PÅ EGET#
	