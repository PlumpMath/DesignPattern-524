package structurePatterns.DecoratorPattern.Framework;


class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}
	
	private void method1(){
		System.out.println("method1 decorator ...");
	}
	
	public void operate(){
		this.method1();
		super.operate();
	}

}
