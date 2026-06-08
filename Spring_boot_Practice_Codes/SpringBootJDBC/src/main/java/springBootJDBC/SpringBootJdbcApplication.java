package springBootJDBC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import Dao.UserDao;
import entities.User;

@SpringBootApplication
@ComponentScan(basePackages = "Dao")
public class SpringBootJdbcApplication implements CommandLineRunner {

	@Autowired
	public UserDao Ud;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// insert 
//		User u = new User();
//		u.setId(101);
//		u.setFname("Jishan");
//		u.setLname("Shaikh");
//		u.setAge(23);
//		
//		boolean status = Ud.insert(u);
//		if(status == true){
//			System.out.println("User added successfully");
//		}
//		else {
//			System.out.println("Problem to add User");
//		}
		
		// update
//		User u = new User();
//		u.setId(101);   // This tells your code WHICH user in the DB to update
//		u.setAge(50);   // This tells your code WHAT data to change
//		boolean status = Ud.Updateuser(u);
//		if(status == true){
//			System.out.println("User Updated Successfully successfully");
//		}
//		else {
//			System.out.println("Problem to Update User Details");
//		}
		
		// deleteUserByid
//		User u = new User();
//		boolean status = Ud.DeleteuserById(101);
//		if(status == true){
//			System.out.println("User Deleted Successfully");
//		}
//		else {
//			System.out.println("Problem to delete the User ");
//		}
		
		// getUserbyId
//		User user = Ud.getUserById(101);
//		System.out.println("User details : ");
//		System.out.println(user.getFname());
//		System.out.println(user.getLname());
//		System.out.println(user.getAge());
		
		// getAllUser
		List<User> li = Ud.getAllUser();
		for(User u : li) {
			System.out.println(u.getId());
			System.out.println(u.getFname());
			System.out.println(u.getLname());
			System.out.println(u.getAge());
			System.out.println(" ");
		}
	}

	
}
