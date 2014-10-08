package structurePatterns.CompositePattern.SecurityPattern;

abstract class Component {

	public void doSomething(){
		System.out.println(this.getClass().getName()+" do something .");
	}
}
