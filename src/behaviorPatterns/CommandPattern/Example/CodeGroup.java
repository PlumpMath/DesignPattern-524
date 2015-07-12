package behaviorPatterns.CommandPattern.Example;

class CodeGroup extends Group {

	@Override
	public void find() {
		System.out.println("找到代码组.");
	}

	@Override
	public void add() {
		System.out.println("客户增加代码.");
	}

	@Override
	public void delete() {
		System.out.println("客户删除代码.");
	}

	@Override
	public void change() {
		System.out.println("客户修改代码.");
	}

	@Override
	public void plan() {
		System.out.println("客户修改计划.");
	}

}
