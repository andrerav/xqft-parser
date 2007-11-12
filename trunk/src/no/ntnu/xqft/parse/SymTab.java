/**
 * 
 */
package no.ntnu.xqft.parse;

import java.util.HashMap;

/**
 * Class SymTab
 * 
 * Represents a symbol table capable of scoping + forward references
 * 
 * 
 * @author andreas, mads
 *
 */
class SymTab extends HashMap {
    SymTab parent = null;
}
