package creationalPatterns.TemplateMethod.Framework;

public abstract class AbstractClass {

	protected abstract void method1();
	protected abstract void method2();
	protected abstract void method3();
	
	public void call(){
		method1();
		method2();
		method3();
	}
}
