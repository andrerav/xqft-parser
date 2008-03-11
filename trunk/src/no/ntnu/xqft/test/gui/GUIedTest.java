package no.ntnu.xqft.test.gui;

import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.xml.sax.SAXException;

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
        //r.runTestSuite();
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
