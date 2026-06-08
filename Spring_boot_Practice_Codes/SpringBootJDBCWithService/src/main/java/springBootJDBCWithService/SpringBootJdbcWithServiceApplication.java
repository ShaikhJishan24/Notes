package springBootJDBCWithService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import Service.Userservice;

@SpringBootApplication
@ComponentScan(basePackages = "Service")
public class SpringBootJdbcWithServiceApplication implements CommandLineRunner {

	
	@Autowired
	public Userservice us;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcWithServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// insert 
//        us.InsertUser();
		
		// update
//		us.UpdateUser();
		
		// deleteUserByid
//		us.DeleteUserById(104);
		
		// getUserbyId
//		us.GetUserByid(101);
		
		// getAllUser
		us.GetAllUser();
	}

	
}
