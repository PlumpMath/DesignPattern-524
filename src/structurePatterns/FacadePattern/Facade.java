package structurePatterns.FacadePattern;

class Facade {
	private ClassA a=new ClassA();
	private ClassB b=new ClassB();
	private ClassC c=new ClassC();
	private Context context=new Context();
	
	public void methodA(){
		this.a.doSomethingA();
	}
	
	public void methodB(){
		this.b.doSomethingB();
	}
	
	public void methodC(){
		this.c.doSomethingC();
	}
	
	public void methodD(){
		this.context.doSomethingD();
	}
}
