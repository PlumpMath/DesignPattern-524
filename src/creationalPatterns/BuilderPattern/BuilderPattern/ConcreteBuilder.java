package creationalPatterns.BuilderPattern.BuilderPattern;

public class ConcreteBuilder extends Builder {

	private Product product = new Product();

	@Override
	public void setParts() {
		System.out
				.println("In this method we set the sequence of building a product ...");
	}

	@Override
	public Product buildProduct() {
		System.out.println("In this method we build our product ...");
		return product;
	}

}
