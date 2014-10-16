package behaviorPatterns.StatePattern.Example;

class Client {

	public static void main(String[] args) {
		Context context=new Context();
		context.setLiftState(Context.CLOSING_STATE);
		context.open();
		context.close();
		context.run();
		context.stop();
	}

}
