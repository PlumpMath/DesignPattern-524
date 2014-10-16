package behaviorPatterns.StatePattern.Example;

class Context {
	public final static OpeningState OPENING_STATE=new OpeningState();
	public final static ClosingState CLOSING_STATE=new ClosingState();
	public final static RunningState RUNNING_STATE=new RunningState();
	public final static StoppingState STOPPING_STATE=new StoppingState();

	private LiftState liftState;
	public LiftState getLiftState(){
		return this.liftState;
	}
	
	public void setLiftState(LiftState state){
		this.liftState=state;
		state.setContext(this);
	}
	
	public void open(){
		this.OPENING_STATE.open();
	}
	
	public void close(){
		this.CLOSING_STATE.close();
	}
	
	public void run(){
		this.RUNNING_STATE.run();
	}
	
	public void stop(){
		this.STOPPING_STATE.stop();
	}
}
