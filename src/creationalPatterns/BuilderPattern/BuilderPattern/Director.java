package creationalPatterns.BuilderPattern.BuilderPattern;

public class Director {
	
	private Builder builder=new ConcreteBuilder();
	
	public Product getProduct(){
		builder.setParts();
		return builder.buildProduct();
	}

}
