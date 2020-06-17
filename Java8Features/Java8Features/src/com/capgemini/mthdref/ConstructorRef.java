package com.capgemini.mthdref;

public class ConstructorRef {

	public static void main(String a[]) {

		EmployeeFactory empFactory = Employee::new;
		Employee emp = empFactory.getEmployee
				("kolaparthi", "Accounts", 8000);
		System.out.println(emp);
	}
}