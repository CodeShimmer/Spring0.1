package com.javatpoint;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertTest {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		EmployeeDao dao = (EmployeeDao) factory.getBean("d");

		Employee e = new Employee();
		e.setId(118);
		e.setName("Teja Krishna");
		e.setSalary(50000);

		dao.saveEmployee(e);
		System.out.println(dao.getById(114));
		
		System.out.println(dao.getEmployees());
	}
}