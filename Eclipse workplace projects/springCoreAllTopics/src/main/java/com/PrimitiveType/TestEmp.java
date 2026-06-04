package com.PrimitiveType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		
		   ApplicationContext context = new ClassPathXmlApplicationContext("com/PrimitiveType/Empconfig.xml");
		
		   Employee e = (Employee) context.getBean("Emp");
           System.out.println(e);
           System.out.println(e.getName());
           
           e.show();
           
	}

}
