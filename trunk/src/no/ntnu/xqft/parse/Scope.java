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
    protected SymTab<String, Symbol> symTab = null;

    /* Parent scope, or null if root */
    protected Scope parent = null;

    /* Child scopes */
    protected LinkedList<Scope> children = new LinkedList<Scope>();

    /**
     * Add a child to this scope 
     * 
     * @param child the child to add
     */
    public void addChild(Scope child) {

        // TODO: check if child already exist in list - might not be necessary
        if (!this.children.contains(child)) {
            this.children.add(child);
        }
        child.setParent(this);
    }
    
    /* Returns the first child in this scope */
    public Scope getFirstChild() {

        if (this.children.size() > 0) {
            return this.children.getFirst();
        }
        else {
            return null;
        }
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
        
        if (!parent.getChildren().contains(this)) {
            parent.addChild(this);
        }
    }

    /**
     * @return the symTab
     */
    public SymTab<String, Symbol> getSymTab() {
        return symTab;
    }

    /**
     * @param symTab the symTab to set
     */
    public void setSymTab(SymTab<String, Symbol> symTab) {
        this.symTab = symTab;
    }

    
    /**
     * Define a function with a parameter list
     * 
     * @param name
     * @param params
     */
    public void defineFunction(String name, LinkedList<Symbol> params) {
        // TODO: Check if function exists
    }
    
    /**
     * Define a function with a parameter list
     * 
     * @param name
     * @param params
     */
    public void defineVariable(String name, String value, int type) {
        
        // TODO: check if var exists first
        VariableSymbol var = new VariableSymbol();
        var.setName(name);
        var.setValue(value);
    }
    
    /**
     * @return the children
     */
    public LinkedList<Scope> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(LinkedList<Scope> children) {
        this.children = children;
    }
}
