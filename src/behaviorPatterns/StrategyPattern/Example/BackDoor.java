package behaviorPatterns.StrategyPattern.Example;

class BackDoor implements IStrategy {

	@Override
	public void operate() {
		System.out.println("策略：开后门");
	}

}
