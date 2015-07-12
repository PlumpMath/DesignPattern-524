package behaviorPatterns.VisitorPattern.Framework;

import java.util.Random;

class ObjectStructure {
	public static Element getElement(){
		Random random=new Random();
		if(random.nextInt()>50){
			return new ConcreteElement();
		}else {
			return new ConcreteElement2();
		}
	}
}
