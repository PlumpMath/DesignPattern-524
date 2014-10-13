package behaviorPatterns.VisitorPattern.Framework;

interface IVisitor {
	public void visit(ConcreteElement el);
	public void visit(ConcreteElement2 e2);
}
