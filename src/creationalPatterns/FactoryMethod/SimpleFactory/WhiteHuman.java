package creationalPatterns.FactoryMethod.SimpleFactory;

public class WhiteHuman implements Human {

	@Override
	public void getColor() {
		System.out.println("白色皮肤...");
	}

	@Override
	public void talk() {
		System.out.println("我是白色人种...");
	}

}
