package creationalPatterns.FactoryMethod.MultiFactory;

import creationalPatterns.FactoryMethod.SimpleFactory.Human;
import creationalPatterns.FactoryMethod.SimpleFactory.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory {

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
