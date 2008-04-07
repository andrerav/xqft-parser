package no.ntnu.xqft.test.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



public class TestPanel extends JPanel implements ActionListener, ListSelectionListener {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1530404423459215498L;
	JButton next, back, run, runSuite;
    JTextArea tekst;
    JTextField field;
    JTextField filefield;
    JList liste;
    ErrorReciever errorReciever;

    
    public TestPanel(ErrorReciever r)
    {
        errorReciever = r;
        r.setUpdatee(this);
        this.setLayout(new BorderLayout());
               
        
        JPanel buttons = new JPanel();
        buttons.setLayout(new BorderLayout());
        back = new JButton("back");
        back.addActionListener(this);
        buttons.add(back, BorderLayout.LINE_START);
        
        next = new JButton("next");
        next.addActionListener(this);
        buttons.add(next, BorderLayout.LINE_END);
        
        runSuite = new JButton("Run TestSuite");
        runSuite.addActionListener(this);
        buttons.add(runSuite, BorderLayout.CENTER);
        
        this.add(buttons, BorderLayout.PAGE_START);
        
        tekst = new JTextArea(20,40);
        tekst.setEditable(true);
        this.add(tekst,BorderLayout.CENTER);
        
        
        JPanel rightpanel = new JPanel();
        rightpanel.setBorder(BorderFactory.createLineBorder(Color.black));
        rightpanel.setLayout(new BorderLayout());
        liste = new JList();
        liste.setCellRenderer(new TokenCellRenderer());
        liste.add(new JLabel("hefty"));
        liste.setSize(30, 70);
        liste.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        liste.addListSelectionListener(this);
        JScrollPane scrollingList = new JScrollPane(liste);
        rightpanel.add(scrollingList, BorderLayout.CENTER);
        
        run = new JButton("run");
        run.addActionListener(this);
        rightpanel.add(run, BorderLayout.PAGE_END);
        
        this.add(rightpanel, BorderLayout.LINE_END);
        
        JPanel bottom = new JPanel();
        bottom.setBorder(BorderFactory.createLineBorder(Color.black));
        bottom.setLayout(new BorderLayout());
        field = new JTextField();
        field.setEditable(false);
        bottom.add(field, BorderLayout.PAGE_START);
        
        filefield = new JTextField();
        filefield.setEditable(false);
        bottom.add(filefield, BorderLayout.PAGE_END);
        
        this.add(bottom, BorderLayout.PAGE_END);
        
        back.setEnabled(false);
        next.setEnabled(false);
        //errorReciever.runTest();

    }
    

    public void actionPerformed(ActionEvent event) {
        if(event.getSource().equals(next))
        {
            errorReciever.next();
            errorReciever.runTest();
        }else if(event.getSource().equals(run)){
        	Vector<TokenHolder> ref = errorReciever.runQuery(tekst.getText());
        	if(ref != null)
        		liste.setListData(ref);
        }else if(event.getSource().equals(back))
        {
            errorReciever.prev();
            errorReciever.runTest();
        }else if(event.getSource().equals(runSuite))
        {
        	try{
        	errorReciever.runTestSuite();
        	next.setEnabled(true);
        	back.setEnabled(true);
        	errorReciever.runTest();
        	}catch(Exception e){tekst.setText("Error idet testsuite ble kjoert: " + e.getMessage());}

        }
        else
            ;
        
    }
    
    public void updateInfo()
    {
        liste.setListData(errorReciever.getListData());
        filefield.setText(errorReciever.getFileName());
        field.setText(errorReciever.getErrorMsg());
        tekst.setText(errorReciever.getQuery());
        
    }
    
    public void setErrorMsg(String s)
    {
    	field.setText(s);
    }


    public void valueChanged(ListSelectionEvent event) {
        TokenHolder r = (TokenHolder)liste.getSelectedValue();
        if(r != null){
        tekst.setSelectionStart(r.getStart());
        tekst.setSelectionEnd(r.getEnd()+1);
        }
    }
    
  


}