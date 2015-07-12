package creationalPatterns.FactoryMethod.LazyInitialization;

import creationalPatterns.FactoryMethod.Framework.Product;

public class Client {

	public static void main(String[] args) {

		Product product=ProductFactory.createProduct("Product1");
		product.method();
	}

}
