package practice.Services;

import java.util.List;

import practice.Entities.Customer;

public interface Customerservice{
	 // add customer
	 public boolean addcustomer(Customer c);
	 
	 // delete by id
	 public boolean deletecust(int id);
	 
	 // Update the Customer
	 public boolean updatecust(int id);
		 
	 // get All customer using Iterable
	 public Iterable<Customer> getAllCust1();
	 
	 // get All Customer Using List
	 public List<Customer> getAllCust2();
	 
	 // findById
	 public Customer getcust(int id);
	 
	 
	 
	 
}
