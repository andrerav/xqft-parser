//----------------------------------------------------- DONE -------------------------------------------------------

module                     				: versionDecl? (libraryModule | mainModule);

	versionDecl                 			: XQUERY VERSION StringLiteral (ENCODING StringLiteral)? separator;
		separator                   			: SEMICOLONSi;
		
	libraryModule               			: moduleDecl prolog;
		moduleDecl                  			: MODULE NAMESPACE NCName EQUALSi uriLiteral separator;
			uriLiteral                  			: StringLiteral;
		prolog# 											: #PÅ EGET#
		
	mainModule                  			: prolog queryBody;
		prolog#									: #PÅ EGET#
		queryBody                   			: expr;
			expr                        			: exprSingle (COMMASi exprSingle)*;
				exprSingle#								: #PÅ EGET#
												

