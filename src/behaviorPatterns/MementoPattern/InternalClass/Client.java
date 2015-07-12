package behaviorPatterns.MementoPattern.InternalClass;

class Client {

	public static void main(String[] args) {
		Originator originator=new Originator();
		Caretaker caretaker=new Caretaker();
		originator.setState("1");
		System.out.println(originator.getState());
		caretaker.setMemento(originator.createMemento());
		originator.setState("2");
		System.out.println(originator.getState());
		originator.restoreMemento(caretaker.getMemento());
		System.out.println(originator.getState());
	}

}
