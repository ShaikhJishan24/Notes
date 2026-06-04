package com.ConstructorInjectionJavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.SetterInjectionJavaBasedConfig")
public class Config {

	@Bean
	public Address Addbean() {
		Address add = new Address("mumbai", "maharastra");
		return add;
	}
	
	@Bean
	public Student studbean(Address ad){
		Student st = new Student(101, "kiya", ad); // this is for object injection using constructor method
		return st;
	}
	
}
