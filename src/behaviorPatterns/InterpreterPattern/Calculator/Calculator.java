package behaviorPatterns.InterpreterPattern.Calculator;

import java.util.HashMap;
import java.util.Stack;

class Calculator {
	private Expression expression;
	
	public Calculator(String expStr) {
		char[] charArray=expStr.toCharArray();
		Stack<Expression> stack=new Stack<Expression>();
		
		Expression left=null;
		Expression right=null;
		for(int i=0;i<charArray.length;i++){
			switch (charArray[i]) {
			case '+':
				left=stack.pop();
				right=new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new AddExpression(left, right));
				break;
			case '-':
				left=stack.pop();
				right=new VarExpression(String.valueOf(charArray[++i]));
				stack.push(new SubExpression(left, right));
				break;
			default:
				stack.push(new VarExpression(String.valueOf(charArray[i])));
			}
		}
		
		this.expression=stack.pop();
	}
	
	public int run(HashMap<String, Integer> var){
		return this.expression.interpreter(var);
	}
}
