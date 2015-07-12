package sixPrinciples.DependenceInversion;

public class BMW implements ICar {

	@Override
	public void run() {
		System.out.println("BMW出发...");
	}

}
