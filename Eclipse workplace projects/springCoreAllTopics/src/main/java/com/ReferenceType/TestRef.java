package com.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestRef {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/ReferenceType/Refconfig.xml");
		
		Employee e = (Employee) context.getBean("Emp");
        System.out.println(e);
        

	}

}
