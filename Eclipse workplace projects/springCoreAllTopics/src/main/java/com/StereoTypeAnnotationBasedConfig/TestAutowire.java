package com.StereoTypeAnnotationBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/StereoTypeAnnotationBasedConfig/config.xml");
        
		Student s = (Student) context.getBean("stud");
		System.out.println(s);
	}

}
