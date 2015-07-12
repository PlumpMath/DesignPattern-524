package behaviorPatterns.VisitorPattern.Example;

class ConcreteVisitor implements IVisitor {

	@Override
	public void visit(CommanEmployee employee) {
		System.out.println(this.getCommanEmployeeInfo(employee));
	}

	@Override
	public void visit(Manager manager) {
		System.out.println(this.getManagerInfo(manager));
	}

	private String getBasicInfo(Employee employee){
		String info = "姓名：" + employee.getName() + "\t" + "性别："
				+ (employee.getSex() == employee.MALE ? "男" : "女") + "\t"
				+ "薪水：" + employee.getSalary()+"\t";
		return info;
	}
	
	private String getManagerInfo(Manager manager){
		String info=this.getBasicInfo(manager);
		info+="业绩："+manager.getPerformance();
		return info;
	}
	
	private String getCommanEmployeeInfo(CommanEmployee employee){
		String info=this.getBasicInfo(employee);
		info+="工作："+employee.getJob();
		return info;
	}
}
