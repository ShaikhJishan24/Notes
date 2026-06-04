package com.example.FirstPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.*")
public class SendEmailAttachmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SendEmailAttachmentApplication.class, args);
	}

}
