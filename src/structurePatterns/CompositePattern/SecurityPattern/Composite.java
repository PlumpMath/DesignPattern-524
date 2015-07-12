package structurePatterns.CompositePattern.SecurityPattern;

import java.util.ArrayList;


class Composite extends Component {

	private ArrayList<Component> components=new ArrayList<Component>();
	
	public void add(Component component){
		this.components.add(component);
	}
	
	public void remove(Component component){
		this.components.remove(component);
	}
	
	public ArrayList<Component> getChildren(){
		return this.components;
	}
}
