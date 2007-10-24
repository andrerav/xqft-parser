/**
 * 
 */
package no.ntnu.xqft.test;

import no.ntnu.xqft.parse.*;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.*;

import org.junit.Before;
import org.junit.Test;

import org.antlr.*;
import org.antlr.runtime.*;

/**
 * @author andreas
 *
 */
public class XQFTParserTest extends TestCase {


    
    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        
    }
    
    /**
     * Creates a new parser for a specific xquery test fragment
     * 
     * @param fragment
     * @return An XQFTParser ready to be tested
     */
    private XQFTParser getNewParser(String fragment) {
        
        /* Base folder for fragments */
        String fragment_base = "./test/fragments";
        
        XQFTLexer lexer = null;
        
        try {
            lexer = new XQFTLexer(new ANTLRFileStream(fragment_base + "/" + fragment));
        } 
        catch(Exception e) {
            e.printStackTrace();
            System.out.println("Could not run unit tests, xquery fragments not found or other I/O error");
            System.exit(1);
        }
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        XQFTParser parser = new XQFTParser(tokens);  
        
        return parser;
    }


    /**
     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#piTarget()}.
     */
    @Test
    public void testPiTarget1() {
        XQFTParser parser = this.getNewParser("pitarget1.xq");
        
        try {
            parser.piTarget();
        } catch (RecognitionException e) {
            e.printStackTrace();
            fail(e.getMessage());
        }
    }

    /**
     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#piTarget()}.
     */
    @Test
    public void testPiTarget2() {
        XQFTParser parser = this.getNewParser("pitarget2.xq");
        
        try {
            parser.piTarget();
        } catch (RecognitionException e) {

            // This means the test passed
            return;
        }

        fail("PITarget did not fail for \"XmL\"");
    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#qName()}.
//     */
//    @Test
//    public void testQName() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#module()}.
//     */
//    @Test
//    public void testModule() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#versionDecl()}.
//     */
//    @Test
//    public void testVersionDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#mainModule()}.
//     */
//    @Test
//    public void testMainModule() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#libraryModule()}.
//     */
//    @Test
//    public void testLibraryModule() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#moduleDecl()}.
//     */
//    @Test
//    public void testModuleDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#prolog()}.
//     */
//    @Test
//    public void testProlog() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#setter()}.
//     */
//    @Test
//    public void testSetter() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#importStmt()}.
//     */
//    @Test
//    public void testImportStmt() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#separator()}.
//     */
//    @Test
//    public void testSeparator() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#namespaceDecl()}.
//     */
//    @Test
//    public void testNamespaceDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#boundarySpaceDecl()}.
//     */
//    @Test
//    public void testBoundarySpaceDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#defaultNamespaceDecl()}.
//     */
//    @Test
//    public void testDefaultNamespaceDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#optionDecl()}.
//     */
//    @Test
//    public void testOptionDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftOptionDecl()}.
//     */
//    @Test
//    public void testFtOptionDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#orderingModeDecl()}.
//     */
//    @Test
//    public void testOrderingModeDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#emptyOrderDecl()}.
//     */
//    @Test
//    public void testEmptyOrderDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#copyNamespacesDecl()}.
//     */
//    @Test
//    public void testCopyNamespacesDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#preserveMode()}.
//     */
//    @Test
//    public void testPreserveMode() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#inheritMode()}.
//     */
//    @Test
//    public void testInheritMode() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#defaultCollationDecl()}.
//     */
//    @Test
//    public void testDefaultCollationDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#baseURIDecl()}.
//     */
//    @Test
//    public void testBaseURIDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#schemaImport()}.
//     */
//    @Test
//    public void testSchemaImport() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#schemaPrefix()}.
//     */
//    @Test
//    public void testSchemaPrefix() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#moduleImport()}.
//     */
//    @Test
//    public void testModuleImport() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#varDecl()}.
//     */
//    @Test
//    public void testVarDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#constructionDecl()}.
//     */
//    @Test
//    public void testConstructionDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#functionDecl()}.
//     */
//    @Test
//    public void testFunctionDecl() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#paramList()}.
//     */
//    @Test
//    public void testParamList() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#param()}.
//     */
//    @Test
//    public void testParam() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#enclosedExpr()}.
//     */
//    @Test
//    public void testEnclosedExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#queryBody()}.
//     */
//    @Test
//    public void testQueryBody() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#expr()}.
//     */
//    @Test
//    public void testExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#exprSingle()}.
//     */
//    @Test
//    public void testExprSingle() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#fLWORExpr()}.
//     */
//    @Test
//    public void testFLWORExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#forClause()}.
//     */
//    @Test
//    public void testForClause() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#positionalVar()}.
//     */
//    @Test
//    public void testPositionalVar() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftScoreVar()}.
//     */
//    @Test
//    public void testFtScoreVar() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#letClause()}.
//     */
//    @Test
//    public void testLetClause() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#whereClause()}.
//     */
//    @Test
//    public void testWhereClause() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#orderByClause()}.
//     */
//    @Test
//    public void testOrderByClause() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#orderSpecList()}.
//     */
//    @Test
//    public void testOrderSpecList() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#orderSpec()}.
//     */
//    @Test
//    public void testOrderSpec() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#orderModifier()}.
//     */
//    @Test
//    public void testOrderModifier() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#quantifiedExpr()}.
//     */
//    @Test
//    public void testQuantifiedExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#typeswitchExpr()}.
//     */
//    @Test
//    public void testTypeswitchExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#caseClause()}.
//     */
//    @Test
//    public void testCaseClause() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ifExpr()}.
//     */
//    @Test
//    public void testIfExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#orExpr()}.
//     */
//    @Test
//    public void testOrExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#andExpr()}.
//     */
//    @Test
//    public void testAndExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#comparisonExpr()}.
//     */
//    @Test
//    public void testComparisonExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftContainsExpr()}.
//     */
//    @Test
//    public void testFtContainsExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#rangeExpr()}.
//     */
//    @Test
//    public void testRangeExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#additiveExpr()}.
//     */
//    @Test
//    public void testAdditiveExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#multiplicativeExpr()}.
//     */
//    @Test
//    public void testMultiplicativeExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#unionExpr()}.
//     */
//    @Test
//    public void testUnionExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#intersectExceptExpr()}.
//     */
//    @Test
//    public void testIntersectExceptExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#instanceofExpr()}.
//     */
//    @Test
//    public void testInstanceofExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#treatExpr()}.
//     */
//    @Test
//    public void testTreatExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#castableExpr()}.
//     */
//    @Test
//    public void testCastableExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#castExpr()}.
//     */
//    @Test
//    public void testCastExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#unaryExpr()}.
//     */
//    @Test
//    public void testUnaryExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#valueExpr()}.
//     */
//    @Test
//    public void testValueExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#generalComp()}.
//     */
//    @Test
//    public void testGeneralComp() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#valueComp()}.
//     */
//    @Test
//    public void testValueComp() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#nodeComp()}.
//     */
//    @Test
//    public void testNodeComp() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#validateExpr()}.
//     */
//    @Test
//    public void testValidateExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#validationMode()}.
//     */
//    @Test
//    public void testValidationMode() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#extensionExpr()}.
//     */
//    @Test
//    public void testExtensionExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#pragma()}.
//     */
//    @Test
//    public void testPragma() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#pragmaContents()}.
//     */
//    @Test
//    public void testPragmaContents() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#pathExpr()}.
//     */
//    @Test
//    public void testPathExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#relativePathExpr()}.
//     */
//    @Test
//    public void testRelativePathExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#stepExpr()}.
//     */
//    @Test
//    public void testStepExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#axisStep()}.
//     */
//    @Test
//    public void testAxisStep() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#forwardStep()}.
//     */
//    @Test
//    public void testForwardStep() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#forwardAxis()}.
//     */
//    @Test
//    public void testForwardAxis() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#abbrevForwardStep()}.
//     */
//    @Test
//    public void testAbbrevForwardStep() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#reverseStep()}.
//     */
//    @Test
//    public void testReverseStep() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#reverseAxis()}.
//     */
//    @Test
//    public void testReverseAxis() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#abbrevReverseStep()}.
//     */
//    @Test
//    public void testAbbrevReverseStep() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#nodeTest()}.
//     */
//    @Test
//    public void testNodeTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#nameTest()}.
//     */
//    @Test
//    public void testNameTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#wildcard()}.
//     */
//    @Test
//    public void testWildcard() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#filterExpr()}.
//     */
//    @Test
//    public void testFilterExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#predicateList()}.
//     */
//    @Test
//    public void testPredicateList() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#predicate()}.
//     */
//    @Test
//    public void testPredicate() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#primaryExpr()}.
//     */
//    @Test
//    public void testPrimaryExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#literal()}.
//     */
//    @Test
//    public void testLiteral() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#numericLiteral()}.
//     */
//    @Test
//    public void testNumericLiteral() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#varRef()}.
//     */
//    @Test
//    public void testVarRef() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#varName()}.
//     */
//    @Test
//    public void testVarName() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#parenthesizedExpr()}.
//     */
//    @Test
//    public void testParenthesizedExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#contextItemExpr()}.
//     */
//    @Test
//    public void testContextItemExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#orderedExpr()}.
//     */
//    @Test
//    public void testOrderedExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#unorderedExpr()}.
//     */
//    @Test
//    public void testUnorderedExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#functionCall()}.
//     */
//    @Test
//    public void testFunctionCall() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#constructor()}.
//     */
//    @Test
//    public void testConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#directConstructor()}.
//     */
//    @Test
//    public void testDirectConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#dirElemConstructor()}.
//     */
//    @Test
//    public void testDirElemConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#dirAttributeList()}.
//     */
//    @Test
//    public void testDirAttributeList() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#dirAttributeValue()}.
//     */
//    @Test
//    public void testDirAttributeValue() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#quotAttrValueContent()}.
//     */
//    @Test
//    public void testQuotAttrValueContent() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#aposAttrValueContent()}.
//     */
//    @Test
//    public void testAposAttrValueContent() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#dirElemContent()}.
//     */
//    @Test
//    public void testDirElemContent() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#commonContent()}.
//     */
//    @Test
//    public void testCommonContent() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#dirCommentConstructor()}.
//     */
//    @Test
//    public void testDirCommentConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#dirCommentContents()}.
//     */
//    @Test
//    public void testDirCommentContents() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#dirPIConstructor()}.
//     */
//    @Test
//    public void testDirPIConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#dirPIContents()}.
//     */
//    @Test
//    public void testDirPIContents() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#cDataSection()}.
//     */
//    @Test
//    public void testCDataSection() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#cDataSectionContents()}.
//     */
//    @Test
//    public void testCDataSectionContents() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#computedConstructor()}.
//     */
//    @Test
//    public void testComputedConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#compDocConstructor()}.
//     */
//    @Test
//    public void testCompDocConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#compElemConstructor()}.
//     */
//    @Test
//    public void testCompElemConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#contentExpr()}.
//     */
//    @Test
//    public void testContentExpr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#compAttrConstructor()}.
//     */
//    @Test
//    public void testCompAttrConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#compTextConstructor()}.
//     */
//    @Test
//    public void testCompTextConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#compCommentConstructor()}.
//     */
//    @Test
//    public void testCompCommentConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#compPIConstructor()}.
//     */
//    @Test
//    public void testCompPIConstructor() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#singleType()}.
//     */
//    @Test
//    public void testSingleType() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#typeDeclaration()}.
//     */
//    @Test
//    public void testTypeDeclaration() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#sequenceType()}.
//     */
//    @Test
//    public void testSequenceType() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#occurrenceIndicator()}.
//     */
//    @Test
//    public void testOccurrenceIndicator() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#itemType()}.
//     */
//    @Test
//    public void testItemType() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#atomicType()}.
//     */
//    @Test
//    public void testAtomicType() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#kindTest()}.
//     */
//    @Test
//    public void testKindTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#anyKindTest()}.
//     */
//    @Test
//    public void testAnyKindTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#documentTest()}.
//     */
//    @Test
//    public void testDocumentTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#textTest()}.
//     */
//    @Test
//    public void testTextTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#commentTest()}.
//     */
//    @Test
//    public void testCommentTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#piTest()}.
//     */
//    @Test
//    public void testPiTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#attributeTest()}.
//     */
//    @Test
//    public void testAttributeTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#attribNameOrWildcard()}.
//     */
//    @Test
//    public void testAttribNameOrWildcard() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#schemaAttributeTest()}.
//     */
//    @Test
//    public void testSchemaAttributeTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#attributeDeclaration()}.
//     */
//    @Test
//    public void testAttributeDeclaration() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#elementTest()}.
//     */
//    @Test
//    public void testElementTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#elementNameOrWildcard()}.
//     */
//    @Test
//    public void testElementNameOrWildcard() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#schemaElementTest()}.
//     */
//    @Test
//    public void testSchemaElementTest() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#elementDeclaration()}.
//     */
//    @Test
//    public void testElementDeclaration() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#attributeName()}.
//     */
//    @Test
//    public void testAttributeName() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#elementName()}.
//     */
//    @Test
//    public void testElementName() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#typeName()}.
//     */
//    @Test
//    public void testTypeName() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#uriLiteral()}.
//     */
//    @Test
//    public void testUriLiteral() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftSelection()}.
//     */
//    @Test
//    public void testFtSelection() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftOr()}.
//     */
//    @Test
//    public void testFtOr() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftAnd()}.
//     */
//    @Test
//    public void testFtAnd() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftMildNot()}.
//     */
//    @Test
//    public void testFtMildNot() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftUnaryNot()}.
//     */
//    @Test
//    public void testFtUnaryNot() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftPrimaryWithOptions()}.
//     */
//    @Test
//    public void testFtPrimaryWithOptions() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftPrimary()}.
//     */
//    @Test
//    public void testFtPrimary() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftWords()}.
//     */
//    @Test
//    public void testFtWords() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftWordsValue()}.
//     */
//    @Test
//    public void testFtWordsValue() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftExtensionSelection()}.
//     */
//    @Test
//    public void testFtExtensionSelection() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftAnyallOption()}.
//     */
//    @Test
//    public void testFtAnyallOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftTimes()}.
//     */
//    @Test
//    public void testFtTimes() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftRange()}.
//     */
//    @Test
//    public void testFtRange() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftPosFilter()}.
//     */
//    @Test
//    public void testFtPosFilter() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftOrder()}.
//     */
//    @Test
//    public void testFtOrder() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftWindow()}.
//     */
//    @Test
//    public void testFtWindow() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftDistance()}.
//     */
//    @Test
//    public void testFtDistance() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftUnit()}.
//     */
//    @Test
//    public void testFtUnit() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftScope()}.
//     */
//    @Test
//    public void testFtScope() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftBigUnit()}.
//     */
//    @Test
//    public void testFtBigUnit() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftContent()}.
//     */
//    @Test
//    public void testFtContent() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftMatchOptions()}.
//     */
//    @Test
//    public void testFtMatchOptions() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftMatchOption()}.
//     */
//    @Test
//    public void testFtMatchOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftCaseOption()}.
//     */
//    @Test
//    public void testFtCaseOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftDiacriticsOption()}.
//     */
//    @Test
//    public void testFtDiacriticsOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftStemOption()}.
//     */
//    @Test
//    public void testFtStemOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftThesaurusOption()}.
//     */
//    @Test
//    public void testFtThesaurusOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftThesaurusID()}.
//     */
//    @Test
//    public void testFtThesaurusID() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftStopwordOption()}.
//     */
//    @Test
//    public void testFtStopwordOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftRefOrList()}.
//     */
//    @Test
//    public void testFtRefOrList() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftInclExclStringLiteral()}.
//     */
//    @Test
//    public void testFtInclExclStringLiteral() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftLanguageOption()}.
//     */
//    @Test
//    public void testFtLanguageOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftWildCardOption()}.
//     */
//    @Test
//    public void testFtWildCardOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftExtensionOption()}.
//     */
//    @Test
//    public void testFtExtensionOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#ftIgnoreOption()}.
//     */
//    @Test
//    public void testFtIgnoreOption() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#synpred1_fragment()}.
//     */
//    @Test
//    public void testSynpred1_fragment() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#synpred2_fragment()}.
//     */
//    @Test
//    public void testSynpred2_fragment() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#synpred3_fragment()}.
//     */
//    @Test
//    public void testSynpred3_fragment() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#synpred4_fragment()}.
//     */
//    @Test
//    public void testSynpred4_fragment() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#synpred1()}.
//     */
//    @Test
//    public void testSynpred1() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#synpred2()}.
//     */
//    @Test
//    public void testSynpred2() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#synpred3()}.
//     */
//    @Test
//    public void testSynpred3() {
//        fail("Not yet implemented");
//    }
//
//    /**
//     * Test method for {@link no.ntnu.xqft.parse.XQFTParser#synpred4()}.
//     */
//    @Test
//    public void testSynpred4() {
//        fail("Not yet implemented");
//    }

}
