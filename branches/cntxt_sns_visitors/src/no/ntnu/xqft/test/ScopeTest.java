/**
 * 
 */
package no.ntnu.xqft.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import no.ntnu.xqft.parse.*;

/**
 * @author andreas
 *
 */
public class ScopeTest {

    protected Scope scope;
    
    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        this.scope = new Scope();
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test method for {@link no.ntnu.xqft.parse.Scope#addChild(no.ntnu.xqft.parse.Scope)}.
     */
    @Test
    public void testAddChild() {
        this.scope = new Scope();
        
        this.scope.addChild(new Scope());
        
        if (this.scope.getFirstChild() == null) {
            fail("Adding a child failed");
        }

    }

    /**
     * Test method for {@link no.ntnu.xqft.parse.Scope#getParent()}.
     */
    @Test
    public void testGetParent() {
        this.scope = new Scope();
        Scope tmp = new Scope();
        this.scope.addChild(tmp);
        
        assertEquals(tmp.getParent(), this.scope);
    }

    /**
     * Test method for {@link no.ntnu.xqft.parse.Scope#setParent(no.ntnu.xqft.parse.Scope)}.
     */
    @Test
    public void testSetParent() {
        this.scope = new Scope();
        Scope tmp = new Scope();
        this.scope.setParent(tmp);
        
        assertEquals(this.scope.getParent(), tmp);
    }

    /**
     * Test method for {@link no.ntnu.xqft.parse.Scope#getSymTab()} and {@link no.ntnu.xqft.parse.Scope#setSymTab(no.ntnu.xqft.parse.SymTab)}.
     */
    @Test
    public void testSetGetSymTab() {
        this.scope = new Scope();

        SymTab tmp = new SymTab();
        this.scope.setSymTab(tmp);
        
        assertEquals(tmp, this.scope.getSymTab());
    }

    /**
     * Test method for {@link no.ntnu.xqft.parse.Scope#defineFunction(java.lang.String, java.util.LinkedList)}.
     */
    @Test
    public void testDefineFunc() {
        //fail("Not yet implemented");
    }

}
