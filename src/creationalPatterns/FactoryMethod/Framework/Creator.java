package creationalPatterns.FactoryMethod.Framework;

public abstract class Creator {
	public abstract <T extends Product> T createProduct(Class<T> c);
}
