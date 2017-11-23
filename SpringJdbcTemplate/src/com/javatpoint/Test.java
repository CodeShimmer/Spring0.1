package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");

		
		int status = dao.saveEmployee(new Employee(102, "Amit", 35000));
		status = dao.saveEmployee(new Employee(103, "Shekar", 14000));
		status = dao.saveEmployee(new Employee(104, "Sankar", 16000));
		status = dao.saveEmployee(new Employee(105, "Shiva", 16000));
		status = dao.saveEmployee(new Employee(106, "Sunny", 17000));
		status = dao.saveEmployee(new Employee(107, "Sathish", 18000));
		System.out.println(status);

		/*
		 * int status = dao.updateEmployee(new Employee(102, "Sonu", 15000));
		 * 
		 * status = dao.updateEmployee(new Employee(103, "Shekar", 14000)); status =
		 * dao.updateEmployee(new Employee(104, "Sankar", 16000)); status =
		 * dao.updateEmployee(new Employee(105, "Shiva", 16000)); status =
		 * dao.updateEmployee(new Employee(106, "Sunny", 17000)); status =
		 * dao.updateEmployee(new Employee(107, "Sathish", 18000));
		 * 
		 * System.out.println(status);
		 */

		/*Employee e = new Employee();
		e.setId(102);
		int status = dao.deleteEmployee(e);
		System.out.println(status);*/

	}

}
