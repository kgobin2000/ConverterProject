package view;
import java.awt.Color;

import javax.swing.JTextArea;
public class MeterConversionArea extends JTextArea implements Observer{
	
	public MeterConversionArea() {
		super(10,20);
		super.setBackground(Color.ORANGE);
		super.setText("0 m");
	}
	
	public void update(double cm) {
		double meterValue=cm/100.0;
		super.setText(meterValue + " m");
	}	
}
