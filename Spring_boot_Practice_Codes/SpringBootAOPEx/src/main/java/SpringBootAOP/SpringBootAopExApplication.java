package SpringBootAOP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import Service.Userservice;

@SpringBootApplication
@ComponentScan(basePackages = {"Service", "Aspect"})
public class SpringBootAopExApplication implements CommandLineRunner{

	@Autowired
	public Userservice userservice;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopExApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userservice.makepayment();
		userservice.createUser("Moin");
	}

}
