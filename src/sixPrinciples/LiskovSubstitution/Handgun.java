package sixPrinciples.LiskovSubstitution;

public class Handgun extends AbstractGun {

	@Override
	void shoot() {
		System.out.println("使用手枪进行射击...");
	}

}
