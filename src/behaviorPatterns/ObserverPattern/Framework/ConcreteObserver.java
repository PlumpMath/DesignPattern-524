package behaviorPatterns.ObserverPattern.Framework;

public class ConcreteObserver implements Observer {

	@Override
	public void update() {
		System.out.println("接收到信息，目标发生改变");
	}

}
