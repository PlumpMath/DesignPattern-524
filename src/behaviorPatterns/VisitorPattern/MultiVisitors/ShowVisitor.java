package behaviorPatterns.VisitorPattern.MultiVisitors;

class ShowVisitor implements IShowVisitor {

	private String info = "";

	private String getBasicInfo(Employee employee) {
		String info = "Name:" + employee.getName() + "\t" + "Sex:"
				+ (employee.getSex() == Employee.MALE ? "Male" : "Female")
				+ "\t" + "Salary:" + employee.getSalary() + "\t";
		return info;
	}

	@Override
	public void visit(CommanEmployee employee) {
		this.info+=this.getBasicInfo(employee);
		this.info+="Job:"+employee.getJob()+"\n";
	}

	@Override
	public void visit(Manager manager) {
		this.info+=this.getBasicInfo(manager);
		this.info+="Performance:"+manager.getPerformance()+"\n";
	}

	@Override
	public void report() {
		System.out.println(this.info);
	}

}
