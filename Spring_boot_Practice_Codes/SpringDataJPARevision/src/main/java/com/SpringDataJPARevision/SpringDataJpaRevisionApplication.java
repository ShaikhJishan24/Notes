package com.SpringDataJPARevision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import practice.Entities.Customer;
import practice.Services.Customerservice;
import practice.Services.Customerserviceimpl;

@SpringBootApplication
@ComponentScan(basePackages = "practice.Services")
@EnableJpaRepositories("practice.Repositories")   // it use coz enable to create repository class bean
@EntityScan("practice.Entities")   // it use coz enable to recognise the entity class
public class SpringDataJpaRevisionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaRevisionApplication.class, args);
	    
		Customerservice cs = context.getBean(Customerserviceimpl.class);
		
		//1) To save the User
//		Customer c = new Customer();
//		c.setCust_id(1);
//		c.setName("Maxwell");
//		c.setAge(20);
//		boolean status = cs.addcustomer(c);
//		if(status == true) {
//			System.out.println("Customer deleted Successfully");
//		}
//		else {
//			System.out.println("Customer Not Deleted");
//		}
		
		//2) delete by id
//		boolean status = cs.deletecust(3);
//		if(status == true) {
//			System.out.println("Customer deleted Successfully");
//		}
//		else {
//			System.out.println("Customer Not Deleted");
//		}
		
		//5) update the customer
//		boolean status = cs.updatecust(2);
//		if(status == true) {
//			System.out.println("Customer updated Successfully");
//		}
//		else {
//			System.out.println("Customer Not Updated");
//		}
				
//		//3) To get All customer using iterable
//		Iterable<Customer> i = cs.getAllCust1();
//		for(Customer c : i) {
//			System.out.println("id = " + c.getCust_id());
//			System.out.println("Name = " + c.getName());
//			System.out.println("Age = " + c.getAge());
//		}
	
		//3) To get All customer using list
//		Iterable<Customer> i = cs.getAllCust1();
//		for(Customer c : i) {
//			System.out.println("id = " + c.getCust_id());
//			System.out.println("Name = " + c.getName());
//			System.out.println("Age = " + c.getAge());
//		}
		
		//4) get Customer by id
//		Customer c = cs.getcust(1);
//		System.out.println("id = " + c.getCust_id());
//		System.out.println("Name = " + c.getName());
//		System.out.println("Age = " + c.getAge());
				
	}

}
