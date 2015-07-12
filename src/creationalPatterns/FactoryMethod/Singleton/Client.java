package creationalPatterns.FactoryMethod.Singleton;

public class Client {

	public static void main(String[] args) {
		Singleton instance=SingletonFactory.getInstance();
		instance.doSomething();
	}

}
