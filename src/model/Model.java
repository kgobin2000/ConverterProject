package model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;

import view.Observer;

public class Model {
	
	private double cm;
	
	private List<Observer> list;
	
	public Model() {
		list=new ArrayList<Observer>();
	}
	
	public void setData(double cm) {
		this.cm=cm;
	}
	
	public void addObserver(Observer ta) {
		list.add(ta);
	}
	
	public void updateAll() {
		for(Observer ta:list) {
			ta.update(cm);
		}
	}
}


