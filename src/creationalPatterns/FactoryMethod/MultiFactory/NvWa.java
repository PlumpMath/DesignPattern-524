package creationalPatterns.FactoryMethod.MultiFactory;

import creationalPatterns.FactoryMethod.SimpleFactory.Human;

public class NvWa {

	public static void main(String[] args) {
		Human blackHuman=new BlackHumanFactory().createHuman();
		blackHuman.getColor();
		blackHuman.talk();
		
		Human whiteHuman=new WhiteHumanFactory().createHuman();
		whiteHuman.getColor();
		whiteHuman.talk();
		
		Human yellowHuman=new YellowHumanFactory().createHuman();
		yellowHuman.getColor();
		yellowHuman.talk();

	}

}
