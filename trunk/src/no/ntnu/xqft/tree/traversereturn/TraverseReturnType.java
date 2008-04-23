package no.ntnu.xqft.tree.traversereturn;

/**
 *  Part of simple type check system.
 * @author flassmeister
 *
 */
public enum TraverseReturnType {
	NUMERIC,					// e.g. 1 or 2.34
	TEXT,						// e.g. Stringlitterals and NCName
	NODESET,
//	FALSE, 						// Also empty set
//	TRUE,
//	EXPL_SET,					// Explicitly created set. e.g. (1, "a", <left/>)
//	TRUE_OR_FALSE,				// Evaluating this will yield true OR false  
//	TRUE_AND_FALSE,				// Evaluatiing this will yield true for some nodes false for other
//	REL_PATHEXPR,
//	ABS_PATHEXPR, NCName,
}
