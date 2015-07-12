package behaviorPatterns.ObserverPattern.ExtensionWithObservable;

import java.util.Observable;
import java.util.Observer;

class LiSi implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("李斯：观察到韩非子的活动，开始向老板汇报");
		System.out.println("汇报内容："+arg.toString());
		System.out.println("李斯：汇报完毕");
	}

}
