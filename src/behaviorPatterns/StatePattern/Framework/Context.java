package behaviorPatterns.StatePattern.Framework;

class Context {
	public static final ConcreteState CONCRETE_STATE=new ConcreteState();
	public static final ConcreteState2 CONCRETE_STATE2=new ConcreteState2();
	
	private State state;

	public void setState(State state) {
		this.state=state;
		this.state.setContext(this);
	}
	
	public State getState(){
		return state;
	}
	
	public void handle1(){
		this.state.handle1();
	}
	
	public void handle2(){
		this.state.handle2();
	}

}
