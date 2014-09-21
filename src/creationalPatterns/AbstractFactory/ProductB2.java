package creationalPatterns.AbstractFactory;

public class ProductB2 extends AbstractProductB {

	@Override
	public void doOtherThings() {
		System.out.println(this.getClass().getName()+" do other things ...");
	}

}
