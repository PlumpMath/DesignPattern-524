package structurePatterns.AdapterPattern;

class Adaptee {
	public void doSomething(){
		System.out.println(this.getClass().getName()+" doSomething.");
	}
}
