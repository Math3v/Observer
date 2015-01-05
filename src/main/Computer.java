package main;

import java.util.ArrayList;

public class Computer {
	
	private ArrayList<Observable> observers = new ArrayList<Observable>();
	
	public void registerObserver(Observable o){
		observers.add(o);
	}
	
	public void notifyObservers(String message){
		for(Observable o : observers){
			o.notifyMe(message);
		}
	}
	
	public void compute(){
		for(int i = 0; i < 5; ++i){
			Sleep.sleep(1000);
			notifyObservers(new Integer(i).toString());
		}
	}

}
