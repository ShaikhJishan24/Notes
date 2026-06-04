package com.JavabasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testclass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Student s = (Student)context.getBean("stud");
		
//		s.setId(101);        // 1st way of assigning the value to the student class fields
		System.out.println(s);
		

	}

}
