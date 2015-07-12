package behaviorPatterns.StrategyPattern.Framework;

class ConcreteStrategy1 implements Strategy {

	@Override
	public void doSomething() {
		System.out.println("具体策略1");
	}

}
