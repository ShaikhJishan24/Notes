package com.JavabasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.JavabasedConfiguration")
public class Config {
    
	@Bean
	public Student stud() {	
		Student student = new Student();
		student.setId(102);      // 2nd and prefered way for assinging the value to Studnet class fields
		return student;
	}

}
