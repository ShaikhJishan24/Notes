package Com.SpringBootRevision;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "Controllers")
public class SpringBootRevisionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRevisionApplication.class, args);
	}

}
