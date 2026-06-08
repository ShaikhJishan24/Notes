package RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Service.Userservice;
import entities.User;

@RestController
public class SimpleController {
      
	@Autowired
    public Userservice us;
	
	// get method of restController
	@GetMapping("/user")
	public String democode(){
		return "This is user";
	}
	
	// insert the data
	@RequestMapping(value="/adduser", method= {RequestMethod.POST, RequestMethod.GET})
	public String postUser(){
		boolean status = us.InsertUser();
		return status ? "User added successfully" : "Problem to add User";
	}
	
	// Delete method to delete user
	@RequestMapping(value="/deleteuser/{id}", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteUserbyid(@PathVariable("id") int id){
		boolean status = us.DeleteUserById(id);
		return status ? "User deleted successfully" : "User not found or failed to delete";
	}
	
	// Update the user
	@RequestMapping(value="/updateuser", method= {RequestMethod.PUT, RequestMethod.GET})
	public String UpdateTheUser() {
		boolean status = us.UpdateUser();
		return status ? "User Updated successfully" : "Problem to Update User Details";
	}
		
	// get method of restController for getting User by id
	@GetMapping("/user/{id}")
	public User getUserByid(@PathVariable("id") int id){
		User u = us.GetUserByid(id);
		return u;
	}
	
	// get method of restController for getting All User
	@GetMapping("/users")
	public List<User> getAllUser(){
		List<User> l = us.GetAllUser();
		return l;
	}
	
}
