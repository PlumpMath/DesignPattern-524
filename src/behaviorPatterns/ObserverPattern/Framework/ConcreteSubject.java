package behaviorPatterns.ObserverPattern.Framework;

class ConcreteSubject extends Subject {

	public void doSomething(){
		/*
		 * do something.
		 */
		super.notifyObservers();
	}
}
