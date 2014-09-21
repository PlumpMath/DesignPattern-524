package creationalPatterns.FactoryMethod.MultiFactory;

import creationalPatterns.FactoryMethod.SimpleFactory.BlackHuman;
import creationalPatterns.FactoryMethod.SimpleFactory.Human;

public class BlackHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}

}
