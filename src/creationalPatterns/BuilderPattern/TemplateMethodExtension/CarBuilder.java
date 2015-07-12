package creationalPatterns.BuilderPattern.TemplateMethodExtension;

import java.util.ArrayList;

public abstract class CarBuilder {

	public abstract CarModel getModel(ArrayList<String> sequence);
}
