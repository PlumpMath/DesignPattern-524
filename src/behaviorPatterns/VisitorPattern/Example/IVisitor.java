package behaviorPatterns.VisitorPattern.Example;

interface IVisitor {
	public void visit(CommanEmployee employee);
	public void visit(Manager manager);
}
