// $ANTLR 3.0.1 test/CDataSectionContents/CData.g 2007-10-15 16:13:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CDataLexer extends Lexer {
    public static final int INT=4;
    public static final int CharUttrykk=6;
    public static final int EOF=-1;
    public static final int Tokens=7;
    public static final int CHAR=5;
    public CDataLexer() {;} 
    public CDataLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "test/CDataSectionContents/CData.g"; }

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // test/CDataSectionContents/CData.g:7:4: ( ( '0' .. '9' )+ )
            // test/CDataSectionContents/CData.g:7:6: ( '0' .. '9' )+
            {
            // test/CDataSectionContents/CData.g:7:6: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // test/CDataSectionContents/CData.g:7:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start CHAR
    public final void mCHAR() throws RecognitionException {
        try {
            int _type = CHAR;
            // test/CDataSectionContents/CData.g:8:8: ( '\\u0009' | '\\u000A' | '\\u000D' | ( '\\u0020' .. '\\uD7FF' ) | ( '\\uE000' .. '\\uFFFD' ) )
            int alt2=5;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='\t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='\n') ) {
                alt2=2;
            }
            else if ( (LA2_0=='\r') ) {
                alt2=3;
            }
            else if ( ((LA2_0>=' ' && LA2_0<='\uD7FF')) ) {
                alt2=4;
            }
            else if ( ((LA2_0>='\uE000' && LA2_0<='\uFFFD')) ) {
                alt2=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("8:1: CHAR : ( '\\u0009' | '\\u000A' | '\\u000D' | ( '\\u0020' .. '\\uD7FF' ) | ( '\\uE000' .. '\\uFFFD' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // test/CDataSectionContents/CData.g:8:10: '\\u0009'
                    {
                    match('\t'); 

                    }
                    break;
                case 2 :
                    // test/CDataSectionContents/CData.g:8:21: '\\u000A'
                    {
                    match('\n'); 

                    }
                    break;
                case 3 :
                    // test/CDataSectionContents/CData.g:8:32: '\\u000D'
                    {
                    match('\r'); 

                    }
                    break;
                case 4 :
                    // test/CDataSectionContents/CData.g:8:43: ( '\\u0020' .. '\\uD7FF' )
                    {
                    // test/CDataSectionContents/CData.g:8:43: ( '\\u0020' .. '\\uD7FF' )
                    // test/CDataSectionContents/CData.g:8:44: '\\u0020' .. '\\uD7FF'
                    {
                    matchRange(' ','\uD7FF'); 

                    }


                    }
                    break;
                case 5 :
                    // test/CDataSectionContents/CData.g:8:66: ( '\\uE000' .. '\\uFFFD' )
                    {
                    // test/CDataSectionContents/CData.g:8:66: ( '\\uE000' .. '\\uFFFD' )
                    // test/CDataSectionContents/CData.g:8:67: '\\uE000' .. '\\uFFFD'
                    {
                    matchRange('\uE000','\uFFFD'); 

                    }


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CHAR

    // $ANTLR start CharUttrykk
    public final void mCharUttrykk() throws RecognitionException {
        try {
            int _type = CharUttrykk;
            // test/CDataSectionContents/CData.g:11:12: ( ( CHAR )* )
            // test/CDataSectionContents/CData.g:11:13: ( CHAR )*
            {
            // test/CDataSectionContents/CData.g:11:13: ( CHAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0=='\r'||(LA3_0>=' ' && LA3_0<='\uD7FF')||(LA3_0>='\uE000' && LA3_0<='\uFFFD')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // test/CDataSectionContents/CData.g:11:13: CHAR
            	    {
            	    mCHAR(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CharUttrykk

    public void mTokens() throws RecognitionException {
        // test/CDataSectionContents/CData.g:1:8: ( INT | CHAR | CharUttrykk )
        int alt4=3;
        alt4 = dfa4.predict(input);
        switch (alt4) {
            case 1 :
                // test/CDataSectionContents/CData.g:1:10: INT
                {
                mINT(); 

                }
                break;
            case 2 :
                // test/CDataSectionContents/CData.g:1:14: CHAR
                {
                mCHAR(); 

                }
                break;
            case 3 :
                // test/CDataSectionContents/CData.g:1:19: CharUttrykk
                {
                mCharUttrykk(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\1\7\1\10\5\12\2\uffff\1\10\1\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\7\11\2\uffff\1\11\1\uffff";
    static final String DFA4_maxS =
        "\7\ufffd\2\uffff\1\ufffd\1\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\3\1\1\1\uffff\1\2";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\1\3\2\uffff\1\4\22\uffff\20\5\12\1\ud7c6\5\u0800\uffff"+
            "\u1ffe\6",
            "\2\7\2\uffff\1\7\22\uffff\20\7\12\11\ud7c6\7\u0800\uffff\u1ffe"+
            "\7",
            "\2\7\2\uffff\1\7\22\uffff\ud7e0\7\u0800\uffff\u1ffe\7",
            "\2\7\2\uffff\1\7\22\uffff\ud7e0\7\u0800\uffff\u1ffe\7",
            "\2\7\2\uffff\1\7\22\uffff\ud7e0\7\u0800\uffff\u1ffe\7",
            "\2\7\2\uffff\1\7\22\uffff\ud7e0\7\u0800\uffff\u1ffe\7",
            "\2\7\2\uffff\1\7\22\uffff\ud7e0\7\u0800\uffff\u1ffe\7",
            "",
            "",
            "\2\7\2\uffff\1\7\22\uffff\20\7\12\11\ud7c6\7\u0800\uffff\u1ffe"+
            "\7",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( INT | CHAR | CharUttrykk );";
        }
    }
 

}