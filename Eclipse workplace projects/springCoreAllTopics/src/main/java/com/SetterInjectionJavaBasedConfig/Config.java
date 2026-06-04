package com.SetterInjectionJavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.SetterInjectionJavaBasedConfig")
public class Config {

	@Bean
	public Address Addbean() {
		Address add = new Address();
		add.setCity("Abu Dhabi");
		add.setCountry("Dubai");
		return add;
	}
	
	@Bean
	public Student studbean(){
		Student st = new Student();
		st.setId(101);
		st.setName("Habibi");
		st.setAd(Addbean());   // this is for object injection using setter method
		return st;
	}
	
}
