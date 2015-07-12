package sixPrinciples.LiskovSubstitution;

public class MachineGun extends AbstractGun {

	@Override
	void shoot() {
		System.out.println("使用机关枪进行射击...");
	}

}
