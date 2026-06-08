package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import Dao.UserDao;
import entities.User;

@Service
@ComponentScan(basePackages = "Dao")
public class Userservice {
		
	@Autowired
	public UserDao Ud;
	
	// Insert
	public void InsertUser() {
		User u = new User();
		u.setId(104);
		u.setFname("Jishan");
		u.setLname("Shaikh");
		u.setAge(23);
		
		boolean status = Ud.insert(u);
		if(status == true){
			System.out.println("User added successfully");
		}
		else {
			System.out.println("Problem to add User");
		}
	}
	
	// Update
	public void UpdateUser(){
		User u = new User();
		u.setId(104);   // This tells your code WHICH user in the DB to update
		u.setAge(50);   // This tells your code WHAT data to change
		boolean status = Ud.Updateuser(u);
		if(status == true){
			System.out.println("User Updated Successfully successfully");
		}
		else {
			System.out.println("Problem to Update User Details");
		}
	}
	
	// DeleteById
	public void DeleteUserById(int id){
		boolean status = Ud.DeleteuserById(id);
		if(status == true){
			System.out.println("User Deleted Successfully");
		}
		else {
			System.out.println("Problem to delete the User ");
		}
	}
	
	// GetUserById
	public void GetUserByid(int id){
		User user = Ud.getUserById(id);
		System.out.println("User details : ");
		System.out.println(user.getFname());
		System.out.println(user.getLname());
		System.out.println(user.getAge());
	}
	
	// GetAllUser
	public void GetAllUser(){
		List<User> li = Ud.getAllUser();
		for(User u : li) {
			System.out.println("Id = " + u.getId());
			System.out.println("Fname = " +u.getFname());
			System.out.println("Lname = " +u.getLname());
			System.out.println("Age = " +u.getAge());
			System.out.println(" ");
		}
	}
		
}
