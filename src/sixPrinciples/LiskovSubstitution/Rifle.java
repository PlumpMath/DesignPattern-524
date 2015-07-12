package sixPrinciples.LiskovSubstitution;

public class Rifle extends AbstractGun {

	@Override
	void shoot() {
		System.out.println("使用来复枪设计...");
	}

}
