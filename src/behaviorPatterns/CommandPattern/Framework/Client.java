package behaviorPatterns.CommandPattern.Framework;

class Client {

	public static void main(String[] args) {
		Invoker invoker=new Invoker();
		Receiver receiver=new ConcreteReceiver1();
		Command command=new ConcreteCommand1(receiver);
		invoker.setCommand(command);
		invoker.action();
		
		receiver=new ConcreteReceiver2();
		command=new ConcreteCommand2(receiver);
		invoker.setCommand(command);
		invoker.action();
	}

}
