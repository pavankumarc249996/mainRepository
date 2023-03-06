package com.pavan.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Action {
	
	public static void main(String[] args) {
		
		/*Employee employee = Employee.getEmployee();
		Employee employee1 = Employee.getEmployee();
		Employee employee2 = Employee.getEmployee();
		Employee employee3 = Employee.getEmployee();
		Employee employee4 = Employee.getEmployee();
		System.out.println(employee);
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		System.out.println(employee3.hashCode());
		System.out.println(employee4.hashCode());*/
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		
		Employee employee = (Employee) context.getBean("employeeId");
		System.out.println(employee);
	}

}
