package behaviorPatterns.VisitorPattern.Example;

import java.util.ArrayList;
import java.util.List;


class Client {

	public static void main(String[] args) {
		for(Employee employee:getEmployees()){
			employee.accept(new ConcreteVisitor());
		}
	}

	private static List<Employee> getEmployees(){
		List<Employee> employees=new ArrayList<Employee>();
		CommanEmployee zhang=new CommanEmployee();
		zhang.setJob("码农");
		zhang.setName("张三");
		zhang.setSalary(10000);
		zhang.setSex(Employee.MALE);
		employees.add(zhang);
		
		Manager li=new Manager();
		li.setName("李四");
		li.setPerformance("吹牛");
		li.setSalary(20000);
		li.setSex(Employee.FEMALE);
		employees.add(li);
		
		return employees;
	}
}
