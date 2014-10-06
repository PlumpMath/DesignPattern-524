package behaviorPatterns.StrategyPattern.StrategyEnum;

class Client {

	public static void main(String[] args) {
		System.out.println("3+4="+Calculator.ADD.exec(3, 4));
		System.out.println("4-3="+Calculator.SUB.exec(4, 3));
	}

}
