package com.SpringDataJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Repository.StudRepo;

@SpringBootApplication
@EntityScan("com.Entity")
@EnableJpaRepositories("com.Repository")
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		
		StudRepo strepo = context.getBean(StudRepo.class);
		System.out.println(strepo);
	}

}
