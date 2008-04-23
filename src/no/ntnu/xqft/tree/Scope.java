/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;

import no.ntnu.xqft.tree.traversereturn.TraverseReturn;

/**
 * Class scope
 * 
 * Represents a simple nestable XQuery scope
 * 
 * @author andreas, mads
 *
 */
public class Scope {
    private static Scope instance = new Scope();

    /* Looks up an entry in the symtab */
    protected static TraverseReturn get(String key) {
        return instance.getSym(key);
    }
    
    /* Sets an entry in the current symtab */
    protected static void set(String key, TraverseReturn node) {
        instance.setSym(key, node);
    }
    
    /* Enter new scope */
    protected static void push() {
        Scope parent = instance;
        instance = new Scope();
        instance.setParent(parent);
        parent.addChild(instance);
    }
    
    /* Jump out to previous scope */
    protected static void pop() {
        instance = instance.getParent();
    }
    
    /* Parent scope, or null if root */
    protected Scope parent = null;

    /* Symbol table */
    protected SymTab<String, TraverseReturn> symTab = new SymTab<String, TraverseReturn>();

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
    public SymTab<String, TraverseReturn> getSymTab() {
        return symTab;
    }

    /**
     * @param symTab the symTab to set
     */
    public void setSymTab(SymTab<String, TraverseReturn> symTab) {
        this.symTab = symTab;
    }

    /**
     * Define a function with a parameter list
     * 
     * @param name
     * @param params
     */
    public void defineFunction(String name, LinkedList<TraverseReturn> params) {
        // TODO: Check if function exists
    }
    
    /**
     * Define a function with a parameter list
     * 
     * @param name
     * @param params
     */
    public void setSym(String key, TraverseReturn node) {

        if (this.symTab.containsKey(key)) {
            //throw new ParseException("Variable \"" + name + "\" previously defined");
        }
        
        this.symTab.put(key, node);
    }
    
    /**
     * Performs a lookup in the symbol table(s) for this scope
     * Returns null if not found
     * 
     * @param key
     * @return A NodeReturn or null if no symbol found
     */
    public TraverseReturn getSym(String key) {

        /* See if this scope has symbol */
        if (this.symTab.get(key) != null) {
            return this.symTab.get(key);
        }
        
        /* See if parent has symbol (if parent exists) */
        else if (this.parent != null && this.parent.getSym(key) != null){
            return this.parent.getSym(key);
        }
        
        /* Symbol not found */
        else {
            return null;
        }
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

    public static SymTab<String, TraverseReturn> getSymtab() {
        return instance.getSymTab();
    }
}
