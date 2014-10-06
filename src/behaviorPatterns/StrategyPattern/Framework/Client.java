package behaviorPatterns.StrategyPattern.Framework;

class Client {

	public static void main(String[] args) {
		Context context=new Context(new ConcreteStrategy1());
		context.operate();
		
		context=new Context(new ConcreteStrategy2());
		context.operate();
	}

}
