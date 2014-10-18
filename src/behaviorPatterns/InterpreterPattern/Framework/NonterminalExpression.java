package behaviorPatterns.InterpreterPattern.Framework;

class NonterminalExpression extends Expression {
	
	public NonterminalExpression(Expression... expressions) {
	}

	@Override
	public Object interpreter(Context context) {
		return null;
	}

}
