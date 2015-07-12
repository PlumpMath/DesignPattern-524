package creationalPatterns.BuilderPattern.TemplateMethodExtension;

import java.util.ArrayList;

public class Director {

	private ArrayList<String> sequence=new ArrayList<String>();
	private BenzBuilder benzBuilder=new BenzBuilder();
	private BMWBuilder bmwBuilder=new BMWBuilder();
	
	public BenzModel getBenzModel(){
		sequence.clear();
		sequence.add("start");
		sequence.add("engineBoom");
		sequence.add("stop");
		return (BenzModel)benzBuilder.getModel(sequence);
	}
	
	public BMWModel getBmwModel(){
		sequence.clear();
		sequence.add("start");
		sequence.add("engineBoom");
		sequence.add("alarm");
		sequence.add("stop");
		return (BMWModel)bmwBuilder.getModel(sequence);
	}
}
