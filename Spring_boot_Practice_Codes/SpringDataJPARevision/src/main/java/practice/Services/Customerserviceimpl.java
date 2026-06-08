package practice.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import practice.Entities.Customer;
import practice.Repositories.CustomerRepo;

@Service
@ComponentScan(basePackages = "practice.Repositories.CustomerRepo")
public class Customerserviceimpl implements Customerservice{

	@Autowired
	private CustomerRepo cr;
	
	@Override
	public boolean addcustomer(Customer c) {
		boolean status = false;
		try {
			cr.save(c);
			status = true;
		}
		catch(Exception e){
			e.getStackTrace();
		}
		return status;
	}
	
	@Override
	public boolean deletecust(int id) {
		boolean status = false;
		try {
			cr.deleteById(id);
			status = true;
		}
		catch(Exception e){
			e.getStackTrace();
		}
		return status;	
	}
	
	public boolean updatecust(int id) {
		
		boolean status = false;
		try {
			Customer c = cr.findById(id).get();
			c.setAge(50);
			cr.save(c);
			status = true;
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		return status;
	}

	@Override
	public Iterable<Customer> getAllCust1() {
		Iterable<Customer> i = cr.findAll();
		return i;
	}

	@Override
	public List<Customer> getAllCust2(){
		return cr.findAll();
	}

	@Override
	public Customer getcust(int id) {
		Optional<Customer> op = cr.findById(id);
		Customer c = op.get();
		return c;
	}
    
	// this method is created by user
	public List<Customer> custom1(int id){
		List<Customer> li = cr.findByCust_id(id);
		return li;
	}
	
	

}
