package creationalPatterns.AbstractFactory;

public class ProductA2 extends AbstractProductA {

	@Override
	public void doSomething() {
		System.out.println(this.getClass().getName() + " do someting ...");
	}

}
