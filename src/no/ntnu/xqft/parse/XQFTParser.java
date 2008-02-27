// $ANTLR 3.0.1 etc/XQFT.g 2008-02-27 12:37:07

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL", "ANY", "ANCESTOR", "ANCESTOR_OR_SELF", "AND", "AS", "ASCENDING", "AT", "ATTRIBUTE", "BASE_URI", "BY", "BOUNDARYSPACE", "CASE", "CAST", "CASTABLE", "CHILD", "COLLATION", "COMMENT", "CONSTRUCTION", "CONTENT", "COPY_NAMESPACES", "DECLARE", "DEFAULT", "DESCENDANT", "DESCENDANT_OR_SELF", "DESCENDING", "DIACRITICS", "DIFFERENT", "DISTANCE", "DIV", "DOCUMENT", "DOCUMENT_NODE", "ELEMENT", "ELSE", "ENCODING", "END", "ENTIRE", "EMPTY", "EMPTY_SEQUENCE", "EQ", "EVERY", "EXACTLY", "EXCEPT", "EXTERNAL", "FOLLOWING", "FOLLOWING_SIBLING", "FOR", "FROM", "FTAND", "FTCONTAINS", "FTNOT", "FTOPTION", "FTOR", "FUNCTION", "GE", "GREATEST", "GT", "IDIV", "IF", "IMPORT", "IN", "INHERIT", "INSENSITIVE", "INSTANCE", "INTERSECT", "IS", "ITEM", "LANGUAGE", "LAX", "LE", "LEAST", "LET", "LEVELS", "LOWERCASE", "LT", "MOD", "MODULE", "MOST", "NAMESPACE", "NE", "NODE", "NOINHERIT", "NOPRESERVE", "NOT", "OCCURS", "OF", "OPTION", "OR", "ORDER", "ORDERED", "ORDERING", "PARAGRAPH", "PARAGRAPHS", "PARENT", "PHRASE", "PRECEDING", "PRECEDING_SIBLING", "PRESERVE", "PROCESSING_INSTRUCTION", "RELATIONSHIP", "RETURN", "SAME", "SATISFIES", "SCHEMA", "SCHEMA_ATTRIBUTE", "SCHEMA_ELEMENT", "SCORE", "SELF", "SENSITIVE", "SENTENCES", "SENTENCE", "SOME", "STABLE", "START", "STEMMING", "STOP", "STRICT", "STRIP", "TEXT", "THESAURUS", "THEN", "TIMES", "TO", "TREAT", "TYPESWITCH", "UNION", "UNORDERED", "UPPERCASE", "VALIDATE", "VARIABLE", "VERSION", "WEIGHT", "WHERE", "WILDCARDS", "WINDOW", "WITH", "WITHOUT", "WORD", "WORDS", "XQUERY", "AST_MODULE", "AST_FLWOR", "AST_FORCLAUSE", "AST_LETCLAUSE", "AST_ORDERBYCLAUSE", "AST_WHERECLAUSE", "AST_RETURNCLAUSE", "AST_QUANTIFIEDEXPR", "AST_TYPESWITCHEXPR", "AST_CASECLAUSE", "AST_IFEXPR", "AST_PATHEXPR", "AST_FTSELECTION", "AST_FTPOSFILTER", "AST_FUNCTIONCALL", "AST_FUNCTIONDECL", "AST_PREDICATE", "AST_DIRELEMCONSTRUCTOR", "AST_DIRELEMCONTENT", "StringLiteral", "SEMICOLONSi", "EQSi", "COMMASi", "DOLLARSi", "ASSIGNSi", "QName", "LPARSi", "RPARSi", "LBRACESi", "RBRACSi", "QUESTIONSi", "STARSi", "PLUSSi", "MINUSSi", "PIPESi", "NEQSi", "LTSi", "LTOREQSi", "GTSi", "GTOREQSi", "NODEBEFORESi", "NODEAFTERSi", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "LPRAGSi", "PragmaContents", "RPRAGSi", "SLASHSi", "DBLSLASHSi", "DBLCOLONSi", "COLONSi", "DOTDOTSi", "ATSi", "LBRACKSi", "RBRACKSi", "DOTSi", "RSELFTERMSi", "LENDTAGSi", "QUOTSi", "QuotAttributeContent", "APOSSi", "AposAttributeContent", "ElementContent", "LCDATASi", "CDataContents", "RCDATASi", "LCOMMENTSi", "DirCommentContent", "RCOMMENTSi", "LPISi", "PiTarget", "DirPiContents", "RPISi", "NCName", "CDataSectionLEX", "DirPIConstructor", "DirCommentConstLEX", "PragmaLEX", "Comment", "NumberLEX", "LexSigns", "S", "LexLiterals", "TOKENSWITCH", "PredefinedEntityRef", "CharRef", "NotChar", "AMPERSi", "QuotAttrContentChar", "AposAttrContentChar", "ElementContentChar", "CREFDECSi", "CREFHEXSi", "Name", "Letter", "UNDERSCORESi", "NameChar", "Digit", "CombiningChar", "Extender", "SHARPSi", "LXQCOMMENTSi", "RXQCOMMENTSi", "Digits", "NCNameStartChar", "NCNameChar", "EXCLSi", "BACKSLASHSi", "ExtraChar", "BaseChar", "Ideographic", "CleanChar", "Char"
    };
    public static final int NotChar=231;
    public static final int LENDTAGSi=202;
    public static final int QUOTSi=203;
    public static final int END=39;
    public static final int NOINHERIT=85;
    public static final int INSTANCE=67;
    public static final int LBRACESi=172;
    public static final int CONTENT=23;
    public static final int LAX=72;
    public static final int STOP=119;
    public static final int IMPORT=63;
    public static final int PIPESi=178;
    public static final int APOSSi=205;
    public static final int AposAttrContentChar=234;
    public static final int DBLCOLONSi=194;
    public static final int Letter=239;
    public static final int CASTABLE=18;
    public static final int DIACRITICS=30;
    public static final int ORDER=92;
    public static final int RCOMMENTSi=213;
    public static final int TYPESWITCH=128;
    public static final int MODULE=80;
    public static final int VERSION=134;
    public static final int Ideographic=255;
    public static final int DBLSLASHSi=193;
    public static final int EXACTLY=45;
    public static final int FTNOT=54;
    public static final int DECLARE=25;
    public static final int GTSi=182;
    public static final int TOKENSWITCH=228;
    public static final int ElementContentChar=235;
    public static final int OCCURS=88;
    public static final int UNION=129;
    public static final int STRIP=121;
    public static final int NameChar=241;
    public static final int PLUSSi=176;
    public static final int AST_WHERECLAUSE=149;
    public static final int QuotAttrContentChar=233;
    public static final int SAME=105;
    public static final int FTCONTAINS=53;
    public static final int AST_IFEXPR=154;
    public static final int QUESTIONSi=174;
    public static final int DESCENDING=29;
    public static final int FTOPTION=55;
    public static final int AST_ORDERBYCLAUSE=148;
    public static final int DOCUMENT_NODE=35;
    public static final int ANCESTOR_OR_SELF=7;
    public static final int LCDATASi=208;
    public static final int ANY=5;
    public static final int RELATIONSHIP=103;
    public static final int GE=58;
    public static final int CREFHEXSi=237;
    public static final int AST_MODULE=144;
    public static final int GTOREQSi=183;
    public static final int ELSE=37;
    public static final int WORD=141;
    public static final int SENSITIVE=112;
    public static final int SELF=111;
    public static final int DISTANCE=32;
    public static final int ExtraChar=253;
    public static final int LPISi=214;
    public static final int CREFDECSi=236;
    public static final int NODEBEFORESi=184;
    public static final int TEXT=122;
    public static final int CombiningChar=243;
    public static final int PARENT=97;
    public static final int NCName=218;
    public static final int FTOR=56;
    public static final int SCORE=110;
    public static final int PragmaLEX=222;
    public static final int Digit=242;
    public static final int EXTERNAL=47;
    public static final int EMPTY_SEQUENCE=42;
    public static final int UNDERSCORESi=240;
    public static final int RCDATASi=210;
    public static final int DOLLARSi=167;
    public static final int CAST=17;
    public static final int AST_FUNCTIONCALL=158;
    public static final int MOD=79;
    public static final int EXCEPT=46;
    public static final int OR=91;
    public static final int NOPRESERVE=86;
    public static final int S=226;
    public static final int RPARSi=171;
    public static final int BY=14;
    public static final int COLONSi=195;
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
    public static final int CleanChar=256;
    public static final int IntegerLiteral=186;
    public static final int SENTENCES=113;
    public static final int NE=83;
    public static final int AposAttributeContent=206;
    public static final int COMMENT=21;
    public static final int MINUSSi=177;
    public static final int NCNameChar=250;
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
    public static final int QName=169;
    public static final int Extender=244;
    public static final int NODE=84;
    public static final int FOR=50;
    public static final int DEFAULT=26;
    public static final int PRESERVE=101;
    public static final int AST_FTPOSFILTER=157;
    public static final int DirCommentContent=212;
    public static final int LEVELS=76;
    public static final int LPRAGSi=189;
    public static final int COMMASi=166;
    public static final int ATTRIBUTE=12;
    public static final int CHILD=19;
    public static final int Digits=248;
    public static final int NOT=87;
    public static final int OPTION=90;
    public static final int ELEMENT=36;
    public static final int Comment=223;
    public static final int INSENSITIVE=66;
    public static final int AS=9;
    public static final int DOCUMENT=34;
    public static final int ENCODING=38;
    public static final int BOUNDARYSPACE=15;
    public static final int TREAT=127;
    public static final int NAMESPACE=82;
    public static final int LXQCOMMENTSi=246;
    public static final int LEAST=74;
    public static final int THEN=124;
    public static final int WORDS=142;
    public static final int PiTarget=215;
    public static final int CDataContents=209;
    public static final int PARAGRAPHS=96;
    public static final int NCNameStartChar=249;
    public static final int QuotAttributeContent=204;
    public static final int BASE_URI=13;
    public static final int AND=8;
    public static final int TO=126;
    public static final int FUNCTION=57;
    public static final int AST_QUANTIFIEDEXPR=151;
    public static final int LexSigns=225;
    public static final int LANGUAGE=71;
    public static final int NEQSi=179;
    public static final int LOWERCASE=77;
    public static final int LE=73;
    public static final int BACKSLASHSi=252;
    public static final int SCHEMA=107;
    public static final int CONSTRUCTION=22;
    public static final int RPRAGSi=191;
    public static final int WILDCARDS=137;
    public static final int STARSi=175;
    public static final int DOTDOTSi=196;
    public static final int DIFFERENT=31;
    public static final int LTOREQSi=181;
    public static final int AST_TYPESWITCHEXPR=152;
    public static final int INTERSECT=68;
    public static final int AT=11;
    public static final int AST_FORCLAUSE=146;
    public static final int GREATEST=59;
    public static final int DOTSi=200;
    public static final int BaseChar=254;
    public static final int Char=257;
    public static final int EQ=43;
    public static final int AST_FLWOR=145;
    public static final int LT=78;
    public static final int OF=89;
    public static final int AST_FUNCTIONDECL=159;
    public static final int WINDOW=138;
    public static final int Name=238;
    public static final int FOLLOWING=48;
    public static final int CASE=16;
    public static final int RXQCOMMENTSi=247;
    public static final int DESCENDANT_OR_SELF=28;
    public static final int CDataSectionLEX=219;
    public static final int THESAURUS=123;
    public static final int RSELFTERMSi=201;
    public static final int FTAND=52;
    public static final int DecimalLiteral=187;
    public static final int PragmaContents=190;
    public static final int DIV=33;
    public static final int PARAGRAPH=95;
    public static final int EQSi=165;
    public static final int ALL=4;
    public static final int EXCLSi=251;
    public static final int DirPIConstructor=220;
    public static final int WHERE=136;
    public static final int WITHOUT=140;
    public static final int EVERY=44;
    public static final int SCHEMA_ATTRIBUTE=108;
    public static final int XQUERY=143;
    public static final int IDIV=61;
    public static final int SATISFIES=106;
    public static final int ATSi=197;
    public static final int DESCENDANT=27;
    public static final int STRICT=120;
    public static final int RBRACKSi=199;
    public static final int FOLLOWING_SIBLING=49;
    public static final int STABLE=116;
    public static final int DoubleLiteral=188;
    public static final int START=117;
    public static final int AMPERSi=232;
    public static final int VALIDATE=132;
    public static final int PRECEDING=99;
    public static final int COPY_NAMESPACES=24;
    public static final int ORDERING=94;
    public static final int ASSIGNSi=168;
    public static final int UNORDERED=130;
    public static final int NumberLEX=224;
    public static final int PredefinedEntityRef=229;
    public static final int LTSi=180;
    public static final int SENTENCE=114;
    public static final int AST_DIRELEMCONSTRUCTOR=161;
    public static final int AST_PATHEXPR=155;
    public static final int INHERIT=65;
    public static final int AST_CASECLAUSE=153;
    public static final int LexLiterals=227;
    public static final int SHARPSi=245;
    public static final int IS=69;
    public static final int GT=60;
    public static final int PHRASE=98;
    public static final int StringLiteral=163;
    public static final int RPISi=217;
    public static final int DirPiContents=216;
    public static final int ITEM=70;
    public static final int ORDERED=93;
    public static final int DirCommentConstLEX=221;
    public static final int PROCESSING_INSTRUCTION=102;
    public static final int NODEAFTERSi=185;
    public static final int CharRef=230;
    public static final int COLLATION=20;
    public static final int LPARSi=170;
    public static final int ANCESTOR=6;
    public static final int AST_PREDICATE=160;
    public static final int EOF=-1;
    public static final int VARIABLE=133;
    public static final int RBRACSi=173;
    public static final int ElementContent=207;
    public static final int LCOMMENTSi=211;
    public static final int LBRACKSi=198;

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
        //Scope currentScope = new Scope();       // @init-ting her ogsaa
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
    // etc/XQFT.g:299:1: module : ( versionDecl )? ( libraryModule | mainModule ) -> ^( AST_MODULE ( versionDecl )? ( libraryModule )? ( mainModule )? ) ;
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
            // etc/XQFT.g:299:8: ( ( versionDecl )? ( libraryModule | mainModule ) -> ^( AST_MODULE ( versionDecl )? ( libraryModule )? ( mainModule )? ) )
            // etc/XQFT.g:299:9: ( versionDecl )? ( libraryModule | mainModule )
            {
            if ( backtracking==0 ) {
              lexer.state = State.DEFAULT;
            }
            // etc/XQFT.g:300:5: ( versionDecl )?
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
                    // etc/XQFT.g:300:6: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module584);
                    versionDecl1=versionDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_versionDecl.add(versionDecl1.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:301:5: ( libraryModule | mainModule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==NAMESPACE) ) {
                    alt2=1;
                }
                else if ( (LA2_1==EOF||LA2_1==AND||(LA2_1>=CAST && LA2_1<=CASTABLE)||LA2_1==DIV||LA2_1==EQ||LA2_1==EXCEPT||LA2_1==FTCONTAINS||LA2_1==GE||(LA2_1>=GT && LA2_1<=IDIV)||(LA2_1>=INSTANCE && LA2_1<=IS)||LA2_1==LE||(LA2_1>=LT && LA2_1<=MOD)||LA2_1==NE||LA2_1==OR||(LA2_1>=TO && LA2_1<=TREAT)||LA2_1==UNION||(LA2_1>=EQSi && LA2_1<=COMMASi)||LA2_1==LPARSi||(LA2_1>=STARSi && LA2_1<=NODEAFTERSi)||(LA2_1>=SLASHSi && LA2_1<=DBLSLASHSi)||LA2_1==COLONSi||LA2_1==LBRACKSi) ) {
                    alt2=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("301:5: ( libraryModule | mainModule )", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=ALL && LA2_0<=MOD)||(LA2_0>=MOST && LA2_0<=XQUERY)||LA2_0==StringLiteral||LA2_0==DOLLARSi||(LA2_0>=QName && LA2_0<=LPARSi)||(LA2_0>=STARSi && LA2_0<=MINUSSi)||LA2_0==LTSi||(LA2_0>=IntegerLiteral && LA2_0<=LPRAGSi)||(LA2_0>=SLASHSi && LA2_0<=DBLSLASHSi)||(LA2_0>=DOTDOTSi && LA2_0<=ATSi)||LA2_0==DOTSi||LA2_0==LCOMMENTSi||LA2_0==LPISi||LA2_0==NCName) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("301:5: ( libraryModule | mainModule )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:301:6: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module594);
                    libraryModule2=libraryModule();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_libraryModule.add(libraryModule2.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:301:22: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module598);
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
            // 302:5: -> ^( AST_MODULE ( versionDecl )? ( libraryModule )? ( mainModule )? )
            {
                // etc/XQFT.g:302:8: ^( AST_MODULE ( versionDecl )? ( libraryModule )? ( mainModule )? )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_MODULE, "AST_MODULE"), root_1);

                // etc/XQFT.g:302:21: ( versionDecl )?
                if ( stream_versionDecl.hasNext() ) {
                    adaptor.addChild(root_1, stream_versionDecl.next());

                }
                stream_versionDecl.reset();
                // etc/XQFT.g:302:34: ( libraryModule )?
                if ( stream_libraryModule.hasNext() ) {
                    adaptor.addChild(root_1, stream_libraryModule.next());

                }
                stream_libraryModule.reset();
                // etc/XQFT.g:302:49: ( mainModule )?
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
    // etc/XQFT.g:305:5: versionDecl : XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? SEMICOLONSi ;
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
            // etc/XQFT.g:305:17: ( XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? SEMICOLONSi )
            // etc/XQFT.g:305:19: XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? SEMICOLONSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            XQUERY4=(Token)input.LT(1);
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl631); if (failed) return retval;
            if ( backtracking==0 ) {
            XQUERY4_tree = (XQFTTree)adaptor.create(XQUERY4);
            adaptor.addChild(root_0, XQUERY4_tree);
            }
            VERSION5=(Token)input.LT(1);
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl633); if (failed) return retval;
            if ( backtracking==0 ) {
            VERSION5_tree = (XQFTTree)adaptor.create(VERSION5);
            adaptor.addChild(root_0, VERSION5_tree);
            }
            StringLiteral6=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl635); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral6_tree = (XQFTTree)adaptor.create(StringLiteral6);
            adaptor.addChild(root_0, StringLiteral6_tree);
            }
            // etc/XQFT.g:305:48: ( ENCODING StringLiteral )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ENCODING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:305:49: ENCODING StringLiteral
                    {
                    ENCODING7=(Token)input.LT(1);
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl638); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ENCODING7_tree = (XQFTTree)adaptor.create(ENCODING7);
                    adaptor.addChild(root_0, ENCODING7_tree);
                    }
                    StringLiteral8=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl640); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral8_tree = (XQFTTree)adaptor.create(StringLiteral8);
                    adaptor.addChild(root_0, StringLiteral8_tree);
                    }

                    }
                    break;

            }

            SEMICOLONSi9=(Token)input.LT(1);
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_versionDecl644); if (failed) return retval;
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
    // etc/XQFT.g:306:5: libraryModule : moduleDecl prolog ;
    public final libraryModule_return libraryModule() throws RecognitionException {
        libraryModule_return retval = new libraryModule_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        moduleDecl_return moduleDecl10 = null;

        prolog_return prolog11 = null;



        try {
            // etc/XQFT.g:306:19: ( moduleDecl prolog )
            // etc/XQFT.g:306:21: moduleDecl prolog
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_moduleDecl_in_libraryModule655);
            moduleDecl10=moduleDecl();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, moduleDecl10.getTree());
            pushFollow(FOLLOW_prolog_in_libraryModule657);
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
    // etc/XQFT.g:307:9: moduleDecl : MODULE NAMESPACE ncNameorKeyword EQSi uriLiteral SEMICOLONSi ;
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
            // etc/XQFT.g:307:20: ( MODULE NAMESPACE ncNameorKeyword EQSi uriLiteral SEMICOLONSi )
            // etc/XQFT.g:307:22: MODULE NAMESPACE ncNameorKeyword EQSi uriLiteral SEMICOLONSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            MODULE12=(Token)input.LT(1);
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl672); if (failed) return retval;
            if ( backtracking==0 ) {
            MODULE12_tree = (XQFTTree)adaptor.create(MODULE12);
            adaptor.addChild(root_0, MODULE12_tree);
            }
            NAMESPACE13=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl674); if (failed) return retval;
            if ( backtracking==0 ) {
            NAMESPACE13_tree = (XQFTTree)adaptor.create(NAMESPACE13);
            adaptor.addChild(root_0, NAMESPACE13_tree);
            }
            pushFollow(FOLLOW_ncNameorKeyword_in_moduleDecl676);
            ncNameorKeyword14=ncNameorKeyword();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword14.getTree());
            EQSi15=(Token)input.LT(1);
            match(input,EQSi,FOLLOW_EQSi_in_moduleDecl678); if (failed) return retval;
            if ( backtracking==0 ) {
            EQSi15_tree = (XQFTTree)adaptor.create(EQSi15);
            adaptor.addChild(root_0, EQSi15_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl680);
            uriLiteral16=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral16.getTree());
            SEMICOLONSi17=(Token)input.LT(1);
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_moduleDecl682); if (failed) return retval;
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
    // etc/XQFT.g:308:13: uriLiteral : StringLiteral ;
    public final uriLiteral_return uriLiteral() throws RecognitionException {
        uriLiteral_return retval = new uriLiteral_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token StringLiteral18=null;

        XQFTTree StringLiteral18_tree=null;

        try {
            // etc/XQFT.g:308:24: ( StringLiteral )
            // etc/XQFT.g:308:26: StringLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            StringLiteral18=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral701); if (failed) return retval;
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
    // etc/XQFT.g:310:5: mainModule : prolog queryBody ;
    public final mainModule_return mainModule() throws RecognitionException {
        mainModule_return retval = new mainModule_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        prolog_return prolog19 = null;

        queryBody_return queryBody20 = null;



        try {
            // etc/XQFT.g:310:16: ( prolog queryBody )
            // etc/XQFT.g:310:18: prolog queryBody
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_prolog_in_mainModule713);
            prolog19=prolog();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, prolog19.getTree());
            pushFollow(FOLLOW_queryBody_in_mainModule715);
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
    // etc/XQFT.g:311:9: queryBody : expr ;
    public final queryBody_return queryBody() throws RecognitionException {
        queryBody_return retval = new queryBody_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        expr_return expr21 = null;



        try {
            // etc/XQFT.g:311:19: ( expr )
            // etc/XQFT.g:311:21: expr
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_queryBody730);
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
    // etc/XQFT.g:312:13: expr : exprSingle ( COMMASi exprSingle )* -> ( exprSingle )+ ;
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
            // etc/XQFT.g:312:18: ( exprSingle ( COMMASi exprSingle )* -> ( exprSingle )+ )
            // etc/XQFT.g:312:20: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr749);
            exprSingle22=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle22.getTree());
            // etc/XQFT.g:312:31: ( COMMASi exprSingle )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMASi) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // etc/XQFT.g:312:32: COMMASi exprSingle
            	    {
            	    COMMASi23=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr752); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi23);

            	    pushFollow(FOLLOW_exprSingle_in_expr754);
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
            // 313:5: -> ( exprSingle )+
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
    // etc/XQFT.g:317:1: prolog : ( ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi )* ;
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
            // etc/XQFT.g:318:30: ( ( ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi )* )
            // etc/XQFT.g:319:5: ( ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:319:5: ( ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==IMPORT) ) {
                    int LA7_38 = input.LA(2);

                    if ( (LA7_38==MODULE||LA7_38==SCHEMA) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==DECLARE) ) {
                    int LA7_40 = input.LA(2);

                    if ( (LA7_40==BASE_URI||LA7_40==BOUNDARYSPACE||LA7_40==CONSTRUCTION||LA7_40==COPY_NAMESPACES||LA7_40==DEFAULT||LA7_40==FTOPTION||LA7_40==FUNCTION||LA7_40==NAMESPACE||LA7_40==OPTION||LA7_40==ORDERING||LA7_40==VARIABLE) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // etc/XQFT.g:320:7: ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) ) SEMICOLONSi
            	    {
            	    // etc/XQFT.g:320:7: ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) )
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
            	            new NoViableAltException("320:7: ( ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}? | DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl ) )", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // etc/XQFT.g:321:7: ( IMPORT ( SCHEMA | MODULE ) )=> importStmt {...}?
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog853);
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
            	            // etc/XQFT.g:322:8: DECLARE ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl )
            	            {
            	            DECLARE26=(Token)input.LT(1);
            	            match(input,DECLARE,FOLLOW_DECLARE_in_prolog864); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DECLARE26_tree = (XQFTTree)adaptor.create(DECLARE26);
            	            adaptor.addChild(root_0, DECLARE26_tree);
            	            }
            	            // etc/XQFT.g:322:16: ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl )
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
            	                    new NoViableAltException("322:16: ( setter {...}? | varDecl | functionDecl | optionDecl | ftOptionDecl )", 5, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt5) {
            	                case 1 :
            	                    // etc/XQFT.g:323:9: setter {...}?
            	                    {
            	                    pushFollow(FOLLOW_setter_in_prolog876);
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
            	                    // etc/XQFT.g:324:10: varDecl
            	                    {
            	                    pushFollow(FOLLOW_varDecl_in_prolog889);
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
            	                    // etc/XQFT.g:325:10: functionDecl
            	                    {
            	                    pushFollow(FOLLOW_functionDecl_in_prolog902);
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
            	                    // etc/XQFT.g:326:10: optionDecl
            	                    {
            	                    pushFollow(FOLLOW_optionDecl_in_prolog915);
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
            	                    // etc/XQFT.g:327:10: ftOptionDecl
            	                    {
            	                    pushFollow(FOLLOW_ftOptionDecl_in_prolog928);
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
            	    match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_prolog950); if (failed) return retval;
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
    // etc/XQFT.g:333:1: setter : ( DEFAULT ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl ) | namespaceDecl | boundarySpaceDecl | baseURIDecl | constructionDecl | orderingModeDecl | copyNamespacesDecl );
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
            // etc/XQFT.g:333:7: ( DEFAULT ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl ) | namespaceDecl | boundarySpaceDecl | baseURIDecl | constructionDecl | orderingModeDecl | copyNamespacesDecl )
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
                    new NoViableAltException("333:1: setter : ( DEFAULT ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl ) | namespaceDecl | boundarySpaceDecl | baseURIDecl | constructionDecl | orderingModeDecl | copyNamespacesDecl );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:334:5: DEFAULT ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    DEFAULT33=(Token)input.LT(1);
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_setter972); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DEFAULT33_tree = (XQFTTree)adaptor.create(DEFAULT33);
                    adaptor.addChild(root_0, DEFAULT33_tree);
                    }
                    // etc/XQFT.g:334:13: ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl )
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
                            new NoViableAltException("334:13: ( | defaultNamespaceDecl | defaultCollationDecl | emptyOrderDecl )", 8, 0, input);

                        throw nvae;
                    }

                    switch (alt8) {
                        case 1 :
                            // etc/XQFT.g:335:13: 
                            {
                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:335:15: defaultNamespaceDecl
                            {
                            pushFollow(FOLLOW_defaultNamespaceDecl_in_setter990);
                            defaultNamespaceDecl34=defaultNamespaceDecl();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, defaultNamespaceDecl34.getTree());

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:336:15: defaultCollationDecl
                            {
                            pushFollow(FOLLOW_defaultCollationDecl_in_setter1006);
                            defaultCollationDecl35=defaultCollationDecl();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, defaultCollationDecl35.getTree());

                            }
                            break;
                        case 4 :
                            // etc/XQFT.g:337:15: emptyOrderDecl
                            {
                            pushFollow(FOLLOW_emptyOrderDecl_in_setter1022);
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
                    // etc/XQFT.g:339:11: namespaceDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_namespaceDecl_in_setter1048);
                    namespaceDecl37=namespaceDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, namespaceDecl37.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:340:11: boundarySpaceDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter1060);
                    boundarySpaceDecl38=boundarySpaceDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, boundarySpaceDecl38.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:341:11: baseURIDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_baseURIDecl_in_setter1072);
                    baseURIDecl39=baseURIDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, baseURIDecl39.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:342:11: constructionDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_constructionDecl_in_setter1085);
                    constructionDecl40=constructionDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, constructionDecl40.getTree());

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:343:11: orderingModeDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_orderingModeDecl_in_setter1098);
                    orderingModeDecl41=orderingModeDecl();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, orderingModeDecl41.getTree());

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:344:11: copyNamespacesDecl
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter1111);
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
    // etc/XQFT.g:347:1: defaultNamespaceDecl : ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
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
            // etc/XQFT.g:347:22: ( ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:347:24: ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl1120);    throw mse;
            }

            NAMESPACE44=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl1128); if (failed) return retval;
            if ( backtracking==0 ) {
            NAMESPACE44_tree = (XQFTTree)adaptor.create(NAMESPACE44);
            adaptor.addChild(root_0, NAMESPACE44_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl1130);
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
    // etc/XQFT.g:348:1: defaultCollationDecl : COLLATION uriLiteral ;
    public final defaultCollationDecl_return defaultCollationDecl() throws RecognitionException {
        defaultCollationDecl_return retval = new defaultCollationDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COLLATION46=null;
        uriLiteral_return uriLiteral47 = null;


        XQFTTree COLLATION46_tree=null;

        try {
            // etc/XQFT.g:348:22: ( COLLATION uriLiteral )
            // etc/XQFT.g:348:24: COLLATION uriLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            COLLATION46=(Token)input.LT(1);
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl1137); if (failed) return retval;
            if ( backtracking==0 ) {
            COLLATION46_tree = (XQFTTree)adaptor.create(COLLATION46);
            adaptor.addChild(root_0, COLLATION46_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl1139);
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
    // etc/XQFT.g:349:1: emptyOrderDecl : ORDER EMPTY ( GREATEST | LEAST ) ;
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
            // etc/XQFT.g:349:22: ( ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:349:24: ORDER EMPTY ( GREATEST | LEAST )
            {
            root_0 = (XQFTTree)adaptor.nil();

            ORDER48=(Token)input.LT(1);
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl1152); if (failed) return retval;
            if ( backtracking==0 ) {
            ORDER48_tree = (XQFTTree)adaptor.create(ORDER48);
            adaptor.addChild(root_0, ORDER48_tree);
            }
            EMPTY49=(Token)input.LT(1);
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl1154); if (failed) return retval;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl1156);    throw mse;
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
    // etc/XQFT.g:352:1: namespaceDecl : NAMESPACE ncNameorKeyword EQSi uriLiteral ;
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
            // etc/XQFT.g:352:21: ( NAMESPACE ncNameorKeyword EQSi uriLiteral )
            // etc/XQFT.g:352:23: NAMESPACE ncNameorKeyword EQSi uriLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            NAMESPACE51=(Token)input.LT(1);
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl1177); if (failed) return retval;
            if ( backtracking==0 ) {
            NAMESPACE51_tree = (XQFTTree)adaptor.create(NAMESPACE51);
            adaptor.addChild(root_0, NAMESPACE51_tree);
            }
            pushFollow(FOLLOW_ncNameorKeyword_in_namespaceDecl1179);
            ncNameorKeyword52=ncNameorKeyword();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword52.getTree());
            EQSi53=(Token)input.LT(1);
            match(input,EQSi,FOLLOW_EQSi_in_namespaceDecl1181); if (failed) return retval;
            if ( backtracking==0 ) {
            EQSi53_tree = (XQFTTree)adaptor.create(EQSi53);
            adaptor.addChild(root_0, EQSi53_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl1183);
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
    // etc/XQFT.g:353:1: boundarySpaceDecl : BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final boundarySpaceDecl_return boundarySpaceDecl() throws RecognitionException {
        boundarySpaceDecl_return retval = new boundarySpaceDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token BOUNDARYSPACE55=null;
        Token set56=null;

        XQFTTree BOUNDARYSPACE55_tree=null;
        XQFTTree set56_tree=null;

        try {
            // etc/XQFT.g:353:21: ( BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:353:23: BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            root_0 = (XQFTTree)adaptor.nil();

            BOUNDARYSPACE55=(Token)input.LT(1);
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl1192); if (failed) return retval;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl1194);    throw mse;
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
    // etc/XQFT.g:354:1: baseURIDecl : BASE_URI uriLiteral ;
    public final baseURIDecl_return baseURIDecl() throws RecognitionException {
        baseURIDecl_return retval = new baseURIDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token BASE_URI57=null;
        uriLiteral_return uriLiteral58 = null;


        XQFTTree BASE_URI57_tree=null;

        try {
            // etc/XQFT.g:354:21: ( BASE_URI uriLiteral )
            // etc/XQFT.g:354:23: BASE_URI uriLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            BASE_URI57=(Token)input.LT(1);
            match(input,BASE_URI,FOLLOW_BASE_URI_in_baseURIDecl1215); if (failed) return retval;
            if ( backtracking==0 ) {
            BASE_URI57_tree = (XQFTTree)adaptor.create(BASE_URI57);
            adaptor.addChild(root_0, BASE_URI57_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl1217);
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
    // etc/XQFT.g:355:1: constructionDecl : CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final constructionDecl_return constructionDecl() throws RecognitionException {
        constructionDecl_return retval = new constructionDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CONSTRUCTION59=null;
        Token set60=null;

        XQFTTree CONSTRUCTION59_tree=null;
        XQFTTree set60_tree=null;

        try {
            // etc/XQFT.g:355:21: ( CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:355:23: CONSTRUCTION ( STRIP | PRESERVE )
            {
            root_0 = (XQFTTree)adaptor.nil();

            CONSTRUCTION59=(Token)input.LT(1);
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl1227); if (failed) return retval;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl1229);    throw mse;
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
    // etc/XQFT.g:356:1: orderingModeDecl : ORDERING ( ORDERED | UNORDERED ) ;
    public final orderingModeDecl_return orderingModeDecl() throws RecognitionException {
        orderingModeDecl_return retval = new orderingModeDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ORDERING61=null;
        Token set62=null;

        XQFTTree ORDERING61_tree=null;
        XQFTTree set62_tree=null;

        try {
            // etc/XQFT.g:356:21: ( ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:356:23: ORDERING ( ORDERED | UNORDERED )
            {
            root_0 = (XQFTTree)adaptor.nil();

            ORDERING61=(Token)input.LT(1);
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl1245); if (failed) return retval;
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
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl1247);    throw mse;
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
    // etc/XQFT.g:357:1: copyNamespacesDecl : COPY_NAMESPACES preserveMode COMMASi inheritMode ;
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
            // etc/XQFT.g:357:21: ( COPY_NAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:357:23: COPY_NAMESPACES preserveMode COMMASi inheritMode
            {
            root_0 = (XQFTTree)adaptor.nil();

            COPY_NAMESPACES63=(Token)input.LT(1);
            match(input,COPY_NAMESPACES,FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl1261); if (failed) return retval;
            if ( backtracking==0 ) {
            COPY_NAMESPACES63_tree = (XQFTTree)adaptor.create(COPY_NAMESPACES63);
            adaptor.addChild(root_0, COPY_NAMESPACES63_tree);
            }
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl1263);
            preserveMode64=preserveMode();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, preserveMode64.getTree());
            COMMASi65=(Token)input.LT(1);
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl1265); if (failed) return retval;
            if ( backtracking==0 ) {
            COMMASi65_tree = (XQFTTree)adaptor.create(COMMASi65);
            adaptor.addChild(root_0, COMMASi65_tree);
            }
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl1267);
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
    // etc/XQFT.g:358:5: preserveMode : ( PRESERVE | NOPRESERVE );
    public final preserveMode_return preserveMode() throws RecognitionException {
        preserveMode_return retval = new preserveMode_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set67=null;

        XQFTTree set67_tree=null;

        try {
            // etc/XQFT.g:358:21: ( PRESERVE | NOPRESERVE )
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
    // etc/XQFT.g:359:5: inheritMode : ( INHERIT | NOINHERIT );
    public final inheritMode_return inheritMode() throws RecognitionException {
        inheritMode_return retval = new inheritMode_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set68=null;

        XQFTTree set68_tree=null;

        try {
            // etc/XQFT.g:359:21: ( INHERIT | NOINHERIT )
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
    // etc/XQFT.g:361:1: importStmt : IMPORT ( schemaImport | moduleImport ) ;
    public final importStmt_return importStmt() throws RecognitionException {
        importStmt_return retval = new importStmt_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token IMPORT69=null;
        schemaImport_return schemaImport70 = null;

        moduleImport_return moduleImport71 = null;


        XQFTTree IMPORT69_tree=null;

        try {
            // etc/XQFT.g:361:25: ( IMPORT ( schemaImport | moduleImport ) )
            // etc/XQFT.g:361:27: IMPORT ( schemaImport | moduleImport )
            {
            root_0 = (XQFTTree)adaptor.nil();

            IMPORT69=(Token)input.LT(1);
            match(input,IMPORT,FOLLOW_IMPORT_in_importStmt1329); if (failed) return retval;
            if ( backtracking==0 ) {
            IMPORT69_tree = (XQFTTree)adaptor.create(IMPORT69);
            adaptor.addChild(root_0, IMPORT69_tree);
            }
            // etc/XQFT.g:361:34: ( schemaImport | moduleImport )
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
                    new NoViableAltException("361:34: ( schemaImport | moduleImport )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:361:35: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt1332);
                    schemaImport70=schemaImport();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaImport70.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:361:50: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt1336);
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
    // etc/XQFT.g:362:5: schemaImport : SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
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
            // etc/XQFT.g:362:25: ( SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:362:27: SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            SCHEMA72=(Token)input.LT(1);
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport1355); if (failed) return retval;
            if ( backtracking==0 ) {
            SCHEMA72_tree = (XQFTTree)adaptor.create(SCHEMA72);
            adaptor.addChild(root_0, SCHEMA72_tree);
            }
            // etc/XQFT.g:362:34: ( schemaPrefix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DEFAULT||LA11_0==NAMESPACE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:362:34: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport1357);
                    schemaPrefix73=schemaPrefix();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaPrefix73.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport1360);
            uriLiteral74=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral74.getTree());
            // etc/XQFT.g:362:59: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:362:60: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    AT75=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_schemaImport1363); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT75_tree = (XQFTTree)adaptor.create(AT75);
                    adaptor.addChild(root_0, AT75_tree);
                    }
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport1365);
                    uriLiteral76=uriLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral76.getTree());
                    // etc/XQFT.g:362:74: ( COMMASi uriLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMASi) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // etc/XQFT.g:362:75: COMMASi uriLiteral
                    	    {
                    	    COMMASi77=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport1368); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    COMMASi77_tree = (XQFTTree)adaptor.create(COMMASi77);
                    	    adaptor.addChild(root_0, COMMASi77_tree);
                    	    }
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport1370);
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
    // etc/XQFT.g:363:9: schemaPrefix : ( ( NAMESPACE ncNameorKeyword EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
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
            // etc/XQFT.g:363:25: ( ( NAMESPACE ncNameorKeyword EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
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
                    new NoViableAltException("363:9: schemaPrefix : ( ( NAMESPACE ncNameorKeyword EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:363:27: ( NAMESPACE ncNameorKeyword EQSi )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:363:27: ( NAMESPACE ncNameorKeyword EQSi )
                    // etc/XQFT.g:363:28: NAMESPACE ncNameorKeyword EQSi
                    {
                    NAMESPACE79=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1393); if (failed) return retval;
                    if ( backtracking==0 ) {
                    NAMESPACE79_tree = (XQFTTree)adaptor.create(NAMESPACE79);
                    adaptor.addChild(root_0, NAMESPACE79_tree);
                    }
                    pushFollow(FOLLOW_ncNameorKeyword_in_schemaPrefix1395);
                    ncNameorKeyword80=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword80.getTree());
                    EQSi81=(Token)input.LT(1);
                    match(input,EQSi,FOLLOW_EQSi_in_schemaPrefix1397); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EQSi81_tree = (XQFTTree)adaptor.create(EQSi81);
                    adaptor.addChild(root_0, EQSi81_tree);
                    }

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:363:62: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:363:62: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:363:63: DEFAULT ELEMENT NAMESPACE
                    {
                    DEFAULT82=(Token)input.LT(1);
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix1403); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DEFAULT82_tree = (XQFTTree)adaptor.create(DEFAULT82);
                    adaptor.addChild(root_0, DEFAULT82_tree);
                    }
                    ELEMENT83=(Token)input.LT(1);
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix1405); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ELEMENT83_tree = (XQFTTree)adaptor.create(ELEMENT83);
                    adaptor.addChild(root_0, ELEMENT83_tree);
                    }
                    NAMESPACE84=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1407); if (failed) return retval;
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
    // etc/XQFT.g:364:5: moduleImport : MODULE ( NAMESPACE ncNameorKeyword EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
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
            // etc/XQFT.g:364:25: ( MODULE ( NAMESPACE ncNameorKeyword EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:364:27: MODULE ( NAMESPACE ncNameorKeyword EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            MODULE85=(Token)input.LT(1);
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport1426); if (failed) return retval;
            if ( backtracking==0 ) {
            MODULE85_tree = (XQFTTree)adaptor.create(MODULE85);
            adaptor.addChild(root_0, MODULE85_tree);
            }
            // etc/XQFT.g:364:34: ( NAMESPACE ncNameorKeyword EQSi )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAMESPACE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:364:35: NAMESPACE ncNameorKeyword EQSi
                    {
                    NAMESPACE86=(Token)input.LT(1);
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport1429); if (failed) return retval;
                    if ( backtracking==0 ) {
                    NAMESPACE86_tree = (XQFTTree)adaptor.create(NAMESPACE86);
                    adaptor.addChild(root_0, NAMESPACE86_tree);
                    }
                    pushFollow(FOLLOW_ncNameorKeyword_in_moduleImport1431);
                    ncNameorKeyword87=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword87.getTree());
                    EQSi88=(Token)input.LT(1);
                    match(input,EQSi,FOLLOW_EQSi_in_moduleImport1433); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EQSi88_tree = (XQFTTree)adaptor.create(EQSi88);
                    adaptor.addChild(root_0, EQSi88_tree);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport1437);
            uriLiteral89=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral89.getTree());
            // etc/XQFT.g:364:79: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:364:80: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    AT90=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_moduleImport1440); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT90_tree = (XQFTTree)adaptor.create(AT90);
                    adaptor.addChild(root_0, AT90_tree);
                    }
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport1442);
                    uriLiteral91=uriLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral91.getTree());
                    // etc/XQFT.g:364:94: ( COMMASi uriLiteral )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMASi) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // etc/XQFT.g:364:95: COMMASi uriLiteral
                    	    {
                    	    COMMASi92=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport1445); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    COMMASi92_tree = (XQFTTree)adaptor.create(COMMASi92);
                    	    adaptor.addChild(root_0, COMMASi92_tree);
                    	    }
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport1447);
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
    // etc/XQFT.g:366:1: varDecl : VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) ;
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
            // etc/XQFT.g:366:9: ( VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:366:11: VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            {
            root_0 = (XQFTTree)adaptor.nil();

            VARIABLE94=(Token)input.LT(1);
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl1463); if (failed) return retval;
            if ( backtracking==0 ) {
            VARIABLE94_tree = (XQFTTree)adaptor.create(VARIABLE94);
            adaptor.addChild(root_0, VARIABLE94_tree);
            }
            DOLLARSi95=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl1465); if (failed) return retval;
            if ( backtracking==0 ) {
            DOLLARSi95_tree = (XQFTTree)adaptor.create(DOLLARSi95);
            adaptor.addChild(root_0, DOLLARSi95_tree);
            }
            pushFollow(FOLLOW_qName_in_varDecl1467);
            qName96=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName96.getTree());
            // etc/XQFT.g:366:35: ( typeDeclaration )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:366:35: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl1469);
                    typeDeclaration97=typeDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeDeclaration97.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:366:52: ( ( ASSIGNSi exprSingle ) | EXTERNAL )
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
                    new NoViableAltException("366:52: ( ( ASSIGNSi exprSingle ) | EXTERNAL )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:366:53: ( ASSIGNSi exprSingle )
                    {
                    // etc/XQFT.g:366:53: ( ASSIGNSi exprSingle )
                    // etc/XQFT.g:366:54: ASSIGNSi exprSingle
                    {
                    ASSIGNSi98=(Token)input.LT(1);
                    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varDecl1474); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ASSIGNSi98_tree = (XQFTTree)adaptor.create(ASSIGNSi98);
                    adaptor.addChild(root_0, ASSIGNSi98_tree);
                    }
                    pushFollow(FOLLOW_exprSingle_in_varDecl1476);
                    exprSingle99=exprSingle();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, exprSingle99.getTree());

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:366:77: EXTERNAL
                    {
                    EXTERNAL100=(Token)input.LT(1);
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl1481); if (failed) return retval;
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
    // etc/XQFT.g:367:5: qName returns [String text] : (q= QName | n= ncNameorKeyword );
    public final qName_return qName() throws RecognitionException {
        qName_return retval = new qName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token q=null;
        ncNameorKeyword_return n = null;


        XQFTTree q_tree=null;

        try {
            // etc/XQFT.g:367:33: (q= QName | n= ncNameorKeyword )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==QName) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=ALL && LA20_0<=XQUERY)||LA20_0==NCName) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("367:5: qName returns [String text] : (q= QName | n= ncNameorKeyword );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:368:9: q= QName
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    q=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_qName1508); if (failed) return retval;
                    if ( backtracking==0 ) {
                    q_tree = (XQFTTree)adaptor.create(q);
                    adaptor.addChild(root_0, q_tree);
                    }
                    if ( backtracking==0 ) {
                      retval.text = q.getText();
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:369:11: n= ncNameorKeyword
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ncNameorKeyword_in_qName1524);
                    n=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, n.getTree());
                    if ( backtracking==0 ) {
                      retval.text = input.toString(n.start,n.stop);
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
    // $ANTLR end qName

    public static class typeDeclaration_return extends ParserRuleReturnScope {
        XQFTTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start typeDeclaration
    // etc/XQFT.g:372:1: typeDeclaration : AS sequenceType ;
    public final typeDeclaration_return typeDeclaration() throws RecognitionException {
        typeDeclaration_return retval = new typeDeclaration_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AS101=null;
        sequenceType_return sequenceType102 = null;


        XQFTTree AS101_tree=null;

        try {
            // etc/XQFT.g:372:17: ( AS sequenceType )
            // etc/XQFT.g:372:19: AS sequenceType
            {
            root_0 = (XQFTTree)adaptor.nil();

            AS101=(Token)input.LT(1);
            match(input,AS,FOLLOW_AS_in_typeDeclaration1539); if (failed) return retval;
            if ( backtracking==0 ) {
            AS101_tree = (XQFTTree)adaptor.create(AS101);
            adaptor.addChild(root_0, AS101_tree);
            }
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration1541);
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
    // etc/XQFT.g:374:1: functionDecl : FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) -> ^( AST_FUNCTIONDECL qName ( paramList )? ( sequenceType )? ( enclosedExpr )? ( EXTERNAL )? ) ;
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
            // etc/XQFT.g:374:14: ( FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) -> ^( AST_FUNCTIONDECL qName ( paramList )? ( sequenceType )? ( enclosedExpr )? ( EXTERNAL )? ) )
            // etc/XQFT.g:375:5: FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            FUNCTION103=(Token)input.LT(1);
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl1558); if (failed) return retval;
            if ( backtracking==0 ) stream_FUNCTION.add(FUNCTION103);

            pushFollow(FOLLOW_qName_in_functionDecl1560);
            qName104=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_qName.add(qName104.getTree());
            LPARSi105=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_functionDecl1562); if (failed) return retval;
            if ( backtracking==0 ) stream_LPARSi.add(LPARSi105);

            // etc/XQFT.g:375:27: ( paramList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOLLARSi) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:375:27: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl1564);
                    paramList106=paramList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_paramList.add(paramList106.getTree());

                    }
                    break;

            }

            RPARSi107=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_functionDecl1567); if (failed) return retval;
            if ( backtracking==0 ) stream_RPARSi.add(RPARSi107);

            // etc/XQFT.g:376:9: ( AS sequenceType )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:376:10: AS sequenceType
                    {
                    AS108=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_functionDecl1579); if (failed) return retval;
                    if ( backtracking==0 ) stream_AS.add(AS108);

                    pushFollow(FOLLOW_sequenceType_in_functionDecl1581);
                    sequenceType109=sequenceType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_sequenceType.add(sequenceType109.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:376:28: ( enclosedExpr | EXTERNAL )
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
                    new NoViableAltException("376:28: ( enclosedExpr | EXTERNAL )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:376:29: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl1586);
                    enclosedExpr110=enclosedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_enclosedExpr.add(enclosedExpr110.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:376:44: EXTERNAL
                    {
                    EXTERNAL111=(Token)input.LT(1);
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl1590); if (failed) return retval;
                    if ( backtracking==0 ) stream_EXTERNAL.add(EXTERNAL111);


                    }
                    break;

            }


            // AST REWRITE
            // elements: EXTERNAL, enclosedExpr, qName, paramList, sequenceType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 377:5: -> ^( AST_FUNCTIONDECL qName ( paramList )? ( sequenceType )? ( enclosedExpr )? ( EXTERNAL )? )
            {
                // etc/XQFT.g:377:8: ^( AST_FUNCTIONDECL qName ( paramList )? ( sequenceType )? ( enclosedExpr )? ( EXTERNAL )? )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_FUNCTIONDECL, "AST_FUNCTIONDECL"), root_1);

                adaptor.addChild(root_1, stream_qName.next());
                // etc/XQFT.g:377:33: ( paramList )?
                if ( stream_paramList.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramList.next());

                }
                stream_paramList.reset();
                // etc/XQFT.g:377:44: ( sequenceType )?
                if ( stream_sequenceType.hasNext() ) {
                    adaptor.addChild(root_1, stream_sequenceType.next());

                }
                stream_sequenceType.reset();
                // etc/XQFT.g:377:58: ( enclosedExpr )?
                if ( stream_enclosedExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_enclosedExpr.next());

                }
                stream_enclosedExpr.reset();
                // etc/XQFT.g:377:72: ( EXTERNAL )?
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
    // etc/XQFT.g:380:5: paramList : param ( COMMASi param )* ;
    public final paramList_return paramList() throws RecognitionException {
        paramList_return retval = new paramList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COMMASi113=null;
        param_return param112 = null;

        param_return param114 = null;


        XQFTTree COMMASi113_tree=null;

        try {
            // etc/XQFT.g:380:18: ( param ( COMMASi param )* )
            // etc/XQFT.g:380:20: param ( COMMASi param )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_param_in_paramList1631);
            param112=param();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, param112.getTree());
            // etc/XQFT.g:380:26: ( COMMASi param )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMASi) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:380:27: COMMASi param
            	    {
            	    COMMASi113=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList1634); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    COMMASi113_tree = (XQFTTree)adaptor.create(COMMASi113);
            	    adaptor.addChild(root_0, COMMASi113_tree);
            	    }
            	    pushFollow(FOLLOW_param_in_paramList1636);
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
    // etc/XQFT.g:381:9: param : DOLLARSi qName ( typeDeclaration )? ;
    public final param_return param() throws RecognitionException {
        param_return retval = new param_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOLLARSi115=null;
        qName_return qName116 = null;

        typeDeclaration_return typeDeclaration117 = null;


        XQFTTree DOLLARSi115_tree=null;

        try {
            // etc/XQFT.g:381:18: ( DOLLARSi qName ( typeDeclaration )? )
            // etc/XQFT.g:381:20: DOLLARSi qName ( typeDeclaration )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOLLARSi115=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param1656); if (failed) return retval;
            if ( backtracking==0 ) {
            DOLLARSi115_tree = (XQFTTree)adaptor.create(DOLLARSi115);
            adaptor.addChild(root_0, DOLLARSi115_tree);
            }
            pushFollow(FOLLOW_qName_in_param1658);
            qName116=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName116.getTree());
            // etc/XQFT.g:381:35: ( typeDeclaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:381:35: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param1660);
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
    // etc/XQFT.g:382:5: enclosedExpr : LBRACESi expr RBRACSi ;
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
            // etc/XQFT.g:382:18: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:383:9: LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LBRACESi118=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_enclosedExpr1681); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_enclosedExpr1693);
            expr119=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr119.getTree());
            RBRACSi120=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_enclosedExpr1704); if (failed) return retval;

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
    // etc/XQFT.g:388:1: optionDecl : OPTION qName StringLiteral ;
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
            // etc/XQFT.g:388:12: ( OPTION qName StringLiteral )
            // etc/XQFT.g:388:14: OPTION qName StringLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            OPTION121=(Token)input.LT(1);
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl1718); if (failed) return retval;
            if ( backtracking==0 ) {
            OPTION121_tree = (XQFTTree)adaptor.create(OPTION121);
            adaptor.addChild(root_0, OPTION121_tree);
            }
            pushFollow(FOLLOW_qName_in_optionDecl1720);
            qName122=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName122.getTree());
            StringLiteral123=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl1722); if (failed) return retval;
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
    // etc/XQFT.g:390:1: ftOptionDecl : FTOPTION ftMatchOptions ;
    public final ftOptionDecl_return ftOptionDecl() throws RecognitionException {
        ftOptionDecl_return retval = new ftOptionDecl_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTOPTION124=null;
        ftMatchOptions_return ftMatchOptions125 = null;


        XQFTTree FTOPTION124_tree=null;

        try {
            // etc/XQFT.g:390:14: ( FTOPTION ftMatchOptions )
            // etc/XQFT.g:390:16: FTOPTION ftMatchOptions
            {
            root_0 = (XQFTTree)adaptor.nil();

            FTOPTION124=(Token)input.LT(1);
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl1730); if (failed) return retval;
            if ( backtracking==0 ) {
            FTOPTION124_tree = (XQFTTree)adaptor.create(FTOPTION124);
            adaptor.addChild(root_0, FTOPTION124_tree);
            }
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl1732);
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
    // etc/XQFT.g:391:5: ftMatchOptions : ( ftMatchOption )+ ;
    public final ftMatchOptions_return ftMatchOptions() throws RecognitionException {
        ftMatchOptions_return retval = new ftMatchOptions_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftMatchOption_return ftMatchOption126 = null;



        try {
            // etc/XQFT.g:391:20: ( ( ftMatchOption )+ )
            // etc/XQFT.g:391:22: ( ftMatchOption )+
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:391:22: ( ftMatchOption )+
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
            	    // etc/XQFT.g:391:22: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions1743);
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
    // etc/XQFT.g:395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );
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
            // etc/XQFT.g:395:14: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi )
            int alt27=3;
            switch ( input.LA(1) ) {
            case DOCUMENT_NODE:
                {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==LPARSi) ) {
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
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 14, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==STARSi) ) {
                    int LA27_15 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 15, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==EOF||LA27_1==AND||(LA27_1>=ASCENDING && LA27_1<=AT)||LA27_1==CASE||LA27_1==COLLATION||LA27_1==DEFAULT||LA27_1==DESCENDING||LA27_1==DIV||LA27_1==ELSE||LA27_1==EMPTY||LA27_1==EQ||(LA27_1>=EXCEPT && LA27_1<=EXTERNAL)||LA27_1==FOR||LA27_1==FTCONTAINS||LA27_1==GE||(LA27_1>=GT && LA27_1<=IDIV)||LA27_1==IN||(LA27_1>=INSTANCE && LA27_1<=IS)||LA27_1==LE||(LA27_1>=LET && LA27_1<=LEVELS)||(LA27_1>=LT && LA27_1<=MOD)||LA27_1==NE||(LA27_1>=OR && LA27_1<=ORDER)||LA27_1==PARAGRAPHS||LA27_1==RETURN||LA27_1==SATISFIES||LA27_1==SCORE||LA27_1==SENTENCES||LA27_1==STABLE||(LA27_1>=TIMES && LA27_1<=TO)||LA27_1==UNION||LA27_1==WHERE||LA27_1==WITHOUT||LA27_1==WORDS||(LA27_1>=SEMICOLONSi && LA27_1<=COMMASi)||LA27_1==ASSIGNSi||(LA27_1>=RPARSi && LA27_1<=RBRACSi)||(LA27_1>=MINUSSi && LA27_1<=NODEAFTERSi)||LA27_1==RBRACKSi) ) {
                    alt27=2;
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
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 27, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_1==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 1, input);

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
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 59, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==STARSi) ) {
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
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 60, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==EOF||LA27_2==AND||(LA27_2>=ASCENDING && LA27_2<=AT)||LA27_2==CASE||LA27_2==COLLATION||LA27_2==DEFAULT||LA27_2==DESCENDING||LA27_2==DIV||LA27_2==ELSE||LA27_2==EMPTY||LA27_2==EQ||(LA27_2>=EXCEPT && LA27_2<=EXTERNAL)||LA27_2==FOR||LA27_2==FTCONTAINS||LA27_2==GE||(LA27_2>=GT && LA27_2<=IDIV)||LA27_2==IN||(LA27_2>=INSTANCE && LA27_2<=IS)||LA27_2==LE||(LA27_2>=LET && LA27_2<=LEVELS)||(LA27_2>=LT && LA27_2<=MOD)||LA27_2==NE||(LA27_2>=OR && LA27_2<=ORDER)||LA27_2==PARAGRAPHS||LA27_2==RETURN||LA27_2==SATISFIES||LA27_2==SCORE||LA27_2==SENTENCES||LA27_2==STABLE||(LA27_2>=TIMES && LA27_2<=TO)||LA27_2==UNION||LA27_2==WHERE||LA27_2==WITHOUT||LA27_2==WORDS||(LA27_2>=SEMICOLONSi && LA27_2<=COMMASi)||LA27_2==ASSIGNSi||(LA27_2>=RPARSi && LA27_2<=RBRACSi)||(LA27_2>=MINUSSi && LA27_2<=NODEAFTERSi)||LA27_2==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_2==PLUSSi) ) {
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
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 72, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA27_3 = input.LA(2);

                if ( (LA27_3==LPARSi) ) {
                    int LA27_104 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 104, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_3==STARSi) ) {
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
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 105, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_3==EOF||LA27_3==AND||(LA27_3>=ASCENDING && LA27_3<=AT)||LA27_3==CASE||LA27_3==COLLATION||LA27_3==DEFAULT||LA27_3==DESCENDING||LA27_3==DIV||LA27_3==ELSE||LA27_3==EMPTY||LA27_3==EQ||(LA27_3>=EXCEPT && LA27_3<=EXTERNAL)||LA27_3==FOR||LA27_3==FTCONTAINS||LA27_3==GE||(LA27_3>=GT && LA27_3<=IDIV)||LA27_3==IN||(LA27_3>=INSTANCE && LA27_3<=IS)||LA27_3==LE||(LA27_3>=LET && LA27_3<=LEVELS)||(LA27_3>=LT && LA27_3<=MOD)||LA27_3==NE||(LA27_3>=OR && LA27_3<=ORDER)||LA27_3==PARAGRAPHS||LA27_3==RETURN||LA27_3==SATISFIES||LA27_3==SCORE||LA27_3==SENTENCES||LA27_3==STABLE||(LA27_3>=TIMES && LA27_3<=TO)||LA27_3==UNION||LA27_3==WHERE||LA27_3==WITHOUT||LA27_3==WORDS||(LA27_3>=SEMICOLONSi && LA27_3<=COMMASi)||LA27_3==ASSIGNSi||(LA27_3>=RPARSi && LA27_3<=RBRACSi)||(LA27_3>=MINUSSi && LA27_3<=NODEAFTERSi)||LA27_3==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_3==PLUSSi) ) {
                    int LA27_117 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 117, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_3==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 3, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ELEMENT:
                {
                int LA27_4 = input.LA(2);

                if ( (LA27_4==LPARSi) ) {
                    int LA27_149 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 149, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_4==STARSi) ) {
                    int LA27_150 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 150, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_4==EOF||LA27_4==AND||(LA27_4>=ASCENDING && LA27_4<=AT)||LA27_4==CASE||LA27_4==COLLATION||LA27_4==DEFAULT||LA27_4==DESCENDING||LA27_4==DIV||LA27_4==ELSE||LA27_4==EMPTY||LA27_4==EQ||(LA27_4>=EXCEPT && LA27_4<=EXTERNAL)||LA27_4==FOR||LA27_4==FTCONTAINS||LA27_4==GE||(LA27_4>=GT && LA27_4<=IDIV)||LA27_4==IN||(LA27_4>=INSTANCE && LA27_4<=IS)||LA27_4==LE||(LA27_4>=LET && LA27_4<=LEVELS)||(LA27_4>=LT && LA27_4<=MOD)||LA27_4==NE||(LA27_4>=OR && LA27_4<=ORDER)||LA27_4==PARAGRAPHS||LA27_4==RETURN||LA27_4==SATISFIES||LA27_4==SCORE||LA27_4==SENTENCES||LA27_4==STABLE||(LA27_4>=TIMES && LA27_4<=TO)||LA27_4==UNION||LA27_4==WHERE||LA27_4==WITHOUT||LA27_4==WORDS||(LA27_4>=SEMICOLONSi && LA27_4<=COMMASi)||LA27_4==ASSIGNSi||(LA27_4>=RPARSi && LA27_4<=RBRACSi)||(LA27_4>=MINUSSi && LA27_4<=NODEAFTERSi)||LA27_4==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_4==PLUSSi) ) {
                    int LA27_162 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 162, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_4==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 4, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ATTRIBUTE:
                {
                int LA27_5 = input.LA(2);

                if ( (LA27_5==LPARSi) ) {
                    int LA27_194 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 194, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_5==STARSi) ) {
                    int LA27_195 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 195, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_5==EOF||LA27_5==AND||(LA27_5>=ASCENDING && LA27_5<=AT)||LA27_5==CASE||LA27_5==COLLATION||LA27_5==DEFAULT||LA27_5==DESCENDING||LA27_5==DIV||LA27_5==ELSE||LA27_5==EMPTY||LA27_5==EQ||(LA27_5>=EXCEPT && LA27_5<=EXTERNAL)||LA27_5==FOR||LA27_5==FTCONTAINS||LA27_5==GE||(LA27_5>=GT && LA27_5<=IDIV)||LA27_5==IN||(LA27_5>=INSTANCE && LA27_5<=IS)||LA27_5==LE||(LA27_5>=LET && LA27_5<=LEVELS)||(LA27_5>=LT && LA27_5<=MOD)||LA27_5==NE||(LA27_5>=OR && LA27_5<=ORDER)||LA27_5==PARAGRAPHS||LA27_5==RETURN||LA27_5==SATISFIES||LA27_5==SCORE||LA27_5==SENTENCES||LA27_5==STABLE||(LA27_5>=TIMES && LA27_5<=TO)||LA27_5==UNION||LA27_5==WHERE||LA27_5==WITHOUT||LA27_5==WORDS||(LA27_5>=SEMICOLONSi && LA27_5<=COMMASi)||LA27_5==ASSIGNSi||(LA27_5>=RPARSi && LA27_5<=RBRACSi)||(LA27_5>=MINUSSi && LA27_5<=NODEAFTERSi)||LA27_5==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_5==PLUSSi) ) {
                    int LA27_207 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 207, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_5==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 5, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA27_6 = input.LA(2);

                if ( (LA27_6==LPARSi) ) {
                    int LA27_239 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 239, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_6==STARSi) ) {
                    int LA27_240 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 240, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_6==EOF||LA27_6==AND||(LA27_6>=ASCENDING && LA27_6<=AT)||LA27_6==CASE||LA27_6==COLLATION||LA27_6==DEFAULT||LA27_6==DESCENDING||LA27_6==DIV||LA27_6==ELSE||LA27_6==EMPTY||LA27_6==EQ||(LA27_6>=EXCEPT && LA27_6<=EXTERNAL)||LA27_6==FOR||LA27_6==FTCONTAINS||LA27_6==GE||(LA27_6>=GT && LA27_6<=IDIV)||LA27_6==IN||(LA27_6>=INSTANCE && LA27_6<=IS)||LA27_6==LE||(LA27_6>=LET && LA27_6<=LEVELS)||(LA27_6>=LT && LA27_6<=MOD)||LA27_6==NE||(LA27_6>=OR && LA27_6<=ORDER)||LA27_6==PARAGRAPHS||LA27_6==RETURN||LA27_6==SATISFIES||LA27_6==SCORE||LA27_6==SENTENCES||LA27_6==STABLE||(LA27_6>=TIMES && LA27_6<=TO)||LA27_6==UNION||LA27_6==WHERE||LA27_6==WITHOUT||LA27_6==WORDS||(LA27_6>=SEMICOLONSi && LA27_6<=COMMASi)||LA27_6==ASSIGNSi||(LA27_6>=RPARSi && LA27_6<=RBRACSi)||(LA27_6>=MINUSSi && LA27_6<=NODEAFTERSi)||LA27_6==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_6==PLUSSi) ) {
                    int LA27_252 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 252, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_6==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 6, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA27_7 = input.LA(2);

                if ( (LA27_7==LPARSi) ) {
                    int LA27_284 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 284, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_7==STARSi) ) {
                    int LA27_285 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 285, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_7==EOF||LA27_7==AND||(LA27_7>=ASCENDING && LA27_7<=AT)||LA27_7==CASE||LA27_7==COLLATION||LA27_7==DEFAULT||LA27_7==DESCENDING||LA27_7==DIV||LA27_7==ELSE||LA27_7==EMPTY||LA27_7==EQ||(LA27_7>=EXCEPT && LA27_7<=EXTERNAL)||LA27_7==FOR||LA27_7==FTCONTAINS||LA27_7==GE||(LA27_7>=GT && LA27_7<=IDIV)||LA27_7==IN||(LA27_7>=INSTANCE && LA27_7<=IS)||LA27_7==LE||(LA27_7>=LET && LA27_7<=LEVELS)||(LA27_7>=LT && LA27_7<=MOD)||LA27_7==NE||(LA27_7>=OR && LA27_7<=ORDER)||LA27_7==PARAGRAPHS||LA27_7==RETURN||LA27_7==SATISFIES||LA27_7==SCORE||LA27_7==SENTENCES||LA27_7==STABLE||(LA27_7>=TIMES && LA27_7<=TO)||LA27_7==UNION||LA27_7==WHERE||LA27_7==WITHOUT||LA27_7==WORDS||(LA27_7>=SEMICOLONSi && LA27_7<=COMMASi)||LA27_7==ASSIGNSi||(LA27_7>=RPARSi && LA27_7<=RBRACSi)||(LA27_7>=MINUSSi && LA27_7<=NODEAFTERSi)||LA27_7==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_7==PLUSSi) ) {
                    int LA27_297 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 297, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_7==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 7, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA27_8 = input.LA(2);

                if ( (LA27_8==LPARSi) ) {
                    int LA27_329 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 329, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_8==STARSi) ) {
                    int LA27_330 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 330, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_8==EOF||LA27_8==AND||(LA27_8>=ASCENDING && LA27_8<=AT)||LA27_8==CASE||LA27_8==COLLATION||LA27_8==DEFAULT||LA27_8==DESCENDING||LA27_8==DIV||LA27_8==ELSE||LA27_8==EMPTY||LA27_8==EQ||(LA27_8>=EXCEPT && LA27_8<=EXTERNAL)||LA27_8==FOR||LA27_8==FTCONTAINS||LA27_8==GE||(LA27_8>=GT && LA27_8<=IDIV)||LA27_8==IN||(LA27_8>=INSTANCE && LA27_8<=IS)||LA27_8==LE||(LA27_8>=LET && LA27_8<=LEVELS)||(LA27_8>=LT && LA27_8<=MOD)||LA27_8==NE||(LA27_8>=OR && LA27_8<=ORDER)||LA27_8==PARAGRAPHS||LA27_8==RETURN||LA27_8==SATISFIES||LA27_8==SCORE||LA27_8==SENTENCES||LA27_8==STABLE||(LA27_8>=TIMES && LA27_8<=TO)||LA27_8==UNION||LA27_8==WHERE||LA27_8==WITHOUT||LA27_8==WORDS||(LA27_8>=SEMICOLONSi && LA27_8<=COMMASi)||LA27_8==ASSIGNSi||(LA27_8>=RPARSi && LA27_8<=RBRACSi)||(LA27_8>=MINUSSi && LA27_8<=NODEAFTERSi)||LA27_8==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_8==PLUSSi) ) {
                    int LA27_342 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 342, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_8==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 8, input);

                    throw nvae;
                }
                }
                break;
            case NODE:
                {
                int LA27_9 = input.LA(2);

                if ( (LA27_9==LPARSi) ) {
                    int LA27_374 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 374, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_9==STARSi) ) {
                    int LA27_375 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 375, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_9==EOF||LA27_9==AND||(LA27_9>=ASCENDING && LA27_9<=AT)||LA27_9==CASE||LA27_9==COLLATION||LA27_9==DEFAULT||LA27_9==DESCENDING||LA27_9==DIV||LA27_9==ELSE||LA27_9==EMPTY||LA27_9==EQ||(LA27_9>=EXCEPT && LA27_9<=EXTERNAL)||LA27_9==FOR||LA27_9==FTCONTAINS||LA27_9==GE||(LA27_9>=GT && LA27_9<=IDIV)||LA27_9==IN||(LA27_9>=INSTANCE && LA27_9<=IS)||LA27_9==LE||(LA27_9>=LET && LA27_9<=LEVELS)||(LA27_9>=LT && LA27_9<=MOD)||LA27_9==NE||(LA27_9>=OR && LA27_9<=ORDER)||LA27_9==PARAGRAPHS||LA27_9==RETURN||LA27_9==SATISFIES||LA27_9==SCORE||LA27_9==SENTENCES||LA27_9==STABLE||(LA27_9>=TIMES && LA27_9<=TO)||LA27_9==UNION||LA27_9==WHERE||LA27_9==WITHOUT||LA27_9==WORDS||(LA27_9>=SEMICOLONSi && LA27_9<=COMMASi)||LA27_9==ASSIGNSi||(LA27_9>=RPARSi && LA27_9<=RBRACSi)||(LA27_9>=MINUSSi && LA27_9<=NODEAFTERSi)||LA27_9==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_9==PLUSSi) ) {
                    int LA27_387 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 387, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_9==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 9, input);

                    throw nvae;
                }
                }
                break;
            case ITEM:
                {
                int LA27_10 = input.LA(2);

                if ( (LA27_10==LPARSi) ) {
                    int LA27_419 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 419, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_10==STARSi) ) {
                    int LA27_420 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 420, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_10==EOF||LA27_10==AND||(LA27_10>=ASCENDING && LA27_10<=AT)||LA27_10==CASE||LA27_10==COLLATION||LA27_10==DEFAULT||LA27_10==DESCENDING||LA27_10==DIV||LA27_10==ELSE||LA27_10==EMPTY||LA27_10==EQ||(LA27_10>=EXCEPT && LA27_10<=EXTERNAL)||LA27_10==FOR||LA27_10==FTCONTAINS||LA27_10==GE||(LA27_10>=GT && LA27_10<=IDIV)||LA27_10==IN||(LA27_10>=INSTANCE && LA27_10<=IS)||LA27_10==LE||(LA27_10>=LET && LA27_10<=LEVELS)||(LA27_10>=LT && LA27_10<=MOD)||LA27_10==NE||(LA27_10>=OR && LA27_10<=ORDER)||LA27_10==PARAGRAPHS||LA27_10==RETURN||LA27_10==SATISFIES||LA27_10==SCORE||LA27_10==SENTENCES||LA27_10==STABLE||(LA27_10>=TIMES && LA27_10<=TO)||LA27_10==UNION||LA27_10==WHERE||LA27_10==WITHOUT||LA27_10==WORDS||(LA27_10>=SEMICOLONSi && LA27_10<=COMMASi)||LA27_10==ASSIGNSi||(LA27_10>=RPARSi && LA27_10<=RBRACSi)||(LA27_10>=MINUSSi && LA27_10<=NODEAFTERSi)||LA27_10==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_10==PLUSSi) ) {
                    int LA27_432 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 432, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_10==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 10, input);

                    throw nvae;
                }
                }
                break;
            case QName:
                {
                int LA27_11 = input.LA(2);

                if ( (LA27_11==EOF||LA27_11==AND||(LA27_11>=ASCENDING && LA27_11<=AT)||LA27_11==CASE||LA27_11==COLLATION||LA27_11==DEFAULT||LA27_11==DESCENDING||LA27_11==DIV||LA27_11==ELSE||LA27_11==EMPTY||LA27_11==EQ||(LA27_11>=EXCEPT && LA27_11<=EXTERNAL)||LA27_11==FOR||LA27_11==FTCONTAINS||LA27_11==GE||(LA27_11>=GT && LA27_11<=IDIV)||LA27_11==IN||(LA27_11>=INSTANCE && LA27_11<=IS)||LA27_11==LE||(LA27_11>=LET && LA27_11<=LEVELS)||(LA27_11>=LT && LA27_11<=MOD)||LA27_11==NE||(LA27_11>=OR && LA27_11<=ORDER)||LA27_11==PARAGRAPHS||LA27_11==RETURN||LA27_11==SATISFIES||LA27_11==SCORE||LA27_11==SENTENCES||LA27_11==STABLE||(LA27_11>=TIMES && LA27_11<=TO)||LA27_11==UNION||LA27_11==WHERE||LA27_11==WITHOUT||LA27_11==WORDS||(LA27_11>=SEMICOLONSi && LA27_11<=COMMASi)||LA27_11==ASSIGNSi||(LA27_11>=RPARSi && LA27_11<=RBRACSi)||(LA27_11>=MINUSSi && LA27_11<=NODEAFTERSi)||LA27_11==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_11==STARSi) ) {
                    int LA27_475 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 475, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_11==PLUSSi) ) {
                    int LA27_476 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 476, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_11==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 11, input);

                    throw nvae;
                }
                }
                break;
            case EMPTY_SEQUENCE:
                {
                int LA27_12 = input.LA(2);

                if ( (LA27_12==LPARSi) ) {
                    alt27=3;
                }
                else if ( (LA27_12==STARSi) ) {
                    int LA27_509 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 509, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_12==EOF||LA27_12==AND||(LA27_12>=ASCENDING && LA27_12<=AT)||LA27_12==CASE||LA27_12==COLLATION||LA27_12==DEFAULT||LA27_12==DESCENDING||LA27_12==DIV||LA27_12==ELSE||LA27_12==EMPTY||LA27_12==EQ||(LA27_12>=EXCEPT && LA27_12<=EXTERNAL)||LA27_12==FOR||LA27_12==FTCONTAINS||LA27_12==GE||(LA27_12>=GT && LA27_12<=IDIV)||LA27_12==IN||(LA27_12>=INSTANCE && LA27_12<=IS)||LA27_12==LE||(LA27_12>=LET && LA27_12<=LEVELS)||(LA27_12>=LT && LA27_12<=MOD)||LA27_12==NE||(LA27_12>=OR && LA27_12<=ORDER)||LA27_12==PARAGRAPHS||LA27_12==RETURN||LA27_12==SATISFIES||LA27_12==SCORE||LA27_12==SENTENCES||LA27_12==STABLE||(LA27_12>=TIMES && LA27_12<=TO)||LA27_12==UNION||LA27_12==WHERE||LA27_12==WITHOUT||LA27_12==WORDS||(LA27_12>=SEMICOLONSi && LA27_12<=COMMASi)||LA27_12==ASSIGNSi||(LA27_12>=RPARSi && LA27_12<=RBRACSi)||(LA27_12>=MINUSSi && LA27_12<=NODEAFTERSi)||LA27_12==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_12==PLUSSi) ) {
                    int LA27_521 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 521, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_12==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 12, input);

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
                int LA27_13 = input.LA(2);

                if ( (LA27_13==STARSi) ) {
                    int LA27_553 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 553, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_13==EOF||LA27_13==AND||(LA27_13>=ASCENDING && LA27_13<=AT)||LA27_13==CASE||LA27_13==COLLATION||LA27_13==DEFAULT||LA27_13==DESCENDING||LA27_13==DIV||LA27_13==ELSE||LA27_13==EMPTY||LA27_13==EQ||(LA27_13>=EXCEPT && LA27_13<=EXTERNAL)||LA27_13==FOR||LA27_13==FTCONTAINS||LA27_13==GE||(LA27_13>=GT && LA27_13<=IDIV)||LA27_13==IN||(LA27_13>=INSTANCE && LA27_13<=IS)||LA27_13==LE||(LA27_13>=LET && LA27_13<=LEVELS)||(LA27_13>=LT && LA27_13<=MOD)||LA27_13==NE||(LA27_13>=OR && LA27_13<=ORDER)||LA27_13==PARAGRAPHS||LA27_13==RETURN||LA27_13==SATISFIES||LA27_13==SCORE||LA27_13==SENTENCES||LA27_13==STABLE||(LA27_13>=TIMES && LA27_13<=TO)||LA27_13==UNION||LA27_13==WHERE||LA27_13==WITHOUT||LA27_13==WORDS||(LA27_13>=SEMICOLONSi && LA27_13<=COMMASi)||LA27_13==ASSIGNSi||(LA27_13>=RPARSi && LA27_13<=RBRACSi)||(LA27_13>=MINUSSi && LA27_13<=NODEAFTERSi)||LA27_13==RBRACKSi) ) {
                    alt27=2;
                }
                else if ( (LA27_13==PLUSSi) ) {
                    int LA27_565 = input.LA(3);

                    if ( (synpred2()) ) {
                        alt27=1;
                    }
                    else if ( (true) ) {
                        alt27=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 565, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_13==QUESTIONSi) && (synpred2())) {
                    alt27=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 13, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("395:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // etc/XQFT.g:396:5: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_itemType_in_sequenceType1769);
                    itemType127=itemType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, itemType127.getTree());
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType1771);
                    occurrenceIndicator128=occurrenceIndicator();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, occurrenceIndicator128.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:397:7: itemType
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_itemType_in_sequenceType1779);
                    itemType129=itemType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, itemType129.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:398:7: EMPTY_SEQUENCE LPARSi RPARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    EMPTY_SEQUENCE130=(Token)input.LT(1);
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType1787); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EMPTY_SEQUENCE130_tree = (XQFTTree)adaptor.create(EMPTY_SEQUENCE130);
                    adaptor.addChild(root_0, EMPTY_SEQUENCE130_tree);
                    }
                    LPARSi131=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_sequenceType1789); if (failed) return retval;
                    RPARSi132=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_sequenceType1792); if (failed) return retval;

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
    // etc/XQFT.g:399:5: itemType : ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) ;
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
            // etc/XQFT.g:399:14: ( ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) )
            // etc/XQFT.g:399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            int alt28=3;
            switch ( input.LA(1) ) {
            case DOCUMENT_NODE:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==LPARSi) ) {
                    alt28=1;
                }
                else if ( (LA28_1==EOF||LA28_1==AND||(LA28_1>=ASCENDING && LA28_1<=AT)||LA28_1==CASE||LA28_1==COLLATION||LA28_1==DEFAULT||LA28_1==DESCENDING||LA28_1==DIV||LA28_1==ELSE||LA28_1==EMPTY||LA28_1==EQ||(LA28_1>=EXCEPT && LA28_1<=EXTERNAL)||LA28_1==FOR||LA28_1==FTCONTAINS||LA28_1==GE||(LA28_1>=GT && LA28_1<=IDIV)||LA28_1==IN||(LA28_1>=INSTANCE && LA28_1<=IS)||LA28_1==LE||(LA28_1>=LET && LA28_1<=LEVELS)||(LA28_1>=LT && LA28_1<=MOD)||LA28_1==NE||(LA28_1>=OR && LA28_1<=ORDER)||LA28_1==PARAGRAPHS||LA28_1==RETURN||LA28_1==SATISFIES||LA28_1==SCORE||LA28_1==SENTENCES||LA28_1==STABLE||(LA28_1>=TIMES && LA28_1<=TO)||LA28_1==UNION||LA28_1==WHERE||LA28_1==WITHOUT||LA28_1==WORDS||(LA28_1>=SEMICOLONSi && LA28_1<=COMMASi)||LA28_1==ASSIGNSi||(LA28_1>=RPARSi && LA28_1<=NODEAFTERSi)||LA28_1==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 1, input);

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
                else if ( (LA28_2==EOF||LA28_2==AND||(LA28_2>=ASCENDING && LA28_2<=AT)||LA28_2==CASE||LA28_2==COLLATION||LA28_2==DEFAULT||LA28_2==DESCENDING||LA28_2==DIV||LA28_2==ELSE||LA28_2==EMPTY||LA28_2==EQ||(LA28_2>=EXCEPT && LA28_2<=EXTERNAL)||LA28_2==FOR||LA28_2==FTCONTAINS||LA28_2==GE||(LA28_2>=GT && LA28_2<=IDIV)||LA28_2==IN||(LA28_2>=INSTANCE && LA28_2<=IS)||LA28_2==LE||(LA28_2>=LET && LA28_2<=LEVELS)||(LA28_2>=LT && LA28_2<=MOD)||LA28_2==NE||(LA28_2>=OR && LA28_2<=ORDER)||LA28_2==PARAGRAPHS||LA28_2==RETURN||LA28_2==SATISFIES||LA28_2==SCORE||LA28_2==SENTENCES||LA28_2==STABLE||(LA28_2>=TIMES && LA28_2<=TO)||LA28_2==UNION||LA28_2==WHERE||LA28_2==WITHOUT||LA28_2==WORDS||(LA28_2>=SEMICOLONSi && LA28_2<=COMMASi)||LA28_2==ASSIGNSi||(LA28_2>=RPARSi && LA28_2<=NODEAFTERSi)||LA28_2==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 2, input);

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
                else if ( (LA28_3==EOF||LA28_3==AND||(LA28_3>=ASCENDING && LA28_3<=AT)||LA28_3==CASE||LA28_3==COLLATION||LA28_3==DEFAULT||LA28_3==DESCENDING||LA28_3==DIV||LA28_3==ELSE||LA28_3==EMPTY||LA28_3==EQ||(LA28_3>=EXCEPT && LA28_3<=EXTERNAL)||LA28_3==FOR||LA28_3==FTCONTAINS||LA28_3==GE||(LA28_3>=GT && LA28_3<=IDIV)||LA28_3==IN||(LA28_3>=INSTANCE && LA28_3<=IS)||LA28_3==LE||(LA28_3>=LET && LA28_3<=LEVELS)||(LA28_3>=LT && LA28_3<=MOD)||LA28_3==NE||(LA28_3>=OR && LA28_3<=ORDER)||LA28_3==PARAGRAPHS||LA28_3==RETURN||LA28_3==SATISFIES||LA28_3==SCORE||LA28_3==SENTENCES||LA28_3==STABLE||(LA28_3>=TIMES && LA28_3<=TO)||LA28_3==UNION||LA28_3==WHERE||LA28_3==WITHOUT||LA28_3==WORDS||(LA28_3>=SEMICOLONSi && LA28_3<=COMMASi)||LA28_3==ASSIGNSi||(LA28_3>=RPARSi && LA28_3<=NODEAFTERSi)||LA28_3==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 3, input);

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
                else if ( (LA28_4==EOF||LA28_4==AND||(LA28_4>=ASCENDING && LA28_4<=AT)||LA28_4==CASE||LA28_4==COLLATION||LA28_4==DEFAULT||LA28_4==DESCENDING||LA28_4==DIV||LA28_4==ELSE||LA28_4==EMPTY||LA28_4==EQ||(LA28_4>=EXCEPT && LA28_4<=EXTERNAL)||LA28_4==FOR||LA28_4==FTCONTAINS||LA28_4==GE||(LA28_4>=GT && LA28_4<=IDIV)||LA28_4==IN||(LA28_4>=INSTANCE && LA28_4<=IS)||LA28_4==LE||(LA28_4>=LET && LA28_4<=LEVELS)||(LA28_4>=LT && LA28_4<=MOD)||LA28_4==NE||(LA28_4>=OR && LA28_4<=ORDER)||LA28_4==PARAGRAPHS||LA28_4==RETURN||LA28_4==SATISFIES||LA28_4==SCORE||LA28_4==SENTENCES||LA28_4==STABLE||(LA28_4>=TIMES && LA28_4<=TO)||LA28_4==UNION||LA28_4==WHERE||LA28_4==WITHOUT||LA28_4==WORDS||(LA28_4>=SEMICOLONSi && LA28_4<=COMMASi)||LA28_4==ASSIGNSi||(LA28_4>=RPARSi && LA28_4<=NODEAFTERSi)||LA28_4==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 4, input);

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
                else if ( (LA28_5==EOF||LA28_5==AND||(LA28_5>=ASCENDING && LA28_5<=AT)||LA28_5==CASE||LA28_5==COLLATION||LA28_5==DEFAULT||LA28_5==DESCENDING||LA28_5==DIV||LA28_5==ELSE||LA28_5==EMPTY||LA28_5==EQ||(LA28_5>=EXCEPT && LA28_5<=EXTERNAL)||LA28_5==FOR||LA28_5==FTCONTAINS||LA28_5==GE||(LA28_5>=GT && LA28_5<=IDIV)||LA28_5==IN||(LA28_5>=INSTANCE && LA28_5<=IS)||LA28_5==LE||(LA28_5>=LET && LA28_5<=LEVELS)||(LA28_5>=LT && LA28_5<=MOD)||LA28_5==NE||(LA28_5>=OR && LA28_5<=ORDER)||LA28_5==PARAGRAPHS||LA28_5==RETURN||LA28_5==SATISFIES||LA28_5==SCORE||LA28_5==SENTENCES||LA28_5==STABLE||(LA28_5>=TIMES && LA28_5<=TO)||LA28_5==UNION||LA28_5==WHERE||LA28_5==WITHOUT||LA28_5==WORDS||(LA28_5>=SEMICOLONSi && LA28_5<=COMMASi)||LA28_5==ASSIGNSi||(LA28_5>=RPARSi && LA28_5<=NODEAFTERSi)||LA28_5==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 5, input);

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
                else if ( (LA28_6==EOF||LA28_6==AND||(LA28_6>=ASCENDING && LA28_6<=AT)||LA28_6==CASE||LA28_6==COLLATION||LA28_6==DEFAULT||LA28_6==DESCENDING||LA28_6==DIV||LA28_6==ELSE||LA28_6==EMPTY||LA28_6==EQ||(LA28_6>=EXCEPT && LA28_6<=EXTERNAL)||LA28_6==FOR||LA28_6==FTCONTAINS||LA28_6==GE||(LA28_6>=GT && LA28_6<=IDIV)||LA28_6==IN||(LA28_6>=INSTANCE && LA28_6<=IS)||LA28_6==LE||(LA28_6>=LET && LA28_6<=LEVELS)||(LA28_6>=LT && LA28_6<=MOD)||LA28_6==NE||(LA28_6>=OR && LA28_6<=ORDER)||LA28_6==PARAGRAPHS||LA28_6==RETURN||LA28_6==SATISFIES||LA28_6==SCORE||LA28_6==SENTENCES||LA28_6==STABLE||(LA28_6>=TIMES && LA28_6<=TO)||LA28_6==UNION||LA28_6==WHERE||LA28_6==WITHOUT||LA28_6==WORDS||(LA28_6>=SEMICOLONSi && LA28_6<=COMMASi)||LA28_6==ASSIGNSi||(LA28_6>=RPARSi && LA28_6<=NODEAFTERSi)||LA28_6==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 6, input);

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
                else if ( (LA28_7==EOF||LA28_7==AND||(LA28_7>=ASCENDING && LA28_7<=AT)||LA28_7==CASE||LA28_7==COLLATION||LA28_7==DEFAULT||LA28_7==DESCENDING||LA28_7==DIV||LA28_7==ELSE||LA28_7==EMPTY||LA28_7==EQ||(LA28_7>=EXCEPT && LA28_7<=EXTERNAL)||LA28_7==FOR||LA28_7==FTCONTAINS||LA28_7==GE||(LA28_7>=GT && LA28_7<=IDIV)||LA28_7==IN||(LA28_7>=INSTANCE && LA28_7<=IS)||LA28_7==LE||(LA28_7>=LET && LA28_7<=LEVELS)||(LA28_7>=LT && LA28_7<=MOD)||LA28_7==NE||(LA28_7>=OR && LA28_7<=ORDER)||LA28_7==PARAGRAPHS||LA28_7==RETURN||LA28_7==SATISFIES||LA28_7==SCORE||LA28_7==SENTENCES||LA28_7==STABLE||(LA28_7>=TIMES && LA28_7<=TO)||LA28_7==UNION||LA28_7==WHERE||LA28_7==WITHOUT||LA28_7==WORDS||(LA28_7>=SEMICOLONSi && LA28_7<=COMMASi)||LA28_7==ASSIGNSi||(LA28_7>=RPARSi && LA28_7<=NODEAFTERSi)||LA28_7==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 7, input);

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
                else if ( (LA28_8==EOF||LA28_8==AND||(LA28_8>=ASCENDING && LA28_8<=AT)||LA28_8==CASE||LA28_8==COLLATION||LA28_8==DEFAULT||LA28_8==DESCENDING||LA28_8==DIV||LA28_8==ELSE||LA28_8==EMPTY||LA28_8==EQ||(LA28_8>=EXCEPT && LA28_8<=EXTERNAL)||LA28_8==FOR||LA28_8==FTCONTAINS||LA28_8==GE||(LA28_8>=GT && LA28_8<=IDIV)||LA28_8==IN||(LA28_8>=INSTANCE && LA28_8<=IS)||LA28_8==LE||(LA28_8>=LET && LA28_8<=LEVELS)||(LA28_8>=LT && LA28_8<=MOD)||LA28_8==NE||(LA28_8>=OR && LA28_8<=ORDER)||LA28_8==PARAGRAPHS||LA28_8==RETURN||LA28_8==SATISFIES||LA28_8==SCORE||LA28_8==SENTENCES||LA28_8==STABLE||(LA28_8>=TIMES && LA28_8<=TO)||LA28_8==UNION||LA28_8==WHERE||LA28_8==WITHOUT||LA28_8==WORDS||(LA28_8>=SEMICOLONSi && LA28_8<=COMMASi)||LA28_8==ASSIGNSi||(LA28_8>=RPARSi && LA28_8<=NODEAFTERSi)||LA28_8==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 8, input);

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
                else if ( (LA28_9==EOF||LA28_9==AND||(LA28_9>=ASCENDING && LA28_9<=AT)||LA28_9==CASE||LA28_9==COLLATION||LA28_9==DEFAULT||LA28_9==DESCENDING||LA28_9==DIV||LA28_9==ELSE||LA28_9==EMPTY||LA28_9==EQ||(LA28_9>=EXCEPT && LA28_9<=EXTERNAL)||LA28_9==FOR||LA28_9==FTCONTAINS||LA28_9==GE||(LA28_9>=GT && LA28_9<=IDIV)||LA28_9==IN||(LA28_9>=INSTANCE && LA28_9<=IS)||LA28_9==LE||(LA28_9>=LET && LA28_9<=LEVELS)||(LA28_9>=LT && LA28_9<=MOD)||LA28_9==NE||(LA28_9>=OR && LA28_9<=ORDER)||LA28_9==PARAGRAPHS||LA28_9==RETURN||LA28_9==SATISFIES||LA28_9==SCORE||LA28_9==SENTENCES||LA28_9==STABLE||(LA28_9>=TIMES && LA28_9<=TO)||LA28_9==UNION||LA28_9==WHERE||LA28_9==WITHOUT||LA28_9==WORDS||(LA28_9>=SEMICOLONSi && LA28_9<=COMMASi)||LA28_9==ASSIGNSi||(LA28_9>=RPARSi && LA28_9<=NODEAFTERSi)||LA28_9==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 9, input);

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
                else if ( (LA28_10==EOF||LA28_10==AND||(LA28_10>=ASCENDING && LA28_10<=AT)||LA28_10==CASE||LA28_10==COLLATION||LA28_10==DEFAULT||LA28_10==DESCENDING||LA28_10==DIV||LA28_10==ELSE||LA28_10==EMPTY||LA28_10==EQ||(LA28_10>=EXCEPT && LA28_10<=EXTERNAL)||LA28_10==FOR||LA28_10==FTCONTAINS||LA28_10==GE||(LA28_10>=GT && LA28_10<=IDIV)||LA28_10==IN||(LA28_10>=INSTANCE && LA28_10<=IS)||LA28_10==LE||(LA28_10>=LET && LA28_10<=LEVELS)||(LA28_10>=LT && LA28_10<=MOD)||LA28_10==NE||(LA28_10>=OR && LA28_10<=ORDER)||LA28_10==PARAGRAPHS||LA28_10==RETURN||LA28_10==SATISFIES||LA28_10==SCORE||LA28_10==SENTENCES||LA28_10==STABLE||(LA28_10>=TIMES && LA28_10<=TO)||LA28_10==UNION||LA28_10==WHERE||LA28_10==WITHOUT||LA28_10==WORDS||(LA28_10>=SEMICOLONSi && LA28_10<=COMMASi)||LA28_10==ASSIGNSi||(LA28_10>=RPARSi && LA28_10<=NODEAFTERSi)||LA28_10==RBRACKSi) ) {
                    alt28=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 10, input);

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
            case QName:
            case NCName:
                {
                alt28=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("399:16: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:399:17: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType1805);
                    kindTest133=kindTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, kindTest133.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:399:28: ( ITEM LPARSi RPARSi )
                    {
                    // etc/XQFT.g:399:28: ( ITEM LPARSi RPARSi )
                    // etc/XQFT.g:399:29: ITEM LPARSi RPARSi
                    {
                    ITEM134=(Token)input.LT(1);
                    match(input,ITEM,FOLLOW_ITEM_in_itemType1810); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ITEM134_tree = (XQFTTree)adaptor.create(ITEM134);
                    adaptor.addChild(root_0, ITEM134_tree);
                    }
                    LPARSi135=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_itemType1812); if (failed) return retval;
                    RPARSi136=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_itemType1815); if (failed) return retval;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:399:53: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType1821);
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
    // etc/XQFT.g:400:9: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
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
            // etc/XQFT.g:400:18: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
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
                    new NoViableAltException("400:9: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:400:20: documentTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_documentTest_in_kindTest1837);
                    documentTest138=documentTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, documentTest138.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:401:15: elementTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_elementTest_in_kindTest1853);
                    elementTest139=elementTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, elementTest139.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:402:15: attributeTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_attributeTest_in_kindTest1869);
                    attributeTest140=attributeTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attributeTest140.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:403:19: schemaElementTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_schemaElementTest_in_kindTest1889);
                    schemaElementTest141=schemaElementTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaElementTest141.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:404:15: schemaAttributeTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest1905);
                    schemaAttributeTest142=schemaAttributeTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaAttributeTest142.getTree());

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:405:15: piTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_piTest_in_kindTest1921);
                    piTest143=piTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, piTest143.getTree());

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:406:15: commentTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_commentTest_in_kindTest1937);
                    commentTest144=commentTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, commentTest144.getTree());

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:407:15: textTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_textTest_in_kindTest1953);
                    textTest145=textTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, textTest145.getTree());

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:408:15: anyKindTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_anyKindTest_in_kindTest1969);
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
    // etc/XQFT.g:409:13: documentTest : DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi ;
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
            // etc/XQFT.g:409:26: ( DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi )
            // etc/XQFT.g:409:28: DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOCUMENT_NODE147=(Token)input.LT(1);
            match(input,DOCUMENT_NODE,FOLLOW_DOCUMENT_NODE_in_documentTest1988); if (failed) return retval;
            if ( backtracking==0 ) {
            DOCUMENT_NODE147_tree = (XQFTTree)adaptor.create(DOCUMENT_NODE147);
            adaptor.addChild(root_0, DOCUMENT_NODE147_tree);
            }
            LPARSi148=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_documentTest1990); if (failed) return retval;
            // etc/XQFT.g:409:50: ( elementTest | schemaElementTest )?
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
                    // etc/XQFT.g:409:51: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest1994);
                    elementTest149=elementTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, elementTest149.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:409:65: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest1998);
                    schemaElementTest150=schemaElementTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, schemaElementTest150.getTree());

                    }
                    break;

            }

            RPARSi151=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_documentTest2002); if (failed) return retval;

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
    // etc/XQFT.g:410:17: elementTest : ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi ;
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
            // etc/XQFT.g:410:29: ( ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi )
            // etc/XQFT.g:410:31: ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ELEMENT152=(Token)input.LT(1);
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest2026); if (failed) return retval;
            if ( backtracking==0 ) {
            ELEMENT152_tree = (XQFTTree)adaptor.create(ELEMENT152);
            adaptor.addChild(root_0, ELEMENT152_tree);
            }
            LPARSi153=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_elementTest2028); if (failed) return retval;
            // etc/XQFT.g:410:47: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=ALL && LA33_0<=XQUERY)||LA33_0==QName||LA33_0==STARSi||LA33_0==NCName) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // etc/XQFT.g:410:48: elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest2032);
                    elementNameOrWildcard154=elementNameOrWildcard();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, elementNameOrWildcard154.getTree());
                    // etc/XQFT.g:410:70: ( COMMASi typeName ( QUESTIONSi )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMASi) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // etc/XQFT.g:410:71: COMMASi typeName ( QUESTIONSi )?
                            {
                            COMMASi155=(Token)input.LT(1);
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest2035); if (failed) return retval;
                            if ( backtracking==0 ) {
                            COMMASi155_tree = (XQFTTree)adaptor.create(COMMASi155);
                            adaptor.addChild(root_0, COMMASi155_tree);
                            }
                            pushFollow(FOLLOW_typeName_in_elementTest2037);
                            typeName156=typeName();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, typeName156.getTree());
                            // etc/XQFT.g:410:88: ( QUESTIONSi )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==QUESTIONSi) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // etc/XQFT.g:410:88: QUESTIONSi
                                    {
                                    QUESTIONSi157=(Token)input.LT(1);
                                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_elementTest2039); if (failed) return retval;
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
            match(input,RPARSi,FOLLOW_RPARSi_in_elementTest2046); if (failed) return retval;

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
    // etc/XQFT.g:411:21: elementNameOrWildcard : ( elementName | STARSi );
    public final elementNameOrWildcard_return elementNameOrWildcard() throws RecognitionException {
        elementNameOrWildcard_return retval = new elementNameOrWildcard_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token STARSi160=null;
        elementName_return elementName159 = null;


        XQFTTree STARSi160_tree=null;

        try {
            // etc/XQFT.g:411:43: ( elementName | STARSi )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=ALL && LA34_0<=XQUERY)||LA34_0==QName||LA34_0==NCName) ) {
                alt34=1;
            }
            else if ( (LA34_0==STARSi) ) {
                alt34=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("411:21: elementNameOrWildcard : ( elementName | STARSi );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:411:45: elementName
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard2074);
                    elementName159=elementName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, elementName159.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:411:59: STARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STARSi160=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard2078); if (failed) return retval;
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
    // etc/XQFT.g:412:25: elementName : qName ;
    public final elementName_return elementName() throws RecognitionException {
        elementName_return retval = new elementName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qName161 = null;



        try {
            // etc/XQFT.g:412:37: ( qName )
            // etc/XQFT.g:412:39: qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_elementName2109);
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
    // etc/XQFT.g:413:21: typeName : qName ;
    public final typeName_return typeName() throws RecognitionException {
        typeName_return retval = new typeName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qName162 = null;



        try {
            // etc/XQFT.g:413:30: ( qName )
            // etc/XQFT.g:413:32: qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_typeName2136);
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
    // etc/XQFT.g:414:17: schemaElementTest : SCHEMA_ELEMENT LPARSi elementDeclaration RPARSi ;
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
            // etc/XQFT.g:414:35: ( SCHEMA_ELEMENT LPARSi elementDeclaration RPARSi )
            // etc/XQFT.g:414:37: SCHEMA_ELEMENT LPARSi elementDeclaration RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            SCHEMA_ELEMENT163=(Token)input.LT(1);
            match(input,SCHEMA_ELEMENT,FOLLOW_SCHEMA_ELEMENT_in_schemaElementTest2159); if (failed) return retval;
            if ( backtracking==0 ) {
            SCHEMA_ELEMENT163_tree = (XQFTTree)adaptor.create(SCHEMA_ELEMENT163);
            adaptor.addChild(root_0, SCHEMA_ELEMENT163_tree);
            }
            LPARSi164=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaElementTest2161); if (failed) return retval;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest2164);
            elementDeclaration165=elementDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, elementDeclaration165.getTree());
            RPARSi166=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaElementTest2166); if (failed) return retval;

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
    // etc/XQFT.g:415:21: elementDeclaration : elementName ;
    public final elementDeclaration_return elementDeclaration() throws RecognitionException {
        elementDeclaration_return retval = new elementDeclaration_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        elementName_return elementName167 = null;



        try {
            // etc/XQFT.g:415:40: ( elementName )
            // etc/XQFT.g:415:42: elementName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_elementName_in_elementDeclaration2194);
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
    // etc/XQFT.g:416:13: attributeTest : ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi ;
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
            // etc/XQFT.g:416:27: ( ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi )
            // etc/XQFT.g:416:29: ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ATTRIBUTE168=(Token)input.LT(1);
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest2213); if (failed) return retval;
            if ( backtracking==0 ) {
            ATTRIBUTE168_tree = (XQFTTree)adaptor.create(ATTRIBUTE168);
            adaptor.addChild(root_0, ATTRIBUTE168_tree);
            }
            LPARSi169=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_attributeTest2215); if (failed) return retval;
            // etc/XQFT.g:416:47: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=ALL && LA36_0<=XQUERY)||LA36_0==QName||LA36_0==STARSi||LA36_0==NCName) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:416:48: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest2219);
                    attribNameOrWildcard170=attribNameOrWildcard();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attribNameOrWildcard170.getTree());
                    // etc/XQFT.g:416:69: ( COMMASi typeName )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMASi) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // etc/XQFT.g:416:70: COMMASi typeName
                            {
                            COMMASi171=(Token)input.LT(1);
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest2222); if (failed) return retval;
                            if ( backtracking==0 ) {
                            COMMASi171_tree = (XQFTTree)adaptor.create(COMMASi171);
                            adaptor.addChild(root_0, COMMASi171_tree);
                            }
                            pushFollow(FOLLOW_typeName_in_attributeTest2224);
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
            match(input,RPARSi,FOLLOW_RPARSi_in_attributeTest2230); if (failed) return retval;

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
    // etc/XQFT.g:417:17: attribNameOrWildcard : ( attributeName | STARSi );
    public final attribNameOrWildcard_return attribNameOrWildcard() throws RecognitionException {
        attribNameOrWildcard_return retval = new attribNameOrWildcard_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token STARSi175=null;
        attributeName_return attributeName174 = null;


        XQFTTree STARSi175_tree=null;

        try {
            // etc/XQFT.g:417:38: ( attributeName | STARSi )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=ALL && LA37_0<=XQUERY)||LA37_0==QName||LA37_0==NCName) ) {
                alt37=1;
            }
            else if ( (LA37_0==STARSi) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("417:17: attribNameOrWildcard : ( attributeName | STARSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:417:40: attributeName
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard2254);
                    attributeName174=attributeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attributeName174.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:417:56: STARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STARSi175=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard2258); if (failed) return retval;
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
    // etc/XQFT.g:418:21: attributeName : qName ;
    public final attributeName_return attributeName() throws RecognitionException {
        attributeName_return retval = new attributeName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qName176 = null;



        try {
            // etc/XQFT.g:418:35: ( qName )
            // etc/XQFT.g:418:37: qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_attributeName2285);
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
    // etc/XQFT.g:419:13: schemaAttributeTest : SCHEMA_ATTRIBUTE LPARSi attributeDeclaration RPARSi ;
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
            // etc/XQFT.g:419:33: ( SCHEMA_ATTRIBUTE LPARSi attributeDeclaration RPARSi )
            // etc/XQFT.g:419:35: SCHEMA_ATTRIBUTE LPARSi attributeDeclaration RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            SCHEMA_ATTRIBUTE177=(Token)input.LT(1);
            match(input,SCHEMA_ATTRIBUTE,FOLLOW_SCHEMA_ATTRIBUTE_in_schemaAttributeTest2304); if (failed) return retval;
            if ( backtracking==0 ) {
            SCHEMA_ATTRIBUTE177_tree = (XQFTTree)adaptor.create(SCHEMA_ATTRIBUTE177);
            adaptor.addChild(root_0, SCHEMA_ATTRIBUTE177_tree);
            }
            LPARSi178=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaAttributeTest2306); if (failed) return retval;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest2309);
            attributeDeclaration179=attributeDeclaration();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, attributeDeclaration179.getTree());
            RPARSi180=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaAttributeTest2311); if (failed) return retval;

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
    // etc/XQFT.g:420:17: attributeDeclaration : attributeName ;
    public final attributeDeclaration_return attributeDeclaration() throws RecognitionException {
        attributeDeclaration_return retval = new attributeDeclaration_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        attributeName_return attributeName181 = null;



        try {
            // etc/XQFT.g:420:38: ( attributeName )
            // etc/XQFT.g:420:40: attributeName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_attributeName_in_attributeDeclaration2335);
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
    // etc/XQFT.g:421:13: piTest : PROCESSING_INSTRUCTION LPARSi ( ncNameorKeyword | StringLiteral )? RPARSi ;
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
            // etc/XQFT.g:421:20: ( PROCESSING_INSTRUCTION LPARSi ( ncNameorKeyword | StringLiteral )? RPARSi )
            // etc/XQFT.g:421:22: PROCESSING_INSTRUCTION LPARSi ( ncNameorKeyword | StringLiteral )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            PROCESSING_INSTRUCTION182=(Token)input.LT(1);
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest2354); if (failed) return retval;
            if ( backtracking==0 ) {
            PROCESSING_INSTRUCTION182_tree = (XQFTTree)adaptor.create(PROCESSING_INSTRUCTION182);
            adaptor.addChild(root_0, PROCESSING_INSTRUCTION182_tree);
            }
            LPARSi183=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_piTest2356); if (failed) return retval;
            // etc/XQFT.g:421:53: ( ncNameorKeyword | StringLiteral )?
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
                    // etc/XQFT.g:421:54: ncNameorKeyword
                    {
                    pushFollow(FOLLOW_ncNameorKeyword_in_piTest2360);
                    ncNameorKeyword184=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword184.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:421:72: StringLiteral
                    {
                    StringLiteral185=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_piTest2364); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral185_tree = (XQFTTree)adaptor.create(StringLiteral185);
                    adaptor.addChild(root_0, StringLiteral185_tree);
                    }

                    }
                    break;

            }

            RPARSi186=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_piTest2368); if (failed) return retval;

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
    // etc/XQFT.g:422:13: commentTest : COMMENT LPARSi RPARSi ;
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
            // etc/XQFT.g:422:25: ( COMMENT LPARSi RPARSi )
            // etc/XQFT.g:422:27: COMMENT LPARSi RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            COMMENT187=(Token)input.LT(1);
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest2388); if (failed) return retval;
            if ( backtracking==0 ) {
            COMMENT187_tree = (XQFTTree)adaptor.create(COMMENT187);
            adaptor.addChild(root_0, COMMENT187_tree);
            }
            LPARSi188=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_commentTest2390); if (failed) return retval;
            RPARSi189=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_commentTest2393); if (failed) return retval;

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
    // etc/XQFT.g:423:13: textTest : TEXT LPARSi RPARSi ;
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
            // etc/XQFT.g:423:22: ( TEXT LPARSi RPARSi )
            // etc/XQFT.g:423:24: TEXT LPARSi RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            TEXT190=(Token)input.LT(1);
            match(input,TEXT,FOLLOW_TEXT_in_textTest2413); if (failed) return retval;
            if ( backtracking==0 ) {
            TEXT190_tree = (XQFTTree)adaptor.create(TEXT190);
            adaptor.addChild(root_0, TEXT190_tree);
            }
            LPARSi191=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_textTest2415); if (failed) return retval;
            RPARSi192=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_textTest2418); if (failed) return retval;

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
    // etc/XQFT.g:424:13: anyKindTest : NODE LPARSi RPARSi ;
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
            // etc/XQFT.g:424:25: ( NODE LPARSi RPARSi )
            // etc/XQFT.g:424:27: NODE LPARSi RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            NODE193=(Token)input.LT(1);
            match(input,NODE,FOLLOW_NODE_in_anyKindTest2438); if (failed) return retval;
            if ( backtracking==0 ) {
            NODE193_tree = (XQFTTree)adaptor.create(NODE193);
            adaptor.addChild(root_0, NODE193_tree);
            }
            LPARSi194=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_anyKindTest2440); if (failed) return retval;
            RPARSi195=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_anyKindTest2443); if (failed) return retval;

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
    // etc/XQFT.g:425:5: occurrenceIndicator : ( QUESTIONSi | STARSi | PLUSSi );
    public final occurrenceIndicator_return occurrenceIndicator() throws RecognitionException {
        occurrenceIndicator_return retval = new occurrenceIndicator_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set196=null;

        XQFTTree set196_tree=null;

        try {
            // etc/XQFT.g:425:25: ( QUESTIONSi | STARSi | PLUSSi )
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
    // etc/XQFT.g:429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );
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
            // etc/XQFT.g:429:12: ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr )
            int alt39=5;
            switch ( input.LA(1) ) {
            case IF:
                {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==LPARSi) ) {
                    int LA39_39 = input.LA(3);

                    if ( (synpred3()) ) {
                        alt39=1;
                    }
                    else if ( (true) ) {
                        alt39=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 39, input);

                        throw nvae;
                    }
                }
                else if ( (LA39_1==EOF||LA39_1==AND||LA39_1==ASCENDING||(LA39_1>=CASE && LA39_1<=CASTABLE)||LA39_1==COLLATION||LA39_1==DEFAULT||LA39_1==DESCENDING||LA39_1==DIV||LA39_1==ELSE||LA39_1==EMPTY||LA39_1==EQ||LA39_1==EXCEPT||LA39_1==FOR||LA39_1==FTCONTAINS||LA39_1==GE||(LA39_1>=GT && LA39_1<=IDIV)||(LA39_1>=INSTANCE && LA39_1<=IS)||LA39_1==LE||LA39_1==LET||(LA39_1>=LT && LA39_1<=MOD)||LA39_1==NE||(LA39_1>=OR && LA39_1<=ORDER)||LA39_1==RETURN||LA39_1==SATISFIES||LA39_1==STABLE||(LA39_1>=TO && LA39_1<=TREAT)||LA39_1==UNION||LA39_1==WHERE||(LA39_1>=SEMICOLONSi && LA39_1<=COMMASi)||LA39_1==RPARSi||LA39_1==RBRACSi||(LA39_1>=STARSi && LA39_1<=NODEAFTERSi)||(LA39_1>=SLASHSi && LA39_1<=DBLSLASHSi)||LA39_1==COLONSi||(LA39_1>=LBRACKSi && LA39_1<=RBRACKSi)) ) {
                    alt39=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 1, input);

                    throw nvae;
                }
                }
                break;
            case TYPESWITCH:
                {
                int LA39_2 = input.LA(2);

                if ( (LA39_2==LPARSi) ) {
                    int LA39_78 = input.LA(3);

                    if ( (synpred4()) ) {
                        alt39=2;
                    }
                    else if ( (true) ) {
                        alt39=5;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 78, input);

                        throw nvae;
                    }
                }
                else if ( (LA39_2==EOF||LA39_2==AND||LA39_2==ASCENDING||(LA39_2>=CASE && LA39_2<=CASTABLE)||LA39_2==COLLATION||LA39_2==DEFAULT||LA39_2==DESCENDING||LA39_2==DIV||LA39_2==ELSE||LA39_2==EMPTY||LA39_2==EQ||LA39_2==EXCEPT||LA39_2==FOR||LA39_2==FTCONTAINS||LA39_2==GE||(LA39_2>=GT && LA39_2<=IDIV)||(LA39_2>=INSTANCE && LA39_2<=IS)||LA39_2==LE||LA39_2==LET||(LA39_2>=LT && LA39_2<=MOD)||LA39_2==NE||(LA39_2>=OR && LA39_2<=ORDER)||LA39_2==RETURN||LA39_2==SATISFIES||LA39_2==STABLE||(LA39_2>=TO && LA39_2<=TREAT)||LA39_2==UNION||LA39_2==WHERE||(LA39_2>=SEMICOLONSi && LA39_2<=COMMASi)||LA39_2==RPARSi||LA39_2==RBRACSi||(LA39_2>=STARSi && LA39_2<=NODEAFTERSi)||(LA39_2>=SLASHSi && LA39_2<=DBLSLASHSi)||LA39_2==COLONSi||(LA39_2>=LBRACKSi && LA39_2<=RBRACKSi)) ) {
                    alt39=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 2, input);

                    throw nvae;
                }
                }
                break;
            case FOR:
                {
                int LA39_3 = input.LA(2);

                if ( (LA39_3==DOLLARSi) ) {
                    alt39=3;
                }
                else if ( (LA39_3==EOF||LA39_3==AND||LA39_3==ASCENDING||(LA39_3>=CASE && LA39_3<=CASTABLE)||LA39_3==COLLATION||LA39_3==DEFAULT||LA39_3==DESCENDING||LA39_3==DIV||LA39_3==ELSE||LA39_3==EMPTY||LA39_3==EQ||LA39_3==EXCEPT||LA39_3==FOR||LA39_3==FTCONTAINS||LA39_3==GE||(LA39_3>=GT && LA39_3<=IDIV)||(LA39_3>=INSTANCE && LA39_3<=IS)||LA39_3==LE||LA39_3==LET||(LA39_3>=LT && LA39_3<=MOD)||LA39_3==NE||(LA39_3>=OR && LA39_3<=ORDER)||LA39_3==RETURN||LA39_3==SATISFIES||LA39_3==STABLE||(LA39_3>=TO && LA39_3<=TREAT)||LA39_3==UNION||LA39_3==WHERE||(LA39_3>=SEMICOLONSi && LA39_3<=COMMASi)||(LA39_3>=LPARSi && LA39_3<=RPARSi)||LA39_3==RBRACSi||(LA39_3>=STARSi && LA39_3<=NODEAFTERSi)||(LA39_3>=SLASHSi && LA39_3<=DBLSLASHSi)||LA39_3==COLONSi||(LA39_3>=LBRACKSi && LA39_3<=RBRACKSi)) ) {
                    alt39=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 3, input);

                    throw nvae;
                }
                }
                break;
            case LET:
                {
                int LA39_4 = input.LA(2);

                if ( (LA39_4==EOF||LA39_4==AND||LA39_4==ASCENDING||(LA39_4>=CASE && LA39_4<=CASTABLE)||LA39_4==COLLATION||LA39_4==DEFAULT||LA39_4==DESCENDING||LA39_4==DIV||LA39_4==ELSE||LA39_4==EMPTY||LA39_4==EQ||LA39_4==EXCEPT||LA39_4==FOR||LA39_4==FTCONTAINS||LA39_4==GE||(LA39_4>=GT && LA39_4<=IDIV)||(LA39_4>=INSTANCE && LA39_4<=IS)||LA39_4==LE||LA39_4==LET||(LA39_4>=LT && LA39_4<=MOD)||LA39_4==NE||(LA39_4>=OR && LA39_4<=ORDER)||LA39_4==RETURN||LA39_4==SATISFIES||LA39_4==STABLE||(LA39_4>=TO && LA39_4<=TREAT)||LA39_4==UNION||LA39_4==WHERE||(LA39_4>=SEMICOLONSi && LA39_4<=COMMASi)||(LA39_4>=LPARSi && LA39_4<=RPARSi)||LA39_4==RBRACSi||(LA39_4>=STARSi && LA39_4<=NODEAFTERSi)||(LA39_4>=SLASHSi && LA39_4<=DBLSLASHSi)||LA39_4==COLONSi||(LA39_4>=LBRACKSi && LA39_4<=RBRACKSi)) ) {
                    alt39=5;
                }
                else if ( (LA39_4==SCORE||LA39_4==DOLLARSi) ) {
                    alt39=3;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 4, input);

                    throw nvae;
                }
                }
                break;
            case SOME:
                {
                int LA39_5 = input.LA(2);

                if ( (LA39_5==EOF||LA39_5==AND||LA39_5==ASCENDING||(LA39_5>=CASE && LA39_5<=CASTABLE)||LA39_5==COLLATION||LA39_5==DEFAULT||LA39_5==DESCENDING||LA39_5==DIV||LA39_5==ELSE||LA39_5==EMPTY||LA39_5==EQ||LA39_5==EXCEPT||LA39_5==FOR||LA39_5==FTCONTAINS||LA39_5==GE||(LA39_5>=GT && LA39_5<=IDIV)||(LA39_5>=INSTANCE && LA39_5<=IS)||LA39_5==LE||LA39_5==LET||(LA39_5>=LT && LA39_5<=MOD)||LA39_5==NE||(LA39_5>=OR && LA39_5<=ORDER)||LA39_5==RETURN||LA39_5==SATISFIES||LA39_5==STABLE||(LA39_5>=TO && LA39_5<=TREAT)||LA39_5==UNION||LA39_5==WHERE||(LA39_5>=SEMICOLONSi && LA39_5<=COMMASi)||(LA39_5>=LPARSi && LA39_5<=RPARSi)||LA39_5==RBRACSi||(LA39_5>=STARSi && LA39_5<=NODEAFTERSi)||(LA39_5>=SLASHSi && LA39_5<=DBLSLASHSi)||LA39_5==COLONSi||(LA39_5>=LBRACKSi && LA39_5<=RBRACKSi)) ) {
                    alt39=5;
                }
                else if ( (LA39_5==DOLLARSi) ) {
                    alt39=4;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 5, input);

                    throw nvae;
                }
                }
                break;
            case EVERY:
                {
                int LA39_6 = input.LA(2);

                if ( (LA39_6==EOF||LA39_6==AND||LA39_6==ASCENDING||(LA39_6>=CASE && LA39_6<=CASTABLE)||LA39_6==COLLATION||LA39_6==DEFAULT||LA39_6==DESCENDING||LA39_6==DIV||LA39_6==ELSE||LA39_6==EMPTY||LA39_6==EQ||LA39_6==EXCEPT||LA39_6==FOR||LA39_6==FTCONTAINS||LA39_6==GE||(LA39_6>=GT && LA39_6<=IDIV)||(LA39_6>=INSTANCE && LA39_6<=IS)||LA39_6==LE||LA39_6==LET||(LA39_6>=LT && LA39_6<=MOD)||LA39_6==NE||(LA39_6>=OR && LA39_6<=ORDER)||LA39_6==RETURN||LA39_6==SATISFIES||LA39_6==STABLE||(LA39_6>=TO && LA39_6<=TREAT)||LA39_6==UNION||LA39_6==WHERE||(LA39_6>=SEMICOLONSi && LA39_6<=COMMASi)||(LA39_6>=LPARSi && LA39_6<=RPARSi)||LA39_6==RBRACSi||(LA39_6>=STARSi && LA39_6<=NODEAFTERSi)||(LA39_6>=SLASHSi && LA39_6<=DBLSLASHSi)||LA39_6==COLONSi||(LA39_6>=LBRACKSi && LA39_6<=RBRACKSi)) ) {
                    alt39=5;
                }
                else if ( (LA39_6==DOLLARSi) ) {
                    alt39=4;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 6, input);

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
            case QName:
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
                    new NoViableAltException("429:1: exprSingle : ( ( IF LPARSi )=> ifExpr | ( TYPESWITCH LPARSi )=> typeswitchExpr | fLWORExpr | quantifiedExpr | orExpr );", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // etc/XQFT.g:430:5: ( IF LPARSi )=> ifExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ifExpr_in_exprSingle2491);
                    ifExpr197=ifExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ifExpr197.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:431:7: ( TYPESWITCH LPARSi )=> typeswitchExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle2507);
                    typeswitchExpr198=typeswitchExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeswitchExpr198.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:432:7: fLWORExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle2515);
                    fLWORExpr199=fLWORExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, fLWORExpr199.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:433:7: quantifiedExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle2523);
                    quantifiedExpr200=quantifiedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, quantifiedExpr200.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:434:7: orExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_orExpr_in_exprSingle2531);
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
    // etc/XQFT.g:436:5: fLWORExpr : (fc+= forClause | lc+= letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle -> ^( AST_FLWOR ( $fc)* ( $lc)* ( whereClause )? ( orderByClause )? exprSingle ) ;
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
            // etc/XQFT.g:436:15: ( (fc+= forClause | lc+= letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle -> ^( AST_FLWOR ( $fc)* ( $lc)* ( whereClause )? ( orderByClause )? exprSingle ) )
            // etc/XQFT.g:436:17: (fc+= forClause | lc+= letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:436:17: (fc+= forClause | lc+= letClause )+
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
            	    // etc/XQFT.g:436:18: fc+= forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr2546);
            	    fc=forClause();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_forClause.add(fc.getTree());
            	    if (list_fc==null) list_fc=new ArrayList();
            	    list_fc.add(fc);


            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:436:34: lc+= letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr2552);
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

            // etc/XQFT.g:436:50: ( whereClause )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // etc/XQFT.g:436:50: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr2556);
                    whereClause202=whereClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_whereClause.add(whereClause202.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:436:63: ( orderByClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ORDER||LA42_0==STABLE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // etc/XQFT.g:436:63: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr2559);
                    orderByClause203=orderByClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_orderByClause.add(orderByClause203.getTree());

                    }
                    break;

            }

            RETURN204=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr2562); if (failed) return retval;
            if ( backtracking==0 ) stream_RETURN.add(RETURN204);

            pushFollow(FOLLOW_exprSingle_in_fLWORExpr2564);
            exprSingle205=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle205.getTree());

            // AST REWRITE
            // elements: exprSingle, lc, fc, whereClause, orderByClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: fc, lc
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_fc=new RewriteRuleSubtreeStream(adaptor,"token fc",list_fc);
            RewriteRuleSubtreeStream stream_lc=new RewriteRuleSubtreeStream(adaptor,"token lc",list_lc);
            root_0 = (XQFTTree)adaptor.nil();
            // 437:9: -> ^( AST_FLWOR ( $fc)* ( $lc)* ( whereClause )? ( orderByClause )? exprSingle )
            {
                // etc/XQFT.g:437:12: ^( AST_FLWOR ( $fc)* ( $lc)* ( whereClause )? ( orderByClause )? exprSingle )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_FLWOR, "AST_FLWOR"), root_1);

                // etc/XQFT.g:437:24: ( $fc)*
                while ( stream_fc.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_fc.next()).getTree());

                }
                stream_fc.reset();
                // etc/XQFT.g:437:29: ( $lc)*
                while ( stream_lc.hasNext() ) {
                    adaptor.addChild(root_1, ((ParserRuleReturnScope)stream_lc.next()).getTree());

                }
                stream_lc.reset();
                // etc/XQFT.g:437:34: ( whereClause )?
                if ( stream_whereClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_whereClause.next());

                }
                stream_whereClause.reset();
                // etc/XQFT.g:437:47: ( orderByClause )?
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
    // etc/XQFT.g:439:9: forClause : FOR forClauseTupletDef ( COMMASi forClauseTupletDef )* -> ^( AST_FORCLAUSE ( forClauseTupletDef )+ ) ;
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
            // etc/XQFT.g:439:19: ( FOR forClauseTupletDef ( COMMASi forClauseTupletDef )* -> ^( AST_FORCLAUSE ( forClauseTupletDef )+ ) )
            // etc/XQFT.g:439:21: FOR forClauseTupletDef ( COMMASi forClauseTupletDef )*
            {
            FOR206=(Token)input.LT(1);
            match(input,FOR,FOLLOW_FOR_in_forClause2614); if (failed) return retval;
            if ( backtracking==0 ) stream_FOR.add(FOR206);

            pushFollow(FOLLOW_forClauseTupletDef_in_forClause2616);
            forClauseTupletDef207=forClauseTupletDef();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_forClauseTupletDef.add(forClauseTupletDef207.getTree());
            // etc/XQFT.g:439:44: ( COMMASi forClauseTupletDef )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==COMMASi) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // etc/XQFT.g:439:45: COMMASi forClauseTupletDef
            	    {
            	    COMMASi208=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause2619); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi208);

            	    pushFollow(FOLLOW_forClauseTupletDef_in_forClause2621);
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
            // 440:13: -> ^( AST_FORCLAUSE ( forClauseTupletDef )+ )
            {
                // etc/XQFT.g:440:16: ^( AST_FORCLAUSE ( forClauseTupletDef )+ )
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
    // etc/XQFT.g:442:13: forClauseTupletDef : DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ;
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
            // etc/XQFT.g:442:32: ( DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )
            // etc/XQFT.g:442:34: DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOLLARSi210=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClauseTupletDef2664); if (failed) return retval;
            pushFollow(FOLLOW_varName_in_forClauseTupletDef2667);
            varName211=varName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, varName211.getTree());
            // etc/XQFT.g:442:52: ( typeDeclaration )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AS) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // etc/XQFT.g:442:52: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClauseTupletDef2669);
                    typeDeclaration212=typeDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, typeDeclaration212.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:442:69: ( positionalVar )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==AT) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:442:69: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClauseTupletDef2672);
                    positionalVar213=positionalVar();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, positionalVar213.getTree());

                    }
                    break;

            }

            // etc/XQFT.g:442:84: ( ftScoreVar )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==SCORE) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // etc/XQFT.g:442:84: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClauseTupletDef2675);
                    ftScoreVar214=ftScoreVar();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftScoreVar214.getTree());

                    }
                    break;

            }

            IN215=(Token)input.LT(1);
            match(input,IN,FOLLOW_IN_in_forClauseTupletDef2678); if (failed) return retval;
            pushFollow(FOLLOW_exprSingle_in_forClauseTupletDef2681);
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
    // etc/XQFT.g:444:13: varName returns [String name] : qn= qName ;
    public final varName_return varName() throws RecognitionException {
        varName_return retval = new varName_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qn = null;



        try {
            // etc/XQFT.g:444:43: (qn= qName )
            // etc/XQFT.g:444:45: qn= qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_varName2707);
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
    // etc/XQFT.g:445:13: positionalVar : AT DOLLARSi varName ;
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
            // etc/XQFT.g:445:27: ( AT DOLLARSi varName )
            // etc/XQFT.g:445:29: AT DOLLARSi varName
            {
            root_0 = (XQFTTree)adaptor.nil();

            AT217=(Token)input.LT(1);
            match(input,AT,FOLLOW_AT_in_positionalVar2728); if (failed) return retval;
            if ( backtracking==0 ) {
            AT217_tree = (XQFTTree)adaptor.create(AT217);
            adaptor.addChild(root_0, AT217_tree);
            }
            DOLLARSi218=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar2730); if (failed) return retval;
            if ( backtracking==0 ) {
            DOLLARSi218_tree = (XQFTTree)adaptor.create(DOLLARSi218);
            adaptor.addChild(root_0, DOLLARSi218_tree);
            }
            pushFollow(FOLLOW_varName_in_positionalVar2732);
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
    // etc/XQFT.g:446:13: ftScoreVar : SCORE DOLLARSi varName ;
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
            // etc/XQFT.g:446:24: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:446:26: SCORE DOLLARSi varName
            {
            root_0 = (XQFTTree)adaptor.nil();

            SCORE220=(Token)input.LT(1);
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar2751); if (failed) return retval;
            if ( backtracking==0 ) {
            SCORE220_tree = (XQFTTree)adaptor.create(SCORE220);
            adaptor.addChild(root_0, SCORE220_tree);
            }
            DOLLARSi221=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar2753); if (failed) return retval;
            if ( backtracking==0 ) {
            DOLLARSi221_tree = (XQFTTree)adaptor.create(DOLLARSi221);
            adaptor.addChild(root_0, DOLLARSi221_tree);
            }
            pushFollow(FOLLOW_varName_in_ftScoreVar2755);
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
    // etc/XQFT.g:448:9: letClause : LET varBinding ( COMMASi varBinding )* -> ^( AST_LETCLAUSE ( varBinding )+ ) ;
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
            // etc/XQFT.g:448:19: ( LET varBinding ( COMMASi varBinding )* -> ^( AST_LETCLAUSE ( varBinding )+ ) )
            // etc/XQFT.g:448:21: LET varBinding ( COMMASi varBinding )*
            {
            LET223=(Token)input.LT(1);
            match(input,LET,FOLLOW_LET_in_letClause2783); if (failed) return retval;
            if ( backtracking==0 ) stream_LET.add(LET223);

            pushFollow(FOLLOW_varBinding_in_letClause2785);
            varBinding224=varBinding();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_varBinding.add(varBinding224.getTree());
            // etc/XQFT.g:448:36: ( COMMASi varBinding )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==COMMASi) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // etc/XQFT.g:448:37: COMMASi varBinding
            	    {
            	    COMMASi225=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause2788); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi225);

            	    pushFollow(FOLLOW_varBinding_in_letClause2790);
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
            // 449:13: -> ^( AST_LETCLAUSE ( varBinding )+ )
            {
                // etc/XQFT.g:449:16: ^( AST_LETCLAUSE ( varBinding )+ )
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
    // etc/XQFT.g:451:9: varBinding : ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle -> ( SCORE )? $v ( typeDeclaration )? exprSingle ;
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
            // etc/XQFT.g:451:20: ( ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle -> ( SCORE )? $v ( typeDeclaration )? exprSingle )
            // etc/XQFT.g:452:13: ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName ) ASSIGNSi exprSingle
            {
            // etc/XQFT.g:452:13: ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName )
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
                    new NoViableAltException("452:13: ( DOLLARSi v= varName ( typeDeclaration )? | SCORE DOLLARSi v= varName )", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // etc/XQFT.g:452:14: DOLLARSi v= varName ( typeDeclaration )?
                    {
                    DOLLARSi227=(Token)input.LT(1);
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding2842); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi227);

                    pushFollow(FOLLOW_varName_in_varBinding2846);
                    v=varName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_varName.add(v.getTree());
                    // etc/XQFT.g:452:33: ( typeDeclaration )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==AS) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // etc/XQFT.g:452:33: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_varBinding2848);
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
                    // etc/XQFT.g:452:52: SCORE DOLLARSi v= varName
                    {
                    SCORE229=(Token)input.LT(1);
                    match(input,SCORE,FOLLOW_SCORE_in_varBinding2853); if (failed) return retval;
                    if ( backtracking==0 ) stream_SCORE.add(SCORE229);

                    DOLLARSi230=(Token)input.LT(1);
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding2855); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi230);

                    pushFollow(FOLLOW_varName_in_varBinding2859);
                    v=varName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_varName.add(v.getTree());

                    }
                    break;

            }

            ASSIGNSi231=(Token)input.LT(1);
            match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varBinding2875); if (failed) return retval;
            if ( backtracking==0 ) stream_ASSIGNSi.add(ASSIGNSi231);

            pushFollow(FOLLOW_exprSingle_in_varBinding2877);
            exprSingle232=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle232.getTree());

            // AST REWRITE
            // elements: exprSingle, v, typeDeclaration, SCORE
            // token labels: 
            // rule labels: retval, v
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_v=new RewriteRuleSubtreeStream(adaptor,"token v",v!=null?v.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 454:13: -> ( SCORE )? $v ( typeDeclaration )? exprSingle
            {
                // etc/XQFT.g:454:16: ( SCORE )?
                if ( stream_SCORE.hasNext() ) {
                    adaptor.addChild(root_0, stream_SCORE.next());

                }
                stream_SCORE.reset();
                adaptor.addChild(root_0, stream_v.next());
                // etc/XQFT.g:454:26: ( typeDeclaration )?
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
    // etc/XQFT.g:457:9: whereClause : WHERE exprSingle -> ^( AST_WHERECLAUSE exprSingle ) ;
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
            // etc/XQFT.g:457:21: ( WHERE exprSingle -> ^( AST_WHERECLAUSE exprSingle ) )
            // etc/XQFT.g:457:23: WHERE exprSingle
            {
            WHERE233=(Token)input.LT(1);
            match(input,WHERE,FOLLOW_WHERE_in_whereClause2927); if (failed) return retval;
            if ( backtracking==0 ) stream_WHERE.add(WHERE233);

            pushFollow(FOLLOW_exprSingle_in_whereClause2929);
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
            // 458:13: -> ^( AST_WHERECLAUSE exprSingle )
            {
                // etc/XQFT.g:458:16: ^( AST_WHERECLAUSE exprSingle )
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
    // etc/XQFT.g:460:9: orderByClause : ( ORDER BY | STABLE ORDER BY ) orderSpecList -> ^( AST_ORDERBYCLAUSE ( STABLE )? orderSpecList ) ;
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
            // etc/XQFT.g:460:23: ( ( ORDER BY | STABLE ORDER BY ) orderSpecList -> ^( AST_ORDERBYCLAUSE ( STABLE )? orderSpecList ) )
            // etc/XQFT.g:460:25: ( ORDER BY | STABLE ORDER BY ) orderSpecList
            {
            // etc/XQFT.g:460:25: ( ORDER BY | STABLE ORDER BY )
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
                    new NoViableAltException("460:25: ( ORDER BY | STABLE ORDER BY )", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // etc/XQFT.g:460:26: ORDER BY
                    {
                    ORDER235=(Token)input.LT(1);
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause2978); if (failed) return retval;
                    if ( backtracking==0 ) stream_ORDER.add(ORDER235);

                    BY236=(Token)input.LT(1);
                    match(input,BY,FOLLOW_BY_in_orderByClause2980); if (failed) return retval;
                    if ( backtracking==0 ) stream_BY.add(BY236);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:460:37: STABLE ORDER BY
                    {
                    STABLE237=(Token)input.LT(1);
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause2984); if (failed) return retval;
                    if ( backtracking==0 ) stream_STABLE.add(STABLE237);

                    ORDER238=(Token)input.LT(1);
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause2986); if (failed) return retval;
                    if ( backtracking==0 ) stream_ORDER.add(ORDER238);

                    BY239=(Token)input.LT(1);
                    match(input,BY,FOLLOW_BY_in_orderByClause2988); if (failed) return retval;
                    if ( backtracking==0 ) stream_BY.add(BY239);


                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause2991);
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
            // 461:13: -> ^( AST_ORDERBYCLAUSE ( STABLE )? orderSpecList )
            {
                // etc/XQFT.g:461:16: ^( AST_ORDERBYCLAUSE ( STABLE )? orderSpecList )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_ORDERBYCLAUSE, "AST_ORDERBYCLAUSE"), root_1);

                // etc/XQFT.g:461:36: ( STABLE )?
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
    // etc/XQFT.g:463:13: orderSpecList : orderSpec ( COMMASi orderSpec )* -> ( orderSpec )+ ;
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
            // etc/XQFT.g:463:27: ( orderSpec ( COMMASi orderSpec )* -> ( orderSpec )+ )
            // etc/XQFT.g:463:29: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList3034);
            orderSpec241=orderSpec();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_orderSpec.add(orderSpec241.getTree());
            // etc/XQFT.g:463:39: ( COMMASi orderSpec )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==COMMASi) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // etc/XQFT.g:463:40: COMMASi orderSpec
            	    {
            	    COMMASi242=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList3037); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi242);

            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList3039);
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
            // 464:17: -> ( orderSpec )+
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
    // etc/XQFT.g:466:17: orderSpec : exprSingle orderModifier ;
    public final orderSpec_return orderSpec() throws RecognitionException {
        orderSpec_return retval = new orderSpec_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        exprSingle_return exprSingle244 = null;

        orderModifier_return orderModifier245 = null;



        try {
            // etc/XQFT.g:466:27: ( exprSingle orderModifier )
            // etc/XQFT.g:466:29: exprSingle orderModifier
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_exprSingle_in_orderSpec3086);
            exprSingle244=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, exprSingle244.getTree());
            pushFollow(FOLLOW_orderModifier_in_orderSpec3088);
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
    // etc/XQFT.g:467:21: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
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
            // etc/XQFT.g:467:35: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:467:37: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:467:37: ( ASCENDING | DESCENDING )?
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3115);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:467:63: ( EMPTY ( GREATEST | LEAST ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EMPTY) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // etc/XQFT.g:467:64: EMPTY ( GREATEST | LEAST )
                    {
                    EMPTY247=(Token)input.LT(1);
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier3125); if (failed) return retval;
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3127);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:467:91: ( COLLATION uriLiteral )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==COLLATION) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // etc/XQFT.g:467:92: COLLATION uriLiteral
                    {
                    COLLATION249=(Token)input.LT(1);
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier3138); if (failed) return retval;
                    if ( backtracking==0 ) {
                    COLLATION249_tree = (XQFTTree)adaptor.create(COLLATION249);
                    adaptor.addChild(root_0, COLLATION249_tree);
                    }
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier3140);
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
    // etc/XQFT.g:469:5: quantifiedExpr : (quant= SOME | quant= EVERY ) quantifiedExprTupleDef ( COMMASi quantifiedExprTupleDef )* SATISFIES exprSingle -> ^( AST_QUANTIFIEDEXPR $quant ( quantifiedExprTupleDef )+ exprSingle ) ;
    public final quantifiedExpr_return quantifiedExpr() throws RecognitionException {
        quantifiedExpr_return retval = new quantifiedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token quant=null;
        Token COMMASi252=null;
        Token SATISFIES254=null;
        quantifiedExprTupleDef_return quantifiedExprTupleDef251 = null;

        quantifiedExprTupleDef_return quantifiedExprTupleDef253 = null;

        exprSingle_return exprSingle255 = null;


        XQFTTree quant_tree=null;
        XQFTTree COMMASi252_tree=null;
        XQFTTree SATISFIES254_tree=null;
        RewriteRuleTokenStream stream_SOME=new RewriteRuleTokenStream(adaptor,"token SOME");
        RewriteRuleTokenStream stream_SATISFIES=new RewriteRuleTokenStream(adaptor,"token SATISFIES");
        RewriteRuleTokenStream stream_COMMASi=new RewriteRuleTokenStream(adaptor,"token COMMASi");
        RewriteRuleTokenStream stream_EVERY=new RewriteRuleTokenStream(adaptor,"token EVERY");
        RewriteRuleSubtreeStream stream_quantifiedExprTupleDef=new RewriteRuleSubtreeStream(adaptor,"rule quantifiedExprTupleDef");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:469:20: ( (quant= SOME | quant= EVERY ) quantifiedExprTupleDef ( COMMASi quantifiedExprTupleDef )* SATISFIES exprSingle -> ^( AST_QUANTIFIEDEXPR $quant ( quantifiedExprTupleDef )+ exprSingle ) )
            // etc/XQFT.g:470:9: (quant= SOME | quant= EVERY ) quantifiedExprTupleDef ( COMMASi quantifiedExprTupleDef )* SATISFIES exprSingle
            {
            // etc/XQFT.g:470:9: (quant= SOME | quant= EVERY )
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
                    new NoViableAltException("470:9: (quant= SOME | quant= EVERY )", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // etc/XQFT.g:470:10: quant= SOME
                    {
                    quant=(Token)input.LT(1);
                    match(input,SOME,FOLLOW_SOME_in_quantifiedExpr3166); if (failed) return retval;
                    if ( backtracking==0 ) stream_SOME.add(quant);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:470:23: quant= EVERY
                    {
                    quant=(Token)input.LT(1);
                    match(input,EVERY,FOLLOW_EVERY_in_quantifiedExpr3172); if (failed) return retval;
                    if ( backtracking==0 ) stream_EVERY.add(quant);


                    }
                    break;

            }

            pushFollow(FOLLOW_quantifiedExprTupleDef_in_quantifiedExpr3175);
            quantifiedExprTupleDef251=quantifiedExprTupleDef();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_quantifiedExprTupleDef.add(quantifiedExprTupleDef251.getTree());
            // etc/XQFT.g:471:9: ( COMMASi quantifiedExprTupleDef )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==COMMASi) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // etc/XQFT.g:471:10: COMMASi quantifiedExprTupleDef
            	    {
            	    COMMASi252=(Token)input.LT(1);
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr3186); if (failed) return retval;
            	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi252);

            	    pushFollow(FOLLOW_quantifiedExprTupleDef_in_quantifiedExpr3188);
            	    quantifiedExprTupleDef253=quantifiedExprTupleDef();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_quantifiedExprTupleDef.add(quantifiedExprTupleDef253.getTree());

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            SATISFIES254=(Token)input.LT(1);
            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr3192); if (failed) return retval;
            if ( backtracking==0 ) stream_SATISFIES.add(SATISFIES254);

            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3194);
            exprSingle255=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle255.getTree());

            // AST REWRITE
            // elements: exprSingle, quantifiedExprTupleDef, quant
            // token labels: quant
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_quant=new RewriteRuleTokenStream(adaptor,"token quant",quant);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 472:9: -> ^( AST_QUANTIFIEDEXPR $quant ( quantifiedExprTupleDef )+ exprSingle )
            {
                // etc/XQFT.g:472:12: ^( AST_QUANTIFIEDEXPR $quant ( quantifiedExprTupleDef )+ exprSingle )
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
    // etc/XQFT.g:475:9: quantifiedExprTupleDef : DOLLARSi varName ( typeDeclaration )? IN exprSingle -> varName ( typeDeclaration )? exprSingle ;
    public final quantifiedExprTupleDef_return quantifiedExprTupleDef() throws RecognitionException {
        quantifiedExprTupleDef_return retval = new quantifiedExprTupleDef_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOLLARSi256=null;
        Token IN259=null;
        varName_return varName257 = null;

        typeDeclaration_return typeDeclaration258 = null;

        exprSingle_return exprSingle260 = null;


        XQFTTree DOLLARSi256_tree=null;
        XQFTTree IN259_tree=null;
        RewriteRuleTokenStream stream_DOLLARSi=new RewriteRuleTokenStream(adaptor,"token DOLLARSi");
        RewriteRuleTokenStream stream_IN=new RewriteRuleTokenStream(adaptor,"token IN");
        RewriteRuleSubtreeStream stream_varName=new RewriteRuleSubtreeStream(adaptor,"rule varName");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        RewriteRuleSubtreeStream stream_typeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule typeDeclaration");
        try {
            // etc/XQFT.g:475:32: ( DOLLARSi varName ( typeDeclaration )? IN exprSingle -> varName ( typeDeclaration )? exprSingle )
            // etc/XQFT.g:476:13: DOLLARSi varName ( typeDeclaration )? IN exprSingle
            {
            DOLLARSi256=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExprTupleDef3250); if (failed) return retval;
            if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi256);

            pushFollow(FOLLOW_varName_in_quantifiedExprTupleDef3252);
            varName257=varName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_varName.add(varName257.getTree());
            // etc/XQFT.g:476:30: ( typeDeclaration )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==AS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // etc/XQFT.g:476:30: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExprTupleDef3254);
                    typeDeclaration258=typeDeclaration();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_typeDeclaration.add(typeDeclaration258.getTree());

                    }
                    break;

            }

            IN259=(Token)input.LT(1);
            match(input,IN,FOLLOW_IN_in_quantifiedExprTupleDef3257); if (failed) return retval;
            if ( backtracking==0 ) stream_IN.add(IN259);

            pushFollow(FOLLOW_exprSingle_in_quantifiedExprTupleDef3259);
            exprSingle260=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle260.getTree());

            // AST REWRITE
            // elements: exprSingle, varName, typeDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 477:13: -> varName ( typeDeclaration )? exprSingle
            {
                adaptor.addChild(root_0, stream_varName.next());
                // etc/XQFT.g:477:24: ( typeDeclaration )?
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
    // etc/XQFT.g:479:5: typeswitchExpr : TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle -> ^( AST_TYPESWITCHEXPR expr ( caseClause )+ ( varName )? exprSingle ) ;
    public final typeswitchExpr_return typeswitchExpr() throws RecognitionException {
        typeswitchExpr_return retval = new typeswitchExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TYPESWITCH261=null;
        Token LPARSi262=null;
        Token RPARSi264=null;
        Token DEFAULT266=null;
        Token DOLLARSi267=null;
        Token RETURN269=null;
        expr_return expr263 = null;

        caseClause_return caseClause265 = null;

        varName_return varName268 = null;

        exprSingle_return exprSingle270 = null;


        XQFTTree TYPESWITCH261_tree=null;
        XQFTTree LPARSi262_tree=null;
        XQFTTree RPARSi264_tree=null;
        XQFTTree DEFAULT266_tree=null;
        XQFTTree DOLLARSi267_tree=null;
        XQFTTree RETURN269_tree=null;
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
            // etc/XQFT.g:479:20: ( TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle -> ^( AST_TYPESWITCHEXPR expr ( caseClause )+ ( varName )? exprSingle ) )
            // etc/XQFT.g:479:22: TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            TYPESWITCH261=(Token)input.LT(1);
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr3294); if (failed) return retval;
            if ( backtracking==0 ) stream_TYPESWITCH.add(TYPESWITCH261);

            LPARSi262=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_typeswitchExpr3296); if (failed) return retval;
            if ( backtracking==0 ) stream_LPARSi.add(LPARSi262);

            pushFollow(FOLLOW_expr_in_typeswitchExpr3298);
            expr263=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expr.add(expr263.getTree());
            RPARSi264=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_typeswitchExpr3300); if (failed) return retval;
            if ( backtracking==0 ) stream_RPARSi.add(RPARSi264);

            // etc/XQFT.g:479:52: ( caseClause )+
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
            	    // etc/XQFT.g:479:52: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr3302);
            	    caseClause265=caseClause();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_caseClause.add(caseClause265.getTree());

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

            DEFAULT266=(Token)input.LT(1);
            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr3314); if (failed) return retval;
            if ( backtracking==0 ) stream_DEFAULT.add(DEFAULT266);

            // etc/XQFT.g:480:17: ( DOLLARSi varName )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==DOLLARSi) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // etc/XQFT.g:480:18: DOLLARSi varName
                    {
                    DOLLARSi267=(Token)input.LT(1);
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr3317); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi267);

                    pushFollow(FOLLOW_varName_in_typeswitchExpr3319);
                    varName268=varName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_varName.add(varName268.getTree());

                    }
                    break;

            }

            RETURN269=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr3323); if (failed) return retval;
            if ( backtracking==0 ) stream_RETURN.add(RETURN269);

            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr3325);
            exprSingle270=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle270.getTree());

            // AST REWRITE
            // elements: caseClause, varName, exprSingle, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 481:9: -> ^( AST_TYPESWITCHEXPR expr ( caseClause )+ ( varName )? exprSingle )
            {
                // etc/XQFT.g:481:12: ^( AST_TYPESWITCHEXPR expr ( caseClause )+ ( varName )? exprSingle )
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
                // etc/XQFT.g:481:50: ( varName )?
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
    // etc/XQFT.g:483:9: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle -> ^( AST_CASECLAUSE ( varName )? sequenceType exprSingle ) ;
    public final caseClause_return caseClause() throws RecognitionException {
        caseClause_return retval = new caseClause_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CASE271=null;
        Token DOLLARSi272=null;
        Token AS274=null;
        Token RETURN276=null;
        varName_return varName273 = null;

        sequenceType_return sequenceType275 = null;

        exprSingle_return exprSingle277 = null;


        XQFTTree CASE271_tree=null;
        XQFTTree DOLLARSi272_tree=null;
        XQFTTree AS274_tree=null;
        XQFTTree RETURN276_tree=null;
        RewriteRuleTokenStream stream_DOLLARSi=new RewriteRuleTokenStream(adaptor,"token DOLLARSi");
        RewriteRuleTokenStream stream_CASE=new RewriteRuleTokenStream(adaptor,"token CASE");
        RewriteRuleTokenStream stream_AS=new RewriteRuleTokenStream(adaptor,"token AS");
        RewriteRuleTokenStream stream_RETURN=new RewriteRuleTokenStream(adaptor,"token RETURN");
        RewriteRuleSubtreeStream stream_varName=new RewriteRuleSubtreeStream(adaptor,"rule varName");
        RewriteRuleSubtreeStream stream_sequenceType=new RewriteRuleSubtreeStream(adaptor,"rule sequenceType");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:483:20: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle -> ^( AST_CASECLAUSE ( varName )? sequenceType exprSingle ) )
            // etc/XQFT.g:483:22: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            CASE271=(Token)input.LT(1);
            match(input,CASE,FOLLOW_CASE_in_caseClause3365); if (failed) return retval;
            if ( backtracking==0 ) stream_CASE.add(CASE271);

            // etc/XQFT.g:483:27: ( DOLLARSi varName AS )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==DOLLARSi) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // etc/XQFT.g:483:28: DOLLARSi varName AS
                    {
                    DOLLARSi272=(Token)input.LT(1);
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause3368); if (failed) return retval;
                    if ( backtracking==0 ) stream_DOLLARSi.add(DOLLARSi272);

                    pushFollow(FOLLOW_varName_in_caseClause3370);
                    varName273=varName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_varName.add(varName273.getTree());
                    AS274=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_caseClause3372); if (failed) return retval;
                    if ( backtracking==0 ) stream_AS.add(AS274);


                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause3376);
            sequenceType275=sequenceType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_sequenceType.add(sequenceType275.getTree());
            RETURN276=(Token)input.LT(1);
            match(input,RETURN,FOLLOW_RETURN_in_caseClause3378); if (failed) return retval;
            if ( backtracking==0 ) stream_RETURN.add(RETURN276);

            pushFollow(FOLLOW_exprSingle_in_caseClause3380);
            exprSingle277=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle277.getTree());

            // AST REWRITE
            // elements: exprSingle, sequenceType, varName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 484:13: -> ^( AST_CASECLAUSE ( varName )? sequenceType exprSingle )
            {
                // etc/XQFT.g:484:16: ^( AST_CASECLAUSE ( varName )? sequenceType exprSingle )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_CASECLAUSE, "AST_CASECLAUSE"), root_1);

                // etc/XQFT.g:484:33: ( varName )?
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
    // etc/XQFT.g:487:5: ifExpr : IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle -> ^( AST_IFEXPR expr exprSingle exprSingle ) ;
    public final ifExpr_return ifExpr() throws RecognitionException {
        ifExpr_return retval = new ifExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token IF278=null;
        Token LPARSi279=null;
        Token RPARSi281=null;
        Token THEN282=null;
        Token ELSE284=null;
        expr_return expr280 = null;

        exprSingle_return exprSingle283 = null;

        exprSingle_return exprSingle285 = null;


        XQFTTree IF278_tree=null;
        XQFTTree LPARSi279_tree=null;
        XQFTTree RPARSi281_tree=null;
        XQFTTree THEN282_tree=null;
        XQFTTree ELSE284_tree=null;
        RewriteRuleTokenStream stream_THEN=new RewriteRuleTokenStream(adaptor,"token THEN");
        RewriteRuleTokenStream stream_RPARSi=new RewriteRuleTokenStream(adaptor,"token RPARSi");
        RewriteRuleTokenStream stream_LPARSi=new RewriteRuleTokenStream(adaptor,"token LPARSi");
        RewriteRuleTokenStream stream_ELSE=new RewriteRuleTokenStream(adaptor,"token ELSE");
        RewriteRuleTokenStream stream_IF=new RewriteRuleTokenStream(adaptor,"token IF");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:487:12: ( IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle -> ^( AST_IFEXPR expr exprSingle exprSingle ) )
            // etc/XQFT.g:487:14: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
            {
            IF278=(Token)input.LT(1);
            match(input,IF,FOLLOW_IF_in_ifExpr3426); if (failed) return retval;
            if ( backtracking==0 ) stream_IF.add(IF278);

            LPARSi279=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_ifExpr3428); if (failed) return retval;
            if ( backtracking==0 ) stream_LPARSi.add(LPARSi279);

            pushFollow(FOLLOW_expr_in_ifExpr3430);
            expr280=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expr.add(expr280.getTree());
            RPARSi281=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_ifExpr3432); if (failed) return retval;
            if ( backtracking==0 ) stream_RPARSi.add(RPARSi281);

            THEN282=(Token)input.LT(1);
            match(input,THEN,FOLLOW_THEN_in_ifExpr3434); if (failed) return retval;
            if ( backtracking==0 ) stream_THEN.add(THEN282);

            pushFollow(FOLLOW_exprSingle_in_ifExpr3436);
            exprSingle283=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle283.getTree());
            ELSE284=(Token)input.LT(1);
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr3438); if (failed) return retval;
            if ( backtracking==0 ) stream_ELSE.add(ELSE284);

            pushFollow(FOLLOW_exprSingle_in_ifExpr3440);
            exprSingle285=exprSingle();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_exprSingle.add(exprSingle285.getTree());

            // AST REWRITE
            // elements: exprSingle, expr, exprSingle
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 488:9: -> ^( AST_IFEXPR expr exprSingle exprSingle )
            {
                // etc/XQFT.g:488:12: ^( AST_IFEXPR expr exprSingle exprSingle )
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
    // etc/XQFT.g:490:5: orExpr : andExpr ( OR andExpr )* ;
    public final orExpr_return orExpr() throws RecognitionException {
        orExpr_return retval = new orExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token OR287=null;
        andExpr_return andExpr286 = null;

        andExpr_return andExpr288 = null;


        XQFTTree OR287_tree=null;

        try {
            // etc/XQFT.g:490:12: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:490:14: andExpr ( OR andExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_andExpr_in_orExpr3480);
            andExpr286=andExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, andExpr286.getTree());
            // etc/XQFT.g:490:22: ( OR andExpr )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==OR) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // etc/XQFT.g:490:24: OR andExpr
            	    {
            	    OR287=(Token)input.LT(1);
            	    match(input,OR,FOLLOW_OR_in_orExpr3484); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    OR287_tree = (XQFTTree)adaptor.create(OR287);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(OR287_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_andExpr_in_orExpr3487);
            	    andExpr288=andExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, andExpr288.getTree());

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
    // etc/XQFT.g:491:9: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final andExpr_return andExpr() throws RecognitionException {
        andExpr_return retval = new andExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AND290=null;
        comparisonExpr_return comparisonExpr289 = null;

        comparisonExpr_return comparisonExpr291 = null;


        XQFTTree AND290_tree=null;

        try {
            // etc/XQFT.g:491:17: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:491:19: comparisonExpr ( AND comparisonExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_comparisonExpr_in_andExpr3505);
            comparisonExpr289=comparisonExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, comparisonExpr289.getTree());
            // etc/XQFT.g:491:34: ( AND comparisonExpr )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==AND) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // etc/XQFT.g:491:36: AND comparisonExpr
            	    {
            	    AND290=(Token)input.LT(1);
            	    match(input,AND,FOLLOW_AND_in_andExpr3509); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    AND290_tree = (XQFTTree)adaptor.create(AND290);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(AND290_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr3512);
            	    comparisonExpr291=comparisonExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, comparisonExpr291.getTree());

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
    // etc/XQFT.g:495:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final comparisonExpr_return comparisonExpr() throws RecognitionException {
        comparisonExpr_return retval = new comparisonExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftContainsExpr_return ftContainsExpr292 = null;

        valueComp_return valueComp293 = null;

        generalComp_return generalComp294 = null;

        nodeComp_return nodeComp295 = null;

        ftContainsExpr_return ftContainsExpr296 = null;



        try {
            // etc/XQFT.g:495:16: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:495:18: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3525);
            ftContainsExpr292=ftContainsExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftContainsExpr292.getTree());
            // etc/XQFT.g:495:33: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==EQ||LA64_0==GE||LA64_0==GT||LA64_0==IS||LA64_0==LE||LA64_0==LT||LA64_0==NE||LA64_0==EQSi||(LA64_0>=NEQSi && LA64_0<=NODEAFTERSi)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // etc/XQFT.g:495:35: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:495:35: ( valueComp | generalComp | nodeComp )
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
                            new NoViableAltException("495:35: ( valueComp | generalComp | nodeComp )", 63, 0, input);

                        throw nvae;
                    }

                    switch (alt63) {
                        case 1 :
                            // etc/XQFT.g:495:36: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr3530);
                            valueComp293=valueComp();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(valueComp293.getTree(), root_0);

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:495:49: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr3535);
                            generalComp294=generalComp();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(generalComp294.getTree(), root_0);

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:495:64: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr3540);
                            nodeComp295=nodeComp();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(nodeComp295.getTree(), root_0);

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr3544);
                    ftContainsExpr296=ftContainsExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftContainsExpr296.getTree());

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
    // etc/XQFT.g:496:5: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final ftContainsExpr_return ftContainsExpr() throws RecognitionException {
        ftContainsExpr_return retval = new ftContainsExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTCONTAINS298=null;
        rangeExpr_return rangeExpr297 = null;

        ftSelection_return ftSelection299 = null;

        ftIgnoreOption_return ftIgnoreOption300 = null;


        XQFTTree FTCONTAINS298_tree=null;

        try {
            // etc/XQFT.g:496:20: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:496:22: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr3558);
            rangeExpr297=rangeExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpr297.getTree());
            // etc/XQFT.g:496:32: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==FTCONTAINS) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // etc/XQFT.g:496:34: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    FTCONTAINS298=(Token)input.LT(1);
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr3562); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FTCONTAINS298_tree = (XQFTTree)adaptor.create(FTCONTAINS298);
                    root_0 = (XQFTTree)adaptor.becomeRoot(FTCONTAINS298_tree, root_0);
                    }
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr3565);
                    ftSelection299=ftSelection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftSelection299.getTree());
                    // etc/XQFT.g:496:58: ( ftIgnoreOption )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==WITHOUT) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // etc/XQFT.g:496:58: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr3567);
                            ftIgnoreOption300=ftIgnoreOption();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftIgnoreOption300.getTree());

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
    // etc/XQFT.g:497:9: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final rangeExpr_return rangeExpr() throws RecognitionException {
        rangeExpr_return retval = new rangeExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TO302=null;
        additiveExpr_return additiveExpr301 = null;

        additiveExpr_return additiveExpr303 = null;


        XQFTTree TO302_tree=null;

        try {
            // etc/XQFT.g:497:19: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:497:21: additiveExpr ( TO additiveExpr )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpr_in_rangeExpr3590);
            additiveExpr301=additiveExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr301.getTree());
            // etc/XQFT.g:497:34: ( TO additiveExpr )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==TO) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // etc/XQFT.g:497:36: TO additiveExpr
                    {
                    TO302=(Token)input.LT(1);
                    match(input,TO,FOLLOW_TO_in_rangeExpr3594); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TO302_tree = (XQFTTree)adaptor.create(TO302);
                    root_0 = (XQFTTree)adaptor.becomeRoot(TO302_tree, root_0);
                    }
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr3597);
                    additiveExpr303=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr303.getTree());

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
    // etc/XQFT.g:498:13: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final additiveExpr_return additiveExpr() throws RecognitionException {
        additiveExpr_return retval = new additiveExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set305=null;
        multiplicativeExpr_return multiplicativeExpr304 = null;

        multiplicativeExpr_return multiplicativeExpr306 = null;


        XQFTTree set305_tree=null;

        try {
            // etc/XQFT.g:498:26: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:498:28: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr3619);
            multiplicativeExpr304=multiplicativeExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr304.getTree());
            // etc/XQFT.g:498:47: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( ((LA68_0>=PLUSSi && LA68_0<=MINUSSi)) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // etc/XQFT.g:498:49: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    set305=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUSSi && input.LA(1)<=MINUSSi) ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(adaptor.create(set305), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr3623);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr3632);
            	    multiplicativeExpr306=multiplicativeExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpr306.getTree());

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
    // etc/XQFT.g:499:17: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final multiplicativeExpr_return multiplicativeExpr() throws RecognitionException {
        multiplicativeExpr_return retval = new multiplicativeExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set308=null;
        unionExpr_return unionExpr307 = null;

        unionExpr_return unionExpr309 = null;


        XQFTTree set308_tree=null;

        try {
            // etc/XQFT.g:499:36: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:499:38: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr3658);
            unionExpr307=unionExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unionExpr307.getTree());
            // etc/XQFT.g:499:48: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==DIV||LA69_0==IDIV||LA69_0==MOD||LA69_0==STARSi) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // etc/XQFT.g:499:50: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    set308=(Token)input.LT(1);
            	    if ( input.LA(1)==DIV||input.LA(1)==IDIV||input.LA(1)==MOD||input.LA(1)==STARSi ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(adaptor.create(set308), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr3662);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr3679);
            	    unionExpr309=unionExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, unionExpr309.getTree());

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
    // etc/XQFT.g:500:21: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final unionExpr_return unionExpr() throws RecognitionException {
        unionExpr_return retval = new unionExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set311=null;
        intersectExceptExpr_return intersectExceptExpr310 = null;

        intersectExceptExpr_return intersectExceptExpr312 = null;


        XQFTTree set311_tree=null;

        try {
            // etc/XQFT.g:500:31: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:500:33: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr3709);
            intersectExceptExpr310=intersectExceptExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, intersectExceptExpr310.getTree());
            // etc/XQFT.g:500:53: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==UNION||LA70_0==PIPESi) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // etc/XQFT.g:500:55: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    set311=(Token)input.LT(1);
            	    if ( input.LA(1)==UNION||input.LA(1)==PIPESi ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(adaptor.create(set311), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr3713);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr3722);
            	    intersectExceptExpr312=intersectExceptExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, intersectExceptExpr312.getTree());

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
    // etc/XQFT.g:501:25: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final intersectExceptExpr_return intersectExceptExpr() throws RecognitionException {
        intersectExceptExpr_return retval = new intersectExceptExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set314=null;
        instanceofExpr_return instanceofExpr313 = null;

        instanceofExpr_return instanceofExpr315 = null;


        XQFTTree set314_tree=null;

        try {
            // etc/XQFT.g:501:45: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:501:47: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr3756);
            instanceofExpr313=instanceofExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, instanceofExpr313.getTree());
            // etc/XQFT.g:501:62: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==EXCEPT||LA71_0==INTERSECT) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // etc/XQFT.g:501:64: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    set314=(Token)input.LT(1);
            	    if ( input.LA(1)==EXCEPT||input.LA(1)==INTERSECT ) {
            	        input.consume();
            	        if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(adaptor.create(set314), root_0);
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr3760);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr3769);
            	    instanceofExpr315=instanceofExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, instanceofExpr315.getTree());

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
    // etc/XQFT.g:502:29: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final instanceofExpr_return instanceofExpr() throws RecognitionException {
        instanceofExpr_return retval = new instanceofExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token INSTANCE317=null;
        Token OF318=null;
        treatExpr_return treatExpr316 = null;

        sequenceType_return sequenceType319 = null;


        XQFTTree INSTANCE317_tree=null;
        XQFTTree OF318_tree=null;

        try {
            // etc/XQFT.g:502:44: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:502:46: treatExpr ( INSTANCE OF sequenceType )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_treatExpr_in_instanceofExpr3807);
            treatExpr316=treatExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, treatExpr316.getTree());
            // etc/XQFT.g:502:56: ( INSTANCE OF sequenceType )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==INSTANCE) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // etc/XQFT.g:502:58: INSTANCE OF sequenceType
                    {
                    INSTANCE317=(Token)input.LT(1);
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr3811); if (failed) return retval;
                    if ( backtracking==0 ) {
                    INSTANCE317_tree = (XQFTTree)adaptor.create(INSTANCE317);
                    root_0 = (XQFTTree)adaptor.becomeRoot(INSTANCE317_tree, root_0);
                    }
                    OF318=(Token)input.LT(1);
                    match(input,OF,FOLLOW_OF_in_instanceofExpr3814); if (failed) return retval;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr3817);
                    sequenceType319=sequenceType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, sequenceType319.getTree());

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
    // etc/XQFT.g:503:33: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final treatExpr_return treatExpr() throws RecognitionException {
        treatExpr_return retval = new treatExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TREAT321=null;
        Token AS322=null;
        castableExpr_return castableExpr320 = null;

        sequenceType_return sequenceType323 = null;


        XQFTTree TREAT321_tree=null;
        XQFTTree AS322_tree=null;

        try {
            // etc/XQFT.g:503:43: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:503:45: castableExpr ( TREAT AS sequenceType )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_castableExpr_in_treatExpr3859);
            castableExpr320=castableExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, castableExpr320.getTree());
            // etc/XQFT.g:503:58: ( TREAT AS sequenceType )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==TREAT) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // etc/XQFT.g:503:60: TREAT AS sequenceType
                    {
                    TREAT321=(Token)input.LT(1);
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr3863); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TREAT321_tree = (XQFTTree)adaptor.create(TREAT321);
                    root_0 = (XQFTTree)adaptor.becomeRoot(TREAT321_tree, root_0);
                    }
                    AS322=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_treatExpr3866); if (failed) return retval;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr3869);
                    sequenceType323=sequenceType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, sequenceType323.getTree());

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
    // etc/XQFT.g:504:37: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final castableExpr_return castableExpr() throws RecognitionException {
        castableExpr_return retval = new castableExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CASTABLE325=null;
        Token AS326=null;
        castExpr_return castExpr324 = null;

        singleType_return singleType327 = null;


        XQFTTree CASTABLE325_tree=null;
        XQFTTree AS326_tree=null;

        try {
            // etc/XQFT.g:504:50: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:504:52: castExpr ( CASTABLE AS singleType )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_castExpr_in_castableExpr3915);
            castExpr324=castExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, castExpr324.getTree());
            // etc/XQFT.g:504:61: ( CASTABLE AS singleType )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==CASTABLE) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // etc/XQFT.g:504:63: CASTABLE AS singleType
                    {
                    CASTABLE325=(Token)input.LT(1);
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr3919); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CASTABLE325_tree = (XQFTTree)adaptor.create(CASTABLE325);
                    root_0 = (XQFTTree)adaptor.becomeRoot(CASTABLE325_tree, root_0);
                    }
                    AS326=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_castableExpr3922); if (failed) return retval;
                    pushFollow(FOLLOW_singleType_in_castableExpr3925);
                    singleType327=singleType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleType327.getTree());

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
    // etc/XQFT.g:505:41: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final castExpr_return castExpr() throws RecognitionException {
        castExpr_return retval = new castExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CAST329=null;
        Token AS330=null;
        unaryExpr_return unaryExpr328 = null;

        singleType_return singleType331 = null;


        XQFTTree CAST329_tree=null;
        XQFTTree AS330_tree=null;

        try {
            // etc/XQFT.g:505:50: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:505:52: unaryExpr ( CAST AS singleType )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpr_in_castExpr3975);
            unaryExpr328=unaryExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unaryExpr328.getTree());
            // etc/XQFT.g:505:62: ( CAST AS singleType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==CAST) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // etc/XQFT.g:505:64: CAST AS singleType
                    {
                    CAST329=(Token)input.LT(1);
                    match(input,CAST,FOLLOW_CAST_in_castExpr3979); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CAST329_tree = (XQFTTree)adaptor.create(CAST329);
                    root_0 = (XQFTTree)adaptor.becomeRoot(CAST329_tree, root_0);
                    }
                    AS330=(Token)input.LT(1);
                    match(input,AS,FOLLOW_AS_in_castExpr3982); if (failed) return retval;
                    pushFollow(FOLLOW_singleType_in_castExpr3985);
                    singleType331=singleType();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, singleType331.getTree());

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
    // etc/XQFT.g:506:45: unaryExpr : ( ( MINUSSi | PLUSSi )* ) valueExpr ;
    public final unaryExpr_return unaryExpr() throws RecognitionException {
        unaryExpr_return retval = new unaryExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set332=null;
        valueExpr_return valueExpr333 = null;


        XQFTTree set332_tree=null;

        try {
            // etc/XQFT.g:506:55: ( ( ( MINUSSi | PLUSSi )* ) valueExpr )
            // etc/XQFT.g:506:57: ( ( MINUSSi | PLUSSi )* ) valueExpr
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:506:57: ( ( MINUSSi | PLUSSi )* )
            // etc/XQFT.g:506:58: ( MINUSSi | PLUSSi )*
            {
            // etc/XQFT.g:506:58: ( MINUSSi | PLUSSi )*
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
            	    set332=(Token)input.LT(1);
            	    if ( (input.LA(1)>=PLUSSi && input.LA(1)<=MINUSSi) ) {
            	        input.consume();
            	        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set332));
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return retval;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr4040);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);


            }

            pushFollow(FOLLOW_valueExpr_in_unaryExpr4051);
            valueExpr333=valueExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, valueExpr333.getTree());

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
    // etc/XQFT.g:507:45: singleType : atomicType ( QUESTIONSi )? ;
    public final singleType_return singleType() throws RecognitionException {
        singleType_return retval = new singleType_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token QUESTIONSi335=null;
        atomicType_return atomicType334 = null;


        XQFTTree QUESTIONSi335_tree=null;

        try {
            // etc/XQFT.g:507:56: ( atomicType ( QUESTIONSi )? )
            // etc/XQFT.g:507:58: atomicType ( QUESTIONSi )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_atomicType_in_singleType4102);
            atomicType334=atomicType();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, atomicType334.getTree());
            // etc/XQFT.g:507:69: ( QUESTIONSi )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==QUESTIONSi) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:507:69: QUESTIONSi
                    {
                    QUESTIONSi335=(Token)input.LT(1);
                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_singleType4104); if (failed) return retval;
                    if ( backtracking==0 ) {
                    QUESTIONSi335_tree = (XQFTTree)adaptor.create(QUESTIONSi335);
                    adaptor.addChild(root_0, QUESTIONSi335_tree);
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
    // etc/XQFT.g:508:49: atomicType : qName ;
    public final atomicType_return atomicType() throws RecognitionException {
        atomicType_return retval = new atomicType_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        qName_return qName336 = null;



        try {
            // etc/XQFT.g:508:60: ( qName )
            // etc/XQFT.g:508:62: qName
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_qName_in_atomicType4160);
            qName336=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName336.getTree());

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
    // etc/XQFT.g:510:9: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final ftIgnoreOption_return ftIgnoreOption() throws RecognitionException {
        ftIgnoreOption_return retval = new ftIgnoreOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WITHOUT337=null;
        Token CONTENT338=null;
        unionExpr_return unionExpr339 = null;


        XQFTTree WITHOUT337_tree=null;
        XQFTTree CONTENT338_tree=null;

        try {
            // etc/XQFT.g:510:24: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:510:26: WITHOUT CONTENT unionExpr
            {
            root_0 = (XQFTTree)adaptor.nil();

            WITHOUT337=(Token)input.LT(1);
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption4192); if (failed) return retval;
            if ( backtracking==0 ) {
            WITHOUT337_tree = (XQFTTree)adaptor.create(WITHOUT337);
            root_0 = (XQFTTree)adaptor.becomeRoot(WITHOUT337_tree, root_0);
            }
            CONTENT338=(Token)input.LT(1);
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption4195); if (failed) return retval;
            if ( backtracking==0 ) {
            CONTENT338_tree = (XQFTTree)adaptor.create(CONTENT338);
            adaptor.addChild(root_0, CONTENT338_tree);
            }
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption4197);
            unionExpr339=unionExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, unionExpr339.getTree());

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
    // etc/XQFT.g:512:5: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final valueComp_return valueComp() throws RecognitionException {
        valueComp_return retval = new valueComp_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set340=null;

        XQFTTree set340_tree=null;

        try {
            // etc/XQFT.g:512:17: ( EQ | NE | LT | LE | GT | GE )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set340=(Token)input.LT(1);
            if ( input.LA(1)==EQ||input.LA(1)==GE||input.LA(1)==GT||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set340));
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
    // etc/XQFT.g:513:5: generalComp : ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi );
    public final generalComp_return generalComp() throws RecognitionException {
        generalComp_return retval = new generalComp_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set341=null;

        XQFTTree set341_tree=null;

        try {
            // etc/XQFT.g:513:17: ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set341=(Token)input.LT(1);
            if ( input.LA(1)==EQSi||(input.LA(1)>=NEQSi && input.LA(1)<=GTOREQSi) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set341));
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
    // etc/XQFT.g:514:5: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final nodeComp_return nodeComp() throws RecognitionException {
        nodeComp_return retval = new nodeComp_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set342=null;

        XQFTTree set342_tree=null;

        try {
            // etc/XQFT.g:514:17: ( IS | NODEBEFORESi | NODEAFTERSi )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set342=(Token)input.LT(1);
            if ( input.LA(1)==IS||(input.LA(1)>=NODEBEFORESi && input.LA(1)<=NODEAFTERSi) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set342));
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
    // etc/XQFT.g:518:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final ftSelection_return ftSelection() throws RecognitionException {
        ftSelection_return retval = new ftSelection_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WEIGHT345=null;
        ftOr_return ftOr343 = null;

        ftPosFilter_return ftPosFilter344 = null;

        rangeExpr_return rangeExpr346 = null;


        XQFTTree WEIGHT345_tree=null;

        try {
            // etc/XQFT.g:518:13: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:518:15: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftOr_in_ftSelection4294);
            ftOr343=ftOr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftOr343.getTree());
            // etc/XQFT.g:518:20: ( ftPosFilter )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==AT||(LA78_0>=DIFFERENT && LA78_0<=DISTANCE)||LA78_0==ENTIRE||LA78_0==ORDERED||LA78_0==SAME||LA78_0==WINDOW) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // etc/XQFT.g:518:20: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection4296);
            	    ftPosFilter344=ftPosFilter();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftPosFilter344.getTree());

            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            // etc/XQFT.g:518:33: ( WEIGHT rangeExpr )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==WEIGHT) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // etc/XQFT.g:518:34: WEIGHT rangeExpr
                    {
                    WEIGHT345=(Token)input.LT(1);
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection4300); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WEIGHT345_tree = (XQFTTree)adaptor.create(WEIGHT345);
                    adaptor.addChild(root_0, WEIGHT345_tree);
                    }
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection4302);
                    rangeExpr346=rangeExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, rangeExpr346.getTree());

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
    // etc/XQFT.g:519:5: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final ftOr_return ftOr() throws RecognitionException {
        ftOr_return retval = new ftOr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTOR348=null;
        ftAnd_return ftAnd347 = null;

        ftAnd_return ftAnd349 = null;


        XQFTTree FTOR348_tree=null;

        try {
            // etc/XQFT.g:519:10: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:519:12: ftAnd ( FTOR ftAnd )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftAnd_in_ftOr4315);
            ftAnd347=ftAnd();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftAnd347.getTree());
            // etc/XQFT.g:519:18: ( FTOR ftAnd )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==FTOR) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // etc/XQFT.g:519:20: FTOR ftAnd
            	    {
            	    FTOR348=(Token)input.LT(1);
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr4319); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    FTOR348_tree = (XQFTTree)adaptor.create(FTOR348);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(FTOR348_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ftAnd_in_ftOr4322);
            	    ftAnd349=ftAnd();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftAnd349.getTree());

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
    // etc/XQFT.g:520:9: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final ftAnd_return ftAnd() throws RecognitionException {
        ftAnd_return retval = new ftAnd_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTAND351=null;
        ftMildNot_return ftMildNot350 = null;

        ftMildNot_return ftMildNot352 = null;


        XQFTTree FTAND351_tree=null;

        try {
            // etc/XQFT.g:520:15: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:520:17: ftMildNot ( FTAND ftMildNot )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftMildNot_in_ftAnd4340);
            ftMildNot350=ftMildNot();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftMildNot350.getTree());
            // etc/XQFT.g:520:27: ( FTAND ftMildNot )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==FTAND) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // etc/XQFT.g:520:29: FTAND ftMildNot
            	    {
            	    FTAND351=(Token)input.LT(1);
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd4344); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    FTAND351_tree = (XQFTTree)adaptor.create(FTAND351);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(FTAND351_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd4347);
            	    ftMildNot352=ftMildNot();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftMildNot352.getTree());

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
    // etc/XQFT.g:521:13: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final ftMildNot_return ftMildNot() throws RecognitionException {
        ftMildNot_return retval = new ftMildNot_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token NOT354=null;
        Token IN355=null;
        ftUnaryNot_return ftUnaryNot353 = null;

        ftUnaryNot_return ftUnaryNot356 = null;


        XQFTTree NOT354_tree=null;
        XQFTTree IN355_tree=null;

        try {
            // etc/XQFT.g:521:23: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:521:25: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4369);
            ftUnaryNot353=ftUnaryNot();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftUnaryNot353.getTree());
            // etc/XQFT.g:521:36: ( NOT IN ftUnaryNot )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==NOT) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // etc/XQFT.g:521:38: NOT IN ftUnaryNot
            	    {
            	    NOT354=(Token)input.LT(1);
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot4373); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    NOT354_tree = (XQFTTree)adaptor.create(NOT354);
            	    root_0 = (XQFTTree)adaptor.becomeRoot(NOT354_tree, root_0);
            	    }
            	    IN355=(Token)input.LT(1);
            	    match(input,IN,FOLLOW_IN_in_ftMildNot4376); if (failed) return retval;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot4379);
            	    ftUnaryNot356=ftUnaryNot();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftUnaryNot356.getTree());

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
    // etc/XQFT.g:522:17: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final ftUnaryNot_return ftUnaryNot() throws RecognitionException {
        ftUnaryNot_return retval = new ftUnaryNot_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token FTNOT357=null;
        ftPrimaryWithOptions_return ftPrimaryWithOptions358 = null;


        XQFTTree FTNOT357_tree=null;

        try {
            // etc/XQFT.g:522:28: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:522:30: ( FTNOT )? ftPrimaryWithOptions
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:522:30: ( FTNOT )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==FTNOT) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // etc/XQFT.g:522:31: FTNOT
                    {
                    FTNOT357=(Token)input.LT(1);
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot4406); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FTNOT357_tree = (XQFTTree)adaptor.create(FTNOT357);
                    root_0 = (XQFTTree)adaptor.becomeRoot(FTNOT357_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4411);
            ftPrimaryWithOptions358=ftPrimaryWithOptions();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftPrimaryWithOptions358.getTree());

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
    // etc/XQFT.g:523:17: ftPrimaryWithOptions : ftPrimary ( ftMatchOption )* ;
    public final ftPrimaryWithOptions_return ftPrimaryWithOptions() throws RecognitionException {
        ftPrimaryWithOptions_return retval = new ftPrimaryWithOptions_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftPrimary_return ftPrimary359 = null;

        ftMatchOption_return ftMatchOption360 = null;



        try {
            // etc/XQFT.g:523:38: ( ftPrimary ( ftMatchOption )* )
            // etc/XQFT.g:523:40: ftPrimary ( ftMatchOption )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions4434);
            ftPrimary359=ftPrimary();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(ftPrimary359.getTree(), root_0);
            // etc/XQFT.g:523:51: ( ftMatchOption )*
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
            	    // etc/XQFT.g:523:52: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftPrimaryWithOptions4438);
            	    ftMatchOption360=ftMatchOption();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, ftMatchOption360.getTree());

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
    // etc/XQFT.g:524:21: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );
    public final ftPrimary_return ftPrimary() throws RecognitionException {
        ftPrimary_return retval = new ftPrimary_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPARSi363=null;
        Token RPARSi365=null;
        ftWords_return ftWords361 = null;

        ftTimes_return ftTimes362 = null;

        ftSelection_return ftSelection364 = null;

        ftExtensionSelection_return ftExtensionSelection366 = null;


        XQFTTree LPARSi363_tree=null;
        XQFTTree RPARSi365_tree=null;

        try {
            // etc/XQFT.g:524:31: ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection )
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
                    new NoViableAltException("524:21: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // etc/XQFT.g:524:33: ftWords ( ftTimes )?
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftWords_in_ftPrimary4467);
                    ftWords361=ftWords();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(ftWords361.getTree(), root_0);
                    // etc/XQFT.g:524:42: ( ftTimes )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==OCCURS) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // etc/XQFT.g:524:42: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary4470);
                            ftTimes362=ftTimes();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftTimes362.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:525:35: LPARSi ftSelection RPARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    LPARSi363=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftPrimary4508); if (failed) return retval;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary4511);
                    ftSelection364=ftSelection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftSelection364.getTree());
                    RPARSi365=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftPrimary4513); if (failed) return retval;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:526:35: ftExtensionSelection
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary4551);
                    ftExtensionSelection366=ftExtensionSelection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftExtensionSelection366.getTree());

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
    // etc/XQFT.g:528:25: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final ftWords_return ftWords() throws RecognitionException {
        ftWords_return retval = new ftWords_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftWordsValue_return ftWordsValue367 = null;

        ftAnyallOption_return ftAnyallOption368 = null;



        try {
            // etc/XQFT.g:528:33: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:528:35: ftWordsValue ( ftAnyallOption )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_ftWordsValue_in_ftWords4611);
            ftWordsValue367=ftWordsValue();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) root_0 = (XQFTTree)adaptor.becomeRoot(ftWordsValue367.getTree(), root_0);
            // etc/XQFT.g:528:49: ( ftAnyallOption )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( ((LA87_0>=ALL && LA87_0<=ANY)||LA87_0==PHRASE) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // etc/XQFT.g:528:49: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords4614);
                    ftAnyallOption368=ftAnyallOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftAnyallOption368.getTree());

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
    // etc/XQFT.g:529:29: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );
    public final ftWordsValue_return ftWordsValue() throws RecognitionException {
        ftWordsValue_return retval = new ftWordsValue_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi370=null;
        Token RBRACSi372=null;
        literal_return literal369 = null;

        expr_return expr371 = null;


        XQFTTree LBRACESi370_tree=null;
        XQFTTree RBRACSi372_tree=null;

        try {
            // etc/XQFT.g:529:42: ( literal | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("529:29: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // etc/XQFT.g:529:44: literal
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_ftWordsValue4650);
                    literal369=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal369.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:529:54: ( LBRACESi expr RBRACSi )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:529:54: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:529:55: LBRACESi expr RBRACSi
                    {
                    LBRACESi370=(Token)input.LT(1);
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_ftWordsValue4655); if (failed) return retval;
                    pushFollow(FOLLOW_expr_in_ftWordsValue4658);
                    expr371=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr371.getTree());
                    RBRACSi372=(Token)input.LT(1);
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_ftWordsValue4660); if (failed) return retval;

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
    // etc/XQFT.g:530:33: literal : ( numericLiteral | StringLiteral );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token StringLiteral374=null;
        numericLiteral_return numericLiteral373 = null;


        XQFTTree StringLiteral374_tree=null;

        try {
            // etc/XQFT.g:530:41: ( numericLiteral | StringLiteral )
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
                    new NoViableAltException("530:33: literal : ( numericLiteral | StringLiteral );", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // etc/XQFT.g:530:43: numericLiteral
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_numericLiteral_in_literal4701);
                    numericLiteral373=numericLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, numericLiteral373.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:530:60: StringLiteral
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    StringLiteral374=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal4705); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral374_tree = (XQFTTree)adaptor.create(StringLiteral374);
                    adaptor.addChild(root_0, StringLiteral374_tree);
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
    // etc/XQFT.g:531:37: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set375=null;

        XQFTTree set375_tree=null;

        try {
            // etc/XQFT.g:531:52: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set375=(Token)input.LT(1);
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=DoubleLiteral) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set375));
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
    // etc/XQFT.g:532:29: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final ftAnyallOption_return ftAnyallOption() throws RecognitionException {
        ftAnyallOption_return retval = new ftAnyallOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ANY376=null;
        Token WORD377=null;
        Token ALL378=null;
        Token WORDS379=null;
        Token PHRASE380=null;

        XQFTTree ANY376_tree=null;
        XQFTTree WORD377_tree=null;
        XQFTTree ALL378_tree=null;
        XQFTTree WORDS379_tree=null;
        XQFTTree PHRASE380_tree=null;

        try {
            // etc/XQFT.g:532:44: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
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
                    new NoViableAltException("532:29: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:532:46: ( ANY ( WORD )? )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:532:46: ( ANY ( WORD )? )
                    // etc/XQFT.g:532:47: ANY ( WORD )?
                    {
                    ANY376=(Token)input.LT(1);
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption4792); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ANY376_tree = (XQFTTree)adaptor.create(ANY376);
                    adaptor.addChild(root_0, ANY376_tree);
                    }
                    // etc/XQFT.g:532:51: ( WORD )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==WORD) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // etc/XQFT.g:532:51: WORD
                            {
                            WORD377=(Token)input.LT(1);
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption4794); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WORD377_tree = (XQFTTree)adaptor.create(WORD377);
                            adaptor.addChild(root_0, WORD377_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:532:60: ( ALL ( WORDS )? )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:532:60: ( ALL ( WORDS )? )
                    // etc/XQFT.g:532:61: ALL ( WORDS )?
                    {
                    ALL378=(Token)input.LT(1);
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption4801); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ALL378_tree = (XQFTTree)adaptor.create(ALL378);
                    adaptor.addChild(root_0, ALL378_tree);
                    }
                    // etc/XQFT.g:532:65: ( WORDS )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==WORDS) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // etc/XQFT.g:532:65: WORDS
                            {
                            WORDS379=(Token)input.LT(1);
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption4803); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WORDS379_tree = (XQFTTree)adaptor.create(WORDS379);
                            adaptor.addChild(root_0, WORDS379_tree);
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:532:75: PHRASE
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    PHRASE380=(Token)input.LT(1);
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption4809); if (failed) return retval;
                    if ( backtracking==0 ) {
                    PHRASE380_tree = (XQFTTree)adaptor.create(PHRASE380);
                    adaptor.addChild(root_0, PHRASE380_tree);
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
    // etc/XQFT.g:533:25: ftTimes : OCCURS ftRange TIMES ;
    public final ftTimes_return ftTimes() throws RecognitionException {
        ftTimes_return retval = new ftTimes_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token OCCURS381=null;
        Token TIMES383=null;
        ftRange_return ftRange382 = null;


        XQFTTree OCCURS381_tree=null;
        XQFTTree TIMES383_tree=null;

        try {
            // etc/XQFT.g:533:33: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:533:35: OCCURS ftRange TIMES
            {
            root_0 = (XQFTTree)adaptor.nil();

            OCCURS381=(Token)input.LT(1);
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes4840); if (failed) return retval;
            pushFollow(FOLLOW_ftRange_in_ftTimes4843);
            ftRange382=ftRange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftRange382.getTree());
            TIMES383=(Token)input.LT(1);
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes4845); if (failed) return retval;

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
    // etc/XQFT.g:534:29: ftRange : ( ( EXACTLY additiveExpr ) | ( AT ( LEAST | MOST ) additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final ftRange_return ftRange() throws RecognitionException {
        ftRange_return retval = new ftRange_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token EXACTLY384=null;
        Token AT386=null;
        Token set387=null;
        Token FROM389=null;
        Token TO391=null;
        additiveExpr_return additiveExpr385 = null;

        additiveExpr_return additiveExpr388 = null;

        additiveExpr_return additiveExpr390 = null;

        additiveExpr_return additiveExpr392 = null;


        XQFTTree EXACTLY384_tree=null;
        XQFTTree AT386_tree=null;
        XQFTTree set387_tree=null;
        XQFTTree FROM389_tree=null;
        XQFTTree TO391_tree=null;

        try {
            // etc/XQFT.g:534:37: ( ( EXACTLY additiveExpr ) | ( AT ( LEAST | MOST ) additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
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
                    new NoViableAltException("534:29: ftRange : ( ( EXACTLY additiveExpr ) | ( AT ( LEAST | MOST ) additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // etc/XQFT.g:534:39: ( EXACTLY additiveExpr )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:534:39: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:534:40: EXACTLY additiveExpr
                    {
                    EXACTLY384=(Token)input.LT(1);
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange4882); if (failed) return retval;
                    if ( backtracking==0 ) {
                    EXACTLY384_tree = (XQFTTree)adaptor.create(EXACTLY384);
                    adaptor.addChild(root_0, EXACTLY384_tree);
                    }
                    pushFollow(FOLLOW_additiveExpr_in_ftRange4884);
                    additiveExpr385=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr385.getTree());

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:535:41: ( AT ( LEAST | MOST ) additiveExpr )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:535:41: ( AT ( LEAST | MOST ) additiveExpr )
                    // etc/XQFT.g:535:42: AT ( LEAST | MOST ) additiveExpr
                    {
                    AT386=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_ftRange4928); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT386_tree = (XQFTTree)adaptor.create(AT386);
                    adaptor.addChild(root_0, AT386_tree);
                    }
                    set387=(Token)input.LT(1);
                    if ( input.LA(1)==LEAST||input.LA(1)==MOST ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set387));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftRange4930);    throw mse;
                    }

                    pushFollow(FOLLOW_additiveExpr_in_ftRange4936);
                    additiveExpr388=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr388.getTree());

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:536:41: ( FROM additiveExpr TO additiveExpr )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:536:41: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:536:42: FROM additiveExpr TO additiveExpr
                    {
                    FROM389=(Token)input.LT(1);
                    match(input,FROM,FOLLOW_FROM_in_ftRange4980); if (failed) return retval;
                    if ( backtracking==0 ) {
                    FROM389_tree = (XQFTTree)adaptor.create(FROM389);
                    adaptor.addChild(root_0, FROM389_tree);
                    }
                    pushFollow(FOLLOW_additiveExpr_in_ftRange4982);
                    additiveExpr390=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr390.getTree());
                    TO391=(Token)input.LT(1);
                    match(input,TO,FOLLOW_TO_in_ftRange4984); if (failed) return retval;
                    if ( backtracking==0 ) {
                    TO391_tree = (XQFTTree)adaptor.create(TO391);
                    adaptor.addChild(root_0, TO391_tree);
                    }
                    pushFollow(FOLLOW_additiveExpr_in_ftRange4986);
                    additiveExpr392=additiveExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr392.getTree());

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
    // etc/XQFT.g:537:25: ftExtensionSelection : ( pragma )+ LBRACESi ( ftSelection )? RBRACSi ;
    public final ftExtensionSelection_return ftExtensionSelection() throws RecognitionException {
        ftExtensionSelection_return retval = new ftExtensionSelection_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi394=null;
        Token RBRACSi396=null;
        pragma_return pragma393 = null;

        ftSelection_return ftSelection395 = null;


        XQFTTree LBRACESi394_tree=null;
        XQFTTree RBRACSi396_tree=null;

        try {
            // etc/XQFT.g:537:46: ( ( pragma )+ LBRACESi ( ftSelection )? RBRACSi )
            // etc/XQFT.g:537:48: ( pragma )+ LBRACESi ( ftSelection )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:537:48: ( pragma )+
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
            	    // etc/XQFT.g:537:48: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection5018);
            	    pragma393=pragma();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, pragma393.getTree());

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

            LBRACESi394=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_ftExtensionSelection5021); if (failed) return retval;
            // etc/XQFT.g:537:66: ( ftSelection )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==FTNOT||LA95_0==StringLiteral||LA95_0==LPARSi||LA95_0==LBRACESi||(LA95_0>=IntegerLiteral && LA95_0<=LPRAGSi)) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // etc/XQFT.g:537:66: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection5024);
                    ftSelection395=ftSelection();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftSelection395.getTree());

                    }
                    break;

            }

            RBRACSi396=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_ftExtensionSelection5027); if (failed) return retval;

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
    // etc/XQFT.g:538:29: pragma : LPRAGSi qName ( PragmaContents )? RPRAGSi ;
    public final pragma_return pragma() throws RecognitionException {
        pragma_return retval = new pragma_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPRAGSi397=null;
        Token PragmaContents399=null;
        Token RPRAGSi400=null;
        qName_return qName398 = null;


        XQFTTree LPRAGSi397_tree=null;
        XQFTTree PragmaContents399_tree=null;
        XQFTTree RPRAGSi400_tree=null;

        try {
            // etc/XQFT.g:538:36: ( LPRAGSi qName ( PragmaContents )? RPRAGSi )
            // etc/XQFT.g:538:38: LPRAGSi qName ( PragmaContents )? RPRAGSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LPRAGSi397=(Token)input.LT(1);
            match(input,LPRAGSi,FOLLOW_LPRAGSi_in_pragma5063); if (failed) return retval;
            pushFollow(FOLLOW_qName_in_pragma5066);
            qName398=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName398.getTree());
            // etc/XQFT.g:538:53: ( PragmaContents )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==PragmaContents) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // etc/XQFT.g:538:53: PragmaContents
                    {
                    PragmaContents399=(Token)input.LT(1);
                    match(input,PragmaContents,FOLLOW_PragmaContents_in_pragma5068); if (failed) return retval;
                    if ( backtracking==0 ) {
                    PragmaContents399_tree = (XQFTTree)adaptor.create(PragmaContents399);
                    adaptor.addChild(root_0, PragmaContents399_tree);
                    }

                    }
                    break;

            }

            RPRAGSi400=(Token)input.LT(1);
            match(input,RPRAGSi,FOLLOW_RPRAGSi_in_pragma5071); if (failed) return retval;

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
    // etc/XQFT.g:540:5: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final ftPosFilter_return ftPosFilter() throws RecognitionException {
        ftPosFilter_return retval = new ftPosFilter_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        ftOrder_return ftOrder401 = null;

        ftWindow_return ftWindow402 = null;

        ftDistance_return ftDistance403 = null;

        ftScope_return ftScope404 = null;

        ftContent_return ftContent405 = null;



        try {
            // etc/XQFT.g:540:17: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
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
                    new NoViableAltException("540:5: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // etc/XQFT.g:540:19: ftOrder
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter5112);
                    ftOrder401=ftOrder();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftOrder401.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:540:29: ftWindow
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter5116);
                    ftWindow402=ftWindow();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftWindow402.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:540:40: ftDistance
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter5120);
                    ftDistance403=ftDistance();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftDistance403.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:540:53: ftScope
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftScope_in_ftPosFilter5124);
                    ftScope404=ftScope();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftScope404.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:540:63: ftContent
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftContent_in_ftPosFilter5128);
                    ftContent405=ftContent();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftContent405.getTree());

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
    // etc/XQFT.g:541:9: ftOrder : ORDERED ;
    public final ftOrder_return ftOrder() throws RecognitionException {
        ftOrder_return retval = new ftOrder_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ORDERED406=null;

        XQFTTree ORDERED406_tree=null;

        try {
            // etc/XQFT.g:541:17: ( ORDERED )
            // etc/XQFT.g:541:19: ORDERED
            {
            root_0 = (XQFTTree)adaptor.nil();

            ORDERED406=(Token)input.LT(1);
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder5143); if (failed) return retval;
            if ( backtracking==0 ) {
            ORDERED406_tree = (XQFTTree)adaptor.create(ORDERED406);
            adaptor.addChild(root_0, ORDERED406_tree);
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
    // etc/XQFT.g:542:9: ftWindow : WINDOW additiveExpr ftUnit ;
    public final ftWindow_return ftWindow() throws RecognitionException {
        ftWindow_return retval = new ftWindow_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WINDOW407=null;
        additiveExpr_return additiveExpr408 = null;

        ftUnit_return ftUnit409 = null;


        XQFTTree WINDOW407_tree=null;

        try {
            // etc/XQFT.g:542:18: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:542:20: WINDOW additiveExpr ftUnit
            {
            root_0 = (XQFTTree)adaptor.nil();

            WINDOW407=(Token)input.LT(1);
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow5158); if (failed) return retval;
            if ( backtracking==0 ) {
            WINDOW407_tree = (XQFTTree)adaptor.create(WINDOW407);
            adaptor.addChild(root_0, WINDOW407_tree);
            }
            pushFollow(FOLLOW_additiveExpr_in_ftWindow5160);
            additiveExpr408=additiveExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, additiveExpr408.getTree());
            pushFollow(FOLLOW_ftUnit_in_ftWindow5162);
            ftUnit409=ftUnit();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftUnit409.getTree());

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
    // etc/XQFT.g:543:13: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final ftUnit_return ftUnit() throws RecognitionException {
        ftUnit_return retval = new ftUnit_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set410=null;

        XQFTTree set410_tree=null;

        try {
            // etc/XQFT.g:543:20: ( WORDS | SENTENCES | PARAGRAPHS )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set410=(Token)input.LT(1);
            if ( input.LA(1)==PARAGRAPHS||input.LA(1)==SENTENCES||input.LA(1)==WORDS ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set410));
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
    // etc/XQFT.g:544:9: ftDistance : DISTANCE ftRange ftUnit ;
    public final ftDistance_return ftDistance() throws RecognitionException {
        ftDistance_return retval = new ftDistance_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DISTANCE411=null;
        ftRange_return ftRange412 = null;

        ftUnit_return ftUnit413 = null;


        XQFTTree DISTANCE411_tree=null;

        try {
            // etc/XQFT.g:544:20: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:544:22: DISTANCE ftRange ftUnit
            {
            root_0 = (XQFTTree)adaptor.nil();

            DISTANCE411=(Token)input.LT(1);
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance5208); if (failed) return retval;
            if ( backtracking==0 ) {
            DISTANCE411_tree = (XQFTTree)adaptor.create(DISTANCE411);
            adaptor.addChild(root_0, DISTANCE411_tree);
            }
            pushFollow(FOLLOW_ftRange_in_ftDistance5210);
            ftRange412=ftRange();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftRange412.getTree());
            pushFollow(FOLLOW_ftUnit_in_ftDistance5212);
            ftUnit413=ftUnit();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftUnit413.getTree());

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
    // etc/XQFT.g:545:9: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final ftScope_return ftScope() throws RecognitionException {
        ftScope_return retval = new ftScope_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set414=null;
        ftBigUnit_return ftBigUnit415 = null;


        XQFTTree set414_tree=null;

        try {
            // etc/XQFT.g:545:17: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:545:19: ( SAME | DIFFERENT ) ftBigUnit
            {
            root_0 = (XQFTTree)adaptor.nil();

            set414=(Token)input.LT(1);
            if ( input.LA(1)==DIFFERENT||input.LA(1)==SAME ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set414));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope5227);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope5235);
            ftBigUnit415=ftBigUnit();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftBigUnit415.getTree());

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
    // etc/XQFT.g:546:13: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final ftBigUnit_return ftBigUnit() throws RecognitionException {
        ftBigUnit_return retval = new ftBigUnit_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set416=null;

        XQFTTree set416_tree=null;

        try {
            // etc/XQFT.g:546:23: ( SENTENCE | PARAGRAPH )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set416=(Token)input.LT(1);
            if ( input.LA(1)==PARAGRAPH||input.LA(1)==SENTENCE ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set416));
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
    // etc/XQFT.g:547:9: ftContent : ( AT ( START | END ) | ENTIRE CONTENT );
    public final ftContent_return ftContent() throws RecognitionException {
        ftContent_return retval = new ftContent_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AT417=null;
        Token set418=null;
        Token ENTIRE419=null;
        Token CONTENT420=null;

        XQFTTree AT417_tree=null;
        XQFTTree set418_tree=null;
        XQFTTree ENTIRE419_tree=null;
        XQFTTree CONTENT420_tree=null;

        try {
            // etc/XQFT.g:547:19: ( AT ( START | END ) | ENTIRE CONTENT )
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
                    new NoViableAltException("547:9: ftContent : ( AT ( START | END ) | ENTIRE CONTENT );", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // etc/XQFT.g:547:21: AT ( START | END )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    AT417=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_ftContent5277); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT417_tree = (XQFTTree)adaptor.create(AT417);
                    adaptor.addChild(root_0, AT417_tree);
                    }
                    set418=(Token)input.LT(1);
                    if ( input.LA(1)==END||input.LA(1)==START ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set418));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftContent5279);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:547:40: ENTIRE CONTENT
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    ENTIRE419=(Token)input.LT(1);
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent5289); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ENTIRE419_tree = (XQFTTree)adaptor.create(ENTIRE419);
                    adaptor.addChild(root_0, ENTIRE419_tree);
                    }
                    CONTENT420=(Token)input.LT(1);
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent5291); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CONTENT420_tree = (XQFTTree)adaptor.create(CONTENT420);
                    adaptor.addChild(root_0, CONTENT420_tree);
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
    // etc/XQFT.g:551:1: ftMatchOption : ( ftLanguageOption | ftCaseOption | ftDiacriticsOption | ftExtensionOption | WITH ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption ) | WITHOUT ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS ) );
    public final ftMatchOption_return ftMatchOption() throws RecognitionException {
        ftMatchOption_return retval = new ftMatchOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token WITH425=null;
        Token WILDCARDS426=null;
        Token STEMMING428=null;
        Token WITHOUT430=null;
        Token WILDCARDS431=null;
        Token THESAURUS432=null;
        Token STEMMING433=null;
        Token STOP434=null;
        Token WORDS435=null;
        ftLanguageOption_return ftLanguageOption421 = null;

        ftCaseOption_return ftCaseOption422 = null;

        ftDiacriticsOption_return ftDiacriticsOption423 = null;

        ftExtensionOption_return ftExtensionOption424 = null;

        ftThesaurusOption_return ftThesaurusOption427 = null;

        ftStopwordOption_return ftStopwordOption429 = null;


        XQFTTree WITH425_tree=null;
        XQFTTree WILDCARDS426_tree=null;
        XQFTTree STEMMING428_tree=null;
        XQFTTree WITHOUT430_tree=null;
        XQFTTree WILDCARDS431_tree=null;
        XQFTTree THESAURUS432_tree=null;
        XQFTTree STEMMING433_tree=null;
        XQFTTree STOP434_tree=null;
        XQFTTree WORDS435_tree=null;

        try {
            // etc/XQFT.g:551:15: ( ftLanguageOption | ftCaseOption | ftDiacriticsOption | ftExtensionOption | WITH ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption ) | WITHOUT ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS ) )
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
                    new NoViableAltException("551:1: ftMatchOption : ( ftLanguageOption | ftCaseOption | ftDiacriticsOption | ftExtensionOption | WITH ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption ) | WITHOUT ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS ) );", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:552:5: ftLanguageOption
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption5314);
                    ftLanguageOption421=ftLanguageOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftLanguageOption421.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:553:7: ftCaseOption
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption5322);
                    ftCaseOption422=ftCaseOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftCaseOption422.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:554:7: ftDiacriticsOption
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption5330);
                    ftDiacriticsOption423=ftDiacriticsOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftDiacriticsOption423.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:555:7: ftExtensionOption
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption5338);
                    ftExtensionOption424=ftExtensionOption();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftExtensionOption424.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:556:7: WITH ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    WITH425=(Token)input.LT(1);
                    match(input,WITH,FOLLOW_WITH_in_ftMatchOption5346); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WITH425_tree = (XQFTTree)adaptor.create(WITH425);
                    root_0 = (XQFTTree)adaptor.becomeRoot(WITH425_tree, root_0);
                    }
                    // etc/XQFT.g:556:13: ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption )
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
                            new NoViableAltException("556:13: ( WILDCARDS | ftThesaurusOption | STEMMING | ftStopwordOption )", 99, 0, input);

                        throw nvae;
                    }

                    switch (alt99) {
                        case 1 :
                            // etc/XQFT.g:556:14: WILDCARDS
                            {
                            WILDCARDS426=(Token)input.LT(1);
                            match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftMatchOption5350); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WILDCARDS426_tree = (XQFTTree)adaptor.create(WILDCARDS426);
                            adaptor.addChild(root_0, WILDCARDS426_tree);
                            }

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:557:14: ftThesaurusOption
                            {
                            pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption5365);
                            ftThesaurusOption427=ftThesaurusOption();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftThesaurusOption427.getTree());

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:558:14: STEMMING
                            {
                            STEMMING428=(Token)input.LT(1);
                            match(input,STEMMING,FOLLOW_STEMMING_in_ftMatchOption5380); if (failed) return retval;
                            if ( backtracking==0 ) {
                            STEMMING428_tree = (XQFTTree)adaptor.create(STEMMING428);
                            adaptor.addChild(root_0, STEMMING428_tree);
                            }

                            }
                            break;
                        case 4 :
                            // etc/XQFT.g:559:14: ftStopwordOption
                            {
                            pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption5395);
                            ftStopwordOption429=ftStopwordOption();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftStopwordOption429.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 6 :
                    // etc/XQFT.g:561:7: WITHOUT ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    WITHOUT430=(Token)input.LT(1);
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftMatchOption5417); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WITHOUT430_tree = (XQFTTree)adaptor.create(WITHOUT430);
                    root_0 = (XQFTTree)adaptor.becomeRoot(WITHOUT430_tree, root_0);
                    }
                    // etc/XQFT.g:561:17: ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS )
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
                            new NoViableAltException("561:17: ( WILDCARDS | THESAURUS | STEMMING | STOP WORDS )", 100, 0, input);

                        throw nvae;
                    }

                    switch (alt100) {
                        case 1 :
                            // etc/XQFT.g:561:18: WILDCARDS
                            {
                            WILDCARDS431=(Token)input.LT(1);
                            match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftMatchOption5422); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WILDCARDS431_tree = (XQFTTree)adaptor.create(WILDCARDS431);
                            adaptor.addChild(root_0, WILDCARDS431_tree);
                            }

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:562:18: THESAURUS
                            {
                            THESAURUS432=(Token)input.LT(1);
                            match(input,THESAURUS,FOLLOW_THESAURUS_in_ftMatchOption5441); if (failed) return retval;
                            if ( backtracking==0 ) {
                            THESAURUS432_tree = (XQFTTree)adaptor.create(THESAURUS432);
                            adaptor.addChild(root_0, THESAURUS432_tree);
                            }

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:563:18: STEMMING
                            {
                            STEMMING433=(Token)input.LT(1);
                            match(input,STEMMING,FOLLOW_STEMMING_in_ftMatchOption5460); if (failed) return retval;
                            if ( backtracking==0 ) {
                            STEMMING433_tree = (XQFTTree)adaptor.create(STEMMING433);
                            adaptor.addChild(root_0, STEMMING433_tree);
                            }

                            }
                            break;
                        case 4 :
                            // etc/XQFT.g:564:18: STOP WORDS
                            {
                            STOP434=(Token)input.LT(1);
                            match(input,STOP,FOLLOW_STOP_in_ftMatchOption5479); if (failed) return retval;
                            if ( backtracking==0 ) {
                            STOP434_tree = (XQFTTree)adaptor.create(STOP434);
                            adaptor.addChild(root_0, STOP434_tree);
                            }
                            WORDS435=(Token)input.LT(1);
                            match(input,WORDS,FOLLOW_WORDS_in_ftMatchOption5481); if (failed) return retval;
                            if ( backtracking==0 ) {
                            WORDS435_tree = (XQFTTree)adaptor.create(WORDS435);
                            adaptor.addChild(root_0, WORDS435_tree);
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
    // etc/XQFT.g:568:5: ftLanguageOption : LANGUAGE StringLiteral ;
    public final ftLanguageOption_return ftLanguageOption() throws RecognitionException {
        ftLanguageOption_return retval = new ftLanguageOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LANGUAGE436=null;
        Token StringLiteral437=null;

        XQFTTree LANGUAGE436_tree=null;
        XQFTTree StringLiteral437_tree=null;

        try {
            // etc/XQFT.g:568:22: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:568:24: LANGUAGE StringLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            LANGUAGE436=(Token)input.LT(1);
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption5512); if (failed) return retval;
            if ( backtracking==0 ) {
            LANGUAGE436_tree = (XQFTTree)adaptor.create(LANGUAGE436);
            root_0 = (XQFTTree)adaptor.becomeRoot(LANGUAGE436_tree, root_0);
            }
            StringLiteral437=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption5515); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral437_tree = (XQFTTree)adaptor.create(StringLiteral437);
            adaptor.addChild(root_0, StringLiteral437_tree);
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
    // etc/XQFT.g:570:5: ftCaseOption : ( CASE ( INSENSITIVE | SENSITIVE ) | LOWERCASE | UPPERCASE );
    public final ftCaseOption_return ftCaseOption() throws RecognitionException {
        ftCaseOption_return retval = new ftCaseOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token CASE438=null;
        Token set439=null;
        Token LOWERCASE440=null;
        Token UPPERCASE441=null;

        XQFTTree CASE438_tree=null;
        XQFTTree set439_tree=null;
        XQFTTree LOWERCASE440_tree=null;
        XQFTTree UPPERCASE441_tree=null;

        try {
            // etc/XQFT.g:570:18: ( CASE ( INSENSITIVE | SENSITIVE ) | LOWERCASE | UPPERCASE )
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
                    new NoViableAltException("570:5: ftCaseOption : ( CASE ( INSENSITIVE | SENSITIVE ) | LOWERCASE | UPPERCASE );", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:571:9: CASE ( INSENSITIVE | SENSITIVE )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    CASE438=(Token)input.LT(1);
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption5536); if (failed) return retval;
                    if ( backtracking==0 ) {
                    CASE438_tree = (XQFTTree)adaptor.create(CASE438);
                    root_0 = (XQFTTree)adaptor.becomeRoot(CASE438_tree, root_0);
                    }
                    set439=(Token)input.LT(1);
                    if ( input.LA(1)==INSENSITIVE||input.LA(1)==SENSITIVE ) {
                        input.consume();
                        if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set439));
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftCaseOption5539);    throw mse;
                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:572:11: LOWERCASE
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    LOWERCASE440=(Token)input.LT(1);
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption5557); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LOWERCASE440_tree = (XQFTTree)adaptor.create(LOWERCASE440);
                    root_0 = (XQFTTree)adaptor.becomeRoot(LOWERCASE440_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:573:11: UPPERCASE
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    UPPERCASE441=(Token)input.LT(1);
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption5570); if (failed) return retval;
                    if ( backtracking==0 ) {
                    UPPERCASE441_tree = (XQFTTree)adaptor.create(UPPERCASE441);
                    root_0 = (XQFTTree)adaptor.becomeRoot(UPPERCASE441_tree, root_0);
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
    // etc/XQFT.g:576:5: ftDiacriticsOption : DIACRITICS ( INSENSITIVE | SENSITIVE ) ;
    public final ftDiacriticsOption_return ftDiacriticsOption() throws RecognitionException {
        ftDiacriticsOption_return retval = new ftDiacriticsOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DIACRITICS442=null;
        Token set443=null;

        XQFTTree DIACRITICS442_tree=null;
        XQFTTree set443_tree=null;

        try {
            // etc/XQFT.g:576:24: ( DIACRITICS ( INSENSITIVE | SENSITIVE ) )
            // etc/XQFT.g:576:26: DIACRITICS ( INSENSITIVE | SENSITIVE )
            {
            root_0 = (XQFTTree)adaptor.nil();

            DIACRITICS442=(Token)input.LT(1);
            match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption5596); if (failed) return retval;
            if ( backtracking==0 ) {
            DIACRITICS442_tree = (XQFTTree)adaptor.create(DIACRITICS442);
            root_0 = (XQFTTree)adaptor.becomeRoot(DIACRITICS442_tree, root_0);
            }
            set443=(Token)input.LT(1);
            if ( input.LA(1)==INSENSITIVE||input.LA(1)==SENSITIVE ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set443));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftDiacriticsOption5599);    throw mse;
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
    // etc/XQFT.g:578:5: ftExtensionOption : OPTION qName StringLiteral ;
    public final ftExtensionOption_return ftExtensionOption() throws RecognitionException {
        ftExtensionOption_return retval = new ftExtensionOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token OPTION444=null;
        Token StringLiteral446=null;
        qName_return qName445 = null;


        XQFTTree OPTION444_tree=null;
        XQFTTree StringLiteral446_tree=null;

        try {
            // etc/XQFT.g:578:23: ( OPTION qName StringLiteral )
            // etc/XQFT.g:578:25: OPTION qName StringLiteral
            {
            root_0 = (XQFTTree)adaptor.nil();

            OPTION444=(Token)input.LT(1);
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption5617); if (failed) return retval;
            if ( backtracking==0 ) {
            OPTION444_tree = (XQFTTree)adaptor.create(OPTION444);
            root_0 = (XQFTTree)adaptor.becomeRoot(OPTION444_tree, root_0);
            }
            pushFollow(FOLLOW_qName_in_ftExtensionOption5620);
            qName445=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, qName445.getTree());
            StringLiteral446=(Token)input.LT(1);
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption5622); if (failed) return retval;
            if ( backtracking==0 ) {
            StringLiteral446_tree = (XQFTTree)adaptor.create(StringLiteral446);
            adaptor.addChild(root_0, StringLiteral446_tree);
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
    // etc/XQFT.g:580:5: ftThesaurusOption : THESAURUS ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) ) ;
    public final ftThesaurusOption_return ftThesaurusOption() throws RecognitionException {
        ftThesaurusOption_return retval = new ftThesaurusOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token THESAURUS447=null;
        Token DEFAULT449=null;
        Token LPARSi450=null;
        Token DEFAULT452=null;
        Token COMMASi453=null;
        Token RPARSi455=null;
        ftThesaurusID_return ftThesaurusID448 = null;

        ftThesaurusID_return ftThesaurusID451 = null;

        ftThesaurusID_return ftThesaurusID454 = null;


        XQFTTree THESAURUS447_tree=null;
        XQFTTree DEFAULT449_tree=null;
        XQFTTree LPARSi450_tree=null;
        XQFTTree DEFAULT452_tree=null;
        XQFTTree COMMASi453_tree=null;
        XQFTTree RPARSi455_tree=null;

        try {
            // etc/XQFT.g:580:23: ( THESAURUS ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) ) )
            // etc/XQFT.g:581:9: THESAURUS ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) )
            {
            root_0 = (XQFTTree)adaptor.nil();

            THESAURUS447=(Token)input.LT(1);
            match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption5651); if (failed) return retval;
            if ( backtracking==0 ) {
            THESAURUS447_tree = (XQFTTree)adaptor.create(THESAURUS447);
            adaptor.addChild(root_0, THESAURUS447_tree);
            }
            // etc/XQFT.g:581:20: ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) )
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
                    new NoViableAltException("581:20: ( ( ftThesaurusID | DEFAULT ) | ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi ) )", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // etc/XQFT.g:582:13: ( ftThesaurusID | DEFAULT )
                    {
                    // etc/XQFT.g:582:13: ( ftThesaurusID | DEFAULT )
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
                            new NoViableAltException("582:13: ( ftThesaurusID | DEFAULT )", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // etc/XQFT.g:582:14: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption5669);
                            ftThesaurusID448=ftThesaurusID();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftThesaurusID448.getTree());

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:582:30: DEFAULT
                            {
                            DEFAULT449=(Token)input.LT(1);
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption5673); if (failed) return retval;
                            if ( backtracking==0 ) {
                            DEFAULT449_tree = (XQFTTree)adaptor.create(DEFAULT449);
                            adaptor.addChild(root_0, DEFAULT449_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:583:14: ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi )
                    {
                    // etc/XQFT.g:583:14: ( LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi )
                    // etc/XQFT.g:583:15: LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi
                    {
                    LPARSi450=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftThesaurusOption5690); if (failed) return retval;
                    // etc/XQFT.g:583:23: ( ftThesaurusID | DEFAULT )
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
                            new NoViableAltException("583:23: ( ftThesaurusID | DEFAULT )", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // etc/XQFT.g:583:24: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption5694);
                            ftThesaurusID451=ftThesaurusID();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) adaptor.addChild(root_0, ftThesaurusID451.getTree());

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:583:40: DEFAULT
                            {
                            DEFAULT452=(Token)input.LT(1);
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption5698); if (failed) return retval;
                            if ( backtracking==0 ) {
                            DEFAULT452_tree = (XQFTTree)adaptor.create(DEFAULT452);
                            adaptor.addChild(root_0, DEFAULT452_tree);
                            }

                            }
                            break;

                    }

                    // etc/XQFT.g:583:49: ( COMMASi ftThesaurusID )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==COMMASi) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // etc/XQFT.g:583:50: COMMASi ftThesaurusID
                    	    {
                    	    COMMASi453=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption5702); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    COMMASi453_tree = (XQFTTree)adaptor.create(COMMASi453);
                    	    adaptor.addChild(root_0, COMMASi453_tree);
                    	    }
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption5704);
                    	    ftThesaurusID454=ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, ftThesaurusID454.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    RPARSi455=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftThesaurusOption5708); if (failed) return retval;

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
    // etc/XQFT.g:586:9: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final ftThesaurusID_return ftThesaurusID() throws RecognitionException {
        ftThesaurusID_return retval = new ftThesaurusID_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AT456=null;
        Token RELATIONSHIP458=null;
        Token StringLiteral459=null;
        Token LEVELS461=null;
        uriLiteral_return uriLiteral457 = null;

        ftRange_return ftRange460 = null;


        XQFTTree AT456_tree=null;
        XQFTTree RELATIONSHIP458_tree=null;
        XQFTTree StringLiteral459_tree=null;
        XQFTTree LEVELS461_tree=null;

        try {
            // etc/XQFT.g:586:23: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:586:25: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            root_0 = (XQFTTree)adaptor.nil();

            AT456=(Token)input.LT(1);
            match(input,AT,FOLLOW_AT_in_ftThesaurusID5740); if (failed) return retval;
            if ( backtracking==0 ) {
            AT456_tree = (XQFTTree)adaptor.create(AT456);
            adaptor.addChild(root_0, AT456_tree);
            }
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID5742);
            uriLiteral457=uriLiteral();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral457.getTree());
            // etc/XQFT.g:586:39: ( RELATIONSHIP StringLiteral )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RELATIONSHIP) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // etc/XQFT.g:586:40: RELATIONSHIP StringLiteral
                    {
                    RELATIONSHIP458=(Token)input.LT(1);
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID5745); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RELATIONSHIP458_tree = (XQFTTree)adaptor.create(RELATIONSHIP458);
                    adaptor.addChild(root_0, RELATIONSHIP458_tree);
                    }
                    StringLiteral459=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID5747); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral459_tree = (XQFTTree)adaptor.create(StringLiteral459);
                    adaptor.addChild(root_0, StringLiteral459_tree);
                    }

                    }
                    break;

            }

            // etc/XQFT.g:586:69: ( ftRange LEVELS )?
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
                    // etc/XQFT.g:586:70: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID5752);
                    ftRange460=ftRange();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftRange460.getTree());
                    LEVELS461=(Token)input.LT(1);
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID5754); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LEVELS461_tree = (XQFTTree)adaptor.create(LEVELS461);
                    adaptor.addChild(root_0, LEVELS461_tree);
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
    // etc/XQFT.g:588:5: ftStopwordOption : ( STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );
    public final ftStopwordOption_return ftStopwordOption() throws RecognitionException {
        ftStopwordOption_return retval = new ftStopwordOption_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token STOP462=null;
        Token WORDS463=null;
        Token DEFAULT466=null;
        Token STOP467=null;
        Token WORDS468=null;
        ftRefOrList_return ftRefOrList464 = null;

        ftInclExclStringLiteral_return ftInclExclStringLiteral465 = null;

        ftInclExclStringLiteral_return ftInclExclStringLiteral469 = null;


        XQFTTree STOP462_tree=null;
        XQFTTree WORDS463_tree=null;
        XQFTTree DEFAULT466_tree=null;
        XQFTTree STOP467_tree=null;
        XQFTTree WORDS468_tree=null;

        try {
            // etc/XQFT.g:588:22: ( STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
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
                    new NoViableAltException("588:5: ftStopwordOption : ( STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:589:9: STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STOP462=(Token)input.LT(1);
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption5777); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STOP462_tree = (XQFTTree)adaptor.create(STOP462);
                    adaptor.addChild(root_0, STOP462_tree);
                    }
                    WORDS463=(Token)input.LT(1);
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption5779); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WORDS463_tree = (XQFTTree)adaptor.create(WORDS463);
                    adaptor.addChild(root_0, WORDS463_tree);
                    }
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption5781);
                    ftRefOrList464=ftRefOrList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ftRefOrList464.getTree());
                    // etc/XQFT.g:589:32: ( ftInclExclStringLiteral )*
                    loop109:
                    do {
                        int alt109=2;
                        int LA109_0 = input.LA(1);

                        if ( (LA109_0==EXCEPT||LA109_0==UNION) ) {
                            alt109=1;
                        }


                        switch (alt109) {
                    	case 1 :
                    	    // etc/XQFT.g:589:32: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption5783);
                    	    ftInclExclStringLiteral465=ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, ftInclExclStringLiteral465.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop109;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:590:11: DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    DEFAULT466=(Token)input.LT(1);
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption5796); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DEFAULT466_tree = (XQFTTree)adaptor.create(DEFAULT466);
                    adaptor.addChild(root_0, DEFAULT466_tree);
                    }
                    STOP467=(Token)input.LT(1);
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption5798); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STOP467_tree = (XQFTTree)adaptor.create(STOP467);
                    adaptor.addChild(root_0, STOP467_tree);
                    }
                    WORDS468=(Token)input.LT(1);
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption5800); if (failed) return retval;
                    if ( backtracking==0 ) {
                    WORDS468_tree = (XQFTTree)adaptor.create(WORDS468);
                    adaptor.addChild(root_0, WORDS468_tree);
                    }
                    // etc/XQFT.g:590:30: ( ftInclExclStringLiteral )*
                    loop110:
                    do {
                        int alt110=2;
                        int LA110_0 = input.LA(1);

                        if ( (LA110_0==EXCEPT||LA110_0==UNION) ) {
                            alt110=1;
                        }


                        switch (alt110) {
                    	case 1 :
                    	    // etc/XQFT.g:590:30: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption5802);
                    	    ftInclExclStringLiteral469=ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, ftInclExclStringLiteral469.getTree());

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
    // etc/XQFT.g:592:9: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );
    public final ftRefOrList_return ftRefOrList() throws RecognitionException {
        ftRefOrList_return retval = new ftRefOrList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token AT470=null;
        Token LPARSi472=null;
        Token StringLiteral473=null;
        Token COMMASi474=null;
        Token StringLiteral475=null;
        Token RPARSi476=null;
        uriLiteral_return uriLiteral471 = null;


        XQFTTree AT470_tree=null;
        XQFTTree LPARSi472_tree=null;
        XQFTTree StringLiteral473_tree=null;
        XQFTTree COMMASi474_tree=null;
        XQFTTree StringLiteral475_tree=null;
        XQFTTree RPARSi476_tree=null;

        try {
            // etc/XQFT.g:592:21: ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi )
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
                    new NoViableAltException("592:9: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // etc/XQFT.g:593:13: ( AT uriLiteral )
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    // etc/XQFT.g:593:13: ( AT uriLiteral )
                    // etc/XQFT.g:593:14: AT uriLiteral
                    {
                    AT470=(Token)input.LT(1);
                    match(input,AT,FOLLOW_AT_in_ftRefOrList5837); if (failed) return retval;
                    if ( backtracking==0 ) {
                    AT470_tree = (XQFTTree)adaptor.create(AT470);
                    adaptor.addChild(root_0, AT470_tree);
                    }
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList5839);
                    uriLiteral471=uriLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, uriLiteral471.getTree());

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:594:15: LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    LPARSi472=(Token)input.LT(1);
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftRefOrList5856); if (failed) return retval;
                    StringLiteral473=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList5859); if (failed) return retval;
                    if ( backtracking==0 ) {
                    StringLiteral473_tree = (XQFTTree)adaptor.create(StringLiteral473);
                    adaptor.addChild(root_0, StringLiteral473_tree);
                    }
                    // etc/XQFT.g:594:37: ( COMMASi StringLiteral )*
                    loop112:
                    do {
                        int alt112=2;
                        int LA112_0 = input.LA(1);

                        if ( (LA112_0==COMMASi) ) {
                            alt112=1;
                        }


                        switch (alt112) {
                    	case 1 :
                    	    // etc/XQFT.g:594:38: COMMASi StringLiteral
                    	    {
                    	    COMMASi474=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList5862); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    COMMASi474_tree = (XQFTTree)adaptor.create(COMMASi474);
                    	    adaptor.addChild(root_0, COMMASi474_tree);
                    	    }
                    	    StringLiteral475=(Token)input.LT(1);
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList5864); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    StringLiteral475_tree = (XQFTTree)adaptor.create(StringLiteral475);
                    	    adaptor.addChild(root_0, StringLiteral475_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop112;
                        }
                    } while (true);

                    RPARSi476=(Token)input.LT(1);
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftRefOrList5868); if (failed) return retval;

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
    // etc/XQFT.g:596:9: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final ftInclExclStringLiteral_return ftInclExclStringLiteral() throws RecognitionException {
        ftInclExclStringLiteral_return retval = new ftInclExclStringLiteral_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set477=null;
        ftRefOrList_return ftRefOrList478 = null;


        XQFTTree set477_tree=null;

        try {
            // etc/XQFT.g:596:33: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:596:35: ( UNION | EXCEPT ) ftRefOrList
            {
            root_0 = (XQFTTree)adaptor.nil();

            set477=(Token)input.LT(1);
            if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set477));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral5893);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral5901);
            ftRefOrList478=ftRefOrList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, ftRefOrList478.getTree());

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
    // etc/XQFT.g:600:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final valueExpr_return valueExpr() throws RecognitionException {
        valueExpr_return retval = new valueExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        validateExpr_return validateExpr479 = null;

        pathExpr_return pathExpr480 = null;

        extensionExpr_return extensionExpr481 = null;



        try {
            // etc/XQFT.g:600:11: ( validateExpr | pathExpr | extensionExpr )
            int alt114=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                int LA114_1 = input.LA(2);

                if ( (LA114_1==EOF||LA114_1==AND||LA114_1==ASCENDING||(LA114_1>=CASE && LA114_1<=CASTABLE)||LA114_1==COLLATION||LA114_1==DEFAULT||LA114_1==DESCENDING||LA114_1==DIV||LA114_1==ELSE||LA114_1==EMPTY||LA114_1==EQ||LA114_1==EXCEPT||LA114_1==FOR||LA114_1==FTCONTAINS||LA114_1==GE||(LA114_1>=GT && LA114_1<=IDIV)||(LA114_1>=INSTANCE && LA114_1<=IS)||LA114_1==LE||(LA114_1>=LET && LA114_1<=LEVELS)||(LA114_1>=LT && LA114_1<=MOD)||LA114_1==NE||(LA114_1>=OR && LA114_1<=ORDER)||LA114_1==PARAGRAPHS||LA114_1==RETURN||LA114_1==SATISFIES||LA114_1==SENTENCES||LA114_1==STABLE||(LA114_1>=TIMES && LA114_1<=TREAT)||LA114_1==UNION||LA114_1==WHERE||LA114_1==WITHOUT||LA114_1==WORDS||(LA114_1>=SEMICOLONSi && LA114_1<=COMMASi)||(LA114_1>=LPARSi && LA114_1<=RPARSi)||LA114_1==RBRACSi||(LA114_1>=STARSi && LA114_1<=NODEAFTERSi)||(LA114_1>=SLASHSi && LA114_1<=DBLSLASHSi)||LA114_1==COLONSi||(LA114_1>=LBRACKSi && LA114_1<=RBRACKSi)) ) {
                    alt114=2;
                }
                else if ( (LA114_1==LAX||LA114_1==STRICT||LA114_1==LBRACESi) ) {
                    alt114=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("600:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 114, 1, input);

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
            case QName:
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
                    new NoViableAltException("600:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // etc/XQFT.g:600:13: validateExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_validateExpr_in_valueExpr5923);
                    validateExpr479=validateExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, validateExpr479.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:600:28: pathExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_pathExpr_in_valueExpr5927);
                    pathExpr480=pathExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, pathExpr480.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:600:39: extensionExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_extensionExpr_in_valueExpr5931);
                    extensionExpr481=extensionExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, extensionExpr481.getTree());

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
    // etc/XQFT.g:601:5: validateExpr : VALIDATE ( validationMode )? LBRACESi expr RBRACSi ;
    public final validateExpr_return validateExpr() throws RecognitionException {
        validateExpr_return retval = new validateExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token VALIDATE482=null;
        Token LBRACESi484=null;
        Token RBRACSi486=null;
        validationMode_return validationMode483 = null;

        expr_return expr485 = null;


        XQFTTree VALIDATE482_tree=null;
        XQFTTree LBRACESi484_tree=null;
        XQFTTree RBRACSi486_tree=null;

        try {
            // etc/XQFT.g:601:18: ( VALIDATE ( validationMode )? LBRACESi expr RBRACSi )
            // etc/XQFT.g:601:20: VALIDATE ( validationMode )? LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            VALIDATE482=(Token)input.LT(1);
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr5942); if (failed) return retval;
            if ( backtracking==0 ) {
            VALIDATE482_tree = (XQFTTree)adaptor.create(VALIDATE482);
            adaptor.addChild(root_0, VALIDATE482_tree);
            }
            // etc/XQFT.g:601:29: ( validationMode )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==LAX||LA115_0==STRICT) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:601:29: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr5944);
                    validationMode483=validationMode();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, validationMode483.getTree());

                    }
                    break;

            }

            LBRACESi484=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_validateExpr5947); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_validateExpr5950);
            expr485=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr485.getTree());
            RBRACSi486=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_validateExpr5952); if (failed) return retval;

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
    // etc/XQFT.g:602:9: validationMode : ( LAX | STRICT );
    public final validationMode_return validationMode() throws RecognitionException {
        validationMode_return retval = new validationMode_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set487=null;

        XQFTTree set487_tree=null;

        try {
            // etc/XQFT.g:602:24: ( LAX | STRICT )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set487=(Token)input.LT(1);
            if ( input.LA(1)==LAX||input.LA(1)==STRICT ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set487));
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
    // etc/XQFT.g:604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );
    public final pathExpr_return pathExpr() throws RecognitionException {
        pathExpr_return retval = new pathExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token SLASHSi488=null;
        Token SLASHSi490=null;
        Token DBLSLASHSi491=null;
        relativePathExpr_return relativePathExpr489 = null;

        relativePathExpr_return relativePathExpr492 = null;

        relativePathExpr_return relativePathExpr493 = null;


        XQFTTree SLASHSi488_tree=null;
        XQFTTree SLASHSi490_tree=null;
        XQFTTree DBLSLASHSi491_tree=null;

        try {
            // etc/XQFT.g:604:14: ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr )
            int alt116=4;
            switch ( input.LA(1) ) {
            case SLASHSi:
                {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==CAST) ) {
                    int LA116_30 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 30, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==CASTABLE) ) {
                    int LA116_31 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 31, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==TREAT) ) {
                    int LA116_32 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 32, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==INSTANCE) ) {
                    int LA116_33 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 33, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==EXCEPT||LA116_1==INTERSECT) ) {
                    int LA116_34 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 34, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==UNION) ) {
                    int LA116_35 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 35, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==STARSi) ) {
                    int LA116_36 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 36, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==EOF||(LA116_1>=SEMICOLONSi && LA116_1<=COMMASi)||LA116_1==RPARSi||LA116_1==RBRACSi||(LA116_1>=PLUSSi && LA116_1<=NEQSi)||(LA116_1>=LTOREQSi && LA116_1<=NODEAFTERSi)||LA116_1==RBRACKSi) ) {
                    alt116=2;
                }
                else if ( (LA116_1==TO) ) {
                    int LA116_38 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 38, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==FTCONTAINS) ) {
                    int LA116_39 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 39, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==EQ||LA116_1==GE||LA116_1==GT||LA116_1==LE||LA116_1==LT||LA116_1==NE) ) {
                    int LA116_40 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 40, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==LTSi) ) {
                    int LA116_41 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 41, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==IS) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 42, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==AND) ) {
                    int LA116_43 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 43, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==OR) ) {
                    int LA116_44 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 44, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==WHERE) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 51, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==ORDER) ) {
                    int LA116_52 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 52, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==STABLE) ) {
                    int LA116_53 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 53, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==RETURN) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 54, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==FOR) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 55, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==LET) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 56, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==ASCENDING||LA116_1==DESCENDING) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 57, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==EMPTY) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 58, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==COLLATION) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 59, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==SATISFIES) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 60, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==DEFAULT) ) {
                    int LA116_61 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 61, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==CASE) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 62, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==ELSE) ) {
                    int LA116_63 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 63, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==WITHOUT) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 64, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==TIMES) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 65, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==PARAGRAPHS||LA116_1==SENTENCES||LA116_1==WORDS) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 66, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==LEVELS) ) {
                    int LA116_67 = input.LA(3);

                    if ( (synpred5()) ) {
                        alt116=1;
                    }
                    else if ( (true) ) {
                        alt116=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 67, input);

                        throw nvae;
                    }
                }
                else if ( ((LA116_1>=ANCESTOR && LA116_1<=ANCESTOR_OR_SELF)||LA116_1==PARENT||(LA116_1>=PRECEDING && LA116_1<=PRECEDING_SIBLING)) && (synpred5())) {
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
                else if ( (LA116_1==DIV||LA116_1==IDIV||LA116_1==MOD) ) {
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
                            new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 81, input);

                        throw nvae;
                    }
                }
                else if ( (LA116_1==ORDERED) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==QName) && (synpred5())) {
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
                else if ( (LA116_1==LCOMMENTSi) && (synpred5())) {
                    alt116=1;
                }
                else if ( (LA116_1==LPISi) && (synpred5())) {
                    alt116=1;
                }
                else if ( ((LA116_1>=ALL && LA116_1<=ANY)||LA116_1==AS||LA116_1==AT||(LA116_1>=BASE_URI && LA116_1<=BOUNDARYSPACE)||(LA116_1>=CONSTRUCTION && LA116_1<=DECLARE)||(LA116_1>=DIACRITICS && LA116_1<=DISTANCE)||(LA116_1>=ENCODING && LA116_1<=ENTIRE)||LA116_1==EMPTY_SEQUENCE||(LA116_1>=EVERY && LA116_1<=EXACTLY)||LA116_1==EXTERNAL||(LA116_1>=FROM && LA116_1<=FTAND)||(LA116_1>=FTNOT && LA116_1<=FUNCTION)||LA116_1==GREATEST||(LA116_1>=IF && LA116_1<=INSENSITIVE)||(LA116_1>=ITEM && LA116_1<=LAX)||LA116_1==LEAST||LA116_1==LOWERCASE||(LA116_1>=MODULE && LA116_1<=NAMESPACE)||(LA116_1>=NOINHERIT && LA116_1<=OPTION)||(LA116_1>=ORDERING && LA116_1<=PARAGRAPH)||LA116_1==PHRASE||LA116_1==PRESERVE||LA116_1==RELATIONSHIP||LA116_1==SAME||LA116_1==SCHEMA||LA116_1==SCORE||LA116_1==SENSITIVE||(LA116_1>=SENTENCE && LA116_1<=SOME)||(LA116_1>=START && LA116_1<=STRIP)||(LA116_1>=THESAURUS && LA116_1<=THEN)||LA116_1==TYPESWITCH||(LA116_1>=UPPERCASE && LA116_1<=WEIGHT)||(LA116_1>=WILDCARDS && LA116_1<=WITH)||LA116_1==WORD||LA116_1==XQUERY||LA116_1==NCName) && (synpred5())) {
                    alt116=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 1, input);

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
            case QName:
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
                    new NoViableAltException("604:5: pathExpr : ( ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | DBLSLASHSi relativePathExpr | relativePathExpr );", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // etc/XQFT.g:605:9: ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    SLASHSi488=(Token)input.LT(1);
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr6011); if (failed) return retval;
                    if ( backtracking==0 ) {
                    SLASHSi488_tree = (XQFTTree)adaptor.create(SLASHSi488);
                    root_0 = (XQFTTree)adaptor.becomeRoot(SLASHSi488_tree, root_0);
                    }
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6014);
                    relativePathExpr489=relativePathExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, relativePathExpr489.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:606:11: SLASHSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    SLASHSi490=(Token)input.LT(1);
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr6026); if (failed) return retval;
                    if ( backtracking==0 ) {
                    SLASHSi490_tree = (XQFTTree)adaptor.create(SLASHSi490);
                    root_0 = (XQFTTree)adaptor.becomeRoot(SLASHSi490_tree, root_0);
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:607:11: DBLSLASHSi relativePathExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    DBLSLASHSi491=(Token)input.LT(1);
                    match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_pathExpr6039); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DBLSLASHSi491_tree = (XQFTTree)adaptor.create(DBLSLASHSi491);
                    root_0 = (XQFTTree)adaptor.becomeRoot(DBLSLASHSi491_tree, root_0);
                    }
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6042);
                    relativePathExpr492=relativePathExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, relativePathExpr492.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:608:11: relativePathExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6054);
                    relativePathExpr493=relativePathExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, relativePathExpr493.getTree());

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
    // etc/XQFT.g:611:9: relativePathExpr : stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* ;
    public final relativePathExpr_return relativePathExpr() throws RecognitionException {
        relativePathExpr_return retval = new relativePathExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token SLASHSi495=null;
        Token DBLSLASHSi496=null;
        stepExpr_return stepExpr494 = null;

        stepExpr_return stepExpr497 = null;


        XQFTTree SLASHSi495_tree=null;
        XQFTTree DBLSLASHSi496_tree=null;

        try {
            // etc/XQFT.g:611:26: ( stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* )
            // etc/XQFT.g:611:28: stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_stepExpr_in_relativePathExpr6075);
            stepExpr494=stepExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, stepExpr494.getTree());
            // etc/XQFT.g:611:37: ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( ((LA118_0>=SLASHSi && LA118_0<=DBLSLASHSi)) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // etc/XQFT.g:611:38: ( SLASHSi | DBLSLASHSi ) stepExpr
            	    {
            	    // etc/XQFT.g:611:38: ( SLASHSi | DBLSLASHSi )
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
            	            new NoViableAltException("611:38: ( SLASHSi | DBLSLASHSi )", 117, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // etc/XQFT.g:611:39: SLASHSi
            	            {
            	            SLASHSi495=(Token)input.LT(1);
            	            match(input,SLASHSi,FOLLOW_SLASHSi_in_relativePathExpr6079); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            SLASHSi495_tree = (XQFTTree)adaptor.create(SLASHSi495);
            	            root_0 = (XQFTTree)adaptor.becomeRoot(SLASHSi495_tree, root_0);
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:611:50: DBLSLASHSi
            	            {
            	            DBLSLASHSi496=(Token)input.LT(1);
            	            match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_relativePathExpr6084); if (failed) return retval;
            	            if ( backtracking==0 ) {
            	            DBLSLASHSi496_tree = (XQFTTree)adaptor.create(DBLSLASHSi496);
            	            root_0 = (XQFTTree)adaptor.becomeRoot(DBLSLASHSi496_tree, root_0);
            	            }

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr6088);
            	    stepExpr497=stepExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, stepExpr497.getTree());

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
    // etc/XQFT.g:613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );
    public final stepExpr_return stepExpr() throws RecognitionException {
        stepExpr_return retval = new stepExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        axisStep_return axisStep498 = null;

        axisStep_return axisStep499 = null;

        filterExpr_return filterExpr500 = null;



        try {
            // etc/XQFT.g:613:22: ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr )
            int alt119=3;
            switch ( input.LA(1) ) {
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
                {
                int LA119_1 = input.LA(2);

                if ( (LA119_1==LPARSi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 1, input);

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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 2, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA119_3 = input.LA(2);

                if ( ((LA119_3>=ALL && LA119_3<=XQUERY)||(LA119_3>=QName && LA119_3<=LPARSi)||LA119_3==LBRACESi||LA119_3==NCName) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 3, input);

                    throw nvae;
                }
                }
                break;
            case ATSi:
                {
                switch ( input.LA(2) ) {
                case DOCUMENT_NODE:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 169, input);

                        throw nvae;
                    }
                    }
                    break;
                case ELEMENT:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 170, input);

                        throw nvae;
                    }
                    }
                    break;
                case ATTRIBUTE:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 171, input);

                        throw nvae;
                    }
                    }
                    break;
                case SCHEMA_ELEMENT:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 172, input);

                        throw nvae;
                    }
                    }
                    break;
                case SCHEMA_ATTRIBUTE:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 173, input);

                        throw nvae;
                    }
                    }
                    break;
                case PROCESSING_INSTRUCTION:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 174, input);

                        throw nvae;
                    }
                    }
                    break;
                case COMMENT:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 175, input);

                        throw nvae;
                    }
                    }
                    break;
                case TEXT:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 176, input);

                        throw nvae;
                    }
                    }
                    break;
                case NODE:
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
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 177, input);

                        throw nvae;
                    }
                    }
                    break;
                case STARSi:
                    {
                    int LA119_178 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 178, input);

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
                    int LA119_179 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 179, input);

                        throw nvae;
                    }
                    }
                    break;
                case QName:
                    {
                    int LA119_180 = input.LA(3);

                    if ( (synpred6()) ) {
                        alt119=1;
                    }
                    else if ( (true) ) {
                        alt119=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 180, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 4, input);

                    throw nvae;
                }

                }
                break;
            case DOCUMENT_NODE:
                {
                int LA119_5 = input.LA(2);

                if ( (LA119_5==LPARSi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 5, input);

                    throw nvae;
                }
                }
                break;
            case ELEMENT:
                {
                int LA119_6 = input.LA(2);

                if ( ((LA119_6>=ALL && LA119_6<=XQUERY)||(LA119_6>=QName && LA119_6<=LPARSi)||LA119_6==LBRACESi||LA119_6==NCName) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 6, input);

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

                if ( (LA119_7==LPARSi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 7, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ELEMENT:
                {
                int LA119_8 = input.LA(2);

                if ( (LA119_8==LPARSi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 8, input);

                    throw nvae;
                }
                }
                break;
            case SCHEMA_ATTRIBUTE:
                {
                int LA119_9 = input.LA(2);

                if ( (LA119_9==LPARSi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 9, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA119_10 = input.LA(2);

                if ( ((LA119_10>=ALL && LA119_10<=XQUERY)||LA119_10==LPARSi||LA119_10==LBRACESi||LA119_10==NCName) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 10, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA119_11 = input.LA(2);

                if ( (LA119_11==LPARSi||LA119_11==LBRACESi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 11, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA119_12 = input.LA(2);

                if ( (LA119_12==LPARSi||LA119_12==LBRACESi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 12, input);

                    throw nvae;
                }
                }
                break;
            case NODE:
                {
                int LA119_13 = input.LA(2);

                if ( (LA119_13==LPARSi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 13, input);

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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 14, input);

                    throw nvae;
                }
                }
                break;
            case ORDERED:
                {
                int LA119_15 = input.LA(2);

                if ( (LA119_15==LPARSi||LA119_15==LBRACESi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 15, input);

                    throw nvae;
                }
                }
                break;
            case QName:
                {
                int LA119_16 = input.LA(2);

                if ( (LA119_16==LPARSi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 16, input);

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
                int LA119_22 = input.LA(2);

                if ( (LA119_22==LPARSi||LA119_22==LBRACESi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 22, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENT:
                {
                int LA119_23 = input.LA(2);

                if ( (LA119_23==LPARSi||LA119_23==LBRACESi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 23, input);

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
                int LA119_27 = input.LA(2);

                if ( (LA119_27==LPARSi) ) {
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
                        new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 27, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("613:13: stepExpr : ( ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep | axisStep | filterExpr );", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:614:17: ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )=> axisStep
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_axisStep_in_stepExpr6234);
                    axisStep498=axisStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, axisStep498.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:618:19: axisStep
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_axisStep_in_stepExpr6254);
                    axisStep499=axisStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, axisStep499.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:619:19: filterExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_filterExpr_in_stepExpr6274);
                    filterExpr500=filterExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, filterExpr500.getTree());

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
    // etc/XQFT.g:622:13: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final axisStep_return axisStep() throws RecognitionException {
        axisStep_return retval = new axisStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        reverseStep_return reverseStep501 = null;

        forwardStep_return forwardStep502 = null;

        predicateList_return predicateList503 = null;



        try {
            // etc/XQFT.g:622:22: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:622:24: ( reverseStep | forwardStep ) predicateList
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:622:24: ( reverseStep | forwardStep )
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
                else if ( (LA120_1==EOF||LA120_1==AND||LA120_1==ASCENDING||(LA120_1>=CASE && LA120_1<=CASTABLE)||LA120_1==COLLATION||LA120_1==DEFAULT||LA120_1==DESCENDING||LA120_1==DIV||LA120_1==ELSE||LA120_1==EMPTY||LA120_1==EQ||LA120_1==EXCEPT||LA120_1==FOR||LA120_1==FTCONTAINS||LA120_1==GE||(LA120_1>=GT && LA120_1<=IDIV)||(LA120_1>=INSTANCE && LA120_1<=IS)||LA120_1==LE||(LA120_1>=LET && LA120_1<=LEVELS)||(LA120_1>=LT && LA120_1<=MOD)||LA120_1==NE||(LA120_1>=OR && LA120_1<=ORDER)||LA120_1==PARAGRAPHS||LA120_1==RETURN||LA120_1==SATISFIES||LA120_1==SENTENCES||LA120_1==STABLE||(LA120_1>=TIMES && LA120_1<=TREAT)||LA120_1==UNION||LA120_1==WHERE||LA120_1==WITHOUT||LA120_1==WORDS||(LA120_1>=SEMICOLONSi && LA120_1<=COMMASi)||LA120_1==RPARSi||LA120_1==RBRACSi||(LA120_1>=STARSi && LA120_1<=NODEAFTERSi)||(LA120_1>=SLASHSi && LA120_1<=DBLSLASHSi)||LA120_1==COLONSi||(LA120_1>=LBRACKSi && LA120_1<=RBRACKSi)) ) {
                    alt120=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("622:24: ( reverseStep | forwardStep )", 120, 1, input);

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
            case QName:
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
                    new NoViableAltException("622:24: ( reverseStep | forwardStep )", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:622:25: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep6308);
                    reverseStep501=reverseStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, reverseStep501.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:622:39: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep6312);
                    forwardStep502=forwardStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, forwardStep502.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep6316);
            predicateList503=predicateList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, predicateList503.getTree());

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
    // etc/XQFT.g:623:17: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );
    public final reverseStep_return reverseStep() throws RecognitionException {
        reverseStep_return retval = new reverseStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        reverseAxis_return reverseAxis504 = null;

        nodeTest_return nodeTest505 = null;

        abbrevReverseStep_return abbrevReverseStep506 = null;



        try {
            // etc/XQFT.g:623:29: ( reverseAxis nodeTest | abbrevReverseStep )
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
                    new NoViableAltException("623:17: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // etc/XQFT.g:623:31: reverseAxis nodeTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_reverseAxis_in_reverseStep6339);
                    reverseAxis504=reverseAxis();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, reverseAxis504.getTree());
                    pushFollow(FOLLOW_nodeTest_in_reverseStep6341);
                    nodeTest505=nodeTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, nodeTest505.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:623:54: abbrevReverseStep
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep6345);
                    abbrevReverseStep506=abbrevReverseStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, abbrevReverseStep506.getTree());

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
    // etc/XQFT.g:624:21: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi ;
    public final reverseAxis_return reverseAxis() throws RecognitionException {
        reverseAxis_return retval = new reverseAxis_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set507=null;
        Token DBLCOLONSi508=null;

        XQFTTree set507_tree=null;
        XQFTTree DBLCOLONSi508_tree=null;

        try {
            // etc/XQFT.g:624:33: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi )
            // etc/XQFT.g:624:35: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            set507=(Token)input.LT(1);
            if ( (input.LA(1)>=ANCESTOR && input.LA(1)<=ANCESTOR_OR_SELF)||input.LA(1)==PARENT||(input.LA(1)>=PRECEDING && input.LA(1)<=PRECEDING_SIBLING) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set507));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis6372);    throw mse;
            }

            DBLCOLONSi508=(Token)input.LT(1);
            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_reverseAxis6392); if (failed) return retval;
            if ( backtracking==0 ) {
            DBLCOLONSi508_tree = (XQFTTree)adaptor.create(DBLCOLONSi508);
            adaptor.addChild(root_0, DBLCOLONSi508_tree);
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
    // etc/XQFT.g:625:21: nodeTest : ( kindTest | nameTest );
    public final nodeTest_return nodeTest() throws RecognitionException {
        nodeTest_return retval = new nodeTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        kindTest_return kindTest509 = null;

        nameTest_return nameTest510 = null;



        try {
            // etc/XQFT.g:625:30: ( kindTest | nameTest )
            int alt122=2;
            switch ( input.LA(1) ) {
            case DOCUMENT_NODE:
                {
                int LA122_1 = input.LA(2);

                if ( (LA122_1==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_1==EOF||LA122_1==AND||LA122_1==ASCENDING||(LA122_1>=CASE && LA122_1<=CASTABLE)||LA122_1==COLLATION||LA122_1==DEFAULT||LA122_1==DESCENDING||LA122_1==DIV||LA122_1==ELSE||LA122_1==EMPTY||LA122_1==EQ||LA122_1==EXCEPT||LA122_1==FOR||LA122_1==FTCONTAINS||LA122_1==GE||(LA122_1>=GT && LA122_1<=IDIV)||(LA122_1>=INSTANCE && LA122_1<=IS)||LA122_1==LE||(LA122_1>=LET && LA122_1<=LEVELS)||(LA122_1>=LT && LA122_1<=MOD)||LA122_1==NE||(LA122_1>=OR && LA122_1<=ORDER)||LA122_1==PARAGRAPHS||LA122_1==RETURN||LA122_1==SATISFIES||LA122_1==SENTENCES||LA122_1==STABLE||(LA122_1>=TIMES && LA122_1<=TREAT)||LA122_1==UNION||LA122_1==WHERE||LA122_1==WITHOUT||LA122_1==WORDS||(LA122_1>=SEMICOLONSi && LA122_1<=COMMASi)||LA122_1==RPARSi||LA122_1==RBRACSi||(LA122_1>=STARSi && LA122_1<=NODEAFTERSi)||(LA122_1>=SLASHSi && LA122_1<=DBLSLASHSi)||LA122_1==COLONSi||(LA122_1>=LBRACKSi && LA122_1<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 1, input);

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
                else if ( (LA122_2==EOF||LA122_2==AND||LA122_2==ASCENDING||(LA122_2>=CASE && LA122_2<=CASTABLE)||LA122_2==COLLATION||LA122_2==DEFAULT||LA122_2==DESCENDING||LA122_2==DIV||LA122_2==ELSE||LA122_2==EMPTY||LA122_2==EQ||LA122_2==EXCEPT||LA122_2==FOR||LA122_2==FTCONTAINS||LA122_2==GE||(LA122_2>=GT && LA122_2<=IDIV)||(LA122_2>=INSTANCE && LA122_2<=IS)||LA122_2==LE||(LA122_2>=LET && LA122_2<=LEVELS)||(LA122_2>=LT && LA122_2<=MOD)||LA122_2==NE||(LA122_2>=OR && LA122_2<=ORDER)||LA122_2==PARAGRAPHS||LA122_2==RETURN||LA122_2==SATISFIES||LA122_2==SENTENCES||LA122_2==STABLE||(LA122_2>=TIMES && LA122_2<=TREAT)||LA122_2==UNION||LA122_2==WHERE||LA122_2==WITHOUT||LA122_2==WORDS||(LA122_2>=SEMICOLONSi && LA122_2<=COMMASi)||LA122_2==RPARSi||LA122_2==RBRACSi||(LA122_2>=STARSi && LA122_2<=NODEAFTERSi)||(LA122_2>=SLASHSi && LA122_2<=DBLSLASHSi)||LA122_2==COLONSi||(LA122_2>=LBRACKSi && LA122_2<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 2, input);

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
                else if ( (LA122_3==EOF||LA122_3==AND||LA122_3==ASCENDING||(LA122_3>=CASE && LA122_3<=CASTABLE)||LA122_3==COLLATION||LA122_3==DEFAULT||LA122_3==DESCENDING||LA122_3==DIV||LA122_3==ELSE||LA122_3==EMPTY||LA122_3==EQ||LA122_3==EXCEPT||LA122_3==FOR||LA122_3==FTCONTAINS||LA122_3==GE||(LA122_3>=GT && LA122_3<=IDIV)||(LA122_3>=INSTANCE && LA122_3<=IS)||LA122_3==LE||(LA122_3>=LET && LA122_3<=LEVELS)||(LA122_3>=LT && LA122_3<=MOD)||LA122_3==NE||(LA122_3>=OR && LA122_3<=ORDER)||LA122_3==PARAGRAPHS||LA122_3==RETURN||LA122_3==SATISFIES||LA122_3==SENTENCES||LA122_3==STABLE||(LA122_3>=TIMES && LA122_3<=TREAT)||LA122_3==UNION||LA122_3==WHERE||LA122_3==WITHOUT||LA122_3==WORDS||(LA122_3>=SEMICOLONSi && LA122_3<=COMMASi)||LA122_3==RPARSi||LA122_3==RBRACSi||(LA122_3>=STARSi && LA122_3<=NODEAFTERSi)||(LA122_3>=SLASHSi && LA122_3<=DBLSLASHSi)||LA122_3==COLONSi||(LA122_3>=LBRACKSi && LA122_3<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 3, input);

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
                else if ( (LA122_4==EOF||LA122_4==AND||LA122_4==ASCENDING||(LA122_4>=CASE && LA122_4<=CASTABLE)||LA122_4==COLLATION||LA122_4==DEFAULT||LA122_4==DESCENDING||LA122_4==DIV||LA122_4==ELSE||LA122_4==EMPTY||LA122_4==EQ||LA122_4==EXCEPT||LA122_4==FOR||LA122_4==FTCONTAINS||LA122_4==GE||(LA122_4>=GT && LA122_4<=IDIV)||(LA122_4>=INSTANCE && LA122_4<=IS)||LA122_4==LE||(LA122_4>=LET && LA122_4<=LEVELS)||(LA122_4>=LT && LA122_4<=MOD)||LA122_4==NE||(LA122_4>=OR && LA122_4<=ORDER)||LA122_4==PARAGRAPHS||LA122_4==RETURN||LA122_4==SATISFIES||LA122_4==SENTENCES||LA122_4==STABLE||(LA122_4>=TIMES && LA122_4<=TREAT)||LA122_4==UNION||LA122_4==WHERE||LA122_4==WITHOUT||LA122_4==WORDS||(LA122_4>=SEMICOLONSi && LA122_4<=COMMASi)||LA122_4==RPARSi||LA122_4==RBRACSi||(LA122_4>=STARSi && LA122_4<=NODEAFTERSi)||(LA122_4>=SLASHSi && LA122_4<=DBLSLASHSi)||LA122_4==COLONSi||(LA122_4>=LBRACKSi && LA122_4<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 4, input);

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
                else if ( (LA122_5==EOF||LA122_5==AND||LA122_5==ASCENDING||(LA122_5>=CASE && LA122_5<=CASTABLE)||LA122_5==COLLATION||LA122_5==DEFAULT||LA122_5==DESCENDING||LA122_5==DIV||LA122_5==ELSE||LA122_5==EMPTY||LA122_5==EQ||LA122_5==EXCEPT||LA122_5==FOR||LA122_5==FTCONTAINS||LA122_5==GE||(LA122_5>=GT && LA122_5<=IDIV)||(LA122_5>=INSTANCE && LA122_5<=IS)||LA122_5==LE||(LA122_5>=LET && LA122_5<=LEVELS)||(LA122_5>=LT && LA122_5<=MOD)||LA122_5==NE||(LA122_5>=OR && LA122_5<=ORDER)||LA122_5==PARAGRAPHS||LA122_5==RETURN||LA122_5==SATISFIES||LA122_5==SENTENCES||LA122_5==STABLE||(LA122_5>=TIMES && LA122_5<=TREAT)||LA122_5==UNION||LA122_5==WHERE||LA122_5==WITHOUT||LA122_5==WORDS||(LA122_5>=SEMICOLONSi && LA122_5<=COMMASi)||LA122_5==RPARSi||LA122_5==RBRACSi||(LA122_5>=STARSi && LA122_5<=NODEAFTERSi)||(LA122_5>=SLASHSi && LA122_5<=DBLSLASHSi)||LA122_5==COLONSi||(LA122_5>=LBRACKSi && LA122_5<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 5, input);

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
                else if ( (LA122_6==EOF||LA122_6==AND||LA122_6==ASCENDING||(LA122_6>=CASE && LA122_6<=CASTABLE)||LA122_6==COLLATION||LA122_6==DEFAULT||LA122_6==DESCENDING||LA122_6==DIV||LA122_6==ELSE||LA122_6==EMPTY||LA122_6==EQ||LA122_6==EXCEPT||LA122_6==FOR||LA122_6==FTCONTAINS||LA122_6==GE||(LA122_6>=GT && LA122_6<=IDIV)||(LA122_6>=INSTANCE && LA122_6<=IS)||LA122_6==LE||(LA122_6>=LET && LA122_6<=LEVELS)||(LA122_6>=LT && LA122_6<=MOD)||LA122_6==NE||(LA122_6>=OR && LA122_6<=ORDER)||LA122_6==PARAGRAPHS||LA122_6==RETURN||LA122_6==SATISFIES||LA122_6==SENTENCES||LA122_6==STABLE||(LA122_6>=TIMES && LA122_6<=TREAT)||LA122_6==UNION||LA122_6==WHERE||LA122_6==WITHOUT||LA122_6==WORDS||(LA122_6>=SEMICOLONSi && LA122_6<=COMMASi)||LA122_6==RPARSi||LA122_6==RBRACSi||(LA122_6>=STARSi && LA122_6<=NODEAFTERSi)||(LA122_6>=SLASHSi && LA122_6<=DBLSLASHSi)||LA122_6==COLONSi||(LA122_6>=LBRACKSi && LA122_6<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 6, input);

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
                else if ( (LA122_7==EOF||LA122_7==AND||LA122_7==ASCENDING||(LA122_7>=CASE && LA122_7<=CASTABLE)||LA122_7==COLLATION||LA122_7==DEFAULT||LA122_7==DESCENDING||LA122_7==DIV||LA122_7==ELSE||LA122_7==EMPTY||LA122_7==EQ||LA122_7==EXCEPT||LA122_7==FOR||LA122_7==FTCONTAINS||LA122_7==GE||(LA122_7>=GT && LA122_7<=IDIV)||(LA122_7>=INSTANCE && LA122_7<=IS)||LA122_7==LE||(LA122_7>=LET && LA122_7<=LEVELS)||(LA122_7>=LT && LA122_7<=MOD)||LA122_7==NE||(LA122_7>=OR && LA122_7<=ORDER)||LA122_7==PARAGRAPHS||LA122_7==RETURN||LA122_7==SATISFIES||LA122_7==SENTENCES||LA122_7==STABLE||(LA122_7>=TIMES && LA122_7<=TREAT)||LA122_7==UNION||LA122_7==WHERE||LA122_7==WITHOUT||LA122_7==WORDS||(LA122_7>=SEMICOLONSi && LA122_7<=COMMASi)||LA122_7==RPARSi||LA122_7==RBRACSi||(LA122_7>=STARSi && LA122_7<=NODEAFTERSi)||(LA122_7>=SLASHSi && LA122_7<=DBLSLASHSi)||LA122_7==COLONSi||(LA122_7>=LBRACKSi && LA122_7<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 7, input);

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
                else if ( (LA122_8==EOF||LA122_8==AND||LA122_8==ASCENDING||(LA122_8>=CASE && LA122_8<=CASTABLE)||LA122_8==COLLATION||LA122_8==DEFAULT||LA122_8==DESCENDING||LA122_8==DIV||LA122_8==ELSE||LA122_8==EMPTY||LA122_8==EQ||LA122_8==EXCEPT||LA122_8==FOR||LA122_8==FTCONTAINS||LA122_8==GE||(LA122_8>=GT && LA122_8<=IDIV)||(LA122_8>=INSTANCE && LA122_8<=IS)||LA122_8==LE||(LA122_8>=LET && LA122_8<=LEVELS)||(LA122_8>=LT && LA122_8<=MOD)||LA122_8==NE||(LA122_8>=OR && LA122_8<=ORDER)||LA122_8==PARAGRAPHS||LA122_8==RETURN||LA122_8==SATISFIES||LA122_8==SENTENCES||LA122_8==STABLE||(LA122_8>=TIMES && LA122_8<=TREAT)||LA122_8==UNION||LA122_8==WHERE||LA122_8==WITHOUT||LA122_8==WORDS||(LA122_8>=SEMICOLONSi && LA122_8<=COMMASi)||LA122_8==RPARSi||LA122_8==RBRACSi||(LA122_8>=STARSi && LA122_8<=NODEAFTERSi)||(LA122_8>=SLASHSi && LA122_8<=DBLSLASHSi)||LA122_8==COLONSi||(LA122_8>=LBRACKSi && LA122_8<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 8, input);

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
                else if ( (LA122_9==EOF||LA122_9==AND||LA122_9==ASCENDING||(LA122_9>=CASE && LA122_9<=CASTABLE)||LA122_9==COLLATION||LA122_9==DEFAULT||LA122_9==DESCENDING||LA122_9==DIV||LA122_9==ELSE||LA122_9==EMPTY||LA122_9==EQ||LA122_9==EXCEPT||LA122_9==FOR||LA122_9==FTCONTAINS||LA122_9==GE||(LA122_9>=GT && LA122_9<=IDIV)||(LA122_9>=INSTANCE && LA122_9<=IS)||LA122_9==LE||(LA122_9>=LET && LA122_9<=LEVELS)||(LA122_9>=LT && LA122_9<=MOD)||LA122_9==NE||(LA122_9>=OR && LA122_9<=ORDER)||LA122_9==PARAGRAPHS||LA122_9==RETURN||LA122_9==SATISFIES||LA122_9==SENTENCES||LA122_9==STABLE||(LA122_9>=TIMES && LA122_9<=TREAT)||LA122_9==UNION||LA122_9==WHERE||LA122_9==WITHOUT||LA122_9==WORDS||(LA122_9>=SEMICOLONSi && LA122_9<=COMMASi)||LA122_9==RPARSi||LA122_9==RBRACSi||(LA122_9>=STARSi && LA122_9<=NODEAFTERSi)||(LA122_9>=SLASHSi && LA122_9<=DBLSLASHSi)||LA122_9==COLONSi||(LA122_9>=LBRACKSi && LA122_9<=RBRACKSi)) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 9, input);

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
            case QName:
            case STARSi:
            case NCName:
                {
                alt122=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("625:21: nodeTest : ( kindTest | nameTest );", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:625:32: kindTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_kindTest_in_nodeTest6419);
                    kindTest509=kindTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, kindTest509.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:625:43: nameTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_nameTest_in_nodeTest6423);
                    nameTest510=nameTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, nameTest510.getTree());

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
    // etc/XQFT.g:626:25: nameTest : ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName );
    public final nameTest_return nameTest() throws RecognitionException {
        nameTest_return retval = new nameTest_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        wildcard_return wildcard511 = null;

        qName_return qName512 = null;



        try {
            // etc/XQFT.g:626:34: ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==STARSi) && (synpred7())) {
                alt123=1;
            }
            else if ( ((LA123_0>=ALL && LA123_0<=XQUERY)||LA123_0==NCName) ) {
                int LA123_2 = input.LA(2);

                if ( (LA123_2==EOF||LA123_2==AND||LA123_2==ASCENDING||(LA123_2>=CASE && LA123_2<=CASTABLE)||LA123_2==COLLATION||LA123_2==DEFAULT||LA123_2==DESCENDING||LA123_2==DIV||LA123_2==ELSE||LA123_2==EMPTY||LA123_2==EQ||LA123_2==EXCEPT||LA123_2==FOR||LA123_2==FTCONTAINS||LA123_2==GE||(LA123_2>=GT && LA123_2<=IDIV)||(LA123_2>=INSTANCE && LA123_2<=IS)||LA123_2==LE||(LA123_2>=LET && LA123_2<=LEVELS)||(LA123_2>=LT && LA123_2<=MOD)||LA123_2==NE||(LA123_2>=OR && LA123_2<=ORDER)||LA123_2==PARAGRAPHS||LA123_2==RETURN||LA123_2==SATISFIES||LA123_2==SENTENCES||LA123_2==STABLE||(LA123_2>=TIMES && LA123_2<=TREAT)||LA123_2==UNION||LA123_2==WHERE||LA123_2==WITHOUT||LA123_2==WORDS||(LA123_2>=SEMICOLONSi && LA123_2<=COMMASi)||LA123_2==RPARSi||LA123_2==RBRACSi||(LA123_2>=STARSi && LA123_2<=NODEAFTERSi)||(LA123_2>=SLASHSi && LA123_2<=DBLSLASHSi)||(LA123_2>=LBRACKSi && LA123_2<=RBRACKSi)) ) {
                    alt123=2;
                }
                else if ( (LA123_2==COLONSi) && (synpred7())) {
                    alt123=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("626:25: nameTest : ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName );", 123, 2, input);

                    throw nvae;
                }
            }
            else if ( (LA123_0==QName) ) {
                alt123=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("626:25: nameTest : ( ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard | qName );", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:627:29: ( STARSi | ncNameorKeyword COLONSi STARSi )=> wildcard
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_wildcard_in_nameTest6497);
                    wildcard511=wildcard();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, wildcard511.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:628:31: qName
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_qName_in_nameTest6529);
                    qName512=qName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, qName512.getTree());

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
    // etc/XQFT.g:630:29: wildcard : ( ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword | STARSi | ncNameorKeyword COLONSi STARSi );
    public final wildcard_return wildcard() throws RecognitionException {
        wildcard_return retval = new wildcard_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token STARSi513=null;
        Token COLONSi514=null;
        Token STARSi516=null;
        Token COLONSi518=null;
        Token STARSi519=null;
        ncNameorKeyword_return ncNameorKeyword515 = null;

        ncNameorKeyword_return ncNameorKeyword517 = null;


        XQFTTree STARSi513_tree=null;
        XQFTTree COLONSi514_tree=null;
        XQFTTree STARSi516_tree=null;
        XQFTTree COLONSi518_tree=null;
        XQFTTree STARSi519_tree=null;

        try {
            // etc/XQFT.g:630:38: ( ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword | STARSi | ncNameorKeyword COLONSi STARSi )
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
                        new NoViableAltException("630:29: wildcard : ( ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword | STARSi | ncNameorKeyword COLONSi STARSi );", 124, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA124_0>=ALL && LA124_0<=XQUERY)||LA124_0==NCName) ) {
                alt124=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("630:29: wildcard : ( ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword | STARSi | ncNameorKeyword COLONSi STARSi );", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // etc/XQFT.g:631:33: ( STARSi COLONSi )=> STARSi COLONSi ncNameorKeyword
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STARSi513=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard6631); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STARSi513_tree = (XQFTTree)adaptor.create(STARSi513);
                    adaptor.addChild(root_0, STARSi513_tree);
                    }
                    COLONSi514=(Token)input.LT(1);
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard6633); if (failed) return retval;
                    if ( backtracking==0 ) {
                    COLONSi514_tree = (XQFTTree)adaptor.create(COLONSi514);
                    adaptor.addChild(root_0, COLONSi514_tree);
                    }
                    pushFollow(FOLLOW_ncNameorKeyword_in_wildcard6635);
                    ncNameorKeyword515=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword515.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:632:35: STARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    STARSi516=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard6673); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STARSi516_tree = (XQFTTree)adaptor.create(STARSi516);
                    adaptor.addChild(root_0, STARSi516_tree);
                    }

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:633:35: ncNameorKeyword COLONSi STARSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_ncNameorKeyword_in_wildcard6709);
                    ncNameorKeyword517=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword517.getTree());
                    COLONSi518=(Token)input.LT(1);
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard6711); if (failed) return retval;
                    if ( backtracking==0 ) {
                    COLONSi518_tree = (XQFTTree)adaptor.create(COLONSi518);
                    adaptor.addChild(root_0, COLONSi518_tree);
                    }
                    STARSi519=(Token)input.LT(1);
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard6713); if (failed) return retval;
                    if ( backtracking==0 ) {
                    STARSi519_tree = (XQFTTree)adaptor.create(STARSi519);
                    adaptor.addChild(root_0, STARSi519_tree);
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
    // etc/XQFT.g:635:21: abbrevReverseStep : DOTDOTSi ;
    public final abbrevReverseStep_return abbrevReverseStep() throws RecognitionException {
        abbrevReverseStep_return retval = new abbrevReverseStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOTDOTSi520=null;

        XQFTTree DOTDOTSi520_tree=null;

        try {
            // etc/XQFT.g:635:39: ( DOTDOTSi )
            // etc/XQFT.g:635:41: DOTDOTSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOTDOTSi520=(Token)input.LT(1);
            match(input,DOTDOTSi,FOLLOW_DOTDOTSi_in_abbrevReverseStep6770); if (failed) return retval;
            if ( backtracking==0 ) {
            DOTDOTSi520_tree = (XQFTTree)adaptor.create(DOTDOTSi520);
            adaptor.addChild(root_0, DOTDOTSi520_tree);
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
    // etc/XQFT.g:637:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );
    public final forwardStep_return forwardStep() throws RecognitionException {
        forwardStep_return retval = new forwardStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        forwardAxis_return forwardAxis521 = null;

        nodeTest_return nodeTest522 = null;

        abbrevForwardStep_return abbrevForwardStep523 = null;



        try {
            // etc/XQFT.g:637:29: ( forwardAxis nodeTest | abbrevForwardStep )
            int alt125=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                int LA125_1 = input.LA(2);

                if ( (LA125_1==DBLCOLONSi) ) {
                    alt125=1;
                }
                else if ( (LA125_1==EOF||LA125_1==AND||LA125_1==ASCENDING||(LA125_1>=CASE && LA125_1<=CASTABLE)||LA125_1==COLLATION||LA125_1==DEFAULT||LA125_1==DESCENDING||LA125_1==DIV||LA125_1==ELSE||LA125_1==EMPTY||LA125_1==EQ||LA125_1==EXCEPT||LA125_1==FOR||LA125_1==FTCONTAINS||LA125_1==GE||(LA125_1>=GT && LA125_1<=IDIV)||(LA125_1>=INSTANCE && LA125_1<=IS)||LA125_1==LE||(LA125_1>=LET && LA125_1<=LEVELS)||(LA125_1>=LT && LA125_1<=MOD)||LA125_1==NE||(LA125_1>=OR && LA125_1<=ORDER)||LA125_1==PARAGRAPHS||LA125_1==RETURN||LA125_1==SATISFIES||LA125_1==SENTENCES||LA125_1==STABLE||(LA125_1>=TIMES && LA125_1<=TREAT)||LA125_1==UNION||LA125_1==WHERE||LA125_1==WITHOUT||LA125_1==WORDS||(LA125_1>=SEMICOLONSi && LA125_1<=COMMASi)||(LA125_1>=LPARSi && LA125_1<=RPARSi)||LA125_1==RBRACSi||(LA125_1>=STARSi && LA125_1<=NODEAFTERSi)||(LA125_1>=SLASHSi && LA125_1<=DBLSLASHSi)||LA125_1==COLONSi||(LA125_1>=LBRACKSi && LA125_1<=RBRACKSi)) ) {
                    alt125=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("637:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 125, 1, input);

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
            case QName:
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
                else if ( (LA125_5==EOF||LA125_5==AND||LA125_5==ASCENDING||(LA125_5>=CASE && LA125_5<=CASTABLE)||LA125_5==COLLATION||LA125_5==DEFAULT||LA125_5==DESCENDING||LA125_5==DIV||LA125_5==ELSE||LA125_5==EMPTY||LA125_5==EQ||LA125_5==EXCEPT||LA125_5==FOR||LA125_5==FTCONTAINS||LA125_5==GE||(LA125_5>=GT && LA125_5<=IDIV)||(LA125_5>=INSTANCE && LA125_5<=IS)||LA125_5==LE||(LA125_5>=LET && LA125_5<=LEVELS)||(LA125_5>=LT && LA125_5<=MOD)||LA125_5==NE||(LA125_5>=OR && LA125_5<=ORDER)||LA125_5==PARAGRAPHS||LA125_5==RETURN||LA125_5==SATISFIES||LA125_5==SENTENCES||LA125_5==STABLE||(LA125_5>=TIMES && LA125_5<=TREAT)||LA125_5==UNION||LA125_5==WHERE||LA125_5==WITHOUT||LA125_5==WORDS||(LA125_5>=SEMICOLONSi && LA125_5<=COMMASi)||LA125_5==RPARSi||LA125_5==RBRACSi||(LA125_5>=STARSi && LA125_5<=NODEAFTERSi)||(LA125_5>=SLASHSi && LA125_5<=DBLSLASHSi)||LA125_5==COLONSi||(LA125_5>=LBRACKSi && LA125_5<=RBRACKSi)) ) {
                    alt125=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("637:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 125, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("637:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // etc/XQFT.g:637:31: forwardAxis nodeTest
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_forwardAxis_in_forwardStep6814);
                    forwardAxis521=forwardAxis();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, forwardAxis521.getTree());
                    pushFollow(FOLLOW_nodeTest_in_forwardStep6816);
                    nodeTest522=nodeTest();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, nodeTest522.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:637:54: abbrevForwardStep
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep6820);
                    abbrevForwardStep523=abbrevForwardStep();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, abbrevForwardStep523.getTree());

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
    // etc/XQFT.g:638:21: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi ;
    public final forwardAxis_return forwardAxis() throws RecognitionException {
        forwardAxis_return retval = new forwardAxis_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set524=null;
        Token DBLCOLONSi525=null;

        XQFTTree set524_tree=null;
        XQFTTree DBLCOLONSi525_tree=null;

        try {
            // etc/XQFT.g:638:33: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi )
            // etc/XQFT.g:639:25: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            set524=(Token)input.LT(1);
            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==CHILD||(input.LA(1)>=DESCENDANT && input.LA(1)<=DESCENDANT_OR_SELF)||(input.LA(1)>=FOLLOWING && input.LA(1)<=FOLLOWING_SIBLING)||input.LA(1)==SELF ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set524));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis6876);    throw mse;
            }

            DBLCOLONSi525=(Token)input.LT(1);
            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_forwardAxis6983); if (failed) return retval;
            if ( backtracking==0 ) {
            DBLCOLONSi525_tree = (XQFTTree)adaptor.create(DBLCOLONSi525);
            adaptor.addChild(root_0, DBLCOLONSi525_tree);
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
    // etc/XQFT.g:644:21: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final abbrevForwardStep_return abbrevForwardStep() throws RecognitionException {
        abbrevForwardStep_return retval = new abbrevForwardStep_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ATSi526=null;
        nodeTest_return nodeTest527 = null;


        XQFTTree ATSi526_tree=null;

        try {
            // etc/XQFT.g:644:39: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:644:41: ( ATSi )? nodeTest
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:644:45: ( ATSi )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ATSi) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:644:45: ATSi
                    {
                    ATSi526=(Token)input.LT(1);
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep7031); if (failed) return retval;
                    if ( backtracking==0 ) {
                    ATSi526_tree = (XQFTTree)adaptor.create(ATSi526);
                    root_0 = (XQFTTree)adaptor.becomeRoot(ATSi526_tree, root_0);
                    }

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep7035);
            nodeTest527=nodeTest();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, nodeTest527.getTree());

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
    // etc/XQFT.g:646:17: predicateList : ( predicate )* ;
    public final predicateList_return predicateList() throws RecognitionException {
        predicateList_return retval = new predicateList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        predicate_return predicate528 = null;



        try {
            // etc/XQFT.g:646:31: ( ( predicate )* )
            // etc/XQFT.g:646:33: ( predicate )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:646:33: ( predicate )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==LBRACKSi) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // etc/XQFT.g:646:33: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList7095);
            	    predicate528=predicate();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, predicate528.getTree());

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
    // etc/XQFT.g:647:21: predicate : LBRACKSi expr RBRACKSi -> ^( AST_PREDICATE expr ) ;
    public final predicate_return predicate() throws RecognitionException {
        predicate_return retval = new predicate_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACKSi529=null;
        Token RBRACKSi531=null;
        expr_return expr530 = null;


        XQFTTree LBRACKSi529_tree=null;
        XQFTTree RBRACKSi531_tree=null;
        RewriteRuleTokenStream stream_LBRACKSi=new RewriteRuleTokenStream(adaptor,"token LBRACKSi");
        RewriteRuleTokenStream stream_RBRACKSi=new RewriteRuleTokenStream(adaptor,"token RBRACKSi");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // etc/XQFT.g:647:31: ( LBRACKSi expr RBRACKSi -> ^( AST_PREDICATE expr ) )
            // etc/XQFT.g:647:33: LBRACKSi expr RBRACKSi
            {
            LBRACKSi529=(Token)input.LT(1);
            match(input,LBRACKSi,FOLLOW_LBRACKSi_in_predicate7164); if (failed) return retval;
            if ( backtracking==0 ) stream_LBRACKSi.add(LBRACKSi529);

            pushFollow(FOLLOW_expr_in_predicate7166);
            expr530=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_expr.add(expr530.getTree());
            RBRACKSi531=(Token)input.LT(1);
            match(input,RBRACKSi,FOLLOW_RBRACKSi_in_predicate7168); if (failed) return retval;
            if ( backtracking==0 ) stream_RBRACKSi.add(RBRACKSi531);


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
            // 648:37: -> ^( AST_PREDICATE expr )
            {
                // etc/XQFT.g:648:40: ^( AST_PREDICATE expr )
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
    // etc/XQFT.g:650:5: extensionExpr : ( pragma )+ LBRACESi ( expr )? RBRACSi ;
    public final extensionExpr_return extensionExpr() throws RecognitionException {
        extensionExpr_return retval = new extensionExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi533=null;
        Token RBRACSi535=null;
        pragma_return pragma532 = null;

        expr_return expr534 = null;


        XQFTTree LBRACESi533_tree=null;
        XQFTTree RBRACSi535_tree=null;

        try {
            // etc/XQFT.g:650:19: ( ( pragma )+ LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:650:21: ( pragma )+ LBRACESi ( expr )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:650:21: ( pragma )+
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
            	    // etc/XQFT.g:650:21: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr7240);
            	    pragma532=pragma();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, pragma532.getTree());

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

            LBRACESi533=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_extensionExpr7243); if (failed) return retval;
            // etc/XQFT.g:650:39: ( expr )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=ALL && LA129_0<=XQUERY)||LA129_0==StringLiteral||LA129_0==DOLLARSi||(LA129_0>=QName && LA129_0<=LPARSi)||(LA129_0>=STARSi && LA129_0<=MINUSSi)||LA129_0==LTSi||(LA129_0>=IntegerLiteral && LA129_0<=LPRAGSi)||(LA129_0>=SLASHSi && LA129_0<=DBLSLASHSi)||(LA129_0>=DOTDOTSi && LA129_0<=ATSi)||LA129_0==DOTSi||LA129_0==LCOMMENTSi||LA129_0==LPISi||LA129_0==NCName) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:650:39: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr7246);
                    expr534=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr534.getTree());

                    }
                    break;

            }

            RBRACSi535=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_extensionExpr7249); if (failed) return retval;

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
    // etc/XQFT.g:654:1: filterExpr : primaryExpr predicateList ;
    public final filterExpr_return filterExpr() throws RecognitionException {
        filterExpr_return retval = new filterExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        primaryExpr_return primaryExpr536 = null;

        predicateList_return predicateList537 = null;



        try {
            // etc/XQFT.g:654:12: ( primaryExpr predicateList )
            // etc/XQFT.g:654:14: primaryExpr predicateList
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_primaryExpr_in_filterExpr7261);
            primaryExpr536=primaryExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, primaryExpr536.getTree());
            pushFollow(FOLLOW_predicateList_in_filterExpr7263);
            predicateList537=predicateList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, predicateList537.getTree());

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
    // etc/XQFT.g:655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final primaryExpr_return primaryExpr() throws RecognitionException {
        primaryExpr_return retval = new primaryExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        literal_return literal538 = null;

        varRef_return varRef539 = null;

        parenthesizedExpr_return parenthesizedExpr540 = null;

        contextItemExpr_return contextItemExpr541 = null;

        functionCall_return functionCall542 = null;

        orderedExpr_return orderedExpr543 = null;

        unorderedExpr_return unorderedExpr544 = null;

        constructor_return constructor545 = null;



        try {
            // etc/XQFT.g:655:17: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
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
            case QName:
            case NCName:
                {
                alt130=5;
                }
                break;
            case ORDERED:
                {
                int LA130_7 = input.LA(2);

                if ( (LA130_7==LBRACESi) ) {
                    alt130=6;
                }
                else if ( (LA130_7==LPARSi) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 7, input);

                    throw nvae;
                }
                }
                break;
            case UNORDERED:
                {
                int LA130_8 = input.LA(2);

                if ( (LA130_8==LBRACESi) ) {
                    alt130=7;
                }
                else if ( (LA130_8==LPARSi) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 8, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENT:
                {
                int LA130_9 = input.LA(2);

                if ( (LA130_9==LBRACESi) ) {
                    alt130=8;
                }
                else if ( (LA130_9==LPARSi) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 9, input);

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
                int LA130_13 = input.LA(2);

                if ( (LA130_13==LPARSi) ) {
                    alt130=5;
                }
                else if ( ((LA130_13>=ALL && LA130_13<=XQUERY)||LA130_13==QName||LA130_13==LBRACESi||LA130_13==NCName) ) {
                    alt130=8;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 13, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA130_14 = input.LA(2);

                if ( (LA130_14==LPARSi) ) {
                    alt130=5;
                }
                else if ( ((LA130_14>=ALL && LA130_14<=XQUERY)||LA130_14==QName||LA130_14==LBRACESi||LA130_14==NCName) ) {
                    alt130=8;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 14, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA130_15 = input.LA(2);

                if ( (LA130_15==LBRACESi) ) {
                    alt130=8;
                }
                else if ( (LA130_15==LPARSi) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 15, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA130_16 = input.LA(2);

                if ( (LA130_16==LBRACESi) ) {
                    alt130=8;
                }
                else if ( (LA130_16==LPARSi) ) {
                    alt130=5;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 16, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA130_17 = input.LA(2);

                if ( (LA130_17==LPARSi) ) {
                    alt130=5;
                }
                else if ( ((LA130_17>=ALL && LA130_17<=XQUERY)||LA130_17==LBRACESi||LA130_17==NCName) ) {
                    alt130=8;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 17, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("655:5: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // etc/XQFT.g:656:9: literal
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryExpr7283);
                    literal538=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, literal538.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:657:11: varRef
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_varRef_in_primaryExpr7296);
                    varRef539=varRef();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, varRef539.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:658:11: parenthesizedExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr7309);
                    parenthesizedExpr540=parenthesizedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, parenthesizedExpr540.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:659:11: contextItemExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr7322);
                    contextItemExpr541=contextItemExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, contextItemExpr541.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:660:11: functionCall
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_primaryExpr7335);
                    functionCall542=functionCall();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, functionCall542.getTree());

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:661:11: orderedExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr7348);
                    orderedExpr543=orderedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, orderedExpr543.getTree());

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:662:11: unorderedExpr
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr7361);
                    unorderedExpr544=unorderedExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, unorderedExpr544.getTree());

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:663:11: constructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_constructor_in_primaryExpr7374);
                    constructor545=constructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, constructor545.getTree());

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
    // etc/XQFT.g:665:9: varRef : DOLLARSi varName ;
    public final varRef_return varRef() throws RecognitionException {
        varRef_return retval = new varRef_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOLLARSi546=null;
        varName_return varName547 = null;


        XQFTTree DOLLARSi546_tree=null;

        try {
            // etc/XQFT.g:665:16: ( DOLLARSi varName )
            // etc/XQFT.g:665:18: DOLLARSi varName
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOLLARSi546=(Token)input.LT(1);
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef7394); if (failed) return retval;
            pushFollow(FOLLOW_varName_in_varRef7397);
            varName547=varName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, varName547.getTree());

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
    // etc/XQFT.g:666:9: parenthesizedExpr : LPARSi ( expr )? RPARSi ;
    public final parenthesizedExpr_return parenthesizedExpr() throws RecognitionException {
        parenthesizedExpr_return retval = new parenthesizedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPARSi548=null;
        Token RPARSi550=null;
        expr_return expr549 = null;


        XQFTTree LPARSi548_tree=null;
        XQFTTree RPARSi550_tree=null;

        try {
            // etc/XQFT.g:666:27: ( LPARSi ( expr )? RPARSi )
            // etc/XQFT.g:666:29: LPARSi ( expr )? RPARSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LPARSi548=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_parenthesizedExpr7412); if (failed) return retval;
            // etc/XQFT.g:666:37: ( expr )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( ((LA131_0>=ALL && LA131_0<=XQUERY)||LA131_0==StringLiteral||LA131_0==DOLLARSi||(LA131_0>=QName && LA131_0<=LPARSi)||(LA131_0>=STARSi && LA131_0<=MINUSSi)||LA131_0==LTSi||(LA131_0>=IntegerLiteral && LA131_0<=LPRAGSi)||(LA131_0>=SLASHSi && LA131_0<=DBLSLASHSi)||(LA131_0>=DOTDOTSi && LA131_0<=ATSi)||LA131_0==DOTSi||LA131_0==LCOMMENTSi||LA131_0==LPISi||LA131_0==NCName) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // etc/XQFT.g:666:37: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr7415);
                    expr549=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr549.getTree());

                    }
                    break;

            }

            RPARSi550=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_parenthesizedExpr7418); if (failed) return retval;

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
    // etc/XQFT.g:667:9: contextItemExpr : DOTSi ;
    public final contextItemExpr_return contextItemExpr() throws RecognitionException {
        contextItemExpr_return retval = new contextItemExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOTSi551=null;

        XQFTTree DOTSi551_tree=null;

        try {
            // etc/XQFT.g:667:25: ( DOTSi )
            // etc/XQFT.g:667:27: DOTSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOTSi551=(Token)input.LT(1);
            match(input,DOTSi,FOLLOW_DOTSi_in_contextItemExpr7434); if (failed) return retval;
            if ( backtracking==0 ) {
            DOTSi551_tree = (XQFTTree)adaptor.create(DOTSi551);
            adaptor.addChild(root_0, DOTSi551_tree);
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
    // etc/XQFT.g:668:9: functionCall : qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi -> ^( AST_FUNCTIONCALL qName ( exprSingle )* ) ;
    public final functionCall_return functionCall() throws RecognitionException {
        functionCall_return retval = new functionCall_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPARSi553=null;
        Token COMMASi555=null;
        Token RPARSi557=null;
        qName_return qName552 = null;

        exprSingle_return exprSingle554 = null;

        exprSingle_return exprSingle556 = null;


        XQFTTree LPARSi553_tree=null;
        XQFTTree COMMASi555_tree=null;
        XQFTTree RPARSi557_tree=null;
        RewriteRuleTokenStream stream_RPARSi=new RewriteRuleTokenStream(adaptor,"token RPARSi");
        RewriteRuleTokenStream stream_LPARSi=new RewriteRuleTokenStream(adaptor,"token LPARSi");
        RewriteRuleTokenStream stream_COMMASi=new RewriteRuleTokenStream(adaptor,"token COMMASi");
        RewriteRuleSubtreeStream stream_qName=new RewriteRuleSubtreeStream(adaptor,"rule qName");
        RewriteRuleSubtreeStream stream_exprSingle=new RewriteRuleSubtreeStream(adaptor,"rule exprSingle");
        try {
            // etc/XQFT.g:668:22: ( qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi -> ^( AST_FUNCTIONCALL qName ( exprSingle )* ) )
            // etc/XQFT.g:669:13: qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi
            {
            pushFollow(FOLLOW_qName_in_functionCall7462);
            qName552=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_qName.add(qName552.getTree());
            LPARSi553=(Token)input.LT(1);
            match(input,LPARSi,FOLLOW_LPARSi_in_functionCall7464); if (failed) return retval;
            if ( backtracking==0 ) stream_LPARSi.add(LPARSi553);

            // etc/XQFT.g:670:13: ( exprSingle ( COMMASi exprSingle )* )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( ((LA133_0>=ALL && LA133_0<=XQUERY)||LA133_0==StringLiteral||LA133_0==DOLLARSi||(LA133_0>=QName && LA133_0<=LPARSi)||(LA133_0>=STARSi && LA133_0<=MINUSSi)||LA133_0==LTSi||(LA133_0>=IntegerLiteral && LA133_0<=LPRAGSi)||(LA133_0>=SLASHSi && LA133_0<=DBLSLASHSi)||(LA133_0>=DOTDOTSi && LA133_0<=ATSi)||LA133_0==DOTSi||LA133_0==LCOMMENTSi||LA133_0==LPISi||LA133_0==NCName) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // etc/XQFT.g:670:14: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall7481);
                    exprSingle554=exprSingle();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_exprSingle.add(exprSingle554.getTree());
                    // etc/XQFT.g:670:25: ( COMMASi exprSingle )*
                    loop132:
                    do {
                        int alt132=2;
                        int LA132_0 = input.LA(1);

                        if ( (LA132_0==COMMASi) ) {
                            alt132=1;
                        }


                        switch (alt132) {
                    	case 1 :
                    	    // etc/XQFT.g:670:26: COMMASi exprSingle
                    	    {
                    	    COMMASi555=(Token)input.LT(1);
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall7484); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_COMMASi.add(COMMASi555);

                    	    pushFollow(FOLLOW_exprSingle_in_functionCall7486);
                    	    exprSingle556=exprSingle();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_exprSingle.add(exprSingle556.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop132;
                        }
                    } while (true);


                    }
                    break;

            }

            RPARSi557=(Token)input.LT(1);
            match(input,RPARSi,FOLLOW_RPARSi_in_functionCall7505); if (failed) return retval;
            if ( backtracking==0 ) stream_RPARSi.add(RPARSi557);


            // AST REWRITE
            // elements: exprSingle, qName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 672:17: -> ^( AST_FUNCTIONCALL qName ( exprSingle )* )
            {
                // etc/XQFT.g:672:20: ^( AST_FUNCTIONCALL qName ( exprSingle )* )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_FUNCTIONCALL, "AST_FUNCTIONCALL"), root_1);

                adaptor.addChild(root_1, stream_qName.next());
                // etc/XQFT.g:672:45: ( exprSingle )*
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
    // etc/XQFT.g:674:9: orderedExpr : ORDERED LBRACESi expr RBRACSi ;
    public final orderedExpr_return orderedExpr() throws RecognitionException {
        orderedExpr_return retval = new orderedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ORDERED558=null;
        Token LBRACESi559=null;
        Token RBRACSi561=null;
        expr_return expr560 = null;


        XQFTTree ORDERED558_tree=null;
        XQFTTree LBRACESi559_tree=null;
        XQFTTree RBRACSi561_tree=null;

        try {
            // etc/XQFT.g:674:21: ( ORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:674:23: ORDERED LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ORDERED558=(Token)input.LT(1);
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr7548); if (failed) return retval;
            if ( backtracking==0 ) {
            ORDERED558_tree = (XQFTTree)adaptor.create(ORDERED558);
            adaptor.addChild(root_0, ORDERED558_tree);
            }
            LBRACESi559=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_orderedExpr7550); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_orderedExpr7553);
            expr560=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr560.getTree());
            RBRACSi561=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_orderedExpr7555); if (failed) return retval;

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
    // etc/XQFT.g:675:9: unorderedExpr : UNORDERED LBRACESi expr RBRACSi ;
    public final unorderedExpr_return unorderedExpr() throws RecognitionException {
        unorderedExpr_return retval = new unorderedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token UNORDERED562=null;
        Token LBRACESi563=null;
        Token RBRACSi565=null;
        expr_return expr564 = null;


        XQFTTree UNORDERED562_tree=null;
        XQFTTree LBRACESi563_tree=null;
        XQFTTree RBRACSi565_tree=null;

        try {
            // etc/XQFT.g:675:23: ( UNORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:675:25: UNORDERED LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            UNORDERED562=(Token)input.LT(1);
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr7571); if (failed) return retval;
            if ( backtracking==0 ) {
            UNORDERED562_tree = (XQFTTree)adaptor.create(UNORDERED562);
            adaptor.addChild(root_0, UNORDERED562_tree);
            }
            LBRACESi563=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_unorderedExpr7573); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_unorderedExpr7576);
            expr564=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr564.getTree());
            RBRACSi565=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_unorderedExpr7578); if (failed) return retval;

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
    // etc/XQFT.g:676:9: constructor : ( directConstructor | computedConstructor );
    public final constructor_return constructor() throws RecognitionException {
        constructor_return retval = new constructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        directConstructor_return directConstructor566 = null;

        computedConstructor_return computedConstructor567 = null;



        try {
            // etc/XQFT.g:676:21: ( directConstructor | computedConstructor )
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
                    new NoViableAltException("676:9: constructor : ( directConstructor | computedConstructor );", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:676:23: directConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_directConstructor_in_constructor7598);
                    directConstructor566=directConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, directConstructor566.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:676:43: computedConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_computedConstructor_in_constructor7602);
                    computedConstructor567=computedConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, computedConstructor567.getTree());

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
    // etc/XQFT.g:677:13: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );
    public final directConstructor_return directConstructor() throws RecognitionException {
        directConstructor_return retval = new directConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        dirElemConstructor_return dirElemConstructor568 = null;

        dirCommentConstructor_return dirCommentConstructor569 = null;

        dirPIConstructor_return dirPIConstructor570 = null;



        try {
            // etc/XQFT.g:677:31: ( dirElemConstructor | dirCommentConstructor | dirPIConstructor )
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
                    new NoViableAltException("677:13: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // etc/XQFT.g:678:17: dirElemConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor7642);
                    dirElemConstructor568=dirElemConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dirElemConstructor568.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:679:19: dirCommentConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor7662);
                    dirCommentConstructor569=dirCommentConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dirCommentConstructor569.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:680:19: dirPIConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_dirPIConstructor_in_directConstructor7682);
                    dirPIConstructor570=dirPIConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, dirPIConstructor570.getTree());

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
    // etc/XQFT.g:683:17: dirElemConstructor : LTSi qn= qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) -> ^( AST_DIRELEMCONSTRUCTOR $qn dirAttributeList ( dirElemContent )* ) ;
    public final dirElemConstructor_return dirElemConstructor() throws RecognitionException {
        dirElemConstructor_return retval = new dirElemConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LTSi571=null;
        Token RSELFTERMSi573=null;
        Token GTSi574=null;
        Token LENDTAGSi576=null;
        Token GTSi578=null;
        qName_return qn = null;

        dirAttributeList_return dirAttributeList572 = null;

        dirElemContent_return dirElemContent575 = null;

        qName_return qName577 = null;


        XQFTTree LTSi571_tree=null;
        XQFTTree RSELFTERMSi573_tree=null;
        XQFTTree GTSi574_tree=null;
        XQFTTree LENDTAGSi576_tree=null;
        XQFTTree GTSi578_tree=null;
        RewriteRuleTokenStream stream_LTSi=new RewriteRuleTokenStream(adaptor,"token LTSi");
        RewriteRuleTokenStream stream_LENDTAGSi=new RewriteRuleTokenStream(adaptor,"token LENDTAGSi");
        RewriteRuleTokenStream stream_RSELFTERMSi=new RewriteRuleTokenStream(adaptor,"token RSELFTERMSi");
        RewriteRuleTokenStream stream_GTSi=new RewriteRuleTokenStream(adaptor,"token GTSi");
        RewriteRuleSubtreeStream stream_qName=new RewriteRuleSubtreeStream(adaptor,"rule qName");
        RewriteRuleSubtreeStream stream_dirElemContent=new RewriteRuleSubtreeStream(adaptor,"rule dirElemContent");
        RewriteRuleSubtreeStream stream_dirAttributeList=new RewriteRuleSubtreeStream(adaptor,"rule dirAttributeList");
        try {
            // etc/XQFT.g:683:36: ( LTSi qn= qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) -> ^( AST_DIRELEMCONSTRUCTOR $qn dirAttributeList ( dirElemContent )* ) )
            // etc/XQFT.g:684:21: LTSi qn= qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
            {
            LTSi571=(Token)input.LT(1);
            match(input,LTSi,FOLLOW_LTSi_in_dirElemConstructor7792); if (failed) return retval;
            if ( backtracking==0 ) stream_LTSi.add(LTSi571);

            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.IN_TAG;
            }
            pushFollow(FOLLOW_qName_in_dirElemConstructor7818);
            qn=qName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_qName.add(qn.getTree());
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor7820);
            dirAttributeList572=dirAttributeList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_dirAttributeList.add(dirAttributeList572.getTree());
            // etc/XQFT.g:686:21: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
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
                    new NoViableAltException("686:21: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:686:22: RSELFTERMSi
                    {
                    RSELFTERMSi573=(Token)input.LT(1);
                    match(input,RSELFTERMSi,FOLLOW_RSELFTERMSi_in_dirElemConstructor7843); if (failed) return retval;
                    if ( backtracking==0 ) stream_RSELFTERMSi.add(RSELFTERMSi573);

                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:688:24: GTSi ( dirElemContent )* LENDTAGSi qName GTSi
                    {
                    GTSi574=(Token)input.LT(1);
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor7894); if (failed) return retval;
                    if ( backtracking==0 ) stream_GTSi.add(GTSi574);

                    if ( backtracking==0 ) {
                      lexer.state=State.IN_ELEMENT;
                    }
                    // etc/XQFT.g:691:25: ( dirElemContent )*
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==LBRACESi||LA136_0==LTSi||(LA136_0>=ElementContent && LA136_0<=LCDATASi)||LA136_0==LCOMMENTSi||LA136_0==LPISi) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // etc/XQFT.g:691:25: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor7948);
                    	    dirElemContent575=dirElemContent();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_dirElemContent.add(dirElemContent575.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop136;
                        }
                    } while (true);

                    LENDTAGSi576=(Token)input.LT(1);
                    match(input,LENDTAGSi,FOLLOW_LENDTAGSi_in_dirElemConstructor7976); if (failed) return retval;
                    if ( backtracking==0 ) stream_LENDTAGSi.add(LENDTAGSi576);

                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }
                    pushFollow(FOLLOW_qName_in_dirElemConstructor8008);
                    qName577=qName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_qName.add(qName577.getTree());
                    GTSi578=(Token)input.LT(1);
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor8039); if (failed) return retval;
                    if ( backtracking==0 ) stream_GTSi.add(GTSi578);

                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;

            }


            // AST REWRITE
            // elements: dirElemContent, dirAttributeList, qn
            // token labels: 
            // rule labels: qn, retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_qn=new RewriteRuleSubtreeStream(adaptor,"token qn",qn!=null?qn.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (XQFTTree)adaptor.nil();
            // 696:25: -> ^( AST_DIRELEMCONSTRUCTOR $qn dirAttributeList ( dirElemContent )* )
            {
                // etc/XQFT.g:696:28: ^( AST_DIRELEMCONSTRUCTOR $qn dirAttributeList ( dirElemContent )* )
                {
                XQFTTree root_1 = (XQFTTree)adaptor.nil();
                root_1 = (XQFTTree)adaptor.becomeRoot(adaptor.create(AST_DIRELEMCONSTRUCTOR, "AST_DIRELEMCONSTRUCTOR"), root_1);

                adaptor.addChild(root_1, stream_qn.next());
                adaptor.addChild(root_1, stream_dirAttributeList.next());
                // etc/XQFT.g:696:74: ( dirElemContent )*
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
    // etc/XQFT.g:698:21: dirAttributeList : ( qName EQSi dirAttributeValue )* ;
    public final dirAttributeList_return dirAttributeList() throws RecognitionException {
        dirAttributeList_return retval = new dirAttributeList_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token EQSi580=null;
        qName_return qName579 = null;

        dirAttributeValue_return dirAttributeValue581 = null;


        XQFTTree EQSi580_tree=null;

        try {
            // etc/XQFT.g:698:38: ( ( qName EQSi dirAttributeValue )* )
            // etc/XQFT.g:698:40: ( qName EQSi dirAttributeValue )*
            {
            root_0 = (XQFTTree)adaptor.nil();

            // etc/XQFT.g:698:40: ( qName EQSi dirAttributeValue )*
            loop138:
            do {
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( ((LA138_0>=ALL && LA138_0<=XQUERY)||LA138_0==QName||LA138_0==NCName) ) {
                    alt138=1;
                }


                switch (alt138) {
            	case 1 :
            	    // etc/XQFT.g:698:41: qName EQSi dirAttributeValue
            	    {
            	    pushFollow(FOLLOW_qName_in_dirAttributeList8138);
            	    qName579=qName();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, qName579.getTree());
            	    EQSi580=(Token)input.LT(1);
            	    match(input,EQSi,FOLLOW_EQSi_in_dirAttributeList8140); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    EQSi580_tree = (XQFTTree)adaptor.create(EQSi580);
            	    adaptor.addChild(root_0, EQSi580_tree);
            	    }
            	    pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList8142);
            	    dirAttributeValue581=dirAttributeValue();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, dirAttributeValue581.getTree());

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
    // etc/XQFT.g:699:25: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );
    public final dirAttributeValue_return dirAttributeValue() throws RecognitionException {
        dirAttributeValue_return retval = new dirAttributeValue_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token QUOTSi582=null;
        Token QuotAttributeContent583=null;
        Token QUOTSi585=null;
        Token APOSSi586=null;
        Token AposAttributeContent587=null;
        Token APOSSi589=null;
        xmlEnclosedExpr_return xmlEnclosedExpr584 = null;

        xmlEnclosedExpr_return xmlEnclosedExpr588 = null;


        XQFTTree QUOTSi582_tree=null;
        XQFTTree QuotAttributeContent583_tree=null;
        XQFTTree QUOTSi585_tree=null;
        XQFTTree APOSSi586_tree=null;
        XQFTTree AposAttributeContent587_tree=null;
        XQFTTree APOSSi589_tree=null;

        try {
            // etc/XQFT.g:699:43: ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi )
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
                    new NoViableAltException("699:25: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // etc/XQFT.g:700:29: QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    QUOTSi582=(Token)input.LT(1);
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue8205); if (failed) return retval;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_QUOT_ATTRIBUTE;
                    }
                    // etc/XQFT.g:701:29: ( QuotAttributeContent | xmlEnclosedExpr )*
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
                    	    // etc/XQFT.g:701:30: QuotAttributeContent
                    	    {
                    	    QuotAttributeContent583=(Token)input.LT(1);
                    	    match(input,QuotAttributeContent,FOLLOW_QuotAttributeContent_in_dirAttributeValue8239); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    QuotAttributeContent583_tree = (XQFTTree)adaptor.create(QuotAttributeContent583);
                    	    adaptor.addChild(root_0, QuotAttributeContent583_tree);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:701:53: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue8243);
                    	    xmlEnclosedExpr584=xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, xmlEnclosedExpr584.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    QUOTSi585=(Token)input.LT(1);
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue8276); if (failed) return retval;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:703:31: APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    APOSSi586=(Token)input.LT(1);
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue8311); if (failed) return retval;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_APOS_ATTRIBUTE;
                    }
                    // etc/XQFT.g:704:29: ( AposAttributeContent | xmlEnclosedExpr )*
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
                    	    // etc/XQFT.g:704:30: AposAttributeContent
                    	    {
                    	    AposAttributeContent587=(Token)input.LT(1);
                    	    match(input,AposAttributeContent,FOLLOW_AposAttributeContent_in_dirAttributeValue8345); if (failed) return retval;
                    	    if ( backtracking==0 ) {
                    	    AposAttributeContent587_tree = (XQFTTree)adaptor.create(AposAttributeContent587);
                    	    adaptor.addChild(root_0, AposAttributeContent587_tree);
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:704:53: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue8349);
                    	    xmlEnclosedExpr588=xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, xmlEnclosedExpr588.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop140;
                        }
                    } while (true);

                    APOSSi589=(Token)input.LT(1);
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue8382); if (failed) return retval;
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
    // etc/XQFT.g:707:25: xmlEnclosedExpr : LBRACESi expr RBRACSi ;
    public final xmlEnclosedExpr_return xmlEnclosedExpr() throws RecognitionException {
        xmlEnclosedExpr_return retval = new xmlEnclosedExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LBRACESi590=null;
        Token RBRACSi592=null;
        expr_return expr591 = null;


        XQFTTree LBRACESi590_tree=null;
        XQFTTree RBRACSi592_tree=null;

        try {
            // etc/XQFT.g:707:41: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:708:29: LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LBRACESi590=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_xmlEnclosedExpr8471); if (failed) return retval;
            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.DEFAULT;
            }
            pushFollow(FOLLOW_expr_in_xmlEnclosedExpr8509);
            expr591=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr591.getTree());
            RBRACSi592=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_xmlEnclosedExpr8540); if (failed) return retval;
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
    // etc/XQFT.g:713:21: dirElemContent : (dc= directConstructor -> ^( AST_DIRELEMCONTENT $dc) | cd= cDataSection -> ^( AST_DIRELEMCONTENT $cd) | ec= ElementContent -> ^( AST_DIRELEMCONTENT $ec) | xe= xmlEnclosedExpr -> ^( AST_DIRELEMCONTENT $xe) );
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
            // etc/XQFT.g:713:36: (dc= directConstructor -> ^( AST_DIRELEMCONTENT $dc) | cd= cDataSection -> ^( AST_DIRELEMCONTENT $cd) | ec= ElementContent -> ^( AST_DIRELEMCONTENT $ec) | xe= xmlEnclosedExpr -> ^( AST_DIRELEMCONTENT $xe) )
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
                    new NoViableAltException("713:21: dirElemContent : (dc= directConstructor -> ^( AST_DIRELEMCONTENT $dc) | cd= cDataSection -> ^( AST_DIRELEMCONTENT $cd) | ec= ElementContent -> ^( AST_DIRELEMCONTENT $ec) | xe= xmlEnclosedExpr -> ^( AST_DIRELEMCONTENT $xe) );", 142, 0, input);

                throw nvae;
            }

            switch (alt142) {
                case 1 :
                    // etc/XQFT.g:714:25: dc= directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent8623);
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
                    // 714:45: -> ^( AST_DIRELEMCONTENT $dc)
                    {
                        // etc/XQFT.g:714:48: ^( AST_DIRELEMCONTENT $dc)
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
                    // etc/XQFT.g:715:27: cd= cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent8661);
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
                    // 715:43: -> ^( AST_DIRELEMCONTENT $cd)
                    {
                        // etc/XQFT.g:715:46: ^( AST_DIRELEMCONTENT $cd)
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
                    // etc/XQFT.g:716:27: ec= ElementContent
                    {
                    ec=(Token)input.LT(1);
                    match(input,ElementContent,FOLLOW_ElementContent_in_dirElemContent8700); if (failed) return retval;
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
                    // 716:45: -> ^( AST_DIRELEMCONTENT $ec)
                    {
                        // etc/XQFT.g:716:48: ^( AST_DIRELEMCONTENT $ec)
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
                    // etc/XQFT.g:717:27: xe= xmlEnclosedExpr
                    {
                    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirElemContent8739);
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
                    // 717:46: -> ^( AST_DIRELEMCONTENT $xe)
                    {
                        // etc/XQFT.g:717:49: ^( AST_DIRELEMCONTENT $xe)
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
    // etc/XQFT.g:720:21: cDataSection : LCDATASi CDataContents RCDATASi ;
    public final cDataSection_return cDataSection() throws RecognitionException {
        cDataSection_return retval = new cDataSection_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LCDATASi593=null;
        Token CDataContents594=null;
        Token RCDATASi595=null;

        XQFTTree LCDATASi593_tree=null;
        XQFTTree CDataContents594_tree=null;
        XQFTTree RCDATASi595_tree=null;

        try {
            // etc/XQFT.g:720:34: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:720:36: LCDATASi CDataContents RCDATASi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LCDATASi593=(Token)input.LT(1);
            match(input,LCDATASi,FOLLOW_LCDATASi_in_cDataSection8797); if (failed) return retval;
            if ( backtracking==0 ) {
            LCDATASi593_tree = (XQFTTree)adaptor.create(LCDATASi593);
            adaptor.addChild(root_0, LCDATASi593_tree);
            }
            CDataContents594=(Token)input.LT(1);
            match(input,CDataContents,FOLLOW_CDataContents_in_cDataSection8799); if (failed) return retval;
            if ( backtracking==0 ) {
            CDataContents594_tree = (XQFTTree)adaptor.create(CDataContents594);
            adaptor.addChild(root_0, CDataContents594_tree);
            }
            RCDATASi595=(Token)input.LT(1);
            match(input,RCDATASi,FOLLOW_RCDATASi_in_cDataSection8801); if (failed) return retval;
            if ( backtracking==0 ) {
            RCDATASi595_tree = (XQFTTree)adaptor.create(RCDATASi595);
            adaptor.addChild(root_0, RCDATASi595_tree);
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
    // etc/XQFT.g:722:17: dirCommentConstructor : LCOMMENTSi DirCommentContent RCOMMENTSi ;
    public final dirCommentConstructor_return dirCommentConstructor() throws RecognitionException {
        dirCommentConstructor_return retval = new dirCommentConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LCOMMENTSi596=null;
        Token DirCommentContent597=null;
        Token RCOMMENTSi598=null;

        XQFTTree LCOMMENTSi596_tree=null;
        XQFTTree DirCommentContent597_tree=null;
        XQFTTree RCOMMENTSi598_tree=null;

        try {
            // etc/XQFT.g:722:39: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:722:41: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LCOMMENTSi596=(Token)input.LT(1);
            match(input,LCOMMENTSi,FOLLOW_LCOMMENTSi_in_dirCommentConstructor8841); if (failed) return retval;
            if ( backtracking==0 ) {
            LCOMMENTSi596_tree = (XQFTTree)adaptor.create(LCOMMENTSi596);
            adaptor.addChild(root_0, LCOMMENTSi596_tree);
            }
            DirCommentContent597=(Token)input.LT(1);
            match(input,DirCommentContent,FOLLOW_DirCommentContent_in_dirCommentConstructor8843); if (failed) return retval;
            if ( backtracking==0 ) {
            DirCommentContent597_tree = (XQFTTree)adaptor.create(DirCommentContent597);
            adaptor.addChild(root_0, DirCommentContent597_tree);
            }
            RCOMMENTSi598=(Token)input.LT(1);
            match(input,RCOMMENTSi,FOLLOW_RCOMMENTSi_in_dirCommentConstructor8845); if (failed) return retval;
            if ( backtracking==0 ) {
            RCOMMENTSi598_tree = (XQFTTree)adaptor.create(RCOMMENTSi598);
            adaptor.addChild(root_0, RCOMMENTSi598_tree);
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
    // etc/XQFT.g:724:17: dirPIConstructor : LPISi PiTarget ( DirPiContents )? RPISi ;
    public final dirPIConstructor_return dirPIConstructor() throws RecognitionException {
        dirPIConstructor_return retval = new dirPIConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token LPISi599=null;
        Token PiTarget600=null;
        Token DirPiContents601=null;
        Token RPISi602=null;

        XQFTTree LPISi599_tree=null;
        XQFTTree PiTarget600_tree=null;
        XQFTTree DirPiContents601_tree=null;
        XQFTTree RPISi602_tree=null;

        try {
            // etc/XQFT.g:724:34: ( LPISi PiTarget ( DirPiContents )? RPISi )
            // etc/XQFT.g:724:36: LPISi PiTarget ( DirPiContents )? RPISi
            {
            root_0 = (XQFTTree)adaptor.nil();

            LPISi599=(Token)input.LT(1);
            match(input,LPISi,FOLLOW_LPISi_in_dirPIConstructor8885); if (failed) return retval;
            if ( backtracking==0 ) {
            LPISi599_tree = (XQFTTree)adaptor.create(LPISi599);
            adaptor.addChild(root_0, LPISi599_tree);
            }
            PiTarget600=(Token)input.LT(1);
            match(input,PiTarget,FOLLOW_PiTarget_in_dirPIConstructor8887); if (failed) return retval;
            if ( backtracking==0 ) {
            PiTarget600_tree = (XQFTTree)adaptor.create(PiTarget600);
            adaptor.addChild(root_0, PiTarget600_tree);
            }
            // etc/XQFT.g:724:51: ( DirPiContents )?
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==DirPiContents) ) {
                alt143=1;
            }
            switch (alt143) {
                case 1 :
                    // etc/XQFT.g:724:51: DirPiContents
                    {
                    DirPiContents601=(Token)input.LT(1);
                    match(input,DirPiContents,FOLLOW_DirPiContents_in_dirPIConstructor8889); if (failed) return retval;
                    if ( backtracking==0 ) {
                    DirPiContents601_tree = (XQFTTree)adaptor.create(DirPiContents601);
                    adaptor.addChild(root_0, DirPiContents601_tree);
                    }

                    }
                    break;

            }

            RPISi602=(Token)input.LT(1);
            match(input,RPISi,FOLLOW_RPISi_in_dirPIConstructor8892); if (failed) return retval;
            if ( backtracking==0 ) {
            RPISi602_tree = (XQFTTree)adaptor.create(RPISi602);
            adaptor.addChild(root_0, RPISi602_tree);
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
    // etc/XQFT.g:726:13: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final computedConstructor_return computedConstructor() throws RecognitionException {
        computedConstructor_return retval = new computedConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        compDocConstructor_return compDocConstructor603 = null;

        compElemConstructor_return compElemConstructor604 = null;

        compAttrConstructor_return compAttrConstructor605 = null;

        compTextConstructor_return compTextConstructor606 = null;

        compCommentConstructor_return compCommentConstructor607 = null;

        compPIConstructor_return compPIConstructor608 = null;



        try {
            // etc/XQFT.g:726:33: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
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
                    new NoViableAltException("726:13: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 144, 0, input);

                throw nvae;
            }

            switch (alt144) {
                case 1 :
                    // etc/XQFT.g:727:17: compDocConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor8945);
                    compDocConstructor603=compDocConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compDocConstructor603.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:728:19: compElemConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor8965);
                    compElemConstructor604=compElemConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compElemConstructor604.getTree());

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:729:19: compAttrConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor8985);
                    compAttrConstructor605=compAttrConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compAttrConstructor605.getTree());

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:730:19: compTextConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor9005);
                    compTextConstructor606=compTextConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compTextConstructor606.getTree());

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:731:19: compCommentConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor9025);
                    compCommentConstructor607=compCommentConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compCommentConstructor607.getTree());

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:732:19: compPIConstructor
                    {
                    root_0 = (XQFTTree)adaptor.nil();

                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor9045);
                    compPIConstructor608=compPIConstructor();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, compPIConstructor608.getTree());

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
    // etc/XQFT.g:735:17: compDocConstructor : DOCUMENT LBRACESi expr RBRACSi ;
    public final compDocConstructor_return compDocConstructor() throws RecognitionException {
        compDocConstructor_return retval = new compDocConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token DOCUMENT609=null;
        Token LBRACESi610=null;
        Token RBRACSi612=null;
        expr_return expr611 = null;


        XQFTTree DOCUMENT609_tree=null;
        XQFTTree LBRACESi610_tree=null;
        XQFTTree RBRACSi612_tree=null;

        try {
            // etc/XQFT.g:735:36: ( DOCUMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:735:38: DOCUMENT LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            DOCUMENT609=(Token)input.LT(1);
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor9095); if (failed) return retval;
            if ( backtracking==0 ) {
            DOCUMENT609_tree = (XQFTTree)adaptor.create(DOCUMENT609);
            adaptor.addChild(root_0, DOCUMENT609_tree);
            }
            LBRACESi610=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compDocConstructor9097); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_compDocConstructor9100);
            expr611=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr611.getTree());
            RBRACSi612=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compDocConstructor9102); if (failed) return retval;

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
    // etc/XQFT.g:737:17: compElemConstructor : ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi ;
    public final compElemConstructor_return compElemConstructor() throws RecognitionException {
        compElemConstructor_return retval = new compElemConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ELEMENT613=null;
        Token LBRACESi615=null;
        Token RBRACSi617=null;
        Token LBRACESi618=null;
        Token RBRACSi620=null;
        qName_return qName614 = null;

        expr_return expr616 = null;

        contentExpr_return contentExpr619 = null;


        XQFTTree ELEMENT613_tree=null;
        XQFTTree LBRACESi615_tree=null;
        XQFTTree RBRACSi617_tree=null;
        XQFTTree LBRACESi618_tree=null;
        XQFTTree RBRACSi620_tree=null;

        try {
            // etc/XQFT.g:737:37: ( ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi )
            // etc/XQFT.g:738:21: ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ELEMENT613=(Token)input.LT(1);
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor9164); if (failed) return retval;
            if ( backtracking==0 ) {
            ELEMENT613_tree = (XQFTTree)adaptor.create(ELEMENT613);
            adaptor.addChild(root_0, ELEMENT613_tree);
            }
            // etc/XQFT.g:738:29: ( qName | LBRACESi expr RBRACSi )
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( ((LA145_0>=ALL && LA145_0<=XQUERY)||LA145_0==QName||LA145_0==NCName) ) {
                alt145=1;
            }
            else if ( (LA145_0==LBRACESi) ) {
                alt145=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("738:29: ( qName | LBRACESi expr RBRACSi )", 145, 0, input);

                throw nvae;
            }
            switch (alt145) {
                case 1 :
                    // etc/XQFT.g:738:30: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor9167);
                    qName614=qName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, qName614.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:738:38: LBRACESi expr RBRACSi
                    {
                    LBRACESi615=(Token)input.LT(1);
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9171); if (failed) return retval;
                    if ( backtracking==0 ) {
                    LBRACESi615_tree = (XQFTTree)adaptor.create(LBRACESi615);
                    adaptor.addChild(root_0, LBRACESi615_tree);
                    }
                    pushFollow(FOLLOW_expr_in_compElemConstructor9173);
                    expr616=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr616.getTree());
                    RBRACSi617=(Token)input.LT(1);
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9175); if (failed) return retval;
                    if ( backtracking==0 ) {
                    RBRACSi617_tree = (XQFTTree)adaptor.create(RBRACSi617);
                    adaptor.addChild(root_0, RBRACSi617_tree);
                    }

                    }
                    break;

            }

            LBRACESi618=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor9199); if (failed) return retval;
            if ( backtracking==0 ) {
            LBRACESi618_tree = (XQFTTree)adaptor.create(LBRACESi618);
            adaptor.addChild(root_0, LBRACESi618_tree);
            }
            // etc/XQFT.g:739:30: ( contentExpr )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( ((LA146_0>=ALL && LA146_0<=XQUERY)||LA146_0==StringLiteral||LA146_0==DOLLARSi||(LA146_0>=QName && LA146_0<=LPARSi)||(LA146_0>=STARSi && LA146_0<=MINUSSi)||LA146_0==LTSi||(LA146_0>=IntegerLiteral && LA146_0<=LPRAGSi)||(LA146_0>=SLASHSi && LA146_0<=DBLSLASHSi)||(LA146_0>=DOTDOTSi && LA146_0<=ATSi)||LA146_0==DOTSi||LA146_0==LCOMMENTSi||LA146_0==LPISi||LA146_0==NCName) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // etc/XQFT.g:739:30: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor9201);
                    contentExpr619=contentExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, contentExpr619.getTree());

                    }
                    break;

            }

            RBRACSi620=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor9204); if (failed) return retval;
            if ( backtracking==0 ) {
            RBRACSi620_tree = (XQFTTree)adaptor.create(RBRACSi620);
            adaptor.addChild(root_0, RBRACSi620_tree);
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
    // etc/XQFT.g:741:21: contentExpr : expr ;
    public final contentExpr_return contentExpr() throws RecognitionException {
        contentExpr_return retval = new contentExpr_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        expr_return expr621 = null;



        try {
            // etc/XQFT.g:741:33: ( expr )
            // etc/XQFT.g:741:35: expr
            {
            root_0 = (XQFTTree)adaptor.nil();

            pushFollow(FOLLOW_expr_in_contentExpr9248);
            expr621=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr621.getTree());

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
    // etc/XQFT.g:743:17: compAttrConstructor : ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final compAttrConstructor_return compAttrConstructor() throws RecognitionException {
        compAttrConstructor_return retval = new compAttrConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token ATTRIBUTE622=null;
        Token LBRACESi624=null;
        Token RBRACSi626=null;
        Token LBRACESi627=null;
        Token RBRACSi629=null;
        qName_return qName623 = null;

        expr_return expr625 = null;

        expr_return expr628 = null;


        XQFTTree ATTRIBUTE622_tree=null;
        XQFTTree LBRACESi624_tree=null;
        XQFTTree RBRACSi626_tree=null;
        XQFTTree LBRACESi627_tree=null;
        XQFTTree RBRACSi629_tree=null;

        try {
            // etc/XQFT.g:743:37: ( ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:744:21: ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            ATTRIBUTE622=(Token)input.LT(1);
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor9309); if (failed) return retval;
            if ( backtracking==0 ) {
            ATTRIBUTE622_tree = (XQFTTree)adaptor.create(ATTRIBUTE622);
            adaptor.addChild(root_0, ATTRIBUTE622_tree);
            }
            // etc/XQFT.g:744:31: ( qName | ( LBRACESi expr RBRACSi ) )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( ((LA147_0>=ALL && LA147_0<=XQUERY)||LA147_0==QName||LA147_0==NCName) ) {
                alt147=1;
            }
            else if ( (LA147_0==LBRACESi) ) {
                alt147=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("744:31: ( qName | ( LBRACESi expr RBRACSi ) )", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // etc/XQFT.g:744:32: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor9312);
                    qName623=qName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, qName623.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:744:40: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:744:40: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:744:41: LBRACESi expr RBRACSi
                    {
                    LBRACESi624=(Token)input.LT(1);
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9317); if (failed) return retval;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9320);
                    expr625=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr625.getTree());
                    RBRACSi626=(Token)input.LT(1);
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9322); if (failed) return retval;

                    }


                    }
                    break;

            }

            LBRACESi627=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor9348); if (failed) return retval;
            // etc/XQFT.g:745:31: ( expr )?
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( ((LA148_0>=ALL && LA148_0<=XQUERY)||LA148_0==StringLiteral||LA148_0==DOLLARSi||(LA148_0>=QName && LA148_0<=LPARSi)||(LA148_0>=STARSi && LA148_0<=MINUSSi)||LA148_0==LTSi||(LA148_0>=IntegerLiteral && LA148_0<=LPRAGSi)||(LA148_0>=SLASHSi && LA148_0<=DBLSLASHSi)||(LA148_0>=DOTDOTSi && LA148_0<=ATSi)||LA148_0==DOTSi||LA148_0==LCOMMENTSi||LA148_0==LPISi||LA148_0==NCName) ) {
                alt148=1;
            }
            switch (alt148) {
                case 1 :
                    // etc/XQFT.g:745:31: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9351);
                    expr628=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr628.getTree());

                    }
                    break;

            }

            RBRACSi629=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor9354); if (failed) return retval;

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
    // etc/XQFT.g:748:17: compTextConstructor : TEXT LBRACESi expr RBRACSi ;
    public final compTextConstructor_return compTextConstructor() throws RecognitionException {
        compTextConstructor_return retval = new compTextConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token TEXT630=null;
        Token LBRACESi631=null;
        Token RBRACSi633=null;
        expr_return expr632 = null;


        XQFTTree TEXT630_tree=null;
        XQFTTree LBRACESi631_tree=null;
        XQFTTree RBRACSi633_tree=null;

        try {
            // etc/XQFT.g:748:37: ( TEXT LBRACESi expr RBRACSi )
            // etc/XQFT.g:748:39: TEXT LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            TEXT630=(Token)input.LT(1);
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor9397); if (failed) return retval;
            if ( backtracking==0 ) {
            TEXT630_tree = (XQFTTree)adaptor.create(TEXT630);
            adaptor.addChild(root_0, TEXT630_tree);
            }
            LBRACESi631=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compTextConstructor9399); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_compTextConstructor9402);
            expr632=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr632.getTree());
            RBRACSi633=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compTextConstructor9404); if (failed) return retval;

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
    // etc/XQFT.g:750:17: compCommentConstructor : COMMENT LBRACESi expr RBRACSi ;
    public final compCommentConstructor_return compCommentConstructor() throws RecognitionException {
        compCommentConstructor_return retval = new compCommentConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token COMMENT634=null;
        Token LBRACESi635=null;
        Token RBRACSi637=null;
        expr_return expr636 = null;


        XQFTTree COMMENT634_tree=null;
        XQFTTree LBRACESi635_tree=null;
        XQFTTree RBRACSi637_tree=null;

        try {
            // etc/XQFT.g:750:40: ( COMMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:750:42: COMMENT LBRACESi expr RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            COMMENT634=(Token)input.LT(1);
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor9429); if (failed) return retval;
            if ( backtracking==0 ) {
            COMMENT634_tree = (XQFTTree)adaptor.create(COMMENT634);
            adaptor.addChild(root_0, COMMENT634_tree);
            }
            LBRACESi635=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compCommentConstructor9431); if (failed) return retval;
            pushFollow(FOLLOW_expr_in_compCommentConstructor9434);
            expr636=expr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, expr636.getTree());
            RBRACSi637=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compCommentConstructor9436); if (failed) return retval;

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
    // etc/XQFT.g:752:17: compPIConstructor : PROCESSING_INSTRUCTION ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final compPIConstructor_return compPIConstructor() throws RecognitionException {
        compPIConstructor_return retval = new compPIConstructor_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token PROCESSING_INSTRUCTION638=null;
        Token LBRACESi640=null;
        Token RBRACSi642=null;
        Token LBRACESi643=null;
        Token RBRACSi645=null;
        ncNameorKeyword_return ncNameorKeyword639 = null;

        expr_return expr641 = null;

        expr_return expr644 = null;


        XQFTTree PROCESSING_INSTRUCTION638_tree=null;
        XQFTTree LBRACESi640_tree=null;
        XQFTTree RBRACSi642_tree=null;
        XQFTTree LBRACESi643_tree=null;
        XQFTTree RBRACSi645_tree=null;

        try {
            // etc/XQFT.g:752:35: ( PROCESSING_INSTRUCTION ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:753:21: PROCESSING_INSTRUCTION ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            root_0 = (XQFTTree)adaptor.nil();

            PROCESSING_INSTRUCTION638=(Token)input.LT(1);
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor9482); if (failed) return retval;
            if ( backtracking==0 ) {
            PROCESSING_INSTRUCTION638_tree = (XQFTTree)adaptor.create(PROCESSING_INSTRUCTION638);
            adaptor.addChild(root_0, PROCESSING_INSTRUCTION638_tree);
            }
            // etc/XQFT.g:754:25: ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) )
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
                    new NoViableAltException("754:25: ( ncNameorKeyword | ( LBRACESi expr RBRACSi ) )", 149, 0, input);

                throw nvae;
            }
            switch (alt149) {
                case 1 :
                    // etc/XQFT.g:754:26: ncNameorKeyword
                    {
                    pushFollow(FOLLOW_ncNameorKeyword_in_compPIConstructor9510);
                    ncNameorKeyword639=ncNameorKeyword();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, ncNameorKeyword639.getTree());

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:754:44: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:754:44: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:754:45: LBRACESi expr RBRACSi
                    {
                    LBRACESi640=(Token)input.LT(1);
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor9515); if (failed) return retval;
                    pushFollow(FOLLOW_expr_in_compPIConstructor9518);
                    expr641=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr641.getTree());
                    RBRACSi642=(Token)input.LT(1);
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor9520); if (failed) return retval;

                    }


                    }
                    break;

            }

            LBRACESi643=(Token)input.LT(1);
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor9546); if (failed) return retval;
            // etc/XQFT.g:755:31: ( expr )?
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( ((LA150_0>=ALL && LA150_0<=XQUERY)||LA150_0==StringLiteral||LA150_0==DOLLARSi||(LA150_0>=QName && LA150_0<=LPARSi)||(LA150_0>=STARSi && LA150_0<=MINUSSi)||LA150_0==LTSi||(LA150_0>=IntegerLiteral && LA150_0<=LPRAGSi)||(LA150_0>=SLASHSi && LA150_0<=DBLSLASHSi)||(LA150_0>=DOTDOTSi && LA150_0<=ATSi)||LA150_0==DOTSi||LA150_0==LCOMMENTSi||LA150_0==LPISi||LA150_0==NCName) ) {
                alt150=1;
            }
            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:755:31: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor9549);
                    expr644=expr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, expr644.getTree());

                    }
                    break;

            }

            RBRACSi645=(Token)input.LT(1);
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor9552); if (failed) return retval;

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
    // etc/XQFT.g:760:1: ncNameorKeyword : ( NCName | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMA_ATTRIBUTE | SCHEMA_ELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY );
    public final ncNameorKeyword_return ncNameorKeyword() throws RecognitionException {
        ncNameorKeyword_return retval = new ncNameorKeyword_return();
        retval.start = input.LT(1);

        XQFTTree root_0 = null;

        Token set646=null;

        XQFTTree set646_tree=null;

        try {
            // etc/XQFT.g:760:17: ( NCName | ALL | ANY | ANCESTOR | ANCESTOR_OR_SELF | AND | AS | ASCENDING | AT | ATTRIBUTE | BASE_URI | BY | BOUNDARYSPACE | CASE | CAST | CASTABLE | CHILD | COLLATION | COMMENT | CONSTRUCTION | CONTENT | COPY_NAMESPACES | DECLARE | DEFAULT | DESCENDANT | DESCENDANT_OR_SELF | DESCENDING | DIACRITICS | DIFFERENT | DISTANCE | DIV | DOCUMENT | DOCUMENT_NODE | ELEMENT | ELSE | ENCODING | END | ENTIRE | EMPTY | EMPTY_SEQUENCE | EQ | EVERY | EXACTLY | EXCEPT | EXTERNAL | FOLLOWING | FOLLOWING_SIBLING | FOR | FROM | FTAND | FTCONTAINS | FTNOT | FTOPTION | FTOR | FUNCTION | GE | GREATEST | GT | IDIV | IF | IMPORT | IN | INHERIT | INSENSITIVE | INSTANCE | INTERSECT | IS | ITEM | LANGUAGE | LAX | LE | LEAST | LET | LEVELS | LOWERCASE | LT | MOD | MODULE | MOST | NAMESPACE | NE | NODE | NOINHERIT | NOPRESERVE | NOT | OCCURS | OF | OPTION | OR | ORDER | ORDERED | ORDERING | PARAGRAPH | PARAGRAPHS | PARENT | PHRASE | PRECEDING | PRECEDING_SIBLING | PRESERVE | PROCESSING_INSTRUCTION | RELATIONSHIP | RETURN | SAME | SATISFIES | SCHEMA | SCHEMA_ATTRIBUTE | SCHEMA_ELEMENT | SCORE | SELF | SENSITIVE | SENTENCES | SENTENCE | SOME | STABLE | START | STEMMING | STOP | STRICT | STRIP | TEXT | THESAURUS | THEN | TIMES | TO | TREAT | TYPESWITCH | UNION | UNORDERED | UPPERCASE | VALIDATE | VARIABLE | VERSION | WEIGHT | WHERE | WILDCARDS | WINDOW | WITH | WITHOUT | WORD | WORDS | XQUERY )
            // etc/XQFT.g:
            {
            root_0 = (XQFTTree)adaptor.nil();

            set646=(Token)input.LT(1);
            if ( (input.LA(1)>=ALL && input.LA(1)<=XQUERY)||input.LA(1)==NCName ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set646));
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
        // etc/XQFT.g:321:7: ( IMPORT ( SCHEMA | MODULE ) )
        // etc/XQFT.g:321:8: IMPORT ( SCHEMA | MODULE )
        {
        match(input,IMPORT,FOLLOW_IMPORT_in_synpred1844); if (failed) return ;
        if ( input.LA(1)==MODULE||input.LA(1)==SCHEMA ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred1846);    throw mse;
        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:396:5: ( itemType occurrenceIndicator )
        // etc/XQFT.g:396:6: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred21762);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred21764);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:430:5: ( IF LPARSi )
        // etc/XQFT.g:430:6: IF LPARSi
        {
        match(input,IF,FOLLOW_IF_in_synpred32485); if (failed) return ;
        match(input,LPARSi,FOLLOW_LPARSi_in_synpred32487); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:431:7: ( TYPESWITCH LPARSi )
        // etc/XQFT.g:431:8: TYPESWITCH LPARSi
        {
        match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_synpred42500); if (failed) return ;
        match(input,LPARSi,FOLLOW_LPARSi_in_synpred42502); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // etc/XQFT.g:605:9: ( SLASHSi relativePathExpr )
        // etc/XQFT.g:605:10: SLASHSi relativePathExpr
        {
        match(input,SLASHSi,FOLLOW_SLASHSi_in_synpred56005); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred56007);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // etc/XQFT.g:614:17: ( ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi )
        // etc/XQFT.g:614:18: ( DOCUMENT_NODE | ELEMENT | ATTRIBUTE | SCHEMA_ELEMENT | SCHEMA_ATTRIBUTE | PROCESSING_INSTRUCTION | COMMENT | TEXT | NODE ) LPARSi
        {
        if ( input.LA(1)==ATTRIBUTE||input.LA(1)==COMMENT||(input.LA(1)>=DOCUMENT_NODE && input.LA(1)<=ELEMENT)||input.LA(1)==NODE||input.LA(1)==PROCESSING_INSTRUCTION||(input.LA(1)>=SCHEMA_ATTRIBUTE && input.LA(1)<=SCHEMA_ELEMENT)||input.LA(1)==TEXT ) {
            input.consume();
            errorRecovery=false;failed=false;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            MismatchedSetException mse =
                new MismatchedSetException(null,input);
            recoverFromMismatchedSet(input,mse,FOLLOW_set_in_synpred66127);    throw mse;
        }

        match(input,LPARSi,FOLLOW_LPARSi_in_synpred66205); if (failed) return ;

        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred7
    public final void synpred7_fragment() throws RecognitionException {   
        // etc/XQFT.g:627:29: ( STARSi | ncNameorKeyword COLONSi STARSi )
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
                new NoViableAltException("627:29: synpred7 : ( STARSi | ncNameorKeyword COLONSi STARSi );", 151, 0, input);

            throw nvae;
        }
        switch (alt151) {
            case 1 :
                // etc/XQFT.g:627:30: STARSi
                {
                match(input,STARSi,FOLLOW_STARSi_in_synpred76484); if (failed) return ;

                }
                break;
            case 2 :
                // etc/XQFT.g:627:39: ncNameorKeyword COLONSi STARSi
                {
                pushFollow(FOLLOW_ncNameorKeyword_in_synpred76488);
                ncNameorKeyword();
                _fsp--;
                if (failed) return ;
                match(input,COLONSi,FOLLOW_COLONSi_in_synpred76490); if (failed) return ;
                match(input,STARSi,FOLLOW_STARSi_in_synpred76492); if (failed) return ;

                }
                break;

        }}
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // etc/XQFT.g:631:33: ( STARSi COLONSi )
        // etc/XQFT.g:631:34: STARSi COLONSi
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred86624); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred86626); if (failed) return ;

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


 

    public static final BitSet FOLLOW_versionDecl_in_module584 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_libraryModule_in_module594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl635 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_versionDecl644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule655 = new BitSet(new long[]{0x8000000002000002L});
    public static final BitSet FOLLOW_prolog_in_libraryModule657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl674 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_moduleDecl676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_moduleDecl678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_moduleDecl682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule713 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_queryBody_in_mainModule715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr749 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_expr752 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_expr754 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_importStmt_in_prolog853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_DECLARE_in_prolog864 = new BitSet(new long[]{0x028000000540A000L,0x0000000044040000L,0x0000000000000020L});
    public static final BitSet FOLLOW_setter_in_prolog876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_varDecl_in_prolog889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_functionDecl_in_prolog902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_optionDecl_in_prolog915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_prolog950 = new BitSet(new long[]{0x8000000002000002L});
    public static final BitSet FOLLOW_DEFAULT_in_setter972 = new BitSet(new long[]{0x0200001000100002L,0x0000000010000000L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_setter990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter1006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_namespaceDecl_in_setter1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl1137 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl1152 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl1154 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl1177 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_namespaceDecl1179 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_namespaceDecl1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl1192 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BASE_URI_in_baseURIDecl1215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl1227 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L});
    public static final BitSet FOLLOW_set_in_constructionDecl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl1245 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl1261 = new BitSet(new long[]{0x0000000000000000L,0x0000002000400000L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl1263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl1265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_importStmt1329 = new BitSet(new long[]{0x0000000000000000L,0x0000080000010000L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport1355 = new BitSet(new long[]{0x0000000004000000L,0x0000000000040000L,0x0000000800000000L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport1357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1360 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AT_in_schemaImport1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport1368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1393 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_schemaPrefix1395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_schemaPrefix1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix1403 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix1405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport1426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000800000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport1429 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_moduleImport1431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_moduleImport1433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1437 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AT_in_moduleImport1440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1442 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1447 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl1465 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_varDecl1467 = new BitSet(new long[]{0x0000800000000200L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl1469 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varDecl1474 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_qName1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_qName1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration1539 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl1558 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_functionDecl1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionDecl1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000088000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionDecl1567 = new BitSet(new long[]{0x0000800000000200L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl1579 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl1581 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList1631 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_paramList1634 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_param_in_paramList1636 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_param1656 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_param1658 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_typeDeclaration_in_param1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_enclosedExpr1681 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr1693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_enclosedExpr1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl1718 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_optionDecl1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl1730 = new BitSet(new long[]{0x0000000040010000L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions1743 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_sequenceType1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_sequenceType1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType1810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_itemType1812 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_itemType1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest1905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest1921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_NODE_in_documentTest1988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_documentTest1990 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest1994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest1998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_documentTest2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest2026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_elementTest2028 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x00008A000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest2032 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest2035 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_typeName_in_elementTest2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000480000000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_elementTest2039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_elementTest2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_ELEMENT_in_schemaElementTest2159 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaElementTest2161 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest2164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaElementTest2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest2213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_attributeTest2215 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x00008A000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest2219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest2222 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_typeName_in_attributeTest2224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_attributeTest2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard2254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMA_ATTRIBUTE_in_schemaAttributeTest2304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaAttributeTest2306 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest2309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaAttributeTest2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration2335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest2354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_piTest2356 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000008080000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_piTest2360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_piTest2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_piTest2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_commentTest2390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_commentTest2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest2413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_textTest2415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_textTest2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest2438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_anyKindTest2440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_anyKindTest2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle2491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle2515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr2546 = new BitSet(new long[]{0x0004000000000000L,0x0010010010000800L,0x0000000000000100L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr2552 = new BitSet(new long[]{0x0004000000000000L,0x0010010010000800L,0x0000000000000100L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr2556 = new BitSet(new long[]{0x0000000000000000L,0x0010010010000000L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr2559 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr2562 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause2614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_forClauseTupletDef_in_forClause2616 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_forClause2619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_forClauseTupletDef_in_forClause2621 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClauseTupletDef2664 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_forClauseTupletDef2667 = new BitSet(new long[]{0x0000000000000A00L,0x0000400000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClauseTupletDef2669 = new BitSet(new long[]{0x0000000000000800L,0x0000400000000001L});
    public static final BitSet FOLLOW_positionalVar_in_forClauseTupletDef2672 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000001L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClauseTupletDef2675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_forClauseTupletDef2678 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_forClauseTupletDef2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_varName2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_positionalVar2728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar2730 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_positionalVar2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar2751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar2753 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause2783 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_varBinding_in_letClause2785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_letClause2788 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_varBinding_in_letClause2790 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding2842 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_varBinding2846 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varBinding2848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_SCORE_in_varBinding2853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding2855 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_varBinding2859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varBinding2875 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_varBinding2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause2927 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause2978 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BY_in_orderByClause2980 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause2984 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause2986 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BY_in_orderByClause2988 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3034 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList3037 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3039 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec3086 = new BitSet(new long[]{0x0000020020100402L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier3115 = new BitSet(new long[]{0x0000020000100002L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier3125 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_orderModifier3127 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier3138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SOME_in_quantifiedExpr3166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_EVERY_in_quantifiedExpr3172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_quantifiedExprTupleDef_in_quantifiedExpr3175 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr3186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_quantifiedExprTupleDef_in_quantifiedExpr3188 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr3192 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExprTupleDef3250 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExprTupleDef3252 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExprTupleDef3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_quantifiedExprTupleDef3257 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExprTupleDef3259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr3294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_typeswitchExpr3296 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr3298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_typeswitchExpr3300 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr3302 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr3314 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr3317 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr3319 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr3323 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause3365 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002800000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause3368 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_caseClause3370 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_caseClause3372 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause3376 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause3378 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr3426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_ifExpr3428 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_ifExpr3430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ifExpr3432 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr3434 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3436 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr3438 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3480 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_OR_in_orExpr3484 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_andExpr_in_orExpr3487 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3505 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AND_in_andExpr3509 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr3512 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3525 = new BitSet(new long[]{0x1400080000000002L,0x0000000000084220L,0x03F8002000000000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr3530 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr3535 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr3540 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr3558 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr3562 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr3565 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr3590 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_TO_in_rangeExpr3594 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr3619 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_set_in_additiveExpr3623 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr3632 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0003000000000000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr3658 = new BitSet(new long[]{0x2000000200000002L,0x0000000000008000L,0x0000800000000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr3662 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr3679 = new BitSet(new long[]{0x2000000200000002L,0x0000000000008000L,0x0000800000000000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr3709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000002L});
    public static final BitSet FOLLOW_set_in_unionExpr3713 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr3722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000002L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr3756 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr3760 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr3769 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr3807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr3811 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr3814 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr3859 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr3863 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_treatExpr3866 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr3869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr3915 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr3919 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_castableExpr3922 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_singleType_in_castableExpr3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr3975 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_CAST_in_castExpr3979 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_castExpr3982 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_singleType_in_castExpr3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr4040 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType4102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_singleType4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption4192 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption4195 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection4294 = new BitSet(new long[]{0x0000010180000802L,0x0000020020000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection4296 = new BitSet(new long[]{0x0000010180000802L,0x0000020020000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection4300 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4315 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_FTOR_in_ftOr4319 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr4322 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4340 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd4344 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd4347 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot4373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_ftMildNot4376 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot4379 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot4406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions4434 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftPrimaryWithOptions4438 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary4467 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftPrimary4508 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00140800000000L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary4511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftPrimary4513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords4611 = new BitSet(new long[]{0x0000000000000032L,0x0000000400000000L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_ftWordsValue4655 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue4658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftWordsValue4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption4792 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption4794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption4801 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption4803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption4809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes4840 = new BitSet(new long[]{0x0008200000000800L});
    public static final BitSet FOLLOW_ftRange_in_ftTimes4843 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes4845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange4882 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange4928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020400L});
    public static final BitSet FOLLOW_set_in_ftRange4930 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange4936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange4980 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange4982 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_TO_in_ftRange4984 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection5018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_ftExtensionSelection5021 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x3C00340800000000L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection5024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftExtensionSelection5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPRAGSi_in_pragma5063 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_pragma5066 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_PragmaContents_in_pragma5068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RPRAGSi_in_pragma5071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow5158 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow5160 = new BitSet(new long[]{0x0000000000000000L,0x0002000100000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance5208 = new BitSet(new long[]{0x0008200000000800L});
    public static final BitSet FOLLOW_ftRange_in_ftDistance5210 = new BitSet(new long[]{0x0000000000000000L,0x0002000100000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope5227 = new BitSet(new long[]{0x0000000000000000L,0x0004000080000000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope5235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent5277 = new BitSet(new long[]{0x0000008000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_set_in_ftContent5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent5289 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftMatchOption5346 = new BitSet(new long[]{0x0000000004000000L,0x08C0000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftMatchOption5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STEMMING_in_ftMatchOption5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftMatchOption5417 = new BitSet(new long[]{0x0000000000000000L,0x08C0000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftMatchOption5422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THESAURUS_in_ftMatchOption5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STEMMING_in_ftMatchOption5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_in_ftMatchOption5479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftMatchOption5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption5512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption5536 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000004L});
    public static final BitSet FOLLOW_set_in_ftCaseOption5539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption5596 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000004L});
    public static final BitSet FOLLOW_set_in_ftDiacriticsOption5599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption5617 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption5620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption5651 = new BitSet(new long[]{0x0000000004000800L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption5669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftThesaurusOption5690 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption5694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption5698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption5702 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption5704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftThesaurusOption5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID5740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID5742 = new BitSet(new long[]{0x0008200000000802L,0x0000008000000000L});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID5745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID5747 = new BitSet(new long[]{0x0008200000000802L});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID5752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption5777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption5779 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption5781 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption5783 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption5796 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption5798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption5800 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption5802 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList5837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftRefOrList5856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList5859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList5862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList5864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftRefOrList5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral5893 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr5923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr5927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr5942 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000100L,0x0000100000000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr5944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_validateExpr5947 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_validateExpr5950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_validateExpr5952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr6011 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1086880000FFFFL,0x0000000004480130L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr6026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_pathExpr6039 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1086880000FFFFL,0x0000000004480130L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr6075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_SLASHSi_in_relativePathExpr6079 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1086880000FFFFL,0x0000000004480130L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_relativePathExpr6084 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1086880000FFFFL,0x0000000004480130L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr6088 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr6274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep6308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep6312 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_predicateList_in_axisStep6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep6339 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000082000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep6345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis6372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_reverseAxis6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest6423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest6529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard6631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard6633 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000000000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_wildcard6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_wildcard6709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard6711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOTSi_in_abbrevReverseStep6770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep6814 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000082000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep6816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep6820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis6876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_forwardAxis6983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep7031 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000082000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList7095 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_LBRACKSi_in_predicate7164 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_predicate7166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RBRACKSi_in_predicate7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr7240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_extensionExpr7243 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C13A6880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_extensionExpr7246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_extensionExpr7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr7261 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr7296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr7335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr7348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr7374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef7394 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_varName_in_varRef7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_parenthesizedExpr7412 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C138E880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr7415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPARSi_in_parenthesizedExpr7418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTSi_in_contextItemExpr7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall7462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionCall7464 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C138E880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall7481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall7484 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall7486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000084000000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionCall7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr7548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_orderedExpr7550 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_orderedExpr7553 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_orderedExpr7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr7571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_unorderedExpr7573 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr7576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_unorderedExpr7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor7602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor7642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor7662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirPIConstructor_in_directConstructor7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTSi_in_dirElemConstructor7792 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor7818 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x004002000000FFFFL,0x0000000004000200L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor7820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RSELFTERMSi_in_dirElemConstructor7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor7894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010100000000000L,0x0000000000498400L});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor7948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010100000000000L,0x0000000000498400L});
    public static final BitSet FOLLOW_LENDTAGSi_in_dirElemConstructor7976 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor8008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor8039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList8138 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_EQSi_in_dirAttributeList8140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002800L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList8142 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0xFFFFFFFFFFFFFFFFL,0x000002000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue8205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_QuotAttributeContent_in_dirAttributeValue8239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue8243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue8311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_AposAttributeContent_in_dirAttributeValue8345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue8349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L,0x0000000000006000L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue8382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_xmlEnclosedExpr8471 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_xmlEnclosedExpr8509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_xmlEnclosedExpr8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent8623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent8661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContent_in_dirElemContent8700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirElemContent8739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCDATASi_in_cDataSection8797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_CDataContents_in_cDataSection8799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_RCDATASi_in_cDataSection8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCOMMENTSi_in_dirCommentConstructor8841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DirCommentContent_in_dirCommentConstructor8843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_RCOMMENTSi_in_dirCommentConstructor8845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPISi_in_dirPIConstructor8885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_PiTarget_in_dirPIConstructor8887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_DirPiContents_in_dirPIConstructor8889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPISi_in_dirPIConstructor8892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor8945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor8985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor9005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor9025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor9045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor9095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compDocConstructor9097 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor9100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compDocConstructor9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor9164 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000012000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor9167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9171 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor9173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor9199 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C13A6880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor9201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor9204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr9248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor9309 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000012000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor9312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9317 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor9348 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C13A6880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor9354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor9397 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compTextConstructor9399 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor9402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compTextConstructor9404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor9429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compCommentConstructor9431 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor9434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compCommentConstructor9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor9482 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x000010000000FFFFL,0x0000000004000000L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_compPIConstructor9510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor9515 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C1386880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor9518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor9520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor9546 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x3C13A6880000FFFFL,0x0000000004480133L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor9549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor9552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ncNameorKeyword0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_synpred1844 = new BitSet(new long[]{0x0000000000000000L,0x0000080000010000L});
    public static final BitSet FOLLOW_set_in_synpred1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred21762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001C00000000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred21764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_synpred32485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_synpred32487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_synpred42500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_synpred42502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_synpred56005 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x1C1086880000FFFFL,0x0000000004480130L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred56007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred66127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_LPARSi_in_synpred66205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred76484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ncNameorKeyword_in_synpred76488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLONSi_in_synpred76490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_STARSi_in_synpred76492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred86624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_COLONSi_in_synpred86626 = new BitSet(new long[]{0x0000000000000002L});

}