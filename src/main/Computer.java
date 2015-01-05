package main;

import java.util.ArrayList;

public class Computer {
	
	private ArrayList<IObservable> observers = new ArrayList<IObservable>();
	
	public void registerObserver(IObservable o){
		observers.add(o);
	}
	
	public void notifyObservers(String message){
		for(IObservable o : observers){
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
