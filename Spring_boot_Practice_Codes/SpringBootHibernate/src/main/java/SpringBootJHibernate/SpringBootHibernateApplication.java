package SpringBootJHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Entities.Employee;

import org.hibernate.cfg.Configuration;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Configuration cfg = new Configuration();
		cfg.configure("HibernateConfig/hibernate.cfg.xml");
		SessionFactory sessionfactory = cfg.buildSessionFactory(); // it gives you session to interact with database
		
		Session session = sessionfactory.openSession();
		
		Transaction transaction = session.beginTransaction(); // used only with insert, delete and update operation
		
		// Insert
//		Employee emp = new Employee();
//		emp.setEmp_id(1);
//		emp.setName("John");
//		emp.setGender("Male");
//		try {
//        	session.save(emp);
//        	transaction.commit();
//        }
//        catch(Exception e) {
//        	transaction.rollback();
//        	e.printStackTrace();
//        }
		
		// update 
//	      try {
//	      	// to update the data
//	      	Employee emp = session.get(Employee.class, 1);
//	      	emp.setGender("Female");
//	      	
//	      	session.saveOrUpdate(emp);
//	      	transaction.commit();
//	      	
//	      	System.out.println("student details updated seccessfully");
//	      }
//	      catch(Exception e) {
//	      	transaction.rollback();
//	      	e.printStackTrace();
//	      	
//	      	System.out.println("Student details not updated");
//	      }
		
		// Delete
//			try {
//	        	Employee emp = new Employee();
//	        	emp.setEmp_id(1);
//	        	
//	        	session.delete(emp);
//	        	transaction.commit();
//	        	
//	        	System.out.println("student details deleted seccessfully");
//	        }
//	        catch(Exception e) {
//	        	transaction.rollback();
//	        	e.printStackTrace();
//	        	
//	        	System.out.println("Student details not deleted");
//	        }
		
		// getEmployeeById
			try {
	        	Employee emp = session.get(Employee.class, 1); // get give object but which object so we have to write Emlpyee.class
	        	if(emp != null) {
		        	System.out.println(emp.getEmp_id());
		        	System.out.println(emp.getName());
		        	System.out.println(emp.getGender());
	        	}
	        	else {
	        		System.out.println("student not found");
	        	}
	        }
	        catch(Exception e) {
	        	e.printStackTrace();
	        }
	}

}
