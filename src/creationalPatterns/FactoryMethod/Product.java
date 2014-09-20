package creationalPatterns.FactoryMethod;

public abstract class Product {

	public void commanMethod(){
		System.out.println("Product common method ...");
	}
	
	public abstract void method();
}
