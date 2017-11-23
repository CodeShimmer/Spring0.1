package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {

		/*
		 * Resource r=new ClassPathResource("applicationContext.xml"); BeanFactory
		 * factory=new XmlBeanFactory(r);
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee s = (Employee) context.getBean("e");
		s.show();

	}
}