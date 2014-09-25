package behaviorPatterns.TemplateMethod.Framework;

public class Client {

	public static void main(String[] args) {
		AbstractClass template=new ConcreteClass();
		template.call();
	}

}
