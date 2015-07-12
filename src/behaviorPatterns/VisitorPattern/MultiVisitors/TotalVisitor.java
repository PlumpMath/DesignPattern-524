package behaviorPatterns.VisitorPattern.MultiVisitors;

class TotalVisitor implements ITotalVisitor {

	private final static int MANAGER_COEFFICIENT = 5;
	private final static int COMMONEMPLOYEE_COEFFICIENT = 2;
	private int commanTotalSalary = 0;
	private int managerTotalSalary = 0;

	@Override
	public void visit(CommanEmployee employee) {
		this.commanTotalSalary += employee.getSalary()
				* COMMONEMPLOYEE_COEFFICIENT;
	}

	@Override
	public void visit(Manager manager) {
		this.managerTotalSalary += manager.getSalary() * MANAGER_COEFFICIENT;
	}

	@Override
	public void totalSalary() {
		System.out.println("Total salary of this month is "
				+ (this.commanTotalSalary + this.managerTotalSalary));
	}

}
