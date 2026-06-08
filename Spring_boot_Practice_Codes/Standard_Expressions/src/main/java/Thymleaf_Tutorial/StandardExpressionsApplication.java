package Thymleaf_Tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.Controller")
public class StandardExpressionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardExpressionsApplication.class, args);
	}

}
