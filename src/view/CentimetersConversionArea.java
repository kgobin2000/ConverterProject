package view;
import java.awt.Color;

import javax.swing.JTextArea;
public class CentimetersConversionArea extends JTextArea implements Observer{

	public CentimetersConversionArea() {
		super(10,20);
		super.setBackground(Color.YELLOW);
		super.setText("0");
	}

	public void update(double cm) {
		
	}
}
