package creationalPatterns.AbstractFactory;

public class ProductA1 extends AbstractProductA {

	@Override
	public void doSomething() {
		System.out.println(this.getClass().getName() + " do something ...");
	}

}
