package behaviorPatterns.StrategyPattern.Example;

class BlockEnemy implements IStrategy {

	@Override
	public void operate() {
		System.out.println("策略：阻挡追兵");
	}

}
