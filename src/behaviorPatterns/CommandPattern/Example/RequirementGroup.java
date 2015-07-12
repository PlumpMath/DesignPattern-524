package behaviorPatterns.CommandPattern.Example;

class RequirementGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到需求组.");
	}

	@Override
	public void add() {
		System.out.println("客户增加需求.");
	}

	@Override
	public void delete() {
		System.out.println("客户删除需求.");
	}

	@Override
	public void change() {
		System.out.println("客户修改需求.");
	}

	@Override
	public void plan() {
		System.out.println("客户变更计划.");
	}

}
