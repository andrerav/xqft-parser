package no.ntnu.xqft.tree;

/**
 *  Part of simple type check system.
 * @author flassmeister
 *
 */
public enum NodeReturnType {
	NUMERIC,					// e.g. 1 or 2.34
	LITTERAL,					// e.g. "yes"  or  'can'
	FALSE, 						// Also empty set
	TRUE,
	EXPL_SET,					// Explicitly created set. e.g. (1, "a", <left/>)
	PRED_REL,				    // Predicate value dependent on context.  
	PRED_ABS,					// Predicate value dependent on context.
	REL_PATHEXPR,
	ABS_PATHEXPR,
}
