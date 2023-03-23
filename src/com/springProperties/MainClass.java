package com.springProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springProperties/springProperties.xml");
		EmployeeDetails emp1 = con.getBean("e1", EmployeeDetails.class);
		System.out.println(emp1);
		
		EmployeeDetails emp3= con.getBean("e1", EmployeeDetails.class);
		System.out.println(emp3);

		EmployeeDetails emp2 = con.getBean("e2", EmployeeDetails.class);
		System.out.println(emp2);
		
		EmployeeDetails emp4 = con.getBean("e2", EmployeeDetails.class);
		System.out.println(emp4);
		
		
		
		// Scope
		
		System.out.println("Singleton Scope " + emp1.hashCode());
		System.out.println("Singleton Scope " + emp3.hashCode());
		System.out.println();
		System.out.println("Prototype Scope " + emp2.hashCode());
		System.out.println("Prototype Scope " + emp4.hashCode());
		
		
		
		
		
	}

}
