package behaviorPatterns.MementoPattern.Clone;

class Client {

	public static void main(String[] args) {
		Originator originator=new Originator();
		originator.setState("初始化状态");
		System.out.println(originator.getState());
		originator.createMemento();
		originator.setState("更改后状态");
		System.out.println(originator.getState());
		originator.restoreMemento();
		System.out.println(originator.getState());
	}

}
