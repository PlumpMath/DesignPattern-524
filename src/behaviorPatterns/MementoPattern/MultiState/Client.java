package behaviorPatterns.MementoPattern.MultiState;

class Client {

	public static void main(String[] args) {
		Originator originator=new Originator();
		Caretaker caretaker=new Caretaker();
		originator.setState1("state1");
		originator.setState2("state2");
		originator.setState3("state3");
		System.out.println(originator);
		caretaker.setMemento(originator.createMemento());
		originator.setState1("fuck state1");
		originator.setState2("fuck state2");
		originator.setState3("fuck state3");
		System.out.println(originator);
		originator.restoreMemento(caretaker.getMemento());
		System.out.println(originator);
	}

}
