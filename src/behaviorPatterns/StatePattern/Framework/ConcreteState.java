package behaviorPatterns.StatePattern.Framework;

class ConcreteState extends State {

	@Override
	public void handle1() {
		System.out.println("handle1");
	}

	@Override
	public void handle2() {
		super.context.setState(Context.CONCRETE_STATE2);
		super.context.getState().handle2();
	}

}
