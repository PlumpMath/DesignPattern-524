package creationalPatterns.FactoryMethod.LazyInitialization;

import java.util.HashMap;
import java.util.Map;

import creationalPatterns.FactoryMethod.Framework.ConcreteProduct1;
import creationalPatterns.FactoryMethod.Framework.Product;

public class ProductFactory {

	private static final Map<String, Product> prMap = new HashMap<String, Product>();

	public static synchronized Product createProduct(String type){
		Product product=null;
		if(prMap.containsKey(type)){
			product=prMap.get(type);
		}else{
			product=new ConcreteProduct1();
			prMap.put(type, product);
		}
		return product;
	}
}
