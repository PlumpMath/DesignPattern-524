package creationalPatterns.FactoryMethod.SimpleFactory;

public class HumanFactory {

	/*
	 * Since a model need just one factory class, there is no
	 * need to use an abstract factory class. We can just use 
	 * static method. 
	 */
	
	public static <T extends Human> T createHuman(Class<T> c){
		Human human=null;
		try {
			human=(Human)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("造人失败...");
		}
		return (T)human;
	}
}
