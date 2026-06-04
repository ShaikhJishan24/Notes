package com.AutowiringXML_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/AutowiringXML_based/Autoconfig.xml");
        
		student s = (student) context.getBean("st");
		System.out.println(s);
	}

}
