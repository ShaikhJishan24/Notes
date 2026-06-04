package com.JavabasedConfig.ReferenceType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.JavabasedConfig.ReferenceType")
public class Config {
    
	@Bean
	public Address address() {	
		Address ad = new Address();
		ad.setCity("mumbai");
		ad.setCountry("India");
		return ad;
	}

	// This code is for dependency injection
	@Bean
	public Student stud(Address ad){
		Student st = new Student();
		st.setAdd(ad);        // it is important line
		return st;
	}
	
	// This below code is for Autowired(Automatic DI), first we have to uncomment Autowired Annoatation
//	@Bean
//	public Address address() {	
//		Address ad = new Address();
//		ad.setCity("mumbai");
//		ad.setCountry("India");
//		return ad;
//	}
	
//	@Bean
//	public Student stud() {
//		return new Student();
//	}
}



