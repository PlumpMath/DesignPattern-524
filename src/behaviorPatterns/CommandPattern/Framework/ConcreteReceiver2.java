package behaviorPatterns.CommandPattern.Framework;

class ConcreteReceiver2 extends Receiver {

	@Override
	public void doSomething() {
		System.out.println(this.getClass().getName()+" do something.");
	}

}
