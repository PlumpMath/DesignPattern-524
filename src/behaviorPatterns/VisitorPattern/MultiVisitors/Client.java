package behaviorPatterns.VisitorPattern.MultiVisitors;

import java.util.ArrayList;
import java.util.List;

class Client {

	public static void main(String[] args) {
		ShowVisitor show=new ShowVisitor();
		TotalVisitor total=new TotalVisitor();
		for(Employee employee:mockEmployee()){
			employee.accept(show);
			employee.accept(total);
		}
		show.report();
		total.totalSalary();
	}

	public static List<Employee> mockEmployee(){
		List<Employee> employees=new ArrayList<Employee>();
		
		CommanEmployee zhang=new CommanEmployee();
		zhang.setJob("Java Coder");
		zhang.setName("Zhang San");
		zhang.setSalary(1000);
		zhang.setSex(Employee.MALE);
		employees.add(zhang);
		
		CommanEmployee li=new CommanEmployee();
		li.setJob("Database Admin");
		li.setName("Li Si");
		li.setSalary(1320);
		li.setSalary(Employee.MALE);
		System.out.println(li.getSalary());
		employees.add(li);
		
		Manager wang=new Manager();
		wang.setName("Wang Wu");
		wang.setPerformance("Fucking shit");
		wang.setSalary(10000);
		wang.setSex(Employee.FEMALE);
		employees.add(wang);
		
		return employees;
	}
}
