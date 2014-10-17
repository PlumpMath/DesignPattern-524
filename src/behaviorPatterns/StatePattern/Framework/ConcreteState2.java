package behaviorPatterns.StatePattern.Framework;

class ConcreteState2 extends State {

	@Override
	public void handle1() {
		super.context.setState(Context.CONCRETE_STATE);
		super.context.getState().handle1();
	}

	@Override
	public void handle2() {
		System.out.println("handle2");
	}

}
