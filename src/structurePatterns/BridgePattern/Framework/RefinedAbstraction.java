package structurePatterns.BridgePattern.Framework;

class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}
	
	public void request(){
		super.request();
		super.getImplementor().doAnything();
	}

}
