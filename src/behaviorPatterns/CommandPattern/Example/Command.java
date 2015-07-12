package behaviorPatterns.CommandPattern.Example;

abstract class Command {

	protected RequirementGroup rg=new RequirementGroup();
	protected PageGroup pg=new PageGroup();
	protected CodeGroup cg=new CodeGroup();
	
	public abstract void execute();
}
