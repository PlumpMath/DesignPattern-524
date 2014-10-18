package behaviorPatterns.InterpreterPattern.Framework;

abstract class Expression {
	public abstract Object interpreter(Context context);
}
