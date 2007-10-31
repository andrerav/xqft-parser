//---------------------------------------------------- DONE ---------------------------------------------------

NCName              					: NCNameStartChar NCNameChar*;
fragment NCNameChar					   	: Letter | Digit | DOT | MINUSSi | UNDERSCORE | CombiningChar | Extender;
fragment NCNameStartChar     			: Letter | UNDERSCORE;

StringLiteral	    					: DOUBLEQUOTESi 
											(PredefinedEntityRef | CharRef | EscapeQuot | ~(DOUBLEQUOTESi|'&'))* 
											DOUBLEQUOTESi 
										| SINGLEQUOTE 
											(PredefinedEntityRef | CharRef | EscapeApos | ~(SINGLEQUOTE|'&'))* 
											SINGLEQUOTE
										;

Comment            						:'(:' (CommentCheck)* ':)' 							{$channel=HIDDEN;};
fragment CommentCheck					: (Comment)=> Comment
fragment CommentContents	    		: m=OneOrMoreChar 									{((!$m.equals("(:")) && (!$m.equals(":)") ))}?;

CharRef             					: '&#' ('0'..'9')+ SEMICOLONSi 
										| '&#x' ('0'..'9'|'a'..'f'|'A'..'F')+ SEMICOLONSi;

S                   					: ('\u0020' | '\u0009' | '\u000D' | '\u000A')+		{$channel=HIDDEN;};


IntegerLiteral  	    				: Digits;
	
DecimalLiteral      					: DOT Digits 
										| Digits DOT ('0'..'9')*
										;
DoubleLiteral    		   				: 	(
											DOT Digits 
											| Digits ( DOT ('0'..'9')* )?
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
fragment NameChar            			: Letter | Digit | DOT | MINUSSi | UNDERSCORE | COLONSi | CombiningChar | Extender;
fragment Name                			: (Letter | UNDERSCORE | COLONSi) (NameChar)*;

fragment ZeroOrMoreChar		    		: Char*;
fragment OneOrMoreChar		    		: Char+;
fragment CharNotMinus					: CleanChar | '{' | '}' | '<' | '&' | '"' | '\'';

fragment Letter							: BaseChar | Ideographic ;
fragment BaseChar 						: "Bokstaver"
fragment Ideographic         			: "Asiatiske tegn"
fragment CombiningChar     				: "Astatiske hjelpetegn"
fragment Digit							: "Tall + asiatiske tall" 						//Tungvint
fragment Digits              			: ('0'..'9')+;
fragment Extender            			: "Asiatiske talltillegg?"

fragment PredefinedEntityRef	 		: '&' ('lt' | 'gt' | 'amp' | 'quot' | 'apos') SEMICOLONSi;
fragment EscapeQuot      	    		: '""';
fragment EscapeApos 	      	   		: '\'\'';
