package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.WindowConstants;

import controller.Controller;
import model.Model;

public class MyJWindow extends JFrame implements Runnable,ActionListener{
	private JPanel panel;
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	
	private CentimetersConversionArea centText;
	private FeetConversionArea feetText;
	private MeterConversionArea meterText;
	
	private Controller controller;
	
	private Model model;
	
	public MyJWindow() {
		
		super();
		
	}
	
	public void run() {
		createMenuBar();
		
		panel=new JPanel();		
		feetText=new FeetConversionArea();
		centText=new CentimetersConversionArea();
		meterText=new MeterConversionArea();
		addComponents();
		
		model=new Model();
		model.addObserver(feetText);
		model.addObserver(meterText);
		
		controller=new Controller(model);

		setContentPane(panel);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBackground(Color.LIGHT_GRAY);
		setSize(800,600);
		setVisible(true);		
	}
	
	private void createMenuBar() {
		menuBar=new JMenuBar();
		menu=new JMenu("Update Model");
		menuItem=new JMenuItem("Save input centimeters");
		KeyStroke keyStrokeToOpen = KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.ALT_DOWN_MASK);
		menuItem.setAccelerator(keyStrokeToOpen);
		menuItem.addActionListener(this);
		menu.add(menuItem);
		menuBar.add(menu);
		setJMenuBar(menuBar);
	}
	
	private void addComponents() {	
		panel.setLayout(new GridBagLayout());
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.insets=new Insets(10,10,10,10);
		gbc.gridx=0;
		gbc.gridy=0;
		panel.add(feetText,gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		panel.add(meterText,gbc);
		
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=2;
		panel.add(centText,gbc);
	}
	public void actionPerformed(ActionEvent e) {
		
		double data=Double.parseDouble(centText.getText());
		
		controller.setInputData(data);
	}
}
