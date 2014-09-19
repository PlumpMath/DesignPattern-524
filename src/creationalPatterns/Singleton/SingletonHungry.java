package creationalPatterns.Singleton;

public class SingletonHungry {
	
	//1. a private, static and final instance
	private static final SingletonHungry instance=new SingletonHungry();
	
	//2. default the constructor as a private function
	private SingletonHungry(){}
	
	//3. a static function returns the reference of the instance
	public static SingletonHungry getInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		SingletonHungry s1=SingletonHungry.getInstance();
		SingletonHungry s2=SingletonHungry.getInstance();
		System.out.println("s1"+(s1==s2?"等于":"不等于")+"s2");
	}

}
