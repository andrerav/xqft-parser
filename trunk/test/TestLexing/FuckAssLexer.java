// $ANTLR 3.0.1 test/TestLexing/FuckAss.g 2007-11-08 17:28:09

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FuckAssLexer extends Lexer {
    public static final int Word=9;
    public static final int Kommentar=7;
    public static final int CleanChar=5;
    public static final int HORSE=4;
    public static final int EOF=-1;
    public static final int WS=10;
    public static final int Char=6;
    public static final int Tokens=11;
    public static final int Kom=8;

    public boolean tall = false;

    public FuckAssLexer() {;} 
    public FuckAssLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "test/TestLexing/FuckAss.g"; }

    // $ANTLR start HORSE
    public final void mHORSE() throws RecognitionException {
        try {
            int _type = HORSE;
            // test/TestLexing/FuckAss.g:6:7: ( 'horse' )
            // test/TestLexing/FuckAss.g:6:9: 'horse'
            {
            match("horse"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HORSE

    // $ANTLR start CleanChar
    public final void mCleanChar() throws RecognitionException {
        try {
            // test/TestLexing/FuckAss.g:18:20: ( 'a' .. 'z' )
            // test/TestLexing/FuckAss.g:18:22: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end CleanChar

    // $ANTLR start Char
    public final void mChar() throws RecognitionException {
        try {
            // test/TestLexing/FuckAss.g:19:15: ( CleanChar | '(' | ')' | ':' | ' ' )
            // test/TestLexing/FuckAss.g:
            {
            if ( input.LA(1)==' '||(input.LA(1)>='(' && input.LA(1)<=')')||input.LA(1)==':'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Char

    // $ANTLR start Kom
    public final void mKom() throws RecognitionException {
        try {
            int _type = Kom;
            // test/TestLexing/FuckAss.g:20:6: ( Kommentar )
            // test/TestLexing/FuckAss.g:20:8: Kommentar
            {
            mKommentar(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Kom

    // $ANTLR start Kommentar
    public final void mKommentar() throws RecognitionException {
        try {
            // test/TestLexing/FuckAss.g:21:20: ( '(:' ( options {greedy=false; } : {...}? => Kommentar | Char )* ':)' )
            // test/TestLexing/FuckAss.g:21:22: '(:' ( options {greedy=false; } : {...}? => Kommentar | Char )* ':)'
            {
            match("(:"); 

            // test/TestLexing/FuckAss.g:21:27: ( options {greedy=false; } : {...}? => Kommentar | Char )*
            loop1:
            do {
                int alt1=3;
                switch ( input.LA(1) ) {
                case ':':
                    {
                    alt1=2;
                    }
                    break;
                case '(':
                    {
                    alt1=2;
                    }
                    break;
                case ' ':
                case ')':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt1=2;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // test/TestLexing/FuckAss.g:21:53: {...}? => Kommentar
            	    {
            	    if ( !(input.LT(1) =='(' && input.LT(2) == ':') ) {
            	        throw new FailedPredicateException(input, "Kommentar", "input.LT(1) =='(' && input.LT(2) == ':'");
            	    }
            	    mKommentar(); 

            	    }
            	    break;
            	case 2 :
            	    // test/TestLexing/FuckAss.g:21:109: Char
            	    {
            	    mChar(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(":)"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end Kommentar

    // $ANTLR start Word
    public final void mWord() throws RecognitionException {
        try {
            int _type = Word;
            // test/TestLexing/FuckAss.g:25:7: ( ( CleanChar )+ )
            // test/TestLexing/FuckAss.g:25:9: ( CleanChar )+
            {
            // test/TestLexing/FuckAss.g:25:9: ( CleanChar )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // test/TestLexing/FuckAss.g:25:9: CleanChar
            	    {
            	    mCleanChar(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Word

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // test/TestLexing/FuckAss.g:26:5: ( ' ' )
            // test/TestLexing/FuckAss.g:26:6: ' '
            {
            match(' '); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    public void mTokens() throws RecognitionException {
        // test/TestLexing/FuckAss.g:1:8: ( HORSE | Kom | Word | WS )
        int alt3=4;
        switch ( input.LA(1) ) {
        case 'h':
            {
            int LA3_1 = input.LA(2);

            if ( (LA3_1=='o') ) {
                int LA3_5 = input.LA(3);

                if ( (LA3_5=='r') ) {
                    int LA3_6 = input.LA(4);

                    if ( (LA3_6=='s') ) {
                        int LA3_7 = input.LA(5);

                        if ( (LA3_7=='e') ) {
                            int LA3_8 = input.LA(6);

                            if ( ((LA3_8>='a' && LA3_8<='z')) ) {
                                alt3=3;
                            }
                            else {
                                alt3=1;}
                        }
                        else {
                            alt3=3;}
                    }
                    else {
                        alt3=3;}
                }
                else {
                    alt3=3;}
            }
            else {
                alt3=3;}
            }
            break;
        case '(':
            {
            alt3=2;
            }
            break;
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt3=3;
            }
            break;
        case ' ':
            {
            alt3=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( HORSE | Kom | Word | WS );", 3, 0, input);

            throw nvae;
        }

        switch (alt3) {
            case 1 :
                // test/TestLexing/FuckAss.g:1:10: HORSE
                {
                mHORSE(); 

                }
                break;
            case 2 :
                // test/TestLexing/FuckAss.g:1:16: Kom
                {
                mKom(); 

                }
                break;
            case 3 :
                // test/TestLexing/FuckAss.g:1:20: Word
                {
                mWord(); 

                }
                break;
            case 4 :
                // test/TestLexing/FuckAss.g:1:25: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}