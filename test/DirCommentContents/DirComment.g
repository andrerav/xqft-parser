grammar DirComment;
options {
k=2;

}

@members
{

public boolean sjekk(String s)
{
	System.out.println("sjekker " + s);
	if(s.equals("-")){
	System.out.println("er lik -");
	return false;
	}
	System.out.println("er ikke lik");
	return true;
}


}

INT: ('0'..'9')+;
CHAR   : '\u0009' | '\u000A' | '\u000D' | ('\u0020'..'\uD7FF') | ('\uE000'..'\uFFFD'); /* Dropped temporarily | [\u10000-\u10FFFF] */

//uttrykk	:(('-' (Char - '-')) | (Char - '-'))*;  ;
uttrykk		:	(('-' (charIkkeMinus)| (charIkkeMinus)))*;
fragment charIkkeMinus	:m=CHAR{ !$m.equals("-") }?;
