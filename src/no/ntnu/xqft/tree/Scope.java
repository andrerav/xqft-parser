/**
 * 
 */
package no.ntnu.xqft.tree;

import java.util.*;
import no.ntnu.xqft.tree.*;
import no.ntnu.xqft.tree.operator.*;

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
    private static Scope rootScope = instance;

    /* Looks up an entry in the symtab */
    protected static SymTabEntry get(String key) {
        return instance.getSym(key);
    }
    
    /* Sets an entry in the current symtab */
    protected static void set(String key, TraverseReturn node, boolean isIterationVar) {
        instance.setSym(key, node, isIterationVar);
    }
    
    /* Enter new scope */
    protected static void push() {
        Scope parent = instance;
        instance = new Scope();
        instance.setParent(parent);
        parent.addChild(instance);
    }
    
    protected static void push(boolean isFlworScope) {
        push();
        
        instance.isFlworScope = isFlworScope;
    }
    
    /* Jump out to previous scope */
    protected static void pop() {
        instance = instance.getParent();
    }
    
    /* FLWOR scope? */
    protected boolean isFlworScope = false;
    
    /* Parent scope, or null if root */
    protected Scope parent = null;

    /* Symbol table */
    protected SymTab<String, SymTabEntry> symTab = new SymTab<String, SymTabEntry>();

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
    public SymTab<String, SymTabEntry> getSymTab() {
        return symTab;
    }

    /**
     * @param symTab the symTab to set
     */
    public void setSymTab(SymTab<String, SymTabEntry> symTab) {
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
    public void setSym(String key, TraverseReturn node, boolean isIterationVar) {

        if (this.symTab.containsKey(key)) {
            //throw new ParseException("Variable \"" + name + "\" previously defined");
        }
        
        
        
        this.symTab.put(key, new SymTabEntry(node, isIterationVar, key));
    }
    
    /**
     * Performs a lookup in the symbol table(s) for this scope
     * Returns null if not found
     * 
     * @param key
     * @return A NodeReturn or null if no symbol found
     */
    public SymTabEntry getSym(String key) {

        /* See if this scope has symbol */
        if (this.symTab.get(key) != null) {
            return this.symTab.get(key);
        }
        
        /* See if parent has symbol (if parent exists) */
        else if (this.parent != null && this.parent.getSym(key) != null){

            // qx·y ($vx ) = πiter :inner ,pos,item(qx ($vx ) (X) iter =outer map(x,x·y))
            // map(x,x·y) = πouter :iter ,inner inner : iter ,pos (qx (ex·y ))

            //NodeSetReturn psym = (NodeSetReturn)this.parent.getSym(key);
            /*
            if (parent.isFlworScope) {

                Operator qx = this.parent.getSym(key).getTree();
                Operator map = new GenericOperator("map-relation");
                
                Project p = new Project("[iter=inner, pos, etc]", new MergeJoin("[documentId], [documentId]", qx, map));
                
                NodeSetReturn result = new NodeSetReturn(psym.getPathExpression(), false, p);
            }
            */
            return null;
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

    public static SymTab<String, SymTabEntry> getSymtab() {
        return instance.getSymTab();
    }
    
    public static void printPrettyString() {
        
        System.out.println(rootScope.toPrettyString(0));

    }
    
    public String toPrettyString(int level) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.symTab.toString(level));

        for (Scope child : this.children) {
            buffer.append(child.toPrettyString(++level));
        }
        
        return buffer.toString();
    }
}
