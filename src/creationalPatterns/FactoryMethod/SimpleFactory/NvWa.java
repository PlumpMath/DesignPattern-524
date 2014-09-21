package creationalPatterns.FactoryMethod.SimpleFactory;

public class NvWa {

	public static void main(String[] args) {
		Human whiteHuman=HumanFactory.createHuman(WhiteHuman.class);
		whiteHuman.getColor();
		whiteHuman.talk();
		
		Human blackHuman=HumanFactory.createHuman(BlackHuman.class);
		blackHuman.getColor();
		blackHuman.talk();
		
		Human yellowHuman=HumanFactory.createHuman(YellowHuman.class);
		yellowHuman.getColor();
		yellowHuman.talk();
	}

}
