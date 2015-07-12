package structurePatterns.CompositePattern.SecurityPattern;


class Leaf extends Component {

	@Override
	public void doSomething() {
		System.out.println(this.getClass().getName()+" do something.");
	}

	
}
