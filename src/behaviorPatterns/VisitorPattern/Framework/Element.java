package behaviorPatterns.VisitorPattern.Framework;

abstract class Element {
	public abstract void doSomething();
	public abstract void accept(IVisitor visitor);
}
