package com.SpringBootRestAPIUsingJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "Controllers")
public class SpringBootRestApiUsingJPAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiUsingJPAApplication.class, args);
	}

}
