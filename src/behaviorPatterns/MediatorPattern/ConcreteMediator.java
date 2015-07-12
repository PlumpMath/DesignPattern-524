package behaviorPatterns.MediatorPattern;

class ConcreteMediator extends Mediator {

	@Override
	public void doSomething1() {
		super.getC1().selfMethod1();
		super.getC2().selfMethod2();
	}

	@Override
	public void doSomething2() {
		super.getC1().selfMethod1();
		super.getC2().selfMethod2();
	}

}
