package behaviorPatterns.MediatorPattern;

abstract class Mediator {

	private ConcreteColleague1 c1;
	private ConcreteColleague2 c2;
	public ConcreteColleague1 getC1() {
		return c1;
	}
	public void setC1(ConcreteColleague1 c1) {
		this.c1 = c1;
	}
	public ConcreteColleague2 getC2() {
		return c2;
	}
	public void setC2(ConcreteColleague2 c2) {
		this.c2 = c2;
	}
	
	public abstract void doSomething1();
	public abstract void doSomething2();
}
