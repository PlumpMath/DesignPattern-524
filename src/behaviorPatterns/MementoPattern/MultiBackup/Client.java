package behaviorPatterns.MementoPattern.MultiBackup;

class Client {

	public static void main(String[] args) {
		Originator originator=new Originator();
		Caretaker caretaker=new Caretaker();
		originator.setState("1");
		System.out.println(originator.getState());
		caretaker.setMemento("1", originator.createMemento());
		originator.setState("2");
		System.out.println(originator.getState());
		caretaker.setMemento("2", originator.createMemento());
		originator.setState("3");
		System.out.println(originator.getState());
		caretaker.setMemento("3", originator.createMemento());
		
		originator.restoreMemento(caretaker.getMemento("1"));
		System.out.println(originator.getState());
	}

}
