package structurePatterns.ProxyPattern.Framework;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("request method of "+this.getClass().getName()+" processing business ...");
	}

}
