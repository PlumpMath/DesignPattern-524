package behaviorPatterns.InterpreterPattern.Framework;

import java.util.Stack;

class Client {

	public static void main(String[] args) {
		Context context=new Context();
		Stack<Expression> stack=null;
	
//		for(;;){
//			//进行语法判断，并产生递归调用
//		}
		Expression expression=stack.pop();
		expression.interpreter(context);
	}

}
