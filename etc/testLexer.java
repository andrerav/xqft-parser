// $ANTLR 3.0.1 etc/test.g 2007-10-09 15:03:31
package test;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class testLexer extends Lexer {
    public static final int T6=6;
    public static final int T7=7;
    public static final int T5=5;
    public static final int INT=4;
    public static final int T8=8;
    public static final int Tokens=9;
    public static final int EOF=-1;
    public testLexer() {;} 
    public testLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "etc/test.g"; }

    // $ANTLR start T5
    public final void mT5() throws RecognitionException {
        try {
            int _type = T5;
            // etc/test.g:3:4: ( ';' )
            // etc/test.g:3:6: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T5

    // $ANTLR start T6
    public final void mT6() throws RecognitionException {
        try {
            int _type = T6;
            // etc/test.g:4:4: ( '<' )
            // etc/test.g:4:6: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T6

    // $ANTLR start T7
    public final void mT7() throws RecognitionException {
        try {
            int _type = T7;
            // etc/test.g:5:4: ( '>' )
            // etc/test.g:5:6: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T7

    // $ANTLR start T8
    public final void mT8() throws RecognitionException {
        try {
            int _type = T8;
            // etc/test.g:6:4: ( 'R' )
            // etc/test.g:6:6: 'R'
            {
            match('R'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T8

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // etc/test.g:8:4: ( ( '0' .. '9' )+ )
            // etc/test.g:8:6: ( '0' .. '9' )+
            {
            // etc/test.g:8:6: ( '0' .. '9' )+
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
            	    // etc/test.g:8:7: '0' .. '9'
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

    public void mTokens() throws RecognitionException {
        // etc/test.g:1:8: ( T5 | T6 | T7 | T8 | INT )
        int alt2=5;
        switch ( input.LA(1) ) {
        case ';':
            {
            alt2=1;
            }
            break;
        case '<':
            {
            alt2=2;
            }
            break;
        case '>':
            {
            alt2=3;
            }
            break;
        case 'R':
            {
            alt2=4;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt2=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T5 | T6 | T7 | T8 | INT );", 2, 0, input);

            throw nvae;
        }

        switch (alt2) {
            case 1 :
                // etc/test.g:1:10: T5
                {
                mT5(); 

                }
                break;
            case 2 :
                // etc/test.g:1:13: T6
                {
                mT6(); 

                }
                break;
            case 3 :
                // etc/test.g:1:16: T7
                {
                mT7(); 

                }
                break;
            case 4 :
                // etc/test.g:1:19: T8
                {
                mT8(); 

                }
                break;
            case 5 :
                // etc/test.g:1:22: INT
                {
                mINT(); 

                }
                break;

        }

    }


 

}