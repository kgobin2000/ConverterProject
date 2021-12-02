package view;
import java.awt.Color;

import javax.swing.JTextArea;
public class FeetConversionArea extends JTextArea implements Observer{
		
	public FeetConversionArea() {
		super(10,20);
		super.setBackground(Color.GREEN);
		super.setText("0 ft");
	}
	
	public void update(double cm) {
		double feetValue=cm/30.48000000012192;
		super.setText(feetValue + " ft");
	}
}
