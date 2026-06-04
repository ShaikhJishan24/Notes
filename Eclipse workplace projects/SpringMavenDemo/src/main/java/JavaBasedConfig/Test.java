package JavaBasedConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		User u = (User) context.getBean("getuser");
		System.out.println(u);
	}

}
