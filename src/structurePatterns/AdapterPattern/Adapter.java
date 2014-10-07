package structurePatterns.AdapterPattern;

class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		super.doSomething();
	}

}
