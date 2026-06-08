package SpringBootActuators;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("Controllers")
public class SpringBootActuatorsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorsExampleApplication.class, args);
	}

}
