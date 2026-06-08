package com.SpringDataJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import Entity.User;
import Repository.UserRepo;


@SpringBootApplication
@EntityScan("Entity")
@EnableJpaRepositories("Repository")
public class SpringDataJpacrudApplication {
    
	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(SpringDataJpacrudApplication.class, args);
		
		UserRepo ur = context.getBean(UserRepo.class);
		
//		User u = new User();
//		u.setFName("Jishan");
//		u.setLName("Shaikh");
		
//		User u = new User();
//		u.setFName("Mohit");
//		u.setLName("Kumar");
		
		//1)  Save Method
//		ur.save(u);
		
		//2) getRecored method
		// Using Iterator 
//		Iterable<User> ui = ur.findAll();		
//		for(User user: ui) {
//			System.out.println(user);
//		}
		
		// USing List
//		List<User> li = (List<User>) ur.findAll();
//		for(User user : li) {
//			System.out.println(user);
//		}
		
		//3) FindById method
//		Optional<User> user = ur.findById(2);    // it Search that particular value	
//		User us = user.get();           //it retrieve information of that Id
//		System.out.println(us.getId());  // Print data of that id 
//		System.out.println(us.getFName());
		
		
		//4) DeleteById
//		ur.deleteById(3);
		
		//5) Update 
		
//		User user = ur.findById(2).get(); 
//		System.out.println(user);
//		user.setFName("Jhon");
//		user.setLName("Cena");
//		ur.save(user);
		
		
		// Another methods than Crud Operation that created by you
//		User u = ur.findByFName("Jishan");
//		System.out.println(u);
		
//		List<User> s = ur.findByFName("Jishan");
//		s.forEach(e -> System.out.println(e));
		
//		User u1 = ur.findByFNameAndLName("Rekha", "Ahire");
//		System.out.println(u1);
		
//		User u2 = ur.findByFNameOrLName("Jindal", "Shaikh");
//		System.out.println(u2);
		
//		List<User> u3 = ur.findByFNameLike("Jhon");
//		u3.forEach(e -> System.out.println(e));
		
//		List<User> u4 = ur.findByOrderByFName();
//		u4.forEach(e -> System.out.println(e));
		
//		boolean f = ur.existsByFName("Rekha");
//		System.out.println(f);
		
		
		List<User> u5 = ur.getByFNameAndLName("Jishan", "Shaikh");
		System.out.println(u5);
		
	}

}
