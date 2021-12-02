package main;
import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

import view.MyJWindow;
public class Main {

	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
		MyJWindow window=new MyJWindow();	
		SwingUtilities.invokeAndWait(window);
	}

}
