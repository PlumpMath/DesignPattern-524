package behaviorPatterns.StrategyPattern.Example;

class Context {
	IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy=strategy;
	}
	
	public void operate(){
		this.strategy.operate();
	}
}
