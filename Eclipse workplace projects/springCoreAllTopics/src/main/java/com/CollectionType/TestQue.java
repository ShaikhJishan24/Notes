package com.CollectionType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQue {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/CollectionType/Collconfig.xml");
		
		Questions que = (Questions) context.getBean("Que");
//		System.out.println(que);
		que.show();
       
		
	}

}
