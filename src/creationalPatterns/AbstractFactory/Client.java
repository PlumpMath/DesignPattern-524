package creationalPatterns.AbstractFactory;

public class Client {

	public static void main(String[] args) {
		
		AbstractFactory factory1=new Factory1();
		AbstractFactory factory2=new Factory2();
		
		AbstractProductA productA1=factory1.createProductA();
		productA1.doSomething();
		AbstractProductB productB1=factory1.createProductB();
		productB1.doOtherThings();
		
		AbstractProductA productA2=factory2.createProductA();
		productA2.doSomething();
		AbstractProductB productB2=factory2.createProductB();
		productB2.doOtherThings();
	}

}
