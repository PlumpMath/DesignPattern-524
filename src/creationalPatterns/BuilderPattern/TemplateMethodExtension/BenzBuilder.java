package creationalPatterns.BuilderPattern.TemplateMethodExtension;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

	@Override
	public CarModel getModel(ArrayList<String> sequence) {
		CarModel carModel=new BenzModel();
		carModel.setSequence(sequence);
		return carModel;
	}

}
