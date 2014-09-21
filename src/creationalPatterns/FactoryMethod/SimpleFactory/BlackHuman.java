package creationalPatterns.FactoryMethod.SimpleFactory;

public class BlackHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("黑色皮肤...");
	}

	@Override
	public void talk() {
		System.out.println("我是黑色人种...");
	}

}
