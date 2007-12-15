package no.ntnu.xqft.test.gui;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import no.ntnu.xqft.parse.XQFTParser;

import org.antlr.runtime.Token;

public class TokenCellRenderer extends JLabel implements ListCellRenderer {

    public TokenCellRenderer(){
    setOpaque(true);
}
    
    public Component getListCellRendererComponent(JList list, Object value,
            int index, boolean isSelected, boolean hasFocus) {
        
        if(value instanceof TokenHolder)
        {
            TokenHolder holder = (TokenHolder)value;
            setText(XQFTParser.tokenNames[holder.getType()]);
            setForeground(isSelected ? Color.white : Color.black);
            
            Color g;
            
            switch (holder.getState()) {
            case 0:
                g = Color.LIGHT_GRAY;
                break;
            case 1:
                g = Color.CYAN;
                break;
            case 2:
                g = Color.RED;
                break;
            case 3:
                g = Color.ORANGE;
                break;
            case 4:
                g = Color.BLUE;
                break;
                
            default:
                g =  Color.white;
                break;
            }
            
            setBackground(g);
            return this;
        }
        else{
            setText(value.toString());
            setBackground(isSelected ? Color.blue : Color.gray);
            setForeground(isSelected ? Color.white : Color.black);
            return this;
        }
    }

}
