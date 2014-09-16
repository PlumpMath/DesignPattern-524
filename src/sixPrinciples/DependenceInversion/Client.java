package sixPrinciples.DependenceInversion;

public class Client {

	public static void main(String[] args) {
		IDriver driver=new Driver();

		ICar car=new Benz();
		driver.drive(car);
		
		car=new BMW();
		driver.drive(car);
	}

}
