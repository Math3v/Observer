package main;

import javax.swing.JLabel;

public class GuiObserver implements IObservable {

	private JLabel label;
	
	public GuiObserver(JLabel label){
		this.label = label;
	}
	
	@Override
	public void notifyMe(String message) {
		label.setText(message);
	}

}
