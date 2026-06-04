package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringDatabaseSecurityApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringDatabaseSecurityApplication.class, args);
	
		/*  Run this before you enter a record in
		 * database table
		 */
		// System.out.println(new BCryptPasswordEncoder().encode("admin123"));
	}
}
