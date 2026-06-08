package Repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Entity.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer>{
      
	  // All below methods are created by you(Not default methods)
	  // There Implentation is provided by the JPA but you have to only declare them here 
	  List<User> findByFName(String name);
	  
	  User findByFNameAndLName(String fname, String lname);
	  
	  User findByFNameOrLName(String fname, String lname);
	  
	  List<User> findByFNameLike(String fname);
	  
	  List<User> findByOrderByFName();
	  
	  boolean existsByFName(String fname);
	  
	  // Custom Query
	  @Query("select u from User u where FName = ?1 And LName = ?2")
	  List<User>  getByFNameAndLName(String fname, String lname); 
	  
	  // using named parameter
//	  @Query("SELECT u FROM User u WHERE u.fName = :name")
//	  List<User> findByName(@Param("name") String name);

	  
}
