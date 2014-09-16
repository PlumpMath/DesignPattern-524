package sixPrinciples.LiskovSubstitution;

public class Client {

	public static void main(String[] args) {
		Soldier sanmao=new Soldier();
		AbstractGun gun=new Handgun();
		sanmao.setGun(gun);
		sanmao.killEnemy();
		
		gun=new Rifle();
		sanmao.setGun(gun);
		sanmao.killEnemy();
		
		gun=new MachineGun();
		sanmao.setGun(gun);
		sanmao.killEnemy();
	}

}
