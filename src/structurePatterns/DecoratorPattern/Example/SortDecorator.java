package structurePatterns.DecoratorPattern.Example;

class SortDecorator extends Decorator {

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}
	
	public void reportSort(){
		System.out.println("我是班里排名38...");
	}

	public void report(){
		this.reportSort();
		super.report();
	}
}
