tree grammar FlassWalker;
options
{
tokenVocab=Flass;
ASTLabelType=CommonTree;
}

program		: setninger+;
setninger	: //expr {System.out.println("expr hoved");}
		 (expr {System.out.println("expr nren");})* (options {greedy=false;} : g=. {System.out.println("into the void: " + $g.text);})* (expr {System.out.println("expr ja");})*;
expr		: ^(EQSi Ord Tall) 			{System.out.println("fant assign " + $Ord.text + " " + $Tall.text);}
		| ^(IF Tall) 				{System.out.println("fant if : " + $Tall.text);}
		;