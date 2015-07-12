package creationalPatterns.FactoryMethod.Singleton;

import java.lang.reflect.Constructor;

public class SingletonFactory {

	private static Singleton instance;
	
	static{
		try {
			Class c1=Class.forName(Singleton.class.getName());
			// 1. get the default constructor
			Constructor constructor=c1.getDeclaredConstructor();
			// 2. set the accessibility as true
			constructor.setAccessible(true);
			// 3. generate an instance
			instance=(Singleton)constructor.newInstance();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Singleton getInstance(){
		return instance;
	}
}
