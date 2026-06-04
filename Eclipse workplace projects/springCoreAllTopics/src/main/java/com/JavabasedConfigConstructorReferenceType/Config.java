package com.JavabasedConfigConstructorReferenceType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.JavabasedConfigConstructorReferenceType")
public class Config {
    
	  @Bean
      public Address add() {
		  Address ad = new Address("Noida", "Dehli");
		  return ad;
      }
	  
	  @Bean
	  public Student stud(Address ad) {
		  Student st = new Student(ad); // here is Address object is inject 
		  return st;
	  }
	  
	  // for Automatic DI using Autowired refer below code
	  // first uncomment Autowired in student class
//	  @Bean
//      public Address add() {
//		  Address ad = new Address("Noida", "Dehli");
//		  return ad;
//      }
//	  
//	  @Bean
//	  public Student stud(Address ad) {
//		Student st =  new Student(ad);
//	  	return st;
//	  }
}


