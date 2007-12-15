package no.ntnu.xqft.test.gui;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import no.ntnu.xqft.test.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.util.ArrayList;
import java.util.Vector;

public class GUIedTest {

    
    public void createAndShowGUI(JPanel t) {
        //Create and set up the window.
        JFrame frame = new JFrame("Test Suite GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(t);


        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }


    
    /**
     * @param args
     * @throws SAXException 
     * @throws IOException 
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception{
        
        GUIedTest test = new GUIedTest();
        ErrorReciever r = new ErrorReciever();
        TestPanel t = new TestPanel(r);
        test.createAndShowGUI(t);

        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
      /*  javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                t.createAndShowGUI();
            }
        });*/

        
    }

}
