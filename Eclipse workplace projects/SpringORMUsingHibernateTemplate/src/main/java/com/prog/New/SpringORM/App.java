package com.prog.New.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class App 
{
    public static void main( String[] args ){

         ApplicationContext context = new ClassPathXmlApplicationContext("com/prog/New/SpringORM/config.xml");
         HibernateTemplate ht = (HibernateTemplate) context.getBean("template", HibernateTemplate.class);      
         System.out.println(ht);
    }
}
