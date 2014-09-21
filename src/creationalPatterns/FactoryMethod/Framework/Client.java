package creationalPatterns.FactoryMethod.Framework;

public class Client {

	public static void main(String[] args) {
		Creator creator=new ConcreteCreator1();
		Product product=creator.createProduct(ConcreteProduct1.class);
		product.method();
	}

}
