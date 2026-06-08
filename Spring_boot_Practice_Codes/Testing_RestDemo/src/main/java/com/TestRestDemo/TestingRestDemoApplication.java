package com.TestRestDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.entities")
@EnableJpaRepositories(basePackages = "com.example.repositories")
@ComponentScan(basePackages = "com.example.*")
public class TestingRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestingRestDemoApplication.class, args);
	}

}
