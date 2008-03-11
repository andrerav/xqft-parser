/**
 * 
 */
package no.ntnu.xqft.parse;

import no.ntnu.xqft.tree.*;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.*;


/**
 * @author andreas
 *
 */
public class XQFTTree extends CommonTree implements no.ntnu.xqft.tree.Node {
    
    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Node#accept(no.ntnu.xqft.tree.Operator)
     */
    public Operator accept(Visitor visitor) {

        // TODO Auto-generated method stub
        switch(this.getType()) {
        
            case XQFTParser.ALL:
                //return visitor.visitALL(this);
                System.err.println("method not implemented: visitALL()");
                break;
            case XQFTParser.ANY:
                //return visitor.visitANY(this);
                System.err.println("method not implemented: visitANY()");
                break;
            case XQFTParser.ANCESTOR:
                //return visitor.visitANCESTOR(this);
                System.err.println("method not implemented: visitANCESTOR()");
                break;
            case XQFTParser.ANCESTOR_OR_SELF:
                //return visitor.visitANCESTOR_OR_SELF(this);
                System.err.println("method not implemented: visitANCESTOR_OR_SELF()");
                break;
            case XQFTParser.AND:
                //return visitor.visitAND(this);
                System.err.println("method not implemented: visitAND()");
                break;
            case XQFTParser.AS:
                //return visitor.visitAS(this);
                System.err.println("method not implemented: visitAS()");
                break;
            case XQFTParser.ASCENDING:
                //return visitor.visitASCENDING(this);
                System.err.println("method not implemented: visitASCENDING()");
                break;
            case XQFTParser.AT:
                //return visitor.visitAT(this);
                System.err.println("method not implemented: visitAT()");
                break;
            case XQFTParser.ATTRIBUTE:
                //return visitor.visitATTRIBUTE(this);
                System.err.println("method not implemented: visitATTRIBUTE()");
                break;
            case XQFTParser.BASE_URI:
                //return visitor.visitBASE_URI(this);
                System.err.println("method not implemented: visitBASE_URI()");
                break;
            case XQFTParser.BY:
                //return visitor.visitBY(this);
                System.err.println("method not implemented: visitBY()");
                break;
            case XQFTParser.BOUNDARYSPACE:
                //return visitor.visitBOUNDARYSPACE(this);
                System.err.println("method not implemented: visitBOUNDARYSPACE()");
                break;
            case XQFTParser.CASE:
                //return visitor.visitCASE(this);
                System.err.println("method not implemented: visitCASE()");
                break;
            case XQFTParser.CAST:
                //return visitor.visitCAST(this);
                System.err.println("method not implemented: visitCAST()");
                break;
            case XQFTParser.CASTABLE:
                //return visitor.visitCASTABLE(this);
                System.err.println("method not implemented: visitCASTABLE()");
                break;
            case XQFTParser.CHILD:
                //return visitor.visitCHILD(this);
                System.err.println("method not implemented: visitCHILD()");
                break;
            case XQFTParser.COLLATION:
                //return visitor.visitCOLLATION(this);
                System.err.println("method not implemented: visitCOLLATION()");
                break;
            case XQFTParser.COMMENT:
                //return visitor.visitCOMMENT(this);
                System.err.println("method not implemented: visitCOMMENT()");
                break;
            case XQFTParser.CONSTRUCTION:
                //return visitor.visitCONSTRUCTION(this);
                System.err.println("method not implemented: visitCONSTRUCTION()");
                break;
            case XQFTParser.CONTENT:
                //return visitor.visitCONTENT(this);
                System.err.println("method not implemented: visitCONTENT()");
                break;
            case XQFTParser.COPY_NAMESPACES:
                //return visitor.visitCOPY_NAMESPACES(this);
                System.err.println("method not implemented: visitCOPY_NAMESPACES()");
                break;
            case XQFTParser.DECLARE:
                //return visitor.visitDECLARE(this);
                System.err.println("method not implemented: visitDECLARE()");
                break;
            case XQFTParser.DEFAULT:
                //return visitor.visitDEFAULT(this);
                System.err.println("method not implemented: visitDEFAULT()");
                break;
            case XQFTParser.DESCENDANT:
                //return visitor.visitDESCENDANT(this);
                System.err.println("method not implemented: visitDESCENDANT()");
                break;
            case XQFTParser.DESCENDANT_OR_SELF:
                //return visitor.visitDESCENDANT_OR_SELF(this);
                System.err.println("method not implemented: visitDESCENDANT_OR_SELF()");
                break;
            case XQFTParser.DESCENDING:
                //return visitor.visitDESCENDING(this);
                System.err.println("method not implemented: visitDESCENDING()");
                break;
            case XQFTParser.DIACRITICS:
                //return visitor.visitDIACRITICS(this);
                System.err.println("method not implemented: visitDIACRITICS()");
                break;
            case XQFTParser.DIFFERENT:
                //return visitor.visitDIFFERENT(this);
                System.err.println("method not implemented: visitDIFFERENT()");
                break;
            case XQFTParser.DISTANCE:
                //return visitor.visitDISTANCE(this);
                System.err.println("method not implemented: visitDISTANCE()");
                break;
            case XQFTParser.DIV:
                //return visitor.visitDIV(this);
                System.err.println("method not implemented: visitDIV()");
                break;
            case XQFTParser.DOCUMENT:
                //return visitor.visitDOCUMENT(this);
                System.err.println("method not implemented: visitDOCUMENT()");
                break;
            case XQFTParser.DOCUMENT_NODE:
                //return visitor.visitDOCUMENT_NODE(this);
                System.err.println("method not implemented: visitDOCUMENT_NODE()");
                break;
            case XQFTParser.ELEMENT:
                //return visitor.visitELEMENT(this);
                System.err.println("method not implemented: visitELEMENT()");
                break;
            case XQFTParser.ELSE:
                //return visitor.visitELSE(this);
                System.err.println("method not implemented: visitELSE()");
                break;
            case XQFTParser.ENCODING:
                //return visitor.visitENCODING(this);
                System.err.println("method not implemented: visitENCODING()");
                break;
            case XQFTParser.END:
                //return visitor.visitEND(this);
                System.err.println("method not implemented: visitEND()");
                break;
            case XQFTParser.ENTIRE:
                //return visitor.visitENTIRE(this);
                System.err.println("method not implemented: visitENTIRE()");
                break;
            case XQFTParser.EMPTY:
                //return visitor.visitEMPTY(this);
                System.err.println("method not implemented: visitEMPTY()");
                break;
            case XQFTParser.EMPTY_SEQUENCE:
                //return visitor.visitEMPTY_SEQUENCE(this);
                System.err.println("method not implemented: visitEMPTY_SEQUENCE()");
                break;
            case XQFTParser.EQ:
                //return visitor.visitEQ(this);
                System.err.println("method not implemented: visitEQ()");
                break;
            case XQFTParser.EVERY:
                //return visitor.visitEVERY(this);
                System.err.println("method not implemented: visitEVERY()");
                break;
            case XQFTParser.EXACTLY:
                //return visitor.visitEXACTLY(this);
                System.err.println("method not implemented: visitEXACTLY()");
                break;
            case XQFTParser.EXCEPT:
                //return visitor.visitEXCEPT(this);
                System.err.println("method not implemented: visitEXCEPT()");
                break;
            case XQFTParser.EXTERNAL:
                //return visitor.visitEXTERNAL(this);
                System.err.println("method not implemented: visitEXTERNAL()");
                break;
            case XQFTParser.FOLLOWING:
                //return visitor.visitFOLLOWING(this);
                System.err.println("method not implemented: visitFOLLOWING()");
                break;
            case XQFTParser.FOLLOWING_SIBLING:
                //return visitor.visitFOLLOWING_SIBLING(this);
                System.err.println("method not implemented: visitFOLLOWING_SIBLING()");
                break;
            case XQFTParser.FOR:
                //return visitor.visitFOR(this);
                System.err.println("method not implemented: visitFOR()");
                break;
            case XQFTParser.FROM:
                //return visitor.visitFROM(this);
                System.err.println("method not implemented: visitFROM()");
                break;
            case XQFTParser.FTAND:
                //return visitor.visitFTAND(this);
                System.err.println("method not implemented: visitFTAND()");
                break;
            case XQFTParser.FTCONTAINS:
                //return visitor.visitFTCONTAINS(this);
                System.err.println("method not implemented: visitFTCONTAINS()");
                break;
            case XQFTParser.FTNOT:
                //return visitor.visitFTNOT(this);
                System.err.println("method not implemented: visitFTNOT()");
                break;
            case XQFTParser.FTOPTION:
                //return visitor.visitFTOPTION(this);
                System.err.println("method not implemented: visitFTOPTION()");
                break;
            case XQFTParser.FTOR:
                //return visitor.visitFTOR(this);
                System.err.println("method not implemented: visitFTOR()");
                break;
            case XQFTParser.FUNCTION:
                //return visitor.visitFUNCTION(this);
                System.err.println("method not implemented: visitFUNCTION()");
                break;
            case XQFTParser.GE:
                //return visitor.visitGE(this);
                System.err.println("method not implemented: visitGE()");
                break;
            case XQFTParser.GREATEST:
                //return visitor.visitGREATEST(this);
                System.err.println("method not implemented: visitGREATEST()");
                break;
            case XQFTParser.GT:
                //return visitor.visitGT(this);
                System.err.println("method not implemented: visitGT()");
                break;
            case XQFTParser.IDIV:
                //return visitor.visitIDIV(this);
                System.err.println("method not implemented: visitIDIV()");
                break;
            case XQFTParser.IF:
                //return visitor.visitIF(this);
                System.err.println("method not implemented: visitIF()");
                break;
            case XQFTParser.IMPORT:
                //return visitor.visitIMPORT(this);
                System.err.println("method not implemented: visitIMPORT()");
                break;
            case XQFTParser.IN:
                //return visitor.visitIN(this);
                System.err.println("method not implemented: visitIN()");
                break;
            case XQFTParser.INHERIT:
                //return visitor.visitINHERIT(this);
                System.err.println("method not implemented: visitINHERIT()");
                break;
            case XQFTParser.INSENSITIVE:
                //return visitor.visitINSENSITIVE(this);
                System.err.println("method not implemented: visitINSENSITIVE()");
                break;
            case XQFTParser.INSTANCE:
                //return visitor.visitINSTANCE(this);
                System.err.println("method not implemented: visitINSTANCE()");
                break;
            case XQFTParser.INTERSECT:
                //return visitor.visitINTERSECT(this);
                System.err.println("method not implemented: visitINTERSECT()");
                break;
            case XQFTParser.IS:
                //return visitor.visitIS(this);
                System.err.println("method not implemented: visitIS()");
                break;
            case XQFTParser.ITEM:
                //return visitor.visitITEM(this);
                System.err.println("method not implemented: visitITEM()");
                break;
            case XQFTParser.LANGUAGE:
                //return visitor.visitLANGUAGE(this);
                System.err.println("method not implemented: visitLANGUAGE()");
                break;
            case XQFTParser.LAX:
                //return visitor.visitLAX(this);
                System.err.println("method not implemented: visitLAX()");
                break;
            case XQFTParser.LE:
                //return visitor.visitLE(this);
                System.err.println("method not implemented: visitLE()");
                break;
            case XQFTParser.LEAST:
                //return visitor.visitLEAST(this);
                System.err.println("method not implemented: visitLEAST()");
                break;
            case XQFTParser.LET:
                //return visitor.visitLET(this);
                System.err.println("method not implemented: visitLET()");
                break;
            case XQFTParser.LEVELS:
                //return visitor.visitLEVELS(this);
                System.err.println("method not implemented: visitLEVELS()");
                break;
            case XQFTParser.LOWERCASE:
                //return visitor.visitLOWERCASE(this);
                System.err.println("method not implemented: visitLOWERCASE()");
                break;
            case XQFTParser.LT:
                //return visitor.visitLT(this);
                System.err.println("method not implemented: visitLT()");
                break;
            case XQFTParser.MOD:
                //return visitor.visitMOD(this);
                System.err.println("method not implemented: visitMOD()");
                break;
            case XQFTParser.MODULE:
                //return visitor.visitMODULE(this);
                System.err.println("method not implemented: visitMODULE()");
                break;
            case XQFTParser.MOST:
                //return visitor.visitMOST(this);
                System.err.println("method not implemented: visitMOST()");
                break;
            case XQFTParser.NAMESPACE:
                //return visitor.visitNAMESPACE(this);
                System.err.println("method not implemented: visitNAMESPACE()");
                break;
            case XQFTParser.NE:
                //return visitor.visitNE(this);
                System.err.println("method not implemented: visitNE()");
                break;
            case XQFTParser.NODE:
                //return visitor.visitNODE(this);
                System.err.println("method not implemented: visitNODE()");
                break;
            case XQFTParser.NOINHERIT:
                //return visitor.visitNOINHERIT(this);
                System.err.println("method not implemented: visitNOINHERIT()");
                break;
            case XQFTParser.NOPRESERVE:
                //return visitor.visitNOPRESERVE(this);
                System.err.println("method not implemented: visitNOPRESERVE()");
                break;
            case XQFTParser.NOT:
                //return visitor.visitNOT(this);
                System.err.println("method not implemented: visitNOT()");
                break;
            case XQFTParser.OCCURS:
                //return visitor.visitOCCURS(this);
                System.err.println("method not implemented: visitOCCURS()");
                break;
            case XQFTParser.OF:
                //return visitor.visitOF(this);
                System.err.println("method not implemented: visitOF()");
                break;
            case XQFTParser.OPTION:
                //return visitor.visitOPTION(this);
                System.err.println("method not implemented: visitOPTION()");
                break;
            case XQFTParser.OR:
                //return visitor.visitOR(this);
                System.err.println("method not implemented: visitOR()");
                break;
            case XQFTParser.ORDER:
                //return visitor.visitORDER(this);
                System.err.println("method not implemented: visitORDER()");
                break;
            case XQFTParser.ORDERED:
                //return visitor.visitORDERED(this);
                System.err.println("method not implemented: visitORDERED()");
                break;
            case XQFTParser.ORDERING:
                //return visitor.visitORDERING(this);
                System.err.println("method not implemented: visitORDERING()");
                break;
            case XQFTParser.PARAGRAPH:
                //return visitor.visitPARAGRAPH(this);
                System.err.println("method not implemented: visitPARAGRAPH()");
                break;
            case XQFTParser.PARAGRAPHS:
                //return visitor.visitPARAGRAPHS(this);
                System.err.println("method not implemented: visitPARAGRAPHS()");
                break;
            case XQFTParser.PARENT:
                //return visitor.visitPARENT(this);
                System.err.println("method not implemented: visitPARENT()");
                break;
            case XQFTParser.PHRASE:
                //return visitor.visitPHRASE(this);
                System.err.println("method not implemented: visitPHRASE()");
                break;
            case XQFTParser.PRECEDING:
                //return visitor.visitPRECEDING(this);
                System.err.println("method not implemented: visitPRECEDING()");
                break;
            case XQFTParser.PRECEDING_SIBLING:
                //return visitor.visitPRECEDING_SIBLING(this);
                System.err.println("method not implemented: visitPRECEDING_SIBLING()");
                break;
            case XQFTParser.PRESERVE:
                //return visitor.visitPRESERVE(this);
                System.err.println("method not implemented: visitPRESERVE()");
                break;
            case XQFTParser.PROCESSING_INSTRUCTION:
                //return visitor.visitPROCESSING_INSTRUCTION(this);
                System.err.println("method not implemented: visitPROCESSING_INSTRUCTION()");
                break;
            case XQFTParser.RELATIONSHIP:
                //return visitor.visitRELATIONSHIP(this);
                System.err.println("method not implemented: visitRELATIONSHIP()");
                break;
            case XQFTParser.RETURN:
                //return visitor.visitRETURN(this);
                System.err.println("method not implemented: visitRETURN()");
                break;
            case XQFTParser.SAME:
                //return visitor.visitSAME(this);
                System.err.println("method not implemented: visitSAME()");
                break;
            case XQFTParser.SATISFIES:
                //return visitor.visitSATISFIES(this);
                System.err.println("method not implemented: visitSATISFIES()");
                break;
            case XQFTParser.SCHEMA:
                //return visitor.visitSCHEMA(this);
                System.err.println("method not implemented: visitSCHEMA()");
                break;
            case XQFTParser.SCHEMA_ATTRIBUTE:
                //return visitor.visitSCHEMA_ATTRIBUTE(this);
                System.err.println("method not implemented: visitSCHEMA_ATTRIBUTE()");
                break;
            case XQFTParser.SCHEMA_ELEMENT:
                //return visitor.visitSCHEMA_ELEMENT(this);
                System.err.println("method not implemented: visitSCHEMA_ELEMENT()");
                break;
            case XQFTParser.SCORE:
                //return visitor.visitSCORE(this);
                System.err.println("method not implemented: visitSCORE()");
                break;
            case XQFTParser.SELF:
                //return visitor.visitSELF(this);
                System.err.println("method not implemented: visitSELF()");
                break;
            case XQFTParser.SENSITIVE:
                //return visitor.visitSENSITIVE(this);
                System.err.println("method not implemented: visitSENSITIVE()");
                break;
            case XQFTParser.SENTENCES:
                //return visitor.visitSENTENCES(this);
                System.err.println("method not implemented: visitSENTENCES()");
                break;
            case XQFTParser.SENTENCE:
                //return visitor.visitSENTENCE(this);
                System.err.println("method not implemented: visitSENTENCE()");
                break;
            case XQFTParser.SOME:
                //return visitor.visitSOME(this);
                System.err.println("method not implemented: visitSOME()");
                break;
            case XQFTParser.STABLE:
                //return visitor.visitSTABLE(this);
                System.err.println("method not implemented: visitSTABLE()");
                break;
            case XQFTParser.START:
                //return visitor.visitSTART(this);
                System.err.println("method not implemented: visitSTART()");
                break;
            case XQFTParser.STEMMING:
                //return visitor.visitSTEMMING(this);
                System.err.println("method not implemented: visitSTEMMING()");
                break;
            case XQFTParser.STOP:
                //return visitor.visitSTOP(this);
                System.err.println("method not implemented: visitSTOP()");
                break;
            case XQFTParser.STRICT:
                //return visitor.visitSTRICT(this);
                System.err.println("method not implemented: visitSTRICT()");
                break;
            case XQFTParser.STRIP:
                //return visitor.visitSTRIP(this);
                System.err.println("method not implemented: visitSTRIP()");
                break;
            case XQFTParser.TEXT:
                //return visitor.visitTEXT(this);
                System.err.println("method not implemented: visitTEXT()");
                break;
            case XQFTParser.THESAURUS:
                //return visitor.visitTHESAURUS(this);
                System.err.println("method not implemented: visitTHESAURUS()");
                break;
            case XQFTParser.THEN:
                //return visitor.visitTHEN(this);
                System.err.println("method not implemented: visitTHEN()");
                break;
            case XQFTParser.TIMES:
                //return visitor.visitTIMES(this);
                System.err.println("method not implemented: visitTIMES()");
                break;
            case XQFTParser.TO:
                //return visitor.visitTO(this);
                System.err.println("method not implemented: visitTO()");
                break;
            case XQFTParser.TREAT:
                //return visitor.visitTREAT(this);
                System.err.println("method not implemented: visitTREAT()");
                break;
            case XQFTParser.TYPESWITCH:
                //return visitor.visitTYPESWITCH(this);
                System.err.println("method not implemented: visitTYPESWITCH()");
                break;
            case XQFTParser.UNION:
                //return visitor.visitUNION(this);
                System.err.println("method not implemented: visitUNION()");
                break;
            case XQFTParser.UNORDERED:
                //return visitor.visitUNORDERED(this);
                System.err.println("method not implemented: visitUNORDERED()");
                break;
            case XQFTParser.UPPERCASE:
                //return visitor.visitUPPERCASE(this);
                System.err.println("method not implemented: visitUPPERCASE()");
                break;
            case XQFTParser.VALIDATE:
                //return visitor.visitVALIDATE(this);
                System.err.println("method not implemented: visitVALIDATE()");
                break;
            case XQFTParser.VARIABLE:
                //return visitor.visitVARIABLE(this);
                System.err.println("method not implemented: visitVARIABLE()");
                break;
            case XQFTParser.VERSION:
                //return visitor.visitVERSION(this);
                System.err.println("method not implemented: visitVERSION()");
                break;
            case XQFTParser.WEIGHT:
                //return visitor.visitWEIGHT(this);
                System.err.println("method not implemented: visitWEIGHT()");
                break;
            case XQFTParser.WHERE:
                //return visitor.visitWHERE(this);
                System.err.println("method not implemented: visitWHERE()");
                break;
            case XQFTParser.WILDCARDS:
                //return visitor.visitWILDCARDS(this);
                System.err.println("method not implemented: visitWILDCARDS()");
                break;
            case XQFTParser.WINDOW:
                //return visitor.visitWINDOW(this);
                System.err.println("method not implemented: visitWINDOW()");
                break;
            case XQFTParser.WITH:
                //return visitor.visitWITH(this);
                System.err.println("method not implemented: visitWITH()");
                break;
            case XQFTParser.WITHOUT:
                //return visitor.visitWITHOUT(this);
                System.err.println("method not implemented: visitWITHOUT()");
                break;
            case XQFTParser.WORD:
                //return visitor.visitWORD(this);
                System.err.println("method not implemented: visitWORD()");
                break;
            case XQFTParser.WORDS:
                //return visitor.visitWORDS(this);
                System.err.println("method not implemented: visitWORDS()");
                break;
            case XQFTParser.XQUERY:
                //return visitor.visitXQUERY(this);
                System.err.println("method not implemented: visitXQUERY()");
                break;
            case XQFTParser.AST_MODULE:
                //return visitor.visitAST_MODULE(this);
                System.err.println("method not implemented: visitAST_MODULE()");
                break;
            case XQFTParser.AST_FLWOR:
                //return visitor.visitAST_FLWOR(this);
                System.err.println("method not implemented: visitAST_FLWOR()");
                break;
            case XQFTParser.AST_FORCLAUSE:
                //return visitor.visitAST_FORCLAUSE(this);
                System.err.println("method not implemented: visitAST_FORCLAUSE()");
                break;
            case XQFTParser.AST_LETCLAUSE:
                //return visitor.visitAST_LETCLAUSE(this);
                System.err.println("method not implemented: visitAST_LETCLAUSE()");
                break;
            case XQFTParser.AST_ORDERBYCLAUSE:
                //return visitor.visitAST_ORDERBYCLAUSE(this);
                System.err.println("method not implemented: visitAST_ORDERBYCLAUSE()");
                break;
            case XQFTParser.AST_WHERECLAUSE:
                //return visitor.visitAST_WHERECLAUSE(this);
                System.err.println("method not implemented: visitAST_WHERECLAUSE()");
                break;
            case XQFTParser.AST_RETURNCLAUSE:
                //return visitor.visitAST_RETURNCLAUSE(this);
                System.err.println("method not implemented: visitAST_RETURNCLAUSE()");
                break;
            case XQFTParser.AST_QUANTIFIEDEXPR:
                //return visitor.visitAST_QUANTIFIEDEXPR(this);
                System.err.println("method not implemented: visitAST_QUANTIFIEDEXPR()");
                break;
            case XQFTParser.AST_TYPESWITCHEXPR:
                //return visitor.visitAST_TYPESWITCHEXPR(this);
                System.err.println("method not implemented: visitAST_TYPESWITCHEXPR()");
                break;
            case XQFTParser.AST_CASECLAUSE:
                //return visitor.visitAST_CASECLAUSE(this);
                System.err.println("method not implemented: visitAST_CASECLAUSE()");
                break;
            case XQFTParser.AST_IFEXPR:
                //return visitor.visitAST_IFEXPR(this);
                System.err.println("method not implemented: visitAST_IFEXPR()");
                break;
            case XQFTParser.AST_PATHEXPR_DBL:
                //return visitor.visitAST_PATHEXPR_DBL(this);
                System.err.println("method not implemented: visitAST_PATHEXPR_DBL()");
                break;
            case XQFTParser.AST_PATHEXPR_SGL:
                //return visitor.visitAST_PATHEXPR_SGL(this);
                System.err.println("method not implemented: visitAST_PATHEXPR_SGL()");
                break;
            case XQFTParser.AST_PATHEXPR_REL:
                //return visitor.visitAST_PATHEXPR_REL(this);
                System.err.println("method not implemented: visitAST_PATHEXPR_REL()");
                break;
            case XQFTParser.AST_STEPEXPR:
                //return visitor.visitAST_STEPEXPR(this);
                System.err.println("method not implemented: visitAST_STEPEXPR()");
                break;
            case XQFTParser.AST_FTSELECTION:
                //return visitor.visitAST_FTSELECTION(this);
                System.err.println("method not implemented: visitAST_FTSELECTION()");
                break;
            case XQFTParser.AST_FTPOSFILTER:
                //return visitor.visitAST_FTPOSFILTER(this);
                System.err.println("method not implemented: visitAST_FTPOSFILTER()");
                break;
            case XQFTParser.AST_FUNCTIONCALL:
                //return visitor.visitAST_FUNCTIONCALL(this);
                System.err.println("method not implemented: visitAST_FUNCTIONCALL()");
                break;
            case XQFTParser.AST_FUNCTIONDECL:
                //return visitor.visitAST_FUNCTIONDECL(this);
                System.err.println("method not implemented: visitAST_FUNCTIONDECL()");
                break;
            case XQFTParser.AST_PREDICATE:
                //return visitor.visitAST_PREDICATE(this);
                System.err.println("method not implemented: visitAST_PREDICATE()");
                break;
            case XQFTParser.AST_DIRELEMCONSTRUCTOR:
                //return visitor.visitAST_DIRELEMCONSTRUCTOR(this);
                System.err.println("method not implemented: visitAST_DIRELEMCONSTRUCTOR()");
                break;
            case XQFTParser.AST_DIRELEMCONTENT:
                //return visitor.visitAST_DIRELEMCONTENT(this);
                System.err.println("method not implemented: visitAST_DIRELEMCONTENT()");
                break;
        }
        
        return null;
    }


    public static int i = 0;
    public int my_i;
    public boolean printTokenName = false;
    
    /**
     * @param t
     */
    public XQFTTree(Token t) {
        super(t);
    }

    /* Prints a DOT schema for use with graphviz instead of the usual lispy
     * paranthesized structure
     */
    
    public String toDotStringTree() {
        
        StringBuffer buf = new StringBuffer();
        buf.append("digraph AST {\n" +
                        "edge [color=black, dir=both, weight=1, " +
                        "fontcolor=black, arrowhead=none, "+
                        "arrowtail=none]\n");
        
        buf.append(this.generateNodeRel());
        
        buf.append("\n}");
        
        return buf.toString();
    }
    
    protected String generateNodeRel() {
        XQFTTree.i++;
        my_i = XQFTTree.i;
        
        String nodeName = "NODE" + my_i;
        
        /* Token name for this node */
        String tokenName = this.printTokenName && this.getToken() != null ? XQFTParser.tokenNames[this.getToken().getType()]  + ": " : "";
        String nodeText = this.fixStringForDot(this.toString());
        
        if ( children==null || children.size()==0 ) {
            return nodeName + " [label=\"" + tokenName + nodeText + "\"]\n";
        }
        StringBuffer buf = new StringBuffer();
        if ( !isNil() ) {
            
            buf.append(nodeName + " [label=\"" + tokenName + nodeText + "\"]\n");
            
        }
        for (int i = 0; children!=null && i < children.size(); i++) {
            XQFTTree t = (XQFTTree) children.get(i);
            if ( i>0 ) {
                    buf.append(' ');
            }
            buf.append(t.generateNodeRel());
            buf.append(nodeName + " -> " + "NODE" + t.my_i + "\n");
         }
         if ( !isNil() ) {

         }
         return buf.toString();
    }


    protected String fixStringForDot(String str) {
        str = str.replaceAll("\n", "\\\\n");
        str = str.replaceAll("\r", "\\\\r");
        str = str.replaceAll("\"", "\\\\\"");
        return str;
    }
    
    
    

}
