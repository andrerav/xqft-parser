/**
 * 
 */
package no.ntnu.xqft.parse;

import java.util.*;

/**
 * Class scope
 * 
 * Represents a simple nestable XQuery scope
 * 
 * @author andreas, mads
 *
 */
public class Scope {
    
    /* Symbol table */
    protected SymTab symTab = null;
    
    /* Parent scope, or null if root */
    protected Scope parent = null;
    
    /* Child scopes */
    protected LinkedList<Scope> children = new LinkedList<Scope>();

    /**
     * Add a child to this scope 
     * 
     * @param child the child to add
     */
    protected void addChild(Scope child) {

        // TODO: check if child already exist in list - might not be necessary
        this.children.add(child);
    }

    /**
     * Returns the parent scope of this scope if any, or null if this
     * is a top-level scope
     * 
     * @return the parent
     */
    public Scope getParent() {
        return parent;
    }

    /**
     * Sets a parent for this scope, and adds this scope as a child to
     * the parent scope
     * 
     * @param parent the parent to set
     */
    public void setParent(Scope parent) {
        this.parent = parent;
        parent.addChild(this);
    }

    /**
     * @return the symTab
     */
    public SymTab getSymTab() {
        return symTab;
    }

    /**
     * @param symTab the symTab to set
     */
    public void setSymTab(SymTab symTab) {
        this.symTab = symTab;
    }
    
    public void defineFunc(String name, LinkedList<Symbol> params) {
        
    }
    
    
}
