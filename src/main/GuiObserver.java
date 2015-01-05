package main;

import javax.swing.JLabel;

public class GuiObserver implements Observable {

	private JLabel label;
	
	public GuiObserver(JLabel label){
		this.label = label;
	}
	
	@Override
	public void notifyMe(String message) {
		label.setText(message);
	}

}
