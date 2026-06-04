package com.JavabasedConfig.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testclass {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Student s = (Student)context.getBean("stud");
		
        System.out.println(s);
//      System.out.println(s.getAdd());
		

	}

}
