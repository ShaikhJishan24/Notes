package springBootRestApiUsingJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"Service", "RestControllers"} )
public class SpringBootRestApiUsingJDBC{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiUsingJDBC.class, args);
	}

	

	
}
