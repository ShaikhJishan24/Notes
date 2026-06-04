package com.XMLBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass {

	public static void main(String[] args) {
		
		// it load the IOC container
		// Here we can also used 2nd Method which is BeanFactory method
		
		// This is first method
		ApplicationContext context = new ClassPathXmlApplicationContext("com/prog/New/demospringproject/applicationContext.xml");    
//		System.out.println(context);
		
		// this step is used to get beans means we can access the methods of bean class
		Student s = (Student) context.getBean("studentbean");
//		System.out.println(s.getName());
//		System.out.println(s);
		s.display();
		
	}

}
