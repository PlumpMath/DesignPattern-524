package creationalPatterns.Singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonLazy {

	// 1. a private, static and final instance
	private static SingletonLazy instance = null;

	// 2. a private default constructor
	private SingletonLazy() {
	}

	// 3. a public, static and synchronized function returns the instance
	public static synchronized SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}

	public static void main(String[] args) throws InterruptedException {
		List<SingletonLazy> sList = new ArrayList<SingletonLazy>();
		List<Thread> threads = new ArrayList<Thread>();

		for (int i = 0; i < 100; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("获得实例...");
					sList.add(SingletonLazy.getInstance());
				}
			});
			threads.add(thread);
		}
		
		for(Thread th:threads){
			th.start();
		}
		
		for(Thread th:threads){
			th.join();
		}

		boolean flag = true;
		for (int i = 1; i < sList.size(); i++) {
			if (flag && sList.get(i - 1) == sList.get(i)) {

			} else {
				flag = false;
			}
		}

		if (flag) {
			System.out.println("线程安全...");
		} else {
			System.out.println("线程不安全...");
		}
	}

}
