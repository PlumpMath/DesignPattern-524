package behaviorPatterns.VisitorPattern.Framework;

class ConcreteElement extends Element {

	@Override
	public void doSomething() {
		System.out.println(this+" process the bussiness.");
	}

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}

}
