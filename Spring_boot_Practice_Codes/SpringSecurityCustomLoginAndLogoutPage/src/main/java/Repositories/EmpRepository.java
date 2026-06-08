package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entities.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{
	
	public Employee findByName(String name);

}
