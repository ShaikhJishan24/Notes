package AutowiredAmbiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AutowiredAmbiguityProblem/applicationContext.xml");
        Employee e = (Employee) context.getBean("emp");
        System.out.println(e);
	}

}
