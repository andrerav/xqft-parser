grammar DirComment;
options {
k=1;

}

INT: ('0'..'9')+;
CHAR   : '\u0009' | '\u000A' | '\u000D' | ('\u0020'..'\uD7FF') | ('\uE000'..'\uFFFD'); /* Dropped temporarily | [\u10000-\u10FFFF] */

//uttrykk	:((Char ~ '-') | ('-' (Char ~ '-')))*;  ;
uttrykk		:	(('-' (CharIkkeMinus)| (CharIkkeMinus)))*;
fragment CharIkkeMinus	:	m=CHAR{ !$m.getText().contains("-") }?  ;