package structurePatterns.BridgePattern.Framework;

class ConcreteImplementor1 implements Implementor {

	@Override
	public void doSomething() {
		System.out.println(this+" do something.");
	}

	@Override
	public void doAnything() {
		System.out.println(this+" do anything.");
	}

}
