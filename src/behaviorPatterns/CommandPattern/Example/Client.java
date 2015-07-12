package behaviorPatterns.CommandPattern.Example;

class Client {

	public static void main(String[] args) {
		Invoker invoker=new Invoker();
		Command addRequirementCommand=new AddRequirementCommand();
		invoker.setCommand(addRequirementCommand);
		invoker.action();
		
		Command deleteRequirementCommand=new DeletePageCommand();
		invoker.setCommand(deleteRequirementCommand);
		invoker.action();
	}

}
