package structurePatterns.AdapterPattern;

class ConcreteTarget implements Target {

	@Override
	public void request() {
		System.out.println(this.getClass().getName()+" request.");
	}

}
