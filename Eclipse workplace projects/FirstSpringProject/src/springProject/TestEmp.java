package springProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springProject/config.xml");
	}

}
