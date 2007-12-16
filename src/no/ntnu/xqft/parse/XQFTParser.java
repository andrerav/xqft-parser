// $ANTLR 3.0.1 etc/XQFT.g 2007-12-16 16:09:27

	package no.ntnu.xqft.parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class XQFTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL", "ANY", "ANCESTOR", "ANCESTOR_OR_SELF", "AND", "AS", "ASCENDING", "AT", "ATTRIBUTE", "BASE_URI", "BY", "BOUNDARYSPACE", "CASE", "CAST", "CASTABLE", "CHILD", "COLLATION", "COMMENT", "CONSTRUCTION", "CONTENT", "COPY_NAMESPACES", "DECLARE", "DEFAULT", "DESCENDANT", "DESCENDANT_OR_SELF", "DESCENDING", "DIACRITICS", "DIFFERENT", "DISTANCE", "DIV", "DOCUMENT", "DOCUMENT_NODE", "ELEMENT", "ELSE", "ENCODING", "END", "ENTIRE", "EMPTY", "EMPTY_SEQUENCE", "EQ", "EVERY", "EXACTLY", "EXCEPT", "EXTERNAL", "FOLLOWING", "FOLLOWING_SIBLING", "FOR", "FROM", "FTAND", "FTCONTAINS", "FTNOT", "FTOPTION", "FTOR", "FUNCTION", "GE", "GREATEST", "GT", "IDIV", "IF", "IMPORT", "IN", "INHERIT", "INSENSITIVE", "INSTANCE", "INTERSECT", "IS", "ITEM", "LANGUAGE", "LAX", "LE", "LEAST", "LET", "LEVELS", "LOWERCASE", "LT", "MOD", "MODULE", "MOST", "NAMESPACE", "NE", "NODE", "NOINHERIT", "NOPRESERVE", "NOT", "OCCURS", "OF", "OPTION", "OR", "ORDER", "ORDERED", "ORDERING", "PARAGRAPH", "PARAGRAPHS", "PARENT", "PHRASE", "PRECEDING", "PRECEDING_SIBLING", "PRESERVE", "PROCESSING_INSTRUCTION", "RELATIONSHIP", "RETURN", "SAME", "SATISFIES", "SCHEMA", "SCHEMA_ATTRIBUTE", "SCHEMA_ELEMENT", "SCORE", "SELF", "SENSITIVE", "SENTENCES", "SENTENCE", "SOME", "STABLE", "START", "STEMMING", "STOP", "STRICT", "STRIP", "TEXT", "THESAURUS", "THEN", "TIMES", "TO", "TREAT", "TYPESWITCH", "UNION", "UNORDERED", "UPPERCASE", "VALIDATE", "VARIABLE", "VERSION", "WEIGHT", "WHERE", "WILDCARDS", "WINDOW", "WITH", "WITHOUT", "WORD", "WORDS", "XQUERY", "AST_MODULE", "AST_FLWOR", "AST_FORCLAUSE", "AST_LETCLAUSE", "AST_ORDERBYCLAUSE", "AST_WHERECLAUSE", "AST_RETURNCLAUSE", "AST_QUANTIFIEDEXPR", "AST_TYPESWITCHEXPR", "AST_CASECLAUSE", "AST_IFEXPR", "AST_PATHEXPR", "AST_FTSELECTION", "AST_FTPOSFILTER", "AST_FUNCTIONCALL", "AST_FUNCTIONDECL", "AST_PREDICATE", "AST_DIRELEMCONSTRUCTOR", "AST_DIRELEMCONTENT", "StringLiteral", "SEMICOLONSi", "EQSi", "COMMASi", "DOLLARSi", "ASSIGNSi", "COLONSi", "LPARSi", "RPARSi", "LBRACESi", "RBRACSi", "QUESTIONSi", "STARSi", "PLUSSi", "MINUSSi", "PIPESi", "NEQSi", "LTSi", "LTOREQSi", "GTSi", "GTOREQSi", "NODEBEFORESi", "NODEAFTERSi", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "LPRAGSi", "PragmaContents", "RPRAGSi", "SLASHSi", "DBLSLASHSi", "DBLCOLONSi", "DOTDOTSi", "ATSi", "LBRACKSi", "RBRACKSi", "DOTSi", "RSELFTERMSi", "LENDTAGSi", "QUOTSi", "QuotAttributeContent", "APOSSi", "AposAttributeContent", "ElementContent", "LCDATASi", "CDataContents", "RCDATASi", "LCOMMENTSi", "DirCommentContent", "RCOMMENTSi", "LPISi", "PiTarget", "DirPiContents", "RPISi", "NCName", "CDataSectionLEX", "DirPIConstructor", "DirCommentConstLEX", "PragmaLEX", "Comment", "NumberLEX", "LexSigns", "S", "LexLiterals", "TOKENSWITCH", "PredefinedEntityRef", "CharRef", "NotChar", "AMPERSi", "QuotAttrContentChar", "AposAttrContentChar", "ElementContentChar", "CREFDECSi", "CREFHEXSi", "Name", "Letter", "UNDERSCORESi", "NameChar", "Digit", "CombiningChar", "Extender", "SHARPSi", "LXQCOMMENTSi", "RXQCOMMENTSi", "Digits", "NCNameStartChar", "NCNameChar", "EXCLSi", "BACKSLASHSi", "ExtraChar", "BaseChar", "Ideographic", "CleanChar", "Char"
    };
    public static final int NotChar=230;
    public static final int LENDTAGSi=201;
    public static final int QUOTSi=202;
    public static final int END=39;
    public static final int NOINHERIT=85;
    public static final int INSTANCE=67;
    public static final int LBRACESi=172;
    public static final int CONTENT=23;
    public static final int LAX=72;
    public static final int STOP=119;
    public static final int IMPORT=63;
    public static final int PIPESi=178;
    public static final int APOSSi=204;
    public static final int AposAttrContentChar=233;
    public static final int DBLCOLONSi=194;
    public static final int Letter=238;
    public static final int CASTABLE=18;
    public static final int DIACRITICS=30;
    public static final int ORDER=92;
    public static final int RCOMMENTSi=212;
    public static final int TYPESWITCH=128;
    public static final int MODULE=80;
    public static final int VERSION=134;
    public static final int Ideographic=254;
    public static final int DBLSLASHSi=193;
    public static final int EXACTLY=45;
    public static final int FTNOT=54;
    public static final int DECLARE=25;
    public static final int GTSi=182;
    public static final int TOKENSWITCH=227;
    public static final int ElementContentChar=234;
    public static final int OCCURS=88;
    public static final int UNION=129;
    public static final int STRIP=121;
    public static final int NameChar=240;
    public static final int PLUSSi=176;
    public static final int AST_WHERECLAUSE=149;
    public static final int QuotAttrContentChar=232;
    public static final int SAME=105;
    public static final int FTCONTAINS=53;
    public static final int AST_IFEXPR=154;
    public static final int QUESTIONSi=174;
    public static final int DESCENDING=29;
    public static final int FTOPTION=55;
    public static final int AST_ORDERBYCLAUSE=148;
    public static final int DOCUMENT_NODE=35;
    public static final int ANCESTOR_OR_SELF=7;
    public static final int LCDATASi=207;
    public static final int ANY=5;
    public static final int RELATIONSHIP=103;
    public static final int GE=58;
    public static final int CREFHEXSi=236;
    public static final int AST_MODULE=144;
    public static final int GTOREQSi=183;
    public static final int ELSE=37;
    public static final int WORD=141;
    public static final int SENSITIVE=112;
    public static final int SELF=111;
    public static final int DISTANCE=32;
    public static final int ExtraChar=252;
    public static final int LPISi=213;
    public static final int CREFDECSi=235;
    public static final int NODEBEFORESi=184;
    public static final int TEXT=122;
    public static final int CombiningChar=242;
    public static final int PARENT=97;
    public static final int NCName=217;
    public static final int FTOR=56;
    public static final int SCORE=110;
    public static final int PragmaLEX=221;
    public static final int Digit=241;
    public static final int EXTERNAL=47;
    public static final int EMPTY_SEQUENCE=42;
    public static final int UNDERSCORESi=239;
    public static final int RCDATASi=209;
    public static final int DOLLARSi=167;
    public static final int CAST=17;
    public static final int AST_FUNCTIONCALL=158;
    public static final int MOD=79;
    public static final int EXCEPT=46;
    public static final int OR=91;
    public static final int NOPRESERVE=86;
    public static final int S=225;
    public static final int RPARSi=171;
    public static final int BY=14;
    public static final int COLONSi=169;
    public static final int SCHEMA_ELEMENT=109;
    public static final int SLASHSi=192;
    public static final int WEIGHT=135;
    public static final int AST_RETURNCLAUSE=150;
    public static final int PRECEDING_SIBLING=100;
    public static final int UPPERCASE=131;
    public static final int AST_LETCLAUSE=147;
    public static final int SEMICOLONSi=164;
    public static final int FROM=51;
    public static final int STEMMING=118;
    public static final int TIMES=125;
    public static final int EMPTY=41;
    public static final int ASCENDING=10;
    public static final int CleanChar=255;
    public static final int IntegerLiteral=186;
    public static final int SENTENCES=113;
    public static final int NE=83;
    public static final int AposAttributeContent=205;
    public static final int COMMENT=21;
    public static final int MINUSSi=177;
    public static final int NCNameChar=249;
    public static final int ENTIRE=40;
    public static final int WITH=139;
    public static final int IN=64;
    public static final int AST_DIRELEMCONTENT=162;
    public static final int SOME=115;
    public static final int MOST=81;
    public static final int RETURN=104;
    public static final int AST_FTSELECTION=156;
    public static final int LET=75;
    public static final int IF=62;
    public static final int Extender=243;
    public static final int NODE=84;
    public static final int FOR=50;
    public static final int DEFAULT=26;
    public static final int PRESERVE=101;
    public static final int AST_FTPOSFILTER=157;
    public static final int DirCommentContent=211;
    public static final int LEVELS=76;
    public static final int LPRAGSi=189;
    public static final int COMMASi=166;
    public static final int ATTRIBUTE=12;
    public static final int CHILD=19;
    public static final int Digits=247;
    public static final int NOT=87;
    public static final int OPTION=90;
    public static final int ELEMENT=36;
    public static final int Comment=222;
    public static final int INSENSITIVE=66;
    public static final int AS=9;
    public static final int DOCUMENT=34;
    public static final int ENCODING=38;
    public static final int BOUNDARYSPACE=15;
    public static final int TREAT=127;
    public static final int NAMESPACE=82;
    public static final int LXQCOMMENTSi=245;
    public static final int LEAST=74;
    public static final int THEN=124;
    public static final int WORDS=142;
    public static final int PiTarget=214;
    public static final int CDataContents=208;
    public static final int PARAGRAPHS=96;
    public static final int NCNameStartChar=248;
    public static final int QuotAttributeContent=203;
    public static final int BASE_URI=13;
    public static final int AND=8;
    public static final int TO=126;
    public static final int FUNCTION=57;
    public static final int AST_QUANTIFIEDEXPR=151;
    public static final int LexSigns=224;
    public static final int LANGUAGE=71;
    public static final int NEQSi=179;
    public static final int LOWERCASE=77;
    public static final int LE=73;
    public static final int BACKSLASHSi=251;
    public static final int SCHEMA=107;
    public static final int CONSTRUCTION=22;
    public static final int RPRAGSi=191;
    public static final int WILDCARDS=137;
    public static final int STARSi=175;
    public static final int DOTDOTSi=195;
    public static final int DIFFERENT=31;
    public static final int LTOREQSi=181;
    public static final int AST_TYPESWITCHEXPR=152;
    public static final int INTERSECT=68;
    public static final int AT=11;
    public static final int AST_FORCLAUSE=146;
    public static final int GREATEST=59;
    public static final int DOTSi=199;
    public static final int BaseChar=253;
    public static final int Char=256;
    public static final int EQ=43;
    public static final int AST_FLWOR=145;
    public static final int LT=78;
    public static final int OF=89;
    public static final int AST_FUNCTIONDECL=159;
    public static final int WINDOW=138;
    public static final int Name=237;
    public static final int FOLLOWING=48;
    public static final int CASE=16;
    public static final int RXQCOMMENTSi=246;
    public static final int DESCENDANT_OR_SELF=28;
    public static final int CDataSectionLEX=218;
    public static final int THESAURUS=123;
    public static final int RSELFTERMSi=200;
    public static final int FTAND=52;
    public static final int DecimalLiteral=187;
    public static final int PragmaContents=190;
    public static final int DIV=33;
    public static final int PARAGRAPH=95;
    public static final int EQSi=165;
    public static final int ALL=4;
    public static final int EXCLSi=250;
    public static final int DirPIConstructor=219;
    public static final int WHERE=136;
    public static final int WITHOUT=140;
    public static final int EVERY=44;
    public static final int SCHEMA_ATTRIBUTE=108;
    public static final int XQUERY=143;
    public static final int IDIV=61;
    public static final int SATISFIES=106;
    public static final int ATSi=196;
    public static final int DESCENDANT=27;
    public static final int STRICT=120;
    public static final int RBRACKSi=198;
    public static final int FOLLOWING_SIBLING=49;
    public static final int STABLE=116;
    public static final int DoubleLiteral=188;
    public static final int START=117;
    public static final int AMPERSi=231;
    public static final int VALIDATE=132;
    public static final int PRECEDING=99;
    public static final int COPY_NAMESPACES=24;
    public static final int ORDERING=94;
    public static final int ASSIGNSi=168;
    public static final int UNORDERED=130;
    public static final int NumberLEX=223;
    public static final int PredefinedEntityRef=228;
    public static final int LTSi=180;
    public static final int SENTENCE=114;
    public static final int AST_DIRELEMCONSTRUCTOR=161;
    public static final int AST_PATHEXPR=155;
    public static final int INHERIT=65;
    public static final int AST_CASECLAUSE=153;
    public static final int LexLiterals=226;
    public static final int SHARPSi=244;
    public static final int IS=69;
    public static final int GT=60;
    public static final int PHRASE=98;
    public static final int StringLiteral=163;
    public static final int RPISi=216;
    public static final int DirPiContents=215;
    public static final int ITEM=70;
    public static final int ORDERED=93;
    public static final int DirCommentConstLEX=220;
    public static final int PROCESSING_INSTRUCTION=102;
    public static final int NODEAFTERSi=185;
    public static final int CharRef=229;
    public static final int COLLATION=20;
    public static final int LPARSi=170;
    public static final int ANCESTOR=6;
    public static final int AST_PREDICATE=160;
    public static final int EOF=-1;
    public static final int VARIABLE=133;
    public static final int RBRACSi=173;
    public static final int ElementContent=206;
    public static final int LCOMMENTSi=210;
    public static final int LBRACKSi=197;

        public XQFTParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[182+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }


    	
    	/* Root scope */
    	//Scope currentScope = new Scope();	   // @init-ting her ogsaa
    	XQFTLexer lexer;
    /*
    	public void setTokenStream(TokenStream input) {
    				String inputz =  "some $x in (1, 2) satisfies $x + $x = 3";
                            	CharStream cs = new ANTLRStringStream(inputz);
    		lexer = (XQFTLexer)input.getTokenSource();
    		lexer.setCharStream(cs);
    		UnbufferedCommonTokenStream tokenz = new UnbufferedCommonTokenStream();
    		tokenz.setTokenSource(lexer);
    		super.setTokenStream(tokenz);
    		setTreeAdaptor(new XQFTTreeAdaptor());
     	
    	}*/

    	public void setLexer(XQFTLexer lex)
    	{
    		this.lexer=lex;
    	}
    	
    	public XQFTLexer getLexer()
    	{
    		return this.lexer;
    	}

        protected void mismatch(IntStream input, int ttype, BitSet follow)
            throws RecognitionException
        {
            throw new MismatchedTokenException(ttype, input);
        }

        public void recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
            throws RecognitionException
        {
            throw e;
        }



    public static class module_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start module
    // etc/XQFT.g:302:1: module : ( versionDecl )? ( libraryModule | mainModule ) -> ^( AST_MODULE ( versionDecl )? ( libraryModule )? ( mainModule )? ) ;
    public final module_return module() throws RecognitionException {
        module_return retval = new module_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        versionDecl_return versionDecl1 = null;

        libraryModule_return libraryModule2 = null;

        mainModule_return mainModule3 = null;


        RewriteRuleSubtreeStream stream_libraryModule=new RewriteRuleSubtreeStream(adaptor,"rule libraryModule");
        RewriteRuleSubtreeStream stream_versionDecl=new RewriteRuleSubtreeStream(adaptor,"rule versionDecl");
        RewriteRuleSubtreeStream stream_mainModule=new RewriteRuleSubtreeStream(adaptor,"rule mainModule");
        try {
            // etc/XQFT.g:302:32: ( ( versionDecl )? ( libraryModule | mainModule ) -> ^( AST_MODULE ( versionDecl )? ( libraryModule )? ( mainModule )? ) )
            // etc/XQFT.g:302:33: ( versionDecl )? ( libraryModule | mainModule )
            {
            if ( backtracking==0 ) {
              lexer.state = State.DEFAULT;
            }
            // etc/XQFT.g:303:12: ( versionDecl )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==XQUERY) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==VERSION) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:303:13: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module619);
                    versionDecl1=versionDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_versionDecl.add(versionDecl1.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:304:12: ( libraryModule | mainModule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==NAMESPACE) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==AND||(LA2_1>=CAST && LA2_1<=CASTABLE)||LA2_1==DIV||LA2_1==EQ||LA2_1==EXCEPT||LA2_1==FTCONTAINS||LA2_1==GE||(LA2_1>=GT && LA2_1<=IDIV)||(LA2_1>=INSTANCE && LA2_1<=IS)||LA2_1==LE||(LA2_1>=LT && LA2_1<=MOD)||LA2_1==NE||LA2_1==OR||(LA2_1>=TO && LA2_1<=TREAT)||LA2_1==UNION||(LA2_1>=EQSi && LA2_1<=COMMASi)||(LA2_1>=COLONSi && LA2_1<=LPARSi)||(LA2_1>=STARSi && LA2_1<=NODEAFTERSi)||(LA2_1>=SLASHSi && LA2_1<=DBLSLASHSi)||LA2_1==LBRACKSi) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("304:12: ( libraryModule | mainModule )", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=ALL && LA2_0<=MOD)||(LA2_0>=MOST && LA2_0<=XQUERY)||LA2_0==StringLiteral||LA2_0==DOLLARSi||LA2_0==LPARSi||(LA2_0>=STARSi && LA2_0<=MINUSSi)||LA2_0==LTSi||(LA2_0>=IntegerLiteral && LA2_0<=LPRAGSi)||(LA2_0>=SLASHSi && LA2_0<=DBLSLASHSi)||(LA2_0>=DOTDOTSi && LA2_0<=ATSi)||LA2_0==DOTSi||LA2_0==LCOMMENTSi||LA2_0==LPISi||LA2_0==NCName) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("304:12: ( libraryModule | mainModule )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:304:13: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module636);
                    libraryModule2=libraryModule();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_libraryModule.add(libraryModule2.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:304:29: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module640);
                    mainModule3=mainModule();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_mainModule.add(mainModule3.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: mainModule, libraryModule, versionDecl
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 305:41: -> ^( AST_MODULE ( versionDecl )? ( libraryModule )? ( mainModule )? )
            {
                // etc/XQFT.g:305:44: ^( AST_MODULE ( versionDecl )? ( libraryModule )? ( mainModule )? )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_MODULE, "AST_MODULE"), root_1);

                // etc/XQFT.g:305:57: ( versionDecl )?
                if ( stream_versionDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_versionDecl.next());

                }
                stream_versionDecl.reset();
                // etc/XQFT.g:305:70: ( libraryModule )?
                if ( stream_libraryModule.hasNext() ) {
                    adaptor.addChild(root_1, stream_libraryModule.next());

                }
                stream_libraryModule.reset();
                // etc/XQFT.g:305:85: ( mainModule )?
                if ( stream_mainModule.hasNext() ) {
                    adaptor.addChild(root_1, stream_mainModule.next());

                }
                stream_mainModule.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end module

    public static class versionDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start versionDecl
    // etc/XQFT.g:307:2: versionDecl : XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? SEMICOLONSi ;
    public final versionDecl_return versionDecl() throws RecognitionException {
        versionDecl_return retval = new versionDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token XQUERY4=null;
        Token VERSION5=null;
        Token StringLiteral6=null;
        Token ENCODING7=null;
        Token StringLiteral8=null;
        Token SEMICOLONSi9=null;

        XQFTTree XQUERY4_tree=null;
        XQFTTree VERSION5_tree=null;
        XQFTTree StringLiteral6_tree=null;
        XQFTTree ENCODING7_tree=null;
        XQFTTree StringLiteral8_tree=null;
        XQFTTree SEMICOLONSi9_tree=null;

        try {
            // etc/XQFT.g:307:33: ( XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? SEMICOLONSi )
            // etc/XQFT.g:307:35: XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? SEMICOLONSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            XQUERY4=(Token)input.LT(1);
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl724); if (failed) return retval;
            if ( backtracking==0 ) {
            XQUERY4_tree = (XQFTTree)adaptor.create(XQUERY4);
            adaptor.addChild(root_0, XQUERY4_tree);
            }
            VERSION5=(Token)input.LT(1);
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl726); if (failed) return retval;
            if ( backtracking==0 ) {
            VERSION5_tree = (XQFTTree)adaptor.create(VERSION5);
            adaptor.addChild(root_0, VERSION5_tree);
            }
            StringLiteral6=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl728); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral6_tree = (XQFTTree)adaptor.create(StringLiteral6);
            adaptor.addChild(root_0, StringLiteral6_tree);
            }
            // etc/XQFT.g:307:64: ( ENCODING StringLiteral )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ENCODING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:307:65: ENCODING StringLiteral
                    {
                    ENCODING7=(Token)input.LT(1);
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl731); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ENCODING7_tree = (XQFTTree)adaptor.create(ENCODING7);
                    adaptor.addChild(root_0, ENCODING7_tree);
                    }
                    StringLiteral8=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl733); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral8_tree = (XQFTTree)adaptor.create(StringLiteral8);
                    adaptor.addChild(root_0, StringLiteral8_tree);
                    }

                    }
                    break;

            }

            SEMICOLONSi9=(Token)input.LT(1);
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_versionDecl737); if (failed) return retval;
            if ( backtracking==0 ) {
            SEMICOLONSi9_tree = (XQFTTree)adaptor.create(SEMICOLONSi9);
            adaptor.addChild(root_0, SEMICOLONSi9_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end versionDecl

    public static class libraryModule_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start libraryModule
    // etc/XQFT.g:310:2: libraryModule : moduleDecl prolog ;
    public final libraryModule_return libraryModule() throws RecognitionException {
        libraryModule_return retval = new libraryModule_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        moduleDecl_return moduleDecl10 = null;

        prolog_return prolog11 = null;



        try {
            // etc/XQFT.g:310:33: ( moduleDecl prolog )
            // etc/XQFT.g:310:35: moduleDecl prolog
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_moduleDecl_in_libraryModule766);
            moduleDecl10=moduleDecl();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, moduleDecl10.getTree());
            pushFollow(FOLLOW_prolog_in_libraryModule768);
            prolog11=prolog();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, prolog11.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end libraryModule

    public static class moduleDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start moduleDecl
    // etc/XQFT.g:311:3: moduleDecl : MODULE NAMESPACE ncNameorKeyword EQSi uriLiteral SEMICOLONSi ;
    public final moduleDecl_return moduleDecl() throws RecognitionException {
        moduleDecl_return retval = new moduleDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token MODULE12=null;
        Token NAMESPACE13=null;
        Token EQSi15=null;
        Token SEMICOLONSi17=null;
        ncNameorKeyword_return ncNameorKeyword14 = null;

        uriLiteral_return uriLiteral16 = null;


        XQFTTree MODULE12_tree=null;
        XQFTTree NAMESPACE13_tree=null;
        XQFTTree EQSi15_tree=null;
        XQFTTree SEMICOLONSi17_tree=null;

        try {
            // etc/XQFT.g:311:34: ( MODULE NAMESPACE ncNameorKeyword EQSi uriLiteral SEMICOLONSi )
            // etc/XQFT.g:311:36: MODULE NAMESPACE ncNameorKeyword EQSi uriLiteral SEMICOLONSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            MODULE12=(Token)input.LT(1);
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl797); if (failed) return retval;
            if ( backtracking==0 ) {
            MODULE12_tree = (XQFTTree)adaptor.create(MODULE12);
            adaptor.addChild(root_0, MODULE12_tree);
            }
            NAMESPACE13=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl799); if (failed) return retval;
            if ( backtracking==0 ) {
            NAMESPACE13_tree = (XQFTTree)adaptor.create(NAMESPACE13);
            adaptor.addChild(root_0, NAMESPACE13_tree);
            }
            pushFollow(FOLLOW_ncNameorKeyword_in_moduleDecl801);
            ncNameorKeyword14=ncNameorKeyword();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword14.getTree());
            EQSi15=(Token)input.LT(1);
            match(input,EQSi,FOLLOW_EQSi_in_moduleDecl803); if (failed) return retval;
            if ( backtracking==0 ) {
            EQSi15_tree = (XQFTTree)adaptor.create(EQSi15);
            adaptor.addChild(root_0, EQSi15_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl805);
            uriLiteral16=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral16.getTree());
            SEMICOLONSi17=(Token)input.LT(1);
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_moduleDecl807); if (failed) return retval;
            if ( backtracking==0 ) {
            SEMICOLONSi17_tree = (XQFTTree)adaptor.create(SEMICOLONSi17);
            adaptor.addChild(root_0, SEMICOLONSi17_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end moduleDecl

    public static class uriLiteral_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start uriLiteral
    // etc/XQFT.g:312:4: uriLiteral : StringLiteral ;
    public final uriLiteral_return uriLiteral() throws RecognitionException {
        uriLiteral_return retval = new uriLiteral_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token StringLiteral18=null;

        XQFTTree StringLiteral18_tree=null;

        try {
            // etc/XQFT.g:312:35: ( StringLiteral )
            // etc/XQFT.g:312:37: StringLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            StringLiteral18=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral837); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral18_tree = (XQFTTree)adaptor.create(StringLiteral18);
            adaptor.addChild(root_0, StringLiteral18_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end uriLiteral

    public static class mainModule_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start mainModule
    // etc/XQFT.g:315:2: mainModule : prolog queryBody ;
    public final mainModule_return mainModule() throws RecognitionException {
        mainModule_return retval = new mainModule_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        prolog_return prolog19 = null;

        queryBody_return queryBody20 = null;



        try {
            // etc/XQFT.g:315:33: ( prolog queryBody )
            // etc/XQFT.g:315:35: prolog queryBody
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_prolog_in_mainModule869);
            prolog19=prolog();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, prolog19.getTree());
            pushFollow(FOLLOW_queryBody_in_mainModule871);
            queryBody20=queryBody();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, queryBody20.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end mainModule

    public static class queryBody_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start queryBody
    // etc/XQFT.g:317:3: queryBody : expr ;
    public final queryBody_return queryBody() throws RecognitionException {
        queryBody_return retval = new queryBody_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        expr_return expr21 = null;



        try {
            // etc/XQFT.g:317:34: ( expr )
            // etc/XQFT.g:317:36: expr
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_queryBody902);
            expr21=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr21.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end queryBody

    public static class expr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expr
    // etc/XQFT.g:318:4: expr : exprSingle ( COMMASi exprSingle )* -> ( exprSingle )+ ;
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COMMASi23=null;
        exprSingle_return exprSingle22 = null;

        exprSingle_return exprSingle24 = null;


        XQFTTree COMMASi23_tree=null;
        RewriteRuleTokenStream stream_COMMASi=new RewriteRuleTokenStream(adaptor,"token COMMASi");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:318:35: ( exprSingle ( COMMASi exprSingle )* -> ( exprSingle )+ )
            // etc/XQFT.g:318:37: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr938);
            exprSingle22=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle22.getTree());
            // etc/XQFT.g:318:48: ( COMMASi exprSingle )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMASi) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // etc/XQFT.g:318:49: COMMASi exprSingle
            	    {
            	    COMMASi23=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr941); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi23);

            	    pushFollow(FOLLOW_exprSingle_in_expr943);
            	    exprSingle24=exprSingle();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_exprSingle.add(exprSingle24.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // AST REWRITE
            // elements: exprSingle
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 319:57: -> ( exprSingle )+
            {
                if ( !(stream_exprSingle.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_exprSingle.hasNext() ) {
                    adaptor.addChild(root_0, stream_exprSingle.next());

                }
                stream_exprSingle.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end expr

    public static class prolog_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start prolog
    // etc/XQFT.g:325:1: prolog : ( ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi )* ;
    public final prolog_return prolog() throws RecognitionException {
        prolog_return retval = new prolog_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DECLARE26=null;
        Token SEMICOLONSi32=null;
        importStmt_return importStmt25 = null;

        setter_return setter27 = null;

        varDecl_return varDecl28 = null;

        functionDecl_return functionDecl29 = null;

        optionDecl_return optionDecl30 = null;

        ftOptionDecl_return ftOptionDecl31 = null;


        XQFTTree DECLARE26_tree=null;
        XQFTTree SEMICOLONSi32_tree=null;

        boolean start = true;
        try {
            // etc/XQFT.g:326:33: ( ( ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi )* )
            // etc/XQFT.g:326:34: ( ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:326:34: ( ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IMPORT) ) {
                    int LA7_37 = input.LA(2);

                    if ( (LA7_37==MODULE||LA7_37==SCHEMA) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==DECLARE) ) {
                    int LA7_39 = input.LA(2);

                    if ( (LA7_39==BASE_URI||LA7_39==BOUNDARYSPACE||LA7_39==CONSTRUCTION||LA7_39==COPY_NAMESPACES||LA7_39==DEFAULT||LA7_39==FTOPTION||LA7_39==FUNCTION||LA7_39==NAMESPACE||LA7_39==OPTION||LA7_39==ORDERING||LA7_39==VARIABLE) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // etc/XQFT.g:327:14: ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi
            	    {
            	    // etc/XQFT.g:327:14: ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==IMPORT) && (synpred1())) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==DECLARE) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("327:14: ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) )", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // etc/XQFT.g:328:14: ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}?
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog1105);
            	            importStmt25=importStmt();
            	            _fsp--;
            	            if (failed) return retval;
            	            if ( backtracking==0 ) adaptor.addChild(root_0, importStmt25.getTree());
            	            if ( !(start) ) {
            	                if (backtracking>0) {failed=true; return retval;}
            	                throw new FailedPredicateException(input, "prolog", "start");
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:329:15: DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl )
            	            {
            	            DECLARE26=(Token)input.LT(1);
            	            match(input,DECLARE,FOLLOW_DECLARE_in_prolog1123); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DECLARE26_tree = (XQFTTree)adaptor.create(DECLARE26);
            	            adaptor.addChild(root_0, DECLARE26_tree);
            	            }
            	            // etc/XQFT.g:329:23: ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl )
            	            int alt5=5;
            	            switch ( input.LA(1) ) {
            	            case BASE_URI:
            	            case BOUNDARYSPACE:
            	            case CONSTRUCTION:
            	            case COPY_NAMESPACES:
            	            case DEFAULT:
            	            case NAMESPACE:
            	            case ORDERING:
            	                {
            	                alt5=1;
            	                }
            	                break;
            	            case VARIABLE:
            	                {
            	                alt5=2;
            	                }
            	                break;
            	            case FUNCTION:
            	                {
            	                alt5=3;
            	                }
            	                break;
            	            case OPTION:
            	                {
            	                alt5=4;
            	                }
            	                break;
            	            case FTOPTION:
            	                {
            	                alt5=5;
            	                }
            	                break;
            	            default:
            	                if (backtracking>0) {failed=true; return retval;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("329:23: ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl )", 5, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt5) {
            	                case 1 :
            	                    // etc/XQFT.g:330:16: setter {...}?
            	                    {
            	                    pushFollow(FOLLOW_setter_in_prolog1142);
            	                    setter27=setter();
            	                    _fsp--;
            	                    if (failed) return retval;
            	                    if ( backtracking==0 ) adaptor.addChild(root_0, setter27.getTree());
            	                    if ( !(start) ) {
            	                        if (backtracking>0) {failed=true; return retval;}
            	                        throw new FailedPredicateException(input, "prolog", "start");
            	                    }

            	                    }
            	                    break;
            	                case 2 :
            	                    // etc/XQFT.g:331:15: varDecl
            	                    {
            	                    pushFollow(FOLLOW_varDecl_in_prolog1160);
            	                    varDecl28=varDecl();
            	                    _fsp--;
            	                    if (failed) return retval;
            	                    if ( backtracking==0 ) adaptor.addChild(root_0, varDecl28.getTree());
            	                    if ( backtracking==0 ) {
            	                      start=false;
            	                    }

            	                    }
            	                    break;
            	                case 3 :
            	                    // etc/XQFT.g:332:15: functionDecl
            	                    {
            	                    pushFollow(FOLLOW_functionDecl_in_prolog1178);
            	                    functionDecl29=functionDecl();
            	                    _fsp--;
            	                    if (failed) return retval;
            	                    if ( backtracking==0 ) adaptor.addChild(root_0, functionDecl29.getTree());
            	                    if ( backtracking==0 ) {
            	                      start=false;
            	                    }

            	                    }
            	                    break;
            	                case 4 :
            	                    // etc/XQFT.g:333:15: optionDecl
            	                    {
            	                    pushFollow(FOLLOW_optionDecl_in_prolog1196);
            	                    optionDecl30=optionDecl();
            	                    _fsp--;
            	                    if (failed) return retval;
            	                    if ( backtracking==0 ) adaptor.addChild(root_0, optionDecl30.getTree());
            	                    if ( backtracking==0 ) {
            	                      start=false;
            	                    }

            	                    }
            	                    break;
            	                case 5 :
            	                    // etc/XQFT.g:334:15: ftOptionDecl
            	                    {
            	                    pushFollow(FOLLOW_ftOptionDecl_in_prolog1214);
            	                    ftOptionDecl31=ftOptionDecl();
            	                    _fsp--;
            	                    if (failed) return retval;
            	                    if ( backtracking==0 ) adaptor.addChild(root_0, ftOptionDecl31.getTree());
            	                    if ( backtracking==0 ) {
            	                      start=false;
            	                    }

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    SEMICOLONSi32=(Token)input.LT(1);
            	    match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_prolog1246); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    SEMICOLONSi32_tree = (XQFTTree)adaptor.create(SEMICOLONSi32);
            	    adaptor.addChild(root_0, SEMICOLONSi32_tree);
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end prolog

    public static class setter_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start setter
    // etc/XQFT.g:341:1: setter : ( DEFAULT ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl ) | namespaceDecl | boundarySpaceDecl | baseURIDecl | constructionDecl | orderingModeDecl | copyNamespacesDecl );
    public final setter_return setter() throws RecognitionException {
        setter_return retval = new setter_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DEFAULT33=null;
        defaultNamespaceDecl_return defaultNamespaceDecl34 = null;

        defaultCollationDecl_return defaultCollationDecl35 = null;

        emptyOrderDecl_return emptyOrderDecl36 = null;

        namespaceDecl_return namespaceDecl37 = null;

        boundarySpaceDecl_return boundarySpaceDecl38 = null;

        baseURIDecl_return baseURIDecl39 = null;

        constructionDecl_return constructionDecl40 = null;

        orderingModeDecl_return orderingModeDecl41 = null;

        copyNamespacesDecl_return copyNamespacesDecl42 = null;


        XQFTTree DEFAULT33_tree=null;

        try {
            // etc/XQFT.g:341:32: ( DEFAULT ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl ) | namespaceDecl | boundarySpaceDecl | baseURIDecl | constructionDecl | orderingModeDecl | copyNamespacesDecl )
            int alt9=7;
            switch ( input.LA(1) ) {
            case DEFAULT:
                {
                alt9=1;
                }
                break;
            case NAMESPACE:
                {
                alt9=2;
                }
                break;
            case BOUNDARYSPACE:
                {
                alt9=3;
                }
                break;
            case BASE_URI:
                {
                alt9=4;
                }
                break;
            case CONSTRUCTION:
                {
                alt9=5;
                }
                break;
            case ORDERING:
                {
                alt9=6;
                }
                break;
            case COPY_NAMESPACES:
                {
                alt9=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("341:1: setter : ( DEFAULT ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl ) | namespaceDecl | boundarySpaceDecl | baseURIDecl | constructionDecl | orderingModeDecl | copyNamespacesDecl );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:341:36: DEFAULT ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    DEFAULT33=(Token)input.LT(1);
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_setter1319); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DEFAULT33_tree = (XQFTTree)adaptor.create(DEFAULT33);
                    adaptor.addChild(root_0, DEFAULT33_tree);
                    }
                    // etc/XQFT.g:341:44: ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl )
                    int alt8=4;
                    switch ( input.LA(1) ) {
                    case SEMICOLONSi:
                        {
                        alt8=1;
                        }
                        break;
                    case ELEMENT:
                    case FUNCTION:
                        {
                        alt8=2;
                        }
                        break;
                    case COLLATION:
                        {
                        alt8=3;
                        }
                        break;
                    case ORDER:
                        {
                        alt8=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("341:44: ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl )", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // etc/XQFT.g:342:13: 
                            {
                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:342:15: defaultNamespaceDecl
                            {
                            pushFollow(FOLLOW_defaultNamespaceDecl_in_setter1337);
                            defaultNamespaceDecl34=defaultNamespaceDecl();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, defaultNamespaceDecl34.getTree());

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:343:15: defaultCollationDecl
                            {
                            pushFollow(FOLLOW_defaultCollationDecl_in_setter1353);
                            defaultCollationDecl35=defaultCollationDecl();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, defaultCollationDecl35.getTree());

                            }
                            break;
                        case 4 :
                            // etc/XQFT.g:344:15: emptyOrderDecl
                            {
                            pushFollow(FOLLOW_emptyOrderDecl_in_setter1369);
                            emptyOrderDecl36=emptyOrderDecl();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, emptyOrderDecl36.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:346:14: namespaceDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_namespaceDecl_in_setter1398);
                    namespaceDecl37=namespaceDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, namespaceDecl37.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:347:14: boundarySpaceDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter1413);
                    boundarySpaceDecl38=boundarySpaceDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, boundarySpaceDecl38.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:348:14: baseURIDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_baseURIDecl_in_setter1428);
                    baseURIDecl39=baseURIDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, baseURIDecl39.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:349:14: constructionDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_constructionDecl_in_setter1444);
                    constructionDecl40=constructionDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, constructionDecl40.getTree());

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:350:14: orderingModeDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_orderingModeDecl_in_setter1460);
                    orderingModeDecl41=orderingModeDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, orderingModeDecl41.getTree());

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:351:14: copyNamespacesDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter1476);
                    copyNamespacesDecl42=copyNamespacesDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, copyNamespacesDecl42.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end setter

    public static class defaultNamespaceDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start defaultNamespaceDecl
    // etc/XQFT.g:355:2: defaultNamespaceDecl : ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
    public final defaultNamespaceDecl_return defaultNamespaceDecl() throws RecognitionException {
        defaultNamespaceDecl_return retval = new defaultNamespaceDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set43=null;
        Token NAMESPACE44=null;
        uriLiteral_return uriLiteral45 = null;


        XQFTTree set43_tree=null;
        XQFTTree NAMESPACE44_tree=null;

        try {
            // etc/XQFT.g:355:33: ( ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:355:35: ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            set43=(Token)input.LT(1);
            if ( input.LA(1)==ELEMENT||input.LA(1)==FUNCTION ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set43));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl1519);    throw mse;
            }

            NAMESPACE44=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl1527); if (failed) return retval;
            if ( backtracking==0 ) {
            NAMESPACE44_tree = (XQFTTree)adaptor.create(NAMESPACE44);
            adaptor.addChild(root_0, NAMESPACE44_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl1529);
            uriLiteral45=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral45.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end defaultNamespaceDecl

    public static class defaultCollationDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start defaultCollationDecl
    // etc/XQFT.g:356:2: defaultCollationDecl : COLLATION uriLiteral ;
    public final defaultCollationDecl_return defaultCollationDecl() throws RecognitionException {
        defaultCollationDecl_return retval = new defaultCollationDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COLLATION46=null;
        uriLiteral_return uriLiteral47 = null;


        XQFTTree COLLATION46_tree=null;

        try {
            // etc/XQFT.g:356:33: ( COLLATION uriLiteral )
            // etc/XQFT.g:356:35: COLLATION uriLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            COLLATION46=(Token)input.LT(1);
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl1547); if (failed) return retval;
            if ( backtracking==0 ) {
            COLLATION46_tree = (XQFTTree)adaptor.create(COLLATION46);
            adaptor.addChild(root_0, COLLATION46_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl1549);
            uriLiteral47=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral47.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end defaultCollationDecl

    public static class emptyOrderDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start emptyOrderDecl
    // etc/XQFT.g:357:2: emptyOrderDecl : ORDER EMPTY ( GREATEST | LEAST ) ;
    public final emptyOrderDecl_return emptyOrderDecl() throws RecognitionException {
        emptyOrderDecl_return retval = new emptyOrderDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ORDER48=null;
        Token EMPTY49=null;
        Token set50=null;

        XQFTTree ORDER48_tree=null;
        XQFTTree EMPTY49_tree=null;
        XQFTTree set50_tree=null;

        try {
            // etc/XQFT.g:357:33: ( ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:357:35: ORDER EMPTY ( GREATEST | LEAST )
            {
            root_0 = (XQFTTree)adaptor.nil();

            ORDER48=(Token)input.LT(1);
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl1573); if (failed) return retval;
            if ( backtracking==0 ) {
            ORDER48_tree = (XQFTTree)adaptor.create(ORDER48);
            adaptor.addChild(root_0, ORDER48_tree);
            }
            EMPTY49=(Token)input.LT(1);
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl1575); if (failed) return retval;
            if ( backtracking==0 ) {
            EMPTY49_tree = (XQFTTree)adaptor.create(EMPTY49);
            adaptor.addChild(root_0, EMPTY49_tree);
            }
            set50=(Token)input.LT(1);
            if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set50));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl1577);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end emptyOrderDecl

    public static class namespaceDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start namespaceDecl
    // etc/XQFT.g:360:2: namespaceDecl : NAMESPACE ncNameorKeyword EQSi uriLiteral ;
    public final namespaceDecl_return namespaceDecl() throws RecognitionException {
        namespaceDecl_return retval = new namespaceDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token NAMESPACE51=null;
        Token EQSi53=null;
        ncNameorKeyword_return ncNameorKeyword52 = null;

        uriLiteral_return uriLiteral54 = null;


        XQFTTree NAMESPACE51_tree=null;
        XQFTTree EQSi53_tree=null;

        try {
            // etc/XQFT.g:360:33: ( NAMESPACE ncNameorKeyword EQSi uriLiteral )
            // etc/XQFT.g:360:35: NAMESPACE ncNameorKeyword EQSi uriLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            NAMESPACE51=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl1610); if (failed) return retval;
            if ( backtracking==0 ) {
            NAMESPACE51_tree = (XQFTTree)adaptor.create(NAMESPACE51);
            adaptor.addChild(root_0, NAMESPACE51_tree);
            }
            pushFollow(FOLLOW_ncNameorKeyword_in_namespaceDecl1612);
            ncNameorKeyword52=ncNameorKeyword();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword52.getTree());
            EQSi53=(Token)input.LT(1);
            match(input,EQSi,FOLLOW_EQSi_in_namespaceDecl1614); if (failed) return retval;
            if ( backtracking==0 ) {
            EQSi53_tree = (XQFTTree)adaptor.create(EQSi53);
            adaptor.addChild(root_0, EQSi53_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl1616);
            uriLiteral54=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral54.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end namespaceDecl

    public static class boundarySpaceDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start boundarySpaceDecl
    // etc/XQFT.g:361:2: boundarySpaceDecl : BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final boundarySpaceDecl_return boundarySpaceDecl() throws RecognitionException {
        boundarySpaceDecl_return retval = new boundarySpaceDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token BOUNDARYSPACE55=null;
        Token set56=null;

        XQFTTree BOUNDARYSPACE55_tree=null;
        XQFTTree set56_tree=null;

        try {
            // etc/XQFT.g:361:33: ( BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:361:35: BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            root_0 = (XQFTTree)adaptor.nil();

            BOUNDARYSPACE55=(Token)input.LT(1);
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl1637); if (failed) return retval;
            if ( backtracking==0 ) {
            BOUNDARYSPACE55_tree = (XQFTTree)adaptor.create(BOUNDARYSPACE55);
            adaptor.addChild(root_0, BOUNDARYSPACE55_tree);
            }
            set56=(Token)input.LT(1);
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set56));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl1639);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end boundarySpaceDecl

    public static class baseURIDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start baseURIDecl
    // etc/XQFT.g:362:2: baseURIDecl : BASE_URI uriLiteral ;
    public final baseURIDecl_return baseURIDecl() throws RecognitionException {
        baseURIDecl_return retval = new baseURIDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token BASE_URI57=null;
        uriLiteral_return uriLiteral58 = null;


        XQFTTree BASE_URI57_tree=null;

        try {
            // etc/XQFT.g:362:33: ( BASE_URI uriLiteral )
            // etc/XQFT.g:362:35: BASE_URI uriLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            BASE_URI57=(Token)input.LT(1);
            match(input,BASE_URI,FOLLOW_BASE_URI_in_baseURIDecl1672); if (failed) return retval;
            if ( backtracking==0 ) {
            BASE_URI57_tree = (XQFTTree)adaptor.create(BASE_URI57);
            adaptor.addChild(root_0, BASE_URI57_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl1674);
            uriLiteral58=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral58.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end baseURIDecl

    public static class constructionDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constructionDecl
    // etc/XQFT.g:363:2: constructionDecl : CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final constructionDecl_return constructionDecl() throws RecognitionException {
        constructionDecl_return retval = new constructionDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CONSTRUCTION59=null;
        Token set60=null;

        XQFTTree CONSTRUCTION59_tree=null;
        XQFTTree set60_tree=null;

        try {
            // etc/XQFT.g:363:33: ( CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:363:35: CONSTRUCTION ( STRIP | PRESERVE )
            {
            root_0 = (XQFTTree)adaptor.nil();

            CONSTRUCTION59=(Token)input.LT(1);
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl1696); if (failed) return retval;
            if ( backtracking==0 ) {
            CONSTRUCTION59_tree = (XQFTTree)adaptor.create(CONSTRUCTION59);
            adaptor.addChild(root_0, CONSTRUCTION59_tree);
            }
            set60=(Token)input.LT(1);
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set60));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl1698);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end constructionDecl

    public static class orderingModeDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orderingModeDecl
    // etc/XQFT.g:364:2: orderingModeDecl : ORDERING ( ORDERED | UNORDERED ) ;
    public final orderingModeDecl_return orderingModeDecl() throws RecognitionException {
        orderingModeDecl_return retval = new orderingModeDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ORDERING61=null;
        Token set62=null;

        XQFTTree ORDERING61_tree=null;
        XQFTTree set62_tree=null;

        try {
            // etc/XQFT.g:364:33: ( ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:364:35: ORDERING ( ORDERED | UNORDERED )
            {
            root_0 = (XQFTTree)adaptor.nil();

            ORDERING61=(Token)input.LT(1);
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl1726); if (failed) return retval;
            if ( backtracking==0 ) {
            ORDERING61_tree = (XQFTTree)adaptor.create(ORDERING61);
            adaptor.addChild(root_0, ORDERING61_tree);
            }
            set62=(Token)input.LT(1);
            if ( input.LA(1)==ORDERED||input.LA(1)==UNORDERED ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set62));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl1728);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end orderingModeDecl

    public static class copyNamespacesDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start copyNamespacesDecl
    // etc/XQFT.g:365:2: copyNamespacesDecl : COPY_NAMESPACES preserveMode COMMASi inheritMode ;
    public final copyNamespacesDecl_return copyNamespacesDecl() throws RecognitionException {
        copyNamespacesDecl_return retval = new copyNamespacesDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COPY_NAMESPACES63=null;
        Token COMMASi65=null;
        preserveMode_return preserveMode64 = null;

        inheritMode_return inheritMode66 = null;


        XQFTTree COPY_NAMESPACES63_tree=null;
        XQFTTree COMMASi65_tree=null;

        try {
            // etc/XQFT.g:365:33: ( COPY_NAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:365:35: COPY_NAMESPACES preserveMode COMMASi inheritMode
            {
            root_0 = (XQFTTree)adaptor.nil();

            COPY_NAMESPACES63=(Token)input.LT(1);
            match(input,COPY_NAMESPACES,FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl1754); if (failed) return retval;
            if ( backtracking==0 ) {
            COPY_NAMESPACES63_tree = (XQFTTree)adaptor.create(COPY_NAMESPACES63);
            adaptor.addChild(root_0, COPY_NAMESPACES63_tree);
            }
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl1756);
            preserveMode64=preserveMode();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, preserveMode64.getTree());
            COMMASi65=(Token)input.LT(1);
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl1758); if (failed) return retval;
            if ( backtracking==0 ) {
            COMMASi65_tree = (XQFTTree)adaptor.create(COMMASi65);
            adaptor.addChild(root_0, COMMASi65_tree);
            }
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl1760);
            inheritMode66=inheritMode();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, inheritMode66.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end copyNamespacesDecl

    public static class preserveMode_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start preserveMode
    // etc/XQFT.g:366:3: preserveMode : ( PRESERVE | NOPRESERVE );
    public final preserveMode_return preserveMode() throws RecognitionException {
        preserveMode_return retval = new preserveMode_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set67=null;

        XQFTTree set67_tree=null;

        try {
            // etc/XQFT.g:366:34: ( PRESERVE | NOPRESERVE )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set67=(Token)input.LT(1);
            if ( input.LA(1)==NOPRESERVE||input.LA(1)==PRESERVE ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set67));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_preserveMode0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end preserveMode

    public static class inheritMode_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start inheritMode
    // etc/XQFT.g:367:3: inheritMode : ( INHERIT | NOINHERIT );
    public final inheritMode_return inheritMode() throws RecognitionException {
        inheritMode_return retval = new inheritMode_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set68=null;

        XQFTTree set68_tree=null;

        try {
            // etc/XQFT.g:367:34: ( INHERIT | NOINHERIT )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set68=(Token)input.LT(1);
            if ( input.LA(1)==INHERIT||input.LA(1)==NOINHERIT ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set68));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_inheritMode0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end inheritMode

    public static class importStmt_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start importStmt
    // etc/XQFT.g:371:1: importStmt : IMPORT ( schemaImport | moduleImport ) ;
    public final importStmt_return importStmt() throws RecognitionException {
        importStmt_return retval = new importStmt_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token IMPORT69=null;
        schemaImport_return schemaImport70 = null;

        moduleImport_return moduleImport71 = null;


        XQFTTree IMPORT69_tree=null;

        try {
            // etc/XQFT.g:371:32: ( IMPORT ( schemaImport | moduleImport ) )
            // etc/XQFT.g:371:34: IMPORT ( schemaImport | moduleImport )
            {
            root_0 = (XQFTTree)adaptor.nil();

            IMPORT69=(Token)input.LT(1);
            match(input,IMPORT,FOLLOW_IMPORT_in_importStmt1856); if (failed) return retval;
            if ( backtracking==0 ) {
            IMPORT69_tree = (XQFTTree)adaptor.create(IMPORT69);
            adaptor.addChild(root_0, IMPORT69_tree);
            }
            // etc/XQFT.g:371:41: ( schemaImport | moduleImport )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SCHEMA) ) {
                alt10=1;
            }
            else if ( (LA10_0==MODULE) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("371:41: ( schemaImport | moduleImport )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:371:42: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt1859);
                    schemaImport70=schemaImport();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaImport70.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:371:57: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt1863);
                    moduleImport71=moduleImport();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, moduleImport71.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end importStmt

    public static class schemaImport_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start schemaImport
    // etc/XQFT.g:372:2: schemaImport : SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final schemaImport_return schemaImport() throws RecognitionException {
        schemaImport_return retval = new schemaImport_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token SCHEMA72=null;
        Token AT75=null;
        Token COMMASi77=null;
        schemaPrefix_return schemaPrefix73 = null;

        uriLiteral_return uriLiteral74 = null;

        uriLiteral_return uriLiteral76 = null;

        uriLiteral_return uriLiteral78 = null;


        XQFTTree SCHEMA72_tree=null;
        XQFTTree AT75_tree=null;
        XQFTTree COMMASi77_tree=null;

        try {
            // etc/XQFT.g:372:33: ( SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:372:35: SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            SCHEMA72=(Token)input.LT(1);
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport1890); if (failed) return retval;
            if ( backtracking==0 ) {
            SCHEMA72_tree = (XQFTTree)adaptor.create(SCHEMA72);
            adaptor.addChild(root_0, SCHEMA72_tree);
            }
            // etc/XQFT.g:372:42: ( schemaPrefix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DEFAULT||LA11_0==NAMESPACE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:372:42: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport1892);
                    schemaPrefix73=schemaPrefix();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaPrefix73.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport1895);
            uriLiteral74=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral74.getTree());
            // etc/XQFT.g:372:67: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:372:68: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    AT75=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_schemaImport1898); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT75_tree = (XQFTTree)adaptor.create(AT75);
                    adaptor.addChild(root_0, AT75_tree);
                    }
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport1900);
                    uriLiteral76=uriLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral76.getTree());
                    // etc/XQFT.g:372:82: ( COMMASi uriLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMASi) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // etc/XQFT.g:372:83: COMMASi uriLiteral
                    	    {
                    	    COMMASi77=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport1903); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    COMMASi77_tree = (XQFTTree)adaptor.create(COMMASi77);
                    	    adaptor.addChild(root_0, COMMASi77_tree);
                    	    }
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport1905);
                    	    uriLiteral78=uriLiteral();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral78.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end schemaImport

    public static class schemaPrefix_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start schemaPrefix
    // etc/XQFT.g:373:3: schemaPrefix : ( ( NAMESPACE ncNameorKeyword EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
    public final schemaPrefix_return schemaPrefix() throws RecognitionException {
        schemaPrefix_return retval = new schemaPrefix_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token NAMESPACE79=null;
        Token EQSi81=null;
        Token DEFAULT82=null;
        Token ELEMENT83=null;
        Token NAMESPACE84=null;
        ncNameorKeyword_return ncNameorKeyword80 = null;


        XQFTTree NAMESPACE79_tree=null;
        XQFTTree EQSi81_tree=null;
        XQFTTree DEFAULT82_tree=null;
        XQFTTree ELEMENT83_tree=null;
        XQFTTree NAMESPACE84_tree=null;

        try {
            // etc/XQFT.g:373:34: ( ( NAMESPACE ncNameorKeyword EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAMESPACE) ) {
                alt14=1;
            }
            else if ( (LA14_0==DEFAULT) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("373:3: schemaPrefix : ( ( NAMESPACE ncNameorKeyword EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:373:36: ( NAMESPACE ncNameorKeyword EQSi )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:373:36: ( NAMESPACE ncNameorKeyword EQSi )
                    // etc/XQFT.g:373:37: NAMESPACE ncNameorKeyword EQSi
                    {
                    NAMESPACE79=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1937); if (failed) return retval;
                    if ( backtracking==0 ) {
                    NAMESPACE79_tree = (XQFTTree)adaptor.create(NAMESPACE79);
                    adaptor.addChild(root_0, NAMESPACE79_tree);
                    }
                    pushFollow(FOLLOW_ncNameorKeyword_in_schemaPrefix1939);
                    ncNameorKeyword80=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword80.getTree());
                    EQSi81=(Token)input.LT(1);
                    match(input,EQSi,FOLLOW_EQSi_in_schemaPrefix1941); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EQSi81_tree = (XQFTTree)adaptor.create(EQSi81);
                    adaptor.addChild(root_0, EQSi81_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:373:71: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:373:71: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:373:72: DEFAULT ELEMENT NAMESPACE
                    {
                    DEFAULT82=(Token)input.LT(1);
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix1947); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DEFAULT82_tree = (XQFTTree)adaptor.create(DEFAULT82);
                    adaptor.addChild(root_0, DEFAULT82_tree);
                    }
                    ELEMENT83=(Token)input.LT(1);
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix1949); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ELEMENT83_tree = (XQFTTree)adaptor.create(ELEMENT83);
                    adaptor.addChild(root_0, ELEMENT83_tree);
                    }
                    NAMESPACE84=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1951); if (failed) return retval;
                    if ( backtracking==0 ) {
                    NAMESPACE84_tree = (XQFTTree)adaptor.create(NAMESPACE84);
                    adaptor.addChild(root_0, NAMESPACE84_tree);
                    }

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end schemaPrefix

    public static class moduleImport_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start moduleImport
    // etc/XQFT.g:374:2: moduleImport : MODULE ( NAMESPACE ncNameorKeyword EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final moduleImport_return moduleImport() throws RecognitionException {
        moduleImport_return retval = new moduleImport_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token MODULE85=null;
        Token NAMESPACE86=null;
        Token EQSi88=null;
        Token AT90=null;
        Token COMMASi92=null;
        ncNameorKeyword_return ncNameorKeyword87 = null;

        uriLiteral_return uriLiteral89 = null;

        uriLiteral_return uriLiteral91 = null;

        uriLiteral_return uriLiteral93 = null;


        XQFTTree MODULE85_tree=null;
        XQFTTree NAMESPACE86_tree=null;
        XQFTTree EQSi88_tree=null;
        XQFTTree AT90_tree=null;
        XQFTTree COMMASi92_tree=null;

        try {
            // etc/XQFT.g:374:33: ( MODULE ( NAMESPACE ncNameorKeyword EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:374:35: MODULE ( NAMESPACE ncNameorKeyword EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            MODULE85=(Token)input.LT(1);
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport1978); if (failed) return retval;
            if ( backtracking==0 ) {
            MODULE85_tree = (XQFTTree)adaptor.create(MODULE85);
            adaptor.addChild(root_0, MODULE85_tree);
            }
            // etc/XQFT.g:374:42: ( NAMESPACE ncNameorKeyword EQSi )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAMESPACE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:374:43: NAMESPACE ncNameorKeyword EQSi
                    {
                    NAMESPACE86=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport1981); if (failed) return retval;
                    if ( backtracking==0 ) {
                    NAMESPACE86_tree = (XQFTTree)adaptor.create(NAMESPACE86);
                    adaptor.addChild(root_0, NAMESPACE86_tree);
                    }
                    pushFollow(FOLLOW_ncNameorKeyword_in_moduleImport1983);
                    ncNameorKeyword87=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword87.getTree());
                    EQSi88=(Token)input.LT(1);
                    match(input,EQSi,FOLLOW_EQSi_in_moduleImport1985); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EQSi88_tree = (XQFTTree)adaptor.create(EQSi88);
                    adaptor.addChild(root_0, EQSi88_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport1989);
            uriLiteral89=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral89.getTree());
            // etc/XQFT.g:374:87: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:374:88: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    AT90=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_moduleImport1992); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT90_tree = (XQFTTree)adaptor.create(AT90);
                    adaptor.addChild(root_0, AT90_tree);
                    }
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport1994);
                    uriLiteral91=uriLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral91.getTree());
                    // etc/XQFT.g:374:102: ( COMMASi uriLiteral )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMASi) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // etc/XQFT.g:374:103: COMMASi uriLiteral
                    	    {
                    	    COMMASi92=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport1997); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    COMMASi92_tree = (XQFTTree)adaptor.create(COMMASi92);
                    	    adaptor.addChild(root_0, COMMASi92_tree);
                    	    }
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport1999);
                    	    uriLiteral93=uriLiteral();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral93.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end moduleImport

    public static class varDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start varDecl
    // etc/XQFT.g:376:1: varDecl : VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) ;
    public final varDecl_return varDecl() throws RecognitionException {
        varDecl_return retval = new varDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token VARIABLE94=null;
        Token DOLLARSi95=null;
        Token ASSIGNSi98=null;
        Token EXTERNAL100=null;
        qName_return qName96 = null;

        typeDeclaration_return typeDeclaration97 = null;

        exprSingle_return exprSingle99 = null;


        XQFTTree VARIABLE94_tree=null;
        XQFTTree DOLLARSi95_tree=null;
        XQFTTree ASSIGNSi98_tree=null;
        XQFTTree EXTERNAL100_tree=null;

        try {
            // etc/XQFT.g:376:32: ( VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:376:34: VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            {
            root_0 = (XQFTTree)adaptor.nil();

            VARIABLE94=(Token)input.LT(1);
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl2035); if (failed) return retval;
            if ( backtracking==0 ) {
            VARIABLE94_tree = (XQFTTree)adaptor.create(VARIABLE94);
            adaptor.addChild(root_0, VARIABLE94_tree);
            }
            DOLLARSi95=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl2037); if (failed) return retval;
            if ( backtracking==0 ) {
            DOLLARSi95_tree = (XQFTTree)adaptor.create(DOLLARSi95);
            adaptor.addChild(root_0, DOLLARSi95_tree);
            }
            pushFollow(FOLLOW_qName_in_varDecl2039);
            qName96=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName96.getTree());
            // etc/XQFT.g:376:58: ( typeDeclaration )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:376:58: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl2041);
                    typeDeclaration97=typeDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeDeclaration97.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:376:75: ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ASSIGNSi) ) {
                alt19=1;
            }
            else if ( (LA19_0==EXTERNAL) ) {
                alt19=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("376:75: ( ( ASSIGNSi exprSingle ) | EXTERNAL )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:376:76: ( ASSIGNSi exprSingle )
                    {
                    // etc/XQFT.g:376:76: ( ASSIGNSi exprSingle )
                    // etc/XQFT.g:376:77: ASSIGNSi exprSingle
                    {
                    ASSIGNSi98=(Token)input.LT(1);
                    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varDecl2046); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGNSi98_tree = (XQFTTree)adaptor.create(ASSIGNSi98);
                    adaptor.addChild(root_0, ASSIGNSi98_tree);
                    }
                    pushFollow(FOLLOW_exprSingle_in_varDecl2048);
                    exprSingle99=exprSingle();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, exprSingle99.getTree());

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:376:100: EXTERNAL
                    {
                    EXTERNAL100=(Token)input.LT(1);
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl2053); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EXTERNAL100_tree = (XQFTTree)adaptor.create(EXTERNAL100);
                    adaptor.addChild(root_0, EXTERNAL100_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end varDecl

    public static class qName_return extends ParserRuleReturnScope {
        public String text;
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start qName
    // etc/XQFT.g:377:2: qName returns [String text] : nc1= ncNameorKeyword (c= COLONSi nc2= ncNameorKeyword )? ;
    public final qName_return qName() throws RecognitionException {
        qName_return retval = new qName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token c=null;
        ncNameorKeyword_return nc1 = null;

        ncNameorKeyword_return nc2 = null;


        XQFTTree c_tree=null;

        try {
            // etc/XQFT.g:377:46: (nc1= ncNameorKeyword (c= COLONSi nc2= ncNameorKeyword )? )
            // etc/XQFT.g:377:48: nc1= ncNameorKeyword (c= COLONSi nc2= ncNameorKeyword )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ncNameorKeyword_in_qName2084);
            nc1=ncNameorKeyword();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, nc1.getTree());
            // etc/XQFT.g:377:68: (c= COLONSi nc2= ncNameorKeyword )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLONSi) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:377:69: c= COLONSi nc2= ncNameorKeyword
                    {
                    c=(Token)input.LT(1);
                    match(input,COLONSi,FOLLOW_COLONSi_in_qName2089); if (failed) return retval;
                    if ( backtracking==0 ) {
                    c_tree = (XQFTTree)adaptor.create(c);
                    adaptor.addChild(root_0, c_tree);
                    }
                    pushFollow(FOLLOW_ncNameorKeyword_in_qName2093);
                    nc2=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, nc2.getTree());

                    }
                    break;

            }

            if ( backtracking==0 ) {
               retval.text = input.toString(nc1.start,nc1.stop) + (c != null ? c.getText() + input.toString(nc2.start,nc2.stop) : ""); 
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end qName

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typeDeclaration
    // etc/XQFT.g:379:5: typeDeclaration : AS sequenceType ;
    public final typeDeclaration_return typeDeclaration() throws RecognitionException {
        typeDeclaration_return retval = new typeDeclaration_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AS101=null;
        sequenceType_return sequenceType102 = null;


        XQFTTree AS101_tree=null;

        try {
            // etc/XQFT.g:379:36: ( AS sequenceType )
            // etc/XQFT.g:379:38: AS sequenceType
            {
            root_0 = (XQFTTree)adaptor.nil();

            AS101=(Token)input.LT(1);
            match(input,AS,FOLLOW_AS_in_typeDeclaration2124); if (failed) return retval;
            if ( backtracking==0 ) {
            AS101_tree = (XQFTTree)adaptor.create(AS101);
            adaptor.addChild(root_0, AS101_tree);
            }
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration2126);
            sequenceType102=sequenceType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, sequenceType102.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end typeDeclaration

    public static class functionDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionDecl
    // etc/XQFT.g:383:1: functionDecl : FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) -> ^( AST_FUNCTIONDECL qName ( paramList )? ( sequenceType )? ( enclosedExpr )? ( EXTERNAL )? ) ;
    public final functionDecl_return functionDecl() throws RecognitionException {
        functionDecl_return retval = new functionDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FUNCTION103=null;
        Token LPARSi105=null;
        Token RPARSi107=null;
        Token AS108=null;
        Token EXTERNAL111=null;
        qName_return qName104 = null;

        paramList_return paramList106 = null;

        sequenceType_return sequenceType109 = null;

        enclosedExpr_return enclosedExpr110 = null;


        XQFTTree FUNCTION103_tree=null;
        XQFTTree LPARSi105_tree=null;
        XQFTTree RPARSi107_tree=null;
        XQFTTree AS108_tree=null;
        XQFTTree EXTERNAL111_tree=null;
        RewriteRuleTokenStream stream_RPARSi=new RewriteRuleTokenStream(adaptor,"token RPARSi");
        RewriteRuleTokenStream stream_LPARSi=new RewriteRuleTokenStream(adaptor,"token LPARSi");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_FUNCTION=new RewriteRuleTokenStream(adaptor,"token FUNCTION");
        RewriteRuleTokenStream stream_EXTERNAL=new RewriteRuleTokenStream(adaptor,"token EXTERNAL");
        RewriteRuleSubtreeStream stream_qName=new RewriteRuleSubtreeStream(adaptor,"rule qName");
        RewriteRuleSubtreeStream stream_paramList=new RewriteRuleSubtreeStream(adaptor,"rule paramList");
        RewriteRuleSubtreeStream stream_sequenceType=new RewriteRuleSubtreeStream(adaptor,"rule sequenceType");
        RewriteRuleSubtreeStream stream_enclosedExpr=new RewriteRuleSubtreeStream(adaptor,"rule enclosedExpr");
        try {
            // etc/XQFT.g:383:32: ( FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) -> ^( AST_FUNCTIONDECL qName ( paramList )? ( sequenceType )? ( enclosedExpr )? ( EXTERNAL )? ) )
            // etc/XQFT.g:383:34: FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            FUNCTION103=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl2155); if (failed) return retval;
            if ( backtracking==0 ) stream_FUNCTION.add(FUNCTION103);

            pushFollow(FOLLOW_qName_in_functionDecl2157);
            qName104=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_qName.add(qName104.getTree());
            LPARSi105=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_functionDecl2159); if (failed) return retval;
            if ( backtracking==0 ) stream_LPARSi.add(LPARSi105);

            // etc/XQFT.g:383:56: ( paramList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOLLARSi) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:383:56: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl2161);
                    paramList106=paramList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_paramList.add(paramList106.getTree());

                    }
                    break;

            }

            RPARSi107=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_functionDecl2164); if (failed) return retval;
            if ( backtracking==0 ) stream_RPARSi.add(RPARSi107);

            // etc/XQFT.g:384:12: ( AS sequenceType )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:384:13: AS sequenceType
                    {
                    AS108=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_functionDecl2179); if (failed) return retval;
                    if ( backtracking==0 ) stream_AS.add(AS108);

                    pushFollow(FOLLOW_sequenceType_in_functionDecl2181);
                    sequenceType109=sequenceType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_sequenceType.add(sequenceType109.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:384:31: ( enclosedExpr | EXTERNAL )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LBRACESi) ) {
                alt23=1;
            }
            else if ( (LA23_0==EXTERNAL) ) {
                alt23=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("384:31: ( enclosedExpr | EXTERNAL )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:384:32: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl2186);
                    enclosedExpr110=enclosedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_enclosedExpr.add(enclosedExpr110.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:384:47: EXTERNAL
                    {
                    EXTERNAL111=(Token)input.LT(1);
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl2190); if (failed) return retval;
                    if ( backtracking==0 ) stream_EXTERNAL.add(EXTERNAL111);


                    }
                    break;

            }


            // AST REWRITE
            // elements: enclosedExpr, sequenceType, qName, EXTERNAL, paramList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 385:45: -> ^( AST_FUNCTIONDECL qName ( paramList )? ( sequenceType )? ( enclosedExpr )? ( EXTERNAL )? )
            {
                // etc/XQFT.g:385:48: ^( AST_FUNCTIONDECL qName ( paramList )? ( sequenceType )? ( enclosedExpr )? ( EXTERNAL )? )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_FUNCTIONDECL, "AST_FUNCTIONDECL"), root_1);

                adaptor.addChild(root_1, stream_qName.next());
                // etc/XQFT.g:385:73: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.next());

                }
                stream_paramList.reset();
                // etc/XQFT.g:385:84: ( sequenceType )?
                if ( stream_sequenceType.hasNext() ) {
                    adaptor.addChild(root_1, stream_sequenceType.next());

                }
                stream_sequenceType.reset();
                // etc/XQFT.g:385:98: ( enclosedExpr )?
                if ( stream_enclosedExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_enclosedExpr.next());

                }
                stream_enclosedExpr.reset();
                // etc/XQFT.g:385:112: ( EXTERNAL )?
                if ( stream_EXTERNAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_EXTERNAL.next());

                }
                stream_EXTERNAL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionDecl

    public static class paramList_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start paramList
    // etc/XQFT.g:388:2: paramList : param ( COMMASi param )* ;
    public final paramList_return paramList() throws RecognitionException {
        paramList_return retval = new paramList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COMMASi113=null;
        param_return param112 = null;

        param_return param114 = null;


        XQFTTree COMMASi113_tree=null;

        try {
            // etc/XQFT.g:388:33: ( param ( COMMASi param )* )
            // etc/XQFT.g:388:35: param ( COMMASi param )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_param_in_paramList2286);
            param112=param();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, param112.getTree());
            // etc/XQFT.g:388:41: ( COMMASi param )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMASi) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:388:42: COMMASi param
            	    {
            	    COMMASi113=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList2289); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    COMMASi113_tree = (XQFTTree)adaptor.create(COMMASi113);
            	    adaptor.addChild(root_0, COMMASi113_tree);
            	    }
            	    pushFollow(FOLLOW_param_in_paramList2291);
            	    param114=param();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, param114.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end paramList

    public static class param_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start param
    // etc/XQFT.g:389:3: param : DOLLARSi qName ( typeDeclaration )? ;
    public final param_return param() throws RecognitionException {
        param_return retval = new param_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOLLARSi115=null;
        qName_return qName116 = null;

        typeDeclaration_return typeDeclaration117 = null;


        XQFTTree DOLLARSi115_tree=null;

        try {
            // etc/XQFT.g:389:34: ( DOLLARSi qName ( typeDeclaration )? )
            // etc/XQFT.g:389:36: DOLLARSi qName ( typeDeclaration )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOLLARSi115=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param2327); if (failed) return retval;
            if ( backtracking==0 ) {
            DOLLARSi115_tree = (XQFTTree)adaptor.create(DOLLARSi115);
            adaptor.addChild(root_0, DOLLARSi115_tree);
            }
            pushFollow(FOLLOW_qName_in_param2329);
            qName116=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName116.getTree());
            // etc/XQFT.g:389:51: ( typeDeclaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:389:51: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param2331);
                    typeDeclaration117=typeDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeDeclaration117.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end param

    public static class enclosedExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start enclosedExpr
    // etc/XQFT.g:395:2: enclosedExpr : LBRACESi expr RBRACSi ;
    public final enclosedExpr_return enclosedExpr() throws RecognitionException {
        enclosedExpr_return retval = new enclosedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi118=null;
        Token RBRACSi120=null;
        expr_return expr119 = null;


        XQFTTree LBRACESi118_tree=null;
        XQFTTree RBRACSi120_tree=null;

        try {
            // etc/XQFT.g:395:33: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:396:13: LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LBRACESi118=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_enclosedExpr2376); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_enclosedExpr2392);
            expr119=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());
            RBRACSi120=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_enclosedExpr2407); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end enclosedExpr

    public static class optionDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start optionDecl
    // etc/XQFT.g:404:1: optionDecl : OPTION qName StringLiteral ;
    public final optionDecl_return optionDecl() throws RecognitionException {
        optionDecl_return retval = new optionDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token OPTION121=null;
        Token StringLiteral123=null;
        qName_return qName122 = null;


        XQFTTree OPTION121_tree=null;
        XQFTTree StringLiteral123_tree=null;

        try {
            // etc/XQFT.g:404:32: ( OPTION qName StringLiteral )
            // etc/XQFT.g:404:34: OPTION qName StringLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            OPTION121=(Token)input.LT(1);
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl2455); if (failed) return retval;
            if ( backtracking==0 ) {
            OPTION121_tree = (XQFTTree)adaptor.create(OPTION121);
            adaptor.addChild(root_0, OPTION121_tree);
            }
            pushFollow(FOLLOW_qName_in_optionDecl2457);
            qName122=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName122.getTree());
            StringLiteral123=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl2459); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral123_tree = (XQFTTree)adaptor.create(StringLiteral123);
            adaptor.addChild(root_0, StringLiteral123_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end optionDecl

    public static class ftOptionDecl_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftOptionDecl
    // etc/XQFT.g:406:1: ftOptionDecl : FTOPTION ftMatchOptions ;
    public final ftOptionDecl_return ftOptionDecl() throws RecognitionException {
        ftOptionDecl_return retval = new ftOptionDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTOPTION124=null;
        ftMatchOptions_return ftMatchOptions125 = null;


        XQFTTree FTOPTION124_tree=null;

        try {
            // etc/XQFT.g:406:32: ( FTOPTION ftMatchOptions )
            // etc/XQFT.g:406:34: FTOPTION ftMatchOptions
            {
            root_0 = (XQFTTree)adaptor.nil();

            FTOPTION124=(Token)input.LT(1);
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl2485); if (failed) return retval;
            if ( backtracking==0 ) {
            FTOPTION124_tree = (XQFTTree)adaptor.create(FTOPTION124);
            adaptor.addChild(root_0, FTOPTION124_tree);
            }
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl2487);
            ftMatchOptions125=ftMatchOptions();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftMatchOptions125.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftOptionDecl

    public static class ftMatchOptions_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftMatchOptions
    // etc/XQFT.g:407:2: ftMatchOptions : ( ftMatchOption )+ ;
    public final ftMatchOptions_return ftMatchOptions() throws RecognitionException {
        ftMatchOptions_return retval = new ftMatchOptions_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftMatchOption_return ftMatchOption126 = null;



        try {
            // etc/XQFT.g:407:33: ( ( ftMatchOption )+ )
            // etc/XQFT.g:407:35: ( ftMatchOption )+
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:407:35: ( ftMatchOption )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==CASE||LA26_0==DIACRITICS||LA26_0==LANGUAGE||LA26_0==LOWERCASE||LA26_0==OPTION||LA26_0==UPPERCASE||(LA26_0>=WITH && LA26_0<=WITHOUT)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // etc/XQFT.g:407:35: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions2511);
            	    ftMatchOption126=ftMatchOption();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftMatchOption126.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftMatchOptions

    public static class sequenceType_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start sequenceType
    // etc/XQFT.g:413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );
    public final sequenceType_return sequenceType() throws RecognitionException {
        sequenceType_return retval = new sequenceType_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token EMPTY_SEQUENCE130=null;
        Token LPARSi131=null;
        Token RPARSi132=null;
        itemType_return itemType127 = null;

        occurrenceIndicator_return occurrenceIndicator128 = null;

        itemType_return itemType129 = null;


        XQFTTree EMPTY_SEQUENCE130_tree=null;
        XQFTTree LPARSi131_tree=null;
        XQFTTree RPARSi132_tree=null;

        try {
            // etc/XQFT.g:413:32: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi )
            int alt27=3;
            switch ( input.LA(1) ) {
            case DOCUMENT_NODE:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==LPARSi) ) {
                    int LA27_13 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 13, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==COLONSi) ) {
                    int LA27_14 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 14, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==EOF||LA27_1==AND||(LA27_1>=ASCENDING && LA27_1<=AT)||LA27_1==CASE||LA27_1==COLLATION||LA27_1==DEFAULT||LA27_1==DESCENDING||LA27_1==DIV||LA27_1==ELSE||LA27_1==EMPTY||LA27_1==EQ||(LA27_1>=EXCEPT && LA27_1<=EXTERNAL)||LA27_1==FOR||LA27_1==FTCONTAINS||LA27_1==GE||(LA27_1>=GT && LA27_1<=IDIV)||LA27_1==IN||(LA27_1>=INSTANCE && LA27_1<=IS)||LA27_1==LE||(LA27_1>=LET && LA27_1<=LEVELS)||(LA27_1>=LT && LA27_1<=MOD)||LA27_1==NE||(LA27_1>=OR && LA27_1<=ORDER)||LA27_1==PARAGRAPHS||LA27_1==RETURN||LA27_1==SATISFIES||LA27_1==SCORE||LA27_1==SENTENCES||LA27_1==STABLE||(LA27_1>=TIMES && LA27_1<=TO)||LA27_1==UNION||LA27_1==WHERE||LA27_1==WITHOUT||LA27_1==WORDS||(LA27_1>=SEMICOLONSi && LA27_1<=COMMASi)||LA27_1==ASSIGNSi||(LA27_1>=RPARSi && LA27_1<=RBRACSi)||(LA27_1>=MINUSSi && LA27_1<=NODEAFTERSi)||LA27_1==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_1==STARSi) ) {
                    int LA27_26 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 26, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==PLUSSi) ) {
                    int LA27_27 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 27, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case ELEMENT:
                {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==LPARSi) ) {
                    int LA27_59 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 59, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==COLONSi) ) {
                    int LA27_60 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 60, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==EOF||LA27_2==AND||(LA27_2>=ASCENDING && LA27_2<=AT)||LA27_2==CASE||LA27_2==COLLATION||LA27_2==DEFAULT||LA27_2==DESCENDING||LA27_2==DIV||LA27_2==ELSE||LA27_2==EMPTY||LA27_2==EQ||(LA27_2>=EXCEPT && LA27_2<=EXTERNAL)||LA27_2==FOR||LA27_2==FTCONTAINS||LA27_2==GE||(LA27_2>=GT && LA27_2<=IDIV)||LA27_2==IN||(LA27_2>=INSTANCE && LA27_2<=IS)||LA27_2==LE||(LA27_2>=LET && LA27_2<=LEVELS)||(LA27_2>=LT && LA27_2<=MOD)||LA27_2==NE||(LA27_2>=OR && LA27_2<=ORDER)||LA27_2==PARAGRAPHS||LA27_2==RETURN||LA27_2==SATISFIES||LA27_2==SCORE||LA27_2==SENTENCES||LA27_2==STABLE||(LA27_2>=TIMES && LA27_2<=TO)||LA27_2==UNION||LA27_2==WHERE||LA27_2==WITHOUT||LA27_2==WORDS||(LA27_2>=SEMICOLONSi && LA27_2<=COMMASi)||LA27_2==ASSIGNSi||(LA27_2>=RPARSi && LA27_2<=RBRACSi)||(LA27_2>=MINUSSi && LA27_2<=NODEAFTERSi)||LA27_2==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_2==STARSi) ) {
                    int LA27_72 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 72, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==PLUSSi) ) {
                    int LA27_73 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 73, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==LPARSi) ) {
                    int LA27_105 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 105, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_3==COLONSi) ) {
                    int LA27_106 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 106, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_3==EOF||LA27_3==AND||(LA27_3>=ASCENDING && LA27_3<=AT)||LA27_3==CASE||LA27_3==COLLATION||LA27_3==DEFAULT||LA27_3==DESCENDING||LA27_3==DIV||LA27_3==ELSE||LA27_3==EMPTY||LA27_3==EQ||(LA27_3>=EXCEPT && LA27_3<=EXTERNAL)||LA27_3==FOR||LA27_3==FTCONTAINS||LA27_3==GE||(LA27_3>=GT && LA27_3<=IDIV)||LA27_3==IN||(LA27_3>=INSTANCE && LA27_3<=IS)||LA27_3==LE||(LA27_3>=LET && LA27_3<=LEVELS)||(LA27_3>=LT && LA27_3<=MOD)||LA27_3==NE||(LA27_3>=OR && LA27_3<=ORDER)||LA27_3==PARAGRAPHS||LA27_3==RETURN||LA27_3==SATISFIES||LA27_3==SCORE||LA27_3==SENTENCES||LA27_3==STABLE||(LA27_3>=TIMES && LA27_3<=TO)||LA27_3==UNION||LA27_3==WHERE||LA27_3==WITHOUT||LA27_3==WORDS||(LA27_3>=SEMICOLONSi && LA27_3<=COMMASi)||LA27_3==ASSIGNSi||(LA27_3>=RPARSi && LA27_3<=RBRACSi)||(LA27_3>=MINUSSi && LA27_3<=NODEAFTERSi)||LA27_3==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_3==STARSi) ) {
                    int LA27_118 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 118, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_3==PLUSSi) ) {
                    int LA27_119 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 119, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_3==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ELEMENT:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==LPARSi) ) {
                    int LA27_151 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 151, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_4==COLONSi) ) {
                    int LA27_152 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 152, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_4==EOF||LA27_4==AND||(LA27_4>=ASCENDING && LA27_4<=AT)||LA27_4==CASE||LA27_4==COLLATION||LA27_4==DEFAULT||LA27_4==DESCENDING||LA27_4==DIV||LA27_4==ELSE||LA27_4==EMPTY||LA27_4==EQ||(LA27_4>=EXCEPT && LA27_4<=EXTERNAL)||LA27_4==FOR||LA27_4==FTCONTAINS||LA27_4==GE||(LA27_4>=GT && LA27_4<=IDIV)||LA27_4==IN||(LA27_4>=INSTANCE && LA27_4<=IS)||LA27_4==LE||(LA27_4>=LET && LA27_4<=LEVELS)||(LA27_4>=LT && LA27_4<=MOD)||LA27_4==NE||(LA27_4>=OR && LA27_4<=ORDER)||LA27_4==PARAGRAPHS||LA27_4==RETURN||LA27_4==SATISFIES||LA27_4==SCORE||LA27_4==SENTENCES||LA27_4==STABLE||(LA27_4>=TIMES && LA27_4<=TO)||LA27_4==UNION||LA27_4==WHERE||LA27_4==WITHOUT||LA27_4==WORDS||(LA27_4>=SEMICOLONSi && LA27_4<=COMMASi)||LA27_4==ASSIGNSi||(LA27_4>=RPARSi && LA27_4<=RBRACSi)||(LA27_4>=MINUSSi && LA27_4<=NODEAFTERSi)||LA27_4==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_4==STARSi) ) {
                    int LA27_164 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 164, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_4==PLUSSi) ) {
                    int LA27_165 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 165, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_4==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 4, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ATTRIBUTE:
                {
                int LA27_5 = input.LA(2);

                if ( (LA27_5==LPARSi) ) {
                    int LA27_197 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 197, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_5==COLONSi) ) {
                    int LA27_198 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 198, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_5==EOF||LA27_5==AND||(LA27_5>=ASCENDING && LA27_5<=AT)||LA27_5==CASE||LA27_5==COLLATION||LA27_5==DEFAULT||LA27_5==DESCENDING||LA27_5==DIV||LA27_5==ELSE||LA27_5==EMPTY||LA27_5==EQ||(LA27_5>=EXCEPT && LA27_5<=EXTERNAL)||LA27_5==FOR||LA27_5==FTCONTAINS||LA27_5==GE||(LA27_5>=GT && LA27_5<=IDIV)||LA27_5==IN||(LA27_5>=INSTANCE && LA27_5<=IS)||LA27_5==LE||(LA27_5>=LET && LA27_5<=LEVELS)||(LA27_5>=LT && LA27_5<=MOD)||LA27_5==NE||(LA27_5>=OR && LA27_5<=ORDER)||LA27_5==PARAGRAPHS||LA27_5==RETURN||LA27_5==SATISFIES||LA27_5==SCORE||LA27_5==SENTENCES||LA27_5==STABLE||(LA27_5>=TIMES && LA27_5<=TO)||LA27_5==UNION||LA27_5==WHERE||LA27_5==WITHOUT||LA27_5==WORDS||(LA27_5>=SEMICOLONSi && LA27_5<=COMMASi)||LA27_5==ASSIGNSi||(LA27_5>=RPARSi && LA27_5<=RBRACSi)||(LA27_5>=MINUSSi && LA27_5<=NODEAFTERSi)||LA27_5==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_5==STARSi) ) {
                    int LA27_210 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 210, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_5==PLUSSi) ) {
                    int LA27_211 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 211, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_5==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 5, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA27_6 = input.LA(2);

                if ( (LA27_6==LPARSi) ) {
                    int LA27_243 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 243, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_6==COLONSi) ) {
                    int LA27_244 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 244, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_6==EOF||LA27_6==AND||(LA27_6>=ASCENDING && LA27_6<=AT)||LA27_6==CASE||LA27_6==COLLATION||LA27_6==DEFAULT||LA27_6==DESCENDING||LA27_6==DIV||LA27_6==ELSE||LA27_6==EMPTY||LA27_6==EQ||(LA27_6>=EXCEPT && LA27_6<=EXTERNAL)||LA27_6==FOR||LA27_6==FTCONTAINS||LA27_6==GE||(LA27_6>=GT && LA27_6<=IDIV)||LA27_6==IN||(LA27_6>=INSTANCE && LA27_6<=IS)||LA27_6==LE||(LA27_6>=LET && LA27_6<=LEVELS)||(LA27_6>=LT && LA27_6<=MOD)||LA27_6==NE||(LA27_6>=OR && LA27_6<=ORDER)||LA27_6==PARAGRAPHS||LA27_6==RETURN||LA27_6==SATISFIES||LA27_6==SCORE||LA27_6==SENTENCES||LA27_6==STABLE||(LA27_6>=TIMES && LA27_6<=TO)||LA27_6==UNION||LA27_6==WHERE||LA27_6==WITHOUT||LA27_6==WORDS||(LA27_6>=SEMICOLONSi && LA27_6<=COMMASi)||LA27_6==ASSIGNSi||(LA27_6>=RPARSi && LA27_6<=RBRACSi)||(LA27_6>=MINUSSi && LA27_6<=NODEAFTERSi)||LA27_6==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_6==STARSi) ) {
                    int LA27_256 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 256, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_6==PLUSSi) ) {
                    int LA27_257 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 257, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_6==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 6, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA27_7 = input.LA(2);

                if ( (LA27_7==LPARSi) ) {
                    int LA27_289 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 289, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_7==COLONSi) ) {
                    int LA27_290 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 290, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_7==EOF||LA27_7==AND||(LA27_7>=ASCENDING && LA27_7<=AT)||LA27_7==CASE||LA27_7==COLLATION||LA27_7==DEFAULT||LA27_7==DESCENDING||LA27_7==DIV||LA27_7==ELSE||LA27_7==EMPTY||LA27_7==EQ||(LA27_7>=EXCEPT && LA27_7<=EXTERNAL)||LA27_7==FOR||LA27_7==FTCONTAINS||LA27_7==GE||(LA27_7>=GT && LA27_7<=IDIV)||LA27_7==IN||(LA27_7>=INSTANCE && LA27_7<=IS)||LA27_7==LE||(LA27_7>=LET && LA27_7<=LEVELS)||(LA27_7>=LT && LA27_7<=MOD)||LA27_7==NE||(LA27_7>=OR && LA27_7<=ORDER)||LA27_7==PARAGRAPHS||LA27_7==RETURN||LA27_7==SATISFIES||LA27_7==SCORE||LA27_7==SENTENCES||LA27_7==STABLE||(LA27_7>=TIMES && LA27_7<=TO)||LA27_7==UNION||LA27_7==WHERE||LA27_7==WITHOUT||LA27_7==WORDS||(LA27_7>=SEMICOLONSi && LA27_7<=COMMASi)||LA27_7==ASSIGNSi||(LA27_7>=RPARSi && LA27_7<=RBRACSi)||(LA27_7>=MINUSSi && LA27_7<=NODEAFTERSi)||LA27_7==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_7==STARSi) ) {
                    int LA27_302 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 302, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_7==PLUSSi) ) {
                    int LA27_303 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 303, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_7==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 7, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA27_8 = input.LA(2);

                if ( (LA27_8==LPARSi) ) {
                    int LA27_335 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 335, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_8==COLONSi) ) {
                    int LA27_336 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 336, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_8==EOF||LA27_8==AND||(LA27_8>=ASCENDING && LA27_8<=AT)||LA27_8==CASE||LA27_8==COLLATION||LA27_8==DEFAULT||LA27_8==DESCENDING||LA27_8==DIV||LA27_8==ELSE||LA27_8==EMPTY||LA27_8==EQ||(LA27_8>=EXCEPT && LA27_8<=EXTERNAL)||LA27_8==FOR||LA27_8==FTCONTAINS||LA27_8==GE||(LA27_8>=GT && LA27_8<=IDIV)||LA27_8==IN||(LA27_8>=INSTANCE && LA27_8<=IS)||LA27_8==LE||(LA27_8>=LET && LA27_8<=LEVELS)||(LA27_8>=LT && LA27_8<=MOD)||LA27_8==NE||(LA27_8>=OR && LA27_8<=ORDER)||LA27_8==PARAGRAPHS||LA27_8==RETURN||LA27_8==SATISFIES||LA27_8==SCORE||LA27_8==SENTENCES||LA27_8==STABLE||(LA27_8>=TIMES && LA27_8<=TO)||LA27_8==UNION||LA27_8==WHERE||LA27_8==WITHOUT||LA27_8==WORDS||(LA27_8>=SEMICOLONSi && LA27_8<=COMMASi)||LA27_8==ASSIGNSi||(LA27_8>=RPARSi && LA27_8<=RBRACSi)||(LA27_8>=MINUSSi && LA27_8<=NODEAFTERSi)||LA27_8==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_8==STARSi) ) {
                    int LA27_348 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 348, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_8==PLUSSi) ) {
                    int LA27_349 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 349, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_8==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 8, input);

                    throw nvae;
                }
                }
                break;
            case NODE:
                {
                int LA27_9 = input.LA(2);

                if ( (LA27_9==LPARSi) ) {
                    int LA27_381 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 381, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_9==COLONSi) ) {
                    int LA27_382 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 382, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_9==EOF||LA27_9==AND||(LA27_9>=ASCENDING && LA27_9<=AT)||LA27_9==CASE||LA27_9==COLLATION||LA27_9==DEFAULT||LA27_9==DESCENDING||LA27_9==DIV||LA27_9==ELSE||LA27_9==EMPTY||LA27_9==EQ||(LA27_9>=EXCEPT && LA27_9<=EXTERNAL)||LA27_9==FOR||LA27_9==FTCONTAINS||LA27_9==GE||(LA27_9>=GT && LA27_9<=IDIV)||LA27_9==IN||(LA27_9>=INSTANCE && LA27_9<=IS)||LA27_9==LE||(LA27_9>=LET && LA27_9<=LEVELS)||(LA27_9>=LT && LA27_9<=MOD)||LA27_9==NE||(LA27_9>=OR && LA27_9<=ORDER)||LA27_9==PARAGRAPHS||LA27_9==RETURN||LA27_9==SATISFIES||LA27_9==SCORE||LA27_9==SENTENCES||LA27_9==STABLE||(LA27_9>=TIMES && LA27_9<=TO)||LA27_9==UNION||LA27_9==WHERE||LA27_9==WITHOUT||LA27_9==WORDS||(LA27_9>=SEMICOLONSi && LA27_9<=COMMASi)||LA27_9==ASSIGNSi||(LA27_9>=RPARSi && LA27_9<=RBRACSi)||(LA27_9>=MINUSSi && LA27_9<=NODEAFTERSi)||LA27_9==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_9==STARSi) ) {
                    int LA27_394 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 394, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_9==PLUSSi) ) {
                    int LA27_395 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 395, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_9==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 9, input);

                    throw nvae;
                }
                }
                break;
            case ITEM:
                {
                int LA27_10 = input.LA(2);

                if ( (LA27_10==LPARSi) ) {
                    int LA27_427 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 427, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_10==COLONSi) ) {
                    int LA27_428 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 428, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_10==EOF||LA27_10==AND||(LA27_10>=ASCENDING && LA27_10<=AT)||LA27_10==CASE||LA27_10==COLLATION||LA27_10==DEFAULT||LA27_10==DESCENDING||LA27_10==DIV||LA27_10==ELSE||LA27_10==EMPTY||LA27_10==EQ||(LA27_10>=EXCEPT && LA27_10<=EXTERNAL)||LA27_10==FOR||LA27_10==FTCONTAINS||LA27_10==GE||(LA27_10>=GT && LA27_10<=IDIV)||LA27_10==IN||(LA27_10>=INSTANCE && LA27_10<=IS)||LA27_10==LE||(LA27_10>=LET && LA27_10<=LEVELS)||(LA27_10>=LT && LA27_10<=MOD)||LA27_10==NE||(LA27_10>=OR && LA27_10<=ORDER)||LA27_10==PARAGRAPHS||LA27_10==RETURN||LA27_10==SATISFIES||LA27_10==SCORE||LA27_10==SENTENCES||LA27_10==STABLE||(LA27_10>=TIMES && LA27_10<=TO)||LA27_10==UNION||LA27_10==WHERE||LA27_10==WITHOUT||LA27_10==WORDS||(LA27_10>=SEMICOLONSi && LA27_10<=COMMASi)||LA27_10==ASSIGNSi||(LA27_10>=RPARSi && LA27_10<=RBRACSi)||(LA27_10>=MINUSSi && LA27_10<=NODEAFTERSi)||LA27_10==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_10==STARSi) ) {
                    int LA27_440 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 440, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_10==PLUSSi) ) {
                    int LA27_441 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 441, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_10==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 10, input);

                    throw nvae;
                }
                }
                break;
            case EMPTY_SEQUENCE:
                {
                int LA27_11 = input.LA(2);

                if ( (LA27_11==LPARSi) ) {
                    alt27=3;
                }
                else if ( (LA27_11==COLONSi) ) {
                    int LA27_474 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 474, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_11==EOF||LA27_11==AND||(LA27_11>=ASCENDING && LA27_11<=AT)||LA27_11==CASE||LA27_11==COLLATION||LA27_11==DEFAULT||LA27_11==DESCENDING||LA27_11==DIV||LA27_11==ELSE||LA27_11==EMPTY||LA27_11==EQ||(LA27_11>=EXCEPT && LA27_11<=EXTERNAL)||LA27_11==FOR||LA27_11==FTCONTAINS||LA27_11==GE||(LA27_11>=GT && LA27_11<=IDIV)||LA27_11==IN||(LA27_11>=INSTANCE && LA27_11<=IS)||LA27_11==LE||(LA27_11>=LET && LA27_11<=LEVELS)||(LA27_11>=LT && LA27_11<=MOD)||LA27_11==NE||(LA27_11>=OR && LA27_11<=ORDER)||LA27_11==PARAGRAPHS||LA27_11==RETURN||LA27_11==SATISFIES||LA27_11==SCORE||LA27_11==SENTENCES||LA27_11==STABLE||(LA27_11>=TIMES && LA27_11<=TO)||LA27_11==UNION||LA27_11==WHERE||LA27_11==WITHOUT||LA27_11==WORDS||(LA27_11>=SEMICOLONSi && LA27_11<=COMMASi)||LA27_11==ASSIGNSi||(LA27_11>=RPARSi && LA27_11<=RBRACSi)||(LA27_11>=MINUSSi && LA27_11<=NODEAFTERSi)||LA27_11==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_11==STARSi) ) {
                    int LA27_486 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 486, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_11==PLUSSi) ) {
                    int LA27_487 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 487, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_11==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 11, input);

                    throw nvae;
                }
                }
                break;
            case ALL:
            case ANY:
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case CHILD:
            case COLLATION:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERED:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PARENT:
            case PHRASE:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PRESERVE:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCORE:
            case SELF:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UNORDERED:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case NCName:
                {
                int LA27_12 = input.LA(2);

                if ( (LA27_12==COLONSi) ) {
                    int LA27_519 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 519, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_12==EOF||LA27_12==AND||(LA27_12>=ASCENDING && LA27_12<=AT)||LA27_12==CASE||LA27_12==COLLATION||LA27_12==DEFAULT||LA27_12==DESCENDING||LA27_12==DIV||LA27_12==ELSE||LA27_12==EMPTY||LA27_12==EQ||(LA27_12>=EXCEPT && LA27_12<=EXTERNAL)||LA27_12==FOR||LA27_12==FTCONTAINS||LA27_12==GE||(LA27_12>=GT && LA27_12<=IDIV)||LA27_12==IN||(LA27_12>=INSTANCE && LA27_12<=IS)||LA27_12==LE||(LA27_12>=LET && LA27_12<=LEVELS)||(LA27_12>=LT && LA27_12<=MOD)||LA27_12==NE||(LA27_12>=OR && LA27_12<=ORDER)||LA27_12==PARAGRAPHS||LA27_12==RETURN||LA27_12==SATISFIES||LA27_12==SCORE||LA27_12==SENTENCES||LA27_12==STABLE||(LA27_12>=TIMES && LA27_12<=TO)||LA27_12==UNION||LA27_12==WHERE||LA27_12==WITHOUT||LA27_12==WORDS||(LA27_12>=SEMICOLONSi && LA27_12<=COMMASi)||LA27_12==ASSIGNSi||(LA27_12>=RPARSi && LA27_12<=RBRACSi)||(LA27_12>=MINUSSi && LA27_12<=NODEAFTERSi)||LA27_12==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_12==STARSi) ) {
                    int LA27_531 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 531, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_12==PLUSSi) ) {
                    int LA27_532 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 532, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_12==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 12, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("413:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // etc/XQFT.g:413:34: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_itemType_in_sequenceType2563);
                    itemType127=itemType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, itemType127.getTree());
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType2565);
                    occurrenceIndicator128=occurrenceIndicator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, occurrenceIndicator128.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:414:13: itemType
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_itemType_in_sequenceType2579);
                    itemType129=itemType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, itemType129.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:415:13: EMPTY_SEQUENCE LPARSi RPARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    EMPTY_SEQUENCE130=(Token)input.LT(1);
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType2593); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EMPTY_SEQUENCE130_tree = (XQFTTree)adaptor.create(EMPTY_SEQUENCE130);
                    adaptor.addChild(root_0, EMPTY_SEQUENCE130_tree);
                    }
                    LPARSi131=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_sequenceType2595); if (failed) return retval;
                    RPARSi132=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_sequenceType2598); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end sequenceType

    public static class itemType_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start itemType
    // etc/XQFT.g:417:2: itemType : ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) ;
    public final itemType_return itemType() throws RecognitionException {
        itemType_return retval = new itemType_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ITEM134=null;
        Token LPARSi135=null;
        Token RPARSi136=null;
        kindTest_return kindTest133 = null;

        atomicType_return atomicType137 = null;


        XQFTTree ITEM134_tree=null;
        XQFTTree LPARSi135_tree=null;
        XQFTTree RPARSi136_tree=null;

        try {
            // etc/XQFT.g:417:33: ( ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) )
            // etc/XQFT.g:417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            int alt28=3;
            switch ( input.LA(1) ) {
            case DOCUMENT_NODE:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_1==EOF||LA28_1==AND||(LA28_1>=ASCENDING && LA28_1<=AT)||LA28_1==CASE||LA28_1==COLLATION||LA28_1==DEFAULT||LA28_1==DESCENDING||LA28_1==DIV||LA28_1==ELSE||LA28_1==EMPTY||LA28_1==EQ||(LA28_1>=EXCEPT && LA28_1<=EXTERNAL)||LA28_1==FOR||LA28_1==FTCONTAINS||LA28_1==GE||(LA28_1>=GT && LA28_1<=IDIV)||LA28_1==IN||(LA28_1>=INSTANCE && LA28_1<=IS)||LA28_1==LE||(LA28_1>=LET && LA28_1<=LEVELS)||(LA28_1>=LT && LA28_1<=MOD)||LA28_1==NE||(LA28_1>=OR && LA28_1<=ORDER)||LA28_1==PARAGRAPHS||LA28_1==RETURN||LA28_1==SATISFIES||LA28_1==SCORE||LA28_1==SENTENCES||LA28_1==STABLE||(LA28_1>=TIMES && LA28_1<=TO)||LA28_1==UNION||LA28_1==WHERE||LA28_1==WITHOUT||LA28_1==WORDS||(LA28_1>=SEMICOLONSi && LA28_1<=COMMASi)||(LA28_1>=ASSIGNSi && LA28_1<=COLONSi)||(LA28_1>=RPARSi && LA28_1<=NODEAFTERSi)||LA28_1==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case ELEMENT:
                {
                int LA28_2 = input.LA(2);

                if ( (LA28_2==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_2==EOF||LA28_2==AND||(LA28_2>=ASCENDING && LA28_2<=AT)||LA28_2==CASE||LA28_2==COLLATION||LA28_2==DEFAULT||LA28_2==DESCENDING||LA28_2==DIV||LA28_2==ELSE||LA28_2==EMPTY||LA28_2==EQ||(LA28_2>=EXCEPT && LA28_2<=EXTERNAL)||LA28_2==FOR||LA28_2==FTCONTAINS||LA28_2==GE||(LA28_2>=GT && LA28_2<=IDIV)||LA28_2==IN||(LA28_2>=INSTANCE && LA28_2<=IS)||LA28_2==LE||(LA28_2>=LET && LA28_2<=LEVELS)||(LA28_2>=LT && LA28_2<=MOD)||LA28_2==NE||(LA28_2>=OR && LA28_2<=ORDER)||LA28_2==PARAGRAPHS||LA28_2==RETURN||LA28_2==SATISFIES||LA28_2==SCORE||LA28_2==SENTENCES||LA28_2==STABLE||(LA28_2>=TIMES && LA28_2<=TO)||LA28_2==UNION||LA28_2==WHERE||LA28_2==WITHOUT||LA28_2==WORDS||(LA28_2>=SEMICOLONSi && LA28_2<=COMMASi)||(LA28_2>=ASSIGNSi && LA28_2<=COLONSi)||(LA28_2>=RPARSi && LA28_2<=NODEAFTERSi)||LA28_2==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 2, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_3==EOF||LA28_3==AND||(LA28_3>=ASCENDING && LA28_3<=AT)||LA28_3==CASE||LA28_3==COLLATION||LA28_3==DEFAULT||LA28_3==DESCENDING||LA28_3==DIV||LA28_3==ELSE||LA28_3==EMPTY||LA28_3==EQ||(LA28_3>=EXCEPT && LA28_3<=EXTERNAL)||LA28_3==FOR||LA28_3==FTCONTAINS||LA28_3==GE||(LA28_3>=GT && LA28_3<=IDIV)||LA28_3==IN||(LA28_3>=INSTANCE && LA28_3<=IS)||LA28_3==LE||(LA28_3>=LET && LA28_3<=LEVELS)||(LA28_3>=LT && LA28_3<=MOD)||LA28_3==NE||(LA28_3>=OR && LA28_3<=ORDER)||LA28_3==PARAGRAPHS||LA28_3==RETURN||LA28_3==SATISFIES||LA28_3==SCORE||LA28_3==SENTENCES||LA28_3==STABLE||(LA28_3>=TIMES && LA28_3<=TO)||LA28_3==UNION||LA28_3==WHERE||LA28_3==WITHOUT||LA28_3==WORDS||(LA28_3>=SEMICOLONSi && LA28_3<=COMMASi)||(LA28_3>=ASSIGNSi && LA28_3<=COLONSi)||(LA28_3>=RPARSi && LA28_3<=NODEAFTERSi)||LA28_3==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ELEMENT:
                {
                int LA28_4 = input.LA(2);

                if ( (LA28_4==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_4==EOF||LA28_4==AND||(LA28_4>=ASCENDING && LA28_4<=AT)||LA28_4==CASE||LA28_4==COLLATION||LA28_4==DEFAULT||LA28_4==DESCENDING||LA28_4==DIV||LA28_4==ELSE||LA28_4==EMPTY||LA28_4==EQ||(LA28_4>=EXCEPT && LA28_4<=EXTERNAL)||LA28_4==FOR||LA28_4==FTCONTAINS||LA28_4==GE||(LA28_4>=GT && LA28_4<=IDIV)||LA28_4==IN||(LA28_4>=INSTANCE && LA28_4<=IS)||LA28_4==LE||(LA28_4>=LET && LA28_4<=LEVELS)||(LA28_4>=LT && LA28_4<=MOD)||LA28_4==NE||(LA28_4>=OR && LA28_4<=ORDER)||LA28_4==PARAGRAPHS||LA28_4==RETURN||LA28_4==SATISFIES||LA28_4==SCORE||LA28_4==SENTENCES||LA28_4==STABLE||(LA28_4>=TIMES && LA28_4<=TO)||LA28_4==UNION||LA28_4==WHERE||LA28_4==WITHOUT||LA28_4==WORDS||(LA28_4>=SEMICOLONSi && LA28_4<=COMMASi)||(LA28_4>=ASSIGNSi && LA28_4<=COLONSi)||(LA28_4>=RPARSi && LA28_4<=NODEAFTERSi)||LA28_4==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 4, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ATTRIBUTE:
                {
                int LA28_5 = input.LA(2);

                if ( (LA28_5==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_5==EOF||LA28_5==AND||(LA28_5>=ASCENDING && LA28_5<=AT)||LA28_5==CASE||LA28_5==COLLATION||LA28_5==DEFAULT||LA28_5==DESCENDING||LA28_5==DIV||LA28_5==ELSE||LA28_5==EMPTY||LA28_5==EQ||(LA28_5>=EXCEPT && LA28_5<=EXTERNAL)||LA28_5==FOR||LA28_5==FTCONTAINS||LA28_5==GE||(LA28_5>=GT && LA28_5<=IDIV)||LA28_5==IN||(LA28_5>=INSTANCE && LA28_5<=IS)||LA28_5==LE||(LA28_5>=LET && LA28_5<=LEVELS)||(LA28_5>=LT && LA28_5<=MOD)||LA28_5==NE||(LA28_5>=OR && LA28_5<=ORDER)||LA28_5==PARAGRAPHS||LA28_5==RETURN||LA28_5==SATISFIES||LA28_5==SCORE||LA28_5==SENTENCES||LA28_5==STABLE||(LA28_5>=TIMES && LA28_5<=TO)||LA28_5==UNION||LA28_5==WHERE||LA28_5==WITHOUT||LA28_5==WORDS||(LA28_5>=SEMICOLONSi && LA28_5<=COMMASi)||(LA28_5>=ASSIGNSi && LA28_5<=COLONSi)||(LA28_5>=RPARSi && LA28_5<=NODEAFTERSi)||LA28_5==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 5, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA28_6 = input.LA(2);

                if ( (LA28_6==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_6==EOF||LA28_6==AND||(LA28_6>=ASCENDING && LA28_6<=AT)||LA28_6==CASE||LA28_6==COLLATION||LA28_6==DEFAULT||LA28_6==DESCENDING||LA28_6==DIV||LA28_6==ELSE||LA28_6==EMPTY||LA28_6==EQ||(LA28_6>=EXCEPT && LA28_6<=EXTERNAL)||LA28_6==FOR||LA28_6==FTCONTAINS||LA28_6==GE||(LA28_6>=GT && LA28_6<=IDIV)||LA28_6==IN||(LA28_6>=INSTANCE && LA28_6<=IS)||LA28_6==LE||(LA28_6>=LET && LA28_6<=LEVELS)||(LA28_6>=LT && LA28_6<=MOD)||LA28_6==NE||(LA28_6>=OR && LA28_6<=ORDER)||LA28_6==PARAGRAPHS||LA28_6==RETURN||LA28_6==SATISFIES||LA28_6==SCORE||LA28_6==SENTENCES||LA28_6==STABLE||(LA28_6>=TIMES && LA28_6<=TO)||LA28_6==UNION||LA28_6==WHERE||LA28_6==WITHOUT||LA28_6==WORDS||(LA28_6>=SEMICOLONSi && LA28_6<=COMMASi)||(LA28_6>=ASSIGNSi && LA28_6<=COLONSi)||(LA28_6>=RPARSi && LA28_6<=NODEAFTERSi)||LA28_6==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 6, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA28_7 = input.LA(2);

                if ( (LA28_7==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_7==EOF||LA28_7==AND||(LA28_7>=ASCENDING && LA28_7<=AT)||LA28_7==CASE||LA28_7==COLLATION||LA28_7==DEFAULT||LA28_7==DESCENDING||LA28_7==DIV||LA28_7==ELSE||LA28_7==EMPTY||LA28_7==EQ||(LA28_7>=EXCEPT && LA28_7<=EXTERNAL)||LA28_7==FOR||LA28_7==FTCONTAINS||LA28_7==GE||(LA28_7>=GT && LA28_7<=IDIV)||LA28_7==IN||(LA28_7>=INSTANCE && LA28_7<=IS)||LA28_7==LE||(LA28_7>=LET && LA28_7<=LEVELS)||(LA28_7>=LT && LA28_7<=MOD)||LA28_7==NE||(LA28_7>=OR && LA28_7<=ORDER)||LA28_7==PARAGRAPHS||LA28_7==RETURN||LA28_7==SATISFIES||LA28_7==SCORE||LA28_7==SENTENCES||LA28_7==STABLE||(LA28_7>=TIMES && LA28_7<=TO)||LA28_7==UNION||LA28_7==WHERE||LA28_7==WITHOUT||LA28_7==WORDS||(LA28_7>=SEMICOLONSi && LA28_7<=COMMASi)||(LA28_7>=ASSIGNSi && LA28_7<=COLONSi)||(LA28_7>=RPARSi && LA28_7<=NODEAFTERSi)||LA28_7==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 7, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA28_8 = input.LA(2);

                if ( (LA28_8==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_8==EOF||LA28_8==AND||(LA28_8>=ASCENDING && LA28_8<=AT)||LA28_8==CASE||LA28_8==COLLATION||LA28_8==DEFAULT||LA28_8==DESCENDING||LA28_8==DIV||LA28_8==ELSE||LA28_8==EMPTY||LA28_8==EQ||(LA28_8>=EXCEPT && LA28_8<=EXTERNAL)||LA28_8==FOR||LA28_8==FTCONTAINS||LA28_8==GE||(LA28_8>=GT && LA28_8<=IDIV)||LA28_8==IN||(LA28_8>=INSTANCE && LA28_8<=IS)||LA28_8==LE||(LA28_8>=LET && LA28_8<=LEVELS)||(LA28_8>=LT && LA28_8<=MOD)||LA28_8==NE||(LA28_8>=OR && LA28_8<=ORDER)||LA28_8==PARAGRAPHS||LA28_8==RETURN||LA28_8==SATISFIES||LA28_8==SCORE||LA28_8==SENTENCES||LA28_8==STABLE||(LA28_8>=TIMES && LA28_8<=TO)||LA28_8==UNION||LA28_8==WHERE||LA28_8==WITHOUT||LA28_8==WORDS||(LA28_8>=SEMICOLONSi && LA28_8<=COMMASi)||(LA28_8>=ASSIGNSi && LA28_8<=COLONSi)||(LA28_8>=RPARSi && LA28_8<=NODEAFTERSi)||LA28_8==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 8, input);

                    throw nvae;
                }
                }
                break;
            case NODE:
                {
                int LA28_9 = input.LA(2);

                if ( (LA28_9==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_9==EOF||LA28_9==AND||(LA28_9>=ASCENDING && LA28_9<=AT)||LA28_9==CASE||LA28_9==COLLATION||LA28_9==DEFAULT||LA28_9==DESCENDING||LA28_9==DIV||LA28_9==ELSE||LA28_9==EMPTY||LA28_9==EQ||(LA28_9>=EXCEPT && LA28_9<=EXTERNAL)||LA28_9==FOR||LA28_9==FTCONTAINS||LA28_9==GE||(LA28_9>=GT && LA28_9<=IDIV)||LA28_9==IN||(LA28_9>=INSTANCE && LA28_9<=IS)||LA28_9==LE||(LA28_9>=LET && LA28_9<=LEVELS)||(LA28_9>=LT && LA28_9<=MOD)||LA28_9==NE||(LA28_9>=OR && LA28_9<=ORDER)||LA28_9==PARAGRAPHS||LA28_9==RETURN||LA28_9==SATISFIES||LA28_9==SCORE||LA28_9==SENTENCES||LA28_9==STABLE||(LA28_9>=TIMES && LA28_9<=TO)||LA28_9==UNION||LA28_9==WHERE||LA28_9==WITHOUT||LA28_9==WORDS||(LA28_9>=SEMICOLONSi && LA28_9<=COMMASi)||(LA28_9>=ASSIGNSi && LA28_9<=COLONSi)||(LA28_9>=RPARSi && LA28_9<=NODEAFTERSi)||LA28_9==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 9, input);

                    throw nvae;
                }
                }
                break;
            case ITEM:
                {
                int LA28_10 = input.LA(2);

                if ( (LA28_10==LPARSi) ) {
                    alt28=2;
                }
                else if ( (LA28_10==EOF||LA28_10==AND||(LA28_10>=ASCENDING && LA28_10<=AT)||LA28_10==CASE||LA28_10==COLLATION||LA28_10==DEFAULT||LA28_10==DESCENDING||LA28_10==DIV||LA28_10==ELSE||LA28_10==EMPTY||LA28_10==EQ||(LA28_10>=EXCEPT && LA28_10<=EXTERNAL)||LA28_10==FOR||LA28_10==FTCONTAINS||LA28_10==GE||(LA28_10>=GT && LA28_10<=IDIV)||LA28_10==IN||(LA28_10>=INSTANCE && LA28_10<=IS)||LA28_10==LE||(LA28_10>=LET && LA28_10<=LEVELS)||(LA28_10>=LT && LA28_10<=MOD)||LA28_10==NE||(LA28_10>=OR && LA28_10<=ORDER)||LA28_10==PARAGRAPHS||LA28_10==RETURN||LA28_10==SATISFIES||LA28_10==SCORE||LA28_10==SENTENCES||LA28_10==STABLE||(LA28_10>=TIMES && LA28_10<=TO)||LA28_10==UNION||LA28_10==WHERE||LA28_10==WITHOUT||LA28_10==WORDS||(LA28_10>=SEMICOLONSi && LA28_10<=COMMASi)||(LA28_10>=ASSIGNSi && LA28_10<=COLONSi)||(LA28_10>=RPARSi && LA28_10<=NODEAFTERSi)||LA28_10==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 10, input);

                    throw nvae;
                }
                }
                break;
            case ALL:
            case ANY:
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case CHILD:
            case COLLATION:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERED:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PARENT:
            case PHRASE:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PRESERVE:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCORE:
            case SELF:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UNORDERED:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case NCName:
                {
                alt28=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("417:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:417:36: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType2641);
                    kindTest133=kindTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, kindTest133.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:417:47: ( ITEM LPARSi RPARSi )
                    {
                    // etc/XQFT.g:417:47: ( ITEM LPARSi RPARSi )
                    // etc/XQFT.g:417:48: ITEM LPARSi RPARSi
                    {
                    ITEM134=(Token)input.LT(1);
                    match(input,ITEM,FOLLOW_ITEM_in_itemType2646); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ITEM134_tree = (XQFTTree)adaptor.create(ITEM134);
                    adaptor.addChild(root_0, ITEM134_tree);
                    }
                    LPARSi135=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_itemType2648); if (failed) return retval;
                    RPARSi136=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_itemType2651); if (failed) return retval;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:417:72: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType2657);
                    atomicType137=atomicType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, atomicType137.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end itemType

    public static class kindTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start kindTest
    // etc/XQFT.g:418:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
    public final kindTest_return kindTest() throws RecognitionException {
        kindTest_return retval = new kindTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        documentTest_return documentTest138 = null;

        elementTest_return elementTest139 = null;

        attributeTest_return attributeTest140 = null;

        schemaElementTest_return schemaElementTest141 = null;

        schemaAttributeTest_return schemaAttributeTest142 = null;

        piTest_return piTest143 = null;

        commentTest_return commentTest144 = null;

        textTest_return textTest145 = null;

        anyKindTest_return anyKindTest146 = null;



        try {
            // etc/XQFT.g:418:34: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
            int alt29=9;
            switch ( input.LA(1) ) {
            case DOCUMENT_NODE:
                {
                alt29=1;
                }
                break;
            case ELEMENT:
                {
                alt29=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt29=3;
                }
                break;
            case SCHEMA_ELEMENT:
                {
                alt29=4;
                }
                break;
            case SCHEMA_ATTRIBUTE:
                {
                alt29=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt29=6;
                }
                break;
            case COMMENT:
                {
                alt29=7;
                }
                break;
            case TEXT:
                {
                alt29=8;
                }
                break;
            case NODE:
                {
                alt29=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("418:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:418:36: documentTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_documentTest_in_kindTest2689);
                    documentTest138=documentTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, documentTest138.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:419:39: elementTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_elementTest_in_kindTest2729);
                    elementTest139=elementTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, elementTest139.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:420:39: attributeTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_attributeTest_in_kindTest2769);
                    attributeTest140=attributeTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attributeTest140.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:421:39: schemaElementTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_schemaElementTest_in_kindTest2809);
                    schemaElementTest141=schemaElementTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaElementTest141.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:422:39: schemaAttributeTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest2849);
                    schemaAttributeTest142=schemaAttributeTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaAttributeTest142.getTree());

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:423:39: piTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_piTest_in_kindTest2889);
                    piTest143=piTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, piTest143.getTree());

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:424:39: commentTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_commentTest_in_kindTest2929);
                    commentTest144=commentTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, commentTest144.getTree());

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:425:39: textTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_textTest_in_kindTest2969);
                    textTest145=textTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, textTest145.getTree());

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:426:39: anyKindTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_anyKindTest_in_kindTest3009);
                    anyKindTest146=anyKindTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, anyKindTest146.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end kindTest

    public static class documentTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start documentTest
    // etc/XQFT.g:427:4: documentTest : DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi ;
    public final documentTest_return documentTest() throws RecognitionException {
        documentTest_return retval = new documentTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOCUMENT_NODE147=null;
        Token LPARSi148=null;
        Token RPARSi151=null;
        elementTest_return elementTest149 = null;

        schemaElementTest_return schemaElementTest150 = null;


        XQFTTree DOCUMENT_NODE147_tree=null;
        XQFTTree LPARSi148_tree=null;
        XQFTTree RPARSi151_tree=null;

        try {
            // etc/XQFT.g:427:35: ( DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi )
            // etc/XQFT.g:427:37: DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOCUMENT_NODE147=(Token)input.LT(1);
            match(input,DOCUMENT_NODE,FOLLOW_DOCUMENT_NODE_in_documentTest3037); if (failed) return retval;
            if ( backtracking==0 ) {
            DOCUMENT_NODE147_tree = (XQFTTree)adaptor.create(DOCUMENT_NODE147);
            adaptor.addChild(root_0, DOCUMENT_NODE147_tree);
            }
            LPARSi148=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_documentTest3039); if (failed) return retval;
            // etc/XQFT.g:427:59: ( elementTest | schemaElementTest )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ELEMENT) ) {
                alt30=1;
            }
            else if ( (LA30_0==SCHEMA_ELEMENT) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // etc/XQFT.g:427:60: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest3043);
                    elementTest149=elementTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, elementTest149.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:427:74: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest3047);
                    schemaElementTest150=schemaElementTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaElementTest150.getTree());

                    }
                    break;

            }

            RPARSi151=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_documentTest3051); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end documentTest

    public static class elementTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elementTest
    // etc/XQFT.g:428:5: elementTest : ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi ;
    public final elementTest_return elementTest() throws RecognitionException {
        elementTest_return retval = new elementTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ELEMENT152=null;
        Token LPARSi153=null;
        Token COMMASi155=null;
        Token QUESTIONSi157=null;
        Token RPARSi158=null;
        elementNameOrWildcard_return elementNameOrWildcard154 = null;

        typeName_return typeName156 = null;


        XQFTTree ELEMENT152_tree=null;
        XQFTTree LPARSi153_tree=null;
        XQFTTree COMMASi155_tree=null;
        XQFTTree QUESTIONSi157_tree=null;
        XQFTTree RPARSi158_tree=null;

        try {
            // etc/XQFT.g:428:34: ( ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi )
            // etc/XQFT.g:428:36: ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ELEMENT152=(Token)input.LT(1);
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest3080); if (failed) return retval;
            if ( backtracking==0 ) {
            ELEMENT152_tree = (XQFTTree)adaptor.create(ELEMENT152);
            adaptor.addChild(root_0, ELEMENT152_tree);
            }
            LPARSi153=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_elementTest3082); if (failed) return retval;
            // etc/XQFT.g:428:52: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=ALL && LA33_0<=XQUERY)||LA33_0==STARSi||LA33_0==NCName) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // etc/XQFT.g:428:53: elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest3086);
                    elementNameOrWildcard154=elementNameOrWildcard();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, elementNameOrWildcard154.getTree());
                    // etc/XQFT.g:428:75: ( COMMASi typeName ( QUESTIONSi )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMASi) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // etc/XQFT.g:428:76: COMMASi typeName ( QUESTIONSi )?
                            {
                            COMMASi155=(Token)input.LT(1);
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest3089); if (failed) return retval;
                            if ( backtracking==0 ) {
                            COMMASi155_tree = (XQFTTree)adaptor.create(COMMASi155);
                            adaptor.addChild(root_0, COMMASi155_tree);
                            }
                            pushFollow(FOLLOW_typeName_in_elementTest3091);
                            typeName156=typeName();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, typeName156.getTree());
                            // etc/XQFT.g:428:93: ( QUESTIONSi )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==QUESTIONSi) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // etc/XQFT.g:428:93: QUESTIONSi
                                    {
                                    QUESTIONSi157=(Token)input.LT(1);
                                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_elementTest3093); if (failed) return retval;
                                    if ( backtracking==0 ) {
                                    QUESTIONSi157_tree = (XQFTTree)adaptor.create(QUESTIONSi157);
                                    adaptor.addChild(root_0, QUESTIONSi157_tree);
                                    }

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            RPARSi158=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_elementTest3100); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end elementTest

    public static class elementNameOrWildcard_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elementNameOrWildcard
    // etc/XQFT.g:429:6: elementNameOrWildcard : ( elementName | STARSi );
    public final elementNameOrWildcard_return elementNameOrWildcard() throws RecognitionException {
        elementNameOrWildcard_return retval = new elementNameOrWildcard_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token STARSi160=null;
        elementName_return elementName159 = null;


        XQFTTree STARSi160_tree=null;

        try {
            // etc/XQFT.g:429:37: ( elementName | STARSi )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=ALL && LA34_0<=XQUERY)||LA34_0==NCName) ) {
                alt34=1;
            }
            else if ( (LA34_0==STARSi) ) {
                alt34=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("429:6: elementNameOrWildcard : ( elementName | STARSi );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:429:39: elementName
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard3122);
                    elementName159=elementName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, elementName159.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:429:53: STARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STARSi160=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard3126); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STARSi160_tree = (XQFTTree)adaptor.create(STARSi160);
                    adaptor.addChild(root_0, STARSi160_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end elementNameOrWildcard

    public static class elementName_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elementName
    // etc/XQFT.g:430:7: elementName : qName ;
    public final elementName_return elementName() throws RecognitionException {
        elementName_return retval = new elementName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qName161 = null;



        try {
            // etc/XQFT.g:430:38: ( qName )
            // etc/XQFT.g:430:40: qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_elementName3158);
            qName161=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName161.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end elementName

    public static class typeName_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typeName
    // etc/XQFT.g:431:6: typeName : qName ;
    public final typeName_return typeName() throws RecognitionException {
        typeName_return retval = new typeName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qName162 = null;



        try {
            // etc/XQFT.g:431:37: ( qName )
            // etc/XQFT.g:431:39: qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_typeName3192);
            qName162=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName162.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end typeName

    public static class schemaElementTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start schemaElementTest
    // etc/XQFT.g:432:5: schemaElementTest : SCHEMA_ELEMENT LPARSi elementDeclaration RPARSi ;
    public final schemaElementTest_return schemaElementTest() throws RecognitionException {
        schemaElementTest_return retval = new schemaElementTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token SCHEMA_ELEMENT163=null;
        Token LPARSi164=null;
        Token RPARSi166=null;
        elementDeclaration_return elementDeclaration165 = null;


        XQFTTree SCHEMA_ELEMENT163_tree=null;
        XQFTTree LPARSi164_tree=null;
        XQFTTree RPARSi166_tree=null;

        try {
            // etc/XQFT.g:432:37: ( SCHEMA_ELEMENT LPARSi elementDeclaration RPARSi )
            // etc/XQFT.g:432:39: SCHEMA_ELEMENT LPARSi elementDeclaration RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            SCHEMA_ELEMENT163=(Token)input.LT(1);
            match(input,SCHEMA_ELEMENT,FOLLOW_SCHEMA_ELEMENT_in_schemaElementTest3217); if (failed) return retval;
            if ( backtracking==0 ) {
            SCHEMA_ELEMENT163_tree = (XQFTTree)adaptor.create(SCHEMA_ELEMENT163);
            adaptor.addChild(root_0, SCHEMA_ELEMENT163_tree);
            }
            LPARSi164=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaElementTest3219); if (failed) return retval;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest3222);
            elementDeclaration165=elementDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, elementDeclaration165.getTree());
            RPARSi166=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaElementTest3224); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end schemaElementTest

    public static class elementDeclaration_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elementDeclaration
    // etc/XQFT.g:433:6: elementDeclaration : elementName ;
    public final elementDeclaration_return elementDeclaration() throws RecognitionException {
        elementDeclaration_return retval = new elementDeclaration_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        elementName_return elementName167 = null;



        try {
            // etc/XQFT.g:433:37: ( elementName )
            // etc/XQFT.g:433:39: elementName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_elementName_in_elementDeclaration3249);
            elementName167=elementName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, elementName167.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end elementDeclaration

    public static class attributeTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeTest
    // etc/XQFT.g:439:4: attributeTest : ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi ;
    public final attributeTest_return attributeTest() throws RecognitionException {
        attributeTest_return retval = new attributeTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ATTRIBUTE168=null;
        Token LPARSi169=null;
        Token COMMASi171=null;
        Token RPARSi173=null;
        attribNameOrWildcard_return attribNameOrWildcard170 = null;

        typeName_return typeName172 = null;


        XQFTTree ATTRIBUTE168_tree=null;
        XQFTTree LPARSi169_tree=null;
        XQFTTree COMMASi171_tree=null;
        XQFTTree RPARSi173_tree=null;

        try {
            // etc/XQFT.g:439:35: ( ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi )
            // etc/XQFT.g:439:37: ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ATTRIBUTE168=(Token)input.LT(1);
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest3281); if (failed) return retval;
            if ( backtracking==0 ) {
            ATTRIBUTE168_tree = (XQFTTree)adaptor.create(ATTRIBUTE168);
            adaptor.addChild(root_0, ATTRIBUTE168_tree);
            }
            LPARSi169=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_attributeTest3283); if (failed) return retval;
            // etc/XQFT.g:439:55: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=ALL && LA36_0<=XQUERY)||LA36_0==STARSi||LA36_0==NCName) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:439:56: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest3287);
                    attribNameOrWildcard170=attribNameOrWildcard();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attribNameOrWildcard170.getTree());
                    // etc/XQFT.g:439:77: ( COMMASi typeName )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMASi) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // etc/XQFT.g:439:78: COMMASi typeName
                            {
                            COMMASi171=(Token)input.LT(1);
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest3290); if (failed) return retval;
                            if ( backtracking==0 ) {
                            COMMASi171_tree = (XQFTTree)adaptor.create(COMMASi171);
                            adaptor.addChild(root_0, COMMASi171_tree);
                            }
                            pushFollow(FOLLOW_typeName_in_attributeTest3292);
                            typeName172=typeName();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, typeName172.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }

            RPARSi173=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_attributeTest3298); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end attributeTest

    public static class attribNameOrWildcard_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attribNameOrWildcard
    // etc/XQFT.g:440:5: attribNameOrWildcard : ( attributeName | STARSi );
    public final attribNameOrWildcard_return attribNameOrWildcard() throws RecognitionException {
        attribNameOrWildcard_return retval = new attribNameOrWildcard_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token STARSi175=null;
        attributeName_return attributeName174 = null;


        XQFTTree STARSi175_tree=null;

        try {
            // etc/XQFT.g:440:36: ( attributeName | STARSi )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=ALL && LA37_0<=XQUERY)||LA37_0==NCName) ) {
                alt37=1;
            }
            else if ( (LA37_0==STARSi) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("440:5: attribNameOrWildcard : ( attributeName | STARSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:440:38: attributeName
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard3320);
                    attributeName174=attributeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attributeName174.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:440:54: STARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STARSi175=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard3324); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STARSi175_tree = (XQFTTree)adaptor.create(STARSi175);
                    adaptor.addChild(root_0, STARSi175_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end attribNameOrWildcard

    public static class attributeName_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeName
    // etc/XQFT.g:441:6: attributeName : qName ;
    public final attributeName_return attributeName() throws RecognitionException {
        attributeName_return retval = new attributeName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qName176 = null;



        try {
            // etc/XQFT.g:441:37: ( qName )
            // etc/XQFT.g:441:39: qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_attributeName3353);
            qName176=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName176.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end attributeName

    public static class schemaAttributeTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start schemaAttributeTest
    // etc/XQFT.g:446:4: schemaAttributeTest : SCHEMA_ATTRIBUTE LPARSi attributeDeclaration RPARSi ;
    public final schemaAttributeTest_return schemaAttributeTest() throws RecognitionException {
        schemaAttributeTest_return retval = new schemaAttributeTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token SCHEMA_ATTRIBUTE177=null;
        Token LPARSi178=null;
        Token RPARSi180=null;
        attributeDeclaration_return attributeDeclaration179 = null;


        XQFTTree SCHEMA_ATTRIBUTE177_tree=null;
        XQFTTree LPARSi178_tree=null;
        XQFTTree RPARSi180_tree=null;

        try {
            // etc/XQFT.g:446:35: ( SCHEMA_ATTRIBUTE LPARSi attributeDeclaration RPARSi )
            // etc/XQFT.g:446:37: SCHEMA_ATTRIBUTE LPARSi attributeDeclaration RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            SCHEMA_ATTRIBUTE177=(Token)input.LT(1);
            match(input,SCHEMA_ATTRIBUTE,FOLLOW_SCHEMA_ATTRIBUTE_in_schemaAttributeTest3378); if (failed) return retval;
            if ( backtracking==0 ) {
            SCHEMA_ATTRIBUTE177_tree = (XQFTTree)adaptor.create(SCHEMA_ATTRIBUTE177);
            adaptor.addChild(root_0, SCHEMA_ATTRIBUTE177_tree);
            }
            LPARSi178=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaAttributeTest3380); if (failed) return retval;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest3383);
            attributeDeclaration179=attributeDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration179.getTree());
            RPARSi180=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaAttributeTest3385); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end schemaAttributeTest

    public static class attributeDeclaration_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeDeclaration
    // etc/XQFT.g:447:5: attributeDeclaration : attributeName ;
    public final attributeDeclaration_return attributeDeclaration() throws RecognitionException {
        attributeDeclaration_return retval = new attributeDeclaration_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        attributeName_return attributeName181 = null;



        try {
            // etc/XQFT.g:447:36: ( attributeName )
            // etc/XQFT.g:447:38: attributeName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_attributeName_in_attributeDeclaration3407);
            attributeName181=attributeName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, attributeName181.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end attributeDeclaration

    public static class piTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start piTest
    // etc/XQFT.g:449:4: piTest : PROCESSING_INSTRUCTION LPARSi ( ncNameorKeyword | StringLiteral )? RPARSi ;
    public final piTest_return piTest() throws RecognitionException {
        piTest_return retval = new piTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token PROCESSING_INSTRUCTION182=null;
        Token LPARSi183=null;
        Token StringLiteral185=null;
        Token RPARSi186=null;
        ncNameorKeyword_return ncNameorKeyword184 = null;


        XQFTTree PROCESSING_INSTRUCTION182_tree=null;
        XQFTTree LPARSi183_tree=null;
        XQFTTree StringLiteral185_tree=null;
        XQFTTree RPARSi186_tree=null;

        try {
            // etc/XQFT.g:449:35: ( PROCESSING_INSTRUCTION LPARSi ( ncNameorKeyword | StringLiteral )? RPARSi )
            // etc/XQFT.g:449:37: PROCESSING_INSTRUCTION LPARSi ( ncNameorKeyword | StringLiteral )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            PROCESSING_INSTRUCTION182=(Token)input.LT(1);
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest3442); if (failed) return retval;
            if ( backtracking==0 ) {
            PROCESSING_INSTRUCTION182_tree = (XQFTTree)adaptor.create(PROCESSING_INSTRUCTION182);
            adaptor.addChild(root_0, PROCESSING_INSTRUCTION182_tree);
            }
            LPARSi183=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_piTest3444); if (failed) return retval;
            // etc/XQFT.g:449:68: ( ncNameorKeyword | StringLiteral )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=ALL && LA38_0<=XQUERY)||LA38_0==NCName) ) {
                alt38=1;
            }
            else if ( (LA38_0==StringLiteral) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // etc/XQFT.g:449:69: ncNameorKeyword
                    {
                    pushFollow(FOLLOW_ncNameorKeyword_in_piTest3448);
                    ncNameorKeyword184=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword184.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:449:87: StringLiteral
                    {
                    StringLiteral185=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_piTest3452); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral185_tree = (XQFTTree)adaptor.create(StringLiteral185);
                    adaptor.addChild(root_0, StringLiteral185_tree);
                    }

                    }
                    break;

            }

            RPARSi186=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_piTest3456); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end piTest

    public static class commentTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start commentTest
    // etc/XQFT.g:450:4: commentTest : COMMENT LPARSi RPARSi ;
    public final commentTest_return commentTest() throws RecognitionException {
        commentTest_return retval = new commentTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COMMENT187=null;
        Token LPARSi188=null;
        Token RPARSi189=null;

        XQFTTree COMMENT187_tree=null;
        XQFTTree LPARSi188_tree=null;
        XQFTTree RPARSi189_tree=null;

        try {
            // etc/XQFT.g:450:35: ( COMMENT LPARSi RPARSi )
            // etc/XQFT.g:450:37: COMMENT LPARSi RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            COMMENT187=(Token)input.LT(1);
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest3486); if (failed) return retval;
            if ( backtracking==0 ) {
            COMMENT187_tree = (XQFTTree)adaptor.create(COMMENT187);
            adaptor.addChild(root_0, COMMENT187_tree);
            }
            LPARSi188=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_commentTest3488); if (failed) return retval;
            RPARSi189=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_commentTest3491); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end commentTest

    public static class textTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start textTest
    // etc/XQFT.g:451:4: textTest : TEXT LPARSi RPARSi ;
    public final textTest_return textTest() throws RecognitionException {
        textTest_return retval = new textTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TEXT190=null;
        Token LPARSi191=null;
        Token RPARSi192=null;

        XQFTTree TEXT190_tree=null;
        XQFTTree LPARSi191_tree=null;
        XQFTTree RPARSi192_tree=null;

        try {
            // etc/XQFT.g:451:35: ( TEXT LPARSi RPARSi )
            // etc/XQFT.g:451:37: TEXT LPARSi RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            TEXT190=(Token)input.LT(1);
            match(input,TEXT,FOLLOW_TEXT_in_textTest3524); if (failed) return retval;
            if ( backtracking==0 ) {
            TEXT190_tree = (XQFTTree)adaptor.create(TEXT190);
            adaptor.addChild(root_0, TEXT190_tree);
            }
            LPARSi191=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_textTest3526); if (failed) return retval;
            RPARSi192=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_textTest3529); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end textTest

    public static class anyKindTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start anyKindTest
    // etc/XQFT.g:452:4: anyKindTest : NODE LPARSi RPARSi ;
    public final anyKindTest_return anyKindTest() throws RecognitionException {
        anyKindTest_return retval = new anyKindTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token NODE193=null;
        Token LPARSi194=null;
        Token RPARSi195=null;

        XQFTTree NODE193_tree=null;
        XQFTTree LPARSi194_tree=null;
        XQFTTree RPARSi195_tree=null;

        try {
            // etc/XQFT.g:452:35: ( NODE LPARSi RPARSi )
            // etc/XQFT.g:452:37: NODE LPARSi RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            NODE193=(Token)input.LT(1);
            match(input,NODE,FOLLOW_NODE_in_anyKindTest3559); if (failed) return retval;
            if ( backtracking==0 ) {
            NODE193_tree = (XQFTTree)adaptor.create(NODE193);
            adaptor.addChild(root_0, NODE193_tree);
            }
            LPARSi194=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_anyKindTest3561); if (failed) return retval;
            RPARSi195=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_anyKindTest3564); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end anyKindTest

    public static class occurrenceIndicator_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start occurrenceIndicator
    // etc/XQFT.g:454:2: occurrenceIndicator : ( QUESTIONSi | STARSi | PLUSSi );
    public final occurrenceIndicator_return occurrenceIndicator() throws RecognitionException {
        occurrenceIndicator_return retval = new occurrenceIndicator_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set196=null;

        XQFTTree set196_tree=null;

        try {
            // etc/XQFT.g:454:33: ( QUESTIONSi | STARSi | PLUSSi )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set196=(Token)input.LT(1);
            if ( (input.LA(1)>=QUESTIONSi && input.LA(1)<=PLUSSi) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set196));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_occurrenceIndicator0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end occurrenceIndicator

    public static class exprSingle_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exprSingle
    // etc/XQFT.g:458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );
    public final exprSingle_return exprSingle() throws RecognitionException {
        exprSingle_return retval = new exprSingle_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ifExpr_return ifExpr197 = null;

        typeswitchExpr_return typeswitchExpr198 = null;

        fLWORExpr_return fLWORExpr199 = null;

        quantifiedExpr_return quantifiedExpr200 = null;

        orExpr_return orExpr201 = null;



        try {
            // etc/XQFT.g:458:32: ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr )
            int alt39=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==LPARSi) ) {
                    int LA39_38 = input.LA(3);

                    if ( (synpred3()) ) {
                        alt39=1;
                    }
                    else if ( (true) ) {
                        alt39=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 38, input);

                        throw nvae;
                    }
                }
                else if ( (LA39_1==EOF||LA39_1==AND||LA39_1==ASCENDING||(LA39_1>=CASE && LA39_1<=CASTABLE)||LA39_1==COLLATION||LA39_1==DEFAULT||LA39_1==DESCENDING||LA39_1==DIV||LA39_1==ELSE||LA39_1==EMPTY||LA39_1==EQ||LA39_1==EXCEPT||LA39_1==FOR||LA39_1==FTCONTAINS||LA39_1==GE||(LA39_1>=GT && LA39_1<=IDIV)||(LA39_1>=INSTANCE && LA39_1<=IS)||LA39_1==LE||LA39_1==LET||(LA39_1>=LT && LA39_1<=MOD)||LA39_1==NE||(LA39_1>=OR && LA39_1<=ORDER)||LA39_1==RETURN||LA39_1==SATISFIES||LA39_1==STABLE||(LA39_1>=TO && LA39_1<=TREAT)||LA39_1==UNION||LA39_1==WHERE||(LA39_1>=SEMICOLONSi && LA39_1<=COMMASi)||LA39_1==COLONSi||LA39_1==RPARSi||LA39_1==RBRACSi||(LA39_1>=STARSi && LA39_1<=NODEAFTERSi)||(LA39_1>=SLASHSi && LA39_1<=DBLSLASHSi)||(LA39_1>=LBRACKSi && LA39_1<=RBRACKSi)) ) {
                    alt39=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case TYPESWITCH:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==LPARSi) ) {
                    int LA39_77 = input.LA(3);

                    if ( (synpred4()) ) {
                        alt39=2;
                    }
                    else if ( (true) ) {
                        alt39=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 77, input);

                        throw nvae;
                    }
                }
                else if ( (LA39_2==EOF||LA39_2==AND||LA39_2==ASCENDING||(LA39_2>=CASE && LA39_2<=CASTABLE)||LA39_2==COLLATION||LA39_2==DEFAULT||LA39_2==DESCENDING||LA39_2==DIV||LA39_2==ELSE||LA39_2==EMPTY||LA39_2==EQ||LA39_2==EXCEPT||LA39_2==FOR||LA39_2==FTCONTAINS||LA39_2==GE||(LA39_2>=GT && LA39_2<=IDIV)||(LA39_2>=INSTANCE && LA39_2<=IS)||LA39_2==LE||LA39_2==LET||(LA39_2>=LT && LA39_2<=MOD)||LA39_2==NE||(LA39_2>=OR && LA39_2<=ORDER)||LA39_2==RETURN||LA39_2==SATISFIES||LA39_2==STABLE||(LA39_2>=TO && LA39_2<=TREAT)||LA39_2==UNION||LA39_2==WHERE||(LA39_2>=SEMICOLONSi && LA39_2<=COMMASi)||LA39_2==COLONSi||LA39_2==RPARSi||LA39_2==RBRACSi||(LA39_2>=STARSi && LA39_2<=NODEAFTERSi)||(LA39_2>=SLASHSi && LA39_2<=DBLSLASHSi)||(LA39_2>=LBRACKSi && LA39_2<=RBRACKSi)) ) {
                    alt39=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case FOR:
                {
                int LA39_3 = input.LA(2);

                if ( (LA39_3==EOF||LA39_3==AND||LA39_3==ASCENDING||(LA39_3>=CASE && LA39_3<=CASTABLE)||LA39_3==COLLATION||LA39_3==DEFAULT||LA39_3==DESCENDING||LA39_3==DIV||LA39_3==ELSE||LA39_3==EMPTY||LA39_3==EQ||LA39_3==EXCEPT||LA39_3==FOR||LA39_3==FTCONTAINS||LA39_3==GE||(LA39_3>=GT && LA39_3<=IDIV)||(LA39_3>=INSTANCE && LA39_3<=IS)||LA39_3==LE||LA39_3==LET||(LA39_3>=LT && LA39_3<=MOD)||LA39_3==NE||(LA39_3>=OR && LA39_3<=ORDER)||LA39_3==RETURN||LA39_3==SATISFIES||LA39_3==STABLE||(LA39_3>=TO && LA39_3<=TREAT)||LA39_3==UNION||LA39_3==WHERE||(LA39_3>=SEMICOLONSi && LA39_3<=COMMASi)||(LA39_3>=COLONSi && LA39_3<=RPARSi)||LA39_3==RBRACSi||(LA39_3>=STARSi && LA39_3<=NODEAFTERSi)||(LA39_3>=SLASHSi && LA39_3<=DBLSLASHSi)||(LA39_3>=LBRACKSi && LA39_3<=RBRACKSi)) ) {
                    alt39=5;
                }
                else if ( (LA39_3==DOLLARSi) ) {
                    alt39=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 3, input);

                    throw nvae;
                }
                }
                break;
            case LET:
                {
                int LA39_4 = input.LA(2);

                if ( (LA39_4==EOF||LA39_4==AND||LA39_4==ASCENDING||(LA39_4>=CASE && LA39_4<=CASTABLE)||LA39_4==COLLATION||LA39_4==DEFAULT||LA39_4==DESCENDING||LA39_4==DIV||LA39_4==ELSE||LA39_4==EMPTY||LA39_4==EQ||LA39_4==EXCEPT||LA39_4==FOR||LA39_4==FTCONTAINS||LA39_4==GE||(LA39_4>=GT && LA39_4<=IDIV)||(LA39_4>=INSTANCE && LA39_4<=IS)||LA39_4==LE||LA39_4==LET||(LA39_4>=LT && LA39_4<=MOD)||LA39_4==NE||(LA39_4>=OR && LA39_4<=ORDER)||LA39_4==RETURN||LA39_4==SATISFIES||LA39_4==STABLE||(LA39_4>=TO && LA39_4<=TREAT)||LA39_4==UNION||LA39_4==WHERE||(LA39_4>=SEMICOLONSi && LA39_4<=COMMASi)||(LA39_4>=COLONSi && LA39_4<=RPARSi)||LA39_4==RBRACSi||(LA39_4>=STARSi && LA39_4<=NODEAFTERSi)||(LA39_4>=SLASHSi && LA39_4<=DBLSLASHSi)||(LA39_4>=LBRACKSi && LA39_4<=RBRACKSi)) ) {
                    alt39=5;
                }
                else if ( (LA39_4==SCORE||LA39_4==DOLLARSi) ) {
                    alt39=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 4, input);

                    throw nvae;
                }
                }
                break;
            case SOME:
                {
                int LA39_5 = input.LA(2);

                if ( (LA39_5==EOF||LA39_5==AND||LA39_5==ASCENDING||(LA39_5>=CASE && LA39_5<=CASTABLE)||LA39_5==COLLATION||LA39_5==DEFAULT||LA39_5==DESCENDING||LA39_5==DIV||LA39_5==ELSE||LA39_5==EMPTY||LA39_5==EQ||LA39_5==EXCEPT||LA39_5==FOR||LA39_5==FTCONTAINS||LA39_5==GE||(LA39_5>=GT && LA39_5<=IDIV)||(LA39_5>=INSTANCE && LA39_5<=IS)||LA39_5==LE||LA39_5==LET||(LA39_5>=LT && LA39_5<=MOD)||LA39_5==NE||(LA39_5>=OR && LA39_5<=ORDER)||LA39_5==RETURN||LA39_5==SATISFIES||LA39_5==STABLE||(LA39_5>=TO && LA39_5<=TREAT)||LA39_5==UNION||LA39_5==WHERE||(LA39_5>=SEMICOLONSi && LA39_5<=COMMASi)||(LA39_5>=COLONSi && LA39_5<=RPARSi)||LA39_5==RBRACSi||(LA39_5>=STARSi && LA39_5<=NODEAFTERSi)||(LA39_5>=SLASHSi && LA39_5<=DBLSLASHSi)||(LA39_5>=LBRACKSi && LA39_5<=RBRACKSi)) ) {
                    alt39=5;
                }
                else if ( (LA39_5==DOLLARSi) ) {
                    alt39=4;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 5, input);

                    throw nvae;
                }
                }
                break;
            case EVERY:
                {
                int LA39_6 = input.LA(2);

                if ( (LA39_6==EOF||LA39_6==AND||LA39_6==ASCENDING||(LA39_6>=CASE && LA39_6<=CASTABLE)||LA39_6==COLLATION||LA39_6==DEFAULT||LA39_6==DESCENDING||LA39_6==DIV||LA39_6==ELSE||LA39_6==EMPTY||LA39_6==EQ||LA39_6==EXCEPT||LA39_6==FOR||LA39_6==FTCONTAINS||LA39_6==GE||(LA39_6>=GT && LA39_6<=IDIV)||(LA39_6>=INSTANCE && LA39_6<=IS)||LA39_6==LE||LA39_6==LET||(LA39_6>=LT && LA39_6<=MOD)||LA39_6==NE||(LA39_6>=OR && LA39_6<=ORDER)||LA39_6==RETURN||LA39_6==SATISFIES||LA39_6==STABLE||(LA39_6>=TO && LA39_6<=TREAT)||LA39_6==UNION||LA39_6==WHERE||(LA39_6>=SEMICOLONSi && LA39_6<=COMMASi)||(LA39_6>=COLONSi && LA39_6<=RPARSi)||LA39_6==RBRACSi||(LA39_6>=STARSi && LA39_6<=NODEAFTERSi)||(LA39_6>=SLASHSi && LA39_6<=DBLSLASHSi)||(LA39_6>=LBRACKSi && LA39_6<=RBRACKSi)) ) {
                    alt39=5;
                }
                else if ( (LA39_6==DOLLARSi) ) {
                    alt39=4;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 6, input);

                    throw nvae;
                }
                }
                break;
            case ALL:
            case ANY:
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case ATTRIBUTE:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case CHILD:
            case COLLATION:
            case COMMENT:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case ITEM:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NODE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERED:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PARENT:
            case PHRASE:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PRESERVE:
            case PROCESSING_INSTRUCTION:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCHEMA_ATTRIBUTE:
            case SCHEMA_ELEMENT:
            case SCORE:
            case SELF:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case TEXT:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case UNION:
            case UNORDERED:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case StringLiteral:
            case DOLLARSi:
            case LPARSi:
            case STARSi:
            case PLUSSi:
            case MINUSSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case LPRAGSi:
            case SLASHSi:
            case DBLSLASHSi:
            case DOTDOTSi:
            case ATSi:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
            case NCName:
                {
                alt39=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("458:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // etc/XQFT.g:458:34: ( IF LPARSi )=> ifExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ifExpr_in_exprSingle3636);
                    ifExpr197=ifExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ifExpr197.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:459:37: ( TYPESWITCH LPARSi )=> typeswitchExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle3682);
                    typeswitchExpr198=typeswitchExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeswitchExpr198.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:460:13: fLWORExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle3696);
                    fLWORExpr199=fLWORExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fLWORExpr199.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:461:37: quantifiedExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle3734);
                    quantifiedExpr200=quantifiedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, quantifiedExpr200.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:462:37: orExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_orExpr_in_exprSingle3772);
                    orExpr201=orExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, orExpr201.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end exprSingle

    public static class fLWORExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fLWORExpr
    // etc/XQFT.g:464:2: fLWORExpr : (fc+= forClause | lc+= letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle -> ^( AST_FLWOR ( $fc)* ( $lc)* ( whereClause )? ( orderByClause )? exprSingle ) ;
    public final fLWORExpr_return fLWORExpr() throws RecognitionException {
        fLWORExpr_return retval = new fLWORExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token RETURN204=null;
        List list_fc=null;
        List list_lc=null;
        whereClause_return whereClause202 = null;

        orderByClause_return orderByClause203 = null;

        exprSingle_return exprSingle205 = null;

        RuleReturnScope fc = null;
        RuleReturnScope lc = null;
        XQFTTree RETURN204_tree=null;
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_letClause=new RewriteRuleSubtreeStream(adaptor,"rule letClause");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_forClause=new RewriteRuleSubtreeStream(adaptor,"rule forClause");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
        try {
            // etc/XQFT.g:464:33: ( (fc+= forClause | lc+= letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle -> ^( AST_FLWOR ( $fc)* ( $lc)* ( whereClause )? ( orderByClause )? exprSingle ) )
            // etc/XQFT.g:464:35: (fc+= forClause | lc+= letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:464:35: (fc+= forClause | lc+= letClause )+
            int cnt40=0;
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==FOR) ) {
                    alt40=1;
                }
                else if ( (LA40_0==LET) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // etc/XQFT.g:464:36: fc+= forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr3839);
            	    fc=forClause();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_forClause.add(fc.getTree());
            	    if (list_fc==null) list_fc=new ArrayList();
            	    list_fc.add(fc);


            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:464:52: lc+= letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr3845);
            	    lc=letClause();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_letClause.add(lc.getTree());
            	    if (list_lc==null) list_lc=new ArrayList();
            	    list_lc.add(lc);


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // etc/XQFT.g:464:68: ( whereClause )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // etc/XQFT.g:464:68: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr3849);
                    whereClause202=whereClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_whereClause.add(whereClause202.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:464:81: ( orderByClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ORDER||LA42_0==STABLE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // etc/XQFT.g:464:81: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr3852);
                    orderByClause203=orderByClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_orderByClause.add(orderByClause203.getTree());

                    }
                    break;

            }

            RETURN204=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr3855); if (failed) return retval;
            if ( backtracking==0 ) stream_RETURN.add(RETURN204);

            pushFollow(FOLLOW_exprSingle_in_fLWORExpr3857);
            exprSingle205=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle205.getTree());

            // AST REWRITE
            // elements: orderByClause, fc, exprSingle, lc, whereClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: lc, fc
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_lc=new RewriteRuleSubtreeStream(adaptor,"token lc",list_lc);
            RewriteRuleSubtreeStream stream_fc=new RewriteRuleSubtreeStream(adaptor,"token fc",list_fc);
            root_0 = (XQFTTree)adaptor.nil();
            // 465:49: -> ^( AST_FLWOR ( $fc)* ( $lc)* ( whereClause )? ( orderByClause )? exprSingle )
            {
                // etc/XQFT.g:465:52: ^( AST_FLWOR ( $fc)* ( $lc)* ( whereClause )? ( orderByClause )? exprSingle )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_FLWOR, "AST_FLWOR"), root_1);

                // etc/XQFT.g:465:64: ( $fc)*
                while ( stream_fc.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_fc.next()).getTree());

                }
                stream_fc.reset();
                // etc/XQFT.g:465:69: ( $lc)*
                while ( stream_lc.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_lc.next()).getTree());

                }
                stream_lc.reset();
                // etc/XQFT.g:465:74: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.next());

                }
                stream_whereClause.reset();
                // etc/XQFT.g:465:87: ( orderByClause )?
                if ( stream_orderByClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderByClause.next());

                }
                stream_orderByClause.reset();
                adaptor.addChild(root_1, stream_exprSingle.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end fLWORExpr

    public static class forClause_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forClause
    // etc/XQFT.g:467:3: forClause : FOR forClauseTupletDef ( COMMASi forClauseTupletDef )* -> ^( AST_FORCLAUSE ( forClauseTupletDef )+ ) ;
    public final forClause_return forClause() throws RecognitionException {
        forClause_return retval = new forClause_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FOR206=null;
        Token COMMASi208=null;
        forClauseTupletDef_return forClauseTupletDef207 = null;

        forClauseTupletDef_return forClauseTupletDef209 = null;


        XQFTTree FOR206_tree=null;
        XQFTTree COMMASi208_tree=null;
        RewriteRuleTokenStream stream_FOR=new RewriteRuleTokenStream(adaptor,"token FOR");
        RewriteRuleTokenStream stream_COMMASi=new RewriteRuleTokenStream(adaptor,"token COMMASi");
        RewriteRuleSubtreeStream stream_forClauseTupletDef=new RewriteRuleSubtreeStream(adaptor,"rule forClauseTupletDef");
        try {
            // etc/XQFT.g:467:34: ( FOR forClauseTupletDef ( COMMASi forClauseTupletDef )* -> ^( AST_FORCLAUSE ( forClauseTupletDef )+ ) )
            // etc/XQFT.g:467:36: FOR forClauseTupletDef ( COMMASi forClauseTupletDef )*
            {
            FOR206=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forClause3959); if (failed) return retval;
            if ( backtracking==0 ) stream_FOR.add(FOR206);

            pushFollow(FOLLOW_forClauseTupletDef_in_forClause3961);
            forClauseTupletDef207=forClauseTupletDef();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_forClauseTupletDef.add(forClauseTupletDef207.getTree());
            // etc/XQFT.g:467:59: ( COMMASi forClauseTupletDef )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMASi) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // etc/XQFT.g:467:60: COMMASi forClauseTupletDef
            	    {
            	    COMMASi208=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause3964); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi208);

            	    pushFollow(FOLLOW_forClauseTupletDef_in_forClause3966);
            	    forClauseTupletDef209=forClauseTupletDef();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_forClauseTupletDef.add(forClauseTupletDef209.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            // AST REWRITE
            // elements: forClauseTupletDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 468:53: -> ^( AST_FORCLAUSE ( forClauseTupletDef )+ )
            {
                // etc/XQFT.g:468:56: ^( AST_FORCLAUSE ( forClauseTupletDef )+ )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_FORCLAUSE, "AST_FORCLAUSE"), root_1);

                if ( !(stream_forClauseTupletDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_forClauseTupletDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_forClauseTupletDef.next());

                }
                stream_forClauseTupletDef.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end forClause

    public static class forClauseTupletDef_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forClauseTupletDef
    // etc/XQFT.g:469:13: forClauseTupletDef : DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ;
    public final forClauseTupletDef_return forClauseTupletDef() throws RecognitionException {
        forClauseTupletDef_return retval = new forClauseTupletDef_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOLLARSi210=null;
        Token IN215=null;
        varName_return varName211 = null;

        typeDeclaration_return typeDeclaration212 = null;

        positionalVar_return positionalVar213 = null;

        ftScoreVar_return ftScoreVar214 = null;

        exprSingle_return exprSingle216 = null;


        XQFTTree DOLLARSi210_tree=null;
        XQFTTree IN215_tree=null;

        try {
            // etc/XQFT.g:469:49: ( DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )
            // etc/XQFT.g:469:51: DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOLLARSi210=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClauseTupletDef4065); if (failed) return retval;
            pushFollow(FOLLOW_varName_in_forClauseTupletDef4068);
            varName211=varName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, varName211.getTree());
            // etc/XQFT.g:469:69: ( typeDeclaration )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // etc/XQFT.g:469:69: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClauseTupletDef4070);
                    typeDeclaration212=typeDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeDeclaration212.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:469:86: ( positionalVar )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:469:86: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClauseTupletDef4073);
                    positionalVar213=positionalVar();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, positionalVar213.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:469:101: ( ftScoreVar )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==SCORE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // etc/XQFT.g:469:101: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClauseTupletDef4076);
                    ftScoreVar214=ftScoreVar();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftScoreVar214.getTree());

                    }
                    break;

            }

            IN215=(Token)input.LT(1);
            match(input,IN,FOLLOW_IN_in_forClauseTupletDef4079); if (failed) return retval;
            pushFollow(FOLLOW_exprSingle_in_forClauseTupletDef4082);
            exprSingle216=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exprSingle216.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end forClauseTupletDef

    public static class varName_return extends ParserRuleReturnScope {
        public String name;
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start varName
    // etc/XQFT.g:471:4: varName returns [String name] : qn= qName ;
    public final varName_return varName() throws RecognitionException {
        varName_return retval = new varName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qn = null;



        try {
            // etc/XQFT.g:471:43: (qn= qName )
            // etc/XQFT.g:471:45: qn= qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_varName4108);
            qn=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qn.getTree());
            if ( backtracking==0 ) {
              retval.name = qn.text;
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end varName

    public static class positionalVar_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start positionalVar
    // etc/XQFT.g:474:4: positionalVar : AT DOLLARSi varName ;
    public final positionalVar_return positionalVar() throws RecognitionException {
        positionalVar_return retval = new positionalVar_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AT217=null;
        Token DOLLARSi218=null;
        varName_return varName219 = null;


        XQFTTree AT217_tree=null;
        XQFTTree DOLLARSi218_tree=null;

        try {
            // etc/XQFT.g:474:35: ( AT DOLLARSi varName )
            // etc/XQFT.g:474:37: AT DOLLARSi varName
            {
            root_0 = (XQFTTree)adaptor.nil();

            AT217=(Token)input.LT(1);
            match(input,AT,FOLLOW_AT_in_positionalVar4139); if (failed) return retval;
            if ( backtracking==0 ) {
            AT217_tree = (XQFTTree)adaptor.create(AT217);
            adaptor.addChild(root_0, AT217_tree);
            }
            DOLLARSi218=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar4141); if (failed) return retval;
            if ( backtracking==0 ) {
            DOLLARSi218_tree = (XQFTTree)adaptor.create(DOLLARSi218);
            adaptor.addChild(root_0, DOLLARSi218_tree);
            }
            pushFollow(FOLLOW_varName_in_positionalVar4143);
            varName219=varName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, varName219.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end positionalVar

    public static class ftScoreVar_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftScoreVar
    // etc/XQFT.g:476:4: ftScoreVar : SCORE DOLLARSi varName ;
    public final ftScoreVar_return ftScoreVar() throws RecognitionException {
        ftScoreVar_return retval = new ftScoreVar_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token SCORE220=null;
        Token DOLLARSi221=null;
        varName_return varName222 = null;


        XQFTTree SCORE220_tree=null;
        XQFTTree DOLLARSi221_tree=null;

        try {
            // etc/XQFT.g:476:35: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:476:37: SCORE DOLLARSi varName
            {
            root_0 = (XQFTTree)adaptor.nil();

            SCORE220=(Token)input.LT(1);
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar4174); if (failed) return retval;
            if ( backtracking==0 ) {
            SCORE220_tree = (XQFTTree)adaptor.create(SCORE220);
            adaptor.addChild(root_0, SCORE220_tree);
            }
            DOLLARSi221=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar4176); if (failed) return retval;
            if ( backtracking==0 ) {
            DOLLARSi221_tree = (XQFTTree)adaptor.create(DOLLARSi221);
            adaptor.addChild(root_0, DOLLARSi221_tree);
            }
            pushFollow(FOLLOW_varName_in_ftScoreVar4178);
            varName222=varName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, varName222.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftScoreVar

    public static class letClause_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start letClause
    // etc/XQFT.g:480:3: letClause : LET varBinding ( COMMASi varBinding )* -> ^( AST_LETCLAUSE ( varBinding )+ ) ;
    public final letClause_return letClause() throws RecognitionException {
        letClause_return retval = new letClause_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LET223=null;
        Token COMMASi225=null;
        varBinding_return varBinding224 = null;

        varBinding_return varBinding226 = null;


        XQFTTree LET223_tree=null;
        XQFTTree COMMASi225_tree=null;
        RewriteRuleTokenStream stream_COMMASi=new RewriteRuleTokenStream(adaptor,"token COMMASi");
        RewriteRuleTokenStream stream_LET=new RewriteRuleTokenStream(adaptor,"token LET");
        RewriteRuleSubtreeStream stream_varBinding=new RewriteRuleSubtreeStream(adaptor,"rule varBinding");
        try {
            // etc/XQFT.g:480:39: ( LET varBinding ( COMMASi varBinding )* -> ^( AST_LETCLAUSE ( varBinding )+ ) )
            // etc/XQFT.g:480:41: LET varBinding ( COMMASi varBinding )*
            {
            LET223=(Token)input.LT(1);
            match(input,LET,FOLLOW_LET_in_letClause4228); if (failed) return retval;
            if ( backtracking==0 ) stream_LET.add(LET223);

            pushFollow(FOLLOW_varBinding_in_letClause4230);
            varBinding224=varBinding();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_varBinding.add(varBinding224.getTree());
            // etc/XQFT.g:480:56: ( COMMASi varBinding )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMASi) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // etc/XQFT.g:480:57: COMMASi varBinding
            	    {
            	    COMMASi225=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause4233); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi225);

            	    pushFollow(FOLLOW_varBinding_in_letClause4235);
            	    varBinding226=varBinding();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_varBinding.add(varBinding226.getTree());

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            // AST REWRITE
            // elements: varBinding
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 481:53: -> ^( AST_LETCLAUSE ( varBinding )+ )
            {
                // etc/XQFT.g:481:56: ^( AST_LETCLAUSE ( varBinding )+ )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_LETCLAUSE, "AST_LETCLAUSE"), root_1);

                if ( !(stream_varBinding.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_varBinding.hasNext() ) {
                    adaptor.addChild(root_1, stream_varBinding.next());

                }
                stream_varBinding.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end letClause

    public static class varBinding_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start varBinding
    // etc/XQFT.g:482:3: varBinding : ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle -> ( SCORE )? $v ( typeDeclaration )? exprSingle ;
    public final varBinding_return varBinding() throws RecognitionException {
        varBinding_return retval = new varBinding_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOLLARSi227=null;
        Token SCORE229=null;
        Token DOLLARSi230=null;
        Token ASSIGNSi231=null;
        varName_return v = null;

        typeDeclaration_return typeDeclaration228 = null;

        exprSingle_return exprSingle232 = null;


        XQFTTree DOLLARSi227_tree=null;
        XQFTTree SCORE229_tree=null;
        XQFTTree DOLLARSi230_tree=null;
        XQFTTree ASSIGNSi231_tree=null;
        RewriteRuleTokenStream stream_DOLLARSi=new RewriteRuleTokenStream(adaptor,"token DOLLARSi");
        RewriteRuleTokenStream stream_ASSIGNSi=new RewriteRuleTokenStream(adaptor,"token ASSIGNSi");
        RewriteRuleTokenStream stream_SCORE=new RewriteRuleTokenStream(adaptor,"token SCORE");
        RewriteRuleSubtreeStream stream_varName=new RewriteRuleSubtreeStream(adaptor,"rule varName");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        try {
            // etc/XQFT.g:482:14: ( ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle -> ( SCORE )? $v ( typeDeclaration )? exprSingle )
            // etc/XQFT.g:483:4: ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle
            {
            // etc/XQFT.g:483:4: ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==DOLLARSi) ) {
                alt49=1;
            }
            else if ( (LA49_0==SCORE) ) {
                alt49=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("483:4: ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // etc/XQFT.g:483:5: DOLLARSi v= varName ( typeDeclaration )?
                    {
                    DOLLARSi227=(Token)input.LT(1);
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding4311); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi227);

                    pushFollow(FOLLOW_varName_in_varBinding4315);
                    v=varName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_varName.add(v.getTree());
                    // etc/XQFT.g:483:24: ( typeDeclaration )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==AS) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // etc/XQFT.g:483:24: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_varBinding4317);
                            typeDeclaration228=typeDeclaration();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_typeDeclaration.add(typeDeclaration228.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:483:43: SCORE DOLLARSi v= varName
                    {
                    SCORE229=(Token)input.LT(1);
                    match(input,SCORE,FOLLOW_SCORE_in_varBinding4322); if (failed) return retval;
                    if ( backtracking==0 ) stream_SCORE.add(SCORE229);

                    DOLLARSi230=(Token)input.LT(1);
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding4324); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi230);

                    pushFollow(FOLLOW_varName_in_varBinding4328);
                    v=varName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_varName.add(v.getTree());

                    }
                    break;

            }

            ASSIGNSi231=(Token)input.LT(1);
            match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varBinding4344); if (failed) return retval;
            if ( backtracking==0 ) stream_ASSIGNSi.add(ASSIGNSi231);

            pushFollow(FOLLOW_exprSingle_in_varBinding4346);
            exprSingle232=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle232.getTree());

            // AST REWRITE
            // elements: typeDeclaration, SCORE, v, exprSingle
            // token labels: 
            // rule labels: retval, v
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",v!=null?v.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 485:13: -> ( SCORE )? $v ( typeDeclaration )? exprSingle
            {
                // etc/XQFT.g:485:16: ( SCORE )?
                if ( stream_SCORE.hasNext() ) {
                    adaptor.addChild(root_0, stream_SCORE.next());

                }
                stream_SCORE.reset();
                adaptor.addChild(root_0, stream_v.next());
                // etc/XQFT.g:485:26: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.next());

                }
                stream_typeDeclaration.reset();
                adaptor.addChild(root_0, stream_exprSingle.next());

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end varBinding

    public static class whereClause_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start whereClause
    // etc/XQFT.g:495:3: whereClause : WHERE exprSingle -> ^( AST_WHERECLAUSE exprSingle ) ;
    public final whereClause_return whereClause() throws RecognitionException {
        whereClause_return retval = new whereClause_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WHERE233=null;
        exprSingle_return exprSingle234 = null;


        XQFTTree WHERE233_tree=null;
        RewriteRuleTokenStream stream_WHERE=new RewriteRuleTokenStream(adaptor,"token WHERE");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:495:33: ( WHERE exprSingle -> ^( AST_WHERECLAUSE exprSingle ) )
            // etc/XQFT.g:495:35: WHERE exprSingle
            {
            WHERE233=(Token)input.LT(1);
            match(input,WHERE,FOLLOW_WHERE_in_whereClause4409); if (failed) return retval;
            if ( backtracking==0 ) stream_WHERE.add(WHERE233);

            pushFollow(FOLLOW_exprSingle_in_whereClause4411);
            exprSingle234=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle234.getTree());

            // AST REWRITE
            // elements: exprSingle
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 496:49: -> ^( AST_WHERECLAUSE exprSingle )
            {
                // etc/XQFT.g:496:52: ^( AST_WHERECLAUSE exprSingle )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_WHERECLAUSE, "AST_WHERECLAUSE"), root_1);

                adaptor.addChild(root_1, stream_exprSingle.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end whereClause

    public static class orderByClause_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orderByClause
    // etc/XQFT.g:499:3: orderByClause : ( ORDER BY | STABLE ORDER BY ) orderSpecList -> ^( AST_ORDERBYCLAUSE ( STABLE )? orderSpecList ) ;
    public final orderByClause_return orderByClause() throws RecognitionException {
        orderByClause_return retval = new orderByClause_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ORDER235=null;
        Token BY236=null;
        Token STABLE237=null;
        Token ORDER238=null;
        Token BY239=null;
        orderSpecList_return orderSpecList240 = null;


        XQFTTree ORDER235_tree=null;
        XQFTTree BY236_tree=null;
        XQFTTree STABLE237_tree=null;
        XQFTTree ORDER238_tree=null;
        XQFTTree BY239_tree=null;
        RewriteRuleTokenStream stream_ORDER=new RewriteRuleTokenStream(adaptor,"token ORDER");
        RewriteRuleTokenStream stream_BY=new RewriteRuleTokenStream(adaptor,"token BY");
        RewriteRuleTokenStream stream_STABLE=new RewriteRuleTokenStream(adaptor,"token STABLE");
        RewriteRuleSubtreeStream stream_orderSpecList=new RewriteRuleSubtreeStream(adaptor,"rule orderSpecList");
        try {
            // etc/XQFT.g:499:33: ( ( ORDER BY | STABLE ORDER BY ) orderSpecList -> ^( AST_ORDERBYCLAUSE ( STABLE )? orderSpecList ) )
            // etc/XQFT.g:499:35: ( ORDER BY | STABLE ORDER BY ) orderSpecList
            {
            // etc/XQFT.g:499:35: ( ORDER BY | STABLE ORDER BY )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==ORDER) ) {
                alt50=1;
            }
            else if ( (LA50_0==STABLE) ) {
                alt50=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("499:35: ( ORDER BY | STABLE ORDER BY )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // etc/XQFT.g:499:36: ORDER BY
                    {
                    ORDER235=(Token)input.LT(1);
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause4498); if (failed) return retval;
                    if ( backtracking==0 ) stream_ORDER.add(ORDER235);

                    BY236=(Token)input.LT(1);
                    match(input,BY,FOLLOW_BY_in_orderByClause4500); if (failed) return retval;
                    if ( backtracking==0 ) stream_BY.add(BY236);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:499:47: STABLE ORDER BY
                    {
                    STABLE237=(Token)input.LT(1);
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause4504); if (failed) return retval;
                    if ( backtracking==0 ) stream_STABLE.add(STABLE237);

                    ORDER238=(Token)input.LT(1);
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause4506); if (failed) return retval;
                    if ( backtracking==0 ) stream_ORDER.add(ORDER238);

                    BY239=(Token)input.LT(1);
                    match(input,BY,FOLLOW_BY_in_orderByClause4508); if (failed) return retval;
                    if ( backtracking==0 ) stream_BY.add(BY239);


                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause4511);
            orderSpecList240=orderSpecList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_orderSpecList.add(orderSpecList240.getTree());

            // AST REWRITE
            // elements: orderSpecList, STABLE
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 500:53: -> ^( AST_ORDERBYCLAUSE ( STABLE )? orderSpecList )
            {
                // etc/XQFT.g:500:56: ^( AST_ORDERBYCLAUSE ( STABLE )? orderSpecList )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_ORDERBYCLAUSE, "AST_ORDERBYCLAUSE"), root_1);

                // etc/XQFT.g:500:76: ( STABLE )?
                if ( stream_STABLE.hasNext() ) {
                    adaptor.addChild(root_1, stream_STABLE.next());

                }
                stream_STABLE.reset();
                adaptor.addChild(root_1, stream_orderSpecList.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end orderByClause

    public static class orderSpecList_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orderSpecList
    // etc/XQFT.g:502:4: orderSpecList : orderSpec ( COMMASi orderSpec )* -> ( orderSpec )+ ;
    public final orderSpecList_return orderSpecList() throws RecognitionException {
        orderSpecList_return retval = new orderSpecList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COMMASi242=null;
        orderSpec_return orderSpec241 = null;

        orderSpec_return orderSpec243 = null;


        XQFTTree COMMASi242_tree=null;
        RewriteRuleTokenStream stream_COMMASi=new RewriteRuleTokenStream(adaptor,"token COMMASi");
        RewriteRuleSubtreeStream stream_orderSpec=new RewriteRuleSubtreeStream(adaptor,"rule orderSpec");
        try {
            // etc/XQFT.g:502:34: ( orderSpec ( COMMASi orderSpec )* -> ( orderSpec )+ )
            // etc/XQFT.g:502:36: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList4601);
            orderSpec241=orderSpec();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_orderSpec.add(orderSpec241.getTree());
            // etc/XQFT.g:502:46: ( COMMASi orderSpec )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMASi) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // etc/XQFT.g:502:47: COMMASi orderSpec
            	    {
            	    COMMASi242=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList4604); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi242);

            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList4606);
            	    orderSpec243=orderSpec();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_orderSpec.add(orderSpec243.getTree());

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            // AST REWRITE
            // elements: orderSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 503:53: -> ( orderSpec )+
            {
                if ( !(stream_orderSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_orderSpec.hasNext() ) {
                    adaptor.addChild(root_0, stream_orderSpec.next());

                }
                stream_orderSpec.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end orderSpecList

    public static class orderSpec_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orderSpec
    // etc/XQFT.g:505:5: orderSpec : exprSingle orderModifier ;
    public final orderSpec_return orderSpec() throws RecognitionException {
        orderSpec_return retval = new orderSpec_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        exprSingle_return exprSingle244 = null;

        orderModifier_return orderModifier245 = null;



        try {
            // etc/XQFT.g:505:35: ( exprSingle orderModifier )
            // etc/XQFT.g:505:37: exprSingle orderModifier
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_exprSingle_in_orderSpec4697);
            exprSingle244=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exprSingle244.getTree());
            pushFollow(FOLLOW_orderModifier_in_orderSpec4699);
            orderModifier245=orderModifier();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orderModifier245.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end orderSpec

    public static class orderModifier_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orderModifier
    // etc/XQFT.g:507:6: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final orderModifier_return orderModifier() throws RecognitionException {
        orderModifier_return retval = new orderModifier_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set246=null;
        Token EMPTY247=null;
        Token set248=null;
        Token COLLATION249=null;
        uriLiteral_return uriLiteral250 = null;


        XQFTTree set246_tree=null;
        XQFTTree EMPTY247_tree=null;
        XQFTTree set248_tree=null;
        XQFTTree COLLATION249_tree=null;

        try {
            // etc/XQFT.g:507:36: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:507:38: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:507:38: ( ASCENDING | DESCENDING )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==ASCENDING||LA52_0==DESCENDING) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // etc/XQFT.g:
                    {
                    set246=(Token)input.LT(1);
                    if ( input.LA(1)==ASCENDING||input.LA(1)==DESCENDING ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set246));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier4728);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:507:64: ( EMPTY ( GREATEST | LEAST ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EMPTY) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // etc/XQFT.g:507:65: EMPTY ( GREATEST | LEAST )
                    {
                    EMPTY247=(Token)input.LT(1);
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier4738); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EMPTY247_tree = (XQFTTree)adaptor.create(EMPTY247);
                    adaptor.addChild(root_0, EMPTY247_tree);
                    }
                    set248=(Token)input.LT(1);
                    if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set248));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier4740);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:507:92: ( COLLATION uriLiteral )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COLLATION) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // etc/XQFT.g:507:93: COLLATION uriLiteral
                    {
                    COLLATION249=(Token)input.LT(1);
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier4751); if (failed) return retval;
                    if ( backtracking==0 ) {
                    COLLATION249_tree = (XQFTTree)adaptor.create(COLLATION249);
                    adaptor.addChild(root_0, COLLATION249_tree);
                    }
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier4753);
                    uriLiteral250=uriLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral250.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end orderModifier

    public static class quantifiedExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start quantifiedExpr
    // etc/XQFT.g:513:2: quantifiedExpr : quant= ( SOME | EVERY ) quantifiedExprTupleDef ( COMMASi quantifiedExprTupleDef )* SATISFIES exprSingle -> ^( AST_QUANTIFIEDEXPR $quant ( quantifiedExprTupleDef )+ exprSingle ) ;
    public final quantifiedExpr_return quantifiedExpr() throws RecognitionException {
        quantifiedExpr_return retval = new quantifiedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token quant=null;
        Token SOME251=null;
        Token EVERY252=null;
        Token COMMASi254=null;
        Token SATISFIES256=null;
        quantifiedExprTupleDef_return quantifiedExprTupleDef253 = null;

        quantifiedExprTupleDef_return quantifiedExprTupleDef255 = null;

        exprSingle_return exprSingle257 = null;


        XQFTTree quant_tree=null;
        XQFTTree SOME251_tree=null;
        XQFTTree EVERY252_tree=null;
        XQFTTree COMMASi254_tree=null;
        XQFTTree SATISFIES256_tree=null;
        RewriteRuleTokenStream stream_SOME=new RewriteRuleTokenStream(adaptor,"token SOME");
        RewriteRuleTokenStream stream_SATISFIES=new RewriteRuleTokenStream(adaptor,"token SATISFIES");
        RewriteRuleTokenStream stream_COMMASi=new RewriteRuleTokenStream(adaptor,"token COMMASi");
        RewriteRuleTokenStream stream_EVERY=new RewriteRuleTokenStream(adaptor,"token EVERY");
        RewriteRuleSubtreeStream stream_quantifiedExprTupleDef=new RewriteRuleSubtreeStream(adaptor,"rule quantifiedExprTupleDef");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:513:33: (quant= ( SOME | EVERY ) quantifiedExprTupleDef ( COMMASi quantifiedExprTupleDef )* SATISFIES exprSingle -> ^( AST_QUANTIFIEDEXPR $quant ( quantifiedExprTupleDef )+ exprSingle ) )
            // etc/XQFT.g:513:35: quant= ( SOME | EVERY ) quantifiedExprTupleDef ( COMMASi quantifiedExprTupleDef )* SATISFIES exprSingle
            {
            // etc/XQFT.g:513:41: ( SOME | EVERY )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==SOME) ) {
                alt55=1;
            }
            else if ( (LA55_0==EVERY) ) {
                alt55=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("513:41: ( SOME | EVERY )", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // etc/XQFT.g:513:42: SOME
                    {
                    SOME251=(Token)input.LT(1);
                    match(input,SOME,FOLLOW_SOME_in_quantifiedExpr4791); if (failed) return retval;
                    if ( backtracking==0 ) stream_SOME.add(SOME251);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:513:49: EVERY
                    {
                    EVERY252=(Token)input.LT(1);
                    match(input,EVERY,FOLLOW_EVERY_in_quantifiedExpr4795); if (failed) return retval;
                    if ( backtracking==0 ) stream_EVERY.add(EVERY252);


                    }
                    break;

            }

            pushFollow(FOLLOW_quantifiedExprTupleDef_in_quantifiedExpr4798);
            quantifiedExprTupleDef253=quantifiedExprTupleDef();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_quantifiedExprTupleDef.add(quantifiedExprTupleDef253.getTree());
            // etc/XQFT.g:514:13: ( COMMASi quantifiedExprTupleDef )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMASi) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // etc/XQFT.g:514:14: COMMASi quantifiedExprTupleDef
            	    {
            	    COMMASi254=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr4813); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi254);

            	    pushFollow(FOLLOW_quantifiedExprTupleDef_in_quantifiedExpr4815);
            	    quantifiedExprTupleDef255=quantifiedExprTupleDef();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_quantifiedExprTupleDef.add(quantifiedExprTupleDef255.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            SATISFIES256=(Token)input.LT(1);
            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr4819); if (failed) return retval;
            if ( backtracking==0 ) stream_SATISFIES.add(SATISFIES256);

            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr4821);
            exprSingle257=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle257.getTree());

            // AST REWRITE
            // elements: quantifiedExprTupleDef, quant, exprSingle
            // token labels: quant
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_quant=new RewriteRuleTokenStream(adaptor,"token quant",quant);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 515:49: -> ^( AST_QUANTIFIEDEXPR $quant ( quantifiedExprTupleDef )+ exprSingle )
            {
                // etc/XQFT.g:515:52: ^( AST_QUANTIFIEDEXPR $quant ( quantifiedExprTupleDef )+ exprSingle )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_QUANTIFIEDEXPR, "AST_QUANTIFIEDEXPR"), root_1);

                adaptor.addChild(root_1, stream_quant.next());
                if ( !(stream_quantifiedExprTupleDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_quantifiedExprTupleDef.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifiedExprTupleDef.next());

                }
                stream_quantifiedExprTupleDef.reset();
                adaptor.addChild(root_1, stream_exprSingle.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end quantifiedExpr

    public static class quantifiedExprTupleDef_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start quantifiedExprTupleDef
    // etc/XQFT.g:517:9: quantifiedExprTupleDef : DOLLARSi varName ( typeDeclaration )? IN exprSingle -> varName ( typeDeclaration )? exprSingle ;
    public final quantifiedExprTupleDef_return quantifiedExprTupleDef() throws RecognitionException {
        quantifiedExprTupleDef_return retval = new quantifiedExprTupleDef_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOLLARSi258=null;
        Token IN261=null;
        varName_return varName259 = null;

        typeDeclaration_return typeDeclaration260 = null;

        exprSingle_return exprSingle262 = null;


        XQFTTree DOLLARSi258_tree=null;
        XQFTTree IN261_tree=null;
        RewriteRuleTokenStream stream_DOLLARSi=new RewriteRuleTokenStream(adaptor,"token DOLLARSi");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleSubtreeStream stream_varName=new RewriteRuleSubtreeStream(adaptor,"rule varName");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        try {
            // etc/XQFT.g:517:45: ( DOLLARSi varName ( typeDeclaration )? IN exprSingle -> varName ( typeDeclaration )? exprSingle )
            // etc/XQFT.g:517:47: DOLLARSi varName ( typeDeclaration )? IN exprSingle
            {
            DOLLARSi258=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExprTupleDef4912); if (failed) return retval;
            if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi258);

            pushFollow(FOLLOW_varName_in_quantifiedExprTupleDef4914);
            varName259=varName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_varName.add(varName259.getTree());
            // etc/XQFT.g:517:64: ( typeDeclaration )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==AS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // etc/XQFT.g:517:64: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExprTupleDef4916);
                    typeDeclaration260=typeDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeDeclaration.add(typeDeclaration260.getTree());

                    }
                    break;

            }

            IN261=(Token)input.LT(1);
            match(input,IN,FOLLOW_IN_in_quantifiedExprTupleDef4919); if (failed) return retval;
            if ( backtracking==0 ) stream_IN.add(IN261);

            pushFollow(FOLLOW_exprSingle_in_quantifiedExprTupleDef4921);
            exprSingle262=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle262.getTree());

            // AST REWRITE
            // elements: typeDeclaration, exprSingle, varName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 518:49: -> varName ( typeDeclaration )? exprSingle
            {
                adaptor.addChild(root_0, stream_varName.next());
                // etc/XQFT.g:518:60: ( typeDeclaration )?
                if ( stream_typeDeclaration.hasNext() ) {
                    adaptor.addChild(root_0, stream_typeDeclaration.next());

                }
                stream_typeDeclaration.reset();
                adaptor.addChild(root_0, stream_exprSingle.next());

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end quantifiedExprTupleDef

    public static class typeswitchExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typeswitchExpr
    // etc/XQFT.g:522:2: typeswitchExpr : TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle -> ^( AST_TYPESWITCHEXPR expr ( caseClause )+ ( varName )? exprSingle ) ;
    public final typeswitchExpr_return typeswitchExpr() throws RecognitionException {
        typeswitchExpr_return retval = new typeswitchExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TYPESWITCH263=null;
        Token LPARSi264=null;
        Token RPARSi266=null;
        Token DEFAULT268=null;
        Token DOLLARSi269=null;
        Token RETURN271=null;
        expr_return expr265 = null;

        caseClause_return caseClause267 = null;

        varName_return varName270 = null;

        exprSingle_return exprSingle272 = null;


        XQFTTree TYPESWITCH263_tree=null;
        XQFTTree LPARSi264_tree=null;
        XQFTTree RPARSi266_tree=null;
        XQFTTree DEFAULT268_tree=null;
        XQFTTree DOLLARSi269_tree=null;
        XQFTTree RETURN271_tree=null;
        RewriteRuleTokenStream stream_DOLLARSi=new RewriteRuleTokenStream(adaptor,"token DOLLARSi");
        RewriteRuleTokenStream stream_DEFAULT=new RewriteRuleTokenStream(adaptor,"token DEFAULT");
        RewriteRuleTokenStream stream_RPARSi=new RewriteRuleTokenStream(adaptor,"token RPARSi");
        RewriteRuleTokenStream stream_LPARSi=new RewriteRuleTokenStream(adaptor,"token LPARSi");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleTokenStream stream_TYPESWITCH=new RewriteRuleTokenStream(adaptor,"token TYPESWITCH");
        RewriteRuleSubtreeStream stream_caseClause=new RewriteRuleSubtreeStream(adaptor,"rule caseClause");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_varName=new RewriteRuleSubtreeStream(adaptor,"rule varName");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:522:33: ( TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle -> ^( AST_TYPESWITCHEXPR expr ( caseClause )+ ( varName )? exprSingle ) )
            // etc/XQFT.g:522:35: TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            TYPESWITCH263=(Token)input.LT(1);
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr5007); if (failed) return retval;
            if ( backtracking==0 ) stream_TYPESWITCH.add(TYPESWITCH263);

            LPARSi264=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_typeswitchExpr5009); if (failed) return retval;
            if ( backtracking==0 ) stream_LPARSi.add(LPARSi264);

            pushFollow(FOLLOW_expr_in_typeswitchExpr5011);
            expr265=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expr.add(expr265.getTree());
            RPARSi266=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_typeswitchExpr5013); if (failed) return retval;
            if ( backtracking==0 ) stream_RPARSi.add(RPARSi266);

            // etc/XQFT.g:522:65: ( caseClause )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==CASE) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // etc/XQFT.g:522:65: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr5015);
            	    caseClause267=caseClause();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_caseClause.add(caseClause267.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);

            DEFAULT268=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr5031); if (failed) return retval;
            if ( backtracking==0 ) stream_DEFAULT.add(DEFAULT268);

            // etc/XQFT.g:523:21: ( DOLLARSi varName )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==DOLLARSi) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // etc/XQFT.g:523:22: DOLLARSi varName
                    {
                    DOLLARSi269=(Token)input.LT(1);
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr5034); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi269);

                    pushFollow(FOLLOW_varName_in_typeswitchExpr5036);
                    varName270=varName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_varName.add(varName270.getTree());

                    }
                    break;

            }

            RETURN271=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr5040); if (failed) return retval;
            if ( backtracking==0 ) stream_RETURN.add(RETURN271);

            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr5042);
            exprSingle272=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle272.getTree());

            // AST REWRITE
            // elements: expr, exprSingle, caseClause, varName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 524:49: -> ^( AST_TYPESWITCHEXPR expr ( caseClause )+ ( varName )? exprSingle )
            {
                // etc/XQFT.g:524:52: ^( AST_TYPESWITCHEXPR expr ( caseClause )+ ( varName )? exprSingle )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_TYPESWITCHEXPR, "AST_TYPESWITCHEXPR"), root_1);

                adaptor.addChild(root_1, stream_expr.next());
                if ( !(stream_caseClause.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_caseClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_caseClause.next());

                }
                stream_caseClause.reset();
                // etc/XQFT.g:524:90: ( varName )?
                if ( stream_varName.hasNext() ) {
                    adaptor.addChild(root_1, stream_varName.next());

                }
                stream_varName.reset();
                adaptor.addChild(root_1, stream_exprSingle.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end typeswitchExpr

    public static class caseClause_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start caseClause
    // etc/XQFT.g:528:3: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle -> ^( AST_CASECLAUSE ( varName )? sequenceType exprSingle ) ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CASE273=null;
        Token DOLLARSi274=null;
        Token AS276=null;
        Token RETURN278=null;
        varName_return varName275 = null;

        sequenceType_return sequenceType277 = null;

        exprSingle_return exprSingle279 = null;


        XQFTTree CASE273_tree=null;
        XQFTTree DOLLARSi274_tree=null;
        XQFTTree AS276_tree=null;
        XQFTTree RETURN278_tree=null;
        RewriteRuleTokenStream stream_DOLLARSi=new RewriteRuleTokenStream(adaptor,"token DOLLARSi");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_varName=new RewriteRuleSubtreeStream(adaptor,"rule varName");
        RewriteRuleSubtreeStream stream_sequenceType=new RewriteRuleSubtreeStream(adaptor,"rule sequenceType");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:528:35: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle -> ^( AST_CASECLAUSE ( varName )? sequenceType exprSingle ) )
            // etc/XQFT.g:528:37: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            CASE273=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause5139); if (failed) return retval;
            if ( backtracking==0 ) stream_CASE.add(CASE273);

            // etc/XQFT.g:528:42: ( DOLLARSi varName AS )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==DOLLARSi) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // etc/XQFT.g:528:43: DOLLARSi varName AS
                    {
                    DOLLARSi274=(Token)input.LT(1);
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause5142); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi274);

                    pushFollow(FOLLOW_varName_in_caseClause5144);
                    varName275=varName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_varName.add(varName275.getTree());
                    AS276=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_caseClause5146); if (failed) return retval;
                    if ( backtracking==0 ) stream_AS.add(AS276);


                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause5150);
            sequenceType277=sequenceType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_sequenceType.add(sequenceType277.getTree());
            RETURN278=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_caseClause5152); if (failed) return retval;
            if ( backtracking==0 ) stream_RETURN.add(RETURN278);

            pushFollow(FOLLOW_exprSingle_in_caseClause5154);
            exprSingle279=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle279.getTree());

            // AST REWRITE
            // elements: sequenceType, varName, exprSingle
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 529:53: -> ^( AST_CASECLAUSE ( varName )? sequenceType exprSingle )
            {
                // etc/XQFT.g:529:56: ^( AST_CASECLAUSE ( varName )? sequenceType exprSingle )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_CASECLAUSE, "AST_CASECLAUSE"), root_1);

                // etc/XQFT.g:529:73: ( varName )?
                if ( stream_varName.hasNext() ) {
                    adaptor.addChild(root_1, stream_varName.next());

                }
                stream_varName.reset();
                adaptor.addChild(root_1, stream_sequenceType.next());
                adaptor.addChild(root_1, stream_exprSingle.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end caseClause

    public static class ifExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ifExpr
    // etc/XQFT.g:537:2: ifExpr : IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle -> ^( AST_IFEXPR expr exprSingle exprSingle ) ;
    public final ifExpr_return ifExpr() throws RecognitionException {
        ifExpr_return retval = new ifExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token IF280=null;
        Token LPARSi281=null;
        Token RPARSi283=null;
        Token THEN284=null;
        Token ELSE286=null;
        expr_return expr282 = null;

        exprSingle_return exprSingle285 = null;

        exprSingle_return exprSingle287 = null;


        XQFTTree IF280_tree=null;
        XQFTTree LPARSi281_tree=null;
        XQFTTree RPARSi283_tree=null;
        XQFTTree THEN284_tree=null;
        XQFTTree ELSE286_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_RPARSi=new RewriteRuleTokenStream(adaptor,"token RPARSi");
        RewriteRuleTokenStream stream_LPARSi=new RewriteRuleTokenStream(adaptor,"token LPARSi");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:537:33: ( IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle -> ^( AST_IFEXPR expr exprSingle exprSingle ) )
            // etc/XQFT.g:537:35: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
            {
            IF280=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifExpr5260); if (failed) return retval;
            if ( backtracking==0 ) stream_IF.add(IF280);

            LPARSi281=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_ifExpr5262); if (failed) return retval;
            if ( backtracking==0 ) stream_LPARSi.add(LPARSi281);

            pushFollow(FOLLOW_expr_in_ifExpr5264);
            expr282=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expr.add(expr282.getTree());
            RPARSi283=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_ifExpr5266); if (failed) return retval;
            if ( backtracking==0 ) stream_RPARSi.add(RPARSi283);

            THEN284=(Token)input.LT(1);
            match(input,THEN,FOLLOW_THEN_in_ifExpr5268); if (failed) return retval;
            if ( backtracking==0 ) stream_THEN.add(THEN284);

            pushFollow(FOLLOW_exprSingle_in_ifExpr5270);
            exprSingle285=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle285.getTree());
            ELSE286=(Token)input.LT(1);
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr5272); if (failed) return retval;
            if ( backtracking==0 ) stream_ELSE.add(ELSE286);

            pushFollow(FOLLOW_exprSingle_in_ifExpr5274);
            exprSingle287=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle287.getTree());

            // AST REWRITE
            // elements: expr, exprSingle, exprSingle
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 538:49: -> ^( AST_IFEXPR expr exprSingle exprSingle )
            {
                // etc/XQFT.g:538:52: ^( AST_IFEXPR expr exprSingle exprSingle )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_IFEXPR, "AST_IFEXPR"), root_1);

                adaptor.addChild(root_1, stream_expr.next());
                adaptor.addChild(root_1, stream_exprSingle.next());
                adaptor.addChild(root_1, stream_exprSingle.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ifExpr

    public static class orExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orExpr
    // etc/XQFT.g:545:2: orExpr : andExpr ( OR andExpr )* ;
    public final orExpr_return orExpr() throws RecognitionException {
        orExpr_return retval = new orExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token OR289=null;
        andExpr_return andExpr288 = null;

        andExpr_return andExpr290 = null;


        XQFTTree OR289_tree=null;

        try {
            // etc/XQFT.g:545:33: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:545:35: andExpr ( OR andExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_andExpr_in_orExpr5376);
            andExpr288=andExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, andExpr288.getTree());
            // etc/XQFT.g:545:43: ( OR andExpr )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==OR) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // etc/XQFT.g:545:45: OR andExpr
            	    {
            	    OR289=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_orExpr5380); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    OR289_tree = (XQFTTree)adaptor.create(OR289);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(OR289_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andExpr_in_orExpr5383);
            	    andExpr290=andExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, andExpr290.getTree());

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end orExpr

    public static class andExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andExpr
    // etc/XQFT.g:546:3: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final andExpr_return andExpr() throws RecognitionException {
        andExpr_return retval = new andExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AND292=null;
        comparisonExpr_return comparisonExpr291 = null;

        comparisonExpr_return comparisonExpr293 = null;


        XQFTTree AND292_tree=null;

        try {
            // etc/XQFT.g:546:34: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:546:36: comparisonExpr ( AND comparisonExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_comparisonExpr_in_andExpr5418);
            comparisonExpr291=comparisonExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, comparisonExpr291.getTree());
            // etc/XQFT.g:546:51: ( AND comparisonExpr )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==AND) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // etc/XQFT.g:546:53: AND comparisonExpr
            	    {
            	    AND292=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_andExpr5422); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    AND292_tree = (XQFTTree)adaptor.create(AND292);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(AND292_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr5425);
            	    comparisonExpr293=comparisonExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, comparisonExpr293.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end andExpr

    public static class comparisonExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start comparisonExpr
    // etc/XQFT.g:552:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final comparisonExpr_return comparisonExpr() throws RecognitionException {
        comparisonExpr_return retval = new comparisonExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftContainsExpr_return ftContainsExpr294 = null;

        valueComp_return valueComp295 = null;

        generalComp_return generalComp296 = null;

        nodeComp_return nodeComp297 = null;

        ftContainsExpr_return ftContainsExpr298 = null;



        try {
            // etc/XQFT.g:552:32: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:552:34: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr5459);
            ftContainsExpr294=ftContainsExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftContainsExpr294.getTree());
            // etc/XQFT.g:552:49: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==EQ||LA64_0==GE||LA64_0==GT||LA64_0==IS||LA64_0==LE||LA64_0==LT||LA64_0==NE||LA64_0==EQSi||(LA64_0>=NEQSi && LA64_0<=NODEAFTERSi)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // etc/XQFT.g:552:51: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:552:51: ( valueComp | generalComp | nodeComp )
                    int alt63=3;
                    switch ( input.LA(1) ) {
                    case EQ:
                    case GE:
                    case GT:
                    case LE:
                    case LT:
                    case NE:
                        {
                        alt63=1;
                        }
                        break;
                    case EQSi:
                    case NEQSi:
                    case LTSi:
                    case LTOREQSi:
                    case GTSi:
                    case GTOREQSi:
                        {
                        alt63=2;
                        }
                        break;
                    case IS:
                    case NODEBEFORESi:
                    case NODEAFTERSi:
                        {
                        alt63=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("552:51: ( valueComp | generalComp | nodeComp )", 63, 0, input);

                        throw nvae;
                    }

                    switch (alt63) {
                        case 1 :
                            // etc/XQFT.g:552:52: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr5464);
                            valueComp295=valueComp();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(valueComp295.getTree(), root_0);

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:552:65: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr5469);
                            generalComp296=generalComp();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(generalComp296.getTree(), root_0);

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:552:80: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr5474);
                            nodeComp297=nodeComp();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(nodeComp297.getTree(), root_0);

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr5478);
                    ftContainsExpr298=ftContainsExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftContainsExpr298.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end comparisonExpr

    public static class ftContainsExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftContainsExpr
    // etc/XQFT.g:553:2: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final ftContainsExpr_return ftContainsExpr() throws RecognitionException {
        ftContainsExpr_return retval = new ftContainsExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTCONTAINS300=null;
        rangeExpr_return rangeExpr299 = null;

        ftSelection_return ftSelection301 = null;

        ftIgnoreOption_return ftIgnoreOption302 = null;


        XQFTTree FTCONTAINS300_tree=null;

        try {
            // etc/XQFT.g:553:33: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:553:35: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr5505);
            rangeExpr299=rangeExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpr299.getTree());
            // etc/XQFT.g:553:45: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==FTCONTAINS) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // etc/XQFT.g:553:47: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    FTCONTAINS300=(Token)input.LT(1);
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr5509); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FTCONTAINS300_tree = (XQFTTree)adaptor.create(FTCONTAINS300);
                    root_0 = (XQFTTree)adaptor.becomeRoot(FTCONTAINS300_tree, root_0);
                    }
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr5512);
                    ftSelection301=ftSelection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftSelection301.getTree());
                    // etc/XQFT.g:553:71: ( ftIgnoreOption )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==WITHOUT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // etc/XQFT.g:553:71: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr5514);
                            ftIgnoreOption302=ftIgnoreOption();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftIgnoreOption302.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftContainsExpr

    public static class rangeExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rangeExpr
    // etc/XQFT.g:554:3: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final rangeExpr_return rangeExpr() throws RecognitionException {
        rangeExpr_return retval = new rangeExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TO304=null;
        additiveExpr_return additiveExpr303 = null;

        additiveExpr_return additiveExpr305 = null;


        XQFTTree TO304_tree=null;

        try {
            // etc/XQFT.g:554:34: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:554:36: additiveExpr ( TO additiveExpr )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpr_in_rangeExpr5549);
            additiveExpr303=additiveExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr303.getTree());
            // etc/XQFT.g:554:49: ( TO additiveExpr )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==TO) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // etc/XQFT.g:554:51: TO additiveExpr
                    {
                    TO304=(Token)input.LT(1);
                    match(input,TO,FOLLOW_TO_in_rangeExpr5553); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TO304_tree = (XQFTTree)adaptor.create(TO304);
                    root_0 = (XQFTTree)adaptor.becomeRoot(TO304_tree, root_0);
                    }
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr5556);
                    additiveExpr305=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr305.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end rangeExpr

    public static class additiveExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start additiveExpr
    // etc/XQFT.g:555:4: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final additiveExpr_return additiveExpr() throws RecognitionException {
        additiveExpr_return retval = new additiveExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set307=null;
        multiplicativeExpr_return multiplicativeExpr306 = null;

        multiplicativeExpr_return multiplicativeExpr308 = null;


        XQFTTree set307_tree=null;

        try {
            // etc/XQFT.g:555:35: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:555:37: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr5587);
            multiplicativeExpr306=multiplicativeExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr306.getTree());
            // etc/XQFT.g:555:56: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=PLUSSi && LA68_0<=MINUSSi)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // etc/XQFT.g:555:58: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    set307=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUSSi && input.LA(1)<=MINUSSi) ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(adaptor.create(set307), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr5591);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr5600);
            	    multiplicativeExpr308=multiplicativeExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr308.getTree());

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end additiveExpr

    public static class multiplicativeExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start multiplicativeExpr
    // etc/XQFT.g:556:5: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final multiplicativeExpr_return multiplicativeExpr() throws RecognitionException {
        multiplicativeExpr_return retval = new multiplicativeExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set310=null;
        unionExpr_return unionExpr309 = null;

        unionExpr_return unionExpr311 = null;


        XQFTTree set310_tree=null;

        try {
            // etc/XQFT.g:556:36: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:556:38: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr5626);
            unionExpr309=unionExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unionExpr309.getTree());
            // etc/XQFT.g:556:48: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==DIV||LA69_0==IDIV||LA69_0==MOD||LA69_0==STARSi) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // etc/XQFT.g:556:50: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    set310=(Token)input.LT(1);
            	    if ( input.LA(1)==DIV||input.LA(1)==IDIV||input.LA(1)==MOD||input.LA(1)==STARSi ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(adaptor.create(set310), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr5630);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr5647);
            	    unionExpr311=unionExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, unionExpr311.getTree());

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end multiplicativeExpr

    public static class unionExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unionExpr
    // etc/XQFT.g:557:6: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final unionExpr_return unionExpr() throws RecognitionException {
        unionExpr_return retval = new unionExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set313=null;
        intersectExceptExpr_return intersectExceptExpr312 = null;

        intersectExceptExpr_return intersectExceptExpr314 = null;


        XQFTTree set313_tree=null;

        try {
            // etc/XQFT.g:557:37: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:557:39: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr5683);
            intersectExceptExpr312=intersectExceptExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, intersectExceptExpr312.getTree());
            // etc/XQFT.g:557:59: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==UNION||LA70_0==PIPESi) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // etc/XQFT.g:557:61: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    set313=(Token)input.LT(1);
            	    if ( input.LA(1)==UNION||input.LA(1)==PIPESi ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(adaptor.create(set313), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr5687);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr5696);
            	    intersectExceptExpr314=intersectExceptExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, intersectExceptExpr314.getTree());

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end unionExpr

    public static class intersectExceptExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start intersectExceptExpr
    // etc/XQFT.g:558:7: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final intersectExceptExpr_return intersectExceptExpr() throws RecognitionException {
        intersectExceptExpr_return retval = new intersectExceptExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set316=null;
        instanceofExpr_return instanceofExpr315 = null;

        instanceofExpr_return instanceofExpr317 = null;


        XQFTTree set316_tree=null;

        try {
            // etc/XQFT.g:558:38: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:558:40: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr5723);
            instanceofExpr315=instanceofExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, instanceofExpr315.getTree());
            // etc/XQFT.g:558:55: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==EXCEPT||LA71_0==INTERSECT) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // etc/XQFT.g:558:57: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    set316=(Token)input.LT(1);
            	    if ( input.LA(1)==EXCEPT||input.LA(1)==INTERSECT ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(adaptor.create(set316), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr5727);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr5736);
            	    instanceofExpr317=instanceofExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, instanceofExpr317.getTree());

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end intersectExceptExpr

    public static class instanceofExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start instanceofExpr
    // etc/XQFT.g:559:8: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final instanceofExpr_return instanceofExpr() throws RecognitionException {
        instanceofExpr_return retval = new instanceofExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token INSTANCE319=null;
        Token OF320=null;
        treatExpr_return treatExpr318 = null;

        sequenceType_return sequenceType321 = null;


        XQFTTree INSTANCE319_tree=null;
        XQFTTree OF320_tree=null;

        try {
            // etc/XQFT.g:559:39: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:559:41: treatExpr ( INSTANCE OF sequenceType )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_treatExpr_in_instanceofExpr5769);
            treatExpr318=treatExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, treatExpr318.getTree());
            // etc/XQFT.g:559:51: ( INSTANCE OF sequenceType )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==INSTANCE) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // etc/XQFT.g:559:53: INSTANCE OF sequenceType
                    {
                    INSTANCE319=(Token)input.LT(1);
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr5773); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INSTANCE319_tree = (XQFTTree)adaptor.create(INSTANCE319);
                    root_0 = (XQFTTree)adaptor.becomeRoot(INSTANCE319_tree, root_0);
                    }
                    OF320=(Token)input.LT(1);
                    match(input,OF,FOLLOW_OF_in_instanceofExpr5776); if (failed) return retval;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr5779);
                    sequenceType321=sequenceType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, sequenceType321.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end instanceofExpr

    public static class treatExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start treatExpr
    // etc/XQFT.g:560:9: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final treatExpr_return treatExpr() throws RecognitionException {
        treatExpr_return retval = new treatExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TREAT323=null;
        Token AS324=null;
        castableExpr_return castableExpr322 = null;

        sequenceType_return sequenceType325 = null;


        XQFTTree TREAT323_tree=null;
        XQFTTree AS324_tree=null;

        try {
            // etc/XQFT.g:560:40: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:560:42: castableExpr ( TREAT AS sequenceType )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_castableExpr_in_treatExpr5818);
            castableExpr322=castableExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, castableExpr322.getTree());
            // etc/XQFT.g:560:55: ( TREAT AS sequenceType )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==TREAT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // etc/XQFT.g:560:57: TREAT AS sequenceType
                    {
                    TREAT323=(Token)input.LT(1);
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr5822); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TREAT323_tree = (XQFTTree)adaptor.create(TREAT323);
                    root_0 = (XQFTTree)adaptor.becomeRoot(TREAT323_tree, root_0);
                    }
                    AS324=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_treatExpr5825); if (failed) return retval;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr5828);
                    sequenceType325=sequenceType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, sequenceType325.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end treatExpr

    public static class castableExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start castableExpr
    // etc/XQFT.g:561:10: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final castableExpr_return castableExpr() throws RecognitionException {
        castableExpr_return retval = new castableExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CASTABLE327=null;
        Token AS328=null;
        castExpr_return castExpr326 = null;

        singleType_return singleType329 = null;


        XQFTTree CASTABLE327_tree=null;
        XQFTTree AS328_tree=null;

        try {
            // etc/XQFT.g:561:41: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:561:43: castExpr ( CASTABLE AS singleType )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_castExpr_in_castableExpr5865);
            castExpr326=castExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, castExpr326.getTree());
            // etc/XQFT.g:561:52: ( CASTABLE AS singleType )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==CASTABLE) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // etc/XQFT.g:561:54: CASTABLE AS singleType
                    {
                    CASTABLE327=(Token)input.LT(1);
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr5869); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CASTABLE327_tree = (XQFTTree)adaptor.create(CASTABLE327);
                    root_0 = (XQFTTree)adaptor.becomeRoot(CASTABLE327_tree, root_0);
                    }
                    AS328=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_castableExpr5872); if (failed) return retval;
                    pushFollow(FOLLOW_singleType_in_castableExpr5875);
                    singleType329=singleType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleType329.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end castableExpr

    public static class castExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start castExpr
    // etc/XQFT.g:562:11: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final castExpr_return castExpr() throws RecognitionException {
        castExpr_return retval = new castExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CAST331=null;
        Token AS332=null;
        unaryExpr_return unaryExpr330 = null;

        singleType_return singleType333 = null;


        XQFTTree CAST331_tree=null;
        XQFTTree AS332_tree=null;

        try {
            // etc/XQFT.g:562:42: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:562:44: unaryExpr ( CAST AS singleType )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpr_in_castExpr5917);
            unaryExpr330=unaryExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unaryExpr330.getTree());
            // etc/XQFT.g:562:54: ( CAST AS singleType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==CAST) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // etc/XQFT.g:562:56: CAST AS singleType
                    {
                    CAST331=(Token)input.LT(1);
                    match(input,CAST,FOLLOW_CAST_in_castExpr5921); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CAST331_tree = (XQFTTree)adaptor.create(CAST331);
                    root_0 = (XQFTTree)adaptor.becomeRoot(CAST331_tree, root_0);
                    }
                    AS332=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_castExpr5924); if (failed) return retval;
                    pushFollow(FOLLOW_singleType_in_castExpr5927);
                    singleType333=singleType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleType333.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end castExpr

    public static class unaryExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unaryExpr
    // etc/XQFT.g:563:12: unaryExpr : ( ( MINUSSi | PLUSSi )* ) valueExpr ;
    public final unaryExpr_return unaryExpr() throws RecognitionException {
        unaryExpr_return retval = new unaryExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set334=null;
        valueExpr_return valueExpr335 = null;


        XQFTTree set334_tree=null;

        try {
            // etc/XQFT.g:563:43: ( ( ( MINUSSi | PLUSSi )* ) valueExpr )
            // etc/XQFT.g:563:45: ( ( MINUSSi | PLUSSi )* ) valueExpr
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:563:45: ( ( MINUSSi | PLUSSi )* )
            // etc/XQFT.g:563:46: ( MINUSSi | PLUSSi )*
            {
            // etc/XQFT.g:563:46: ( MINUSSi | PLUSSi )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( ((LA76_0>=PLUSSi && LA76_0<=MINUSSi)) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // etc/XQFT.g:
            	    {
            	    set334=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUSSi && input.LA(1)<=MINUSSi) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set334));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr5970);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

            pushFollow(FOLLOW_valueExpr_in_unaryExpr5981);
            valueExpr335=valueExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, valueExpr335.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end unaryExpr

    public static class singleType_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start singleType
    // etc/XQFT.g:565:12: singleType : atomicType ( QUESTIONSi )? ;
    public final singleType_return singleType() throws RecognitionException {
        singleType_return retval = new singleType_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token QUESTIONSi337=null;
        atomicType_return atomicType336 = null;


        XQFTTree QUESTIONSi337_tree=null;

        try {
            // etc/XQFT.g:565:43: ( atomicType ( QUESTIONSi )? )
            // etc/XQFT.g:565:45: atomicType ( QUESTIONSi )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_atomicType_in_singleType6020);
            atomicType336=atomicType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, atomicType336.getTree());
            // etc/XQFT.g:565:56: ( QUESTIONSi )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==QUESTIONSi) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:565:56: QUESTIONSi
                    {
                    QUESTIONSi337=(Token)input.LT(1);
                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_singleType6022); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTIONSi337_tree = (XQFTTree)adaptor.create(QUESTIONSi337);
                    adaptor.addChild(root_0, QUESTIONSi337_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end singleType

    public static class atomicType_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start atomicType
    // etc/XQFT.g:566:13: atomicType : qName ;
    public final atomicType_return atomicType() throws RecognitionException {
        atomicType_return retval = new atomicType_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qName338 = null;



        try {
            // etc/XQFT.g:566:44: ( qName )
            // etc/XQFT.g:566:46: qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_atomicType6062);
            qName338=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName338.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end atomicType

    public static class ftIgnoreOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftIgnoreOption
    // etc/XQFT.g:574:3: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final ftIgnoreOption_return ftIgnoreOption() throws RecognitionException {
        ftIgnoreOption_return retval = new ftIgnoreOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WITHOUT339=null;
        Token CONTENT340=null;
        unionExpr_return unionExpr341 = null;


        XQFTTree WITHOUT339_tree=null;
        XQFTTree CONTENT340_tree=null;

        try {
            // etc/XQFT.g:574:34: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:574:36: WITHOUT CONTENT unionExpr
            {
            root_0 = (XQFTTree)adaptor.nil();

            WITHOUT339=(Token)input.LT(1);
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption6098); if (failed) return retval;
            if ( backtracking==0 ) {
            WITHOUT339_tree = (XQFTTree)adaptor.create(WITHOUT339);
            root_0 = (XQFTTree)adaptor.becomeRoot(WITHOUT339_tree, root_0);
            }
            CONTENT340=(Token)input.LT(1);
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption6101); if (failed) return retval;
            if ( backtracking==0 ) {
            CONTENT340_tree = (XQFTTree)adaptor.create(CONTENT340);
            adaptor.addChild(root_0, CONTENT340_tree);
            }
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption6103);
            unionExpr341=unionExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unionExpr341.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftIgnoreOption

    public static class valueComp_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start valueComp
    // etc/XQFT.g:578:2: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final valueComp_return valueComp() throws RecognitionException {
        valueComp_return retval = new valueComp_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set342=null;

        XQFTTree set342_tree=null;

        try {
            // etc/XQFT.g:578:33: ( EQ | NE | LT | LE | GT | GE )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set342=(Token)input.LT(1);
            if ( input.LA(1)==EQ||input.LA(1)==GE||input.LA(1)==GT||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set342));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_valueComp0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end valueComp

    public static class generalComp_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start generalComp
    // etc/XQFT.g:581:2: generalComp : ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi );
    public final generalComp_return generalComp() throws RecognitionException {
        generalComp_return retval = new generalComp_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set343=null;

        XQFTTree set343_tree=null;

        try {
            // etc/XQFT.g:581:33: ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set343=(Token)input.LT(1);
            if ( input.LA(1)==EQSi||(input.LA(1)>=NEQSi && input.LA(1)<=GTOREQSi) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set343));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_generalComp0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end generalComp

    public static class nodeComp_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nodeComp
    // etc/XQFT.g:584:2: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final nodeComp_return nodeComp() throws RecognitionException {
        nodeComp_return retval = new nodeComp_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set344=null;

        XQFTTree set344_tree=null;

        try {
            // etc/XQFT.g:584:33: ( IS | NODEBEFORESi | NODEAFTERSi )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set344=(Token)input.LT(1);
            if ( input.LA(1)==IS||(input.LA(1)>=NODEBEFORESi && input.LA(1)<=NODEAFTERSi) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set344));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_nodeComp0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end nodeComp

    public static class ftSelection_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftSelection
    // etc/XQFT.g:588:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final ftSelection_return ftSelection() throws RecognitionException {
        ftSelection_return retval = new ftSelection_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WEIGHT347=null;
        ftOr_return ftOr345 = null;

        ftPosFilter_return ftPosFilter346 = null;

        rangeExpr_return rangeExpr348 = null;


        XQFTTree WEIGHT347_tree=null;

        try {
            // etc/XQFT.g:588:32: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:588:34: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftOr_in_ftSelection6273);
            ftOr345=ftOr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftOr345.getTree());
            // etc/XQFT.g:588:39: ( ftPosFilter )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==AT||(LA78_0>=DIFFERENT && LA78_0<=DISTANCE)||LA78_0==ENTIRE||LA78_0==ORDERED||LA78_0==SAME||LA78_0==WINDOW) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // etc/XQFT.g:588:39: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection6275);
            	    ftPosFilter346=ftPosFilter();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftPosFilter346.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // etc/XQFT.g:588:52: ( WEIGHT rangeExpr )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==WEIGHT) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // etc/XQFT.g:588:53: WEIGHT rangeExpr
                    {
                    WEIGHT347=(Token)input.LT(1);
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection6279); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WEIGHT347_tree = (XQFTTree)adaptor.create(WEIGHT347);
                    adaptor.addChild(root_0, WEIGHT347_tree);
                    }
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection6281);
                    rangeExpr348=rangeExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpr348.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftSelection

    public static class ftOr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftOr
    // etc/XQFT.g:589:2: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final ftOr_return ftOr() throws RecognitionException {
        ftOr_return retval = new ftOr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTOR350=null;
        ftAnd_return ftAnd349 = null;

        ftAnd_return ftAnd351 = null;


        XQFTTree FTOR350_tree=null;

        try {
            // etc/XQFT.g:589:33: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:589:35: ftAnd ( FTOR ftAnd )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftAnd_in_ftOr6317);
            ftAnd349=ftAnd();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftAnd349.getTree());
            // etc/XQFT.g:589:41: ( FTOR ftAnd )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==FTOR) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // etc/XQFT.g:589:43: FTOR ftAnd
            	    {
            	    FTOR350=(Token)input.LT(1);
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr6321); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    FTOR350_tree = (XQFTTree)adaptor.create(FTOR350);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(FTOR350_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ftAnd_in_ftOr6324);
            	    ftAnd351=ftAnd();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftAnd351.getTree());

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftOr

    public static class ftAnd_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftAnd
    // etc/XQFT.g:590:3: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final ftAnd_return ftAnd() throws RecognitionException {
        ftAnd_return retval = new ftAnd_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTAND353=null;
        ftMildNot_return ftMildNot352 = null;

        ftMildNot_return ftMildNot354 = null;


        XQFTTree FTAND353_tree=null;

        try {
            // etc/XQFT.g:590:34: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:590:36: ftMildNot ( FTAND ftMildNot )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftMildNot_in_ftAnd6361);
            ftMildNot352=ftMildNot();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftMildNot352.getTree());
            // etc/XQFT.g:590:46: ( FTAND ftMildNot )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==FTAND) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // etc/XQFT.g:590:48: FTAND ftMildNot
            	    {
            	    FTAND353=(Token)input.LT(1);
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd6365); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    FTAND353_tree = (XQFTTree)adaptor.create(FTAND353);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(FTAND353_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd6368);
            	    ftMildNot354=ftMildNot();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftMildNot354.getTree());

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftAnd

    public static class ftMildNot_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftMildNot
    // etc/XQFT.g:591:4: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final ftMildNot_return ftMildNot() throws RecognitionException {
        ftMildNot_return retval = new ftMildNot_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token NOT356=null;
        Token IN357=null;
        ftUnaryNot_return ftUnaryNot355 = null;

        ftUnaryNot_return ftUnaryNot358 = null;


        XQFTTree NOT356_tree=null;
        XQFTTree IN357_tree=null;

        try {
            // etc/XQFT.g:591:35: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:591:37: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot6402);
            ftUnaryNot355=ftUnaryNot();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftUnaryNot355.getTree());
            // etc/XQFT.g:591:48: ( NOT IN ftUnaryNot )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==NOT) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // etc/XQFT.g:591:50: NOT IN ftUnaryNot
            	    {
            	    NOT356=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot6406); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    NOT356_tree = (XQFTTree)adaptor.create(NOT356);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(NOT356_tree, root_0);
            	    }
            	    IN357=(Token)input.LT(1);
            	    match(input,IN,FOLLOW_IN_in_ftMildNot6409); if (failed) return retval;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot6412);
            	    ftUnaryNot358=ftUnaryNot();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftUnaryNot358.getTree());

            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftMildNot

    public static class ftUnaryNot_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftUnaryNot
    // etc/XQFT.g:592:5: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final ftUnaryNot_return ftUnaryNot() throws RecognitionException {
        ftUnaryNot_return retval = new ftUnaryNot_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTNOT359=null;
        ftPrimaryWithOptions_return ftPrimaryWithOptions360 = null;


        XQFTTree FTNOT359_tree=null;

        try {
            // etc/XQFT.g:592:36: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:592:38: ( FTNOT )? ftPrimaryWithOptions
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:592:38: ( FTNOT )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==FTNOT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // etc/XQFT.g:592:39: FTNOT
                    {
                    FTNOT359=(Token)input.LT(1);
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot6447); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FTNOT359_tree = (XQFTTree)adaptor.create(FTNOT359);
                    root_0 = (XQFTTree)adaptor.becomeRoot(FTNOT359_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot6452);
            ftPrimaryWithOptions360=ftPrimaryWithOptions();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftPrimaryWithOptions360.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftUnaryNot

    public static class ftPrimaryWithOptions_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftPrimaryWithOptions
    // etc/XQFT.g:593:5: ftPrimaryWithOptions : ftPrimary ( ftMatchOption )* ;
    public final ftPrimaryWithOptions_return ftPrimaryWithOptions() throws RecognitionException {
        ftPrimaryWithOptions_return retval = new ftPrimaryWithOptions_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftPrimary_return ftPrimary361 = null;

        ftMatchOption_return ftMatchOption362 = null;



        try {
            // etc/XQFT.g:593:31: ( ftPrimary ( ftMatchOption )* )
            // etc/XQFT.g:593:33: ftPrimary ( ftMatchOption )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions6468);
            ftPrimary361=ftPrimary();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftPrimary361.getTree());
            // etc/XQFT.g:593:43: ( ftMatchOption )*
            loop84:
            do {
                int alt84=2;
                switch ( input.LA(1) ) {
                case WITHOUT:
                    {
                    int LA84_11 = input.LA(2);

                    if ( ((LA84_11>=STEMMING && LA84_11<=STOP)||LA84_11==THESAURUS||LA84_11==WILDCARDS) ) {
                        alt84=1;
                    }


                    }
                    break;
                case CASE:
                    {
                    int LA84_34 = input.LA(2);

                    if ( (LA84_34==INSENSITIVE||LA84_34==SENSITIVE) ) {
                        alt84=1;
                    }


                    }
                    break;
                case DIACRITICS:
                case LANGUAGE:
                case LOWERCASE:
                case OPTION:
                case UPPERCASE:
                case WITH:
                    {
                    alt84=1;
                    }
                    break;

                }

                switch (alt84) {
            	case 1 :
            	    // etc/XQFT.g:593:44: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftPrimaryWithOptions6471);
            	    ftMatchOption362=ftMatchOption();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(ftMatchOption362.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftPrimaryWithOptions

    public static class ftPrimary_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftPrimary
    // etc/XQFT.g:594:6: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );
    public final ftPrimary_return ftPrimary() throws RecognitionException {
        ftPrimary_return retval = new ftPrimary_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPARSi365=null;
        Token RPARSi367=null;
        ftWords_return ftWords363 = null;

        ftTimes_return ftTimes364 = null;

        ftSelection_return ftSelection366 = null;

        ftExtensionSelection_return ftExtensionSelection368 = null;


        XQFTTree LPARSi365_tree=null;
        XQFTTree RPARSi367_tree=null;

        try {
            // etc/XQFT.g:594:37: ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection )
            int alt86=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case LBRACESi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt86=1;
                }
                break;
            case LPARSi:
                {
                alt86=2;
                }
                break;
            case LPRAGSi:
                {
                alt86=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("594:6: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // etc/XQFT.g:594:39: ftWords ( ftTimes )?
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftWords_in_ftPrimary6507);
                    ftWords363=ftWords();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftWords363.getTree());
                    // etc/XQFT.g:594:47: ( ftTimes )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==OCCURS) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // etc/XQFT.g:594:47: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary6509);
                            ftTimes364=ftTimes();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftTimes364.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:595:18: LPARSi ftSelection RPARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    LPARSi365=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftPrimary6530); if (failed) return retval;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary6533);
                    ftSelection366=ftSelection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftSelection366.getTree());
                    RPARSi367=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftPrimary6535); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:596:18: ftExtensionSelection
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary6556);
                    ftExtensionSelection368=ftExtensionSelection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftExtensionSelection368.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftPrimary

    public static class ftWords_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftWords
    // etc/XQFT.g:598:7: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final ftWords_return ftWords() throws RecognitionException {
        ftWords_return retval = new ftWords_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftWordsValue_return ftWordsValue369 = null;

        ftAnyallOption_return ftAnyallOption370 = null;



        try {
            // etc/XQFT.g:598:38: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:598:40: ftWordsValue ( ftAnyallOption )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftWordsValue_in_ftWords6608);
            ftWordsValue369=ftWordsValue();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftWordsValue369.getTree());
            // etc/XQFT.g:598:53: ( ftAnyallOption )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=ALL && LA87_0<=ANY)||LA87_0==PHRASE) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // etc/XQFT.g:598:53: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords6610);
                    ftAnyallOption370=ftAnyallOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftAnyallOption370.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftWords

    public static class ftWordsValue_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftWordsValue
    // etc/XQFT.g:599:8: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );
    public final ftWordsValue_return ftWordsValue() throws RecognitionException {
        ftWordsValue_return retval = new ftWordsValue_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi372=null;
        Token RBRACSi374=null;
        literal_return literal371 = null;

        expr_return expr373 = null;


        XQFTTree LBRACESi372_tree=null;
        XQFTTree RBRACSi374_tree=null;

        try {
            // etc/XQFT.g:599:39: ( literal | ( LBRACESi expr RBRACSi ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==StringLiteral||(LA88_0>=IntegerLiteral && LA88_0<=DoubleLiteral)) ) {
                alt88=1;
            }
            else if ( (LA88_0==LBRACESi) ) {
                alt88=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("599:8: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // etc/XQFT.g:599:41: literal
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_ftWordsValue6643);
                    literal371=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal371.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:599:51: ( LBRACESi expr RBRACSi )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:599:51: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:599:52: LBRACESi expr RBRACSi
                    {
                    LBRACESi372=(Token)input.LT(1);
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_ftWordsValue6648); if (failed) return retval;
                    pushFollow(FOLLOW_expr_in_ftWordsValue6651);
                    expr373=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr373.getTree());
                    RBRACSi374=(Token)input.LT(1);
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_ftWordsValue6653); if (failed) return retval;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftWordsValue

    public static class literal_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start literal
    // etc/XQFT.g:600:9: literal : ( numericLiteral | StringLiteral );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token StringLiteral376=null;
        numericLiteral_return numericLiteral375 = null;


        XQFTTree StringLiteral376_tree=null;

        try {
            // etc/XQFT.g:600:40: ( numericLiteral | StringLiteral )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=IntegerLiteral && LA89_0<=DoubleLiteral)) ) {
                alt89=1;
            }
            else if ( (LA89_0==StringLiteral) ) {
                alt89=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("600:9: literal : ( numericLiteral | StringLiteral );", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // etc/XQFT.g:600:42: numericLiteral
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal6693);
                    numericLiteral375=numericLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, numericLiteral375.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:600:59: StringLiteral
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    StringLiteral376=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal6697); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral376_tree = (XQFTTree)adaptor.create(StringLiteral376);
                    adaptor.addChild(root_0, StringLiteral376_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    public static class numericLiteral_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start numericLiteral
    // etc/XQFT.g:601:10: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set377=null;

        XQFTTree set377_tree=null;

        try {
            // etc/XQFT.g:601:41: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set377=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=DoubleLiteral) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set377));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_numericLiteral0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end numericLiteral

    public static class ftAnyallOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftAnyallOption
    // etc/XQFT.g:602:8: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final ftAnyallOption_return ftAnyallOption() throws RecognitionException {
        ftAnyallOption_return retval = new ftAnyallOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ANY378=null;
        Token WORD379=null;
        Token ALL380=null;
        Token WORDS381=null;
        Token PHRASE382=null;

        XQFTTree ANY378_tree=null;
        XQFTTree WORD379_tree=null;
        XQFTTree ALL380_tree=null;
        XQFTTree WORDS381_tree=null;
        XQFTTree PHRASE382_tree=null;

        try {
            // etc/XQFT.g:602:39: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
            int alt92=3;
            switch ( input.LA(1) ) {
            case ANY:
                {
                alt92=1;
                }
                break;
            case ALL:
                {
                alt92=2;
                }
                break;
            case PHRASE:
                {
                alt92=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("602:8: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:602:41: ( ANY ( WORD )? )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:602:41: ( ANY ( WORD )? )
                    // etc/XQFT.g:602:42: ANY ( WORD )?
                    {
                    ANY378=(Token)input.LT(1);
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption6768); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ANY378_tree = (XQFTTree)adaptor.create(ANY378);
                    adaptor.addChild(root_0, ANY378_tree);
                    }
                    // etc/XQFT.g:602:46: ( WORD )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==WORD) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // etc/XQFT.g:602:46: WORD
                            {
                            WORD379=(Token)input.LT(1);
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption6770); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WORD379_tree = (XQFTTree)adaptor.create(WORD379);
                            adaptor.addChild(root_0, WORD379_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:602:55: ( ALL ( WORDS )? )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:602:55: ( ALL ( WORDS )? )
                    // etc/XQFT.g:602:56: ALL ( WORDS )?
                    {
                    ALL380=(Token)input.LT(1);
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption6777); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ALL380_tree = (XQFTTree)adaptor.create(ALL380);
                    adaptor.addChild(root_0, ALL380_tree);
                    }
                    // etc/XQFT.g:602:60: ( WORDS )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==WORDS) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // etc/XQFT.g:602:60: WORDS
                            {
                            WORDS381=(Token)input.LT(1);
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption6779); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WORDS381_tree = (XQFTTree)adaptor.create(WORDS381);
                            adaptor.addChild(root_0, WORDS381_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:602:70: PHRASE
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    PHRASE382=(Token)input.LT(1);
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption6785); if (failed) return retval;
                    if ( backtracking==0 ) {
                    PHRASE382_tree = (XQFTTree)adaptor.create(PHRASE382);
                    adaptor.addChild(root_0, PHRASE382_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftAnyallOption

    public static class ftTimes_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftTimes
    // etc/XQFT.g:603:7: ftTimes : OCCURS ftRange TIMES ;
    public final ftTimes_return ftTimes() throws RecognitionException {
        ftTimes_return retval = new ftTimes_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token OCCURS383=null;
        Token TIMES385=null;
        ftRange_return ftRange384 = null;


        XQFTTree OCCURS383_tree=null;
        XQFTTree TIMES385_tree=null;

        try {
            // etc/XQFT.g:603:38: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:603:40: OCCURS ftRange TIMES
            {
            root_0 = (XQFTTree)adaptor.nil();

            OCCURS383=(Token)input.LT(1);
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes6821); if (failed) return retval;
            pushFollow(FOLLOW_ftRange_in_ftTimes6824);
            ftRange384=ftRange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftRange384.getTree());
            TIMES385=(Token)input.LT(1);
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes6826); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftTimes

    public static class ftRange_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftRange
    // etc/XQFT.g:604:8: ftRange : ( ( EXACTLY additiveExpr ) | ( AT ( LEAST | MOST ) additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final ftRange_return ftRange() throws RecognitionException {
        ftRange_return retval = new ftRange_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token EXACTLY386=null;
        Token AT388=null;
        Token set389=null;
        Token FROM391=null;
        Token TO393=null;
        additiveExpr_return additiveExpr387 = null;

        additiveExpr_return additiveExpr390 = null;

        additiveExpr_return additiveExpr392 = null;

        additiveExpr_return additiveExpr394 = null;


        XQFTTree EXACTLY386_tree=null;
        XQFTTree AT388_tree=null;
        XQFTTree set389_tree=null;
        XQFTTree FROM391_tree=null;
        XQFTTree TO393_tree=null;

        try {
            // etc/XQFT.g:604:39: ( ( EXACTLY additiveExpr ) | ( AT ( LEAST | MOST ) additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
            int alt93=3;
            switch ( input.LA(1) ) {
            case EXACTLY:
                {
                alt93=1;
                }
                break;
            case AT:
                {
                alt93=2;
                }
                break;
            case FROM:
                {
                alt93=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("604:8: ftRange : ( ( EXACTLY additiveExpr ) | ( AT ( LEAST | MOST ) additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // etc/XQFT.g:604:41: ( EXACTLY additiveExpr )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:604:41: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:604:42: EXACTLY additiveExpr
                    {
                    EXACTLY386=(Token)input.LT(1);
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange6865); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EXACTLY386_tree = (XQFTTree)adaptor.create(EXACTLY386);
                    adaptor.addChild(root_0, EXACTLY386_tree);
                    }
                    pushFollow(FOLLOW_additiveExpr_in_ftRange6867);
                    additiveExpr387=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr387.getTree());

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:605:35: ( AT ( LEAST | MOST ) additiveExpr )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:605:35: ( AT ( LEAST | MOST ) additiveExpr )
                    // etc/XQFT.g:605:36: AT ( LEAST | MOST ) additiveExpr
                    {
                    AT388=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_ftRange6905); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT388_tree = (XQFTTree)adaptor.create(AT388);
                    adaptor.addChild(root_0, AT388_tree);
                    }
                    set389=(Token)input.LT(1);
                    if ( input.LA(1)==LEAST||input.LA(1)==MOST ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set389));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftRange6907);    throw mse;
                    }

                    pushFollow(FOLLOW_additiveExpr_in_ftRange6913);
                    additiveExpr390=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr390.getTree());

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:606:44: ( FROM additiveExpr TO additiveExpr )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:606:44: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:606:45: FROM additiveExpr TO additiveExpr
                    {
                    FROM391=(Token)input.LT(1);
                    match(input,FROM,FOLLOW_FROM_in_ftRange6960); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FROM391_tree = (XQFTTree)adaptor.create(FROM391);
                    adaptor.addChild(root_0, FROM391_tree);
                    }
                    pushFollow(FOLLOW_additiveExpr_in_ftRange6962);
                    additiveExpr392=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr392.getTree());
                    TO393=(Token)input.LT(1);
                    match(input,TO,FOLLOW_TO_in_ftRange6964); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TO393_tree = (XQFTTree)adaptor.create(TO393);
                    adaptor.addChild(root_0, TO393_tree);
                    }
                    pushFollow(FOLLOW_additiveExpr_in_ftRange6966);
                    additiveExpr394=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr394.getTree());

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftRange

    public static class ftExtensionSelection_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftExtensionSelection
    // etc/XQFT.g:609:7: ftExtensionSelection : ( pragma )+ LBRACESi ( ftSelection )? RBRACSi ;
    public final ftExtensionSelection_return ftExtensionSelection() throws RecognitionException {
        ftExtensionSelection_return retval = new ftExtensionSelection_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi396=null;
        Token RBRACSi398=null;
        pragma_return pragma395 = null;

        ftSelection_return ftSelection397 = null;


        XQFTTree LBRACESi396_tree=null;
        XQFTTree RBRACSi398_tree=null;

        try {
            // etc/XQFT.g:609:38: ( ( pragma )+ LBRACESi ( ftSelection )? RBRACSi )
            // etc/XQFT.g:609:40: ( pragma )+ LBRACESi ( ftSelection )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:609:40: ( pragma )+
            int cnt94=0;
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==LPRAGSi) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // etc/XQFT.g:609:40: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection6992);
            	    pragma395=pragma();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, pragma395.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt94 >= 1 ) break loop94;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(94, input);
                        throw eee;
                }
                cnt94++;
            } while (true);

            LBRACESi396=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_ftExtensionSelection6995); if (failed) return retval;
            // etc/XQFT.g:609:58: ( ftSelection )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==FTNOT||LA95_0==StringLiteral||LA95_0==LPARSi||LA95_0==LBRACESi||(LA95_0>=IntegerLiteral && LA95_0<=LPRAGSi)) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // etc/XQFT.g:609:58: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection6998);
                    ftSelection397=ftSelection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftSelection397.getTree());

                    }
                    break;

            }

            RBRACSi398=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_ftExtensionSelection7001); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftExtensionSelection

    public static class pragma_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pragma
    // etc/XQFT.g:610:8: pragma : LPRAGSi qName ( PragmaContents )? RPRAGSi ;
    public final pragma_return pragma() throws RecognitionException {
        pragma_return retval = new pragma_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPRAGSi399=null;
        Token PragmaContents401=null;
        Token RPRAGSi402=null;
        qName_return qName400 = null;


        XQFTTree LPRAGSi399_tree=null;
        XQFTTree PragmaContents401_tree=null;
        XQFTTree RPRAGSi402_tree=null;

        try {
            // etc/XQFT.g:610:39: ( LPRAGSi qName ( PragmaContents )? RPRAGSi )
            // etc/XQFT.g:610:41: LPRAGSi qName ( PragmaContents )? RPRAGSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LPRAGSi399=(Token)input.LT(1);
            match(input,LPRAGSi,FOLLOW_LPRAGSi_in_pragma7040); if (failed) return retval;
            pushFollow(FOLLOW_qName_in_pragma7043);
            qName400=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName400.getTree());
            // etc/XQFT.g:610:56: ( PragmaContents )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==PragmaContents) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // etc/XQFT.g:610:56: PragmaContents
                    {
                    PragmaContents401=(Token)input.LT(1);
                    match(input,PragmaContents,FOLLOW_PragmaContents_in_pragma7045); if (failed) return retval;
                    if ( backtracking==0 ) {
                    PragmaContents401_tree = (XQFTTree)adaptor.create(PragmaContents401);
                    adaptor.addChild(root_0, PragmaContents401_tree);
                    }

                    }
                    break;

            }

            RPRAGSi402=(Token)input.LT(1);
            match(input,RPRAGSi,FOLLOW_RPRAGSi_in_pragma7048); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end pragma

    public static class ftPosFilter_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftPosFilter
    // etc/XQFT.g:613:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final ftPosFilter_return ftPosFilter() throws RecognitionException {
        ftPosFilter_return retval = new ftPosFilter_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftOrder_return ftOrder403 = null;

        ftWindow_return ftWindow404 = null;

        ftDistance_return ftDistance405 = null;

        ftScope_return ftScope406 = null;

        ftContent_return ftContent407 = null;



        try {
            // etc/XQFT.g:613:33: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
            int alt97=5;
            switch ( input.LA(1) ) {
            case ORDERED:
                {
                alt97=1;
                }
                break;
            case WINDOW:
                {
                alt97=2;
                }
                break;
            case DISTANCE:
                {
                alt97=3;
                }
                break;
            case DIFFERENT:
            case SAME:
                {
                alt97=4;
                }
                break;
            case AT:
            case ENTIRE:
                {
                alt97=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("613:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // etc/XQFT.g:613:35: ftOrder
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter7085);
                    ftOrder403=ftOrder();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftOrder403.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:613:45: ftWindow
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter7089);
                    ftWindow404=ftWindow();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftWindow404.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:613:56: ftDistance
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter7093);
                    ftDistance405=ftDistance();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftDistance405.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:613:69: ftScope
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftScope_in_ftPosFilter7097);
                    ftScope406=ftScope();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftScope406.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:613:79: ftContent
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftContent_in_ftPosFilter7101);
                    ftContent407=ftContent();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftContent407.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftPosFilter

    public static class ftOrder_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftOrder
    // etc/XQFT.g:614:3: ftOrder : ORDERED ;
    public final ftOrder_return ftOrder() throws RecognitionException {
        ftOrder_return retval = new ftOrder_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ORDERED408=null;

        XQFTTree ORDERED408_tree=null;

        try {
            // etc/XQFT.g:614:34: ( ORDERED )
            // etc/XQFT.g:614:36: ORDERED
            {
            root_0 = (XQFTTree)adaptor.nil();

            ORDERED408=(Token)input.LT(1);
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder7133); if (failed) return retval;
            if ( backtracking==0 ) {
            ORDERED408_tree = (XQFTTree)adaptor.create(ORDERED408);
            adaptor.addChild(root_0, ORDERED408_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftOrder

    public static class ftWindow_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftWindow
    // etc/XQFT.g:615:3: ftWindow : WINDOW additiveExpr ftUnit ;
    public final ftWindow_return ftWindow() throws RecognitionException {
        ftWindow_return retval = new ftWindow_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WINDOW409=null;
        additiveExpr_return additiveExpr410 = null;

        ftUnit_return ftUnit411 = null;


        XQFTTree WINDOW409_tree=null;

        try {
            // etc/XQFT.g:615:34: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:615:36: WINDOW additiveExpr ftUnit
            {
            root_0 = (XQFTTree)adaptor.nil();

            WINDOW409=(Token)input.LT(1);
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow7164); if (failed) return retval;
            if ( backtracking==0 ) {
            WINDOW409_tree = (XQFTTree)adaptor.create(WINDOW409);
            adaptor.addChild(root_0, WINDOW409_tree);
            }
            pushFollow(FOLLOW_additiveExpr_in_ftWindow7166);
            additiveExpr410=additiveExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr410.getTree());
            pushFollow(FOLLOW_ftUnit_in_ftWindow7168);
            ftUnit411=ftUnit();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftUnit411.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftWindow

    public static class ftUnit_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftUnit
    // etc/XQFT.g:617:4: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final ftUnit_return ftUnit() throws RecognitionException {
        ftUnit_return retval = new ftUnit_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set412=null;

        XQFTTree set412_tree=null;

        try {
            // etc/XQFT.g:617:35: ( WORDS | SENTENCES | PARAGRAPHS )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set412=(Token)input.LT(1);
            if ( input.LA(1)==PARAGRAPHS||input.LA(1)==SENTENCES||input.LA(1)==WORDS ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set412));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftUnit0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftUnit

    public static class ftDistance_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftDistance
    // etc/XQFT.g:618:3: ftDistance : DISTANCE ftRange ftUnit ;
    public final ftDistance_return ftDistance() throws RecognitionException {
        ftDistance_return retval = new ftDistance_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DISTANCE413=null;
        ftRange_return ftRange414 = null;

        ftUnit_return ftUnit415 = null;


        XQFTTree DISTANCE413_tree=null;

        try {
            // etc/XQFT.g:618:34: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:618:36: DISTANCE ftRange ftUnit
            {
            root_0 = (XQFTTree)adaptor.nil();

            DISTANCE413=(Token)input.LT(1);
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance7241); if (failed) return retval;
            if ( backtracking==0 ) {
            DISTANCE413_tree = (XQFTTree)adaptor.create(DISTANCE413);
            adaptor.addChild(root_0, DISTANCE413_tree);
            }
            pushFollow(FOLLOW_ftRange_in_ftDistance7243);
            ftRange414=ftRange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftRange414.getTree());
            pushFollow(FOLLOW_ftUnit_in_ftDistance7245);
            ftUnit415=ftUnit();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftUnit415.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftDistance

    public static class ftScope_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftScope
    // etc/XQFT.g:625:3: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final ftScope_return ftScope() throws RecognitionException {
        ftScope_return retval = new ftScope_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set416=null;
        ftBigUnit_return ftBigUnit417 = null;


        XQFTTree set416_tree=null;

        try {
            // etc/XQFT.g:625:34: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:625:36: ( SAME | DIFFERENT ) ftBigUnit
            {
            root_0 = (XQFTTree)adaptor.nil();

            set416=(Token)input.LT(1);
            if ( input.LA(1)==DIFFERENT||input.LA(1)==SAME ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set416));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope7283);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope7291);
            ftBigUnit417=ftBigUnit();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftBigUnit417.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftScope

    public static class ftBigUnit_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftBigUnit
    // etc/XQFT.g:626:4: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final ftBigUnit_return ftBigUnit() throws RecognitionException {
        ftBigUnit_return retval = new ftBigUnit_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set418=null;

        XQFTTree set418_tree=null;

        try {
            // etc/XQFT.g:626:35: ( SENTENCE | PARAGRAPH )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set418=(Token)input.LT(1);
            if ( input.LA(1)==PARAGRAPH||input.LA(1)==SENTENCE ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set418));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftBigUnit0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftBigUnit

    public static class ftContent_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftContent
    // etc/XQFT.g:627:3: ftContent : ( AT ( START | END ) | ENTIRE CONTENT );
    public final ftContent_return ftContent() throws RecognitionException {
        ftContent_return retval = new ftContent_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AT419=null;
        Token set420=null;
        Token ENTIRE421=null;
        Token CONTENT422=null;

        XQFTTree AT419_tree=null;
        XQFTTree set420_tree=null;
        XQFTTree ENTIRE421_tree=null;
        XQFTTree CONTENT422_tree=null;

        try {
            // etc/XQFT.g:627:34: ( AT ( START | END ) | ENTIRE CONTENT )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==AT) ) {
                alt98=1;
            }
            else if ( (LA98_0==ENTIRE) ) {
                alt98=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("627:3: ftContent : ( AT ( START | END ) | ENTIRE CONTENT );", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // etc/XQFT.g:627:36: AT ( START | END )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    AT419=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_ftContent7357); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT419_tree = (XQFTTree)adaptor.create(AT419);
                    adaptor.addChild(root_0, AT419_tree);
                    }
                    set420=(Token)input.LT(1);
                    if ( input.LA(1)==END||input.LA(1)==START ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set420));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftContent7359);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:627:55: ENTIRE CONTENT
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    ENTIRE421=(Token)input.LT(1);
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent7369); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ENTIRE421_tree = (XQFTTree)adaptor.create(ENTIRE421);
                    adaptor.addChild(root_0, ENTIRE421_tree);
                    }
                    CONTENT422=(Token)input.LT(1);
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent7371); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONTENT422_tree = (XQFTTree)adaptor.create(CONTENT422);
                    adaptor.addChild(root_0, CONTENT422_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftContent

    public static class ftMatchOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftMatchOption
    // etc/XQFT.g:636:1: ftMatchOption : ( ftLanguageOption | ftCaseOption | ftDiacriticsOption | ftExtensionOption | WITH ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption ) | WITHOUT ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS ) );
    public final ftMatchOption_return ftMatchOption() throws RecognitionException {
        ftMatchOption_return retval = new ftMatchOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WITH427=null;
        Token WILDCARDS428=null;
        Token STEMMING430=null;
        Token WITHOUT432=null;
        Token WILDCARDS433=null;
        Token THESAURUS434=null;
        Token STEMMING435=null;
        Token STOP436=null;
        Token WORDS437=null;
        ftLanguageOption_return ftLanguageOption423 = null;

        ftCaseOption_return ftCaseOption424 = null;

        ftDiacriticsOption_return ftDiacriticsOption425 = null;

        ftExtensionOption_return ftExtensionOption426 = null;

        ftThesaurusOption_return ftThesaurusOption429 = null;

        ftStopwordOption_return ftStopwordOption431 = null;


        XQFTTree WITH427_tree=null;
        XQFTTree WILDCARDS428_tree=null;
        XQFTTree STEMMING430_tree=null;
        XQFTTree WITHOUT432_tree=null;
        XQFTTree WILDCARDS433_tree=null;
        XQFTTree THESAURUS434_tree=null;
        XQFTTree STEMMING435_tree=null;
        XQFTTree STOP436_tree=null;
        XQFTTree WORDS437_tree=null;

        try {
            // etc/XQFT.g:636:32: ( ftLanguageOption | ftCaseOption | ftDiacriticsOption | ftExtensionOption | WITH ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption ) | WITHOUT ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS ) )
            int alt101=6;
            switch ( input.LA(1) ) {
            case LANGUAGE:
                {
                alt101=1;
                }
                break;
            case CASE:
            case LOWERCASE:
            case UPPERCASE:
                {
                alt101=2;
                }
                break;
            case DIACRITICS:
                {
                alt101=3;
                }
                break;
            case OPTION:
                {
                alt101=4;
                }
                break;
            case WITH:
                {
                alt101=5;
                }
                break;
            case WITHOUT:
                {
                alt101=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("636:1: ftMatchOption : ( ftLanguageOption | ftCaseOption | ftDiacriticsOption | ftExtensionOption | WITH ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption ) | WITHOUT ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS ) );", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:636:34: ftLanguageOption
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption7409);
                    ftLanguageOption423=ftLanguageOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftLanguageOption423.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:637:37: ftCaseOption
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption7447);
                    ftCaseOption424=ftCaseOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftCaseOption424.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:638:37: ftDiacriticsOption
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption7485);
                    ftDiacriticsOption425=ftDiacriticsOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftDiacriticsOption425.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:639:37: ftExtensionOption
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption7523);
                    ftExtensionOption426=ftExtensionOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftExtensionOption426.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:640:37: WITH ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    WITH427=(Token)input.LT(1);
                    match(input,WITH,FOLLOW_WITH_in_ftMatchOption7561); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WITH427_tree = (XQFTTree)adaptor.create(WITH427);
                    root_0 = (XQFTTree)adaptor.becomeRoot(WITH427_tree, root_0);
                    }
                    // etc/XQFT.g:640:43: ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption )
                    int alt99=4;
                    switch ( input.LA(1) ) {
                    case WILDCARDS:
                        {
                        alt99=1;
                        }
                        break;
                    case THESAURUS:
                        {
                        alt99=2;
                        }
                        break;
                    case STEMMING:
                        {
                        alt99=3;
                        }
                        break;
                    case DEFAULT:
                    case STOP:
                        {
                        alt99=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("640:43: ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption )", 99, 0, input);

                        throw nvae;
                    }

                    switch (alt99) {
                        case 1 :
                            // etc/XQFT.g:640:44: WILDCARDS
                            {
                            WILDCARDS428=(Token)input.LT(1);
                            match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftMatchOption7565); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WILDCARDS428_tree = (XQFTTree)adaptor.create(WILDCARDS428);
                            adaptor.addChild(root_0, WILDCARDS428_tree);
                            }

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:641:38: ftThesaurusOption
                            {
                            pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption7604);
                            ftThesaurusOption429=ftThesaurusOption();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftThesaurusOption429.getTree());

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:642:38: STEMMING
                            {
                            STEMMING430=(Token)input.LT(1);
                            match(input,STEMMING,FOLLOW_STEMMING_in_ftMatchOption7643); if (failed) return retval;
                            if ( backtracking==0 ) {
                            STEMMING430_tree = (XQFTTree)adaptor.create(STEMMING430);
                            adaptor.addChild(root_0, STEMMING430_tree);
                            }

                            }
                            break;
                        case 4 :
                            // etc/XQFT.g:643:38: ftStopwordOption
                            {
                            pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption7682);
                            ftStopwordOption431=ftStopwordOption();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftStopwordOption431.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // etc/XQFT.g:645:37: WITHOUT ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    WITHOUT432=(Token)input.LT(1);
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftMatchOption7758); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WITHOUT432_tree = (XQFTTree)adaptor.create(WITHOUT432);
                    root_0 = (XQFTTree)adaptor.becomeRoot(WITHOUT432_tree, root_0);
                    }
                    // etc/XQFT.g:645:47: ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS )
                    int alt100=4;
                    switch ( input.LA(1) ) {
                    case WILDCARDS:
                        {
                        alt100=1;
                        }
                        break;
                    case THESAURUS:
                        {
                        alt100=2;
                        }
                        break;
                    case STEMMING:
                        {
                        alt100=3;
                        }
                        break;
                    case STOP:
                        {
                        alt100=4;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("645:47: ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS )", 100, 0, input);

                        throw nvae;
                    }

                    switch (alt100) {
                        case 1 :
                            // etc/XQFT.g:645:48: WILDCARDS
                            {
                            WILDCARDS433=(Token)input.LT(1);
                            match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftMatchOption7763); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WILDCARDS433_tree = (XQFTTree)adaptor.create(WILDCARDS433);
                            adaptor.addChild(root_0, WILDCARDS433_tree);
                            }

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:646:39: THESAURUS
                            {
                            THESAURUS434=(Token)input.LT(1);
                            match(input,THESAURUS,FOLLOW_THESAURUS_in_ftMatchOption7803); if (failed) return retval;
                            if ( backtracking==0 ) {
                            THESAURUS434_tree = (XQFTTree)adaptor.create(THESAURUS434);
                            adaptor.addChild(root_0, THESAURUS434_tree);
                            }

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:647:39: STEMMING
                            {
                            STEMMING435=(Token)input.LT(1);
                            match(input,STEMMING,FOLLOW_STEMMING_in_ftMatchOption7843); if (failed) return retval;
                            if ( backtracking==0 ) {
                            STEMMING435_tree = (XQFTTree)adaptor.create(STEMMING435);
                            adaptor.addChild(root_0, STEMMING435_tree);
                            }

                            }
                            break;
                        case 4 :
                            // etc/XQFT.g:648:39: STOP WORDS
                            {
                            STOP436=(Token)input.LT(1);
                            match(input,STOP,FOLLOW_STOP_in_ftMatchOption7883); if (failed) return retval;
                            if ( backtracking==0 ) {
                            STOP436_tree = (XQFTTree)adaptor.create(STOP436);
                            adaptor.addChild(root_0, STOP436_tree);
                            }
                            WORDS437=(Token)input.LT(1);
                            match(input,WORDS,FOLLOW_WORDS_in_ftMatchOption7885); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WORDS437_tree = (XQFTTree)adaptor.create(WORDS437);
                            adaptor.addChild(root_0, WORDS437_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftMatchOption

    public static class ftLanguageOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftLanguageOption
    // etc/XQFT.g:652:2: ftLanguageOption : LANGUAGE StringLiteral ;
    public final ftLanguageOption_return ftLanguageOption() throws RecognitionException {
        ftLanguageOption_return retval = new ftLanguageOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LANGUAGE438=null;
        Token StringLiteral439=null;

        XQFTTree LANGUAGE438_tree=null;
        XQFTTree StringLiteral439_tree=null;

        try {
            // etc/XQFT.g:652:33: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:652:35: LANGUAGE StringLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            LANGUAGE438=(Token)input.LT(1);
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption7982); if (failed) return retval;
            if ( backtracking==0 ) {
            LANGUAGE438_tree = (XQFTTree)adaptor.create(LANGUAGE438);
            root_0 = (XQFTTree)adaptor.becomeRoot(LANGUAGE438_tree, root_0);
            }
            StringLiteral439=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption7985); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral439_tree = (XQFTTree)adaptor.create(StringLiteral439);
            adaptor.addChild(root_0, StringLiteral439_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftLanguageOption

    public static class ftCaseOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftCaseOption
    // etc/XQFT.g:654:2: ftCaseOption : ( CASE ( INSENSITIVE | SENSITIVE ) | LOWERCASE | UPPERCASE );
    public final ftCaseOption_return ftCaseOption() throws RecognitionException {
        ftCaseOption_return retval = new ftCaseOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CASE440=null;
        Token set441=null;
        Token LOWERCASE442=null;
        Token UPPERCASE443=null;

        XQFTTree CASE440_tree=null;
        XQFTTree set441_tree=null;
        XQFTTree LOWERCASE442_tree=null;
        XQFTTree UPPERCASE443_tree=null;

        try {
            // etc/XQFT.g:654:33: ( CASE ( INSENSITIVE | SENSITIVE ) | LOWERCASE | UPPERCASE )
            int alt102=3;
            switch ( input.LA(1) ) {
            case CASE:
                {
                alt102=1;
                }
                break;
            case LOWERCASE:
                {
                alt102=2;
                }
                break;
            case UPPERCASE:
                {
                alt102=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("654:2: ftCaseOption : ( CASE ( INSENSITIVE | SENSITIVE ) | LOWERCASE | UPPERCASE );", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:654:35: CASE ( INSENSITIVE | SENSITIVE )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    CASE440=(Token)input.LT(1);
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption8012); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CASE440_tree = (XQFTTree)adaptor.create(CASE440);
                    root_0 = (XQFTTree)adaptor.becomeRoot(CASE440_tree, root_0);
                    }
                    set441=(Token)input.LT(1);
                    if ( input.LA(1)==INSENSITIVE||input.LA(1)==SENSITIVE ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set441));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftCaseOption8015);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:655:38: LOWERCASE
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    LOWERCASE442=(Token)input.LT(1);
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption8060); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LOWERCASE442_tree = (XQFTTree)adaptor.create(LOWERCASE442);
                    root_0 = (XQFTTree)adaptor.becomeRoot(LOWERCASE442_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:656:38: UPPERCASE
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    UPPERCASE443=(Token)input.LT(1);
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption8100); if (failed) return retval;
                    if ( backtracking==0 ) {
                    UPPERCASE443_tree = (XQFTTree)adaptor.create(UPPERCASE443);
                    root_0 = (XQFTTree)adaptor.becomeRoot(UPPERCASE443_tree, root_0);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftCaseOption

    public static class ftDiacriticsOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftDiacriticsOption
    // etc/XQFT.g:659:2: ftDiacriticsOption : DIACRITICS ( INSENSITIVE | SENSITIVE ) ;
    public final ftDiacriticsOption_return ftDiacriticsOption() throws RecognitionException {
        ftDiacriticsOption_return retval = new ftDiacriticsOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DIACRITICS444=null;
        Token set445=null;

        XQFTTree DIACRITICS444_tree=null;
        XQFTTree set445_tree=null;

        try {
            // etc/XQFT.g:659:33: ( DIACRITICS ( INSENSITIVE | SENSITIVE ) )
            // etc/XQFT.g:659:35: DIACRITICS ( INSENSITIVE | SENSITIVE )
            {
            root_0 = (XQFTTree)adaptor.nil();

            DIACRITICS444=(Token)input.LT(1);
            match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption8196); if (failed) return retval;
            if ( backtracking==0 ) {
            DIACRITICS444_tree = (XQFTTree)adaptor.create(DIACRITICS444);
            root_0 = (XQFTTree)adaptor.becomeRoot(DIACRITICS444_tree, root_0);
            }
            set445=(Token)input.LT(1);
            if ( input.LA(1)==INSENSITIVE||input.LA(1)==SENSITIVE ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set445));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftDiacriticsOption8199);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftDiacriticsOption

    public static class ftExtensionOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftExtensionOption
    // etc/XQFT.g:662:2: ftExtensionOption : OPTION qName StringLiteral ;
    public final ftExtensionOption_return ftExtensionOption() throws RecognitionException {
        ftExtensionOption_return retval = new ftExtensionOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token OPTION446=null;
        Token StringLiteral448=null;
        qName_return qName447 = null;


        XQFTTree OPTION446_tree=null;
        XQFTTree StringLiteral448_tree=null;

        try {
            // etc/XQFT.g:662:33: ( OPTION qName StringLiteral )
            // etc/XQFT.g:662:35: OPTION qName StringLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            OPTION446=(Token)input.LT(1);
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption8239); if (failed) return retval;
            if ( backtracking==0 ) {
            OPTION446_tree = (XQFTTree)adaptor.create(OPTION446);
            root_0 = (XQFTTree)adaptor.becomeRoot(OPTION446_tree, root_0);
            }
            pushFollow(FOLLOW_qName_in_ftExtensionOption8242);
            qName447=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName447.getTree());
            StringLiteral448=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption8244); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral448_tree = (XQFTTree)adaptor.create(StringLiteral448);
            adaptor.addChild(root_0, StringLiteral448_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftExtensionOption

    public static class ftThesaurusOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftThesaurusOption
    // etc/XQFT.g:666:2: ftThesaurusOption : THESAURUS ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) ) ;
    public final ftThesaurusOption_return ftThesaurusOption() throws RecognitionException {
        ftThesaurusOption_return retval = new ftThesaurusOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token THESAURUS449=null;
        Token DEFAULT451=null;
        Token LPARSi452=null;
        Token DEFAULT454=null;
        Token COMMASi455=null;
        Token RPARSi457=null;
        ftThesaurusID_return ftThesaurusID450 = null;

        ftThesaurusID_return ftThesaurusID453 = null;

        ftThesaurusID_return ftThesaurusID456 = null;


        XQFTTree THESAURUS449_tree=null;
        XQFTTree DEFAULT451_tree=null;
        XQFTTree LPARSi452_tree=null;
        XQFTTree DEFAULT454_tree=null;
        XQFTTree COMMASi455_tree=null;
        XQFTTree RPARSi457_tree=null;

        try {
            // etc/XQFT.g:666:31: ( THESAURUS ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) ) )
            // etc/XQFT.g:666:33: THESAURUS ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) )
            {
            root_0 = (XQFTTree)adaptor.nil();

            THESAURUS449=(Token)input.LT(1);
            match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption8268); if (failed) return retval;
            if ( backtracking==0 ) {
            THESAURUS449_tree = (XQFTTree)adaptor.create(THESAURUS449);
            adaptor.addChild(root_0, THESAURUS449_tree);
            }
            // etc/XQFT.g:666:44: ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==AT||LA106_0==DEFAULT) ) {
                alt106=1;
            }
            else if ( (LA106_0==LPARSi) ) {
                alt106=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("666:44: ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) )", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // etc/XQFT.g:667:14: ( ftThesaurusID | DEFAULT )
                    {
                    // etc/XQFT.g:667:14: ( ftThesaurusID | DEFAULT )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==AT) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==DEFAULT) ) {
                        alt103=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("667:14: ( ftThesaurusID | DEFAULT )", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // etc/XQFT.g:667:15: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption8287);
                            ftThesaurusID450=ftThesaurusID();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftThesaurusID450.getTree());

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:667:31: DEFAULT
                            {
                            DEFAULT451=(Token)input.LT(1);
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption8291); if (failed) return retval;
                            if ( backtracking==0 ) {
                            DEFAULT451_tree = (XQFTTree)adaptor.create(DEFAULT451);
                            adaptor.addChild(root_0, DEFAULT451_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:668:14: ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi )
                    {
                    // etc/XQFT.g:668:14: ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi )
                    // etc/XQFT.g:668:15: LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi
                    {
                    LPARSi452=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftThesaurusOption8308); if (failed) return retval;
                    // etc/XQFT.g:668:23: ( ftThesaurusID | DEFAULT )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==AT) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==DEFAULT) ) {
                        alt104=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("668:23: ( ftThesaurusID | DEFAULT )", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // etc/XQFT.g:668:24: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption8312);
                            ftThesaurusID453=ftThesaurusID();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftThesaurusID453.getTree());

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:668:40: DEFAULT
                            {
                            DEFAULT454=(Token)input.LT(1);
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption8316); if (failed) return retval;
                            if ( backtracking==0 ) {
                            DEFAULT454_tree = (XQFTTree)adaptor.create(DEFAULT454);
                            adaptor.addChild(root_0, DEFAULT454_tree);
                            }

                            }
                            break;

                    }

                    // etc/XQFT.g:668:49: ( COMMASi ftThesaurusID )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==COMMASi) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // etc/XQFT.g:668:50: COMMASi ftThesaurusID
                    	    {
                    	    COMMASi455=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption8320); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    COMMASi455_tree = (XQFTTree)adaptor.create(COMMASi455);
                    	    adaptor.addChild(root_0, COMMASi455_tree);
                    	    }
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption8322);
                    	    ftThesaurusID456=ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, ftThesaurusID456.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    RPARSi457=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftThesaurusOption8326); if (failed) return retval;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftThesaurusOption

    public static class ftThesaurusID_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftThesaurusID
    // etc/XQFT.g:671:3: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final ftThesaurusID_return ftThesaurusID() throws RecognitionException {
        ftThesaurusID_return retval = new ftThesaurusID_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AT458=null;
        Token RELATIONSHIP460=null;
        Token StringLiteral461=null;
        Token LEVELS463=null;
        uriLiteral_return uriLiteral459 = null;

        ftRange_return ftRange462 = null;


        XQFTTree AT458_tree=null;
        XQFTTree RELATIONSHIP460_tree=null;
        XQFTTree StringLiteral461_tree=null;
        XQFTTree LEVELS463_tree=null;

        try {
            // etc/XQFT.g:671:34: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:671:36: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            AT458=(Token)input.LT(1);
            match(input,AT,FOLLOW_AT_in_ftThesaurusID8404); if (failed) return retval;
            if ( backtracking==0 ) {
            AT458_tree = (XQFTTree)adaptor.create(AT458);
            adaptor.addChild(root_0, AT458_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID8406);
            uriLiteral459=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral459.getTree());
            // etc/XQFT.g:671:50: ( RELATIONSHIP StringLiteral )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RELATIONSHIP) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // etc/XQFT.g:671:51: RELATIONSHIP StringLiteral
                    {
                    RELATIONSHIP460=(Token)input.LT(1);
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID8409); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RELATIONSHIP460_tree = (XQFTTree)adaptor.create(RELATIONSHIP460);
                    adaptor.addChild(root_0, RELATIONSHIP460_tree);
                    }
                    StringLiteral461=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID8411); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral461_tree = (XQFTTree)adaptor.create(StringLiteral461);
                    adaptor.addChild(root_0, StringLiteral461_tree);
                    }

                    }
                    break;

            }

            // etc/XQFT.g:671:80: ( ftRange LEVELS )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==EXACTLY||LA108_0==FROM) ) {
                alt108=1;
            }
            else if ( (LA108_0==AT) ) {
                int LA108_2 = input.LA(2);

                if ( (LA108_2==LEAST||LA108_2==MOST) ) {
                    alt108=1;
                }
            }
            switch (alt108) {
                case 1 :
                    // etc/XQFT.g:671:81: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID8416);
                    ftRange462=ftRange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftRange462.getTree());
                    LEVELS463=(Token)input.LT(1);
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID8418); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LEVELS463_tree = (XQFTTree)adaptor.create(LEVELS463);
                    adaptor.addChild(root_0, LEVELS463_tree);
                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftThesaurusID

    public static class ftStopwordOption_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftStopwordOption
    // etc/XQFT.g:680:2: ftStopwordOption : ( STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );
    public final ftStopwordOption_return ftStopwordOption() throws RecognitionException {
        ftStopwordOption_return retval = new ftStopwordOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token STOP464=null;
        Token WORDS465=null;
        Token DEFAULT468=null;
        Token STOP469=null;
        Token WORDS470=null;
        ftRefOrList_return ftRefOrList466 = null;

        ftInclExclStringLiteral_return ftInclExclStringLiteral467 = null;

        ftInclExclStringLiteral_return ftInclExclStringLiteral471 = null;


        XQFTTree STOP464_tree=null;
        XQFTTree WORDS465_tree=null;
        XQFTTree DEFAULT468_tree=null;
        XQFTTree STOP469_tree=null;
        XQFTTree WORDS470_tree=null;

        try {
            // etc/XQFT.g:680:33: ( STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==STOP) ) {
                alt111=1;
            }
            else if ( (LA111_0==DEFAULT) ) {
                alt111=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("680:2: ftStopwordOption : ( STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:680:35: STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STOP464=(Token)input.LT(1);
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption8513); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STOP464_tree = (XQFTTree)adaptor.create(STOP464);
                    adaptor.addChild(root_0, STOP464_tree);
                    }
                    WORDS465=(Token)input.LT(1);
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption8515); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WORDS465_tree = (XQFTTree)adaptor.create(WORDS465);
                    adaptor.addChild(root_0, WORDS465_tree);
                    }
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption8517);
                    ftRefOrList466=ftRefOrList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftRefOrList466.getTree());
                    // etc/XQFT.g:680:58: ( ftInclExclStringLiteral )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==EXCEPT||LA109_0==UNION) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // etc/XQFT.g:680:58: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption8519);
                    	    ftInclExclStringLiteral467=ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, ftInclExclStringLiteral467.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:681:38: DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    DEFAULT468=(Token)input.LT(1);
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption8559); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DEFAULT468_tree = (XQFTTree)adaptor.create(DEFAULT468);
                    adaptor.addChild(root_0, DEFAULT468_tree);
                    }
                    STOP469=(Token)input.LT(1);
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption8561); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STOP469_tree = (XQFTTree)adaptor.create(STOP469);
                    adaptor.addChild(root_0, STOP469_tree);
                    }
                    WORDS470=(Token)input.LT(1);
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption8563); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WORDS470_tree = (XQFTTree)adaptor.create(WORDS470);
                    adaptor.addChild(root_0, WORDS470_tree);
                    }
                    // etc/XQFT.g:681:57: ( ftInclExclStringLiteral )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==EXCEPT||LA110_0==UNION) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // etc/XQFT.g:681:57: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption8565);
                    	    ftInclExclStringLiteral471=ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, ftInclExclStringLiteral471.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop110;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftStopwordOption

    public static class ftRefOrList_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftRefOrList
    // etc/XQFT.g:683:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );
    public final ftRefOrList_return ftRefOrList() throws RecognitionException {
        ftRefOrList_return retval = new ftRefOrList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AT472=null;
        Token LPARSi474=null;
        Token StringLiteral475=null;
        Token COMMASi476=null;
        Token StringLiteral477=null;
        Token RPARSi478=null;
        uriLiteral_return uriLiteral473 = null;


        XQFTTree AT472_tree=null;
        XQFTTree LPARSi474_tree=null;
        XQFTTree StringLiteral475_tree=null;
        XQFTTree COMMASi476_tree=null;
        XQFTTree StringLiteral477_tree=null;
        XQFTTree RPARSi478_tree=null;

        try {
            // etc/XQFT.g:683:34: ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==AT) ) {
                alt113=1;
            }
            else if ( (LA113_0==LPARSi) ) {
                alt113=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("683:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // etc/XQFT.g:683:36: ( AT uriLiteral )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:683:36: ( AT uriLiteral )
                    // etc/XQFT.g:683:37: AT uriLiteral
                    {
                    AT472=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_ftRefOrList8631); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT472_tree = (XQFTTree)adaptor.create(AT472);
                    adaptor.addChild(root_0, AT472_tree);
                    }
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList8633);
                    uriLiteral473=uriLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral473.getTree());

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:684:15: LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    LPARSi474=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftRefOrList8650); if (failed) return retval;
                    StringLiteral475=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList8653); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral475_tree = (XQFTTree)adaptor.create(StringLiteral475);
                    adaptor.addChild(root_0, StringLiteral475_tree);
                    }
                    // etc/XQFT.g:684:37: ( COMMASi StringLiteral )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==COMMASi) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // etc/XQFT.g:684:38: COMMASi StringLiteral
                    	    {
                    	    COMMASi476=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList8656); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    COMMASi476_tree = (XQFTTree)adaptor.create(COMMASi476);
                    	    adaptor.addChild(root_0, COMMASi476_tree);
                    	    }
                    	    StringLiteral477=(Token)input.LT(1);
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList8658); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    StringLiteral477_tree = (XQFTTree)adaptor.create(StringLiteral477);
                    	    adaptor.addChild(root_0, StringLiteral477_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    RPARSi478=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftRefOrList8662); if (failed) return retval;

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftRefOrList

    public static class ftInclExclStringLiteral_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ftInclExclStringLiteral
    // etc/XQFT.g:686:3: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final ftInclExclStringLiteral_return ftInclExclStringLiteral() throws RecognitionException {
        ftInclExclStringLiteral_return retval = new ftInclExclStringLiteral_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set479=null;
        ftRefOrList_return ftRefOrList480 = null;


        XQFTTree set479_tree=null;

        try {
            // etc/XQFT.g:686:34: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:686:36: ( UNION | EXCEPT ) ftRefOrList
            {
            root_0 = (XQFTTree)adaptor.nil();

            set479=(Token)input.LT(1);
            if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set479));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral8680);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral8688);
            ftRefOrList480=ftRefOrList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftRefOrList480.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ftInclExclStringLiteral

    public static class valueExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start valueExpr
    // etc/XQFT.g:690:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final valueExpr_return valueExpr() throws RecognitionException {
        valueExpr_return retval = new valueExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        validateExpr_return validateExpr481 = null;

        pathExpr_return pathExpr482 = null;

        extensionExpr_return extensionExpr483 = null;



        try {
            // etc/XQFT.g:690:32: ( validateExpr | pathExpr | extensionExpr )
            int alt114=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==EOF||LA114_1==AND||LA114_1==ASCENDING||(LA114_1>=CASE && LA114_1<=CASTABLE)||LA114_1==COLLATION||LA114_1==DEFAULT||LA114_1==DESCENDING||LA114_1==DIV||LA114_1==ELSE||LA114_1==EMPTY||LA114_1==EQ||LA114_1==EXCEPT||LA114_1==FOR||LA114_1==FTCONTAINS||LA114_1==GE||(LA114_1>=GT && LA114_1<=IDIV)||(LA114_1>=INSTANCE && LA114_1<=IS)||LA114_1==LE||(LA114_1>=LET && LA114_1<=LEVELS)||(LA114_1>=LT && LA114_1<=MOD)||LA114_1==NE||(LA114_1>=OR && LA114_1<=ORDER)||LA114_1==PARAGRAPHS||LA114_1==RETURN||LA114_1==SATISFIES||LA114_1==SENTENCES||LA114_1==STABLE||(LA114_1>=TIMES && LA114_1<=TREAT)||LA114_1==UNION||LA114_1==WHERE||LA114_1==WITHOUT||LA114_1==WORDS||(LA114_1>=SEMICOLONSi && LA114_1<=COMMASi)||(LA114_1>=COLONSi && LA114_1<=RPARSi)||LA114_1==RBRACSi||(LA114_1>=STARSi && LA114_1<=NODEAFTERSi)||(LA114_1>=SLASHSi && LA114_1<=DBLSLASHSi)||(LA114_1>=LBRACKSi && LA114_1<=RBRACKSi)) ) {
                    alt114=2;
                }
                else if ( (LA114_1==LAX||LA114_1==STRICT||LA114_1==LBRACESi) ) {
                    alt114=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("690:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 114, 1, input);

                    throw nvae;
                }
                }
                break;
            case ALL:
            case ANY:
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case ATTRIBUTE:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case CHILD:
            case COLLATION:
            case COMMENT:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case ITEM:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NODE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERED:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PARENT:
            case PHRASE:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PRESERVE:
            case PROCESSING_INSTRUCTION:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCHEMA_ATTRIBUTE:
            case SCHEMA_ELEMENT:
            case SCORE:
            case SELF:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case TEXT:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UNORDERED:
            case UPPERCASE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case StringLiteral:
            case DOLLARSi:
            case LPARSi:
            case STARSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case SLASHSi:
            case DBLSLASHSi:
            case DOTDOTSi:
            case ATSi:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
            case NCName:
                {
                alt114=2;
                }
                break;
            case LPRAGSi:
                {
                alt114=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("690:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // etc/XQFT.g:690:34: validateExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_validateExpr_in_valueExpr8722);
                    validateExpr481=validateExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, validateExpr481.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:690:49: pathExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_pathExpr_in_valueExpr8726);
                    pathExpr482=pathExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pathExpr482.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:690:60: extensionExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_extensionExpr_in_valueExpr8730);
                    extensionExpr483=extensionExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, extensionExpr483.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end valueExpr

    public static class validateExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start validateExpr
    // etc/XQFT.g:693:2: validateExpr : VALIDATE ( validationMode )? LBRACESi expr RBRACSi ;
    public final validateExpr_return validateExpr() throws RecognitionException {
        validateExpr_return retval = new validateExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token VALIDATE484=null;
        Token LBRACESi486=null;
        Token RBRACSi488=null;
        validationMode_return validationMode485 = null;

        expr_return expr487 = null;


        XQFTTree VALIDATE484_tree=null;
        XQFTTree LBRACESi486_tree=null;
        XQFTTree RBRACSi488_tree=null;

        try {
            // etc/XQFT.g:693:33: ( VALIDATE ( validationMode )? LBRACESi expr RBRACSi )
            // etc/XQFT.g:693:35: VALIDATE ( validationMode )? LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            VALIDATE484=(Token)input.LT(1);
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr8758); if (failed) return retval;
            if ( backtracking==0 ) {
            VALIDATE484_tree = (XQFTTree)adaptor.create(VALIDATE484);
            adaptor.addChild(root_0, VALIDATE484_tree);
            }
            // etc/XQFT.g:693:44: ( validationMode )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==LAX||LA115_0==STRICT) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:693:44: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr8760);
                    validationMode485=validationMode();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, validationMode485.getTree());

                    }
                    break;

            }

            LBRACESi486=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_validateExpr8763); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_validateExpr8766);
            expr487=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr487.getTree());
            RBRACSi488=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_validateExpr8768); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end validateExpr

    public static class validationMode_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start validationMode
    // etc/XQFT.g:694:3: validationMode : ( LAX | STRICT );
    public final validationMode_return validationMode() throws RecognitionException {
        validationMode_return retval = new validationMode_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set489=null;

        XQFTTree set489_tree=null;

        try {
            // etc/XQFT.g:694:34: ( LAX | STRICT )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set489=(Token)input.LT(1);
            if ( input.LA(1)==LAX||input.LA(1)==STRICT ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set489));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_validationMode0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end validationMode

    public static class pathExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start pathExpr
    // etc/XQFT.g:699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );
    public final pathExpr_return pathExpr() throws RecognitionException {
        pathExpr_return retval = new pathExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token SLASHSi490=null;
        Token SLASHSi492=null;
        Token DBLSLASHSi493=null;
        relativePathExpr_return relativePathExpr491 = null;

        relativePathExpr_return relativePathExpr494 = null;

        relativePathExpr_return relativePathExpr495 = null;


        XQFTTree SLASHSi490_tree=null;
        XQFTTree SLASHSi492_tree=null;
        XQFTTree DBLSLASHSi493_tree=null;

        try {
            // etc/XQFT.g:699:33: ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr )
            int alt116=4;
            switch ( input.LA(1) ) {
            case SLASHSi:
                {
                int LA116_1 = input.LA(2);

                if ( ((LA116_1>=ANCESTOR && LA116_1<=ANCESTOR_OR_SELF)||LA116_1==PARENT||(LA116_1>=PRECEDING && LA116_1<=PRECEDING_SIBLING)) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==DOTDOTSi) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==ATTRIBUTE) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==ATSi) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==DOCUMENT_NODE) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==ELEMENT) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==CHILD||(LA116_1>=DESCENDANT && LA116_1<=DESCENDANT_OR_SELF)||(LA116_1>=FOLLOWING && LA116_1<=FOLLOWING_SIBLING)||LA116_1==SELF) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==SCHEMA_ELEMENT) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==SCHEMA_ATTRIBUTE) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==PROCESSING_INSTRUCTION) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==COMMENT) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==TEXT) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==NODE) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==STARSi) ) {
                    int LA116_42 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 42, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==ORDERED) && (synpred5())) {
                    alt116=1;
                }
                else if ( ((LA116_1>=IntegerLiteral && LA116_1<=DoubleLiteral)) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==StringLiteral) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==DOLLARSi) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==LPARSi) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==DOTSi) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==UNORDERED) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==DOCUMENT) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==LTSi) ) {
                    int LA116_51 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 51, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==LCOMMENTSi) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==LPISi) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==CAST) ) {
                    int LA116_54 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 54, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==CASTABLE) ) {
                    int LA116_55 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 55, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==TREAT) ) {
                    int LA116_56 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 56, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==INSTANCE) ) {
                    int LA116_57 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 57, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==EXCEPT||LA116_1==INTERSECT) ) {
                    int LA116_58 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 58, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==UNION) ) {
                    int LA116_59 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 59, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==DIV||LA116_1==IDIV||LA116_1==MOD) ) {
                    int LA116_60 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 60, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==EOF||(LA116_1>=SEMICOLONSi && LA116_1<=COMMASi)||LA116_1==RPARSi||LA116_1==RBRACSi||(LA116_1>=PLUSSi && LA116_1<=NEQSi)||(LA116_1>=LTOREQSi && LA116_1<=NODEAFTERSi)||LA116_1==RBRACKSi) ) {
                    alt116=2;
                }
                else if ( (LA116_1==TO) ) {
                    int LA116_62 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 62, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==FTCONTAINS) ) {
                    int LA116_64 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 64, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==EQ||LA116_1==GE||LA116_1==GT||LA116_1==LE||LA116_1==LT||LA116_1==NE) ) {
                    int LA116_65 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 65, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==IS) ) {
                    int LA116_66 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 66, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==AND) ) {
                    int LA116_68 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 68, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==OR) ) {
                    int LA116_70 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 70, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==WHERE) ) {
                    int LA116_71 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 71, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==ORDER) ) {
                    int LA116_78 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 78, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==STABLE) ) {
                    int LA116_79 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 79, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==RETURN) ) {
                    int LA116_80 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 80, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==FOR) ) {
                    int LA116_81 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 81, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==LET) ) {
                    int LA116_82 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 82, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==ASCENDING||LA116_1==DESCENDING) ) {
                    int LA116_83 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 83, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==EMPTY) ) {
                    int LA116_84 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 84, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==COLLATION) ) {
                    int LA116_85 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 85, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==SATISFIES) ) {
                    int LA116_86 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 86, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==DEFAULT) ) {
                    int LA116_87 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 87, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==CASE) ) {
                    int LA116_88 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 88, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==ELSE) ) {
                    int LA116_89 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 89, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==WITHOUT) ) {
                    int LA116_90 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 90, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==TIMES) ) {
                    int LA116_91 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 91, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==PARAGRAPHS||LA116_1==SENTENCES||LA116_1==WORDS) ) {
                    int LA116_92 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 92, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==LEVELS) ) {
                    int LA116_93 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 93, input);

                        throw nvae;
                    }
                }
                else if ( ((LA116_1>=ALL && LA116_1<=ANY)||LA116_1==AS||LA116_1==AT||(LA116_1>=BASE_URI && LA116_1<=BOUNDARYSPACE)||(LA116_1>=CONSTRUCTION && LA116_1<=DECLARE)||(LA116_1>=DIACRITICS && LA116_1<=DISTANCE)||(LA116_1>=ENCODING && LA116_1<=ENTIRE)||LA116_1==EMPTY_SEQUENCE||(LA116_1>=EVERY && LA116_1<=EXACTLY)||LA116_1==EXTERNAL||(LA116_1>=FROM && LA116_1<=FTAND)||(LA116_1>=FTNOT && LA116_1<=FUNCTION)||LA116_1==GREATEST||(LA116_1>=IF && LA116_1<=INSENSITIVE)||(LA116_1>=ITEM && LA116_1<=LAX)||LA116_1==LEAST||LA116_1==LOWERCASE||(LA116_1>=MODULE && LA116_1<=NAMESPACE)||(LA116_1>=NOINHERIT && LA116_1<=OPTION)||(LA116_1>=ORDERING && LA116_1<=PARAGRAPH)||LA116_1==PHRASE||LA116_1==PRESERVE||LA116_1==RELATIONSHIP||LA116_1==SAME||LA116_1==SCHEMA||LA116_1==SCORE||LA116_1==SENSITIVE||(LA116_1>=SENTENCE && LA116_1<=SOME)||(LA116_1>=START && LA116_1<=STRIP)||(LA116_1>=THESAURUS && LA116_1<=THEN)||LA116_1==TYPESWITCH||(LA116_1>=UPPERCASE && LA116_1<=WEIGHT)||(LA116_1>=WILDCARDS && LA116_1<=WITH)||LA116_1==WORD||LA116_1==XQUERY||LA116_1==NCName) && (synpred5())) {
                    alt116=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 1, input);

                    throw nvae;
                }
                }
                break;
            case DBLSLASHSi:
                {
                alt116=3;
                }
                break;
            case ALL:
            case ANY:
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case ATTRIBUTE:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case CHILD:
            case COLLATION:
            case COMMENT:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case ITEM:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NODE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERED:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PARENT:
            case PHRASE:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PRESERVE:
            case PROCESSING_INSTRUCTION:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCHEMA_ATTRIBUTE:
            case SCHEMA_ELEMENT:
            case SCORE:
            case SELF:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case TEXT:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UNORDERED:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case StringLiteral:
            case DOLLARSi:
            case LPARSi:
            case STARSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case DOTDOTSi:
            case ATSi:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
            case NCName:
                {
                alt116=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("699:2: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // etc/XQFT.g:699:34: ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    SLASHSi490=(Token)input.LT(1);
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr8844); if (failed) return retval;
                    if ( backtracking==0 ) {
                    SLASHSi490_tree = (XQFTTree)adaptor.create(SLASHSi490);
                    root_0 = (XQFTTree)adaptor.becomeRoot(SLASHSi490_tree, root_0);
                    }
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr8847);
                    relativePathExpr491=relativePathExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, relativePathExpr491.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:700:14: SLASHSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    SLASHSi492=(Token)input.LT(1);
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr8862); if (failed) return retval;
                    if ( backtracking==0 ) {
                    SLASHSi492_tree = (XQFTTree)adaptor.create(SLASHSi492);
                    root_0 = (XQFTTree)adaptor.becomeRoot(SLASHSi492_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:701:14: DBLSLASHSi relativePathExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    DBLSLASHSi493=(Token)input.LT(1);
                    match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_pathExpr8878); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DBLSLASHSi493_tree = (XQFTTree)adaptor.create(DBLSLASHSi493);
                    root_0 = (XQFTTree)adaptor.becomeRoot(DBLSLASHSi493_tree, root_0);
                    }
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr8881);
                    relativePathExpr494=relativePathExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, relativePathExpr494.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:702:14: relativePathExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr8896);
                    relativePathExpr495=relativePathExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, relativePathExpr495.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end pathExpr

    public static class relativePathExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relativePathExpr
    // etc/XQFT.g:705:3: relativePathExpr : stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* ;
    public final relativePathExpr_return relativePathExpr() throws RecognitionException {
        relativePathExpr_return retval = new relativePathExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token SLASHSi497=null;
        Token DBLSLASHSi498=null;
        stepExpr_return stepExpr496 = null;

        stepExpr_return stepExpr499 = null;


        XQFTTree SLASHSi497_tree=null;
        XQFTTree DBLSLASHSi498_tree=null;

        try {
            // etc/XQFT.g:705:34: ( stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* )
            // etc/XQFT.g:705:36: stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_stepExpr_in_relativePathExpr8932);
            stepExpr496=stepExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, stepExpr496.getTree());
            // etc/XQFT.g:705:45: ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( ((LA118_0>=SLASHSi && LA118_0<=DBLSLASHSi)) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // etc/XQFT.g:705:46: ( SLASHSi | DBLSLASHSi ) stepExpr
            	    {
            	    // etc/XQFT.g:705:46: ( SLASHSi | DBLSLASHSi )
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==SLASHSi) ) {
            	        alt117=1;
            	    }
            	    else if ( (LA117_0==DBLSLASHSi) ) {
            	        alt117=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("705:46: ( SLASHSi | DBLSLASHSi )", 117, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // etc/XQFT.g:705:47: SLASHSi
            	            {
            	            SLASHSi497=(Token)input.LT(1);
            	            match(input,SLASHSi,FOLLOW_SLASHSi_in_relativePathExpr8936); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            SLASHSi497_tree = (XQFTTree)adaptor.create(SLASHSi497);
            	            root_0 = (XQFTTree)adaptor.becomeRoot(SLASHSi497_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:705:58: DBLSLASHSi
            	            {
            	            DBLSLASHSi498=(Token)input.LT(1);
            	            match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_relativePathExpr8941); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DBLSLASHSi498_tree = (XQFTTree)adaptor.create(DBLSLASHSi498);
            	            root_0 = (XQFTTree)adaptor.becomeRoot(DBLSLASHSi498_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr8945);
            	    stepExpr499=stepExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, stepExpr499.getTree());

            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end relativePathExpr

    public static class stepExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start stepExpr
    // etc/XQFT.g:707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );
    public final stepExpr_return stepExpr() throws RecognitionException {
        stepExpr_return retval = new stepExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        axisStep_return axisStep500 = null;

        axisStep_return axisStep501 = null;

        filterExpr_return filterExpr502 = null;



        try {
            // etc/XQFT.g:707:35: ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr )
            int alt119=3;
            switch ( input.LA(1) ) {
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
                {
                int LA119_1 = input.LA(2);

                if ( ((LA119_1>=COLONSi && LA119_1<=LPARSi)) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 1, input);

                    throw nvae;
                }
                }
                break;
            case DOTDOTSi:
                {
                int LA119_2 = input.LA(2);

                if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 2, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA119_3 = input.LA(2);

                if ( ((LA119_3>=ALL && LA119_3<=XQUERY)||(LA119_3>=COLONSi && LA119_3<=LPARSi)||LA119_3==LBRACESi||LA119_3==NCName) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 3, input);

                    throw nvae;
                }
                }
                break;
            case ATSi:
                {
                switch ( input.LA(2) ) {
                case DOCUMENT_NODE:
                    {
                    int LA119_167 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 167, input);

                        throw nvae;
                    }
                    }
                    break;
                case ELEMENT:
                    {
                    int LA119_168 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 168, input);

                        throw nvae;
                    }
                    }
                    break;
                case ATTRIBUTE:
                    {
                    int LA119_169 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 169, input);

                        throw nvae;
                    }
                    }
                    break;
                case SCHEMA_ELEMENT:
                    {
                    int LA119_170 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 170, input);

                        throw nvae;
                    }
                    }
                    break;
                case SCHEMA_ATTRIBUTE:
                    {
                    int LA119_171 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 171, input);

                        throw nvae;
                    }
                    }
                    break;
                case PROCESSING_INSTRUCTION:
                    {
                    int LA119_172 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 172, input);

                        throw nvae;
                    }
                    }
                    break;
                case COMMENT:
                    {
                    int LA119_173 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 173, input);

                        throw nvae;
                    }
                    }
                    break;
                case TEXT:
                    {
                    int LA119_174 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 174, input);

                        throw nvae;
                    }
                    }
                    break;
                case NODE:
                    {
                    int LA119_175 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 175, input);

                        throw nvae;
                    }
                    }
                    break;
                case STARSi:
                    {
                    int LA119_176 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 176, input);

                        throw nvae;
                    }
                    }
                    break;
                case ALL:
                case ANY:
                case ANCESTOR:
                case ANCESTOR_OR_SELF:
                case AND:
                case AS:
                case ASCENDING:
                case AT:
                case BASE_URI:
                case BY:
                case BOUNDARYSPACE:
                case CASE:
                case CAST:
                case CASTABLE:
                case CHILD:
                case COLLATION:
                case CONSTRUCTION:
                case CONTENT:
                case COPY_NAMESPACES:
                case DECLARE:
                case DEFAULT:
                case DESCENDANT:
                case DESCENDANT_OR_SELF:
                case DESCENDING:
                case DIACRITICS:
                case DIFFERENT:
                case DISTANCE:
                case DIV:
                case DOCUMENT:
                case ELSE:
                case ENCODING:
                case END:
                case ENTIRE:
                case EMPTY:
                case EMPTY_SEQUENCE:
                case EQ:
                case EVERY:
                case EXACTLY:
                case EXCEPT:
                case EXTERNAL:
                case FOLLOWING:
                case FOLLOWING_SIBLING:
                case FOR:
                case FROM:
                case FTAND:
                case FTCONTAINS:
                case FTNOT:
                case FTOPTION:
                case FTOR:
                case FUNCTION:
                case GE:
                case GREATEST:
                case GT:
                case IDIV:
                case IF:
                case IMPORT:
                case IN:
                case INHERIT:
                case INSENSITIVE:
                case INSTANCE:
                case INTERSECT:
                case IS:
                case ITEM:
                case LANGUAGE:
                case LAX:
                case LE:
                case LEAST:
                case LET:
                case LEVELS:
                case LOWERCASE:
                case LT:
                case MOD:
                case MODULE:
                case MOST:
                case NAMESPACE:
                case NE:
                case NOINHERIT:
                case NOPRESERVE:
                case NOT:
                case OCCURS:
                case OF:
                case OPTION:
                case OR:
                case ORDER:
                case ORDERED:
                case ORDERING:
                case PARAGRAPH:
                case PARAGRAPHS:
                case PARENT:
                case PHRASE:
                case PRECEDING:
                case PRECEDING_SIBLING:
                case PRESERVE:
                case RELATIONSHIP:
                case RETURN:
                case SAME:
                case SATISFIES:
                case SCHEMA:
                case SCORE:
                case SELF:
                case SENSITIVE:
                case SENTENCES:
                case SENTENCE:
                case SOME:
                case STABLE:
                case START:
                case STEMMING:
                case STOP:
                case STRICT:
                case STRIP:
                case THESAURUS:
                case THEN:
                case TIMES:
                case TO:
                case TREAT:
                case TYPESWITCH:
                case UNION:
                case UNORDERED:
                case UPPERCASE:
                case VALIDATE:
                case VARIABLE:
                case VERSION:
                case WEIGHT:
                case WHERE:
                case WILDCARDS:
                case WINDOW:
                case WITH:
                case WITHOUT:
                case WORD:
                case WORDS:
                case XQUERY:
                case NCName:
                    {
                    int LA119_177 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 177, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 4, input);

                    throw nvae;
                }

                }
                break;
            case DOCUMENT_NODE:
                {
                int LA119_5 = input.LA(2);

                if ( ((LA119_5>=COLONSi && LA119_5<=LPARSi)) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 5, input);

                    throw nvae;
                }
                }
                break;
            case ELEMENT:
                {
                int LA119_6 = input.LA(2);

                if ( ((LA119_6>=ALL && LA119_6<=XQUERY)||(LA119_6>=COLONSi && LA119_6<=LPARSi)||LA119_6==LBRACESi||LA119_6==NCName) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 6, input);

                    throw nvae;
                }
                }
                break;
            case CHILD:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case SELF:
                {
                int LA119_7 = input.LA(2);

                if ( ((LA119_7>=COLONSi && LA119_7<=LPARSi)) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 7, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ELEMENT:
                {
                int LA119_8 = input.LA(2);

                if ( ((LA119_8>=COLONSi && LA119_8<=LPARSi)) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 8, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ATTRIBUTE:
                {
                int LA119_9 = input.LA(2);

                if ( ((LA119_9>=COLONSi && LA119_9<=LPARSi)) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 9, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA119_10 = input.LA(2);

                if ( ((LA119_10>=ALL && LA119_10<=XQUERY)||(LA119_10>=COLONSi && LA119_10<=LPARSi)||LA119_10==LBRACESi||LA119_10==NCName) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 10, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA119_11 = input.LA(2);

                if ( ((LA119_11>=COLONSi && LA119_11<=LPARSi)||LA119_11==LBRACESi) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 11, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA119_12 = input.LA(2);

                if ( ((LA119_12>=COLONSi && LA119_12<=LPARSi)||LA119_12==LBRACESi) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 12, input);

                    throw nvae;
                }
                }
                break;
            case NODE:
                {
                int LA119_13 = input.LA(2);

                if ( ((LA119_13>=COLONSi && LA119_13<=LPARSi)) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 13, input);

                    throw nvae;
                }
                }
                break;
            case STARSi:
                {
                int LA119_14 = input.LA(2);

                if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 14, input);

                    throw nvae;
                }
                }
                break;
            case ORDERED:
                {
                int LA119_15 = input.LA(2);

                if ( ((LA119_15>=COLONSi && LA119_15<=LPARSi)||LA119_15==LBRACESi) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 15, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
            case DOLLARSi:
            case LPARSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt119=3;
                }
                break;
            case UNORDERED:
                {
                int LA119_21 = input.LA(2);

                if ( ((LA119_21>=COLONSi && LA119_21<=LPARSi)||LA119_21==LBRACESi) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 21, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENT:
                {
                int LA119_22 = input.LA(2);

                if ( ((LA119_22>=COLONSi && LA119_22<=LPARSi)||LA119_22==LBRACESi) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 22, input);

                    throw nvae;
                }
                }
                break;
            case ALL:
            case ANY:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case COLLATION:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case ITEM:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PHRASE:
            case PRESERVE:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCORE:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case NCName:
                {
                int LA119_26 = input.LA(2);

                if ( ((LA119_26>=COLONSi && LA119_26<=LPARSi)) ) {
                    alt119=3;
                }
                else if ( (synpred6()) ) {
                    alt119=1;
                }
                else if ( (true) ) {
                    alt119=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 26, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("707:4: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:708:15: ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_axisStep_in_stepExpr9080);
                    axisStep500=axisStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, axisStep500.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:712:16: axisStep
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_axisStep_in_stepExpr9097);
                    axisStep501=axisStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, axisStep501.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:713:16: filterExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_filterExpr_in_stepExpr9114);
                    filterExpr502=filterExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, filterExpr502.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end stepExpr

    public static class axisStep_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start axisStep
    // etc/XQFT.g:716:4: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final axisStep_return axisStep() throws RecognitionException {
        axisStep_return retval = new axisStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        reverseStep_return reverseStep503 = null;

        forwardStep_return forwardStep504 = null;

        predicateList_return predicateList505 = null;



        try {
            // etc/XQFT.g:716:35: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:716:37: ( reverseStep | forwardStep ) predicateList
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:716:37: ( reverseStep | forwardStep )
            int alt120=2;
            switch ( input.LA(1) ) {
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
                {
                int LA120_1 = input.LA(2);

                if ( (LA120_1==DBLCOLONSi) ) {
                    alt120=1;
                }
                else if ( (LA120_1==EOF||LA120_1==AND||LA120_1==ASCENDING||(LA120_1>=CASE && LA120_1<=CASTABLE)||LA120_1==COLLATION||LA120_1==DEFAULT||LA120_1==DESCENDING||LA120_1==DIV||LA120_1==ELSE||LA120_1==EMPTY||LA120_1==EQ||LA120_1==EXCEPT||LA120_1==FOR||LA120_1==FTCONTAINS||LA120_1==GE||(LA120_1>=GT && LA120_1<=IDIV)||(LA120_1>=INSTANCE && LA120_1<=IS)||LA120_1==LE||(LA120_1>=LET && LA120_1<=LEVELS)||(LA120_1>=LT && LA120_1<=MOD)||LA120_1==NE||(LA120_1>=OR && LA120_1<=ORDER)||LA120_1==PARAGRAPHS||LA120_1==RETURN||LA120_1==SATISFIES||LA120_1==SENTENCES||LA120_1==STABLE||(LA120_1>=TIMES && LA120_1<=TREAT)||LA120_1==UNION||LA120_1==WHERE||LA120_1==WITHOUT||LA120_1==WORDS||(LA120_1>=SEMICOLONSi && LA120_1<=COMMASi)||LA120_1==COLONSi||LA120_1==RPARSi||LA120_1==RBRACSi||(LA120_1>=STARSi && LA120_1<=NODEAFTERSi)||(LA120_1>=SLASHSi && LA120_1<=DBLSLASHSi)||(LA120_1>=LBRACKSi && LA120_1<=RBRACKSi)) ) {
                    alt120=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("716:37: ( reverseStep | forwardStep )", 120, 1, input);

                    throw nvae;
                }
                }
                break;
            case DOTDOTSi:
                {
                alt120=1;
                }
                break;
            case ALL:
            case ANY:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case ATTRIBUTE:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case CHILD:
            case COLLATION:
            case COMMENT:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case ITEM:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NODE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERED:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PHRASE:
            case PRESERVE:
            case PROCESSING_INSTRUCTION:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCHEMA_ATTRIBUTE:
            case SCHEMA_ELEMENT:
            case SCORE:
            case SELF:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case TEXT:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UNORDERED:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case STARSi:
            case ATSi:
            case NCName:
                {
                alt120=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("716:37: ( reverseStep | forwardStep )", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:716:38: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep9162);
                    reverseStep503=reverseStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, reverseStep503.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:716:52: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep9166);
                    forwardStep504=forwardStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, forwardStep504.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep9170);
            predicateList505=predicateList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, predicateList505.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end axisStep

    public static class reverseStep_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start reverseStep
    // etc/XQFT.g:718:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );
    public final reverseStep_return reverseStep() throws RecognitionException {
        reverseStep_return retval = new reverseStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        reverseAxis_return reverseAxis506 = null;

        nodeTest_return nodeTest507 = null;

        abbrevReverseStep_return abbrevReverseStep508 = null;



        try {
            // etc/XQFT.g:718:36: ( reverseAxis nodeTest | abbrevReverseStep )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( ((LA121_0>=ANCESTOR && LA121_0<=ANCESTOR_OR_SELF)||LA121_0==PARENT||(LA121_0>=PRECEDING && LA121_0<=PRECEDING_SIBLING)) ) {
                alt121=1;
            }
            else if ( (LA121_0==DOTDOTSi) ) {
                alt121=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("718:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // etc/XQFT.g:718:38: reverseAxis nodeTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_reverseAxis_in_reverseStep9204);
                    reverseAxis506=reverseAxis();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, reverseAxis506.getTree());
                    pushFollow(FOLLOW_nodeTest_in_reverseStep9206);
                    nodeTest507=nodeTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, nodeTest507.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:718:61: abbrevReverseStep
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep9210);
                    abbrevReverseStep508=abbrevReverseStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, abbrevReverseStep508.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end reverseStep

    public static class reverseAxis_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start reverseAxis
    // etc/XQFT.g:719:6: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi ;
    public final reverseAxis_return reverseAxis() throws RecognitionException {
        reverseAxis_return retval = new reverseAxis_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set509=null;
        Token DBLCOLONSi510=null;

        XQFTTree set509_tree=null;
        XQFTTree DBLCOLONSi510_tree=null;

        try {
            // etc/XQFT.g:719:37: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi )
            // etc/XQFT.g:719:39: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            set509=(Token)input.LT(1);
            if ( (input.LA(1)>=ANCESTOR && input.LA(1)<=ANCESTOR_OR_SELF)||input.LA(1)==PARENT||(input.LA(1)>=PRECEDING && input.LA(1)<=PRECEDING_SIBLING) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set509));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis9241);    throw mse;
            }

            DBLCOLONSi510=(Token)input.LT(1);
            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_reverseAxis9261); if (failed) return retval;
            if ( backtracking==0 ) {
            DBLCOLONSi510_tree = (XQFTTree)adaptor.create(DBLCOLONSi510);
            adaptor.addChild(root_0, DBLCOLONSi510_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end reverseAxis

    public static class nodeTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nodeTest
    // etc/XQFT.g:720:6: nodeTest : ( kindTest | nameTest );
    public final nodeTest_return nodeTest() throws RecognitionException {
        nodeTest_return retval = new nodeTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        kindTest_return kindTest511 = null;

        nameTest_return nameTest512 = null;



        try {
            // etc/XQFT.g:720:37: ( kindTest | nameTest )
            int alt122=2;
            switch ( input.LA(1) ) {
            case DOCUMENT_NODE:
                {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_1==EOF||LA122_1==AND||LA122_1==ASCENDING||(LA122_1>=CASE && LA122_1<=CASTABLE)||LA122_1==COLLATION||LA122_1==DEFAULT||LA122_1==DESCENDING||LA122_1==DIV||LA122_1==ELSE||LA122_1==EMPTY||LA122_1==EQ||LA122_1==EXCEPT||LA122_1==FOR||LA122_1==FTCONTAINS||LA122_1==GE||(LA122_1>=GT && LA122_1<=IDIV)||(LA122_1>=INSTANCE && LA122_1<=IS)||LA122_1==LE||(LA122_1>=LET && LA122_1<=LEVELS)||(LA122_1>=LT && LA122_1<=MOD)||LA122_1==NE||(LA122_1>=OR && LA122_1<=ORDER)||LA122_1==PARAGRAPHS||LA122_1==RETURN||LA122_1==SATISFIES||LA122_1==SENTENCES||LA122_1==STABLE||(LA122_1>=TIMES && LA122_1<=TREAT)||LA122_1==UNION||LA122_1==WHERE||LA122_1==WITHOUT||LA122_1==WORDS||(LA122_1>=SEMICOLONSi && LA122_1<=COMMASi)||LA122_1==COLONSi||LA122_1==RPARSi||LA122_1==RBRACSi||(LA122_1>=STARSi && LA122_1<=NODEAFTERSi)||(LA122_1>=SLASHSi && LA122_1<=DBLSLASHSi)||(LA122_1>=LBRACKSi && LA122_1<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 1, input);

                    throw nvae;
                }
                }
                break;
            case ELEMENT:
                {
                int LA122_2 = input.LA(2);

                if ( (LA122_2==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_2==EOF||LA122_2==AND||LA122_2==ASCENDING||(LA122_2>=CASE && LA122_2<=CASTABLE)||LA122_2==COLLATION||LA122_2==DEFAULT||LA122_2==DESCENDING||LA122_2==DIV||LA122_2==ELSE||LA122_2==EMPTY||LA122_2==EQ||LA122_2==EXCEPT||LA122_2==FOR||LA122_2==FTCONTAINS||LA122_2==GE||(LA122_2>=GT && LA122_2<=IDIV)||(LA122_2>=INSTANCE && LA122_2<=IS)||LA122_2==LE||(LA122_2>=LET && LA122_2<=LEVELS)||(LA122_2>=LT && LA122_2<=MOD)||LA122_2==NE||(LA122_2>=OR && LA122_2<=ORDER)||LA122_2==PARAGRAPHS||LA122_2==RETURN||LA122_2==SATISFIES||LA122_2==SENTENCES||LA122_2==STABLE||(LA122_2>=TIMES && LA122_2<=TREAT)||LA122_2==UNION||LA122_2==WHERE||LA122_2==WITHOUT||LA122_2==WORDS||(LA122_2>=SEMICOLONSi && LA122_2<=COMMASi)||LA122_2==COLONSi||LA122_2==RPARSi||LA122_2==RBRACSi||(LA122_2>=STARSi && LA122_2<=NODEAFTERSi)||(LA122_2>=SLASHSi && LA122_2<=DBLSLASHSi)||(LA122_2>=LBRACKSi && LA122_2<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 2, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA122_3 = input.LA(2);

                if ( (LA122_3==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_3==EOF||LA122_3==AND||LA122_3==ASCENDING||(LA122_3>=CASE && LA122_3<=CASTABLE)||LA122_3==COLLATION||LA122_3==DEFAULT||LA122_3==DESCENDING||LA122_3==DIV||LA122_3==ELSE||LA122_3==EMPTY||LA122_3==EQ||LA122_3==EXCEPT||LA122_3==FOR||LA122_3==FTCONTAINS||LA122_3==GE||(LA122_3>=GT && LA122_3<=IDIV)||(LA122_3>=INSTANCE && LA122_3<=IS)||LA122_3==LE||(LA122_3>=LET && LA122_3<=LEVELS)||(LA122_3>=LT && LA122_3<=MOD)||LA122_3==NE||(LA122_3>=OR && LA122_3<=ORDER)||LA122_3==PARAGRAPHS||LA122_3==RETURN||LA122_3==SATISFIES||LA122_3==SENTENCES||LA122_3==STABLE||(LA122_3>=TIMES && LA122_3<=TREAT)||LA122_3==UNION||LA122_3==WHERE||LA122_3==WITHOUT||LA122_3==WORDS||(LA122_3>=SEMICOLONSi && LA122_3<=COMMASi)||LA122_3==COLONSi||LA122_3==RPARSi||LA122_3==RBRACSi||(LA122_3>=STARSi && LA122_3<=NODEAFTERSi)||(LA122_3>=SLASHSi && LA122_3<=DBLSLASHSi)||(LA122_3>=LBRACKSi && LA122_3<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 3, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ELEMENT:
                {
                int LA122_4 = input.LA(2);

                if ( (LA122_4==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_4==EOF||LA122_4==AND||LA122_4==ASCENDING||(LA122_4>=CASE && LA122_4<=CASTABLE)||LA122_4==COLLATION||LA122_4==DEFAULT||LA122_4==DESCENDING||LA122_4==DIV||LA122_4==ELSE||LA122_4==EMPTY||LA122_4==EQ||LA122_4==EXCEPT||LA122_4==FOR||LA122_4==FTCONTAINS||LA122_4==GE||(LA122_4>=GT && LA122_4<=IDIV)||(LA122_4>=INSTANCE && LA122_4<=IS)||LA122_4==LE||(LA122_4>=LET && LA122_4<=LEVELS)||(LA122_4>=LT && LA122_4<=MOD)||LA122_4==NE||(LA122_4>=OR && LA122_4<=ORDER)||LA122_4==PARAGRAPHS||LA122_4==RETURN||LA122_4==SATISFIES||LA122_4==SENTENCES||LA122_4==STABLE||(LA122_4>=TIMES && LA122_4<=TREAT)||LA122_4==UNION||LA122_4==WHERE||LA122_4==WITHOUT||LA122_4==WORDS||(LA122_4>=SEMICOLONSi && LA122_4<=COMMASi)||LA122_4==COLONSi||LA122_4==RPARSi||LA122_4==RBRACSi||(LA122_4>=STARSi && LA122_4<=NODEAFTERSi)||(LA122_4>=SLASHSi && LA122_4<=DBLSLASHSi)||(LA122_4>=LBRACKSi && LA122_4<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 4, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ATTRIBUTE:
                {
                int LA122_5 = input.LA(2);

                if ( (LA122_5==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_5==EOF||LA122_5==AND||LA122_5==ASCENDING||(LA122_5>=CASE && LA122_5<=CASTABLE)||LA122_5==COLLATION||LA122_5==DEFAULT||LA122_5==DESCENDING||LA122_5==DIV||LA122_5==ELSE||LA122_5==EMPTY||LA122_5==EQ||LA122_5==EXCEPT||LA122_5==FOR||LA122_5==FTCONTAINS||LA122_5==GE||(LA122_5>=GT && LA122_5<=IDIV)||(LA122_5>=INSTANCE && LA122_5<=IS)||LA122_5==LE||(LA122_5>=LET && LA122_5<=LEVELS)||(LA122_5>=LT && LA122_5<=MOD)||LA122_5==NE||(LA122_5>=OR && LA122_5<=ORDER)||LA122_5==PARAGRAPHS||LA122_5==RETURN||LA122_5==SATISFIES||LA122_5==SENTENCES||LA122_5==STABLE||(LA122_5>=TIMES && LA122_5<=TREAT)||LA122_5==UNION||LA122_5==WHERE||LA122_5==WITHOUT||LA122_5==WORDS||(LA122_5>=SEMICOLONSi && LA122_5<=COMMASi)||LA122_5==COLONSi||LA122_5==RPARSi||LA122_5==RBRACSi||(LA122_5>=STARSi && LA122_5<=NODEAFTERSi)||(LA122_5>=SLASHSi && LA122_5<=DBLSLASHSi)||(LA122_5>=LBRACKSi && LA122_5<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 5, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA122_6 = input.LA(2);

                if ( (LA122_6==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_6==EOF||LA122_6==AND||LA122_6==ASCENDING||(LA122_6>=CASE && LA122_6<=CASTABLE)||LA122_6==COLLATION||LA122_6==DEFAULT||LA122_6==DESCENDING||LA122_6==DIV||LA122_6==ELSE||LA122_6==EMPTY||LA122_6==EQ||LA122_6==EXCEPT||LA122_6==FOR||LA122_6==FTCONTAINS||LA122_6==GE||(LA122_6>=GT && LA122_6<=IDIV)||(LA122_6>=INSTANCE && LA122_6<=IS)||LA122_6==LE||(LA122_6>=LET && LA122_6<=LEVELS)||(LA122_6>=LT && LA122_6<=MOD)||LA122_6==NE||(LA122_6>=OR && LA122_6<=ORDER)||LA122_6==PARAGRAPHS||LA122_6==RETURN||LA122_6==SATISFIES||LA122_6==SENTENCES||LA122_6==STABLE||(LA122_6>=TIMES && LA122_6<=TREAT)||LA122_6==UNION||LA122_6==WHERE||LA122_6==WITHOUT||LA122_6==WORDS||(LA122_6>=SEMICOLONSi && LA122_6<=COMMASi)||LA122_6==COLONSi||LA122_6==RPARSi||LA122_6==RBRACSi||(LA122_6>=STARSi && LA122_6<=NODEAFTERSi)||(LA122_6>=SLASHSi && LA122_6<=DBLSLASHSi)||(LA122_6>=LBRACKSi && LA122_6<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 6, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA122_7 = input.LA(2);

                if ( (LA122_7==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_7==EOF||LA122_7==AND||LA122_7==ASCENDING||(LA122_7>=CASE && LA122_7<=CASTABLE)||LA122_7==COLLATION||LA122_7==DEFAULT||LA122_7==DESCENDING||LA122_7==DIV||LA122_7==ELSE||LA122_7==EMPTY||LA122_7==EQ||LA122_7==EXCEPT||LA122_7==FOR||LA122_7==FTCONTAINS||LA122_7==GE||(LA122_7>=GT && LA122_7<=IDIV)||(LA122_7>=INSTANCE && LA122_7<=IS)||LA122_7==LE||(LA122_7>=LET && LA122_7<=LEVELS)||(LA122_7>=LT && LA122_7<=MOD)||LA122_7==NE||(LA122_7>=OR && LA122_7<=ORDER)||LA122_7==PARAGRAPHS||LA122_7==RETURN||LA122_7==SATISFIES||LA122_7==SENTENCES||LA122_7==STABLE||(LA122_7>=TIMES && LA122_7<=TREAT)||LA122_7==UNION||LA122_7==WHERE||LA122_7==WITHOUT||LA122_7==WORDS||(LA122_7>=SEMICOLONSi && LA122_7<=COMMASi)||LA122_7==COLONSi||LA122_7==RPARSi||LA122_7==RBRACSi||(LA122_7>=STARSi && LA122_7<=NODEAFTERSi)||(LA122_7>=SLASHSi && LA122_7<=DBLSLASHSi)||(LA122_7>=LBRACKSi && LA122_7<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 7, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA122_8 = input.LA(2);

                if ( (LA122_8==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_8==EOF||LA122_8==AND||LA122_8==ASCENDING||(LA122_8>=CASE && LA122_8<=CASTABLE)||LA122_8==COLLATION||LA122_8==DEFAULT||LA122_8==DESCENDING||LA122_8==DIV||LA122_8==ELSE||LA122_8==EMPTY||LA122_8==EQ||LA122_8==EXCEPT||LA122_8==FOR||LA122_8==FTCONTAINS||LA122_8==GE||(LA122_8>=GT && LA122_8<=IDIV)||(LA122_8>=INSTANCE && LA122_8<=IS)||LA122_8==LE||(LA122_8>=LET && LA122_8<=LEVELS)||(LA122_8>=LT && LA122_8<=MOD)||LA122_8==NE||(LA122_8>=OR && LA122_8<=ORDER)||LA122_8==PARAGRAPHS||LA122_8==RETURN||LA122_8==SATISFIES||LA122_8==SENTENCES||LA122_8==STABLE||(LA122_8>=TIMES && LA122_8<=TREAT)||LA122_8==UNION||LA122_8==WHERE||LA122_8==WITHOUT||LA122_8==WORDS||(LA122_8>=SEMICOLONSi && LA122_8<=COMMASi)||LA122_8==COLONSi||LA122_8==RPARSi||LA122_8==RBRACSi||(LA122_8>=STARSi && LA122_8<=NODEAFTERSi)||(LA122_8>=SLASHSi && LA122_8<=DBLSLASHSi)||(LA122_8>=LBRACKSi && LA122_8<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 8, input);

                    throw nvae;
                }
                }
                break;
            case NODE:
                {
                int LA122_9 = input.LA(2);

                if ( (LA122_9==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_9==EOF||LA122_9==AND||LA122_9==ASCENDING||(LA122_9>=CASE && LA122_9<=CASTABLE)||LA122_9==COLLATION||LA122_9==DEFAULT||LA122_9==DESCENDING||LA122_9==DIV||LA122_9==ELSE||LA122_9==EMPTY||LA122_9==EQ||LA122_9==EXCEPT||LA122_9==FOR||LA122_9==FTCONTAINS||LA122_9==GE||(LA122_9>=GT && LA122_9<=IDIV)||(LA122_9>=INSTANCE && LA122_9<=IS)||LA122_9==LE||(LA122_9>=LET && LA122_9<=LEVELS)||(LA122_9>=LT && LA122_9<=MOD)||LA122_9==NE||(LA122_9>=OR && LA122_9<=ORDER)||LA122_9==PARAGRAPHS||LA122_9==RETURN||LA122_9==SATISFIES||LA122_9==SENTENCES||LA122_9==STABLE||(LA122_9>=TIMES && LA122_9<=TREAT)||LA122_9==UNION||LA122_9==WHERE||LA122_9==WITHOUT||LA122_9==WORDS||(LA122_9>=SEMICOLONSi && LA122_9<=COMMASi)||LA122_9==COLONSi||LA122_9==RPARSi||LA122_9==RBRACSi||(LA122_9>=STARSi && LA122_9<=NODEAFTERSi)||(LA122_9>=SLASHSi && LA122_9<=DBLSLASHSi)||(LA122_9>=LBRACKSi && LA122_9<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 9, input);

                    throw nvae;
                }
                }
                break;
            case ALL:
            case ANY:
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case CHILD:
            case COLLATION:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case ITEM:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERED:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PARENT:
            case PHRASE:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PRESERVE:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCORE:
            case SELF:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UNORDERED:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case STARSi:
            case NCName:
                {
                alt122=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("720:6: nodeTest : ( kindTest | nameTest );", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:720:39: kindTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_kindTest_in_nodeTest9295);
                    kindTest511=kindTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, kindTest511.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:720:50: nameTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_nameTest_in_nodeTest9299);
                    nameTest512=nameTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, nameTest512.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end nodeTest

    public static class nameTest_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start nameTest
    // etc/XQFT.g:722:7: nameTest : ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName );
    public final nameTest_return nameTest() throws RecognitionException {
        nameTest_return retval = new nameTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        wildcard_return wildcard513 = null;

        qName_return qName514 = null;



        try {
            // etc/XQFT.g:722:38: ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==STARSi) && (synpred7())) {
                alt123=1;
            }
            else if ( ((LA123_0>=ALL && LA123_0<=XQUERY)||LA123_0==NCName) ) {
                int LA123_2 = input.LA(2);

                if ( (LA123_2==COLONSi) ) {
                    int LA123_3 = input.LA(3);

                    if ( (synpred7()) ) {
                        alt123=1;
                    }
                    else if ( (true) ) {
                        alt123=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("722:7: nameTest : ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName );", 123, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA123_2==EOF||LA123_2==AND||LA123_2==ASCENDING||(LA123_2>=CASE && LA123_2<=CASTABLE)||LA123_2==COLLATION||LA123_2==DEFAULT||LA123_2==DESCENDING||LA123_2==DIV||LA123_2==ELSE||LA123_2==EMPTY||LA123_2==EQ||LA123_2==EXCEPT||LA123_2==FOR||LA123_2==FTCONTAINS||LA123_2==GE||(LA123_2>=GT && LA123_2<=IDIV)||(LA123_2>=INSTANCE && LA123_2<=IS)||LA123_2==LE||(LA123_2>=LET && LA123_2<=LEVELS)||(LA123_2>=LT && LA123_2<=MOD)||LA123_2==NE||(LA123_2>=OR && LA123_2<=ORDER)||LA123_2==PARAGRAPHS||LA123_2==RETURN||LA123_2==SATISFIES||LA123_2==SENTENCES||LA123_2==STABLE||(LA123_2>=TIMES && LA123_2<=TREAT)||LA123_2==UNION||LA123_2==WHERE||LA123_2==WITHOUT||LA123_2==WORDS||(LA123_2>=SEMICOLONSi && LA123_2<=COMMASi)||LA123_2==RPARSi||LA123_2==RBRACSi||(LA123_2>=STARSi && LA123_2<=NODEAFTERSi)||(LA123_2>=SLASHSi && LA123_2<=DBLSLASHSi)||(LA123_2>=LBRACKSi && LA123_2<=RBRACKSi)) ) {
                    alt123=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("722:7: nameTest : ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName );", 123, 2, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("722:7: nameTest : ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName );", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:722:40: ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_wildcard_in_nameTest9366);
                    wildcard513=wildcard();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, wildcard513.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:724:19: qName
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_qName_in_nameTest9386);
                    qName514=qName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, qName514.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end nameTest

    public static class wildcard_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start wildcard
    // etc/XQFT.g:726:8: wildcard : ( ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword | STARSi | ncNameorKeyword COLONSi STARSi );
    public final wildcard_return wildcard() throws RecognitionException {
        wildcard_return retval = new wildcard_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token STARSi515=null;
        Token COLONSi516=null;
        Token STARSi518=null;
        Token COLONSi520=null;
        Token STARSi521=null;
        ncNameorKeyword_return ncNameorKeyword517 = null;

        ncNameorKeyword_return ncNameorKeyword519 = null;


        XQFTTree STARSi515_tree=null;
        XQFTTree COLONSi516_tree=null;
        XQFTTree STARSi518_tree=null;
        XQFTTree COLONSi520_tree=null;
        XQFTTree STARSi521_tree=null;

        try {
            // etc/XQFT.g:726:39: ( ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword | STARSi | ncNameorKeyword COLONSi STARSi )
            int alt124=3;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==STARSi) ) {
                int LA124_1 = input.LA(2);

                if ( (LA124_1==COLONSi) && (synpred8())) {
                    alt124=1;
                }
                else if ( (LA124_1==EOF||LA124_1==AND||LA124_1==ASCENDING||(LA124_1>=CASE && LA124_1<=CASTABLE)||LA124_1==COLLATION||LA124_1==DEFAULT||LA124_1==DESCENDING||LA124_1==DIV||LA124_1==ELSE||LA124_1==EMPTY||LA124_1==EQ||LA124_1==EXCEPT||LA124_1==FOR||LA124_1==FTCONTAINS||LA124_1==GE||(LA124_1>=GT && LA124_1<=IDIV)||(LA124_1>=INSTANCE && LA124_1<=IS)||LA124_1==LE||(LA124_1>=LET && LA124_1<=LEVELS)||(LA124_1>=LT && LA124_1<=MOD)||LA124_1==NE||(LA124_1>=OR && LA124_1<=ORDER)||LA124_1==PARAGRAPHS||LA124_1==RETURN||LA124_1==SATISFIES||LA124_1==SENTENCES||LA124_1==STABLE||(LA124_1>=TIMES && LA124_1<=TREAT)||LA124_1==UNION||LA124_1==WHERE||LA124_1==WITHOUT||LA124_1==WORDS||(LA124_1>=SEMICOLONSi && LA124_1<=COMMASi)||LA124_1==RPARSi||LA124_1==RBRACSi||(LA124_1>=STARSi && LA124_1<=NODEAFTERSi)||(LA124_1>=SLASHSi && LA124_1<=DBLSLASHSi)||(LA124_1>=LBRACKSi && LA124_1<=RBRACKSi)) ) {
                    alt124=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("726:8: wildcard : ( ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword | STARSi | ncNameorKeyword COLONSi STARSi );", 124, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA124_0>=ALL && LA124_0<=XQUERY)||LA124_0==NCName) ) {
                alt124=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("726:8: wildcard : ( ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword | STARSi | ncNameorKeyword COLONSi STARSi );", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // etc/XQFT.g:726:41: ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STARSi515=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard9448); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STARSi515_tree = (XQFTTree)adaptor.create(STARSi515);
                    adaptor.addChild(root_0, STARSi515_tree);
                    }
                    COLONSi516=(Token)input.LT(1);
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard9450); if (failed) return retval;
                    if ( backtracking==0 ) {
                    COLONSi516_tree = (XQFTTree)adaptor.create(COLONSi516);
                    adaptor.addChild(root_0, COLONSi516_tree);
                    }
                    pushFollow(FOLLOW_ncNameorKeyword_in_wildcard9452);
                    ncNameorKeyword517=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword517.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:727:20: STARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STARSi518=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard9477); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STARSi518_tree = (XQFTTree)adaptor.create(STARSi518);
                    adaptor.addChild(root_0, STARSi518_tree);
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:728:44: ncNameorKeyword COLONSi STARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ncNameorKeyword_in_wildcard9522);
                    ncNameorKeyword519=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword519.getTree());
                    COLONSi520=(Token)input.LT(1);
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard9524); if (failed) return retval;
                    if ( backtracking==0 ) {
                    COLONSi520_tree = (XQFTTree)adaptor.create(COLONSi520);
                    adaptor.addChild(root_0, COLONSi520_tree);
                    }
                    STARSi521=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard9526); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STARSi521_tree = (XQFTTree)adaptor.create(STARSi521);
                    adaptor.addChild(root_0, STARSi521_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end wildcard

    public static class abbrevReverseStep_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start abbrevReverseStep
    // etc/XQFT.g:729:21: abbrevReverseStep : DOTDOTSi ;
    public final abbrevReverseStep_return abbrevReverseStep() throws RecognitionException {
        abbrevReverseStep_return retval = new abbrevReverseStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOTDOTSi522=null;

        XQFTTree DOTDOTSi522_tree=null;

        try {
            // etc/XQFT.g:729:52: ( DOTDOTSi )
            // etc/XQFT.g:729:54: DOTDOTSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOTDOTSi522=(Token)input.LT(1);
            match(input,DOTDOTSi,FOLLOW_DOTDOTSi_in_abbrevReverseStep9567); if (failed) return retval;
            if ( backtracking==0 ) {
            DOTDOTSi522_tree = (XQFTTree)adaptor.create(DOTDOTSi522);
            adaptor.addChild(root_0, DOTDOTSi522_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end abbrevReverseStep

    public static class forwardStep_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forwardStep
    // etc/XQFT.g:731:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );
    public final forwardStep_return forwardStep() throws RecognitionException {
        forwardStep_return retval = new forwardStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        forwardAxis_return forwardAxis523 = null;

        nodeTest_return nodeTest524 = null;

        abbrevForwardStep_return abbrevForwardStep525 = null;



        try {
            // etc/XQFT.g:731:48: ( forwardAxis nodeTest | abbrevForwardStep )
            int alt125=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                int LA125_1 = input.LA(2);

                if ( (LA125_1==DBLCOLONSi) ) {
                    alt125=1;
                }
                else if ( (LA125_1==EOF||LA125_1==AND||LA125_1==ASCENDING||(LA125_1>=CASE && LA125_1<=CASTABLE)||LA125_1==COLLATION||LA125_1==DEFAULT||LA125_1==DESCENDING||LA125_1==DIV||LA125_1==ELSE||LA125_1==EMPTY||LA125_1==EQ||LA125_1==EXCEPT||LA125_1==FOR||LA125_1==FTCONTAINS||LA125_1==GE||(LA125_1>=GT && LA125_1<=IDIV)||(LA125_1>=INSTANCE && LA125_1<=IS)||LA125_1==LE||(LA125_1>=LET && LA125_1<=LEVELS)||(LA125_1>=LT && LA125_1<=MOD)||LA125_1==NE||(LA125_1>=OR && LA125_1<=ORDER)||LA125_1==PARAGRAPHS||LA125_1==RETURN||LA125_1==SATISFIES||LA125_1==SENTENCES||LA125_1==STABLE||(LA125_1>=TIMES && LA125_1<=TREAT)||LA125_1==UNION||LA125_1==WHERE||LA125_1==WITHOUT||LA125_1==WORDS||(LA125_1>=SEMICOLONSi && LA125_1<=COMMASi)||(LA125_1>=COLONSi && LA125_1<=RPARSi)||LA125_1==RBRACSi||(LA125_1>=STARSi && LA125_1<=NODEAFTERSi)||(LA125_1>=SLASHSi && LA125_1<=DBLSLASHSi)||(LA125_1>=LBRACKSi && LA125_1<=RBRACKSi)) ) {
                    alt125=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("731:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 125, 1, input);

                    throw nvae;
                }
                }
                break;
            case ALL:
            case ANY:
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case COLLATION:
            case COMMENT:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case ITEM:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NODE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERED:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PARENT:
            case PHRASE:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PRESERVE:
            case PROCESSING_INSTRUCTION:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCHEMA_ATTRIBUTE:
            case SCHEMA_ELEMENT:
            case SCORE:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case TEXT:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UNORDERED:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case STARSi:
            case ATSi:
            case NCName:
                {
                alt125=2;
                }
                break;
            case CHILD:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case SELF:
                {
                int LA125_5 = input.LA(2);

                if ( (LA125_5==DBLCOLONSi) ) {
                    alt125=1;
                }
                else if ( (LA125_5==EOF||LA125_5==AND||LA125_5==ASCENDING||(LA125_5>=CASE && LA125_5<=CASTABLE)||LA125_5==COLLATION||LA125_5==DEFAULT||LA125_5==DESCENDING||LA125_5==DIV||LA125_5==ELSE||LA125_5==EMPTY||LA125_5==EQ||LA125_5==EXCEPT||LA125_5==FOR||LA125_5==FTCONTAINS||LA125_5==GE||(LA125_5>=GT && LA125_5<=IDIV)||(LA125_5>=INSTANCE && LA125_5<=IS)||LA125_5==LE||(LA125_5>=LET && LA125_5<=LEVELS)||(LA125_5>=LT && LA125_5<=MOD)||LA125_5==NE||(LA125_5>=OR && LA125_5<=ORDER)||LA125_5==PARAGRAPHS||LA125_5==RETURN||LA125_5==SATISFIES||LA125_5==SENTENCES||LA125_5==STABLE||(LA125_5>=TIMES && LA125_5<=TREAT)||LA125_5==UNION||LA125_5==WHERE||LA125_5==WITHOUT||LA125_5==WORDS||(LA125_5>=SEMICOLONSi && LA125_5<=COMMASi)||LA125_5==COLONSi||LA125_5==RPARSi||LA125_5==RBRACSi||(LA125_5>=STARSi && LA125_5<=NODEAFTERSi)||(LA125_5>=SLASHSi && LA125_5<=DBLSLASHSi)||(LA125_5>=LBRACKSi && LA125_5<=RBRACKSi)) ) {
                    alt125=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("731:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 125, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("731:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // etc/XQFT.g:731:50: forwardAxis nodeTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_forwardAxis_in_forwardStep9630);
                    forwardAxis523=forwardAxis();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, forwardAxis523.getTree());
                    pushFollow(FOLLOW_nodeTest_in_forwardStep9632);
                    nodeTest524=nodeTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, nodeTest524.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:731:73: abbrevForwardStep
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep9636);
                    abbrevForwardStep525=abbrevForwardStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, abbrevForwardStep525.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end forwardStep

    public static class forwardAxis_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start forwardAxis
    // etc/XQFT.g:733:18: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi ;
    public final forwardAxis_return forwardAxis() throws RecognitionException {
        forwardAxis_return retval = new forwardAxis_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set526=null;
        Token DBLCOLONSi527=null;

        XQFTTree set526_tree=null;
        XQFTTree DBLCOLONSi527_tree=null;

        try {
            // etc/XQFT.g:733:49: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi )
            // etc/XQFT.g:733:51: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            set526=(Token)input.LT(1);
            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==CHILD||(input.LA(1)>=DESCENDANT && input.LA(1)<=DESCENDANT_OR_SELF)||(input.LA(1)>=FOLLOWING && input.LA(1)<=FOLLOWING_SIBLING)||input.LA(1)==SELF ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set526));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis9712);    throw mse;
            }

            DBLCOLONSi527=(Token)input.LT(1);
            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_forwardAxis9768); if (failed) return retval;
            if ( backtracking==0 ) {
            DBLCOLONSi527_tree = (XQFTTree)adaptor.create(DBLCOLONSi527);
            adaptor.addChild(root_0, DBLCOLONSi527_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end forwardAxis

    public static class abbrevForwardStep_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start abbrevForwardStep
    // etc/XQFT.g:741:6: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final abbrevForwardStep_return abbrevForwardStep() throws RecognitionException {
        abbrevForwardStep_return retval = new abbrevForwardStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ATSi528=null;
        nodeTest_return nodeTest529 = null;


        XQFTTree ATSi528_tree=null;

        try {
            // etc/XQFT.g:741:37: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:741:39: ( ATSi )? nodeTest
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:741:43: ( ATSi )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ATSi) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:741:43: ATSi
                    {
                    ATSi528=(Token)input.LT(1);
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep9799); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ATSi528_tree = (XQFTTree)adaptor.create(ATSi528);
                    root_0 = (XQFTTree)adaptor.becomeRoot(ATSi528_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep9803);
            nodeTest529=nodeTest();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, nodeTest529.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end abbrevForwardStep

    public static class predicateList_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start predicateList
    // etc/XQFT.g:743:17: predicateList : ( predicate )* ;
    public final predicateList_return predicateList() throws RecognitionException {
        predicateList_return retval = new predicateList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        predicate_return predicate530 = null;



        try {
            // etc/XQFT.g:743:48: ( ( predicate )* )
            // etc/XQFT.g:743:50: ( predicate )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:743:50: ( predicate )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==LBRACKSi) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // etc/XQFT.g:743:50: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList9877);
            	    predicate530=predicate();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, predicate530.getTree());

            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end predicateList

    public static class predicate_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start predicate
    // etc/XQFT.g:744:18: predicate : LBRACKSi expr RBRACKSi -> ^( AST_PREDICATE expr ) ;
    public final predicate_return predicate() throws RecognitionException {
        predicate_return retval = new predicate_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACKSi531=null;
        Token RBRACKSi533=null;
        expr_return expr532 = null;


        XQFTTree LBRACKSi531_tree=null;
        XQFTTree RBRACKSi533_tree=null;
        RewriteRuleTokenStream stream_LBRACKSi=new RewriteRuleTokenStream(adaptor,"token LBRACKSi");
        RewriteRuleTokenStream stream_RBRACKSi=new RewriteRuleTokenStream(adaptor,"token RBRACKSi");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // etc/XQFT.g:744:49: ( LBRACKSi expr RBRACKSi -> ^( AST_PREDICATE expr ) )
            // etc/XQFT.g:744:51: LBRACKSi expr RBRACKSi
            {
            LBRACKSi531=(Token)input.LT(1);
            match(input,LBRACKSi,FOLLOW_LBRACKSi_in_predicate9937); if (failed) return retval;
            if ( backtracking==0 ) stream_LBRACKSi.add(LBRACKSi531);

            pushFollow(FOLLOW_expr_in_predicate9939);
            expr532=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expr.add(expr532.getTree());
            RBRACKSi533=(Token)input.LT(1);
            match(input,RBRACKSi,FOLLOW_RBRACKSi_in_predicate9941); if (failed) return retval;
            if ( backtracking==0 ) stream_RBRACKSi.add(RBRACKSi533);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 745:62: -> ^( AST_PREDICATE expr )
            {
                // etc/XQFT.g:745:65: ^( AST_PREDICATE expr )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_PREDICATE, "AST_PREDICATE"), root_1);

                adaptor.addChild(root_1, stream_expr.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end predicate

    public static class extensionExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start extensionExpr
    // etc/XQFT.g:750:5: extensionExpr : ( pragma )+ LBRACESi ( expr )? RBRACSi ;
    public final extensionExpr_return extensionExpr() throws RecognitionException {
        extensionExpr_return retval = new extensionExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi535=null;
        Token RBRACSi537=null;
        pragma_return pragma534 = null;

        expr_return expr536 = null;


        XQFTTree LBRACESi535_tree=null;
        XQFTTree RBRACSi537_tree=null;

        try {
            // etc/XQFT.g:750:36: ( ( pragma )+ LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:750:38: ( pragma )+ LBRACESi ( expr )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:750:38: ( pragma )+
            int cnt128=0;
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==LPRAGSi) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // etc/XQFT.g:750:38: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr10050);
            	    pragma534=pragma();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, pragma534.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt128 >= 1 ) break loop128;
            	    if (backtracking>0) {failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(128, input);
                        throw eee;
                }
                cnt128++;
            } while (true);

            LBRACESi535=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_extensionExpr10053); if (failed) return retval;
            // etc/XQFT.g:750:56: ( expr )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=ALL && LA129_0<=XQUERY)||LA129_0==StringLiteral||LA129_0==DOLLARSi||LA129_0==LPARSi||(LA129_0>=STARSi && LA129_0<=MINUSSi)||LA129_0==LTSi||(LA129_0>=IntegerLiteral && LA129_0<=LPRAGSi)||(LA129_0>=SLASHSi && LA129_0<=DBLSLASHSi)||(LA129_0>=DOTDOTSi && LA129_0<=ATSi)||LA129_0==DOTSi||LA129_0==LCOMMENTSi||LA129_0==LPISi||LA129_0==NCName) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:750:56: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr10056);
                    expr536=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr536.getTree());

                    }
                    break;

            }

            RBRACSi537=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_extensionExpr10059); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end extensionExpr

    public static class filterExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start filterExpr
    // etc/XQFT.g:758:1: filterExpr : primaryExpr predicateList ;
    public final filterExpr_return filterExpr() throws RecognitionException {
        filterExpr_return retval = new filterExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        primaryExpr_return primaryExpr538 = null;

        predicateList_return predicateList539 = null;



        try {
            // etc/XQFT.g:758:32: ( primaryExpr predicateList )
            // etc/XQFT.g:758:34: primaryExpr predicateList
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_primaryExpr_in_filterExpr10095);
            primaryExpr538=primaryExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, primaryExpr538.getTree());
            pushFollow(FOLLOW_predicateList_in_filterExpr10097);
            predicateList539=predicateList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, predicateList539.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end filterExpr

    public static class primaryExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start primaryExpr
    // etc/XQFT.g:759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final primaryExpr_return primaryExpr() throws RecognitionException {
        primaryExpr_return retval = new primaryExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        literal_return literal540 = null;

        varRef_return varRef541 = null;

        parenthesizedExpr_return parenthesizedExpr542 = null;

        contextItemExpr_return contextItemExpr543 = null;

        functionCall_return functionCall544 = null;

        orderedExpr_return orderedExpr545 = null;

        unorderedExpr_return unorderedExpr546 = null;

        constructor_return constructor547 = null;



        try {
            // etc/XQFT.g:759:33: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
            int alt130=8;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt130=1;
                }
                break;
            case DOLLARSi:
                {
                alt130=2;
                }
                break;
            case LPARSi:
                {
                alt130=3;
                }
                break;
            case DOTSi:
                {
                alt130=4;
                }
                break;
            case ORDERED:
                {
                int LA130_6 = input.LA(2);

                if ( (LA130_6==LBRACESi) ) {
                    alt130=6;
                }
                else if ( ((LA130_6>=COLONSi && LA130_6<=LPARSi)) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 6, input);

                    throw nvae;
                }
                }
                break;
            case UNORDERED:
                {
                int LA130_7 = input.LA(2);

                if ( (LA130_7==LBRACESi) ) {
                    alt130=7;
                }
                else if ( ((LA130_7>=COLONSi && LA130_7<=LPARSi)) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 7, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENT:
                {
                int LA130_8 = input.LA(2);

                if ( (LA130_8==LBRACESi) ) {
                    alt130=8;
                }
                else if ( ((LA130_8>=COLONSi && LA130_8<=LPARSi)) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 8, input);

                    throw nvae;
                }
                }
                break;
            case LTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt130=8;
                }
                break;
            case ELEMENT:
                {
                int LA130_12 = input.LA(2);

                if ( ((LA130_12>=ALL && LA130_12<=XQUERY)||LA130_12==LBRACESi||LA130_12==NCName) ) {
                    alt130=8;
                }
                else if ( ((LA130_12>=COLONSi && LA130_12<=LPARSi)) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 12, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA130_13 = input.LA(2);

                if ( ((LA130_13>=COLONSi && LA130_13<=LPARSi)) ) {
                    alt130=5;
                }
                else if ( ((LA130_13>=ALL && LA130_13<=XQUERY)||LA130_13==LBRACESi||LA130_13==NCName) ) {
                    alt130=8;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 13, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA130_14 = input.LA(2);

                if ( (LA130_14==LBRACESi) ) {
                    alt130=8;
                }
                else if ( ((LA130_14>=COLONSi && LA130_14<=LPARSi)) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 14, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA130_15 = input.LA(2);

                if ( (LA130_15==LBRACESi) ) {
                    alt130=8;
                }
                else if ( ((LA130_15>=COLONSi && LA130_15<=LPARSi)) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 15, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA130_16 = input.LA(2);

                if ( ((LA130_16>=COLONSi && LA130_16<=LPARSi)) ) {
                    alt130=5;
                }
                else if ( ((LA130_16>=ALL && LA130_16<=XQUERY)||LA130_16==LBRACESi||LA130_16==NCName) ) {
                    alt130=8;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 16, input);

                    throw nvae;
                }
                }
                break;
            case ALL:
            case ANY:
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case AND:
            case AS:
            case ASCENDING:
            case AT:
            case BASE_URI:
            case BY:
            case BOUNDARYSPACE:
            case CASE:
            case CAST:
            case CASTABLE:
            case CHILD:
            case COLLATION:
            case CONSTRUCTION:
            case CONTENT:
            case COPY_NAMESPACES:
            case DECLARE:
            case DEFAULT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DESCENDING:
            case DIACRITICS:
            case DIFFERENT:
            case DISTANCE:
            case DIV:
            case DOCUMENT_NODE:
            case ELSE:
            case ENCODING:
            case END:
            case ENTIRE:
            case EMPTY:
            case EMPTY_SEQUENCE:
            case EQ:
            case EVERY:
            case EXACTLY:
            case EXCEPT:
            case EXTERNAL:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case FOR:
            case FROM:
            case FTAND:
            case FTCONTAINS:
            case FTNOT:
            case FTOPTION:
            case FTOR:
            case FUNCTION:
            case GE:
            case GREATEST:
            case GT:
            case IDIV:
            case IF:
            case IMPORT:
            case IN:
            case INHERIT:
            case INSENSITIVE:
            case INSTANCE:
            case INTERSECT:
            case IS:
            case ITEM:
            case LANGUAGE:
            case LAX:
            case LE:
            case LEAST:
            case LET:
            case LEVELS:
            case LOWERCASE:
            case LT:
            case MOD:
            case MODULE:
            case MOST:
            case NAMESPACE:
            case NE:
            case NODE:
            case NOINHERIT:
            case NOPRESERVE:
            case NOT:
            case OCCURS:
            case OF:
            case OPTION:
            case OR:
            case ORDER:
            case ORDERING:
            case PARAGRAPH:
            case PARAGRAPHS:
            case PARENT:
            case PHRASE:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PRESERVE:
            case RELATIONSHIP:
            case RETURN:
            case SAME:
            case SATISFIES:
            case SCHEMA:
            case SCHEMA_ATTRIBUTE:
            case SCHEMA_ELEMENT:
            case SCORE:
            case SELF:
            case SENSITIVE:
            case SENTENCES:
            case SENTENCE:
            case SOME:
            case STABLE:
            case START:
            case STEMMING:
            case STOP:
            case STRICT:
            case STRIP:
            case THESAURUS:
            case THEN:
            case TIMES:
            case TO:
            case TREAT:
            case TYPESWITCH:
            case UNION:
            case UPPERCASE:
            case VALIDATE:
            case VARIABLE:
            case VERSION:
            case WEIGHT:
            case WHERE:
            case WILDCARDS:
            case WINDOW:
            case WITH:
            case WITHOUT:
            case WORD:
            case WORDS:
            case XQUERY:
            case NCName:
                {
                alt130=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("759:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // etc/XQFT.g:759:35: literal
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpr10124);
                    literal540=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal540.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:760:14: varRef
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_varRef_in_primaryExpr10140);
                    varRef541=varRef();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, varRef541.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:761:14: parenthesizedExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr10156);
                    parenthesizedExpr542=parenthesizedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, parenthesizedExpr542.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:762:14: contextItemExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr10172);
                    contextItemExpr543=contextItemExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, contextItemExpr543.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:768:12: functionCall
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_primaryExpr10200);
                    functionCall544=functionCall();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, functionCall544.getTree());

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:769:14: orderedExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr10216);
                    orderedExpr545=orderedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, orderedExpr545.getTree());

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:770:14: unorderedExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr10232);
                    unorderedExpr546=unorderedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unorderedExpr546.getTree());

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:771:14: constructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_constructor_in_primaryExpr10248);
                    constructor547=constructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, constructor547.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end primaryExpr

    public static class varRef_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start varRef
    // etc/XQFT.g:775:3: varRef : DOLLARSi varName ;
    public final varRef_return varRef() throws RecognitionException {
        varRef_return retval = new varRef_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOLLARSi548=null;
        varName_return varName549 = null;


        XQFTTree DOLLARSi548_tree=null;

        try {
            // etc/XQFT.g:775:34: ( DOLLARSi varName )
            // etc/XQFT.g:775:36: DOLLARSi varName
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOLLARSi548=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef10286); if (failed) return retval;
            pushFollow(FOLLOW_varName_in_varRef10289);
            varName549=varName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, varName549.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end varRef

    public static class parenthesizedExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start parenthesizedExpr
    // etc/XQFT.g:777:3: parenthesizedExpr : LPARSi ( expr )? RPARSi ;
    public final parenthesizedExpr_return parenthesizedExpr() throws RecognitionException {
        parenthesizedExpr_return retval = new parenthesizedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPARSi550=null;
        Token RPARSi552=null;
        expr_return expr551 = null;


        XQFTTree LPARSi550_tree=null;
        XQFTTree RPARSi552_tree=null;

        try {
            // etc/XQFT.g:777:34: ( LPARSi ( expr )? RPARSi )
            // etc/XQFT.g:777:36: LPARSi ( expr )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LPARSi550=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_parenthesizedExpr10312); if (failed) return retval;
            // etc/XQFT.g:777:44: ( expr )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( ((LA131_0>=ALL && LA131_0<=XQUERY)||LA131_0==StringLiteral||LA131_0==DOLLARSi||LA131_0==LPARSi||(LA131_0>=STARSi && LA131_0<=MINUSSi)||LA131_0==LTSi||(LA131_0>=IntegerLiteral && LA131_0<=LPRAGSi)||(LA131_0>=SLASHSi && LA131_0<=DBLSLASHSi)||(LA131_0>=DOTDOTSi && LA131_0<=ATSi)||LA131_0==DOTSi||LA131_0==LCOMMENTSi||LA131_0==LPISi||LA131_0==NCName) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // etc/XQFT.g:777:44: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr10315);
                    expr551=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr551.getTree());

                    }
                    break;

            }

            RPARSi552=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_parenthesizedExpr10318); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end parenthesizedExpr

    public static class contextItemExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start contextItemExpr
    // etc/XQFT.g:780:3: contextItemExpr : DOTSi ;
    public final contextItemExpr_return contextItemExpr() throws RecognitionException {
        contextItemExpr_return retval = new contextItemExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOTSi553=null;

        XQFTTree DOTSi553_tree=null;

        try {
            // etc/XQFT.g:780:34: ( DOTSi )
            // etc/XQFT.g:780:36: DOTSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOTSi553=(Token)input.LT(1);
            match(input,DOTSi,FOLLOW_DOTSi_in_contextItemExpr10345); if (failed) return retval;
            if ( backtracking==0 ) {
            DOTSi553_tree = (XQFTTree)adaptor.create(DOTSi553);
            adaptor.addChild(root_0, DOTSi553_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end contextItemExpr

    public static class functionCall_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start functionCall
    // etc/XQFT.g:781:3: functionCall : qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi -> ^( AST_FUNCTIONCALL qName ( exprSingle )* ) ;
    public final functionCall_return functionCall() throws RecognitionException {
        functionCall_return retval = new functionCall_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPARSi555=null;
        Token COMMASi557=null;
        Token RPARSi559=null;
        qName_return qName554 = null;

        exprSingle_return exprSingle556 = null;

        exprSingle_return exprSingle558 = null;


        XQFTTree LPARSi555_tree=null;
        XQFTTree COMMASi557_tree=null;
        XQFTTree RPARSi559_tree=null;
        RewriteRuleTokenStream stream_RPARSi=new RewriteRuleTokenStream(adaptor,"token RPARSi");
        RewriteRuleTokenStream stream_LPARSi=new RewriteRuleTokenStream(adaptor,"token LPARSi");
        RewriteRuleTokenStream stream_COMMASi=new RewriteRuleTokenStream(adaptor,"token COMMASi");
        RewriteRuleSubtreeStream stream_qName=new RewriteRuleSubtreeStream(adaptor,"rule qName");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:781:34: ( qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi -> ^( AST_FUNCTIONCALL qName ( exprSingle )* ) )
            // etc/XQFT.g:781:36: qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi
            {
            pushFollow(FOLLOW_qName_in_functionCall10372);
            qName554=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_qName.add(qName554.getTree());
            LPARSi555=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_functionCall10374); if (failed) return retval;
            if ( backtracking==0 ) stream_LPARSi.add(LPARSi555);

            // etc/XQFT.g:782:14: ( exprSingle ( COMMASi exprSingle )* )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=ALL && LA133_0<=XQUERY)||LA133_0==StringLiteral||LA133_0==DOLLARSi||LA133_0==LPARSi||(LA133_0>=STARSi && LA133_0<=MINUSSi)||LA133_0==LTSi||(LA133_0>=IntegerLiteral && LA133_0<=LPRAGSi)||(LA133_0>=SLASHSi && LA133_0<=DBLSLASHSi)||(LA133_0>=DOTDOTSi && LA133_0<=ATSi)||LA133_0==DOTSi||LA133_0==LCOMMENTSi||LA133_0==LPISi||LA133_0==NCName) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // etc/XQFT.g:782:15: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall10392);
                    exprSingle556=exprSingle();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_exprSingle.add(exprSingle556.getTree());
                    // etc/XQFT.g:782:26: ( COMMASi exprSingle )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==COMMASi) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // etc/XQFT.g:782:27: COMMASi exprSingle
                    	    {
                    	    COMMASi557=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall10395); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi557);

                    	    pushFollow(FOLLOW_exprSingle_in_functionCall10397);
                    	    exprSingle558=exprSingle();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_exprSingle.add(exprSingle558.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);


                    }
                    break;

            }

            RPARSi559=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_functionCall10417); if (failed) return retval;
            if ( backtracking==0 ) stream_RPARSi.add(RPARSi559);


            // AST REWRITE
            // elements: qName, exprSingle
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 784:53: -> ^( AST_FUNCTIONCALL qName ( exprSingle )* )
            {
                // etc/XQFT.g:784:56: ^( AST_FUNCTIONCALL qName ( exprSingle )* )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_FUNCTIONCALL, "AST_FUNCTIONCALL"), root_1);

                adaptor.addChild(root_1, stream_qName.next());
                // etc/XQFT.g:784:81: ( exprSingle )*
                while ( stream_exprSingle.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprSingle.next());

                }
                stream_exprSingle.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end functionCall

    public static class orderedExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orderedExpr
    // etc/XQFT.g:787:3: orderedExpr : ORDERED LBRACESi expr RBRACSi ;
    public final orderedExpr_return orderedExpr() throws RecognitionException {
        orderedExpr_return retval = new orderedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ORDERED560=null;
        Token LBRACESi561=null;
        Token RBRACSi563=null;
        expr_return expr562 = null;


        XQFTTree ORDERED560_tree=null;
        XQFTTree LBRACESi561_tree=null;
        XQFTTree RBRACSi563_tree=null;

        try {
            // etc/XQFT.g:787:34: ( ORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:787:36: ORDERED LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ORDERED560=(Token)input.LT(1);
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr10510); if (failed) return retval;
            if ( backtracking==0 ) {
            ORDERED560_tree = (XQFTTree)adaptor.create(ORDERED560);
            adaptor.addChild(root_0, ORDERED560_tree);
            }
            LBRACESi561=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_orderedExpr10512); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_orderedExpr10515);
            expr562=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr562.getTree());
            RBRACSi563=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_orderedExpr10517); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end orderedExpr

    public static class unorderedExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start unorderedExpr
    // etc/XQFT.g:790:3: unorderedExpr : UNORDERED LBRACESi expr RBRACSi ;
    public final unorderedExpr_return unorderedExpr() throws RecognitionException {
        unorderedExpr_return retval = new unorderedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token UNORDERED564=null;
        Token LBRACESi565=null;
        Token RBRACSi567=null;
        expr_return expr566 = null;


        XQFTTree UNORDERED564_tree=null;
        XQFTTree LBRACESi565_tree=null;
        XQFTTree RBRACSi567_tree=null;

        try {
            // etc/XQFT.g:790:34: ( UNORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:790:36: UNORDERED LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            UNORDERED564=(Token)input.LT(1);
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr10546); if (failed) return retval;
            if ( backtracking==0 ) {
            UNORDERED564_tree = (XQFTTree)adaptor.create(UNORDERED564);
            adaptor.addChild(root_0, UNORDERED564_tree);
            }
            LBRACESi565=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_unorderedExpr10548); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_unorderedExpr10551);
            expr566=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr566.getTree());
            RBRACSi567=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_unorderedExpr10553); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end unorderedExpr

    public static class constructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start constructor
    // etc/XQFT.g:793:3: constructor : ( directConstructor | computedConstructor );
    public final constructor_return constructor() throws RecognitionException {
        constructor_return retval = new constructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        directConstructor_return directConstructor568 = null;

        computedConstructor_return computedConstructor569 = null;



        try {
            // etc/XQFT.g:793:34: ( directConstructor | computedConstructor )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==LTSi||LA134_0==LCOMMENTSi||LA134_0==LPISi) ) {
                alt134=1;
            }
            else if ( (LA134_0==ATTRIBUTE||LA134_0==COMMENT||LA134_0==DOCUMENT||LA134_0==ELEMENT||LA134_0==PROCESSING_INSTRUCTION||LA134_0==TEXT) ) {
                alt134=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("793:3: constructor : ( directConstructor | computedConstructor );", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:793:36: directConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_directConstructor_in_constructor10585);
                    directConstructor568=directConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, directConstructor568.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:793:56: computedConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_computedConstructor_in_constructor10589);
                    computedConstructor569=computedConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, computedConstructor569.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end constructor

    public static class directConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start directConstructor
    // etc/XQFT.g:796:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );
    public final directConstructor_return directConstructor() throws RecognitionException {
        directConstructor_return retval = new directConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        dirElemConstructor_return dirElemConstructor570 = null;

        dirCommentConstructor_return dirCommentConstructor571 = null;

        dirPIConstructor_return dirPIConstructor572 = null;



        try {
            // etc/XQFT.g:796:35: ( dirElemConstructor | dirCommentConstructor | dirPIConstructor )
            int alt135=3;
            switch ( input.LA(1) ) {
            case LTSi:
                {
                alt135=1;
                }
                break;
            case LCOMMENTSi:
                {
                alt135=2;
                }
                break;
            case LPISi:
                {
                alt135=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("796:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // etc/XQFT.g:796:37: dirElemConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor10629);
                    dirElemConstructor570=dirElemConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dirElemConstructor570.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:797:40: dirCommentConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor10670);
                    dirCommentConstructor571=dirCommentConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dirCommentConstructor571.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:798:28: dirPIConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_dirPIConstructor_in_directConstructor10699);
                    dirPIConstructor572=dirPIConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dirPIConstructor572.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end directConstructor

    public static class dirElemConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dirElemConstructor
    // etc/XQFT.g:800:14: dirElemConstructor : LTSi qn= qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) -> ^( AST_DIRELEMCONSTRUCTOR $qn dirAttributeList ( dirElemContent )* ) ;
    public final dirElemConstructor_return dirElemConstructor() throws RecognitionException {
        dirElemConstructor_return retval = new dirElemConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LTSi573=null;
        Token RSELFTERMSi575=null;
        Token GTSi576=null;
        Token LENDTAGSi578=null;
        Token GTSi580=null;
        qName_return qn = null;

        dirAttributeList_return dirAttributeList574 = null;

        dirElemContent_return dirElemContent577 = null;

        qName_return qName579 = null;


        XQFTTree LTSi573_tree=null;
        XQFTTree RSELFTERMSi575_tree=null;
        XQFTTree GTSi576_tree=null;
        XQFTTree LENDTAGSi578_tree=null;
        XQFTTree GTSi580_tree=null;
        RewriteRuleTokenStream stream_LTSi=new RewriteRuleTokenStream(adaptor,"token LTSi");
        RewriteRuleTokenStream stream_LENDTAGSi=new RewriteRuleTokenStream(adaptor,"token LENDTAGSi");
        RewriteRuleTokenStream stream_RSELFTERMSi=new RewriteRuleTokenStream(adaptor,"token RSELFTERMSi");
        RewriteRuleTokenStream stream_GTSi=new RewriteRuleTokenStream(adaptor,"token GTSi");
        RewriteRuleSubtreeStream stream_qName=new RewriteRuleSubtreeStream(adaptor,"rule qName");
        RewriteRuleSubtreeStream stream_dirElemContent=new RewriteRuleSubtreeStream(adaptor,"rule dirElemContent");
        RewriteRuleSubtreeStream stream_dirAttributeList=new RewriteRuleSubtreeStream(adaptor,"rule dirAttributeList");
        try {
            // etc/XQFT.g:800:45: ( LTSi qn= qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) -> ^( AST_DIRELEMCONSTRUCTOR $qn dirAttributeList ( dirElemContent )* ) )
            // etc/XQFT.g:800:47: LTSi qn= qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
            {
            LTSi573=(Token)input.LT(1);
            match(input,LTSi,FOLLOW_LTSi_in_dirElemConstructor10757); if (failed) return retval;
            if ( backtracking==0 ) stream_LTSi.add(LTSi573);

            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.IN_TAG;
            }
            pushFollow(FOLLOW_qName_in_dirElemConstructor10823);
            qn=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_qName.add(qn.getTree());
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor10825);
            dirAttributeList574=dirAttributeList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_dirAttributeList.add(dirAttributeList574.getTree());
            // etc/XQFT.g:802:61: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==RSELFTERMSi) ) {
                alt137=1;
            }
            else if ( (LA137_0==GTSi) ) {
                alt137=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("802:61: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:802:62: RSELFTERMSi
                    {
                    RSELFTERMSi575=(Token)input.LT(1);
                    match(input,RSELFTERMSi,FOLLOW_RSELFTERMSi_in_dirElemConstructor10888); if (failed) return retval;
                    if ( backtracking==0 ) stream_RSELFTERMSi.add(RSELFTERMSi575);

                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:804:34: GTSi ( dirElemContent )* LENDTAGSi qName GTSi
                    {
                    GTSi576=(Token)input.LT(1);
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor10989); if (failed) return retval;
                    if ( backtracking==0 ) stream_GTSi.add(GTSi576);

                    if ( backtracking==0 ) {
                      lexer.state=State.IN_ELEMENT;
                    }
                    // etc/XQFT.g:807:26: ( dirElemContent )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==LBRACESi||LA136_0==LTSi||(LA136_0>=ElementContent && LA136_0<=LCDATASi)||LA136_0==LCOMMENTSi||LA136_0==LPISi) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // etc/XQFT.g:807:26: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor11084);
                    	    dirElemContent577=dirElemContent();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_dirElemContent.add(dirElemContent577.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    LENDTAGSi578=(Token)input.LT(1);
                    match(input,LENDTAGSi,FOLLOW_LENDTAGSi_in_dirElemConstructor11113); if (failed) return retval;
                    if ( backtracking==0 ) stream_LENDTAGSi.add(LENDTAGSi578);

                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }
                    pushFollow(FOLLOW_qName_in_dirElemConstructor11143);
                    qName579=qName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_qName.add(qName579.getTree());
                    GTSi580=(Token)input.LT(1);
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor11172); if (failed) return retval;
                    if ( backtracking==0 ) stream_GTSi.add(GTSi580);

                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;

            }


            // AST REWRITE
            // elements: dirAttributeList, dirElemContent, qn
            // token labels: 
            // rule labels: qn, retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_qn=new RewriteRuleSubtreeStream(adaptor,"token qn",qn!=null?qn.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 812:61: -> ^( AST_DIRELEMCONSTRUCTOR $qn dirAttributeList ( dirElemContent )* )
            {
                // etc/XQFT.g:812:64: ^( AST_DIRELEMCONSTRUCTOR $qn dirAttributeList ( dirElemContent )* )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_DIRELEMCONSTRUCTOR, "AST_DIRELEMCONSTRUCTOR"), root_1);

                adaptor.addChild(root_1, stream_qn.next());
                adaptor.addChild(root_1, stream_dirAttributeList.next());
                // etc/XQFT.g:812:110: ( dirElemContent )*
                while ( stream_dirElemContent.hasNext() ) {
                    adaptor.addChild(root_1, stream_dirElemContent.next());

                }
                stream_dirElemContent.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end dirElemConstructor

    public static class dirAttributeList_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dirAttributeList
    // etc/XQFT.g:814:15: dirAttributeList : ( qName EQSi dirAttributeValue )* ;
    public final dirAttributeList_return dirAttributeList() throws RecognitionException {
        dirAttributeList_return retval = new dirAttributeList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token EQSi582=null;
        qName_return qName581 = null;

        dirAttributeValue_return dirAttributeValue583 = null;


        XQFTTree EQSi582_tree=null;

        try {
            // etc/XQFT.g:814:46: ( ( qName EQSi dirAttributeValue )* )
            // etc/XQFT.g:814:48: ( qName EQSi dirAttributeValue )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:814:48: ( qName EQSi dirAttributeValue )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( ((LA138_0>=ALL && LA138_0<=XQUERY)||LA138_0==NCName) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // etc/XQFT.g:814:49: qName EQSi dirAttributeValue
            	    {
            	    pushFollow(FOLLOW_qName_in_dirAttributeList11313);
            	    qName581=qName();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, qName581.getTree());
            	    EQSi582=(Token)input.LT(1);
            	    match(input,EQSi,FOLLOW_EQSi_in_dirAttributeList11315); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    EQSi582_tree = (XQFTTree)adaptor.create(EQSi582);
            	    adaptor.addChild(root_0, EQSi582_tree);
            	    }
            	    pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList11317);
            	    dirAttributeValue583=dirAttributeValue();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, dirAttributeValue583.getTree());

            	    }
            	    break;

            	default :
            	    break loop138;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end dirAttributeList

    public static class dirAttributeValue_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dirAttributeValue
    // etc/XQFT.g:815:16: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );
    public final dirAttributeValue_return dirAttributeValue() throws RecognitionException {
        dirAttributeValue_return retval = new dirAttributeValue_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token QUOTSi584=null;
        Token QuotAttributeContent585=null;
        Token QUOTSi587=null;
        Token APOSSi588=null;
        Token AposAttributeContent589=null;
        Token APOSSi591=null;
        xmlEnclosedExpr_return xmlEnclosedExpr586 = null;

        xmlEnclosedExpr_return xmlEnclosedExpr590 = null;


        XQFTTree QUOTSi584_tree=null;
        XQFTTree QuotAttributeContent585_tree=null;
        XQFTTree QUOTSi587_tree=null;
        XQFTTree APOSSi588_tree=null;
        XQFTTree AposAttributeContent589_tree=null;
        XQFTTree APOSSi591_tree=null;

        try {
            // etc/XQFT.g:815:47: ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==QUOTSi) ) {
                alt141=1;
            }
            else if ( (LA141_0==APOSSi) ) {
                alt141=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("815:16: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // etc/XQFT.g:815:49: QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    QUOTSi584=(Token)input.LT(1);
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue11355); if (failed) return retval;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_QUOT_ATTRIBUTE;
                    }
                    // etc/XQFT.g:816:27: ( QuotAttributeContent | xmlEnclosedExpr )*
                    loop139:
                    do {
                        int alt139=3;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==QuotAttributeContent) ) {
                            alt139=1;
                        }
                        else if ( (LA139_0==LBRACESi) ) {
                            alt139=2;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // etc/XQFT.g:816:28: QuotAttributeContent
                    	    {
                    	    QuotAttributeContent585=(Token)input.LT(1);
                    	    match(input,QuotAttributeContent,FOLLOW_QuotAttributeContent_in_dirAttributeValue11387); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    QuotAttributeContent585_tree = (XQFTTree)adaptor.create(QuotAttributeContent585);
                    	    adaptor.addChild(root_0, QuotAttributeContent585_tree);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:816:51: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue11391);
                    	    xmlEnclosedExpr586=xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, xmlEnclosedExpr586.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    QUOTSi587=(Token)input.LT(1);
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue11423); if (failed) return retval;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:818:31: APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    APOSSi588=(Token)input.LT(1);
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue11458); if (failed) return retval;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_APOS_ATTRIBUTE;
                    }
                    // etc/XQFT.g:819:30: ( AposAttributeContent | xmlEnclosedExpr )*
                    loop140:
                    do {
                        int alt140=3;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==AposAttributeContent) ) {
                            alt140=1;
                        }
                        else if ( (LA140_0==LBRACESi) ) {
                            alt140=2;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // etc/XQFT.g:819:31: AposAttributeContent
                    	    {
                    	    AposAttributeContent589=(Token)input.LT(1);
                    	    match(input,AposAttributeContent,FOLLOW_AposAttributeContent_in_dirAttributeValue11493); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    AposAttributeContent589_tree = (XQFTTree)adaptor.create(AposAttributeContent589);
                    	    adaptor.addChild(root_0, AposAttributeContent589_tree);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:819:54: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue11497);
                    	    xmlEnclosedExpr590=xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, xmlEnclosedExpr590.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    APOSSi591=(Token)input.LT(1);
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue11532); if (failed) return retval;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end dirAttributeValue

    public static class xmlEnclosedExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start xmlEnclosedExpr
    // etc/XQFT.g:821:14: xmlEnclosedExpr : LBRACESi expr RBRACSi ;
    public final xmlEnclosedExpr_return xmlEnclosedExpr() throws RecognitionException {
        xmlEnclosedExpr_return retval = new xmlEnclosedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi592=null;
        Token RBRACSi594=null;
        expr_return expr593 = null;


        XQFTTree LBRACESi592_tree=null;
        XQFTTree RBRACSi594_tree=null;

        try {
            // etc/XQFT.g:821:48: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:821:50: LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LBRACESi592=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_xmlEnclosedExpr11574); if (failed) return retval;
            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.DEFAULT;
            }
            pushFollow(FOLLOW_expr_in_xmlEnclosedExpr11603);
            expr593=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr593.getTree());
            RBRACSi594=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_xmlEnclosedExpr11631); if (failed) return retval;
            if ( backtracking==0 ) {
              lexer.state = lexer.stack.pop();
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end xmlEnclosedExpr

    public static class dirElemContent_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dirElemContent
    // etc/XQFT.g:827:6: dirElemContent : (dc= directConstructor -> ^( AST_DIRELEMCONTENT $dc) | cd= cDataSection -> ^( AST_DIRELEMCONTENT $cd) | ec= ElementContent -> ^( AST_DIRELEMCONTENT $ec) | xe= xmlEnclosedExpr -> ^( AST_DIRELEMCONTENT $xe) );
    public final dirElemContent_return dirElemContent() throws RecognitionException {
        dirElemContent_return retval = new dirElemContent_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ec=null;
        directConstructor_return dc = null;

        cDataSection_return cd = null;

        xmlEnclosedExpr_return xe = null;


        XQFTTree ec_tree=null;
        RewriteRuleTokenStream stream_ElementContent=new RewriteRuleTokenStream(adaptor,"token ElementContent");
        RewriteRuleSubtreeStream stream_directConstructor=new RewriteRuleSubtreeStream(adaptor,"rule directConstructor");
        RewriteRuleSubtreeStream stream_cDataSection=new RewriteRuleSubtreeStream(adaptor,"rule cDataSection");
        RewriteRuleSubtreeStream stream_xmlEnclosedExpr=new RewriteRuleSubtreeStream(adaptor,"rule xmlEnclosedExpr");
        try {
            // etc/XQFT.g:827:37: (dc= directConstructor -> ^( AST_DIRELEMCONTENT $dc) | cd= cDataSection -> ^( AST_DIRELEMCONTENT $cd) | ec= ElementContent -> ^( AST_DIRELEMCONTENT $ec) | xe= xmlEnclosedExpr -> ^( AST_DIRELEMCONTENT $xe) )
            int alt142=4;
            switch ( input.LA(1) ) {
            case LTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt142=1;
                }
                break;
            case LCDATASi:
                {
                alt142=2;
                }
                break;
            case ElementContent:
                {
                alt142=3;
                }
                break;
            case LBRACESi:
                {
                alt142=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("827:6: dirElemContent : (dc= directConstructor -> ^( AST_DIRELEMCONTENT $dc) | cd= cDataSection -> ^( AST_DIRELEMCONTENT $cd) | ec= ElementContent -> ^( AST_DIRELEMCONTENT $ec) | xe= xmlEnclosedExpr -> ^( AST_DIRELEMCONTENT $xe) );", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // etc/XQFT.g:827:39: dc= directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent11667);
                    dc=directConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_directConstructor.add(dc.getTree());

                    // AST REWRITE
                    // elements: dc
                    // token labels: 
                    // rule labels: dc, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_dc=new RewriteRuleSubtreeStream(adaptor,"token dc",dc!=null?dc.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (XQFTTree)adaptor.nil();
                    // 827:59: -> ^( AST_DIRELEMCONTENT $dc)
                    {
                        // etc/XQFT.g:827:62: ^( AST_DIRELEMCONTENT $dc)
                        {
                        XQFTTree root_1 = (XQFTTree)adaptor.nil();
                        root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_DIRELEMCONTENT, "AST_DIRELEMCONTENT"), root_1);

                        adaptor.addChild(root_1, stream_dc.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:828:18: cd= cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent11696);
                    cd=cDataSection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_cDataSection.add(cd.getTree());

                    // AST REWRITE
                    // elements: cd
                    // token labels: 
                    // rule labels: cd, retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_cd=new RewriteRuleSubtreeStream(adaptor,"token cd",cd!=null?cd.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (XQFTTree)adaptor.nil();
                    // 828:34: -> ^( AST_DIRELEMCONTENT $cd)
                    {
                        // etc/XQFT.g:828:37: ^( AST_DIRELEMCONTENT $cd)
                        {
                        XQFTTree root_1 = (XQFTTree)adaptor.nil();
                        root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_DIRELEMCONTENT, "AST_DIRELEMCONTENT"), root_1);

                        adaptor.addChild(root_1, stream_cd.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:829:18: ec= ElementContent
                    {
                    ec=(Token)input.LT(1);
                    match(input,ElementContent,FOLLOW_ElementContent_in_dirElemContent11726); if (failed) return retval;
                    if ( backtracking==0 ) stream_ElementContent.add(ec);


                    // AST REWRITE
                    // elements: ec
                    // token labels: ec
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_ec=new RewriteRuleTokenStream(adaptor,"token ec",ec);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (XQFTTree)adaptor.nil();
                    // 829:36: -> ^( AST_DIRELEMCONTENT $ec)
                    {
                        // etc/XQFT.g:829:39: ^( AST_DIRELEMCONTENT $ec)
                        {
                        XQFTTree root_1 = (XQFTTree)adaptor.nil();
                        root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_DIRELEMCONTENT, "AST_DIRELEMCONTENT"), root_1);

                        adaptor.addChild(root_1, stream_ec.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:830:18: xe= xmlEnclosedExpr
                    {
                    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirElemContent11756);
                    xe=xmlEnclosedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_xmlEnclosedExpr.add(xe.getTree());

                    // AST REWRITE
                    // elements: xe
                    // token labels: 
                    // rule labels: retval, xe
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_xe=new RewriteRuleSubtreeStream(adaptor,"token xe",xe!=null?xe.tree:null);

                    root_0 = (XQFTTree)adaptor.nil();
                    // 830:37: -> ^( AST_DIRELEMCONTENT $xe)
                    {
                        // etc/XQFT.g:830:40: ^( AST_DIRELEMCONTENT $xe)
                        {
                        XQFTTree root_1 = (XQFTTree)adaptor.nil();
                        root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_DIRELEMCONTENT, "AST_DIRELEMCONTENT"), root_1);

                        adaptor.addChild(root_1, stream_xe.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end dirElemContent

    public static class cDataSection_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start cDataSection
    // etc/XQFT.g:834:7: cDataSection : LCDATASi CDataContents RCDATASi ;
    public final cDataSection_return cDataSection() throws RecognitionException {
        cDataSection_return retval = new cDataSection_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LCDATASi595=null;
        Token CDataContents596=null;
        Token RCDATASi597=null;

        XQFTTree LCDATASi595_tree=null;
        XQFTTree CDataContents596_tree=null;
        XQFTTree RCDATASi597_tree=null;

        try {
            // etc/XQFT.g:834:26: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:834:28: LCDATASi CDataContents RCDATASi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LCDATASi595=(Token)input.LT(1);
            match(input,LCDATASi,FOLLOW_LCDATASi_in_cDataSection11802); if (failed) return retval;
            if ( backtracking==0 ) {
            LCDATASi595_tree = (XQFTTree)adaptor.create(LCDATASi595);
            adaptor.addChild(root_0, LCDATASi595_tree);
            }
            CDataContents596=(Token)input.LT(1);
            match(input,CDataContents,FOLLOW_CDataContents_in_cDataSection11804); if (failed) return retval;
            if ( backtracking==0 ) {
            CDataContents596_tree = (XQFTTree)adaptor.create(CDataContents596);
            adaptor.addChild(root_0, CDataContents596_tree);
            }
            RCDATASi597=(Token)input.LT(1);
            match(input,RCDATASi,FOLLOW_RCDATASi_in_cDataSection11806); if (failed) return retval;
            if ( backtracking==0 ) {
            RCDATASi597_tree = (XQFTTree)adaptor.create(RCDATASi597);
            adaptor.addChild(root_0, RCDATASi597_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end cDataSection

    public static class dirCommentConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dirCommentConstructor
    // etc/XQFT.g:839:5: dirCommentConstructor : LCOMMENTSi DirCommentContent RCOMMENTSi ;
    public final dirCommentConstructor_return dirCommentConstructor() throws RecognitionException {
        dirCommentConstructor_return retval = new dirCommentConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LCOMMENTSi598=null;
        Token DirCommentContent599=null;
        Token RCOMMENTSi600=null;

        XQFTTree LCOMMENTSi598_tree=null;
        XQFTTree DirCommentContent599_tree=null;
        XQFTTree RCOMMENTSi600_tree=null;

        try {
            // etc/XQFT.g:839:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:839:33: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LCOMMENTSi598=(Token)input.LT(1);
            match(input,LCOMMENTSi,FOLLOW_LCOMMENTSi_in_dirCommentConstructor11829); if (failed) return retval;
            if ( backtracking==0 ) {
            LCOMMENTSi598_tree = (XQFTTree)adaptor.create(LCOMMENTSi598);
            adaptor.addChild(root_0, LCOMMENTSi598_tree);
            }
            DirCommentContent599=(Token)input.LT(1);
            match(input,DirCommentContent,FOLLOW_DirCommentContent_in_dirCommentConstructor11831); if (failed) return retval;
            if ( backtracking==0 ) {
            DirCommentContent599_tree = (XQFTTree)adaptor.create(DirCommentContent599);
            adaptor.addChild(root_0, DirCommentContent599_tree);
            }
            RCOMMENTSi600=(Token)input.LT(1);
            match(input,RCOMMENTSi,FOLLOW_RCOMMENTSi_in_dirCommentConstructor11833); if (failed) return retval;
            if ( backtracking==0 ) {
            RCOMMENTSi600_tree = (XQFTTree)adaptor.create(RCOMMENTSi600);
            adaptor.addChild(root_0, RCOMMENTSi600_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end dirCommentConstructor

    public static class dirPIConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start dirPIConstructor
    // etc/XQFT.g:841:5: dirPIConstructor : LPISi PiTarget ( DirPiContents )? RPISi ;
    public final dirPIConstructor_return dirPIConstructor() throws RecognitionException {
        dirPIConstructor_return retval = new dirPIConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPISi601=null;
        Token PiTarget602=null;
        Token DirPiContents603=null;
        Token RPISi604=null;

        XQFTTree LPISi601_tree=null;
        XQFTTree PiTarget602_tree=null;
        XQFTTree DirPiContents603_tree=null;
        XQFTTree RPISi604_tree=null;

        try {
            // etc/XQFT.g:841:27: ( LPISi PiTarget ( DirPiContents )? RPISi )
            // etc/XQFT.g:841:29: LPISi PiTarget ( DirPiContents )? RPISi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LPISi601=(Token)input.LT(1);
            match(input,LPISi,FOLLOW_LPISi_in_dirPIConstructor11854); if (failed) return retval;
            if ( backtracking==0 ) {
            LPISi601_tree = (XQFTTree)adaptor.create(LPISi601);
            adaptor.addChild(root_0, LPISi601_tree);
            }
            PiTarget602=(Token)input.LT(1);
            match(input,PiTarget,FOLLOW_PiTarget_in_dirPIConstructor11856); if (failed) return retval;
            if ( backtracking==0 ) {
            PiTarget602_tree = (XQFTTree)adaptor.create(PiTarget602);
            adaptor.addChild(root_0, PiTarget602_tree);
            }
            // etc/XQFT.g:841:44: ( DirPiContents )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==DirPiContents) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // etc/XQFT.g:841:44: DirPiContents
                    {
                    DirPiContents603=(Token)input.LT(1);
                    match(input,DirPiContents,FOLLOW_DirPiContents_in_dirPIConstructor11858); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DirPiContents603_tree = (XQFTTree)adaptor.create(DirPiContents603);
                    adaptor.addChild(root_0, DirPiContents603_tree);
                    }

                    }
                    break;

            }

            RPISi604=(Token)input.LT(1);
            match(input,RPISi,FOLLOW_RPISi_in_dirPIConstructor11861); if (failed) return retval;
            if ( backtracking==0 ) {
            RPISi604_tree = (XQFTTree)adaptor.create(RPISi604);
            adaptor.addChild(root_0, RPISi604_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end dirPIConstructor

    public static class computedConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start computedConstructor
    // etc/XQFT.g:843:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final computedConstructor_return computedConstructor() throws RecognitionException {
        computedConstructor_return retval = new computedConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        compDocConstructor_return compDocConstructor605 = null;

        compElemConstructor_return compElemConstructor606 = null;

        compAttrConstructor_return compAttrConstructor607 = null;

        compTextConstructor_return compTextConstructor608 = null;

        compCommentConstructor_return compCommentConstructor609 = null;

        compPIConstructor_return compPIConstructor610 = null;



        try {
            // etc/XQFT.g:843:35: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
            int alt144=6;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt144=1;
                }
                break;
            case ELEMENT:
                {
                alt144=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt144=3;
                }
                break;
            case TEXT:
                {
                alt144=4;
                }
                break;
            case COMMENT:
                {
                alt144=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt144=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("843:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 144, 0, input);

                throw nvae;
            }

            switch (alt144) {
                case 1 :
                    // etc/XQFT.g:843:37: compDocConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor11887);
                    compDocConstructor605=compDocConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compDocConstructor605.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:844:40: compElemConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor11928);
                    compElemConstructor606=compElemConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compElemConstructor606.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:845:40: compAttrConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor11969);
                    compAttrConstructor607=compAttrConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compAttrConstructor607.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:846:40: compTextConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor12010);
                    compTextConstructor608=compTextConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compTextConstructor608.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:847:40: compCommentConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor12051);
                    compCommentConstructor609=compCommentConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compCommentConstructor609.getTree());

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:848:40: compPIConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor12092);
                    compPIConstructor610=compPIConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compPIConstructor610.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end computedConstructor

    public static class compDocConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compDocConstructor
    // etc/XQFT.g:850:5: compDocConstructor : DOCUMENT LBRACESi expr RBRACSi ;
    public final compDocConstructor_return compDocConstructor() throws RecognitionException {
        compDocConstructor_return retval = new compDocConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOCUMENT611=null;
        Token LBRACESi612=null;
        Token RBRACSi614=null;
        expr_return expr613 = null;


        XQFTTree DOCUMENT611_tree=null;
        XQFTTree LBRACESi612_tree=null;
        XQFTTree RBRACSi614_tree=null;

        try {
            // etc/XQFT.g:850:36: ( DOCUMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:850:38: DOCUMENT LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOCUMENT611=(Token)input.LT(1);
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor12120); if (failed) return retval;
            if ( backtracking==0 ) {
            DOCUMENT611_tree = (XQFTTree)adaptor.create(DOCUMENT611);
            adaptor.addChild(root_0, DOCUMENT611_tree);
            }
            LBRACESi612=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compDocConstructor12122); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_compDocConstructor12125);
            expr613=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr613.getTree());
            RBRACSi614=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compDocConstructor12127); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end compDocConstructor

    public static class compElemConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compElemConstructor
    // etc/XQFT.g:854:5: compElemConstructor : ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi ;
    public final compElemConstructor_return compElemConstructor() throws RecognitionException {
        compElemConstructor_return retval = new compElemConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ELEMENT615=null;
        Token LBRACESi617=null;
        Token RBRACSi619=null;
        Token LBRACESi620=null;
        Token RBRACSi622=null;
        qName_return qName616 = null;

        expr_return expr618 = null;

        contentExpr_return contentExpr621 = null;


        XQFTTree ELEMENT615_tree=null;
        XQFTTree LBRACESi617_tree=null;
        XQFTTree RBRACSi619_tree=null;
        XQFTTree LBRACESi620_tree=null;
        XQFTTree RBRACSi622_tree=null;

        try {
            // etc/XQFT.g:854:36: ( ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi )
            // etc/XQFT.g:854:38: ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ELEMENT615=(Token)input.LT(1);
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor12157); if (failed) return retval;
            if ( backtracking==0 ) {
            ELEMENT615_tree = (XQFTTree)adaptor.create(ELEMENT615);
            adaptor.addChild(root_0, ELEMENT615_tree);
            }
            // etc/XQFT.g:854:46: ( qName | LBRACESi expr RBRACSi )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=ALL && LA145_0<=XQUERY)||LA145_0==NCName) ) {
                alt145=1;
            }
            else if ( (LA145_0==LBRACESi) ) {
                alt145=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("854:46: ( qName | LBRACESi expr RBRACSi )", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // etc/XQFT.g:854:47: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor12160);
                    qName616=qName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, qName616.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:854:55: LBRACESi expr RBRACSi
                    {
                    LBRACESi617=(Token)input.LT(1);
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor12164); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LBRACESi617_tree = (XQFTTree)adaptor.create(LBRACESi617);
                    adaptor.addChild(root_0, LBRACESi617_tree);
                    }
                    pushFollow(FOLLOW_expr_in_compElemConstructor12166);
                    expr618=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr618.getTree());
                    RBRACSi619=(Token)input.LT(1);
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor12168); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RBRACSi619_tree = (XQFTTree)adaptor.create(RBRACSi619);
                    adaptor.addChild(root_0, RBRACSi619_tree);
                    }

                    }
                    break;

            }

            LBRACESi620=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor12187); if (failed) return retval;
            if ( backtracking==0 ) {
            LBRACESi620_tree = (XQFTTree)adaptor.create(LBRACESi620);
            adaptor.addChild(root_0, LBRACESi620_tree);
            }
            // etc/XQFT.g:855:25: ( contentExpr )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=ALL && LA146_0<=XQUERY)||LA146_0==StringLiteral||LA146_0==DOLLARSi||LA146_0==LPARSi||(LA146_0>=STARSi && LA146_0<=MINUSSi)||LA146_0==LTSi||(LA146_0>=IntegerLiteral && LA146_0<=LPRAGSi)||(LA146_0>=SLASHSi && LA146_0<=DBLSLASHSi)||(LA146_0>=DOTDOTSi && LA146_0<=ATSi)||LA146_0==DOTSi||LA146_0==LCOMMENTSi||LA146_0==LPISi||LA146_0==NCName) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // etc/XQFT.g:855:25: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor12189);
                    contentExpr621=contentExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, contentExpr621.getTree());

                    }
                    break;

            }

            RBRACSi622=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor12192); if (failed) return retval;
            if ( backtracking==0 ) {
            RBRACSi622_tree = (XQFTTree)adaptor.create(RBRACSi622);
            adaptor.addChild(root_0, RBRACSi622_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end compElemConstructor

    public static class contentExpr_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start contentExpr
    // etc/XQFT.g:858:6: contentExpr : expr ;
    public final contentExpr_return contentExpr() throws RecognitionException {
        contentExpr_return retval = new contentExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        expr_return expr623 = null;



        try {
            // etc/XQFT.g:858:37: ( expr )
            // etc/XQFT.g:858:39: expr
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_contentExpr12225);
            expr623=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr623.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end contentExpr

    public static class compAttrConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compAttrConstructor
    // etc/XQFT.g:862:5: compAttrConstructor : ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final compAttrConstructor_return compAttrConstructor() throws RecognitionException {
        compAttrConstructor_return retval = new compAttrConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ATTRIBUTE624=null;
        Token LBRACESi626=null;
        Token RBRACSi628=null;
        Token LBRACESi629=null;
        Token RBRACSi631=null;
        qName_return qName625 = null;

        expr_return expr627 = null;

        expr_return expr630 = null;


        XQFTTree ATTRIBUTE624_tree=null;
        XQFTTree LBRACESi626_tree=null;
        XQFTTree RBRACSi628_tree=null;
        XQFTTree LBRACESi629_tree=null;
        XQFTTree RBRACSi631_tree=null;

        try {
            // etc/XQFT.g:862:36: ( ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:862:38: ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ATTRIBUTE624=(Token)input.LT(1);
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor12270); if (failed) return retval;
            if ( backtracking==0 ) {
            ATTRIBUTE624_tree = (XQFTTree)adaptor.create(ATTRIBUTE624);
            adaptor.addChild(root_0, ATTRIBUTE624_tree);
            }
            // etc/XQFT.g:862:48: ( qName | ( LBRACESi expr RBRACSi ) )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( ((LA147_0>=ALL && LA147_0<=XQUERY)||LA147_0==NCName) ) {
                alt147=1;
            }
            else if ( (LA147_0==LBRACESi) ) {
                alt147=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("862:48: ( qName | ( LBRACESi expr RBRACSi ) )", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // etc/XQFT.g:862:49: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor12273);
                    qName625=qName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, qName625.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:862:57: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:862:57: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:862:58: LBRACESi expr RBRACSi
                    {
                    LBRACESi626=(Token)input.LT(1);
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor12278); if (failed) return retval;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor12281);
                    expr627=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr627.getTree());
                    RBRACSi628=(Token)input.LT(1);
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor12283); if (failed) return retval;

                    }


                    }
                    break;

            }

            LBRACESi629=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor12304); if (failed) return retval;
            // etc/XQFT.g:863:26: ( expr )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( ((LA148_0>=ALL && LA148_0<=XQUERY)||LA148_0==StringLiteral||LA148_0==DOLLARSi||LA148_0==LPARSi||(LA148_0>=STARSi && LA148_0<=MINUSSi)||LA148_0==LTSi||(LA148_0>=IntegerLiteral && LA148_0<=LPRAGSi)||(LA148_0>=SLASHSi && LA148_0<=DBLSLASHSi)||(LA148_0>=DOTDOTSi && LA148_0<=ATSi)||LA148_0==DOTSi||LA148_0==LCOMMENTSi||LA148_0==LPISi||LA148_0==NCName) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // etc/XQFT.g:863:26: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor12307);
                    expr630=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr630.getTree());

                    }
                    break;

            }

            RBRACSi631=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor12310); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end compAttrConstructor

    public static class compTextConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compTextConstructor
    // etc/XQFT.g:865:5: compTextConstructor : TEXT LBRACESi expr RBRACSi ;
    public final compTextConstructor_return compTextConstructor() throws RecognitionException {
        compTextConstructor_return retval = new compTextConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TEXT632=null;
        Token LBRACESi633=null;
        Token RBRACSi635=null;
        expr_return expr634 = null;


        XQFTTree TEXT632_tree=null;
        XQFTTree LBRACESi633_tree=null;
        XQFTTree RBRACSi635_tree=null;

        try {
            // etc/XQFT.g:865:36: ( TEXT LBRACESi expr RBRACSi )
            // etc/XQFT.g:865:38: TEXT LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            TEXT632=(Token)input.LT(1);
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor12347); if (failed) return retval;
            if ( backtracking==0 ) {
            TEXT632_tree = (XQFTTree)adaptor.create(TEXT632);
            adaptor.addChild(root_0, TEXT632_tree);
            }
            LBRACESi633=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compTextConstructor12349); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_compTextConstructor12352);
            expr634=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr634.getTree());
            RBRACSi635=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compTextConstructor12354); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end compTextConstructor

    public static class compCommentConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compCommentConstructor
    // etc/XQFT.g:867:5: compCommentConstructor : COMMENT LBRACESi expr RBRACSi ;
    public final compCommentConstructor_return compCommentConstructor() throws RecognitionException {
        compCommentConstructor_return retval = new compCommentConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COMMENT636=null;
        Token LBRACESi637=null;
        Token RBRACSi639=null;
        expr_return expr638 = null;


        XQFTTree COMMENT636_tree=null;
        XQFTTree LBRACESi637_tree=null;
        XQFTTree RBRACSi639_tree=null;

        try {
            // etc/XQFT.g:867:36: ( COMMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:867:38: COMMENT LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            COMMENT636=(Token)input.LT(1);
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor12379); if (failed) return retval;
            if ( backtracking==0 ) {
            COMMENT636_tree = (XQFTTree)adaptor.create(COMMENT636);
            adaptor.addChild(root_0, COMMENT636_tree);
            }
            LBRACESi637=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compCommentConstructor12381); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_compCommentConstructor12384);
            expr638=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr638.getTree());
            RBRACSi639=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compCommentConstructor12386); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end compCommentConstructor

    public static class compPIConstructor_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start compPIConstructor
    // etc/XQFT.g:869:5: compPIConstructor : PROCESSING_INSTRUCTION ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final compPIConstructor_return compPIConstructor() throws RecognitionException {
        compPIConstructor_return retval = new compPIConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token PROCESSING_INSTRUCTION640=null;
        Token LBRACESi642=null;
        Token RBRACSi644=null;
        Token LBRACESi645=null;
        Token RBRACSi647=null;
        ncNameorKeyword_return ncNameorKeyword641 = null;

        expr_return expr643 = null;

        expr_return expr646 = null;


        XQFTTree PROCESSING_INSTRUCTION640_tree=null;
        XQFTTree LBRACESi642_tree=null;
        XQFTTree RBRACSi644_tree=null;
        XQFTTree LBRACESi645_tree=null;
        XQFTTree RBRACSi647_tree=null;

        try {
            // etc/XQFT.g:869:36: ( PROCESSING_INSTRUCTION ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:869:38: PROCESSING_INSTRUCTION ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            PROCESSING_INSTRUCTION640=(Token)input.LT(1);
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor12416); if (failed) return retval;
            if ( backtracking==0 ) {
            PROCESSING_INSTRUCTION640_tree = (XQFTTree)adaptor.create(PROCESSING_INSTRUCTION640);
            adaptor.addChild(root_0, PROCESSING_INSTRUCTION640_tree);
            }
            // etc/XQFT.g:869:61: ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) )
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=ALL && LA149_0<=XQUERY)||LA149_0==NCName) ) {
                alt149=1;
            }
            else if ( (LA149_0==LBRACESi) ) {
                alt149=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("869:61: ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) )", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // etc/XQFT.g:869:62: ncNameorKeyword
                    {
                    pushFollow(FOLLOW_ncNameorKeyword_in_compPIConstructor12419);
                    ncNameorKeyword641=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword641.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:869:80: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:869:80: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:869:81: LBRACESi expr RBRACSi
                    {
                    LBRACESi642=(Token)input.LT(1);
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor12424); if (failed) return retval;
                    pushFollow(FOLLOW_expr_in_compPIConstructor12427);
                    expr643=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr643.getTree());
                    RBRACSi644=(Token)input.LT(1);
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor12429); if (failed) return retval;

                    }


                    }
                    break;

            }

            LBRACESi645=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor12450); if (failed) return retval;
            // etc/XQFT.g:870:26: ( expr )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( ((LA150_0>=ALL && LA150_0<=XQUERY)||LA150_0==StringLiteral||LA150_0==DOLLARSi||LA150_0==LPARSi||(LA150_0>=STARSi && LA150_0<=MINUSSi)||LA150_0==LTSi||(LA150_0>=IntegerLiteral && LA150_0<=LPRAGSi)||(LA150_0>=SLASHSi && LA150_0<=DBLSLASHSi)||(LA150_0>=DOTDOTSi && LA150_0<=ATSi)||LA150_0==DOTSi||LA150_0==LCOMMENTSi||LA150_0==LPISi||LA150_0==NCName) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:870:26: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor12453);
                    expr646=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr646.getTree());

                    }
                    break;

            }

            RBRACSi647=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor12456); if (failed) return retval;

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end compPIConstructor

    public static class ncNameorKeyword_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start ncNameorKeyword
    // etc/XQFT.g:878:1: ncNameorKeyword : ( NCName | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMA_ATTRIBUTE | SCHEMA_ELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY );
    public final ncNameorKeyword_return ncNameorKeyword() throws RecognitionException {
        ncNameorKeyword_return retval = new ncNameorKeyword_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set648=null;

        XQFTTree set648_tree=null;

        try {
            // etc/XQFT.g:878:23: ( NCName | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMA_ATTRIBUTE | SCHEMA_ELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set648=(Token)input.LT(1);
            if ( (input.LA(1)>=ALL && input.LA(1)<=XQUERY)||input.LA(1)==NCName ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set648));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ncNameorKeyword0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (XQFTTree)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return retval;
    }
    // $ANTLR end ncNameorKeyword

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:328:14: ( IMPORT ( SCHEMA | MODULE ) )
        // etc/XQFT.g:328:15: IMPORT ( SCHEMA | MODULE )
        {
        match(input,IMPORT,FOLLOW_IMPORT_in_synpred11096); if (failed) return ;
        if ( input.LA(1)==MODULE||input.LA(1)==SCHEMA ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred11098);    throw mse;
        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:413:34: ( itemType occurrenceIndicator )
        // etc/XQFT.g:413:35: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred22556);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred22558);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:458:34: ( IF LPARSi )
        // etc/XQFT.g:458:35: IF LPARSi
        {
        match(input,IF,FOLLOW_IF_in_synpred33630); if (failed) return ;
        match(input,LPARSi,FOLLOW_LPARSi_in_synpred33632); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:459:37: ( TYPESWITCH LPARSi )
        // etc/XQFT.g:459:38: TYPESWITCH LPARSi
        {
        match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_synpred43675); if (failed) return ;
        match(input,LPARSi,FOLLOW_LPARSi_in_synpred43677); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // etc/XQFT.g:699:34: ( SLASHSi relativePathExpr )
        // etc/XQFT.g:699:35: SLASHSi relativePathExpr
        {
        match(input,SLASHSi,FOLLOW_SLASHSi_in_synpred58838); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred58840);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // etc/XQFT.g:708:15: ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )
        // etc/XQFT.g:708:16: ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi
        {
        if ( input.LA(1)==ATTRIBUTE||input.LA(1)==COMMENT||(input.LA(1)>=DOCUMENT_NODE && input.LA(1)<=ELEMENT)||input.LA(1)==NODE||input.LA(1)==PROCESSING_INSTRUCTION||(input.LA(1)>=SCHEMA_ATTRIBUTE && input.LA(1)<=SCHEMA_ELEMENT)||input.LA(1)==TEXT ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred68995);    throw mse;
        }

        match(input,LPARSi,FOLLOW_LPARSi_in_synpred69061); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // etc/XQFT.g:722:40: ( STARSi | ncNameorKeyword COLONSi STARSi )
        int alt151=2;
        int LA151_0 = input.LA(1);

        if ( (LA151_0==STARSi) ) {
            alt151=1;
        }
        else if ( ((LA151_0>=ALL && LA151_0<=XQUERY)||LA151_0==NCName) ) {
            alt151=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("722:40: synpred7 : ( STARSi | ncNameorKeyword COLONSi STARSi );", 151, 0, input);

            throw nvae;
        }
        switch (alt151) {
            case 1 :
                // etc/XQFT.g:722:41: STARSi
                {
                match(input,STARSi,FOLLOW_STARSi_in_synpred79336); if (failed) return ;

                }
                break;
            case 2 :
                // etc/XQFT.g:722:50: ncNameorKeyword COLONSi STARSi
                {
                pushFollow(FOLLOW_ncNameorKeyword_in_synpred79340);
                ncNameorKeyword();
                _fsp--;
                if (failed) return ;
                match(input,COLONSi,FOLLOW_COLONSi_in_synpred79342); if (failed) return ;
                match(input,STARSi,FOLLOW_STARSi_in_synpred79344); if (failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // etc/XQFT.g:726:41: ( STARSi COLONSi )
        // etc/XQFT.g:726:42: STARSi COLONSi
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred89441); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred89443); if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_versionDecl_in_module619 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_libraryModule_in_module636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl728 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_versionDecl737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule766 = new BitSet(new long[]{0x8000000002000002L});
    public static final BitSet FOLLOW_prolog_in_libraryModule768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl799 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_moduleDecl801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_moduleDecl803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl805 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_moduleDecl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule869 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_queryBody_in_mainModule871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr938 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_expr941 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_expr943 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_importStmt_in_prolog1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_DECLARE_in_prolog1123 = new BitSet(new long[]{0x028000000540A000L,0x0000000044040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_setter_in_prolog1142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varDecl_in_prolog1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_functionDecl_in_prolog1178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_optionDecl_in_prolog1196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_prolog1246 = new BitSet(new long[]{0x8000000002000002L});
    public static final BitSet FOLLOW_DEFAULT_in_setter1319 = new BitSet(new long[]{0x0200001000100002L,0x0000000010000000L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_setter1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceDecl_in_setter1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter1444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl1527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl1547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl1573 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl1575 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl1610 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_namespaceDecl1612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_namespaceDecl1614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl1637 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl1639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE_URI_in_baseURIDecl1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl1696 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L});
    public static final BitSet FOLLOW_set_in_constructionDecl1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl1726 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl1754 = new BitSet(new long[]{0x0000000000000000L,0x0000002000400000L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl1756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl1758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importStmt1856 = new BitSet(new long[]{0x0000000000000000L,0x0000080000010000L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport1890 = new BitSet(new long[]{0x0000000004000000L,0x0000000000040000L,0x0000000800000000L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport1892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1895 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AT_in_schemaImport1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1900 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport1903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1905 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1937 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_schemaPrefix1939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_schemaPrefix1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix1947 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix1949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport1981 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_moduleImport1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_moduleImport1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1989 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AT_in_moduleImport1992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1994 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport1997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1999 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl2035 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl2037 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_varDecl2039 = new BitSet(new long[]{0x0000800000000200L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl2041 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varDecl2046 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_varDecl2048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_qName2084 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COLONSi_in_qName2089 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_qName2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration2124 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration2126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl2155 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_functionDecl2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionDecl2159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000088000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl2161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionDecl2164 = new BitSet(new long[]{0x0000800000000200L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl2179 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl2181 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList2286 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_paramList2289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_param_in_paramList2291 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_param2327 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_param2329 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_typeDeclaration_in_param2331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_enclosedExpr2376 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_enclosedExpr2392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_enclosedExpr2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl2455 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_optionDecl2457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl2485 = new BitSet(new long[]{0x0000000040010000L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions2511 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_itemType_in_sequenceType2563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType2593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_sequenceType2595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_sequenceType2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_itemType2648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_itemType2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest2849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_NODE_in_documentTest3037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_documentTest3039 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest3043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest3047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_documentTest3051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest3080 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_elementTest3082 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000088000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest3086 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest3089 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_typeName_in_elementTest3091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000480000000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_elementTest3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_elementTest3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_ELEMENT_in_schemaElementTest3217 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaElementTest3219 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest3222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaElementTest3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest3281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_attributeTest3283 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000088000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest3287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest3290 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_typeName_in_attributeTest3292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_attributeTest3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard3324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_ATTRIBUTE_in_schemaAttributeTest3378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaAttributeTest3380 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest3383 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaAttributeTest3385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration3407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest3442 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_piTest3444 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000008080000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_piTest3448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_piTest3452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_piTest3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest3486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_commentTest3488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_commentTest3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest3524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_textTest3526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_textTest3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest3559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_anyKindTest3561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_anyKindTest3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle3696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr3839 = new BitSet(new long[]{0x0004000000000000L,0x0010010010000800L,0x0000000000000100L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr3845 = new BitSet(new long[]{0x0004000000000000L,0x0010010010000800L,0x0000000000000100L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr3849 = new BitSet(new long[]{0x0000000000000000L,0x0010010010000000L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr3852 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr3855 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause3959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_forClauseTupletDef_in_forClause3961 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_forClause3964 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_forClauseTupletDef_in_forClause3966 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClauseTupletDef4065 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_forClauseTupletDef4068 = new BitSet(new long[]{0x0000000000000A00L,0x0000400000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClauseTupletDef4070 = new BitSet(new long[]{0x0000000000000800L,0x0000400000000001L});
    public static final BitSet FOLLOW_positionalVar_in_forClauseTupletDef4073 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000001L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClauseTupletDef4076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_forClauseTupletDef4079 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_forClauseTupletDef4082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_varName4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_positionalVar4139 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar4141 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_positionalVar4143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar4174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar4176 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar4178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause4228 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_varBinding_in_letClause4230 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_letClause4233 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_varBinding_in_letClause4235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding4311 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_varBinding4315 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varBinding4317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SCORE_in_varBinding4322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding4324 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_varBinding4328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varBinding4344 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_varBinding4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause4409 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_whereClause4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause4498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BY_in_orderByClause4500 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_STABLE_in_orderByClause4504 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause4506 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BY_in_orderByClause4508 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause4511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList4601 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList4604 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList4606 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec4697 = new BitSet(new long[]{0x0000020020100402L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec4699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier4728 = new BitSet(new long[]{0x0000020000100002L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier4738 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_orderModifier4740 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier4751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOME_in_quantifiedExpr4791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_EVERY_in_quantifiedExpr4795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_quantifiedExprTupleDef_in_quantifiedExpr4798 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr4813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_quantifiedExprTupleDef_in_quantifiedExpr4815 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr4819 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExprTupleDef4912 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExprTupleDef4914 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExprTupleDef4916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_quantifiedExprTupleDef4919 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExprTupleDef4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr5007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_typeswitchExpr5009 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr5011 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_typeswitchExpr5013 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr5015 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr5031 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr5034 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr5036 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr5040 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause5139 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000800000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause5142 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_caseClause5144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_caseClause5146 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause5150 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause5152 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_caseClause5154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr5260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ifExpr5262 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_ifExpr5264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ifExpr5266 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr5268 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr5270 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr5272 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr5376 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_OR_in_orExpr5380 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_andExpr_in_orExpr5383 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr5418 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AND_in_andExpr5422 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr5425 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr5459 = new BitSet(new long[]{0x1400080000000002L,0x0000000000084220L,0x03F8002000000000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr5464 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr5469 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr5474 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr5478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr5505 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr5509 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr5512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr5514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr5549 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_TO_in_rangeExpr5553 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr5587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_set_in_additiveExpr5591 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr5600 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr5626 = new BitSet(new long[]{0x2000000200000002L,0x0000000000008000L,0x0000800000000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr5630 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr5647 = new BitSet(new long[]{0x2000000200000002L,0x0000000000008000L,0x0000800000000000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr5683 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000002L});
    public static final BitSet FOLLOW_set_in_unionExpr5687 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr5696 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000002L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr5723 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr5727 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr5736 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr5769 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr5773 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr5776 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr5818 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr5822 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_treatExpr5825 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr5828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr5865 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr5869 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_castableExpr5872 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_singleType_in_castableExpr5875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr5917 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_CAST_in_castExpr5921 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_castExpr5924 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_singleType_in_castExpr5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr5970 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr5981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType6020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_singleType6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption6098 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption6101 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption6103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection6273 = new BitSet(new long[]{0x0000010180000802L,0x0000020020000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection6275 = new BitSet(new long[]{0x0000010180000802L,0x0000020020000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection6279 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection6281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr6317 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_FTOR_in_ftOr6321 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr6324 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd6361 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd6365 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd6368 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot6402 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot6406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_ftMildNot6409 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot6412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot6447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions6468 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftPrimaryWithOptions6471 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary6507 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftPrimary6530 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary6533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftPrimary6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary6556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords6608 = new BitSet(new long[]{0x0000000000000032L,0x0000000400000000L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue6643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_ftWordsValue6648 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_ftWordsValue6651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftWordsValue6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption6768 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption6777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes6821 = new BitSet(new long[]{0x0008200000000800L});
    public static final BitSet FOLLOW_ftRange_in_ftTimes6824 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes6826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange6865 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange6867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange6905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020400L});
    public static final BitSet FOLLOW_set_in_ftRange6907 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange6913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange6960 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange6962 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_TO_in_ftRange6964 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection6992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_ftExtensionSelection6995 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00340800000000L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection6998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftExtensionSelection7001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPRAGSi_in_pragma7040 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_pragma7043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_PragmaContents_in_pragma7045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPRAGSi_in_pragma7048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter7089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter7093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter7097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter7101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow7164 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow7166 = new BitSet(new long[]{0x0000000000000000L,0x0002000100000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance7241 = new BitSet(new long[]{0x0008200000000800L});
    public static final BitSet FOLLOW_ftRange_in_ftDistance7243 = new BitSet(new long[]{0x0000000000000000L,0x0002000100000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope7283 = new BitSet(new long[]{0x0000000000000000L,0x0004000080000000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent7357 = new BitSet(new long[]{0x0000008000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_set_in_ftContent7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent7369 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent7371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption7447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption7485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftMatchOption7561 = new BitSet(new long[]{0x0000000004000000L,0x08C0000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftMatchOption7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STEMMING_in_ftMatchOption7643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftMatchOption7758 = new BitSet(new long[]{0x0000000000000000L,0x08C0000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftMatchOption7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THESAURUS_in_ftMatchOption7803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STEMMING_in_ftMatchOption7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_in_ftMatchOption7883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftMatchOption7885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption7982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption7985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption8012 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000004L});
    public static final BitSet FOLLOW_set_in_ftCaseOption8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption8060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption8100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption8196 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000004L});
    public static final BitSet FOLLOW_set_in_ftDiacriticsOption8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption8239 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption8242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption8244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption8268 = new BitSet(new long[]{0x0000000004000800L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftThesaurusOption8308 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption8312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption8316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption8320 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption8322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftThesaurusOption8326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID8404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID8406 = new BitSet(new long[]{0x0008200000000802L,0x0000008000000000L});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID8409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID8411 = new BitSet(new long[]{0x0008200000000802L});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID8416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption8513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption8515 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption8517 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption8519 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption8559 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption8561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption8563 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption8565 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList8631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftRefOrList8650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList8653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList8656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList8658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftRefOrList8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral8680 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral8688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr8726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr8758 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000100L,0x0000100000000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr8760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_validateExpr8763 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_validateExpr8766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_validateExpr8768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr8844 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1084880000FFFFL,0x0000000002240098L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr8862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_pathExpr8878 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1084880000FFFFL,0x0000000002240098L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr8881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr8932 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_SLASHSi_in_relativePathExpr8936 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1084880000FFFFL,0x0000000002240098L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_relativePathExpr8941 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1084880000FFFFL,0x0000000002240098L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr8945 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr9097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr9114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep9162 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep9166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_predicateList_in_axisStep9170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep9204 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000080000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep9210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis9241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_reverseAxis9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest9295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest9299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest9366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest9386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard9448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard9450 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_wildcard9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard9477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_wildcard9522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard9524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOTSi_in_abbrevReverseStep9567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep9630 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000080000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep9636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis9712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_forwardAxis9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep9799 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000080000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList9877 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LBRACKSi_in_predicate9937 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_predicate9939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RBRACKSi_in_predicate9941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr10050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_extensionExpr10053 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C13A4880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_extensionExpr10056 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_extensionExpr10059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr10095 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr10097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr10124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr10140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr10156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr10172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr10200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr10216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr10232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef10286 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_varName_in_varRef10289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_parenthesizedExpr10312 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C138C880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr10315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_parenthesizedExpr10318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTSi_in_contextItemExpr10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall10372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionCall10374 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C138C880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_functionCall10392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall10395 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_exprSingle_in_functionCall10397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionCall10417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr10510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_orderedExpr10512 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_orderedExpr10515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_orderedExpr10517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr10546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_unorderedExpr10548 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_unorderedExpr10551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_unorderedExpr10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor10585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor10589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor10629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirPIConstructor_in_directConstructor10699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTSi_in_dirElemConstructor10757 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor10823 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x004000000000FFFFL,0x0000000002000100L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor10825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_RSELFTERMSi_in_dirElemConstructor10888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor10989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010100000000000L,0x000000000024C200L});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor11084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010100000000000L,0x000000000024C200L});
    public static final BitSet FOLLOW_LENDTAGSi_in_dirElemConstructor11113 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor11143 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList11313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_dirAttributeList11315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001400L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList11317 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue11355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_QuotAttributeContent_in_dirAttributeValue11387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue11391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000000C00L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue11423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue11458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_AposAttributeContent_in_dirAttributeValue11493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue11497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue11532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_xmlEnclosedExpr11574 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_xmlEnclosedExpr11603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_xmlEnclosedExpr11631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent11667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent11696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContent_in_dirElemContent11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirElemContent11756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCDATASi_in_cDataSection11802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_CDataContents_in_cDataSection11804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RCDATASi_in_cDataSection11806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCOMMENTSi_in_dirCommentConstructor11829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_DirCommentContent_in_dirCommentConstructor11831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_RCOMMENTSi_in_dirCommentConstructor11833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPISi_in_dirPIConstructor11854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_PiTarget_in_dirPIConstructor11856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_DirPiContents_in_dirPIConstructor11858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_RPISi_in_dirPIConstructor11861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor11887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor11928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor11969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor12010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor12051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor12092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor12120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compDocConstructor12122 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_compDocConstructor12125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compDocConstructor12127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor12157 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000010000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor12160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor12164 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_compElemConstructor12166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor12168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor12187 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C13A4880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor12189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor12192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr12225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor12270 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000010000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor12273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor12278 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor12281 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor12283 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor12304 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C13A4880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor12307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor12310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor12347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compTextConstructor12349 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_compTextConstructor12352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compTextConstructor12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor12379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compCommentConstructor12381 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor12384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compCommentConstructor12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor12416 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000010000000FFFFL,0x0000000002000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_compPIConstructor12419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor12424 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1384880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_compPIConstructor12427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor12429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor12450 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C13A4880000FFFFL,0x000000000224009BL});
    public static final BitSet FOLLOW_expr_in_compPIConstructor12453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor12456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ncNameorKeyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_synpred11096 = new BitSet(new long[]{0x0000000000000000L,0x0000080000010000L});
    public static final BitSet FOLLOW_set_in_synpred11098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred22556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred22558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred33630 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_synpred33632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_synpred43675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_synpred43677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_synpred58838 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1084880000FFFFL,0x0000000002240098L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred58840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred68995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_synpred69061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred79336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_synpred79340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred79342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_STARSi_in_synpred79344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred89441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred89443 = new BitSet(new long[]{0x0000000000000002L});

}