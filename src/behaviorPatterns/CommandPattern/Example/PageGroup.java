package behaviorPatterns.CommandPattern.Example;

class PageGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到美工.");
	}

	@Override
	public void add() {
		System.out.println("客户增加页面.");
	}

	@Override
	public void delete() {
		System.out.println("客户删除页面.");
	}

	@Override
	public void change() {
		System.out.println("客户修改页面.");
	}

	@Override
	public void plan() {
		System.out.println("客户变更计划.");
	}

}
