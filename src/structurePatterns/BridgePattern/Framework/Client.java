package structurePatterns.BridgePattern.Framework;

class Client {

	public static void main(String[] args) {
		Abstraction abstraction=new RefinedAbstraction(new ConcreteImplementor1());
		abstraction.request();
		
		System.out.println();
		
		abstraction=new RefinedAbstraction(new ConcreteImplementor2());
		abstraction.request();
	}

}
