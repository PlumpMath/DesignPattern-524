package behaviorPatterns.CommandPattern.Example;

class Invoker {

	private Command command;
	public void setCommand(Command command){
		this.command=command;
	}
	public void action() {
		this.command.execute();
	}
}
