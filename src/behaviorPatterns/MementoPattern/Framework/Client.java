package behaviorPatterns.MementoPattern.Framework;

class Client {

	public static void main(String[] args) {
		Originator originator=new Originator();
		originator.setState("初始状态");
		System.out.println(originator.getState());
		Caretaker caretaker=new Caretaker();
		caretaker.setMemento(originator.createMemento());
		originator.setState("更改后状态");
		System.out.println(originator.getState());
		originator.restoreMemento(caretaker.getMemento());
		System.out.println(originator.getState());
	}

}
