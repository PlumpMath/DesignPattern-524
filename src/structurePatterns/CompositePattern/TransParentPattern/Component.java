package structurePatterns.CompositePattern.TransParentPattern;

import java.util.ArrayList;

abstract class Component {
	
	public void doSomething(){
		System.out.println(this.getClass().getName()+" do something.");
	}
	
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract ArrayList<Component> getChildren();
}
