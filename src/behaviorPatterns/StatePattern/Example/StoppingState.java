package behaviorPatterns.StatePattern.Example;

class StoppingState extends LiftState {

	@Override
	public void open() {
		super.context.setLiftState(Context.OPENING_STATE);
		super.context.getLiftState().open();
	}

	@Override
	public void close() {
	}

	@Override
	public void run() {
		super.context.setLiftState(Context.RUNNING_STATE);
		super.context.getLiftState().run();
	}

	@Override
	public void stop() {
		System.out.println("电梯停止了");
	}

}
