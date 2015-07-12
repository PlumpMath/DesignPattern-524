package behaviorPatterns.InterpreterPattern.Calculator;

import java.util.HashMap;

abstract class Expression {
	public abstract int interpreter(HashMap<String, Integer> var);
}
