package behaviorPatterns.ObserverPattern.ExtensionWithObservable;

import java.util.Observable;
import java.util.Observer;

public class Client {

	public static void main(String[] args) {
		HanFeiZi hanFeiZi=new HanFeiZi();
		Observer liSi=new LiSi();
		hanFeiZi.addObserver(liSi);
		hanFeiZi.eat();
		System.out.println();
		hanFeiZi.speak();
	}

}
