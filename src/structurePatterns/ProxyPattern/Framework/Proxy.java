package structurePatterns.ProxyPattern.Framework;

public class Proxy implements Subject {

	private Subject subject = null;

	public Proxy() {
		subject = new RealSubject();
	}

	public Proxy(Object... objects) {

	}

	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		this.before();
		this.subject.request();
		this.after();
	}

	private void before() {
		System.out.println("do something before request ...");
	}

	private void after() {
		System.out.println("do something after request ...");
	}

}
