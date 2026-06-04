package com.constructor.ReferenceType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testproject {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/constructor/PrimitiveType/constructprimitiveconfig.xml");
        
		Project p = (Project)context.getBean("pro");
		System.out.println(p);
	}

}
