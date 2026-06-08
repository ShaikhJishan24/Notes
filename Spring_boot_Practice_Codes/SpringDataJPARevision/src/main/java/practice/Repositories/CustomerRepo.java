package practice.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import practice.Entities.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

	// below method is created by user
	List<Customer> findByCust_id(int id);
}
