package creationalPatterns.AbstractFactory;

public abstract class AbstractProductA {

	public void sharedMethod(){
		System.out.println("抽象类"+this.getClass().getName()+"中的公共方法...");
	}
	
	public abstract void doSomething();
}
