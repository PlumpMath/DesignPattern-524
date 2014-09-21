package creationalPatterns.AbstractFactory;

public class ProductB1 extends AbstractProductB {

	@Override
	public void doOtherThings() {
		System.out.println(this.getClass().getName()+" do other things...");
	}

}
