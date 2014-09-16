package sixPrinciples.LiskovSubstitution;

public class Soldier {
	private AbstractGun gun;

	void setGun(AbstractGun gun){
		this.gun=gun;
	}

	void killEnemy(){
		System.out.println("射杀敌人...");
		gun.shoot();
	}
}
