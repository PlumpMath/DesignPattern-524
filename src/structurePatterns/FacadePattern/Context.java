package structurePatterns.FacadePattern;

class Context {
	private ClassA a=new ClassA();
	private ClassB b=new ClassB();
	
	public void doSomethingD(){
		System.out.println(this.getClass().getName()+" do something D.");
		this.a.doSomethingA();
		this.b.doSomethingB();
	}
}
