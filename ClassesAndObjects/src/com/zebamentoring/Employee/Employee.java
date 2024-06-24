package com.zebamentoring.Employee;

//Entity class
public class Employee {
	// Instance Variables
	String name;
	String department;

	// Default Constructor
	Employee() {
		super();
		name = "Zeba";
		department = "Dev";
	}

//  Parameterized Constructor without this
//	Employee(String n, String d) {
//		name = n;
//		department = d;
//	}

	// Parameterized Constructor using this
	public Employee(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	// Method
	public void displayDetails() {
		System.out.println(name + "\n" + department);
	}
}
