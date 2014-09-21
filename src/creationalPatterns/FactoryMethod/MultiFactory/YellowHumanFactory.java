package creationalPatterns.FactoryMethod.MultiFactory;

import creationalPatterns.FactoryMethod.SimpleFactory.Human;
import creationalPatterns.FactoryMethod.SimpleFactory.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
