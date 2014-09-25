package behaviorPatterns.TemplateMethod.Framework;

public class ConcreteClass extends AbstractClass {

	@Override
	protected void method1() {
		System.out.println("This is method 1 ...");
	}

	@Override
	protected void method2() {
		System.out.println("This is method 2 ...");
	}

	@Override
	protected void method3() {
		System.out.println("This is method 3 ...");
	}

}
