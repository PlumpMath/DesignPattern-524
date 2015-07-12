package behaviorPatterns.InterpreterPattern.Calculator;

import java.util.HashMap;

class VarExpression extends Expression {
	
	private String key;
	
	public VarExpression(String key) {
		this.key=key;
	}

	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return var.get(this.key);
	}

}
