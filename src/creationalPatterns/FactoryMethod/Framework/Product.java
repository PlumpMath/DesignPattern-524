package creationalPatterns.FactoryMethod.Framework;

public abstract class Product {

	public void commanMethod(){
		System.out.println("Product common method ...");
	}
	
	public abstract void method();
}
