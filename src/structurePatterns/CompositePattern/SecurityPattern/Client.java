package structurePatterns.CompositePattern.SecurityPattern;

public class Client {

	public static void main(String[] args) {
		
		Composite root=new Composite();
		root.doSomething();
		
		Composite branch=new Composite();
		Leaf leaf=new Leaf();
		
		branch.add(leaf);
		root.add(branch);
		display(root);

	}
	
	public static void display(Composite composite){
		for(Component c:composite.getChildren()){
			if(c instanceof Leaf){
				c.doSomething();
			}else{
				c.doSomething();
				display((Composite)c);
			}
		}
	}

}
