package behaviorPatterns.StrategyPattern.Framework;

class Context {
	Strategy strategy=null;
	
	public Context(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void operate(){
		this.strategy.doSomething();
	}
}
