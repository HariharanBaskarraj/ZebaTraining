package com.zebamentoring.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.displayDetails();

		System.out.println();
		
		Employee employeeTwo = new Employee("Hari", "Dev Lead");
		System.out.println(employeeTwo.name + "\n" + employeeTwo.department);
	}

}
