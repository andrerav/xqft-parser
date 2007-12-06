// $ANTLR 3.0.1 etc/XQFT.g 2007-12-06 16:08:01

	package no.ntnu.xqft.parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALL", "ANY", "ANCESTOR", "ANCESTOR_OR_SELF", "AND", "AS", "ASCENDING", "AT", "ATTRIBUTE", "BASE_URI", "BY", "BOUNDARYSPACE", "CASE", "CAST", "CASTABLE", "CHILD", "COLLATION", "COMMENT", "CONSTRUCTION", "CONTENT", "COPY_NAMESPACES", "DECLARE", "DEFAULT", "DESCENDANT", "DESCENDANT_OR_SELF", "DESCENDING", "DIACRITICS", "DIFFERENT", "DISTANCE", "DIV", "DOCUMENT", "DOCUMENT_NODE", "ELEMENT", "ELSE", "ENCODING", "END", "ENTIRE", "EMPTY", "EMPTY_SEQUENCE", "EQ", "EVERY", "EXACTLY", "EXCEPT", "EXTERNAL", "FOLLOWING", "FOLLOWING_SIBLING", "FOR", "FROM", "FTAND", "FTCONTAINS", "FTNOT", "FTOPTION", "FTOR", "FUNCTION", "GE", "GREATEST", "GT", "IDIV", "IF", "IMPORT", "IN", "INHERIT", "INSENSITIVE", "INSTANCE", "INTERSECT", "IS", "ITEM", "LANGUAGE", "LAX", "LE", "LEAST", "LET", "LEVELS", "LOWERCASE", "LT", "MOD", "MODULE", "MOST", "NAMESPACE", "NE", "NODE", "NOINHERIT", "NOPRESERVE", "NOT", "OCCURS", "OF", "OPTION", "OR", "ORDER", "ORDERED", "ORDERING", "PARAGRAPH", "PARAGRAPHS", "PARENT", "PHRASE", "PRECEDING", "PRECEDING_SIBLING", "PRESERVE", "PROCESSING_INSTRUCTION", "RELATIONSHIP", "RETURN", "SAME", "SATISFIES", "SCHEMA", "SCHEMAATTRIBUTE", "SCHEMAELEMENT", "SCORE", "SELF", "SENSITIVE", "SENTENCES", "SENTENCE", "SOME", "STABLE", "START", "STEMMING", "STOP", "STRICT", "STRIP", "TEXT", "THESAURUS", "THEN", "TIMES", "TO", "TREAT", "TYPESWITCH", "UNION", "UNORDERED", "UPPERCASE", "VALIDATE", "VARIABLE", "VERSION", "WEIGHT", "WHERE", "WILDCARDS", "WINDOW", "WITH", "WITHOUT", "WORD", "WORDS", "XQUERY", "StringLiteral", "SEMICOLONSi", "NCName", "EQSi", "COMMASi", "DOLLARSi", "ASSIGNSi", "COLONSi", "LPARSi", "RPARSi", "LBRACESi", "RBRACSi", "QUESTIONSi", "STARSi", "PLUSSi", "MINUSSi", "PIPESi", "NEQSi", "LTSi", "LTOREQSi", "GTSi", "GTOREQSi", "NODEBEFORESi", "NODEAFTERSi", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "LPRAGSi", "PragmaContents", "RPRAGSi", "DBLSLASHSi", "SLASHSi", "DBLCOLONSi", "DOTDOTSi", "ATSi", "LBRACKSi", "RBRACKSi", "DOTSi", "RSELFTERMSi", "LENDTAGSi", "QUOTSi", "QuotAttributeContent", "APOSSi", "AposAttributeContent", "ElementContent", "LCDATASi", "CDataContents", "RCDATASi", "LCOMMENTSi", "DirCommentContent", "RCOMMENTSi", "LPISi", "PiTarget", "DirPiContents", "RPISi", "CDataSectionLEX", "DirPIConstructor", "DirCommentConstLEX", "PragmaLEX", "Comment", "NumberLEX", "LexSigns", "S", "LexLiterals", "TOKENSWITCH", "PredefinedEntityRef", "CharRef", "AMPERSi", "QuotAttrContentChar", "AposAttrContentChar", "ElementContentChar", "CREFDECSi", "CREFHEXSi", "NotChar", "Name", "Letter", "UNDERSCORESi", "NameChar", "Digit", "CombiningChar", "Extender", "SHARPSi", "LXQCOMMENTSi", "RXQCOMMENTSi", "Digits", "NCNameStartChar", "NCNameChar", "EXCLSi", "BACKSLASHSi", "ExtraChar", "BaseChar", "Ideographic", "CleanChar", "Char"
    };
    public static final int FUNCTION=57;
    public static final int MOD=79;
    public static final int LPISi=195;
    public static final int CREFHEXSi=216;
    public static final int NOT=87;
    public static final int EXCEPT=46;
    public static final int EOF=-1;
    public static final int PragmaContents=172;
    public static final int BaseChar=234;
    public static final int Ideographic=235;
    public static final int DISTANCE=32;
    public static final int IMPORT=63;
    public static final int ASSIGNSi=150;
    public static final int CREFDECSi=215;
    public static final int SENTENCE=114;
    public static final int PRECEDING=99;
    public static final int WORDS=142;
    public static final int NumberLEX=204;
    public static final int RETURN=104;
    public static final int ELEMENT=36;
    public static final int RPARSi=153;
    public static final int EQ=43;
    public static final int DOLLARSi=149;
    public static final int DIACRITICS=30;
    public static final int DBLCOLONSi=176;
    public static final int CHILD=19;
    public static final int GE=58;
    public static final int STRICT=120;
    public static final int PRESERVE=101;
    public static final int UNDERSCORESi=220;
    public static final int ELSE=37;
    public static final int RCDATASi=191;
    public static final int TYPESWITCH=128;
    public static final int STOP=119;
    public static final int CONTENT=23;
    public static final int S=206;
    public static final int FTOR=56;
    public static final int EMPTY=41;
    public static final int INTERSECT=68;
    public static final int MINUSSi=159;
    public static final int FTAND=52;
    public static final int LANGUAGE=71;
    public static final int LOWERCASE=77;
    public static final int LPRAGSi=171;
    public static final int INSENSITIVE=66;
    public static final int APOSSi=186;
    public static final int LBRACKSi=179;
    public static final int RSELFTERMSi=182;
    public static final int GT=60;
    public static final int END=39;
    public static final int DoubleLiteral=170;
    public static final int QUOTSi=184;
    public static final int LexLiterals=207;
    public static final int DirCommentContent=193;
    public static final int CharRef=210;
    public static final int OPTION=90;
    public static final int Extender=224;
    public static final int OCCURS=88;
    public static final int THESAURUS=123;
    public static final int SATISFIES=106;
    public static final int VERSION=134;
    public static final int RXQCOMMENTSi=227;
    public static final int IDIV=61;
    public static final int ASCENDING=10;
    public static final int ExtraChar=233;
    public static final int AT=11;
    public static final int AS=9;
    public static final int EMPTY_SEQUENCE=42;
    public static final int PARENT=97;
    public static final int CONSTRUCTION=22;
    public static final int THEN=124;
    public static final int ATSi=178;
    public static final int DOCUMENT=34;
    public static final int DBLSLASHSi=174;
    public static final int COLLATION=20;
    public static final int LCOMMENTSi=192;
    public static final int ANCESTOR=6;
    public static final int AMPERSi=211;
    public static final int CleanChar=236;
    public static final int ElementContent=188;
    public static final int CASTABLE=18;
    public static final int MOST=81;
    public static final int EQSi=147;
    public static final int BY=14;
    public static final int NODEBEFORESi=166;
    public static final int DOTSi=181;
    public static final int NCNameChar=230;
    public static final int ITEM=70;
    public static final int TO=126;
    public static final int INHERIT=65;
    public static final int ANCESTOR_OR_SELF=7;
    public static final int DOTDOTSi=177;
    public static final int STEMMING=118;
    public static final int LTOREQSi=163;
    public static final int NotChar=217;
    public static final int DirPIConstructor=200;
    public static final int TEXT=122;
    public static final int MODULE=80;
    public static final int FTNOT=54;
    public static final int ORDERED=93;
    public static final int SAME=105;
    public static final int UNION=129;
    public static final int FOLLOWING_SIBLING=49;
    public static final int StringLiteral=144;
    public static final int SCHEMA=107;
    public static final int COLONSi=151;
    public static final int PiTarget=196;
    public static final int ENTIRE=40;
    public static final int INSTANCE=67;
    public static final int VALIDATE=132;
    public static final int WILDCARDS=137;
    public static final int NOINHERIT=85;
    public static final int DECLARE=25;
    public static final int START=117;
    public static final int IntegerLiteral=168;
    public static final int DIV=33;
    public static final int CombiningChar=223;
    public static final int DESCENDING=29;
    public static final int SELF=111;
    public static final int RPRAGSi=173;
    public static final int NEQSi=161;
    public static final int CAST=17;
    public static final int SENTENCES=113;
    public static final int EXTERNAL=47;
    public static final int LT=78;
    public static final int QUESTIONSi=156;
    public static final int RBRACKSi=180;
    public static final int BACKSLASHSi=232;
    public static final int CASE=16;
    public static final int ENCODING=38;
    public static final int RCOMMENTSi=194;
    public static final int DIFFERENT=31;
    public static final int PLUSSi=158;
    public static final int PragmaLEX=202;
    public static final int DOCUMENT_NODE=35;
    public static final int SCHEMAATTRIBUTE=108;
    public static final int LXQCOMMENTSi=226;
    public static final int SEMICOLONSi=145;
    public static final int WORD=141;
    public static final int SHARPSi=225;
    public static final int UPPERCASE=131;
    public static final int Comment=203;
    public static final int Char=237;
    public static final int Digits=228;
    public static final int QuotAttrContentChar=212;
    public static final int FTOPTION=55;
    public static final int AposAttributeContent=187;
    public static final int COMMENT=21;
    public static final int NE=83;
    public static final int CDataSectionLEX=199;
    public static final int BOUNDARYSPACE=15;
    public static final int NODE=84;
    public static final int CDataContents=190;
    public static final int AposAttrContentChar=213;
    public static final int GREATEST=59;
    public static final int WITHOUT=140;
    public static final int EVERY=44;
    public static final int SENSITIVE=112;
    public static final int PROCESSING_INSTRUCTION=102;
    public static final int WEIGHT=135;
    public static final int OF=89;
    public static final int LTSi=162;
    public static final int NODEAFTERSi=167;
    public static final int RELATIONSHIP=103;
    public static final int NAMESPACE=82;
    public static final int LCDATASi=189;
    public static final int LBRACESi=154;
    public static final int VARIABLE=133;
    public static final int DESCENDANT_OR_SELF=28;
    public static final int BASE_URI=13;
    public static final int NOPRESERVE=86;
    public static final int DirPiContents=197;
    public static final int OR=91;
    public static final int LPARSi=152;
    public static final int STARSi=157;
    public static final int QuotAttributeContent=185;
    public static final int RPISi=198;
    public static final int FROM=51;
    public static final int PRECEDING_SIBLING=100;
    public static final int Letter=219;
    public static final int NCName=146;
    public static final int WHERE=136;
    public static final int LAX=72;
    public static final int ORDER=92;
    public static final int ATTRIBUTE=12;
    public static final int FOR=50;
    public static final int EXCLSi=231;
    public static final int FOLLOWING=48;
    public static final int AND=8;
    public static final int FTCONTAINS=53;
    public static final int IF=62;
    public static final int SCHEMAELEMENT=109;
    public static final int IN=64;
    public static final int PARAGRAPH=95;
    public static final int COPY_NAMESPACES=24;
    public static final int IS=69;
    public static final int SOME=115;
    public static final int ALL=4;
    public static final int STRIP=121;
    public static final int STABLE=116;
    public static final int PIPESi=160;
    public static final int WITH=139;
    public static final int NCNameStartChar=229;
    public static final int LENDTAGSi=183;
    public static final int RBRACSi=155;
    public static final int GTSi=164;
    public static final int XQUERY=143;
    public static final int EXACTLY=45;
    public static final int DEFAULT=26;
    public static final int DESCENDANT=27;
    public static final int NameChar=221;
    public static final int COMMASi=148;
    public static final int SLASHSi=175;
    public static final int Digit=222;
    public static final int DecimalLiteral=169;
    public static final int GTOREQSi=165;
    public static final int UNORDERED=130;
    public static final int PHRASE=98;
    public static final int TOKENSWITCH=208;
    public static final int ElementContentChar=214;
    public static final int ANY=5;
    public static final int SCORE=110;
    public static final int LexSigns=205;
    public static final int ORDERING=94;
    public static final int PredefinedEntityRef=209;
    public static final int Name=218;
    public static final int LEAST=74;
    public static final int WINDOW=138;
    public static final int LEVELS=76;
    public static final int PARAGRAPHS=96;
    public static final int TIMES=125;
    public static final int DirCommentConstLEX=201;
    public static final int LET=75;
    public static final int LE=73;
    public static final int TREAT=127;

        public XQFTParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[178+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }


    	
    	/* Root scope */
    	//Scope currentScope = new Scope();	   // @init-ting her ogsaa
    	XQFTLexer lexer;
    	/*
    	public void setTokenStream(TokenStream input) {
    				String inputz =  "<html> \n" +                                                   //1
                            "{ \n"+                                                         //2
                            "for $act in doc(\"hamlet.xml\")//ACT\n" +                      //3
                            "let $speakers := distinct-values($act//SPEAKER)\n"+            //4
                            "return\n"+                                                     //5
                            "<span>\n"+                                                     //6
                            "<h1>{ $act/TITLE/text() }</h1>\n"+                             //7
                            "<ul>\n"+                                                       //8
                            "{\n"+                                                          //9
                            "for $speaker in $speakers\n"+                                  //10
                            "return <li>{ $speaker }</li>\n"+                               //11
                            "}\n"+                                                          //12
                            "</ul>\n"+                                                      //13
                            "</span>\n"+                                                    //14
                            "}\n"+                                                          //15
                            "</html>\n";                                                    //16
                            	CharStream cs = new ANTLRStringStream(inputz);
    		lexer = (XQFTLexer)input.getTokenSource();
    		lexer.setCharStream(cs);
    		UnbufferedCommonTokenStream tokenz = new UnbufferedCommonTokenStream();
    		tokenz.setTokenSource(lexer);
    		super.setTokenStream(tokenz);
     	
    	}
    */
    	public void setLexer(XQFTLexer lex)
    	{
    		this.lexer=lex;
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




    // $ANTLR start module
    // etc/XQFT.g:263:1: module : ( versionDecl )? ( libraryModule | mainModule ) ;
    public final void module() throws RecognitionException {
        try {
            // etc/XQFT.g:263:32: ( ( versionDecl )? ( libraryModule | mainModule ) )
            // etc/XQFT.g:263:34: ( versionDecl )? ( libraryModule | mainModule )
            {
            // etc/XQFT.g:263:34: ( versionDecl )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==XQUERY) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:263:34: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module522);
                    versionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:263:47: ( libraryModule | mainModule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=ANCESTOR && LA2_0<=ANCESTOR_OR_SELF)||LA2_0==ATTRIBUTE||LA2_0==CHILD||LA2_0==COMMENT||LA2_0==DECLARE||(LA2_0>=DESCENDANT && LA2_0<=DESCENDANT_OR_SELF)||(LA2_0>=DOCUMENT && LA2_0<=ELEMENT)||LA2_0==EVERY||(LA2_0>=FOLLOWING && LA2_0<=FOR)||(LA2_0>=IF && LA2_0<=IMPORT)||LA2_0==LET||LA2_0==NODE||LA2_0==ORDERED||LA2_0==PARENT||(LA2_0>=PRECEDING && LA2_0<=PRECEDING_SIBLING)||LA2_0==PROCESSING_INSTRUCTION||(LA2_0>=SCHEMAATTRIBUTE && LA2_0<=SCHEMAELEMENT)||LA2_0==SELF||LA2_0==SOME||LA2_0==TEXT||LA2_0==TYPESWITCH||LA2_0==UNORDERED||LA2_0==VALIDATE||LA2_0==StringLiteral||LA2_0==NCName||LA2_0==DOLLARSi||LA2_0==LPARSi||(LA2_0>=STARSi && LA2_0<=MINUSSi)||LA2_0==LTSi||(LA2_0>=IntegerLiteral && LA2_0<=LPRAGSi)||(LA2_0>=DBLSLASHSi && LA2_0<=SLASHSi)||(LA2_0>=DOTDOTSi && LA2_0<=ATSi)||LA2_0==DOTSi||LA2_0==LCOMMENTSi||LA2_0==LPISi) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("263:47: ( libraryModule | mainModule )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:263:48: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module526);
                    libraryModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:263:64: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module530);
                    mainModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end module


    // $ANTLR start versionDecl
    // etc/XQFT.g:265:2: versionDecl : XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator ;
    public final void versionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:265:33: ( XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator )
            // etc/XQFT.g:265:35: XQUERY VERSION StringLiteral ( ENCODING StringLiteral )? separator
            {
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl559); if (failed) return ;
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl561); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl563); if (failed) return ;
            // etc/XQFT.g:265:64: ( ENCODING StringLiteral )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ENCODING) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:265:65: ENCODING StringLiteral
                    {
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl566); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl568); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_separator_in_versionDecl572);
            separator();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end versionDecl


    // $ANTLR start separator
    // etc/XQFT.g:266:3: separator : SEMICOLONSi ;
    public final void separator() throws RecognitionException {
        try {
            // etc/XQFT.g:266:34: ( SEMICOLONSi )
            // etc/XQFT.g:266:36: SEMICOLONSi
            {
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_separator602); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end separator


    // $ANTLR start libraryModule
    // etc/XQFT.g:268:2: libraryModule : moduleDecl prolog ;
    public final void libraryModule() throws RecognitionException {
        try {
            // etc/XQFT.g:268:33: ( moduleDecl prolog )
            // etc/XQFT.g:268:35: moduleDecl prolog
            {
            pushFollow(FOLLOW_moduleDecl_in_libraryModule630);
            moduleDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_prolog_in_libraryModule632);
            prolog();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end libraryModule


    // $ANTLR start moduleDecl
    // etc/XQFT.g:269:3: moduleDecl : MODULE NAMESPACE NCName EQSi uriLiteral separator ;
    public final void moduleDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:269:34: ( MODULE NAMESPACE NCName EQSi uriLiteral separator )
            // etc/XQFT.g:269:36: MODULE NAMESPACE NCName EQSi uriLiteral separator
            {
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl661); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl663); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_moduleDecl665); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_moduleDecl667); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl669);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_separator_in_moduleDecl671);
            separator();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end moduleDecl


    // $ANTLR start uriLiteral
    // etc/XQFT.g:270:4: uriLiteral : StringLiteral ;
    public final void uriLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:270:35: ( StringLiteral )
            // etc/XQFT.g:270:37: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral701); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end uriLiteral


    // $ANTLR start mainModule
    // etc/XQFT.g:273:2: mainModule : prolog queryBody ;
    public final void mainModule() throws RecognitionException {
        try {
            // etc/XQFT.g:273:33: ( prolog queryBody )
            // etc/XQFT.g:273:35: prolog queryBody
            {
            pushFollow(FOLLOW_prolog_in_mainModule733);
            prolog();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_queryBody_in_mainModule735);
            queryBody();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end mainModule


    // $ANTLR start queryBody
    // etc/XQFT.g:275:3: queryBody : expr ;
    public final void queryBody() throws RecognitionException {
        try {
            // etc/XQFT.g:275:34: ( expr )
            // etc/XQFT.g:275:36: expr
            {
            pushFollow(FOLLOW_expr_in_queryBody766);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end queryBody


    // $ANTLR start expr
    // etc/XQFT.g:276:4: expr : exprSingle ( COMMASi exprSingle )* ;
    public final void expr() throws RecognitionException {
        try {
            // etc/XQFT.g:276:35: ( exprSingle ( COMMASi exprSingle )* )
            // etc/XQFT.g:276:37: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr802);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:276:48: ( COMMASi exprSingle )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMASi) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // etc/XQFT.g:276:49: COMMASi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr805); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_expr807);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end expr


    // $ANTLR start prolog
    // etc/XQFT.g:282:1: prolog : ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* ;
    public final void prolog() throws RecognitionException {
        try {
            // etc/XQFT.g:282:32: ( ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* )
            // etc/XQFT.g:282:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            {
            // etc/XQFT.g:282:35: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==DECLARE) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==BASE_URI||LA6_1==BOUNDARYSPACE||LA6_1==CONSTRUCTION||LA6_1==COPY_NAMESPACES||LA6_1==DEFAULT||LA6_1==NAMESPACE||LA6_1==ORDERING) ) {
                        alt6=1;
                    }


                }
                else if ( (LA6_0==IMPORT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // etc/XQFT.g:283:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator
            	    {
            	    // etc/XQFT.g:283:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )
            	    int alt5=4;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case DEFAULT:
            	            {
            	            int LA5_3 = input.LA(3);

            	            if ( (LA5_3==COLLATION||LA5_3==ORDER) ) {
            	                alt5=2;
            	            }
            	            else if ( (LA5_3==ELEMENT||LA5_3==FUNCTION) ) {
            	                alt5=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("283:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 3, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case BASE_URI:
            	        case BOUNDARYSPACE:
            	        case CONSTRUCTION:
            	        case COPY_NAMESPACES:
            	        case ORDERING:
            	            {
            	            alt5=2;
            	            }
            	            break;
            	        case NAMESPACE:
            	            {
            	            alt5=3;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("283:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA5_0==IMPORT) ) {
            	        alt5=4;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("283:12: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // etc/XQFT.g:283:13: defaultNamespaceDecl
            	            {
            	            pushFollow(FOLLOW_defaultNamespaceDecl_in_prolog872);
            	            defaultNamespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:283:36: setter
            	            {
            	            pushFollow(FOLLOW_setter_in_prolog876);
            	            setter();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:283:45: namespaceDecl
            	            {
            	            pushFollow(FOLLOW_namespaceDecl_in_prolog880);
            	            namespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:283:61: importStmt
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog884);
            	            importStmt();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog899);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // etc/XQFT.g:286:12: ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==DECLARE) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // etc/XQFT.g:287:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator
            	    {
            	    // etc/XQFT.g:287:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )
            	    int alt7=4;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case FTOPTION:
            	            {
            	            alt7=4;
            	            }
            	            break;
            	        case VARIABLE:
            	            {
            	            alt7=1;
            	            }
            	            break;
            	        case FUNCTION:
            	            {
            	            alt7=2;
            	            }
            	            break;
            	        case OPTION:
            	            {
            	            alt7=3;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("287:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("287:12: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // etc/XQFT.g:287:13: varDecl
            	            {
            	            pushFollow(FOLLOW_varDecl_in_prolog941);
            	            varDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:287:23: functionDecl
            	            {
            	            pushFollow(FOLLOW_functionDecl_in_prolog945);
            	            functionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:287:38: optionDecl
            	            {
            	            pushFollow(FOLLOW_optionDecl_in_prolog949);
            	            optionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:287:51: ftOptionDecl
            	            {
            	            pushFollow(FOLLOW_ftOptionDecl_in_prolog953);
            	            ftOptionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog967);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end prolog


    // $ANTLR start defaultNamespaceDecl
    // etc/XQFT.g:292:1: defaultNamespaceDecl : DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
    public final void defaultNamespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:292:32: ( DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:292:34: DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultNamespaceDecl1000); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultNamespaceDecl1002); if (failed) return ;
            if ( input.LA(1)==ELEMENT||input.LA(1)==FUNCTION ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl1004);    throw mse;
            }

            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl1012); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl1014);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultNamespaceDecl


    // $ANTLR start setter
    // etc/XQFT.g:294:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );
    public final void setter() throws RecognitionException {
        try {
            // etc/XQFT.g:294:32: ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl )
            int alt9=7;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DECLARE) ) {
                switch ( input.LA(2) ) {
                case ORDERING:
                    {
                    alt9=5;
                    }
                    break;
                case CONSTRUCTION:
                    {
                    alt9=4;
                    }
                    break;
                case BASE_URI:
                    {
                    alt9=3;
                    }
                    break;
                case DEFAULT:
                    {
                    int LA9_5 = input.LA(3);

                    if ( (LA9_5==COLLATION) ) {
                        alt9=2;
                    }
                    else if ( (LA9_5==ORDER) ) {
                        alt9=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("294:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case BOUNDARYSPACE:
                    {
                    alt9=1;
                    }
                    break;
                case COPY_NAMESPACES:
                    {
                    alt9=7;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("294:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("294:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:294:34: boundarySpaceDecl
                    {
                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter1046);
                    boundarySpaceDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:295:13: defaultCollationDecl
                    {
                    pushFollow(FOLLOW_defaultCollationDecl_in_setter1061);
                    defaultCollationDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:296:13: baseURIDecl
                    {
                    pushFollow(FOLLOW_baseURIDecl_in_setter1076);
                    baseURIDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:297:13: constructionDecl
                    {
                    pushFollow(FOLLOW_constructionDecl_in_setter1091);
                    constructionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:298:13: orderingModeDecl
                    {
                    pushFollow(FOLLOW_orderingModeDecl_in_setter1106);
                    orderingModeDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:299:13: emptyOrderDecl
                    {
                    pushFollow(FOLLOW_emptyOrderDecl_in_setter1121);
                    emptyOrderDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:300:13: copyNamespacesDecl
                    {
                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter1136);
                    copyNamespacesDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end setter


    // $ANTLR start boundarySpaceDecl
    // etc/XQFT.g:301:2: boundarySpaceDecl : DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final void boundarySpaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:301:33: ( DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:301:35: DECLARE BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_boundarySpaceDecl1157); if (failed) return ;
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl1159); if (failed) return ;
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl1161);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end boundarySpaceDecl


    // $ANTLR start defaultCollationDecl
    // etc/XQFT.g:302:2: defaultCollationDecl : DECLARE DEFAULT COLLATION uriLiteral ;
    public final void defaultCollationDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:302:33: ( DECLARE DEFAULT COLLATION uriLiteral )
            // etc/XQFT.g:302:35: DECLARE DEFAULT COLLATION uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultCollationDecl1185); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultCollationDecl1187); if (failed) return ;
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl1189); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl1191);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultCollationDecl


    // $ANTLR start baseURIDecl
    // etc/XQFT.g:303:2: baseURIDecl : DECLARE BASE_URI uriLiteral ;
    public final void baseURIDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:303:33: ( DECLARE BASE_URI uriLiteral )
            // etc/XQFT.g:303:35: DECLARE BASE_URI uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_baseURIDecl1218); if (failed) return ;
            match(input,BASE_URI,FOLLOW_BASE_URI_in_baseURIDecl1220); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl1222);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end baseURIDecl


    // $ANTLR start constructionDecl
    // etc/XQFT.g:304:2: constructionDecl : DECLARE CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final void constructionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:304:33: ( DECLARE CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:304:35: DECLARE CONSTRUCTION ( STRIP | PRESERVE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_constructionDecl1244); if (failed) return ;
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl1246); if (failed) return ;
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl1248);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end constructionDecl


    // $ANTLR start orderingModeDecl
    // etc/XQFT.g:305:2: orderingModeDecl : DECLARE ORDERING ( ORDERED | UNORDERED ) ;
    public final void orderingModeDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:305:33: ( DECLARE ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:305:35: DECLARE ORDERING ( ORDERED | UNORDERED )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_orderingModeDecl1276); if (failed) return ;
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl1278); if (failed) return ;
            if ( input.LA(1)==ORDERED||input.LA(1)==UNORDERED ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl1280);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderingModeDecl


    // $ANTLR start emptyOrderDecl
    // etc/XQFT.g:306:2: emptyOrderDecl : DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) ;
    public final void emptyOrderDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:306:33: ( DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:306:35: DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_emptyOrderDecl1310); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_emptyOrderDecl1312); if (failed) return ;
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl1314); if (failed) return ;
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl1316); if (failed) return ;
            if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl1318);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end emptyOrderDecl


    // $ANTLR start copyNamespacesDecl
    // etc/XQFT.g:307:2: copyNamespacesDecl : DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode ;
    public final void copyNamespacesDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:307:33: ( DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:307:35: DECLARE COPY_NAMESPACES preserveMode COMMASi inheritMode
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_copyNamespacesDecl1344); if (failed) return ;
            match(input,COPY_NAMESPACES,FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl1346); if (failed) return ;
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl1348);
            preserveMode();
            _fsp--;
            if (failed) return ;
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl1350); if (failed) return ;
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl1352);
            inheritMode();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end copyNamespacesDecl


    // $ANTLR start preserveMode
    // etc/XQFT.g:308:3: preserveMode : ( PRESERVE | NOPRESERVE );
    public final void preserveMode() throws RecognitionException {
        try {
            // etc/XQFT.g:308:34: ( PRESERVE | NOPRESERVE )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==NOPRESERVE||input.LA(1)==PRESERVE ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_preserveMode0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end preserveMode


    // $ANTLR start inheritMode
    // etc/XQFT.g:309:3: inheritMode : ( INHERIT | NOINHERIT );
    public final void inheritMode() throws RecognitionException {
        try {
            // etc/XQFT.g:309:34: ( INHERIT | NOINHERIT )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==INHERIT||input.LA(1)==NOINHERIT ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_inheritMode0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end inheritMode


    // $ANTLR start namespaceDecl
    // etc/XQFT.g:311:1: namespaceDecl : DECLARE NAMESPACE NCName EQSi uriLiteral ;
    public final void namespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:311:32: ( DECLARE NAMESPACE NCName EQSi uriLiteral )
            // etc/XQFT.g:311:34: DECLARE NAMESPACE NCName EQSi uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_namespaceDecl1443); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl1445); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_namespaceDecl1447); if (failed) return ;
            match(input,EQSi,FOLLOW_EQSi_in_namespaceDecl1449); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl1451);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end namespaceDecl


    // $ANTLR start importStmt
    // etc/XQFT.g:313:1: importStmt : ( schemaImport | moduleImport );
    public final void importStmt() throws RecognitionException {
        try {
            // etc/XQFT.g:313:32: ( schemaImport | moduleImport )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==IMPORT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==MODULE) ) {
                    alt10=2;
                }
                else if ( (LA10_1==SCHEMA) ) {
                    alt10=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("313:1: importStmt : ( schemaImport | moduleImport );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("313:1: importStmt : ( schemaImport | moduleImport );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:313:34: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt1479);
                    schemaImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:313:49: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt1483);
                    moduleImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end importStmt


    // $ANTLR start schemaImport
    // etc/XQFT.g:314:2: schemaImport : IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void schemaImport() throws RecognitionException {
        try {
            // etc/XQFT.g:314:33: ( IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:314:35: IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_schemaImport1509); if (failed) return ;
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport1511); if (failed) return ;
            // etc/XQFT.g:314:49: ( schemaPrefix )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DEFAULT||LA11_0==NAMESPACE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // etc/XQFT.g:314:49: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport1513);
                    schemaPrefix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport1516);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:314:74: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:314:75: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_schemaImport1519); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport1521);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:314:89: ( COMMASi uriLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==COMMASi) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // etc/XQFT.g:314:90: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport1524); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport1526);
                    	    uriLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

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

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaImport


    // $ANTLR start schemaPrefix
    // etc/XQFT.g:315:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
    public final void schemaPrefix() throws RecognitionException {
        try {
            // etc/XQFT.g:315:34: ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAMESPACE) ) {
                alt14=1;
            }
            else if ( (LA14_0==DEFAULT) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("315:3: schemaPrefix : ( ( NAMESPACE NCName EQSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:315:36: ( NAMESPACE NCName EQSi )
                    {
                    // etc/XQFT.g:315:36: ( NAMESPACE NCName EQSi )
                    // etc/XQFT.g:315:37: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1558); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_schemaPrefix1560); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_schemaPrefix1562); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:315:62: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    // etc/XQFT.g:315:62: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:315:63: DEFAULT ELEMENT NAMESPACE
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix1568); if (failed) return ;
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix1570); if (failed) return ;
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix1572); if (failed) return ;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaPrefix


    // $ANTLR start moduleImport
    // etc/XQFT.g:316:2: moduleImport : IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void moduleImport() throws RecognitionException {
        try {
            // etc/XQFT.g:316:33: ( IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:316:35: IMPORT MODULE ( NAMESPACE NCName EQSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_moduleImport1599); if (failed) return ;
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport1601); if (failed) return ;
            // etc/XQFT.g:316:49: ( NAMESPACE NCName EQSi )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==NAMESPACE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // etc/XQFT.g:316:50: NAMESPACE NCName EQSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport1604); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_moduleImport1606); if (failed) return ;
                    match(input,EQSi,FOLLOW_EQSi_in_moduleImport1608); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport1612);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:316:85: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:316:86: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_moduleImport1615); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport1617);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:316:100: ( COMMASi uriLiteral )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==COMMASi) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // etc/XQFT.g:316:101: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport1620); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport1622);
                    	    uriLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

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

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end moduleImport


    // $ANTLR start varDecl
    // etc/XQFT.g:318:1: varDecl : DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) ;
    public final void varDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:318:32: ( DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:318:34: DECLARE VARIABLE DOLLARSi qName ( typeDeclaration )? ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_varDecl1658); if (failed) return ;
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl1660); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl1662); if (failed) return ;
            pushFollow(FOLLOW_qName_in_varDecl1664);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:318:66: ( typeDeclaration )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==AS) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:318:66: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl1666);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:318:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ASSIGNSi) ) {
                alt19=1;
            }
            else if ( (LA19_0==EXTERNAL) ) {
                alt19=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("318:83: ( ( ASSIGNSi exprSingle ) | EXTERNAL )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:318:84: ( ASSIGNSi exprSingle )
                    {
                    // etc/XQFT.g:318:84: ( ASSIGNSi exprSingle )
                    // etc/XQFT.g:318:85: ASSIGNSi exprSingle
                    {
                    match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varDecl1671); if (failed) return ;
                    pushFollow(FOLLOW_exprSingle_in_varDecl1673);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:318:108: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl1678); if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end varDecl


    // $ANTLR start qName
    // etc/XQFT.g:319:2: qName returns [String text] : nc1= NCName (c= COLONSi nc2= NCName )? ;
    public final String qName() throws RecognitionException {
        String text = null;

        Token nc1=null;
        Token c=null;
        Token nc2=null;

        try {
            // etc/XQFT.g:319:36: (nc1= NCName (c= COLONSi nc2= NCName )? )
            // etc/XQFT.g:319:38: nc1= NCName (c= COLONSi nc2= NCName )?
            {
            nc1=(Token)input.LT(1);
            match(input,NCName,FOLLOW_NCName_in_qName1699); if (failed) return text;
            // etc/XQFT.g:319:49: (c= COLONSi nc2= NCName )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==COLONSi) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:319:50: c= COLONSi nc2= NCName
                    {
                    c=(Token)input.LT(1);
                    match(input,COLONSi,FOLLOW_COLONSi_in_qName1704); if (failed) return text;
                    nc2=(Token)input.LT(1);
                    match(input,NCName,FOLLOW_NCName_in_qName1708); if (failed) return text;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               text = nc1.getText() + (c != null ? c.getText() + nc2.getText() : ""); 
            }

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return text;
    }
    // $ANTLR end qName


    // $ANTLR start typeDeclaration
    // etc/XQFT.g:320:2: typeDeclaration : AS sequenceType ;
    public final void typeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:320:33: ( AS sequenceType )
            // etc/XQFT.g:320:35: AS sequenceType
            {
            match(input,AS,FOLLOW_AS_in_typeDeclaration1735); if (failed) return ;
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration1737);
            sequenceType();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end typeDeclaration


    // $ANTLR start functionDecl
    // etc/XQFT.g:324:1: functionDecl : DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) ;
    public final void functionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:324:32: ( DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) )
            // etc/XQFT.g:324:34: DECLARE FUNCTION qName LPARSi ( paramList )? RPARSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_functionDecl1766); if (failed) return ;
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl1768); if (failed) return ;
            pushFollow(FOLLOW_qName_in_functionDecl1770);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionDecl1772); if (failed) return ;
            // etc/XQFT.g:324:64: ( paramList )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==DOLLARSi) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:324:64: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl1774);
                    paramList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionDecl1777); if (failed) return ;
            // etc/XQFT.g:325:12: ( AS sequenceType )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==AS) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // etc/XQFT.g:325:13: AS sequenceType
                    {
                    match(input,AS,FOLLOW_AS_in_functionDecl1792); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_functionDecl1794);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:325:31: ( enclosedExpr | EXTERNAL )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LBRACESi) ) {
                alt23=1;
            }
            else if ( (LA23_0==EXTERNAL) ) {
                alt23=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("325:31: ( enclosedExpr | EXTERNAL )", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:325:32: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl1799);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:325:47: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl1803); if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end functionDecl


    // $ANTLR start paramList
    // etc/XQFT.g:326:2: paramList : param ( COMMASi param )* ;
    public final void paramList() throws RecognitionException {
        try {
            // etc/XQFT.g:326:33: ( param ( COMMASi param )* )
            // etc/XQFT.g:326:35: param ( COMMASi param )*
            {
            pushFollow(FOLLOW_param_in_paramList1833);
            param();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:326:41: ( COMMASi param )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMASi) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:326:42: COMMASi param
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList1836); if (failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList1838);
            	    param();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end paramList


    // $ANTLR start param
    // etc/XQFT.g:327:3: param : DOLLARSi qName ( typeDeclaration )? ;
    public final void param() throws RecognitionException {
        try {
            // etc/XQFT.g:327:34: ( DOLLARSi qName ( typeDeclaration )? )
            // etc/XQFT.g:327:36: DOLLARSi qName ( typeDeclaration )?
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param1874); if (failed) return ;
            pushFollow(FOLLOW_qName_in_param1876);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:327:51: ( typeDeclaration )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==AS) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:327:51: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param1878);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end param


    // $ANTLR start enclosedExpr
    // etc/XQFT.g:333:2: enclosedExpr : LBRACESi expr RBRACSi ;
    public final void enclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:333:33: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:334:13: LBRACESi expr RBRACSi
            {
            match(input,LBRACESi,FOLLOW_LBRACESi_in_enclosedExpr1923); if (failed) return ;
            pushFollow(FOLLOW_expr_in_enclosedExpr1938);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_enclosedExpr1953); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end enclosedExpr


    // $ANTLR start optionDecl
    // etc/XQFT.g:342:1: optionDecl : DECLARE OPTION qName StringLiteral ;
    public final void optionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:342:32: ( DECLARE OPTION qName StringLiteral )
            // etc/XQFT.g:342:34: DECLARE OPTION qName StringLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_optionDecl2000); if (failed) return ;
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl2002); if (failed) return ;
            pushFollow(FOLLOW_qName_in_optionDecl2004);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl2006); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end optionDecl


    // $ANTLR start ftOptionDecl
    // etc/XQFT.g:344:1: ftOptionDecl : DECLARE FTOPTION ftMatchOptions ;
    public final void ftOptionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:344:32: ( DECLARE FTOPTION ftMatchOptions )
            // etc/XQFT.g:344:34: DECLARE FTOPTION ftMatchOptions
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_ftOptionDecl2032); if (failed) return ;
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl2034); if (failed) return ;
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl2036);
            ftMatchOptions();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOptionDecl


    // $ANTLR start ftMatchOptions
    // etc/XQFT.g:345:2: ftMatchOptions : ( ftMatchOption )+ ;
    public final void ftMatchOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:345:33: ( ( ftMatchOption )+ )
            // etc/XQFT.g:345:35: ( ftMatchOption )+
            {
            // etc/XQFT.g:345:35: ( ftMatchOption )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                switch ( input.LA(1) ) {
                case WITHOUT:
                    {
                    int LA26_2 = input.LA(2);

                    if ( ((LA26_2>=STEMMING && LA26_2<=STOP)||LA26_2==THESAURUS||LA26_2==WILDCARDS) ) {
                        alt26=1;
                    }


                    }
                    break;
                case CASE:
                    {
                    int LA26_3 = input.LA(2);

                    if ( (LA26_3==INSENSITIVE||LA26_3==SENSITIVE) ) {
                        alt26=1;
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
                    alt26=1;
                    }
                    break;

                }

                switch (alt26) {
            	case 1 :
            	    // etc/XQFT.g:345:35: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions2060);
            	    ftMatchOption();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMatchOptions


    // $ANTLR start sequenceType
    // etc/XQFT.g:351:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );
    public final void sequenceType() throws RecognitionException {
        try {
            // etc/XQFT.g:351:32: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi )
            int alt27=3;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // etc/XQFT.g:351:34: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType2112);
                    itemType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType2114);
                    occurrenceIndicator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:352:13: itemType
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType2128);
                    itemType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:353:13: EMPTY_SEQUENCE LPARSi RPARSi
                    {
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType2142); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_sequenceType2144); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_sequenceType2146); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end sequenceType


    // $ANTLR start itemType
    // etc/XQFT.g:355:2: itemType : ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) ;
    public final void itemType() throws RecognitionException {
        try {
            // etc/XQFT.g:355:33: ( ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType ) )
            // etc/XQFT.g:355:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            {
            // etc/XQFT.g:355:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )
            int alt28=3;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
            case COMMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case NODE:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case TEXT:
                {
                alt28=1;
                }
                break;
            case ITEM:
                {
                alt28=2;
                }
                break;
            case NCName:
                {
                alt28=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("355:35: ( kindTest | ( ITEM LPARSi RPARSi ) | atomicType )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:355:36: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType2188);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:355:47: ( ITEM LPARSi RPARSi )
                    {
                    // etc/XQFT.g:355:47: ( ITEM LPARSi RPARSi )
                    // etc/XQFT.g:355:48: ITEM LPARSi RPARSi
                    {
                    match(input,ITEM,FOLLOW_ITEM_in_itemType2193); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_itemType2195); if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_itemType2197); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:355:70: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType2202);
                    atomicType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end itemType


    // $ANTLR start kindTest
    // etc/XQFT.g:356:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
    public final void kindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:356:34: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
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
            case SCHEMAELEMENT:
                {
                alt29=4;
                }
                break;
            case SCHEMAATTRIBUTE:
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
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("356:3: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:356:36: documentTest
                    {
                    pushFollow(FOLLOW_documentTest_in_kindTest2234);
                    documentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:357:39: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_kindTest2274);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:358:39: attributeTest
                    {
                    pushFollow(FOLLOW_attributeTest_in_kindTest2314);
                    attributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:359:39: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_kindTest2354);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:360:39: schemaAttributeTest
                    {
                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest2394);
                    schemaAttributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:361:39: piTest
                    {
                    pushFollow(FOLLOW_piTest_in_kindTest2434);
                    piTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:362:39: commentTest
                    {
                    pushFollow(FOLLOW_commentTest_in_kindTest2474);
                    commentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:363:39: textTest
                    {
                    pushFollow(FOLLOW_textTest_in_kindTest2514);
                    textTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:364:39: anyKindTest
                    {
                    pushFollow(FOLLOW_anyKindTest_in_kindTest2554);
                    anyKindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end kindTest


    // $ANTLR start documentTest
    // etc/XQFT.g:365:4: documentTest : DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi ;
    public final void documentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:365:35: ( DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi )
            // etc/XQFT.g:365:37: DOCUMENT_NODE LPARSi ( elementTest | schemaElementTest )? RPARSi
            {
            match(input,DOCUMENT_NODE,FOLLOW_DOCUMENT_NODE_in_documentTest2582); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_documentTest2584); if (failed) return ;
            // etc/XQFT.g:365:58: ( elementTest | schemaElementTest )?
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==ELEMENT) ) {
                alt30=1;
            }
            else if ( (LA30_0==SCHEMAELEMENT) ) {
                alt30=2;
            }
            switch (alt30) {
                case 1 :
                    // etc/XQFT.g:365:59: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest2587);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:365:73: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest2591);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_documentTest2595); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end documentTest


    // $ANTLR start elementTest
    // etc/XQFT.g:366:5: elementTest : ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi ;
    public final void elementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:366:34: ( ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi )
            // etc/XQFT.g:366:36: ELEMENT LPARSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )? RPARSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest2623); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_elementTest2625); if (failed) return ;
            // etc/XQFT.g:366:51: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )? )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==NCName||LA33_0==STARSi) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // etc/XQFT.g:366:52: elementNameOrWildcard ( COMMASi typeName ( QUESTIONSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest2628);
                    elementNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:366:74: ( COMMASi typeName ( QUESTIONSi )? )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==COMMASi) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // etc/XQFT.g:366:75: COMMASi typeName ( QUESTIONSi )?
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest2631); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_elementTest2633);
                            typeName();
                            _fsp--;
                            if (failed) return ;
                            // etc/XQFT.g:366:92: ( QUESTIONSi )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==QUESTIONSi) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // etc/XQFT.g:366:92: QUESTIONSi
                                    {
                                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_elementTest2635); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_elementTest2642); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end elementTest


    // $ANTLR start elementNameOrWildcard
    // etc/XQFT.g:367:6: elementNameOrWildcard : ( elementName | STARSi );
    public final void elementNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:367:37: ( elementName | STARSi )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==NCName) ) {
                alt34=1;
            }
            else if ( (LA34_0==STARSi) ) {
                alt34=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("367:6: elementNameOrWildcard : ( elementName | STARSi );", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // etc/XQFT.g:367:39: elementName
                    {
                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard2699);
                    elementName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:367:53: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard2703); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end elementNameOrWildcard


    // $ANTLR start elementName
    // etc/XQFT.g:368:7: elementName : qName ;
    public final void elementName() throws RecognitionException {
        try {
            // etc/XQFT.g:368:38: ( qName )
            // etc/XQFT.g:368:40: qName
            {
            pushFollow(FOLLOW_qName_in_elementName2735);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end elementName


    // $ANTLR start typeName
    // etc/XQFT.g:369:6: typeName : qName ;
    public final void typeName() throws RecognitionException {
        try {
            // etc/XQFT.g:369:37: ( qName )
            // etc/XQFT.g:369:39: qName
            {
            pushFollow(FOLLOW_qName_in_typeName2769);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end typeName


    // $ANTLR start schemaElementTest
    // etc/XQFT.g:370:5: schemaElementTest : SCHEMAELEMENT LPARSi elementDeclaration RPARSi ;
    public final void schemaElementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:370:37: ( SCHEMAELEMENT LPARSi elementDeclaration RPARSi )
            // etc/XQFT.g:370:39: SCHEMAELEMENT LPARSi elementDeclaration RPARSi
            {
            match(input,SCHEMAELEMENT,FOLLOW_SCHEMAELEMENT_in_schemaElementTest2794); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaElementTest2796); if (failed) return ;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest2798);
            elementDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaElementTest2800); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaElementTest


    // $ANTLR start elementDeclaration
    // etc/XQFT.g:371:6: elementDeclaration : elementName ;
    public final void elementDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:371:37: ( elementName )
            // etc/XQFT.g:371:39: elementName
            {
            pushFollow(FOLLOW_elementName_in_elementDeclaration2824);
            elementName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end elementDeclaration


    // $ANTLR start attributeTest
    // etc/XQFT.g:377:4: attributeTest : ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi ;
    public final void attributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:377:35: ( ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi )
            // etc/XQFT.g:377:37: ATTRIBUTE LPARSi ( attribNameOrWildcard ( COMMASi typeName )? )? RPARSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest2856); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_attributeTest2858); if (failed) return ;
            // etc/XQFT.g:377:54: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==NCName||LA36_0==STARSi) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // etc/XQFT.g:377:55: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest2861);
                    attribNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:377:76: ( COMMASi typeName )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==COMMASi) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // etc/XQFT.g:377:77: COMMASi typeName
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest2864); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_attributeTest2866);
                            typeName();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_attributeTest2872); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeTest


    // $ANTLR start attribNameOrWildcard
    // etc/XQFT.g:378:5: attribNameOrWildcard : ( attributeName | STARSi );
    public final void attribNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:378:36: ( attributeName | STARSi )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==NCName) ) {
                alt37=1;
            }
            else if ( (LA37_0==STARSi) ) {
                alt37=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("378:5: attribNameOrWildcard : ( attributeName | STARSi );", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:378:38: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard2893);
                    attributeName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:378:54: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard2897); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end attribNameOrWildcard


    // $ANTLR start attributeName
    // etc/XQFT.g:379:6: attributeName : qName ;
    public final void attributeName() throws RecognitionException {
        try {
            // etc/XQFT.g:379:37: ( qName )
            // etc/XQFT.g:379:39: qName
            {
            pushFollow(FOLLOW_qName_in_attributeName2926);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeName


    // $ANTLR start schemaAttributeTest
    // etc/XQFT.g:384:4: schemaAttributeTest : SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi ;
    public final void schemaAttributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:384:35: ( SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi )
            // etc/XQFT.g:384:37: SCHEMAATTRIBUTE LPARSi attributeDeclaration RPARSi
            {
            match(input,SCHEMAATTRIBUTE,FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2951); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_schemaAttributeTest2953); if (failed) return ;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest2955);
            attributeDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_schemaAttributeTest2957); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaAttributeTest


    // $ANTLR start attributeDeclaration
    // etc/XQFT.g:385:5: attributeDeclaration : attributeName ;
    public final void attributeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:385:36: ( attributeName )
            // etc/XQFT.g:385:38: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_attributeDeclaration2978);
            attributeName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeDeclaration


    // $ANTLR start piTest
    // etc/XQFT.g:387:4: piTest : PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi ;
    public final void piTest() throws RecognitionException {
        try {
            // etc/XQFT.g:387:35: ( PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi )
            // etc/XQFT.g:387:37: PROCESSING_INSTRUCTION LPARSi ( NCName | StringLiteral )? RPARSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest3013); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_piTest3015); if (failed) return ;
            // etc/XQFT.g:387:67: ( NCName | StringLiteral )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==StringLiteral||LA38_0==NCName) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // etc/XQFT.g:
                    {
                    if ( input.LA(1)==StringLiteral||input.LA(1)==NCName ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_piTest3017);    throw mse;
                    }


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_piTest3026); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end piTest


    // $ANTLR start commentTest
    // etc/XQFT.g:388:4: commentTest : COMMENT LPARSi RPARSi ;
    public final void commentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:388:35: ( COMMENT LPARSi RPARSi )
            // etc/XQFT.g:388:37: COMMENT LPARSi RPARSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest3055); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_commentTest3057); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_commentTest3059); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end commentTest


    // $ANTLR start textTest
    // etc/XQFT.g:389:4: textTest : TEXT LPARSi RPARSi ;
    public final void textTest() throws RecognitionException {
        try {
            // etc/XQFT.g:389:35: ( TEXT LPARSi RPARSi )
            // etc/XQFT.g:389:37: TEXT LPARSi RPARSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_textTest3091); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_textTest3093); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_textTest3095); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end textTest


    // $ANTLR start anyKindTest
    // etc/XQFT.g:390:4: anyKindTest : NODE LPARSi RPARSi ;
    public final void anyKindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:390:35: ( NODE LPARSi RPARSi )
            // etc/XQFT.g:390:37: NODE LPARSi RPARSi
            {
            match(input,NODE,FOLLOW_NODE_in_anyKindTest3124); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_anyKindTest3126); if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_anyKindTest3128); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end anyKindTest


    // $ANTLR start occurrenceIndicator
    // etc/XQFT.g:391:2: occurrenceIndicator : ( QUESTIONSi | STARSi | PLUSSi );
    public final void occurrenceIndicator() throws RecognitionException {
        try {
            // etc/XQFT.g:391:33: ( QUESTIONSi | STARSi | PLUSSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=QUESTIONSi && input.LA(1)<=PLUSSi) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_occurrenceIndicator0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end occurrenceIndicator


    // $ANTLR start exprSingle
    // etc/XQFT.g:395:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );
    public final void exprSingle() throws RecognitionException {
        try {
            // etc/XQFT.g:395:32: ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr )
            int alt39=5;
            switch ( input.LA(1) ) {
            case FOR:
            case LET:
                {
                alt39=1;
                }
                break;
            case EVERY:
            case SOME:
                {
                alt39=2;
                }
                break;
            case TYPESWITCH:
                {
                alt39=3;
                }
                break;
            case IF:
                {
                alt39=4;
                }
                break;
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case ATTRIBUTE:
            case CHILD:
            case COMMENT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case NODE:
            case ORDERED:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case SELF:
            case TEXT:
            case UNORDERED:
            case VALIDATE:
            case StringLiteral:
            case NCName:
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
            case DBLSLASHSi:
            case SLASHSi:
            case DOTDOTSi:
            case ATSi:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt39=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("395:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // etc/XQFT.g:395:34: fLWORExpr
                    {
                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle3188);
                    fLWORExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:396:37: quantifiedExpr
                    {
                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle3226);
                    quantifiedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:397:37: typeswitchExpr
                    {
                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle3264);
                    typeswitchExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:398:37: ifExpr
                    {
                    pushFollow(FOLLOW_ifExpr_in_exprSingle3302);
                    ifExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:399:37: orExpr
                    {
                    pushFollow(FOLLOW_orExpr_in_exprSingle3340);
                    orExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end exprSingle


    // $ANTLR start fLWORExpr
    // etc/XQFT.g:401:2: fLWORExpr : ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle ;
    public final void fLWORExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:401:33: ( ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle )
            // etc/XQFT.g:401:35: ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:401:35: ( forClause | letClause )+
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
            	    // etc/XQFT.g:401:36: forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr3405);
            	    forClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:401:48: letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr3409);
            	    letClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            // etc/XQFT.g:401:60: ( whereClause )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==WHERE) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // etc/XQFT.g:401:60: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr3413);
                    whereClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:401:73: ( orderByClause )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==ORDER||LA42_0==STABLE) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // etc/XQFT.g:401:73: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr3416);
                    orderByClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr3419); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_fLWORExpr3421);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end fLWORExpr


    // $ANTLR start forClause
    // etc/XQFT.g:403:3: forClause : FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* ;
    public final void forClause() throws RecognitionException {
        try {
            // etc/XQFT.g:403:34: ( FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* )
            // etc/XQFT.g:403:36: FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            {
            match(input,FOR,FOLLOW_FOR_in_forClause3453); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3455); if (failed) return ;
            pushFollow(FOLLOW_varName_in_forClause3457);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:403:57: ( typeDeclaration )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==AS) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // etc/XQFT.g:403:57: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClause3459);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:403:74: ( positionalVar )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==AT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // etc/XQFT.g:403:74: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClause3462);
                    positionalVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:403:89: ( ftScoreVar )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==SCORE) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:403:89: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClause3465);
                    ftScoreVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_forClause3468); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_forClause3470);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:404:14: ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==COMMASi) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // etc/XQFT.g:404:15: COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause3487); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause3489); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_forClause3491);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:404:40: ( typeDeclaration )?
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==AS) ) {
            	        alt46=1;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // etc/XQFT.g:404:40: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_forClause3493);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:404:57: ( positionalVar )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==AT) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // etc/XQFT.g:404:57: positionalVar
            	            {
            	            pushFollow(FOLLOW_positionalVar_in_forClause3496);
            	            positionalVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:404:72: ( ftScoreVar )?
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( (LA48_0==SCORE) ) {
            	        alt48=1;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // etc/XQFT.g:404:72: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_forClause3499);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_forClause3502); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_forClause3504);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end forClause


    // $ANTLR start varName
    // etc/XQFT.g:405:4: varName returns [String name] : qn= qName ;
    public final String varName() throws RecognitionException {
        String name = null;

        String qn = null;


        try {
            // etc/XQFT.g:405:43: (qn= qName )
            // etc/XQFT.g:405:45: qn= qName
            {
            pushFollow(FOLLOW_qName_in_varName3531);
            qn=qName();
            _fsp--;
            if (failed) return name;
            if ( backtracking==0 ) {
              name = qn;
            }

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return name;
    }
    // $ANTLR end varName


    // $ANTLR start positionalVar
    // etc/XQFT.g:408:4: positionalVar : AT DOLLARSi varName ;
    public final void positionalVar() throws RecognitionException {
        try {
            // etc/XQFT.g:408:35: ( AT DOLLARSi varName )
            // etc/XQFT.g:408:37: AT DOLLARSi varName
            {
            match(input,AT,FOLLOW_AT_in_positionalVar3562); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar3564); if (failed) return ;
            pushFollow(FOLLOW_varName_in_positionalVar3566);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end positionalVar


    // $ANTLR start ftScoreVar
    // etc/XQFT.g:410:4: ftScoreVar : SCORE DOLLARSi varName ;
    public final void ftScoreVar() throws RecognitionException {
        try {
            // etc/XQFT.g:410:35: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:410:37: SCORE DOLLARSi varName
            {
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar3597); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar3599); if (failed) return ;
            pushFollow(FOLLOW_varName_in_ftScoreVar3601);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftScoreVar


    // $ANTLR start letClause
    // etc/XQFT.g:414:3: letClause : LET varBinding ( COMMASi varBinding )* ;
    public final void letClause() throws RecognitionException {
        try {
            // etc/XQFT.g:414:39: ( LET varBinding ( COMMASi varBinding )* )
            // etc/XQFT.g:414:41: LET varBinding ( COMMASi varBinding )*
            {
            match(input,LET,FOLLOW_LET_in_letClause3651); if (failed) return ;
            pushFollow(FOLLOW_varBinding_in_letClause3653);
            varBinding();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:414:56: ( COMMASi varBinding )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==COMMASi) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // etc/XQFT.g:414:57: COMMASi varBinding
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause3656); if (failed) return ;
            	    pushFollow(FOLLOW_varBinding_in_letClause3658);
            	    varBinding();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end letClause


    // $ANTLR start varBinding
    // etc/XQFT.g:415:3: varBinding : ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle ;
    public final void varBinding() throws RecognitionException {
        String v1 = null;

        String v2 = null;


        try {
            // etc/XQFT.g:415:14: ( ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle )
            // etc/XQFT.g:416:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName ) ASSIGNSi exprSingle
            {
            // etc/XQFT.g:416:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==DOLLARSi) ) {
                alt52=1;
            }
            else if ( (LA52_0==SCORE) ) {
                alt52=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("416:4: ( DOLLARSi v1= varName ( typeDeclaration )? | SCORE DOLLARSi v2= varName )", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // etc/XQFT.g:416:5: DOLLARSi v1= varName ( typeDeclaration )?
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding3673); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_varBinding3677);
                    v1=varName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:416:25: ( typeDeclaration )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==AS) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // etc/XQFT.g:416:25: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_varBinding3679);
                            typeDeclaration();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:416:96: SCORE DOLLARSi v2= varName
                    {
                    match(input,SCORE,FOLLOW_SCORE_in_varBinding3686); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varBinding3688); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_varBinding3692);
                    v2=varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,ASSIGNSi,FOLLOW_ASSIGNSi_in_varBinding3709); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_varBinding3711);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end varBinding


    // $ANTLR start whereClause
    // etc/XQFT.g:427:3: whereClause : WHERE exprSingle ;
    public final void whereClause() throws RecognitionException {
        try {
            // etc/XQFT.g:427:33: ( WHERE exprSingle )
            // etc/XQFT.g:427:35: WHERE exprSingle
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause3749); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_whereClause3751);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end whereClause


    // $ANTLR start orderByClause
    // etc/XQFT.g:430:3: orderByClause : ( ORDER BY | STABLE ORDER BY ) orderSpecList ;
    public final void orderByClause() throws RecognitionException {
        try {
            // etc/XQFT.g:430:33: ( ( ORDER BY | STABLE ORDER BY ) orderSpecList )
            // etc/XQFT.g:430:35: ( ORDER BY | STABLE ORDER BY ) orderSpecList
            {
            // etc/XQFT.g:430:35: ( ORDER BY | STABLE ORDER BY )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==ORDER) ) {
                alt53=1;
            }
            else if ( (LA53_0==STABLE) ) {
                alt53=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("430:35: ( ORDER BY | STABLE ORDER BY )", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // etc/XQFT.g:430:36: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3783); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3785); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:430:47: STABLE ORDER BY
                    {
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause3789); if (failed) return ;
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause3791); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause3793); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause3796);
            orderSpecList();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderByClause


    // $ANTLR start orderSpecList
    // etc/XQFT.g:431:4: orderSpecList : orderSpec ( COMMASi orderSpec )* ;
    public final void orderSpecList() throws RecognitionException {
        try {
            // etc/XQFT.g:431:34: ( orderSpec ( COMMASi orderSpec )* )
            // etc/XQFT.g:431:36: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList3822);
            orderSpec();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:431:46: ( COMMASi orderSpec )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==COMMASi) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // etc/XQFT.g:431:47: COMMASi orderSpec
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList3825); if (failed) return ;
            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList3827);
            	    orderSpec();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderSpecList


    // $ANTLR start orderSpec
    // etc/XQFT.g:432:5: orderSpec : exprSingle orderModifier ;
    public final void orderSpec() throws RecognitionException {
        try {
            // etc/XQFT.g:432:35: ( exprSingle orderModifier )
            // etc/XQFT.g:432:37: exprSingle orderModifier
            {
            pushFollow(FOLLOW_exprSingle_in_orderSpec3860);
            exprSingle();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_orderModifier_in_orderSpec3862);
            orderModifier();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderSpec


    // $ANTLR start orderModifier
    // etc/XQFT.g:434:6: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final void orderModifier() throws RecognitionException {
        try {
            // etc/XQFT.g:434:36: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:434:38: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            // etc/XQFT.g:434:38: ( ASCENDING | DESCENDING )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==ASCENDING||LA55_0==DESCENDING) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // etc/XQFT.g:
                    {
                    if ( input.LA(1)==ASCENDING||input.LA(1)==DESCENDING ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3891);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:434:64: ( EMPTY ( GREATEST | LEAST ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EMPTY) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // etc/XQFT.g:434:65: EMPTY ( GREATEST | LEAST )
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier3901); if (failed) return ;
                    if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier3903);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:434:92: ( COLLATION uriLiteral )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COLLATION) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // etc/XQFT.g:434:93: COLLATION uriLiteral
                    {
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier3914); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier3916);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderModifier


    // $ANTLR start quantifiedExpr
    // etc/XQFT.g:440:2: quantifiedExpr : ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle ;
    public final void quantifiedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:440:33: ( ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle )
            // etc/XQFT.g:440:35: ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle
            {
            if ( input.LA(1)==EVERY||input.LA(1)==SOME ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_quantifiedExpr3951);    throw mse;
            }

            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3959); if (failed) return ;
            pushFollow(FOLLOW_varName_in_quantifiedExpr3961);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:440:67: ( typeDeclaration )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==AS) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // etc/XQFT.g:440:67: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3963);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_quantifiedExpr3966); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3968);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:441:13: ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==COMMASi) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // etc/XQFT.g:441:14: COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr3984); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr3986); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_quantifiedExpr3988);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:441:39: ( typeDeclaration )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==AS) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // etc/XQFT.g:441:39: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr3990);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_quantifiedExpr3993); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_quantifiedExpr3995);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr3999); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr4001);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end quantifiedExpr


    // $ANTLR start typeswitchExpr
    // etc/XQFT.g:445:2: typeswitchExpr : TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle ;
    public final void typeswitchExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:445:33: ( TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle )
            // etc/XQFT.g:445:35: TYPESWITCH LPARSi expr RPARSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr4034); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_typeswitchExpr4036); if (failed) return ;
            pushFollow(FOLLOW_expr_in_typeswitchExpr4038);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_typeswitchExpr4040); if (failed) return ;
            // etc/XQFT.g:445:65: ( caseClause )+
            int cnt61=0;
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==CASE) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // etc/XQFT.g:445:65: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr4042);
            	    caseClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
            } while (true);

            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr4058); if (failed) return ;
            // etc/XQFT.g:446:21: ( DOLLARSi varName )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==DOLLARSi) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // etc/XQFT.g:446:22: DOLLARSi varName
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr4061); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_typeswitchExpr4063);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr4067); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr4069);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end typeswitchExpr


    // $ANTLR start caseClause
    // etc/XQFT.g:449:3: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle ;
    public final void caseClause() throws RecognitionException {
        try {
            // etc/XQFT.g:449:34: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle )
            // etc/XQFT.g:449:36: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause4100); if (failed) return ;
            // etc/XQFT.g:449:41: ( DOLLARSi varName AS )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==DOLLARSi) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // etc/XQFT.g:449:42: DOLLARSi varName AS
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause4103); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_caseClause4105);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_caseClause4107); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause4111);
            sequenceType();
            _fsp--;
            if (failed) return ;
            match(input,RETURN,FOLLOW_RETURN_in_caseClause4113); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_caseClause4115);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end caseClause


    // $ANTLR start ifExpr
    // etc/XQFT.g:457:2: ifExpr : IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle ;
    public final void ifExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:457:33: ( IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle )
            // etc/XQFT.g:457:35: IF LPARSi expr RPARSi THEN exprSingle ELSE exprSingle
            {
            match(input,IF,FOLLOW_IF_in_ifExpr4156); if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_ifExpr4158); if (failed) return ;
            pushFollow(FOLLOW_expr_in_ifExpr4160);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RPARSi,FOLLOW_RPARSi_in_ifExpr4162); if (failed) return ;
            match(input,THEN,FOLLOW_THEN_in_ifExpr4164); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr4166);
            exprSingle();
            _fsp--;
            if (failed) return ;
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr4168); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr4170);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ifExpr


    // $ANTLR start orExpr
    // etc/XQFT.g:463:2: orExpr : andExpr ( OR andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:463:33: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:463:35: andExpr ( OR andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr4211);
            andExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:463:43: ( OR andExpr )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==OR) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // etc/XQFT.g:463:45: OR andExpr
            	    {
            	    match(input,OR,FOLLOW_OR_in_orExpr4215); if (failed) return ;
            	    pushFollow(FOLLOW_andExpr_in_orExpr4217);
            	    andExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orExpr


    // $ANTLR start andExpr
    // etc/XQFT.g:464:3: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:464:34: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:464:36: comparisonExpr ( AND comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_andExpr4252);
            comparisonExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:464:51: ( AND comparisonExpr )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==AND) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // etc/XQFT.g:464:53: AND comparisonExpr
            	    {
            	    match(input,AND,FOLLOW_AND_in_andExpr4256); if (failed) return ;
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr4258);
            	    comparisonExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end andExpr


    // $ANTLR start comparisonExpr
    // etc/XQFT.g:470:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:470:32: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:470:34: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr4292);
            ftContainsExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:470:49: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==EQ||LA67_0==GE||LA67_0==GT||LA67_0==IS||LA67_0==LE||LA67_0==LT||LA67_0==NE||LA67_0==EQSi||(LA67_0>=NEQSi && LA67_0<=NODEAFTERSi)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // etc/XQFT.g:470:51: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:470:51: ( valueComp | generalComp | nodeComp )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case EQ:
                    case GE:
                    case GT:
                    case LE:
                    case LT:
                    case NE:
                        {
                        alt66=1;
                        }
                        break;
                    case EQSi:
                    case NEQSi:
                    case LTSi:
                    case LTOREQSi:
                    case GTSi:
                    case GTOREQSi:
                        {
                        alt66=2;
                        }
                        break;
                    case IS:
                    case NODEBEFORESi:
                    case NODEAFTERSi:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("470:51: ( valueComp | generalComp | nodeComp )", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // etc/XQFT.g:470:52: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr4297);
                            valueComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:470:64: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr4301);
                            generalComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:470:78: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr4305);
                            nodeComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr4308);
                    ftContainsExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end comparisonExpr


    // $ANTLR start ftContainsExpr
    // etc/XQFT.g:473:2: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final void ftContainsExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:473:33: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:473:35: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr4337);
            rangeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:473:45: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==FTCONTAINS) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // etc/XQFT.g:473:47: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr4341); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr4343);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:473:70: ( ftIgnoreOption )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==WITHOUT) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // etc/XQFT.g:473:70: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr4345);
                            ftIgnoreOption();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftContainsExpr


    // $ANTLR start rangeExpr
    // etc/XQFT.g:475:3: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final void rangeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:475:34: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:475:36: additiveExpr ( TO additiveExpr )?
            {
            pushFollow(FOLLOW_additiveExpr_in_rangeExpr4381);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:475:49: ( TO additiveExpr )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==TO) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // etc/XQFT.g:475:51: TO additiveExpr
                    {
                    match(input,TO,FOLLOW_TO_in_rangeExpr4385); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr4387);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end rangeExpr


    // $ANTLR start additiveExpr
    // etc/XQFT.g:476:4: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final void additiveExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:476:35: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:476:37: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4418);
            multiplicativeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:476:56: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=PLUSSi && LA71_0<=MINUSSi)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // etc/XQFT.g:476:58: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    if ( (input.LA(1)>=PLUSSi && input.LA(1)<=MINUSSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr4422);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr4430);
            	    multiplicativeExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end additiveExpr


    // $ANTLR start multiplicativeExpr
    // etc/XQFT.g:477:5: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final void multiplicativeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:477:36: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:477:38: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4456);
            unionExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:477:48: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==DIV||LA72_0==IDIV||LA72_0==MOD||LA72_0==STARSi) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // etc/XQFT.g:477:50: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    if ( input.LA(1)==DIV||input.LA(1)==IDIV||input.LA(1)==MOD||input.LA(1)==STARSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr4460);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr4476);
            	    unionExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end multiplicativeExpr


    // $ANTLR start unionExpr
    // etc/XQFT.g:478:6: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final void unionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:478:37: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:478:39: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4512);
            intersectExceptExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:478:59: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==UNION||LA73_0==PIPESi) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // etc/XQFT.g:478:61: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    if ( input.LA(1)==UNION||input.LA(1)==PIPESi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr4516);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr4524);
            	    intersectExceptExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end unionExpr


    // $ANTLR start intersectExceptExpr
    // etc/XQFT.g:479:7: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final void intersectExceptExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:479:38: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:479:40: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4551);
            instanceofExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:479:55: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==EXCEPT||LA74_0==INTERSECT) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // etc/XQFT.g:479:57: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    if ( input.LA(1)==EXCEPT||input.LA(1)==INTERSECT ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr4555);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr4563);
            	    instanceofExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end intersectExceptExpr


    // $ANTLR start instanceofExpr
    // etc/XQFT.g:480:8: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final void instanceofExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:480:39: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:480:41: treatExpr ( INSTANCE OF sequenceType )?
            {
            pushFollow(FOLLOW_treatExpr_in_instanceofExpr4596);
            treatExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:480:51: ( INSTANCE OF sequenceType )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==INSTANCE) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // etc/XQFT.g:480:53: INSTANCE OF sequenceType
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr4600); if (failed) return ;
                    match(input,OF,FOLLOW_OF_in_instanceofExpr4602); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr4604);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end instanceofExpr


    // $ANTLR start treatExpr
    // etc/XQFT.g:481:9: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final void treatExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:481:40: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:481:42: castableExpr ( TREAT AS sequenceType )?
            {
            pushFollow(FOLLOW_castableExpr_in_treatExpr4643);
            castableExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:481:55: ( TREAT AS sequenceType )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==TREAT) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // etc/XQFT.g:481:57: TREAT AS sequenceType
                    {
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr4647); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_treatExpr4649); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr4651);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end treatExpr


    // $ANTLR start castableExpr
    // etc/XQFT.g:482:10: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final void castableExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:482:41: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:482:43: castExpr ( CASTABLE AS singleType )?
            {
            pushFollow(FOLLOW_castExpr_in_castableExpr4688);
            castExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:482:52: ( CASTABLE AS singleType )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==CASTABLE) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:482:54: CASTABLE AS singleType
                    {
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr4692); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castableExpr4694); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castableExpr4696);
                    singleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end castableExpr


    // $ANTLR start castExpr
    // etc/XQFT.g:483:11: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final void castExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:483:42: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:483:44: unaryExpr ( CAST AS singleType )?
            {
            pushFollow(FOLLOW_unaryExpr_in_castExpr4738);
            unaryExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:483:54: ( CAST AS singleType )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==CAST) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // etc/XQFT.g:483:56: CAST AS singleType
                    {
                    match(input,CAST,FOLLOW_CAST_in_castExpr4742); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castExpr4744); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castExpr4746);
                    singleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end castExpr


    // $ANTLR start unaryExpr
    // etc/XQFT.g:484:12: unaryExpr : ( MINUSSi | PLUSSi )* valueExpr ;
    public final void unaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:484:43: ( ( MINUSSi | PLUSSi )* valueExpr )
            // etc/XQFT.g:484:45: ( MINUSSi | PLUSSi )* valueExpr
            {
            // etc/XQFT.g:484:45: ( MINUSSi | PLUSSi )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=PLUSSi && LA79_0<=MINUSSi)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // etc/XQFT.g:
            	    {
            	    if ( (input.LA(1)>=PLUSSi && input.LA(1)<=MINUSSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr4788);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            pushFollow(FOLLOW_valueExpr_in_unaryExpr4797);
            valueExpr();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end unaryExpr


    // $ANTLR start singleType
    // etc/XQFT.g:486:12: singleType : atomicType ( QUESTIONSi )? ;
    public final void singleType() throws RecognitionException {
        try {
            // etc/XQFT.g:486:43: ( atomicType ( QUESTIONSi )? )
            // etc/XQFT.g:486:45: atomicType ( QUESTIONSi )?
            {
            pushFollow(FOLLOW_atomicType_in_singleType4836);
            atomicType();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:486:56: ( QUESTIONSi )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==QUESTIONSi) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // etc/XQFT.g:486:56: QUESTIONSi
                    {
                    match(input,QUESTIONSi,FOLLOW_QUESTIONSi_in_singleType4838); if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end singleType


    // $ANTLR start atomicType
    // etc/XQFT.g:487:13: atomicType : qName ;
    public final void atomicType() throws RecognitionException {
        try {
            // etc/XQFT.g:487:44: ( qName )
            // etc/XQFT.g:487:46: qName
            {
            pushFollow(FOLLOW_qName_in_atomicType4878);
            qName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end atomicType


    // $ANTLR start ftIgnoreOption
    // etc/XQFT.g:495:3: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final void ftIgnoreOption() throws RecognitionException {
        try {
            // etc/XQFT.g:495:34: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:495:36: WITHOUT CONTENT unionExpr
            {
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption4914); if (failed) return ;
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption4916); if (failed) return ;
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption4918);
            unionExpr();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftIgnoreOption


    // $ANTLR start valueComp
    // etc/XQFT.g:499:2: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final void valueComp() throws RecognitionException {
        try {
            // etc/XQFT.g:499:33: ( EQ | NE | LT | LE | GT | GE )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==EQ||input.LA(1)==GE||input.LA(1)==GT||input.LA(1)==LE||input.LA(1)==LT||input.LA(1)==NE ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_valueComp0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end valueComp


    // $ANTLR start generalComp
    // etc/XQFT.g:502:2: generalComp : ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi );
    public final void generalComp() throws RecognitionException {
        try {
            // etc/XQFT.g:502:33: ( EQSi | NEQSi | LTSi | LTOREQSi | GTSi | GTOREQSi )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==EQSi||(input.LA(1)>=NEQSi && input.LA(1)<=GTOREQSi) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_generalComp0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end generalComp


    // $ANTLR start nodeComp
    // etc/XQFT.g:505:2: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final void nodeComp() throws RecognitionException {
        try {
            // etc/XQFT.g:505:33: ( IS | NODEBEFORESi | NODEAFTERSi )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==IS||(input.LA(1)>=NODEBEFORESi && input.LA(1)<=NODEAFTERSi) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_nodeComp0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end nodeComp


    // $ANTLR start ftSelection
    // etc/XQFT.g:509:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final void ftSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:509:32: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:509:34: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            pushFollow(FOLLOW_ftOr_in_ftSelection5096);
            ftOr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:509:39: ( ftPosFilter )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==AT||(LA81_0>=DIFFERENT && LA81_0<=DISTANCE)||LA81_0==ENTIRE||LA81_0==ORDERED||LA81_0==SAME||LA81_0==WINDOW) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // etc/XQFT.g:509:39: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection5098);
            	    ftPosFilter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);

            // etc/XQFT.g:509:52: ( WEIGHT rangeExpr )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==WEIGHT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // etc/XQFT.g:509:53: WEIGHT rangeExpr
                    {
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection5102); if (failed) return ;
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection5104);
                    rangeExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftSelection


    // $ANTLR start ftOr
    // etc/XQFT.g:512:2: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final void ftOr() throws RecognitionException {
        try {
            // etc/XQFT.g:512:33: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:512:35: ftAnd ( FTOR ftAnd )*
            {
            pushFollow(FOLLOW_ftAnd_in_ftOr5142);
            ftAnd();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:512:41: ( FTOR ftAnd )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==FTOR) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // etc/XQFT.g:512:43: FTOR ftAnd
            	    {
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr5146); if (failed) return ;
            	    pushFollow(FOLLOW_ftAnd_in_ftOr5148);
            	    ftAnd();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOr


    // $ANTLR start ftAnd
    // etc/XQFT.g:513:3: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final void ftAnd() throws RecognitionException {
        try {
            // etc/XQFT.g:513:34: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:513:36: ftMildNot ( FTAND ftMildNot )*
            {
            pushFollow(FOLLOW_ftMildNot_in_ftAnd5185);
            ftMildNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:513:46: ( FTAND ftMildNot )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==FTAND) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // etc/XQFT.g:513:48: FTAND ftMildNot
            	    {
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd5189); if (failed) return ;
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd5191);
            	    ftMildNot();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftAnd


    // $ANTLR start ftMildNot
    // etc/XQFT.g:514:4: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final void ftMildNot() throws RecognitionException {
        try {
            // etc/XQFT.g:514:35: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:514:37: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot5225);
            ftUnaryNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:514:48: ( NOT IN ftUnaryNot )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==NOT) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // etc/XQFT.g:514:50: NOT IN ftUnaryNot
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot5229); if (failed) return ;
            	    match(input,IN,FOLLOW_IN_in_ftMildNot5231); if (failed) return ;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot5233);
            	    ftUnaryNot();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMildNot


    // $ANTLR start ftUnaryNot
    // etc/XQFT.g:515:5: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final void ftUnaryNot() throws RecognitionException {
        try {
            // etc/XQFT.g:515:36: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:515:38: ( FTNOT )? ftPrimaryWithOptions
            {
            // etc/XQFT.g:515:38: ( FTNOT )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==FTNOT) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // etc/XQFT.g:515:39: FTNOT
                    {
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot5268); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot5272);
            ftPrimaryWithOptions();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftUnaryNot


    // $ANTLR start ftPrimaryWithOptions
    // etc/XQFT.g:516:6: ftPrimaryWithOptions : ftPrimary ( ftMatchOptions )? ;
    public final void ftPrimaryWithOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:516:37: ( ftPrimary ( ftMatchOptions )? )
            // etc/XQFT.g:516:39: ftPrimary ( ftMatchOptions )?
            {
            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions5294);
            ftPrimary();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:516:49: ( ftMatchOptions )?
            int alt87=2;
            switch ( input.LA(1) ) {
                case DIACRITICS:
                case LANGUAGE:
                case LOWERCASE:
                case OPTION:
                case UPPERCASE:
                case WITH:
                    {
                    alt87=1;
                    }
                    break;
                case WITHOUT:
                    {
                    int LA87_2 = input.LA(2);

                    if ( ((LA87_2>=STEMMING && LA87_2<=STOP)||LA87_2==THESAURUS||LA87_2==WILDCARDS) ) {
                        alt87=1;
                    }
                    }
                    break;
                case CASE:
                    {
                    int LA87_3 = input.LA(2);

                    if ( (LA87_3==INSENSITIVE||LA87_3==SENSITIVE) ) {
                        alt87=1;
                    }
                    }
                    break;
            }

            switch (alt87) {
                case 1 :
                    // etc/XQFT.g:516:49: ftMatchOptions
                    {
                    pushFollow(FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions5296);
                    ftMatchOptions();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPrimaryWithOptions


    // $ANTLR start ftPrimary
    // etc/XQFT.g:518:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );
    public final void ftPrimary() throws RecognitionException {
        try {
            // etc/XQFT.g:518:38: ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection )
            int alt89=3;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case LBRACESi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt89=1;
                }
                break;
            case LPARSi:
                {
                alt89=2;
                }
                break;
            case LPRAGSi:
                {
                alt89=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("518:7: ftPrimary : ( ftWords ( ftTimes )? | LPARSi ftSelection RPARSi | ftExtensionSelection );", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // etc/XQFT.g:518:40: ftWords ( ftTimes )?
                    {
                    pushFollow(FOLLOW_ftWords_in_ftPrimary5337);
                    ftWords();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:518:48: ( ftTimes )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==OCCURS) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // etc/XQFT.g:518:48: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary5339);
                            ftTimes();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:519:19: LPARSi ftSelection RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftPrimary5361); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary5363);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    match(input,RPARSi,FOLLOW_RPARSi_in_ftPrimary5365); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:520:19: ftExtensionSelection
                    {
                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary5386);
                    ftExtensionSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPrimary


    // $ANTLR start ftWords
    // etc/XQFT.g:522:8: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final void ftWords() throws RecognitionException {
        try {
            // etc/XQFT.g:522:39: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:522:41: ftWordsValue ( ftAnyallOption )?
            {
            pushFollow(FOLLOW_ftWordsValue_in_ftWords5440);
            ftWordsValue();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:522:54: ( ftAnyallOption )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=ALL && LA90_0<=ANY)||LA90_0==PHRASE) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // etc/XQFT.g:522:54: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords5442);
                    ftAnyallOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWords


    // $ANTLR start ftWordsValue
    // etc/XQFT.g:523:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );
    public final void ftWordsValue() throws RecognitionException {
        try {
            // etc/XQFT.g:523:40: ( literal | ( LBRACESi expr RBRACSi ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==StringLiteral||(LA91_0>=IntegerLiteral && LA91_0<=DoubleLiteral)) ) {
                alt91=1;
            }
            else if ( (LA91_0==LBRACESi) ) {
                alt91=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("523:9: ftWordsValue : ( literal | ( LBRACESi expr RBRACSi ) );", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // etc/XQFT.g:523:42: literal
                    {
                    pushFollow(FOLLOW_literal_in_ftWordsValue5476);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:523:52: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:523:52: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:523:53: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_ftWordsValue5481); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_ftWordsValue5483);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_ftWordsValue5485); if (failed) return ;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWordsValue


    // $ANTLR start literal
    // etc/XQFT.g:524:10: literal : ( numericLiteral | StringLiteral );
    public final void literal() throws RecognitionException {
        try {
            // etc/XQFT.g:524:41: ( numericLiteral | StringLiteral )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( ((LA92_0>=IntegerLiteral && LA92_0<=DoubleLiteral)) ) {
                alt92=1;
            }
            else if ( (LA92_0==StringLiteral) ) {
                alt92=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("524:10: literal : ( numericLiteral | StringLiteral );", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // etc/XQFT.g:524:43: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal5525);
                    numericLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:524:60: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal5529); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end literal


    // $ANTLR start numericLiteral
    // etc/XQFT.g:525:11: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:525:42: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=IntegerLiteral && input.LA(1)<=DoubleLiteral) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_numericLiteral0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end numericLiteral


    // $ANTLR start ftAnyallOption
    // etc/XQFT.g:526:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final void ftAnyallOption() throws RecognitionException {
        try {
            // etc/XQFT.g:526:40: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
            int alt95=3;
            switch ( input.LA(1) ) {
            case ANY:
                {
                alt95=1;
                }
                break;
            case ALL:
                {
                alt95=2;
                }
                break;
            case PHRASE:
                {
                alt95=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("526:9: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // etc/XQFT.g:526:42: ( ANY ( WORD )? )
                    {
                    // etc/XQFT.g:526:42: ( ANY ( WORD )? )
                    // etc/XQFT.g:526:43: ANY ( WORD )?
                    {
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption5602); if (failed) return ;
                    // etc/XQFT.g:526:47: ( WORD )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==WORD) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // etc/XQFT.g:526:47: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption5604); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:526:56: ( ALL ( WORDS )? )
                    {
                    // etc/XQFT.g:526:56: ( ALL ( WORDS )? )
                    // etc/XQFT.g:526:57: ALL ( WORDS )?
                    {
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption5611); if (failed) return ;
                    // etc/XQFT.g:526:61: ( WORDS )?
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==WORDS) ) {
                        alt94=1;
                    }
                    switch (alt94) {
                        case 1 :
                            // etc/XQFT.g:526:61: WORDS
                            {
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption5613); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:526:71: PHRASE
                    {
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption5619); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftAnyallOption


    // $ANTLR start ftTimes
    // etc/XQFT.g:527:8: ftTimes : OCCURS ftRange TIMES ;
    public final void ftTimes() throws RecognitionException {
        try {
            // etc/XQFT.g:527:39: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:527:41: OCCURS ftRange TIMES
            {
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes5656); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftTimes5658);
            ftRange();
            _fsp--;
            if (failed) return ;
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes5660); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftTimes


    // $ANTLR start ftRange
    // etc/XQFT.g:528:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final void ftRange() throws RecognitionException {
        try {
            // etc/XQFT.g:528:40: ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case EXACTLY:
                {
                alt96=1;
                }
                break;
            case AT:
                {
                int LA96_2 = input.LA(2);

                if ( (LA96_2==LEAST) ) {
                    alt96=2;
                }
                else if ( (LA96_2==MOST) ) {
                    alt96=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("528:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 96, 2, input);

                    throw nvae;
                }
                }
                break;
            case FROM:
                {
                alt96=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("528:9: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // etc/XQFT.g:528:42: ( EXACTLY additiveExpr )
                    {
                    // etc/XQFT.g:528:42: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:528:43: EXACTLY additiveExpr
                    {
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange5699); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5701);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:529:39: ( AT LEAST additiveExpr )
                    {
                    // etc/XQFT.g:529:39: ( AT LEAST additiveExpr )
                    // etc/XQFT.g:529:40: AT LEAST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5743); if (failed) return ;
                    match(input,LEAST,FOLLOW_LEAST_in_ftRange5745); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5747);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:530:40: ( AT MOST additiveExpr )
                    {
                    // etc/XQFT.g:530:40: ( AT MOST additiveExpr )
                    // etc/XQFT.g:530:41: AT MOST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange5790); if (failed) return ;
                    match(input,MOST,FOLLOW_MOST_in_ftRange5792); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5794);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:531:45: ( FROM additiveExpr TO additiveExpr )
                    {
                    // etc/XQFT.g:531:45: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:531:46: FROM additiveExpr TO additiveExpr
                    {
                    match(input,FROM,FOLLOW_FROM_in_ftRange5842); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5844);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;
                    match(input,TO,FOLLOW_TO_in_ftRange5846); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange5848);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftRange


    // $ANTLR start ftExtensionSelection
    // etc/XQFT.g:534:8: ftExtensionSelection : ( pragma )+ LBRACESi ( ftSelection )? RBRACSi ;
    public final void ftExtensionSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:534:39: ( ( pragma )+ LBRACESi ( ftSelection )? RBRACSi )
            // etc/XQFT.g:534:41: ( pragma )+ LBRACESi ( ftSelection )? RBRACSi
            {
            // etc/XQFT.g:534:41: ( pragma )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==LPRAGSi) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // etc/XQFT.g:534:41: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection5875);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);

            match(input,LBRACESi,FOLLOW_LBRACESi_in_ftExtensionSelection5878); if (failed) return ;
            // etc/XQFT.g:534:58: ( ftSelection )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==FTNOT||LA98_0==StringLiteral||LA98_0==LPARSi||LA98_0==LBRACESi||(LA98_0>=IntegerLiteral && LA98_0<=LPRAGSi)) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // etc/XQFT.g:534:58: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection5880);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_ftExtensionSelection5883); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftExtensionSelection


    // $ANTLR start pragma
    // etc/XQFT.g:535:9: pragma : LPRAGSi qName ( PragmaContents )? RPRAGSi ;
    public final void pragma() throws RecognitionException {
        try {
            // etc/XQFT.g:535:40: ( LPRAGSi qName ( PragmaContents )? RPRAGSi )
            // etc/XQFT.g:535:42: LPRAGSi qName ( PragmaContents )? RPRAGSi
            {
            match(input,LPRAGSi,FOLLOW_LPRAGSi_in_pragma5922); if (failed) return ;
            pushFollow(FOLLOW_qName_in_pragma5924);
            qName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:535:56: ( PragmaContents )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==PragmaContents) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // etc/XQFT.g:535:56: PragmaContents
                    {
                    match(input,PragmaContents,FOLLOW_PragmaContents_in_pragma5926); if (failed) return ;

                    }
                    break;

            }

            match(input,RPRAGSi,FOLLOW_RPRAGSi_in_pragma5929); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end pragma


    // $ANTLR start ftPosFilter
    // etc/XQFT.g:542:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final void ftPosFilter() throws RecognitionException {
        try {
            // etc/XQFT.g:542:33: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
            int alt100=5;
            switch ( input.LA(1) ) {
            case ORDERED:
                {
                alt100=1;
                }
                break;
            case WINDOW:
                {
                alt100=2;
                }
                break;
            case DISTANCE:
                {
                alt100=3;
                }
                break;
            case DIFFERENT:
            case SAME:
                {
                alt100=4;
                }
                break;
            case AT:
            case ENTIRE:
                {
                alt100=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("542:2: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // etc/XQFT.g:542:35: ftOrder
                    {
                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter5984);
                    ftOrder();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:542:45: ftWindow
                    {
                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter5988);
                    ftWindow();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:542:56: ftDistance
                    {
                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter5992);
                    ftDistance();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:542:69: ftScope
                    {
                    pushFollow(FOLLOW_ftScope_in_ftPosFilter5996);
                    ftScope();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:542:79: ftContent
                    {
                    pushFollow(FOLLOW_ftContent_in_ftPosFilter6000);
                    ftContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPosFilter


    // $ANTLR start ftOrder
    // etc/XQFT.g:543:3: ftOrder : ORDERED ;
    public final void ftOrder() throws RecognitionException {
        try {
            // etc/XQFT.g:543:34: ( ORDERED )
            // etc/XQFT.g:543:36: ORDERED
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder6032); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOrder


    // $ANTLR start ftWindow
    // etc/XQFT.g:544:3: ftWindow : WINDOW additiveExpr ftUnit ;
    public final void ftWindow() throws RecognitionException {
        try {
            // etc/XQFT.g:544:34: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:544:36: WINDOW additiveExpr ftUnit
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow6063); if (failed) return ;
            pushFollow(FOLLOW_additiveExpr_in_ftWindow6065);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftWindow6067);
            ftUnit();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWindow


    // $ANTLR start ftUnit
    // etc/XQFT.g:546:4: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final void ftUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:546:35: ( WORDS | SENTENCES | PARAGRAPHS )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==PARAGRAPHS||input.LA(1)==SENTENCES||input.LA(1)==WORDS ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftUnit0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftUnit


    // $ANTLR start ftDistance
    // etc/XQFT.g:547:3: ftDistance : DISTANCE ftRange ftUnit ;
    public final void ftDistance() throws RecognitionException {
        try {
            // etc/XQFT.g:547:34: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:547:36: DISTANCE ftRange ftUnit
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance6140); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftDistance6142);
            ftRange();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftDistance6144);
            ftUnit();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftDistance


    // $ANTLR start ftScope
    // etc/XQFT.g:554:3: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final void ftScope() throws RecognitionException {
        try {
            // etc/XQFT.g:554:34: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:554:36: ( SAME | DIFFERENT ) ftBigUnit
            {
            if ( input.LA(1)==DIFFERENT||input.LA(1)==SAME ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope6182);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope6190);
            ftBigUnit();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftScope


    // $ANTLR start ftBigUnit
    // etc/XQFT.g:555:4: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final void ftBigUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:555:35: ( SENTENCE | PARAGRAPH )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==PARAGRAPH||input.LA(1)==SENTENCE ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftBigUnit0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftBigUnit


    // $ANTLR start ftContent
    // etc/XQFT.g:556:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );
    public final void ftContent() throws RecognitionException {
        try {
            // etc/XQFT.g:556:34: ( AT START | AT END | ENTIRE CONTENT )
            int alt101=3;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==AT) ) {
                int LA101_1 = input.LA(2);

                if ( (LA101_1==END) ) {
                    alt101=2;
                }
                else if ( (LA101_1==START) ) {
                    alt101=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("556:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 101, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA101_0==ENTIRE) ) {
                alt101=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("556:3: ftContent : ( AT START | AT END | ENTIRE CONTENT );", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:556:36: AT START
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent6256); if (failed) return ;
                    match(input,START,FOLLOW_START_in_ftContent6258); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:556:47: AT END
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent6262); if (failed) return ;
                    match(input,END,FOLLOW_END_in_ftContent6264); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:556:56: ENTIRE CONTENT
                    {
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent6268); if (failed) return ;
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent6270); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftContent


    // $ANTLR start ftMatchOption
    // etc/XQFT.g:565:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );
    public final void ftMatchOption() throws RecognitionException {
        try {
            // etc/XQFT.g:565:32: ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption )
            int alt102=8;
            switch ( input.LA(1) ) {
            case LANGUAGE:
                {
                alt102=1;
                }
                break;
            case WITH:
                {
                switch ( input.LA(2) ) {
                case STEMMING:
                    {
                    alt102=4;
                    }
                    break;
                case THESAURUS:
                    {
                    alt102=3;
                    }
                    break;
                case DEFAULT:
                case STOP:
                    {
                    alt102=7;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt102=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("565:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 2, input);

                    throw nvae;
                }

                }
                break;
            case WITHOUT:
                {
                switch ( input.LA(2) ) {
                case STEMMING:
                    {
                    alt102=4;
                    }
                    break;
                case THESAURUS:
                    {
                    alt102=3;
                    }
                    break;
                case STOP:
                    {
                    alt102=7;
                    }
                    break;
                case WILDCARDS:
                    {
                    alt102=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("565:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 3, input);

                    throw nvae;
                }

                }
                break;
            case CASE:
            case LOWERCASE:
            case UPPERCASE:
                {
                alt102=5;
                }
                break;
            case DIACRITICS:
                {
                alt102=6;
                }
                break;
            case OPTION:
                {
                alt102=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("565:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:565:34: ftLanguageOption
                    {
                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption6308);
                    ftLanguageOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:566:37: ftWildCardOption
                    {
                    pushFollow(FOLLOW_ftWildCardOption_in_ftMatchOption6346);
                    ftWildCardOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:567:37: ftThesaurusOption
                    {
                    pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption6384);
                    ftThesaurusOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:568:37: ftStemOption
                    {
                    pushFollow(FOLLOW_ftStemOption_in_ftMatchOption6422);
                    ftStemOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:569:37: ftCaseOption
                    {
                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption6460);
                    ftCaseOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:570:37: ftDiacriticsOption
                    {
                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption6498);
                    ftDiacriticsOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:571:37: ftStopwordOption
                    {
                    pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption6536);
                    ftStopwordOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:572:37: ftExtensionOption
                    {
                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption6574);
                    ftExtensionOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMatchOption


    // $ANTLR start ftLanguageOption
    // etc/XQFT.g:575:2: ftLanguageOption : LANGUAGE StringLiteral ;
    public final void ftLanguageOption() throws RecognitionException {
        try {
            // etc/XQFT.g:575:33: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:575:35: LANGUAGE StringLiteral
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption6699); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption6701); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftLanguageOption


    // $ANTLR start ftWildCardOption
    // etc/XQFT.g:578:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );
    public final void ftWildCardOption() throws RecognitionException {
        try {
            // etc/XQFT.g:578:33: ( WITH WILDCARDS | WITHOUT WILDCARDS )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==WITH) ) {
                alt103=1;
            }
            else if ( (LA103_0==WITHOUT) ) {
                alt103=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("578:2: ftWildCardOption : ( WITH WILDCARDS | WITHOUT WILDCARDS );", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // etc/XQFT.g:578:35: WITH WILDCARDS
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftWildCardOption6727); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6729); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:578:52: WITHOUT WILDCARDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftWildCardOption6733); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption6735); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWildCardOption


    // $ANTLR start ftThesaurusOption
    // etc/XQFT.g:581:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );
    public final void ftThesaurusOption() throws RecognitionException {
        try {
            // etc/XQFT.g:581:31: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS )
            int alt107=3;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==WITH) ) {
                int LA107_1 = input.LA(2);

                if ( (LA107_1==THESAURUS) ) {
                    int LA107_3 = input.LA(3);

                    if ( (LA107_3==LPARSi) ) {
                        alt107=2;
                    }
                    else if ( (LA107_3==AT||LA107_3==DEFAULT) ) {
                        alt107=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("581:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("581:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA107_0==WITHOUT) ) {
                alt107=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("581:2: ftThesaurusOption : ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) | WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi | WITHOUT THESAURUS );", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // etc/XQFT.g:581:33: WITH THESAURUS ( ftThesaurusID | DEFAULT )
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6758); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6760); if (failed) return ;
                    // etc/XQFT.g:581:48: ( ftThesaurusID | DEFAULT )
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==AT) ) {
                        alt104=1;
                    }
                    else if ( (LA104_0==DEFAULT) ) {
                        alt104=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("581:48: ( ftThesaurusID | DEFAULT )", 104, 0, input);

                        throw nvae;
                    }
                    switch (alt104) {
                        case 1 :
                            // etc/XQFT.g:581:49: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6763);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:581:65: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6767); if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:582:14: WITH THESAURUS LPARSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RPARSi
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption6783); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6785); if (failed) return ;
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftThesaurusOption6787); if (failed) return ;
                    // etc/XQFT.g:582:36: ( ftThesaurusID | DEFAULT )
                    int alt105=2;
                    int LA105_0 = input.LA(1);

                    if ( (LA105_0==AT) ) {
                        alt105=1;
                    }
                    else if ( (LA105_0==DEFAULT) ) {
                        alt105=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("582:36: ( ftThesaurusID | DEFAULT )", 105, 0, input);

                        throw nvae;
                    }
                    switch (alt105) {
                        case 1 :
                            // etc/XQFT.g:582:37: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6790);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:582:53: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption6794); if (failed) return ;

                            }
                            break;

                    }

                    // etc/XQFT.g:582:62: ( COMMASi ftThesaurusID )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==COMMASi) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // etc/XQFT.g:582:63: COMMASi ftThesaurusID
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption6798); if (failed) return ;
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption6800);
                    	    ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftThesaurusOption6804); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:583:38: WITHOUT THESAURUS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftThesaurusOption6843); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption6845); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftThesaurusOption


    // $ANTLR start ftThesaurusID
    // etc/XQFT.g:585:3: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final void ftThesaurusID() throws RecognitionException {
        try {
            // etc/XQFT.g:585:34: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:585:36: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            match(input,AT,FOLLOW_AT_in_ftThesaurusID6907); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID6909);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:585:50: ( RELATIONSHIP StringLiteral )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RELATIONSHIP) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // etc/XQFT.g:585:51: RELATIONSHIP StringLiteral
                    {
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID6912); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID6914); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:585:80: ( ftRange LEVELS )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==EXACTLY||LA109_0==FROM) ) {
                alt109=1;
            }
            else if ( (LA109_0==AT) ) {
                int LA109_2 = input.LA(2);

                if ( (LA109_2==LEAST||LA109_2==MOST) ) {
                    alt109=1;
                }
            }
            switch (alt109) {
                case 1 :
                    // etc/XQFT.g:585:81: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID6919);
                    ftRange();
                    _fsp--;
                    if (failed) return ;
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID6921); if (failed) return ;

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftThesaurusID


    // $ANTLR start ftStemOption
    // etc/XQFT.g:595:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );
    public final void ftStemOption() throws RecognitionException {
        try {
            // etc/XQFT.g:595:33: ( WITH STEMMING | WITHOUT STEMMING )
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==WITH) ) {
                alt110=1;
            }
            else if ( (LA110_0==WITHOUT) ) {
                alt110=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("595:2: ftStemOption : ( WITH STEMMING | WITHOUT STEMMING );", 110, 0, input);

                throw nvae;
            }
            switch (alt110) {
                case 1 :
                    // etc/XQFT.g:595:35: WITH STEMMING
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStemOption6966); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6968); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:595:51: WITHOUT STEMMING
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStemOption6972); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption6974); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftStemOption


    // $ANTLR start ftCaseOption
    // etc/XQFT.g:598:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );
    public final void ftCaseOption() throws RecognitionException {
        try {
            // etc/XQFT.g:598:33: ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE )
            int alt111=4;
            switch ( input.LA(1) ) {
            case CASE:
                {
                int LA111_1 = input.LA(2);

                if ( (LA111_1==SENSITIVE) ) {
                    alt111=2;
                }
                else if ( (LA111_1==INSENSITIVE) ) {
                    alt111=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("598:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 111, 1, input);

                    throw nvae;
                }
                }
                break;
            case LOWERCASE:
                {
                alt111=3;
                }
                break;
            case UPPERCASE:
                {
                alt111=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("598:2: ftCaseOption : ( CASE INSENSITIVE | CASE SENSITIVE | LOWERCASE | UPPERCASE );", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:598:35: CASE INSENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption7004); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftCaseOption7006); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:599:38: CASE SENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption7045); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftCaseOption7047); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:600:38: LOWERCASE
                    {
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption7086); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:601:38: UPPERCASE
                    {
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption7125); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftCaseOption


    // $ANTLR start ftDiacriticsOption
    // etc/XQFT.g:605:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );
    public final void ftDiacriticsOption() throws RecognitionException {
        try {
            // etc/XQFT.g:605:33: ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==DIACRITICS) ) {
                int LA112_1 = input.LA(2);

                if ( (LA112_1==SENSITIVE) ) {
                    alt112=2;
                }
                else if ( (LA112_1==INSENSITIVE) ) {
                    alt112=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("605:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 112, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("605:2: ftDiacriticsOption : ( DIACRITICS INSENSITIVE | DIACRITICS SENSITIVE );", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // etc/XQFT.g:605:35: DIACRITICS INSENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption7287); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftDiacriticsOption7289); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:606:14: DIACRITICS SENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption7304); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftDiacriticsOption7306); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftDiacriticsOption


    // $ANTLR start ftStopwordOption
    // etc/XQFT.g:609:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );
    public final void ftStopwordOption() throws RecognitionException {
        try {
            // etc/XQFT.g:609:33: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
            int alt115=3;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==WITH) ) {
                int LA115_1 = input.LA(2);

                if ( (LA115_1==STOP) ) {
                    alt115=1;
                }
                else if ( (LA115_1==DEFAULT) ) {
                    alt115=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("609:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 115, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA115_0==WITHOUT) ) {
                alt115=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("609:2: ftStopwordOption : ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* | WITHOUT STOP WORDS | WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* );", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:609:35: WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7362); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7364); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7366); if (failed) return ;
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption7368);
                    ftRefOrList();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:609:63: ( ftInclExclStringLiteral )*
                    loop113:
                    do {
                        int alt113=2;
                        int LA113_0 = input.LA(1);

                        if ( (LA113_0==EXCEPT||LA113_0==UNION) ) {
                            alt113=1;
                        }


                        switch (alt113) {
                    	case 1 :
                    	    // etc/XQFT.g:609:63: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7370);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop113;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:610:14: WITHOUT STOP WORDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStopwordOption7386); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7388); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7390); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:611:38: WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption7429); if (failed) return ;
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption7431); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption7433); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption7435); if (failed) return ;
                    // etc/XQFT.g:611:62: ( ftInclExclStringLiteral )*
                    loop114:
                    do {
                        int alt114=2;
                        int LA114_0 = input.LA(1);

                        if ( (LA114_0==EXCEPT||LA114_0==UNION) ) {
                            alt114=1;
                        }


                        switch (alt114) {
                    	case 1 :
                    	    // etc/XQFT.g:611:62: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7437);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop114;
                        }
                    } while (true);


                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftStopwordOption


    // $ANTLR start ftRefOrList
    // etc/XQFT.g:613:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );
    public final void ftRefOrList() throws RecognitionException {
        try {
            // etc/XQFT.g:613:34: ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==AT) ) {
                alt117=1;
            }
            else if ( (LA117_0==LPARSi) ) {
                alt117=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("613:3: ftRefOrList : ( ( AT uriLiteral ) | LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi );", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // etc/XQFT.g:613:36: ( AT uriLiteral )
                    {
                    // etc/XQFT.g:613:36: ( AT uriLiteral )
                    // etc/XQFT.g:613:37: AT uriLiteral
                    {
                    match(input,AT,FOLLOW_AT_in_ftRefOrList7503); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList7505);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:614:15: LPARSi StringLiteral ( COMMASi StringLiteral )* RPARSi
                    {
                    match(input,LPARSi,FOLLOW_LPARSi_in_ftRefOrList7522); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7524); if (failed) return ;
                    // etc/XQFT.g:614:36: ( COMMASi StringLiteral )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==COMMASi) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // etc/XQFT.g:614:37: COMMASi StringLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList7527); if (failed) return ;
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList7529); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop116;
                        }
                    } while (true);

                    match(input,RPARSi,FOLLOW_RPARSi_in_ftRefOrList7533); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftRefOrList


    // $ANTLR start ftInclExclStringLiteral
    // etc/XQFT.g:616:3: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final void ftInclExclStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:616:34: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:616:36: ( UNION | EXCEPT ) ftRefOrList
            {
            if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral7550);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7558);
            ftRefOrList();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftInclExclStringLiteral


    // $ANTLR start ftExtensionOption
    // etc/XQFT.g:619:2: ftExtensionOption : OPTION qName StringLiteral ;
    public final void ftExtensionOption() throws RecognitionException {
        try {
            // etc/XQFT.g:619:33: ( OPTION qName StringLiteral )
            // etc/XQFT.g:619:35: OPTION qName StringLiteral
            {
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption7592); if (failed) return ;
            pushFollow(FOLLOW_qName_in_ftExtensionOption7594);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption7596); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end ftExtensionOption


    // $ANTLR start valueExpr
    // etc/XQFT.g:623:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:623:32: ( validateExpr | pathExpr | extensionExpr )
            int alt118=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                alt118=1;
                }
                break;
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case ATTRIBUTE:
            case CHILD:
            case COMMENT:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DOCUMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case NODE:
            case ORDERED:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case SELF:
            case TEXT:
            case UNORDERED:
            case StringLiteral:
            case NCName:
            case DOLLARSi:
            case LPARSi:
            case STARSi:
            case LTSi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case DBLSLASHSi:
            case SLASHSi:
            case DOTDOTSi:
            case ATSi:
            case DOTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt118=2;
                }
                break;
            case LPRAGSi:
                {
                alt118=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("623:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // etc/XQFT.g:623:34: validateExpr
                    {
                    pushFollow(FOLLOW_validateExpr_in_valueExpr7628);
                    validateExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:623:49: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_valueExpr7632);
                    pathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:623:60: extensionExpr
                    {
                    pushFollow(FOLLOW_extensionExpr_in_valueExpr7636);
                    extensionExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end valueExpr


    // $ANTLR start validateExpr
    // etc/XQFT.g:626:2: validateExpr : VALIDATE ( validationMode )? LBRACESi expr RBRACSi ;
    public final void validateExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:626:33: ( VALIDATE ( validationMode )? LBRACESi expr RBRACSi )
            // etc/XQFT.g:626:35: VALIDATE ( validationMode )? LBRACESi expr RBRACSi
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr7664); if (failed) return ;
            // etc/XQFT.g:626:44: ( validationMode )?
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==LAX||LA119_0==STRICT) ) {
                alt119=1;
            }
            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:626:44: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr7666);
                    validationMode();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_validateExpr7669); if (failed) return ;
            pushFollow(FOLLOW_expr_in_validateExpr7671);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_validateExpr7673); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end validateExpr


    // $ANTLR start validationMode
    // etc/XQFT.g:627:3: validationMode : ( LAX | STRICT );
    public final void validationMode() throws RecognitionException {
        try {
            // etc/XQFT.g:627:34: ( LAX | STRICT )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==LAX||input.LA(1)==STRICT ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_validationMode0);    throw mse;
            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end validationMode


    // $ANTLR start pathExpr
    // etc/XQFT.g:632:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:632:33: ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr )
            int alt120=4;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // etc/XQFT.g:632:35: ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr
                    {
                    match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_pathExpr7749); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7751);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:633:14: ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7775); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7777);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:634:14: SLASHSi
                    {
                    match(input,SLASHSi,FOLLOW_SLASHSi_in_pathExpr7792); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:635:14: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr7807);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end pathExpr


    // $ANTLR start relativePathExpr
    // etc/XQFT.g:636:3: relativePathExpr : stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:636:34: ( stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )* )
            // etc/XQFT.g:636:36: stepExpr ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr7830);
            stepExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:636:45: ( ( SLASHSi | DBLSLASHSi ) stepExpr )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( ((LA121_0>=DBLSLASHSi && LA121_0<=SLASHSi)) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // etc/XQFT.g:636:46: ( SLASHSi | DBLSLASHSi ) stepExpr
            	    {
            	    if ( (input.LA(1)>=DBLSLASHSi && input.LA(1)<=SLASHSi) ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relativePathExpr7833);    throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr7841);
            	    stepExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end relativePathExpr


    // $ANTLR start stepExpr
    // etc/XQFT.g:637:4: stepExpr : ( axisStep | filterExpr );
    public final void stepExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:637:35: ( axisStep | filterExpr )
            int alt122=2;
            switch ( input.LA(1) ) {
            case ANCESTOR:
            case ANCESTOR_OR_SELF:
            case CHILD:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case DOCUMENT_NODE:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case NODE:
            case PARENT:
            case PRECEDING:
            case PRECEDING_SIBLING:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case SELF:
            case STARSi:
            case DOTDOTSi:
            case ATSi:
                {
                alt122=1;
                }
                break;
            case ATTRIBUTE:
                {
                int LA122_2 = input.LA(2);

                if ( (LA122_2==LPARSi||LA122_2==DBLCOLONSi) ) {
                    alt122=1;
                }
                else if ( (LA122_2==NCName||LA122_2==LBRACESi) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 2, input);

                    throw nvae;
                }
                }
                break;
            case ELEMENT:
                {
                int LA122_3 = input.LA(2);

                if ( (LA122_3==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_3==NCName||LA122_3==LBRACESi) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 3, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA122_4 = input.LA(2);

                if ( (LA122_4==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_4==NCName||LA122_4==LBRACESi) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 4, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA122_5 = input.LA(2);

                if ( (LA122_5==LBRACESi) ) {
                    alt122=2;
                }
                else if ( (LA122_5==LPARSi) ) {
                    alt122=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 5, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA122_6 = input.LA(2);

                if ( (LA122_6==LPARSi) ) {
                    alt122=1;
                }
                else if ( (LA122_6==LBRACESi) ) {
                    alt122=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 6, input);

                    throw nvae;
                }
                }
                break;
            case NCName:
                {
                switch ( input.LA(2) ) {
                case COLONSi:
                    {
                    int LA122_9 = input.LA(3);

                    if ( (LA122_9==STARSi) ) {
                        alt122=1;
                    }
                    else if ( (LA122_9==NCName) ) {
                        int LA122_10 = input.LA(4);

                        if ( (LA122_10==EOF||LA122_10==AND||LA122_10==ASCENDING||(LA122_10>=CASE && LA122_10<=CASTABLE)||LA122_10==COLLATION||LA122_10==DEFAULT||LA122_10==DESCENDING||LA122_10==DIV||LA122_10==ELSE||LA122_10==EMPTY||LA122_10==EQ||LA122_10==EXCEPT||LA122_10==FOR||LA122_10==FTCONTAINS||LA122_10==GE||(LA122_10>=GT && LA122_10<=IDIV)||(LA122_10>=INSTANCE && LA122_10<=IS)||LA122_10==LE||(LA122_10>=LET && LA122_10<=LEVELS)||(LA122_10>=LT && LA122_10<=MOD)||LA122_10==NE||(LA122_10>=OR && LA122_10<=ORDER)||LA122_10==PARAGRAPHS||LA122_10==RETURN||LA122_10==SATISFIES||LA122_10==SENTENCES||LA122_10==STABLE||(LA122_10>=TIMES && LA122_10<=TREAT)||LA122_10==UNION||LA122_10==WHERE||LA122_10==WITHOUT||LA122_10==WORDS||LA122_10==SEMICOLONSi||(LA122_10>=EQSi && LA122_10<=COMMASi)||LA122_10==RPARSi||LA122_10==RBRACSi||(LA122_10>=STARSi && LA122_10<=NODEAFTERSi)||(LA122_10>=DBLSLASHSi && LA122_10<=SLASHSi)||(LA122_10>=LBRACKSi && LA122_10<=RBRACKSi)) ) {
                            alt122=1;
                        }
                        else if ( (LA122_10==LPARSi) ) {
                            alt122=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 10, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 9, input);

                        throw nvae;
                    }
                    }
                    break;
                case LPARSi:
                    {
                    alt122=2;
                    }
                    break;
                case EOF:
                case AND:
                case ASCENDING:
                case CASE:
                case CAST:
                case CASTABLE:
                case COLLATION:
                case DEFAULT:
                case DESCENDING:
                case DIV:
                case ELSE:
                case EMPTY:
                case EQ:
                case EXCEPT:
                case FOR:
                case FTCONTAINS:
                case GE:
                case GT:
                case IDIV:
                case INSTANCE:
                case INTERSECT:
                case IS:
                case LE:
                case LET:
                case LEVELS:
                case LT:
                case MOD:
                case NE:
                case OR:
                case ORDER:
                case PARAGRAPHS:
                case RETURN:
                case SATISFIES:
                case SENTENCES:
                case STABLE:
                case TIMES:
                case TO:
                case TREAT:
                case UNION:
                case WHERE:
                case WITHOUT:
                case WORDS:
                case SEMICOLONSi:
                case EQSi:
                case COMMASi:
                case RPARSi:
                case RBRACSi:
                case STARSi:
                case PLUSSi:
                case MINUSSi:
                case PIPESi:
                case NEQSi:
                case LTSi:
                case LTOREQSi:
                case GTSi:
                case GTOREQSi:
                case NODEBEFORESi:
                case NODEAFTERSi:
                case DBLSLASHSi:
                case SLASHSi:
                case LBRACKSi:
                case RBRACKSi:
                    {
                    alt122=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 7, input);

                    throw nvae;
                }

                }
                break;
            case DOCUMENT:
            case ORDERED:
            case UNORDERED:
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
                alt122=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("637:4: stepExpr : ( axisStep | filterExpr );", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:637:37: axisStep
                    {
                    pushFollow(FOLLOW_axisStep_in_stepExpr7877);
                    axisStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:638:16: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_stepExpr7894);
                    filterExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end stepExpr


    // $ANTLR start axisStep
    // etc/XQFT.g:641:4: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final void axisStep() throws RecognitionException {
        try {
            // etc/XQFT.g:641:35: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:641:37: ( reverseStep | forwardStep ) predicateList
            {
            // etc/XQFT.g:641:37: ( reverseStep | forwardStep )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( ((LA123_0>=ANCESTOR && LA123_0<=ANCESTOR_OR_SELF)||LA123_0==PARENT||(LA123_0>=PRECEDING && LA123_0<=PRECEDING_SIBLING)||LA123_0==DOTDOTSi) ) {
                alt123=1;
            }
            else if ( (LA123_0==ATTRIBUTE||LA123_0==CHILD||LA123_0==COMMENT||(LA123_0>=DESCENDANT && LA123_0<=DESCENDANT_OR_SELF)||(LA123_0>=DOCUMENT_NODE && LA123_0<=ELEMENT)||(LA123_0>=FOLLOWING && LA123_0<=FOLLOWING_SIBLING)||LA123_0==NODE||LA123_0==PROCESSING_INSTRUCTION||(LA123_0>=SCHEMAATTRIBUTE && LA123_0<=SCHEMAELEMENT)||LA123_0==SELF||LA123_0==TEXT||LA123_0==NCName||LA123_0==STARSi||LA123_0==ATSi) ) {
                alt123=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("641:37: ( reverseStep | forwardStep )", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:641:38: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep7942);
                    reverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:641:52: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep7946);
                    forwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep7949);
            predicateList();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end axisStep


    // $ANTLR start reverseStep
    // etc/XQFT.g:643:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );
    public final void reverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:643:36: ( reverseAxis nodeTest | abbrevReverseStep )
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=ANCESTOR && LA124_0<=ANCESTOR_OR_SELF)||LA124_0==PARENT||(LA124_0>=PRECEDING && LA124_0<=PRECEDING_SIBLING)) ) {
                alt124=1;
            }
            else if ( (LA124_0==DOTDOTSi) ) {
                alt124=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("643:5: reverseStep : ( reverseAxis nodeTest | abbrevReverseStep );", 124, 0, input);

                throw nvae;
            }
            switch (alt124) {
                case 1 :
                    // etc/XQFT.g:643:38: reverseAxis nodeTest
                    {
                    pushFollow(FOLLOW_reverseAxis_in_reverseStep7983);
                    reverseAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_reverseStep7985);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:643:61: abbrevReverseStep
                    {
                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep7989);
                    abbrevReverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end reverseStep


    // $ANTLR start reverseAxis
    // etc/XQFT.g:644:6: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi ;
    public final void reverseAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:644:37: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi )
            // etc/XQFT.g:644:39: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DBLCOLONSi
            {
            if ( (input.LA(1)>=ANCESTOR && input.LA(1)<=ANCESTOR_OR_SELF)||input.LA(1)==PARENT||(input.LA(1)>=PRECEDING && input.LA(1)<=PRECEDING_SIBLING) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis8020);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_reverseAxis8040); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end reverseAxis


    // $ANTLR start nodeTest
    // etc/XQFT.g:645:6: nodeTest : ( kindTest | nameTest );
    public final void nodeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:645:37: ( kindTest | nameTest )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==ATTRIBUTE||LA125_0==COMMENT||(LA125_0>=DOCUMENT_NODE && LA125_0<=ELEMENT)||LA125_0==NODE||LA125_0==PROCESSING_INSTRUCTION||(LA125_0>=SCHEMAATTRIBUTE && LA125_0<=SCHEMAELEMENT)||LA125_0==TEXT) ) {
                alt125=1;
            }
            else if ( (LA125_0==NCName||LA125_0==STARSi) ) {
                alt125=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("645:6: nodeTest : ( kindTest | nameTest );", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // etc/XQFT.g:645:39: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_nodeTest8074);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:645:50: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest8078);
                    nameTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end nodeTest


    // $ANTLR start nameTest
    // etc/XQFT.g:647:7: nameTest : ( qName | wildcard );
    public final void nameTest() throws RecognitionException {
        try {
            // etc/XQFT.g:647:38: ( qName | wildcard )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==NCName) ) {
                int LA126_1 = input.LA(2);

                if ( (LA126_1==COLONSi) ) {
                    int LA126_3 = input.LA(3);

                    if ( (LA126_3==STARSi) ) {
                        alt126=2;
                    }
                    else if ( (LA126_3==NCName) ) {
                        alt126=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("647:7: nameTest : ( qName | wildcard );", 126, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA126_1==EOF||LA126_1==AND||LA126_1==ASCENDING||(LA126_1>=CASE && LA126_1<=CASTABLE)||LA126_1==COLLATION||LA126_1==DEFAULT||LA126_1==DESCENDING||LA126_1==DIV||LA126_1==ELSE||LA126_1==EMPTY||LA126_1==EQ||LA126_1==EXCEPT||LA126_1==FOR||LA126_1==FTCONTAINS||LA126_1==GE||(LA126_1>=GT && LA126_1<=IDIV)||(LA126_1>=INSTANCE && LA126_1<=IS)||LA126_1==LE||(LA126_1>=LET && LA126_1<=LEVELS)||(LA126_1>=LT && LA126_1<=MOD)||LA126_1==NE||(LA126_1>=OR && LA126_1<=ORDER)||LA126_1==PARAGRAPHS||LA126_1==RETURN||LA126_1==SATISFIES||LA126_1==SENTENCES||LA126_1==STABLE||(LA126_1>=TIMES && LA126_1<=TREAT)||LA126_1==UNION||LA126_1==WHERE||LA126_1==WITHOUT||LA126_1==WORDS||LA126_1==SEMICOLONSi||(LA126_1>=EQSi && LA126_1<=COMMASi)||LA126_1==RPARSi||LA126_1==RBRACSi||(LA126_1>=STARSi && LA126_1<=NODEAFTERSi)||(LA126_1>=DBLSLASHSi && LA126_1<=SLASHSi)||(LA126_1>=LBRACKSi && LA126_1<=RBRACKSi)) ) {
                    alt126=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("647:7: nameTest : ( qName | wildcard );", 126, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA126_0==STARSi) ) {
                alt126=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("647:7: nameTest : ( qName | wildcard );", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:647:40: qName
                    {
                    pushFollow(FOLLOW_qName_in_nameTest8114);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:647:48: wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_nameTest8118);
                    wildcard();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end nameTest


    // $ANTLR start wildcard
    // etc/XQFT.g:648:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );
    public final void wildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:648:39: ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi )
            int alt127=3;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==STARSi) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==COLONSi) && (synpred4())) {
                    alt127=1;
                }
                else if ( (LA127_1==EOF||LA127_1==AND||LA127_1==ASCENDING||(LA127_1>=CASE && LA127_1<=CASTABLE)||LA127_1==COLLATION||LA127_1==DEFAULT||LA127_1==DESCENDING||LA127_1==DIV||LA127_1==ELSE||LA127_1==EMPTY||LA127_1==EQ||LA127_1==EXCEPT||LA127_1==FOR||LA127_1==FTCONTAINS||LA127_1==GE||(LA127_1>=GT && LA127_1<=IDIV)||(LA127_1>=INSTANCE && LA127_1<=IS)||LA127_1==LE||(LA127_1>=LET && LA127_1<=LEVELS)||(LA127_1>=LT && LA127_1<=MOD)||LA127_1==NE||(LA127_1>=OR && LA127_1<=ORDER)||LA127_1==PARAGRAPHS||LA127_1==RETURN||LA127_1==SATISFIES||LA127_1==SENTENCES||LA127_1==STABLE||(LA127_1>=TIMES && LA127_1<=TREAT)||LA127_1==UNION||LA127_1==WHERE||LA127_1==WITHOUT||LA127_1==WORDS||LA127_1==SEMICOLONSi||(LA127_1>=EQSi && LA127_1<=COMMASi)||LA127_1==RPARSi||LA127_1==RBRACSi||(LA127_1>=STARSi && LA127_1<=NODEAFTERSi)||(LA127_1>=DBLSLASHSi && LA127_1<=SLASHSi)||(LA127_1>=LBRACKSi && LA127_1<=RBRACKSi)) ) {
                    alt127=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("648:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 127, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA127_0==NCName) ) {
                alt127=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("648:8: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | NCName COLONSi STARSi );", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // etc/XQFT.g:648:41: ( STARSi COLONSi NCName )=> STARSi COLONSi NCName
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard8164); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard8166); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_wildcard8168); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:649:20: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard8193); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:650:44: NCName COLONSi STARSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_wildcard8238); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard8240); if (failed) return ;
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard8242); if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end wildcard


    // $ANTLR start abbrevReverseStep
    // etc/XQFT.g:651:21: abbrevReverseStep : DOTDOTSi ;
    public final void abbrevReverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:651:52: ( DOTDOTSi )
            // etc/XQFT.g:651:54: DOTDOTSi
            {
            match(input,DOTDOTSi,FOLLOW_DOTDOTSi_in_abbrevReverseStep8283); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end abbrevReverseStep


    // $ANTLR start forwardStep
    // etc/XQFT.g:653:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );
    public final void forwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:653:48: ( forwardAxis nodeTest | abbrevForwardStep )
            int alt128=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                int LA128_1 = input.LA(2);

                if ( (LA128_1==DBLCOLONSi) ) {
                    alt128=1;
                }
                else if ( (LA128_1==LPARSi) ) {
                    alt128=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("653:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 128, 1, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
            case DOCUMENT_NODE:
            case ELEMENT:
            case NODE:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case SCHEMAELEMENT:
            case TEXT:
            case NCName:
            case STARSi:
            case ATSi:
                {
                alt128=2;
                }
                break;
            case CHILD:
            case DESCENDANT:
            case DESCENDANT_OR_SELF:
            case FOLLOWING:
            case FOLLOWING_SIBLING:
            case SELF:
                {
                alt128=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("653:17: forwardStep : ( forwardAxis nodeTest | abbrevForwardStep );", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // etc/XQFT.g:653:50: forwardAxis nodeTest
                    {
                    pushFollow(FOLLOW_forwardAxis_in_forwardStep8346);
                    forwardAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_forwardStep8348);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:653:73: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep8352);
                    abbrevForwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end forwardStep


    // $ANTLR start forwardAxis
    // etc/XQFT.g:654:18: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi ;
    public final void forwardAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:654:49: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi )
            // etc/XQFT.g:654:51: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DBLCOLONSi
            {
            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==CHILD||(input.LA(1)>=DESCENDANT && input.LA(1)<=DESCENDANT_OR_SELF)||(input.LA(1)>=FOLLOWING && input.LA(1)<=FOLLOWING_SIBLING)||input.LA(1)==SELF ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis8399);    throw mse;
            }

            match(input,DBLCOLONSi,FOLLOW_DBLCOLONSi_in_forwardAxis8455); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end forwardAxis


    // $ANTLR start abbrevForwardStep
    // etc/XQFT.g:662:6: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final void abbrevForwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:662:37: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:662:39: ( ATSi )? nodeTest
            {
            // etc/XQFT.g:662:39: ( ATSi )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==ATSi) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:662:39: ATSi
                    {
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep8486); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep8489);
            nodeTest();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end abbrevForwardStep


    // $ANTLR start predicateList
    // etc/XQFT.g:664:17: predicateList : ( predicate )* ;
    public final void predicateList() throws RecognitionException {
        try {
            // etc/XQFT.g:664:48: ( ( predicate )* )
            // etc/XQFT.g:664:50: ( predicate )*
            {
            // etc/XQFT.g:664:50: ( predicate )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==LBRACKSi) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // etc/XQFT.g:664:50: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList8563);
            	    predicate();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end predicateList


    // $ANTLR start predicate
    // etc/XQFT.g:665:18: predicate : LBRACKSi expr RBRACKSi ;
    public final void predicate() throws RecognitionException {
        try {
            // etc/XQFT.g:665:49: ( LBRACKSi expr RBRACKSi )
            // etc/XQFT.g:665:51: LBRACKSi expr RBRACKSi
            {
            match(input,LBRACKSi,FOLLOW_LBRACKSi_in_predicate8623); if (failed) return ;
            pushFollow(FOLLOW_expr_in_predicate8625);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACKSi,FOLLOW_RBRACKSi_in_predicate8627); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end predicate


    // $ANTLR start extensionExpr
    // etc/XQFT.g:670:5: extensionExpr : ( pragma )+ LBRACESi ( expr )? RBRACSi ;
    public final void extensionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:670:36: ( ( pragma )+ LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:670:38: ( pragma )+ LBRACESi ( expr )? RBRACSi
            {
            // etc/XQFT.g:670:38: ( pragma )+
            int cnt131=0;
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==LPRAGSi) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // etc/XQFT.g:670:38: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr8667);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt131 >= 1 ) break loop131;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(131, input);
                        throw eee;
                }
                cnt131++;
            } while (true);

            match(input,LBRACESi,FOLLOW_LBRACESi_in_extensionExpr8670); if (failed) return ;
            // etc/XQFT.g:670:55: ( expr )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( ((LA132_0>=ANCESTOR && LA132_0<=ANCESTOR_OR_SELF)||LA132_0==ATTRIBUTE||LA132_0==CHILD||LA132_0==COMMENT||(LA132_0>=DESCENDANT && LA132_0<=DESCENDANT_OR_SELF)||(LA132_0>=DOCUMENT && LA132_0<=ELEMENT)||LA132_0==EVERY||(LA132_0>=FOLLOWING && LA132_0<=FOR)||LA132_0==IF||LA132_0==LET||LA132_0==NODE||LA132_0==ORDERED||LA132_0==PARENT||(LA132_0>=PRECEDING && LA132_0<=PRECEDING_SIBLING)||LA132_0==PROCESSING_INSTRUCTION||(LA132_0>=SCHEMAATTRIBUTE && LA132_0<=SCHEMAELEMENT)||LA132_0==SELF||LA132_0==SOME||LA132_0==TEXT||LA132_0==TYPESWITCH||LA132_0==UNORDERED||LA132_0==VALIDATE||LA132_0==StringLiteral||LA132_0==NCName||LA132_0==DOLLARSi||LA132_0==LPARSi||(LA132_0>=STARSi && LA132_0<=MINUSSi)||LA132_0==LTSi||(LA132_0>=IntegerLiteral && LA132_0<=LPRAGSi)||(LA132_0>=DBLSLASHSi && LA132_0<=SLASHSi)||(LA132_0>=DOTDOTSi && LA132_0<=ATSi)||LA132_0==DOTSi||LA132_0==LCOMMENTSi||LA132_0==LPISi) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // etc/XQFT.g:670:55: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr8672);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_extensionExpr8675); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end extensionExpr


    // $ANTLR start filterExpr
    // etc/XQFT.g:678:1: filterExpr : primaryExpr predicateList ;
    public final void filterExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:678:32: ( primaryExpr predicateList )
            // etc/XQFT.g:678:34: primaryExpr predicateList
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr8710);
            primaryExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_predicateList_in_filterExpr8712);
            predicateList();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end filterExpr


    // $ANTLR start primaryExpr
    // etc/XQFT.g:681:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final void primaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:681:33: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
            int alt133=8;
            switch ( input.LA(1) ) {
            case StringLiteral:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
                {
                alt133=1;
                }
                break;
            case DOLLARSi:
                {
                alt133=2;
                }
                break;
            case LPARSi:
                {
                alt133=3;
                }
                break;
            case DOTSi:
                {
                alt133=4;
                }
                break;
            case NCName:
                {
                alt133=5;
                }
                break;
            case ORDERED:
                {
                alt133=6;
                }
                break;
            case UNORDERED:
                {
                alt133=7;
                }
                break;
            case ATTRIBUTE:
            case COMMENT:
            case DOCUMENT:
            case ELEMENT:
            case PROCESSING_INSTRUCTION:
            case TEXT:
            case LTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt133=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("681:2: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // etc/XQFT.g:681:35: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr8741);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:682:14: varRef
                    {
                    pushFollow(FOLLOW_varRef_in_primaryExpr8757);
                    varRef();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:683:14: parenthesizedExpr
                    {
                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr8773);
                    parenthesizedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:684:14: contextItemExpr
                    {
                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr8789);
                    contextItemExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:685:14: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr8805);
                    functionCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:686:14: orderedExpr
                    {
                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr8821);
                    orderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:687:14: unorderedExpr
                    {
                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr8837);
                    unorderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:688:14: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_primaryExpr8853);
                    constructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end primaryExpr


    // $ANTLR start varRef
    // etc/XQFT.g:692:3: varRef : DOLLARSi varName ;
    public final void varRef() throws RecognitionException {
        try {
            // etc/XQFT.g:692:34: ( DOLLARSi varName )
            // etc/XQFT.g:692:36: DOLLARSi varName
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef8891); if (failed) return ;
            pushFollow(FOLLOW_varName_in_varRef8893);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end varRef


    // $ANTLR start parenthesizedExpr
    // etc/XQFT.g:694:3: parenthesizedExpr : LPARSi ( expr )? RPARSi ;
    public final void parenthesizedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:694:34: ( LPARSi ( expr )? RPARSi )
            // etc/XQFT.g:694:36: LPARSi ( expr )? RPARSi
            {
            match(input,LPARSi,FOLLOW_LPARSi_in_parenthesizedExpr8916); if (failed) return ;
            // etc/XQFT.g:694:43: ( expr )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( ((LA134_0>=ANCESTOR && LA134_0<=ANCESTOR_OR_SELF)||LA134_0==ATTRIBUTE||LA134_0==CHILD||LA134_0==COMMENT||(LA134_0>=DESCENDANT && LA134_0<=DESCENDANT_OR_SELF)||(LA134_0>=DOCUMENT && LA134_0<=ELEMENT)||LA134_0==EVERY||(LA134_0>=FOLLOWING && LA134_0<=FOR)||LA134_0==IF||LA134_0==LET||LA134_0==NODE||LA134_0==ORDERED||LA134_0==PARENT||(LA134_0>=PRECEDING && LA134_0<=PRECEDING_SIBLING)||LA134_0==PROCESSING_INSTRUCTION||(LA134_0>=SCHEMAATTRIBUTE && LA134_0<=SCHEMAELEMENT)||LA134_0==SELF||LA134_0==SOME||LA134_0==TEXT||LA134_0==TYPESWITCH||LA134_0==UNORDERED||LA134_0==VALIDATE||LA134_0==StringLiteral||LA134_0==NCName||LA134_0==DOLLARSi||LA134_0==LPARSi||(LA134_0>=STARSi && LA134_0<=MINUSSi)||LA134_0==LTSi||(LA134_0>=IntegerLiteral && LA134_0<=LPRAGSi)||(LA134_0>=DBLSLASHSi && LA134_0<=SLASHSi)||(LA134_0>=DOTDOTSi && LA134_0<=ATSi)||LA134_0==DOTSi||LA134_0==LCOMMENTSi||LA134_0==LPISi) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:694:43: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr8918);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_parenthesizedExpr8921); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end parenthesizedExpr


    // $ANTLR start contextItemExpr
    // etc/XQFT.g:697:3: contextItemExpr : DOTSi ;
    public final void contextItemExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:697:34: ( DOTSi )
            // etc/XQFT.g:697:36: DOTSi
            {
            match(input,DOTSi,FOLLOW_DOTSi_in_contextItemExpr8947); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end contextItemExpr


    // $ANTLR start functionCall
    // etc/XQFT.g:698:3: functionCall : qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi ;
    public final void functionCall() throws RecognitionException {
        try {
            // etc/XQFT.g:698:34: ( qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi )
            // etc/XQFT.g:698:36: qName LPARSi ( exprSingle ( COMMASi exprSingle )* )? RPARSi
            {
            pushFollow(FOLLOW_qName_in_functionCall8974);
            qName();
            _fsp--;
            if (failed) return ;
            match(input,LPARSi,FOLLOW_LPARSi_in_functionCall8976); if (failed) return ;
            // etc/XQFT.g:699:14: ( exprSingle ( COMMASi exprSingle )* )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( ((LA136_0>=ANCESTOR && LA136_0<=ANCESTOR_OR_SELF)||LA136_0==ATTRIBUTE||LA136_0==CHILD||LA136_0==COMMENT||(LA136_0>=DESCENDANT && LA136_0<=DESCENDANT_OR_SELF)||(LA136_0>=DOCUMENT && LA136_0<=ELEMENT)||LA136_0==EVERY||(LA136_0>=FOLLOWING && LA136_0<=FOR)||LA136_0==IF||LA136_0==LET||LA136_0==NODE||LA136_0==ORDERED||LA136_0==PARENT||(LA136_0>=PRECEDING && LA136_0<=PRECEDING_SIBLING)||LA136_0==PROCESSING_INSTRUCTION||(LA136_0>=SCHEMAATTRIBUTE && LA136_0<=SCHEMAELEMENT)||LA136_0==SELF||LA136_0==SOME||LA136_0==TEXT||LA136_0==TYPESWITCH||LA136_0==UNORDERED||LA136_0==VALIDATE||LA136_0==StringLiteral||LA136_0==NCName||LA136_0==DOLLARSi||LA136_0==LPARSi||(LA136_0>=STARSi && LA136_0<=MINUSSi)||LA136_0==LTSi||(LA136_0>=IntegerLiteral && LA136_0<=LPRAGSi)||(LA136_0>=DBLSLASHSi && LA136_0<=SLASHSi)||(LA136_0>=DOTDOTSi && LA136_0<=ATSi)||LA136_0==DOTSi||LA136_0==LCOMMENTSi||LA136_0==LPISi) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // etc/XQFT.g:699:15: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall8994);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:699:26: ( COMMASi exprSingle )*
                    loop135:
                    do {
                        int alt135=2;
                        int LA135_0 = input.LA(1);

                        if ( (LA135_0==COMMASi) ) {
                            alt135=1;
                        }


                        switch (alt135) {
                    	case 1 :
                    	    // etc/XQFT.g:699:27: COMMASi exprSingle
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall8997); if (failed) return ;
                    	    pushFollow(FOLLOW_exprSingle_in_functionCall8999);
                    	    exprSingle();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop135;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPARSi,FOLLOW_RPARSi_in_functionCall9019); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end functionCall


    // $ANTLR start orderedExpr
    // etc/XQFT.g:702:3: orderedExpr : ORDERED LBRACESi expr RBRACSi ;
    public final void orderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:702:34: ( ORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:702:36: ORDERED LBRACESi expr RBRACSi
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr9049); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_orderedExpr9051); if (failed) return ;
            pushFollow(FOLLOW_expr_in_orderedExpr9053);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_orderedExpr9055); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end orderedExpr


    // $ANTLR start unorderedExpr
    // etc/XQFT.g:705:3: unorderedExpr : UNORDERED LBRACESi expr RBRACSi ;
    public final void unorderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:705:34: ( UNORDERED LBRACESi expr RBRACSi )
            // etc/XQFT.g:705:36: UNORDERED LBRACESi expr RBRACSi
            {
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr9083); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_unorderedExpr9085); if (failed) return ;
            pushFollow(FOLLOW_expr_in_unorderedExpr9087);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_unorderedExpr9089); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end unorderedExpr


    // $ANTLR start constructor
    // etc/XQFT.g:708:3: constructor : ( directConstructor | computedConstructor );
    public final void constructor() throws RecognitionException {
        try {
            // etc/XQFT.g:708:34: ( directConstructor | computedConstructor )
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LTSi||LA137_0==LCOMMENTSi||LA137_0==LPISi) ) {
                alt137=1;
            }
            else if ( (LA137_0==ATTRIBUTE||LA137_0==COMMENT||LA137_0==DOCUMENT||LA137_0==ELEMENT||LA137_0==PROCESSING_INSTRUCTION||LA137_0==TEXT) ) {
                alt137=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("708:3: constructor : ( directConstructor | computedConstructor );", 137, 0, input);

                throw nvae;
            }
            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:708:36: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_constructor9120);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:708:56: computedConstructor
                    {
                    pushFollow(FOLLOW_computedConstructor_in_constructor9124);
                    computedConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end constructor


    // $ANTLR start directConstructor
    // etc/XQFT.g:711:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );
    public final void directConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:711:35: ( dirElemConstructor | dirCommentConstructor | dirPIConstructor )
            int alt138=3;
            switch ( input.LA(1) ) {
            case LTSi:
                {
                alt138=1;
                }
                break;
            case LCOMMENTSi:
                {
                alt138=2;
                }
                break;
            case LPISi:
                {
                alt138=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("711:4: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );", 138, 0, input);

                throw nvae;
            }

            switch (alt138) {
                case 1 :
                    // etc/XQFT.g:711:37: dirElemConstructor
                    {
                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor9164);
                    dirElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:712:40: dirCommentConstructor
                    {
                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor9205);
                    dirCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:713:28: dirPIConstructor
                    {
                    pushFollow(FOLLOW_dirPIConstructor_in_directConstructor9234);
                    dirPIConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end directConstructor


    // $ANTLR start dirElemConstructor
    // etc/XQFT.g:715:14: dirElemConstructor : LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) ;
    public final void dirElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:715:45: ( LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi ) )
            // etc/XQFT.g:715:47: LTSi qName dirAttributeList ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
            {
            match(input,LTSi,FOLLOW_LTSi_in_dirElemConstructor9292); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.IN_TAG;
            }
            pushFollow(FOLLOW_qName_in_dirElemConstructor9321);
            qName();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor9323);
            dirAttributeList();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:717:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==RSELFTERMSi) ) {
                alt140=1;
            }
            else if ( (LA140_0==GTSi) ) {
                alt140=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("717:24: ( RSELFTERMSi | GTSi ( dirElemContent )* LENDTAGSi qName GTSi )", 140, 0, input);

                throw nvae;
            }
            switch (alt140) {
                case 1 :
                    // etc/XQFT.g:717:25: RSELFTERMSi
                    {
                    match(input,RSELFTERMSi,FOLLOW_RSELFTERMSi_in_dirElemConstructor9353); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:718:26: GTSi ( dirElemContent )* LENDTAGSi qName GTSi
                    {
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor9382); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_ELEMENT;
                    }
                    // etc/XQFT.g:719:26: ( dirElemContent )*
                    loop139:
                    do {
                        int alt139=2;
                        int LA139_0 = input.LA(1);

                        if ( (LA139_0==LBRACESi||LA139_0==LTSi||(LA139_0>=ElementContent && LA139_0<=LCDATASi)||LA139_0==LCOMMENTSi||LA139_0==LPISi) ) {
                            alt139=1;
                        }


                        switch (alt139) {
                    	case 1 :
                    	    // etc/XQFT.g:719:26: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor9411);
                    	    dirElemContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop139;
                        }
                    } while (true);

                    match(input,LENDTAGSi,FOLLOW_LENDTAGSi_in_dirElemConstructor9440); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }
                    pushFollow(FOLLOW_qName_in_dirElemConstructor9470);
                    qName();
                    _fsp--;
                    if (failed) return ;
                    match(input,GTSi,FOLLOW_GTSi_in_dirElemConstructor9499); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=lexer.stack.pop();
                    }

                    }
                    break;

            }


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirElemConstructor


    // $ANTLR start dirAttributeList
    // etc/XQFT.g:724:15: dirAttributeList : ( qName EQSi dirAttributeValue )* ;
    public final void dirAttributeList() throws RecognitionException {
        try {
            // etc/XQFT.g:724:46: ( ( qName EQSi dirAttributeValue )* )
            // etc/XQFT.g:724:48: ( qName EQSi dirAttributeValue )*
            {
            // etc/XQFT.g:724:48: ( qName EQSi dirAttributeValue )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==NCName) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // etc/XQFT.g:724:49: qName EQSi dirAttributeValue
            	    {
            	    pushFollow(FOLLOW_qName_in_dirAttributeList9566);
            	    qName();
            	    _fsp--;
            	    if (failed) return ;
            	    match(input,EQSi,FOLLOW_EQSi_in_dirAttributeList9568); if (failed) return ;
            	    pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList9570);
            	    dirAttributeValue();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);


            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirAttributeList


    // $ANTLR start dirAttributeValue
    // etc/XQFT.g:725:16: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );
    public final void dirAttributeValue() throws RecognitionException {
        try {
            // etc/XQFT.g:725:47: ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==QUOTSi) ) {
                alt144=1;
            }
            else if ( (LA144_0==APOSSi) ) {
                alt144=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("725:16: dirAttributeValue : ( QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi | APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi );", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // etc/XQFT.g:725:49: QUOTSi ( QuotAttributeContent | xmlEnclosedExpr )* QUOTSi
                    {
                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9608); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_QUOT_ATTRIBUTE;
                    }
                    // etc/XQFT.g:726:27: ( QuotAttributeContent | xmlEnclosedExpr )*
                    loop142:
                    do {
                        int alt142=3;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==QuotAttributeContent) ) {
                            alt142=1;
                        }
                        else if ( (LA142_0==LBRACESi) ) {
                            alt142=2;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // etc/XQFT.g:726:28: QuotAttributeContent
                    	    {
                    	    match(input,QuotAttributeContent,FOLLOW_QuotAttributeContent_in_dirAttributeValue9639); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:726:51: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9643);
                    	    xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    match(input,QUOTSi,FOLLOW_QUOTSi_in_dirAttributeValue9675); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:728:31: APOSSi ( AposAttributeContent | xmlEnclosedExpr )* APOSSi
                    {
                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9709); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_APOS_ATTRIBUTE;
                    }
                    // etc/XQFT.g:729:30: ( AposAttributeContent | xmlEnclosedExpr )*
                    loop143:
                    do {
                        int alt143=3;
                        int LA143_0 = input.LA(1);

                        if ( (LA143_0==AposAttributeContent) ) {
                            alt143=1;
                        }
                        else if ( (LA143_0==LBRACESi) ) {
                            alt143=2;
                        }


                        switch (alt143) {
                    	case 1 :
                    	    // etc/XQFT.g:729:31: AposAttributeContent
                    	    {
                    	    match(input,AposAttributeContent,FOLLOW_AposAttributeContent_in_dirAttributeValue9743); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:729:54: xmlEnclosedExpr
                    	    {
                    	    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9747);
                    	    xmlEnclosedExpr();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop143;
                        }
                    } while (true);

                    match(input,APOSSi,FOLLOW_APOSSi_in_dirAttributeValue9782); if (failed) return ;
                    if ( backtracking==0 ) {
                      lexer.state=State.IN_TAG;
                    }

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirAttributeValue


    // $ANTLR start xmlEnclosedExpr
    // etc/XQFT.g:731:14: xmlEnclosedExpr : LBRACESi expr RBRACSi ;
    public final void xmlEnclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:731:48: ( LBRACESi expr RBRACSi )
            // etc/XQFT.g:731:50: LBRACESi expr RBRACSi
            {
            match(input,LBRACESi,FOLLOW_LBRACESi_in_xmlEnclosedExpr9823); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.stack.pushState(lexer.state); lexer.state=State.DEFAULT;
            }
            pushFollow(FOLLOW_expr_in_xmlEnclosedExpr9851);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_xmlEnclosedExpr9879); if (failed) return ;
            if ( backtracking==0 ) {
              lexer.state = lexer.stack.pop();
            }

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end xmlEnclosedExpr


    // $ANTLR start dirElemContent
    // etc/XQFT.g:737:6: dirElemContent : ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr );
    public final void dirElemContent() throws RecognitionException {
        try {
            // etc/XQFT.g:737:37: ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr )
            int alt145=4;
            switch ( input.LA(1) ) {
            case LTSi:
            case LCOMMENTSi:
            case LPISi:
                {
                alt145=1;
                }
                break;
            case LCDATASi:
                {
                alt145=2;
                }
                break;
            case ElementContent:
                {
                alt145=3;
                }
                break;
            case LBRACESi:
                {
                alt145=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("737:6: dirElemContent : ( directConstructor | cDataSection | ElementContent | xmlEnclosedExpr );", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // etc/XQFT.g:737:39: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent9912);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:737:59: cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent9916);
                    cDataSection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:737:74: ElementContent
                    {
                    match(input,ElementContent,FOLLOW_ElementContent_in_dirElemContent9920); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:737:91: xmlEnclosedExpr
                    {
                    pushFollow(FOLLOW_xmlEnclosedExpr_in_dirElemContent9924);
                    xmlEnclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirElemContent


    // $ANTLR start cDataSection
    // etc/XQFT.g:739:7: cDataSection : LCDATASi CDataContents RCDATASi ;
    public final void cDataSection() throws RecognitionException {
        try {
            // etc/XQFT.g:739:26: ( LCDATASi CDataContents RCDATASi )
            // etc/XQFT.g:739:28: LCDATASi CDataContents RCDATASi
            {
            match(input,LCDATASi,FOLLOW_LCDATASi_in_cDataSection9944); if (failed) return ;
            match(input,CDataContents,FOLLOW_CDataContents_in_cDataSection9946); if (failed) return ;
            match(input,RCDATASi,FOLLOW_RCDATASi_in_cDataSection9948); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end cDataSection


    // $ANTLR start dirCommentConstructor
    // etc/XQFT.g:744:5: dirCommentConstructor : LCOMMENTSi DirCommentContent RCOMMENTSi ;
    public final void dirCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:744:31: ( LCOMMENTSi DirCommentContent RCOMMENTSi )
            // etc/XQFT.g:744:33: LCOMMENTSi DirCommentContent RCOMMENTSi
            {
            match(input,LCOMMENTSi,FOLLOW_LCOMMENTSi_in_dirCommentConstructor9971); if (failed) return ;
            match(input,DirCommentContent,FOLLOW_DirCommentContent_in_dirCommentConstructor9973); if (failed) return ;
            match(input,RCOMMENTSi,FOLLOW_RCOMMENTSi_in_dirCommentConstructor9975); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirCommentConstructor


    // $ANTLR start dirPIConstructor
    // etc/XQFT.g:746:5: dirPIConstructor : LPISi PiTarget ( DirPiContents )? RPISi ;
    public final void dirPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:746:27: ( LPISi PiTarget ( DirPiContents )? RPISi )
            // etc/XQFT.g:746:29: LPISi PiTarget ( DirPiContents )? RPISi
            {
            match(input,LPISi,FOLLOW_LPISi_in_dirPIConstructor9996); if (failed) return ;
            match(input,PiTarget,FOLLOW_PiTarget_in_dirPIConstructor9998); if (failed) return ;
            // etc/XQFT.g:746:44: ( DirPiContents )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==DirPiContents) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // etc/XQFT.g:746:44: DirPiContents
                    {
                    match(input,DirPiContents,FOLLOW_DirPiContents_in_dirPIConstructor10000); if (failed) return ;

                    }
                    break;

            }

            match(input,RPISi,FOLLOW_RPISi_in_dirPIConstructor10003); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end dirPIConstructor


    // $ANTLR start computedConstructor
    // etc/XQFT.g:748:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final void computedConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:748:35: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
            int alt147=6;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt147=1;
                }
                break;
            case ELEMENT:
                {
                alt147=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt147=3;
                }
                break;
            case TEXT:
                {
                alt147=4;
                }
                break;
            case COMMENT:
                {
                alt147=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt147=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("748:4: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 147, 0, input);

                throw nvae;
            }

            switch (alt147) {
                case 1 :
                    // etc/XQFT.g:748:37: compDocConstructor
                    {
                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor10029);
                    compDocConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:749:40: compElemConstructor
                    {
                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor10070);
                    compElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:750:40: compAttrConstructor
                    {
                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor10111);
                    compAttrConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:751:40: compTextConstructor
                    {
                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor10152);
                    compTextConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:752:40: compCommentConstructor
                    {
                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor10193);
                    compCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:753:40: compPIConstructor
                    {
                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor10234);
                    compPIConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end computedConstructor


    // $ANTLR start compDocConstructor
    // etc/XQFT.g:755:5: compDocConstructor : DOCUMENT LBRACESi expr RBRACSi ;
    public final void compDocConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:755:36: ( DOCUMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:755:38: DOCUMENT LBRACESi expr RBRACSi
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor10262); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compDocConstructor10264); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compDocConstructor10266);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compDocConstructor10268); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compDocConstructor


    // $ANTLR start compElemConstructor
    // etc/XQFT.g:759:5: compElemConstructor : ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi ;
    public final void compElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:759:36: ( ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi )
            // etc/XQFT.g:759:38: ELEMENT ( qName | LBRACESi expr RBRACSi ) LBRACESi ( contentExpr )? RBRACSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor10297); if (failed) return ;
            // etc/XQFT.g:759:46: ( qName | LBRACESi expr RBRACSi )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==NCName) ) {
                alt148=1;
            }
            else if ( (LA148_0==LBRACESi) ) {
                alt148=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("759:46: ( qName | LBRACESi expr RBRACSi )", 148, 0, input);

                throw nvae;
            }
            switch (alt148) {
                case 1 :
                    // etc/XQFT.g:759:47: qName
                    {
                    pushFollow(FOLLOW_qName_in_compElemConstructor10300);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:759:55: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor10304); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compElemConstructor10306);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor10308); if (failed) return ;

                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compElemConstructor10327); if (failed) return ;
            // etc/XQFT.g:760:25: ( contentExpr )?
            int alt149=2;
            int LA149_0 = input.LA(1);

            if ( ((LA149_0>=ANCESTOR && LA149_0<=ANCESTOR_OR_SELF)||LA149_0==ATTRIBUTE||LA149_0==CHILD||LA149_0==COMMENT||(LA149_0>=DESCENDANT && LA149_0<=DESCENDANT_OR_SELF)||(LA149_0>=DOCUMENT && LA149_0<=ELEMENT)||LA149_0==EVERY||(LA149_0>=FOLLOWING && LA149_0<=FOR)||LA149_0==IF||LA149_0==LET||LA149_0==NODE||LA149_0==ORDERED||LA149_0==PARENT||(LA149_0>=PRECEDING && LA149_0<=PRECEDING_SIBLING)||LA149_0==PROCESSING_INSTRUCTION||(LA149_0>=SCHEMAATTRIBUTE && LA149_0<=SCHEMAELEMENT)||LA149_0==SELF||LA149_0==SOME||LA149_0==TEXT||LA149_0==TYPESWITCH||LA149_0==UNORDERED||LA149_0==VALIDATE||LA149_0==StringLiteral||LA149_0==NCName||LA149_0==DOLLARSi||LA149_0==LPARSi||(LA149_0>=STARSi && LA149_0<=MINUSSi)||LA149_0==LTSi||(LA149_0>=IntegerLiteral && LA149_0<=LPRAGSi)||(LA149_0>=DBLSLASHSi && LA149_0<=SLASHSi)||(LA149_0>=DOTDOTSi && LA149_0<=ATSi)||LA149_0==DOTSi||LA149_0==LCOMMENTSi||LA149_0==LPISi) ) {
                alt149=1;
            }
            switch (alt149) {
                case 1 :
                    // etc/XQFT.g:760:25: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor10329);
                    contentExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compElemConstructor10332); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compElemConstructor


    // $ANTLR start contentExpr
    // etc/XQFT.g:763:6: contentExpr : expr ;
    public final void contentExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:763:37: ( expr )
            // etc/XQFT.g:763:39: expr
            {
            pushFollow(FOLLOW_expr_in_contentExpr10365);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end contentExpr


    // $ANTLR start compAttrConstructor
    // etc/XQFT.g:767:5: compAttrConstructor : ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compAttrConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:767:36: ( ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:767:38: ATTRIBUTE ( qName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor10410); if (failed) return ;
            // etc/XQFT.g:767:48: ( qName | ( LBRACESi expr RBRACSi ) )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==NCName) ) {
                alt150=1;
            }
            else if ( (LA150_0==LBRACESi) ) {
                alt150=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("767:48: ( qName | ( LBRACESi expr RBRACSi ) )", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:767:49: qName
                    {
                    pushFollow(FOLLOW_qName_in_compAttrConstructor10413);
                    qName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:767:57: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:767:57: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:767:58: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor10418); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor10420);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor10422); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compAttrConstructor10442); if (failed) return ;
            // etc/XQFT.g:768:25: ( expr )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( ((LA151_0>=ANCESTOR && LA151_0<=ANCESTOR_OR_SELF)||LA151_0==ATTRIBUTE||LA151_0==CHILD||LA151_0==COMMENT||(LA151_0>=DESCENDANT && LA151_0<=DESCENDANT_OR_SELF)||(LA151_0>=DOCUMENT && LA151_0<=ELEMENT)||LA151_0==EVERY||(LA151_0>=FOLLOWING && LA151_0<=FOR)||LA151_0==IF||LA151_0==LET||LA151_0==NODE||LA151_0==ORDERED||LA151_0==PARENT||(LA151_0>=PRECEDING && LA151_0<=PRECEDING_SIBLING)||LA151_0==PROCESSING_INSTRUCTION||(LA151_0>=SCHEMAATTRIBUTE && LA151_0<=SCHEMAELEMENT)||LA151_0==SELF||LA151_0==SOME||LA151_0==TEXT||LA151_0==TYPESWITCH||LA151_0==UNORDERED||LA151_0==VALIDATE||LA151_0==StringLiteral||LA151_0==NCName||LA151_0==DOLLARSi||LA151_0==LPARSi||(LA151_0>=STARSi && LA151_0<=MINUSSi)||LA151_0==LTSi||(LA151_0>=IntegerLiteral && LA151_0<=LPRAGSi)||(LA151_0>=DBLSLASHSi && LA151_0<=SLASHSi)||(LA151_0>=DOTDOTSi && LA151_0<=ATSi)||LA151_0==DOTSi||LA151_0==LCOMMENTSi||LA151_0==LPISi) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // etc/XQFT.g:768:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor10444);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compAttrConstructor10447); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compAttrConstructor


    // $ANTLR start compTextConstructor
    // etc/XQFT.g:770:5: compTextConstructor : TEXT LBRACESi expr RBRACSi ;
    public final void compTextConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:770:36: ( TEXT LBRACESi expr RBRACSi )
            // etc/XQFT.g:770:38: TEXT LBRACESi expr RBRACSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor10483); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compTextConstructor10485); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compTextConstructor10487);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compTextConstructor10489); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compTextConstructor


    // $ANTLR start compCommentConstructor
    // etc/XQFT.g:772:5: compCommentConstructor : COMMENT LBRACESi expr RBRACSi ;
    public final void compCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:772:36: ( COMMENT LBRACESi expr RBRACSi )
            // etc/XQFT.g:772:38: COMMENT LBRACESi expr RBRACSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor10513); if (failed) return ;
            match(input,LBRACESi,FOLLOW_LBRACESi_in_compCommentConstructor10515); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compCommentConstructor10517);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RBRACSi,FOLLOW_RBRACSi_in_compCommentConstructor10519); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compCommentConstructor


    // $ANTLR start compPIConstructor
    // etc/XQFT.g:774:5: compPIConstructor : PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi ;
    public final void compPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:774:36: ( PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi )
            // etc/XQFT.g:774:38: PROCESSING_INSTRUCTION ( NCName | ( LBRACESi expr RBRACSi ) ) LBRACESi ( expr )? RBRACSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10548); if (failed) return ;
            // etc/XQFT.g:774:61: ( NCName | ( LBRACESi expr RBRACSi ) )
            int alt152=2;
            int LA152_0 = input.LA(1);

            if ( (LA152_0==NCName) ) {
                alt152=1;
            }
            else if ( (LA152_0==LBRACESi) ) {
                alt152=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("774:61: ( NCName | ( LBRACESi expr RBRACSi ) )", 152, 0, input);

                throw nvae;
            }
            switch (alt152) {
                case 1 :
                    // etc/XQFT.g:774:62: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_compPIConstructor10551); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:774:71: ( LBRACESi expr RBRACSi )
                    {
                    // etc/XQFT.g:774:71: ( LBRACESi expr RBRACSi )
                    // etc/XQFT.g:774:72: LBRACESi expr RBRACSi
                    {
                    match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10556); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compPIConstructor10558);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10560); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LBRACESi,FOLLOW_LBRACESi_in_compPIConstructor10580); if (failed) return ;
            // etc/XQFT.g:775:25: ( expr )?
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( ((LA153_0>=ANCESTOR && LA153_0<=ANCESTOR_OR_SELF)||LA153_0==ATTRIBUTE||LA153_0==CHILD||LA153_0==COMMENT||(LA153_0>=DESCENDANT && LA153_0<=DESCENDANT_OR_SELF)||(LA153_0>=DOCUMENT && LA153_0<=ELEMENT)||LA153_0==EVERY||(LA153_0>=FOLLOWING && LA153_0<=FOR)||LA153_0==IF||LA153_0==LET||LA153_0==NODE||LA153_0==ORDERED||LA153_0==PARENT||(LA153_0>=PRECEDING && LA153_0<=PRECEDING_SIBLING)||LA153_0==PROCESSING_INSTRUCTION||(LA153_0>=SCHEMAATTRIBUTE && LA153_0<=SCHEMAELEMENT)||LA153_0==SELF||LA153_0==SOME||LA153_0==TEXT||LA153_0==TYPESWITCH||LA153_0==UNORDERED||LA153_0==VALIDATE||LA153_0==StringLiteral||LA153_0==NCName||LA153_0==DOLLARSi||LA153_0==LPARSi||(LA153_0>=STARSi && LA153_0<=MINUSSi)||LA153_0==LTSi||(LA153_0>=IntegerLiteral && LA153_0<=LPRAGSi)||(LA153_0>=DBLSLASHSi && LA153_0<=SLASHSi)||(LA153_0>=DOTDOTSi && LA153_0<=ATSi)||LA153_0==DOTSi||LA153_0==LCOMMENTSi||LA153_0==LPISi) ) {
                alt153=1;
            }
            switch (alt153) {
                case 1 :
                    // etc/XQFT.g:775:25: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor10582);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RBRACSi,FOLLOW_RBRACSi_in_compPIConstructor10585); if (failed) return ;

            }

        }

            catch (RecognitionException e) {
                throw e;
            }
        finally {
        }
        return ;
    }
    // $ANTLR end compPIConstructor

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:351:34: ( itemType occurrenceIndicator )
        // etc/XQFT.g:351:35: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred12105);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred12107);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:632:35: ( DBLSLASHSi relativePathExpr )
        // etc/XQFT.g:632:36: DBLSLASHSi relativePathExpr
        {
        match(input,DBLSLASHSi,FOLLOW_DBLSLASHSi_in_synpred27743); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred27745);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:633:14: ( SLASHSi relativePathExpr )
        // etc/XQFT.g:633:15: SLASHSi relativePathExpr
        {
        match(input,SLASHSi,FOLLOW_SLASHSi_in_synpred37768); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred37770);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:648:41: ( STARSi COLONSi NCName )
        // etc/XQFT.g:648:42: STARSi COLONSi NCName
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred48155); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred48157); if (failed) return ;
        match(input,NCName,FOLLOW_NCName_in_synpred48159); if (failed) return ;

        }
    }
    // $ANTLR end synpred4

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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA120 dfa120 = new DFA120(this);
    static final String DFA27_eotS =
        "\u01c2\uffff";
    static final String DFA27_eofS =
        "\13\uffff\1\31\14\uffff\1\104\1\uffff\1\104\3\uffff\1\31\2\uffff"+
        "\1\31\2\uffff\1\31\3\uffff\6\31\1\uffff\1\31\52\uffff\1\31\10\uffff"+
        "\1\31\1\uffff\1\31\42\uffff\1\104\1\uffff\1\104\52\uffff\1\104\16"+
        "\uffff\3\104\u00fb\uffff";
    static final String DFA27_minS =
        "\1\14\12\u0098\1\10\1\uffff\1\44\4\u0092\1\u0090\4\u0099\1\u0092"+
        "\1\6\1\uffff\1\6\1\uffff\2\u0098\1\10\2\u0094\1\10\2\u0094\1\10"+
        "\2\u0097\1\u0099\6\10\3\6\50\uffff\1\0\2\6\7\u0092\1\10\1\u0092"+
        "\1\10\1\6\1\110\1\6\1\0\1\u00b0\1\0\1\u0092\1\14\1\u0098\1\u0092"+
        "\1\u00b0\2\u0098\1\u0092\3\u0098\4\0\1\u0092\2\0\2\u009a\1\u0092"+
        "\1\u00c1\1\u00c4\1\u009a\1\u0092\4\6\1\uffff\1\6\52\uffff\1\10\15"+
        "\uffff\3\6\1\10\2\u0094\1\u0099\1\u0097\1\u0094\1\u0097\1\u0094"+
        "\1\u0097\2\u0099\1\0\1\u009a\166\0\1\uffff\2\0\13\uffff\33\0\17"+
        "\uffff\101\0";
    static final String DFA27_maxS =
        "\1\u0092\12\u0098\1\u00b4\1\uffff\1\u0099\2\u009d\2\u0092\5\u0099"+
        "\1\u0092\1\u00c3\1\uffff\1\u00c3\1\uffff\2\u0098\1\u00b4\2\u0099"+
        "\1\u00b4\2\u0099\1\u00b4\3\u0099\6\u00b4\3\u00c3\50\uffff\1\0\2"+
        "\u00c3\1\u009d\6\u0092\1\u00b4\1\u0092\1\u00b4\1\u00c3\1\u009a\1"+
        "\u00c3\1\0\1\u00b0\1\0\1\u00b0\1\u009d\1\u0098\1\u009a\1\u00b0\2"+
        "\u0098\3\u009a\1\u0098\4\0\1\u0092\2\0\2\u009a\1\u0092\1\u00c1\1"+
        "\u00c4\1\u009a\1\u0092\4\u00c3\1\uffff\1\u00c3\52\uffff\1\u00b6"+
        "\15\uffff\3\u00c3\1\u00b6\5\u0099\1\u009c\4\u0099\1\0\1\u009a\166"+
        "\0\1\uffff\2\0\13\uffff\33\0\17\uffff\101\0";
    static final String DFA27_acceptS =
        "\14\uffff\1\3\14\uffff\1\2\1\uffff\1\1\25\uffff\50\1\60\uffff\1"+
        "\1\1\uffff\52\1\1\uffff\15\1\u0086\uffff\1\1\2\uffff\13\1\33\uffff"+
        "\17\1\101\uffff";
    static final String DFA27_specialS =
        "\13\uffff\1\17\14\uffff\1\41\1\uffff\1\31\3\uffff\1\40\2\uffff\1"+
        "\12\2\uffff\1\20\3\uffff\1\26\1\2\1\1\1\0\1\27\1\37\1\uffff\1\11"+
        "\1\21\50\uffff\1\24\1\14\1\22\7\uffff\1\16\1\uffff\1\30\3\uffff"+
        "\1\34\1\uffff\1\5\13\uffff\1\6\1\10\1\3\1\4\1\uffff\1\7\1\13\12"+
        "\uffff\1\23\1\uffff\1\35\52\uffff\1\32\16\uffff\1\36\1\25\1\33\12"+
        "\uffff\1\15\u00f0\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\3\10\uffff\1\7\15\uffff\1\1\1\2\5\uffff\1\14\33\uffff\1\12"+
            "\15\uffff\1\11\21\uffff\1\6\5\uffff\1\5\1\4\14\uffff\1\10\27"+
            "\uffff\1\13",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\1\27\1\uffff\3\31\1\33"+
            "\1\30\1\32\11\31\14\uffff\1\31",
            "",
            "\1\34\110\uffff\1\35\53\uffff\1\36",
            "\1\37\6\uffff\1\41\3\uffff\1\40",
            "\1\42\6\uffff\1\44\3\uffff\1\43",
            "\1\45",
            "\1\46",
            "\1\47\1\uffff\1\47\6\uffff\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\2\31\1\102\1\uffff\1\115\1\65\1\31\3\uffff\1\122\2\uffff\1"+
            "\31\1\117\1\31\4\uffff\1\121\2\31\1\115\3\uffff\1\74\3\31\1"+
            "\123\3\uffff\1\116\1\uffff\1\77\2\uffff\1\72\1\62\2\31\1\113"+
            "\2\uffff\1\76\4\uffff\1\77\1\uffff\1\77\1\74\2\uffff\1\67\2"+
            "\uffff\1\130\1\72\1\101\3\uffff\1\77\1\uffff\1\114\1\127\1\uffff"+
            "\1\77\1\74\3\uffff\1\77\1\31\6\uffff\1\103\1\111\1\31\2\uffff"+
            "\1\126\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\71\1\uffff\1"+
            "\120\1\uffff\2\31\1\66\1\31\1\uffff\1\126\2\uffff\1\112\5\uffff"+
            "\1\31\2\uffff\1\125\1\75\2\uffff\1\73\1\31\1\uffff\1\31\3\uffff"+
            "\1\110\3\uffff\1\124\1\uffff\1\126\1\uffff\1\31\1\107\1\31\1"+
            "\100\1\63\1\31\1\61\1\uffff\1\31\1\64\1\70\1\105\1\uffff\1\57"+
            "\2\56\1\73\1\100\1\60\3\100\2\101\4\31\2\uffff\2\31\1\uffff"+
            "\2\31\1\uffff\1\106\1\31\12\uffff\1\31\2\uffff\1\31",
            "",
            "\2\31\1\102\1\uffff\1\115\1\65\1\31\3\uffff\1\122\2\uffff\1"+
            "\31\1\117\1\31\4\uffff\1\121\2\31\1\115\3\uffff\1\74\3\31\1"+
            "\123\3\uffff\1\116\1\uffff\1\77\2\uffff\1\72\1\62\2\31\1\113"+
            "\2\uffff\1\76\4\uffff\1\77\1\uffff\1\77\1\74\2\uffff\1\67\2"+
            "\uffff\1\130\1\72\1\101\3\uffff\1\77\1\uffff\1\114\1\127\1\uffff"+
            "\1\77\1\74\3\uffff\1\77\1\31\6\uffff\1\103\1\111\1\31\2\uffff"+
            "\1\126\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1\71\1\uffff\1"+
            "\120\1\uffff\2\31\1\66\1\31\1\uffff\1\126\2\uffff\1\112\5\uffff"+
            "\1\31\2\uffff\1\125\1\75\2\uffff\1\73\1\31\1\uffff\1\31\3\uffff"+
            "\1\110\3\uffff\1\124\1\uffff\1\126\1\uffff\1\31\1\107\1\31\1"+
            "\100\1\63\1\31\1\61\1\uffff\1\31\1\64\1\70\1\105\1\uffff\1\132"+
            "\2\131\1\73\1\100\1\133\3\100\2\101\4\31\2\uffff\2\31\1\uffff"+
            "\2\31\1\uffff\1\106\1\31\12\uffff\1\31\2\uffff\1\31",
            "",
            "\1\134",
            "\1\135",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\137\2\uffff\1\136\1\uffff\1\41",
            "\1\137\4\uffff\1\41",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\141\2\uffff\1\140\1\uffff\1\44",
            "\1\141\4\uffff\1\44",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\142\1\uffff\1\143",
            "\1\144\1\uffff\1\145",
            "\1\50",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\2\152\4\uffff\1\154\6\uffff\1\160\1\uffff\1\164\5\uffff\2\160"+
            "\5\uffff\1\u0083\1\156\1\157\13\uffff\2\160\42\uffff\1\166\10"+
            "\uffff\1\176\3\uffff\1\152\1\uffff\2\152\1\uffff\1\163\5\uffff"+
            "\1\162\1\161\1\uffff\1\160\12\uffff\1\165\7\uffff\1\177\1\uffff"+
            "\1\147\13\uffff\1\172\1\uffff\1\167\2\uffff\1\173\2\uffff\1"+
            "\174\4\uffff\1\170\2\146\2\uffff\1\u0080\5\uffff\3\171\1\u0084"+
            "\2\uffff\1\150\1\151\1\uffff\1\153\1\155\2\uffff\1\175\12\uffff"+
            "\1\u0081\2\uffff\1\u0082",
            "\2\u008b\1\31\1\uffff\1\31\1\uffff\1\u008d\3\uffff\3\31\1\u0091"+
            "\1\31\1\u0095\4\uffff\1\31\2\u0091\1\31\3\uffff\1\31\1\u00a2"+
            "\1\u008f\1\u0090\1\31\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31"+
            "\1\uffff\2\u0091\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff\2\31"+
            "\5\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1\uffff\2\31\3\uffff"+
            "\1\31\1\u0097\6\uffff\2\31\1\u009e\2\uffff\1\31\1\u008b\1\uffff"+
            "\2\u008b\1\uffff\1\u0094\1\uffff\1\31\1\uffff\1\31\1\uffff\1"+
            "\u0093\1\u0092\1\uffff\1\u0091\1\uffff\1\31\2\uffff\1\31\5\uffff"+
            "\1\u0096\2\uffff\3\31\1\uffff\1\31\1\u009f\1\uffff\1\u0089\3"+
            "\uffff\1\31\3\uffff\1\31\1\uffff\1\31\1\uffff\1\u009a\1\31\1"+
            "\u0098\2\31\1\u009b\1\uffff\1\31\1\u009c\1\31\1\uffff\1\31\1"+
            "\uffff\1\u0088\2\u0086\2\31\1\u0087\5\31\3\u0099\1\u00a3\2\uffff"+
            "\1\u0085\1\u008a\1\uffff\1\u008c\1\u008e\2\31\1\u009d\12\uffff"+
            "\1\u00a0\2\uffff\1\u00a1",
            "\2\u00a8\4\uffff\1\u00aa\6\uffff\1\u00ae\1\uffff\1\u00b2\5\uffff"+
            "\2\u00ae\5\uffff\1\u00c1\1\u00ac\1\u00ad\13\uffff\2\u00ae\42"+
            "\uffff\1\u00b4\10\uffff\1\u00bc\3\uffff\1\u00a8\1\uffff\2\u00a8"+
            "\1\uffff\1\u00b1\5\uffff\1\u00b0\1\u00af\1\uffff\1\u00ae\12"+
            "\uffff\1\u00b3\7\uffff\1\u00bd\1\uffff\1\u00a5\13\uffff\1\u00b8"+
            "\1\uffff\1\u00b5\2\uffff\1\u00b9\2\uffff\1\u00ba\4\uffff\1\u00b6"+
            "\2\u00a4\2\uffff\1\u00be\5\uffff\3\u00b7\1\u00c2\2\uffff\1\u00a6"+
            "\1\u00a7\1\uffff\1\u00a9\1\u00ab\2\uffff\1\u00bb\12\uffff\1"+
            "\u00bf\2\uffff\1\u00c0",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\2\u008b\1\31\1\uffff\1\31\1\uffff\1\u008d\3\uffff\3\31\1\u0091"+
            "\1\31\1\u0095\4\uffff\1\31\2\u0091\1\31\3\uffff\1\31\1\u00a2"+
            "\1\u008f\1\u0090\1\31\3\uffff\1\31\1\uffff\1\31\2\uffff\1\31"+
            "\1\uffff\2\u0091\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff\2\31"+
            "\5\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1\uffff\2\31\3\uffff"+
            "\1\31\1\u0097\6\uffff\2\31\1\u009e\2\uffff\1\31\1\u008b\1\uffff"+
            "\2\u008b\1\uffff\1\u0094\1\uffff\1\31\1\uffff\1\31\1\uffff\1"+
            "\u0093\1\u0092\1\uffff\1\u0091\1\uffff\1\31\2\uffff\1\31\5\uffff"+
            "\1\u0096\2\uffff\3\31\1\uffff\1\31\1\u009f\1\uffff\1\u0089\3"+
            "\uffff\1\31\3\uffff\1\31\1\uffff\1\31\1\uffff\1\u009a\1\31\1"+
            "\u0098\2\31\1\u009b\1\uffff\1\31\1\u009c\1\31\1\uffff\1\31\1"+
            "\uffff\1\u00c5\2\u0086\2\31\1\u0087\5\31\3\u0099\1\u00a3\2\uffff"+
            "\1\u00c3\1\u00c4\1\uffff\1\u008c\1\u008e\2\31\1\u009d\12\uffff"+
            "\1\u00a0\2\uffff\1\u00a1",
            "\2\u00a8\4\uffff\1\u00aa\6\uffff\1\u00ae\1\uffff\1\u00b2\5\uffff"+
            "\2\u00ae\5\uffff\1\u00c1\1\u00ac\1\u00ad\13\uffff\2\u00ae\42"+
            "\uffff\1\u00b4\10\uffff\1\u00bc\3\uffff\1\u00a8\1\uffff\2\u00a8"+
            "\1\uffff\1\u00b1\5\uffff\1\u00b0\1\u00af\1\uffff\1\u00ae\12"+
            "\uffff\1\u00b3\7\uffff\1\u00bd\1\uffff\1\u00a5\13\uffff\1\u00b8"+
            "\1\uffff\1\u00c6\2\uffff\1\u00b9\2\uffff\1\u00ba\4\uffff\1\u00b6"+
            "\2\u00a4\2\uffff\1\u00be\5\uffff\3\u00b7\1\u00c2\2\uffff\1\u00a6"+
            "\1\u00a7\1\uffff\1\u00a9\1\u00ab\2\uffff\1\u00bb\12\uffff\1"+
            "\u00bf\2\uffff\1\u00c0",
            "\1\u00c7\6\uffff\1\u00c9\3\uffff\1\u00c8",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\1\u00d0",
            "\1\31\1\uffff\2\31\4\uffff\1\31\3\uffff\1\31\5\uffff\1\31\2"+
            "\uffff\1\31\3\uffff\1\31\3\uffff\1\31\3\uffff\1\31\1\uffff\1"+
            "\31\2\uffff\2\31\2\uffff\1\31\2\uffff\1\31\4\uffff\1\31\1\uffff"+
            "\2\31\2\uffff\1\31\2\uffff\3\31\3\uffff\1\31\1\uffff\2\31\1"+
            "\uffff\2\31\3\uffff\1\31\7\uffff\2\31\3\uffff\1\31\7\uffff\1"+
            "\31\1\uffff\1\31\3\uffff\1\31\2\uffff\1\31\2\uffff\1\31\10\uffff"+
            "\2\31\2\uffff\1\31\6\uffff\1\31\3\uffff\1\31\1\uffff\1\31\2"+
            "\uffff\1\31\1\uffff\2\31\1\uffff\1\31\2\uffff\3\31\1\33\1\30"+
            "\1\32\11\31\14\uffff\1\31",
            "\2\152\4\uffff\1\154\6\uffff\1\160\1\uffff\1\164\5\uffff\2\160"+
            "\5\uffff\1\u0083\1\156\1\157\13\uffff\2\160\42\uffff\1\166\10"+
            "\uffff\1\176\3\uffff\1\152\1\uffff\2\152\1\uffff\1\163\5\uffff"+
            "\1\162\1\161\1\uffff\1\160\12\uffff\1\165\7\uffff\1\177\1\uffff"+
            "\1\147\13\uffff\1\172\1\uffff\1\167\2\uffff\1\173\2\uffff\1"+
            "\u00d1\4\uffff\1\170\2\146\2\uffff\1\u0080\5\uffff\3\171\1\u0084"+
            "\2\uffff\1\150\1\151\1\uffff\1\153\1\155\2\uffff\1\175\12\uffff"+
            "\1\u0081\2\uffff\1\u0082",
            "\1\u00d2\57\uffff\1\u00d2\41\uffff\1\u00d3",
            "\2\u00d4\4\uffff\1\u00d6\6\uffff\1\u00da\1\uffff\1\u00de\5\uffff"+
            "\2\u00da\5\uffff\1\u00ed\1\u00d8\1\u00d9\13\uffff\2\u00da\42"+
            "\uffff\1\u00e0\10\uffff\1\u00e8\3\uffff\1\u00d4\1\uffff\2\u00d4"+
            "\1\uffff\1\u00dd\5\uffff\1\u00dc\1\u00db\1\uffff\1\u00da\12"+
            "\uffff\1\u00df\7\uffff\1\u00e9\15\uffff\1\u00e4\1\uffff\1\u00e1"+
            "\2\uffff\1\u00e5\2\uffff\1\u00e6\4\uffff\1\u00e2\4\uffff\1\u00ea"+
            "\5\uffff\3\u00e3\6\uffff\1\u00d5\1\u00d7\2\uffff\1\u00e7\12"+
            "\uffff\1\u00eb\2\uffff\1\u00ec",
            "\1\uffff",
            "\1\u00ee",
            "\1\uffff",
            "\1\u00f1\5\uffff\1\u00f0\1\uffff\1\u00f2\25\uffff\1\u00ef",
            "\1\u00f4\10\uffff\1\u00f6\15\uffff\1\156\1\u00f3\57\uffff\1"+
            "\166\21\uffff\1\u00f5\5\uffff\1\162\1\161\14\uffff\1\u00f7\27"+
            "\uffff\1\u00f8\12\uffff\1\170",
            "\1\u00f9",
            "\1\u00fb\5\uffff\1\u00fa\1\uffff\1\u00fc",
            "\1\u00ef",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u0100\5\uffff\1\u00ff\1\uffff\1\u0101",
            "\1\u0103\1\uffff\1\u0102",
            "\1\u0105\1\uffff\1\u0104",
            "\1\u0106",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0107",
            "\1\uffff",
            "\1\uffff",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\2\u010f\4\uffff\1\u0111\6\uffff\1\u0115\1\uffff\1\u0119\5\uffff"+
            "\2\u0115\5\uffff\1\u0128\1\u0113\1\u0114\13\uffff\2\u0115\42"+
            "\uffff\1\u011b\10\uffff\1\u0123\3\uffff\1\u010f\1\uffff\2\u010f"+
            "\1\uffff\1\u0118\5\uffff\1\u0117\1\u0116\1\uffff\1\u0115\12"+
            "\uffff\1\u011a\7\uffff\1\u0124\15\uffff\1\u011f\1\uffff\1\u011c"+
            "\2\uffff\1\u0120\2\uffff\1\u0121\4\uffff\1\u011d\4\uffff\1\u0125"+
            "\5\uffff\3\u011e\6\uffff\1\u0110\1\u0112\2\uffff\1\u0122\12"+
            "\uffff\1\u0126\2\uffff\1\u0127",
            "\2\u012d\4\uffff\1\u012f\6\uffff\1\u0133\1\uffff\1\u0137\5\uffff"+
            "\2\u0133\5\uffff\1\u0146\1\u0131\1\u0132\13\uffff\2\u0133\42"+
            "\uffff\1\u0139\10\uffff\1\u0141\3\uffff\1\u012d\1\uffff\2\u012d"+
            "\1\uffff\1\u0136\5\uffff\1\u0135\1\u0134\1\uffff\1\u0133\12"+
            "\uffff\1\u0138\7\uffff\1\u0142\1\uffff\1\u012a\13\uffff\1\u013d"+
            "\1\uffff\1\u013a\2\uffff\1\u013e\2\uffff\1\u013f\4\uffff\1\u013b"+
            "\2\u0129\2\uffff\1\u0143\5\uffff\3\u013c\1\u0147\2\uffff\1\u012b"+
            "\1\u012c\1\uffff\1\u012e\1\u0130\2\uffff\1\u0140\12\uffff\1"+
            "\u0144\2\uffff\1\u0145",
            "\2\31\4\uffff\1\31\6\uffff\1\31\1\uffff\1\31\5\uffff\2\31\5"+
            "\uffff\3\31\13\uffff\2\31\42\uffff\1\31\10\uffff\1\31\3\uffff"+
            "\1\31\1\uffff\2\31\1\uffff\1\31\5\uffff\2\31\1\uffff\1\31\12"+
            "\uffff\1\31\7\uffff\1\31\1\uffff\1\31\13\uffff\1\31\1\uffff"+
            "\1\u0148\2\uffff\1\31\2\uffff\1\31\4\uffff\3\31\2\uffff\1\31"+
            "\5\uffff\4\31\2\uffff\2\31\1\uffff\2\31\2\uffff\1\31\12\uffff"+
            "\1\31\2\uffff\1\31",
            "\2\31\1\102\1\uffff\1\115\1\uffff\1\31\3\uffff\1\122\1\u014d"+
            "\1\u014e\1\31\1\117\1\31\4\uffff\1\121\2\31\1\115\3\uffff\1"+
            "\74\3\31\1\123\3\uffff\1\116\1\uffff\1\77\2\uffff\1\u0151\1"+
            "\uffff\2\31\1\113\2\uffff\1\76\4\uffff\1\77\1\uffff\1\77\1\74"+
            "\5\uffff\1\u0150\1\u0151\1\101\3\uffff\1\77\1\uffff\1\114\1"+
            "\127\1\uffff\1\77\1\74\3\uffff\1\77\1\31\6\uffff\1\103\1\111"+
            "\1\31\2\uffff\1\126\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1"+
            "\u0155\1\uffff\1\120\1\uffff\2\31\1\uffff\1\31\1\uffff\1\126"+
            "\2\uffff\1\112\5\uffff\1\31\2\uffff\1\125\1\75\1\u014f\1\uffff"+
            "\1\u0152\1\31\1\uffff\1\31\3\uffff\1\110\3\uffff\1\124\1\uffff"+
            "\1\126\1\uffff\1\31\1\107\1\31\1\100\1\u0153\1\31\1\uffff\1"+
            "\u0149\1\31\1\u0154\1\uffff\1\105\1\uffff\1\57\2\56\1\u0152"+
            "\1\100\1\60\3\100\2\101\4\31\2\uffff\1\u014a\1\u014b\1\uffff"+
            "\2\31\1\u014c\1\106\1\31\12\uffff\1\31\2\uffff\1\31",
            "",
            "\2\u0159\1\102\1\uffff\1\115\1\uffff\1\u015b\3\uffff\1\122\1"+
            "\u014d\1\u014e\1\u015f\1\117\1\u0163\4\uffff\1\121\2\u015f\1"+
            "\115\3\uffff\1\74\1\u0170\1\u015d\1\u015e\1\123\3\uffff\1\116"+
            "\1\uffff\1\77\2\uffff\1\u0151\1\uffff\2\u015f\1\113\2\uffff"+
            "\1\76\4\uffff\1\77\1\uffff\1\77\1\74\5\uffff\1\u0150\1\u0151"+
            "\1\101\3\uffff\1\77\1\uffff\1\114\1\127\1\uffff\1\77\1\74\3"+
            "\uffff\1\77\1\u0165\6\uffff\1\103\1\111\1\u016c\2\uffff\1\126"+
            "\1\u0159\1\uffff\2\u0159\1\uffff\1\u0162\1\uffff\1\u0155\1\uffff"+
            "\1\120\1\uffff\1\u0161\1\u0160\1\uffff\1\u015f\1\uffff\1\126"+
            "\2\uffff\1\112\5\uffff\1\u0164\2\uffff\1\125\1\75\1\u014f\1"+
            "\uffff\1\u0152\1\u016d\5\uffff\1\110\3\uffff\1\124\1\uffff\1"+
            "\126\1\uffff\1\u0168\1\107\1\u0166\1\100\1\u0153\1\u0169\2\uffff"+
            "\1\u016a\1\u0154\1\uffff\1\105\1\uffff\1\u0158\2\u0156\1\u0152"+
            "\1\100\1\u0157\3\100\2\101\3\u0167\6\uffff\1\u015a\1\u015c\1"+
            "\uffff\1\106\1\u016b\12\uffff\1\u016e\2\uffff\1\u016f",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\102\1\uffff\1\115\5\uffff\1\122\1\u0175\1\u0176\1\uffff\1"+
            "\117\5\uffff\1\121\2\uffff\1\115\3\uffff\1\u017b\3\uffff\1\123"+
            "\3\uffff\1\116\4\uffff\1\u0179\3\uffff\1\113\2\uffff\1\u017e"+
            "\7\uffff\1\u017b\5\uffff\1\u0178\1\u0179\6\uffff\1\114\3\uffff"+
            "\1\u017b\13\uffff\1\103\1\111\13\uffff\1\u0155\1\uffff\1\120"+
            "\11\uffff\1\112\11\uffff\1\u017d\1\u0177\1\uffff\1\u017a\6\uffff"+
            "\1\110\10\uffff\1\107\1\31\1\uffff\1\u0153\2\uffff\1\u0171\1"+
            "\u0172\1\u0180\1\uffff\1\u017f\1\uffff\1\u017b\2\u017c\1\u017a"+
            "\3\uffff\1\31\11\uffff\2\u0174\3\uffff\1\u0173\1\106\1\uffff"+
            "\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\u0181\4\uffff\1\u0183\6\uffff\1\u0187\1\uffff\1\u018b\5\uffff"+
            "\2\u0187\5\uffff\1\u019a\1\u0185\1\u0186\13\uffff\2\u0187\42"+
            "\uffff\1\u018d\10\uffff\1\u0195\3\uffff\1\u0181\1\uffff\2\u0181"+
            "\1\uffff\1\u018a\5\uffff\1\u0189\1\u0188\1\uffff\1\u0187\12"+
            "\uffff\1\u018c\7\uffff\1\u0196\15\uffff\1\u0191\1\uffff\1\u018e"+
            "\2\uffff\1\u0192\2\uffff\1\u0193\4\uffff\1\u018f\4\uffff\1\u0197"+
            "\5\uffff\3\u0190\6\uffff\1\u0182\1\u0184\2\uffff\1\u0194\12"+
            "\uffff\1\u0198\2\uffff\1\u0199",
            "\2\u019d\1\102\1\uffff\1\115\1\uffff\1\u019f\3\uffff\1\122\1"+
            "\u014d\1\u014e\1\u01a3\1\117\1\u01a7\4\uffff\1\121\2\u01a3\1"+
            "\115\3\uffff\1\74\1\u01b4\1\u01a1\1\u01a2\1\123\3\uffff\1\116"+
            "\1\uffff\1\77\2\uffff\1\u0151\1\uffff\2\u01a3\1\113\2\uffff"+
            "\1\76\4\uffff\1\77\1\uffff\1\77\1\74\5\uffff\1\u0150\1\u0151"+
            "\1\101\3\uffff\1\77\1\uffff\1\114\1\127\1\uffff\1\77\1\74\3"+
            "\uffff\1\77\1\u01a9\6\uffff\1\103\1\111\1\u01b0\2\uffff\1\126"+
            "\1\u019d\1\uffff\2\u019d\1\uffff\1\u01a6\1\uffff\1\u0155\1\uffff"+
            "\1\120\1\uffff\1\u01a5\1\u01a4\1\uffff\1\u01a3\1\uffff\1\126"+
            "\2\uffff\1\112\5\uffff\1\u01a8\2\uffff\1\125\1\75\1\u014f\1"+
            "\uffff\1\u0152\1\u01b1\5\uffff\1\110\3\uffff\1\124\1\uffff\1"+
            "\126\1\uffff\1\u01ac\1\107\1\u01aa\1\100\1\u0153\1\u01ad\2\uffff"+
            "\1\u01ae\1\u0154\1\uffff\1\105\1\uffff\1\u019c\2\u0156\1\u0152"+
            "\1\100\1\u019b\3\100\2\101\3\u01ab\6\uffff\1\u019e\1\u01a0\1"+
            "\uffff\1\106\1\u01af\12\uffff\1\u01b2\2\uffff\1\u01b3",
            "\2\31\1\102\1\uffff\1\115\1\uffff\1\31\3\uffff\1\122\1\u014d"+
            "\1\u014e\1\31\1\117\1\31\4\uffff\1\121\2\31\1\115\3\uffff\1"+
            "\74\3\31\1\123\3\uffff\1\116\1\uffff\1\77\2\uffff\1\u0151\1"+
            "\uffff\2\31\1\113\2\uffff\1\76\4\uffff\1\77\1\uffff\1\77\1\74"+
            "\5\uffff\1\u0150\1\u0151\1\101\3\uffff\1\77\1\uffff\1\114\1"+
            "\127\1\uffff\1\77\1\74\3\uffff\1\77\1\31\6\uffff\1\103\1\111"+
            "\1\31\2\uffff\1\126\1\31\1\uffff\2\31\1\uffff\1\31\1\uffff\1"+
            "\u0155\1\uffff\1\120\1\uffff\2\31\1\uffff\1\31\1\uffff\1\126"+
            "\2\uffff\1\112\5\uffff\1\31\2\uffff\1\125\1\75\1\u014f\1\uffff"+
            "\1\u0152\1\31\1\uffff\1\31\3\uffff\1\110\3\uffff\1\124\1\uffff"+
            "\1\126\1\uffff\1\31\1\107\1\31\1\100\1\u0153\1\31\1\uffff\1"+
            "\u0149\1\31\1\u0154\1\uffff\1\105\1\uffff\1\u01b8\2\u01b5\1"+
            "\u0152\1\100\1\u01b9\3\100\2\101\4\31\2\uffff\1\u01b6\1\u01b7"+
            "\1\uffff\2\31\1\u014c\1\106\1\31\12\uffff\1\31\2\uffff\1\31",
            "\1\102\1\uffff\1\115\5\uffff\1\122\1\u0175\1\u0176\1\uffff\1"+
            "\117\5\uffff\1\121\2\uffff\1\115\3\uffff\1\u017b\3\uffff\1\123"+
            "\3\uffff\1\116\4\uffff\1\u0179\3\uffff\1\113\2\uffff\1\u017e"+
            "\7\uffff\1\u017b\5\uffff\1\u0178\1\u0179\6\uffff\1\114\3\uffff"+
            "\1\u017b\13\uffff\1\103\1\111\13\uffff\1\u0155\1\uffff\1\120"+
            "\11\uffff\1\112\11\uffff\1\u017d\1\u0177\1\uffff\1\u017a\6\uffff"+
            "\1\110\10\uffff\1\107\1\31\1\uffff\1\u0153\2\uffff\1\u01ba\1"+
            "\u0172\1\u0180\1\uffff\1\u017f\1\uffff\1\u017b\2\u017c\1\u017a"+
            "\3\uffff\1\31\11\uffff\2\u0174\3\uffff\1\u0173\1\106\1\uffff"+
            "\1\31",
            "\1\u01bc\2\uffff\1\u01bb\1\uffff\1\u00c9",
            "\1\u01bc\4\uffff\1\u00c9",
            "\1\36",
            "\1\u01bd\1\uffff\1\u01be",
            "\1\137\4\uffff\1\41",
            "\1\u01bf\1\uffff\1\41\2\uffff\1\u01c0",
            "\1\141\4\uffff\1\44",
            "\1\u01c1\1\uffff\1\44",
            "\1\143",
            "\1\145",
            "\1\uffff",
            "\1\u00d3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "351:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | EMPTY_SEQUENCE LPARSi RPARSi );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_43 = input.LA(1);

                         
                        int index27_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_43==STARSi) ) {s = 24;}

                        else if ( (LA27_43==EOF||LA27_43==AND||(LA27_43>=ASCENDING && LA27_43<=AT)||LA27_43==CASE||LA27_43==COLLATION||LA27_43==DEFAULT||LA27_43==DESCENDING||LA27_43==DIV||LA27_43==ELSE||LA27_43==EMPTY||LA27_43==EQ||(LA27_43>=EXCEPT && LA27_43<=EXTERNAL)||LA27_43==FOR||LA27_43==FTCONTAINS||LA27_43==GE||(LA27_43>=GT && LA27_43<=IDIV)||LA27_43==IN||(LA27_43>=INSTANCE && LA27_43<=IS)||LA27_43==LE||(LA27_43>=LET && LA27_43<=LEVELS)||(LA27_43>=LT && LA27_43<=MOD)||LA27_43==NE||(LA27_43>=OR && LA27_43<=ORDER)||LA27_43==PARAGRAPHS||LA27_43==RETURN||LA27_43==SATISFIES||LA27_43==SCORE||LA27_43==SENTENCES||LA27_43==STABLE||(LA27_43>=TIMES && LA27_43<=TO)||LA27_43==UNION||LA27_43==WHERE||LA27_43==WITHOUT||LA27_43==WORDS||LA27_43==SEMICOLONSi||(LA27_43>=EQSi && LA27_43<=COMMASi)||LA27_43==ASSIGNSi||(LA27_43>=RPARSi && LA27_43<=RBRACSi)||(LA27_43>=MINUSSi && LA27_43<=NODEAFTERSi)||LA27_43==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_43==PLUSSi) ) {s = 26;}

                        else if ( (LA27_43==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_43);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_42 = input.LA(1);

                         
                        int index27_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_42==EOF||LA27_42==AND||(LA27_42>=ASCENDING && LA27_42<=AT)||LA27_42==CASE||LA27_42==COLLATION||LA27_42==DEFAULT||LA27_42==DESCENDING||LA27_42==DIV||LA27_42==ELSE||LA27_42==EMPTY||LA27_42==EQ||(LA27_42>=EXCEPT && LA27_42<=EXTERNAL)||LA27_42==FOR||LA27_42==FTCONTAINS||LA27_42==GE||(LA27_42>=GT && LA27_42<=IDIV)||LA27_42==IN||(LA27_42>=INSTANCE && LA27_42<=IS)||LA27_42==LE||(LA27_42>=LET && LA27_42<=LEVELS)||(LA27_42>=LT && LA27_42<=MOD)||LA27_42==NE||(LA27_42>=OR && LA27_42<=ORDER)||LA27_42==PARAGRAPHS||LA27_42==RETURN||LA27_42==SATISFIES||LA27_42==SCORE||LA27_42==SENTENCES||LA27_42==STABLE||(LA27_42>=TIMES && LA27_42<=TO)||LA27_42==UNION||LA27_42==WHERE||LA27_42==WITHOUT||LA27_42==WORDS||LA27_42==SEMICOLONSi||(LA27_42>=EQSi && LA27_42<=COMMASi)||LA27_42==ASSIGNSi||(LA27_42>=RPARSi && LA27_42<=RBRACSi)||(LA27_42>=MINUSSi && LA27_42<=NODEAFTERSi)||LA27_42==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_42==STARSi) ) {s = 24;}

                        else if ( (LA27_42==PLUSSi) ) {s = 26;}

                        else if ( (LA27_42==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_42);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_41 = input.LA(1);

                         
                        int index27_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_41==STARSi) ) {s = 24;}

                        else if ( (LA27_41==EOF||LA27_41==AND||(LA27_41>=ASCENDING && LA27_41<=AT)||LA27_41==CASE||LA27_41==COLLATION||LA27_41==DEFAULT||LA27_41==DESCENDING||LA27_41==DIV||LA27_41==ELSE||LA27_41==EMPTY||LA27_41==EQ||(LA27_41>=EXCEPT && LA27_41<=EXTERNAL)||LA27_41==FOR||LA27_41==FTCONTAINS||LA27_41==GE||(LA27_41>=GT && LA27_41<=IDIV)||LA27_41==IN||(LA27_41>=INSTANCE && LA27_41<=IS)||LA27_41==LE||(LA27_41>=LET && LA27_41<=LEVELS)||(LA27_41>=LT && LA27_41<=MOD)||LA27_41==NE||(LA27_41>=OR && LA27_41<=ORDER)||LA27_41==PARAGRAPHS||LA27_41==RETURN||LA27_41==SATISFIES||LA27_41==SCORE||LA27_41==SENTENCES||LA27_41==STABLE||(LA27_41>=TIMES && LA27_41<=TO)||LA27_41==UNION||LA27_41==WHERE||LA27_41==WITHOUT||LA27_41==WORDS||LA27_41==SEMICOLONSi||(LA27_41>=EQSi && LA27_41<=COMMASi)||LA27_41==ASSIGNSi||(LA27_41>=RPARSi && LA27_41<=RBRACSi)||(LA27_41>=MINUSSi && LA27_41<=NODEAFTERSi)||LA27_41==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_41==PLUSSi) ) {s = 26;}

                        else if ( (LA27_41==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_41);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA27_121 = input.LA(1);

                         
                        int index27_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_121);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA27_122 = input.LA(1);

                         
                        int index27_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_122);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA27_107 = input.LA(1);

                         
                        int index27_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_107);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA27_119 = input.LA(1);

                         
                        int index27_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_119);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA27_124 = input.LA(1);

                         
                        int index27_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_124);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA27_120 = input.LA(1);

                         
                        int index27_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_120);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA27_47 = input.LA(1);

                         
                        int index27_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_47==EOF||LA27_47==AND||LA27_47==ASCENDING||(LA27_47>=CASE && LA27_47<=CASTABLE)||LA27_47==COLLATION||LA27_47==DEFAULT||LA27_47==DESCENDING||LA27_47==DIV||LA27_47==ELSE||LA27_47==EMPTY||LA27_47==EQ||LA27_47==EXCEPT||LA27_47==FOR||LA27_47==FTCONTAINS||LA27_47==GE||(LA27_47>=GT && LA27_47<=IDIV)||(LA27_47>=INSTANCE && LA27_47<=IS)||LA27_47==LE||(LA27_47>=LET && LA27_47<=LEVELS)||(LA27_47>=LT && LA27_47<=MOD)||LA27_47==NE||(LA27_47>=OR && LA27_47<=ORDER)||LA27_47==PARAGRAPHS||LA27_47==RETURN||LA27_47==SATISFIES||LA27_47==SENTENCES||LA27_47==STABLE||(LA27_47>=TIMES && LA27_47<=TREAT)||LA27_47==UNION||LA27_47==WHERE||LA27_47==WITHOUT||LA27_47==WORDS||LA27_47==SEMICOLONSi||(LA27_47>=EQSi && LA27_47<=COMMASi)||LA27_47==COLONSi||LA27_47==RPARSi||LA27_47==RBRACSi||(LA27_47>=PIPESi && LA27_47<=NEQSi)||(LA27_47>=LTOREQSi && LA27_47<=NODEAFTERSi)||(LA27_47>=LBRACKSi && LA27_47<=RBRACKSi)) ) {s = 25;}

                        else if ( (LA27_47==DBLSLASHSi) ) {s = 133;}

                        else if ( ((LA27_47>=PLUSSi && LA27_47<=MINUSSi)) ) {s = 134;}

                        else if ( (LA27_47==LTSi) ) {s = 135;}

                        else if ( (LA27_47==STARSi) ) {s = 136;}

                        else if ( (LA27_47==VALIDATE) && (synpred1())) {s = 137;}

                        else if ( (LA27_47==SLASHSi) ) {s = 138;}

                        else if ( ((LA27_47>=ANCESTOR && LA27_47<=ANCESTOR_OR_SELF)||LA27_47==PARENT||(LA27_47>=PRECEDING && LA27_47<=PRECEDING_SIBLING)) && (synpred1())) {s = 139;}

                        else if ( (LA27_47==DOTDOTSi) && (synpred1())) {s = 140;}

                        else if ( (LA27_47==ATTRIBUTE) && (synpred1())) {s = 141;}

                        else if ( (LA27_47==ATSi) && (synpred1())) {s = 142;}

                        else if ( (LA27_47==DOCUMENT_NODE) && (synpred1())) {s = 143;}

                        else if ( (LA27_47==ELEMENT) && (synpred1())) {s = 144;}

                        else if ( (LA27_47==CHILD||(LA27_47>=DESCENDANT && LA27_47<=DESCENDANT_OR_SELF)||(LA27_47>=FOLLOWING && LA27_47<=FOLLOWING_SIBLING)||LA27_47==SELF) && (synpred1())) {s = 145;}

                        else if ( (LA27_47==SCHEMAELEMENT) && (synpred1())) {s = 146;}

                        else if ( (LA27_47==SCHEMAATTRIBUTE) && (synpred1())) {s = 147;}

                        else if ( (LA27_47==PROCESSING_INSTRUCTION) && (synpred1())) {s = 148;}

                        else if ( (LA27_47==COMMENT) && (synpred1())) {s = 149;}

                        else if ( (LA27_47==TEXT) && (synpred1())) {s = 150;}

                        else if ( (LA27_47==NODE) && (synpred1())) {s = 151;}

                        else if ( (LA27_47==NCName) && (synpred1())) {s = 152;}

                        else if ( ((LA27_47>=IntegerLiteral && LA27_47<=DoubleLiteral)) && (synpred1())) {s = 153;}

                        else if ( (LA27_47==StringLiteral) && (synpred1())) {s = 154;}

                        else if ( (LA27_47==DOLLARSi) && (synpred1())) {s = 155;}

                        else if ( (LA27_47==LPARSi) && (synpred1())) {s = 156;}

                        else if ( (LA27_47==DOTSi) && (synpred1())) {s = 157;}

                        else if ( (LA27_47==ORDERED) && (synpred1())) {s = 158;}

                        else if ( (LA27_47==UNORDERED) && (synpred1())) {s = 159;}

                        else if ( (LA27_47==LCOMMENTSi) && (synpred1())) {s = 160;}

                        else if ( (LA27_47==LPISi) && (synpred1())) {s = 161;}

                        else if ( (LA27_47==DOCUMENT) && (synpred1())) {s = 162;}

                        else if ( (LA27_47==LPRAGSi) && (synpred1())) {s = 163;}

                         
                        input.seek(index27_47);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA27_33 = input.LA(1);

                         
                        int index27_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_33==STARSi) ) {s = 24;}

                        else if ( (LA27_33==EOF||LA27_33==AND||(LA27_33>=ASCENDING && LA27_33<=AT)||LA27_33==CASE||LA27_33==COLLATION||LA27_33==DEFAULT||LA27_33==DESCENDING||LA27_33==DIV||LA27_33==ELSE||LA27_33==EMPTY||LA27_33==EQ||(LA27_33>=EXCEPT && LA27_33<=EXTERNAL)||LA27_33==FOR||LA27_33==FTCONTAINS||LA27_33==GE||(LA27_33>=GT && LA27_33<=IDIV)||LA27_33==IN||(LA27_33>=INSTANCE && LA27_33<=IS)||LA27_33==LE||(LA27_33>=LET && LA27_33<=LEVELS)||(LA27_33>=LT && LA27_33<=MOD)||LA27_33==NE||(LA27_33>=OR && LA27_33<=ORDER)||LA27_33==PARAGRAPHS||LA27_33==RETURN||LA27_33==SATISFIES||LA27_33==SCORE||LA27_33==SENTENCES||LA27_33==STABLE||(LA27_33>=TIMES && LA27_33<=TO)||LA27_33==UNION||LA27_33==WHERE||LA27_33==WITHOUT||LA27_33==WORDS||LA27_33==SEMICOLONSi||(LA27_33>=EQSi && LA27_33<=COMMASi)||LA27_33==ASSIGNSi||(LA27_33>=RPARSi && LA27_33<=RBRACSi)||(LA27_33>=MINUSSi && LA27_33<=NODEAFTERSi)||LA27_33==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_33==PLUSSi) ) {s = 26;}

                        else if ( (LA27_33==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_33);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA27_125 = input.LA(1);

                         
                        int index27_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_125);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA27_90 = input.LA(1);

                         
                        int index27_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_90==EOF||LA27_90==AND||LA27_90==ASCENDING||(LA27_90>=CASE && LA27_90<=CASTABLE)||LA27_90==COLLATION||LA27_90==DEFAULT||LA27_90==DESCENDING||LA27_90==DIV||LA27_90==ELSE||LA27_90==EMPTY||LA27_90==EQ||LA27_90==EXCEPT||LA27_90==FOR||LA27_90==FTCONTAINS||LA27_90==GE||(LA27_90>=GT && LA27_90<=IDIV)||(LA27_90>=INSTANCE && LA27_90<=IS)||LA27_90==LE||(LA27_90>=LET && LA27_90<=LEVELS)||(LA27_90>=LT && LA27_90<=MOD)||LA27_90==NE||(LA27_90>=OR && LA27_90<=ORDER)||LA27_90==PARAGRAPHS||LA27_90==RETURN||LA27_90==SATISFIES||LA27_90==SENTENCES||LA27_90==STABLE||(LA27_90>=TIMES && LA27_90<=TREAT)||LA27_90==UNION||LA27_90==WHERE||LA27_90==WITHOUT||LA27_90==WORDS||LA27_90==SEMICOLONSi||(LA27_90>=EQSi && LA27_90<=COMMASi)||LA27_90==COLONSi||LA27_90==RPARSi||LA27_90==RBRACSi||(LA27_90>=PIPESi && LA27_90<=NEQSi)||(LA27_90>=LTOREQSi && LA27_90<=NODEAFTERSi)||(LA27_90>=LBRACKSi && LA27_90<=RBRACKSi)) ) {s = 25;}

                        else if ( ((LA27_90>=PLUSSi && LA27_90<=MINUSSi)) ) {s = 134;}

                        else if ( (LA27_90==VALIDATE) && (synpred1())) {s = 137;}

                        else if ( (LA27_90==DBLSLASHSi) ) {s = 195;}

                        else if ( (LA27_90==SLASHSi) ) {s = 196;}

                        else if ( ((LA27_90>=ANCESTOR && LA27_90<=ANCESTOR_OR_SELF)||LA27_90==PARENT||(LA27_90>=PRECEDING && LA27_90<=PRECEDING_SIBLING)) && (synpred1())) {s = 139;}

                        else if ( (LA27_90==DOTDOTSi) && (synpred1())) {s = 140;}

                        else if ( (LA27_90==ATTRIBUTE) && (synpred1())) {s = 141;}

                        else if ( (LA27_90==ATSi) && (synpred1())) {s = 142;}

                        else if ( (LA27_90==DOCUMENT_NODE) && (synpred1())) {s = 143;}

                        else if ( (LA27_90==ELEMENT) && (synpred1())) {s = 144;}

                        else if ( (LA27_90==CHILD||(LA27_90>=DESCENDANT && LA27_90<=DESCENDANT_OR_SELF)||(LA27_90>=FOLLOWING && LA27_90<=FOLLOWING_SIBLING)||LA27_90==SELF) && (synpred1())) {s = 145;}

                        else if ( (LA27_90==SCHEMAELEMENT) && (synpred1())) {s = 146;}

                        else if ( (LA27_90==SCHEMAATTRIBUTE) && (synpred1())) {s = 147;}

                        else if ( (LA27_90==PROCESSING_INSTRUCTION) && (synpred1())) {s = 148;}

                        else if ( (LA27_90==COMMENT) && (synpred1())) {s = 149;}

                        else if ( (LA27_90==TEXT) && (synpred1())) {s = 150;}

                        else if ( (LA27_90==NODE) && (synpred1())) {s = 151;}

                        else if ( (LA27_90==NCName) && (synpred1())) {s = 152;}

                        else if ( (LA27_90==STARSi) ) {s = 197;}

                        else if ( ((LA27_90>=IntegerLiteral && LA27_90<=DoubleLiteral)) && (synpred1())) {s = 153;}

                        else if ( (LA27_90==StringLiteral) && (synpred1())) {s = 154;}

                        else if ( (LA27_90==DOLLARSi) && (synpred1())) {s = 155;}

                        else if ( (LA27_90==LPARSi) && (synpred1())) {s = 156;}

                        else if ( (LA27_90==DOTSi) && (synpred1())) {s = 157;}

                        else if ( (LA27_90==ORDERED) && (synpred1())) {s = 158;}

                        else if ( (LA27_90==UNORDERED) && (synpred1())) {s = 159;}

                        else if ( (LA27_90==LTSi) ) {s = 135;}

                        else if ( (LA27_90==LCOMMENTSi) && (synpred1())) {s = 160;}

                        else if ( (LA27_90==LPISi) && (synpred1())) {s = 161;}

                        else if ( (LA27_90==DOCUMENT) && (synpred1())) {s = 162;}

                        else if ( (LA27_90==LPRAGSi) && (synpred1())) {s = 163;}

                         
                        input.seek(index27_90);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA27_209 = input.LA(1);

                         
                        int index27_209 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 384;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_209);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA27_99 = input.LA(1);

                         
                        int index27_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_99==STARSi) ) {s = 24;}

                        else if ( (LA27_99==EOF||LA27_99==AND||(LA27_99>=ASCENDING && LA27_99<=AT)||LA27_99==CASE||LA27_99==COLLATION||LA27_99==DEFAULT||LA27_99==DESCENDING||LA27_99==DIV||LA27_99==ELSE||LA27_99==EMPTY||LA27_99==EQ||(LA27_99>=EXCEPT && LA27_99<=EXTERNAL)||LA27_99==FOR||LA27_99==FTCONTAINS||LA27_99==GE||(LA27_99>=GT && LA27_99<=IDIV)||LA27_99==IN||(LA27_99>=INSTANCE && LA27_99<=IS)||LA27_99==LE||(LA27_99>=LET && LA27_99<=LEVELS)||(LA27_99>=LT && LA27_99<=MOD)||LA27_99==NE||(LA27_99>=OR && LA27_99<=ORDER)||LA27_99==PARAGRAPHS||LA27_99==RETURN||LA27_99==SATISFIES||LA27_99==SCORE||LA27_99==SENTENCES||LA27_99==STABLE||(LA27_99>=TIMES && LA27_99<=TO)||LA27_99==UNION||LA27_99==WHERE||LA27_99==WITHOUT||LA27_99==WORDS||LA27_99==SEMICOLONSi||(LA27_99>=EQSi && LA27_99<=COMMASi)||LA27_99==ASSIGNSi||(LA27_99>=RPARSi && LA27_99<=RBRACSi)||(LA27_99>=MINUSSi && LA27_99<=NODEAFTERSi)||LA27_99==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_99==PLUSSi) ) {s = 26;}

                        else if ( (LA27_99==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_99);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA27_11 = input.LA(1);

                         
                        int index27_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_11==COLONSi) ) {s = 23;}

                        else if ( (LA27_11==STARSi) ) {s = 24;}

                        else if ( (LA27_11==EOF||LA27_11==AND||(LA27_11>=ASCENDING && LA27_11<=AT)||LA27_11==CASE||LA27_11==COLLATION||LA27_11==DEFAULT||LA27_11==DESCENDING||LA27_11==DIV||LA27_11==ELSE||LA27_11==EMPTY||LA27_11==EQ||(LA27_11>=EXCEPT && LA27_11<=EXTERNAL)||LA27_11==FOR||LA27_11==FTCONTAINS||LA27_11==GE||(LA27_11>=GT && LA27_11<=IDIV)||LA27_11==IN||(LA27_11>=INSTANCE && LA27_11<=IS)||LA27_11==LE||(LA27_11>=LET && LA27_11<=LEVELS)||(LA27_11>=LT && LA27_11<=MOD)||LA27_11==NE||(LA27_11>=OR && LA27_11<=ORDER)||LA27_11==PARAGRAPHS||LA27_11==RETURN||LA27_11==SATISFIES||LA27_11==SCORE||LA27_11==SENTENCES||LA27_11==STABLE||(LA27_11>=TIMES && LA27_11<=TO)||LA27_11==UNION||LA27_11==WHERE||LA27_11==WITHOUT||LA27_11==WORDS||LA27_11==SEMICOLONSi||(LA27_11>=EQSi && LA27_11<=COMMASi)||LA27_11==ASSIGNSi||(LA27_11>=RPARSi && LA27_11<=RBRACSi)||(LA27_11>=MINUSSi && LA27_11<=NODEAFTERSi)||LA27_11==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_11==PLUSSi) ) {s = 26;}

                        else if ( (LA27_11==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_11);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA27_36 = input.LA(1);

                         
                        int index27_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_36==EOF||LA27_36==AND||(LA27_36>=ASCENDING && LA27_36<=AT)||LA27_36==CASE||LA27_36==COLLATION||LA27_36==DEFAULT||LA27_36==DESCENDING||LA27_36==DIV||LA27_36==ELSE||LA27_36==EMPTY||LA27_36==EQ||(LA27_36>=EXCEPT && LA27_36<=EXTERNAL)||LA27_36==FOR||LA27_36==FTCONTAINS||LA27_36==GE||(LA27_36>=GT && LA27_36<=IDIV)||LA27_36==IN||(LA27_36>=INSTANCE && LA27_36<=IS)||LA27_36==LE||(LA27_36>=LET && LA27_36<=LEVELS)||(LA27_36>=LT && LA27_36<=MOD)||LA27_36==NE||(LA27_36>=OR && LA27_36<=ORDER)||LA27_36==PARAGRAPHS||LA27_36==RETURN||LA27_36==SATISFIES||LA27_36==SCORE||LA27_36==SENTENCES||LA27_36==STABLE||(LA27_36>=TIMES && LA27_36<=TO)||LA27_36==UNION||LA27_36==WHERE||LA27_36==WITHOUT||LA27_36==WORDS||LA27_36==SEMICOLONSi||(LA27_36>=EQSi && LA27_36<=COMMASi)||LA27_36==ASSIGNSi||(LA27_36>=RPARSi && LA27_36<=RBRACSi)||(LA27_36>=MINUSSi && LA27_36<=NODEAFTERSi)||LA27_36==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_36==STARSi) ) {s = 24;}

                        else if ( (LA27_36==PLUSSi) ) {s = 26;}

                        else if ( (LA27_36==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_36);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA27_48 = input.LA(1);

                         
                        int index27_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA27_48>=PLUSSi && LA27_48<=MINUSSi)) && (synpred1())) {s = 164;}

                        else if ( (LA27_48==VALIDATE) && (synpred1())) {s = 165;}

                        else if ( (LA27_48==DBLSLASHSi) && (synpred1())) {s = 166;}

                        else if ( (LA27_48==SLASHSi) && (synpred1())) {s = 167;}

                        else if ( ((LA27_48>=ANCESTOR && LA27_48<=ANCESTOR_OR_SELF)||LA27_48==PARENT||(LA27_48>=PRECEDING && LA27_48<=PRECEDING_SIBLING)) && (synpred1())) {s = 168;}

                        else if ( (LA27_48==DOTDOTSi) && (synpred1())) {s = 169;}

                        else if ( (LA27_48==ATTRIBUTE) && (synpred1())) {s = 170;}

                        else if ( (LA27_48==ATSi) && (synpred1())) {s = 171;}

                        else if ( (LA27_48==DOCUMENT_NODE) && (synpred1())) {s = 172;}

                        else if ( (LA27_48==ELEMENT) && (synpred1())) {s = 173;}

                        else if ( (LA27_48==CHILD||(LA27_48>=DESCENDANT && LA27_48<=DESCENDANT_OR_SELF)||(LA27_48>=FOLLOWING && LA27_48<=FOLLOWING_SIBLING)||LA27_48==SELF) && (synpred1())) {s = 174;}

                        else if ( (LA27_48==SCHEMAELEMENT) && (synpred1())) {s = 175;}

                        else if ( (LA27_48==SCHEMAATTRIBUTE) && (synpred1())) {s = 176;}

                        else if ( (LA27_48==PROCESSING_INSTRUCTION) && (synpred1())) {s = 177;}

                        else if ( (LA27_48==COMMENT) && (synpred1())) {s = 178;}

                        else if ( (LA27_48==TEXT) && (synpred1())) {s = 179;}

                        else if ( (LA27_48==NODE) && (synpred1())) {s = 180;}

                        else if ( (LA27_48==NCName) ) {s = 181;}

                        else if ( (LA27_48==STARSi) && (synpred1())) {s = 182;}

                        else if ( ((LA27_48>=IntegerLiteral && LA27_48<=DoubleLiteral)) && (synpred1())) {s = 183;}

                        else if ( (LA27_48==StringLiteral) && (synpred1())) {s = 184;}

                        else if ( (LA27_48==DOLLARSi) && (synpred1())) {s = 185;}

                        else if ( (LA27_48==LPARSi) && (synpred1())) {s = 186;}

                        else if ( (LA27_48==DOTSi) && (synpred1())) {s = 187;}

                        else if ( (LA27_48==ORDERED) && (synpred1())) {s = 188;}

                        else if ( (LA27_48==UNORDERED) && (synpred1())) {s = 189;}

                        else if ( (LA27_48==LTSi) && (synpred1())) {s = 190;}

                        else if ( (LA27_48==LCOMMENTSi) && (synpred1())) {s = 191;}

                        else if ( (LA27_48==LPISi) && (synpred1())) {s = 192;}

                        else if ( (LA27_48==DOCUMENT) && (synpred1())) {s = 193;}

                        else if ( (LA27_48==LPRAGSi) && (synpred1())) {s = 194;}

                         
                        input.seek(index27_48);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA27_91 = input.LA(1);

                         
                        int index27_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_91==NCName) ) {s = 198;}

                        else if ( ((LA27_91>=PLUSSi && LA27_91<=MINUSSi)) && (synpred1())) {s = 164;}

                        else if ( (LA27_91==VALIDATE) && (synpred1())) {s = 165;}

                        else if ( (LA27_91==DBLSLASHSi) && (synpred1())) {s = 166;}

                        else if ( (LA27_91==SLASHSi) && (synpred1())) {s = 167;}

                        else if ( ((LA27_91>=ANCESTOR && LA27_91<=ANCESTOR_OR_SELF)||LA27_91==PARENT||(LA27_91>=PRECEDING && LA27_91<=PRECEDING_SIBLING)) && (synpred1())) {s = 168;}

                        else if ( (LA27_91==DOTDOTSi) && (synpred1())) {s = 169;}

                        else if ( (LA27_91==ATTRIBUTE) && (synpred1())) {s = 170;}

                        else if ( (LA27_91==ATSi) && (synpred1())) {s = 171;}

                        else if ( (LA27_91==DOCUMENT_NODE) && (synpred1())) {s = 172;}

                        else if ( (LA27_91==ELEMENT) && (synpred1())) {s = 173;}

                        else if ( (LA27_91==CHILD||(LA27_91>=DESCENDANT && LA27_91<=DESCENDANT_OR_SELF)||(LA27_91>=FOLLOWING && LA27_91<=FOLLOWING_SIBLING)||LA27_91==SELF) && (synpred1())) {s = 174;}

                        else if ( (LA27_91==SCHEMAELEMENT) && (synpred1())) {s = 175;}

                        else if ( (LA27_91==SCHEMAATTRIBUTE) && (synpred1())) {s = 176;}

                        else if ( (LA27_91==PROCESSING_INSTRUCTION) && (synpred1())) {s = 177;}

                        else if ( (LA27_91==COMMENT) && (synpred1())) {s = 178;}

                        else if ( (LA27_91==TEXT) && (synpred1())) {s = 179;}

                        else if ( (LA27_91==NODE) && (synpred1())) {s = 180;}

                        else if ( (LA27_91==STARSi) && (synpred1())) {s = 182;}

                        else if ( ((LA27_91>=IntegerLiteral && LA27_91<=DoubleLiteral)) && (synpred1())) {s = 183;}

                        else if ( (LA27_91==StringLiteral) && (synpred1())) {s = 184;}

                        else if ( (LA27_91==DOLLARSi) && (synpred1())) {s = 185;}

                        else if ( (LA27_91==LPARSi) && (synpred1())) {s = 186;}

                        else if ( (LA27_91==DOTSi) && (synpred1())) {s = 187;}

                        else if ( (LA27_91==ORDERED) && (synpred1())) {s = 188;}

                        else if ( (LA27_91==UNORDERED) && (synpred1())) {s = 189;}

                        else if ( (LA27_91==LTSi) && (synpred1())) {s = 190;}

                        else if ( (LA27_91==LCOMMENTSi) && (synpred1())) {s = 191;}

                        else if ( (LA27_91==LPISi) && (synpred1())) {s = 192;}

                        else if ( (LA27_91==DOCUMENT) && (synpred1())) {s = 193;}

                        else if ( (LA27_91==LPRAGSi) && (synpred1())) {s = 194;}

                         
                        input.seek(index27_91);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA27_136 = input.LA(1);

                         
                        int index27_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_136==COLONSi) && (synpred1())) {s = 329;}

                        else if ( ((LA27_136>=PLUSSi && LA27_136<=MINUSSi)) ) {s = 46;}

                        else if ( ((LA27_136>=ANCESTOR && LA27_136<=ANCESTOR_OR_SELF)||LA27_136==ATTRIBUTE||LA27_136==CHILD||LA27_136==COMMENT||(LA27_136>=DESCENDANT && LA27_136<=DESCENDANT_OR_SELF)||(LA27_136>=DOCUMENT && LA27_136<=ELEMENT)||(LA27_136>=FOLLOWING && LA27_136<=FOLLOWING_SIBLING)||LA27_136==NODE||LA27_136==ORDERED||LA27_136==PARENT||(LA27_136>=PRECEDING && LA27_136<=PRECEDING_SIBLING)||LA27_136==PROCESSING_INSTRUCTION||(LA27_136>=SCHEMAATTRIBUTE && LA27_136<=SCHEMAELEMENT)||LA27_136==SELF||LA27_136==TEXT||LA27_136==UNORDERED||LA27_136==VALIDATE||LA27_136==StringLiteral||LA27_136==NCName||LA27_136==DOLLARSi||LA27_136==LPARSi||(LA27_136>=IntegerLiteral && LA27_136<=LPRAGSi)||(LA27_136>=DOTDOTSi && LA27_136<=ATSi)||LA27_136==DOTSi||LA27_136==LCOMMENTSi||LA27_136==LPISi) ) {s = 25;}

                        else if ( (LA27_136==DBLSLASHSi) ) {s = 330;}

                        else if ( (LA27_136==SLASHSi) ) {s = 331;}

                        else if ( (LA27_136==STARSi) ) {s = 47;}

                        else if ( (LA27_136==LTSi) ) {s = 48;}

                        else if ( (LA27_136==LBRACKSi) && (synpred1())) {s = 332;}

                        else if ( (LA27_136==CAST) && (synpred1())) {s = 333;}

                        else if ( (LA27_136==CASTABLE) && (synpred1())) {s = 334;}

                        else if ( (LA27_136==TREAT) && (synpred1())) {s = 335;}

                        else if ( (LA27_136==INSTANCE) && (synpred1())) {s = 336;}

                        else if ( (LA27_136==EXCEPT||LA27_136==INTERSECT) && (synpred1())) {s = 337;}

                        else if ( (LA27_136==UNION||LA27_136==PIPESi) && (synpred1())) {s = 338;}

                        else if ( (LA27_136==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_136==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_136==EQ||LA27_136==GE||LA27_136==GT||LA27_136==LE||LA27_136==LT||LA27_136==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_136==EQSi||LA27_136==NEQSi||(LA27_136>=LTOREQSi && LA27_136<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_136==IS||(LA27_136>=NODEBEFORESi && LA27_136<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_136==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_136==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_136==COMMASi) && (synpred1())) {s = 339;}

                        else if ( (LA27_136==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_136==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_136==RPARSi) && (synpred1())) {s = 340;}

                        else if ( (LA27_136==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_136==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_136==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_136==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_136==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_136==RETURN) && (synpred1())) {s = 341;}

                        else if ( (LA27_136==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_136==LET) && (synpred1())) {s = 76;}

                        else if ( (LA27_136==ASCENDING||LA27_136==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_136==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_136==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_136==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_136==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_136==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_136==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_136==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_136==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_136==PARAGRAPHS||LA27_136==SENTENCES||LA27_136==WORDS) && (synpred1())) {s = 86;}

                        else if ( (LA27_136==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_136==DIV||LA27_136==IDIV||LA27_136==MOD) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_136);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA27_89 = input.LA(1);

                         
                        int index27_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_89);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA27_197 = input.LA(1);

                         
                        int index27_197 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_197==COLONSi) && (synpred1())) {s = 329;}

                        else if ( ((LA27_197>=PLUSSi && LA27_197<=MINUSSi)) ) {s = 437;}

                        else if ( ((LA27_197>=ANCESTOR && LA27_197<=ANCESTOR_OR_SELF)||LA27_197==ATTRIBUTE||LA27_197==CHILD||LA27_197==COMMENT||(LA27_197>=DESCENDANT && LA27_197<=DESCENDANT_OR_SELF)||(LA27_197>=DOCUMENT && LA27_197<=ELEMENT)||(LA27_197>=FOLLOWING && LA27_197<=FOLLOWING_SIBLING)||LA27_197==NODE||LA27_197==ORDERED||LA27_197==PARENT||(LA27_197>=PRECEDING && LA27_197<=PRECEDING_SIBLING)||LA27_197==PROCESSING_INSTRUCTION||(LA27_197>=SCHEMAATTRIBUTE && LA27_197<=SCHEMAELEMENT)||LA27_197==SELF||LA27_197==TEXT||LA27_197==UNORDERED||LA27_197==VALIDATE||LA27_197==StringLiteral||LA27_197==NCName||LA27_197==DOLLARSi||LA27_197==LPARSi||(LA27_197>=IntegerLiteral && LA27_197<=LPRAGSi)||(LA27_197>=DOTDOTSi && LA27_197<=ATSi)||LA27_197==DOTSi||LA27_197==LCOMMENTSi||LA27_197==LPISi) ) {s = 25;}

                        else if ( (LA27_197==DBLSLASHSi) ) {s = 438;}

                        else if ( (LA27_197==SLASHSi) ) {s = 439;}

                        else if ( (LA27_197==STARSi) ) {s = 440;}

                        else if ( (LA27_197==LTSi) ) {s = 441;}

                        else if ( (LA27_197==LBRACKSi) && (synpred1())) {s = 332;}

                        else if ( (LA27_197==CAST) && (synpred1())) {s = 333;}

                        else if ( (LA27_197==CASTABLE) && (synpred1())) {s = 334;}

                        else if ( (LA27_197==TREAT) && (synpred1())) {s = 335;}

                        else if ( (LA27_197==INSTANCE) && (synpred1())) {s = 336;}

                        else if ( (LA27_197==EXCEPT||LA27_197==INTERSECT) && (synpred1())) {s = 337;}

                        else if ( (LA27_197==UNION||LA27_197==PIPESi) && (synpred1())) {s = 338;}

                        else if ( (LA27_197==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_197==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_197==EQ||LA27_197==GE||LA27_197==GT||LA27_197==LE||LA27_197==LT||LA27_197==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_197==EQSi||LA27_197==NEQSi||(LA27_197>=LTOREQSi && LA27_197<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_197==IS||(LA27_197>=NODEBEFORESi && LA27_197<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_197==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_197==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_197==COMMASi) && (synpred1())) {s = 339;}

                        else if ( (LA27_197==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_197==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_197==RPARSi) && (synpred1())) {s = 340;}

                        else if ( (LA27_197==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_197==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_197==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_197==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_197==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_197==RETURN) && (synpred1())) {s = 341;}

                        else if ( (LA27_197==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_197==LET) && (synpred1())) {s = 76;}

                        else if ( (LA27_197==ASCENDING||LA27_197==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_197==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_197==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_197==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_197==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_197==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_197==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_197==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_197==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_197==PARAGRAPHS||LA27_197==SENTENCES||LA27_197==WORDS) && (synpred1())) {s = 86;}

                        else if ( (LA27_197==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_197==DIV||LA27_197==IDIV||LA27_197==MOD) && (synpred1())) {s = 60;}

                         
                        input.seek(index27_197);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA27_40 = input.LA(1);

                         
                        int index27_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_40==EOF||LA27_40==AND||(LA27_40>=ASCENDING && LA27_40<=AT)||LA27_40==CASE||LA27_40==COLLATION||LA27_40==DEFAULT||LA27_40==DESCENDING||LA27_40==DIV||LA27_40==ELSE||LA27_40==EMPTY||LA27_40==EQ||(LA27_40>=EXCEPT && LA27_40<=EXTERNAL)||LA27_40==FOR||LA27_40==FTCONTAINS||LA27_40==GE||(LA27_40>=GT && LA27_40<=IDIV)||LA27_40==IN||(LA27_40>=INSTANCE && LA27_40<=IS)||LA27_40==LE||(LA27_40>=LET && LA27_40<=LEVELS)||(LA27_40>=LT && LA27_40<=MOD)||LA27_40==NE||(LA27_40>=OR && LA27_40<=ORDER)||LA27_40==PARAGRAPHS||LA27_40==RETURN||LA27_40==SATISFIES||LA27_40==SCORE||LA27_40==SENTENCES||LA27_40==STABLE||(LA27_40>=TIMES && LA27_40<=TO)||LA27_40==UNION||LA27_40==WHERE||LA27_40==WITHOUT||LA27_40==WORDS||LA27_40==SEMICOLONSi||(LA27_40>=EQSi && LA27_40<=COMMASi)||LA27_40==ASSIGNSi||(LA27_40>=RPARSi && LA27_40<=RBRACSi)||(LA27_40>=MINUSSi && LA27_40<=NODEAFTERSi)||LA27_40==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_40==STARSi) ) {s = 24;}

                        else if ( (LA27_40==PLUSSi) ) {s = 26;}

                        else if ( (LA27_40==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_40);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA27_44 = input.LA(1);

                         
                        int index27_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_44==STARSi) ) {s = 24;}

                        else if ( (LA27_44==EOF||LA27_44==AND||(LA27_44>=ASCENDING && LA27_44<=AT)||LA27_44==CASE||LA27_44==COLLATION||LA27_44==DEFAULT||LA27_44==DESCENDING||LA27_44==DIV||LA27_44==ELSE||LA27_44==EMPTY||LA27_44==EQ||(LA27_44>=EXCEPT && LA27_44<=EXTERNAL)||LA27_44==FOR||LA27_44==FTCONTAINS||LA27_44==GE||(LA27_44>=GT && LA27_44<=IDIV)||LA27_44==IN||(LA27_44>=INSTANCE && LA27_44<=IS)||LA27_44==LE||(LA27_44>=LET && LA27_44<=LEVELS)||(LA27_44>=LT && LA27_44<=MOD)||LA27_44==NE||(LA27_44>=OR && LA27_44<=ORDER)||LA27_44==PARAGRAPHS||LA27_44==RETURN||LA27_44==SATISFIES||LA27_44==SCORE||LA27_44==SENTENCES||LA27_44==STABLE||(LA27_44>=TIMES && LA27_44<=TO)||LA27_44==UNION||LA27_44==WHERE||LA27_44==WITHOUT||LA27_44==WORDS||LA27_44==SEMICOLONSi||(LA27_44>=EQSi && LA27_44<=COMMASi)||LA27_44==ASSIGNSi||(LA27_44>=RPARSi && LA27_44<=RBRACSi)||(LA27_44>=MINUSSi && LA27_44<=NODEAFTERSi)||LA27_44==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_44==PLUSSi) ) {s = 26;}

                        else if ( (LA27_44==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_44);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA27_101 = input.LA(1);

                         
                        int index27_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_101==STARSi) ) {s = 24;}

                        else if ( (LA27_101==EOF||LA27_101==AND||(LA27_101>=ASCENDING && LA27_101<=AT)||LA27_101==CASE||LA27_101==COLLATION||LA27_101==DEFAULT||LA27_101==DESCENDING||LA27_101==DIV||LA27_101==ELSE||LA27_101==EMPTY||LA27_101==EQ||(LA27_101>=EXCEPT && LA27_101<=EXTERNAL)||LA27_101==FOR||LA27_101==FTCONTAINS||LA27_101==GE||(LA27_101>=GT && LA27_101<=IDIV)||LA27_101==IN||(LA27_101>=INSTANCE && LA27_101<=IS)||LA27_101==LE||(LA27_101>=LET && LA27_101<=LEVELS)||(LA27_101>=LT && LA27_101<=MOD)||LA27_101==NE||(LA27_101>=OR && LA27_101<=ORDER)||LA27_101==PARAGRAPHS||LA27_101==RETURN||LA27_101==SATISFIES||LA27_101==SCORE||LA27_101==SENTENCES||LA27_101==STABLE||(LA27_101>=TIMES && LA27_101<=TO)||LA27_101==UNION||LA27_101==WHERE||LA27_101==WITHOUT||LA27_101==WORDS||LA27_101==SEMICOLONSi||(LA27_101>=EQSi && LA27_101<=COMMASi)||LA27_101==ASSIGNSi||(LA27_101>=RPARSi && LA27_101<=RBRACSi)||(LA27_101>=MINUSSi && LA27_101<=NODEAFTERSi)||LA27_101==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_101==PLUSSi) ) {s = 26;}

                        else if ( (LA27_101==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_101);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA27_26 = input.LA(1);

                         
                        int index27_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA27_26>=PLUSSi && LA27_26<=MINUSSi)) ) {s = 89;}

                        else if ( ((LA27_26>=ANCESTOR && LA27_26<=ANCESTOR_OR_SELF)||LA27_26==ATTRIBUTE||LA27_26==CHILD||LA27_26==COMMENT||(LA27_26>=DESCENDANT && LA27_26<=DESCENDANT_OR_SELF)||(LA27_26>=DOCUMENT && LA27_26<=ELEMENT)||(LA27_26>=FOLLOWING && LA27_26<=FOLLOWING_SIBLING)||LA27_26==NODE||LA27_26==ORDERED||LA27_26==PARENT||(LA27_26>=PRECEDING && LA27_26<=PRECEDING_SIBLING)||LA27_26==PROCESSING_INSTRUCTION||(LA27_26>=SCHEMAATTRIBUTE && LA27_26<=SCHEMAELEMENT)||LA27_26==SELF||LA27_26==TEXT||LA27_26==UNORDERED||LA27_26==VALIDATE||LA27_26==StringLiteral||LA27_26==NCName||LA27_26==DOLLARSi||LA27_26==LPARSi||(LA27_26>=IntegerLiteral && LA27_26<=LPRAGSi)||(LA27_26>=DBLSLASHSi && LA27_26<=SLASHSi)||(LA27_26>=DOTDOTSi && LA27_26<=ATSi)||LA27_26==DOTSi||LA27_26==LCOMMENTSi||LA27_26==LPISi) ) {s = 25;}

                        else if ( (LA27_26==STARSi) ) {s = 90;}

                        else if ( (LA27_26==LTSi) ) {s = 91;}

                        else if ( (LA27_26==ASSIGNSi) && (synpred1())) {s = 49;}

                        else if ( (LA27_26==EXTERNAL) && (synpred1())) {s = 50;}

                        else if ( (LA27_26==COMMASi) && (synpred1())) {s = 51;}

                        else if ( (LA27_26==RPARSi) && (synpred1())) {s = 52;}

                        else if ( (LA27_26==AT) && (synpred1())) {s = 53;}

                        else if ( (LA27_26==SCORE) && (synpred1())) {s = 54;}

                        else if ( (LA27_26==IN) && (synpred1())) {s = 55;}

                        else if ( (LA27_26==LBRACESi) && (synpred1())) {s = 56;}

                        else if ( (LA27_26==RETURN) && (synpred1())) {s = 57;}

                        else if ( (LA27_26==EXCEPT||LA27_26==INTERSECT) && (synpred1())) {s = 58;}

                        else if ( (LA27_26==UNION||LA27_26==PIPESi) && (synpred1())) {s = 59;}

                        else if ( (LA27_26==DIV||LA27_26==IDIV||LA27_26==MOD) && (synpred1())) {s = 60;}

                        else if ( (LA27_26==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_26==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_26==EQ||LA27_26==GE||LA27_26==GT||LA27_26==LE||LA27_26==LT||LA27_26==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_26==EQSi||LA27_26==NEQSi||(LA27_26>=LTOREQSi && LA27_26<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_26==IS||(LA27_26>=NODEBEFORESi && LA27_26<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_26==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_26==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_26==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_26==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_26==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_26==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_26==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_26==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_26==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_26==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_26==LET) && (synpred1())) {s = 76;}

                        else if ( (LA27_26==ASCENDING||LA27_26==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_26==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_26==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_26==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_26==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_26==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_26==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_26==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_26==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_26==PARAGRAPHS||LA27_26==SENTENCES||LA27_26==WORDS) && (synpred1())) {s = 86;}

                        else if ( (LA27_26==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_26==INSTANCE) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA27_181 = input.LA(1);

                         
                        int index27_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_181==COLONSi) ) {s = 369;}

                        else if ( (LA27_181==LPARSi) && (synpred1())) {s = 370;}

                        else if ( (LA27_181==NCName||LA27_181==GTSi||LA27_181==RSELFTERMSi) ) {s = 25;}

                        else if ( (LA27_181==LBRACKSi) && (synpred1())) {s = 371;}

                        else if ( ((LA27_181>=DBLSLASHSi && LA27_181<=SLASHSi)) && (synpred1())) {s = 372;}

                        else if ( (LA27_181==CAST) && (synpred1())) {s = 373;}

                        else if ( (LA27_181==CASTABLE) && (synpred1())) {s = 374;}

                        else if ( (LA27_181==TREAT) && (synpred1())) {s = 375;}

                        else if ( (LA27_181==INSTANCE) && (synpred1())) {s = 376;}

                        else if ( (LA27_181==EXCEPT||LA27_181==INTERSECT) && (synpred1())) {s = 377;}

                        else if ( (LA27_181==UNION||LA27_181==PIPESi) && (synpred1())) {s = 378;}

                        else if ( (LA27_181==DIV||LA27_181==IDIV||LA27_181==MOD||LA27_181==STARSi) && (synpred1())) {s = 379;}

                        else if ( ((LA27_181>=PLUSSi && LA27_181<=MINUSSi)) && (synpred1())) {s = 380;}

                        else if ( (LA27_181==TO) && (synpred1())) {s = 381;}

                        else if ( (LA27_181==FTCONTAINS) && (synpred1())) {s = 382;}

                        else if ( (LA27_181==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_181==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_181==COMMASi) && (synpred1())) {s = 339;}

                        else if ( (LA27_181==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_181==RBRACSi) && (synpred1())) {s = 383;}

                        else if ( (LA27_181==RPARSi) && (synpred1())) {s = 384;}

                        else if ( (LA27_181==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_181==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_181==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_181==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_181==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_181==RETURN) && (synpred1())) {s = 341;}

                        else if ( (LA27_181==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_181==LET) && (synpred1())) {s = 76;}

                        else if ( (LA27_181==ASCENDING||LA27_181==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_181==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_181==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_181==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_181==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_181==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_181==ELSE) && (synpred1())) {s = 83;}

                         
                        input.seek(index27_181);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA27_198 = input.LA(1);

                         
                        int index27_198 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_198==COLONSi) ) {s = 442;}

                        else if ( (LA27_198==LPARSi) && (synpred1())) {s = 370;}

                        else if ( (LA27_198==LBRACKSi) && (synpred1())) {s = 371;}

                        else if ( ((LA27_198>=DBLSLASHSi && LA27_198<=SLASHSi)) && (synpred1())) {s = 372;}

                        else if ( (LA27_198==CAST) && (synpred1())) {s = 373;}

                        else if ( (LA27_198==CASTABLE) && (synpred1())) {s = 374;}

                        else if ( (LA27_198==TREAT) && (synpred1())) {s = 375;}

                        else if ( (LA27_198==INSTANCE) && (synpred1())) {s = 376;}

                        else if ( (LA27_198==EXCEPT||LA27_198==INTERSECT) && (synpred1())) {s = 377;}

                        else if ( (LA27_198==UNION||LA27_198==PIPESi) && (synpred1())) {s = 378;}

                        else if ( (LA27_198==DIV||LA27_198==IDIV||LA27_198==MOD||LA27_198==STARSi) && (synpred1())) {s = 379;}

                        else if ( ((LA27_198>=PLUSSi && LA27_198<=MINUSSi)) && (synpred1())) {s = 380;}

                        else if ( (LA27_198==TO) && (synpred1())) {s = 381;}

                        else if ( (LA27_198==FTCONTAINS) && (synpred1())) {s = 382;}

                        else if ( (LA27_198==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_198==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_198==COMMASi) && (synpred1())) {s = 339;}

                        else if ( (LA27_198==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_198==RBRACSi) && (synpred1())) {s = 383;}

                        else if ( (LA27_198==RPARSi) && (synpred1())) {s = 384;}

                        else if ( (LA27_198==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_198==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_198==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_198==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_198==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_198==RETURN) && (synpred1())) {s = 341;}

                        else if ( (LA27_198==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_198==LET) && (synpred1())) {s = 76;}

                        else if ( (LA27_198==ASCENDING||LA27_198==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_198==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_198==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_198==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_198==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_198==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_198==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_198==NCName||LA27_198==GTSi||LA27_198==RSELFTERMSi) ) {s = 25;}

                         
                        input.seek(index27_198);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA27_105 = input.LA(1);

                         
                        int index27_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1()) ) {s = 194;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index27_105);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA27_138 = input.LA(1);

                         
                        int index27_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_138==CAST) && (synpred1())) {s = 333;}

                        else if ( (LA27_138==CASTABLE) && (synpred1())) {s = 334;}

                        else if ( (LA27_138==TREAT) && (synpred1())) {s = 335;}

                        else if ( (LA27_138==INSTANCE) && (synpred1())) {s = 336;}

                        else if ( (LA27_138==EXCEPT||LA27_138==INTERSECT) && (synpred1())) {s = 337;}

                        else if ( (LA27_138==UNION||LA27_138==PIPESi) && (synpred1())) {s = 338;}

                        else if ( ((LA27_138>=PLUSSi && LA27_138<=MINUSSi)) && (synpred1())) {s = 342;}

                        else if ( (LA27_138==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_138==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_138==EQ||LA27_138==GE||LA27_138==GT||LA27_138==LE||LA27_138==LT||LA27_138==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_138==LTSi) ) {s = 343;}

                        else if ( (LA27_138==IS||(LA27_138>=NODEBEFORESi && LA27_138<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_138==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_138==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_138==COMMASi) && (synpred1())) {s = 339;}

                        else if ( (LA27_138==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_138==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_138==RPARSi) && (synpred1())) {s = 340;}

                        else if ( (LA27_138==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_138==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_138==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_138==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_138==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_138==RETURN) && (synpred1())) {s = 341;}

                        else if ( (LA27_138==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_138==LET) && (synpred1())) {s = 76;}

                        else if ( (LA27_138==ASCENDING||LA27_138==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_138==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_138==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_138==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_138==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_138==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_138==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_138==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_138==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_138==PARAGRAPHS||LA27_138==SENTENCES||LA27_138==WORDS) && (synpred1())) {s = 86;}

                        else if ( (LA27_138==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_138==STARSi) ) {s = 344;}

                        else if ( ((LA27_138>=ANCESTOR && LA27_138<=ANCESTOR_OR_SELF)||LA27_138==PARENT||(LA27_138>=PRECEDING && LA27_138<=PRECEDING_SIBLING)) ) {s = 345;}

                        else if ( (LA27_138==DOTDOTSi) ) {s = 346;}

                        else if ( (LA27_138==ATTRIBUTE) ) {s = 347;}

                        else if ( (LA27_138==ATSi) ) {s = 348;}

                        else if ( (LA27_138==DOCUMENT_NODE) ) {s = 349;}

                        else if ( (LA27_138==ELEMENT) ) {s = 350;}

                        else if ( (LA27_138==CHILD||(LA27_138>=DESCENDANT && LA27_138<=DESCENDANT_OR_SELF)||(LA27_138>=FOLLOWING && LA27_138<=FOLLOWING_SIBLING)||LA27_138==SELF) ) {s = 351;}

                        else if ( (LA27_138==SCHEMAELEMENT) ) {s = 352;}

                        else if ( (LA27_138==SCHEMAATTRIBUTE) ) {s = 353;}

                        else if ( (LA27_138==PROCESSING_INSTRUCTION) ) {s = 354;}

                        else if ( (LA27_138==COMMENT) ) {s = 355;}

                        else if ( (LA27_138==TEXT) ) {s = 356;}

                        else if ( (LA27_138==NODE) ) {s = 357;}

                        else if ( (LA27_138==NCName) ) {s = 358;}

                        else if ( (LA27_138==DIV||LA27_138==IDIV||LA27_138==MOD) && (synpred1())) {s = 60;}

                        else if ( ((LA27_138>=IntegerLiteral && LA27_138<=DoubleLiteral)) ) {s = 359;}

                        else if ( (LA27_138==StringLiteral) ) {s = 360;}

                        else if ( (LA27_138==DOLLARSi) ) {s = 361;}

                        else if ( (LA27_138==LPARSi) ) {s = 362;}

                        else if ( (LA27_138==DOTSi) ) {s = 363;}

                        else if ( (LA27_138==ORDERED) ) {s = 364;}

                        else if ( (LA27_138==UNORDERED) ) {s = 365;}

                        else if ( (LA27_138==EQSi||LA27_138==NEQSi||(LA27_138>=LTOREQSi && LA27_138<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_138==LCOMMENTSi) ) {s = 366;}

                        else if ( (LA27_138==LPISi) ) {s = 367;}

                        else if ( (LA27_138==DOCUMENT) ) {s = 368;}

                         
                        input.seek(index27_138);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA27_196 = input.LA(1);

                         
                        int index27_196 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_196==CAST) && (synpred1())) {s = 333;}

                        else if ( (LA27_196==CASTABLE) && (synpred1())) {s = 334;}

                        else if ( (LA27_196==TREAT) && (synpred1())) {s = 335;}

                        else if ( (LA27_196==INSTANCE) && (synpred1())) {s = 336;}

                        else if ( (LA27_196==EXCEPT||LA27_196==INTERSECT) && (synpred1())) {s = 337;}

                        else if ( (LA27_196==UNION||LA27_196==PIPESi) && (synpred1())) {s = 338;}

                        else if ( ((LA27_196>=PLUSSi && LA27_196<=MINUSSi)) && (synpred1())) {s = 342;}

                        else if ( (LA27_196==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_196==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_196==EQ||LA27_196==GE||LA27_196==GT||LA27_196==LE||LA27_196==LT||LA27_196==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_196==LTSi) ) {s = 411;}

                        else if ( (LA27_196==IS||(LA27_196>=NODEBEFORESi && LA27_196<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_196==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_196==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_196==COMMASi) && (synpred1())) {s = 339;}

                        else if ( (LA27_196==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_196==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_196==RPARSi) && (synpred1())) {s = 340;}

                        else if ( (LA27_196==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_196==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_196==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_196==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_196==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_196==RETURN) && (synpred1())) {s = 341;}

                        else if ( (LA27_196==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_196==LET) && (synpred1())) {s = 76;}

                        else if ( (LA27_196==ASCENDING||LA27_196==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_196==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_196==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_196==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_196==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_196==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_196==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_196==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_196==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_196==PARAGRAPHS||LA27_196==SENTENCES||LA27_196==WORDS) && (synpred1())) {s = 86;}

                        else if ( (LA27_196==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_196==STARSi) ) {s = 412;}

                        else if ( ((LA27_196>=ANCESTOR && LA27_196<=ANCESTOR_OR_SELF)||LA27_196==PARENT||(LA27_196>=PRECEDING && LA27_196<=PRECEDING_SIBLING)) ) {s = 413;}

                        else if ( (LA27_196==DOTDOTSi) ) {s = 414;}

                        else if ( (LA27_196==ATTRIBUTE) ) {s = 415;}

                        else if ( (LA27_196==ATSi) ) {s = 416;}

                        else if ( (LA27_196==DOCUMENT_NODE) ) {s = 417;}

                        else if ( (LA27_196==ELEMENT) ) {s = 418;}

                        else if ( (LA27_196==CHILD||(LA27_196>=DESCENDANT && LA27_196<=DESCENDANT_OR_SELF)||(LA27_196>=FOLLOWING && LA27_196<=FOLLOWING_SIBLING)||LA27_196==SELF) ) {s = 419;}

                        else if ( (LA27_196==SCHEMAELEMENT) ) {s = 420;}

                        else if ( (LA27_196==SCHEMAATTRIBUTE) ) {s = 421;}

                        else if ( (LA27_196==PROCESSING_INSTRUCTION) ) {s = 422;}

                        else if ( (LA27_196==COMMENT) ) {s = 423;}

                        else if ( (LA27_196==TEXT) ) {s = 424;}

                        else if ( (LA27_196==NODE) ) {s = 425;}

                        else if ( (LA27_196==NCName) ) {s = 426;}

                        else if ( (LA27_196==DIV||LA27_196==IDIV||LA27_196==MOD) && (synpred1())) {s = 60;}

                        else if ( ((LA27_196>=IntegerLiteral && LA27_196<=DoubleLiteral)) ) {s = 427;}

                        else if ( (LA27_196==StringLiteral) ) {s = 428;}

                        else if ( (LA27_196==DOLLARSi) ) {s = 429;}

                        else if ( (LA27_196==LPARSi) ) {s = 430;}

                        else if ( (LA27_196==DOTSi) ) {s = 431;}

                        else if ( (LA27_196==ORDERED) ) {s = 432;}

                        else if ( (LA27_196==UNORDERED) ) {s = 433;}

                        else if ( (LA27_196==EQSi||LA27_196==NEQSi||(LA27_196>=LTOREQSi && LA27_196<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_196==LCOMMENTSi) ) {s = 434;}

                        else if ( (LA27_196==LPISi) ) {s = 435;}

                        else if ( (LA27_196==DOCUMENT) ) {s = 436;}

                         
                        input.seek(index27_196);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA27_45 = input.LA(1);

                         
                        int index27_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_45==EOF||LA27_45==AND||(LA27_45>=ASCENDING && LA27_45<=AT)||LA27_45==CASE||LA27_45==COLLATION||LA27_45==DEFAULT||LA27_45==DESCENDING||LA27_45==DIV||LA27_45==ELSE||LA27_45==EMPTY||LA27_45==EQ||(LA27_45>=EXCEPT && LA27_45<=EXTERNAL)||LA27_45==FOR||LA27_45==FTCONTAINS||LA27_45==GE||(LA27_45>=GT && LA27_45<=IDIV)||LA27_45==IN||(LA27_45>=INSTANCE && LA27_45<=IS)||LA27_45==LE||(LA27_45>=LET && LA27_45<=LEVELS)||(LA27_45>=LT && LA27_45<=MOD)||LA27_45==NE||(LA27_45>=OR && LA27_45<=ORDER)||LA27_45==PARAGRAPHS||LA27_45==RETURN||LA27_45==SATISFIES||LA27_45==SCORE||LA27_45==SENTENCES||LA27_45==STABLE||(LA27_45>=TIMES && LA27_45<=TO)||LA27_45==UNION||LA27_45==WHERE||LA27_45==WITHOUT||LA27_45==WORDS||LA27_45==SEMICOLONSi||(LA27_45>=EQSi && LA27_45<=COMMASi)||LA27_45==ASSIGNSi||(LA27_45>=RPARSi && LA27_45<=RBRACSi)||(LA27_45>=MINUSSi && LA27_45<=NODEAFTERSi)||LA27_45==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_45==STARSi) ) {s = 24;}

                        else if ( (LA27_45==PLUSSi) ) {s = 26;}

                        else if ( (LA27_45==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_45);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA27_30 = input.LA(1);

                         
                        int index27_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_30==EOF||LA27_30==AND||(LA27_30>=ASCENDING && LA27_30<=AT)||LA27_30==CASE||LA27_30==COLLATION||LA27_30==DEFAULT||LA27_30==DESCENDING||LA27_30==DIV||LA27_30==ELSE||LA27_30==EMPTY||LA27_30==EQ||(LA27_30>=EXCEPT && LA27_30<=EXTERNAL)||LA27_30==FOR||LA27_30==FTCONTAINS||LA27_30==GE||(LA27_30>=GT && LA27_30<=IDIV)||LA27_30==IN||(LA27_30>=INSTANCE && LA27_30<=IS)||LA27_30==LE||(LA27_30>=LET && LA27_30<=LEVELS)||(LA27_30>=LT && LA27_30<=MOD)||LA27_30==NE||(LA27_30>=OR && LA27_30<=ORDER)||LA27_30==PARAGRAPHS||LA27_30==RETURN||LA27_30==SATISFIES||LA27_30==SCORE||LA27_30==SENTENCES||LA27_30==STABLE||(LA27_30>=TIMES && LA27_30<=TO)||LA27_30==UNION||LA27_30==WHERE||LA27_30==WITHOUT||LA27_30==WORDS||LA27_30==SEMICOLONSi||(LA27_30>=EQSi && LA27_30<=COMMASi)||LA27_30==ASSIGNSi||(LA27_30>=RPARSi && LA27_30<=RBRACSi)||(LA27_30>=MINUSSi && LA27_30<=NODEAFTERSi)||LA27_30==RBRACKSi) ) {s = 25;}

                        else if ( (LA27_30==STARSi) ) {s = 24;}

                        else if ( (LA27_30==PLUSSi) ) {s = 26;}

                        else if ( (LA27_30==QUESTIONSi) && (synpred1())) {s = 27;}

                         
                        input.seek(index27_30);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA27_24 = input.LA(1);

                         
                        int index27_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA27_24>=PLUSSi && LA27_24<=MINUSSi)) ) {s = 46;}

                        else if ( ((LA27_24>=ANCESTOR && LA27_24<=ANCESTOR_OR_SELF)||LA27_24==ATTRIBUTE||LA27_24==CHILD||LA27_24==COMMENT||(LA27_24>=DESCENDANT && LA27_24<=DESCENDANT_OR_SELF)||(LA27_24>=DOCUMENT && LA27_24<=ELEMENT)||(LA27_24>=FOLLOWING && LA27_24<=FOLLOWING_SIBLING)||LA27_24==NODE||LA27_24==ORDERED||LA27_24==PARENT||(LA27_24>=PRECEDING && LA27_24<=PRECEDING_SIBLING)||LA27_24==PROCESSING_INSTRUCTION||(LA27_24>=SCHEMAATTRIBUTE && LA27_24<=SCHEMAELEMENT)||LA27_24==SELF||LA27_24==TEXT||LA27_24==UNORDERED||LA27_24==VALIDATE||LA27_24==StringLiteral||LA27_24==NCName||LA27_24==DOLLARSi||LA27_24==LPARSi||(LA27_24>=IntegerLiteral && LA27_24<=LPRAGSi)||(LA27_24>=DBLSLASHSi && LA27_24<=SLASHSi)||(LA27_24>=DOTDOTSi && LA27_24<=ATSi)||LA27_24==DOTSi||LA27_24==LCOMMENTSi||LA27_24==LPISi) ) {s = 25;}

                        else if ( (LA27_24==STARSi) ) {s = 47;}

                        else if ( (LA27_24==LTSi) ) {s = 48;}

                        else if ( (LA27_24==ASSIGNSi) && (synpred1())) {s = 49;}

                        else if ( (LA27_24==EXTERNAL) && (synpred1())) {s = 50;}

                        else if ( (LA27_24==COMMASi) && (synpred1())) {s = 51;}

                        else if ( (LA27_24==RPARSi) && (synpred1())) {s = 52;}

                        else if ( (LA27_24==AT) && (synpred1())) {s = 53;}

                        else if ( (LA27_24==SCORE) && (synpred1())) {s = 54;}

                        else if ( (LA27_24==IN) && (synpred1())) {s = 55;}

                        else if ( (LA27_24==LBRACESi) && (synpred1())) {s = 56;}

                        else if ( (LA27_24==RETURN) && (synpred1())) {s = 57;}

                        else if ( (LA27_24==EXCEPT||LA27_24==INTERSECT) && (synpred1())) {s = 58;}

                        else if ( (LA27_24==UNION||LA27_24==PIPESi) && (synpred1())) {s = 59;}

                        else if ( (LA27_24==DIV||LA27_24==IDIV||LA27_24==MOD) && (synpred1())) {s = 60;}

                        else if ( (LA27_24==TO) && (synpred1())) {s = 61;}

                        else if ( (LA27_24==FTCONTAINS) && (synpred1())) {s = 62;}

                        else if ( (LA27_24==EQ||LA27_24==GE||LA27_24==GT||LA27_24==LE||LA27_24==LT||LA27_24==NE) && (synpred1())) {s = 63;}

                        else if ( (LA27_24==EQSi||LA27_24==NEQSi||(LA27_24>=LTOREQSi && LA27_24<=GTOREQSi)) && (synpred1())) {s = 64;}

                        else if ( (LA27_24==IS||(LA27_24>=NODEBEFORESi && LA27_24<=NODEAFTERSi)) && (synpred1())) {s = 65;}

                        else if ( (LA27_24==AND) && (synpred1())) {s = 66;}

                        else if ( (LA27_24==OR) && (synpred1())) {s = 67;}

                        else if ( (LA27_24==EOF) && (synpred1())) {s = 68;}

                        else if ( (LA27_24==RBRACSi) && (synpred1())) {s = 69;}

                        else if ( (LA27_24==RBRACKSi) && (synpred1())) {s = 70;}

                        else if ( (LA27_24==SEMICOLONSi) && (synpred1())) {s = 71;}

                        else if ( (LA27_24==WHERE) && (synpred1())) {s = 72;}

                        else if ( (LA27_24==ORDER) && (synpred1())) {s = 73;}

                        else if ( (LA27_24==STABLE) && (synpred1())) {s = 74;}

                        else if ( (LA27_24==FOR) && (synpred1())) {s = 75;}

                        else if ( (LA27_24==LET) && (synpred1())) {s = 76;}

                        else if ( (LA27_24==ASCENDING||LA27_24==DESCENDING) && (synpred1())) {s = 77;}

                        else if ( (LA27_24==EMPTY) && (synpred1())) {s = 78;}

                        else if ( (LA27_24==COLLATION) && (synpred1())) {s = 79;}

                        else if ( (LA27_24==SATISFIES) && (synpred1())) {s = 80;}

                        else if ( (LA27_24==DEFAULT) && (synpred1())) {s = 81;}

                        else if ( (LA27_24==CASE) && (synpred1())) {s = 82;}

                        else if ( (LA27_24==ELSE) && (synpred1())) {s = 83;}

                        else if ( (LA27_24==WITHOUT) && (synpred1())) {s = 84;}

                        else if ( (LA27_24==TIMES) && (synpred1())) {s = 85;}

                        else if ( (LA27_24==PARAGRAPHS||LA27_24==SENTENCES||LA27_24==WORDS) && (synpred1())) {s = 86;}

                        else if ( (LA27_24==LEVELS) && (synpred1())) {s = 87;}

                        else if ( (LA27_24==INSTANCE) && (synpred1())) {s = 88;}

                         
                        input.seek(index27_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA120_eotS =
        "\u01d0\uffff";
    static final String DFA120_eofS =
        "\2\uffff\1\36\17\uffff\1\65\17\uffff\2\36\47\uffff\1\36\126\uffff"+
        "\1\65\16\uffff\1\65\14\uffff\1\65\u0111\uffff";
    static final String DFA120_minS =
        "\1\6\1\uffff\1\6\17\uffff\1\6\7\uffff\1\6\5\uffff\5\6\46\uffff\1"+
        "\10\1\6\1\110\1\6\1\0\1\u00b0\1\0\1\u0092\1\14\1\u0098\1\u0092\1"+
        "\u00b0\2\u0098\1\u0092\3\u0098\4\0\1\u0092\2\0\2\u009a\1\u0092\1"+
        "\u00c1\1\u00c4\1\u009a\1\u0092\1\u00b0\1\0\1\u0092\1\14\1\u0098"+
        "\1\u0092\1\u00b0\2\u0098\1\u0092\3\u0098\4\0\1\u0092\2\0\2\u009a"+
        "\1\u0092\1\u00c1\1\u00c4\1\u009a\1\6\1\0\1\u00b0\1\0\1\u0092\1\14"+
        "\1\u0098\1\u0092\1\u00b0\2\u0098\1\u0092\3\u0098\3\0\1\u0092\2\0"+
        "\2\u009a\1\u00c1\1\u00c4\1\u009a\1\6\1\uffff\2\6\16\uffff\1\6\7"+
        "\uffff\1\6\4\uffff\1\10\36\uffff\1\u0092\3\uffff\1\0\1\u009a\u00b6"+
        "\0\7\uffff\32\0\1\uffff\2\0\1\uffff\2\0\17\uffff\1\0";
    static final String DFA120_maxS =
        "\1\u00c3\1\uffff\1\u00c3\17\uffff\1\u00c3\7\uffff\1\u00c3\5\uffff"+
        "\5\u00c3\46\uffff\1\u00b6\1\u00c3\1\u009a\1\u00c3\1\0\1\u00b0\1"+
        "\0\1\u00b0\1\u009d\1\u0098\1\u009a\1\u00b0\2\u0098\3\u009a\1\u0098"+
        "\4\0\1\u0092\2\0\2\u009a\1\u0092\1\u00c1\1\u00c4\1\u009a\1\u0092"+
        "\1\u00b0\1\0\1\u00b0\1\u009d\1\u0098\1\u009a\1\u00b0\2\u0098\3\u009a"+
        "\1\u0098\4\0\1\u0092\2\0\2\u009a\1\u0092\1\u00c1\1\u00c4\1\u009a"+
        "\1\u00c3\1\0\1\u00b0\1\0\1\u00b0\1\u009d\1\u0098\1\u009a\1\u00b0"+
        "\2\u0098\3\u009a\1\u0098\3\0\1\u0092\2\0\2\u009a\1\u00c1\1\u00c4"+
        "\1\u009a\1\u00c3\1\uffff\2\u00c3\16\uffff\1\u00c3\7\uffff\1\u00c3"+
        "\4\uffff\1\u00b6\36\uffff\1\u009d\3\uffff\1\0\1\u009a\u00b6\0\7"+
        "\uffff\32\0\1\uffff\2\0\1\uffff\2\0\17\uffff\1\0";
    static final String DFA120_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\16\2\1\uffff\7\2\1\uffff\3\2\1\3\1\2\5"+
        "\uffff\46\2\125\uffff\1\2\2\uffff\16\2\1\uffff\7\2\1\uffff\4\2\1"+
        "\uffff\36\2\1\uffff\3\2\u00b8\uffff\7\2\32\uffff\1\2\2\uffff\1\2"+
        "\2\uffff\17\2\1\uffff";
    static final String DFA120_specialS =
        "\1\15\1\uffff\1\7\17\uffff\1\21\20\uffff\1\14\1\16\46\uffff\1\1"+
        "\3\uffff\1\17\1\uffff\1\23\13\uffff\1\11\1\0\1\5\1\27\1\uffff\1"+
        "\20\1\33\10\uffff\1\36\13\uffff\1\32\1\25\1\2\1\26\1\uffff\1\31"+
        "\1\10\7\uffff\1\4\1\uffff\1\37\13\uffff\1\34\1\3\1\30\1\uffff\1"+
        "\12\1\6\10\uffff\1\24\16\uffff\1\22\14\uffff\1\35\42\uffff\1\13"+
        "\u00ee\uffff}>";
    static final String[] DFA120_transitionS = {
            "\2\3\4\uffff\1\3\6\uffff\1\3\1\uffff\1\3\5\uffff\2\3\5\uffff"+
            "\3\3\13\uffff\2\3\42\uffff\1\3\10\uffff\1\3\3\uffff\1\3\1\uffff"+
            "\2\3\1\uffff\1\3\5\uffff\2\3\1\uffff\1\3\12\uffff\1\3\7\uffff"+
            "\1\3\15\uffff\1\3\1\uffff\1\3\2\uffff\1\3\2\uffff\1\3\4\uffff"+
            "\1\3\4\uffff\1\3\5\uffff\3\3\3\uffff\1\1\1\2\1\uffff\2\3\2\uffff"+
            "\1\3\12\uffff\1\3\2\uffff\1\3",
            "",
            "\2\4\1\36\1\uffff\1\36\1\uffff\1\6\3\uffff\3\36\1\12\1\36\1"+
            "\16\4\uffff\1\36\2\12\1\36\3\uffff\1\36\1\35\1\10\1\11\1\36"+
            "\3\uffff\1\36\1\uffff\1\36\2\uffff\1\36\1\uffff\2\12\1\36\2"+
            "\uffff\1\36\4\uffff\1\36\1\uffff\2\36\5\uffff\3\36\3\uffff\1"+
            "\36\1\uffff\2\36\1\uffff\2\36\3\uffff\1\36\1\20\6\uffff\2\36"+
            "\1\30\2\uffff\1\36\1\4\1\uffff\2\4\1\uffff\1\15\1\uffff\1\36"+
            "\1\uffff\1\36\1\uffff\1\14\1\13\1\uffff\1\12\1\uffff\1\36\2"+
            "\uffff\1\36\5\uffff\1\17\2\uffff\3\36\1\uffff\1\36\1\31\5\uffff"+
            "\1\36\3\uffff\1\36\1\uffff\1\36\1\uffff\1\24\1\36\1\21\2\36"+
            "\1\25\2\uffff\1\26\1\36\1\uffff\1\36\1\uffff\1\22\4\36\1\32"+
            "\5\36\3\23\6\uffff\1\5\1\7\1\uffff\1\36\1\27\12\uffff\1\33\2"+
            "\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\36\1\62\1\uffff\1\100\1\uffff\1\36\3\uffff\1\105\1\46\1\47"+
            "\1\36\1\102\1\36\4\uffff\1\104\2\36\1\100\3\uffff\1\54\3\36"+
            "\1\106\3\uffff\1\101\1\uffff\1\57\2\uffff\1\52\1\uffff\2\36"+
            "\1\76\2\uffff\1\56\4\uffff\1\57\1\uffff\1\57\1\54\5\uffff\1"+
            "\51\1\52\1\61\3\uffff\1\57\1\uffff\1\77\1\112\1\uffff\1\57\1"+
            "\54\3\uffff\1\57\1\36\6\uffff\1\63\1\73\1\36\2\uffff\1\111\1"+
            "\36\1\uffff\2\36\1\uffff\1\36\1\uffff\1\75\1\uffff\1\103\1\uffff"+
            "\2\36\1\uffff\1\36\1\uffff\1\111\2\uffff\1\74\5\uffff\1\36\2"+
            "\uffff\1\110\1\55\1\50\1\uffff\1\53\1\36\1\uffff\1\36\3\uffff"+
            "\1\72\3\uffff\1\107\1\uffff\1\111\1\uffff\1\36\1\71\1\36\1\60"+
            "\1\64\1\36\1\uffff\1\37\1\36\1\67\1\uffff\1\66\1\uffff\1\43"+
            "\2\40\1\53\1\60\1\44\3\60\2\61\4\36\2\uffff\1\41\1\42\1\uffff"+
            "\2\36\1\45\1\70\1\36\12\uffff\1\36\2\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\36\4\uffff\1\36\6\uffff\1\36\1\uffff\1\36\5\uffff\2\36\5"+
            "\uffff\3\36\13\uffff\2\36\42\uffff\1\36\10\uffff\1\36\3\uffff"+
            "\1\36\1\uffff\2\36\1\uffff\1\36\5\uffff\2\36\1\uffff\1\36\12"+
            "\uffff\1\36\7\uffff\1\36\1\uffff\1\36\13\uffff\1\36\1\uffff"+
            "\1\113\2\uffff\1\36\2\uffff\1\36\4\uffff\3\36\2\uffff\1\36\5"+
            "\uffff\4\36\2\uffff\2\36\1\uffff\2\36\2\uffff\1\36\12\uffff"+
            "\1\36\2\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "\2\120\4\uffff\1\122\6\uffff\1\126\1\uffff\1\132\5\uffff\2\126"+
            "\5\uffff\1\151\1\124\1\125\13\uffff\2\126\42\uffff\1\134\10"+
            "\uffff\1\144\3\uffff\1\120\1\uffff\2\120\1\uffff\1\131\5\uffff"+
            "\1\130\1\127\1\uffff\1\126\12\uffff\1\133\7\uffff\1\145\1\uffff"+
            "\1\115\13\uffff\1\140\1\uffff\1\135\2\uffff\1\141\2\uffff\1"+
            "\142\4\uffff\1\136\2\114\2\uffff\1\146\5\uffff\3\137\1\152\2"+
            "\uffff\1\116\1\117\1\uffff\1\121\1\123\2\uffff\1\143\12\uffff"+
            "\1\147\2\uffff\1\150",
            "\2\153\4\uffff\1\155\6\uffff\1\161\1\uffff\1\165\5\uffff\2\161"+
            "\5\uffff\1\u0084\1\157\1\160\13\uffff\2\161\42\uffff\1\167\10"+
            "\uffff\1\177\3\uffff\1\153\1\uffff\2\153\1\uffff\1\164\5\uffff"+
            "\1\163\1\162\1\uffff\1\161\12\uffff\1\166\7\uffff\1\u0080\15"+
            "\uffff\1\173\1\uffff\1\170\2\uffff\1\174\2\uffff\1\175\4\uffff"+
            "\1\171\4\uffff\1\u0081\5\uffff\3\172\6\uffff\1\154\1\156\2\uffff"+
            "\1\176\12\uffff\1\u0082\2\uffff\1\u0083",
            "\2\u0087\1\36\1\uffff\1\36\1\uffff\1\u0089\3\uffff\3\36\1\u008d"+
            "\1\36\1\u0091\4\uffff\1\36\2\u008d\1\36\3\uffff\1\36\1\u009e"+
            "\1\u008b\1\u008c\1\36\3\uffff\1\36\1\uffff\1\36\2\uffff\1\36"+
            "\1\uffff\2\u008d\1\36\2\uffff\1\36\4\uffff\1\36\1\uffff\2\36"+
            "\5\uffff\3\36\3\uffff\1\36\1\uffff\2\36\1\uffff\2\36\3\uffff"+
            "\1\36\1\u0093\6\uffff\2\36\1\u009a\2\uffff\1\36\1\u0087\1\uffff"+
            "\2\u0087\1\uffff\1\u0090\1\uffff\1\36\1\uffff\1\36\1\uffff\1"+
            "\u008f\1\u008e\1\uffff\1\u008d\1\uffff\1\36\2\uffff\1\36\5\uffff"+
            "\1\u0092\2\uffff\3\36\1\uffff\1\36\1\u009b\5\uffff\1\36\3\uffff"+
            "\1\36\1\uffff\1\36\1\uffff\1\u0096\1\36\1\u0094\2\36\1\u0097"+
            "\2\uffff\1\u0098\1\36\1\uffff\1\36\1\uffff\1\u0086\4\36\1\u0085"+
            "\5\36\3\u0095\6\uffff\1\u0088\1\u008a\1\uffff\1\36\1\u0099\12"+
            "\uffff\1\u009c\2\uffff\1\u009d",
            "\2\u00a3\1\36\1\uffff\1\36\1\uffff\1\u00a5\3\uffff\3\36\1\u00a9"+
            "\1\36\1\u00ad\4\uffff\1\36\2\u00a9\1\36\3\uffff\1\36\1\u00bc"+
            "\1\u00a7\1\u00a8\1\36\3\uffff\1\36\1\uffff\1\36\2\uffff\1\36"+
            "\1\uffff\2\u00a9\1\36\2\uffff\1\36\4\uffff\1\36\1\uffff\2\36"+
            "\5\uffff\3\36\3\uffff\1\36\1\uffff\2\36\1\uffff\2\36\3\uffff"+
            "\1\36\1\u00af\6\uffff\2\36\1\u00b7\2\uffff\1\36\1\u00a3\1\uffff"+
            "\2\u00a3\1\uffff\1\u00ac\1\uffff\1\36\1\uffff\1\36\1\uffff\1"+
            "\u00ab\1\u00aa\1\uffff\1\u00a9\1\uffff\1\36\2\uffff\1\36\5\uffff"+
            "\1\u00ae\2\uffff\3\36\1\uffff\1\36\1\u00b8\1\uffff\1\u00a0\3"+
            "\uffff\1\36\3\uffff\1\36\1\uffff\1\36\1\uffff\1\u00b3\1\36\1"+
            "\u00b0\2\36\1\u00b4\1\uffff\1\36\1\u00b5\1\36\1\uffff\1\36\1"+
            "\uffff\1\u00b1\2\u009f\2\36\1\u00b9\5\36\3\u00b2\1\u00bd\2\uffff"+
            "\1\u00a1\1\u00a2\1\uffff\1\u00a4\1\u00a6\2\36\1\u00b6\12\uffff"+
            "\1\u00ba\2\uffff\1\u00bb",
            "\2\u00c3\4\uffff\1\u00c5\6\uffff\1\u00c9\1\uffff\1\u00cd\5\uffff"+
            "\2\u00c9\5\uffff\1\u00db\1\u00c7\1\u00c8\13\uffff\2\u00c9\42"+
            "\uffff\1\u00cf\10\uffff\1\u00d6\3\uffff\1\u00c3\1\uffff\2\u00c3"+
            "\1\uffff\1\u00cc\5\uffff\1\u00cb\1\u00ca\1\uffff\1\u00c9\12"+
            "\uffff\1\u00ce\7\uffff\1\u00d7\1\uffff\1\u00c0\13\uffff\1\u00d2"+
            "\1\uffff\1\u00be\2\uffff\1\u00d3\2\uffff\1\u00d4\4\uffff\1\u00d0"+
            "\2\u00bf\2\uffff\1\u00d8\5\uffff\3\u00d1\1\u00dc\2\uffff\1\u00c1"+
            "\1\u00c2\1\uffff\1\u00c4\1\u00c6\2\uffff\1\u00d5\12\uffff\1"+
            "\u00d9\2\uffff\1\u00da",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\1\uffff\1\36\5\uffff\3\36\1\uffff\1\36\5\uffff\1\36\2"+
            "\uffff\1\36\3\uffff\1\36\3\uffff\1\36\3\uffff\1\36\4\uffff\1"+
            "\36\3\uffff\1\36\2\uffff\1\36\7\uffff\1\36\5\uffff\2\36\6\uffff"+
            "\1\36\3\uffff\1\36\13\uffff\2\36\13\uffff\1\36\1\uffff\1\36"+
            "\11\uffff\1\36\11\uffff\2\36\1\uffff\1\36\6\uffff\1\36\10\uffff"+
            "\1\36\1\u00de\1\uffff\1\36\2\uffff\1\u00dd\2\36\1\uffff\1\36"+
            "\1\uffff\4\36\3\uffff\1\u00e0\11\uffff\2\36\3\uffff\2\36\1\uffff"+
            "\1\u00df",
            "\2\120\4\uffff\1\122\6\uffff\1\126\1\uffff\1\132\5\uffff\2\126"+
            "\5\uffff\1\151\1\124\1\125\13\uffff\2\126\42\uffff\1\134\10"+
            "\uffff\1\144\3\uffff\1\120\1\uffff\2\120\1\uffff\1\131\5\uffff"+
            "\1\130\1\127\1\uffff\1\126\12\uffff\1\133\7\uffff\1\145\1\uffff"+
            "\1\115\13\uffff\1\140\1\uffff\1\135\2\uffff\1\141\2\uffff\1"+
            "\u00e1\4\uffff\1\136\2\114\2\uffff\1\146\5\uffff\3\137\1\152"+
            "\2\uffff\1\116\1\117\1\uffff\1\121\1\123\2\uffff\1\143\12\uffff"+
            "\1\147\2\uffff\1\150",
            "\1\u00e2\57\uffff\1\u00e2\41\uffff\1\u00e3",
            "\2\u00e4\4\uffff\1\u00e6\6\uffff\1\u00ea\1\uffff\1\u00ee\5\uffff"+
            "\2\u00ea\5\uffff\1\u00fd\1\u00e8\1\u00e9\13\uffff\2\u00ea\42"+
            "\uffff\1\u00f0\10\uffff\1\u00f8\3\uffff\1\u00e4\1\uffff\2\u00e4"+
            "\1\uffff\1\u00ed\5\uffff\1\u00ec\1\u00eb\1\uffff\1\u00ea\12"+
            "\uffff\1\u00ef\7\uffff\1\u00f9\15\uffff\1\u00f4\1\uffff\1\u00f1"+
            "\2\uffff\1\u00f5\2\uffff\1\u00f6\4\uffff\1\u00f2\4\uffff\1\u00fa"+
            "\5\uffff\3\u00f3\6\uffff\1\u00e5\1\u00e7\2\uffff\1\u00f7\12"+
            "\uffff\1\u00fb\2\uffff\1\u00fc",
            "\1\uffff",
            "\1\u00fe",
            "\1\uffff",
            "\1\u0101\5\uffff\1\u0100\1\uffff\1\u0102\25\uffff\1\u00ff",
            "\1\u0104\10\uffff\1\u0106\15\uffff\1\124\1\u0103\57\uffff\1"+
            "\134\21\uffff\1\u0105\5\uffff\1\130\1\127\14\uffff\1\u0107\27"+
            "\uffff\1\u0108\12\uffff\1\136",
            "\1\u0109",
            "\1\u010b\5\uffff\1\u010a\1\uffff\1\u010c",
            "\1\u00ff",
            "\1\u010d",
            "\1\u010e",
            "\1\u0110\5\uffff\1\u010f\1\uffff\1\u0111",
            "\1\u0113\1\uffff\1\u0112",
            "\1\u0115\1\uffff\1\u0114",
            "\1\u0116",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0117",
            "\1\uffff",
            "\1\uffff",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\uffff",
            "\1\u0122\5\uffff\1\u0121\1\uffff\1\u0123\25\uffff\1\u0120",
            "\1\u0125\10\uffff\1\u0127\15\uffff\1\157\1\u0124\57\uffff\1"+
            "\167\21\uffff\1\u0126\5\uffff\1\163\1\162\14\uffff\1\u0128\27"+
            "\uffff\1\u0129\12\uffff\1\171",
            "\1\u012a",
            "\1\u012c\5\uffff\1\u012b\1\uffff\1\u012d",
            "\1\u0120",
            "\1\u012e",
            "\1\u012f",
            "\1\u0131\5\uffff\1\u0130\1\uffff\1\u0132",
            "\1\u0133\1\uffff\1\u0134",
            "\1\u0136\1\uffff\1\u0135",
            "\1\u0137",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0138",
            "\1\uffff",
            "\1\uffff",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\2\36\4\uffff\1\36\6\uffff\1\36\1\uffff\1\36\5\uffff\2\36\5"+
            "\uffff\3\36\13\uffff\2\36\42\uffff\1\36\10\uffff\1\36\3\uffff"+
            "\1\36\1\uffff\2\36\1\uffff\1\36\5\uffff\2\36\1\uffff\1\36\12"+
            "\uffff\1\36\7\uffff\1\36\1\uffff\1\36\13\uffff\1\36\1\uffff"+
            "\1\u013f\2\uffff\1\36\2\uffff\1\36\4\uffff\3\36\2\uffff\1\36"+
            "\5\uffff\4\36\2\uffff\2\36\1\uffff\2\36\2\uffff\1\36\12\uffff"+
            "\1\36\2\uffff\1\36",
            "\1\uffff",
            "\1\u0140",
            "\1\uffff",
            "\1\u0143\5\uffff\1\u0142\1\uffff\1\u0144\25\uffff\1\u0141",
            "\1\u0146\10\uffff\1\u0148\15\uffff\1\u008b\1\u0145\57\uffff"+
            "\1\u0093\21\uffff\1\u0147\5\uffff\1\u008f\1\u008e\14\uffff\1"+
            "\u0149\27\uffff\1\u014a\12\uffff\1\u014b",
            "\1\u014c",
            "\1\u014e\5\uffff\1\u014d\1\uffff\1\u014f",
            "\1\u0141",
            "\1\u0150",
            "\1\u0151",
            "\1\u0153\5\uffff\1\u0152\1\uffff\1\u0154",
            "\1\u0156\1\uffff\1\u0155",
            "\1\u0158\1\uffff\1\u0157",
            "\1\u0159",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u015a",
            "\1\uffff",
            "\1\uffff",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\2\u0164\4\uffff\1\u0166\6\uffff\1\u016a\1\uffff\1\u016e\5\uffff"+
            "\2\u016a\5\uffff\1\u017d\1\u0168\1\u0169\13\uffff\2\u016a\42"+
            "\uffff\1\u0170\10\uffff\1\u0178\3\uffff\1\u0164\1\uffff\2\u0164"+
            "\1\uffff\1\u016d\5\uffff\1\u016c\1\u016b\1\uffff\1\u016a\12"+
            "\uffff\1\u016f\7\uffff\1\u0179\1\uffff\1\u0161\13\uffff\1\u0174"+
            "\1\uffff\1\u0171\2\uffff\1\u0175\2\uffff\1\u0176\4\uffff\1\u0172"+
            "\2\u0160\2\uffff\1\u017a\5\uffff\3\u0173\1\u017e\2\uffff\1\u0162"+
            "\1\u0163\1\uffff\1\u0165\1\u0167\2\uffff\1\u0177\12\uffff\1"+
            "\u017b\2\uffff\1\u017c",
            "",
            "\2\u017f\4\uffff\1\u0181\6\uffff\1\u0185\1\uffff\1\u0189\5\uffff"+
            "\2\u0185\5\uffff\1\u0198\1\u0183\1\u0184\13\uffff\2\u0185\42"+
            "\uffff\1\u018b\10\uffff\1\u0193\3\uffff\1\u017f\1\uffff\2\u017f"+
            "\1\uffff\1\u0188\5\uffff\1\u0187\1\u0186\1\uffff\1\u0185\12"+
            "\uffff\1\u018a\7\uffff\1\u0194\15\uffff\1\u018f\1\uffff\1\u018c"+
            "\2\uffff\1\u0190\2\uffff\1\u0191\4\uffff\1\u018d\4\uffff\1\u0195"+
            "\5\uffff\3\u018e\6\uffff\1\u0180\1\u0182\2\uffff\1\u0192\12"+
            "\uffff\1\u0196\2\uffff\1\u0197",
            "\2\u01a2\1\62\1\uffff\1\100\1\uffff\1\u01a4\3\uffff\1\105\1"+
            "\u0199\1\u019a\1\u01a8\1\102\1\u01ac\4\uffff\1\104\2\u01a8\1"+
            "\100\3\uffff\1\54\1\u01b9\1\u01a6\1\u01a7\1\106\3\uffff\1\101"+
            "\1\uffff\1\57\2\uffff\1\u019d\1\uffff\2\u01a8\1\76\2\uffff\1"+
            "\56\4\uffff\1\57\1\uffff\1\57\1\54\5\uffff\1\u019c\1\u019d\1"+
            "\61\3\uffff\1\57\1\uffff\1\77\1\112\1\uffff\1\57\1\54\3\uffff"+
            "\1\57\1\u01ae\6\uffff\1\63\1\73\1\u01b5\2\uffff\1\111\1\u01a2"+
            "\1\uffff\2\u01a2\1\uffff\1\u01ab\1\uffff\1\75\1\uffff\1\103"+
            "\1\uffff\1\u01aa\1\u01a9\1\uffff\1\u01a8\1\uffff\1\111\2\uffff"+
            "\1\74\5\uffff\1\u01ad\2\uffff\1\110\1\55\1\u019b\1\uffff\1\u019e"+
            "\1\u01b6\5\uffff\1\72\3\uffff\1\107\1\uffff\1\111\1\uffff\1"+
            "\u01b1\1\71\1\u01af\1\60\1\64\1\u01b2\2\uffff\1\u01b3\1\67\1"+
            "\uffff\1\66\1\uffff\1\u01a1\2\u019f\1\u019e\1\60\1\u01a0\3\60"+
            "\2\61\3\u01b0\6\uffff\1\u01a3\1\u01a5\1\uffff\1\70\1\u01b4\12"+
            "\uffff\1\u01b7\2\uffff\1\u01b8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\36\1\62\1\uffff\1\100\1\uffff\1\36\3\uffff\1\105\1\u0199"+
            "\1\u019a\1\36\1\102\1\36\4\uffff\1\104\2\36\1\100\3\uffff\1"+
            "\54\3\36\1\106\3\uffff\1\101\1\uffff\1\57\2\uffff\1\u019d\1"+
            "\uffff\2\36\1\76\2\uffff\1\56\4\uffff\1\57\1\uffff\1\57\1\54"+
            "\5\uffff\1\u019c\1\u019d\1\61\3\uffff\1\57\1\uffff\1\77\1\112"+
            "\1\uffff\1\57\1\54\3\uffff\1\57\1\36\6\uffff\1\63\1\73\1\36"+
            "\2\uffff\1\111\1\36\1\uffff\2\36\1\uffff\1\36\1\uffff\1\75\1"+
            "\uffff\1\103\1\uffff\2\36\1\uffff\1\36\1\uffff\1\111\2\uffff"+
            "\1\74\5\uffff\1\36\2\uffff\1\110\1\55\1\u019b\1\uffff\1\u019e"+
            "\1\36\1\uffff\1\36\3\uffff\1\72\3\uffff\1\107\1\uffff\1\111"+
            "\1\uffff\1\36\1\71\1\36\1\60\1\64\1\36\1\uffff\1\u01ba\1\36"+
            "\1\67\1\uffff\1\66\1\uffff\1\43\2\40\1\u019e\1\60\1\44\3\60"+
            "\2\61\4\36\2\uffff\1\u01bb\1\u01bc\1\uffff\2\36\1\u01bd\1\70"+
            "\1\36\12\uffff\1\36\2\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\36\4\uffff\1\36\6\uffff\1\36\1\uffff\1\36\5\uffff\2\36\5"+
            "\uffff\3\36\13\uffff\2\36\42\uffff\1\36\10\uffff\1\36\3\uffff"+
            "\1\36\1\uffff\2\36\1\uffff\1\36\5\uffff\2\36\1\uffff\1\36\12"+
            "\uffff\1\36\7\uffff\1\36\1\uffff\1\36\13\uffff\1\36\1\uffff"+
            "\1\u01be\2\uffff\1\36\2\uffff\1\36\4\uffff\3\36\2\uffff\1\36"+
            "\5\uffff\4\36\2\uffff\2\36\1\uffff\2\36\2\uffff\1\36\12\uffff"+
            "\1\36\2\uffff\1\36",
            "",
            "",
            "",
            "",
            "\1\62\1\uffff\1\100\5\uffff\1\105\1\u01c3\1\u01c4\1\uffff\1"+
            "\102\5\uffff\1\104\2\uffff\1\100\3\uffff\1\u01c9\3\uffff\1\106"+
            "\3\uffff\1\101\4\uffff\1\u01c7\3\uffff\1\76\2\uffff\1\u01cc"+
            "\7\uffff\1\u01c9\5\uffff\1\u01c6\1\u01c7\6\uffff\1\77\3\uffff"+
            "\1\u01c9\13\uffff\1\63\1\73\13\uffff\1\75\1\uffff\1\103\11\uffff"+
            "\1\74\11\uffff\1\u01cb\1\u01c5\1\uffff\1\u01c8\6\uffff\1\72"+
            "\10\uffff\1\71\1\36\1\uffff\1\64\2\uffff\1\u01bf\1\u01c0\1\u01ce"+
            "\1\uffff\1\u01cd\1\uffff\1\u01c9\2\u01ca\1\u01c8\3\uffff\1\36"+
            "\11\uffff\2\u01c2\3\uffff\1\u01c1\1\70\1\uffff\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u01cf\12\uffff\1\36",
            "",
            "",
            "",
            "\1\uffff",
            "\1\u00e3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff"
    };

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "632:2: pathExpr : ( ( DBLSLASHSi relativePathExpr )=> DBLSLASHSi relativePathExpr | ( SLASHSi relativePathExpr )=> SLASHSi relativePathExpr | SLASHSi | relativePathExpr );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA120_94 = input.LA(1);

                         
                        int index120_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_94);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA120_75 = input.LA(1);

                         
                        int index120_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_75==COLONSi) ) {s = 221;}

                        else if ( (LA120_75==NCName) && (synpred3())) {s = 222;}

                        else if ( (LA120_75==RSELFTERMSi) && (synpred3())) {s = 223;}

                        else if ( (LA120_75==GTSi) && (synpred3())) {s = 224;}

                        else if ( (LA120_75==EOF||LA120_75==AND||LA120_75==ASCENDING||(LA120_75>=CASE && LA120_75<=CASTABLE)||LA120_75==COLLATION||LA120_75==DEFAULT||LA120_75==DESCENDING||LA120_75==DIV||LA120_75==ELSE||LA120_75==EMPTY||LA120_75==EXCEPT||LA120_75==FOR||LA120_75==FTCONTAINS||LA120_75==IDIV||(LA120_75>=INSTANCE && LA120_75<=INTERSECT)||LA120_75==LET||LA120_75==MOD||(LA120_75>=OR && LA120_75<=ORDER)||LA120_75==RETURN||LA120_75==SATISFIES||LA120_75==STABLE||(LA120_75>=TO && LA120_75<=TREAT)||LA120_75==UNION||LA120_75==WHERE||LA120_75==SEMICOLONSi||LA120_75==COMMASi||(LA120_75>=LPARSi && LA120_75<=RPARSi)||LA120_75==RBRACSi||(LA120_75>=STARSi && LA120_75<=PIPESi)||(LA120_75>=DBLSLASHSi && LA120_75<=SLASHSi)||(LA120_75>=LBRACKSi && LA120_75<=RBRACKSi)) ) {s = 30;}

                         
                        input.seek(index120_75);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA120_122 = input.LA(1);

                         
                        int index120_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_122);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA120_149 = input.LA(1);

                         
                        int index120_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_149);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA120_134 = input.LA(1);

                         
                        int index120_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_134);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA120_95 = input.LA(1);

                         
                        int index120_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_95);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA120_153 = input.LA(1);

                         
                        int index120_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_153);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA120_2 = input.LA(1);

                         
                        int index120_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA120_2>=ANCESTOR && LA120_2<=ANCESTOR_OR_SELF)||LA120_2==PARENT||(LA120_2>=PRECEDING && LA120_2<=PRECEDING_SIBLING)) && (synpred3())) {s = 4;}

                        else if ( (LA120_2==DOTDOTSi) && (synpred3())) {s = 5;}

                        else if ( (LA120_2==ATTRIBUTE) && (synpred3())) {s = 6;}

                        else if ( (LA120_2==ATSi) && (synpred3())) {s = 7;}

                        else if ( (LA120_2==DOCUMENT_NODE) && (synpred3())) {s = 8;}

                        else if ( (LA120_2==ELEMENT) && (synpred3())) {s = 9;}

                        else if ( (LA120_2==CHILD||(LA120_2>=DESCENDANT && LA120_2<=DESCENDANT_OR_SELF)||(LA120_2>=FOLLOWING && LA120_2<=FOLLOWING_SIBLING)||LA120_2==SELF) && (synpred3())) {s = 10;}

                        else if ( (LA120_2==SCHEMAELEMENT) && (synpred3())) {s = 11;}

                        else if ( (LA120_2==SCHEMAATTRIBUTE) && (synpred3())) {s = 12;}

                        else if ( (LA120_2==PROCESSING_INSTRUCTION) && (synpred3())) {s = 13;}

                        else if ( (LA120_2==COMMENT) && (synpred3())) {s = 14;}

                        else if ( (LA120_2==TEXT) && (synpred3())) {s = 15;}

                        else if ( (LA120_2==NODE) && (synpred3())) {s = 16;}

                        else if ( (LA120_2==NCName) && (synpred3())) {s = 17;}

                        else if ( (LA120_2==STARSi) ) {s = 18;}

                        else if ( ((LA120_2>=IntegerLiteral && LA120_2<=DoubleLiteral)) && (synpred3())) {s = 19;}

                        else if ( (LA120_2==StringLiteral) && (synpred3())) {s = 20;}

                        else if ( (LA120_2==DOLLARSi) && (synpred3())) {s = 21;}

                        else if ( (LA120_2==LPARSi) && (synpred3())) {s = 22;}

                        else if ( (LA120_2==DOTSi) && (synpred3())) {s = 23;}

                        else if ( (LA120_2==ORDERED) && (synpred3())) {s = 24;}

                        else if ( (LA120_2==UNORDERED) && (synpred3())) {s = 25;}

                        else if ( (LA120_2==LTSi) ) {s = 26;}

                        else if ( (LA120_2==LCOMMENTSi) && (synpred3())) {s = 27;}

                        else if ( (LA120_2==LPISi) && (synpred3())) {s = 28;}

                        else if ( (LA120_2==DOCUMENT) && (synpred3())) {s = 29;}

                        else if ( (LA120_2==EOF||LA120_2==AND||LA120_2==ASCENDING||(LA120_2>=CASE && LA120_2<=CASTABLE)||LA120_2==COLLATION||LA120_2==DEFAULT||LA120_2==DESCENDING||LA120_2==DIV||LA120_2==ELSE||LA120_2==EMPTY||LA120_2==EQ||LA120_2==EXCEPT||LA120_2==FOR||LA120_2==FTCONTAINS||LA120_2==GE||(LA120_2>=GT && LA120_2<=IDIV)||(LA120_2>=INSTANCE && LA120_2<=IS)||LA120_2==LE||(LA120_2>=LET && LA120_2<=LEVELS)||(LA120_2>=LT && LA120_2<=MOD)||LA120_2==NE||(LA120_2>=OR && LA120_2<=ORDER)||LA120_2==PARAGRAPHS||LA120_2==RETURN||LA120_2==SATISFIES||LA120_2==SENTENCES||LA120_2==STABLE||(LA120_2>=TIMES && LA120_2<=TREAT)||LA120_2==UNION||LA120_2==WHERE||LA120_2==WITHOUT||LA120_2==WORDS||LA120_2==SEMICOLONSi||(LA120_2>=EQSi && LA120_2<=COMMASi)||LA120_2==RPARSi||LA120_2==RBRACSi||(LA120_2>=PLUSSi && LA120_2<=NEQSi)||(LA120_2>=LTOREQSi && LA120_2<=NODEAFTERSi)||LA120_2==RBRACKSi) ) {s = 30;}

                         
                        input.seek(index120_2);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA120_126 = input.LA(1);

                         
                        int index120_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_126);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA120_93 = input.LA(1);

                         
                        int index120_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_93);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA120_152 = input.LA(1);

                         
                        int index120_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_152);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA120_225 = input.LA(1);

                         
                        int index120_225 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 462;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_225);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA120_35 = input.LA(1);

                         
                        int index120_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_35==EOF||LA120_35==AND||LA120_35==ASCENDING||(LA120_35>=CASE && LA120_35<=CASTABLE)||LA120_35==COLLATION||LA120_35==DEFAULT||LA120_35==DESCENDING||LA120_35==DIV||LA120_35==ELSE||LA120_35==EMPTY||LA120_35==EQ||LA120_35==EXCEPT||LA120_35==FOR||LA120_35==FTCONTAINS||LA120_35==GE||(LA120_35>=GT && LA120_35<=IDIV)||(LA120_35>=INSTANCE && LA120_35<=IS)||LA120_35==LE||(LA120_35>=LET && LA120_35<=LEVELS)||(LA120_35>=LT && LA120_35<=MOD)||LA120_35==NE||(LA120_35>=OR && LA120_35<=ORDER)||LA120_35==PARAGRAPHS||LA120_35==RETURN||LA120_35==SATISFIES||LA120_35==SENTENCES||LA120_35==STABLE||(LA120_35>=TIMES && LA120_35<=TREAT)||LA120_35==UNION||LA120_35==WHERE||LA120_35==WITHOUT||LA120_35==WORDS||LA120_35==SEMICOLONSi||(LA120_35>=EQSi && LA120_35<=COMMASi)||LA120_35==COLONSi||LA120_35==RPARSi||LA120_35==RBRACSi||(LA120_35>=PIPESi && LA120_35<=NEQSi)||(LA120_35>=LTOREQSi && LA120_35<=NODEAFTERSi)||(LA120_35>=LBRACKSi && LA120_35<=RBRACKSi)) ) {s = 30;}

                        else if ( ((LA120_35>=PLUSSi && LA120_35<=MINUSSi)) ) {s = 159;}

                        else if ( (LA120_35==VALIDATE) && (synpred3())) {s = 160;}

                        else if ( (LA120_35==DBLSLASHSi) ) {s = 161;}

                        else if ( (LA120_35==SLASHSi) ) {s = 162;}

                        else if ( ((LA120_35>=ANCESTOR && LA120_35<=ANCESTOR_OR_SELF)||LA120_35==PARENT||(LA120_35>=PRECEDING && LA120_35<=PRECEDING_SIBLING)) && (synpred3())) {s = 163;}

                        else if ( (LA120_35==DOTDOTSi) && (synpred3())) {s = 164;}

                        else if ( (LA120_35==ATTRIBUTE) && (synpred3())) {s = 165;}

                        else if ( (LA120_35==ATSi) && (synpred3())) {s = 166;}

                        else if ( (LA120_35==DOCUMENT_NODE) && (synpred3())) {s = 167;}

                        else if ( (LA120_35==ELEMENT) && (synpred3())) {s = 168;}

                        else if ( (LA120_35==CHILD||(LA120_35>=DESCENDANT && LA120_35<=DESCENDANT_OR_SELF)||(LA120_35>=FOLLOWING && LA120_35<=FOLLOWING_SIBLING)||LA120_35==SELF) && (synpred3())) {s = 169;}

                        else if ( (LA120_35==SCHEMAELEMENT) && (synpred3())) {s = 170;}

                        else if ( (LA120_35==SCHEMAATTRIBUTE) && (synpred3())) {s = 171;}

                        else if ( (LA120_35==PROCESSING_INSTRUCTION) && (synpred3())) {s = 172;}

                        else if ( (LA120_35==COMMENT) && (synpred3())) {s = 173;}

                        else if ( (LA120_35==TEXT) && (synpred3())) {s = 174;}

                        else if ( (LA120_35==NODE) && (synpred3())) {s = 175;}

                        else if ( (LA120_35==NCName) && (synpred3())) {s = 176;}

                        else if ( (LA120_35==STARSi) ) {s = 177;}

                        else if ( ((LA120_35>=IntegerLiteral && LA120_35<=DoubleLiteral)) && (synpred3())) {s = 178;}

                        else if ( (LA120_35==StringLiteral) && (synpred3())) {s = 179;}

                        else if ( (LA120_35==DOLLARSi) && (synpred3())) {s = 180;}

                        else if ( (LA120_35==LPARSi) && (synpred3())) {s = 181;}

                        else if ( (LA120_35==DOTSi) && (synpred3())) {s = 182;}

                        else if ( (LA120_35==ORDERED) && (synpred3())) {s = 183;}

                        else if ( (LA120_35==UNORDERED) && (synpred3())) {s = 184;}

                        else if ( (LA120_35==LTSi) ) {s = 185;}

                        else if ( (LA120_35==LCOMMENTSi) && (synpred3())) {s = 186;}

                        else if ( (LA120_35==LPISi) && (synpred3())) {s = 187;}

                        else if ( (LA120_35==DOCUMENT) && (synpred3())) {s = 188;}

                        else if ( (LA120_35==LPRAGSi) && (synpred3())) {s = 189;}

                         
                        input.seek(index120_35);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA120_0 = input.LA(1);

                         
                        int index120_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_0==DBLSLASHSi) && (synpred2())) {s = 1;}

                        else if ( (LA120_0==SLASHSi) ) {s = 2;}

                        else if ( ((LA120_0>=ANCESTOR && LA120_0<=ANCESTOR_OR_SELF)||LA120_0==ATTRIBUTE||LA120_0==CHILD||LA120_0==COMMENT||(LA120_0>=DESCENDANT && LA120_0<=DESCENDANT_OR_SELF)||(LA120_0>=DOCUMENT && LA120_0<=ELEMENT)||(LA120_0>=FOLLOWING && LA120_0<=FOLLOWING_SIBLING)||LA120_0==NODE||LA120_0==ORDERED||LA120_0==PARENT||(LA120_0>=PRECEDING && LA120_0<=PRECEDING_SIBLING)||LA120_0==PROCESSING_INSTRUCTION||(LA120_0>=SCHEMAATTRIBUTE && LA120_0<=SCHEMAELEMENT)||LA120_0==SELF||LA120_0==TEXT||LA120_0==UNORDERED||LA120_0==StringLiteral||LA120_0==NCName||LA120_0==DOLLARSi||LA120_0==LPARSi||LA120_0==STARSi||LA120_0==LTSi||(LA120_0>=IntegerLiteral && LA120_0<=DoubleLiteral)||(LA120_0>=DOTDOTSi && LA120_0<=ATSi)||LA120_0==DOTSi||LA120_0==LCOMMENTSi||LA120_0==LPISi) ) {s = 3;}

                         
                        input.seek(index120_0);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA120_36 = input.LA(1);

                         
                        int index120_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_36==NCName) ) {s = 190;}

                        else if ( ((LA120_36>=PLUSSi && LA120_36<=MINUSSi)) && (synpred3())) {s = 191;}

                        else if ( (LA120_36==VALIDATE) && (synpred3())) {s = 192;}

                        else if ( (LA120_36==DBLSLASHSi) && (synpred3())) {s = 193;}

                        else if ( (LA120_36==SLASHSi) && (synpred3())) {s = 194;}

                        else if ( ((LA120_36>=ANCESTOR && LA120_36<=ANCESTOR_OR_SELF)||LA120_36==PARENT||(LA120_36>=PRECEDING && LA120_36<=PRECEDING_SIBLING)) && (synpred3())) {s = 195;}

                        else if ( (LA120_36==DOTDOTSi) && (synpred3())) {s = 196;}

                        else if ( (LA120_36==ATTRIBUTE) && (synpred3())) {s = 197;}

                        else if ( (LA120_36==ATSi) && (synpred3())) {s = 198;}

                        else if ( (LA120_36==DOCUMENT_NODE) && (synpred3())) {s = 199;}

                        else if ( (LA120_36==ELEMENT) && (synpred3())) {s = 200;}

                        else if ( (LA120_36==CHILD||(LA120_36>=DESCENDANT && LA120_36<=DESCENDANT_OR_SELF)||(LA120_36>=FOLLOWING && LA120_36<=FOLLOWING_SIBLING)||LA120_36==SELF) && (synpred3())) {s = 201;}

                        else if ( (LA120_36==SCHEMAELEMENT) && (synpred3())) {s = 202;}

                        else if ( (LA120_36==SCHEMAATTRIBUTE) && (synpred3())) {s = 203;}

                        else if ( (LA120_36==PROCESSING_INSTRUCTION) && (synpred3())) {s = 204;}

                        else if ( (LA120_36==COMMENT) && (synpred3())) {s = 205;}

                        else if ( (LA120_36==TEXT) && (synpred3())) {s = 206;}

                        else if ( (LA120_36==NODE) && (synpred3())) {s = 207;}

                        else if ( (LA120_36==STARSi) && (synpred3())) {s = 208;}

                        else if ( ((LA120_36>=IntegerLiteral && LA120_36<=DoubleLiteral)) && (synpred3())) {s = 209;}

                        else if ( (LA120_36==StringLiteral) && (synpred3())) {s = 210;}

                        else if ( (LA120_36==DOLLARSi) && (synpred3())) {s = 211;}

                        else if ( (LA120_36==LPARSi) && (synpred3())) {s = 212;}

                        else if ( (LA120_36==DOTSi) && (synpred3())) {s = 213;}

                        else if ( (LA120_36==ORDERED) && (synpred3())) {s = 214;}

                        else if ( (LA120_36==UNORDERED) && (synpred3())) {s = 215;}

                        else if ( (LA120_36==LTSi) && (synpred3())) {s = 216;}

                        else if ( (LA120_36==LCOMMENTSi) && (synpred3())) {s = 217;}

                        else if ( (LA120_36==LPISi) && (synpred3())) {s = 218;}

                        else if ( (LA120_36==DOCUMENT) && (synpred3())) {s = 219;}

                        else if ( (LA120_36==LPRAGSi) && (synpred3())) {s = 220;}

                         
                        input.seek(index120_36);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA120_79 = input.LA(1);

                         
                        int index120_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_79);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA120_98 = input.LA(1);

                         
                        int index120_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_98);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA120_18 = input.LA(1);

                         
                        int index120_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_18==COLONSi) && (synpred3())) {s = 31;}

                        else if ( ((LA120_18>=PLUSSi && LA120_18<=MINUSSi)) ) {s = 32;}

                        else if ( ((LA120_18>=ANCESTOR && LA120_18<=ANCESTOR_OR_SELF)||LA120_18==ATTRIBUTE||LA120_18==CHILD||LA120_18==COMMENT||(LA120_18>=DESCENDANT && LA120_18<=DESCENDANT_OR_SELF)||(LA120_18>=DOCUMENT && LA120_18<=ELEMENT)||(LA120_18>=FOLLOWING && LA120_18<=FOLLOWING_SIBLING)||LA120_18==NODE||LA120_18==ORDERED||LA120_18==PARENT||(LA120_18>=PRECEDING && LA120_18<=PRECEDING_SIBLING)||LA120_18==PROCESSING_INSTRUCTION||(LA120_18>=SCHEMAATTRIBUTE && LA120_18<=SCHEMAELEMENT)||LA120_18==SELF||LA120_18==TEXT||LA120_18==UNORDERED||LA120_18==VALIDATE||LA120_18==StringLiteral||LA120_18==NCName||LA120_18==DOLLARSi||LA120_18==LPARSi||(LA120_18>=IntegerLiteral && LA120_18<=LPRAGSi)||(LA120_18>=DOTDOTSi && LA120_18<=ATSi)||LA120_18==DOTSi||LA120_18==LCOMMENTSi||LA120_18==LPISi) ) {s = 30;}

                        else if ( (LA120_18==DBLSLASHSi) ) {s = 33;}

                        else if ( (LA120_18==SLASHSi) ) {s = 34;}

                        else if ( (LA120_18==STARSi) ) {s = 35;}

                        else if ( (LA120_18==LTSi) ) {s = 36;}

                        else if ( (LA120_18==LBRACKSi) && (synpred3())) {s = 37;}

                        else if ( (LA120_18==CAST) && (synpred3())) {s = 38;}

                        else if ( (LA120_18==CASTABLE) && (synpred3())) {s = 39;}

                        else if ( (LA120_18==TREAT) && (synpred3())) {s = 40;}

                        else if ( (LA120_18==INSTANCE) && (synpred3())) {s = 41;}

                        else if ( (LA120_18==EXCEPT||LA120_18==INTERSECT) && (synpred3())) {s = 42;}

                        else if ( (LA120_18==UNION||LA120_18==PIPESi) && (synpred3())) {s = 43;}

                        else if ( (LA120_18==DIV||LA120_18==IDIV||LA120_18==MOD) && (synpred3())) {s = 44;}

                        else if ( (LA120_18==TO) && (synpred3())) {s = 45;}

                        else if ( (LA120_18==FTCONTAINS) && (synpred3())) {s = 46;}

                        else if ( (LA120_18==EQ||LA120_18==GE||LA120_18==GT||LA120_18==LE||LA120_18==LT||LA120_18==NE) && (synpred3())) {s = 47;}

                        else if ( (LA120_18==EQSi||LA120_18==NEQSi||(LA120_18>=LTOREQSi && LA120_18<=GTOREQSi)) && (synpred3())) {s = 48;}

                        else if ( (LA120_18==IS||(LA120_18>=NODEBEFORESi && LA120_18<=NODEAFTERSi)) && (synpred3())) {s = 49;}

                        else if ( (LA120_18==AND) && (synpred3())) {s = 50;}

                        else if ( (LA120_18==OR) && (synpred3())) {s = 51;}

                        else if ( (LA120_18==COMMASi) && (synpred3())) {s = 52;}

                        else if ( (LA120_18==EOF) && (synpred3())) {s = 53;}

                        else if ( (LA120_18==RBRACSi) && (synpred3())) {s = 54;}

                        else if ( (LA120_18==RPARSi) && (synpred3())) {s = 55;}

                        else if ( (LA120_18==RBRACKSi) && (synpred3())) {s = 56;}

                        else if ( (LA120_18==SEMICOLONSi) && (synpred3())) {s = 57;}

                        else if ( (LA120_18==WHERE) && (synpred3())) {s = 58;}

                        else if ( (LA120_18==ORDER) && (synpred3())) {s = 59;}

                        else if ( (LA120_18==STABLE) && (synpred3())) {s = 60;}

                        else if ( (LA120_18==RETURN) && (synpred3())) {s = 61;}

                        else if ( (LA120_18==FOR) && (synpred3())) {s = 62;}

                        else if ( (LA120_18==LET) && (synpred3())) {s = 63;}

                        else if ( (LA120_18==ASCENDING||LA120_18==DESCENDING) && (synpred3())) {s = 64;}

                        else if ( (LA120_18==EMPTY) && (synpred3())) {s = 65;}

                        else if ( (LA120_18==COLLATION) && (synpred3())) {s = 66;}

                        else if ( (LA120_18==SATISFIES) && (synpred3())) {s = 67;}

                        else if ( (LA120_18==DEFAULT) && (synpred3())) {s = 68;}

                        else if ( (LA120_18==CASE) && (synpred3())) {s = 69;}

                        else if ( (LA120_18==ELSE) && (synpred3())) {s = 70;}

                        else if ( (LA120_18==WITHOUT) && (synpred3())) {s = 71;}

                        else if ( (LA120_18==TIMES) && (synpred3())) {s = 72;}

                        else if ( (LA120_18==PARAGRAPHS||LA120_18==SENTENCES||LA120_18==WORDS) && (synpred3())) {s = 73;}

                        else if ( (LA120_18==LEVELS) && (synpred3())) {s = 74;}

                         
                        input.seek(index120_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA120_177 = input.LA(1);

                         
                        int index120_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_177==COLONSi) && (synpred3())) {s = 442;}

                        else if ( ((LA120_177>=PLUSSi && LA120_177<=MINUSSi)) ) {s = 32;}

                        else if ( ((LA120_177>=ANCESTOR && LA120_177<=ANCESTOR_OR_SELF)||LA120_177==ATTRIBUTE||LA120_177==CHILD||LA120_177==COMMENT||(LA120_177>=DESCENDANT && LA120_177<=DESCENDANT_OR_SELF)||(LA120_177>=DOCUMENT && LA120_177<=ELEMENT)||(LA120_177>=FOLLOWING && LA120_177<=FOLLOWING_SIBLING)||LA120_177==NODE||LA120_177==ORDERED||LA120_177==PARENT||(LA120_177>=PRECEDING && LA120_177<=PRECEDING_SIBLING)||LA120_177==PROCESSING_INSTRUCTION||(LA120_177>=SCHEMAATTRIBUTE && LA120_177<=SCHEMAELEMENT)||LA120_177==SELF||LA120_177==TEXT||LA120_177==UNORDERED||LA120_177==VALIDATE||LA120_177==StringLiteral||LA120_177==NCName||LA120_177==DOLLARSi||LA120_177==LPARSi||(LA120_177>=IntegerLiteral && LA120_177<=LPRAGSi)||(LA120_177>=DOTDOTSi && LA120_177<=ATSi)||LA120_177==DOTSi||LA120_177==LCOMMENTSi||LA120_177==LPISi) ) {s = 30;}

                        else if ( (LA120_177==DBLSLASHSi) ) {s = 443;}

                        else if ( (LA120_177==SLASHSi) ) {s = 444;}

                        else if ( (LA120_177==STARSi) ) {s = 35;}

                        else if ( (LA120_177==LTSi) ) {s = 36;}

                        else if ( (LA120_177==LBRACKSi) && (synpred3())) {s = 445;}

                        else if ( (LA120_177==CAST) && (synpred3())) {s = 409;}

                        else if ( (LA120_177==CASTABLE) && (synpred3())) {s = 410;}

                        else if ( (LA120_177==TREAT) && (synpred3())) {s = 411;}

                        else if ( (LA120_177==INSTANCE) && (synpred3())) {s = 412;}

                        else if ( (LA120_177==EXCEPT||LA120_177==INTERSECT) && (synpred3())) {s = 413;}

                        else if ( (LA120_177==UNION||LA120_177==PIPESi) && (synpred3())) {s = 414;}

                        else if ( (LA120_177==TO) && (synpred3())) {s = 45;}

                        else if ( (LA120_177==FTCONTAINS) && (synpred3())) {s = 46;}

                        else if ( (LA120_177==EQ||LA120_177==GE||LA120_177==GT||LA120_177==LE||LA120_177==LT||LA120_177==NE) && (synpred3())) {s = 47;}

                        else if ( (LA120_177==EQSi||LA120_177==NEQSi||(LA120_177>=LTOREQSi && LA120_177<=GTOREQSi)) && (synpred3())) {s = 48;}

                        else if ( (LA120_177==IS||(LA120_177>=NODEBEFORESi && LA120_177<=NODEAFTERSi)) && (synpred3())) {s = 49;}

                        else if ( (LA120_177==AND) && (synpred3())) {s = 50;}

                        else if ( (LA120_177==OR) && (synpred3())) {s = 51;}

                        else if ( (LA120_177==COMMASi) && (synpred3())) {s = 52;}

                        else if ( (LA120_177==EOF) && (synpred3())) {s = 53;}

                        else if ( (LA120_177==RBRACSi) && (synpred3())) {s = 54;}

                        else if ( (LA120_177==RPARSi) && (synpred3())) {s = 55;}

                        else if ( (LA120_177==RBRACKSi) && (synpred3())) {s = 56;}

                        else if ( (LA120_177==SEMICOLONSi) && (synpred3())) {s = 57;}

                        else if ( (LA120_177==WHERE) && (synpred3())) {s = 58;}

                        else if ( (LA120_177==ORDER) && (synpred3())) {s = 59;}

                        else if ( (LA120_177==STABLE) && (synpred3())) {s = 60;}

                        else if ( (LA120_177==RETURN) && (synpred3())) {s = 61;}

                        else if ( (LA120_177==FOR) && (synpred3())) {s = 62;}

                        else if ( (LA120_177==LET) && (synpred3())) {s = 63;}

                        else if ( (LA120_177==ASCENDING||LA120_177==DESCENDING) && (synpred3())) {s = 64;}

                        else if ( (LA120_177==EMPTY) && (synpred3())) {s = 65;}

                        else if ( (LA120_177==COLLATION) && (synpred3())) {s = 66;}

                        else if ( (LA120_177==SATISFIES) && (synpred3())) {s = 67;}

                        else if ( (LA120_177==DEFAULT) && (synpred3())) {s = 68;}

                        else if ( (LA120_177==CASE) && (synpred3())) {s = 69;}

                        else if ( (LA120_177==ELSE) && (synpred3())) {s = 70;}

                        else if ( (LA120_177==WITHOUT) && (synpred3())) {s = 71;}

                        else if ( (LA120_177==TIMES) && (synpred3())) {s = 72;}

                        else if ( (LA120_177==PARAGRAPHS||LA120_177==SENTENCES||LA120_177==WORDS) && (synpred3())) {s = 73;}

                        else if ( (LA120_177==LEVELS) && (synpred3())) {s = 74;}

                        else if ( (LA120_177==DIV||LA120_177==IDIV||LA120_177==MOD) && (synpred3())) {s = 44;}

                         
                        input.seek(index120_177);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA120_81 = input.LA(1);

                         
                        int index120_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_81);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA120_162 = input.LA(1);

                         
                        int index120_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_162==CAST) && (synpred3())) {s = 409;}

                        else if ( (LA120_162==CASTABLE) && (synpred3())) {s = 410;}

                        else if ( (LA120_162==TREAT) && (synpred3())) {s = 411;}

                        else if ( (LA120_162==INSTANCE) && (synpred3())) {s = 412;}

                        else if ( (LA120_162==EXCEPT||LA120_162==INTERSECT) && (synpred3())) {s = 413;}

                        else if ( (LA120_162==UNION||LA120_162==PIPESi) && (synpred3())) {s = 414;}

                        else if ( ((LA120_162>=PLUSSi && LA120_162<=MINUSSi)) && (synpred3())) {s = 415;}

                        else if ( (LA120_162==TO) && (synpred3())) {s = 45;}

                        else if ( (LA120_162==FTCONTAINS) && (synpred3())) {s = 46;}

                        else if ( (LA120_162==EQ||LA120_162==GE||LA120_162==GT||LA120_162==LE||LA120_162==LT||LA120_162==NE) && (synpred3())) {s = 47;}

                        else if ( (LA120_162==LTSi) ) {s = 416;}

                        else if ( (LA120_162==IS||(LA120_162>=NODEBEFORESi && LA120_162<=NODEAFTERSi)) && (synpred3())) {s = 49;}

                        else if ( (LA120_162==AND) && (synpred3())) {s = 50;}

                        else if ( (LA120_162==OR) && (synpred3())) {s = 51;}

                        else if ( (LA120_162==COMMASi) && (synpred3())) {s = 52;}

                        else if ( (LA120_162==EOF) && (synpred3())) {s = 53;}

                        else if ( (LA120_162==RBRACSi) && (synpred3())) {s = 54;}

                        else if ( (LA120_162==RPARSi) && (synpred3())) {s = 55;}

                        else if ( (LA120_162==RBRACKSi) && (synpred3())) {s = 56;}

                        else if ( (LA120_162==SEMICOLONSi) && (synpred3())) {s = 57;}

                        else if ( (LA120_162==WHERE) && (synpred3())) {s = 58;}

                        else if ( (LA120_162==ORDER) && (synpred3())) {s = 59;}

                        else if ( (LA120_162==STABLE) && (synpred3())) {s = 60;}

                        else if ( (LA120_162==RETURN) && (synpred3())) {s = 61;}

                        else if ( (LA120_162==FOR) && (synpred3())) {s = 62;}

                        else if ( (LA120_162==LET) && (synpred3())) {s = 63;}

                        else if ( (LA120_162==ASCENDING||LA120_162==DESCENDING) && (synpred3())) {s = 64;}

                        else if ( (LA120_162==EMPTY) && (synpred3())) {s = 65;}

                        else if ( (LA120_162==COLLATION) && (synpred3())) {s = 66;}

                        else if ( (LA120_162==SATISFIES) && (synpred3())) {s = 67;}

                        else if ( (LA120_162==DEFAULT) && (synpred3())) {s = 68;}

                        else if ( (LA120_162==CASE) && (synpred3())) {s = 69;}

                        else if ( (LA120_162==ELSE) && (synpred3())) {s = 70;}

                        else if ( (LA120_162==WITHOUT) && (synpred3())) {s = 71;}

                        else if ( (LA120_162==TIMES) && (synpred3())) {s = 72;}

                        else if ( (LA120_162==PARAGRAPHS||LA120_162==SENTENCES||LA120_162==WORDS) && (synpred3())) {s = 73;}

                        else if ( (LA120_162==LEVELS) && (synpred3())) {s = 74;}

                        else if ( (LA120_162==STARSi) ) {s = 417;}

                        else if ( ((LA120_162>=ANCESTOR && LA120_162<=ANCESTOR_OR_SELF)||LA120_162==PARENT||(LA120_162>=PRECEDING && LA120_162<=PRECEDING_SIBLING)) ) {s = 418;}

                        else if ( (LA120_162==DOTDOTSi) ) {s = 419;}

                        else if ( (LA120_162==ATTRIBUTE) ) {s = 420;}

                        else if ( (LA120_162==ATSi) ) {s = 421;}

                        else if ( (LA120_162==DOCUMENT_NODE) ) {s = 422;}

                        else if ( (LA120_162==ELEMENT) ) {s = 423;}

                        else if ( (LA120_162==CHILD||(LA120_162>=DESCENDANT && LA120_162<=DESCENDANT_OR_SELF)||(LA120_162>=FOLLOWING && LA120_162<=FOLLOWING_SIBLING)||LA120_162==SELF) ) {s = 424;}

                        else if ( (LA120_162==SCHEMAELEMENT) ) {s = 425;}

                        else if ( (LA120_162==SCHEMAATTRIBUTE) ) {s = 426;}

                        else if ( (LA120_162==PROCESSING_INSTRUCTION) ) {s = 427;}

                        else if ( (LA120_162==COMMENT) ) {s = 428;}

                        else if ( (LA120_162==TEXT) ) {s = 429;}

                        else if ( (LA120_162==NODE) ) {s = 430;}

                        else if ( (LA120_162==NCName) ) {s = 431;}

                        else if ( (LA120_162==DIV||LA120_162==IDIV||LA120_162==MOD) && (synpred3())) {s = 44;}

                        else if ( ((LA120_162>=IntegerLiteral && LA120_162<=DoubleLiteral)) ) {s = 432;}

                        else if ( (LA120_162==StringLiteral) ) {s = 433;}

                        else if ( (LA120_162==DOLLARSi) ) {s = 434;}

                        else if ( (LA120_162==LPARSi) ) {s = 435;}

                        else if ( (LA120_162==DOTSi) ) {s = 436;}

                        else if ( (LA120_162==ORDERED) ) {s = 437;}

                        else if ( (LA120_162==UNORDERED) ) {s = 438;}

                        else if ( (LA120_162==EQSi||LA120_162==NEQSi||(LA120_162>=LTOREQSi && LA120_162<=GTOREQSi)) && (synpred3())) {s = 48;}

                        else if ( (LA120_162==LCOMMENTSi) ) {s = 439;}

                        else if ( (LA120_162==LPISi) ) {s = 440;}

                        else if ( (LA120_162==DOCUMENT) ) {s = 441;}

                         
                        input.seek(index120_162);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA120_121 = input.LA(1);

                         
                        int index120_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_121);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA120_123 = input.LA(1);

                         
                        int index120_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_123);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA120_96 = input.LA(1);

                         
                        int index120_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_96);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA120_150 = input.LA(1);

                         
                        int index120_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_150);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA120_125 = input.LA(1);

                         
                        int index120_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_125);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA120_120 = input.LA(1);

                         
                        int index120_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_120);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA120_99 = input.LA(1);

                         
                        int index120_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_99);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA120_148 = input.LA(1);

                         
                        int index120_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_148);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA120_190 = input.LA(1);

                         
                        int index120_190 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA120_190==COLONSi) ) {s = 447;}

                        else if ( (LA120_190==LPARSi) && (synpred3())) {s = 448;}

                        else if ( (LA120_190==NCName||LA120_190==GTSi||LA120_190==RSELFTERMSi) ) {s = 30;}

                        else if ( (LA120_190==LBRACKSi) && (synpred3())) {s = 449;}

                        else if ( ((LA120_190>=DBLSLASHSi && LA120_190<=SLASHSi)) && (synpred3())) {s = 450;}

                        else if ( (LA120_190==CAST) && (synpred3())) {s = 451;}

                        else if ( (LA120_190==CASTABLE) && (synpred3())) {s = 452;}

                        else if ( (LA120_190==TREAT) && (synpred3())) {s = 453;}

                        else if ( (LA120_190==INSTANCE) && (synpred3())) {s = 454;}

                        else if ( (LA120_190==EXCEPT||LA120_190==INTERSECT) && (synpred3())) {s = 455;}

                        else if ( (LA120_190==UNION||LA120_190==PIPESi) && (synpred3())) {s = 456;}

                        else if ( (LA120_190==DIV||LA120_190==IDIV||LA120_190==MOD||LA120_190==STARSi) && (synpred3())) {s = 457;}

                        else if ( ((LA120_190>=PLUSSi && LA120_190<=MINUSSi)) && (synpred3())) {s = 458;}

                        else if ( (LA120_190==TO) && (synpred3())) {s = 459;}

                        else if ( (LA120_190==FTCONTAINS) && (synpred3())) {s = 460;}

                        else if ( (LA120_190==AND) && (synpred3())) {s = 50;}

                        else if ( (LA120_190==OR) && (synpred3())) {s = 51;}

                        else if ( (LA120_190==COMMASi) && (synpred3())) {s = 52;}

                        else if ( (LA120_190==EOF) && (synpred3())) {s = 53;}

                        else if ( (LA120_190==RBRACSi) && (synpred3())) {s = 461;}

                        else if ( (LA120_190==RPARSi) && (synpred3())) {s = 462;}

                        else if ( (LA120_190==RBRACKSi) && (synpred3())) {s = 56;}

                        else if ( (LA120_190==SEMICOLONSi) && (synpred3())) {s = 57;}

                        else if ( (LA120_190==WHERE) && (synpred3())) {s = 58;}

                        else if ( (LA120_190==ORDER) && (synpred3())) {s = 59;}

                        else if ( (LA120_190==STABLE) && (synpred3())) {s = 60;}

                        else if ( (LA120_190==RETURN) && (synpred3())) {s = 61;}

                        else if ( (LA120_190==FOR) && (synpred3())) {s = 62;}

                        else if ( (LA120_190==LET) && (synpred3())) {s = 63;}

                        else if ( (LA120_190==ASCENDING||LA120_190==DESCENDING) && (synpred3())) {s = 64;}

                        else if ( (LA120_190==EMPTY) && (synpred3())) {s = 65;}

                        else if ( (LA120_190==COLLATION) && (synpred3())) {s = 66;}

                        else if ( (LA120_190==SATISFIES) && (synpred3())) {s = 67;}

                        else if ( (LA120_190==DEFAULT) && (synpred3())) {s = 68;}

                        else if ( (LA120_190==CASE) && (synpred3())) {s = 69;}

                        else if ( (LA120_190==ELSE) && (synpred3())) {s = 70;}

                         
                        input.seek(index120_190);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA120_108 = input.LA(1);

                         
                        int index120_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_108);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA120_136 = input.LA(1);

                         
                        int index120_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3()) ) {s = 224;}

                        else if ( (true) ) {s = 30;}

                         
                        input.seek(index120_136);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 120, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_versionDecl_in_module522 = new BitSet(new long[]{0xC007101C1A2810C0L,0x0408B05A20110800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_libraryModule_in_module526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl563 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_separator_in_versionDecl572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_separator602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule630 = new BitSet(new long[]{0x8000000002000002L});
    public static final BitSet FOLLOW_prolog_in_libraryModule632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_moduleDecl665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_moduleDecl667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl669 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_separator_in_moduleDecl671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule733 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_queryBody_in_mainModule735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_expr805 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_expr807 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_prolog872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_setter_in_prolog876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_namespaceDecl_in_prolog880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_importStmt_in_prolog884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_separator_in_prolog899 = new BitSet(new long[]{0x8000000002000002L});
    public static final BitSet FOLLOW_varDecl_in_prolog941 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_functionDecl_in_prolog945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_optionDecl_in_prolog949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_separator_in_prolog967 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultNamespaceDecl1000 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultNamespaceDecl1002 = new BitSet(new long[]{0x0200001000000000L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_boundarySpaceDecl1157 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl1159 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultCollationDecl1185 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultCollationDecl1187 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_baseURIDecl1218 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_BASE_URI_in_baseURIDecl1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_constructionDecl1244 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl1246 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L});
    public static final BitSet FOLLOW_set_in_constructionDecl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_orderingModeDecl1276 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl1278 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_emptyOrderDecl1310 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DEFAULT_in_emptyOrderDecl1312 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl1314 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl1316 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_copyNamespacesDecl1344 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_COPY_NAMESPACES_in_copyNamespacesDecl1346 = new BitSet(new long[]{0x0000000000000000L,0x0000002000400000L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl1350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200002L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_namespaceDecl1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl1445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_namespaceDecl1447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_namespaceDecl1449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_schemaImport1509 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport1511 = new BitSet(new long[]{0x0000000004000000L,0x0000000000040000L,0x0000000000010000L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1516 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AT_in_schemaImport1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1521 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport1524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport1526 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_schemaPrefix1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_schemaPrefix1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix1568 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix1570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_moduleImport1599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L,0x0000000000010000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_moduleImport1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_moduleImport1608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1612 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_AT_in_moduleImport1615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1617 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport1620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport1622 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DECLARE_in_varDecl1658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_varDecl1664 = new BitSet(new long[]{0x0000800000000200L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl1666 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varDecl1671 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl1678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_qName1699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COLONSi_in_qName1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_qName1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration1735 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_functionDecl1766 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_functionDecl1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionDecl1772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002200000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_functionDecl1777 = new BitSet(new long[]{0x0000800000000200L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl1792 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl1794 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList1833 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_paramList1836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_param_in_paramList1838 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOLLARSi_in_param1874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_param1876 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_typeDeclaration_in_param1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_enclosedExpr1923 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_enclosedExpr1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_optionDecl2000 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl2002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_optionDecl2004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_ftOptionDecl2032 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl2034 = new BitSet(new long[]{0x0000000040010000L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions2060 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_itemType_in_sequenceType2112 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType2142 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_sequenceType2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_sequenceType2146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_itemType2195 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_itemType2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest2514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_NODE_in_documentTest2582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_documentTest2584 = new BitSet(new long[]{0x0000001000000000L,0x0000200000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest2587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest2591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_documentTest2595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest2623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_elementTest2625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000022040000L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest2628 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest2631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeName_in_elementTest2633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000012000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_elementTest2635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_elementTest2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_elementName2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_typeName2769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAELEMENT_in_schemaElementTest2794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaElementTest2796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest2798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaElementTest2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration2824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest2856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_attributeTest2858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000022040000L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest2861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_typeName_in_attributeTest2866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_attributeTest2872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard2893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_attributeName2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest2951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_schemaAttributeTest2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest2955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_schemaAttributeTest2957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest3013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_piTest3015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002050000L});
    public static final BitSet FOLLOW_set_in_piTest3017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_piTest3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest3055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_commentTest3057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_commentTest3059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest3091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_textTest3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_textTest3095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest3124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_anyKindTest3126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_anyKindTest3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle3226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle3302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr3405 = new BitSet(new long[]{0x0004000000000000L,0x0010010010000800L,0x0000000000000100L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr3409 = new BitSet(new long[]{0x0004000000000000L,0x0010010010000800L,0x0000000000000100L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr3413 = new BitSet(new long[]{0x0000000000000000L,0x0010010010000000L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr3416 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr3419 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr3421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause3453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_forClause3457 = new BitSet(new long[]{0x0000000000000A00L,0x0000400000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3459 = new BitSet(new long[]{0x0000000000000800L,0x0000400000000001L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3462 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000001L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_forClause3468 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_forClause3487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause3489 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_forClause3491 = new BitSet(new long[]{0x0000000000000A00L,0x0000400000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause3493 = new BitSet(new long[]{0x0000000000000800L,0x0000400000000001L});
    public static final BitSet FOLLOW_positionalVar_in_forClause3496 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000001L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause3499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_forClause3502 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_forClause3504 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_qName_in_varName3531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_positionalVar3562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar3564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_positionalVar3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar3597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar3599 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause3651 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_varBinding_in_letClause3653 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_letClause3656 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_varBinding_in_letClause3658 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding3673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_varBinding3677 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varBinding3679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_SCORE_in_varBinding3686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varBinding3688 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_varBinding3692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ASSIGNSi_in_varBinding3709 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_varBinding3711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_whereClause3749 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3783 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BY_in_orderByClause3785 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause3789 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause3791 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_BY_in_orderByClause3793 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3822 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList3825 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList3827 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec3860 = new BitSet(new long[]{0x0000020020100402L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec3862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier3891 = new BitSet(new long[]{0x0000020000100002L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier3901 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_set_in_orderModifier3903 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier3914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_quantifiedExpr3951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3961 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3966 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3968 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr3984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr3986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr3988 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000001L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr3990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr3993 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr3995 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr3999 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr4034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_typeswitchExpr4036 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr4038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_typeswitchExpr4040 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr4042 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr4058 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr4061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr4063 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr4067 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr4069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause4100 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000240000L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause4103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_caseClause4105 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_caseClause4107 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause4111 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause4113 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause4115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr4156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_ifExpr4158 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_ifExpr4160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_ifExpr4162 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr4164 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr4166 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr4168 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr4211 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_OR_in_orExpr4215 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_andExpr_in_orExpr4217 = new BitSet(new long[]{0x0000000000000002L,0x0000000008000000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr4252 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_AND_in_andExpr4256 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr4258 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr4292 = new BitSet(new long[]{0x1400080000000002L,0x0000000000084220L,0x000000FE00080000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr4297 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr4301 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr4305 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr4337 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr4341 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr4343 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr4381 = new BitSet(new long[]{0x0000000000000002L,0x4000000000000000L});
    public static final BitSet FOLLOW_TO_in_rangeExpr4385 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_additiveExpr4422 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr4430 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x00000000C0000000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4456 = new BitSet(new long[]{0x2000000200000002L,0x0000000000008000L,0x0000000020000000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr4460 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr4476 = new BitSet(new long[]{0x2000000200000002L,0x0000000000008000L,0x0000000020000000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4512 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000002L});
    public static final BitSet FOLLOW_set_in_unionExpr4516 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr4524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000100000002L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4551 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr4555 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr4563 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr4596 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr4600 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr4602 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr4643 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr4647 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_treatExpr4649 = new BitSet(new long[]{0x0000041800201000L,0x0400304000100040L,0x0000000000040000L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr4651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr4688 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr4692 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_castableExpr4694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_singleType_in_castableExpr4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr4738 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_CAST_in_castExpr4742 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_AS_in_castExpr4744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_singleType_in_castExpr4746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr4788 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr4797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType4836 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_QUESTIONSi_in_singleType4838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_atomicType4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption4914 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption4916 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption4918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection5096 = new BitSet(new long[]{0x0000010180000802L,0x0000020020000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection5098 = new BitSet(new long[]{0x0000010180000802L,0x0000020020000000L,0x0000000000000480L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection5102 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr5142 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_FTOR_in_ftOr5146 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr5148 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd5185 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd5189 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd5191 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot5225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot5229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_IN_in_ftMildNot5231 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot5233 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot5268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot5272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions5294 = new BitSet(new long[]{0x0000000040010002L,0x0000000004002080L,0x0000000000001808L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions5296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary5337 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary5339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftPrimary5361 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F0005010000L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary5363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_ftPrimary5365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary5386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords5440 = new BitSet(new long[]{0x0000000000000032L,0x0000000400000000L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords5442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_ftWordsValue5481 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue5483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftWordsValue5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal5529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption5602 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption5611 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption5619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes5656 = new BitSet(new long[]{0x0008200000000800L});
    public static final BitSet FOLLOW_ftRange_in_ftTimes5658 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange5699 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LEAST_in_ftRange5745 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange5790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_MOST_in_ftRange5792 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange5842 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5844 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_TO_in_ftRange5846 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange5848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection5875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_ftExtensionSelection5878 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000000L,0x00000F000D010000L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection5880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_ftExtensionSelection5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPRAGSi_in_pragma5922 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_pragma5924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000300000000000L});
    public static final BitSet FOLLOW_PragmaContents_in_pragma5926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RPRAGSi_in_pragma5929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter5992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter6000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder6032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow6063 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026CF04E1250014L,0x0000000000000009L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow6065 = new BitSet(new long[]{0x0000000000000000L,0x0002000100000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance6140 = new BitSet(new long[]{0x0008200000000800L});
    public static final BitSet FOLLOW_ftRange_in_ftDistance6142 = new BitSet(new long[]{0x0000000000000000L,0x0002000100000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance6144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope6182 = new BitSet(new long[]{0x0000000000000000L,0x0004000080000000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent6256 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_START_in_ftContent6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent6262 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_END_in_ftContent6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent6268 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption6308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWildCardOption_in_ftMatchOption6346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption6384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStemOption_in_ftMatchOption6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption6460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption6498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption6699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftWildCardOption6727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftWildCardOption6733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6758 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6760 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption6783 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_ftThesaurusOption6787 = new BitSet(new long[]{0x0000000004000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption6794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption6798 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption6800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_RPARSi_in_ftThesaurusOption6804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftThesaurusOption6843 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption6845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID6907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID6909 = new BitSet(new long[]{0x0008200000000802L,0x0000008000000000L});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID6912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID6914 = new BitSet(new long[]{0x0008200000000802L});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID6919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID6921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStemOption6966 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStemOption6972 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption7004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftCaseOption7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption7045 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftCaseOption7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption7125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption7287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftDiacriticsOption7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption7304 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftDiacriticsOption7306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7362 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7366 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption7368 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7370 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStopwordOption7386 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption7429 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption7431 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption7433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption7435 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption7437 = new BitSet(new long[]{0x0000400000000002L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList7503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList7505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_ftRefOrList7522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList7527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList7529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_RPARSi_in_ftRefOrList7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral7550 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption7592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_ftExtensionOption7594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr7664 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000100L,0x0000000004000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr7666 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_validateExpr7669 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_validateExpr7671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_validateExpr7673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_pathExpr7749 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7775 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_pathExpr7792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7830 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_set_in_relativePathExpr7833 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr7841 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr7894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep7942 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep7946 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_predicateList_in_axisStep7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep7983 = new BitSet(new long[]{0x0000001800201000L,0x0400304000100000L,0x0000000020040000L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep7985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis8020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_reverseAxis8040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest8074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_nameTest8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest8118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard8164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard8166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_wildcard8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_wildcard8238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard8240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOTSi_in_abbrevReverseStep8283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep8346 = new BitSet(new long[]{0x0000001800201000L,0x0400304000100000L,0x0000000020040000L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis8399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_DBLCOLONSi_in_forwardAxis8455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep8486 = new BitSet(new long[]{0x0000001800201000L,0x0400304000100000L,0x0000000020040000L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList8563 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_LBRACKSi_in_predicate8623 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_predicate8625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RBRACKSi_in_predicate8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr8667 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000080004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_extensionExpr8670 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E9250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_extensionExpr8672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_extensionExpr8675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr8710 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr8712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr8773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr8805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef8891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_varName_in_varRef8893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARSi_in_parenthesizedExpr8916 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E3250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr8918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_RPARSi_in_parenthesizedExpr8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTSi_in_contextItemExpr8947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_functionCall8974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_LPARSi_in_functionCall8976 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E3250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8994 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall8997 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall8999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000002100000L});
    public static final BitSet FOLLOW_RPARSi_in_functionCall9019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr9049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_orderedExpr9051 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_orderedExpr9053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_orderedExpr9055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr9083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_unorderedExpr9085 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr9087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_unorderedExpr9089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor9120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor9124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor9164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor9205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirPIConstructor_in_directConstructor9234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LTSi_in_dirElemConstructor9292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor9321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040001000040000L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor9323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040001000000000L});
    public static final BitSet FOLLOW_RSELFTERMSi_in_dirElemConstructor9353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor9382 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3080000404000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor9411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x3080000404000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_LENDTAGSi_in_dirElemConstructor9440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_qName_in_dirElemConstructor9470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_GTSi_in_dirElemConstructor9499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_qName_in_dirAttributeList9566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_EQSi_in_dirAttributeList9568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0500000000000000L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList9570 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0300000004000000L});
    public static final BitSet FOLLOW_QuotAttributeContent_in_dirAttributeValue9639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0300000004000000L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0300000004000000L});
    public static final BitSet FOLLOW_QUOTSi_in_dirAttributeValue9675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0C00000004000000L});
    public static final BitSet FOLLOW_AposAttributeContent_in_dirAttributeValue9743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0C00000004000000L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirAttributeValue9747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0C00000004000000L});
    public static final BitSet FOLLOW_APOSSi_in_dirAttributeValue9782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LBRACESi_in_xmlEnclosedExpr9823 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_xmlEnclosedExpr9851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_xmlEnclosedExpr9879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent9912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContent_in_dirElemContent9920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_xmlEnclosedExpr_in_dirElemContent9924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCDATASi_in_cDataSection9944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_CDataContents_in_cDataSection9946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_RCDATASi_in_cDataSection9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LCOMMENTSi_in_dirCommentConstructor9971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_DirCommentContent_in_dirCommentConstructor9973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RCOMMENTSi_in_dirCommentConstructor9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPISi_in_dirPIConstructor9996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PiTarget_in_dirPIConstructor9998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_DirPiContents_in_dirPIConstructor10000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RPISi_in_dirPIConstructor10003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor10029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor10070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor10111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor10152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor10234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor10262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compDocConstructor10264 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor10266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compDocConstructor10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor10297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_qName_in_compElemConstructor10300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor10304 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor10306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor10308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compElemConstructor10327 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E9250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor10329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compElemConstructor10332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr10365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor10410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_qName_in_compAttrConstructor10413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor10418 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor10420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor10422 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compAttrConstructor10442 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E9250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor10444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compAttrConstructor10447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor10483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compTextConstructor10485 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor10487 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compTextConstructor10489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor10513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compCommentConstructor10515 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor10517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compCommentConstructor10519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor10548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004040000L});
    public static final BitSet FOLLOW_NCName_in_compPIConstructor10551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10556 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E1250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_LBRACESi_in_compPIConstructor10580 = new BitSet(new long[]{0x4007101C182810C0L,0x0408B05A20100800L,0x0026CF04E9250015L,0x0000000000000009L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor10582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACSi_in_compPIConstructor10585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred12105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000070000000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred12107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DBLSLASHSi_in_synpred27743 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred27745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASHSi_in_synpred37768 = new BitSet(new long[]{0x0003001C182810C0L,0x0400B05A20100000L,0x0026070421250004L,0x0000000000000009L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred37770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred48155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred48157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NCName_in_synpred48159 = new BitSet(new long[]{0x0000000000000002L});

}