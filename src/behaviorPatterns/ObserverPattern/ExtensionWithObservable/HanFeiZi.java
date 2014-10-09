package behaviorPatterns.ObserverPattern.ExtensionWithObservable;

import java.util.Observable;

class HanFeiZi extends Observable implements IHanFeiZi {

	@Override
	public void eat() {
		System.out.println("开始吃饭了");
		super.setChanged();
		super.notifyObservers("韩非子开始吃饭了");
	}

	@Override
	public void speak() {
		System.out.println("开始讲话了");
		super.setChanged();
		super.notifyObservers("韩非子开始讲话了");
	}

}
