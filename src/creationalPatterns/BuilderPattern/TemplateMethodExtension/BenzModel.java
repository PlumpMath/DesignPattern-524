package creationalPatterns.BuilderPattern.TemplateMethodExtension;

public class BenzModel extends CarModel {

	@Override
	protected void start() {
		System.out.println(this.getClass().getName()+" start ...");
	}

	@Override
	protected void stop() {
		System.out.println(this.getClass().getName()+" stop ...");
	}

	@Override
	protected void alarm() {
		System.out.println(this.getClass().getName()+" alarm ...");
	}

	@Override
	protected void engineBoom() {
		System.out.println(this.getClass().getName()+" engineBoom ...");
	}

}
