package structurePatterns.DecoratorPattern.Framework;

class ConcreteComponent extends Component {

	@Override
	public void operate() {
		System.out.println(this.getClass().getName()+" do something ...");
	}

}
