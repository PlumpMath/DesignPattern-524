package behaviorPatterns.InterpreterPattern.Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class Client {

	public static void main(String[] args) throws IOException {
		String expStr = getExpStr();
		HashMap<String, Integer> var = getValue(expStr);
		Calculator calculator=new Calculator(expStr);
		System.out.println("运算结果是:"+expStr+"="+calculator.run(var));
	}

	private static HashMap<String, Integer> getValue(String expStr) throws IOException {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (char ch : expStr.toCharArray()) {
			if (ch != '+' && ch != '-' && !map.containsKey(String.valueOf(ch))) {
				System.out.print("请输入"+ch+"的值:");
				String in = (new BufferedReader( new InputStreamReader(System.in))).readLine();
				map.put(String.valueOf(ch), Integer.valueOf(in));
			}
		}
		return map;
	}

	private static String getExpStr() throws IOException {
		System.out.println("请输入表达式：");
		return (new BufferedReader(new InputStreamReader(System.in)))
				.readLine();
	}

}

