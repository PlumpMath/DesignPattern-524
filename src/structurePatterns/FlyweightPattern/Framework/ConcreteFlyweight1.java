package structurePatterns.FlyweightPattern.Framework;

class ConcreteFlyweight1 extends Flyweight {

	public ConcreteFlyweight1(String Extrinsic) {
		super(Extrinsic);
	}

	@Override
	public void operate() {
		System.out.println(this+" operate.");
	}

}
