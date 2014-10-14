package behaviorPatterns.VisitorPattern.MultiVisitors;

interface IVisitor {
	public void visit(CommanEmployee employee);
	public void visit(Manager manager);
}
