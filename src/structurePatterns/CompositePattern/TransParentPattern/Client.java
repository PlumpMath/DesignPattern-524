package structurePatterns.CompositePattern.TransParentPattern;

class Client {

	public void display(Component component){
		for(Component c:component.getChildren()){
			if(c instanceof Leaf){
				c.doSomething();
			}else {
				c.doSomething();
				display(c);
			}
		}
	}
}
