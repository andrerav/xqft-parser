/**
 * 
 */
package no.ntnu.xqft.parse;

import no.ntnu.xqft.parse.XQFTParser;
import no.ntnu.xqft.tree.Visitor;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.*;

import no.ntnu.xqft.tree.*;

/**
 * @author andreas
 *
 */
public class XQFTTree extends CommonTree implements no.ntnu.xqft.tree.Node {
    
    protected boolean isFlworTupleDef = false;
    
    
    /**
     * @return the isFlworTupleDef
     */
    public boolean isFlworTupleDef() {
        return isFlworTupleDef;
    }

    /**
     * @param isFlworTupleDef the isFlworTupleDef to set
     */
    public void setFlworTupleDef(boolean isFlworTupleDef) {
        this.isFlworTupleDef = isFlworTupleDef;
    }

    /* (non-Javadoc)
     * @see no.ntnu.xqft.tree.Node#accept(no.ntnu.xqft.tree.Operator)
     */
    public TraverseReturn accept(Visitor visitor) {


        switch(this.getType()) {
	        case XQFTParser.SYNTH_PR_PATHEXPR:
	            return visitor.visitSYNTH_PR_PATHEXPR(this);
//	            System.err.println("method not implemented: visitSYNTH_PR_PATHEXPR");
//	            break;
	        case XQFTParser.SYNTH_PR_LVL:
	        	return visitor.visitSYNTH_PR_LVL(this);
	        case XQFTParser.AST_MODULE:
                return visitor.visitAST_MODULE(this);
                //System.err.println("method not implemented: visitAST_MODULE()");
                //break;
            case XQFTParser.AST_FLWOR:
                return visitor.visitAST_FLWOR(this);
                //System.err.println("method not implemented: visitAST_FLWOR()");
                //break;
            case XQFTParser.AST_FORCLAUSE:
                return visitor.visitAST_FORCLAUSE(this);
                //System.err.println("method not implemented: visitAST_FORCLAUSE()");
                //break;
            case XQFTParser.AST_LETCLAUSE:
                return visitor.visitAST_LETCLAUSE(this);
                //System.err.println("method not implemented: visitAST_LETCLAUSE()");
                //break;

            case XQFTParser.AST_ORDERBYCLAUSE:
                //return visitor.visitAST_ORDERBYCLAUSE(this);
                System.err.println("method not implemented: visitAST_ORDERBYCLAUSE()");
                break;
            case XQFTParser.AST_WHERECLAUSE:
                return visitor.visitAST_WHERECLAUSE(this);
                //System.err.println("method not implemented: visitAST_WHERECLAUSE()");
                //break;
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
                return visitor.visitAST_PATHEXPR_DBL(this);
//                System.err.println("method not implemented: visitAST_PATHEXPR_DBL()");
//                break;
            case XQFTParser.AST_PATHEXPR_SGL:
                return visitor.visitAST_PATHEXPR_SGL(this);
                //System.err.println("method not implemented: visitAST_PATHEXPR_SGL()");
                //break;
            case XQFTParser.AST_PATHEXPR_REL:
                //return visitor.visitAST_PATHEXPR_REL(this);
                System.err.println("method not implemented: visitAST_PATHEXPR_REL()");
                break;
            case XQFTParser.AST_STEPEXPR:
                return visitor.visitAST_STEPEXPR(this);
                //System.err.println("method not implemented: visitAST_STEPEXPR()");
                //break;
            case XQFTParser.AST_FTSELECTION:
                //return visitor.visitAST_FTSELECTION(this);
                System.err.println("method not implemented: visitAST_FTSELECTION()");
                break;
            case XQFTParser.AST_FTPOSFILTER:
                //return visitor.visitAST_FTPOSFILTER(this);
                System.err.println("method not implemented: visitAST_FTPOSFILTER()");
                break;
            case XQFTParser.AST_FUNCTIONCALL:
                return visitor.visitAST_FUNCTIONCALL(this);
                //System.err.println("method not implemented: visitAST_FUNCTIONCALL()");
                //break;
            case XQFTParser.AST_FUNCTIONDECL:
                //return visitor.visitAST_FUNCTIONDECL(this);
                System.err.println("method not implemented: visitAST_FUNCTIONDECL()");
                break;
            case XQFTParser.AST_PREDICATE:
                return visitor.visitAST_PREDICATE(this);
                //System.err.println("method not implemented: visitAST_PREDICATE()");
                //break;
            case XQFTParser.AST_DIRELEMCONSTRUCTOR:
                //return visitor.visitAST_DIRELEMCONSTRUCTOR(this);
                System.err.println("method not implemented: visitAST_DIRELEMCONSTRUCTOR()");
                break;
            case XQFTParser.AST_DIRELEMCONTENT:
                //return visitor.visitAST_DIRELEMCONTENT(this);
                System.err.println("method not implemented: visitAST_DIRELEMCONTENT()");
                break;
            case XQFTParser.XQUERY:
                //return visitor.visitXQUERY(this);
                System.err.println("method not implemented: visitXQUERY()");
                break;
            case XQFTParser.VERSION:
                //return visitor.visitVERSION(this);
                System.err.println("method not implemented: visitVERSION()");
                break;
            case XQFTParser.StringLiteral:
                //return visitor.visitStringLiteral(this);
                System.err.println("method not implemented: visitStringLiteral()");
                break;
            case XQFTParser.ENCODING:
                //return visitor.visitENCODING(this);
                System.err.println("method not implemented: visitENCODING()");
                break;
            case XQFTParser.SEMICOLONSi:
                //return visitor.visitSEMICOLONSi(this);
                System.err.println("method not implemented: visitSEMICOLONSi()");
                break;
            case XQFTParser.MODULE:
                //return visitor.visitMODULE(this);
                System.err.println("method not implemented: visitMODULE()");
                break;
            case XQFTParser.NAMESPACE:
                //return visitor.visitNAMESPACE(this);
                System.err.println("method not implemented: visitNAMESPACE()");
                break;
            case XQFTParser.EQSi:
                //return visitor.visitEQSi(this);
                System.err.println("method not implemented: visitEQSi()");
                break;
            case XQFTParser.COMMASi:
                //return visitor.visitCOMMASi(this);
                System.err.println("method not implemented: visitCOMMASi()");
                break;
            case XQFTParser.DECLARE:
                //return visitor.visitDECLARE(this);
                System.err.println("method not implemented: visitDECLARE()");
                break;
            case XQFTParser.DEFAULT:
                //return visitor.visitDEFAULT(this);
                System.err.println("method not implemented: visitDEFAULT()");
                break;
            case XQFTParser.ELEMENT:
                //return visitor.visitELEMENT(this);
                System.err.println("method not implemented: visitELEMENT()");
                break;
            case XQFTParser.FUNCTION:
                //return visitor.visitFUNCTION(this);
                System.err.println("method not implemented: visitFUNCTION()");
                break;
            case XQFTParser.COLLATION:
                //return visitor.visitCOLLATION(this);
                System.err.println("method not implemented: visitCOLLATION()");
                break;
            case XQFTParser.ORDER:
                //return visitor.visitORDER(this);
                System.err.println("method not implemented: visitORDER()");
                break;
            case XQFTParser.EMPTY:
                //return visitor.visitEMPTY(this);
                System.err.println("method not implemented: visitEMPTY()");
                break;
            case XQFTParser.GREATEST:
                //return visitor.visitGREATEST(this);
                System.err.println("method not implemented: visitGREATEST()");
                break;
            case XQFTParser.LEAST:
                //return visitor.visitLEAST(this);
                System.err.println("method not implemented: visitLEAST()");
                break;
            case XQFTParser.BOUNDARYSPACE:
                //return visitor.visitBOUNDARYSPACE(this);
                System.err.println("method not implemented: visitBOUNDARYSPACE()");
                break;
            case XQFTParser.PRESERVE:
                //return visitor.visitPRESERVE(this);
                System.err.println("method not implemented: visitPRESERVE()");
                break;
            case XQFTParser.STRIP:
                //return visitor.visitSTRIP(this);
                System.err.println("method not implemented: visitSTRIP()");
                break;
            case XQFTParser.BASE_URI:
                //return visitor.visitBASE_URI(this);
                System.err.println("method not implemented: visitBASE_URI()");
                break;
            case XQFTParser.CONSTRUCTION:
                //return visitor.visitCONSTRUCTION(this);
                System.err.println("method not implemented: visitCONSTRUCTION()");
                break;
            case XQFTParser.ORDERING:
                //return visitor.visitORDERING(this);
                System.err.println("method not implemented: visitORDERING()");
                break;
            case XQFTParser.ORDERED:
                //return visitor.visitORDERED(this);
                System.err.println("method not implemented: visitORDERED()");
                break;
            case XQFTParser.UNORDERED:
                //return visitor.visitUNORDERED(this);
                System.err.println("method not implemented: visitUNORDERED()");
                break;
            case XQFTParser.COPY_NAMESPACES:
                //return visitor.visitCOPY_NAMESPACES(this);
                System.err.println("method not implemented: visitCOPY_NAMESPACES()");
                break;
            case XQFTParser.NOPRESERVE:
                //return visitor.visitNOPRESERVE(this);
                System.err.println("method not implemented: visitNOPRESERVE()");
                break;
            case XQFTParser.INHERIT:
                //return visitor.visitINHERIT(this);
                System.err.println("method not implemented: visitINHERIT()");
                break;
            case XQFTParser.NOINHERIT:
                //return visitor.visitNOINHERIT(this);
                System.err.println("method not implemented: visitNOINHERIT()");
                break;
            case XQFTParser.IMPORT:
                //return visitor.visitIMPORT(this);
                System.err.println("method not implemented: visitIMPORT()");
                break;
            case XQFTParser.SCHEMA:
                //return visitor.visitSCHEMA(this);
                System.err.println("method not implemented: visitSCHEMA()");
                break;
            case XQFTParser.AT:
                //return visitor.visitAT(this);
                System.err.println("method not implemented: visitAT()");
                break;
            case XQFTParser.VARIABLE:
                //return visitor.visitVARIABLE(this);
                System.err.println("method not implemented: visitVARIABLE()");
                break;
            case XQFTParser.DOLLARSi:
                return visitor.visitDOLLARSi(this);
                //System.err.println("method not implemented: visitDOLLARSi()");
                //break;
            case XQFTParser.ASSIGNSi:
                //return visitor.visitASSIGNSi(this);
                System.err.println("method not implemented: visitASSIGNSi()");
                break;
            case XQFTParser.EXTERNAL:
                //return visitor.visitEXTERNAL(this);
                System.err.println("method not implemented: visitEXTERNAL()");
                break;
            case XQFTParser.QName:
                //return visitor.visitQName(this);
                System.err.println("method not implemented: visitQName()");
                break;
            case XQFTParser.AS:
                //return visitor.visitAS(this);
                System.err.println("method not implemented: visitAS()");
                break;
            case XQFTParser.LPARSi:
                return visitor.visitLPARSi(this);
                //System.err.println("method not implemented: visitLPARSi()");
                //break;
            case XQFTParser.RPARSi:
                //return visitor.visitRPARSi(this);
                System.err.println("method not implemented: visitRPARSi()");
                break;
            case XQFTParser.LBRACESi:
                //return visitor.visitLBRACESi(this);
                System.err.println("method not implemented: visitLBRACESi()");
                break;
            case XQFTParser.RBRACSi:
                //return visitor.visitRBRACSi(this);
                System.err.println("method not implemented: visitRBRACSi()");
                break;
            case XQFTParser.OPTION:
                //return visitor.visitOPTION(this);
                System.err.println("method not implemented: visitOPTION()");
                break;
            case XQFTParser.FTOPTION:
                //return visitor.visitFTOPTION(this);
                System.err.println("method not implemented: visitFTOPTION()");
                break;
            case XQFTParser.EMPTY_SEQUENCE:
                //return visitor.visitEMPTY_SEQUENCE(this);
                System.err.println("method not implemented: visitEMPTY_SEQUENCE()");
                break;
            case XQFTParser.ITEM:
                //return visitor.visitITEM(this);
                System.err.println("method not implemented: visitITEM()");
                break;
            case XQFTParser.DOCUMENT_NODE:
                //return visitor.visitDOCUMENT_NODE(this);
                System.err.println("method not implemented: visitDOCUMENT_NODE()");
                break;
            case XQFTParser.QUESTIONSi:
                //return visitor.visitQUESTIONSi(this);
                System.err.println("method not implemented: visitQUESTIONSi()");
                break;
            case XQFTParser.STARSi:
                //return visitor.visitSTARSi(this);
                System.err.println("method not implemented: visitSTARSi()");
                break;
            case XQFTParser.SCHEMA_ELEMENT:
                //return visitor.visitSCHEMA_ELEMENT(this);
                System.err.println("method not implemented: visitSCHEMA_ELEMENT()");
                break;
            case XQFTParser.ATTRIBUTE:
                //return visitor.visitATTRIBUTE(this);
                System.err.println("method not implemented: visitATTRIBUTE()");
                break;
            case XQFTParser.SCHEMA_ATTRIBUTE:
                //return visitor.visitSCHEMA_ATTRIBUTE(this);
                System.err.println("method not implemented: visitSCHEMA_ATTRIBUTE()");
                break;
            case XQFTParser.PROCESSING_INSTRUCTION:
                //return visitor.visitPROCESSING_INSTRUCTION(this);
                System.err.println("method not implemented: visitPROCESSING_INSTRUCTION()");
                break;
            case XQFTParser.COMMENT:
                //return visitor.visitCOMMENT(this);
                System.err.println("method not implemented: visitCOMMENT()");
                break;
            case XQFTParser.TEXT:
                //return visitor.visitTEXT(this);
                System.err.println("method not implemented: visitTEXT()");
                break;
            case XQFTParser.NODE:
                //return visitor.visitNODE(this);
                System.err.println("method not implemented: visitNODE()");
                break;
            case XQFTParser.PLUSSi:
                //return visitor.visitPLUSSi(this);
                System.err.println("method not implemented: visitPLUSSi()");
                break;
            case XQFTParser.RETURN:
                //return visitor.visitRETURN(this);
                System.err.println("method not implemented: visitRETURN()");
                break;
            case XQFTParser.FOR:
                //return visitor.visitFOR(this);
                System.err.println("method not implemented: visitFOR()");
                break;
            case XQFTParser.IN:
                //return visitor.visitIN(this);
                System.err.println("method not implemented: visitIN()");
                break;
            case XQFTParser.SCORE:
                //return visitor.visitSCORE(this);
                System.err.println("method not implemented: visitSCORE()");
                break;
            case XQFTParser.LET:
                //return visitor.visitLET(this);
                System.err.println("method not implemented: visitLET()");
                break;
            case XQFTParser.WHERE:
                //return visitor.visitWHERE(this);
                System.err.println("method not implemented: visitWHERE()");
                break;
            case XQFTParser.BY:
                //return visitor.visitBY(this);
                System.err.println("method not implemented: visitBY()");
                break;
            case XQFTParser.STABLE:
                //return visitor.visitSTABLE(this);
                System.err.println("method not implemented: visitSTABLE()");
                break;
            case XQFTParser.ASCENDING:
                //return visitor.visitASCENDING(this);
                System.err.println("method not implemented: visitASCENDING()");
                break;
            case XQFTParser.DESCENDING:
                //return visitor.visitDESCENDING(this);
                System.err.println("method not implemented: visitDESCENDING()");
                break;
            case XQFTParser.SOME:
                //return visitor.visitSOME(this);
                System.err.println("method not implemented: visitSOME()");
                break;
            case XQFTParser.EVERY:
                //return visitor.visitEVERY(this);
                System.err.println("method not implemented: visitEVERY()");
                break;
            case XQFTParser.SATISFIES:
                //return visitor.visitSATISFIES(this);
                System.err.println("method not implemented: visitSATISFIES()");
                break;
            case XQFTParser.TYPESWITCH:
                //return visitor.visitTYPESWITCH(this);
                System.err.println("method not implemented: visitTYPESWITCH()");
                break;
            case XQFTParser.CASE:
                //return visitor.visitCASE(this);
                System.err.println("method not implemented: visitCASE()");
                break;
            case XQFTParser.IF:
                return visitor.visitIF(this);
                //System.err.println("method not implemented: visitIF()");
                //break;
            case XQFTParser.THEN:
                return visitor.visitTHEN(this);
                //System.err.println("method not implemented: visitTHEN()");
                //break;
            case XQFTParser.ELSE:
                return visitor.visitELSE(this);
                //System.err.println("method not implemented: visitELSE()");
                //break;
            case XQFTParser.OR:
                //return visitor.visitOR(this);
                System.err.println("method not implemented: visitOR()");
                break;
            case XQFTParser.AND:
                return visitor.visitAND(this);
                //System.err.println("method not implemented: visitAND()");
                //break;
            case XQFTParser.FTCONTAINS:
                //return visitor.visitFTCONTAINS(this);
                System.err.println("method not implemented: visitFTCONTAINS()");
                break;
            case XQFTParser.TO:
                //return visitor.visitTO(this);
                System.err.println("method not implemented: visitTO()");
                break;
            case XQFTParser.MINUSSi:
                //return visitor.visitMINUSSi(this);
                System.err.println("method not implemented: visitMINUSSi()");
                break;
            case XQFTParser.DIV:
                //return visitor.visitDIV(this);
                System.err.println("method not implemented: visitDIV()");
                break;
            case XQFTParser.IDIV:
                //return visitor.visitIDIV(this);
                System.err.println("method not implemented: visitIDIV()");
                break;
            case XQFTParser.MOD:
                //return visitor.visitMOD(this);
                System.err.println("method not implemented: visitMOD()");
                break;
            case XQFTParser.UNION:
                //return visitor.visitUNION(this);
                System.err.println("method not implemented: visitUNION()");
                break;
            case XQFTParser.PIPESi:
                //return visitor.visitPIPESi(this);
                System.err.println("method not implemented: visitPIPESi()");
                break;
            case XQFTParser.INTERSECT:
                //return visitor.visitINTERSECT(this);
                System.err.println("method not implemented: visitINTERSECT()");
                break;
            case XQFTParser.EXCEPT:
                //return visitor.visitEXCEPT(this);
                System.err.println("method not implemented: visitEXCEPT()");
                break;
            case XQFTParser.INSTANCE:
                //return visitor.visitINSTANCE(this);
                System.err.println("method not implemented: visitINSTANCE()");
                break;
            case XQFTParser.OF:
                //return visitor.visitOF(this);
                System.err.println("method not implemented: visitOF()");
                break;
            case XQFTParser.TREAT:
                //return visitor.visitTREAT(this);
                System.err.println("method not implemented: visitTREAT()");
                break;
            case XQFTParser.CASTABLE:
                //return visitor.visitCASTABLE(this);
                System.err.println("method not implemented: visitCASTABLE()");
                break;
            case XQFTParser.CAST:
                //return visitor.visitCAST(this);
                System.err.println("method not implemented: visitCAST()");
                break;
            case XQFTParser.WITHOUT:
                //return visitor.visitWITHOUT(this);
                System.err.println("method not implemented: visitWITHOUT()");
                break;
            case XQFTParser.CONTENT:
                //return visitor.visitCONTENT(this);
                System.err.println("method not implemented: visitCONTENT()");
                break;
            case XQFTParser.EQ:
                //return visitor.visitEQ(this);
                System.err.println("method not implemented: visitEQ()");
                break;
            case XQFTParser.NE:
                //return visitor.visitNE(this);
                System.err.println("method not implemented: visitNE()");
                break;
            case XQFTParser.LT:
                //return visitor.visitLT(this);
                System.err.println("method not implemented: visitLT()");
                break;
            case XQFTParser.LE:
                //return visitor.visitLE(this);
                System.err.println("method not implemented: visitLE()");
                break;
            case XQFTParser.GT:
                //return visitor.visitGT(this);
                System.err.println("method not implemented: visitGT()");
                break;
            case XQFTParser.GE:
                //return visitor.visitGE(this);
                System.err.println("method not implemented: visitGE()");
                break;
            case XQFTParser.NEQSi:
                //return visitor.visitNEQSi(this);
                System.err.println("method not implemented: visitNEQSi()");
                break;
            case XQFTParser.LTSi:
                //return visitor.visitLTSi(this);
                System.err.println("method not implemented: visitLTSi()");
                break;
            case XQFTParser.LTOREQSi:
                //return visitor.visitLTOREQSi(this);
                System.err.println("method not implemented: visitLTOREQSi()");
                break;
            case XQFTParser.GTSi:
                //return visitor.visitGTSi(this);
                System.err.println("method not implemented: visitGTSi()");
                break;
            case XQFTParser.GTOREQSi:
                //return visitor.visitGTOREQSi(this);
                System.err.println("method not implemented: visitGTOREQSi()");
                break;
            case XQFTParser.IS:
                //return visitor.visitIS(this);
                System.err.println("method not implemented: visitIS()");
                break;
            case XQFTParser.NODEBEFORESi:
                //return visitor.visitNODEBEFORESi(this);
                System.err.println("method not implemented: visitNODEBEFORESi()");
                break;
            case XQFTParser.NODEAFTERSi:
                //return visitor.visitNODEAFTERSi(this);
                System.err.println("method not implemented: visitNODEAFTERSi()");
                break;
            case XQFTParser.WEIGHT:
                //return visitor.visitWEIGHT(this);
                System.err.println("method not implemented: visitWEIGHT()");
                break;
            case XQFTParser.FTOR:
                //return visitor.visitFTOR(this);
                System.err.println("method not implemented: visitFTOR()");
                break;
            case XQFTParser.FTAND:
                //return visitor.visitFTAND(this);
                System.err.println("method not implemented: visitFTAND()");
                break;
            case XQFTParser.NOT:
                //return visitor.visitNOT(this);
                System.err.println("method not implemented: visitNOT()");
                break;
            case XQFTParser.FTNOT:
                //return visitor.visitFTNOT(this);
                System.err.println("method not implemented: visitFTNOT()");
                break;
            case XQFTParser.IntegerLiteral:
                return visitor.visitIntegerLiteral(this);
            case XQFTParser.DecimalLiteral:
                //return visitor.visitDecimalLiteral(this);
                System.err.println("method not implemented: visitDecimalLiteral()");
                break;
            case XQFTParser.DoubleLiteral:
                //return visitor.visitDoubleLiteral(this);
                System.err.println("method not implemented: visitDoubleLiteral()");
                break;
            case XQFTParser.ANY:
                //return visitor.visitANY(this);
                System.err.println("method not implemented: visitANY()");
                break;
            case XQFTParser.WORD:
                //return visitor.visitWORD(this);
                System.err.println("method not implemented: visitWORD()");
                break;
            case XQFTParser.ALL:
                //return visitor.visitALL(this);
                System.err.println("method not implemented: visitALL()");
                break;
            case XQFTParser.WORDS:
                //return visitor.visitWORDS(this);
                System.err.println("method not implemented: visitWORDS()");
                break;
            case XQFTParser.PHRASE:
                //return visitor.visitPHRASE(this);
                System.err.println("method not implemented: visitPHRASE()");
                break;
            case XQFTParser.OCCURS:
                //return visitor.visitOCCURS(this);
                System.err.println("method not implemented: visitOCCURS()");
                break;
            case XQFTParser.TIMES:
                //return visitor.visitTIMES(this);
                System.err.println("method not implemented: visitTIMES()");
                break;
            case XQFTParser.EXACTLY:
                //return visitor.visitEXACTLY(this);
                System.err.println("method not implemented: visitEXACTLY()");
                break;
            case XQFTParser.MOST:
                //return visitor.visitMOST(this);
                System.err.println("method not implemented: visitMOST()");
                break;
            case XQFTParser.FROM:
                //return visitor.visitFROM(this);
                System.err.println("method not implemented: visitFROM()");
                break;
            case XQFTParser.LPRAGSi:
                //return visitor.visitLPRAGSi(this);
                System.err.println("method not implemented: visitLPRAGSi()");
                break;
            case XQFTParser.PragmaContents:
                //return visitor.visitPragmaContents(this);
                System.err.println("method not implemented: visitPragmaContents()");
                break;
            case XQFTParser.RPRAGSi:
                //return visitor.visitRPRAGSi(this);
                System.err.println("method not implemented: visitRPRAGSi()");
                break;
            case XQFTParser.WINDOW:
                //return visitor.visitWINDOW(this);
                System.err.println("method not implemented: visitWINDOW()");
                break;
            case XQFTParser.SENTENCES:
                //return visitor.visitSENTENCES(this);
                System.err.println("method not implemented: visitSENTENCES()");
                break;
            case XQFTParser.PARAGRAPHS:
                //return visitor.visitPARAGRAPHS(this);
                System.err.println("method not implemented: visitPARAGRAPHS()");
                break;
            case XQFTParser.DISTANCE:
                //return visitor.visitDISTANCE(this);
                System.err.println("method not implemented: visitDISTANCE()");
                break;
            case XQFTParser.SAME:
                //return visitor.visitSAME(this);
                System.err.println("method not implemented: visitSAME()");
                break;
            case XQFTParser.DIFFERENT:
                //return visitor.visitDIFFERENT(this);
                System.err.println("method not implemented: visitDIFFERENT()");
                break;
            case XQFTParser.SENTENCE:
                //return visitor.visitSENTENCE(this);
                System.err.println("method not implemented: visitSENTENCE()");
                break;
            case XQFTParser.PARAGRAPH:
                //return visitor.visitPARAGRAPH(this);
                System.err.println("method not implemented: visitPARAGRAPH()");
                break;
            case XQFTParser.START:
                //return visitor.visitSTART(this);
                System.err.println("method not implemented: visitSTART()");
                break;
            case XQFTParser.END:
                //return visitor.visitEND(this);
                System.err.println("method not implemented: visitEND()");
                break;
            case XQFTParser.ENTIRE:
                //return visitor.visitENTIRE(this);
                System.err.println("method not implemented: visitENTIRE()");
                break;
            case XQFTParser.WITH:
                //return visitor.visitWITH(this);
                System.err.println("method not implemented: visitWITH()");
                break;
            case XQFTParser.WILDCARDS:
                //return visitor.visitWILDCARDS(this);
                System.err.println("method not implemented: visitWILDCARDS()");
                break;
            case XQFTParser.STEMMING:
                //return visitor.visitSTEMMING(this);
                System.err.println("method not implemented: visitSTEMMING()");
                break;
            case XQFTParser.THESAURUS:
                //return visitor.visitTHESAURUS(this);
                System.err.println("method not implemented: visitTHESAURUS()");
                break;
            case XQFTParser.STOP:
                //return visitor.visitSTOP(this);
                System.err.println("method not implemented: visitSTOP()");
                break;
            case XQFTParser.LANGUAGE:
                //return visitor.visitLANGUAGE(this);
                System.err.println("method not implemented: visitLANGUAGE()");
                break;
            case XQFTParser.INSENSITIVE:
                //return visitor.visitINSENSITIVE(this);
                System.err.println("method not implemented: visitINSENSITIVE()");
                break;
            case XQFTParser.SENSITIVE:
                //return visitor.visitSENSITIVE(this);
                System.err.println("method not implemented: visitSENSITIVE()");
                break;
            case XQFTParser.LOWERCASE:
                //return visitor.visitLOWERCASE(this);
                System.err.println("method not implemented: visitLOWERCASE()");
                break;
            case XQFTParser.UPPERCASE:
                //return visitor.visitUPPERCASE(this);
                System.err.println("method not implemented: visitUPPERCASE()");
                break;
            case XQFTParser.DIACRITICS:
                //return visitor.visitDIACRITICS(this);
                System.err.println("method not implemented: visitDIACRITICS()");
                break;
            case XQFTParser.RELATIONSHIP:
                //return visitor.visitRELATIONSHIP(this);
                System.err.println("method not implemented: visitRELATIONSHIP()");
                break;
            case XQFTParser.LEVELS:
                //return visitor.visitLEVELS(this);
                System.err.println("method not implemented: visitLEVELS()");
                break;
            case XQFTParser.VALIDATE:
                //return visitor.visitVALIDATE(this);
                System.err.println("method not implemented: visitVALIDATE()");
                break;
            case XQFTParser.LAX:
                //return visitor.visitLAX(this);
                System.err.println("method not implemented: visitLAX()");
                break;
            case XQFTParser.STRICT:
                //return visitor.visitSTRICT(this);
                System.err.println("method not implemented: visitSTRICT()");
                break;
            case XQFTParser.SLASHSi:
                return visitor.visitSLASHSi(this);
                //System.err.println("method not implemented: visitSLASHSi()");
                //break;
            case XQFTParser.DBLSLASHSi:
                //return visitor.visitDBLSLASHSi(this);
                System.err.println("method not implemented: visitDBLSLASHSi()");
                break;
            case XQFTParser.PARENT:
                //return visitor.visitPARENT(this);
                System.err.println("method not implemented: visitPARENT()");
                break;
            case XQFTParser.ANCESTOR:
                //return visitor.visitANCESTOR(this);
                System.err.println("method not implemented: visitANCESTOR()");
                break;
            case XQFTParser.PRECEDING_SIBLING:
                //return visitor.visitPRECEDING_SIBLING(this);
                System.err.println("method not implemented: visitPRECEDING_SIBLING()");
                break;
            case XQFTParser.PRECEDING:
                //return visitor.visitPRECEDING(this);
                System.err.println("method not implemented: visitPRECEDING()");
                break;
            case XQFTParser.ANCESTOR_OR_SELF:
                //return visitor.visitANCESTOR_OR_SELF(this);
                System.err.println("method not implemented: visitANCESTOR_OR_SELF()");
                break;
            case XQFTParser.DBLCOLONSi:
                //return visitor.visitDBLCOLONSi(this);
                System.err.println("method not implemented: visitDBLCOLONSi()");
                break;
            case XQFTParser.COLONSi:
                //return visitor.visitCOLONSi(this);
                System.err.println("method not implemented: visitCOLONSi()");
                break;
            case XQFTParser.DOTDOTSi:
                //return visitor.visitDOTDOTSi(this);
                System.err.println("method not implemented: visitDOTDOTSi()");
                break;
            case XQFTParser.CHILD:
                //return visitor.visitCHILD(this);
                System.err.println("method not implemented: visitCHILD()");
                break;
            case XQFTParser.DESCENDANT:
                //return visitor.visitDESCENDANT(this);
                System.err.println("method not implemented: visitDESCENDANT()");
                break;
            case XQFTParser.SELF:
                //return visitor.visitSELF(this);
                System.err.println("method not implemented: visitSELF()");
                break;
            case XQFTParser.DESCENDANT_OR_SELF:
                //return visitor.visitDESCENDANT_OR_SELF(this);
                System.err.println("method not implemented: visitDESCENDANT_OR_SELF()");
                break;
            case XQFTParser.FOLLOWING_SIBLING:
                //return visitor.visitFOLLOWING_SIBLING(this);
                System.err.println("method not implemented: visitFOLLOWING_SIBLING()");
                break;
            case XQFTParser.FOLLOWING:
                //return visitor.visitFOLLOWING(this);
                System.err.println("method not implemented: visitFOLLOWING()");
                break;
            case XQFTParser.ATSi:
                //return visitor.visitATSi(this);
                System.err.println("method not implemented: visitATSi()");
                break;
            case XQFTParser.LBRACKSi:
                //return visitor.visitLBRACKSi(this);
                System.err.println("method not implemented: visitLBRACKSi()");
                break;
            case XQFTParser.RBRACKSi:
                //return visitor.visitRBRACKSi(this);
                System.err.println("method not implemented: visitRBRACKSi()");
                break;
            case XQFTParser.DOTSi:
                //return visitor.visitDOTSi(this);
                System.err.println("method not implemented: visitDOTSi()");
                break;
            case XQFTParser.RSELFTERMSi:
                //return visitor.visitRSELFTERMSi(this);
                System.err.println("method not implemented: visitRSELFTERMSi()");
                break;
            case XQFTParser.LENDTAGSi:
                //return visitor.visitLENDTAGSi(this);
                System.err.println("method not implemented: visitLENDTAGSi()");
                break;
            case XQFTParser.QUOTSi:
                //return visitor.visitQUOTSi(this);
                System.err.println("method not implemented: visitQUOTSi()");
                break;
            case XQFTParser.QuotAttributeContent:
                //return visitor.visitQuotAttributeContent(this);
                System.err.println("method not implemented: visitQuotAttributeContent()");
                break;
            case XQFTParser.APOSSi:
                //return visitor.visitAPOSSi(this);
                System.err.println("method not implemented: visitAPOSSi()");
                break;
            case XQFTParser.AposAttributeContent:
                //return visitor.visitAposAttributeContent(this);
                System.err.println("method not implemented: visitAposAttributeContent()");
                break;
            case XQFTParser.ElementContent:
                //return visitor.visitElementContent(this);
                System.err.println("method not implemented: visitElementContent()");
                break;
            case XQFTParser.LCDATASi:
                //return visitor.visitLCDATASi(this);
                System.err.println("method not implemented: visitLCDATASi()");
                break;
            case XQFTParser.CDataContents:
                //return visitor.visitCDataContents(this);
                System.err.println("method not implemented: visitCDataContents()");
                break;
            case XQFTParser.RCDATASi:
                //return visitor.visitRCDATASi(this);
                System.err.println("method not implemented: visitRCDATASi()");
                break;
            case XQFTParser.LCOMMENTSi:
                //return visitor.visitLCOMMENTSi(this);
                System.err.println("method not implemented: visitLCOMMENTSi()");
                break;
            case XQFTParser.DirCommentContent:
                //return visitor.visitDirCommentContent(this);
                System.err.println("method not implemented: visitDirCommentContent()");
                break;
            case XQFTParser.RCOMMENTSi:
                //return visitor.visitRCOMMENTSi(this);
                System.err.println("method not implemented: visitRCOMMENTSi()");
                break;
            case XQFTParser.LPISi:
                //return visitor.visitLPISi(this);
                System.err.println("method not implemented: visitLPISi()");
                break;
            case XQFTParser.PiTarget:
                //return visitor.visitPiTarget(this);
                System.err.println("method not implemented: visitPiTarget()");
                break;
            case XQFTParser.DirPiContents:
                //return visitor.visitDirPiContents(this);
                System.err.println("method not implemented: visitDirPiContents()");
                break;
            case XQFTParser.RPISi:
                //return visitor.visitRPISi(this);
                System.err.println("method not implemented: visitRPISi()");
                break;
            case XQFTParser.DOCUMENT:
                //return visitor.visitDOCUMENT(this);
                System.err.println("method not implemented: visitDOCUMENT()");
                break;
            case XQFTParser.NCName:
                return visitor.visitNCName(this);
                //System.err.println("method not implemented: visitNCName()");
                //break;
            case XQFTParser.CDataSectionLEX:
                //return visitor.visitCDataSectionLEX(this);
                System.err.println("method not implemented: visitCDataSectionLEX()");
                break;
            case XQFTParser.DirPIConstructor:
                //return visitor.visitDirPIConstructor(this);
                System.err.println("method not implemented: visitDirPIConstructor()");
                break;
            case XQFTParser.DirCommentConstLEX:
                //return visitor.visitDirCommentConstLEX(this);
                System.err.println("method not implemented: visitDirCommentConstLEX()");
                break;
            case XQFTParser.PragmaLEX:
                //return visitor.visitPragmaLEX(this);
                System.err.println("method not implemented: visitPragmaLEX()");
                break;
            case XQFTParser.Comment:
                //return visitor.visitComment(this);
                System.err.println("method not implemented: visitComment()");
                break;
            case XQFTParser.NumberLEX:
                //return visitor.visitNumberLEX(this);
                System.err.println("method not implemented: visitNumberLEX()");
                break;
            case XQFTParser.LexSigns:
                //return visitor.visitLexSigns(this);
                System.err.println("method not implemented: visitLexSigns()");
                break;
            case XQFTParser.S:
                //return visitor.visitS(this);
                System.err.println("method not implemented: visitS()");
                break;
            case XQFTParser.LexLiterals:
                //return visitor.visitLexLiterals(this);
                System.err.println("method not implemented: visitLexLiterals()");
                break;
            case XQFTParser.TOKENSWITCH:
                //return visitor.visitTOKENSWITCH(this);
                System.err.println("method not implemented: visitTOKENSWITCH()");
                break;
            case XQFTParser.PredefinedEntityRef:
                //return visitor.visitPredefinedEntityRef(this);
                System.err.println("method not implemented: visitPredefinedEntityRef()");
                break;
            case XQFTParser.CharRef:
                //return visitor.visitCharRef(this);
                System.err.println("method not implemented: visitCharRef()");
                break;
            case XQFTParser.NotChar:
                //return visitor.visitNotChar(this);
                System.err.println("method not implemented: visitNotChar()");
                break;
            case XQFTParser.AMPERSi:
                //return visitor.visitAMPERSi(this);
                System.err.println("method not implemented: visitAMPERSi()");
                break;
            case XQFTParser.QuotAttrContentChar:
                //return visitor.visitQuotAttrContentChar(this);
                System.err.println("method not implemented: visitQuotAttrContentChar()");
                break;
            case XQFTParser.AposAttrContentChar:
                //return visitor.visitAposAttrContentChar(this);
                System.err.println("method not implemented: visitAposAttrContentChar()");
                break;
            case XQFTParser.ElementContentChar:
                //return visitor.visitElementContentChar(this);
                System.err.println("method not implemented: visitElementContentChar()");
                break;
            case XQFTParser.CREFDECSi:
                //return visitor.visitCREFDECSi(this);
                System.err.println("method not implemented: visitCREFDECSi()");
                break;
            case XQFTParser.CREFHEXSi:
                //return visitor.visitCREFHEXSi(this);
                System.err.println("method not implemented: visitCREFHEXSi()");
                break;
            case XQFTParser.Name:
                //return visitor.visitName(this);
                System.err.println("method not implemented: visitName()");
                break;
            case XQFTParser.Letter:
                //return visitor.visitLetter(this);
                System.err.println("method not implemented: visitLetter()");
                break;
            case XQFTParser.UNDERSCORESi:
                //return visitor.visitUNDERSCORESi(this);
                System.err.println("method not implemented: visitUNDERSCORESi()");
                break;
            case XQFTParser.NameChar:
                //return visitor.visitNameChar(this);
                System.err.println("method not implemented: visitNameChar()");
                break;
            case XQFTParser.Digit:
                //return visitor.visitDigit(this);
                System.err.println("method not implemented: visitDigit()");
                break;
            case XQFTParser.CombiningChar:
                //return visitor.visitCombiningChar(this);
                System.err.println("method not implemented: visitCombiningChar()");
                break;
            case XQFTParser.Extender:
                //return visitor.visitExtender(this);
                System.err.println("method not implemented: visitExtender()");
                break;
            case XQFTParser.SHARPSi:
                //return visitor.visitSHARPSi(this);
                System.err.println("method not implemented: visitSHARPSi()");
                break;
            case XQFTParser.LXQCOMMENTSi:
                //return visitor.visitLXQCOMMENTSi(this);
                System.err.println("method not implemented: visitLXQCOMMENTSi()");
                break;
            case XQFTParser.RXQCOMMENTSi:
                //return visitor.visitRXQCOMMENTSi(this);
                System.err.println("method not implemented: visitRXQCOMMENTSi()");
                break;
            case XQFTParser.Digits:
                //return visitor.visitDigits(this);
                System.err.println("method not implemented: visitDigits()");
                break;
            case XQFTParser.NCNameStartChar:
                //return visitor.visitNCNameStartChar(this);
                System.err.println("method not implemented: visitNCNameStartChar()");
                break;
            case XQFTParser.NCNameChar:
                //return visitor.visitNCNameChar(this);
                System.err.println("method not implemented: visitNCNameChar()");
                break;
            case XQFTParser.EXCLSi:
                //return visitor.visitEXCLSi(this);
                System.err.println("method not implemented: visitEXCLSi()");
                break;
            case XQFTParser.BACKSLASHSi:
                //return visitor.visitBACKSLASHSi(this);
                System.err.println("method not implemented: visitBACKSLASHSi()");
                break;
            case XQFTParser.ExtraChar:
                //return visitor.visitExtraChar(this);
                System.err.println("method not implemented: visitExtraChar()");
                break;
            case XQFTParser.BaseChar:
                //return visitor.visitBaseChar(this);
                System.err.println("method not implemented: visitBaseChar()");
                break;
            case XQFTParser.Ideographic:
                //return visitor.visitIdeographic(this);
                System.err.println("method not implemented: visitIdeographic()");
                break;
            case XQFTParser.CleanChar:
                //return visitor.visitCleanChar(this);
                System.err.println("method not implemented: visitCleanChar()");
                break;
            case XQFTParser.Char:
                //return visitor.visitChar(this);
                System.err.println("method not implemented: visitChar()");
                break;
        }
        
        return null;
    }


    public static int i = 0;
    public int my_i;
    public boolean printTokenName = false;
    
    public int predLvl;
    
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
