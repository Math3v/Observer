package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Main {
	
	public static void configureFrame(JFrame frame){
		frame.setLocationRelativeTo(null);
		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String args[]){
		
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Hello", SwingConstants.CENTER);
		
		frame.add(label);
		configureFrame(frame);
		
		Observable gui = new GuiObserver(label);
		Computer c = new Computer();
		
		c.registerObserver(gui);
		c.compute();
	}

}
