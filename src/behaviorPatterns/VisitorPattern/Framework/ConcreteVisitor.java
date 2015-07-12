package behaviorPatterns.VisitorPattern.Framework;


class ConcreteVisitor implements IVisitor {

	@Override
	public void visit(ConcreteElement el) {
		el.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 e2) {
		e2.doSomething();
	}

}
