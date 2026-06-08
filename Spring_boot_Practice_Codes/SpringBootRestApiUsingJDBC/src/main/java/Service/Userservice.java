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
	public boolean InsertUser() {
		User u = new User();
		u.setId(104);
		u.setFname("Jishan");
		u.setLname("Shaikh");
		u.setAge(23);
		boolean status = Ud.insert(u);
		return status;
	}
	
	// Update
	public boolean UpdateUser(){
		User u = new User();
		u.setId(103);   // This tells your code WHICH user in the DB to update
		u.setAge(20);   // This tells your code WHAT data to change
		boolean status = Ud.Updateuser(u);
		return status;
	}
	
	// DeleteById
	public boolean DeleteUserById(int id){
		boolean status = Ud.DeleteuserById(id);
		return status;
	}
	
	// GetUserById
	public User GetUserByid(int id){
		User user = Ud.getUserById(id);
		return user;
	}
	
	// GetAllUser
	public List<User> GetAllUser(){
		List<User> li = Ud.getAllUser();
		return li;
	}
		
}
