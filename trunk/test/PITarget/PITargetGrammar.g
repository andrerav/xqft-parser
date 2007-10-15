grammar PITargetGrammar;

/* PITarget : Name - (('X' | 'x') ('M' | 'm') ('L' | 'l')); */

PITarget : name=Name { !($name.equalsIgnoreCase("XML")) }?

Name     : ('a'..'z'|'A'..'Z')*
