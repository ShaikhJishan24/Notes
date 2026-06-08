package SpringDataJPARevisionCustomMethods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import practice.Entities.Customer;
import practice.Repositories.CustomerRepo;

@SpringBootApplication
@EnableJpaRepositories("practice.Repositories")
@EntityScan("practice.Entities")
public class SpringDataJPARevisionCustomMethodsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJPARevisionCustomMethodsApplication.class, args);
	    
		CustomerRepo customerrepo = context.getBean(CustomerRepo.class);
		
		// findById
//		Customer c = customerrepo.findById(103);
//		System.out.println("Id : "+c.getId());
//		System.out.println("Name : " + c.getName());
//		System.out.println("Age : "+ c.getAge());
			
		// findByName
//		Customer c = customerrepo.findByName("maya");
//		System.out.println("Id : "+c.getId());
//		System.out.println("Name : " + c.getName());
//		System.out.println("Age : "+ c.getAge());
		
		// 
//		boolean f = customerrepo.existsByName("maya");
//		System.out.println("Customer is Exits or Not " + f);
		
		// below method using the custom query
		Customer c = customerrepo.findByIdAndName(101, "Zoya");
		System.out.println("Id : "+c.getId());
		System.out.println("Name : " + c.getName());
		System.out.println("Age : "+ c.getAge());
	}

}
