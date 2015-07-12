package behaviorPatterns.StatePattern.Framework;

class Client {

	public static void main(String[] args) {
		Context context=new Context();
		context.setState(Context.CONCRETE_STATE);
		context.handle1();
		context.handle2();
	}

}
