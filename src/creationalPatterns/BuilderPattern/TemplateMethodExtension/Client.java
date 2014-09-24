package creationalPatterns.BuilderPattern.TemplateMethodExtension;

public class Client {

	public static void main(String[] args) {
		Director director=new Director();

		CarModel bmwModel=director.getBmwModel();
		bmwModel.run();
		
		System.out.println("======================================");
		
		CarModel benzModel=director.getBenzModel();
		benzModel.run();
	}

}
