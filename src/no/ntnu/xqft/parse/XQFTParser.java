// $ANTLR 3.0.1 etc/XQFT.g 2007-10-23 14:15:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class XQFTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PIPESi", "BIGGERTHANSi", "BIGGERTHANOREQUALSi", "LESSTHANOREQUALSi", "ASCENDING", "IDIV", "WHERE", "PHRASE", "CONTENT", "VERSION", "LEFTBRACESi", "EQUALSi", "NOTEQUALSi", "STOP", "TYPESWITCH", "ANY", "BOUNDARYSPACE", "DOLLARSi", "XQUERY", "CAST", "DISTANCE", "LEFTPRAGMA", "ORDERED", "DOCUMENTNODE", "ELSE", "LESSTHANSi", "TREAT", "UPPERCASE", "ALL", "WORD", "RIGHTPRAGMA", "INHERIT", "SLASH", "ORDERING", "RIGHTPITARGET", "EVERY", "CASTABLE", "ITEM", "FOR", "INSTANCE", "DOUBLEQUOTESi", "EXCEPT", "TO", "CONSTRUCTION", "WEIGHT", "FTOPTION", "SATISFIES", "COLONSi", "SEMICOLONSi", "SINGLEQUOTE", "UNDERSCORE", "EMPTY", "MOST", "CASE", "PROCESSING_INSTRUCTION", "IMPORT", "MINUSSi", "RIGHTSELFTERMINATOR", "DOCUMENT", "LEFTCDATA", "VALIDATE", "EMPTY_SEQUENCE", "INSENSITIVE", "NOPRESERVE", "THEN", "COMMASi", "LET", "WINDOW", "SCORE", "LANGUAGE", "OPTION", "STEMMING", "RIGHTBRACKETSi", "GREATEST", "LEVELS", "SENSITIVE", "FTNOT", "DIV", "PLUSSi", "FTAND", "AT", "SCHEMAATTRIBUTE", "ORDER", "OF", "UNION", "FROM", "COLLATION", "DOUBLERIGHTBRACES", "VARIABLE", "OR", "FTOR", "DOUBLESLASH", "LEAST", "IF", "BASEURI", "DESCENDING", "STARSi", "NAMESPACE", "AS", "LEFTXMLCOMMENT", "BY", "TEXT", "STABLE", "LEFTBRACKETSi", "UNORDERED", "RIGHTCDATA", "EXACTLY", "WITH", "LEFTPITARGET", "WITHOUT", "DIACRITICS", "EXTERNAL", "RIGHTPARENTHESISSi", "RIGHTXMLCOMMENT", "MODULE", "RETURN", "COMMENT", "DEFAULT", "OCCURS", "ENCODING", "DOUBLELEFTBRACES", "SCHEMA", "ELEMENT", "LEFTPARENTHESISSi", "COPYNAMESPACES", "WILDCARDS", "DECLARE", "AND", "PRESERVE", "NOINHERIT", "NOT", "INTERSECT", "FUNCTION", "ATSi", "TIMES", "ATTRIBUTE", "ASSIGNMENTOPERATOR", "FTCONTAINS", "RELATIONSHIP", "THESAURUS", "MOD", "RIGHTBRACESi", "NODE", "SOME", "QUESTIONMARKSi", "STRIP", "LOWERCASE", "IN", "SCHEMAELEMENT", "LEFTENDTAG", "EQ", "NE", "LT", "LE", "GT", "GE", "IS", "NODEBEFORESi", "NODEAFTERSi", "LAX", "STRICT", "CHILD", "DOUBLECOLON", "DESCENDANT", "SELF", "DESCENDANT_OR_SELF", "FOLLOWING_SIBLING", "FOLLOWING", "PARENT", "ANCESTOR", "PRECEDING_SIBLING", "PRECEDING", "ANCESTOR_OR_SELF", "DOT", "DOTDOT", "WORDS", "SENTENCES", "PARAGRAPHS", "SENTENCE", "PARAGRAPH", "SAME", "DIFFERENT", "START", "END", "ENTIRE", "BaseChar", "Ideographic", "Letter", "CombiningChar", "Digit", "Extender", "Digits", "IntegerLiteral", "DecimalLiteral", "DoubleLiteral", "PredefinedEntityRef", "CharRef", "EscapeQuot", "EscapeApos", "StringLiteral", "CleanChar", "Char", "ElementContentChar", "QuotAttrContentChar", "AposAttrContentChar", "CommentCheck", "Comment", "CommentContents", "OneOrMoreChar", "NameChar", "Name", "NCName", "QName", "NCNameStartChar", "NCNameChar", "S", "ZeroOrMoreChar", "CharNotMinus"
    };
    public static final int FUNCTION=136;
    public static final int BIGGERTHANSi=5;
    public static final int BIGGERTHANOREQUALSi=6;
    public static final int MOD=144;
    public static final int NOT=134;
    public static final int EXCEPT=45;
    public static final int EOF=-1;
    public static final int LEFTPRAGMA=25;
    public static final int BaseChar=189;
    public static final int Ideographic=190;
    public static final int DISTANCE=24;
    public static final int IMPORT=59;
    public static final int ASSIGNMENTOPERATOR=140;
    public static final int SENTENCE=182;
    public static final int PRECEDING=175;
    public static final int WORDS=179;
    public static final int RETURN=119;
    public static final int ELEMENT=126;
    public static final int COPYNAMESPACES=128;
    public static final int DOLLARSi=21;
    public static final int EQ=154;
    public static final int DIACRITICS=114;
    public static final int CHILD=165;
    public static final int GE=159;
    public static final int STRICT=164;
    public static final int PRESERVE=132;
    public static final int LESSTHANSi=29;
    public static final int CommentContents=211;
    public static final int ELSE=28;
    public static final int TYPESWITCH=18;
    public static final int UNDERSCORE=54;
    public static final int STOP=17;
    public static final int CONTENT=12;
    public static final int S=219;
    public static final int FTOR=94;
    public static final int LEFTXMLCOMMENT=103;
    public static final int EMPTY=55;
    public static final int MINUSSi=60;
    public static final int INTERSECT=135;
    public static final int FTAND=83;
    public static final int LANGUAGE=73;
    public static final int LOWERCASE=150;
    public static final int INSENSITIVE=66;
    public static final int GT=158;
    public static final int CharNotMinus=221;
    public static final int END=187;
    public static final int DoubleLiteral=198;
    public static final int CharRef=200;
    public static final int OPTION=74;
    public static final int Extender=194;
    public static final int RIGHTPARENTHESISSi=116;
    public static final int OCCURS=122;
    public static final int THESAURUS=143;
    public static final int SATISFIES=50;
    public static final int VERSION=13;
    public static final int IDIV=9;
    public static final int ASCENDING=8;
    public static final int DOUBLELEFTBRACES=124;
    public static final int AT=84;
    public static final int EMPTY_SEQUENCE=65;
    public static final int AS=102;
    public static final int PARENT=172;
    public static final int CONSTRUCTION=47;
    public static final int RIGHTCDATA=109;
    public static final int SLASH=36;
    public static final int THEN=68;
    public static final int ATSi=137;
    public static final int DOCUMENT=62;
    public static final int COLLATION=90;
    public static final int SINGLEQUOTE=53;
    public static final int ANCESTOR=173;
    public static final int CleanChar=204;
    public static final int RIGHTSELFTERMINATOR=61;
    public static final int CASTABLE=40;
    public static final int MOST=56;
    public static final int BY=104;
    public static final int NODEBEFORESi=161;
    public static final int NCNameChar=218;
    public static final int QName=216;
    public static final int ITEM=41;
    public static final int TO=46;
    public static final int LEFTCDATA=63;
    public static final int INHERIT=35;
    public static final int ANCESTOR_OR_SELF=176;
    public static final int STEMMING=75;
    public static final int DOUBLEQUOTESi=44;
    public static final int EscapeApos=202;
    public static final int TEXT=105;
    public static final int FTNOT=80;
    public static final int MODULE=118;
    public static final int ORDERED=26;
    public static final int SAME=184;
    public static final int UNION=88;
    public static final int StringLiteral=203;
    public static final int FOLLOWING_SIBLING=170;
    public static final int RIGHTBRACKETSi=76;
    public static final int SCHEMA=125;
    public static final int COLONSi=51;
    public static final int ENTIRE=188;
    public static final int VALIDATE=64;
    public static final int INSTANCE=43;
    public static final int WILDCARDS=129;
    public static final int NOINHERIT=133;
    public static final int DECLARE=130;
    public static final int START=186;
    public static final int IntegerLiteral=196;
    public static final int DIV=81;
    public static final int CombiningChar=192;
    public static final int RIGHTPITARGET=38;
    public static final int DESCENDING=99;
    public static final int SELF=168;
    public static final int RIGHTBRACESi=145;
    public static final int CAST=23;
    public static final int SENTENCES=180;
    public static final int EXTERNAL=115;
    public static final int LT=156;
    public static final int RIGHTPRAGMA=34;
    public static final int CASE=57;
    public static final int EQUALSi=15;
    public static final int ENCODING=123;
    public static final int PLUSSi=82;
    public static final int DIFFERENT=185;
    public static final int SCHEMAATTRIBUTE=85;
    public static final int SEMICOLONSi=52;
    public static final int WORD=33;
    public static final int UPPERCASE=31;
    public static final int Comment=210;
    public static final int Char=205;
    public static final int Digits=195;
    public static final int LEFTBRACKETSi=107;
    public static final int QuotAttrContentChar=207;
    public static final int FTOPTION=49;
    public static final int COMMENT=120;
    public static final int NE=155;
    public static final int BOUNDARYSPACE=20;
    public static final int NODE=146;
    public static final int ZeroOrMoreChar=220;
    public static final int AposAttrContentChar=208;
    public static final int GREATEST=77;
    public static final int WITHOUT=113;
    public static final int EVERY=39;
    public static final int SENSITIVE=79;
    public static final int PROCESSING_INSTRUCTION=58;
    public static final int WEIGHT=48;
    public static final int OF=87;
    public static final int NODEAFTERSi=162;
    public static final int RELATIONSHIP=142;
    public static final int NAMESPACE=101;
    public static final int VARIABLE=92;
    public static final int LESSTHANOREQUALSi=7;
    public static final int DESCENDANT_OR_SELF=169;
    public static final int NOPRESERVE=67;
    public static final int DOUBLERIGHTBRACES=91;
    public static final int LEFTENDTAG=153;
    public static final int OR=93;
    public static final int NOTEQUALSi=16;
    public static final int STARSi=100;
    public static final int EscapeQuot=201;
    public static final int FROM=89;
    public static final int PRECEDING_SIBLING=174;
    public static final int CommentCheck=209;
    public static final int Letter=191;
    public static final int NCName=215;
    public static final int DOUBLESLASH=95;
    public static final int WHERE=10;
    public static final int LEFTPITARGET=112;
    public static final int LAX=163;
    public static final int ORDER=86;
    public static final int ATTRIBUTE=139;
    public static final int QUESTIONMARKSi=148;
    public static final int FOR=42;
    public static final int DOTDOT=178;
    public static final int AND=131;
    public static final int FOLLOWING=171;
    public static final int FTCONTAINS=141;
    public static final int IF=97;
    public static final int SCHEMAELEMENT=152;
    public static final int IN=151;
    public static final int PARAGRAPH=183;
    public static final int IS=160;
    public static final int SOME=147;
    public static final int ALL=32;
    public static final int STRIP=149;
    public static final int DOT=177;
    public static final int STABLE=106;
    public static final int PIPESi=4;
    public static final int WITH=111;
    public static final int NCNameStartChar=217;
    public static final int DOUBLECOLON=166;
    public static final int XQUERY=22;
    public static final int EXACTLY=110;
    public static final int DEFAULT=121;
    public static final int DESCENDANT=167;
    public static final int NameChar=213;
    public static final int COMMASi=69;
    public static final int RIGHTXMLCOMMENT=117;
    public static final int Digit=193;
    public static final int DecimalLiteral=197;
    public static final int BASEURI=98;
    public static final int UNORDERED=108;
    public static final int PHRASE=11;
    public static final int LEFTPARENTHESISSi=127;
    public static final int ElementContentChar=206;
    public static final int ANY=19;
    public static final int SCORE=72;
    public static final int ORDERING=37;
    public static final int PredefinedEntityRef=199;
    public static final int Name=214;
    public static final int DOCUMENTNODE=27;
    public static final int LEAST=96;
    public static final int WINDOW=71;
    public static final int LEFTBRACESi=14;
    public static final int LEVELS=78;
    public static final int TIMES=138;
    public static final int PARAGRAPHS=181;
    public static final int LET=70;
    public static final int TREAT=30;
    public static final int LE=157;
    public static final int OneOrMoreChar=212;

        public XQFTParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[183+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "etc/XQFT.g"; }



    // $ANTLR start piTarget
    // etc/XQFT.g:287:1: piTarget : n= Name {...}?;
    public final void piTarget() throws RecognitionException {
        Token n=null;

        try {
            // etc/XQFT.g:287:21: (n= Name {...}?)
            // etc/XQFT.g:287:23: n= Name {...}?
            {
            n=(Token)input.LT(1);
            match(input,Name,FOLLOW_Name_in_piTarget3858); if (failed) return ;
            if ( !( !n.getText().equalsIgnoreCase("XML") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "piTarget", " !$n.getText().equalsIgnoreCase(\"XML\") ");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end piTarget


    // $ANTLR start module
    // etc/XQFT.g:330:1: module : ( versionDecl )? ( libraryModule | mainModule ) ;
    public final void module() throws RecognitionException {
        try {
            // etc/XQFT.g:330:29: ( ( versionDecl )? ( libraryModule | mainModule ) )
            // etc/XQFT.g:330:31: ( versionDecl )? ( libraryModule | mainModule )
            {
            // etc/XQFT.g:330:31: ( versionDecl )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==XQUERY) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // etc/XQFT.g:330:31: versionDecl
                    {
                    pushFollow(FOLLOW_versionDecl_in_module4211);
                    versionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:330:44: ( libraryModule | mainModule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==MODULE) ) {
                alt2=1;
            }
            else if ( (LA2_0==TYPESWITCH||LA2_0==DOLLARSi||(LA2_0>=LEFTPRAGMA && LA2_0<=DOCUMENTNODE)||LA2_0==LESSTHANSi||LA2_0==SLASH||LA2_0==EVERY||LA2_0==FOR||(LA2_0>=PROCESSING_INSTRUCTION && LA2_0<=MINUSSi)||LA2_0==DOCUMENT||LA2_0==VALIDATE||LA2_0==LET||LA2_0==PLUSSi||LA2_0==SCHEMAATTRIBUTE||LA2_0==DOUBLESLASH||LA2_0==IF||LA2_0==STARSi||LA2_0==LEFTXMLCOMMENT||LA2_0==TEXT||LA2_0==UNORDERED||LA2_0==LEFTPITARGET||LA2_0==COMMENT||(LA2_0>=ELEMENT && LA2_0<=LEFTPARENTHESISSi)||LA2_0==DECLARE||LA2_0==ATSi||LA2_0==ATTRIBUTE||(LA2_0>=NODE && LA2_0<=SOME)||LA2_0==SCHEMAELEMENT||LA2_0==CHILD||(LA2_0>=DESCENDANT && LA2_0<=DOTDOT)||(LA2_0>=IntegerLiteral && LA2_0<=DoubleLiteral)||LA2_0==StringLiteral||(LA2_0>=NCName && LA2_0<=QName)) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("330:44: ( libraryModule | mainModule )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // etc/XQFT.g:330:45: libraryModule
                    {
                    pushFollow(FOLLOW_libraryModule_in_module4215);
                    libraryModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:330:61: mainModule
                    {
                    pushFollow(FOLLOW_mainModule_in_module4219);
                    mainModule();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end module


    // $ANTLR start versionDecl
    // etc/XQFT.g:332:1: versionDecl : XQUERY VERSION StringLiteral ( ( ENCODING StringLiteral ) | ) separator ;
    public final void versionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:332:29: ( XQUERY VERSION StringLiteral ( ( ENCODING StringLiteral ) | ) separator )
            // etc/XQFT.g:332:31: XQUERY VERSION StringLiteral ( ( ENCODING StringLiteral ) | ) separator
            {
            match(input,XQUERY,FOLLOW_XQUERY_in_versionDecl4244); if (failed) return ;
            match(input,VERSION,FOLLOW_VERSION_in_versionDecl4246); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl4248); if (failed) return ;
            // etc/XQFT.g:332:60: ( ( ENCODING StringLiteral ) | )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ENCODING) ) {
                alt3=1;
            }
            else if ( (LA3_0==SEMICOLONSi) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("332:60: ( ( ENCODING StringLiteral ) | )", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // etc/XQFT.g:332:61: ( ENCODING StringLiteral )
                    {
                    // etc/XQFT.g:332:61: ( ENCODING StringLiteral )
                    // etc/XQFT.g:332:62: ENCODING StringLiteral
                    {
                    match(input,ENCODING,FOLLOW_ENCODING_in_versionDecl4252); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_versionDecl4254); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:332:86: 
                    {
                    }
                    break;

            }

            pushFollow(FOLLOW_separator_in_versionDecl4259);
            separator();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end versionDecl


    // $ANTLR start mainModule
    // etc/XQFT.g:334:1: mainModule : prolog queryBody ;
    public final void mainModule() throws RecognitionException {
        try {
            // etc/XQFT.g:334:29: ( prolog queryBody )
            // etc/XQFT.g:334:31: prolog queryBody
            {
            pushFollow(FOLLOW_prolog_in_mainModule4284);
            prolog();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_queryBody_in_mainModule4286);
            queryBody();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end mainModule


    // $ANTLR start libraryModule
    // etc/XQFT.g:336:1: libraryModule : moduleDecl prolog ;
    public final void libraryModule() throws RecognitionException {
        try {
            // etc/XQFT.g:336:29: ( moduleDecl prolog )
            // etc/XQFT.g:336:31: moduleDecl prolog
            {
            pushFollow(FOLLOW_moduleDecl_in_libraryModule4308);
            moduleDecl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_prolog_in_libraryModule4310);
            prolog();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end libraryModule


    // $ANTLR start moduleDecl
    // etc/XQFT.g:338:1: moduleDecl : MODULE NAMESPACE NCName EQUALSi uriLiteral separator ;
    public final void moduleDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:338:29: ( MODULE NAMESPACE NCName EQUALSi uriLiteral separator )
            // etc/XQFT.g:338:31: MODULE NAMESPACE NCName EQUALSi uriLiteral separator
            {
            match(input,MODULE,FOLLOW_MODULE_in_moduleDecl4335); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleDecl4337); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_moduleDecl4339); if (failed) return ;
            match(input,EQUALSi,FOLLOW_EQUALSi_in_moduleDecl4341); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_moduleDecl4343);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_separator_in_moduleDecl4345);
            separator();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end moduleDecl


    // $ANTLR start prolog
    // etc/XQFT.g:340:1: prolog : ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* ;
    public final void prolog() throws RecognitionException {
        try {
            // etc/XQFT.g:340:29: ( ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )* )
            // etc/XQFT.g:340:31: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )* ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            {
            // etc/XQFT.g:340:31: ( ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==DECLARE) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==BOUNDARYSPACE||LA5_1==ORDERING||LA5_1==CONSTRUCTION||LA5_1==BASEURI||LA5_1==NAMESPACE||LA5_1==DEFAULT||LA5_1==COPYNAMESPACES) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==IMPORT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // etc/XQFT.g:340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt ) separator
            	    {
            	    // etc/XQFT.g:340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )
            	    int alt4=4;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case DEFAULT:
            	            {
            	            int LA4_3 = input.LA(3);

            	            if ( (LA4_3==ORDER||LA4_3==COLLATION) ) {
            	                alt4=2;
            	            }
            	            else if ( (LA4_3==ELEMENT||LA4_3==FUNCTION) ) {
            	                alt4=1;
            	            }
            	            else {
            	                if (backtracking>0) {failed=true; return ;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 4, 3, input);

            	                throw nvae;
            	            }
            	            }
            	            break;
            	        case BOUNDARYSPACE:
            	        case ORDERING:
            	        case CONSTRUCTION:
            	        case BASEURI:
            	        case COPYNAMESPACES:
            	            {
            	            alt4=2;
            	            }
            	            break;
            	        case NAMESPACE:
            	            {
            	            alt4=3;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 4, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else if ( (LA4_0==IMPORT) ) {
            	        alt4=4;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("340:32: ( defaultNamespaceDecl | setter | namespaceDecl | importStmt )", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // etc/XQFT.g:340:33: defaultNamespaceDecl
            	            {
            	            pushFollow(FOLLOW_defaultNamespaceDecl_in_prolog4376);
            	            defaultNamespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:340:56: setter
            	            {
            	            pushFollow(FOLLOW_setter_in_prolog4380);
            	            setter();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:340:65: namespaceDecl
            	            {
            	            pushFollow(FOLLOW_namespaceDecl_in_prolog4384);
            	            namespaceDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:340:81: importStmt
            	            {
            	            pushFollow(FOLLOW_importStmt_in_prolog4388);
            	            importStmt();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog4391);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // etc/XQFT.g:340:105: ( ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==DECLARE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // etc/XQFT.g:340:106: ( varDecl | functionDecl | optionDecl | ftOptionDecl ) separator
            	    {
            	    // etc/XQFT.g:340:106: ( varDecl | functionDecl | optionDecl | ftOptionDecl )
            	    int alt6=4;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==DECLARE) ) {
            	        switch ( input.LA(2) ) {
            	        case OPTION:
            	            {
            	            alt6=3;
            	            }
            	            break;
            	        case VARIABLE:
            	            {
            	            alt6=1;
            	            }
            	            break;
            	        case FUNCTION:
            	            {
            	            alt6=2;
            	            }
            	            break;
            	        case FTOPTION:
            	            {
            	            alt6=4;
            	            }
            	            break;
            	        default:
            	            if (backtracking>0) {failed=true; return ;}
            	            NoViableAltException nvae =
            	                new NoViableAltException("340:106: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 6, 1, input);

            	            throw nvae;
            	        }

            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("340:106: ( varDecl | functionDecl | optionDecl | ftOptionDecl )", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // etc/XQFT.g:340:107: varDecl
            	            {
            	            pushFollow(FOLLOW_varDecl_in_prolog4397);
            	            varDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:340:117: functionDecl
            	            {
            	            pushFollow(FOLLOW_functionDecl_in_prolog4401);
            	            functionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 3 :
            	            // etc/XQFT.g:340:132: optionDecl
            	            {
            	            pushFollow(FOLLOW_optionDecl_in_prolog4405);
            	            optionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;
            	        case 4 :
            	            // etc/XQFT.g:340:145: ftOptionDecl
            	            {
            	            pushFollow(FOLLOW_ftOptionDecl_in_prolog4409);
            	            ftOptionDecl();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_separator_in_prolog4412);
            	    separator();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end prolog


    // $ANTLR start setter
    // etc/XQFT.g:342:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );
    public final void setter() throws RecognitionException {
        try {
            // etc/XQFT.g:342:29: ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl )
            int alt8=7;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==DECLARE) ) {
                switch ( input.LA(2) ) {
                case ORDERING:
                    {
                    alt8=5;
                    }
                    break;
                case COPYNAMESPACES:
                    {
                    alt8=7;
                    }
                    break;
                case DEFAULT:
                    {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==ORDER) ) {
                        alt8=6;
                    }
                    else if ( (LA8_4==COLLATION) ) {
                        alt8=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("342:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 8, 4, input);

                        throw nvae;
                    }
                    }
                    break;
                case CONSTRUCTION:
                    {
                    alt8=4;
                    }
                    break;
                case BASEURI:
                    {
                    alt8=3;
                    }
                    break;
                case BOUNDARYSPACE:
                    {
                    alt8=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("342:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("342:1: setter : ( boundarySpaceDecl | defaultCollationDecl | baseURIDecl | constructionDecl | orderingModeDecl | emptyOrderDecl | copyNamespacesDecl );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // etc/XQFT.g:342:31: boundarySpaceDecl
                    {
                    pushFollow(FOLLOW_boundarySpaceDecl_in_setter4443);
                    boundarySpaceDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:342:51: defaultCollationDecl
                    {
                    pushFollow(FOLLOW_defaultCollationDecl_in_setter4447);
                    defaultCollationDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:342:74: baseURIDecl
                    {
                    pushFollow(FOLLOW_baseURIDecl_in_setter4451);
                    baseURIDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:342:88: constructionDecl
                    {
                    pushFollow(FOLLOW_constructionDecl_in_setter4455);
                    constructionDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:342:107: orderingModeDecl
                    {
                    pushFollow(FOLLOW_orderingModeDecl_in_setter4459);
                    orderingModeDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:342:126: emptyOrderDecl
                    {
                    pushFollow(FOLLOW_emptyOrderDecl_in_setter4463);
                    emptyOrderDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:342:143: copyNamespacesDecl
                    {
                    pushFollow(FOLLOW_copyNamespacesDecl_in_setter4467);
                    copyNamespacesDecl();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end setter


    // $ANTLR start importStmt
    // etc/XQFT.g:345:1: importStmt : ( schemaImport | moduleImport );
    public final void importStmt() throws RecognitionException {
        try {
            // etc/XQFT.g:345:29: ( schemaImport | moduleImport )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==IMPORT) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==MODULE) ) {
                    alt9=2;
                }
                else if ( (LA9_1==SCHEMA) ) {
                    alt9=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("345:1: importStmt : ( schemaImport | moduleImport );", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("345:1: importStmt : ( schemaImport | moduleImport );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // etc/XQFT.g:345:31: schemaImport
                    {
                    pushFollow(FOLLOW_schemaImport_in_importStmt4494);
                    schemaImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:345:46: moduleImport
                    {
                    pushFollow(FOLLOW_moduleImport_in_importStmt4498);
                    moduleImport();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end importStmt


    // $ANTLR start separator
    // etc/XQFT.g:347:1: separator : SEMICOLONSi ;
    public final void separator() throws RecognitionException {
        try {
            // etc/XQFT.g:347:29: ( SEMICOLONSi )
            // etc/XQFT.g:347:31: SEMICOLONSi
            {
            match(input,SEMICOLONSi,FOLLOW_SEMICOLONSi_in_separator4524); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end separator


    // $ANTLR start namespaceDecl
    // etc/XQFT.g:349:1: namespaceDecl : DECLARE NAMESPACE NCName EQUALSi uriLiteral ;
    public final void namespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:349:29: ( DECLARE NAMESPACE NCName EQUALSi uriLiteral )
            // etc/XQFT.g:349:31: DECLARE NAMESPACE NCName EQUALSi uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_namespaceDecl4546); if (failed) return ;
            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_namespaceDecl4548); if (failed) return ;
            match(input,NCName,FOLLOW_NCName_in_namespaceDecl4550); if (failed) return ;
            match(input,EQUALSi,FOLLOW_EQUALSi_in_namespaceDecl4552); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_namespaceDecl4554);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end namespaceDecl


    // $ANTLR start boundarySpaceDecl
    // etc/XQFT.g:351:1: boundarySpaceDecl : DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) ;
    public final void boundarySpaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:351:29: ( DECLARE BOUNDARYSPACE ( PRESERVE | STRIP ) )
            // etc/XQFT.g:351:31: DECLARE BOUNDARYSPACE ( PRESERVE | STRIP )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_boundarySpaceDecl4572); if (failed) return ;
            match(input,BOUNDARYSPACE,FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl4574); if (failed) return ;
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_boundarySpaceDecl4576);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end boundarySpaceDecl


    // $ANTLR start defaultNamespaceDecl
    // etc/XQFT.g:353:1: defaultNamespaceDecl : DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral ;
    public final void defaultNamespaceDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:353:29: ( DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral )
            // etc/XQFT.g:353:31: DECLARE DEFAULT ( ELEMENT | FUNCTION ) NAMESPACE uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultNamespaceDecl4597); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultNamespaceDecl4599); if (failed) return ;
            if ( input.LA(1)==ELEMENT||input.LA(1)==FUNCTION ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultNamespaceDecl4601);    throw mse;
            }

            match(input,NAMESPACE,FOLLOW_NAMESPACE_in_defaultNamespaceDecl4609); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultNamespaceDecl4611);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultNamespaceDecl


    // $ANTLR start optionDecl
    // etc/XQFT.g:355:1: optionDecl : DECLARE OPTION QName StringLiteral ;
    public final void optionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:355:29: ( DECLARE OPTION QName StringLiteral )
            // etc/XQFT.g:355:31: DECLARE OPTION QName StringLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_optionDecl4636); if (failed) return ;
            match(input,OPTION,FOLLOW_OPTION_in_optionDecl4638); if (failed) return ;
            match(input,QName,FOLLOW_QName_in_optionDecl4640); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_optionDecl4642); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end optionDecl


    // $ANTLR start ftOptionDecl
    // etc/XQFT.g:357:1: ftOptionDecl : DECLARE FTOPTION ftMatchOptions ;
    public final void ftOptionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:357:29: ( DECLARE FTOPTION ftMatchOptions )
            // etc/XQFT.g:357:31: DECLARE FTOPTION ftMatchOptions
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_ftOptionDecl4665); if (failed) return ;
            match(input,FTOPTION,FOLLOW_FTOPTION_in_ftOptionDecl4667); if (failed) return ;
            pushFollow(FOLLOW_ftMatchOptions_in_ftOptionDecl4669);
            ftMatchOptions();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOptionDecl


    // $ANTLR start orderingModeDecl
    // etc/XQFT.g:359:1: orderingModeDecl : DECLARE ORDERING ( ORDERED | UNORDERED ) ;
    public final void orderingModeDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:359:29: ( DECLARE ORDERING ( ORDERED | UNORDERED ) )
            // etc/XQFT.g:359:31: DECLARE ORDERING ( ORDERED | UNORDERED )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_orderingModeDecl4688); if (failed) return ;
            match(input,ORDERING,FOLLOW_ORDERING_in_orderingModeDecl4690); if (failed) return ;
            if ( input.LA(1)==ORDERED||input.LA(1)==UNORDERED ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderingModeDecl4692);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderingModeDecl


    // $ANTLR start emptyOrderDecl
    // etc/XQFT.g:361:1: emptyOrderDecl : DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) ;
    public final void emptyOrderDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:361:29: ( DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST ) )
            // etc/XQFT.g:361:31: DECLARE DEFAULT ORDER EMPTY ( GREATEST | LEAST )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_emptyOrderDecl4719); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_emptyOrderDecl4721); if (failed) return ;
            match(input,ORDER,FOLLOW_ORDER_in_emptyOrderDecl4723); if (failed) return ;
            match(input,EMPTY,FOLLOW_EMPTY_in_emptyOrderDecl4725); if (failed) return ;
            if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_emptyOrderDecl4727);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end emptyOrderDecl


    // $ANTLR start copyNamespacesDecl
    // etc/XQFT.g:363:1: copyNamespacesDecl : DECLARE COPYNAMESPACES preserveMode COMMASi inheritMode ;
    public final void copyNamespacesDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:363:29: ( DECLARE COPYNAMESPACES preserveMode COMMASi inheritMode )
            // etc/XQFT.g:363:31: DECLARE COPYNAMESPACES preserveMode COMMASi inheritMode
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_copyNamespacesDecl4750); if (failed) return ;
            match(input,COPYNAMESPACES,FOLLOW_COPYNAMESPACES_in_copyNamespacesDecl4752); if (failed) return ;
            pushFollow(FOLLOW_preserveMode_in_copyNamespacesDecl4754);
            preserveMode();
            _fsp--;
            if (failed) return ;
            match(input,COMMASi,FOLLOW_COMMASi_in_copyNamespacesDecl4756); if (failed) return ;
            pushFollow(FOLLOW_inheritMode_in_copyNamespacesDecl4758);
            inheritMode();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end copyNamespacesDecl


    // $ANTLR start preserveMode
    // etc/XQFT.g:365:1: preserveMode : ( PRESERVE | NOPRESERVE );
    public final void preserveMode() throws RecognitionException {
        try {
            // etc/XQFT.g:365:29: ( PRESERVE | NOPRESERVE )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end preserveMode


    // $ANTLR start inheritMode
    // etc/XQFT.g:367:1: inheritMode : ( INHERIT | NOINHERIT );
    public final void inheritMode() throws RecognitionException {
        try {
            // etc/XQFT.g:367:29: ( INHERIT | NOINHERIT )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end inheritMode


    // $ANTLR start defaultCollationDecl
    // etc/XQFT.g:369:1: defaultCollationDecl : DECLARE DEFAULT COLLATION uriLiteral ;
    public final void defaultCollationDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:369:29: ( DECLARE DEFAULT COLLATION uriLiteral )
            // etc/XQFT.g:369:31: DECLARE DEFAULT COLLATION uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_defaultCollationDecl4828); if (failed) return ;
            match(input,DEFAULT,FOLLOW_DEFAULT_in_defaultCollationDecl4830); if (failed) return ;
            match(input,COLLATION,FOLLOW_COLLATION_in_defaultCollationDecl4832); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_defaultCollationDecl4834);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end defaultCollationDecl


    // $ANTLR start baseURIDecl
    // etc/XQFT.g:371:1: baseURIDecl : DECLARE BASEURI uriLiteral ;
    public final void baseURIDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:371:29: ( DECLARE BASEURI uriLiteral )
            // etc/XQFT.g:371:31: DECLARE BASEURI uriLiteral
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_baseURIDecl4858); if (failed) return ;
            match(input,BASEURI,FOLLOW_BASEURI_in_baseURIDecl4860); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_baseURIDecl4862);
            uriLiteral();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end baseURIDecl


    // $ANTLR start schemaImport
    // etc/XQFT.g:373:1: schemaImport : IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void schemaImport() throws RecognitionException {
        try {
            // etc/XQFT.g:373:29: ( IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:373:31: IMPORT SCHEMA ( schemaPrefix )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_schemaImport4885); if (failed) return ;
            match(input,SCHEMA,FOLLOW_SCHEMA_in_schemaImport4887); if (failed) return ;
            // etc/XQFT.g:373:45: ( schemaPrefix )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==NAMESPACE||LA10_0==DEFAULT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // etc/XQFT.g:373:45: schemaPrefix
                    {
                    pushFollow(FOLLOW_schemaPrefix_in_schemaImport4889);
                    schemaPrefix();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_schemaImport4892);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:373:70: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==AT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // etc/XQFT.g:373:71: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_schemaImport4895); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_schemaImport4897);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:373:85: ( COMMASi uriLiteral )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMASi) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // etc/XQFT.g:373:86: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_schemaImport4900); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_schemaImport4902);
                    	    uriLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaImport


    // $ANTLR start schemaPrefix
    // etc/XQFT.g:375:1: schemaPrefix : ( ( NAMESPACE NCName EQUALSi ) | ( DEFAULT ELEMENT NAMESPACE ) );
    public final void schemaPrefix() throws RecognitionException {
        try {
            // etc/XQFT.g:375:29: ( ( NAMESPACE NCName EQUALSi ) | ( DEFAULT ELEMENT NAMESPACE ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NAMESPACE) ) {
                alt13=1;
            }
            else if ( (LA13_0==DEFAULT) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("375:1: schemaPrefix : ( ( NAMESPACE NCName EQUALSi ) | ( DEFAULT ELEMENT NAMESPACE ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // etc/XQFT.g:375:31: ( NAMESPACE NCName EQUALSi )
                    {
                    // etc/XQFT.g:375:31: ( NAMESPACE NCName EQUALSi )
                    // etc/XQFT.g:375:32: NAMESPACE NCName EQUALSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix4930); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_schemaPrefix4932); if (failed) return ;
                    match(input,EQUALSi,FOLLOW_EQUALSi_in_schemaPrefix4934); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:375:60: ( DEFAULT ELEMENT NAMESPACE )
                    {
                    // etc/XQFT.g:375:60: ( DEFAULT ELEMENT NAMESPACE )
                    // etc/XQFT.g:375:61: DEFAULT ELEMENT NAMESPACE
                    {
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_schemaPrefix4940); if (failed) return ;
                    match(input,ELEMENT,FOLLOW_ELEMENT_in_schemaPrefix4942); if (failed) return ;
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_schemaPrefix4944); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaPrefix


    // $ANTLR start moduleImport
    // etc/XQFT.g:377:1: moduleImport : IMPORT MODULE ( NAMESPACE NCName EQUALSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? ;
    public final void moduleImport() throws RecognitionException {
        try {
            // etc/XQFT.g:377:29: ( IMPORT MODULE ( NAMESPACE NCName EQUALSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )? )
            // etc/XQFT.g:377:31: IMPORT MODULE ( NAMESPACE NCName EQUALSi )? uriLiteral ( AT uriLiteral ( COMMASi uriLiteral )* )?
            {
            match(input,IMPORT,FOLLOW_IMPORT_in_moduleImport4968); if (failed) return ;
            match(input,MODULE,FOLLOW_MODULE_in_moduleImport4970); if (failed) return ;
            // etc/XQFT.g:377:45: ( NAMESPACE NCName EQUALSi )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NAMESPACE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // etc/XQFT.g:377:46: NAMESPACE NCName EQUALSi
                    {
                    match(input,NAMESPACE,FOLLOW_NAMESPACE_in_moduleImport4973); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_moduleImport4975); if (failed) return ;
                    match(input,EQUALSi,FOLLOW_EQUALSi_in_moduleImport4977); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_uriLiteral_in_moduleImport4981);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:377:84: ( AT uriLiteral ( COMMASi uriLiteral )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==AT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // etc/XQFT.g:377:85: AT uriLiteral ( COMMASi uriLiteral )*
                    {
                    match(input,AT,FOLLOW_AT_in_moduleImport4984); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_moduleImport4986);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:377:99: ( COMMASi uriLiteral )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMASi) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // etc/XQFT.g:377:100: COMMASi uriLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_moduleImport4989); if (failed) return ;
                    	    pushFollow(FOLLOW_uriLiteral_in_moduleImport4991);
                    	    uriLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end moduleImport


    // $ANTLR start varDecl
    // etc/XQFT.g:379:1: varDecl : DECLARE VARIABLE DOLLARSi QName ( typeDeclaration )? ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL ) ;
    public final void varDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:379:29: ( DECLARE VARIABLE DOLLARSi QName ( typeDeclaration )? ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL ) )
            // etc/XQFT.g:379:31: DECLARE VARIABLE DOLLARSi QName ( typeDeclaration )? ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_varDecl5023); if (failed) return ;
            match(input,VARIABLE,FOLLOW_VARIABLE_in_varDecl5025); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varDecl5027); if (failed) return ;
            match(input,QName,FOLLOW_QName_in_varDecl5029); if (failed) return ;
            // etc/XQFT.g:379:63: ( typeDeclaration )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==AS) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // etc/XQFT.g:379:63: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_varDecl5031);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:379:80: ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ASSIGNMENTOPERATOR) ) {
                alt18=1;
            }
            else if ( (LA18_0==EXTERNAL) ) {
                alt18=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("379:80: ( ( ASSIGNMENTOPERATOR exprSingle ) | EXTERNAL )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // etc/XQFT.g:379:81: ( ASSIGNMENTOPERATOR exprSingle )
                    {
                    // etc/XQFT.g:379:81: ( ASSIGNMENTOPERATOR exprSingle )
                    // etc/XQFT.g:379:82: ASSIGNMENTOPERATOR exprSingle
                    {
                    match(input,ASSIGNMENTOPERATOR,FOLLOW_ASSIGNMENTOPERATOR_in_varDecl5036); if (failed) return ;
                    pushFollow(FOLLOW_exprSingle_in_varDecl5038);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:379:115: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_varDecl5043); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end varDecl


    // $ANTLR start constructionDecl
    // etc/XQFT.g:381:1: constructionDecl : DECLARE CONSTRUCTION ( STRIP | PRESERVE ) ;
    public final void constructionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:381:29: ( DECLARE CONSTRUCTION ( STRIP | PRESERVE ) )
            // etc/XQFT.g:381:31: DECLARE CONSTRUCTION ( STRIP | PRESERVE )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_constructionDecl5063); if (failed) return ;
            match(input,CONSTRUCTION,FOLLOW_CONSTRUCTION_in_constructionDecl5065); if (failed) return ;
            if ( input.LA(1)==PRESERVE||input.LA(1)==STRIP ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constructionDecl5067);    throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end constructionDecl


    // $ANTLR start functionDecl
    // etc/XQFT.g:383:1: functionDecl : DECLARE FUNCTION QName LEFTPARENTHESISSi ( paramList )? RIGHTPARENTHESISSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) ;
    public final void functionDecl() throws RecognitionException {
        try {
            // etc/XQFT.g:383:29: ( DECLARE FUNCTION QName LEFTPARENTHESISSi ( paramList )? RIGHTPARENTHESISSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL ) )
            // etc/XQFT.g:383:31: DECLARE FUNCTION QName LEFTPARENTHESISSi ( paramList )? RIGHTPARENTHESISSi ( AS sequenceType )? ( enclosedExpr | EXTERNAL )
            {
            match(input,DECLARE,FOLLOW_DECLARE_in_functionDecl5096); if (failed) return ;
            match(input,FUNCTION,FOLLOW_FUNCTION_in_functionDecl5098); if (failed) return ;
            match(input,QName,FOLLOW_QName_in_functionDecl5100); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_functionDecl5102); if (failed) return ;
            // etc/XQFT.g:383:72: ( paramList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==DOLLARSi) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // etc/XQFT.g:383:72: paramList
                    {
                    pushFollow(FOLLOW_paramList_in_functionDecl5104);
                    paramList();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_functionDecl5107); if (failed) return ;
            // etc/XQFT.g:383:102: ( AS sequenceType )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==AS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // etc/XQFT.g:383:103: AS sequenceType
                    {
                    match(input,AS,FOLLOW_AS_in_functionDecl5110); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_functionDecl5112);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:383:121: ( enclosedExpr | EXTERNAL )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LEFTBRACESi) ) {
                alt21=1;
            }
            else if ( (LA21_0==EXTERNAL) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("383:121: ( enclosedExpr | EXTERNAL )", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // etc/XQFT.g:383:122: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_functionDecl5117);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:383:137: EXTERNAL
                    {
                    match(input,EXTERNAL,FOLLOW_EXTERNAL_in_functionDecl5121); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end functionDecl


    // $ANTLR start paramList
    // etc/XQFT.g:385:1: paramList : param ( COMMASi param )* ;
    public final void paramList() throws RecognitionException {
        try {
            // etc/XQFT.g:385:29: ( param ( COMMASi param )* )
            // etc/XQFT.g:385:31: param ( COMMASi param )*
            {
            pushFollow(FOLLOW_param_in_paramList5148);
            param();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:385:37: ( COMMASi param )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==COMMASi) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // etc/XQFT.g:385:38: COMMASi param
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_paramList5151); if (failed) return ;
            	    pushFollow(FOLLOW_param_in_paramList5153);
            	    param();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end paramList


    // $ANTLR start param
    // etc/XQFT.g:387:1: param : DOLLARSi QName ( typeDeclaration )? ;
    public final void param() throws RecognitionException {
        try {
            // etc/XQFT.g:387:29: ( DOLLARSi QName ( typeDeclaration )? )
            // etc/XQFT.g:387:31: DOLLARSi QName ( typeDeclaration )?
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_param5185); if (failed) return ;
            match(input,QName,FOLLOW_QName_in_param5187); if (failed) return ;
            // etc/XQFT.g:387:46: ( typeDeclaration )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==AS) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // etc/XQFT.g:387:46: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_param5189);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end param


    // $ANTLR start enclosedExpr
    // etc/XQFT.g:389:1: enclosedExpr : LEFTBRACESi expr RIGHTBRACESi ;
    public final void enclosedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:389:29: ( LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:389:31: LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_enclosedExpr5213); if (failed) return ;
            pushFollow(FOLLOW_expr_in_enclosedExpr5215);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_enclosedExpr5217); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end enclosedExpr


    // $ANTLR start queryBody
    // etc/XQFT.g:391:1: queryBody : expr ;
    public final void queryBody() throws RecognitionException {
        try {
            // etc/XQFT.g:391:29: ( expr )
            // etc/XQFT.g:391:31: expr
            {
            pushFollow(FOLLOW_expr_in_queryBody5243);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end queryBody


    // $ANTLR start expr
    // etc/XQFT.g:393:1: expr : exprSingle ( COMMASi exprSingle )* ;
    public final void expr() throws RecognitionException {
        try {
            // etc/XQFT.g:393:29: ( exprSingle ( COMMASi exprSingle )* )
            // etc/XQFT.g:393:31: exprSingle ( COMMASi exprSingle )*
            {
            pushFollow(FOLLOW_exprSingle_in_expr5274);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:393:42: ( COMMASi exprSingle )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==COMMASi) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // etc/XQFT.g:393:43: COMMASi exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_expr5277); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_expr5279);
            	    exprSingle();
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end expr


    // $ANTLR start exprSingle
    // etc/XQFT.g:395:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );
    public final void exprSingle() throws RecognitionException {
        try {
            // etc/XQFT.g:395:29: ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr )
            int alt25=5;
            switch ( input.LA(1) ) {
            case FOR:
            case LET:
                {
                alt25=1;
                }
                break;
            case EVERY:
            case SOME:
                {
                alt25=2;
                }
                break;
            case TYPESWITCH:
                {
                alt25=3;
                }
                break;
            case IF:
                {
                alt25=4;
                }
                break;
            case DOLLARSi:
            case LEFTPRAGMA:
            case ORDERED:
            case DOCUMENTNODE:
            case LESSTHANSi:
            case SLASH:
            case PROCESSING_INSTRUCTION:
            case MINUSSi:
            case DOCUMENT:
            case VALIDATE:
            case PLUSSi:
            case SCHEMAATTRIBUTE:
            case DOUBLESLASH:
            case STARSi:
            case LEFTXMLCOMMENT:
            case TEXT:
            case UNORDERED:
            case LEFTPITARGET:
            case COMMENT:
            case ELEMENT:
            case LEFTPARENTHESISSi:
            case ATSi:
            case ATTRIBUTE:
            case NODE:
            case SCHEMAELEMENT:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOT:
            case DOTDOT:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
            case NCName:
            case QName:
                {
                alt25=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("395:1: exprSingle : ( fLWORExpr | quantifiedExpr | typeswitchExpr | ifExpr | orExpr );", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // etc/XQFT.g:395:31: fLWORExpr
                    {
                    pushFollow(FOLLOW_fLWORExpr_in_exprSingle5306);
                    fLWORExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:396:35: quantifiedExpr
                    {
                    pushFollow(FOLLOW_quantifiedExpr_in_exprSingle5342);
                    quantifiedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:397:35: typeswitchExpr
                    {
                    pushFollow(FOLLOW_typeswitchExpr_in_exprSingle5378);
                    typeswitchExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:398:35: ifExpr
                    {
                    pushFollow(FOLLOW_ifExpr_in_exprSingle5414);
                    ifExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:399:35: orExpr
                    {
                    pushFollow(FOLLOW_orExpr_in_exprSingle5450);
                    orExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end exprSingle


    // $ANTLR start fLWORExpr
    // etc/XQFT.g:401:1: fLWORExpr : ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle ;
    public final void fLWORExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:401:29: ( ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle )
            // etc/XQFT.g:401:31: ( forClause | letClause )+ ( whereClause )? ( orderByClause )? RETURN exprSingle
            {
            // etc/XQFT.g:401:31: ( forClause | letClause )+
            int cnt26=0;
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==FOR) ) {
                    alt26=1;
                }
                else if ( (LA26_0==LET) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // etc/XQFT.g:401:32: forClause
            	    {
            	    pushFollow(FOLLOW_forClause_in_fLWORExpr5477);
            	    forClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:401:44: letClause
            	    {
            	    pushFollow(FOLLOW_letClause_in_fLWORExpr5481);
            	    letClause();
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

            // etc/XQFT.g:401:56: ( whereClause )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==WHERE) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // etc/XQFT.g:401:56: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_fLWORExpr5485);
                    whereClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:401:69: ( orderByClause )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==ORDER||LA28_0==STABLE) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // etc/XQFT.g:401:69: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_fLWORExpr5488);
                    orderByClause();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_fLWORExpr5491); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_fLWORExpr5493);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end fLWORExpr


    // $ANTLR start forClause
    // etc/XQFT.g:403:1: forClause : FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* ;
    public final void forClause() throws RecognitionException {
        try {
            // etc/XQFT.g:403:29: ( FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )* )
            // etc/XQFT.g:403:31: FOR DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            {
            match(input,FOR,FOLLOW_FOR_in_forClause5519); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause5521); if (failed) return ;
            pushFollow(FOLLOW_varName_in_forClause5523);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:403:52: ( typeDeclaration )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==AS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // etc/XQFT.g:403:52: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_forClause5525);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:403:69: ( positionalVar )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==AT) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // etc/XQFT.g:403:69: positionalVar
                    {
                    pushFollow(FOLLOW_positionalVar_in_forClause5528);
                    positionalVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:403:84: ( ftScoreVar )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==SCORE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // etc/XQFT.g:403:84: ftScoreVar
                    {
                    pushFollow(FOLLOW_ftScoreVar_in_forClause5531);
                    ftScoreVar();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_forClause5534); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_forClause5536);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:403:110: ( COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==COMMASi) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // etc/XQFT.g:403:111: COMMASi DOLLARSi varName ( typeDeclaration )? ( positionalVar )? ( ftScoreVar )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_forClause5539); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_forClause5541); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_forClause5543);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:403:136: ( typeDeclaration )?
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==AS) ) {
            	        alt32=1;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // etc/XQFT.g:403:136: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_forClause5545);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:403:153: ( positionalVar )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==AT) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // etc/XQFT.g:403:153: positionalVar
            	            {
            	            pushFollow(FOLLOW_positionalVar_in_forClause5548);
            	            positionalVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    // etc/XQFT.g:403:168: ( ftScoreVar )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==SCORE) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // etc/XQFT.g:403:168: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_forClause5551);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_forClause5554); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_forClause5556);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end forClause


    // $ANTLR start positionalVar
    // etc/XQFT.g:405:1: positionalVar : AT DOLLARSi varName ;
    public final void positionalVar() throws RecognitionException {
        try {
            // etc/XQFT.g:405:29: ( AT DOLLARSi varName )
            // etc/XQFT.g:405:31: AT DOLLARSi varName
            {
            match(input,AT,FOLLOW_AT_in_positionalVar5580); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_positionalVar5582); if (failed) return ;
            pushFollow(FOLLOW_varName_in_positionalVar5584);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end positionalVar


    // $ANTLR start ftScoreVar
    // etc/XQFT.g:407:1: ftScoreVar : SCORE DOLLARSi varName ;
    public final void ftScoreVar() throws RecognitionException {
        try {
            // etc/XQFT.g:407:29: ( SCORE DOLLARSi varName )
            // etc/XQFT.g:407:31: SCORE DOLLARSi varName
            {
            match(input,SCORE,FOLLOW_SCORE_in_ftScoreVar5609); if (failed) return ;
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_ftScoreVar5611); if (failed) return ;
            pushFollow(FOLLOW_varName_in_ftScoreVar5613);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftScoreVar


    // $ANTLR start letClause
    // etc/XQFT.g:409:1: letClause : ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) ) ASSIGNMENTOPERATOR exprSingle ( COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle )* ;
    public final void letClause() throws RecognitionException {
        try {
            // etc/XQFT.g:409:29: ( ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) ) ASSIGNMENTOPERATOR exprSingle ( COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle )* )
            // etc/XQFT.g:409:31: ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) ) ASSIGNMENTOPERATOR exprSingle ( COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle )*
            {
            // etc/XQFT.g:409:31: ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LET) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==DOLLARSi) ) {
                    alt37=1;
                }
                else if ( (LA37_1==SCORE) ) {
                    alt37=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("409:31: ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) )", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("409:31: ( ( LET DOLLARSi varName ( typeDeclaration )? ) | ( LET SCORE DOLLARSi varName ) )", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // etc/XQFT.g:409:32: ( LET DOLLARSi varName ( typeDeclaration )? )
                    {
                    // etc/XQFT.g:409:32: ( LET DOLLARSi varName ( typeDeclaration )? )
                    // etc/XQFT.g:409:33: LET DOLLARSi varName ( typeDeclaration )?
                    {
                    match(input,LET,FOLLOW_LET_in_letClause5641); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause5643); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_letClause5645);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:409:54: ( typeDeclaration )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==AS) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // etc/XQFT.g:409:54: typeDeclaration
                            {
                            pushFollow(FOLLOW_typeDeclaration_in_letClause5647);
                            typeDeclaration();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:409:74: ( LET SCORE DOLLARSi varName )
                    {
                    // etc/XQFT.g:409:74: ( LET SCORE DOLLARSi varName )
                    // etc/XQFT.g:409:75: LET SCORE DOLLARSi varName
                    {
                    match(input,LET,FOLLOW_LET_in_letClause5654); if (failed) return ;
                    match(input,SCORE,FOLLOW_SCORE_in_letClause5656); if (failed) return ;
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause5658); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_letClause5660);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,ASSIGNMENTOPERATOR,FOLLOW_ASSIGNMENTOPERATOR_in_letClause5664); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_letClause5666);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:409:134: ( COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==COMMASi) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // etc/XQFT.g:409:135: COMMASi ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar ) ASSIGNMENTOPERATOR exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_letClause5669); if (failed) return ;
            	    // etc/XQFT.g:409:143: ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar )
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==DOLLARSi) ) {
            	        alt39=1;
            	    }
            	    else if ( (LA39_0==SCORE) ) {
            	        alt39=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("409:143: ( ( DOLLARSi varName ( typeDeclaration )? ) | ftScoreVar )", 39, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // etc/XQFT.g:409:144: ( DOLLARSi varName ( typeDeclaration )? )
            	            {
            	            // etc/XQFT.g:409:144: ( DOLLARSi varName ( typeDeclaration )? )
            	            // etc/XQFT.g:409:145: DOLLARSi varName ( typeDeclaration )?
            	            {
            	            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_letClause5673); if (failed) return ;
            	            pushFollow(FOLLOW_varName_in_letClause5675);
            	            varName();
            	            _fsp--;
            	            if (failed) return ;
            	            // etc/XQFT.g:409:162: ( typeDeclaration )?
            	            int alt38=2;
            	            int LA38_0 = input.LA(1);

            	            if ( (LA38_0==AS) ) {
            	                alt38=1;
            	            }
            	            switch (alt38) {
            	                case 1 :
            	                    // etc/XQFT.g:409:162: typeDeclaration
            	                    {
            	                    pushFollow(FOLLOW_typeDeclaration_in_letClause5677);
            	                    typeDeclaration();
            	                    _fsp--;
            	                    if (failed) return ;

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // etc/XQFT.g:409:182: ftScoreVar
            	            {
            	            pushFollow(FOLLOW_ftScoreVar_in_letClause5683);
            	            ftScoreVar();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,ASSIGNMENTOPERATOR,FOLLOW_ASSIGNMENTOPERATOR_in_letClause5686); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_letClause5688);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end letClause


    // $ANTLR start whereClause
    // etc/XQFT.g:411:1: whereClause : WHERE exprSingle ;
    public final void whereClause() throws RecognitionException {
        try {
            // etc/XQFT.g:411:29: ( WHERE exprSingle )
            // etc/XQFT.g:411:31: WHERE exprSingle
            {
            match(input,WHERE,FOLLOW_WHERE_in_whereClause5714); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_whereClause5716);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end whereClause


    // $ANTLR start orderByClause
    // etc/XQFT.g:413:1: orderByClause : ( ( ORDER BY ) | ( STABLE ORDER BY ) ) orderSpecList ;
    public final void orderByClause() throws RecognitionException {
        try {
            // etc/XQFT.g:413:29: ( ( ( ORDER BY ) | ( STABLE ORDER BY ) ) orderSpecList )
            // etc/XQFT.g:413:31: ( ( ORDER BY ) | ( STABLE ORDER BY ) ) orderSpecList
            {
            // etc/XQFT.g:413:31: ( ( ORDER BY ) | ( STABLE ORDER BY ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==ORDER) ) {
                alt41=1;
            }
            else if ( (LA41_0==STABLE) ) {
                alt41=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("413:31: ( ( ORDER BY ) | ( STABLE ORDER BY ) )", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // etc/XQFT.g:413:32: ( ORDER BY )
                    {
                    // etc/XQFT.g:413:32: ( ORDER BY )
                    // etc/XQFT.g:413:33: ORDER BY
                    {
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause5740); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause5742); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:413:45: ( STABLE ORDER BY )
                    {
                    // etc/XQFT.g:413:45: ( STABLE ORDER BY )
                    // etc/XQFT.g:413:46: STABLE ORDER BY
                    {
                    match(input,STABLE,FOLLOW_STABLE_in_orderByClause5748); if (failed) return ;
                    match(input,ORDER,FOLLOW_ORDER_in_orderByClause5750); if (failed) return ;
                    match(input,BY,FOLLOW_BY_in_orderByClause5752); if (failed) return ;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_orderSpecList_in_orderByClause5756);
            orderSpecList();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderByClause


    // $ANTLR start orderSpecList
    // etc/XQFT.g:415:1: orderSpecList : orderSpec ( COMMASi orderSpec )* ;
    public final void orderSpecList() throws RecognitionException {
        try {
            // etc/XQFT.g:415:29: ( orderSpec ( COMMASi orderSpec )* )
            // etc/XQFT.g:415:31: orderSpec ( COMMASi orderSpec )*
            {
            pushFollow(FOLLOW_orderSpec_in_orderSpecList5778);
            orderSpec();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:415:41: ( COMMASi orderSpec )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==COMMASi) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // etc/XQFT.g:415:42: COMMASi orderSpec
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_orderSpecList5781); if (failed) return ;
            	    pushFollow(FOLLOW_orderSpec_in_orderSpecList5783);
            	    orderSpec();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderSpecList


    // $ANTLR start orderSpec
    // etc/XQFT.g:417:1: orderSpec : exprSingle orderModifier ;
    public final void orderSpec() throws RecognitionException {
        try {
            // etc/XQFT.g:417:29: ( exprSingle orderModifier )
            // etc/XQFT.g:417:31: exprSingle orderModifier
            {
            pushFollow(FOLLOW_exprSingle_in_orderSpec5811);
            exprSingle();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_orderModifier_in_orderSpec5813);
            orderModifier();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderSpec


    // $ANTLR start orderModifier
    // etc/XQFT.g:419:1: orderModifier : ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? ;
    public final void orderModifier() throws RecognitionException {
        try {
            // etc/XQFT.g:419:29: ( ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )? )
            // etc/XQFT.g:419:31: ( ASCENDING | DESCENDING )? ( EMPTY ( GREATEST | LEAST ) )? ( COLLATION uriLiteral )?
            {
            // etc/XQFT.g:419:31: ( ASCENDING | DESCENDING )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==ASCENDING||LA43_0==DESCENDING) ) {
                alt43=1;
            }
            switch (alt43) {
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier5835);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:419:57: ( EMPTY ( GREATEST | LEAST ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==EMPTY) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // etc/XQFT.g:419:58: EMPTY ( GREATEST | LEAST )
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_orderModifier5845); if (failed) return ;
                    if ( input.LA(1)==GREATEST||input.LA(1)==LEAST ) {
                        input.consume();
                        errorRecovery=false;failed=false;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_orderModifier5847);    throw mse;
                    }


                    }
                    break;

            }

            // etc/XQFT.g:419:85: ( COLLATION uriLiteral )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==COLLATION) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // etc/XQFT.g:419:86: COLLATION uriLiteral
                    {
                    match(input,COLLATION,FOLLOW_COLLATION_in_orderModifier5858); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_orderModifier5860);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderModifier


    // $ANTLR start quantifiedExpr
    // etc/XQFT.g:421:1: quantifiedExpr : ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle ;
    public final void quantifiedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:421:29: ( ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle )
            // etc/XQFT.g:421:31: ( SOME | EVERY ) DOLLARSi varName ( typeDeclaration )? IN exprSingle ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )* SATISFIES exprSingle
            {
            if ( input.LA(1)==EVERY||input.LA(1)==SOME ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_quantifiedExpr5883);    throw mse;
            }

            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr5891); if (failed) return ;
            pushFollow(FOLLOW_varName_in_quantifiedExpr5893);
            varName();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:421:63: ( typeDeclaration )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==AS) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // etc/XQFT.g:421:63: typeDeclaration
                    {
                    pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr5895);
                    typeDeclaration();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,IN,FOLLOW_IN_in_quantifiedExpr5898); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr5900);
            exprSingle();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:421:94: ( COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==COMMASi) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // etc/XQFT.g:421:95: COMMASi DOLLARSi varName ( typeDeclaration )? IN exprSingle
            	    {
            	    match(input,COMMASi,FOLLOW_COMMASi_in_quantifiedExpr5903); if (failed) return ;
            	    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_quantifiedExpr5905); if (failed) return ;
            	    pushFollow(FOLLOW_varName_in_quantifiedExpr5907);
            	    varName();
            	    _fsp--;
            	    if (failed) return ;
            	    // etc/XQFT.g:421:120: ( typeDeclaration )?
            	    int alt47=2;
            	    int LA47_0 = input.LA(1);

            	    if ( (LA47_0==AS) ) {
            	        alt47=1;
            	    }
            	    switch (alt47) {
            	        case 1 :
            	            // etc/XQFT.g:421:120: typeDeclaration
            	            {
            	            pushFollow(FOLLOW_typeDeclaration_in_quantifiedExpr5909);
            	            typeDeclaration();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }

            	    match(input,IN,FOLLOW_IN_in_quantifiedExpr5912); if (failed) return ;
            	    pushFollow(FOLLOW_exprSingle_in_quantifiedExpr5914);
            	    exprSingle();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            match(input,SATISFIES,FOLLOW_SATISFIES_in_quantifiedExpr5918); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_quantifiedExpr5920);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end quantifiedExpr


    // $ANTLR start typeswitchExpr
    // etc/XQFT.g:423:1: typeswitchExpr : TYPESWITCH LEFTPARENTHESISSi expr RIGHTPARENTHESISSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle ;
    public final void typeswitchExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:423:29: ( TYPESWITCH LEFTPARENTHESISSi expr RIGHTPARENTHESISSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle )
            // etc/XQFT.g:423:31: TYPESWITCH LEFTPARENTHESISSi expr RIGHTPARENTHESISSi ( caseClause )+ DEFAULT ( DOLLARSi varName )? RETURN exprSingle
            {
            match(input,TYPESWITCH,FOLLOW_TYPESWITCH_in_typeswitchExpr5941); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_typeswitchExpr5943); if (failed) return ;
            pushFollow(FOLLOW_expr_in_typeswitchExpr5945);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_typeswitchExpr5947); if (failed) return ;
            // etc/XQFT.g:423:84: ( caseClause )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==CASE) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // etc/XQFT.g:423:84: caseClause
            	    {
            	    pushFollow(FOLLOW_caseClause_in_typeswitchExpr5949);
            	    caseClause();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            match(input,DEFAULT,FOLLOW_DEFAULT_in_typeswitchExpr5952); if (failed) return ;
            // etc/XQFT.g:423:104: ( DOLLARSi varName )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==DOLLARSi) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // etc/XQFT.g:423:105: DOLLARSi varName
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_typeswitchExpr5955); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_typeswitchExpr5957);
                    varName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RETURN,FOLLOW_RETURN_in_typeswitchExpr5961); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_typeswitchExpr5963);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end typeswitchExpr


    // $ANTLR start caseClause
    // etc/XQFT.g:425:1: caseClause : CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle ;
    public final void caseClause() throws RecognitionException {
        try {
            // etc/XQFT.g:425:29: ( CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle )
            // etc/XQFT.g:425:31: CASE ( DOLLARSi varName AS )? sequenceType RETURN exprSingle
            {
            match(input,CASE,FOLLOW_CASE_in_caseClause5988); if (failed) return ;
            // etc/XQFT.g:425:36: ( DOLLARSi varName AS )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==DOLLARSi) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // etc/XQFT.g:425:37: DOLLARSi varName AS
                    {
                    match(input,DOLLARSi,FOLLOW_DOLLARSi_in_caseClause5991); if (failed) return ;
                    pushFollow(FOLLOW_varName_in_caseClause5993);
                    varName();
                    _fsp--;
                    if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_caseClause5995); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_sequenceType_in_caseClause5999);
            sequenceType();
            _fsp--;
            if (failed) return ;
            match(input,RETURN,FOLLOW_RETURN_in_caseClause6001); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_caseClause6003);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end caseClause


    // $ANTLR start ifExpr
    // etc/XQFT.g:427:1: ifExpr : IF LEFTPARENTHESISSi expr RIGHTPARENTHESISSi THEN exprSingle ELSE exprSingle ;
    public final void ifExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:427:29: ( IF LEFTPARENTHESISSi expr RIGHTPARENTHESISSi THEN exprSingle ELSE exprSingle )
            // etc/XQFT.g:427:31: IF LEFTPARENTHESISSi expr RIGHTPARENTHESISSi THEN exprSingle ELSE exprSingle
            {
            match(input,IF,FOLLOW_IF_in_ifExpr6032); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_ifExpr6034); if (failed) return ;
            pushFollow(FOLLOW_expr_in_ifExpr6036);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_ifExpr6038); if (failed) return ;
            match(input,THEN,FOLLOW_THEN_in_ifExpr6040); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr6042);
            exprSingle();
            _fsp--;
            if (failed) return ;
            match(input,ELSE,FOLLOW_ELSE_in_ifExpr6044); if (failed) return ;
            pushFollow(FOLLOW_exprSingle_in_ifExpr6046);
            exprSingle();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ifExpr


    // $ANTLR start orExpr
    // etc/XQFT.g:429:1: orExpr : andExpr ( OR andExpr )* ;
    public final void orExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:429:29: ( andExpr ( OR andExpr )* )
            // etc/XQFT.g:429:31: andExpr ( OR andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr6075);
            andExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:429:39: ( OR andExpr )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==OR) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // etc/XQFT.g:429:41: OR andExpr
            	    {
            	    match(input,OR,FOLLOW_OR_in_orExpr6079); if (failed) return ;
            	    pushFollow(FOLLOW_andExpr_in_orExpr6081);
            	    andExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orExpr


    // $ANTLR start andExpr
    // etc/XQFT.g:431:1: andExpr : comparisonExpr ( AND comparisonExpr )* ;
    public final void andExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:431:29: ( comparisonExpr ( AND comparisonExpr )* )
            // etc/XQFT.g:431:31: comparisonExpr ( AND comparisonExpr )*
            {
            pushFollow(FOLLOW_comparisonExpr_in_andExpr6112);
            comparisonExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:431:46: ( AND comparisonExpr )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==AND) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // etc/XQFT.g:431:48: AND comparisonExpr
            	    {
            	    match(input,AND,FOLLOW_AND_in_andExpr6116); if (failed) return ;
            	    pushFollow(FOLLOW_comparisonExpr_in_andExpr6118);
            	    comparisonExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end andExpr


    // $ANTLR start comparisonExpr
    // etc/XQFT.g:433:1: comparisonExpr : ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? ;
    public final void comparisonExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:433:29: ( ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )? )
            // etc/XQFT.g:433:31: ftContainsExpr ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            {
            pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr6142);
            ftContainsExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:433:46: ( ( valueComp | generalComp | nodeComp ) ftContainsExpr )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=BIGGERTHANSi && LA55_0<=LESSTHANOREQUALSi)||(LA55_0>=EQUALSi && LA55_0<=NOTEQUALSi)||LA55_0==LESSTHANSi||(LA55_0>=EQ && LA55_0<=NODEAFTERSi)) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // etc/XQFT.g:433:48: ( valueComp | generalComp | nodeComp ) ftContainsExpr
                    {
                    // etc/XQFT.g:433:48: ( valueComp | generalComp | nodeComp )
                    int alt54=3;
                    switch ( input.LA(1) ) {
                    case EQ:
                    case NE:
                    case LT:
                    case LE:
                    case GT:
                    case GE:
                        {
                        alt54=1;
                        }
                        break;
                    case BIGGERTHANSi:
                    case BIGGERTHANOREQUALSi:
                    case LESSTHANOREQUALSi:
                    case EQUALSi:
                    case NOTEQUALSi:
                    case LESSTHANSi:
                        {
                        alt54=2;
                        }
                        break;
                    case IS:
                    case NODEBEFORESi:
                    case NODEAFTERSi:
                        {
                        alt54=3;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("433:48: ( valueComp | generalComp | nodeComp )", 54, 0, input);

                        throw nvae;
                    }

                    switch (alt54) {
                        case 1 :
                            // etc/XQFT.g:433:49: valueComp
                            {
                            pushFollow(FOLLOW_valueComp_in_comparisonExpr6147);
                            valueComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:433:61: generalComp
                            {
                            pushFollow(FOLLOW_generalComp_in_comparisonExpr6151);
                            generalComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 3 :
                            // etc/XQFT.g:433:75: nodeComp
                            {
                            pushFollow(FOLLOW_nodeComp_in_comparisonExpr6155);
                            nodeComp();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_ftContainsExpr_in_comparisonExpr6158);
                    ftContainsExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end comparisonExpr


    // $ANTLR start ftContainsExpr
    // etc/XQFT.g:435:1: ftContainsExpr : rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? ;
    public final void ftContainsExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:435:29: ( rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )? )
            // etc/XQFT.g:435:31: rangeExpr ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            {
            pushFollow(FOLLOW_rangeExpr_in_ftContainsExpr6182);
            rangeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:435:41: ( FTCONTAINS ftSelection ( ftIgnoreOption )? )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==FTCONTAINS) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // etc/XQFT.g:435:43: FTCONTAINS ftSelection ( ftIgnoreOption )?
                    {
                    match(input,FTCONTAINS,FOLLOW_FTCONTAINS_in_ftContainsExpr6186); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftContainsExpr6188);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:435:66: ( ftIgnoreOption )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==WITHOUT) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // etc/XQFT.g:435:66: ftIgnoreOption
                            {
                            pushFollow(FOLLOW_ftIgnoreOption_in_ftContainsExpr6190);
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftContainsExpr


    // $ANTLR start rangeExpr
    // etc/XQFT.g:437:1: rangeExpr : additiveExpr ( TO additiveExpr )? ;
    public final void rangeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:437:29: ( additiveExpr ( TO additiveExpr )? )
            // etc/XQFT.g:437:31: additiveExpr ( TO additiveExpr )?
            {
            pushFollow(FOLLOW_additiveExpr_in_rangeExpr6220);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:437:44: ( TO additiveExpr )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==TO) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // etc/XQFT.g:437:46: TO additiveExpr
                    {
                    match(input,TO,FOLLOW_TO_in_rangeExpr6224); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_rangeExpr6226);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end rangeExpr


    // $ANTLR start additiveExpr
    // etc/XQFT.g:439:1: additiveExpr : multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* ;
    public final void additiveExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:439:29: ( multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )* )
            // etc/XQFT.g:439:31: multiplicativeExpr ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            {
            pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr6252);
            multiplicativeExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:439:50: ( ( PLUSSi | MINUSSi ) multiplicativeExpr )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==MINUSSi||LA59_0==PLUSSi) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // etc/XQFT.g:439:52: ( PLUSSi | MINUSSi ) multiplicativeExpr
            	    {
            	    if ( input.LA(1)==MINUSSi||input.LA(1)==PLUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_additiveExpr6256);    throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpr_in_additiveExpr6264);
            	    multiplicativeExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end additiveExpr


    // $ANTLR start multiplicativeExpr
    // etc/XQFT.g:441:1: multiplicativeExpr : unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* ;
    public final void multiplicativeExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:441:29: ( unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )* )
            // etc/XQFT.g:441:31: unionExpr ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            {
            pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr6284);
            unionExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:441:41: ( ( STARSi | DIV | IDIV | MOD ) unionExpr )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==IDIV||LA60_0==DIV||LA60_0==STARSi||LA60_0==MOD) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // etc/XQFT.g:441:43: ( STARSi | DIV | IDIV | MOD ) unionExpr
            	    {
            	    if ( input.LA(1)==IDIV||input.LA(1)==DIV||input.LA(1)==STARSi||input.LA(1)==MOD ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_multiplicativeExpr6288);    throw mse;
            	    }

            	    pushFollow(FOLLOW_unionExpr_in_multiplicativeExpr6304);
            	    unionExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end multiplicativeExpr


    // $ANTLR start unionExpr
    // etc/XQFT.g:443:1: unionExpr : intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* ;
    public final void unionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:443:29: ( intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )* )
            // etc/XQFT.g:443:31: intersectExceptExpr ( ( UNION | PIPESi ) intersectExceptExpr )*
            {
            pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr6333);
            intersectExceptExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:443:51: ( ( UNION | PIPESi ) intersectExceptExpr )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==PIPESi||LA61_0==UNION) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // etc/XQFT.g:443:53: ( UNION | PIPESi ) intersectExceptExpr
            	    {
            	    if ( input.LA(1)==PIPESi||input.LA(1)==UNION ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unionExpr6337);    throw mse;
            	    }

            	    pushFollow(FOLLOW_intersectExceptExpr_in_unionExpr6345);
            	    intersectExceptExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end unionExpr


    // $ANTLR start intersectExceptExpr
    // etc/XQFT.g:445:1: intersectExceptExpr : instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* ;
    public final void intersectExceptExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:445:29: ( instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )* )
            // etc/XQFT.g:445:31: instanceofExpr ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            {
            pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr6364);
            instanceofExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:445:46: ( ( INTERSECT | EXCEPT ) instanceofExpr )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==EXCEPT||LA62_0==INTERSECT) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // etc/XQFT.g:445:48: ( INTERSECT | EXCEPT ) instanceofExpr
            	    {
            	    if ( input.LA(1)==EXCEPT||input.LA(1)==INTERSECT ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_intersectExceptExpr6368);    throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceofExpr_in_intersectExceptExpr6376);
            	    instanceofExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end intersectExceptExpr


    // $ANTLR start instanceofExpr
    // etc/XQFT.g:447:1: instanceofExpr : treatExpr ( INSTANCE OF sequenceType )? ;
    public final void instanceofExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:447:29: ( treatExpr ( INSTANCE OF sequenceType )? )
            // etc/XQFT.g:447:31: treatExpr ( INSTANCE OF sequenceType )?
            {
            pushFollow(FOLLOW_treatExpr_in_instanceofExpr6400);
            treatExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:447:41: ( INSTANCE OF sequenceType )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==INSTANCE) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // etc/XQFT.g:447:43: INSTANCE OF sequenceType
                    {
                    match(input,INSTANCE,FOLLOW_INSTANCE_in_instanceofExpr6404); if (failed) return ;
                    match(input,OF,FOLLOW_OF_in_instanceofExpr6406); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_instanceofExpr6408);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end instanceofExpr


    // $ANTLR start treatExpr
    // etc/XQFT.g:449:1: treatExpr : castableExpr ( TREAT AS sequenceType )? ;
    public final void treatExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:449:29: ( castableExpr ( TREAT AS sequenceType )? )
            // etc/XQFT.g:449:31: castableExpr ( TREAT AS sequenceType )?
            {
            pushFollow(FOLLOW_castableExpr_in_treatExpr6437);
            castableExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:449:44: ( TREAT AS sequenceType )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==TREAT) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // etc/XQFT.g:449:46: TREAT AS sequenceType
                    {
                    match(input,TREAT,FOLLOW_TREAT_in_treatExpr6441); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_treatExpr6443); if (failed) return ;
                    pushFollow(FOLLOW_sequenceType_in_treatExpr6445);
                    sequenceType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end treatExpr


    // $ANTLR start castableExpr
    // etc/XQFT.g:451:1: castableExpr : castExpr ( CASTABLE AS singleType )? ;
    public final void castableExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:451:29: ( castExpr ( CASTABLE AS singleType )? )
            // etc/XQFT.g:451:31: castExpr ( CASTABLE AS singleType )?
            {
            pushFollow(FOLLOW_castExpr_in_castableExpr6471);
            castExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:451:40: ( CASTABLE AS singleType )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==CASTABLE) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // etc/XQFT.g:451:42: CASTABLE AS singleType
                    {
                    match(input,CASTABLE,FOLLOW_CASTABLE_in_castableExpr6475); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castableExpr6477); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castableExpr6479);
                    singleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end castableExpr


    // $ANTLR start castExpr
    // etc/XQFT.g:453:1: castExpr : unaryExpr ( CAST AS singleType )? ;
    public final void castExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:453:29: ( unaryExpr ( CAST AS singleType )? )
            // etc/XQFT.g:453:31: unaryExpr ( CAST AS singleType )?
            {
            pushFollow(FOLLOW_unaryExpr_in_castExpr6509);
            unaryExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:453:41: ( CAST AS singleType )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==CAST) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // etc/XQFT.g:453:43: CAST AS singleType
                    {
                    match(input,CAST,FOLLOW_CAST_in_castExpr6513); if (failed) return ;
                    match(input,AS,FOLLOW_AS_in_castExpr6515); if (failed) return ;
                    pushFollow(FOLLOW_singleType_in_castExpr6517);
                    singleType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end castExpr


    // $ANTLR start unaryExpr
    // etc/XQFT.g:455:1: unaryExpr : ( MINUSSi | PLUSSi )* valueExpr ;
    public final void unaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:455:29: ( ( MINUSSi | PLUSSi )* valueExpr )
            // etc/XQFT.g:455:31: ( MINUSSi | PLUSSi )* valueExpr
            {
            // etc/XQFT.g:455:31: ( MINUSSi | PLUSSi )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==MINUSSi||LA67_0==PLUSSi) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // etc/XQFT.g:
            	    {
            	    if ( input.LA(1)==MINUSSi||input.LA(1)==PLUSSi ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_unaryExpr6546);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            pushFollow(FOLLOW_valueExpr_in_unaryExpr6555);
            valueExpr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end unaryExpr


    // $ANTLR start valueExpr
    // etc/XQFT.g:457:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );
    public final void valueExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:457:29: ( validateExpr | pathExpr | extensionExpr )
            int alt68=3;
            switch ( input.LA(1) ) {
            case VALIDATE:
                {
                alt68=1;
                }
                break;
            case DOLLARSi:
            case ORDERED:
            case DOCUMENTNODE:
            case LESSTHANSi:
            case SLASH:
            case PROCESSING_INSTRUCTION:
            case DOCUMENT:
            case SCHEMAATTRIBUTE:
            case DOUBLESLASH:
            case STARSi:
            case LEFTXMLCOMMENT:
            case TEXT:
            case UNORDERED:
            case LEFTPITARGET:
            case COMMENT:
            case ELEMENT:
            case LEFTPARENTHESISSi:
            case ATSi:
            case ATTRIBUTE:
            case NODE:
            case SCHEMAELEMENT:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOT:
            case DOTDOT:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
            case NCName:
            case QName:
                {
                alt68=2;
                }
                break;
            case LEFTPRAGMA:
                {
                alt68=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("457:1: valueExpr : ( validateExpr | pathExpr | extensionExpr );", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // etc/XQFT.g:457:31: validateExpr
                    {
                    pushFollow(FOLLOW_validateExpr_in_valueExpr6581);
                    validateExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:457:46: pathExpr
                    {
                    pushFollow(FOLLOW_pathExpr_in_valueExpr6585);
                    pathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:457:57: extensionExpr
                    {
                    pushFollow(FOLLOW_extensionExpr_in_valueExpr6589);
                    extensionExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end valueExpr


    // $ANTLR start generalComp
    // etc/XQFT.g:459:1: generalComp : ( EQUALSi | NOTEQUALSi | LESSTHANSi | LESSTHANOREQUALSi | BIGGERTHANSi | BIGGERTHANOREQUALSi );
    public final void generalComp() throws RecognitionException {
        try {
            // etc/XQFT.g:459:29: ( EQUALSi | NOTEQUALSi | LESSTHANSi | LESSTHANOREQUALSi | BIGGERTHANSi | BIGGERTHANOREQUALSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=BIGGERTHANSi && input.LA(1)<=LESSTHANOREQUALSi)||(input.LA(1)>=EQUALSi && input.LA(1)<=NOTEQUALSi)||input.LA(1)==LESSTHANSi ) {
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end generalComp


    // $ANTLR start valueComp
    // etc/XQFT.g:461:1: valueComp : ( EQ | NE | LT | LE | GT | GE );
    public final void valueComp() throws RecognitionException {
        try {
            // etc/XQFT.g:461:29: ( EQ | NE | LT | LE | GT | GE )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=EQ && input.LA(1)<=GE) ) {
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end valueComp


    // $ANTLR start nodeComp
    // etc/XQFT.g:463:1: nodeComp : ( IS | NODEBEFORESi | NODEAFTERSi );
    public final void nodeComp() throws RecognitionException {
        try {
            // etc/XQFT.g:463:29: ( IS | NODEBEFORESi | NODEAFTERSi )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=IS && input.LA(1)<=NODEAFTERSi) ) {
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end nodeComp


    // $ANTLR start validateExpr
    // etc/XQFT.g:465:1: validateExpr : VALIDATE ( validationMode )? LEFTBRACESi expr RIGHTBRACESi ;
    public final void validateExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:465:29: ( VALIDATE ( validationMode )? LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:465:31: VALIDATE ( validationMode )? LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,VALIDATE,FOLLOW_VALIDATE_in_validateExpr6737); if (failed) return ;
            // etc/XQFT.g:465:40: ( validationMode )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=LAX && LA69_0<=STRICT)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // etc/XQFT.g:465:40: validationMode
                    {
                    pushFollow(FOLLOW_validationMode_in_validateExpr6739);
                    validationMode();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_validateExpr6742); if (failed) return ;
            pushFollow(FOLLOW_expr_in_validateExpr6744);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_validateExpr6746); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end validateExpr


    // $ANTLR start validationMode
    // etc/XQFT.g:467:1: validationMode : ( LAX | STRICT );
    public final void validationMode() throws RecognitionException {
        try {
            // etc/XQFT.g:467:29: ( LAX | STRICT )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=LAX && input.LA(1)<=STRICT) ) {
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end validationMode


    // $ANTLR start extensionExpr
    // etc/XQFT.g:469:1: extensionExpr : ( pragma )+ LEFTBRACESi ( expr )? RIGHTBRACESi ;
    public final void extensionExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:469:29: ( ( pragma )+ LEFTBRACESi ( expr )? RIGHTBRACESi )
            // etc/XQFT.g:469:31: ( pragma )+ LEFTBRACESi ( expr )? RIGHTBRACESi
            {
            // etc/XQFT.g:469:31: ( pragma )+
            int cnt70=0;
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==LEFTPRAGMA) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // etc/XQFT.g:469:31: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_extensionExpr6793);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt70 >= 1 ) break loop70;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(70, input);
                        throw eee;
                }
                cnt70++;
            } while (true);

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_extensionExpr6796); if (failed) return ;
            // etc/XQFT.g:469:51: ( expr )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==TYPESWITCH||LA71_0==DOLLARSi||(LA71_0>=LEFTPRAGMA && LA71_0<=DOCUMENTNODE)||LA71_0==LESSTHANSi||LA71_0==SLASH||LA71_0==EVERY||LA71_0==FOR||LA71_0==PROCESSING_INSTRUCTION||LA71_0==MINUSSi||LA71_0==DOCUMENT||LA71_0==VALIDATE||LA71_0==LET||LA71_0==PLUSSi||LA71_0==SCHEMAATTRIBUTE||LA71_0==DOUBLESLASH||LA71_0==IF||LA71_0==STARSi||LA71_0==LEFTXMLCOMMENT||LA71_0==TEXT||LA71_0==UNORDERED||LA71_0==LEFTPITARGET||LA71_0==COMMENT||(LA71_0>=ELEMENT && LA71_0<=LEFTPARENTHESISSi)||LA71_0==ATSi||LA71_0==ATTRIBUTE||(LA71_0>=NODE && LA71_0<=SOME)||LA71_0==SCHEMAELEMENT||LA71_0==CHILD||(LA71_0>=DESCENDANT && LA71_0<=DOTDOT)||(LA71_0>=IntegerLiteral && LA71_0<=DoubleLiteral)||LA71_0==StringLiteral||(LA71_0>=NCName && LA71_0<=QName)) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // etc/XQFT.g:469:51: expr
                    {
                    pushFollow(FOLLOW_expr_in_extensionExpr6798);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_extensionExpr6801); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end extensionExpr


    // $ANTLR start pragma
    // etc/XQFT.g:471:1: pragma : LEFTPRAGMA ( S )? QName ( S pragmaContents )? RIGHTPRAGMA ;
    public final void pragma() throws RecognitionException {
        try {
            // etc/XQFT.g:471:29: ( LEFTPRAGMA ( S )? QName ( S pragmaContents )? RIGHTPRAGMA )
            // etc/XQFT.g:471:31: LEFTPRAGMA ( S )? QName ( S pragmaContents )? RIGHTPRAGMA
            {
            match(input,LEFTPRAGMA,FOLLOW_LEFTPRAGMA_in_pragma6830); if (failed) return ;
            // etc/XQFT.g:471:42: ( S )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==S) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // etc/XQFT.g:471:42: S
                    {
                    match(input,S,FOLLOW_S_in_pragma6832); if (failed) return ;

                    }
                    break;

            }

            match(input,QName,FOLLOW_QName_in_pragma6835); if (failed) return ;
            // etc/XQFT.g:471:51: ( S pragmaContents )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==S) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // etc/XQFT.g:471:52: S pragmaContents
                    {
                    match(input,S,FOLLOW_S_in_pragma6838); if (failed) return ;
                    pushFollow(FOLLOW_pragmaContents_in_pragma6840);
                    pragmaContents();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPRAGMA,FOLLOW_RIGHTPRAGMA_in_pragma6844); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end pragma


    // $ANTLR start pragmaContents
    // etc/XQFT.g:476:1: pragmaContents : m= ZeroOrMoreChar {...}?;
    public final void pragmaContents() throws RecognitionException {
        Token m=null;

        try {
            // etc/XQFT.g:476:23: (m= ZeroOrMoreChar {...}?)
            // etc/XQFT.g:476:25: m= ZeroOrMoreChar {...}?
            {
            m=(Token)input.LT(1);
            match(input,ZeroOrMoreChar,FOLLOW_ZeroOrMoreChar_in_pragmaContents6866); if (failed) return ;
            if ( !( !m.getText().contains("#") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "pragmaContents", " !$m.getText().contains(\"#\") ");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end pragmaContents


    // $ANTLR start pathExpr
    // etc/XQFT.g:479:1: pathExpr : ( ( DOUBLESLASH relativePathExpr )=> DOUBLESLASH relativePathExpr | ( SLASH relativePathExpr )=> SLASH relativePathExpr | SLASH | relativePathExpr );
    public final void pathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:479:29: ( ( DOUBLESLASH relativePathExpr )=> DOUBLESLASH relativePathExpr | ( SLASH relativePathExpr )=> SLASH relativePathExpr | SLASH | relativePathExpr )
            int alt74=4;
            alt74 = dfa74.predict(input);
            switch (alt74) {
                case 1 :
                    // etc/XQFT.g:479:31: ( DOUBLESLASH relativePathExpr )=> DOUBLESLASH relativePathExpr
                    {
                    match(input,DOUBLESLASH,FOLLOW_DOUBLESLASH_in_pathExpr6905); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6907);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:480:11: ( SLASH relativePathExpr )=> SLASH relativePathExpr
                    {
                    match(input,SLASH,FOLLOW_SLASH_in_pathExpr6928); if (failed) return ;
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6930);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:481:11: SLASH
                    {
                    match(input,SLASH,FOLLOW_SLASH_in_pathExpr6942); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:482:11: relativePathExpr
                    {
                    pushFollow(FOLLOW_relativePathExpr_in_pathExpr6954);
                    relativePathExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end pathExpr


    // $ANTLR start relativePathExpr
    // etc/XQFT.g:484:1: relativePathExpr : stepExpr ( ( SLASH | DOUBLESLASH ) stepExpr )* ;
    public final void relativePathExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:484:29: ( stepExpr ( ( SLASH | DOUBLESLASH ) stepExpr )* )
            // etc/XQFT.g:484:31: stepExpr ( ( SLASH | DOUBLESLASH ) stepExpr )*
            {
            pushFollow(FOLLOW_stepExpr_in_relativePathExpr6973);
            stepExpr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:484:40: ( ( SLASH | DOUBLESLASH ) stepExpr )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==SLASH||LA75_0==DOUBLESLASH) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // etc/XQFT.g:484:41: ( SLASH | DOUBLESLASH ) stepExpr
            	    {
            	    if ( input.LA(1)==SLASH||input.LA(1)==DOUBLESLASH ) {
            	        input.consume();
            	        errorRecovery=false;failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_relativePathExpr6976);    throw mse;
            	    }

            	    pushFollow(FOLLOW_stepExpr_in_relativePathExpr6984);
            	    stepExpr();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end relativePathExpr


    // $ANTLR start stepExpr
    // etc/XQFT.g:486:1: stepExpr : ( filterExpr | axisStep );
    public final void stepExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:486:29: ( filterExpr | axisStep )
            int alt76=2;
            switch ( input.LA(1) ) {
            case DOLLARSi:
            case ORDERED:
            case LESSTHANSi:
            case DOCUMENT:
            case LEFTXMLCOMMENT:
            case UNORDERED:
            case LEFTPITARGET:
            case LEFTPARENTHESISSi:
            case DOT:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
                {
                alt76=1;
                }
                break;
            case QName:
                {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==LEFTPARENTHESISSi) ) {
                    alt76=1;
                }
                else if ( (LA76_2==EOF||(LA76_2>=PIPESi && LA76_2<=WHERE)||(LA76_2>=EQUALSi && LA76_2<=NOTEQUALSi)||LA76_2==CAST||(LA76_2>=ELSE && LA76_2<=TREAT)||LA76_2==SLASH||LA76_2==CASTABLE||(LA76_2>=FOR && LA76_2<=INSTANCE)||(LA76_2>=EXCEPT && LA76_2<=TO)||LA76_2==SATISFIES||LA76_2==SEMICOLONSi||LA76_2==EMPTY||LA76_2==CASE||LA76_2==MINUSSi||(LA76_2>=COMMASi && LA76_2<=LET)||LA76_2==RIGHTBRACKETSi||LA76_2==LEVELS||(LA76_2>=DIV && LA76_2<=PLUSSi)||LA76_2==ORDER||LA76_2==UNION||LA76_2==COLLATION||LA76_2==OR||LA76_2==DOUBLESLASH||(LA76_2>=DESCENDING && LA76_2<=STARSi)||(LA76_2>=STABLE && LA76_2<=LEFTBRACKETSi)||LA76_2==WITHOUT||LA76_2==RIGHTPARENTHESISSi||LA76_2==RETURN||LA76_2==DEFAULT||LA76_2==AND||LA76_2==INTERSECT||LA76_2==TIMES||LA76_2==FTCONTAINS||(LA76_2>=MOD && LA76_2<=RIGHTBRACESi)||(LA76_2>=EQ && LA76_2<=NODEAFTERSi)||(LA76_2>=WORDS && LA76_2<=PARAGRAPHS)) ) {
                    alt76=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 76, 2, input);

                    throw nvae;
                }
                }
                break;
            case ELEMENT:
                {
                int LA76_3 = input.LA(2);

                if ( (LA76_3==LEFTPARENTHESISSi) ) {
                    alt76=2;
                }
                else if ( (LA76_3==LEFTBRACESi||LA76_3==QName) ) {
                    alt76=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 76, 3, input);

                    throw nvae;
                }
                }
                break;
            case ATTRIBUTE:
                {
                int LA76_4 = input.LA(2);

                if ( (LA76_4==LEFTPARENTHESISSi||LA76_4==DOUBLECOLON) ) {
                    alt76=2;
                }
                else if ( (LA76_4==LEFTBRACESi||LA76_4==QName) ) {
                    alt76=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 76, 4, input);

                    throw nvae;
                }
                }
                break;
            case TEXT:
                {
                int LA76_5 = input.LA(2);

                if ( (LA76_5==LEFTPARENTHESISSi) ) {
                    alt76=2;
                }
                else if ( (LA76_5==LEFTBRACESi) ) {
                    alt76=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 76, 5, input);

                    throw nvae;
                }
                }
                break;
            case COMMENT:
                {
                int LA76_6 = input.LA(2);

                if ( (LA76_6==LEFTPARENTHESISSi) ) {
                    alt76=2;
                }
                else if ( (LA76_6==LEFTBRACESi) ) {
                    alt76=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 76, 6, input);

                    throw nvae;
                }
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                int LA76_7 = input.LA(2);

                if ( (LA76_7==LEFTPARENTHESISSi) ) {
                    alt76=2;
                }
                else if ( (LA76_7==LEFTBRACESi||LA76_7==NCName) ) {
                    alt76=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 76, 7, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENTNODE:
            case SCHEMAATTRIBUTE:
            case STARSi:
            case ATSi:
            case NODE:
            case SCHEMAELEMENT:
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
            case PARENT:
            case ANCESTOR:
            case PRECEDING_SIBLING:
            case PRECEDING:
            case ANCESTOR_OR_SELF:
            case DOTDOT:
            case NCName:
                {
                alt76=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("486:1: stepExpr : ( filterExpr | axisStep );", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // etc/XQFT.g:486:31: filterExpr
                    {
                    pushFollow(FOLLOW_filterExpr_in_stepExpr7013);
                    filterExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:486:44: axisStep
                    {
                    pushFollow(FOLLOW_axisStep_in_stepExpr7017);
                    axisStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end stepExpr


    // $ANTLR start axisStep
    // etc/XQFT.g:488:1: axisStep : ( reverseStep | forwardStep ) predicateList ;
    public final void axisStep() throws RecognitionException {
        try {
            // etc/XQFT.g:488:29: ( ( reverseStep | forwardStep ) predicateList )
            // etc/XQFT.g:488:31: ( reverseStep | forwardStep ) predicateList
            {
            // etc/XQFT.g:488:31: ( reverseStep | forwardStep )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=PARENT && LA77_0<=ANCESTOR_OR_SELF)||LA77_0==DOTDOT) ) {
                alt77=1;
            }
            else if ( (LA77_0==DOCUMENTNODE||LA77_0==PROCESSING_INSTRUCTION||LA77_0==SCHEMAATTRIBUTE||LA77_0==STARSi||LA77_0==TEXT||LA77_0==COMMENT||LA77_0==ELEMENT||LA77_0==ATSi||LA77_0==ATTRIBUTE||LA77_0==NODE||LA77_0==SCHEMAELEMENT||LA77_0==CHILD||(LA77_0>=DESCENDANT && LA77_0<=FOLLOWING)||(LA77_0>=NCName && LA77_0<=QName)) ) {
                alt77=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("488:31: ( reverseStep | forwardStep )", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // etc/XQFT.g:488:32: reverseStep
                    {
                    pushFollow(FOLLOW_reverseStep_in_axisStep7045);
                    reverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:488:46: forwardStep
                    {
                    pushFollow(FOLLOW_forwardStep_in_axisStep7049);
                    forwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_predicateList_in_axisStep7052);
            predicateList();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end axisStep


    // $ANTLR start forwardStep
    // etc/XQFT.g:490:1: forwardStep : ( ( forwardAxis nodeTest ) | abbrevForwardStep );
    public final void forwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:490:29: ( ( forwardAxis nodeTest ) | abbrevForwardStep )
            int alt78=2;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==DOUBLECOLON) ) {
                    alt78=1;
                }
                else if ( (LA78_1==LEFTPARENTHESISSi) ) {
                    alt78=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("490:1: forwardStep : ( ( forwardAxis nodeTest ) | abbrevForwardStep );", 78, 1, input);

                    throw nvae;
                }
                }
                break;
            case DOCUMENTNODE:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case STARSi:
            case TEXT:
            case COMMENT:
            case ELEMENT:
            case ATSi:
            case NODE:
            case SCHEMAELEMENT:
            case NCName:
            case QName:
                {
                alt78=2;
                }
                break;
            case CHILD:
            case DESCENDANT:
            case SELF:
            case DESCENDANT_OR_SELF:
            case FOLLOWING_SIBLING:
            case FOLLOWING:
                {
                alt78=1;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("490:1: forwardStep : ( ( forwardAxis nodeTest ) | abbrevForwardStep );", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // etc/XQFT.g:490:31: ( forwardAxis nodeTest )
                    {
                    // etc/XQFT.g:490:31: ( forwardAxis nodeTest )
                    // etc/XQFT.g:490:32: forwardAxis nodeTest
                    {
                    pushFollow(FOLLOW_forwardAxis_in_forwardStep7077);
                    forwardAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_forwardStep7079);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:490:56: abbrevForwardStep
                    {
                    pushFollow(FOLLOW_abbrevForwardStep_in_forwardStep7084);
                    abbrevForwardStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end forwardStep


    // $ANTLR start forwardAxis
    // etc/XQFT.g:493:1: forwardAxis : ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DOUBLECOLON ;
    public final void forwardAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:493:29: ( ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DOUBLECOLON )
            // etc/XQFT.g:493:31: ( CHILD | DESCENDANT | ATTRIBUTE | SELF | DESCENDANT_OR_SELF | FOLLOWING_SIBLING | FOLLOWING ) DOUBLECOLON
            {
            if ( input.LA(1)==ATTRIBUTE||input.LA(1)==CHILD||(input.LA(1)>=DESCENDANT && input.LA(1)<=FOLLOWING) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_forwardAxis7109);    throw mse;
            }

            match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_forwardAxis7157); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end forwardAxis


    // $ANTLR start abbrevForwardStep
    // etc/XQFT.g:506:1: abbrevForwardStep : ( ATSi )? nodeTest ;
    public final void abbrevForwardStep() throws RecognitionException {
        try {
            // etc/XQFT.g:506:29: ( ( ATSi )? nodeTest )
            // etc/XQFT.g:506:31: ( ATSi )? nodeTest
            {
            // etc/XQFT.g:506:31: ( ATSi )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ATSi) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // etc/XQFT.g:506:31: ATSi
                    {
                    match(input,ATSi,FOLLOW_ATSi_in_abbrevForwardStep7178); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_nodeTest_in_abbrevForwardStep7181);
            nodeTest();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end abbrevForwardStep


    // $ANTLR start reverseStep
    // etc/XQFT.g:508:1: reverseStep : ( ( reverseAxis nodeTest ) | abbrevReverseStep );
    public final void reverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:508:29: ( ( reverseAxis nodeTest ) | abbrevReverseStep )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( ((LA80_0>=PARENT && LA80_0<=ANCESTOR_OR_SELF)) ) {
                alt80=1;
            }
            else if ( (LA80_0==DOTDOT) ) {
                alt80=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("508:1: reverseStep : ( ( reverseAxis nodeTest ) | abbrevReverseStep );", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // etc/XQFT.g:508:31: ( reverseAxis nodeTest )
                    {
                    // etc/XQFT.g:508:31: ( reverseAxis nodeTest )
                    // etc/XQFT.g:508:32: reverseAxis nodeTest
                    {
                    pushFollow(FOLLOW_reverseAxis_in_reverseStep7206);
                    reverseAxis();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_nodeTest_in_reverseStep7208);
                    nodeTest();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:508:56: abbrevReverseStep
                    {
                    pushFollow(FOLLOW_abbrevReverseStep_in_reverseStep7213);
                    abbrevReverseStep();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end reverseStep


    // $ANTLR start reverseAxis
    // etc/XQFT.g:510:1: reverseAxis : ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DOUBLECOLON ;
    public final void reverseAxis() throws RecognitionException {
        try {
            // etc/XQFT.g:510:29: ( ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DOUBLECOLON )
            // etc/XQFT.g:510:31: ( PARENT | ANCESTOR | PRECEDING_SIBLING | PRECEDING | ANCESTOR_OR_SELF ) DOUBLECOLON
            {
            if ( (input.LA(1)>=PARENT && input.LA(1)<=ANCESTOR_OR_SELF) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_reverseAxis7237);    throw mse;
            }

            match(input,DOUBLECOLON,FOLLOW_DOUBLECOLON_in_reverseAxis7275); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end reverseAxis


    // $ANTLR start abbrevReverseStep
    // etc/XQFT.g:521:1: abbrevReverseStep : DOTDOT ;
    public final void abbrevReverseStep() throws RecognitionException {
        try {
            // etc/XQFT.g:521:29: ( DOTDOT )
            // etc/XQFT.g:521:31: DOTDOT
            {
            match(input,DOTDOT,FOLLOW_DOTDOT_in_abbrevReverseStep7295); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end abbrevReverseStep


    // $ANTLR start nodeTest
    // etc/XQFT.g:523:1: nodeTest : ( kindTest | nameTest );
    public final void nodeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:523:29: ( kindTest | nameTest )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==DOCUMENTNODE||LA81_0==PROCESSING_INSTRUCTION||LA81_0==SCHEMAATTRIBUTE||LA81_0==TEXT||LA81_0==COMMENT||LA81_0==ELEMENT||LA81_0==ATTRIBUTE||LA81_0==NODE||LA81_0==SCHEMAELEMENT) ) {
                alt81=1;
            }
            else if ( (LA81_0==STARSi||(LA81_0>=NCName && LA81_0<=QName)) ) {
                alt81=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("523:1: nodeTest : ( kindTest | nameTest );", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // etc/XQFT.g:523:31: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_nodeTest7322);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:523:42: nameTest
                    {
                    pushFollow(FOLLOW_nameTest_in_nodeTest7326);
                    nameTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end nodeTest


    // $ANTLR start nameTest
    // etc/XQFT.g:525:1: nameTest : ( QName | wildcard );
    public final void nameTest() throws RecognitionException {
        try {
            // etc/XQFT.g:525:29: ( QName | wildcard )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==QName) ) {
                alt82=1;
            }
            else if ( (LA82_0==STARSi||LA82_0==NCName) ) {
                alt82=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("525:1: nameTest : ( QName | wildcard );", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // etc/XQFT.g:525:31: QName
                    {
                    match(input,QName,FOLLOW_QName_in_nameTest7353); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:525:39: wildcard
                    {
                    pushFollow(FOLLOW_wildcard_in_nameTest7357);
                    wildcard();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end nameTest


    // $ANTLR start wildcard
    // etc/XQFT.g:529:1: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | ( NCName COLONSi STARSi ) );
    public final void wildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:529:29: ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | ( NCName COLONSi STARSi ) )
            int alt83=3;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==STARSi) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==COLONSi) && (synpred3())) {
                    alt83=1;
                }
                else if ( (LA83_1==EOF||(LA83_1>=PIPESi && LA83_1<=WHERE)||(LA83_1>=EQUALSi && LA83_1<=NOTEQUALSi)||LA83_1==CAST||(LA83_1>=ELSE && LA83_1<=TREAT)||LA83_1==SLASH||LA83_1==CASTABLE||(LA83_1>=FOR && LA83_1<=INSTANCE)||(LA83_1>=EXCEPT && LA83_1<=TO)||LA83_1==SATISFIES||LA83_1==SEMICOLONSi||LA83_1==EMPTY||LA83_1==CASE||LA83_1==MINUSSi||(LA83_1>=COMMASi && LA83_1<=LET)||LA83_1==RIGHTBRACKETSi||LA83_1==LEVELS||(LA83_1>=DIV && LA83_1<=PLUSSi)||LA83_1==ORDER||LA83_1==UNION||LA83_1==COLLATION||LA83_1==OR||LA83_1==DOUBLESLASH||(LA83_1>=DESCENDING && LA83_1<=STARSi)||(LA83_1>=STABLE && LA83_1<=LEFTBRACKETSi)||LA83_1==WITHOUT||LA83_1==RIGHTPARENTHESISSi||LA83_1==RETURN||LA83_1==DEFAULT||LA83_1==AND||LA83_1==INTERSECT||LA83_1==TIMES||LA83_1==FTCONTAINS||(LA83_1>=MOD && LA83_1<=RIGHTBRACESi)||(LA83_1>=EQ && LA83_1<=NODEAFTERSi)||(LA83_1>=WORDS && LA83_1<=PARAGRAPHS)) ) {
                    alt83=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("529:1: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | ( NCName COLONSi STARSi ) );", 83, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA83_0==NCName) ) {
                alt83=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("529:1: wildcard : ( ( STARSi COLONSi NCName )=> STARSi COLONSi NCName | STARSi | ( NCName COLONSi STARSi ) );", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // etc/XQFT.g:529:31: ( STARSi COLONSi NCName )=> STARSi COLONSi NCName
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7397); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7399); if (failed) return ;
                    match(input,NCName,FOLLOW_NCName_in_wildcard7401); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:530:10: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7412); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:531:35: ( NCName COLONSi STARSi )
                    {
                    // etc/XQFT.g:531:35: ( NCName COLONSi STARSi )
                    // etc/XQFT.g:531:36: NCName COLONSi STARSi
                    {
                    match(input,NCName,FOLLOW_NCName_in_wildcard7449); if (failed) return ;
                    match(input,COLONSi,FOLLOW_COLONSi_in_wildcard7451); if (failed) return ;
                    match(input,STARSi,FOLLOW_STARSi_in_wildcard7453); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end wildcard


    // $ANTLR start filterExpr
    // etc/XQFT.g:534:1: filterExpr : primaryExpr predicateList ;
    public final void filterExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:534:29: ( primaryExpr predicateList )
            // etc/XQFT.g:534:31: primaryExpr predicateList
            {
            pushFollow(FOLLOW_primaryExpr_in_filterExpr7482);
            primaryExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_predicateList_in_filterExpr7484);
            predicateList();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end filterExpr


    // $ANTLR start predicateList
    // etc/XQFT.g:536:1: predicateList : ( predicate )* ;
    public final void predicateList() throws RecognitionException {
        try {
            // etc/XQFT.g:536:29: ( ( predicate )* )
            // etc/XQFT.g:536:31: ( predicate )*
            {
            // etc/XQFT.g:536:31: ( predicate )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==LEFTBRACKETSi) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // etc/XQFT.g:536:31: predicate
            	    {
            	    pushFollow(FOLLOW_predicate_in_predicateList7506);
            	    predicate();
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end predicateList


    // $ANTLR start predicate
    // etc/XQFT.g:538:1: predicate : LEFTBRACKETSi expr RIGHTBRACKETSi ;
    public final void predicate() throws RecognitionException {
        try {
            // etc/XQFT.g:538:29: ( LEFTBRACKETSi expr RIGHTBRACKETSi )
            // etc/XQFT.g:538:31: LEFTBRACKETSi expr RIGHTBRACKETSi
            {
            match(input,LEFTBRACKETSi,FOLLOW_LEFTBRACKETSi_in_predicate7533); if (failed) return ;
            pushFollow(FOLLOW_expr_in_predicate7535);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACKETSi,FOLLOW_RIGHTBRACKETSi_in_predicate7537); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end predicate


    // $ANTLR start primaryExpr
    // etc/XQFT.g:540:1: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );
    public final void primaryExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:540:29: ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor )
            int alt85=8;
            switch ( input.LA(1) ) {
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
                {
                alt85=1;
                }
                break;
            case DOLLARSi:
                {
                alt85=2;
                }
                break;
            case LEFTPARENTHESISSi:
                {
                alt85=3;
                }
                break;
            case DOT:
                {
                alt85=4;
                }
                break;
            case QName:
                {
                alt85=5;
                }
                break;
            case ORDERED:
                {
                alt85=6;
                }
                break;
            case UNORDERED:
                {
                alt85=7;
                }
                break;
            case LESSTHANSi:
            case PROCESSING_INSTRUCTION:
            case DOCUMENT:
            case LEFTXMLCOMMENT:
            case TEXT:
            case LEFTPITARGET:
            case COMMENT:
            case ELEMENT:
            case ATTRIBUTE:
                {
                alt85=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("540:1: primaryExpr : ( literal | varRef | parenthesizedExpr | contextItemExpr | functionCall | orderedExpr | unorderedExpr | constructor );", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // etc/XQFT.g:540:31: literal
                    {
                    pushFollow(FOLLOW_literal_in_primaryExpr7561);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:540:41: varRef
                    {
                    pushFollow(FOLLOW_varRef_in_primaryExpr7565);
                    varRef();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:540:50: parenthesizedExpr
                    {
                    pushFollow(FOLLOW_parenthesizedExpr_in_primaryExpr7569);
                    parenthesizedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:540:70: contextItemExpr
                    {
                    pushFollow(FOLLOW_contextItemExpr_in_primaryExpr7573);
                    contextItemExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:540:88: functionCall
                    {
                    pushFollow(FOLLOW_functionCall_in_primaryExpr7577);
                    functionCall();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:540:103: orderedExpr
                    {
                    pushFollow(FOLLOW_orderedExpr_in_primaryExpr7581);
                    orderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:540:117: unorderedExpr
                    {
                    pushFollow(FOLLOW_unorderedExpr_in_primaryExpr7585);
                    unorderedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:540:133: constructor
                    {
                    pushFollow(FOLLOW_constructor_in_primaryExpr7589);
                    constructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end primaryExpr


    // $ANTLR start literal
    // etc/XQFT.g:542:1: literal : ( numericLiteral | StringLiteral );
    public final void literal() throws RecognitionException {
        try {
            // etc/XQFT.g:542:29: ( numericLiteral | StringLiteral )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=IntegerLiteral && LA86_0<=DoubleLiteral)) ) {
                alt86=1;
            }
            else if ( (LA86_0==StringLiteral) ) {
                alt86=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("542:1: literal : ( numericLiteral | StringLiteral );", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // etc/XQFT.g:542:31: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal7617);
                    numericLiteral();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:542:48: StringLiteral
                    {
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal7621); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end literal


    // $ANTLR start numericLiteral
    // etc/XQFT.g:544:1: numericLiteral : ( IntegerLiteral | DecimalLiteral | DoubleLiteral );
    public final void numericLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:544:29: ( IntegerLiteral | DecimalLiteral | DoubleLiteral )
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end numericLiteral


    // $ANTLR start varRef
    // etc/XQFT.g:546:1: varRef : DOLLARSi varName ;
    public final void varRef() throws RecognitionException {
        try {
            // etc/XQFT.g:546:29: ( DOLLARSi varName )
            // etc/XQFT.g:546:31: DOLLARSi varName
            {
            match(input,DOLLARSi,FOLLOW_DOLLARSi_in_varRef7679); if (failed) return ;
            pushFollow(FOLLOW_varName_in_varRef7681);
            varName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end varRef


    // $ANTLR start varName
    // etc/XQFT.g:548:1: varName : QName ;
    public final void varName() throws RecognitionException {
        try {
            // etc/XQFT.g:548:29: ( QName )
            // etc/XQFT.g:548:31: QName
            {
            match(input,QName,FOLLOW_QName_in_varName7709); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end varName


    // $ANTLR start parenthesizedExpr
    // etc/XQFT.g:550:1: parenthesizedExpr : LEFTPARENTHESISSi ( expr )? RIGHTPARENTHESISSi ;
    public final void parenthesizedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:550:29: ( LEFTPARENTHESISSi ( expr )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:550:31: LEFTPARENTHESISSi ( expr )? RIGHTPARENTHESISSi
            {
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_parenthesizedExpr7727); if (failed) return ;
            // etc/XQFT.g:550:49: ( expr )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==TYPESWITCH||LA87_0==DOLLARSi||(LA87_0>=LEFTPRAGMA && LA87_0<=DOCUMENTNODE)||LA87_0==LESSTHANSi||LA87_0==SLASH||LA87_0==EVERY||LA87_0==FOR||LA87_0==PROCESSING_INSTRUCTION||LA87_0==MINUSSi||LA87_0==DOCUMENT||LA87_0==VALIDATE||LA87_0==LET||LA87_0==PLUSSi||LA87_0==SCHEMAATTRIBUTE||LA87_0==DOUBLESLASH||LA87_0==IF||LA87_0==STARSi||LA87_0==LEFTXMLCOMMENT||LA87_0==TEXT||LA87_0==UNORDERED||LA87_0==LEFTPITARGET||LA87_0==COMMENT||(LA87_0>=ELEMENT && LA87_0<=LEFTPARENTHESISSi)||LA87_0==ATSi||LA87_0==ATTRIBUTE||(LA87_0>=NODE && LA87_0<=SOME)||LA87_0==SCHEMAELEMENT||LA87_0==CHILD||(LA87_0>=DESCENDANT && LA87_0<=DOTDOT)||(LA87_0>=IntegerLiteral && LA87_0<=DoubleLiteral)||LA87_0==StringLiteral||(LA87_0>=NCName && LA87_0<=QName)) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // etc/XQFT.g:550:49: expr
                    {
                    pushFollow(FOLLOW_expr_in_parenthesizedExpr7729);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_parenthesizedExpr7732); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end parenthesizedExpr


    // $ANTLR start contextItemExpr
    // etc/XQFT.g:552:1: contextItemExpr : DOT ;
    public final void contextItemExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:552:29: ( DOT )
            // etc/XQFT.g:552:31: DOT
            {
            match(input,DOT,FOLLOW_DOT_in_contextItemExpr7752); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end contextItemExpr


    // $ANTLR start orderedExpr
    // etc/XQFT.g:554:1: orderedExpr : ORDERED LEFTBRACESi expr RIGHTBRACESi ;
    public final void orderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:554:29: ( ORDERED LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:554:31: ORDERED LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_orderedExpr7776); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_orderedExpr7778); if (failed) return ;
            pushFollow(FOLLOW_expr_in_orderedExpr7780);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_orderedExpr7782); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end orderedExpr


    // $ANTLR start unorderedExpr
    // etc/XQFT.g:556:1: unorderedExpr : UNORDERED LEFTBRACESi expr RIGHTBRACESi ;
    public final void unorderedExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:556:29: ( UNORDERED LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:556:31: UNORDERED LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,UNORDERED,FOLLOW_UNORDERED_in_unorderedExpr7804); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_unorderedExpr7806); if (failed) return ;
            pushFollow(FOLLOW_expr_in_unorderedExpr7808);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_unorderedExpr7810); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end unorderedExpr


    // $ANTLR start functionCall
    // etc/XQFT.g:558:1: functionCall : QName LEFTPARENTHESISSi ( exprSingle ( COMMASi exprSingle )* )? RIGHTPARENTHESISSi ;
    public final void functionCall() throws RecognitionException {
        try {
            // etc/XQFT.g:558:29: ( QName LEFTPARENTHESISSi ( exprSingle ( COMMASi exprSingle )* )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:558:31: QName LEFTPARENTHESISSi ( exprSingle ( COMMASi exprSingle )* )? RIGHTPARENTHESISSi
            {
            match(input,QName,FOLLOW_QName_in_functionCall7833); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_functionCall7835); if (failed) return ;
            // etc/XQFT.g:558:55: ( exprSingle ( COMMASi exprSingle )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==TYPESWITCH||LA89_0==DOLLARSi||(LA89_0>=LEFTPRAGMA && LA89_0<=DOCUMENTNODE)||LA89_0==LESSTHANSi||LA89_0==SLASH||LA89_0==EVERY||LA89_0==FOR||LA89_0==PROCESSING_INSTRUCTION||LA89_0==MINUSSi||LA89_0==DOCUMENT||LA89_0==VALIDATE||LA89_0==LET||LA89_0==PLUSSi||LA89_0==SCHEMAATTRIBUTE||LA89_0==DOUBLESLASH||LA89_0==IF||LA89_0==STARSi||LA89_0==LEFTXMLCOMMENT||LA89_0==TEXT||LA89_0==UNORDERED||LA89_0==LEFTPITARGET||LA89_0==COMMENT||(LA89_0>=ELEMENT && LA89_0<=LEFTPARENTHESISSi)||LA89_0==ATSi||LA89_0==ATTRIBUTE||(LA89_0>=NODE && LA89_0<=SOME)||LA89_0==SCHEMAELEMENT||LA89_0==CHILD||(LA89_0>=DESCENDANT && LA89_0<=DOTDOT)||(LA89_0>=IntegerLiteral && LA89_0<=DoubleLiteral)||LA89_0==StringLiteral||(LA89_0>=NCName && LA89_0<=QName)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // etc/XQFT.g:558:56: exprSingle ( COMMASi exprSingle )*
                    {
                    pushFollow(FOLLOW_exprSingle_in_functionCall7838);
                    exprSingle();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:558:67: ( COMMASi exprSingle )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==COMMASi) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // etc/XQFT.g:558:68: COMMASi exprSingle
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_functionCall7841); if (failed) return ;
                    	    pushFollow(FOLLOW_exprSingle_in_functionCall7843);
                    	    exprSingle();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_functionCall7849); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end functionCall


    // $ANTLR start constructor
    // etc/XQFT.g:561:1: constructor : ( directConstructor | computedConstructor );
    public final void constructor() throws RecognitionException {
        try {
            // etc/XQFT.g:561:29: ( directConstructor | computedConstructor )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==LESSTHANSi||LA90_0==LEFTXMLCOMMENT||LA90_0==LEFTPITARGET) ) {
                alt90=1;
            }
            else if ( (LA90_0==PROCESSING_INSTRUCTION||LA90_0==DOCUMENT||LA90_0==TEXT||LA90_0==COMMENT||LA90_0==ELEMENT||LA90_0==ATTRIBUTE) ) {
                alt90=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("561:1: constructor : ( directConstructor | computedConstructor );", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // etc/XQFT.g:561:31: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_constructor7957);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:562:35: computedConstructor
                    {
                    pushFollow(FOLLOW_computedConstructor_in_constructor7993);
                    computedConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end constructor


    // $ANTLR start directConstructor
    // etc/XQFT.g:564:1: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );
    public final void directConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:564:29: ( dirElemConstructor | dirCommentConstructor | dirPIConstructor )
            int alt91=3;
            switch ( input.LA(1) ) {
            case LESSTHANSi:
                {
                alt91=1;
                }
                break;
            case LEFTXMLCOMMENT:
                {
                alt91=2;
                }
                break;
            case LEFTPITARGET:
                {
                alt91=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("564:1: directConstructor : ( dirElemConstructor | dirCommentConstructor | dirPIConstructor );", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // etc/XQFT.g:564:31: dirElemConstructor
                    {
                    pushFollow(FOLLOW_dirElemConstructor_in_directConstructor8011);
                    dirElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:565:35: dirCommentConstructor
                    {
                    pushFollow(FOLLOW_dirCommentConstructor_in_directConstructor8047);
                    dirCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:566:35: dirPIConstructor
                    {
                    pushFollow(FOLLOW_dirPIConstructor_in_directConstructor8083);
                    dirPIConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end directConstructor


    // $ANTLR start dirElemConstructor
    // etc/XQFT.g:568:1: dirElemConstructor : LESSTHANSi QName dirAttributeList ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG QName ( S )? BIGGERTHANSi ) ) ;
    public final void dirElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:568:29: ( LESSTHANSi QName dirAttributeList ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG QName ( S )? BIGGERTHANSi ) ) )
            // etc/XQFT.g:568:31: LESSTHANSi QName dirAttributeList ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG QName ( S )? BIGGERTHANSi ) )
            {
            match(input,LESSTHANSi,FOLLOW_LESSTHANSi_in_dirElemConstructor8100); if (failed) return ;
            match(input,QName,FOLLOW_QName_in_dirElemConstructor8102); if (failed) return ;
            pushFollow(FOLLOW_dirAttributeList_in_dirElemConstructor8104);
            dirAttributeList();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:568:65: ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG QName ( S )? BIGGERTHANSi ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==RIGHTSELFTERMINATOR) ) {
                alt94=1;
            }
            else if ( (LA94_0==BIGGERTHANSi) ) {
                alt94=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("568:65: ( RIGHTSELFTERMINATOR | ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG QName ( S )? BIGGERTHANSi ) )", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // etc/XQFT.g:568:66: RIGHTSELFTERMINATOR
                    {
                    match(input,RIGHTSELFTERMINATOR,FOLLOW_RIGHTSELFTERMINATOR_in_dirElemConstructor8107); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:568:88: ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG QName ( S )? BIGGERTHANSi )
                    {
                    // etc/XQFT.g:568:88: ( BIGGERTHANSi ( dirElemContent )* LEFTENDTAG QName ( S )? BIGGERTHANSi )
                    // etc/XQFT.g:568:89: BIGGERTHANSi ( dirElemContent )* LEFTENDTAG QName ( S )? BIGGERTHANSi
                    {
                    match(input,BIGGERTHANSi,FOLLOW_BIGGERTHANSi_in_dirElemConstructor8112); if (failed) return ;
                    // etc/XQFT.g:568:102: ( dirElemContent )*
                    loop92:
                    do {
                        int alt92=2;
                        int LA92_0 = input.LA(1);

                        if ( (LA92_0==LEFTBRACESi||LA92_0==LESSTHANSi||LA92_0==LEFTCDATA||LA92_0==DOUBLERIGHTBRACES||LA92_0==LEFTXMLCOMMENT||LA92_0==LEFTPITARGET||LA92_0==DOUBLELEFTBRACES||(LA92_0>=PredefinedEntityRef && LA92_0<=CharRef)||LA92_0==ElementContentChar) ) {
                            alt92=1;
                        }


                        switch (alt92) {
                    	case 1 :
                    	    // etc/XQFT.g:568:102: dirElemContent
                    	    {
                    	    pushFollow(FOLLOW_dirElemContent_in_dirElemConstructor8114);
                    	    dirElemContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop92;
                        }
                    } while (true);

                    match(input,LEFTENDTAG,FOLLOW_LEFTENDTAG_in_dirElemConstructor8117); if (failed) return ;
                    match(input,QName,FOLLOW_QName_in_dirElemConstructor8119); if (failed) return ;
                    // etc/XQFT.g:568:135: ( S )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==S) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // etc/XQFT.g:568:135: S
                            {
                            match(input,S,FOLLOW_S_in_dirElemConstructor8121); if (failed) return ;

                            }
                            break;

                    }

                    match(input,BIGGERTHANSi,FOLLOW_BIGGERTHANSi_in_dirElemConstructor8124); if (failed) return ;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirElemConstructor


    // $ANTLR start dirAttributeList
    // etc/XQFT.g:570:1: dirAttributeList : ( S ( QName ( S )? EQUALSi ( S )? dirAttributeValue )? )* ;
    public final void dirAttributeList() throws RecognitionException {
        try {
            // etc/XQFT.g:570:29: ( ( S ( QName ( S )? EQUALSi ( S )? dirAttributeValue )? )* )
            // etc/XQFT.g:570:31: ( S ( QName ( S )? EQUALSi ( S )? dirAttributeValue )? )*
            {
            // etc/XQFT.g:570:31: ( S ( QName ( S )? EQUALSi ( S )? dirAttributeValue )? )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==S) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // etc/XQFT.g:570:32: S ( QName ( S )? EQUALSi ( S )? dirAttributeValue )?
            	    {
            	    match(input,S,FOLLOW_S_in_dirAttributeList8148); if (failed) return ;
            	    // etc/XQFT.g:570:34: ( QName ( S )? EQUALSi ( S )? dirAttributeValue )?
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==QName) ) {
            	        alt97=1;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // etc/XQFT.g:570:35: QName ( S )? EQUALSi ( S )? dirAttributeValue
            	            {
            	            match(input,QName,FOLLOW_QName_in_dirAttributeList8151); if (failed) return ;
            	            // etc/XQFT.g:570:41: ( S )?
            	            int alt95=2;
            	            int LA95_0 = input.LA(1);

            	            if ( (LA95_0==S) ) {
            	                alt95=1;
            	            }
            	            switch (alt95) {
            	                case 1 :
            	                    // etc/XQFT.g:570:41: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList8153); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            match(input,EQUALSi,FOLLOW_EQUALSi_in_dirAttributeList8156); if (failed) return ;
            	            // etc/XQFT.g:570:52: ( S )?
            	            int alt96=2;
            	            int LA96_0 = input.LA(1);

            	            if ( (LA96_0==S) ) {
            	                alt96=1;
            	            }
            	            switch (alt96) {
            	                case 1 :
            	                    // etc/XQFT.g:570:52: S
            	                    {
            	                    match(input,S,FOLLOW_S_in_dirAttributeList8158); if (failed) return ;

            	                    }
            	                    break;

            	            }

            	            pushFollow(FOLLOW_dirAttributeValue_in_dirAttributeList8161);
            	            dirAttributeValue();
            	            _fsp--;
            	            if (failed) return ;

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirAttributeList


    // $ANTLR start dirAttributeValue
    // etc/XQFT.g:572:1: dirAttributeValue : ( ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE ) );
    public final void dirAttributeValue() throws RecognitionException {
        try {
            // etc/XQFT.g:572:29: ( ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==DOUBLEQUOTESi) ) {
                alt101=1;
            }
            else if ( (LA101_0==SINGLEQUOTE) ) {
                alt101=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("572:1: dirAttributeValue : ( ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi ) | ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE ) );", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // etc/XQFT.g:572:31: ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi )
                    {
                    // etc/XQFT.g:572:31: ( DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi )
                    // etc/XQFT.g:572:32: DOUBLEQUOTESi ( EscapeQuot | quotAttrValueContent )* DOUBLEQUOTESi
                    {
                    match(input,DOUBLEQUOTESi,FOLLOW_DOUBLEQUOTESi_in_dirAttributeValue8186); if (failed) return ;
                    // etc/XQFT.g:572:46: ( EscapeQuot | quotAttrValueContent )*
                    loop99:
                    do {
                        int alt99=3;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==EscapeQuot) ) {
                            alt99=1;
                        }
                        else if ( (LA99_0==LEFTBRACESi||LA99_0==DOUBLERIGHTBRACES||LA99_0==DOUBLELEFTBRACES||(LA99_0>=PredefinedEntityRef && LA99_0<=CharRef)||LA99_0==QuotAttrContentChar) ) {
                            alt99=2;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // etc/XQFT.g:572:47: EscapeQuot
                    	    {
                    	    match(input,EscapeQuot,FOLLOW_EscapeQuot_in_dirAttributeValue8189); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:572:60: quotAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_quotAttrValueContent_in_dirAttributeValue8193);
                    	    quotAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    match(input,DOUBLEQUOTESi,FOLLOW_DOUBLEQUOTESi_in_dirAttributeValue8197); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:573:35: ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE )
                    {
                    // etc/XQFT.g:573:35: ( SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE )
                    // etc/XQFT.g:573:36: SINGLEQUOTE ( EscapeApos | aposAttrValueContent )* SINGLEQUOTE
                    {
                    match(input,SINGLEQUOTE,FOLLOW_SINGLEQUOTE_in_dirAttributeValue8235); if (failed) return ;
                    // etc/XQFT.g:573:48: ( EscapeApos | aposAttrValueContent )*
                    loop100:
                    do {
                        int alt100=3;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==EscapeApos) ) {
                            alt100=1;
                        }
                        else if ( (LA100_0==LEFTBRACESi||LA100_0==DOUBLERIGHTBRACES||LA100_0==DOUBLELEFTBRACES||(LA100_0>=PredefinedEntityRef && LA100_0<=CharRef)||LA100_0==AposAttrContentChar) ) {
                            alt100=2;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // etc/XQFT.g:573:49: EscapeApos
                    	    {
                    	    match(input,EscapeApos,FOLLOW_EscapeApos_in_dirAttributeValue8238); if (failed) return ;

                    	    }
                    	    break;
                    	case 2 :
                    	    // etc/XQFT.g:573:62: aposAttrValueContent
                    	    {
                    	    pushFollow(FOLLOW_aposAttrValueContent_in_dirAttributeValue8242);
                    	    aposAttrValueContent();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    match(input,SINGLEQUOTE,FOLLOW_SINGLEQUOTE_in_dirAttributeValue8246); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirAttributeValue


    // $ANTLR start quotAttrValueContent
    // etc/XQFT.g:575:1: quotAttrValueContent : ( QuotAttrContentChar | commonContent );
    public final void quotAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:575:26: ( QuotAttrContentChar | commonContent )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==QuotAttrContentChar) ) {
                alt102=1;
            }
            else if ( (LA102_0==LEFTBRACESi||LA102_0==DOUBLERIGHTBRACES||LA102_0==DOUBLELEFTBRACES||(LA102_0>=PredefinedEntityRef && LA102_0<=CharRef)) ) {
                alt102=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("575:1: quotAttrValueContent : ( QuotAttrContentChar | commonContent );", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // etc/XQFT.g:575:28: QuotAttrContentChar
                    {
                    match(input,QuotAttrContentChar,FOLLOW_QuotAttrContentChar_in_quotAttrValueContent8261); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:576:35: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_quotAttrValueContent8297);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end quotAttrValueContent


    // $ANTLR start aposAttrValueContent
    // etc/XQFT.g:578:1: aposAttrValueContent : ( AposAttrContentChar | commonContent );
    public final void aposAttrValueContent() throws RecognitionException {
        try {
            // etc/XQFT.g:578:29: ( AposAttrContentChar | commonContent )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==AposAttrContentChar) ) {
                alt103=1;
            }
            else if ( (LA103_0==LEFTBRACESi||LA103_0==DOUBLERIGHTBRACES||LA103_0==DOUBLELEFTBRACES||(LA103_0>=PredefinedEntityRef && LA103_0<=CharRef)) ) {
                alt103=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("578:1: aposAttrValueContent : ( AposAttrContentChar | commonContent );", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // etc/XQFT.g:578:31: AposAttrContentChar
                    {
                    match(input,AposAttrContentChar,FOLLOW_AposAttrContentChar_in_aposAttrValueContent8312); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:579:35: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_aposAttrValueContent8348);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end aposAttrValueContent


    // $ANTLR start dirElemContent
    // etc/XQFT.g:581:1: dirElemContent : ( directConstructor | cDataSection | commonContent | ElementContentChar );
    public final void dirElemContent() throws RecognitionException {
        try {
            // etc/XQFT.g:581:29: ( directConstructor | cDataSection | commonContent | ElementContentChar )
            int alt104=4;
            switch ( input.LA(1) ) {
            case LESSTHANSi:
            case LEFTXMLCOMMENT:
            case LEFTPITARGET:
                {
                alt104=1;
                }
                break;
            case LEFTCDATA:
                {
                alt104=2;
                }
                break;
            case LEFTBRACESi:
            case DOUBLERIGHTBRACES:
            case DOUBLELEFTBRACES:
            case PredefinedEntityRef:
            case CharRef:
                {
                alt104=3;
                }
                break;
            case ElementContentChar:
                {
                alt104=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("581:1: dirElemContent : ( directConstructor | cDataSection | commonContent | ElementContentChar );", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // etc/XQFT.g:581:31: directConstructor
                    {
                    pushFollow(FOLLOW_directConstructor_in_dirElemContent8369);
                    directConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:582:35: cDataSection
                    {
                    pushFollow(FOLLOW_cDataSection_in_dirElemContent8405);
                    cDataSection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:583:35: commonContent
                    {
                    pushFollow(FOLLOW_commonContent_in_dirElemContent8441);
                    commonContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:584:35: ElementContentChar
                    {
                    match(input,ElementContentChar,FOLLOW_ElementContentChar_in_dirElemContent8477); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirElemContent


    // $ANTLR start commonContent
    // etc/XQFT.g:586:1: commonContent : ( PredefinedEntityRef | CharRef | DOUBLELEFTBRACES | DOUBLERIGHTBRACES | enclosedExpr );
    public final void commonContent() throws RecognitionException {
        try {
            // etc/XQFT.g:586:29: ( PredefinedEntityRef | CharRef | DOUBLELEFTBRACES | DOUBLERIGHTBRACES | enclosedExpr )
            int alt105=5;
            switch ( input.LA(1) ) {
            case PredefinedEntityRef:
                {
                alt105=1;
                }
                break;
            case CharRef:
                {
                alt105=2;
                }
                break;
            case DOUBLELEFTBRACES:
                {
                alt105=3;
                }
                break;
            case DOUBLERIGHTBRACES:
                {
                alt105=4;
                }
                break;
            case LEFTBRACESi:
                {
                alt105=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("586:1: commonContent : ( PredefinedEntityRef | CharRef | DOUBLELEFTBRACES | DOUBLERIGHTBRACES | enclosedExpr );", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // etc/XQFT.g:586:31: PredefinedEntityRef
                    {
                    match(input,PredefinedEntityRef,FOLLOW_PredefinedEntityRef_in_commonContent8499); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:586:53: CharRef
                    {
                    match(input,CharRef,FOLLOW_CharRef_in_commonContent8503); if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:586:63: DOUBLELEFTBRACES
                    {
                    match(input,DOUBLELEFTBRACES,FOLLOW_DOUBLELEFTBRACES_in_commonContent8507); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:586:82: DOUBLERIGHTBRACES
                    {
                    match(input,DOUBLERIGHTBRACES,FOLLOW_DOUBLERIGHTBRACES_in_commonContent8511); if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:586:102: enclosedExpr
                    {
                    pushFollow(FOLLOW_enclosedExpr_in_commonContent8515);
                    enclosedExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end commonContent


    // $ANTLR start dirCommentConstructor
    // etc/XQFT.g:588:1: dirCommentConstructor : LEFTXMLCOMMENT dirCommentContents RIGHTXMLCOMMENT ;
    public final void dirCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:588:29: ( LEFTXMLCOMMENT dirCommentContents RIGHTXMLCOMMENT )
            // etc/XQFT.g:588:31: LEFTXMLCOMMENT dirCommentContents RIGHTXMLCOMMENT
            {
            match(input,LEFTXMLCOMMENT,FOLLOW_LEFTXMLCOMMENT_in_dirCommentConstructor8529); if (failed) return ;
            pushFollow(FOLLOW_dirCommentContents_in_dirCommentConstructor8531);
            dirCommentContents();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTXMLCOMMENT,FOLLOW_RIGHTXMLCOMMENT_in_dirCommentConstructor8533); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirCommentConstructor


    // $ANTLR start dirCommentContents
    // etc/XQFT.g:594:1: dirCommentContents : ( CharNotMinus | ( MINUSSi CharNotMinus ) )* ;
    public final void dirCommentContents() throws RecognitionException {
        try {
            // etc/XQFT.g:594:32: ( ( CharNotMinus | ( MINUSSi CharNotMinus ) )* )
            // etc/XQFT.g:594:34: ( CharNotMinus | ( MINUSSi CharNotMinus ) )*
            {
            // etc/XQFT.g:594:34: ( CharNotMinus | ( MINUSSi CharNotMinus ) )*
            loop106:
            do {
                int alt106=3;
                int LA106_0 = input.LA(1);

                if ( (LA106_0==CharNotMinus) ) {
                    alt106=1;
                }
                else if ( (LA106_0==MINUSSi) ) {
                    alt106=2;
                }


                switch (alt106) {
            	case 1 :
            	    // etc/XQFT.g:594:35: CharNotMinus
            	    {
            	    match(input,CharNotMinus,FOLLOW_CharNotMinus_in_dirCommentContents8560); if (failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // etc/XQFT.g:594:50: ( MINUSSi CharNotMinus )
            	    {
            	    // etc/XQFT.g:594:50: ( MINUSSi CharNotMinus )
            	    // etc/XQFT.g:594:51: MINUSSi CharNotMinus
            	    {
            	    match(input,MINUSSi,FOLLOW_MINUSSi_in_dirCommentContents8565); if (failed) return ;
            	    match(input,CharNotMinus,FOLLOW_CharNotMinus_in_dirCommentContents8567); if (failed) return ;

            	    }


            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirCommentContents


    // $ANTLR start dirPIConstructor
    // etc/XQFT.g:597:1: dirPIConstructor : LEFTPITARGET piTarget ( S dirPIContents )? RIGHTPITARGET ;
    public final void dirPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:597:29: ( LEFTPITARGET piTarget ( S dirPIContents )? RIGHTPITARGET )
            // etc/XQFT.g:597:31: LEFTPITARGET piTarget ( S dirPIContents )? RIGHTPITARGET
            {
            match(input,LEFTPITARGET,FOLLOW_LEFTPITARGET_in_dirPIConstructor8593); if (failed) return ;
            pushFollow(FOLLOW_piTarget_in_dirPIConstructor8595);
            piTarget();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:597:53: ( S dirPIContents )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==S) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // etc/XQFT.g:597:54: S dirPIContents
                    {
                    match(input,S,FOLLOW_S_in_dirPIConstructor8598); if (failed) return ;
                    pushFollow(FOLLOW_dirPIContents_in_dirPIConstructor8600);
                    dirPIContents();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPITARGET,FOLLOW_RIGHTPITARGET_in_dirPIConstructor8604); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirPIConstructor


    // $ANTLR start dirPIContents
    // etc/XQFT.g:603:1: dirPIContents : m= ZeroOrMoreChar {...}?;
    public final void dirPIContents() throws RecognitionException {
        Token m=null;

        try {
            // etc/XQFT.g:603:29: (m= ZeroOrMoreChar {...}?)
            // etc/XQFT.g:603:31: m= ZeroOrMoreChar {...}?
            {
            m=(Token)input.LT(1);
            match(input,ZeroOrMoreChar,FOLLOW_ZeroOrMoreChar_in_dirPIContents8634); if (failed) return ;
            if ( !( !m.getText().contains("?>") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "dirPIContents", " !$m.getText().contains(\"?>\") ");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end dirPIContents


    // $ANTLR start cDataSection
    // etc/XQFT.g:606:1: cDataSection : LEFTCDATA cDataSectionContents RIGHTCDATA ;
    public final void cDataSection() throws RecognitionException {
        try {
            // etc/XQFT.g:606:29: ( LEFTCDATA cDataSectionContents RIGHTCDATA )
            // etc/XQFT.g:606:31: LEFTCDATA cDataSectionContents RIGHTCDATA
            {
            match(input,LEFTCDATA,FOLLOW_LEFTCDATA_in_cDataSection8661); if (failed) return ;
            pushFollow(FOLLOW_cDataSectionContents_in_cDataSection8663);
            cDataSectionContents();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTCDATA,FOLLOW_RIGHTCDATA_in_cDataSection8665); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end cDataSection


    // $ANTLR start cDataSectionContents
    // etc/XQFT.g:613:1: cDataSectionContents : m= ZeroOrMoreChar {...}?;
    public final void cDataSectionContents() throws RecognitionException {
        Token m=null;

        try {
            // etc/XQFT.g:613:29: (m= ZeroOrMoreChar {...}?)
            // etc/XQFT.g:613:31: m= ZeroOrMoreChar {...}?
            {
            m=(Token)input.LT(1);
            match(input,ZeroOrMoreChar,FOLLOW_ZeroOrMoreChar_in_cDataSectionContents8689); if (failed) return ;
            if ( !( !m.getText().contains("]]>") ) ) {
                if (backtracking>0) {failed=true; return ;}
                throw new FailedPredicateException(input, "cDataSectionContents", " !$m.getText().contains(\"]]>\") ");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end cDataSectionContents


    // $ANTLR start computedConstructor
    // etc/XQFT.g:616:1: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );
    public final void computedConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:616:29: ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor )
            int alt108=6;
            switch ( input.LA(1) ) {
            case DOCUMENT:
                {
                alt108=1;
                }
                break;
            case ELEMENT:
                {
                alt108=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt108=3;
                }
                break;
            case TEXT:
                {
                alt108=4;
                }
                break;
            case COMMENT:
                {
                alt108=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt108=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("616:1: computedConstructor : ( compDocConstructor | compElemConstructor | compAttrConstructor | compTextConstructor | compCommentConstructor | compPIConstructor );", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // etc/XQFT.g:616:31: compDocConstructor
                    {
                    pushFollow(FOLLOW_compDocConstructor_in_computedConstructor8709);
                    compDocConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:617:35: compElemConstructor
                    {
                    pushFollow(FOLLOW_compElemConstructor_in_computedConstructor8745);
                    compElemConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:618:35: compAttrConstructor
                    {
                    pushFollow(FOLLOW_compAttrConstructor_in_computedConstructor8781);
                    compAttrConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:619:35: compTextConstructor
                    {
                    pushFollow(FOLLOW_compTextConstructor_in_computedConstructor8817);
                    compTextConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:620:35: compCommentConstructor
                    {
                    pushFollow(FOLLOW_compCommentConstructor_in_computedConstructor8853);
                    compCommentConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:621:35: compPIConstructor
                    {
                    pushFollow(FOLLOW_compPIConstructor_in_computedConstructor8889);
                    compPIConstructor();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end computedConstructor


    // $ANTLR start compDocConstructor
    // etc/XQFT.g:623:1: compDocConstructor : DOCUMENT LEFTBRACESi expr RIGHTBRACESi ;
    public final void compDocConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:623:29: ( DOCUMENT LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:623:31: DOCUMENT LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,DOCUMENT,FOLLOW_DOCUMENT_in_compDocConstructor8906); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compDocConstructor8908); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compDocConstructor8910);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compDocConstructor8912); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compDocConstructor


    // $ANTLR start compElemConstructor
    // etc/XQFT.g:625:1: compElemConstructor : ELEMENT ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( contentExpr )? RIGHTBRACESi ;
    public final void compElemConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:625:29: ( ELEMENT ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( contentExpr )? RIGHTBRACESi )
            // etc/XQFT.g:625:31: ELEMENT ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( contentExpr )? RIGHTBRACESi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_compElemConstructor8928); if (failed) return ;
            // etc/XQFT.g:625:39: ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==QName) ) {
                alt109=1;
            }
            else if ( (LA109_0==LEFTBRACESi) ) {
                alt109=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("625:39: ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) )", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // etc/XQFT.g:625:40: QName
                    {
                    match(input,QName,FOLLOW_QName_in_compElemConstructor8931); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:625:48: ( LEFTBRACESi expr RIGHTBRACESi )
                    {
                    // etc/XQFT.g:625:48: ( LEFTBRACESi expr RIGHTBRACESi )
                    // etc/XQFT.g:625:49: LEFTBRACESi expr RIGHTBRACESi
                    {
                    match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compElemConstructor8936); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compElemConstructor8938);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compElemConstructor8940); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compElemConstructor8944); if (failed) return ;
            // etc/XQFT.g:625:93: ( contentExpr )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==TYPESWITCH||LA110_0==DOLLARSi||(LA110_0>=LEFTPRAGMA && LA110_0<=DOCUMENTNODE)||LA110_0==LESSTHANSi||LA110_0==SLASH||LA110_0==EVERY||LA110_0==FOR||LA110_0==PROCESSING_INSTRUCTION||LA110_0==MINUSSi||LA110_0==DOCUMENT||LA110_0==VALIDATE||LA110_0==LET||LA110_0==PLUSSi||LA110_0==SCHEMAATTRIBUTE||LA110_0==DOUBLESLASH||LA110_0==IF||LA110_0==STARSi||LA110_0==LEFTXMLCOMMENT||LA110_0==TEXT||LA110_0==UNORDERED||LA110_0==LEFTPITARGET||LA110_0==COMMENT||(LA110_0>=ELEMENT && LA110_0<=LEFTPARENTHESISSi)||LA110_0==ATSi||LA110_0==ATTRIBUTE||(LA110_0>=NODE && LA110_0<=SOME)||LA110_0==SCHEMAELEMENT||LA110_0==CHILD||(LA110_0>=DESCENDANT && LA110_0<=DOTDOT)||(LA110_0>=IntegerLiteral && LA110_0<=DoubleLiteral)||LA110_0==StringLiteral||(LA110_0>=NCName && LA110_0<=QName)) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // etc/XQFT.g:625:93: contentExpr
                    {
                    pushFollow(FOLLOW_contentExpr_in_compElemConstructor8946);
                    contentExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compElemConstructor8949); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compElemConstructor


    // $ANTLR start contentExpr
    // etc/XQFT.g:627:1: contentExpr : expr ;
    public final void contentExpr() throws RecognitionException {
        try {
            // etc/XQFT.g:627:29: ( expr )
            // etc/XQFT.g:627:31: expr
            {
            pushFollow(FOLLOW_expr_in_contentExpr8973);
            expr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end contentExpr


    // $ANTLR start compAttrConstructor
    // etc/XQFT.g:629:1: compAttrConstructor : ATTRIBUTE ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi ;
    public final void compAttrConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:629:29: ( ATTRIBUTE ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi )
            // etc/XQFT.g:629:31: ATTRIBUTE ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_compAttrConstructor8989); if (failed) return ;
            // etc/XQFT.g:629:41: ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==QName) ) {
                alt111=1;
            }
            else if ( (LA111_0==LEFTBRACESi) ) {
                alt111=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("629:41: ( QName | ( LEFTBRACESi expr RIGHTBRACESi ) )", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // etc/XQFT.g:629:42: QName
                    {
                    match(input,QName,FOLLOW_QName_in_compAttrConstructor8992); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:629:50: ( LEFTBRACESi expr RIGHTBRACESi )
                    {
                    // etc/XQFT.g:629:50: ( LEFTBRACESi expr RIGHTBRACESi )
                    // etc/XQFT.g:629:51: LEFTBRACESi expr RIGHTBRACESi
                    {
                    match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compAttrConstructor8997); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compAttrConstructor8999);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compAttrConstructor9001); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compAttrConstructor9005); if (failed) return ;
            // etc/XQFT.g:629:95: ( expr )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==TYPESWITCH||LA112_0==DOLLARSi||(LA112_0>=LEFTPRAGMA && LA112_0<=DOCUMENTNODE)||LA112_0==LESSTHANSi||LA112_0==SLASH||LA112_0==EVERY||LA112_0==FOR||LA112_0==PROCESSING_INSTRUCTION||LA112_0==MINUSSi||LA112_0==DOCUMENT||LA112_0==VALIDATE||LA112_0==LET||LA112_0==PLUSSi||LA112_0==SCHEMAATTRIBUTE||LA112_0==DOUBLESLASH||LA112_0==IF||LA112_0==STARSi||LA112_0==LEFTXMLCOMMENT||LA112_0==TEXT||LA112_0==UNORDERED||LA112_0==LEFTPITARGET||LA112_0==COMMENT||(LA112_0>=ELEMENT && LA112_0<=LEFTPARENTHESISSi)||LA112_0==ATSi||LA112_0==ATTRIBUTE||(LA112_0>=NODE && LA112_0<=SOME)||LA112_0==SCHEMAELEMENT||LA112_0==CHILD||(LA112_0>=DESCENDANT && LA112_0<=DOTDOT)||(LA112_0>=IntegerLiteral && LA112_0<=DoubleLiteral)||LA112_0==StringLiteral||(LA112_0>=NCName && LA112_0<=QName)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // etc/XQFT.g:629:95: expr
                    {
                    pushFollow(FOLLOW_expr_in_compAttrConstructor9007);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compAttrConstructor9010); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compAttrConstructor


    // $ANTLR start compTextConstructor
    // etc/XQFT.g:631:1: compTextConstructor : TEXT LEFTBRACESi expr RIGHTBRACESi ;
    public final void compTextConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:631:29: ( TEXT LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:631:31: TEXT LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,TEXT,FOLLOW_TEXT_in_compTextConstructor9026); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compTextConstructor9028); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compTextConstructor9030);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compTextConstructor9032); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compTextConstructor


    // $ANTLR start compCommentConstructor
    // etc/XQFT.g:633:1: compCommentConstructor : COMMENT LEFTBRACESi expr RIGHTBRACESi ;
    public final void compCommentConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:633:29: ( COMMENT LEFTBRACESi expr RIGHTBRACESi )
            // etc/XQFT.g:633:31: COMMENT LEFTBRACESi expr RIGHTBRACESi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_compCommentConstructor9045); if (failed) return ;
            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compCommentConstructor9047); if (failed) return ;
            pushFollow(FOLLOW_expr_in_compCommentConstructor9049);
            expr();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compCommentConstructor9051); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compCommentConstructor


    // $ANTLR start compPIConstructor
    // etc/XQFT.g:635:1: compPIConstructor : PROCESSING_INSTRUCTION ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi ;
    public final void compPIConstructor() throws RecognitionException {
        try {
            // etc/XQFT.g:635:29: ( PROCESSING_INSTRUCTION ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi )
            // etc/XQFT.g:635:31: PROCESSING_INSTRUCTION ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) ) LEFTBRACESi ( expr )? RIGHTBRACESi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor9069); if (failed) return ;
            // etc/XQFT.g:635:54: ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) )
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==NCName) ) {
                alt113=1;
            }
            else if ( (LA113_0==LEFTBRACESi) ) {
                alt113=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("635:54: ( NCName | ( LEFTBRACESi expr RIGHTBRACESi ) )", 113, 0, input);

                throw nvae;
            }
            switch (alt113) {
                case 1 :
                    // etc/XQFT.g:635:55: NCName
                    {
                    match(input,NCName,FOLLOW_NCName_in_compPIConstructor9072); if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:635:64: ( LEFTBRACESi expr RIGHTBRACESi )
                    {
                    // etc/XQFT.g:635:64: ( LEFTBRACESi expr RIGHTBRACESi )
                    // etc/XQFT.g:635:65: LEFTBRACESi expr RIGHTBRACESi
                    {
                    match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compPIConstructor9077); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_compPIConstructor9079);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compPIConstructor9081); if (failed) return ;

                    }


                    }
                    break;

            }

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_compPIConstructor9085); if (failed) return ;
            // etc/XQFT.g:635:109: ( expr )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==TYPESWITCH||LA114_0==DOLLARSi||(LA114_0>=LEFTPRAGMA && LA114_0<=DOCUMENTNODE)||LA114_0==LESSTHANSi||LA114_0==SLASH||LA114_0==EVERY||LA114_0==FOR||LA114_0==PROCESSING_INSTRUCTION||LA114_0==MINUSSi||LA114_0==DOCUMENT||LA114_0==VALIDATE||LA114_0==LET||LA114_0==PLUSSi||LA114_0==SCHEMAATTRIBUTE||LA114_0==DOUBLESLASH||LA114_0==IF||LA114_0==STARSi||LA114_0==LEFTXMLCOMMENT||LA114_0==TEXT||LA114_0==UNORDERED||LA114_0==LEFTPITARGET||LA114_0==COMMENT||(LA114_0>=ELEMENT && LA114_0<=LEFTPARENTHESISSi)||LA114_0==ATSi||LA114_0==ATTRIBUTE||(LA114_0>=NODE && LA114_0<=SOME)||LA114_0==SCHEMAELEMENT||LA114_0==CHILD||(LA114_0>=DESCENDANT && LA114_0<=DOTDOT)||(LA114_0>=IntegerLiteral && LA114_0<=DoubleLiteral)||LA114_0==StringLiteral||(LA114_0>=NCName && LA114_0<=QName)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // etc/XQFT.g:635:109: expr
                    {
                    pushFollow(FOLLOW_expr_in_compPIConstructor9087);
                    expr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_compPIConstructor9090); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end compPIConstructor


    // $ANTLR start singleType
    // etc/XQFT.g:637:1: singleType : atomicType ( QUESTIONMARKSi )? ;
    public final void singleType() throws RecognitionException {
        try {
            // etc/XQFT.g:637:29: ( atomicType ( QUESTIONMARKSi )? )
            // etc/XQFT.g:637:31: atomicType ( QUESTIONMARKSi )?
            {
            pushFollow(FOLLOW_atomicType_in_singleType9115);
            atomicType();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:637:42: ( QUESTIONMARKSi )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==QUESTIONMARKSi) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // etc/XQFT.g:637:42: QUESTIONMARKSi
                    {
                    match(input,QUESTIONMARKSi,FOLLOW_QUESTIONMARKSi_in_singleType9117); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end singleType


    // $ANTLR start typeDeclaration
    // etc/XQFT.g:639:1: typeDeclaration : AS sequenceType ;
    public final void typeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:639:29: ( AS sequenceType )
            // etc/XQFT.g:639:31: AS sequenceType
            {
            match(input,AS,FOLLOW_AS_in_typeDeclaration9138); if (failed) return ;
            pushFollow(FOLLOW_sequenceType_in_typeDeclaration9140);
            sequenceType();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end typeDeclaration


    // $ANTLR start sequenceType
    // etc/XQFT.g:645:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi ) );
    public final void sequenceType() throws RecognitionException {
        try {
            // etc/XQFT.g:645:29: ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi ) )
            int alt116=3;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // etc/XQFT.g:645:31: ( itemType occurrenceIndicator )=> itemType occurrenceIndicator
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType9174);
                    itemType();
                    _fsp--;
                    if (failed) return ;
                    pushFollow(FOLLOW_occurrenceIndicator_in_sequenceType9176);
                    occurrenceIndicator();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:646:10: itemType
                    {
                    pushFollow(FOLLOW_itemType_in_sequenceType9187);
                    itemType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:647:9: ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:647:9: ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi )
                    // etc/XQFT.g:647:10: EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi
                    {
                    match(input,EMPTY_SEQUENCE,FOLLOW_EMPTY_SEQUENCE_in_sequenceType9198); if (failed) return ;
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_sequenceType9200); if (failed) return ;
                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_sequenceType9202); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end sequenceType


    // $ANTLR start occurrenceIndicator
    // etc/XQFT.g:649:1: occurrenceIndicator : ( QUESTIONMARKSi | STARSi | PLUSSi );
    public final void occurrenceIndicator() throws RecognitionException {
        try {
            // etc/XQFT.g:649:29: ( QUESTIONMARKSi | STARSi | PLUSSi )
            // etc/XQFT.g:
            {
            if ( input.LA(1)==PLUSSi||input.LA(1)==STARSi||input.LA(1)==QUESTIONMARKSi ) {
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end occurrenceIndicator


    // $ANTLR start itemType
    // etc/XQFT.g:652:1: itemType : ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType ) ;
    public final void itemType() throws RecognitionException {
        try {
            // etc/XQFT.g:652:29: ( ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType ) )
            // etc/XQFT.g:652:31: ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType )
            {
            // etc/XQFT.g:652:31: ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType )
            int alt117=3;
            switch ( input.LA(1) ) {
            case DOCUMENTNODE:
            case PROCESSING_INSTRUCTION:
            case SCHEMAATTRIBUTE:
            case TEXT:
            case COMMENT:
            case ELEMENT:
            case ATTRIBUTE:
            case NODE:
            case SCHEMAELEMENT:
                {
                alt117=1;
                }
                break;
            case ITEM:
                {
                alt117=2;
                }
                break;
            case QName:
                {
                alt117=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("652:31: ( kindTest | ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi ) | atomicType )", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // etc/XQFT.g:652:32: kindTest
                    {
                    pushFollow(FOLLOW_kindTest_in_itemType9258);
                    kindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:652:43: ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:652:43: ( ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi )
                    // etc/XQFT.g:652:44: ITEM LEFTPARENTHESISSi RIGHTPARENTHESISSi
                    {
                    match(input,ITEM,FOLLOW_ITEM_in_itemType9263); if (failed) return ;
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_itemType9265); if (failed) return ;
                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_itemType9267); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:652:89: atomicType
                    {
                    pushFollow(FOLLOW_atomicType_in_itemType9272);
                    atomicType();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end itemType


    // $ANTLR start atomicType
    // etc/XQFT.g:654:1: atomicType : QName ;
    public final void atomicType() throws RecognitionException {
        try {
            // etc/XQFT.g:654:29: ( QName )
            // etc/XQFT.g:654:31: QName
            {
            match(input,QName,FOLLOW_QName_in_atomicType9298); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end atomicType


    // $ANTLR start kindTest
    // etc/XQFT.g:656:1: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );
    public final void kindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:656:29: ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest )
            int alt118=9;
            switch ( input.LA(1) ) {
            case DOCUMENTNODE:
                {
                alt118=1;
                }
                break;
            case ELEMENT:
                {
                alt118=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt118=3;
                }
                break;
            case SCHEMAELEMENT:
                {
                alt118=4;
                }
                break;
            case SCHEMAATTRIBUTE:
                {
                alt118=5;
                }
                break;
            case PROCESSING_INSTRUCTION:
                {
                alt118=6;
                }
                break;
            case COMMENT:
                {
                alt118=7;
                }
                break;
            case TEXT:
                {
                alt118=8;
                }
                break;
            case NODE:
                {
                alt118=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("656:1: kindTest : ( documentTest | elementTest | attributeTest | schemaElementTest | schemaAttributeTest | piTest | commentTest | textTest | anyKindTest );", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // etc/XQFT.g:656:31: documentTest
                    {
                    pushFollow(FOLLOW_documentTest_in_kindTest9325);
                    documentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:657:35: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_kindTest9361);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:658:35: attributeTest
                    {
                    pushFollow(FOLLOW_attributeTest_in_kindTest9397);
                    attributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:659:35: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_kindTest9433);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:660:35: schemaAttributeTest
                    {
                    pushFollow(FOLLOW_schemaAttributeTest_in_kindTest9469);
                    schemaAttributeTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:661:35: piTest
                    {
                    pushFollow(FOLLOW_piTest_in_kindTest9505);
                    piTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:662:35: commentTest
                    {
                    pushFollow(FOLLOW_commentTest_in_kindTest9541);
                    commentTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:663:35: textTest
                    {
                    pushFollow(FOLLOW_textTest_in_kindTest9577);
                    textTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 9 :
                    // etc/XQFT.g:664:35: anyKindTest
                    {
                    pushFollow(FOLLOW_anyKindTest_in_kindTest9613);
                    anyKindTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end kindTest


    // $ANTLR start anyKindTest
    // etc/XQFT.g:666:1: anyKindTest : NODE LEFTPARENTHESISSi RIGHTPARENTHESISSi ;
    public final void anyKindTest() throws RecognitionException {
        try {
            // etc/XQFT.g:666:29: ( NODE LEFTPARENTHESISSi RIGHTPARENTHESISSi )
            // etc/XQFT.g:666:31: NODE LEFTPARENTHESISSi RIGHTPARENTHESISSi
            {
            match(input,NODE,FOLLOW_NODE_in_anyKindTest9637); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_anyKindTest9639); if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_anyKindTest9641); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end anyKindTest


    // $ANTLR start documentTest
    // etc/XQFT.g:668:1: documentTest : DOCUMENTNODE LEFTPARENTHESISSi ( elementTest | schemaElementTest )? RIGHTPARENTHESISSi ;
    public final void documentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:668:29: ( DOCUMENTNODE LEFTPARENTHESISSi ( elementTest | schemaElementTest )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:668:31: DOCUMENTNODE LEFTPARENTHESISSi ( elementTest | schemaElementTest )? RIGHTPARENTHESISSi
            {
            match(input,DOCUMENTNODE,FOLLOW_DOCUMENTNODE_in_documentTest9664); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_documentTest9666); if (failed) return ;
            // etc/XQFT.g:668:62: ( elementTest | schemaElementTest )?
            int alt119=3;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==ELEMENT) ) {
                alt119=1;
            }
            else if ( (LA119_0==SCHEMAELEMENT) ) {
                alt119=2;
            }
            switch (alt119) {
                case 1 :
                    // etc/XQFT.g:668:63: elementTest
                    {
                    pushFollow(FOLLOW_elementTest_in_documentTest9669);
                    elementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:668:77: schemaElementTest
                    {
                    pushFollow(FOLLOW_schemaElementTest_in_documentTest9673);
                    schemaElementTest();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_documentTest9677); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end documentTest


    // $ANTLR start textTest
    // etc/XQFT.g:670:1: textTest : TEXT LEFTPARENTHESISSi RIGHTPARENTHESISSi ;
    public final void textTest() throws RecognitionException {
        try {
            // etc/XQFT.g:670:29: ( TEXT LEFTPARENTHESISSi RIGHTPARENTHESISSi )
            // etc/XQFT.g:670:31: TEXT LEFTPARENTHESISSi RIGHTPARENTHESISSi
            {
            match(input,TEXT,FOLLOW_TEXT_in_textTest9704); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_textTest9706); if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_textTest9708); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end textTest


    // $ANTLR start commentTest
    // etc/XQFT.g:672:1: commentTest : COMMENT LEFTPARENTHESISSi RIGHTPARENTHESISSi ;
    public final void commentTest() throws RecognitionException {
        try {
            // etc/XQFT.g:672:29: ( COMMENT LEFTPARENTHESISSi RIGHTPARENTHESISSi )
            // etc/XQFT.g:672:31: COMMENT LEFTPARENTHESISSi RIGHTPARENTHESISSi
            {
            match(input,COMMENT,FOLLOW_COMMENT_in_commentTest9732); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_commentTest9734); if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_commentTest9736); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end commentTest


    // $ANTLR start piTest
    // etc/XQFT.g:674:1: piTest : PROCESSING_INSTRUCTION LEFTPARENTHESISSi ( NCName | StringLiteral )? RIGHTPARENTHESISSi ;
    public final void piTest() throws RecognitionException {
        try {
            // etc/XQFT.g:674:29: ( PROCESSING_INSTRUCTION LEFTPARENTHESISSi ( NCName | StringLiteral )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:674:31: PROCESSING_INSTRUCTION LEFTPARENTHESISSi ( NCName | StringLiteral )? RIGHTPARENTHESISSi
            {
            match(input,PROCESSING_INSTRUCTION,FOLLOW_PROCESSING_INSTRUCTION_in_piTest9765); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_piTest9767); if (failed) return ;
            // etc/XQFT.g:674:72: ( NCName | StringLiteral )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==StringLiteral||LA120_0==NCName) ) {
                alt120=1;
            }
            switch (alt120) {
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
                        recoverFromMismatchedSet(input,mse,FOLLOW_set_in_piTest9769);    throw mse;
                    }


                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_piTest9778); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end piTest


    // $ANTLR start attributeTest
    // etc/XQFT.g:676:1: attributeTest : ATTRIBUTE LEFTPARENTHESISSi ( attribNameOrWildcard ( COMMASi typeName )? )? RIGHTPARENTHESISSi ;
    public final void attributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:676:29: ( ATTRIBUTE LEFTPARENTHESISSi ( attribNameOrWildcard ( COMMASi typeName )? )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:676:31: ATTRIBUTE LEFTPARENTHESISSi ( attribNameOrWildcard ( COMMASi typeName )? )? RIGHTPARENTHESISSi
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeTest9800); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_attributeTest9802); if (failed) return ;
            // etc/XQFT.g:676:59: ( attribNameOrWildcard ( COMMASi typeName )? )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==STARSi||LA122_0==QName) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // etc/XQFT.g:676:60: attribNameOrWildcard ( COMMASi typeName )?
                    {
                    pushFollow(FOLLOW_attribNameOrWildcard_in_attributeTest9805);
                    attribNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:676:81: ( COMMASi typeName )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==COMMASi) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // etc/XQFT.g:676:82: COMMASi typeName
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_attributeTest9808); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_attributeTest9810);
                            typeName();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_attributeTest9816); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeTest


    // $ANTLR start attribNameOrWildcard
    // etc/XQFT.g:678:1: attribNameOrWildcard : ( attributeName | STARSi );
    public final void attribNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:678:29: ( attributeName | STARSi )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==QName) ) {
                alt123=1;
            }
            else if ( (LA123_0==STARSi) ) {
                alt123=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("678:1: attribNameOrWildcard : ( attributeName | STARSi );", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // etc/XQFT.g:678:31: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attribNameOrWildcard9831);
                    attributeName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:678:47: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_attribNameOrWildcard9835); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end attribNameOrWildcard


    // $ANTLR start schemaAttributeTest
    // etc/XQFT.g:680:1: schemaAttributeTest : SCHEMAATTRIBUTE LEFTPARENTHESISSi attributeDeclaration RIGHTPARENTHESISSi ;
    public final void schemaAttributeTest() throws RecognitionException {
        try {
            // etc/XQFT.g:680:29: ( SCHEMAATTRIBUTE LEFTPARENTHESISSi attributeDeclaration RIGHTPARENTHESISSi )
            // etc/XQFT.g:680:31: SCHEMAATTRIBUTE LEFTPARENTHESISSi attributeDeclaration RIGHTPARENTHESISSi
            {
            match(input,SCHEMAATTRIBUTE,FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest9851); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_schemaAttributeTest9853); if (failed) return ;
            pushFollow(FOLLOW_attributeDeclaration_in_schemaAttributeTest9855);
            attributeDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_schemaAttributeTest9857); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaAttributeTest


    // $ANTLR start attributeDeclaration
    // etc/XQFT.g:682:1: attributeDeclaration : attributeName ;
    public final void attributeDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:682:29: ( attributeName )
            // etc/XQFT.g:682:31: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_attributeDeclaration9872);
            attributeName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeDeclaration


    // $ANTLR start elementTest
    // etc/XQFT.g:684:1: elementTest : ELEMENT LEFTPARENTHESISSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )? )? RIGHTPARENTHESISSi ;
    public final void elementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:684:29: ( ELEMENT LEFTPARENTHESISSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )? )? RIGHTPARENTHESISSi )
            // etc/XQFT.g:684:31: ELEMENT LEFTPARENTHESISSi ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )? )? RIGHTPARENTHESISSi
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_elementTest9896); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_elementTest9898); if (failed) return ;
            // etc/XQFT.g:684:57: ( elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )? )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==STARSi||LA126_0==QName) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // etc/XQFT.g:684:58: elementNameOrWildcard ( COMMASi typeName ( QUESTIONMARKSi )? )?
                    {
                    pushFollow(FOLLOW_elementNameOrWildcard_in_elementTest9901);
                    elementNameOrWildcard();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:684:80: ( COMMASi typeName ( QUESTIONMARKSi )? )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( (LA125_0==COMMASi) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // etc/XQFT.g:684:81: COMMASi typeName ( QUESTIONMARKSi )?
                            {
                            match(input,COMMASi,FOLLOW_COMMASi_in_elementTest9904); if (failed) return ;
                            pushFollow(FOLLOW_typeName_in_elementTest9906);
                            typeName();
                            _fsp--;
                            if (failed) return ;
                            // etc/XQFT.g:684:98: ( QUESTIONMARKSi )?
                            int alt124=2;
                            int LA124_0 = input.LA(1);

                            if ( (LA124_0==QUESTIONMARKSi) ) {
                                alt124=1;
                            }
                            switch (alt124) {
                                case 1 :
                                    // etc/XQFT.g:684:98: QUESTIONMARKSi
                                    {
                                    match(input,QUESTIONMARKSi,FOLLOW_QUESTIONMARKSi_in_elementTest9908); if (failed) return ;

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_elementTest9915); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end elementTest


    // $ANTLR start elementNameOrWildcard
    // etc/XQFT.g:686:1: elementNameOrWildcard : ( elementName | STARSi );
    public final void elementNameOrWildcard() throws RecognitionException {
        try {
            // etc/XQFT.g:686:29: ( elementName | STARSi )
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==QName) ) {
                alt127=1;
            }
            else if ( (LA127_0==STARSi) ) {
                alt127=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("686:1: elementNameOrWildcard : ( elementName | STARSi );", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // etc/XQFT.g:686:31: elementName
                    {
                    pushFollow(FOLLOW_elementName_in_elementNameOrWildcard9929);
                    elementName();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:686:45: STARSi
                    {
                    match(input,STARSi,FOLLOW_STARSi_in_elementNameOrWildcard9933); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end elementNameOrWildcard


    // $ANTLR start schemaElementTest
    // etc/XQFT.g:688:1: schemaElementTest : SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi ;
    public final void schemaElementTest() throws RecognitionException {
        try {
            // etc/XQFT.g:688:29: ( SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi )
            // etc/XQFT.g:688:31: SCHEMAELEMENT LEFTPARENTHESISSi elementDeclaration RIGHTPARENTHESISSi
            {
            match(input,SCHEMAELEMENT,FOLLOW_SCHEMAELEMENT_in_schemaElementTest9951); if (failed) return ;
            match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_schemaElementTest9953); if (failed) return ;
            pushFollow(FOLLOW_elementDeclaration_in_schemaElementTest9955);
            elementDeclaration();
            _fsp--;
            if (failed) return ;
            match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_schemaElementTest9957); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end schemaElementTest


    // $ANTLR start elementDeclaration
    // etc/XQFT.g:690:1: elementDeclaration : elementName ;
    public final void elementDeclaration() throws RecognitionException {
        try {
            // etc/XQFT.g:690:29: ( elementName )
            // etc/XQFT.g:690:31: elementName
            {
            pushFollow(FOLLOW_elementName_in_elementDeclaration9974);
            elementName();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end elementDeclaration


    // $ANTLR start attributeName
    // etc/XQFT.g:692:1: attributeName : QName ;
    public final void attributeName() throws RecognitionException {
        try {
            // etc/XQFT.g:692:29: ( QName )
            // etc/XQFT.g:692:31: QName
            {
            match(input,QName,FOLLOW_QName_in_attributeName9996); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end attributeName


    // $ANTLR start elementName
    // etc/XQFT.g:694:1: elementName : QName ;
    public final void elementName() throws RecognitionException {
        try {
            // etc/XQFT.g:694:29: ( QName )
            // etc/XQFT.g:694:31: QName
            {
            match(input,QName,FOLLOW_QName_in_elementName10020); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end elementName


    // $ANTLR start typeName
    // etc/XQFT.g:696:1: typeName : QName ;
    public final void typeName() throws RecognitionException {
        try {
            // etc/XQFT.g:696:29: ( QName )
            // etc/XQFT.g:696:31: QName
            {
            match(input,QName,FOLLOW_QName_in_typeName10047); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end typeName


    // $ANTLR start uriLiteral
    // etc/XQFT.g:698:1: uriLiteral : StringLiteral ;
    public final void uriLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:698:29: ( StringLiteral )
            // etc/XQFT.g:698:31: StringLiteral
            {
            match(input,StringLiteral,FOLLOW_StringLiteral_in_uriLiteral10072); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end uriLiteral


    // $ANTLR start ftSelection
    // etc/XQFT.g:700:1: ftSelection : ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? ;
    public final void ftSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:700:29: ( ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )? )
            // etc/XQFT.g:700:31: ftOr ( ftPosFilter )* ( WEIGHT rangeExpr )?
            {
            pushFollow(FOLLOW_ftOr_in_ftSelection10096);
            ftOr();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:700:36: ( ftPosFilter )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==DISTANCE||LA128_0==ORDERED||LA128_0==WINDOW||LA128_0==AT||(LA128_0>=SAME && LA128_0<=DIFFERENT)||LA128_0==ENTIRE) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // etc/XQFT.g:700:36: ftPosFilter
            	    {
            	    pushFollow(FOLLOW_ftPosFilter_in_ftSelection10098);
            	    ftPosFilter();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);

            // etc/XQFT.g:700:49: ( WEIGHT rangeExpr )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==WEIGHT) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // etc/XQFT.g:700:50: WEIGHT rangeExpr
                    {
                    match(input,WEIGHT,FOLLOW_WEIGHT_in_ftSelection10102); if (failed) return ;
                    pushFollow(FOLLOW_rangeExpr_in_ftSelection10104);
                    rangeExpr();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftSelection


    // $ANTLR start ftOr
    // etc/XQFT.g:702:1: ftOr : ftAnd ( FTOR ftAnd )* ;
    public final void ftOr() throws RecognitionException {
        try {
            // etc/XQFT.g:702:29: ( ftAnd ( FTOR ftAnd )* )
            // etc/XQFT.g:702:31: ftAnd ( FTOR ftAnd )*
            {
            pushFollow(FOLLOW_ftAnd_in_ftOr10137);
            ftAnd();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:702:37: ( FTOR ftAnd )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( (LA130_0==FTOR) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // etc/XQFT.g:702:39: FTOR ftAnd
            	    {
            	    match(input,FTOR,FOLLOW_FTOR_in_ftOr10141); if (failed) return ;
            	    pushFollow(FOLLOW_ftAnd_in_ftOr10143);
            	    ftAnd();
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOr


    // $ANTLR start ftAnd
    // etc/XQFT.g:704:1: ftAnd : ftMildNot ( FTAND ftMildNot )* ;
    public final void ftAnd() throws RecognitionException {
        try {
            // etc/XQFT.g:704:29: ( ftMildNot ( FTAND ftMildNot )* )
            // etc/XQFT.g:704:31: ftMildNot ( FTAND ftMildNot )*
            {
            pushFollow(FOLLOW_ftMildNot_in_ftAnd10176);
            ftMildNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:704:41: ( FTAND ftMildNot )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==FTAND) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // etc/XQFT.g:704:43: FTAND ftMildNot
            	    {
            	    match(input,FTAND,FOLLOW_FTAND_in_ftAnd10180); if (failed) return ;
            	    pushFollow(FOLLOW_ftMildNot_in_ftAnd10182);
            	    ftMildNot();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftAnd


    // $ANTLR start ftMildNot
    // etc/XQFT.g:706:1: ftMildNot : ftUnaryNot ( NOT IN ftUnaryNot )* ;
    public final void ftMildNot() throws RecognitionException {
        try {
            // etc/XQFT.g:706:29: ( ftUnaryNot ( NOT IN ftUnaryNot )* )
            // etc/XQFT.g:706:31: ftUnaryNot ( NOT IN ftUnaryNot )*
            {
            pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot10211);
            ftUnaryNot();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:706:42: ( NOT IN ftUnaryNot )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( (LA132_0==NOT) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // etc/XQFT.g:706:44: NOT IN ftUnaryNot
            	    {
            	    match(input,NOT,FOLLOW_NOT_in_ftMildNot10215); if (failed) return ;
            	    match(input,IN,FOLLOW_IN_in_ftMildNot10217); if (failed) return ;
            	    pushFollow(FOLLOW_ftUnaryNot_in_ftMildNot10219);
            	    ftUnaryNot();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMildNot


    // $ANTLR start ftUnaryNot
    // etc/XQFT.g:708:1: ftUnaryNot : ( FTNOT )? ftPrimaryWithOptions ;
    public final void ftUnaryNot() throws RecognitionException {
        try {
            // etc/XQFT.g:708:29: ( ( FTNOT )? ftPrimaryWithOptions )
            // etc/XQFT.g:708:31: ( FTNOT )? ftPrimaryWithOptions
            {
            // etc/XQFT.g:708:31: ( FTNOT )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==FTNOT) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // etc/XQFT.g:708:32: FTNOT
                    {
                    match(input,FTNOT,FOLLOW_FTNOT_in_ftUnaryNot10248); if (failed) return ;

                    }
                    break;

            }

            pushFollow(FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot10252);
            ftPrimaryWithOptions();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftUnaryNot


    // $ANTLR start ftPrimaryWithOptions
    // etc/XQFT.g:710:1: ftPrimaryWithOptions : ftPrimary ( ftMatchOptions )? ;
    public final void ftPrimaryWithOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:710:29: ( ftPrimary ( ftMatchOptions )? )
            // etc/XQFT.g:710:31: ftPrimary ( ftMatchOptions )?
            {
            pushFollow(FOLLOW_ftPrimary_in_ftPrimaryWithOptions10267);
            ftPrimary();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:710:41: ( ftMatchOptions )?
            int alt134=2;
            switch ( input.LA(1) ) {
                case UPPERCASE:
                case LANGUAGE:
                case OPTION:
                case WITH:
                case DIACRITICS:
                case LOWERCASE:
                    {
                    alt134=1;
                    }
                    break;
                case WITHOUT:
                    {
                    int LA134_2 = input.LA(2);

                    if ( (LA134_2==STOP||LA134_2==STEMMING||LA134_2==WILDCARDS||LA134_2==THESAURUS) ) {
                        alt134=1;
                    }
                    }
                    break;
                case CASE:
                    {
                    int LA134_3 = input.LA(2);

                    if ( (LA134_3==INSENSITIVE||LA134_3==SENSITIVE) ) {
                        alt134=1;
                    }
                    }
                    break;
            }

            switch (alt134) {
                case 1 :
                    // etc/XQFT.g:710:41: ftMatchOptions
                    {
                    pushFollow(FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions10269);
                    ftMatchOptions();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPrimaryWithOptions


    // $ANTLR start ftPrimary
    // etc/XQFT.g:712:1: ftPrimary : ( ( ftWords ( ftTimes )? ) | ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi ) | ftExtensionSelection );
    public final void ftPrimary() throws RecognitionException {
        try {
            // etc/XQFT.g:712:29: ( ( ftWords ( ftTimes )? ) | ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi ) | ftExtensionSelection )
            int alt136=3;
            switch ( input.LA(1) ) {
            case LEFTBRACESi:
            case IntegerLiteral:
            case DecimalLiteral:
            case DoubleLiteral:
            case StringLiteral:
                {
                alt136=1;
                }
                break;
            case LEFTPARENTHESISSi:
                {
                alt136=2;
                }
                break;
            case LEFTPRAGMA:
                {
                alt136=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("712:1: ftPrimary : ( ( ftWords ( ftTimes )? ) | ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi ) | ftExtensionSelection );", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // etc/XQFT.g:712:31: ( ftWords ( ftTimes )? )
                    {
                    // etc/XQFT.g:712:31: ( ftWords ( ftTimes )? )
                    // etc/XQFT.g:712:32: ftWords ( ftTimes )?
                    {
                    pushFollow(FOLLOW_ftWords_in_ftPrimary10297);
                    ftWords();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:712:40: ( ftTimes )?
                    int alt135=2;
                    int LA135_0 = input.LA(1);

                    if ( (LA135_0==OCCURS) ) {
                        alt135=1;
                    }
                    switch (alt135) {
                        case 1 :
                            // etc/XQFT.g:712:40: ftTimes
                            {
                            pushFollow(FOLLOW_ftTimes_in_ftPrimary10299);
                            ftTimes();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:712:52: ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:712:52: ( LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi )
                    // etc/XQFT.g:712:53: LEFTPARENTHESISSi ftSelection RIGHTPARENTHESISSi
                    {
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_ftPrimary10306); if (failed) return ;
                    pushFollow(FOLLOW_ftSelection_in_ftPrimary10308);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_ftPrimary10310); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:712:105: ftExtensionSelection
                    {
                    pushFollow(FOLLOW_ftExtensionSelection_in_ftPrimary10315);
                    ftExtensionSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPrimary


    // $ANTLR start ftWords
    // etc/XQFT.g:714:1: ftWords : ftWordsValue ( ftAnyallOption )? ;
    public final void ftWords() throws RecognitionException {
        try {
            // etc/XQFT.g:714:29: ( ftWordsValue ( ftAnyallOption )? )
            // etc/XQFT.g:714:31: ftWordsValue ( ftAnyallOption )?
            {
            pushFollow(FOLLOW_ftWordsValue_in_ftWords10343);
            ftWordsValue();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:714:44: ( ftAnyallOption )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==PHRASE||LA137_0==ANY||LA137_0==ALL) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // etc/XQFT.g:714:44: ftAnyallOption
                    {
                    pushFollow(FOLLOW_ftAnyallOption_in_ftWords10345);
                    ftAnyallOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWords


    // $ANTLR start ftWordsValue
    // etc/XQFT.g:716:1: ftWordsValue : ( literal | ( LEFTBRACESi expr RIGHTBRACESi ) );
    public final void ftWordsValue() throws RecognitionException {
        try {
            // etc/XQFT.g:716:29: ( literal | ( LEFTBRACESi expr RIGHTBRACESi ) )
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( ((LA138_0>=IntegerLiteral && LA138_0<=DoubleLiteral)||LA138_0==StringLiteral) ) {
                alt138=1;
            }
            else if ( (LA138_0==LEFTBRACESi) ) {
                alt138=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("716:1: ftWordsValue : ( literal | ( LEFTBRACESi expr RIGHTBRACESi ) );", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // etc/XQFT.g:716:31: literal
                    {
                    pushFollow(FOLLOW_literal_in_ftWordsValue10369);
                    literal();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:716:41: ( LEFTBRACESi expr RIGHTBRACESi )
                    {
                    // etc/XQFT.g:716:41: ( LEFTBRACESi expr RIGHTBRACESi )
                    // etc/XQFT.g:716:42: LEFTBRACESi expr RIGHTBRACESi
                    {
                    match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_ftWordsValue10374); if (failed) return ;
                    pushFollow(FOLLOW_expr_in_ftWordsValue10376);
                    expr();
                    _fsp--;
                    if (failed) return ;
                    match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_ftWordsValue10378); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWordsValue


    // $ANTLR start ftExtensionSelection
    // etc/XQFT.g:718:1: ftExtensionSelection : ( pragma )+ LEFTBRACESi ( ftSelection )? RIGHTBRACESi ;
    public final void ftExtensionSelection() throws RecognitionException {
        try {
            // etc/XQFT.g:718:29: ( ( pragma )+ LEFTBRACESi ( ftSelection )? RIGHTBRACESi )
            // etc/XQFT.g:718:31: ( pragma )+ LEFTBRACESi ( ftSelection )? RIGHTBRACESi
            {
            // etc/XQFT.g:718:31: ( pragma )+
            int cnt139=0;
            loop139:
            do {
                int alt139=2;
                int LA139_0 = input.LA(1);

                if ( (LA139_0==LEFTPRAGMA) ) {
                    alt139=1;
                }


                switch (alt139) {
            	case 1 :
            	    // etc/XQFT.g:718:31: pragma
            	    {
            	    pushFollow(FOLLOW_pragma_in_ftExtensionSelection10394);
            	    pragma();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt139 >= 1 ) break loop139;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(139, input);
                        throw eee;
                }
                cnt139++;
            } while (true);

            match(input,LEFTBRACESi,FOLLOW_LEFTBRACESi_in_ftExtensionSelection10397); if (failed) return ;
            // etc/XQFT.g:718:51: ( ftSelection )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==LEFTBRACESi||LA140_0==LEFTPRAGMA||LA140_0==FTNOT||LA140_0==LEFTPARENTHESISSi||(LA140_0>=IntegerLiteral && LA140_0<=DoubleLiteral)||LA140_0==StringLiteral) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // etc/XQFT.g:718:51: ftSelection
                    {
                    pushFollow(FOLLOW_ftSelection_in_ftExtensionSelection10399);
                    ftSelection();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            match(input,RIGHTBRACESi,FOLLOW_RIGHTBRACESi_in_ftExtensionSelection10402); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftExtensionSelection


    // $ANTLR start ftAnyallOption
    // etc/XQFT.g:720:1: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );
    public final void ftAnyallOption() throws RecognitionException {
        try {
            // etc/XQFT.g:720:29: ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE )
            int alt143=3;
            switch ( input.LA(1) ) {
            case ANY:
                {
                alt143=1;
                }
                break;
            case ALL:
                {
                alt143=2;
                }
                break;
            case PHRASE:
                {
                alt143=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("720:1: ftAnyallOption : ( ( ANY ( WORD )? ) | ( ALL ( WORDS )? ) | PHRASE );", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // etc/XQFT.g:720:31: ( ANY ( WORD )? )
                    {
                    // etc/XQFT.g:720:31: ( ANY ( WORD )? )
                    // etc/XQFT.g:720:32: ANY ( WORD )?
                    {
                    match(input,ANY,FOLLOW_ANY_in_ftAnyallOption10424); if (failed) return ;
                    // etc/XQFT.g:720:36: ( WORD )?
                    int alt141=2;
                    int LA141_0 = input.LA(1);

                    if ( (LA141_0==WORD) ) {
                        alt141=1;
                    }
                    switch (alt141) {
                        case 1 :
                            // etc/XQFT.g:720:36: WORD
                            {
                            match(input,WORD,FOLLOW_WORD_in_ftAnyallOption10426); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:720:45: ( ALL ( WORDS )? )
                    {
                    // etc/XQFT.g:720:45: ( ALL ( WORDS )? )
                    // etc/XQFT.g:720:46: ALL ( WORDS )?
                    {
                    match(input,ALL,FOLLOW_ALL_in_ftAnyallOption10433); if (failed) return ;
                    // etc/XQFT.g:720:50: ( WORDS )?
                    int alt142=2;
                    int LA142_0 = input.LA(1);

                    if ( (LA142_0==WORDS) ) {
                        alt142=1;
                    }
                    switch (alt142) {
                        case 1 :
                            // etc/XQFT.g:720:50: WORDS
                            {
                            match(input,WORDS,FOLLOW_WORDS_in_ftAnyallOption10435); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:720:60: PHRASE
                    {
                    match(input,PHRASE,FOLLOW_PHRASE_in_ftAnyallOption10441); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftAnyallOption


    // $ANTLR start ftTimes
    // etc/XQFT.g:722:1: ftTimes : OCCURS ftRange TIMES ;
    public final void ftTimes() throws RecognitionException {
        try {
            // etc/XQFT.g:722:29: ( OCCURS ftRange TIMES )
            // etc/XQFT.g:722:31: OCCURS ftRange TIMES
            {
            match(input,OCCURS,FOLLOW_OCCURS_in_ftTimes10469); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftTimes10471);
            ftRange();
            _fsp--;
            if (failed) return ;
            match(input,TIMES,FOLLOW_TIMES_in_ftTimes10473); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftTimes


    // $ANTLR start ftRange
    // etc/XQFT.g:725:1: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );
    public final void ftRange() throws RecognitionException {
        try {
            // etc/XQFT.g:725:29: ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) )
            int alt144=4;
            switch ( input.LA(1) ) {
            case EXACTLY:
                {
                alt144=1;
                }
                break;
            case AT:
                {
                int LA144_2 = input.LA(2);

                if ( (LA144_2==LEAST) ) {
                    alt144=2;
                }
                else if ( (LA144_2==MOST) ) {
                    alt144=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("725:1: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 144, 2, input);

                    throw nvae;
                }
                }
                break;
            case FROM:
                {
                alt144=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("725:1: ftRange : ( ( EXACTLY additiveExpr ) | ( AT LEAST additiveExpr ) | ( AT MOST additiveExpr ) | ( FROM additiveExpr TO additiveExpr ) );", 144, 0, input);

                throw nvae;
            }

            switch (alt144) {
                case 1 :
                    // etc/XQFT.g:725:31: ( EXACTLY additiveExpr )
                    {
                    // etc/XQFT.g:725:31: ( EXACTLY additiveExpr )
                    // etc/XQFT.g:725:32: EXACTLY additiveExpr
                    {
                    match(input,EXACTLY,FOLLOW_EXACTLY_in_ftRange10503); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10505);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:726:35: ( AT LEAST additiveExpr )
                    {
                    // etc/XQFT.g:726:35: ( AT LEAST additiveExpr )
                    // etc/XQFT.g:726:36: AT LEAST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange10543); if (failed) return ;
                    match(input,LEAST,FOLLOW_LEAST_in_ftRange10545); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10547);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:727:35: ( AT MOST additiveExpr )
                    {
                    // etc/XQFT.g:727:35: ( AT MOST additiveExpr )
                    // etc/XQFT.g:727:36: AT MOST additiveExpr
                    {
                    match(input,AT,FOLLOW_AT_in_ftRange10585); if (failed) return ;
                    match(input,MOST,FOLLOW_MOST_in_ftRange10587); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10589);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 4 :
                    // etc/XQFT.g:728:35: ( FROM additiveExpr TO additiveExpr )
                    {
                    // etc/XQFT.g:728:35: ( FROM additiveExpr TO additiveExpr )
                    // etc/XQFT.g:728:36: FROM additiveExpr TO additiveExpr
                    {
                    match(input,FROM,FOLLOW_FROM_in_ftRange10627); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10629);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;
                    match(input,TO,FOLLOW_TO_in_ftRange10631); if (failed) return ;
                    pushFollow(FOLLOW_additiveExpr_in_ftRange10633);
                    additiveExpr();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftRange


    // $ANTLR start ftPosFilter
    // etc/XQFT.g:730:1: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );
    public final void ftPosFilter() throws RecognitionException {
        try {
            // etc/XQFT.g:730:29: ( ftOrder | ftWindow | ftDistance | ftScope | ftContent )
            int alt145=5;
            switch ( input.LA(1) ) {
            case ORDERED:
                {
                alt145=1;
                }
                break;
            case WINDOW:
                {
                alt145=2;
                }
                break;
            case DISTANCE:
                {
                alt145=3;
                }
                break;
            case SAME:
            case DIFFERENT:
                {
                alt145=4;
                }
                break;
            case AT:
            case ENTIRE:
                {
                alt145=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("730:1: ftPosFilter : ( ftOrder | ftWindow | ftDistance | ftScope | ftContent );", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // etc/XQFT.g:730:31: ftOrder
                    {
                    pushFollow(FOLLOW_ftOrder_in_ftPosFilter10658);
                    ftOrder();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:730:41: ftWindow
                    {
                    pushFollow(FOLLOW_ftWindow_in_ftPosFilter10662);
                    ftWindow();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:730:52: ftDistance
                    {
                    pushFollow(FOLLOW_ftDistance_in_ftPosFilter10666);
                    ftDistance();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:730:65: ftScope
                    {
                    pushFollow(FOLLOW_ftScope_in_ftPosFilter10670);
                    ftScope();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:730:75: ftContent
                    {
                    pushFollow(FOLLOW_ftContent_in_ftPosFilter10674);
                    ftContent();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftPosFilter


    // $ANTLR start ftOrder
    // etc/XQFT.g:732:1: ftOrder : ORDERED ;
    public final void ftOrder() throws RecognitionException {
        try {
            // etc/XQFT.g:732:29: ( ORDERED )
            // etc/XQFT.g:732:31: ORDERED
            {
            match(input,ORDERED,FOLLOW_ORDERED_in_ftOrder10702); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftOrder


    // $ANTLR start ftWindow
    // etc/XQFT.g:734:1: ftWindow : WINDOW additiveExpr ftUnit ;
    public final void ftWindow() throws RecognitionException {
        try {
            // etc/XQFT.g:734:29: ( WINDOW additiveExpr ftUnit )
            // etc/XQFT.g:734:31: WINDOW additiveExpr ftUnit
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_ftWindow10729); if (failed) return ;
            pushFollow(FOLLOW_additiveExpr_in_ftWindow10731);
            additiveExpr();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftWindow10733);
            ftUnit();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWindow


    // $ANTLR start ftDistance
    // etc/XQFT.g:736:1: ftDistance : DISTANCE ftRange ftUnit ;
    public final void ftDistance() throws RecognitionException {
        try {
            // etc/XQFT.g:736:29: ( DISTANCE ftRange ftUnit )
            // etc/XQFT.g:736:31: DISTANCE ftRange ftUnit
            {
            match(input,DISTANCE,FOLLOW_DISTANCE_in_ftDistance10758); if (failed) return ;
            pushFollow(FOLLOW_ftRange_in_ftDistance10760);
            ftRange();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_ftUnit_in_ftDistance10762);
            ftUnit();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftDistance


    // $ANTLR start ftUnit
    // etc/XQFT.g:738:1: ftUnit : ( WORDS | SENTENCES | PARAGRAPHS );
    public final void ftUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:738:29: ( WORDS | SENTENCES | PARAGRAPHS )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=WORDS && input.LA(1)<=PARAGRAPHS) ) {
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftUnit


    // $ANTLR start ftScope
    // etc/XQFT.g:740:1: ftScope : ( SAME | DIFFERENT ) ftBigUnit ;
    public final void ftScope() throws RecognitionException {
        try {
            // etc/XQFT.g:740:29: ( ( SAME | DIFFERENT ) ftBigUnit )
            // etc/XQFT.g:740:31: ( SAME | DIFFERENT ) ftBigUnit
            {
            if ( (input.LA(1)>=SAME && input.LA(1)<=DIFFERENT) ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftScope10827);    throw mse;
            }

            pushFollow(FOLLOW_ftBigUnit_in_ftScope10835);
            ftBigUnit();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftScope


    // $ANTLR start ftBigUnit
    // etc/XQFT.g:742:1: ftBigUnit : ( SENTENCE | PARAGRAPH );
    public final void ftBigUnit() throws RecognitionException {
        try {
            // etc/XQFT.g:742:29: ( SENTENCE | PARAGRAPH )
            // etc/XQFT.g:
            {
            if ( (input.LA(1)>=SENTENCE && input.LA(1)<=PARAGRAPH) ) {
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftBigUnit


    // $ANTLR start ftContent
    // etc/XQFT.g:744:1: ftContent : ( ( AT START ) | ( AT END ) | ( ENTIRE CONTENT ) );
    public final void ftContent() throws RecognitionException {
        try {
            // etc/XQFT.g:744:29: ( ( AT START ) | ( AT END ) | ( ENTIRE CONTENT ) )
            int alt146=3;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==AT) ) {
                int LA146_1 = input.LA(2);

                if ( (LA146_1==START) ) {
                    alt146=1;
                }
                else if ( (LA146_1==END) ) {
                    alt146=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("744:1: ftContent : ( ( AT START ) | ( AT END ) | ( ENTIRE CONTENT ) );", 146, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA146_0==ENTIRE) ) {
                alt146=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("744:1: ftContent : ( ( AT START ) | ( AT END ) | ( ENTIRE CONTENT ) );", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // etc/XQFT.g:744:31: ( AT START )
                    {
                    // etc/XQFT.g:744:31: ( AT START )
                    // etc/XQFT.g:744:32: AT START
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent10892); if (failed) return ;
                    match(input,START,FOLLOW_START_in_ftContent10894); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:744:44: ( AT END )
                    {
                    // etc/XQFT.g:744:44: ( AT END )
                    // etc/XQFT.g:744:45: AT END
                    {
                    match(input,AT,FOLLOW_AT_in_ftContent10900); if (failed) return ;
                    match(input,END,FOLLOW_END_in_ftContent10902); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:744:55: ( ENTIRE CONTENT )
                    {
                    // etc/XQFT.g:744:55: ( ENTIRE CONTENT )
                    // etc/XQFT.g:744:56: ENTIRE CONTENT
                    {
                    match(input,ENTIRE,FOLLOW_ENTIRE_in_ftContent10908); if (failed) return ;
                    match(input,CONTENT,FOLLOW_CONTENT_in_ftContent10910); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftContent


    // $ANTLR start ftMatchOptions
    // etc/XQFT.g:746:1: ftMatchOptions : ( ftMatchOption )+ ;
    public final void ftMatchOptions() throws RecognitionException {
        try {
            // etc/XQFT.g:746:29: ( ( ftMatchOption )+ )
            // etc/XQFT.g:746:31: ( ftMatchOption )+
            {
            // etc/XQFT.g:746:31: ( ftMatchOption )+
            int cnt147=0;
            loop147:
            do {
                int alt147=2;
                switch ( input.LA(1) ) {
                case WITHOUT:
                    {
                    int LA147_2 = input.LA(2);

                    if ( (LA147_2==STOP||LA147_2==STEMMING||LA147_2==WILDCARDS||LA147_2==THESAURUS) ) {
                        alt147=1;
                    }


                    }
                    break;
                case CASE:
                    {
                    int LA147_3 = input.LA(2);

                    if ( (LA147_3==INSENSITIVE||LA147_3==SENSITIVE) ) {
                        alt147=1;
                    }


                    }
                    break;
                case UPPERCASE:
                case LANGUAGE:
                case OPTION:
                case WITH:
                case DIACRITICS:
                case LOWERCASE:
                    {
                    alt147=1;
                    }
                    break;

                }

                switch (alt147) {
            	case 1 :
            	    // etc/XQFT.g:746:31: ftMatchOption
            	    {
            	    pushFollow(FOLLOW_ftMatchOption_in_ftMatchOptions10932);
            	    ftMatchOption();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt147 >= 1 ) break loop147;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(147, input);
                        throw eee;
                }
                cnt147++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMatchOptions


    // $ANTLR start ftMatchOption
    // etc/XQFT.g:748:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );
    public final void ftMatchOption() throws RecognitionException {
        try {
            // etc/XQFT.g:748:29: ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption )
            int alt148=8;
            switch ( input.LA(1) ) {
            case LANGUAGE:
                {
                alt148=1;
                }
                break;
            case WITH:
                {
                switch ( input.LA(2) ) {
                case WILDCARDS:
                    {
                    alt148=2;
                    }
                    break;
                case STOP:
                case DEFAULT:
                    {
                    alt148=7;
                    }
                    break;
                case THESAURUS:
                    {
                    alt148=3;
                    }
                    break;
                case STEMMING:
                    {
                    alt148=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("748:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 148, 2, input);

                    throw nvae;
                }

                }
                break;
            case WITHOUT:
                {
                switch ( input.LA(2) ) {
                case WILDCARDS:
                    {
                    alt148=2;
                    }
                    break;
                case STEMMING:
                    {
                    alt148=4;
                    }
                    break;
                case STOP:
                    {
                    alt148=7;
                    }
                    break;
                case THESAURUS:
                    {
                    alt148=3;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("748:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 148, 3, input);

                    throw nvae;
                }

                }
                break;
            case UPPERCASE:
            case CASE:
            case LOWERCASE:
                {
                alt148=5;
                }
                break;
            case DIACRITICS:
                {
                alt148=6;
                }
                break;
            case OPTION:
                {
                alt148=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("748:1: ftMatchOption : ( ftLanguageOption | ftWildCardOption | ftThesaurusOption | ftStemOption | ftCaseOption | ftDiacriticsOption | ftStopwordOption | ftExtensionOption );", 148, 0, input);

                throw nvae;
            }

            switch (alt148) {
                case 1 :
                    // etc/XQFT.g:748:31: ftLanguageOption
                    {
                    pushFollow(FOLLOW_ftLanguageOption_in_ftMatchOption10961);
                    ftLanguageOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 2 :
                    // etc/XQFT.g:749:35: ftWildCardOption
                    {
                    pushFollow(FOLLOW_ftWildCardOption_in_ftMatchOption10997);
                    ftWildCardOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 3 :
                    // etc/XQFT.g:750:35: ftThesaurusOption
                    {
                    pushFollow(FOLLOW_ftThesaurusOption_in_ftMatchOption11033);
                    ftThesaurusOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:751:35: ftStemOption
                    {
                    pushFollow(FOLLOW_ftStemOption_in_ftMatchOption11069);
                    ftStemOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 5 :
                    // etc/XQFT.g:752:35: ftCaseOption
                    {
                    pushFollow(FOLLOW_ftCaseOption_in_ftMatchOption11105);
                    ftCaseOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 6 :
                    // etc/XQFT.g:753:35: ftDiacriticsOption
                    {
                    pushFollow(FOLLOW_ftDiacriticsOption_in_ftMatchOption11141);
                    ftDiacriticsOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 7 :
                    // etc/XQFT.g:754:35: ftStopwordOption
                    {
                    pushFollow(FOLLOW_ftStopwordOption_in_ftMatchOption11177);
                    ftStopwordOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;
                case 8 :
                    // etc/XQFT.g:755:35: ftExtensionOption
                    {
                    pushFollow(FOLLOW_ftExtensionOption_in_ftMatchOption11213);
                    ftExtensionOption();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftMatchOption


    // $ANTLR start ftCaseOption
    // etc/XQFT.g:757:1: ftCaseOption : ( ( CASE INSENSITIVE ) | ( CASE SENSITIVE ) | LOWERCASE | UPPERCASE );
    public final void ftCaseOption() throws RecognitionException {
        try {
            // etc/XQFT.g:757:29: ( ( CASE INSENSITIVE ) | ( CASE SENSITIVE ) | LOWERCASE | UPPERCASE )
            int alt149=4;
            switch ( input.LA(1) ) {
            case CASE:
                {
                int LA149_1 = input.LA(2);

                if ( (LA149_1==SENSITIVE) ) {
                    alt149=2;
                }
                else if ( (LA149_1==INSENSITIVE) ) {
                    alt149=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("757:1: ftCaseOption : ( ( CASE INSENSITIVE ) | ( CASE SENSITIVE ) | LOWERCASE | UPPERCASE );", 149, 1, input);

                    throw nvae;
                }
                }
                break;
            case LOWERCASE:
                {
                alt149=3;
                }
                break;
            case UPPERCASE:
                {
                alt149=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("757:1: ftCaseOption : ( ( CASE INSENSITIVE ) | ( CASE SENSITIVE ) | LOWERCASE | UPPERCASE );", 149, 0, input);

                throw nvae;
            }

            switch (alt149) {
                case 1 :
                    // etc/XQFT.g:757:31: ( CASE INSENSITIVE )
                    {
                    // etc/XQFT.g:757:31: ( CASE INSENSITIVE )
                    // etc/XQFT.g:757:32: CASE INSENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption11237); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftCaseOption11239); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:758:35: ( CASE SENSITIVE )
                    {
                    // etc/XQFT.g:758:35: ( CASE SENSITIVE )
                    // etc/XQFT.g:758:36: CASE SENSITIVE
                    {
                    match(input,CASE,FOLLOW_CASE_in_ftCaseOption11277); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftCaseOption11279); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:759:35: LOWERCASE
                    {
                    match(input,LOWERCASE,FOLLOW_LOWERCASE_in_ftCaseOption11316); if (failed) return ;

                    }
                    break;
                case 4 :
                    // etc/XQFT.g:760:35: UPPERCASE
                    {
                    match(input,UPPERCASE,FOLLOW_UPPERCASE_in_ftCaseOption11352); if (failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftCaseOption


    // $ANTLR start ftDiacriticsOption
    // etc/XQFT.g:762:1: ftDiacriticsOption : ( ( DIACRITICS INSENSITIVE ) | ( DIACRITICS SENSITIVE ) );
    public final void ftDiacriticsOption() throws RecognitionException {
        try {
            // etc/XQFT.g:762:29: ( ( DIACRITICS INSENSITIVE ) | ( DIACRITICS SENSITIVE ) )
            int alt150=2;
            int LA150_0 = input.LA(1);

            if ( (LA150_0==DIACRITICS) ) {
                int LA150_1 = input.LA(2);

                if ( (LA150_1==SENSITIVE) ) {
                    alt150=2;
                }
                else if ( (LA150_1==INSENSITIVE) ) {
                    alt150=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("762:1: ftDiacriticsOption : ( ( DIACRITICS INSENSITIVE ) | ( DIACRITICS SENSITIVE ) );", 150, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("762:1: ftDiacriticsOption : ( ( DIACRITICS INSENSITIVE ) | ( DIACRITICS SENSITIVE ) );", 150, 0, input);

                throw nvae;
            }
            switch (alt150) {
                case 1 :
                    // etc/XQFT.g:762:31: ( DIACRITICS INSENSITIVE )
                    {
                    // etc/XQFT.g:762:31: ( DIACRITICS INSENSITIVE )
                    // etc/XQFT.g:762:32: DIACRITICS INSENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption11370); if (failed) return ;
                    match(input,INSENSITIVE,FOLLOW_INSENSITIVE_in_ftDiacriticsOption11372); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:763:35: ( DIACRITICS SENSITIVE )
                    {
                    // etc/XQFT.g:763:35: ( DIACRITICS SENSITIVE )
                    // etc/XQFT.g:763:36: DIACRITICS SENSITIVE
                    {
                    match(input,DIACRITICS,FOLLOW_DIACRITICS_in_ftDiacriticsOption11410); if (failed) return ;
                    match(input,SENSITIVE,FOLLOW_SENSITIVE_in_ftDiacriticsOption11412); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftDiacriticsOption


    // $ANTLR start ftStemOption
    // etc/XQFT.g:765:1: ftStemOption : ( ( WITH STEMMING ) | ( WITHOUT STEMMING ) );
    public final void ftStemOption() throws RecognitionException {
        try {
            // etc/XQFT.g:765:29: ( ( WITH STEMMING ) | ( WITHOUT STEMMING ) )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==WITH) ) {
                alt151=1;
            }
            else if ( (LA151_0==WITHOUT) ) {
                alt151=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("765:1: ftStemOption : ( ( WITH STEMMING ) | ( WITHOUT STEMMING ) );", 151, 0, input);

                throw nvae;
            }
            switch (alt151) {
                case 1 :
                    // etc/XQFT.g:765:31: ( WITH STEMMING )
                    {
                    // etc/XQFT.g:765:31: ( WITH STEMMING )
                    // etc/XQFT.g:765:32: WITH STEMMING
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStemOption11437); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption11439); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:765:49: ( WITHOUT STEMMING )
                    {
                    // etc/XQFT.g:765:49: ( WITHOUT STEMMING )
                    // etc/XQFT.g:765:50: WITHOUT STEMMING
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStemOption11445); if (failed) return ;
                    match(input,STEMMING,FOLLOW_STEMMING_in_ftStemOption11447); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftStemOption


    // $ANTLR start ftThesaurusOption
    // etc/XQFT.g:767:1: ftThesaurusOption : ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) );
    public final void ftThesaurusOption() throws RecognitionException {
        try {
            // etc/XQFT.g:767:27: ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) )
            int alt155=3;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==WITH) ) {
                int LA155_1 = input.LA(2);

                if ( (LA155_1==THESAURUS) ) {
                    int LA155_3 = input.LA(3);

                    if ( (LA155_3==LEFTPARENTHESISSi) ) {
                        alt155=2;
                    }
                    else if ( (LA155_3==AT||LA155_3==DEFAULT) ) {
                        alt155=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("767:1: ftThesaurusOption : ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) );", 155, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("767:1: ftThesaurusOption : ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) );", 155, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA155_0==WITHOUT) ) {
                alt155=3;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("767:1: ftThesaurusOption : ( ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) ) | ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi ) | ( WITHOUT THESAURUS ) );", 155, 0, input);

                throw nvae;
            }
            switch (alt155) {
                case 1 :
                    // etc/XQFT.g:767:29: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) )
                    {
                    // etc/XQFT.g:767:29: ( WITH THESAURUS ( ftThesaurusID | DEFAULT ) )
                    // etc/XQFT.g:767:30: WITH THESAURUS ( ftThesaurusID | DEFAULT )
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption11465); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption11467); if (failed) return ;
                    // etc/XQFT.g:767:45: ( ftThesaurusID | DEFAULT )
                    int alt152=2;
                    int LA152_0 = input.LA(1);

                    if ( (LA152_0==AT) ) {
                        alt152=1;
                    }
                    else if ( (LA152_0==DEFAULT) ) {
                        alt152=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("767:45: ( ftThesaurusID | DEFAULT )", 152, 0, input);

                        throw nvae;
                    }
                    switch (alt152) {
                        case 1 :
                            // etc/XQFT.g:767:46: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption11470);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:767:62: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption11474); if (failed) return ;

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:768:35: ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:768:35: ( WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi )
                    // etc/XQFT.g:768:36: WITH THESAURUS LEFTPARENTHESISSi ( ftThesaurusID | DEFAULT ) ( COMMASi ftThesaurusID )* RIGHTPARENTHESISSi
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftThesaurusOption11513); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption11515); if (failed) return ;
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_ftThesaurusOption11517); if (failed) return ;
                    // etc/XQFT.g:768:69: ( ftThesaurusID | DEFAULT )
                    int alt153=2;
                    int LA153_0 = input.LA(1);

                    if ( (LA153_0==AT) ) {
                        alt153=1;
                    }
                    else if ( (LA153_0==DEFAULT) ) {
                        alt153=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("768:69: ( ftThesaurusID | DEFAULT )", 153, 0, input);

                        throw nvae;
                    }
                    switch (alt153) {
                        case 1 :
                            // etc/XQFT.g:768:70: ftThesaurusID
                            {
                            pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption11520);
                            ftThesaurusID();
                            _fsp--;
                            if (failed) return ;

                            }
                            break;
                        case 2 :
                            // etc/XQFT.g:768:86: DEFAULT
                            {
                            match(input,DEFAULT,FOLLOW_DEFAULT_in_ftThesaurusOption11524); if (failed) return ;

                            }
                            break;

                    }

                    // etc/XQFT.g:768:95: ( COMMASi ftThesaurusID )*
                    loop154:
                    do {
                        int alt154=2;
                        int LA154_0 = input.LA(1);

                        if ( (LA154_0==COMMASi) ) {
                            alt154=1;
                        }


                        switch (alt154) {
                    	case 1 :
                    	    // etc/XQFT.g:768:96: COMMASi ftThesaurusID
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftThesaurusOption11528); if (failed) return ;
                    	    pushFollow(FOLLOW_ftThesaurusID_in_ftThesaurusOption11530);
                    	    ftThesaurusID();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop154;
                        }
                    } while (true);

                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_ftThesaurusOption11534); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:769:35: ( WITHOUT THESAURUS )
                    {
                    // etc/XQFT.g:769:35: ( WITHOUT THESAURUS )
                    // etc/XQFT.g:769:36: WITHOUT THESAURUS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftThesaurusOption11572); if (failed) return ;
                    match(input,THESAURUS,FOLLOW_THESAURUS_in_ftThesaurusOption11574); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftThesaurusOption


    // $ANTLR start ftThesaurusID
    // etc/XQFT.g:771:1: ftThesaurusID : AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? ;
    public final void ftThesaurusID() throws RecognitionException {
        try {
            // etc/XQFT.g:771:29: ( AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )? )
            // etc/XQFT.g:771:31: AT uriLiteral ( RELATIONSHIP StringLiteral )? ( ftRange LEVELS )?
            {
            match(input,AT,FOLLOW_AT_in_ftThesaurusID11597); if (failed) return ;
            pushFollow(FOLLOW_uriLiteral_in_ftThesaurusID11599);
            uriLiteral();
            _fsp--;
            if (failed) return ;
            // etc/XQFT.g:771:45: ( RELATIONSHIP StringLiteral )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==RELATIONSHIP) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // etc/XQFT.g:771:46: RELATIONSHIP StringLiteral
                    {
                    match(input,RELATIONSHIP,FOLLOW_RELATIONSHIP_in_ftThesaurusID11602); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftThesaurusID11604); if (failed) return ;

                    }
                    break;

            }

            // etc/XQFT.g:771:75: ( ftRange LEVELS )?
            int alt157=2;
            int LA157_0 = input.LA(1);

            if ( (LA157_0==FROM||LA157_0==EXACTLY) ) {
                alt157=1;
            }
            else if ( (LA157_0==AT) ) {
                int LA157_2 = input.LA(2);

                if ( (LA157_2==MOST||LA157_2==LEAST) ) {
                    alt157=1;
                }
            }
            switch (alt157) {
                case 1 :
                    // etc/XQFT.g:771:76: ftRange LEVELS
                    {
                    pushFollow(FOLLOW_ftRange_in_ftThesaurusID11609);
                    ftRange();
                    _fsp--;
                    if (failed) return ;
                    match(input,LEVELS,FOLLOW_LEVELS_in_ftThesaurusID11611); if (failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftThesaurusID


    // $ANTLR start ftStopwordOption
    // etc/XQFT.g:773:1: ftStopwordOption : ( ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* ) | ( WITHOUT STOP WORDS ) | ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* ) );
    public final void ftStopwordOption() throws RecognitionException {
        try {
            // etc/XQFT.g:773:29: ( ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* ) | ( WITHOUT STOP WORDS ) | ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* ) )
            int alt160=3;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==WITH) ) {
                int LA160_1 = input.LA(2);

                if ( (LA160_1==DEFAULT) ) {
                    alt160=3;
                }
                else if ( (LA160_1==STOP) ) {
                    alt160=1;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("773:1: ftStopwordOption : ( ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* ) | ( WITHOUT STOP WORDS ) | ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* ) );", 160, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA160_0==WITHOUT) ) {
                alt160=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("773:1: ftStopwordOption : ( ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* ) | ( WITHOUT STOP WORDS ) | ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* ) );", 160, 0, input);

                throw nvae;
            }
            switch (alt160) {
                case 1 :
                    // etc/XQFT.g:773:31: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* )
                    {
                    // etc/XQFT.g:773:31: ( WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )* )
                    // etc/XQFT.g:773:32: WITH STOP WORDS ftRefOrList ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption11633); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption11635); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption11637); if (failed) return ;
                    pushFollow(FOLLOW_ftRefOrList_in_ftStopwordOption11639);
                    ftRefOrList();
                    _fsp--;
                    if (failed) return ;
                    // etc/XQFT.g:773:60: ( ftInclExclStringLiteral )*
                    loop158:
                    do {
                        int alt158=2;
                        int LA158_0 = input.LA(1);

                        if ( (LA158_0==EXCEPT||LA158_0==UNION) ) {
                            alt158=1;
                        }


                        switch (alt158) {
                    	case 1 :
                    	    // etc/XQFT.g:773:60: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption11641);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop158;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:774:35: ( WITHOUT STOP WORDS )
                    {
                    // etc/XQFT.g:774:35: ( WITHOUT STOP WORDS )
                    // etc/XQFT.g:774:36: WITHOUT STOP WORDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftStopwordOption11680); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption11682); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption11684); if (failed) return ;

                    }


                    }
                    break;
                case 3 :
                    // etc/XQFT.g:775:35: ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
                    {
                    // etc/XQFT.g:775:35: ( WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )* )
                    // etc/XQFT.g:775:36: WITH DEFAULT STOP WORDS ( ftInclExclStringLiteral )*
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftStopwordOption11722); if (failed) return ;
                    match(input,DEFAULT,FOLLOW_DEFAULT_in_ftStopwordOption11724); if (failed) return ;
                    match(input,STOP,FOLLOW_STOP_in_ftStopwordOption11726); if (failed) return ;
                    match(input,WORDS,FOLLOW_WORDS_in_ftStopwordOption11728); if (failed) return ;
                    // etc/XQFT.g:775:60: ( ftInclExclStringLiteral )*
                    loop159:
                    do {
                        int alt159=2;
                        int LA159_0 = input.LA(1);

                        if ( (LA159_0==EXCEPT||LA159_0==UNION) ) {
                            alt159=1;
                        }


                        switch (alt159) {
                    	case 1 :
                    	    // etc/XQFT.g:775:60: ftInclExclStringLiteral
                    	    {
                    	    pushFollow(FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption11730);
                    	    ftInclExclStringLiteral();
                    	    _fsp--;
                    	    if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop159;
                        }
                    } while (true);


                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftStopwordOption


    // $ANTLR start ftRefOrList
    // etc/XQFT.g:777:1: ftRefOrList : ( ( AT uriLiteral ) | ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi ) );
    public final void ftRefOrList() throws RecognitionException {
        try {
            // etc/XQFT.g:777:29: ( ( AT uriLiteral ) | ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi ) )
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==AT) ) {
                alt162=1;
            }
            else if ( (LA162_0==LEFTPARENTHESISSi) ) {
                alt162=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("777:1: ftRefOrList : ( ( AT uriLiteral ) | ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi ) );", 162, 0, input);

                throw nvae;
            }
            switch (alt162) {
                case 1 :
                    // etc/XQFT.g:777:31: ( AT uriLiteral )
                    {
                    // etc/XQFT.g:777:31: ( AT uriLiteral )
                    // etc/XQFT.g:777:32: AT uriLiteral
                    {
                    match(input,AT,FOLLOW_AT_in_ftRefOrList11757); if (failed) return ;
                    pushFollow(FOLLOW_uriLiteral_in_ftRefOrList11759);
                    uriLiteral();
                    _fsp--;
                    if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:778:35: ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi )
                    {
                    // etc/XQFT.g:778:35: ( LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi )
                    // etc/XQFT.g:778:36: LEFTPARENTHESISSi StringLiteral ( COMMASi StringLiteral )* RIGHTPARENTHESISSi
                    {
                    match(input,LEFTPARENTHESISSi,FOLLOW_LEFTPARENTHESISSi_in_ftRefOrList11797); if (failed) return ;
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList11799); if (failed) return ;
                    // etc/XQFT.g:778:68: ( COMMASi StringLiteral )*
                    loop161:
                    do {
                        int alt161=2;
                        int LA161_0 = input.LA(1);

                        if ( (LA161_0==COMMASi) ) {
                            alt161=1;
                        }


                        switch (alt161) {
                    	case 1 :
                    	    // etc/XQFT.g:778:69: COMMASi StringLiteral
                    	    {
                    	    match(input,COMMASi,FOLLOW_COMMASi_in_ftRefOrList11802); if (failed) return ;
                    	    match(input,StringLiteral,FOLLOW_StringLiteral_in_ftRefOrList11804); if (failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop161;
                        }
                    } while (true);

                    match(input,RIGHTPARENTHESISSi,FOLLOW_RIGHTPARENTHESISSi_in_ftRefOrList11808); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftRefOrList


    // $ANTLR start ftInclExclStringLiteral
    // etc/XQFT.g:780:1: ftInclExclStringLiteral : ( UNION | EXCEPT ) ftRefOrList ;
    public final void ftInclExclStringLiteral() throws RecognitionException {
        try {
            // etc/XQFT.g:780:29: ( ( UNION | EXCEPT ) ftRefOrList )
            // etc/XQFT.g:780:31: ( UNION | EXCEPT ) ftRefOrList
            {
            if ( input.LA(1)==EXCEPT||input.LA(1)==UNION ) {
                input.consume();
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_ftInclExclStringLiteral11821);    throw mse;
            }

            pushFollow(FOLLOW_ftRefOrList_in_ftInclExclStringLiteral11829);
            ftRefOrList();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftInclExclStringLiteral


    // $ANTLR start ftLanguageOption
    // etc/XQFT.g:781:1: ftLanguageOption : LANGUAGE StringLiteral ;
    public final void ftLanguageOption() throws RecognitionException {
        try {
            // etc/XQFT.g:781:29: ( LANGUAGE StringLiteral )
            // etc/XQFT.g:781:31: LANGUAGE StringLiteral
            {
            match(input,LANGUAGE,FOLLOW_LANGUAGE_in_ftLanguageOption11847); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftLanguageOption11849); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftLanguageOption


    // $ANTLR start ftWildCardOption
    // etc/XQFT.g:782:1: ftWildCardOption : ( ( WITH WILDCARDS ) | ( WITHOUT WILDCARDS ) );
    public final void ftWildCardOption() throws RecognitionException {
        try {
            // etc/XQFT.g:782:29: ( ( WITH WILDCARDS ) | ( WITHOUT WILDCARDS ) )
            int alt163=2;
            int LA163_0 = input.LA(1);

            if ( (LA163_0==WITH) ) {
                alt163=1;
            }
            else if ( (LA163_0==WITHOUT) ) {
                alt163=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("782:1: ftWildCardOption : ( ( WITH WILDCARDS ) | ( WITHOUT WILDCARDS ) );", 163, 0, input);

                throw nvae;
            }
            switch (alt163) {
                case 1 :
                    // etc/XQFT.g:782:31: ( WITH WILDCARDS )
                    {
                    // etc/XQFT.g:782:31: ( WITH WILDCARDS )
                    // etc/XQFT.g:782:32: WITH WILDCARDS
                    {
                    match(input,WITH,FOLLOW_WITH_in_ftWildCardOption11868); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption11870); if (failed) return ;

                    }


                    }
                    break;
                case 2 :
                    // etc/XQFT.g:782:50: ( WITHOUT WILDCARDS )
                    {
                    // etc/XQFT.g:782:50: ( WITHOUT WILDCARDS )
                    // etc/XQFT.g:782:51: WITHOUT WILDCARDS
                    {
                    match(input,WITHOUT,FOLLOW_WITHOUT_in_ftWildCardOption11876); if (failed) return ;
                    match(input,WILDCARDS,FOLLOW_WILDCARDS_in_ftWildCardOption11878); if (failed) return ;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftWildCardOption


    // $ANTLR start ftExtensionOption
    // etc/XQFT.g:783:1: ftExtensionOption : OPTION QName StringLiteral ;
    public final void ftExtensionOption() throws RecognitionException {
        try {
            // etc/XQFT.g:783:29: ( OPTION QName StringLiteral )
            // etc/XQFT.g:783:31: OPTION QName StringLiteral
            {
            match(input,OPTION,FOLLOW_OPTION_in_ftExtensionOption11896); if (failed) return ;
            match(input,QName,FOLLOW_QName_in_ftExtensionOption11898); if (failed) return ;
            match(input,StringLiteral,FOLLOW_StringLiteral_in_ftExtensionOption11900); if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftExtensionOption


    // $ANTLR start ftIgnoreOption
    // etc/XQFT.g:784:1: ftIgnoreOption : WITHOUT CONTENT unionExpr ;
    public final void ftIgnoreOption() throws RecognitionException {
        try {
            // etc/XQFT.g:784:29: ( WITHOUT CONTENT unionExpr )
            // etc/XQFT.g:784:31: WITHOUT CONTENT unionExpr
            {
            match(input,WITHOUT,FOLLOW_WITHOUT_in_ftIgnoreOption11920); if (failed) return ;
            match(input,CONTENT,FOLLOW_CONTENT_in_ftIgnoreOption11922); if (failed) return ;
            pushFollow(FOLLOW_unionExpr_in_ftIgnoreOption11924);
            unionExpr();
            _fsp--;
            if (failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end ftIgnoreOption

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // etc/XQFT.g:479:31: ( DOUBLESLASH relativePathExpr )
        // etc/XQFT.g:479:32: DOUBLESLASH relativePathExpr
        {
        match(input,DOUBLESLASH,FOLLOW_DOUBLESLASH_in_synpred16899); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred16901);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // etc/XQFT.g:480:11: ( SLASH relativePathExpr )
        // etc/XQFT.g:480:12: SLASH relativePathExpr
        {
        match(input,SLASH,FOLLOW_SLASH_in_synpred26921); if (failed) return ;
        pushFollow(FOLLOW_relativePathExpr_in_synpred26923);
        relativePathExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // etc/XQFT.g:529:31: ( STARSi COLONSi NCName )
        // etc/XQFT.g:529:32: STARSi COLONSi NCName
        {
        match(input,STARSi,FOLLOW_STARSi_in_synpred37388); if (failed) return ;
        match(input,COLONSi,FOLLOW_COLONSi_in_synpred37390); if (failed) return ;
        match(input,NCName,FOLLOW_NCName_in_synpred37392); if (failed) return ;

        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // etc/XQFT.g:645:31: ( itemType occurrenceIndicator )
        // etc/XQFT.g:645:32: itemType occurrenceIndicator
        {
        pushFollow(FOLLOW_itemType_in_synpred49167);
        itemType();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_occurrenceIndicator_in_synpred49169);
        occurrenceIndicator();
        _fsp--;
        if (failed) return ;

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


    protected DFA74 dfa74 = new DFA74(this);
    protected DFA116 dfa116 = new DFA116(this);
    static final String DFA74_eotS =
        "\u01e1\uffff";
    static final String DFA74_eofS =
        "\2\uffff\1\37\32\uffff\1\71\2\uffff\1\37\3\uffff\1\37\1\uffff\1"+
        "\37\177\uffff\1\71\42\uffff\1\71\31\uffff\1\71\u00fd\uffff";
    static final String DFA74_minS =
        "\1\25\1\uffff\1\4\11\uffff\1\25\20\uffff\1\4\2\uffff\1\4\1\uffff"+
        "\2\25\1\4\1\25\1\4\51\uffff\1\25\1\16\1\25\3\0\1\u00d8\3\0\2\16"+
        "\1\u00d8\1\74\1\u00d6\6\16\1\u00a6\1\0\1\u00a6\1\33\4\177\1\0\1"+
        "\63\1\u00d8\2\0\1\u00d8\3\0\2\16\1\u00d8\1\74\1\u00d6\6\16\1\u00a6"+
        "\1\0\1\u00a6\1\33\4\177\1\0\1\63\2\0\1\u00d8\3\0\2\16\1\25\1\74"+
        "\1\u00d6\6\16\1\u00a6\1\0\1\u00a6\1\33\4\177\1\0\1\63\1\4\37\uffff"+
        "\1\25\1\uffff\1\25\1\4\10\uffff\1\25\20\uffff\1\4\2\uffff\1\0\1"+
        "\16\u0088\0\17\uffff\73\0\7\uffff\34\0\1\uffff\2\0\1\uffff";
    static final String DFA74_maxS =
        "\1\u00d8\1\uffff\1\u00d8\11\uffff\1\u00d8\20\uffff\1\u00d8\2\uffff"+
        "\1\u00db\1\uffff\5\u00d8\51\uffff\1\u00d8\1\u00a4\1\u00d8\3\0\1"+
        "\u00d8\3\0\2\16\1\u00d8\1\u00dd\1\u00d6\1\16\2\u00d8\2\177\1\u00d7"+
        "\1\u00a6\1\0\1\u00a6\1\u00d8\4\177\1\0\1\63\1\u00db\2\0\1\u00d8"+
        "\3\0\2\16\1\u00d8\1\u00dd\1\u00d6\1\16\2\u00d8\2\177\1\u00d7\1\u00a6"+
        "\1\0\1\u00a6\1\u00d8\4\177\1\0\1\63\2\0\1\u00d8\3\0\2\16\1\u00d8"+
        "\1\u00dd\1\u00d6\1\16\2\u00d8\2\177\1\u00d7\1\u00a6\1\0\1\u00a6"+
        "\1\u00d8\4\177\1\0\1\63\1\u00db\37\uffff\1\u00d8\1\uffff\2\u00d8"+
        "\10\uffff\1\u00d8\20\uffff\1\u00d8\2\uffff\1\0\1\16\u0088\0\17\uffff"+
        "\73\0\7\uffff\34\0\1\uffff\2\0\1\uffff";
    static final String DFA74_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\10\2\1\uffff\20\2\1\uffff\1\2\1\3\1\uffff"+
        "\1\2\5\uffff\51\2\127\uffff\37\2\1\uffff\1\2\2\uffff\10\2\1\uffff"+
        "\20\2\1\uffff\2\2\u008a\uffff\17\2\73\uffff\7\2\34\uffff\1\2\2\uffff"+
        "\1\2";
    static final String DFA74_specialS =
        "\1\15\1\uffff\1\23\32\uffff\1\4\2\uffff\1\0\4\uffff\1\13\1\32\54"+
        "\uffff\1\11\1\24\1\35\1\uffff\1\22\1\3\1\12\14\uffff\1\37\6\uffff"+
        "\1\36\2\uffff\1\30\1\20\1\uffff\1\33\1\10\1\21\14\uffff\1\2\6\uffff"+
        "\1\34\1\uffff\1\31\1\16\1\uffff\1\5\1\7\1\14\14\uffff\1\1\6\uffff"+
        "\1\25\1\uffff\1\17\42\uffff\1\6\31\uffff\1\27\2\uffff\1\26\u00fa"+
        "\uffff}>";
    static final String[] DFA74_transitionS = {
            "\1\3\4\uffff\2\3\1\uffff\1\3\6\uffff\1\2\25\uffff\1\3\3\uffff"+
            "\1\3\26\uffff\1\3\11\uffff\1\1\4\uffff\1\3\2\uffff\1\3\1\uffff"+
            "\1\3\2\uffff\1\3\3\uffff\1\3\7\uffff\1\3\5\uffff\2\3\11\uffff"+
            "\1\3\1\uffff\1\3\6\uffff\1\3\5\uffff\1\3\14\uffff\1\3\1\uffff"+
            "\14\3\21\uffff\3\3\4\uffff\1\3\13\uffff\2\3",
            "",
            "\7\37\4\uffff\2\37\4\uffff\1\6\1\uffff\1\37\2\uffff\1\12\1\31"+
            "\1\37\1\14\1\37\11\uffff\1\37\1\uffff\2\37\1\uffff\2\37\3\uffff"+
            "\1\37\1\uffff\1\37\2\uffff\1\37\1\uffff\1\37\1\24\1\uffff\1"+
            "\37\1\uffff\1\17\6\uffff\2\37\5\uffff\1\37\1\uffff\1\37\2\uffff"+
            "\2\37\2\uffff\1\33\1\37\1\uffff\1\37\1\uffff\1\37\2\uffff\1"+
            "\37\5\uffff\1\37\1\35\2\uffff\1\15\1\uffff\1\22\1\37\1\uffff"+
            "\1\13\3\uffff\1\16\1\37\2\uffff\1\37\2\uffff\1\37\1\23\1\37"+
            "\4\uffff\1\20\1\7\3\uffff\1\37\3\uffff\1\37\1\uffff\1\30\1\37"+
            "\1\21\1\uffff\1\37\2\uffff\2\37\1\34\5\uffff\1\32\1\uffff\11"+
            "\37\2\uffff\1\27\1\uffff\5\27\5\25\1\10\1\26\3\37\16\uffff\3"+
            "\4\4\uffff\1\5\13\uffff\1\36\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\3\uffff\3\37\1\uffff\1\37\6\uffff\1\37\25\uffff\1\37\1"+
            "\uffff\1\37\1\uffff\1\37\1\uffff\1\37\21\uffff\1\37\2\uffff"+
            "\1\37\11\uffff\1\37\4\uffff\1\37\2\uffff\1\37\1\uffff\1\37\2"+
            "\uffff\1\37\3\uffff\1\37\7\uffff\1\37\5\uffff\2\37\11\uffff"+
            "\1\37\1\uffff\1\37\6\uffff\1\37\5\uffff\1\37\14\uffff\1\37\1"+
            "\uffff\14\37\21\uffff\3\37\4\uffff\1\37\13\uffff\1\37\1\40",
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
            "\1\55\3\62\1\102\1\56\1\74\4\uffff\2\62\4\uffff\1\37\1\uffff"+
            "\1\50\1\uffff\3\37\1\110\1\45\1\52\5\uffff\1\44\3\uffff\1\51"+
            "\1\uffff\1\100\1\53\1\uffff\1\54\1\57\3\uffff\1\105\1\41\1\66"+
            "\2\uffff\1\103\1\uffff\1\107\1\37\1\uffff\1\42\1\uffff\1\37"+
            "\1\uffff\1\37\4\uffff\1\67\1\101\5\uffff\1\73\1\uffff\1\114"+
            "\2\uffff\1\56\1\42\2\uffff\1\37\1\75\1\uffff\1\55\1\uffff\1"+
            "\104\2\uffff\1\65\1\uffff\1\43\3\uffff\1\102\1\46\2\uffff\1"+
            "\37\1\uffff\1\37\1\76\1\47\1\37\3\uffff\1\37\1\111\2\uffff\1"+
            "\72\2\uffff\1\77\1\37\1\106\4\uffff\2\37\3\uffff\1\64\3\uffff"+
            "\1\54\1\uffff\1\37\1\112\1\37\1\uffff\1\60\2\uffff\1\56\1\70"+
            "\1\37\5\uffff\1\37\1\uffff\6\61\3\63\2\uffff\1\37\1\uffff\14"+
            "\37\3\113\16\uffff\3\37\4\uffff\1\37\13\uffff\2\37",
            "",
            "",
            "\1\37\1\117\2\uffff\3\37\14\uffff\1\37\4\uffff\1\37\1\uffff"+
            "\1\37\5\uffff\1\37\3\uffff\1\37\1\uffff\2\37\1\uffff\2\37\3"+
            "\uffff\1\37\1\uffff\1\37\2\uffff\1\37\1\uffff\1\37\2\uffff\1"+
            "\37\1\116\7\uffff\2\37\5\uffff\1\37\4\uffff\2\37\3\uffff\1\37"+
            "\1\uffff\1\37\1\uffff\1\37\2\uffff\1\37\1\uffff\1\37\3\uffff"+
            "\2\37\5\uffff\2\37\10\uffff\1\37\2\uffff\1\37\1\uffff\1\37\5"+
            "\uffff\1\37\3\uffff\1\37\3\uffff\1\37\5\uffff\1\37\2\uffff\2"+
            "\37\111\uffff\1\115",
            "",
            "\1\126\3\uffff\1\157\1\132\1\151\1\uffff\1\134\6\uffff\1\123"+
            "\25\uffff\1\144\1\uffff\1\120\1\uffff\1\137\1\uffff\1\121\21"+
            "\uffff\1\120\2\uffff\1\153\11\uffff\1\122\4\uffff\1\155\2\uffff"+
            "\1\135\1\uffff\1\142\2\uffff\1\133\3\uffff\1\136\7\uffff\1\143"+
            "\5\uffff\1\140\1\127\11\uffff\1\150\1\uffff\1\141\6\uffff\1"+
            "\154\5\uffff\1\152\14\uffff\1\147\1\uffff\5\147\5\145\1\130"+
            "\1\146\21\uffff\3\124\4\uffff\1\125\13\uffff\1\156\1\131",
            "\1\162\4\uffff\1\166\1\u0085\1\uffff\1\170\34\uffff\1\u0080"+
            "\3\uffff\1\173\26\uffff\1\u0087\16\uffff\1\u0089\2\uffff\1\171"+
            "\1\uffff\1\176\2\uffff\1\167\3\uffff\1\172\7\uffff\1\177\5\uffff"+
            "\1\174\1\163\11\uffff\1\u0084\1\uffff\1\175\6\uffff\1\u0088"+
            "\5\uffff\1\u0086\14\uffff\1\u0083\1\uffff\5\u0083\5\u0081\1"+
            "\164\1\u0082\21\uffff\3\160\4\uffff\1\161\13\uffff\1\u008a\1"+
            "\165",
            "\7\37\4\uffff\2\37\4\uffff\1\u008d\1\uffff\1\37\2\uffff\1\u0091"+
            "\1\u00a0\1\37\1\u0093\1\37\11\uffff\1\37\1\uffff\2\37\1\uffff"+
            "\2\37\3\uffff\1\37\1\uffff\1\37\2\uffff\1\37\1\uffff\1\37\1"+
            "\u009b\1\uffff\1\37\1\uffff\1\u0096\6\uffff\2\37\5\uffff\1\37"+
            "\1\uffff\1\37\2\uffff\2\37\2\uffff\1\u00a2\1\37\1\uffff\1\37"+
            "\1\uffff\1\37\2\uffff\1\37\5\uffff\1\37\1\u00a4\2\uffff\1\u0094"+
            "\1\uffff\1\u0099\1\37\1\uffff\1\u0092\3\uffff\1\u0095\1\37\2"+
            "\uffff\1\37\2\uffff\1\37\1\u009a\1\37\4\uffff\1\u0097\1\u008e"+
            "\3\uffff\1\37\3\uffff\1\37\1\uffff\1\u009f\1\37\1\u0098\1\uffff"+
            "\1\37\2\uffff\2\37\1\u00a3\5\uffff\1\u00a1\1\uffff\11\37\2\uffff"+
            "\1\u009e\1\uffff\5\u009e\5\u009c\1\u008f\1\u009d\3\37\16\uffff"+
            "\3\u008b\4\uffff\1\u008c\13\uffff\1\u00a5\1\u0090",
            "\1\u00ad\3\uffff\1\u00c5\1\u00b0\1\u00bf\1\uffff\1\u00b2\6\uffff"+
            "\1\u00aa\25\uffff\1\u00ba\1\uffff\1\u00a7\1\uffff\1\u00b5\1"+
            "\uffff\1\u00a8\21\uffff\1\u00a7\2\uffff\1\u00c1\11\uffff\1\u00a9"+
            "\4\uffff\1\u00c3\2\uffff\1\u00b3\1\uffff\1\u00b8\2\uffff\1\u00b1"+
            "\3\uffff\1\u00b4\7\uffff\1\u00b9\5\uffff\1\u00b6\1\u00ae\11"+
            "\uffff\1\u00be\1\uffff\1\u00b7\6\uffff\1\u00c2\5\uffff\1\u00c0"+
            "\14\uffff\1\u00bd\1\uffff\5\u00bd\5\u00bb\1\u00af\1\u00bc\21"+
            "\uffff\3\u00ab\4\uffff\1\u00ac\13\uffff\1\u00c4\1\u00a6",
            "\7\37\4\uffff\2\37\4\uffff\1\u00cc\1\uffff\1\37\1\uffff\1\u00e5"+
            "\1\u00d0\1\u00df\1\37\1\u00d2\1\37\5\uffff\1\u00c9\3\uffff\1"+
            "\37\1\uffff\2\37\1\uffff\2\37\3\uffff\3\37\2\uffff\1\37\1\uffff"+
            "\1\37\1\u00da\1\uffff\1\u00c6\1\uffff\1\u00d5\1\uffff\1\u00c7"+
            "\4\uffff\2\37\5\uffff\1\37\1\uffff\1\37\2\uffff\1\37\1\u00c6"+
            "\2\uffff\1\u00e1\1\37\1\uffff\1\37\1\uffff\1\37\2\uffff\1\37"+
            "\1\uffff\1\u00c8\3\uffff\1\37\1\u00e3\2\uffff\1\u00d3\1\uffff"+
            "\1\u00d8\2\37\1\u00d1\3\uffff\1\u00d4\1\37\2\uffff\1\37\2\uffff"+
            "\1\37\1\u00d9\1\37\4\uffff\1\u00d6\1\u00cd\3\uffff\1\37\3\uffff"+
            "\1\37\1\uffff\1\u00de\1\37\1\u00d7\1\uffff\1\37\2\uffff\2\37"+
            "\1\u00e2\5\uffff\1\u00e0\1\uffff\11\37\2\uffff\1\u00dd\1\uffff"+
            "\5\u00dd\5\u00db\1\u00ce\1\u00dc\3\37\16\uffff\3\u00ca\4\uffff"+
            "\1\u00cb\13\uffff\1\u00e4\1\u00cf",
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
            "\1\126\3\uffff\1\157\1\132\1\151\1\uffff\1\134\6\uffff\1\123"+
            "\25\uffff\1\144\1\uffff\1\120\1\uffff\1\137\1\uffff\1\121\21"+
            "\uffff\1\120\2\uffff\1\153\11\uffff\1\122\4\uffff\1\155\2\uffff"+
            "\1\135\1\uffff\1\142\2\uffff\1\133\3\uffff\1\136\7\uffff\1\143"+
            "\5\uffff\1\140\1\u00e6\11\uffff\1\150\1\uffff\1\141\6\uffff"+
            "\1\154\5\uffff\1\152\14\uffff\1\147\1\uffff\5\147\5\145\1\130"+
            "\1\146\21\uffff\3\124\4\uffff\1\125\13\uffff\1\156\1\131",
            "\1\u00e8\u0094\uffff\2\u00e7",
            "\1\u00eb\4\uffff\1\u00ef\1\u00fe\1\uffff\1\u00f1\34\uffff\1"+
            "\u00f9\3\uffff\1\u00f4\26\uffff\1\u0100\16\uffff\1\u0102\2\uffff"+
            "\1\u00f2\1\uffff\1\u00f7\2\uffff\1\u00f0\3\uffff\1\u00f3\7\uffff"+
            "\1\u00f8\5\uffff\1\u00f5\1\u00ec\11\uffff\1\u00fd\1\uffff\1"+
            "\u00f6\6\uffff\1\u0101\5\uffff\1\u00ff\14\uffff\1\u00fc\1\uffff"+
            "\5\u00fc\5\u00fa\1\u00ed\1\u00fb\21\uffff\3\u00e9\4\uffff\1"+
            "\u00ea\13\uffff\1\u0103\1\u00ee",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0104",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0109\70\uffff\1\u010a\147\uffff\1\u0108",
            "\1\u010b",
            "\1\u010c",
            "\1\u010f\160\uffff\1\u010d\130\uffff\1\u010e",
            "\1\u0113\160\uffff\1\u0111\46\uffff\1\u0110\61\uffff\1\u0112",
            "\1\u0114\160\uffff\1\u0115",
            "\1\u0116\160\uffff\1\u0117",
            "\1\u011a\160\uffff\1\u0118\127\uffff\1\u0119",
            "\1\u011b",
            "\1\uffff",
            "\1\u0110",
            "\1\151\36\uffff\1\u011e\32\uffff\1\153\16\uffff\1\155\4\uffff"+
            "\1\u0120\16\uffff\1\u011f\5\uffff\1\u011c\14\uffff\1\u011d\6"+
            "\uffff\1\154\5\uffff\1\152\76\uffff\1\156\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\uffff",
            "\1\u0126",
            "\1\u0128\2\uffff\1\u0127",
            "\1\uffff",
            "\1\uffff",
            "\1\u0129",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012e\70\uffff\1\u012f\147\uffff\1\u012d",
            "\1\u0130",
            "\1\u0131",
            "\1\u0134\160\uffff\1\u0132\130\uffff\1\u0133",
            "\1\u0138\160\uffff\1\u0136\46\uffff\1\u0135\61\uffff\1\u0137",
            "\1\u0139\160\uffff\1\u013a",
            "\1\u013b\160\uffff\1\u013c",
            "\1\u013f\160\uffff\1\u013d\127\uffff\1\u013e",
            "\1\u0140",
            "\1\uffff",
            "\1\u0135",
            "\1\u0085\36\uffff\1\u0143\32\uffff\1\u0087\16\uffff\1\u0089"+
            "\4\uffff\1\u0145\16\uffff\1\u0144\5\uffff\1\u0141\14\uffff\1"+
            "\u0142\6\uffff\1\u0088\5\uffff\1\u0086\76\uffff\1\u008a\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\uffff",
            "\1\u014b",
            "\1\uffff",
            "\1\uffff",
            "\1\u014c",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u014d",
            "\1\u014e",
            "\1\37\3\uffff\3\37\1\uffff\1\37\6\uffff\1\37\25\uffff\1\37\1"+
            "\uffff\1\37\1\uffff\1\37\1\uffff\1\37\21\uffff\1\37\2\uffff"+
            "\1\37\11\uffff\1\37\4\uffff\1\37\2\uffff\1\37\1\uffff\1\37\2"+
            "\uffff\1\37\3\uffff\1\37\7\uffff\1\37\5\uffff\2\37\11\uffff"+
            "\1\37\1\uffff\1\37\6\uffff\1\37\5\uffff\1\37\14\uffff\1\37\1"+
            "\uffff\14\37\21\uffff\3\37\4\uffff\1\37\13\uffff\1\37\1\u014f",
            "\1\u0151\70\uffff\1\u0152\147\uffff\1\u0150",
            "\1\u0153",
            "\1\u0154",
            "\1\u0157\160\uffff\1\u0155\130\uffff\1\u0156",
            "\1\u015b\160\uffff\1\u0159\46\uffff\1\u0158\61\uffff\1\u015a",
            "\1\u015c\160\uffff\1\u015d",
            "\1\u015e\160\uffff\1\u015f",
            "\1\u0162\160\uffff\1\u0160\127\uffff\1\u0161",
            "\1\u0163",
            "\1\uffff",
            "\1\u0158",
            "\1\u00a0\36\uffff\1\u0166\32\uffff\1\u00a2\16\uffff\1\u016a"+
            "\4\uffff\1\u0168\16\uffff\1\u0167\5\uffff\1\u0164\14\uffff\1"+
            "\u0165\6\uffff\1\u00a3\5\uffff\1\u00a1\76\uffff\1\u00a5\1\u0169",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\uffff",
            "\1\u016f",
            "\1\u0178\1\37\2\uffff\1\102\1\u0179\1\74\14\uffff\1\u0173\4"+
            "\uffff\1\110\1\uffff\1\u0175\5\uffff\1\u0172\3\uffff\1\u0174"+
            "\1\uffff\1\100\1\u0176\1\uffff\1\u0177\1\u017b\3\uffff\1\105"+
            "\1\uffff\1\66\2\uffff\1\103\1\uffff\1\107\2\uffff\1\u017a\1"+
            "\37\7\uffff\1\67\1\101\5\uffff\1\73\4\uffff\1\u0179\1\u017a"+
            "\3\uffff\1\75\1\uffff\1\u0178\1\uffff\1\104\2\uffff\1\65\1\uffff"+
            "\1\u0172\3\uffff\1\102\1\u0179\5\uffff\1\76\1\u0171\10\uffff"+
            "\1\u017e\2\uffff\1\77\1\uffff\1\106\5\uffff\1\u0170\3\uffff"+
            "\1\64\3\uffff\1\u0177\5\uffff\1\u017c\2\uffff\1\u0179\1\u017d"+
            "\111\uffff\1\37",
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
            "\1\u0184\3\uffff\1\u019d\1\u0188\1\u0197\1\uffff\1\u018a\6\uffff"+
            "\1\u0181\25\uffff\1\u0192\1\uffff\1\u019e\1\uffff\1\u018d\1"+
            "\uffff\1\u017f\21\uffff\1\u019e\2\uffff\1\u0199\11\uffff\1\u0180"+
            "\4\uffff\1\u019b\2\uffff\1\u018b\1\uffff\1\u0190\2\uffff\1\u0189"+
            "\3\uffff\1\u018c\7\uffff\1\u0191\5\uffff\1\u018e\1\u0185\11"+
            "\uffff\1\u0196\1\uffff\1\u018f\6\uffff\1\u019a\5\uffff\1\u0198"+
            "\14\uffff\1\u0195\1\uffff\5\u0195\5\u0193\1\u0186\1\u0194\21"+
            "\uffff\3\u0182\4\uffff\1\u0183\13\uffff\1\u019c\1\u0187",
            "",
            "\1\u01a1\4\uffff\1\u01a5\1\u01b4\1\uffff\1\u01a7\34\uffff\1"+
            "\u01af\3\uffff\1\u01aa\26\uffff\1\u01b6\16\uffff\1\u01b8\2\uffff"+
            "\1\u01a8\1\uffff\1\u01ad\2\uffff\1\u01a6\3\uffff\1\u01a9\7\uffff"+
            "\1\u01ae\5\uffff\1\u01ab\1\u01a2\11\uffff\1\u01b3\1\uffff\1"+
            "\u01ac\6\uffff\1\u01b7\5\uffff\1\u01b5\14\uffff\1\u01b2\1\uffff"+
            "\5\u01b2\5\u01b0\1\u01a3\1\u01b1\21\uffff\3\u019f\4\uffff\1"+
            "\u01a0\13\uffff\1\u01b9\1\u01a4",
            "\1\u01bf\3\62\1\102\1\56\1\74\4\uffff\2\62\4\uffff\1\u01c5\1"+
            "\uffff\1\u01ba\2\uffff\1\u01c9\1\u01d7\1\110\1\u01c1\1\u01bc"+
            "\11\uffff\1\u01bb\1\uffff\1\100\1\u01bd\1\uffff\1\u01be\1\57"+
            "\3\uffff\1\105\1\uffff\1\66\2\uffff\1\103\1\uffff\1\107\1\u01d2"+
            "\1\uffff\1\u01c0\1\uffff\1\u01cd\6\uffff\1\67\1\101\5\uffff"+
            "\1\73\1\uffff\1\114\2\uffff\1\56\1\u01c0\2\uffff\1\u01d9\1\75"+
            "\1\uffff\1\u01bf\1\uffff\1\104\2\uffff\1\65\5\uffff\1\102\1"+
            "\u01c2\2\uffff\1\u01cb\1\uffff\1\u01d0\1\76\1\uffff\1\u01ca"+
            "\3\uffff\1\u01cc\1\111\2\uffff\1\72\2\uffff\1\77\1\u01d1\1\106"+
            "\4\uffff\1\u01ce\1\u01c6\3\uffff\1\64\3\uffff\1\u01be\1\uffff"+
            "\1\u01d6\1\112\1\u01cf\1\uffff\1\60\2\uffff\1\56\1\70\1\u01da"+
            "\5\uffff\1\u01d8\1\uffff\6\61\3\63\2\uffff\1\u01d5\1\uffff\5"+
            "\u01d5\5\u01d3\1\u01c7\1\u01d4\3\113\16\uffff\3\u01c3\4\uffff"+
            "\1\u01c4\13\uffff\1\u01db\1\u01c8",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\3\uffff\3\37\1\uffff\1\37\6\uffff\1\37\25\uffff\1\37\1"+
            "\uffff\1\37\1\uffff\1\37\1\uffff\1\37\21\uffff\1\37\2\uffff"+
            "\1\37\11\uffff\1\37\4\uffff\1\37\2\uffff\1\37\1\uffff\1\37\2"+
            "\uffff\1\37\3\uffff\1\37\7\uffff\1\37\5\uffff\2\37\11\uffff"+
            "\1\37\1\uffff\1\37\6\uffff\1\37\5\uffff\1\37\14\uffff\1\37\1"+
            "\uffff\14\37\21\uffff\3\37\4\uffff\1\37\13\uffff\1\37\1\u01dc",
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
            "\1\u01bf\3\62\1\102\1\56\1\74\4\uffff\2\62\4\uffff\1\37\1\uffff"+
            "\1\u01ba\1\uffff\3\37\1\110\1\45\1\u01bc\5\uffff\1\u01df\3\uffff"+
            "\1\u01bb\1\uffff\1\100\1\u01bd\1\uffff\1\u01be\1\57\3\uffff"+
            "\1\105\1\u01dd\1\66\2\uffff\1\103\1\uffff\1\107\1\37\1\uffff"+
            "\1\42\1\uffff\1\37\1\uffff\1\37\4\uffff\1\67\1\101\5\uffff\1"+
            "\73\1\uffff\1\114\2\uffff\1\56\1\42\2\uffff\1\37\1\75\1\uffff"+
            "\1\u01bf\1\uffff\1\104\2\uffff\1\65\1\uffff\1\u01de\3\uffff"+
            "\1\102\1\46\2\uffff\1\37\1\uffff\1\37\1\76\1\u01e0\1\37\3\uffff"+
            "\1\37\1\111\2\uffff\1\72\2\uffff\1\77\1\37\1\106\4\uffff\2\37"+
            "\3\uffff\1\64\3\uffff\1\u01be\1\uffff\1\37\1\112\1\37\1\uffff"+
            "\1\60\2\uffff\1\56\1\70\1\37\5\uffff\1\37\1\uffff\6\61\3\63"+
            "\2\uffff\1\37\1\uffff\14\37\3\113\16\uffff\3\37\4\uffff\1\37"+
            "\13\uffff\2\37",
            "",
            "",
            "\1\uffff",
            "\1\u00e8",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
    static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
    static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
    static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
    static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
    static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
    static final short[][] DFA74_transition;

    static {
        int numStates = DFA74_transitionS.length;
        DFA74_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = DFA74_eot;
            this.eof = DFA74_eof;
            this.min = DFA74_min;
            this.max = DFA74_max;
            this.accept = DFA74_accept;
            this.special = DFA74_special;
            this.transition = DFA74_transition;
        }
        public String getDescription() {
            return "479:1: pathExpr : ( ( DOUBLESLASH relativePathExpr )=> DOUBLESLASH relativePathExpr | ( SLASH relativePathExpr )=> SLASH relativePathExpr | SLASH | relativePathExpr );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA74_32 = input.LA(1);

                         
                        int index74_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_32==EOF||LA74_32==PIPESi||(LA74_32>=ASCENDING && LA74_32<=WHERE)||LA74_32==CAST||LA74_32==ELSE||LA74_32==TREAT||LA74_32==SLASH||LA74_32==CASTABLE||(LA74_32>=FOR && LA74_32<=INSTANCE)||(LA74_32>=EXCEPT && LA74_32<=TO)||LA74_32==SATISFIES||LA74_32==SEMICOLONSi||LA74_32==EMPTY||LA74_32==CASE||LA74_32==MINUSSi||(LA74_32>=COMMASi && LA74_32<=LET)||LA74_32==RIGHTBRACKETSi||(LA74_32>=DIV && LA74_32<=PLUSSi)||LA74_32==ORDER||LA74_32==UNION||LA74_32==COLLATION||LA74_32==OR||LA74_32==DOUBLESLASH||(LA74_32>=DESCENDING && LA74_32<=STARSi)||(LA74_32>=STABLE && LA74_32<=LEFTBRACKETSi)||LA74_32==RIGHTPARENTHESISSi||LA74_32==RETURN||LA74_32==DEFAULT||LA74_32==LEFTPARENTHESISSi||LA74_32==AND||LA74_32==INTERSECT||LA74_32==FTCONTAINS||(LA74_32>=MOD && LA74_32<=RIGHTBRACESi)) ) {s = 31;}

                        else if ( (LA74_32==S) && (synpred2())) {s = 77;}

                        else if ( (LA74_32==RIGHTSELFTERMINATOR) && (synpred2())) {s = 78;}

                        else if ( (LA74_32==BIGGERTHANSi) && (synpred2())) {s = 79;}

                         
                        input.seek(index74_32);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA74_157 = input.LA(1);

                         
                        int index74_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_157);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA74_130 = input.LA(1);

                         
                        int index74_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_130);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA74_88 = input.LA(1);

                         
                        int index74_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_88);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA74_29 = input.LA(1);

                         
                        int index74_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_29==COLONSi) && (synpred2())) {s = 33;}

                        else if ( (LA74_29==MINUSSi||LA74_29==PLUSSi) ) {s = 34;}

                        else if ( (LA74_29==DOLLARSi||(LA74_29>=LEFTPRAGMA && LA74_29<=DOCUMENTNODE)||LA74_29==PROCESSING_INSTRUCTION||LA74_29==DOCUMENT||LA74_29==VALIDATE||LA74_29==SCHEMAATTRIBUTE||LA74_29==LEFTXMLCOMMENT||LA74_29==TEXT||LA74_29==UNORDERED||LA74_29==LEFTPITARGET||LA74_29==COMMENT||(LA74_29>=ELEMENT && LA74_29<=LEFTPARENTHESISSi)||LA74_29==ATSi||LA74_29==ATTRIBUTE||LA74_29==NODE||LA74_29==SCHEMAELEMENT||LA74_29==CHILD||(LA74_29>=DESCENDANT && LA74_29<=DOTDOT)||(LA74_29>=IntegerLiteral && LA74_29<=DoubleLiteral)||LA74_29==StringLiteral||(LA74_29>=NCName && LA74_29<=QName)) ) {s = 31;}

                        else if ( (LA74_29==DOUBLESLASH) ) {s = 35;}

                        else if ( (LA74_29==SLASH) ) {s = 36;}

                        else if ( (LA74_29==LESSTHANSi) ) {s = 37;}

                        else if ( (LA74_29==STARSi) ) {s = 38;}

                        else if ( (LA74_29==LEFTBRACKETSi) && (synpred2())) {s = 39;}

                        else if ( (LA74_29==CAST) && (synpred2())) {s = 40;}

                        else if ( (LA74_29==CASTABLE) && (synpred2())) {s = 41;}

                        else if ( (LA74_29==TREAT) && (synpred2())) {s = 42;}

                        else if ( (LA74_29==INSTANCE) && (synpred2())) {s = 43;}

                        else if ( (LA74_29==EXCEPT||LA74_29==INTERSECT) && (synpred2())) {s = 44;}

                        else if ( (LA74_29==PIPESi||LA74_29==UNION) && (synpred2())) {s = 45;}

                        else if ( (LA74_29==IDIV||LA74_29==DIV||LA74_29==MOD) && (synpred2())) {s = 46;}

                        else if ( (LA74_29==TO) && (synpred2())) {s = 47;}

                        else if ( (LA74_29==FTCONTAINS) && (synpred2())) {s = 48;}

                        else if ( ((LA74_29>=EQ && LA74_29<=GE)) && (synpred2())) {s = 49;}

                        else if ( ((LA74_29>=BIGGERTHANSi && LA74_29<=LESSTHANOREQUALSi)||(LA74_29>=EQUALSi && LA74_29<=NOTEQUALSi)) && (synpred2())) {s = 50;}

                        else if ( ((LA74_29>=IS && LA74_29<=NODEAFTERSi)) && (synpred2())) {s = 51;}

                        else if ( (LA74_29==AND) && (synpred2())) {s = 52;}

                        else if ( (LA74_29==OR) && (synpred2())) {s = 53;}

                        else if ( (LA74_29==SEMICOLONSi) && (synpred2())) {s = 54;}

                        else if ( (LA74_29==COMMASi) && (synpred2())) {s = 55;}

                        else if ( (LA74_29==RIGHTBRACESi) && (synpred2())) {s = 56;}

                        else if ( (LA74_29==EOF) && (synpred2())) {s = 57;}

                        else if ( (LA74_29==RIGHTPARENTHESISSi) && (synpred2())) {s = 58;}

                        else if ( (LA74_29==RIGHTBRACKETSi) && (synpred2())) {s = 59;}

                        else if ( (LA74_29==WHERE) && (synpred2())) {s = 60;}

                        else if ( (LA74_29==ORDER) && (synpred2())) {s = 61;}

                        else if ( (LA74_29==STABLE) && (synpred2())) {s = 62;}

                        else if ( (LA74_29==RETURN) && (synpred2())) {s = 63;}

                        else if ( (LA74_29==FOR) && (synpred2())) {s = 64;}

                        else if ( (LA74_29==LET) && (synpred2())) {s = 65;}

                        else if ( (LA74_29==ASCENDING||LA74_29==DESCENDING) && (synpred2())) {s = 66;}

                        else if ( (LA74_29==EMPTY) && (synpred2())) {s = 67;}

                        else if ( (LA74_29==COLLATION) && (synpred2())) {s = 68;}

                        else if ( (LA74_29==SATISFIES) && (synpred2())) {s = 69;}

                        else if ( (LA74_29==DEFAULT) && (synpred2())) {s = 70;}

                        else if ( (LA74_29==CASE) && (synpred2())) {s = 71;}

                        else if ( (LA74_29==ELSE) && (synpred2())) {s = 72;}

                        else if ( (LA74_29==WITHOUT) && (synpred2())) {s = 73;}

                        else if ( (LA74_29==TIMES) && (synpred2())) {s = 74;}

                        else if ( ((LA74_29>=WORDS && LA74_29<=PARAGRAPHS)) && (synpred2())) {s = 75;}

                        else if ( (LA74_29==LEVELS) && (synpred2())) {s = 76;}

                         
                        input.seek(index74_29);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA74_142 = input.LA(1);

                         
                        int index74_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_142);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA74_201 = input.LA(1);

                         
                        int index74_201 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_201==CAST) && (synpred2())) {s = 442;}

                        else if ( (LA74_201==CASTABLE) && (synpred2())) {s = 443;}

                        else if ( (LA74_201==TREAT) && (synpred2())) {s = 444;}

                        else if ( (LA74_201==INSTANCE) && (synpred2())) {s = 445;}

                        else if ( (LA74_201==EXCEPT||LA74_201==INTERSECT) && (synpred2())) {s = 446;}

                        else if ( (LA74_201==PIPESi||LA74_201==UNION) && (synpred2())) {s = 447;}

                        else if ( (LA74_201==MINUSSi||LA74_201==PLUSSi) && (synpred2())) {s = 448;}

                        else if ( (LA74_201==TO) && (synpred2())) {s = 47;}

                        else if ( (LA74_201==FTCONTAINS) && (synpred2())) {s = 48;}

                        else if ( ((LA74_201>=EQ && LA74_201<=GE)) && (synpred2())) {s = 49;}

                        else if ( (LA74_201==LESSTHANSi) ) {s = 449;}

                        else if ( ((LA74_201>=IS && LA74_201<=NODEAFTERSi)) && (synpred2())) {s = 51;}

                        else if ( (LA74_201==AND) && (synpred2())) {s = 52;}

                        else if ( (LA74_201==OR) && (synpred2())) {s = 53;}

                        else if ( (LA74_201==SEMICOLONSi) && (synpred2())) {s = 54;}

                        else if ( (LA74_201==COMMASi) && (synpred2())) {s = 55;}

                        else if ( (LA74_201==RIGHTBRACESi) && (synpred2())) {s = 56;}

                        else if ( (LA74_201==EOF) && (synpred2())) {s = 57;}

                        else if ( (LA74_201==RIGHTPARENTHESISSi) && (synpred2())) {s = 58;}

                        else if ( (LA74_201==RIGHTBRACKETSi) && (synpred2())) {s = 59;}

                        else if ( (LA74_201==WHERE) && (synpred2())) {s = 60;}

                        else if ( (LA74_201==ORDER) && (synpred2())) {s = 61;}

                        else if ( (LA74_201==STABLE) && (synpred2())) {s = 62;}

                        else if ( (LA74_201==RETURN) && (synpred2())) {s = 63;}

                        else if ( (LA74_201==FOR) && (synpred2())) {s = 64;}

                        else if ( (LA74_201==LET) && (synpred2())) {s = 65;}

                        else if ( (LA74_201==ASCENDING||LA74_201==DESCENDING) && (synpred2())) {s = 66;}

                        else if ( (LA74_201==EMPTY) && (synpred2())) {s = 67;}

                        else if ( (LA74_201==COLLATION) && (synpred2())) {s = 68;}

                        else if ( (LA74_201==SATISFIES) && (synpred2())) {s = 69;}

                        else if ( (LA74_201==DEFAULT) && (synpred2())) {s = 70;}

                        else if ( (LA74_201==CASE) && (synpred2())) {s = 71;}

                        else if ( (LA74_201==ELSE) && (synpred2())) {s = 72;}

                        else if ( (LA74_201==WITHOUT) && (synpred2())) {s = 73;}

                        else if ( (LA74_201==TIMES) && (synpred2())) {s = 74;}

                        else if ( ((LA74_201>=WORDS && LA74_201<=PARAGRAPHS)) && (synpred2())) {s = 75;}

                        else if ( (LA74_201==LEVELS) && (synpred2())) {s = 76;}

                        else if ( (LA74_201==STARSi) ) {s = 450;}

                        else if ( ((LA74_201>=IntegerLiteral && LA74_201<=DoubleLiteral)) ) {s = 451;}

                        else if ( (LA74_201==StringLiteral) ) {s = 452;}

                        else if ( (LA74_201==DOLLARSi) ) {s = 453;}

                        else if ( (LA74_201==LEFTPARENTHESISSi) ) {s = 454;}

                        else if ( (LA74_201==DOT) ) {s = 455;}

                        else if ( (LA74_201==QName) ) {s = 456;}

                        else if ( (LA74_201==ORDERED) ) {s = 457;}

                        else if ( (LA74_201==UNORDERED) ) {s = 458;}

                        else if ( ((LA74_201>=BIGGERTHANSi && LA74_201<=LESSTHANOREQUALSi)||(LA74_201>=EQUALSi && LA74_201<=NOTEQUALSi)) && (synpred2())) {s = 50;}

                        else if ( (LA74_201==LEFTXMLCOMMENT) ) {s = 459;}

                        else if ( (LA74_201==LEFTPITARGET) ) {s = 460;}

                        else if ( (LA74_201==DOCUMENT) ) {s = 461;}

                        else if ( (LA74_201==ELEMENT) ) {s = 462;}

                        else if ( (LA74_201==ATTRIBUTE) ) {s = 463;}

                        else if ( (LA74_201==TEXT) ) {s = 464;}

                        else if ( (LA74_201==COMMENT) ) {s = 465;}

                        else if ( (LA74_201==PROCESSING_INSTRUCTION) ) {s = 466;}

                        else if ( ((LA74_201>=PARENT && LA74_201<=ANCESTOR_OR_SELF)) ) {s = 467;}

                        else if ( (LA74_201==DOTDOT) ) {s = 468;}

                        else if ( (LA74_201==CHILD||(LA74_201>=DESCENDANT && LA74_201<=FOLLOWING)) ) {s = 469;}

                        else if ( (LA74_201==ATSi) ) {s = 470;}

                        else if ( (LA74_201==DOCUMENTNODE) ) {s = 471;}

                        else if ( (LA74_201==SCHEMAELEMENT) ) {s = 472;}

                        else if ( (LA74_201==SCHEMAATTRIBUTE) ) {s = 473;}

                        else if ( (LA74_201==NODE) ) {s = 474;}

                        else if ( (LA74_201==IDIV||LA74_201==DIV||LA74_201==MOD) && (synpred2())) {s = 46;}

                        else if ( (LA74_201==NCName) ) {s = 475;}

                         
                        input.seek(index74_201);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA74_143 = input.LA(1);

                         
                        int index74_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_143);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA74_116 = input.LA(1);

                         
                        int index74_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_116);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA74_83 = input.LA(1);

                         
                        int index74_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_83);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA74_89 = input.LA(1);

                         
                        int index74_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_89);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA74_37 = input.LA(1);

                         
                        int index74_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_37==QName) ) {s = 166;}

                        else if ( (LA74_37==MINUSSi||LA74_37==PLUSSi) && (synpred2())) {s = 167;}

                        else if ( (LA74_37==VALIDATE) && (synpred2())) {s = 168;}

                        else if ( (LA74_37==DOUBLESLASH) && (synpred2())) {s = 169;}

                        else if ( (LA74_37==SLASH) && (synpred2())) {s = 170;}

                        else if ( ((LA74_37>=IntegerLiteral && LA74_37<=DoubleLiteral)) && (synpred2())) {s = 171;}

                        else if ( (LA74_37==StringLiteral) && (synpred2())) {s = 172;}

                        else if ( (LA74_37==DOLLARSi) && (synpred2())) {s = 173;}

                        else if ( (LA74_37==LEFTPARENTHESISSi) && (synpred2())) {s = 174;}

                        else if ( (LA74_37==DOT) && (synpred2())) {s = 175;}

                        else if ( (LA74_37==ORDERED) && (synpred2())) {s = 176;}

                        else if ( (LA74_37==UNORDERED) && (synpred2())) {s = 177;}

                        else if ( (LA74_37==LESSTHANSi) && (synpred2())) {s = 178;}

                        else if ( (LA74_37==LEFTXMLCOMMENT) && (synpred2())) {s = 179;}

                        else if ( (LA74_37==LEFTPITARGET) && (synpred2())) {s = 180;}

                        else if ( (LA74_37==DOCUMENT) && (synpred2())) {s = 181;}

                        else if ( (LA74_37==ELEMENT) && (synpred2())) {s = 182;}

                        else if ( (LA74_37==ATTRIBUTE) && (synpred2())) {s = 183;}

                        else if ( (LA74_37==TEXT) && (synpred2())) {s = 184;}

                        else if ( (LA74_37==COMMENT) && (synpred2())) {s = 185;}

                        else if ( (LA74_37==PROCESSING_INSTRUCTION) && (synpred2())) {s = 186;}

                        else if ( ((LA74_37>=PARENT && LA74_37<=ANCESTOR_OR_SELF)) && (synpred2())) {s = 187;}

                        else if ( (LA74_37==DOTDOT) && (synpred2())) {s = 188;}

                        else if ( (LA74_37==CHILD||(LA74_37>=DESCENDANT && LA74_37<=FOLLOWING)) && (synpred2())) {s = 189;}

                        else if ( (LA74_37==ATSi) && (synpred2())) {s = 190;}

                        else if ( (LA74_37==DOCUMENTNODE) && (synpred2())) {s = 191;}

                        else if ( (LA74_37==SCHEMAELEMENT) && (synpred2())) {s = 192;}

                        else if ( (LA74_37==SCHEMAATTRIBUTE) && (synpred2())) {s = 193;}

                        else if ( (LA74_37==NODE) && (synpred2())) {s = 194;}

                        else if ( (LA74_37==STARSi) && (synpred2())) {s = 195;}

                        else if ( (LA74_37==NCName) && (synpred2())) {s = 196;}

                        else if ( (LA74_37==LEFTPRAGMA) && (synpred2())) {s = 197;}

                         
                        input.seek(index74_37);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA74_144 = input.LA(1);

                         
                        int index74_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_144);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA74_0 = input.LA(1);

                         
                        int index74_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_0==DOUBLESLASH) && (synpred1())) {s = 1;}

                        else if ( (LA74_0==SLASH) ) {s = 2;}

                        else if ( (LA74_0==DOLLARSi||(LA74_0>=ORDERED && LA74_0<=DOCUMENTNODE)||LA74_0==LESSTHANSi||LA74_0==PROCESSING_INSTRUCTION||LA74_0==DOCUMENT||LA74_0==SCHEMAATTRIBUTE||LA74_0==STARSi||LA74_0==LEFTXMLCOMMENT||LA74_0==TEXT||LA74_0==UNORDERED||LA74_0==LEFTPITARGET||LA74_0==COMMENT||(LA74_0>=ELEMENT && LA74_0<=LEFTPARENTHESISSi)||LA74_0==ATSi||LA74_0==ATTRIBUTE||LA74_0==NODE||LA74_0==SCHEMAELEMENT||LA74_0==CHILD||(LA74_0>=DESCENDANT && LA74_0<=DOTDOT)||(LA74_0>=IntegerLiteral && LA74_0<=DoubleLiteral)||LA74_0==StringLiteral||(LA74_0>=NCName && LA74_0<=QName)) ) {s = 3;}

                         
                        input.seek(index74_0);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA74_140 = input.LA(1);

                         
                        int index74_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_140);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA74_166 = input.LA(1);

                         
                        int index74_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_166==LEFTPARENTHESISSi) && (synpred2())) {s = 368;}

                        else if ( (LA74_166==BIGGERTHANSi||LA74_166==RIGHTSELFTERMINATOR||LA74_166==S) ) {s = 31;}

                        else if ( (LA74_166==LEFTBRACKETSi) && (synpred2())) {s = 369;}

                        else if ( (LA74_166==SLASH||LA74_166==DOUBLESLASH) && (synpred2())) {s = 370;}

                        else if ( (LA74_166==CAST) && (synpred2())) {s = 371;}

                        else if ( (LA74_166==CASTABLE) && (synpred2())) {s = 372;}

                        else if ( (LA74_166==TREAT) && (synpred2())) {s = 373;}

                        else if ( (LA74_166==INSTANCE) && (synpred2())) {s = 374;}

                        else if ( (LA74_166==EXCEPT||LA74_166==INTERSECT) && (synpred2())) {s = 375;}

                        else if ( (LA74_166==PIPESi||LA74_166==UNION) && (synpred2())) {s = 376;}

                        else if ( (LA74_166==IDIV||LA74_166==DIV||LA74_166==STARSi||LA74_166==MOD) && (synpred2())) {s = 377;}

                        else if ( (LA74_166==MINUSSi||LA74_166==PLUSSi) && (synpred2())) {s = 378;}

                        else if ( (LA74_166==TO) && (synpred2())) {s = 379;}

                        else if ( (LA74_166==FTCONTAINS) && (synpred2())) {s = 380;}

                        else if ( (LA74_166==AND) && (synpred2())) {s = 52;}

                        else if ( (LA74_166==OR) && (synpred2())) {s = 53;}

                        else if ( (LA74_166==SEMICOLONSi) && (synpred2())) {s = 54;}

                        else if ( (LA74_166==COMMASi) && (synpred2())) {s = 55;}

                        else if ( (LA74_166==RIGHTBRACESi) && (synpred2())) {s = 381;}

                        else if ( (LA74_166==EOF) && (synpred2())) {s = 57;}

                        else if ( (LA74_166==RIGHTPARENTHESISSi) && (synpred2())) {s = 382;}

                        else if ( (LA74_166==RIGHTBRACKETSi) && (synpred2())) {s = 59;}

                        else if ( (LA74_166==WHERE) && (synpred2())) {s = 60;}

                        else if ( (LA74_166==ORDER) && (synpred2())) {s = 61;}

                        else if ( (LA74_166==STABLE) && (synpred2())) {s = 62;}

                        else if ( (LA74_166==RETURN) && (synpred2())) {s = 63;}

                        else if ( (LA74_166==FOR) && (synpred2())) {s = 64;}

                        else if ( (LA74_166==LET) && (synpred2())) {s = 65;}

                        else if ( (LA74_166==ASCENDING||LA74_166==DESCENDING) && (synpred2())) {s = 66;}

                        else if ( (LA74_166==EMPTY) && (synpred2())) {s = 67;}

                        else if ( (LA74_166==COLLATION) && (synpred2())) {s = 68;}

                        else if ( (LA74_166==SATISFIES) && (synpred2())) {s = 69;}

                        else if ( (LA74_166==DEFAULT) && (synpred2())) {s = 70;}

                        else if ( (LA74_166==CASE) && (synpred2())) {s = 71;}

                        else if ( (LA74_166==ELSE) && (synpred2())) {s = 72;}

                         
                        input.seek(index74_166);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA74_113 = input.LA(1);

                         
                        int index74_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_113);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA74_117 = input.LA(1);

                         
                        int index74_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_117);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA74_87 = input.LA(1);

                         
                        int index74_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_87);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA74_2 = input.LA(1);

                         
                        int index74_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA74_2>=IntegerLiteral && LA74_2<=DoubleLiteral)) && (synpred2())) {s = 4;}

                        else if ( (LA74_2==StringLiteral) && (synpred2())) {s = 5;}

                        else if ( (LA74_2==DOLLARSi) && (synpred2())) {s = 6;}

                        else if ( (LA74_2==LEFTPARENTHESISSi) && (synpred2())) {s = 7;}

                        else if ( (LA74_2==DOT) && (synpred2())) {s = 8;}

                        else if ( (LA74_2==QName) && (synpred2())) {s = 9;}

                        else if ( (LA74_2==ORDERED) && (synpred2())) {s = 10;}

                        else if ( (LA74_2==UNORDERED) && (synpred2())) {s = 11;}

                        else if ( (LA74_2==LESSTHANSi) ) {s = 12;}

                        else if ( (LA74_2==LEFTXMLCOMMENT) && (synpred2())) {s = 13;}

                        else if ( (LA74_2==LEFTPITARGET) && (synpred2())) {s = 14;}

                        else if ( (LA74_2==DOCUMENT) && (synpred2())) {s = 15;}

                        else if ( (LA74_2==ELEMENT) && (synpred2())) {s = 16;}

                        else if ( (LA74_2==ATTRIBUTE) && (synpred2())) {s = 17;}

                        else if ( (LA74_2==TEXT) && (synpred2())) {s = 18;}

                        else if ( (LA74_2==COMMENT) && (synpred2())) {s = 19;}

                        else if ( (LA74_2==PROCESSING_INSTRUCTION) && (synpred2())) {s = 20;}

                        else if ( ((LA74_2>=PARENT && LA74_2<=ANCESTOR_OR_SELF)) && (synpred2())) {s = 21;}

                        else if ( (LA74_2==DOTDOT) && (synpred2())) {s = 22;}

                        else if ( (LA74_2==CHILD||(LA74_2>=DESCENDANT && LA74_2<=FOLLOWING)) && (synpred2())) {s = 23;}

                        else if ( (LA74_2==ATSi) && (synpred2())) {s = 24;}

                        else if ( (LA74_2==DOCUMENTNODE) && (synpred2())) {s = 25;}

                        else if ( (LA74_2==SCHEMAELEMENT) && (synpred2())) {s = 26;}

                        else if ( (LA74_2==SCHEMAATTRIBUTE) && (synpred2())) {s = 27;}

                        else if ( (LA74_2==NODE) && (synpred2())) {s = 28;}

                        else if ( (LA74_2==STARSi) ) {s = 29;}

                        else if ( (LA74_2==NCName) && (synpred2())) {s = 30;}

                        else if ( (LA74_2==EOF||(LA74_2>=PIPESi && LA74_2<=WHERE)||(LA74_2>=EQUALSi && LA74_2<=NOTEQUALSi)||LA74_2==CAST||LA74_2==ELSE||LA74_2==TREAT||LA74_2==CASTABLE||(LA74_2>=FOR && LA74_2<=INSTANCE)||(LA74_2>=EXCEPT && LA74_2<=TO)||LA74_2==SATISFIES||LA74_2==SEMICOLONSi||LA74_2==EMPTY||LA74_2==CASE||LA74_2==MINUSSi||(LA74_2>=COMMASi && LA74_2<=LET)||LA74_2==RIGHTBRACKETSi||LA74_2==LEVELS||(LA74_2>=DIV && LA74_2<=PLUSSi)||LA74_2==ORDER||LA74_2==UNION||LA74_2==COLLATION||LA74_2==OR||LA74_2==DESCENDING||LA74_2==STABLE||LA74_2==WITHOUT||LA74_2==RIGHTPARENTHESISSi||LA74_2==RETURN||LA74_2==DEFAULT||LA74_2==AND||LA74_2==INTERSECT||LA74_2==TIMES||LA74_2==FTCONTAINS||(LA74_2>=MOD && LA74_2<=RIGHTBRACESi)||(LA74_2>=EQ && LA74_2<=NODEAFTERSi)||(LA74_2>=WORDS && LA74_2<=PARAGRAPHS)) ) {s = 31;}

                         
                        input.seek(index74_2);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA74_84 = input.LA(1);

                         
                        int index74_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_84);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA74_164 = input.LA(1);

                         
                        int index74_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_164);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA74_230 = input.LA(1);

                         
                        int index74_230 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 480;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_230);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA74_227 = input.LA(1);

                         
                        int index74_227 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_227==COLONSi) && (synpred2())) {s = 477;}

                        else if ( (LA74_227==MINUSSi||LA74_227==PLUSSi) ) {s = 34;}

                        else if ( (LA74_227==DOLLARSi||(LA74_227>=LEFTPRAGMA && LA74_227<=DOCUMENTNODE)||LA74_227==PROCESSING_INSTRUCTION||LA74_227==DOCUMENT||LA74_227==VALIDATE||LA74_227==SCHEMAATTRIBUTE||LA74_227==LEFTXMLCOMMENT||LA74_227==TEXT||LA74_227==UNORDERED||LA74_227==LEFTPITARGET||LA74_227==COMMENT||(LA74_227>=ELEMENT && LA74_227<=LEFTPARENTHESISSi)||LA74_227==ATSi||LA74_227==ATTRIBUTE||LA74_227==NODE||LA74_227==SCHEMAELEMENT||LA74_227==CHILD||(LA74_227>=DESCENDANT && LA74_227<=DOTDOT)||(LA74_227>=IntegerLiteral && LA74_227<=DoubleLiteral)||LA74_227==StringLiteral||(LA74_227>=NCName && LA74_227<=QName)) ) {s = 31;}

                        else if ( (LA74_227==DOUBLESLASH) ) {s = 478;}

                        else if ( (LA74_227==SLASH) ) {s = 479;}

                        else if ( (LA74_227==LESSTHANSi) ) {s = 37;}

                        else if ( (LA74_227==STARSi) ) {s = 38;}

                        else if ( (LA74_227==LEFTBRACKETSi) && (synpred2())) {s = 480;}

                        else if ( (LA74_227==CAST) && (synpred2())) {s = 442;}

                        else if ( (LA74_227==CASTABLE) && (synpred2())) {s = 443;}

                        else if ( (LA74_227==TREAT) && (synpred2())) {s = 444;}

                        else if ( (LA74_227==INSTANCE) && (synpred2())) {s = 445;}

                        else if ( (LA74_227==EXCEPT||LA74_227==INTERSECT) && (synpred2())) {s = 446;}

                        else if ( (LA74_227==PIPESi||LA74_227==UNION) && (synpred2())) {s = 447;}

                        else if ( (LA74_227==TO) && (synpred2())) {s = 47;}

                        else if ( (LA74_227==FTCONTAINS) && (synpred2())) {s = 48;}

                        else if ( ((LA74_227>=EQ && LA74_227<=GE)) && (synpred2())) {s = 49;}

                        else if ( ((LA74_227>=BIGGERTHANSi && LA74_227<=LESSTHANOREQUALSi)||(LA74_227>=EQUALSi && LA74_227<=NOTEQUALSi)) && (synpred2())) {s = 50;}

                        else if ( ((LA74_227>=IS && LA74_227<=NODEAFTERSi)) && (synpred2())) {s = 51;}

                        else if ( (LA74_227==AND) && (synpred2())) {s = 52;}

                        else if ( (LA74_227==OR) && (synpred2())) {s = 53;}

                        else if ( (LA74_227==SEMICOLONSi) && (synpred2())) {s = 54;}

                        else if ( (LA74_227==COMMASi) && (synpred2())) {s = 55;}

                        else if ( (LA74_227==RIGHTBRACESi) && (synpred2())) {s = 56;}

                        else if ( (LA74_227==EOF) && (synpred2())) {s = 57;}

                        else if ( (LA74_227==RIGHTPARENTHESISSi) && (synpred2())) {s = 58;}

                        else if ( (LA74_227==RIGHTBRACKETSi) && (synpred2())) {s = 59;}

                        else if ( (LA74_227==WHERE) && (synpred2())) {s = 60;}

                        else if ( (LA74_227==ORDER) && (synpred2())) {s = 61;}

                        else if ( (LA74_227==STABLE) && (synpred2())) {s = 62;}

                        else if ( (LA74_227==RETURN) && (synpred2())) {s = 63;}

                        else if ( (LA74_227==FOR) && (synpred2())) {s = 64;}

                        else if ( (LA74_227==LET) && (synpred2())) {s = 65;}

                        else if ( (LA74_227==ASCENDING||LA74_227==DESCENDING) && (synpred2())) {s = 66;}

                        else if ( (LA74_227==EMPTY) && (synpred2())) {s = 67;}

                        else if ( (LA74_227==COLLATION) && (synpred2())) {s = 68;}

                        else if ( (LA74_227==SATISFIES) && (synpred2())) {s = 69;}

                        else if ( (LA74_227==DEFAULT) && (synpred2())) {s = 70;}

                        else if ( (LA74_227==CASE) && (synpred2())) {s = 71;}

                        else if ( (LA74_227==ELSE) && (synpred2())) {s = 72;}

                        else if ( (LA74_227==WITHOUT) && (synpred2())) {s = 73;}

                        else if ( (LA74_227==TIMES) && (synpred2())) {s = 74;}

                        else if ( ((LA74_227>=WORDS && LA74_227<=PARAGRAPHS)) && (synpred2())) {s = 75;}

                        else if ( (LA74_227==LEVELS) && (synpred2())) {s = 76;}

                        else if ( (LA74_227==IDIV||LA74_227==DIV||LA74_227==MOD) && (synpred2())) {s = 46;}

                         
                        input.seek(index74_227);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA74_112 = input.LA(1);

                         
                        int index74_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_112);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA74_139 = input.LA(1);

                         
                        int index74_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_139);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA74_38 = input.LA(1);

                         
                        int index74_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA74_38==EOF||(LA74_38>=PIPESi && LA74_38<=WHERE)||(LA74_38>=EQUALSi && LA74_38<=NOTEQUALSi)||LA74_38==CAST||LA74_38==ELSE||LA74_38==TREAT||LA74_38==CASTABLE||(LA74_38>=FOR && LA74_38<=INSTANCE)||(LA74_38>=EXCEPT && LA74_38<=TO)||(LA74_38>=SATISFIES && LA74_38<=SEMICOLONSi)||LA74_38==EMPTY||LA74_38==CASE||(LA74_38>=COMMASi && LA74_38<=LET)||LA74_38==RIGHTBRACKETSi||LA74_38==LEVELS||LA74_38==DIV||LA74_38==ORDER||LA74_38==UNION||LA74_38==COLLATION||LA74_38==OR||LA74_38==DESCENDING||(LA74_38>=STABLE && LA74_38<=LEFTBRACKETSi)||LA74_38==WITHOUT||LA74_38==RIGHTPARENTHESISSi||LA74_38==RETURN||LA74_38==DEFAULT||LA74_38==AND||LA74_38==INTERSECT||LA74_38==TIMES||LA74_38==FTCONTAINS||(LA74_38>=MOD && LA74_38<=RIGHTBRACESi)||(LA74_38>=EQ && LA74_38<=NODEAFTERSi)||(LA74_38>=WORDS && LA74_38<=PARAGRAPHS)) ) {s = 31;}

                        else if ( (LA74_38==MINUSSi||LA74_38==PLUSSi) ) {s = 198;}

                        else if ( (LA74_38==VALIDATE) && (synpred2())) {s = 199;}

                        else if ( (LA74_38==DOUBLESLASH) ) {s = 200;}

                        else if ( (LA74_38==SLASH) ) {s = 201;}

                        else if ( ((LA74_38>=IntegerLiteral && LA74_38<=DoubleLiteral)) && (synpred2())) {s = 202;}

                        else if ( (LA74_38==StringLiteral) && (synpred2())) {s = 203;}

                        else if ( (LA74_38==DOLLARSi) && (synpred2())) {s = 204;}

                        else if ( (LA74_38==LEFTPARENTHESISSi) && (synpred2())) {s = 205;}

                        else if ( (LA74_38==DOT) && (synpred2())) {s = 206;}

                        else if ( (LA74_38==QName) && (synpred2())) {s = 207;}

                        else if ( (LA74_38==ORDERED) && (synpred2())) {s = 208;}

                        else if ( (LA74_38==UNORDERED) && (synpred2())) {s = 209;}

                        else if ( (LA74_38==LESSTHANSi) ) {s = 210;}

                        else if ( (LA74_38==LEFTXMLCOMMENT) && (synpred2())) {s = 211;}

                        else if ( (LA74_38==LEFTPITARGET) && (synpred2())) {s = 212;}

                        else if ( (LA74_38==DOCUMENT) && (synpred2())) {s = 213;}

                        else if ( (LA74_38==ELEMENT) && (synpred2())) {s = 214;}

                        else if ( (LA74_38==ATTRIBUTE) && (synpred2())) {s = 215;}

                        else if ( (LA74_38==TEXT) && (synpred2())) {s = 216;}

                        else if ( (LA74_38==COMMENT) && (synpred2())) {s = 217;}

                        else if ( (LA74_38==PROCESSING_INSTRUCTION) && (synpred2())) {s = 218;}

                        else if ( ((LA74_38>=PARENT && LA74_38<=ANCESTOR_OR_SELF)) && (synpred2())) {s = 219;}

                        else if ( (LA74_38==DOTDOT) && (synpred2())) {s = 220;}

                        else if ( (LA74_38==CHILD||(LA74_38>=DESCENDANT && LA74_38<=FOLLOWING)) && (synpred2())) {s = 221;}

                        else if ( (LA74_38==ATSi) && (synpred2())) {s = 222;}

                        else if ( (LA74_38==DOCUMENTNODE) && (synpred2())) {s = 223;}

                        else if ( (LA74_38==SCHEMAELEMENT) && (synpred2())) {s = 224;}

                        else if ( (LA74_38==SCHEMAATTRIBUTE) && (synpred2())) {s = 225;}

                        else if ( (LA74_38==NODE) && (synpred2())) {s = 226;}

                        else if ( (LA74_38==STARSi) ) {s = 227;}

                        else if ( (LA74_38==NCName) && (synpred2())) {s = 228;}

                        else if ( (LA74_38==LEFTPRAGMA) && (synpred2())) {s = 229;}

                         
                        input.seek(index74_38);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA74_115 = input.LA(1);

                         
                        int index74_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_115);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA74_137 = input.LA(1);

                         
                        int index74_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_137);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA74_85 = input.LA(1);

                         
                        int index74_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_85);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA74_109 = input.LA(1);

                         
                        int index74_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_109);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA74_102 = input.LA(1);

                         
                        int index74_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2()) ) {s = 229;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index74_102);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 74, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA116_eotS =
        "\u01bf\uffff";
    static final String DFA116_eofS =
        "\13\uffff\1\30\13\uffff\1\77\1\uffff\1\77\3\uffff\1\30\2\uffff\1"+
        "\30\2\uffff\1\30\3\uffff\5\30\2\uffff\1\30\50\uffff\1\30\6\uffff"+
        "\2\30\40\uffff\1\77\42\uffff\1\77\31\uffff\1\77\3\uffff\3\77\u00fb"+
        "\uffff";
    static final String DFA116_minS =
        "\1\33\12\177\1\4\1\uffff\1\164\2\144\2\u00d8\5\164\1\4\1\uffff\1"+
        "\4\1\uffff\2\177\1\4\2\105\1\4\2\105\1\4\3\164\5\4\2\25\1\4\50\uffff"+
        "\1\4\1\0\1\25\1\144\3\u00d8\2\4\1\25\1\16\1\25\3\0\1\u00d8\3\0\2"+
        "\16\1\u00d8\1\74\1\u00d6\6\16\1\u00a6\1\0\1\u00a6\1\33\4\177\1\0"+
        "\1\63\1\u00d8\1\4\37\uffff\1\25\1\uffff\1\25\1\4\10\uffff\1\25\20"+
        "\uffff\1\4\2\uffff\1\25\3\4\2\105\4\164\1\0\1\16\101\0\21\uffff"+
        "\73\0\7\uffff\1\0\1\uffff\33\0\1\uffff\2\0\1\uffff\76\0";
    static final String DFA116_maxS =
        "\1\u00d8\12\177\1\u00b5\1\uffff\1\u0098\4\u00d8\1\u00d7\4\164\1"+
        "\u00d8\1\uffff\1\u00d8\1\uffff\2\177\1\u00b5\2\164\1\u00b5\2\164"+
        "\1\u00b5\3\164\5\u00b5\3\u00d8\50\uffff\1\u00d8\1\0\5\u00d8\2\u00b5"+
        "\1\u00d8\1\u00a4\1\u00d8\3\0\1\u00d8\3\0\2\16\1\u00d8\1\u00dd\1"+
        "\u00d6\1\16\2\u00d8\2\177\1\u00d7\1\u00a6\1\0\1\u00a6\1\u00d8\4"+
        "\177\1\0\1\63\2\u00db\37\uffff\1\u00d8\1\uffff\2\u00d8\10\uffff"+
        "\1\u00d8\20\uffff\1\u00d8\2\uffff\3\u00d8\1\u00db\4\164\1\u0094"+
        "\1\164\1\0\1\16\101\0\21\uffff\73\0\7\uffff\1\0\1\uffff\33\0\1\uffff"+
        "\2\0\1\uffff\76\0";
    static final String DFA116_acceptS =
        "\14\uffff\1\3\13\uffff\1\2\1\uffff\1\1\24\uffff\50\1\52\uffff\37"+
        "\1\1\uffff\1\1\2\uffff\10\1\1\uffff\20\1\1\uffff\2\1\115\uffff\21"+
        "\1\73\uffff\7\1\1\uffff\1\1\33\uffff\1\1\2\uffff\1\1\76\uffff";
    static final String DFA116_specialS =
        "\13\uffff\1\17\13\uffff\1\31\1\uffff\1\0\3\uffff\1\20\2\uffff\1"+
        "\40\2\uffff\1\35\3\uffff\1\26\1\24\1\25\1\21\1\12\1\uffff\1\3\1"+
        "\6\50\uffff\1\10\1\15\1\4\4\uffff\1\34\1\36\3\uffff\1\13\1\5\1\11"+
        "\1\uffff\1\37\1\16\1\33\14\uffff\1\7\6\uffff\1\32\2\uffff\1\27\42"+
        "\uffff\1\22\31\uffff\1\1\3\uffff\1\23\1\2\1\30\6\uffff\1\14\u00f4"+
        "\uffff}>";
    static final String[] DFA116_transitionS = {
            "\1\1\15\uffff\1\12\20\uffff\1\6\6\uffff\1\14\23\uffff\1\5\23"+
            "\uffff\1\10\16\uffff\1\7\5\uffff\1\2\14\uffff\1\3\6\uffff\1"+
            "\11\5\uffff\1\4\77\uffff\1\13",
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
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "",
            "\1\35\11\uffff\1\33\31\uffff\1\34",
            "\1\37\17\uffff\1\40\143\uffff\1\36",
            "\1\42\17\uffff\1\43\143\uffff\1\41",
            "\1\44",
            "\1\45",
            "\1\47\126\uffff\1\46\13\uffff\1\46",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\63\3\70\1\107\1\64\1\102\3\uffff\1\57\2\70\4\uffff\1\30\3"+
            "\uffff\3\30\1\115\1\55\6\uffff\1\30\5\uffff\1\105\1\122\1\uffff"+
            "\1\62\1\65\3\uffff\1\112\1\uffff\1\74\2\uffff\1\110\1\uffff"+
            "\1\114\1\30\1\uffff\1\54\1\uffff\1\30\1\uffff\1\30\4\uffff\1"+
            "\75\1\106\1\uffff\1\125\3\uffff\1\101\1\uffff\1\121\2\uffff"+
            "\1\64\1\54\1\uffff\1\124\1\30\1\103\1\uffff\1\63\1\uffff\1\111"+
            "\2\uffff\1\73\1\uffff\1\30\3\uffff\1\107\1\56\2\uffff\1\30\1"+
            "\uffff\1\30\1\104\1\uffff\1\30\3\uffff\1\30\1\116\1\uffff\1"+
            "\60\1\100\2\uffff\1\61\1\30\1\113\4\uffff\2\30\3\uffff\1\72"+
            "\3\uffff\1\62\1\uffff\1\30\1\117\1\30\1\123\1\66\2\uffff\1\64"+
            "\1\76\1\30\4\uffff\1\126\1\30\1\uffff\6\67\3\71\2\uffff\1\30"+
            "\1\uffff\14\30\3\120\16\uffff\3\30\4\uffff\1\30\13\uffff\2\30",
            "",
            "\1\63\3\70\1\107\1\64\1\102\3\uffff\1\57\2\70\4\uffff\1\30\3"+
            "\uffff\3\30\1\115\1\131\6\uffff\1\30\5\uffff\1\105\1\122\1\uffff"+
            "\1\62\1\65\3\uffff\1\112\1\uffff\1\74\2\uffff\1\110\1\uffff"+
            "\1\114\1\30\1\uffff\1\130\1\uffff\1\30\1\uffff\1\30\4\uffff"+
            "\1\75\1\106\1\uffff\1\125\3\uffff\1\101\1\uffff\1\121\2\uffff"+
            "\1\64\1\130\1\uffff\1\124\1\30\1\103\1\uffff\1\63\1\uffff\1"+
            "\111\2\uffff\1\73\1\uffff\1\30\3\uffff\1\107\1\127\2\uffff\1"+
            "\30\1\uffff\1\30\1\104\1\uffff\1\30\3\uffff\1\30\1\116\1\uffff"+
            "\1\60\1\100\2\uffff\1\61\1\30\1\113\4\uffff\2\30\3\uffff\1\72"+
            "\3\uffff\1\62\1\uffff\1\30\1\117\1\30\1\123\1\66\2\uffff\1\64"+
            "\1\76\1\30\4\uffff\1\126\1\30\1\uffff\6\67\3\71\2\uffff\1\30"+
            "\1\uffff\14\30\3\120\16\uffff\3\30\4\uffff\1\30\13\uffff\2\30",
            "",
            "\1\132",
            "\1\133",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\1\134\56\uffff\1\40",
            "\1\134\56\uffff\1\40",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\1\135\56\uffff\1\43",
            "\1\135\56\uffff\1\43",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\1\136",
            "\1\137",
            "\1\47",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\1\146\3\uffff\1\177\1\152\1\171\1\uffff\1\154\6\uffff\1\143"+
            "\25\uffff\1\164\1\uffff\1\140\1\uffff\1\157\1\uffff\1\141\21"+
            "\uffff\1\140\2\uffff\1\173\11\uffff\1\142\4\uffff\1\175\2\uffff"+
            "\1\155\1\uffff\1\162\2\uffff\1\153\3\uffff\1\156\7\uffff\1\163"+
            "\5\uffff\1\160\1\147\11\uffff\1\170\1\uffff\1\161\6\uffff\1"+
            "\174\5\uffff\1\172\14\uffff\1\167\1\uffff\5\167\5\165\1\150"+
            "\1\166\21\uffff\3\144\4\uffff\1\145\13\uffff\1\176\1\151",
            "\1\u0087\3\uffff\1\u009f\1\u008a\1\u0099\1\uffff\1\u008c\6\uffff"+
            "\1\u0084\25\uffff\1\u0094\1\uffff\1\u0081\1\uffff\1\u008f\1"+
            "\uffff\1\u0082\21\uffff\1\u0081\2\uffff\1\u009b\11\uffff\1\u0083"+
            "\4\uffff\1\u009d\2\uffff\1\u008d\1\uffff\1\u0092\2\uffff\1\u008b"+
            "\3\uffff\1\u008e\7\uffff\1\u0093\5\uffff\1\u0090\1\u0088\11"+
            "\uffff\1\u0098\1\uffff\1\u0091\6\uffff\1\u009c\5\uffff\1\u009a"+
            "\14\uffff\1\u0097\1\uffff\5\u0097\5\u0095\1\u0089\1\u0096\21"+
            "\uffff\3\u0085\4\uffff\1\u0086\13\uffff\1\u009e\1\u0080",
            "\7\30\4\uffff\2\30\4\uffff\1\u00a6\1\uffff\1\30\1\uffff\1\u00bf"+
            "\1\u00aa\1\u00b9\1\30\1\u00ac\1\30\5\uffff\1\u00a3\3\uffff\1"+
            "\30\1\uffff\2\30\1\uffff\2\30\3\uffff\3\30\2\uffff\1\30\1\uffff"+
            "\1\30\1\u00b4\1\uffff\1\u00a0\1\uffff\1\u00af\1\uffff\1\u00a1"+
            "\4\uffff\2\30\5\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\u00a0"+
            "\2\uffff\1\u00bb\1\30\1\uffff\1\30\1\uffff\1\30\2\uffff\1\30"+
            "\1\uffff\1\u00a2\3\uffff\1\30\1\u00bd\2\uffff\1\u00ad\1\uffff"+
            "\1\u00b2\2\30\1\u00ab\3\uffff\1\u00ae\1\30\2\uffff\1\30\2\uffff"+
            "\1\30\1\u00b3\1\30\4\uffff\1\u00b0\1\u00a7\3\uffff\1\30\3\uffff"+
            "\1\30\1\uffff\1\u00b8\1\30\1\u00b1\1\uffff\1\30\2\uffff\2\30"+
            "\1\u00bc\5\uffff\1\u00ba\1\uffff\11\30\2\uffff\1\u00b7\1\uffff"+
            "\5\u00b7\5\u00b5\1\u00a8\1\u00b6\3\30\16\uffff\3\u00a4\4\uffff"+
            "\1\u00a5\13\uffff\1\u00be\1\u00a9",
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
            "\7\30\4\uffff\2\30\4\uffff\1\u00a6\1\uffff\1\30\1\uffff\1\u00bf"+
            "\1\u00aa\1\u00b9\1\30\1\u00ac\1\30\5\uffff\1\u00c1\3\uffff\1"+
            "\30\1\uffff\2\30\1\uffff\2\30\3\uffff\3\30\2\uffff\1\30\1\uffff"+
            "\1\30\1\u00b4\1\uffff\1\u00a0\1\uffff\1\u00af\1\uffff\1\u00a1"+
            "\4\uffff\2\30\5\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\u00a0"+
            "\2\uffff\1\u00bb\1\30\1\uffff\1\30\1\uffff\1\30\2\uffff\1\30"+
            "\1\uffff\1\u00c0\3\uffff\1\30\1\u00c2\2\uffff\1\u00ad\1\uffff"+
            "\1\u00b2\2\30\1\u00ab\3\uffff\1\u00ae\1\30\2\uffff\1\30\2\uffff"+
            "\1\30\1\u00b3\1\30\4\uffff\1\u00b0\1\u00a7\3\uffff\1\30\3\uffff"+
            "\1\30\1\uffff\1\u00b8\1\30\1\u00b1\1\uffff\1\30\2\uffff\2\30"+
            "\1\u00bc\5\uffff\1\u00ba\1\uffff\11\30\2\uffff\1\u00b7\1\uffff"+
            "\5\u00b7\5\u00b5\1\u00a8\1\u00b6\3\30\16\uffff\3\u00a4\4\uffff"+
            "\1\u00a5\13\uffff\1\u00be\1\u00a9",
            "\1\uffff",
            "\1\u0087\3\uffff\1\u009f\1\u008a\1\u0099\1\uffff\1\u008c\6\uffff"+
            "\1\u0084\25\uffff\1\u0094\1\uffff\1\u0081\1\uffff\1\u008f\1"+
            "\uffff\1\u0082\21\uffff\1\u0081\2\uffff\1\u009b\11\uffff\1\u0083"+
            "\4\uffff\1\u009d\2\uffff\1\u008d\1\uffff\1\u0092\2\uffff\1\u008b"+
            "\3\uffff\1\u008e\7\uffff\1\u0093\5\uffff\1\u0090\1\u0088\11"+
            "\uffff\1\u0098\1\uffff\1\u0091\6\uffff\1\u009c\5\uffff\1\u009a"+
            "\14\uffff\1\u0097\1\uffff\5\u0097\5\u0095\1\u0089\1\u0096\21"+
            "\uffff\3\u0085\4\uffff\1\u0086\13\uffff\1\u009e\1\u00c3",
            "\1\u00c5\17\uffff\1\u00c6\143\uffff\1\u00c4",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\7\30\3\uffff\3\30\13\uffff\2\30\14\uffff\2\30\1\uffff\2\30"+
            "\3\uffff\1\30\1\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2\uffff"+
            "\1\30\10\uffff\2\30\1\uffff\1\30\3\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\1\31\1\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff"+
            "\1\30\2\uffff\1\30\5\uffff\1\30\1\27\5\uffff\1\30\6\uffff\1"+
            "\30\1\uffff\2\30\2\uffff\1\30\1\uffff\1\30\11\uffff\1\30\3\uffff"+
            "\1\30\2\uffff\1\30\1\uffff\2\30\2\uffff\2\30\2\uffff\1\32\2"+
            "\uffff\1\30\2\uffff\11\30\20\uffff\3\30",
            "\1\146\3\uffff\1\177\1\152\1\171\1\uffff\1\154\6\uffff\1\143"+
            "\25\uffff\1\164\1\uffff\1\140\1\uffff\1\157\1\uffff\1\141\21"+
            "\uffff\1\140\2\uffff\1\173\11\uffff\1\142\4\uffff\1\175\2\uffff"+
            "\1\155\1\uffff\1\162\2\uffff\1\153\3\uffff\1\156\7\uffff\1\163"+
            "\5\uffff\1\160\1\u00ca\11\uffff\1\170\1\uffff\1\161\6\uffff"+
            "\1\174\5\uffff\1\172\14\uffff\1\167\1\uffff\5\167\5\165\1\150"+
            "\1\166\21\uffff\3\144\4\uffff\1\145\13\uffff\1\176\1\151",
            "\1\u00cc\u0094\uffff\2\u00cb",
            "\1\u00cf\4\uffff\1\u00d3\1\u00e2\1\uffff\1\u00d5\34\uffff\1"+
            "\u00dd\3\uffff\1\u00d8\26\uffff\1\u00e4\16\uffff\1\u00e6\2\uffff"+
            "\1\u00d6\1\uffff\1\u00db\2\uffff\1\u00d4\3\uffff\1\u00d7\7\uffff"+
            "\1\u00dc\5\uffff\1\u00d9\1\u00d0\11\uffff\1\u00e1\1\uffff\1"+
            "\u00da\6\uffff\1\u00e5\5\uffff\1\u00e3\14\uffff\1\u00e0\1\uffff"+
            "\5\u00e0\5\u00de\1\u00d1\1\u00df\21\uffff\3\u00cd\4\uffff\1"+
            "\u00ce\13\uffff\1\u00e7\1\u00d2",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00e8",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ed\70\uffff\1\u00ee\147\uffff\1\u00ec",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f3\160\uffff\1\u00f1\130\uffff\1\u00f2",
            "\1\u00f7\160\uffff\1\u00f5\46\uffff\1\u00f4\61\uffff\1\u00f6",
            "\1\u00f8\160\uffff\1\u00f9",
            "\1\u00fa\160\uffff\1\u00fb",
            "\1\u00fe\160\uffff\1\u00fc\127\uffff\1\u00fd",
            "\1\u00ff",
            "\1\uffff",
            "\1\u00f4",
            "\1\171\36\uffff\1\u0102\32\uffff\1\173\16\uffff\1\175\4\uffff"+
            "\1\u0104\16\uffff\1\u0103\5\uffff\1\u0100\14\uffff\1\u0101\6"+
            "\uffff\1\174\5\uffff\1\172\76\uffff\1\176\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\uffff",
            "\1\u010a",
            "\1\u010c\2\uffff\1\u010b",
            "\1\u0115\1\30\2\uffff\1\107\1\u0116\1\102\14\uffff\1\u0110\4"+
            "\uffff\1\115\1\uffff\1\u0112\5\uffff\1\u010f\3\uffff\1\u0111"+
            "\1\uffff\1\105\1\u0113\1\uffff\1\u0114\1\u0118\3\uffff\1\112"+
            "\1\uffff\1\74\2\uffff\1\110\1\uffff\1\114\2\uffff\1\u0117\1"+
            "\30\7\uffff\1\u011a\1\106\5\uffff\1\101\4\uffff\1\u0116\1\u0117"+
            "\3\uffff\1\103\1\uffff\1\u0115\1\uffff\1\111\2\uffff\1\73\1"+
            "\uffff\1\u010f\3\uffff\1\107\1\u0116\5\uffff\1\104\1\u010e\10"+
            "\uffff\1\u011c\2\uffff\1\u011d\1\uffff\1\113\5\uffff\1\u010d"+
            "\3\uffff\1\72\3\uffff\1\u0114\5\uffff\1\u0119\2\uffff\1\u0116"+
            "\1\u011b\111\uffff\1\30",
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
            "\1\u0124\3\uffff\1\u013d\1\u0128\1\u0137\1\uffff\1\u012a\6\uffff"+
            "\1\u0121\25\uffff\1\u0132\1\uffff\1\u011e\1\uffff\1\u012d\1"+
            "\uffff\1\u011f\21\uffff\1\u011e\2\uffff\1\u0139\11\uffff\1\u0120"+
            "\4\uffff\1\u013b\2\uffff\1\u012b\1\uffff\1\u0130\2\uffff\1\u0129"+
            "\3\uffff\1\u012c\7\uffff\1\u0131\5\uffff\1\u012e\1\u0125\11"+
            "\uffff\1\u0136\1\uffff\1\u012f\6\uffff\1\u013a\5\uffff\1\u0138"+
            "\14\uffff\1\u0135\1\uffff\5\u0135\5\u0133\1\u0126\1\u0134\21"+
            "\uffff\3\u0122\4\uffff\1\u0123\13\uffff\1\u013c\1\u0127",
            "",
            "\1\u0140\4\uffff\1\u0144\1\u0153\1\uffff\1\u0146\34\uffff\1"+
            "\u014e\3\uffff\1\u0149\26\uffff\1\u0155\16\uffff\1\u0157\2\uffff"+
            "\1\u0147\1\uffff\1\u014c\2\uffff\1\u0145\3\uffff\1\u0148\7\uffff"+
            "\1\u014d\5\uffff\1\u014a\1\u0141\11\uffff\1\u0152\1\uffff\1"+
            "\u014b\6\uffff\1\u0156\5\uffff\1\u0154\14\uffff\1\u0151\1\uffff"+
            "\5\u0151\5\u014f\1\u0142\1\u0150\21\uffff\3\u013e\4\uffff\1"+
            "\u013f\13\uffff\1\u0158\1\u0143",
            "\1\u015e\3\70\1\107\1\64\1\102\4\uffff\2\70\4\uffff\1\u0165"+
            "\1\uffff\1\u0159\2\uffff\1\u0169\1\u0177\1\115\1\u0160\1\u015b"+
            "\11\uffff\1\u015a\1\uffff\1\105\1\u015c\1\uffff\1\u015d\1\65"+
            "\3\uffff\1\112\1\uffff\1\74\2\uffff\1\110\1\uffff\1\114\1\u0172"+
            "\1\uffff\1\u015f\1\uffff\1\u016d\6\uffff\1\u011a\1\106\5\uffff"+
            "\1\101\1\uffff\1\121\2\uffff\1\64\1\u015f\2\uffff\1\u0179\1"+
            "\103\1\uffff\1\u015e\1\uffff\1\111\2\uffff\1\73\5\uffff\1\107"+
            "\1\u0162\2\uffff\1\u016b\1\uffff\1\u0170\1\104\1\uffff\1\u016a"+
            "\3\uffff\1\u016c\1\116\2\uffff\1\u0161\2\uffff\1\u011d\1\u0171"+
            "\1\113\4\uffff\1\u016e\1\u0166\3\uffff\1\72\3\uffff\1\u015d"+
            "\1\uffff\1\u0176\1\117\1\u016f\1\uffff\1\66\2\uffff\1\64\1\76"+
            "\1\u017a\5\uffff\1\u0178\1\uffff\6\67\3\71\2\uffff\1\u0175\1"+
            "\uffff\5\u0175\5\u0173\1\u0167\1\u0174\3\120\16\uffff\3\u0163"+
            "\4\uffff\1\u0164\13\uffff\1\u017b\1\u0168",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\3\uffff\3\30\1\uffff\1\30\6\uffff\1\30\25\uffff\1\30\1"+
            "\uffff\1\30\1\uffff\1\30\1\uffff\1\30\21\uffff\1\30\2\uffff"+
            "\1\30\11\uffff\1\30\4\uffff\1\30\2\uffff\1\30\1\uffff\1\30\2"+
            "\uffff\1\30\3\uffff\1\30\7\uffff\1\30\5\uffff\2\30\11\uffff"+
            "\1\30\1\uffff\1\30\6\uffff\1\30\5\uffff\1\30\14\uffff\1\30\1"+
            "\uffff\14\30\21\uffff\3\30\4\uffff\1\30\13\uffff\1\30\1\u017c",
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
            "\1\u015e\3\70\1\107\1\64\1\102\4\uffff\2\70\4\uffff\1\30\1\uffff"+
            "\1\u0159\1\uffff\3\30\1\115\1\55\1\u015b\5\uffff\1\u017f\3\uffff"+
            "\1\u015a\1\uffff\1\105\1\u015c\1\uffff\1\u015d\1\65\3\uffff"+
            "\1\112\1\u017d\1\74\2\uffff\1\110\1\uffff\1\114\1\30\1\uffff"+
            "\1\54\1\uffff\1\30\1\uffff\1\30\4\uffff\1\u011a\1\106\5\uffff"+
            "\1\101\1\uffff\1\121\2\uffff\1\64\1\54\2\uffff\1\30\1\103\1"+
            "\uffff\1\u015e\1\uffff\1\111\2\uffff\1\73\1\uffff\1\u017e\3"+
            "\uffff\1\107\1\56\2\uffff\1\30\1\uffff\1\30\1\104\1\u0180\1"+
            "\30\3\uffff\1\30\1\116\2\uffff\1\u0161\2\uffff\1\u011d\1\30"+
            "\1\113\4\uffff\2\30\3\uffff\1\72\3\uffff\1\u015d\1\uffff\1\30"+
            "\1\117\1\30\1\uffff\1\66\2\uffff\1\64\1\76\1\30\5\uffff\1\30"+
            "\1\uffff\6\67\3\71\2\uffff\1\30\1\uffff\14\30\3\120\16\uffff"+
            "\3\30\4\uffff\1\30\13\uffff\2\30",
            "",
            "",
            "\1\u0183\4\uffff\1\u0187\1\u0196\1\uffff\1\u0189\34\uffff\1"+
            "\u0191\3\uffff\1\u018c\26\uffff\1\u0198\16\uffff\1\u019a\2\uffff"+
            "\1\u018a\1\uffff\1\u018f\2\uffff\1\u0188\3\uffff\1\u018b\7\uffff"+
            "\1\u0190\5\uffff\1\u018d\1\u0184\11\uffff\1\u0195\1\uffff\1"+
            "\u018e\6\uffff\1\u0199\5\uffff\1\u0197\14\uffff\1\u0194\1\uffff"+
            "\5\u0194\5\u0192\1\u0185\1\u0193\21\uffff\3\u0181\4\uffff\1"+
            "\u0182\13\uffff\1\u019b\1\u0186",
            "\1\u015e\3\70\1\107\1\64\1\102\4\uffff\2\70\4\uffff\1\u01a0"+
            "\1\uffff\1\u0159\2\uffff\1\u01a4\1\u01b2\1\115\1\u019c\1\u015b"+
            "\11\uffff\1\u015a\1\uffff\1\105\1\u015c\1\uffff\1\u015d\1\65"+
            "\3\uffff\1\112\1\uffff\1\74\2\uffff\1\110\1\uffff\1\114\1\u01ad"+
            "\1\uffff\1\u015f\1\uffff\1\u01a8\6\uffff\1\u011a\1\106\5\uffff"+
            "\1\101\1\uffff\1\121\2\uffff\1\64\1\u015f\2\uffff\1\u01b4\1"+
            "\103\1\uffff\1\u015e\1\uffff\1\111\2\uffff\1\73\5\uffff\1\107"+
            "\1\u019d\2\uffff\1\u01a6\1\uffff\1\u01ab\1\104\1\uffff\1\u01a5"+
            "\3\uffff\1\u01a7\1\116\2\uffff\1\u0161\2\uffff\1\u011d\1\u01ac"+
            "\1\113\4\uffff\1\u01a9\1\u01a1\3\uffff\1\72\3\uffff\1\u015d"+
            "\1\uffff\1\u01b1\1\117\1\u01aa\1\uffff\1\66\2\uffff\1\64\1\76"+
            "\1\u01b5\5\uffff\1\u01b3\1\uffff\6\67\3\71\2\uffff\1\u01b0\1"+
            "\uffff\5\u01b0\5\u01ae\1\u01a2\1\u01af\3\120\16\uffff\3\u019e"+
            "\4\uffff\1\u019f\13\uffff\1\u01b6\1\u01a3",
            "\1\u015e\3\70\1\107\1\64\1\102\4\uffff\2\70\4\uffff\1\30\1\uffff"+
            "\1\u0159\1\uffff\3\30\1\115\1\u01b9\1\u015b\5\uffff\1\u01bb"+
            "\3\uffff\1\u015a\1\uffff\1\105\1\u015c\1\uffff\1\u015d\1\65"+
            "\3\uffff\1\112\1\u017d\1\74\2\uffff\1\110\1\uffff\1\114\1\30"+
            "\1\uffff\1\u01b8\1\uffff\1\30\1\uffff\1\30\4\uffff\1\u011a\1"+
            "\106\5\uffff\1\101\1\uffff\1\121\2\uffff\1\64\1\u01b8\2\uffff"+
            "\1\30\1\103\1\uffff\1\u015e\1\uffff\1\111\2\uffff\1\73\1\uffff"+
            "\1\u01b7\3\uffff\1\107\1\u01ba\2\uffff\1\30\1\uffff\1\30\1\104"+
            "\1\u0180\1\30\3\uffff\1\30\1\116\2\uffff\1\u0161\2\uffff\1\u011d"+
            "\1\30\1\113\4\uffff\2\30\3\uffff\1\72\3\uffff\1\u015d\1\uffff"+
            "\1\30\1\117\1\30\1\uffff\1\66\2\uffff\1\64\1\76\1\30\5\uffff"+
            "\1\30\1\uffff\6\67\3\71\2\uffff\1\30\1\uffff\14\30\3\120\16"+
            "\uffff\3\30\4\uffff\1\30\13\uffff\2\30",
            "\1\u0115\1\30\2\uffff\1\107\1\u0116\1\102\14\uffff\1\u0110\4"+
            "\uffff\1\115\1\uffff\1\u0112\5\uffff\1\u010f\3\uffff\1\u0111"+
            "\1\uffff\1\105\1\u0113\1\uffff\1\u0114\1\u0118\3\uffff\1\112"+
            "\1\uffff\1\74\2\uffff\1\110\1\uffff\1\114\2\uffff\1\u0117\1"+
            "\30\7\uffff\1\u011a\1\106\5\uffff\1\101\4\uffff\1\u0116\1\u0117"+
            "\3\uffff\1\103\1\uffff\1\u0115\1\uffff\1\111\2\uffff\1\73\1"+
            "\uffff\1\u010f\3\uffff\1\107\1\u0116\5\uffff\1\104\1\u010e\10"+
            "\uffff\1\u011c\2\uffff\1\u011d\1\uffff\1\113\5\uffff\1\u010d"+
            "\3\uffff\1\72\3\uffff\1\u0114\5\uffff\1\u0119\2\uffff\1\u0116"+
            "\1\u011b\111\uffff\1\30",
            "\1\u01bc\56\uffff\1\u00c6",
            "\1\u01bc\56\uffff\1\u00c6",
            "\1\35",
            "\1\u01bd",
            "\1\40\37\uffff\1\u01be",
            "\1\43",
            "\1\uffff",
            "\1\u00cc",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff"
    };

    static final short[] DFA116_eot = DFA.unpackEncodedString(DFA116_eotS);
    static final short[] DFA116_eof = DFA.unpackEncodedString(DFA116_eofS);
    static final char[] DFA116_min = DFA.unpackEncodedStringToUnsignedChars(DFA116_minS);
    static final char[] DFA116_max = DFA.unpackEncodedStringToUnsignedChars(DFA116_maxS);
    static final short[] DFA116_accept = DFA.unpackEncodedString(DFA116_acceptS);
    static final short[] DFA116_special = DFA.unpackEncodedString(DFA116_specialS);
    static final short[][] DFA116_transition;

    static {
        int numStates = DFA116_transitionS.length;
        DFA116_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA116_transition[i] = DFA.unpackEncodedString(DFA116_transitionS[i]);
        }
    }

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = DFA116_eot;
            this.eof = DFA116_eof;
            this.min = DFA116_min;
            this.max = DFA116_max;
            this.accept = DFA116_accept;
            this.special = DFA116_special;
            this.transition = DFA116_transition;
        }
        public String getDescription() {
            return "645:1: sequenceType : ( ( itemType occurrenceIndicator )=> itemType occurrenceIndicator | itemType | ( EMPTY_SEQUENCE LEFTPARENTHESISSi RIGHTPARENTHESISSi ) );";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_25 = input.LA(1);

                         
                        int index116_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_25==LEFTBRACESi) && (synpred4())) {s = 47;}

                        else if ( (LA116_25==EXTERNAL) && (synpred4())) {s = 48;}

                        else if ( (LA116_25==RETURN) && (synpred4())) {s = 49;}

                        else if ( (LA116_25==EXCEPT||LA116_25==INTERSECT) && (synpred4())) {s = 50;}

                        else if ( (LA116_25==PIPESi||LA116_25==UNION) && (synpred4())) {s = 51;}

                        else if ( (LA116_25==STARSi) ) {s = 87;}

                        else if ( (LA116_25==MINUSSi||LA116_25==PLUSSi) ) {s = 88;}

                        else if ( (LA116_25==TO) && (synpred4())) {s = 53;}

                        else if ( (LA116_25==FTCONTAINS) && (synpred4())) {s = 54;}

                        else if ( ((LA116_25>=EQ && LA116_25<=GE)) && (synpred4())) {s = 55;}

                        else if ( (LA116_25==LESSTHANSi) ) {s = 89;}

                        else if ( ((LA116_25>=IS && LA116_25<=NODEAFTERSi)) && (synpred4())) {s = 57;}

                        else if ( (LA116_25==AND) && (synpred4())) {s = 58;}

                        else if ( (LA116_25==OR) && (synpred4())) {s = 59;}

                        else if ( (LA116_25==SEMICOLONSi) && (synpred4())) {s = 60;}

                        else if ( (LA116_25==COMMASi) && (synpred4())) {s = 61;}

                        else if ( (LA116_25==RIGHTBRACESi) && (synpred4())) {s = 62;}

                        else if ( (LA116_25==EOF) && (synpred4())) {s = 63;}

                        else if ( (LA116_25==RIGHTPARENTHESISSi) && (synpred4())) {s = 64;}

                        else if ( (LA116_25==RIGHTBRACKETSi) && (synpred4())) {s = 65;}

                        else if ( (LA116_25==WHERE) && (synpred4())) {s = 66;}

                        else if ( (LA116_25==ORDER) && (synpred4())) {s = 67;}

                        else if ( (LA116_25==STABLE) && (synpred4())) {s = 68;}

                        else if ( (LA116_25==FOR) && (synpred4())) {s = 69;}

                        else if ( (LA116_25==LET) && (synpred4())) {s = 70;}

                        else if ( (LA116_25==ASCENDING||LA116_25==DESCENDING) && (synpred4())) {s = 71;}

                        else if ( (LA116_25==EMPTY) && (synpred4())) {s = 72;}

                        else if ( (LA116_25==COLLATION) && (synpred4())) {s = 73;}

                        else if ( (LA116_25==SATISFIES) && (synpred4())) {s = 74;}

                        else if ( (LA116_25==DEFAULT) && (synpred4())) {s = 75;}

                        else if ( (LA116_25==CASE) && (synpred4())) {s = 76;}

                        else if ( (LA116_25==ELSE) && (synpred4())) {s = 77;}

                        else if ( (LA116_25==WITHOUT) && (synpred4())) {s = 78;}

                        else if ( (LA116_25==TIMES) && (synpred4())) {s = 79;}

                        else if ( ((LA116_25>=WORDS && LA116_25<=PARAGRAPHS)) && (synpred4())) {s = 80;}

                        else if ( (LA116_25==LEVELS) && (synpred4())) {s = 81;}

                        else if ( (LA116_25==INSTANCE) && (synpred4())) {s = 82;}

                        else if ( (LA116_25==ASSIGNMENTOPERATOR) && (synpred4())) {s = 83;}

                        else if ( (LA116_25==AT) && (synpred4())) {s = 84;}

                        else if ( (LA116_25==SCORE) && (synpred4())) {s = 85;}

                        else if ( (LA116_25==IN) && (synpred4())) {s = 86;}

                        else if ( (LA116_25==DOLLARSi||(LA116_25>=LEFTPRAGMA && LA116_25<=DOCUMENTNODE)||LA116_25==SLASH||LA116_25==PROCESSING_INSTRUCTION||LA116_25==DOCUMENT||LA116_25==VALIDATE||LA116_25==SCHEMAATTRIBUTE||LA116_25==DOUBLESLASH||LA116_25==LEFTXMLCOMMENT||LA116_25==TEXT||LA116_25==UNORDERED||LA116_25==LEFTPITARGET||LA116_25==COMMENT||(LA116_25>=ELEMENT && LA116_25<=LEFTPARENTHESISSi)||LA116_25==ATSi||LA116_25==ATTRIBUTE||LA116_25==NODE||LA116_25==SCHEMAELEMENT||LA116_25==CHILD||(LA116_25>=DESCENDANT && LA116_25<=DOTDOT)||(LA116_25>=IntegerLiteral && LA116_25<=DoubleLiteral)||LA116_25==StringLiteral||(LA116_25>=NCName && LA116_25<=QName)) ) {s = 24;}

                        else if ( ((LA116_25>=BIGGERTHANSi && LA116_25<=LESSTHANOREQUALSi)||(LA116_25>=EQUALSi && LA116_25<=NOTEQUALSi)) && (synpred4())) {s = 56;}

                        else if ( (LA116_25==IDIV||LA116_25==DIV||LA116_25==MOD) && (synpred4())) {s = 52;}

                         
                        input.seek(index116_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA116_189 = input.LA(1);

                         
                        int index116_189 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_189==COLONSi) && (synpred4())) {s = 381;}

                        else if ( (LA116_189==MINUSSi||LA116_189==PLUSSi) ) {s = 44;}

                        else if ( (LA116_189==DOLLARSi||(LA116_189>=LEFTPRAGMA && LA116_189<=DOCUMENTNODE)||LA116_189==PROCESSING_INSTRUCTION||LA116_189==DOCUMENT||LA116_189==VALIDATE||LA116_189==SCHEMAATTRIBUTE||LA116_189==LEFTXMLCOMMENT||LA116_189==TEXT||LA116_189==UNORDERED||LA116_189==LEFTPITARGET||LA116_189==COMMENT||(LA116_189>=ELEMENT && LA116_189<=LEFTPARENTHESISSi)||LA116_189==ATSi||LA116_189==ATTRIBUTE||LA116_189==NODE||LA116_189==SCHEMAELEMENT||LA116_189==CHILD||(LA116_189>=DESCENDANT && LA116_189<=DOTDOT)||(LA116_189>=IntegerLiteral && LA116_189<=DoubleLiteral)||LA116_189==StringLiteral||(LA116_189>=NCName && LA116_189<=QName)) ) {s = 24;}

                        else if ( (LA116_189==DOUBLESLASH) ) {s = 382;}

                        else if ( (LA116_189==SLASH) ) {s = 383;}

                        else if ( (LA116_189==LESSTHANSi) ) {s = 45;}

                        else if ( (LA116_189==STARSi) ) {s = 46;}

                        else if ( (LA116_189==LEFTBRACKETSi) && (synpred4())) {s = 384;}

                        else if ( (LA116_189==CAST) && (synpred4())) {s = 345;}

                        else if ( (LA116_189==CASTABLE) && (synpred4())) {s = 346;}

                        else if ( (LA116_189==TREAT) && (synpred4())) {s = 347;}

                        else if ( (LA116_189==INSTANCE) && (synpred4())) {s = 348;}

                        else if ( (LA116_189==EXCEPT||LA116_189==INTERSECT) && (synpred4())) {s = 349;}

                        else if ( (LA116_189==PIPESi||LA116_189==UNION) && (synpred4())) {s = 350;}

                        else if ( (LA116_189==TO) && (synpred4())) {s = 53;}

                        else if ( (LA116_189==FTCONTAINS) && (synpred4())) {s = 54;}

                        else if ( ((LA116_189>=EQ && LA116_189<=GE)) && (synpred4())) {s = 55;}

                        else if ( ((LA116_189>=BIGGERTHANSi && LA116_189<=LESSTHANOREQUALSi)||(LA116_189>=EQUALSi && LA116_189<=NOTEQUALSi)) && (synpred4())) {s = 56;}

                        else if ( ((LA116_189>=IS && LA116_189<=NODEAFTERSi)) && (synpred4())) {s = 57;}

                        else if ( (LA116_189==AND) && (synpred4())) {s = 58;}

                        else if ( (LA116_189==OR) && (synpred4())) {s = 59;}

                        else if ( (LA116_189==SEMICOLONSi) && (synpred4())) {s = 60;}

                        else if ( (LA116_189==COMMASi) && (synpred4())) {s = 282;}

                        else if ( (LA116_189==RIGHTBRACESi) && (synpred4())) {s = 62;}

                        else if ( (LA116_189==EOF) && (synpred4())) {s = 63;}

                        else if ( (LA116_189==RIGHTPARENTHESISSi) && (synpred4())) {s = 353;}

                        else if ( (LA116_189==RIGHTBRACKETSi) && (synpred4())) {s = 65;}

                        else if ( (LA116_189==WHERE) && (synpred4())) {s = 66;}

                        else if ( (LA116_189==ORDER) && (synpred4())) {s = 67;}

                        else if ( (LA116_189==STABLE) && (synpred4())) {s = 68;}

                        else if ( (LA116_189==RETURN) && (synpred4())) {s = 285;}

                        else if ( (LA116_189==FOR) && (synpred4())) {s = 69;}

                        else if ( (LA116_189==LET) && (synpred4())) {s = 70;}

                        else if ( (LA116_189==ASCENDING||LA116_189==DESCENDING) && (synpred4())) {s = 71;}

                        else if ( (LA116_189==EMPTY) && (synpred4())) {s = 72;}

                        else if ( (LA116_189==COLLATION) && (synpred4())) {s = 73;}

                        else if ( (LA116_189==SATISFIES) && (synpred4())) {s = 74;}

                        else if ( (LA116_189==DEFAULT) && (synpred4())) {s = 75;}

                        else if ( (LA116_189==CASE) && (synpred4())) {s = 76;}

                        else if ( (LA116_189==ELSE) && (synpred4())) {s = 77;}

                        else if ( (LA116_189==WITHOUT) && (synpred4())) {s = 78;}

                        else if ( (LA116_189==TIMES) && (synpred4())) {s = 79;}

                        else if ( ((LA116_189>=WORDS && LA116_189<=PARAGRAPHS)) && (synpred4())) {s = 80;}

                        else if ( (LA116_189==LEVELS) && (synpred4())) {s = 81;}

                        else if ( (LA116_189==IDIV||LA116_189==DIV||LA116_189==MOD) && (synpred4())) {s = 52;}

                         
                        input.seek(index116_189);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA116_194 = input.LA(1);

                         
                        int index116_194 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_194==COLONSi) && (synpred4())) {s = 381;}

                        else if ( (LA116_194==LEFTBRACKETSi) && (synpred4())) {s = 384;}

                        else if ( (LA116_194==DOUBLESLASH) ) {s = 439;}

                        else if ( (LA116_194==CAST) && (synpred4())) {s = 345;}

                        else if ( (LA116_194==CASTABLE) && (synpred4())) {s = 346;}

                        else if ( (LA116_194==TREAT) && (synpred4())) {s = 347;}

                        else if ( (LA116_194==INSTANCE) && (synpred4())) {s = 348;}

                        else if ( (LA116_194==EXCEPT||LA116_194==INTERSECT) && (synpred4())) {s = 349;}

                        else if ( (LA116_194==PIPESi||LA116_194==UNION) && (synpred4())) {s = 350;}

                        else if ( (LA116_194==MINUSSi||LA116_194==PLUSSi) ) {s = 440;}

                        else if ( (LA116_194==TO) && (synpred4())) {s = 53;}

                        else if ( (LA116_194==FTCONTAINS) && (synpred4())) {s = 54;}

                        else if ( ((LA116_194>=EQ && LA116_194<=GE)) && (synpred4())) {s = 55;}

                        else if ( (LA116_194==LESSTHANSi) ) {s = 441;}

                        else if ( ((LA116_194>=IS && LA116_194<=NODEAFTERSi)) && (synpred4())) {s = 57;}

                        else if ( (LA116_194==AND) && (synpred4())) {s = 58;}

                        else if ( (LA116_194==OR) && (synpred4())) {s = 59;}

                        else if ( (LA116_194==SEMICOLONSi) && (synpred4())) {s = 60;}

                        else if ( (LA116_194==COMMASi) && (synpred4())) {s = 282;}

                        else if ( (LA116_194==RIGHTBRACESi) && (synpred4())) {s = 62;}

                        else if ( (LA116_194==EOF) && (synpred4())) {s = 63;}

                        else if ( (LA116_194==RIGHTPARENTHESISSi) && (synpred4())) {s = 353;}

                        else if ( (LA116_194==RIGHTBRACKETSi) && (synpred4())) {s = 65;}

                        else if ( (LA116_194==WHERE) && (synpred4())) {s = 66;}

                        else if ( (LA116_194==ORDER) && (synpred4())) {s = 67;}

                        else if ( (LA116_194==STABLE) && (synpred4())) {s = 68;}

                        else if ( (LA116_194==RETURN) && (synpred4())) {s = 285;}

                        else if ( (LA116_194==FOR) && (synpred4())) {s = 69;}

                        else if ( (LA116_194==LET) && (synpred4())) {s = 70;}

                        else if ( (LA116_194==ASCENDING||LA116_194==DESCENDING) && (synpred4())) {s = 71;}

                        else if ( (LA116_194==EMPTY) && (synpred4())) {s = 72;}

                        else if ( (LA116_194==COLLATION) && (synpred4())) {s = 73;}

                        else if ( (LA116_194==SATISFIES) && (synpred4())) {s = 74;}

                        else if ( (LA116_194==DEFAULT) && (synpred4())) {s = 75;}

                        else if ( (LA116_194==CASE) && (synpred4())) {s = 76;}

                        else if ( (LA116_194==ELSE) && (synpred4())) {s = 77;}

                        else if ( (LA116_194==WITHOUT) && (synpred4())) {s = 78;}

                        else if ( (LA116_194==TIMES) && (synpred4())) {s = 79;}

                        else if ( ((LA116_194>=WORDS && LA116_194<=PARAGRAPHS)) && (synpred4())) {s = 80;}

                        else if ( (LA116_194==LEVELS) && (synpred4())) {s = 81;}

                        else if ( (LA116_194==STARSi) ) {s = 442;}

                        else if ( (LA116_194==DOLLARSi||(LA116_194>=LEFTPRAGMA && LA116_194<=DOCUMENTNODE)||LA116_194==PROCESSING_INSTRUCTION||LA116_194==DOCUMENT||LA116_194==VALIDATE||LA116_194==SCHEMAATTRIBUTE||LA116_194==LEFTXMLCOMMENT||LA116_194==TEXT||LA116_194==UNORDERED||LA116_194==LEFTPITARGET||LA116_194==COMMENT||(LA116_194>=ELEMENT && LA116_194<=LEFTPARENTHESISSi)||LA116_194==ATSi||LA116_194==ATTRIBUTE||LA116_194==NODE||LA116_194==SCHEMAELEMENT||LA116_194==CHILD||(LA116_194>=DESCENDANT && LA116_194<=DOTDOT)||(LA116_194>=IntegerLiteral && LA116_194<=DoubleLiteral)||LA116_194==StringLiteral||(LA116_194>=NCName && LA116_194<=QName)) ) {s = 24;}

                        else if ( (LA116_194==SLASH) ) {s = 443;}

                        else if ( ((LA116_194>=BIGGERTHANSi && LA116_194<=LESSTHANOREQUALSi)||(LA116_194>=EQUALSi && LA116_194<=NOTEQUALSi)) && (synpred4())) {s = 56;}

                        else if ( (LA116_194==IDIV||LA116_194==DIV||LA116_194==MOD) && (synpred4())) {s = 52;}

                         
                        input.seek(index116_194);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA116_45 = input.LA(1);

                         
                        int index116_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_45==QName) ) {s = 128;}

                        else if ( (LA116_45==MINUSSi||LA116_45==PLUSSi) && (synpred4())) {s = 129;}

                        else if ( (LA116_45==VALIDATE) && (synpred4())) {s = 130;}

                        else if ( (LA116_45==DOUBLESLASH) && (synpred4())) {s = 131;}

                        else if ( (LA116_45==SLASH) && (synpred4())) {s = 132;}

                        else if ( ((LA116_45>=IntegerLiteral && LA116_45<=DoubleLiteral)) && (synpred4())) {s = 133;}

                        else if ( (LA116_45==StringLiteral) && (synpred4())) {s = 134;}

                        else if ( (LA116_45==DOLLARSi) && (synpred4())) {s = 135;}

                        else if ( (LA116_45==LEFTPARENTHESISSi) && (synpred4())) {s = 136;}

                        else if ( (LA116_45==DOT) && (synpred4())) {s = 137;}

                        else if ( (LA116_45==ORDERED) && (synpred4())) {s = 138;}

                        else if ( (LA116_45==UNORDERED) && (synpred4())) {s = 139;}

                        else if ( (LA116_45==LESSTHANSi) && (synpred4())) {s = 140;}

                        else if ( (LA116_45==LEFTXMLCOMMENT) && (synpred4())) {s = 141;}

                        else if ( (LA116_45==LEFTPITARGET) && (synpred4())) {s = 142;}

                        else if ( (LA116_45==DOCUMENT) && (synpred4())) {s = 143;}

                        else if ( (LA116_45==ELEMENT) && (synpred4())) {s = 144;}

                        else if ( (LA116_45==ATTRIBUTE) && (synpred4())) {s = 145;}

                        else if ( (LA116_45==TEXT) && (synpred4())) {s = 146;}

                        else if ( (LA116_45==COMMENT) && (synpred4())) {s = 147;}

                        else if ( (LA116_45==PROCESSING_INSTRUCTION) && (synpred4())) {s = 148;}

                        else if ( ((LA116_45>=PARENT && LA116_45<=ANCESTOR_OR_SELF)) && (synpred4())) {s = 149;}

                        else if ( (LA116_45==DOTDOT) && (synpred4())) {s = 150;}

                        else if ( (LA116_45==CHILD||(LA116_45>=DESCENDANT && LA116_45<=FOLLOWING)) && (synpred4())) {s = 151;}

                        else if ( (LA116_45==ATSi) && (synpred4())) {s = 152;}

                        else if ( (LA116_45==DOCUMENTNODE) && (synpred4())) {s = 153;}

                        else if ( (LA116_45==SCHEMAELEMENT) && (synpred4())) {s = 154;}

                        else if ( (LA116_45==SCHEMAATTRIBUTE) && (synpred4())) {s = 155;}

                        else if ( (LA116_45==NODE) && (synpred4())) {s = 156;}

                        else if ( (LA116_45==STARSi) && (synpred4())) {s = 157;}

                        else if ( (LA116_45==NCName) && (synpred4())) {s = 158;}

                        else if ( (LA116_45==LEFTPRAGMA) && (synpred4())) {s = 159;}

                         
                        input.seek(index116_45);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA116_89 = input.LA(1);

                         
                        int index116_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_89==QName) ) {s = 195;}

                        else if ( (LA116_89==MINUSSi||LA116_89==PLUSSi) && (synpred4())) {s = 129;}

                        else if ( (LA116_89==VALIDATE) && (synpred4())) {s = 130;}

                        else if ( (LA116_89==DOUBLESLASH) && (synpred4())) {s = 131;}

                        else if ( (LA116_89==SLASH) && (synpred4())) {s = 132;}

                        else if ( ((LA116_89>=IntegerLiteral && LA116_89<=DoubleLiteral)) && (synpred4())) {s = 133;}

                        else if ( (LA116_89==StringLiteral) && (synpred4())) {s = 134;}

                        else if ( (LA116_89==DOLLARSi) && (synpred4())) {s = 135;}

                        else if ( (LA116_89==LEFTPARENTHESISSi) && (synpred4())) {s = 136;}

                        else if ( (LA116_89==DOT) && (synpred4())) {s = 137;}

                        else if ( (LA116_89==ORDERED) && (synpred4())) {s = 138;}

                        else if ( (LA116_89==UNORDERED) && (synpred4())) {s = 139;}

                        else if ( (LA116_89==LESSTHANSi) && (synpred4())) {s = 140;}

                        else if ( (LA116_89==LEFTXMLCOMMENT) && (synpred4())) {s = 141;}

                        else if ( (LA116_89==LEFTPITARGET) && (synpred4())) {s = 142;}

                        else if ( (LA116_89==DOCUMENT) && (synpred4())) {s = 143;}

                        else if ( (LA116_89==ELEMENT) && (synpred4())) {s = 144;}

                        else if ( (LA116_89==ATTRIBUTE) && (synpred4())) {s = 145;}

                        else if ( (LA116_89==TEXT) && (synpred4())) {s = 146;}

                        else if ( (LA116_89==COMMENT) && (synpred4())) {s = 147;}

                        else if ( (LA116_89==PROCESSING_INSTRUCTION) && (synpred4())) {s = 148;}

                        else if ( ((LA116_89>=PARENT && LA116_89<=ANCESTOR_OR_SELF)) && (synpred4())) {s = 149;}

                        else if ( (LA116_89==DOTDOT) && (synpred4())) {s = 150;}

                        else if ( (LA116_89==CHILD||(LA116_89>=DESCENDANT && LA116_89<=FOLLOWING)) && (synpred4())) {s = 151;}

                        else if ( (LA116_89==ATSi) && (synpred4())) {s = 152;}

                        else if ( (LA116_89==DOCUMENTNODE) && (synpred4())) {s = 153;}

                        else if ( (LA116_89==SCHEMAELEMENT) && (synpred4())) {s = 154;}

                        else if ( (LA116_89==SCHEMAATTRIBUTE) && (synpred4())) {s = 155;}

                        else if ( (LA116_89==NODE) && (synpred4())) {s = 156;}

                        else if ( (LA116_89==STARSi) && (synpred4())) {s = 157;}

                        else if ( (LA116_89==NCName) && (synpred4())) {s = 158;}

                        else if ( (LA116_89==LEFTPRAGMA) && (synpred4())) {s = 159;}

                         
                        input.seek(index116_89);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA116_100 = input.LA(1);

                         
                        int index116_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_100);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA116_46 = input.LA(1);

                         
                        int index116_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_46==EOF||(LA116_46>=PIPESi && LA116_46<=WHERE)||(LA116_46>=EQUALSi && LA116_46<=NOTEQUALSi)||LA116_46==CAST||LA116_46==ELSE||LA116_46==TREAT||LA116_46==CASTABLE||(LA116_46>=FOR && LA116_46<=INSTANCE)||(LA116_46>=EXCEPT && LA116_46<=TO)||(LA116_46>=SATISFIES && LA116_46<=SEMICOLONSi)||LA116_46==EMPTY||LA116_46==CASE||(LA116_46>=COMMASi && LA116_46<=LET)||LA116_46==RIGHTBRACKETSi||LA116_46==LEVELS||LA116_46==DIV||LA116_46==ORDER||LA116_46==UNION||LA116_46==COLLATION||LA116_46==OR||LA116_46==DESCENDING||(LA116_46>=STABLE && LA116_46<=LEFTBRACKETSi)||LA116_46==WITHOUT||LA116_46==RIGHTPARENTHESISSi||LA116_46==RETURN||LA116_46==DEFAULT||LA116_46==AND||LA116_46==INTERSECT||LA116_46==TIMES||LA116_46==FTCONTAINS||(LA116_46>=MOD && LA116_46<=RIGHTBRACESi)||(LA116_46>=EQ && LA116_46<=NODEAFTERSi)||(LA116_46>=WORDS && LA116_46<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_46==MINUSSi||LA116_46==PLUSSi) ) {s = 160;}

                        else if ( (LA116_46==VALIDATE) && (synpred4())) {s = 161;}

                        else if ( (LA116_46==DOUBLESLASH) ) {s = 162;}

                        else if ( (LA116_46==SLASH) ) {s = 163;}

                        else if ( ((LA116_46>=IntegerLiteral && LA116_46<=DoubleLiteral)) && (synpred4())) {s = 164;}

                        else if ( (LA116_46==StringLiteral) && (synpred4())) {s = 165;}

                        else if ( (LA116_46==DOLLARSi) && (synpred4())) {s = 166;}

                        else if ( (LA116_46==LEFTPARENTHESISSi) && (synpred4())) {s = 167;}

                        else if ( (LA116_46==DOT) && (synpred4())) {s = 168;}

                        else if ( (LA116_46==QName) && (synpred4())) {s = 169;}

                        else if ( (LA116_46==ORDERED) && (synpred4())) {s = 170;}

                        else if ( (LA116_46==UNORDERED) && (synpred4())) {s = 171;}

                        else if ( (LA116_46==LESSTHANSi) ) {s = 172;}

                        else if ( (LA116_46==LEFTXMLCOMMENT) && (synpred4())) {s = 173;}

                        else if ( (LA116_46==LEFTPITARGET) && (synpred4())) {s = 174;}

                        else if ( (LA116_46==DOCUMENT) && (synpred4())) {s = 175;}

                        else if ( (LA116_46==ELEMENT) && (synpred4())) {s = 176;}

                        else if ( (LA116_46==ATTRIBUTE) && (synpred4())) {s = 177;}

                        else if ( (LA116_46==TEXT) && (synpred4())) {s = 178;}

                        else if ( (LA116_46==COMMENT) && (synpred4())) {s = 179;}

                        else if ( (LA116_46==PROCESSING_INSTRUCTION) && (synpred4())) {s = 180;}

                        else if ( ((LA116_46>=PARENT && LA116_46<=ANCESTOR_OR_SELF)) && (synpred4())) {s = 181;}

                        else if ( (LA116_46==DOTDOT) && (synpred4())) {s = 182;}

                        else if ( (LA116_46==CHILD||(LA116_46>=DESCENDANT && LA116_46<=FOLLOWING)) && (synpred4())) {s = 183;}

                        else if ( (LA116_46==ATSi) && (synpred4())) {s = 184;}

                        else if ( (LA116_46==DOCUMENTNODE) && (synpred4())) {s = 185;}

                        else if ( (LA116_46==SCHEMAELEMENT) && (synpred4())) {s = 186;}

                        else if ( (LA116_46==SCHEMAATTRIBUTE) && (synpred4())) {s = 187;}

                        else if ( (LA116_46==NODE) && (synpred4())) {s = 188;}

                        else if ( (LA116_46==STARSi) ) {s = 189;}

                        else if ( (LA116_46==NCName) && (synpred4())) {s = 190;}

                        else if ( (LA116_46==LEFTPRAGMA) && (synpred4())) {s = 191;}

                         
                        input.seek(index116_46);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA116_118 = input.LA(1);

                         
                        int index116_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_118);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA116_87 = input.LA(1);

                         
                        int index116_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_87==EOF||(LA116_87>=PIPESi && LA116_87<=WHERE)||(LA116_87>=EQUALSi && LA116_87<=NOTEQUALSi)||LA116_87==CAST||LA116_87==ELSE||LA116_87==TREAT||LA116_87==CASTABLE||(LA116_87>=FOR && LA116_87<=INSTANCE)||(LA116_87>=EXCEPT && LA116_87<=TO)||(LA116_87>=SATISFIES && LA116_87<=SEMICOLONSi)||LA116_87==EMPTY||LA116_87==CASE||(LA116_87>=COMMASi && LA116_87<=LET)||LA116_87==RIGHTBRACKETSi||LA116_87==LEVELS||LA116_87==DIV||LA116_87==ORDER||LA116_87==UNION||LA116_87==COLLATION||LA116_87==OR||LA116_87==DESCENDING||(LA116_87>=STABLE && LA116_87<=LEFTBRACKETSi)||LA116_87==WITHOUT||LA116_87==RIGHTPARENTHESISSi||LA116_87==RETURN||LA116_87==DEFAULT||LA116_87==AND||LA116_87==INTERSECT||LA116_87==TIMES||LA116_87==FTCONTAINS||(LA116_87>=MOD && LA116_87<=RIGHTBRACESi)||(LA116_87>=EQ && LA116_87<=NODEAFTERSi)||(LA116_87>=WORDS && LA116_87<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_87==MINUSSi||LA116_87==PLUSSi) ) {s = 160;}

                        else if ( (LA116_87==VALIDATE) && (synpred4())) {s = 161;}

                        else if ( (LA116_87==DOUBLESLASH) ) {s = 192;}

                        else if ( (LA116_87==SLASH) ) {s = 193;}

                        else if ( ((LA116_87>=IntegerLiteral && LA116_87<=DoubleLiteral)) && (synpred4())) {s = 164;}

                        else if ( (LA116_87==StringLiteral) && (synpred4())) {s = 165;}

                        else if ( (LA116_87==DOLLARSi) && (synpred4())) {s = 166;}

                        else if ( (LA116_87==LEFTPARENTHESISSi) && (synpred4())) {s = 167;}

                        else if ( (LA116_87==DOT) && (synpred4())) {s = 168;}

                        else if ( (LA116_87==QName) && (synpred4())) {s = 169;}

                        else if ( (LA116_87==ORDERED) && (synpred4())) {s = 170;}

                        else if ( (LA116_87==UNORDERED) && (synpred4())) {s = 171;}

                        else if ( (LA116_87==LESSTHANSi) ) {s = 172;}

                        else if ( (LA116_87==LEFTXMLCOMMENT) && (synpred4())) {s = 173;}

                        else if ( (LA116_87==LEFTPITARGET) && (synpred4())) {s = 174;}

                        else if ( (LA116_87==DOCUMENT) && (synpred4())) {s = 175;}

                        else if ( (LA116_87==ELEMENT) && (synpred4())) {s = 176;}

                        else if ( (LA116_87==ATTRIBUTE) && (synpred4())) {s = 177;}

                        else if ( (LA116_87==TEXT) && (synpred4())) {s = 178;}

                        else if ( (LA116_87==COMMENT) && (synpred4())) {s = 179;}

                        else if ( (LA116_87==PROCESSING_INSTRUCTION) && (synpred4())) {s = 180;}

                        else if ( ((LA116_87>=PARENT && LA116_87<=ANCESTOR_OR_SELF)) && (synpred4())) {s = 181;}

                        else if ( (LA116_87==DOTDOT) && (synpred4())) {s = 182;}

                        else if ( (LA116_87==CHILD||(LA116_87>=DESCENDANT && LA116_87<=FOLLOWING)) && (synpred4())) {s = 183;}

                        else if ( (LA116_87==ATSi) && (synpred4())) {s = 184;}

                        else if ( (LA116_87==DOCUMENTNODE) && (synpred4())) {s = 185;}

                        else if ( (LA116_87==SCHEMAELEMENT) && (synpred4())) {s = 186;}

                        else if ( (LA116_87==SCHEMAATTRIBUTE) && (synpred4())) {s = 187;}

                        else if ( (LA116_87==NODE) && (synpred4())) {s = 188;}

                        else if ( (LA116_87==STARSi) ) {s = 194;}

                        else if ( (LA116_87==NCName) && (synpred4())) {s = 190;}

                        else if ( (LA116_87==LEFTPRAGMA) && (synpred4())) {s = 191;}

                         
                        input.seek(index116_87);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA116_101 = input.LA(1);

                         
                        int index116_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_101);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA116_43 = input.LA(1);

                         
                        int index116_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_43==STARSi) ) {s = 23;}

                        else if ( (LA116_43==EOF||(LA116_43>=PIPESi && LA116_43<=WHERE)||(LA116_43>=LEFTBRACESi && LA116_43<=NOTEQUALSi)||(LA116_43>=ELSE && LA116_43<=LESSTHANSi)||(LA116_43>=FOR && LA116_43<=INSTANCE)||(LA116_43>=EXCEPT && LA116_43<=TO)||LA116_43==SATISFIES||LA116_43==SEMICOLONSi||LA116_43==EMPTY||LA116_43==CASE||LA116_43==MINUSSi||(LA116_43>=COMMASi && LA116_43<=LET)||LA116_43==SCORE||LA116_43==RIGHTBRACKETSi||LA116_43==LEVELS||LA116_43==DIV||LA116_43==AT||LA116_43==ORDER||LA116_43==UNION||LA116_43==COLLATION||LA116_43==OR||LA116_43==DESCENDING||LA116_43==STABLE||LA116_43==WITHOUT||(LA116_43>=EXTERNAL && LA116_43<=RIGHTPARENTHESISSi)||LA116_43==RETURN||LA116_43==DEFAULT||LA116_43==AND||LA116_43==INTERSECT||LA116_43==TIMES||(LA116_43>=ASSIGNMENTOPERATOR && LA116_43<=FTCONTAINS)||(LA116_43>=MOD && LA116_43<=RIGHTBRACESi)||LA116_43==IN||(LA116_43>=EQ && LA116_43<=NODEAFTERSi)||(LA116_43>=WORDS && LA116_43<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_43==PLUSSi) ) {s = 25;}

                        else if ( (LA116_43==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_43);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA116_99 = input.LA(1);

                         
                        int index116_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_99);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA116_202 = input.LA(1);

                         
                        int index116_202 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 384;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_202);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA116_88 = input.LA(1);

                         
                        int index116_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_88);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA116_104 = input.LA(1);

                         
                        int index116_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_104);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA116_11 = input.LA(1);

                         
                        int index116_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_11==STARSi) ) {s = 23;}

                        else if ( (LA116_11==EOF||(LA116_11>=PIPESi && LA116_11<=WHERE)||(LA116_11>=LEFTBRACESi && LA116_11<=NOTEQUALSi)||(LA116_11>=ELSE && LA116_11<=LESSTHANSi)||(LA116_11>=FOR && LA116_11<=INSTANCE)||(LA116_11>=EXCEPT && LA116_11<=TO)||LA116_11==SATISFIES||LA116_11==SEMICOLONSi||LA116_11==EMPTY||LA116_11==CASE||LA116_11==MINUSSi||(LA116_11>=COMMASi && LA116_11<=LET)||LA116_11==SCORE||LA116_11==RIGHTBRACKETSi||LA116_11==LEVELS||LA116_11==DIV||LA116_11==AT||LA116_11==ORDER||LA116_11==UNION||LA116_11==COLLATION||LA116_11==OR||LA116_11==DESCENDING||LA116_11==STABLE||LA116_11==WITHOUT||(LA116_11>=EXTERNAL && LA116_11<=RIGHTPARENTHESISSi)||LA116_11==RETURN||LA116_11==DEFAULT||LA116_11==AND||LA116_11==INTERSECT||LA116_11==TIMES||(LA116_11>=ASSIGNMENTOPERATOR && LA116_11<=FTCONTAINS)||(LA116_11>=MOD && LA116_11<=RIGHTBRACESi)||LA116_11==IN||(LA116_11>=EQ && LA116_11<=NODEAFTERSi)||(LA116_11>=WORDS && LA116_11<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_11==PLUSSi) ) {s = 25;}

                        else if ( (LA116_11==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_11);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA116_29 = input.LA(1);

                         
                        int index116_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_29==STARSi) ) {s = 23;}

                        else if ( (LA116_29==EOF||(LA116_29>=PIPESi && LA116_29<=WHERE)||(LA116_29>=LEFTBRACESi && LA116_29<=NOTEQUALSi)||(LA116_29>=ELSE && LA116_29<=LESSTHANSi)||(LA116_29>=FOR && LA116_29<=INSTANCE)||(LA116_29>=EXCEPT && LA116_29<=TO)||LA116_29==SATISFIES||LA116_29==SEMICOLONSi||LA116_29==EMPTY||LA116_29==CASE||LA116_29==MINUSSi||(LA116_29>=COMMASi && LA116_29<=LET)||LA116_29==SCORE||LA116_29==RIGHTBRACKETSi||LA116_29==LEVELS||LA116_29==DIV||LA116_29==AT||LA116_29==ORDER||LA116_29==UNION||LA116_29==COLLATION||LA116_29==OR||LA116_29==DESCENDING||LA116_29==STABLE||LA116_29==WITHOUT||(LA116_29>=EXTERNAL && LA116_29<=RIGHTPARENTHESISSi)||LA116_29==RETURN||LA116_29==DEFAULT||LA116_29==AND||LA116_29==INTERSECT||LA116_29==TIMES||(LA116_29>=ASSIGNMENTOPERATOR && LA116_29<=FTCONTAINS)||(LA116_29>=MOD && LA116_29<=RIGHTBRACESi)||LA116_29==IN||(LA116_29>=EQ && LA116_29<=NODEAFTERSi)||(LA116_29>=WORDS && LA116_29<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_29==PLUSSi) ) {s = 25;}

                        else if ( (LA116_29==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_29);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA116_42 = input.LA(1);

                         
                        int index116_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_42==STARSi) ) {s = 23;}

                        else if ( (LA116_42==EOF||(LA116_42>=PIPESi && LA116_42<=WHERE)||(LA116_42>=LEFTBRACESi && LA116_42<=NOTEQUALSi)||(LA116_42>=ELSE && LA116_42<=LESSTHANSi)||(LA116_42>=FOR && LA116_42<=INSTANCE)||(LA116_42>=EXCEPT && LA116_42<=TO)||LA116_42==SATISFIES||LA116_42==SEMICOLONSi||LA116_42==EMPTY||LA116_42==CASE||LA116_42==MINUSSi||(LA116_42>=COMMASi && LA116_42<=LET)||LA116_42==SCORE||LA116_42==RIGHTBRACKETSi||LA116_42==LEVELS||LA116_42==DIV||LA116_42==AT||LA116_42==ORDER||LA116_42==UNION||LA116_42==COLLATION||LA116_42==OR||LA116_42==DESCENDING||LA116_42==STABLE||LA116_42==WITHOUT||(LA116_42>=EXTERNAL && LA116_42<=RIGHTPARENTHESISSi)||LA116_42==RETURN||LA116_42==DEFAULT||LA116_42==AND||LA116_42==INTERSECT||LA116_42==TIMES||(LA116_42>=ASSIGNMENTOPERATOR && LA116_42<=FTCONTAINS)||(LA116_42>=MOD && LA116_42<=RIGHTBRACESi)||LA116_42==IN||(LA116_42>=EQ && LA116_42<=NODEAFTERSi)||(LA116_42>=WORDS && LA116_42<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_42==PLUSSi) ) {s = 25;}

                        else if ( (LA116_42==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_42);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA116_163 = input.LA(1);

                         
                        int index116_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_163==CAST) && (synpred4())) {s = 345;}

                        else if ( (LA116_163==CASTABLE) && (synpred4())) {s = 346;}

                        else if ( (LA116_163==TREAT) && (synpred4())) {s = 347;}

                        else if ( (LA116_163==INSTANCE) && (synpred4())) {s = 348;}

                        else if ( (LA116_163==EXCEPT||LA116_163==INTERSECT) && (synpred4())) {s = 349;}

                        else if ( (LA116_163==PIPESi||LA116_163==UNION) && (synpred4())) {s = 350;}

                        else if ( (LA116_163==MINUSSi||LA116_163==PLUSSi) && (synpred4())) {s = 351;}

                        else if ( (LA116_163==TO) && (synpred4())) {s = 53;}

                        else if ( (LA116_163==FTCONTAINS) && (synpred4())) {s = 54;}

                        else if ( ((LA116_163>=EQ && LA116_163<=GE)) && (synpred4())) {s = 55;}

                        else if ( (LA116_163==LESSTHANSi) ) {s = 352;}

                        else if ( ((LA116_163>=IS && LA116_163<=NODEAFTERSi)) && (synpred4())) {s = 57;}

                        else if ( (LA116_163==AND) && (synpred4())) {s = 58;}

                        else if ( (LA116_163==OR) && (synpred4())) {s = 59;}

                        else if ( (LA116_163==SEMICOLONSi) && (synpred4())) {s = 60;}

                        else if ( (LA116_163==COMMASi) && (synpred4())) {s = 282;}

                        else if ( (LA116_163==RIGHTBRACESi) && (synpred4())) {s = 62;}

                        else if ( (LA116_163==EOF) && (synpred4())) {s = 63;}

                        else if ( (LA116_163==RIGHTPARENTHESISSi) && (synpred4())) {s = 353;}

                        else if ( (LA116_163==RIGHTBRACKETSi) && (synpred4())) {s = 65;}

                        else if ( (LA116_163==WHERE) && (synpred4())) {s = 66;}

                        else if ( (LA116_163==ORDER) && (synpred4())) {s = 67;}

                        else if ( (LA116_163==STABLE) && (synpred4())) {s = 68;}

                        else if ( (LA116_163==RETURN) && (synpred4())) {s = 285;}

                        else if ( (LA116_163==FOR) && (synpred4())) {s = 69;}

                        else if ( (LA116_163==LET) && (synpred4())) {s = 70;}

                        else if ( (LA116_163==ASCENDING||LA116_163==DESCENDING) && (synpred4())) {s = 71;}

                        else if ( (LA116_163==EMPTY) && (synpred4())) {s = 72;}

                        else if ( (LA116_163==COLLATION) && (synpred4())) {s = 73;}

                        else if ( (LA116_163==SATISFIES) && (synpred4())) {s = 74;}

                        else if ( (LA116_163==DEFAULT) && (synpred4())) {s = 75;}

                        else if ( (LA116_163==CASE) && (synpred4())) {s = 76;}

                        else if ( (LA116_163==ELSE) && (synpred4())) {s = 77;}

                        else if ( (LA116_163==WITHOUT) && (synpred4())) {s = 78;}

                        else if ( (LA116_163==TIMES) && (synpred4())) {s = 79;}

                        else if ( ((LA116_163>=WORDS && LA116_163<=PARAGRAPHS)) && (synpred4())) {s = 80;}

                        else if ( (LA116_163==LEVELS) && (synpred4())) {s = 81;}

                        else if ( (LA116_163==STARSi) ) {s = 354;}

                        else if ( ((LA116_163>=IntegerLiteral && LA116_163<=DoubleLiteral)) ) {s = 355;}

                        else if ( (LA116_163==StringLiteral) ) {s = 356;}

                        else if ( (LA116_163==DOLLARSi) ) {s = 357;}

                        else if ( (LA116_163==LEFTPARENTHESISSi) ) {s = 358;}

                        else if ( (LA116_163==DOT) ) {s = 359;}

                        else if ( (LA116_163==QName) ) {s = 360;}

                        else if ( (LA116_163==ORDERED) ) {s = 361;}

                        else if ( (LA116_163==UNORDERED) ) {s = 362;}

                        else if ( ((LA116_163>=BIGGERTHANSi && LA116_163<=LESSTHANOREQUALSi)||(LA116_163>=EQUALSi && LA116_163<=NOTEQUALSi)) && (synpred4())) {s = 56;}

                        else if ( (LA116_163==LEFTXMLCOMMENT) ) {s = 363;}

                        else if ( (LA116_163==LEFTPITARGET) ) {s = 364;}

                        else if ( (LA116_163==DOCUMENT) ) {s = 365;}

                        else if ( (LA116_163==ELEMENT) ) {s = 366;}

                        else if ( (LA116_163==ATTRIBUTE) ) {s = 367;}

                        else if ( (LA116_163==TEXT) ) {s = 368;}

                        else if ( (LA116_163==COMMENT) ) {s = 369;}

                        else if ( (LA116_163==PROCESSING_INSTRUCTION) ) {s = 370;}

                        else if ( ((LA116_163>=PARENT && LA116_163<=ANCESTOR_OR_SELF)) ) {s = 371;}

                        else if ( (LA116_163==DOTDOT) ) {s = 372;}

                        else if ( (LA116_163==CHILD||(LA116_163>=DESCENDANT && LA116_163<=FOLLOWING)) ) {s = 373;}

                        else if ( (LA116_163==ATSi) ) {s = 374;}

                        else if ( (LA116_163==DOCUMENTNODE) ) {s = 375;}

                        else if ( (LA116_163==SCHEMAELEMENT) ) {s = 376;}

                        else if ( (LA116_163==SCHEMAATTRIBUTE) ) {s = 377;}

                        else if ( (LA116_163==NODE) ) {s = 378;}

                        else if ( (LA116_163==IDIV||LA116_163==DIV||LA116_163==MOD) && (synpred4())) {s = 52;}

                        else if ( (LA116_163==NCName) ) {s = 379;}

                         
                        input.seek(index116_163);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA116_193 = input.LA(1);

                         
                        int index116_193 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_193==CAST) && (synpred4())) {s = 345;}

                        else if ( (LA116_193==CASTABLE) && (synpred4())) {s = 346;}

                        else if ( (LA116_193==TREAT) && (synpred4())) {s = 347;}

                        else if ( (LA116_193==INSTANCE) && (synpred4())) {s = 348;}

                        else if ( (LA116_193==EXCEPT||LA116_193==INTERSECT) && (synpred4())) {s = 349;}

                        else if ( (LA116_193==PIPESi||LA116_193==UNION) && (synpred4())) {s = 350;}

                        else if ( (LA116_193==MINUSSi||LA116_193==PLUSSi) && (synpred4())) {s = 351;}

                        else if ( (LA116_193==TO) && (synpred4())) {s = 53;}

                        else if ( (LA116_193==FTCONTAINS) && (synpred4())) {s = 54;}

                        else if ( ((LA116_193>=EQ && LA116_193<=GE)) && (synpred4())) {s = 55;}

                        else if ( (LA116_193==LESSTHANSi) ) {s = 412;}

                        else if ( ((LA116_193>=IS && LA116_193<=NODEAFTERSi)) && (synpred4())) {s = 57;}

                        else if ( (LA116_193==AND) && (synpred4())) {s = 58;}

                        else if ( (LA116_193==OR) && (synpred4())) {s = 59;}

                        else if ( (LA116_193==SEMICOLONSi) && (synpred4())) {s = 60;}

                        else if ( (LA116_193==COMMASi) && (synpred4())) {s = 282;}

                        else if ( (LA116_193==RIGHTBRACESi) && (synpred4())) {s = 62;}

                        else if ( (LA116_193==EOF) && (synpred4())) {s = 63;}

                        else if ( (LA116_193==RIGHTPARENTHESISSi) && (synpred4())) {s = 353;}

                        else if ( (LA116_193==RIGHTBRACKETSi) && (synpred4())) {s = 65;}

                        else if ( (LA116_193==WHERE) && (synpred4())) {s = 66;}

                        else if ( (LA116_193==ORDER) && (synpred4())) {s = 67;}

                        else if ( (LA116_193==STABLE) && (synpred4())) {s = 68;}

                        else if ( (LA116_193==RETURN) && (synpred4())) {s = 285;}

                        else if ( (LA116_193==FOR) && (synpred4())) {s = 69;}

                        else if ( (LA116_193==LET) && (synpred4())) {s = 70;}

                        else if ( (LA116_193==ASCENDING||LA116_193==DESCENDING) && (synpred4())) {s = 71;}

                        else if ( (LA116_193==EMPTY) && (synpred4())) {s = 72;}

                        else if ( (LA116_193==COLLATION) && (synpred4())) {s = 73;}

                        else if ( (LA116_193==SATISFIES) && (synpred4())) {s = 74;}

                        else if ( (LA116_193==DEFAULT) && (synpred4())) {s = 75;}

                        else if ( (LA116_193==CASE) && (synpred4())) {s = 76;}

                        else if ( (LA116_193==ELSE) && (synpred4())) {s = 77;}

                        else if ( (LA116_193==WITHOUT) && (synpred4())) {s = 78;}

                        else if ( (LA116_193==TIMES) && (synpred4())) {s = 79;}

                        else if ( ((LA116_193>=WORDS && LA116_193<=PARAGRAPHS)) && (synpred4())) {s = 80;}

                        else if ( (LA116_193==LEVELS) && (synpred4())) {s = 81;}

                        else if ( (LA116_193==STARSi) ) {s = 413;}

                        else if ( ((LA116_193>=IntegerLiteral && LA116_193<=DoubleLiteral)) ) {s = 414;}

                        else if ( (LA116_193==StringLiteral) ) {s = 415;}

                        else if ( (LA116_193==DOLLARSi) ) {s = 416;}

                        else if ( (LA116_193==LEFTPARENTHESISSi) ) {s = 417;}

                        else if ( (LA116_193==DOT) ) {s = 418;}

                        else if ( (LA116_193==QName) ) {s = 419;}

                        else if ( (LA116_193==ORDERED) ) {s = 420;}

                        else if ( (LA116_193==UNORDERED) ) {s = 421;}

                        else if ( ((LA116_193>=BIGGERTHANSi && LA116_193<=LESSTHANOREQUALSi)||(LA116_193>=EQUALSi && LA116_193<=NOTEQUALSi)) && (synpred4())) {s = 56;}

                        else if ( (LA116_193==LEFTXMLCOMMENT) ) {s = 422;}

                        else if ( (LA116_193==LEFTPITARGET) ) {s = 423;}

                        else if ( (LA116_193==DOCUMENT) ) {s = 424;}

                        else if ( (LA116_193==ELEMENT) ) {s = 425;}

                        else if ( (LA116_193==ATTRIBUTE) ) {s = 426;}

                        else if ( (LA116_193==TEXT) ) {s = 427;}

                        else if ( (LA116_193==COMMENT) ) {s = 428;}

                        else if ( (LA116_193==PROCESSING_INSTRUCTION) ) {s = 429;}

                        else if ( ((LA116_193>=PARENT && LA116_193<=ANCESTOR_OR_SELF)) ) {s = 430;}

                        else if ( (LA116_193==DOTDOT) ) {s = 431;}

                        else if ( (LA116_193==CHILD||(LA116_193>=DESCENDANT && LA116_193<=FOLLOWING)) ) {s = 432;}

                        else if ( (LA116_193==ATSi) ) {s = 433;}

                        else if ( (LA116_193==DOCUMENTNODE) ) {s = 434;}

                        else if ( (LA116_193==SCHEMAELEMENT) ) {s = 435;}

                        else if ( (LA116_193==SCHEMAATTRIBUTE) ) {s = 436;}

                        else if ( (LA116_193==NODE) ) {s = 437;}

                        else if ( (LA116_193==IDIV||LA116_193==DIV||LA116_193==MOD) && (synpred4())) {s = 52;}

                        else if ( (LA116_193==NCName) ) {s = 438;}

                         
                        input.seek(index116_193);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA116_40 = input.LA(1);

                         
                        int index116_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_40==EOF||(LA116_40>=PIPESi && LA116_40<=WHERE)||(LA116_40>=LEFTBRACESi && LA116_40<=NOTEQUALSi)||(LA116_40>=ELSE && LA116_40<=LESSTHANSi)||(LA116_40>=FOR && LA116_40<=INSTANCE)||(LA116_40>=EXCEPT && LA116_40<=TO)||LA116_40==SATISFIES||LA116_40==SEMICOLONSi||LA116_40==EMPTY||LA116_40==CASE||LA116_40==MINUSSi||(LA116_40>=COMMASi && LA116_40<=LET)||LA116_40==SCORE||LA116_40==RIGHTBRACKETSi||LA116_40==LEVELS||LA116_40==DIV||LA116_40==AT||LA116_40==ORDER||LA116_40==UNION||LA116_40==COLLATION||LA116_40==OR||LA116_40==DESCENDING||LA116_40==STABLE||LA116_40==WITHOUT||(LA116_40>=EXTERNAL && LA116_40<=RIGHTPARENTHESISSi)||LA116_40==RETURN||LA116_40==DEFAULT||LA116_40==AND||LA116_40==INTERSECT||LA116_40==TIMES||(LA116_40>=ASSIGNMENTOPERATOR && LA116_40<=FTCONTAINS)||(LA116_40>=MOD && LA116_40<=RIGHTBRACESi)||LA116_40==IN||(LA116_40>=EQ && LA116_40<=NODEAFTERSi)||(LA116_40>=WORDS && LA116_40<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_40==STARSi) ) {s = 23;}

                        else if ( (LA116_40==PLUSSi) ) {s = 25;}

                        else if ( (LA116_40==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_40);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA116_41 = input.LA(1);

                         
                        int index116_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_41==STARSi) ) {s = 23;}

                        else if ( (LA116_41==EOF||(LA116_41>=PIPESi && LA116_41<=WHERE)||(LA116_41>=LEFTBRACESi && LA116_41<=NOTEQUALSi)||(LA116_41>=ELSE && LA116_41<=LESSTHANSi)||(LA116_41>=FOR && LA116_41<=INSTANCE)||(LA116_41>=EXCEPT && LA116_41<=TO)||LA116_41==SATISFIES||LA116_41==SEMICOLONSi||LA116_41==EMPTY||LA116_41==CASE||LA116_41==MINUSSi||(LA116_41>=COMMASi && LA116_41<=LET)||LA116_41==SCORE||LA116_41==RIGHTBRACKETSi||LA116_41==LEVELS||LA116_41==DIV||LA116_41==AT||LA116_41==ORDER||LA116_41==UNION||LA116_41==COLLATION||LA116_41==OR||LA116_41==DESCENDING||LA116_41==STABLE||LA116_41==WITHOUT||(LA116_41>=EXTERNAL && LA116_41<=RIGHTPARENTHESISSi)||LA116_41==RETURN||LA116_41==DEFAULT||LA116_41==AND||LA116_41==INTERSECT||LA116_41==TIMES||(LA116_41>=ASSIGNMENTOPERATOR && LA116_41<=FTCONTAINS)||(LA116_41>=MOD && LA116_41<=RIGHTBRACESi)||LA116_41==IN||(LA116_41>=EQ && LA116_41<=NODEAFTERSi)||(LA116_41>=WORDS && LA116_41<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_41==PLUSSi) ) {s = 25;}

                        else if ( (LA116_41==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_41);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA116_39 = input.LA(1);

                         
                        int index116_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_39==STARSi) ) {s = 23;}

                        else if ( (LA116_39==EOF||(LA116_39>=PIPESi && LA116_39<=WHERE)||(LA116_39>=LEFTBRACESi && LA116_39<=NOTEQUALSi)||(LA116_39>=ELSE && LA116_39<=LESSTHANSi)||(LA116_39>=FOR && LA116_39<=INSTANCE)||(LA116_39>=EXCEPT && LA116_39<=TO)||LA116_39==SATISFIES||LA116_39==SEMICOLONSi||LA116_39==EMPTY||LA116_39==CASE||LA116_39==MINUSSi||(LA116_39>=COMMASi && LA116_39<=LET)||LA116_39==SCORE||LA116_39==RIGHTBRACKETSi||LA116_39==LEVELS||LA116_39==DIV||LA116_39==AT||LA116_39==ORDER||LA116_39==UNION||LA116_39==COLLATION||LA116_39==OR||LA116_39==DESCENDING||LA116_39==STABLE||LA116_39==WITHOUT||(LA116_39>=EXTERNAL && LA116_39<=RIGHTPARENTHESISSi)||LA116_39==RETURN||LA116_39==DEFAULT||LA116_39==AND||LA116_39==INTERSECT||LA116_39==TIMES||(LA116_39>=ASSIGNMENTOPERATOR && LA116_39<=FTCONTAINS)||(LA116_39>=MOD && LA116_39<=RIGHTBRACESi)||LA116_39==IN||(LA116_39>=EQ && LA116_39<=NODEAFTERSi)||(LA116_39>=WORDS && LA116_39<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_39==PLUSSi) ) {s = 25;}

                        else if ( (LA116_39==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_39);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA116_128 = input.LA(1);

                         
                        int index116_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_128==LEFTPARENTHESISSi) && (synpred4())) {s = 269;}

                        else if ( (LA116_128==BIGGERTHANSi||LA116_128==RIGHTSELFTERMINATOR||LA116_128==S) ) {s = 24;}

                        else if ( (LA116_128==LEFTBRACKETSi) && (synpred4())) {s = 270;}

                        else if ( (LA116_128==SLASH||LA116_128==DOUBLESLASH) && (synpred4())) {s = 271;}

                        else if ( (LA116_128==CAST) && (synpred4())) {s = 272;}

                        else if ( (LA116_128==CASTABLE) && (synpred4())) {s = 273;}

                        else if ( (LA116_128==TREAT) && (synpred4())) {s = 274;}

                        else if ( (LA116_128==INSTANCE) && (synpred4())) {s = 275;}

                        else if ( (LA116_128==EXCEPT||LA116_128==INTERSECT) && (synpred4())) {s = 276;}

                        else if ( (LA116_128==PIPESi||LA116_128==UNION) && (synpred4())) {s = 277;}

                        else if ( (LA116_128==IDIV||LA116_128==DIV||LA116_128==STARSi||LA116_128==MOD) && (synpred4())) {s = 278;}

                        else if ( (LA116_128==MINUSSi||LA116_128==PLUSSi) && (synpred4())) {s = 279;}

                        else if ( (LA116_128==TO) && (synpred4())) {s = 280;}

                        else if ( (LA116_128==FTCONTAINS) && (synpred4())) {s = 281;}

                        else if ( (LA116_128==AND) && (synpred4())) {s = 58;}

                        else if ( (LA116_128==OR) && (synpred4())) {s = 59;}

                        else if ( (LA116_128==SEMICOLONSi) && (synpred4())) {s = 60;}

                        else if ( (LA116_128==COMMASi) && (synpred4())) {s = 282;}

                        else if ( (LA116_128==RIGHTBRACESi) && (synpred4())) {s = 283;}

                        else if ( (LA116_128==EOF) && (synpred4())) {s = 63;}

                        else if ( (LA116_128==RIGHTPARENTHESISSi) && (synpred4())) {s = 284;}

                        else if ( (LA116_128==RIGHTBRACKETSi) && (synpred4())) {s = 65;}

                        else if ( (LA116_128==WHERE) && (synpred4())) {s = 66;}

                        else if ( (LA116_128==ORDER) && (synpred4())) {s = 67;}

                        else if ( (LA116_128==STABLE) && (synpred4())) {s = 68;}

                        else if ( (LA116_128==RETURN) && (synpred4())) {s = 285;}

                        else if ( (LA116_128==FOR) && (synpred4())) {s = 69;}

                        else if ( (LA116_128==LET) && (synpred4())) {s = 70;}

                        else if ( (LA116_128==ASCENDING||LA116_128==DESCENDING) && (synpred4())) {s = 71;}

                        else if ( (LA116_128==EMPTY) && (synpred4())) {s = 72;}

                        else if ( (LA116_128==COLLATION) && (synpred4())) {s = 73;}

                        else if ( (LA116_128==SATISFIES) && (synpred4())) {s = 74;}

                        else if ( (LA116_128==DEFAULT) && (synpred4())) {s = 75;}

                        else if ( (LA116_128==CASE) && (synpred4())) {s = 76;}

                        else if ( (LA116_128==ELSE) && (synpred4())) {s = 77;}

                         
                        input.seek(index116_128);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA116_195 = input.LA(1);

                         
                        int index116_195 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_195==LEFTPARENTHESISSi) && (synpred4())) {s = 269;}

                        else if ( (LA116_195==LEFTBRACKETSi) && (synpred4())) {s = 270;}

                        else if ( (LA116_195==SLASH||LA116_195==DOUBLESLASH) && (synpred4())) {s = 271;}

                        else if ( (LA116_195==CAST) && (synpred4())) {s = 272;}

                        else if ( (LA116_195==CASTABLE) && (synpred4())) {s = 273;}

                        else if ( (LA116_195==TREAT) && (synpred4())) {s = 274;}

                        else if ( (LA116_195==INSTANCE) && (synpred4())) {s = 275;}

                        else if ( (LA116_195==EXCEPT||LA116_195==INTERSECT) && (synpred4())) {s = 276;}

                        else if ( (LA116_195==PIPESi||LA116_195==UNION) && (synpred4())) {s = 277;}

                        else if ( (LA116_195==IDIV||LA116_195==DIV||LA116_195==STARSi||LA116_195==MOD) && (synpred4())) {s = 278;}

                        else if ( (LA116_195==MINUSSi||LA116_195==PLUSSi) && (synpred4())) {s = 279;}

                        else if ( (LA116_195==TO) && (synpred4())) {s = 280;}

                        else if ( (LA116_195==FTCONTAINS) && (synpred4())) {s = 281;}

                        else if ( (LA116_195==AND) && (synpred4())) {s = 58;}

                        else if ( (LA116_195==OR) && (synpred4())) {s = 59;}

                        else if ( (LA116_195==SEMICOLONSi) && (synpred4())) {s = 60;}

                        else if ( (LA116_195==COMMASi) && (synpred4())) {s = 282;}

                        else if ( (LA116_195==RIGHTBRACESi) && (synpred4())) {s = 283;}

                        else if ( (LA116_195==EOF) && (synpred4())) {s = 63;}

                        else if ( (LA116_195==RIGHTPARENTHESISSi) && (synpred4())) {s = 284;}

                        else if ( (LA116_195==RIGHTBRACKETSi) && (synpred4())) {s = 65;}

                        else if ( (LA116_195==WHERE) && (synpred4())) {s = 66;}

                        else if ( (LA116_195==ORDER) && (synpred4())) {s = 67;}

                        else if ( (LA116_195==STABLE) && (synpred4())) {s = 68;}

                        else if ( (LA116_195==RETURN) && (synpred4())) {s = 285;}

                        else if ( (LA116_195==FOR) && (synpred4())) {s = 69;}

                        else if ( (LA116_195==LET) && (synpred4())) {s = 70;}

                        else if ( (LA116_195==ASCENDING||LA116_195==DESCENDING) && (synpred4())) {s = 71;}

                        else if ( (LA116_195==EMPTY) && (synpred4())) {s = 72;}

                        else if ( (LA116_195==COLLATION) && (synpred4())) {s = 73;}

                        else if ( (LA116_195==SATISFIES) && (synpred4())) {s = 74;}

                        else if ( (LA116_195==DEFAULT) && (synpred4())) {s = 75;}

                        else if ( (LA116_195==CASE) && (synpred4())) {s = 76;}

                        else if ( (LA116_195==ELSE) && (synpred4())) {s = 77;}

                        else if ( (LA116_195==BIGGERTHANSi||LA116_195==RIGHTSELFTERMINATOR||LA116_195==S) ) {s = 24;}

                         
                        input.seek(index116_195);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA116_23 = input.LA(1);

                         
                        int index116_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_23==MINUSSi||LA116_23==PLUSSi) ) {s = 44;}

                        else if ( (LA116_23==DOLLARSi||(LA116_23>=LEFTPRAGMA && LA116_23<=DOCUMENTNODE)||LA116_23==SLASH||LA116_23==PROCESSING_INSTRUCTION||LA116_23==DOCUMENT||LA116_23==VALIDATE||LA116_23==SCHEMAATTRIBUTE||LA116_23==DOUBLESLASH||LA116_23==LEFTXMLCOMMENT||LA116_23==TEXT||LA116_23==UNORDERED||LA116_23==LEFTPITARGET||LA116_23==COMMENT||(LA116_23>=ELEMENT && LA116_23<=LEFTPARENTHESISSi)||LA116_23==ATSi||LA116_23==ATTRIBUTE||LA116_23==NODE||LA116_23==SCHEMAELEMENT||LA116_23==CHILD||(LA116_23>=DESCENDANT && LA116_23<=DOTDOT)||(LA116_23>=IntegerLiteral && LA116_23<=DoubleLiteral)||LA116_23==StringLiteral||(LA116_23>=NCName && LA116_23<=QName)) ) {s = 24;}

                        else if ( (LA116_23==LESSTHANSi) ) {s = 45;}

                        else if ( (LA116_23==STARSi) ) {s = 46;}

                        else if ( (LA116_23==LEFTBRACESi) && (synpred4())) {s = 47;}

                        else if ( (LA116_23==EXTERNAL) && (synpred4())) {s = 48;}

                        else if ( (LA116_23==RETURN) && (synpred4())) {s = 49;}

                        else if ( (LA116_23==EXCEPT||LA116_23==INTERSECT) && (synpred4())) {s = 50;}

                        else if ( (LA116_23==PIPESi||LA116_23==UNION) && (synpred4())) {s = 51;}

                        else if ( (LA116_23==IDIV||LA116_23==DIV||LA116_23==MOD) && (synpred4())) {s = 52;}

                        else if ( (LA116_23==TO) && (synpred4())) {s = 53;}

                        else if ( (LA116_23==FTCONTAINS) && (synpred4())) {s = 54;}

                        else if ( ((LA116_23>=EQ && LA116_23<=GE)) && (synpred4())) {s = 55;}

                        else if ( ((LA116_23>=BIGGERTHANSi && LA116_23<=LESSTHANOREQUALSi)||(LA116_23>=EQUALSi && LA116_23<=NOTEQUALSi)) && (synpred4())) {s = 56;}

                        else if ( ((LA116_23>=IS && LA116_23<=NODEAFTERSi)) && (synpred4())) {s = 57;}

                        else if ( (LA116_23==AND) && (synpred4())) {s = 58;}

                        else if ( (LA116_23==OR) && (synpred4())) {s = 59;}

                        else if ( (LA116_23==SEMICOLONSi) && (synpred4())) {s = 60;}

                        else if ( (LA116_23==COMMASi) && (synpred4())) {s = 61;}

                        else if ( (LA116_23==RIGHTBRACESi) && (synpred4())) {s = 62;}

                        else if ( (LA116_23==EOF) && (synpred4())) {s = 63;}

                        else if ( (LA116_23==RIGHTPARENTHESISSi) && (synpred4())) {s = 64;}

                        else if ( (LA116_23==RIGHTBRACKETSi) && (synpred4())) {s = 65;}

                        else if ( (LA116_23==WHERE) && (synpred4())) {s = 66;}

                        else if ( (LA116_23==ORDER) && (synpred4())) {s = 67;}

                        else if ( (LA116_23==STABLE) && (synpred4())) {s = 68;}

                        else if ( (LA116_23==FOR) && (synpred4())) {s = 69;}

                        else if ( (LA116_23==LET) && (synpred4())) {s = 70;}

                        else if ( (LA116_23==ASCENDING||LA116_23==DESCENDING) && (synpred4())) {s = 71;}

                        else if ( (LA116_23==EMPTY) && (synpred4())) {s = 72;}

                        else if ( (LA116_23==COLLATION) && (synpred4())) {s = 73;}

                        else if ( (LA116_23==SATISFIES) && (synpred4())) {s = 74;}

                        else if ( (LA116_23==DEFAULT) && (synpred4())) {s = 75;}

                        else if ( (LA116_23==CASE) && (synpred4())) {s = 76;}

                        else if ( (LA116_23==ELSE) && (synpred4())) {s = 77;}

                        else if ( (LA116_23==WITHOUT) && (synpred4())) {s = 78;}

                        else if ( (LA116_23==TIMES) && (synpred4())) {s = 79;}

                        else if ( ((LA116_23>=WORDS && LA116_23<=PARAGRAPHS)) && (synpred4())) {s = 80;}

                        else if ( (LA116_23==LEVELS) && (synpred4())) {s = 81;}

                        else if ( (LA116_23==INSTANCE) && (synpred4())) {s = 82;}

                        else if ( (LA116_23==ASSIGNMENTOPERATOR) && (synpred4())) {s = 83;}

                        else if ( (LA116_23==AT) && (synpred4())) {s = 84;}

                        else if ( (LA116_23==SCORE) && (synpred4())) {s = 85;}

                        else if ( (LA116_23==IN) && (synpred4())) {s = 86;}

                         
                        input.seek(index116_23);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA116_125 = input.LA(1);

                         
                        int index116_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_125);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA116_105 = input.LA(1);

                         
                        int index116_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_105);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA116_94 = input.LA(1);

                         
                        int index116_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_94==STARSi) ) {s = 23;}

                        else if ( (LA116_94==EOF||(LA116_94>=PIPESi && LA116_94<=WHERE)||(LA116_94>=LEFTBRACESi && LA116_94<=NOTEQUALSi)||(LA116_94>=ELSE && LA116_94<=LESSTHANSi)||(LA116_94>=FOR && LA116_94<=INSTANCE)||(LA116_94>=EXCEPT && LA116_94<=TO)||LA116_94==SATISFIES||LA116_94==SEMICOLONSi||LA116_94==EMPTY||LA116_94==CASE||LA116_94==MINUSSi||(LA116_94>=COMMASi && LA116_94<=LET)||LA116_94==SCORE||LA116_94==RIGHTBRACKETSi||LA116_94==LEVELS||LA116_94==DIV||LA116_94==AT||LA116_94==ORDER||LA116_94==UNION||LA116_94==COLLATION||LA116_94==OR||LA116_94==DESCENDING||LA116_94==STABLE||LA116_94==WITHOUT||(LA116_94>=EXTERNAL && LA116_94<=RIGHTPARENTHESISSi)||LA116_94==RETURN||LA116_94==DEFAULT||LA116_94==AND||LA116_94==INTERSECT||LA116_94==TIMES||(LA116_94>=ASSIGNMENTOPERATOR && LA116_94<=FTCONTAINS)||(LA116_94>=MOD && LA116_94<=RIGHTBRACESi)||LA116_94==IN||(LA116_94>=EQ && LA116_94<=NODEAFTERSi)||(LA116_94>=WORDS && LA116_94<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_94==PLUSSi) ) {s = 25;}

                        else if ( (LA116_94==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_94);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA116_35 = input.LA(1);

                         
                        int index116_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_35==STARSi) ) {s = 23;}

                        else if ( (LA116_35==EOF||(LA116_35>=PIPESi && LA116_35<=WHERE)||(LA116_35>=LEFTBRACESi && LA116_35<=NOTEQUALSi)||(LA116_35>=ELSE && LA116_35<=LESSTHANSi)||(LA116_35>=FOR && LA116_35<=INSTANCE)||(LA116_35>=EXCEPT && LA116_35<=TO)||LA116_35==SATISFIES||LA116_35==SEMICOLONSi||LA116_35==EMPTY||LA116_35==CASE||LA116_35==MINUSSi||(LA116_35>=COMMASi && LA116_35<=LET)||LA116_35==SCORE||LA116_35==RIGHTBRACKETSi||LA116_35==LEVELS||LA116_35==DIV||LA116_35==AT||LA116_35==ORDER||LA116_35==UNION||LA116_35==COLLATION||LA116_35==OR||LA116_35==DESCENDING||LA116_35==STABLE||LA116_35==WITHOUT||(LA116_35>=EXTERNAL && LA116_35<=RIGHTPARENTHESISSi)||LA116_35==RETURN||LA116_35==DEFAULT||LA116_35==AND||LA116_35==INTERSECT||LA116_35==TIMES||(LA116_35>=ASSIGNMENTOPERATOR && LA116_35<=FTCONTAINS)||(LA116_35>=MOD && LA116_35<=RIGHTBRACESi)||LA116_35==IN||(LA116_35>=EQ && LA116_35<=NODEAFTERSi)||(LA116_35>=WORDS && LA116_35<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_35==PLUSSi) ) {s = 25;}

                        else if ( (LA116_35==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_35);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA116_95 = input.LA(1);

                         
                        int index116_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_95==EOF||(LA116_95>=PIPESi && LA116_95<=WHERE)||(LA116_95>=LEFTBRACESi && LA116_95<=NOTEQUALSi)||(LA116_95>=ELSE && LA116_95<=LESSTHANSi)||(LA116_95>=FOR && LA116_95<=INSTANCE)||(LA116_95>=EXCEPT && LA116_95<=TO)||LA116_95==SATISFIES||LA116_95==SEMICOLONSi||LA116_95==EMPTY||LA116_95==CASE||LA116_95==MINUSSi||(LA116_95>=COMMASi && LA116_95<=LET)||LA116_95==SCORE||LA116_95==RIGHTBRACKETSi||LA116_95==LEVELS||LA116_95==DIV||LA116_95==AT||LA116_95==ORDER||LA116_95==UNION||LA116_95==COLLATION||LA116_95==OR||LA116_95==DESCENDING||LA116_95==STABLE||LA116_95==WITHOUT||(LA116_95>=EXTERNAL && LA116_95<=RIGHTPARENTHESISSi)||LA116_95==RETURN||LA116_95==DEFAULT||LA116_95==AND||LA116_95==INTERSECT||LA116_95==TIMES||(LA116_95>=ASSIGNMENTOPERATOR && LA116_95<=FTCONTAINS)||(LA116_95>=MOD && LA116_95<=RIGHTBRACESi)||LA116_95==IN||(LA116_95>=EQ && LA116_95<=NODEAFTERSi)||(LA116_95>=WORDS && LA116_95<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_95==STARSi) ) {s = 23;}

                        else if ( (LA116_95==PLUSSi) ) {s = 25;}

                        else if ( (LA116_95==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_95);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA116_103 = input.LA(1);

                         
                        int index116_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4()) ) {s = 191;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index116_103);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA116_32 = input.LA(1);

                         
                        int index116_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA116_32==EOF||(LA116_32>=PIPESi && LA116_32<=WHERE)||(LA116_32>=LEFTBRACESi && LA116_32<=NOTEQUALSi)||(LA116_32>=ELSE && LA116_32<=LESSTHANSi)||(LA116_32>=FOR && LA116_32<=INSTANCE)||(LA116_32>=EXCEPT && LA116_32<=TO)||LA116_32==SATISFIES||LA116_32==SEMICOLONSi||LA116_32==EMPTY||LA116_32==CASE||LA116_32==MINUSSi||(LA116_32>=COMMASi && LA116_32<=LET)||LA116_32==SCORE||LA116_32==RIGHTBRACKETSi||LA116_32==LEVELS||LA116_32==DIV||LA116_32==AT||LA116_32==ORDER||LA116_32==UNION||LA116_32==COLLATION||LA116_32==OR||LA116_32==DESCENDING||LA116_32==STABLE||LA116_32==WITHOUT||(LA116_32>=EXTERNAL && LA116_32<=RIGHTPARENTHESISSi)||LA116_32==RETURN||LA116_32==DEFAULT||LA116_32==AND||LA116_32==INTERSECT||LA116_32==TIMES||(LA116_32>=ASSIGNMENTOPERATOR && LA116_32<=FTCONTAINS)||(LA116_32>=MOD && LA116_32<=RIGHTBRACESi)||LA116_32==IN||(LA116_32>=EQ && LA116_32<=NODEAFTERSi)||(LA116_32>=WORDS && LA116_32<=PARAGRAPHS)) ) {s = 24;}

                        else if ( (LA116_32==STARSi) ) {s = 23;}

                        else if ( (LA116_32==PLUSSi) ) {s = 25;}

                        else if ( (LA116_32==QUESTIONMARKSi) && (synpred4())) {s = 26;}

                         
                        input.seek(index116_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_Name_in_piTarget3858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_versionDecl_in_module4211 = new BitSet(new long[]{0x5C0004902E240000L,0xC141129280240041L,0x0007FFA0010C0A04L,0x0000000001800870L});
    public static final BitSet FOLLOW_libraryModule_in_module4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mainModule_in_module4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_XQUERY_in_versionDecl4244 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_VERSION_in_versionDecl4246 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl4248 = new BitSet(new long[]{0x0010000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_ENCODING_in_versionDecl4252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_versionDecl4254 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_separator_in_versionDecl4259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prolog_in_mainModule4284 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_queryBody_in_mainModule4286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleDecl_in_libraryModule4308 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_prolog_in_libraryModule4310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MODULE_in_moduleDecl4335 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleDecl4337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_moduleDecl4339 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_moduleDecl4341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleDecl4343 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_separator_in_moduleDecl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultNamespaceDecl_in_prolog4376 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_setter_in_prolog4380 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_namespaceDecl_in_prolog4384 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_importStmt_in_prolog4388 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_separator_in_prolog4391 = new BitSet(new long[]{0x0800000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_varDecl_in_prolog4397 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_functionDecl_in_prolog4401 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_optionDecl_in_prolog4405 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ftOptionDecl_in_prolog4409 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_separator_in_prolog4412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_boundarySpaceDecl_in_setter4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_defaultCollationDecl_in_setter4447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseURIDecl_in_setter4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructionDecl_in_setter4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderingModeDecl_in_setter4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_emptyOrderDecl_in_setter4463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_copyNamespacesDecl_in_setter4467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaImport_in_importStmt4494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_moduleImport_in_importStmt4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMICOLONSi_in_separator4524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_namespaceDecl4546 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_namespaceDecl4548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_namespaceDecl4550 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_namespaceDecl4552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_namespaceDecl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_boundarySpaceDecl4572 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_BOUNDARYSPACE_in_boundarySpaceDecl4574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200010L});
    public static final BitSet FOLLOW_set_in_boundarySpaceDecl4576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultNamespaceDecl4597 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultNamespaceDecl4599 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_defaultNamespaceDecl4601 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_defaultNamespaceDecl4609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultNamespaceDecl4611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_optionDecl4636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_OPTION_in_optionDecl4638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_optionDecl4640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_optionDecl4642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_ftOptionDecl4665 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_FTOPTION_in_ftOptionDecl4667 = new BitSet(new long[]{0x0200000080000000L,0x0006800000000600L,0x0000000000400000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftOptionDecl4669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_orderingModeDecl4688 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ORDERING_in_orderingModeDecl4690 = new BitSet(new long[]{0x0000000004000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_set_in_orderingModeDecl4692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_emptyOrderDecl4719 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_emptyOrderDecl4721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ORDER_in_emptyOrderDecl4723 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_EMPTY_in_emptyOrderDecl4725 = new BitSet(new long[]{0x0000000000000000L,0x0000000100002000L});
    public static final BitSet FOLLOW_set_in_emptyOrderDecl4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_copyNamespacesDecl4750 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_COPYNAMESPACES_in_copyNamespacesDecl4752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_preserveMode_in_copyNamespacesDecl4754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_copyNamespacesDecl4756 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_inheritMode_in_copyNamespacesDecl4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_preserveMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_inheritMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_defaultCollationDecl4828 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_defaultCollationDecl4830 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLLATION_in_defaultCollationDecl4832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_defaultCollationDecl4834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_baseURIDecl4858 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_BASEURI_in_baseURIDecl4860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_baseURIDecl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_schemaImport4885 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_SCHEMA_in_schemaImport4887 = new BitSet(new long[]{0x0000000000000000L,0x0200002000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_schemaPrefix_in_schemaImport4889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport4892 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_AT_in_schemaImport4895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport4897 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_schemaImport4900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_schemaImport4902 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix4930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_schemaPrefix4932 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_schemaPrefix4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_schemaPrefix4940 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_ELEMENT_in_schemaPrefix4942 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_NAMESPACE_in_schemaPrefix4944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IMPORT_in_moduleImport4968 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_MODULE_in_moduleImport4970 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_NAMESPACE_in_moduleImport4973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_moduleImport4975 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_moduleImport4977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport4981 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_AT_in_moduleImport4984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport4986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_moduleImport4989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_moduleImport4991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_DECLARE_in_varDecl5023 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_VARIABLE_in_varDecl5025 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_varDecl5027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_varDecl5029 = new BitSet(new long[]{0x0000000000000000L,0x0008004000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_typeDeclaration_in_varDecl5031 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGNMENTOPERATOR_in_varDecl5036 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_varDecl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_varDecl5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_constructionDecl5063 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_CONSTRUCTION_in_constructionDecl5065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200010L});
    public static final BitSet FOLLOW_set_in_constructionDecl5067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DECLARE_in_functionDecl5096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_FUNCTION_in_functionDecl5098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_functionDecl5100 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_functionDecl5102 = new BitSet(new long[]{0x0000000000200000L,0x0010000000000000L});
    public static final BitSet FOLLOW_paramList_in_functionDecl5104 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_functionDecl5107 = new BitSet(new long[]{0x0000000000004000L,0x0008004000000000L});
    public static final BitSet FOLLOW_AS_in_functionDecl5110 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000001000000L});
    public static final BitSet FOLLOW_sequenceType_in_functionDecl5112 = new BitSet(new long[]{0x0000000000004000L,0x0008000000000000L});
    public static final BitSet FOLLOW_enclosedExpr_in_functionDecl5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTERNAL_in_functionDecl5121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_paramList5148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_paramList5151 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_param_in_paramList5153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_DOLLARSi_in_param5185 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_param5187 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_typeDeclaration_in_param5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_enclosedExpr5213 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_enclosedExpr5215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_enclosedExpr5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_queryBody5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_exprSingle_in_expr5274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_expr5277 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_expr5279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_fLWORExpr_in_exprSingle5306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifiedExpr_in_exprSingle5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_typeswitchExpr_in_exprSingle5378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_exprSingle5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_exprSingle5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forClause_in_fLWORExpr5477 = new BitSet(new long[]{0x0000040000000400L,0x0080040000400040L});
    public static final BitSet FOLLOW_letClause_in_fLWORExpr5481 = new BitSet(new long[]{0x0000040000000400L,0x0080040000400040L});
    public static final BitSet FOLLOW_whereClause_in_fLWORExpr5485 = new BitSet(new long[]{0x0000000000000000L,0x0080040000400000L});
    public static final BitSet FOLLOW_orderByClause_in_fLWORExpr5488 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RETURN_in_fLWORExpr5491 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_fLWORExpr5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forClause5519 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause5521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_forClause5523 = new BitSet(new long[]{0x0000000000000000L,0x0000004000100100L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause5525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100100L,0x0000000000800000L});
    public static final BitSet FOLLOW_positionalVar_in_forClause5528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000800000L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause5531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_forClause5534 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_forClause5536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_forClause5539 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_forClause5541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_forClause5543 = new BitSet(new long[]{0x0000000000000000L,0x0000004000100100L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeDeclaration_in_forClause5545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100100L,0x0000000000800000L});
    public static final BitSet FOLLOW_positionalVar_in_forClause5548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L,0x0000000000800000L});
    public static final BitSet FOLLOW_ftScoreVar_in_forClause5551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_forClause5554 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_forClause5556 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_AT_in_positionalVar5580 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_positionalVar5582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_positionalVar5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCORE_in_ftScoreVar5609 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_ftScoreVar5611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_ftScoreVar5613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LET_in_letClause5641 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause5643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_letClause5645 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_typeDeclaration_in_letClause5647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_LET_in_letClause5654 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_SCORE_in_letClause5656 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause5658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_letClause5660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGNMENTOPERATOR_in_letClause5664 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_letClause5666 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_letClause5669 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000100L});
    public static final BitSet FOLLOW_DOLLARSi_in_letClause5673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_letClause5675 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_typeDeclaration_in_letClause5677 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ftScoreVar_in_letClause5683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_ASSIGNMENTOPERATOR_in_letClause5686 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_letClause5688 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_WHERE_in_whereClause5714 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_whereClause5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause5740 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_BY_in_orderByClause5742 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_STABLE_in_orderByClause5748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_ORDER_in_orderByClause5750 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_BY_in_orderByClause5752 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_orderSpecList_in_orderByClause5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList5778 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_orderSpecList5781 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_orderSpec_in_orderSpecList5783 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_exprSingle_in_orderSpec5811 = new BitSet(new long[]{0x0080000000000102L,0x0000000804000000L});
    public static final BitSet FOLLOW_orderModifier_in_orderSpec5813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_orderModifier5835 = new BitSet(new long[]{0x0080000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_EMPTY_in_orderModifier5845 = new BitSet(new long[]{0x0000000000000000L,0x0000000100002000L});
    public static final BitSet FOLLOW_set_in_orderModifier5847 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_COLLATION_in_orderModifier5858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_orderModifier5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_quantifiedExpr5883 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr5891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr5893 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr5895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr5898 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr5900 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_quantifiedExpr5903 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_DOLLARSi_in_quantifiedExpr5905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_quantifiedExpr5907 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_typeDeclaration_in_quantifiedExpr5909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_quantifiedExpr5912 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr5914 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_SATISFIES_in_quantifiedExpr5918 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_quantifiedExpr5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPESWITCH_in_typeswitchExpr5941 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_typeswitchExpr5943 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_typeswitchExpr5945 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_typeswitchExpr5947 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_caseClause_in_typeswitchExpr5949 = new BitSet(new long[]{0x0200000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_typeswitchExpr5952 = new BitSet(new long[]{0x0000000000200000L,0x0080000000000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_typeswitchExpr5955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_typeswitchExpr5957 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RETURN_in_typeswitchExpr5961 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_typeswitchExpr5963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_caseClause5988 = new BitSet(new long[]{0x0400020008200000L,0x4100020000200002L,0x0000000001040800L,0x0000000001000000L});
    public static final BitSet FOLLOW_DOLLARSi_in_caseClause5991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_caseClause5993 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AS_in_caseClause5995 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000001000000L});
    public static final BitSet FOLLOW_sequenceType_in_caseClause5999 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_RETURN_in_caseClause6001 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_caseClause6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr6032 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_ifExpr6034 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_ifExpr6036 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_ifExpr6038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_THEN_in_ifExpr6040 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr6042 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr6044 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_ifExpr6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr6075 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_OR_in_orExpr6079 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_andExpr_in_orExpr6081 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr6112 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_andExpr6116 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_comparisonExpr_in_andExpr6118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr6142 = new BitSet(new long[]{0x00000000200180E2L,0x0000000000000000L,0x00000007FC000000L});
    public static final BitSet FOLLOW_valueComp_in_comparisonExpr6147 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_generalComp_in_comparisonExpr6151 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_nodeComp_in_comparisonExpr6155 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_ftContainsExpr_in_comparisonExpr6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rangeExpr_in_ftContainsExpr6182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_FTCONTAINS_in_ftContainsExpr6186 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftSelection_in_ftContainsExpr6188 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_ftIgnoreOption_in_ftContainsExpr6190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr6220 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_TO_in_rangeExpr6224 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_additiveExpr_in_rangeExpr6226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr6252 = new BitSet(new long[]{0x1000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_set_in_additiveExpr6256 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_multiplicativeExpr_in_additiveExpr6264 = new BitSet(new long[]{0x1000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr6284 = new BitSet(new long[]{0x0000000000000202L,0x0000001000020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_set_in_multiplicativeExpr6288 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_unionExpr_in_multiplicativeExpr6304 = new BitSet(new long[]{0x0000000000000202L,0x0000001000020000L,0x0000000000010000L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr6333 = new BitSet(new long[]{0x0000000000000012L,0x0000000001000000L});
    public static final BitSet FOLLOW_set_in_unionExpr6337 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_intersectExceptExpr_in_unionExpr6345 = new BitSet(new long[]{0x0000000000000012L,0x0000000001000000L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr6364 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_set_in_intersectExceptExpr6368 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_instanceofExpr_in_intersectExceptExpr6376 = new BitSet(new long[]{0x0000200000000002L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_treatExpr_in_instanceofExpr6400 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_INSTANCE_in_instanceofExpr6404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_OF_in_instanceofExpr6406 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000001000000L});
    public static final BitSet FOLLOW_sequenceType_in_instanceofExpr6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castableExpr_in_treatExpr6437 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_TREAT_in_treatExpr6441 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AS_in_treatExpr6443 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000001000000L});
    public static final BitSet FOLLOW_sequenceType_in_treatExpr6445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpr_in_castableExpr6471 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_CASTABLE_in_castableExpr6475 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AS_in_castableExpr6477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_singleType_in_castableExpr6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpr_in_castExpr6509 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_CAST_in_castExpr6513 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_AS_in_castExpr6515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_singleType_in_castExpr6517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unaryExpr6546 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_valueExpr_in_unaryExpr6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_validateExpr_in_valueExpr6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pathExpr_in_valueExpr6585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_extensionExpr_in_valueExpr6589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_generalComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_valueComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_nodeComp0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VALIDATE_in_validateExpr6737 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_validationMode_in_validateExpr6739 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_validateExpr6742 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_validateExpr6744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_validateExpr6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_validationMode0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_extensionExpr6793 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_extensionExpr6796 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010E0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_extensionExpr6798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_extensionExpr6801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPRAGMA_in_pragma6830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_S_in_pragma6832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_pragma6835 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_S_in_pragma6838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_pragmaContents_in_pragma6840 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RIGHTPRAGMA_in_pragma6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZeroOrMoreChar_in_pragmaContents6866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESLASH_in_pathExpr6905 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_pathExpr6928 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_pathExpr6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relativePathExpr_in_pathExpr6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr6973 = new BitSet(new long[]{0x0000001000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_set_in_relativePathExpr6976 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_stepExpr_in_relativePathExpr6984 = new BitSet(new long[]{0x0000001000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_filterExpr_in_stepExpr7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_axisStep_in_stepExpr7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseStep_in_axisStep7045 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_forwardStep_in_axisStep7049 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_predicateList_in_axisStep7052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forwardAxis_in_forwardStep7077 = new BitSet(new long[]{0x0400000008000000L,0x4100021000200000L,0x0000000001040800L,0x0000000001800000L});
    public static final BitSet FOLLOW_nodeTest_in_forwardStep7079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevForwardStep_in_forwardStep7084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_forwardAxis7109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_forwardAxis7157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATSi_in_abbrevForwardStep7178 = new BitSet(new long[]{0x0400000008000000L,0x4100021000200000L,0x0000000001040800L,0x0000000001800000L});
    public static final BitSet FOLLOW_nodeTest_in_abbrevForwardStep7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_reverseAxis_in_reverseStep7206 = new BitSet(new long[]{0x0400000008000000L,0x4100021000200000L,0x0000000001040800L,0x0000000001800000L});
    public static final BitSet FOLLOW_nodeTest_in_reverseStep7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_abbrevReverseStep_in_reverseStep7213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_reverseAxis7237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_DOUBLECOLON_in_reverseAxis7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOTDOT_in_abbrevReverseStep7295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_nodeTest7322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nameTest_in_nodeTest7326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_nameTest7353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wildcard_in_nameTest7357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7397 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_wildcard7401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NCName_in_wildcard7449 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLONSi_in_wildcard7451 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_STARSi_in_wildcard7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryExpr_in_filterExpr7482 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_predicateList_in_filterExpr7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predicate_in_predicateList7506 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static final BitSet FOLLOW_LEFTBRACKETSi_in_predicate7533 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_predicate7535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_RIGHTBRACKETSi_in_predicate7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryExpr7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varRef_in_primaryExpr7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parenthesizedExpr_in_primaryExpr7569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_contextItemExpr_in_primaryExpr7573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_primaryExpr7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderedExpr_in_primaryExpr7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unorderedExpr_in_primaryExpr7585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constructor_in_primaryExpr7589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal7617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal7621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_numericLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOLLARSi_in_varRef7679 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_varName_in_varRef7681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_varName7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_parenthesizedExpr7727 = new BitSet(new long[]{0x540004902E240000L,0xC111129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_parenthesizedExpr7729 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_parenthesizedExpr7732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_contextItemExpr7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_orderedExpr7776 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_orderedExpr7778 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_orderedExpr7780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_orderedExpr7782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNORDERED_in_unorderedExpr7804 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_unorderedExpr7806 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_unorderedExpr7808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_unorderedExpr7810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_functionCall7833 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_functionCall7835 = new BitSet(new long[]{0x540004902E240000L,0xC111129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall7838 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_functionCall7841 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_exprSingle_in_functionCall7843 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_functionCall7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_constructor7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_computedConstructor_in_constructor7993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirElemConstructor_in_directConstructor8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirCommentConstructor_in_directConstructor8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dirPIConstructor_in_directConstructor8083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHANSi_in_dirElemConstructor8100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_dirElemConstructor8102 = new BitSet(new long[]{0x2000000000000020L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_dirAttributeList_in_dirElemConstructor8104 = new BitSet(new long[]{0x2000000000000020L});
    public static final BitSet FOLLOW_RIGHTSELFTERMINATOR_in_dirElemConstructor8107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BIGGERTHANSi_in_dirElemConstructor8112 = new BitSet(new long[]{0x8000000020004000L,0x1001008008000000L,0x0000000002000000L,0x0000000000004180L});
    public static final BitSet FOLLOW_dirElemContent_in_dirElemConstructor8114 = new BitSet(new long[]{0x8000000020004000L,0x1001008008000000L,0x0000000002000000L,0x0000000000004180L});
    public static final BitSet FOLLOW_LEFTENDTAG_in_dirElemConstructor8117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_dirElemConstructor8119 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_S_in_dirElemConstructor8121 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_BIGGERTHANSi_in_dirElemConstructor8124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000009000000L});
    public static final BitSet FOLLOW_QName_in_dirAttributeList8151 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8153 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_EQUALSi_in_dirAttributeList8156 = new BitSet(new long[]{0x0020100000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_S_in_dirAttributeList8158 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_dirAttributeValue_in_dirAttributeList8161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_DOUBLEQUOTESi_in_dirAttributeValue8186 = new BitSet(new long[]{0x0000100000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000008380L});
    public static final BitSet FOLLOW_EscapeQuot_in_dirAttributeValue8189 = new BitSet(new long[]{0x0000100000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000008380L});
    public static final BitSet FOLLOW_quotAttrValueContent_in_dirAttributeValue8193 = new BitSet(new long[]{0x0000100000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000008380L});
    public static final BitSet FOLLOW_DOUBLEQUOTESi_in_dirAttributeValue8197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLEQUOTE_in_dirAttributeValue8235 = new BitSet(new long[]{0x0020000000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000010580L});
    public static final BitSet FOLLOW_EscapeApos_in_dirAttributeValue8238 = new BitSet(new long[]{0x0020000000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000010580L});
    public static final BitSet FOLLOW_aposAttrValueContent_in_dirAttributeValue8242 = new BitSet(new long[]{0x0020000000004000L,0x1000000008000000L,0x0000000000000000L,0x0000000000010580L});
    public static final BitSet FOLLOW_SINGLEQUOTE_in_dirAttributeValue8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QuotAttrContentChar_in_quotAttrValueContent8261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_quotAttrValueContent8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AposAttrContentChar_in_aposAttrValueContent8312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_aposAttrValueContent8348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_directConstructor_in_dirElemContent8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cDataSection_in_dirElemContent8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commonContent_in_dirElemContent8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ElementContentChar_in_dirElemContent8477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PredefinedEntityRef_in_commonContent8499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharRef_in_commonContent8503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELEFTBRACES_in_commonContent8507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLERIGHTBRACES_in_commonContent8511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enclosedExpr_in_commonContent8515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTXMLCOMMENT_in_dirCommentConstructor8529 = new BitSet(new long[]{0x1000000000000000L,0x0020000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_dirCommentContents_in_dirCommentConstructor8531 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_RIGHTXMLCOMMENT_in_dirCommentConstructor8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharNotMinus_in_dirCommentContents8560 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_MINUSSi_in_dirCommentContents8565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_CharNotMinus_in_dirCommentContents8567 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_LEFTPITARGET_in_dirPIConstructor8593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_piTarget_in_dirPIConstructor8595 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_S_in_dirPIConstructor8598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_dirPIContents_in_dirPIConstructor8600 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RIGHTPITARGET_in_dirPIConstructor8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZeroOrMoreChar_in_dirPIContents8634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTCDATA_in_cDataSection8661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_cDataSectionContents_in_cDataSection8663 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_RIGHTCDATA_in_cDataSection8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ZeroOrMoreChar_in_cDataSectionContents8689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compDocConstructor_in_computedConstructor8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compElemConstructor_in_computedConstructor8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compAttrConstructor_in_computedConstructor8781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compTextConstructor_in_computedConstructor8817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compCommentConstructor_in_computedConstructor8853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compPIConstructor_in_computedConstructor8889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENT_in_compDocConstructor8906 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compDocConstructor8908 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_compDocConstructor8910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compDocConstructor8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_compElemConstructor8928 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_compElemConstructor8931 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compElemConstructor8936 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_compElemConstructor8938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compElemConstructor8940 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compElemConstructor8944 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010E0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_contentExpr_in_compElemConstructor8946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compElemConstructor8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_contentExpr8973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_compAttrConstructor8989 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_compAttrConstructor8992 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compAttrConstructor8997 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor8999 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compAttrConstructor9001 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compAttrConstructor9005 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010E0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_compAttrConstructor9007 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compAttrConstructor9010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_compTextConstructor9026 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compTextConstructor9028 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_compTextConstructor9030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compTextConstructor9032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_compCommentConstructor9045 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compCommentConstructor9047 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_compCommentConstructor9049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compCommentConstructor9051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_compPIConstructor9069 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_compPIConstructor9072 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compPIConstructor9077 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor9079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compPIConstructor9081 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_compPIConstructor9085 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010E0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_compPIConstructor9087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_compPIConstructor9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_singleType9115 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_QUESTIONMARKSi_in_singleType9117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_typeDeclaration9138 = new BitSet(new long[]{0x0400020008000000L,0x4100020000200002L,0x0000000001040800L,0x0000000001000000L});
    public static final BitSet FOLLOW_sequenceType_in_typeDeclaration9140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType9174 = new BitSet(new long[]{0x0000000000000000L,0x0000001000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_sequenceType9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_sequenceType9187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_SEQUENCE_in_sequenceType9198 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_sequenceType9200 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_sequenceType9202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_occurrenceIndicator0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_kindTest_in_itemType9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ITEM_in_itemType9263 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_itemType9265 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_itemType9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicType_in_itemType9272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_atomicType9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_documentTest_in_kindTest9325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementTest_in_kindTest9361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeTest_in_kindTest9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaElementTest_in_kindTest9433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_schemaAttributeTest_in_kindTest9469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_piTest_in_kindTest9505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_commentTest_in_kindTest9541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textTest_in_kindTest9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anyKindTest_in_kindTest9613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NODE_in_anyKindTest9637 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_anyKindTest9639 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_anyKindTest9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOCUMENTNODE_in_documentTest9664 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_documentTest9666 = new BitSet(new long[]{0x0000000000000000L,0x4010000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementTest_in_documentTest9669 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_schemaElementTest_in_documentTest9673 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_documentTest9677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_textTest9704 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_textTest9706 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_textTest9708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMENT_in_commentTest9732 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_commentTest9734 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_commentTest9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PROCESSING_INSTRUCTION_in_piTest9765 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_piTest9767 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000000000L,0x0000000000800800L});
    public static final BitSet FOLLOW_set_in_piTest9769 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_piTest9778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeTest9800 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_attributeTest9802 = new BitSet(new long[]{0x0000000000000000L,0x0010001000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_attribNameOrWildcard_in_attributeTest9805 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_attributeTest9808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeName_in_attributeTest9810 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_attributeTest9816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attribNameOrWildcard9831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_attribNameOrWildcard9835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAATTRIBUTE_in_schemaAttributeTest9851 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_schemaAttributeTest9853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_attributeDeclaration_in_schemaAttributeTest9855 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_schemaAttributeTest9857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeDeclaration9872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ELEMENT_in_elementTest9896 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_elementTest9898 = new BitSet(new long[]{0x0000000000000000L,0x0010001000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementNameOrWildcard_in_elementTest9901 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_elementTest9904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_typeName_in_elementTest9906 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_QUESTIONMARKSi_in_elementTest9908 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_elementTest9915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementNameOrWildcard9929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_elementNameOrWildcard9933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCHEMAELEMENT_in_schemaElementTest9951 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_schemaElementTest9953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_elementDeclaration_in_schemaElementTest9955 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_schemaElementTest9957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_elementName_in_elementDeclaration9974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_elementName10020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_typeName10047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_uriLiteral10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOr_in_ftSelection10096 = new BitSet(new long[]{0x0001000005000002L,0x0000000000100080L,0x1300000000000000L});
    public static final BitSet FOLLOW_ftPosFilter_in_ftSelection10098 = new BitSet(new long[]{0x0001000005000002L,0x0000000000100080L,0x1300000000000000L});
    public static final BitSet FOLLOW_WEIGHT_in_ftSelection10102 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_rangeExpr_in_ftSelection10104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr10137 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_FTOR_in_ftOr10141 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftAnd_in_ftOr10143 = new BitSet(new long[]{0x0000000000000002L,0x0000000040000000L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd10176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_FTAND_in_ftAnd10180 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftMildNot_in_ftAnd10182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot10211 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_NOT_in_ftMildNot10215 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_IN_in_ftMildNot10217 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftUnaryNot_in_ftMildNot10219 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_FTNOT_in_ftUnaryNot10248 = new BitSet(new long[]{0x0000000002004000L,0x8000000000000000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftPrimaryWithOptions_in_ftUnaryNot10252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftPrimary_in_ftPrimaryWithOptions10267 = new BitSet(new long[]{0x0200000080000002L,0x0006800000000600L,0x0000000000400000L});
    public static final BitSet FOLLOW_ftMatchOptions_in_ftPrimaryWithOptions10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWords_in_ftPrimary10297 = new BitSet(new long[]{0x0000000000000002L,0x0400000000000000L});
    public static final BitSet FOLLOW_ftTimes_in_ftPrimary10299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_ftPrimary10306 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000000000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftSelection_in_ftPrimary10308 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_ftPrimary10310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionSelection_in_ftPrimary10315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWordsValue_in_ftWords10343 = new BitSet(new long[]{0x0000000100080802L});
    public static final BitSet FOLLOW_ftAnyallOption_in_ftWords10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_ftWordsValue10369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_ftWordsValue10374 = new BitSet(new long[]{0x540004902E240000L,0xC101129280240041L,0x0007FFA0010C0A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_expr_in_ftWordsValue10376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_ftWordsValue10378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pragma_in_ftExtensionSelection10394 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_LEFTBRACESi_in_ftExtensionSelection10397 = new BitSet(new long[]{0x0000000002004000L,0x8000000000010000L,0x0000000000020000L,0x0000000000000870L});
    public static final BitSet FOLLOW_ftSelection_in_ftExtensionSelection10399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_RIGHTBRACESi_in_ftExtensionSelection10402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ANY_in_ftAnyallOption10424 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_WORD_in_ftAnyallOption10426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALL_in_ftAnyallOption10433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftAnyallOption10435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PHRASE_in_ftAnyallOption10441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OCCURS_in_ftTimes10469 = new BitSet(new long[]{0x0000000000000000L,0x0000400002100000L});
    public static final BitSet FOLLOW_ftRange_in_ftTimes10471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_TIMES_in_ftTimes10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXACTLY_in_ftRange10503 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange10543 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_LEAST_in_ftRange10545 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftRange10585 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_MOST_in_ftRange10587 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FROM_in_ftRange10627 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10629 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_TO_in_ftRange10631 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftRange10633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftOrder_in_ftPosFilter10658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWindow_in_ftPosFilter10662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDistance_in_ftPosFilter10666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftScope_in_ftPosFilter10670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftContent_in_ftPosFilter10674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDERED_in_ftOrder10702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WINDOW_in_ftWindow10729 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_additiveExpr_in_ftWindow10731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_ftUnit_in_ftWindow10733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DISTANCE_in_ftDistance10758 = new BitSet(new long[]{0x0000000000000000L,0x0000400002100000L});
    public static final BitSet FOLLOW_ftRange_in_ftDistance10760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0038000000000000L});
    public static final BitSet FOLLOW_ftUnit_in_ftDistance10762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftScope10827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00C0000000000000L});
    public static final BitSet FOLLOW_ftBigUnit_in_ftScope10835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftBigUnit0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent10892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_START_in_ftContent10894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftContent10900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_END_in_ftContent10902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTIRE_in_ftContent10908 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CONTENT_in_ftContent10910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftMatchOption_in_ftMatchOptions10932 = new BitSet(new long[]{0x0200000080000002L,0x0006800000000600L,0x0000000000400000L});
    public static final BitSet FOLLOW_ftLanguageOption_in_ftMatchOption10961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftWildCardOption_in_ftMatchOption10997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftThesaurusOption_in_ftMatchOption11033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStemOption_in_ftMatchOption11069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftCaseOption_in_ftMatchOption11105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftDiacriticsOption_in_ftMatchOption11141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftStopwordOption_in_ftMatchOption11177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ftExtensionOption_in_ftMatchOption11213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption11237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftCaseOption11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CASE_in_ftCaseOption11277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftCaseOption11279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOWERCASE_in_ftCaseOption11316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UPPERCASE_in_ftCaseOption11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption11370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_INSENSITIVE_in_ftDiacriticsOption11372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIACRITICS_in_ftDiacriticsOption11410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_SENSITIVE_in_ftDiacriticsOption11412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStemOption11437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption11439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStemOption11445 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_STEMMING_in_ftStemOption11447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption11465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption11467 = new BitSet(new long[]{0x0000000000000000L,0x0200000000100000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption11470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption11474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftThesaurusOption11513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption11515 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_ftThesaurusOption11517 = new BitSet(new long[]{0x0000000000000000L,0x0200000000100000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption11520 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_DEFAULT_in_ftThesaurusOption11524 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_ftThesaurusOption11528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ftThesaurusID_in_ftThesaurusOption11530 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_ftThesaurusOption11534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftThesaurusOption11572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_THESAURUS_in_ftThesaurusOption11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AT_in_ftThesaurusID11597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_ftThesaurusID11599 = new BitSet(new long[]{0x0000000000000002L,0x0000400002100000L,0x0000000000004000L});
    public static final BitSet FOLLOW_RELATIONSHIP_in_ftThesaurusID11602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftThesaurusID11604 = new BitSet(new long[]{0x0000000000000002L,0x0000400002100000L});
    public static final BitSet FOLLOW_ftRange_in_ftThesaurusID11609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_LEVELS_in_ftThesaurusID11611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption11633 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption11635 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption11637 = new BitSet(new long[]{0x0000000000000000L,0x8000000000100000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftStopwordOption11639 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption11641 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_WITHOUT_in_ftStopwordOption11680 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption11682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption11684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftStopwordOption11722 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_DEFAULT_in_ftStopwordOption11724 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_STOP_in_ftStopwordOption11726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_WORDS_in_ftStopwordOption11728 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_ftInclExclStringLiteral_in_ftStopwordOption11730 = new BitSet(new long[]{0x0000200000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_AT_in_ftRefOrList11757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_uriLiteral_in_ftRefOrList11759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LEFTPARENTHESISSi_in_ftRefOrList11797 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList11799 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_COMMASi_in_ftRefOrList11802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftRefOrList11804 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000020L});
    public static final BitSet FOLLOW_RIGHTPARENTHESISSi_in_ftRefOrList11808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ftInclExclStringLiteral11821 = new BitSet(new long[]{0x0000000000000000L,0x8000000000100000L});
    public static final BitSet FOLLOW_ftRefOrList_in_ftInclExclStringLiteral11829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LANGUAGE_in_ftLanguageOption11847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftLanguageOption11849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_ftWildCardOption11868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftWildCardOption11876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WILDCARDS_in_ftWildCardOption11878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPTION_in_ftExtensionOption11896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_QName_in_ftExtensionOption11898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_StringLiteral_in_ftExtensionOption11900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITHOUT_in_ftIgnoreOption11920 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CONTENT_in_ftIgnoreOption11922 = new BitSet(new long[]{0x540000102E200000L,0xC101129080240001L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_unionExpr_in_ftIgnoreOption11924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLESLASH_in_synpred16899 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred16901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLASH_in_synpred26921 = new BitSet(new long[]{0x440000002C200000L,0xC101129000200000L,0x0007FFA001040A00L,0x0000000001800870L});
    public static final BitSet FOLLOW_relativePathExpr_in_synpred26923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STARSi_in_synpred37388 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_COLONSi_in_synpred37390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_NCName_in_synpred37392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_itemType_in_synpred49167 = new BitSet(new long[]{0x0000000000000000L,0x0000001000040000L,0x0000000000100000L});
    public static final BitSet FOLLOW_occurrenceIndicator_in_synpred49169 = new BitSet(new long[]{0x0000000000000002L});

}