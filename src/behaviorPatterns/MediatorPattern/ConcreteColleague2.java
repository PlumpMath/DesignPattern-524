package behaviorPatterns.MediatorPattern;

class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void selfMethod2(){
		System.out.println(this.getClass().getName()+" selfMethod2.");
	}
	
	public void depMethod2(){
		super.mediator.doSomething2();
	}

}
