package JavaBasedConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "JavaBasedConfig")
public class config {

	@Bean
	public User getuser() {
		User u = new User();
		u.setId(1);
		u.setName("Karan");
		return u;
	}
}
