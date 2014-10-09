package behaviorPatterns.ObserverPattern.Framework;

import java.util.Vector;

abstract class Subject {

	private Vector<Observer> obs=new Vector<Observer>();
	
	public void addObserver(Observer observer){
		this.obs.add(observer);
	}
	
	public void delObserver(Observer observer){
		this.obs.remove(observer);
	}
	
	public void notifyObservers(){
		for(Observer observer:obs){
			observer.update();
		}
	}
}
