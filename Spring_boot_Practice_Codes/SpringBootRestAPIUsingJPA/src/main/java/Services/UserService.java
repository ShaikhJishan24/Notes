package Services;

import java.util.List;

import Entities.User;

public interface UserService {
    
	// 1)
	public User addUser(User u);
	
	// 2)
	public User updateUserByid(int id, User u);
	
	// 2.1) to Print the User update or not 
	public String update(int id, User u);
	
	// 3)
	public String deleteUserByid(int id);
	
	// 4)
	public User getUserbyid(int id);
	
	// 4.1) To print User found or not
	public String getbyid(int id);
	
	// 5)
	public List<User> getAllUser();
	
	
}
