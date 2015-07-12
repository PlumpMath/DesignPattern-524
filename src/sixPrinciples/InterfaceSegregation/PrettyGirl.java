package sixPrinciples.InterfaceSegregation;

public class PrettyGirl implements IGoodBodyGirl, IGreatTemperamentGirl {

	@Override
	public void greatTemperament() {
		System.out.println("这个女孩气质很好...");
	}

	@Override
	public void goodLooking() {
		System.out.println("这个女孩脸蛋很好看...");
	}

	@Override
	public void niceFigure() {
		System.out.println("这个女孩身材火辣...");
	}

}
