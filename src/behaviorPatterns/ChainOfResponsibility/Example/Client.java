package behaviorPatterns.ChainOfResponsibility.Example;

import java.util.ArrayList;
import java.util.Random;

class Client {

	public static void main(String[] args) {

		Random random=new Random();
		ArrayList<IWoman> arrayList=new ArrayList<IWoman>();
		for(int i=0;i<5;i++){
			arrayList.add(new Woman(random.nextInt(4), "我要出去逛街."));
		}
		
		Handler father=new Father();
		Handler husband=new Husband();
		Handler son=new Son();
		father.setNext(husband);
		husband.setNext(son);
		for(IWoman woman:arrayList){
			father.HandleMessage(woman);
		}
	}

}
