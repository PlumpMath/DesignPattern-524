package structurePatterns.ProxyPattern.Framework;

public class Client {

	public static void main(String[] args) {

		Subject realSubject=new RealSubject();
		Subject proxySubject=new Proxy(realSubject);
		proxySubject.request();
	}

}
