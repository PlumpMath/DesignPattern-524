package creationalPatterns.BuilderPattern.TemplateMethodExtension;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

	@Override
	public CarModel getModel(ArrayList<String> sequence) {
		CarModel carModel=new BMWModel();
		carModel.setSequence(sequence);
		return carModel;
	}

}
