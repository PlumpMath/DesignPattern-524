package structurePatterns.FlyweightPattern.Framework;

class ConcreteFlyweight2 extends Flyweight{

	public ConcreteFlyweight2(String Extrinsic) {
		super(Extrinsic);
	}

	@Override
	public void operate() {
		System.out.println(this+" operate.");
	}
	

}
