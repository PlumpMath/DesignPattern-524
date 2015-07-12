package behaviorPatterns.StrategyPattern.Example;

class GreenLight implements IStrategy {

	@Override
	public void operate() {
		System.out.println("策略：开绿灯");
	}

}
