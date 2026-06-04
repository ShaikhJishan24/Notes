package org.example;

import mypack.Company;
import mypack.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import java.math.BigDecimal;
import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Configuration cfg=new Configuration();		
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction = session.beginTransaction(); 
    Company comp = new Company();
comp.setId("C4");
comp.setName("TCS");
comp.setLocation("Hyderabad");

Employee e1 = new Employee();
e1.setId(20);
e1.setName("Akash");
e1.setSalary(new BigDecimal("90000"));

Employee e2 = new Employee();
e2.setId(21);
e2.setName("Priya");
e2.setSalary(new BigDecimal("95000"));

// create relationship both sides
e1.setCid(comp);
e2.setCid(comp);

comp.getEmployees().add(e1);
comp.getEmployees().add(e2);

session.persist(comp);   // ONLY THIS LINE
// Hibernate automatically inserts both employees also


        transaction.commit();
        session.close();

          System.out.println("Data Inserted Successfully!");

}
}