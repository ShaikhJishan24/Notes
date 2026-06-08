package practice.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import practice.Entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{
		
	Customer findById(int id);
	
	Customer findByName(String name);
	
	boolean existsByName(String name);
	
	@Query("select c from Customer c where id = ?1 And name = ?2")
	Customer findByIdAndName(int id, String name);
}
