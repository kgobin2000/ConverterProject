package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.Timer;

import model.Model;

public class Controller implements ActionListener
{
	private Model model;
	
	public Controller(Model model) {
		this.model=model;
    	Timer t=new Timer(16,this);
    	t.start();
	}
        
	public void setInputData(double cm) {
		model.setData(cm);
	}
	
    /**
     * Called whenever an ActionEvent occurs.and we are listening
     * to that event.The timer automatically sets 'this' up as the listener above.
     */
    public void actionPerformed(ActionEvent e) {    	
    	model.updateAll();    	
    }
}
