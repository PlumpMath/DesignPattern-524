package behaviorPatterns.VisitorPattern.Framework;

class Client {

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			Element element=ObjectStructure.getElement();
			element.accept(new ConcreteVisitor());
		}
	}

}
