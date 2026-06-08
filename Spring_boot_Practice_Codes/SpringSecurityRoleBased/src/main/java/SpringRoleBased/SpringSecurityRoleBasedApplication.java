package SpringRoleBased;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.becoder.repository")
@EntityScan(basePackages = "com.becoder.entity")
@ComponentScan(basePackages = {"com.becoder.controller","com.becoder.config"})
public class SpringSecurityRoleBasedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityRoleBasedApplication.class, args);
	}

}
