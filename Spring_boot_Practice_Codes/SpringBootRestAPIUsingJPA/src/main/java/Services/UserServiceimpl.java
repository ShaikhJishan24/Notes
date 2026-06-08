package Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import Entities.User;
import Repositories.UserRepo;

@Service
@ComponentScan(basePackages = "Repositories.UserRepo")
@EnableJpaRepositories(basePackages = "Repositories")
@EntityScan(basePackages = "Entities")
public class UserServiceimpl implements UserService{

	@Autowired
	private UserRepo userrepo;
	
	// 1)
	@Override
	public User addUser(User u) {	
		return userrepo.save(u);
	}
	
	// 2)
	@Override
	public User updateUserByid(int id, User u) {
		User userdata = userrepo.findById(102).get();
		
		if(userdata != null) {
			return userrepo.save(u);
		}
		return null;
	};
	
	// 2.1) to Print the User update or not 
	@Override
	public String update(int id, User u) {
		User userdata = userrepo.findById(102).get();
		
		if(userdata != null) {
			return userrepo.save(u) != null ? "User updated": "User not updated";
		}
		return null;
	};
	
	// 3) 
	public String deleteUserByid(int id) {
		boolean status = userrepo.existsById(id);
		if(status == true) {
			return "User Deleted";
		}
		else {
			return "User Not found";
		}	
	}

	// 4)
	@Override
	public User getUserbyid(int id) {
		Optional<User> ou = userrepo.findById(id);
		User u = ou.get();
		return u;
	}

	// 4.1) To print User found or not
	@Override
	public String getbyid(int id) {
		Optional<User> ou = userrepo.findById(id);
		return ou.get() != null? "User found Sucessfylly" : "User not found";
	}

	// 5)
	@Override
	public List<User> getAllUser() {
		return userrepo.findAll();
	}

	
	
	

}
