package no.ntnu.xqft.test.gui;

import org.antlr.runtime.Token;

public class TokenHolder {
    Token token;
    int state;
    int type;
    int start, end;
    
    public TokenHolder(int _state, Token tok, int typ, int starten, int slutt)
    {
        token = tok;
        state = _state;
        type = typ;
        tok.setType(typ);
        start = starten;
        end = slutt;
    }
    
    public Token getToken()
    {
        return token;
    }
    
    public int getState()
    {
        return state;
    }
    
    public int getType()
    {
        return type;
    }
    
    public int getStart()
    {
        return start;
    }
    
    public int getEnd()
    {
        return end;
    }

}
