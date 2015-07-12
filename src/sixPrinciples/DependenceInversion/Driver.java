package sixPrinciples.DependenceInversion;

public class Driver implements IDriver {

	@Override
	public void drive(ICar car) {
		car.run();
	}

}
