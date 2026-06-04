package com.SpringORMNew;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	@SuppressWarnings("deprecation")
	public static void main( String[] args )
    {    
    	// step 1 - load xml file and build sessionfactory
        Configuration cfg = new Configuration();
        cfg.configure("com/SpringORMNew/hibernate.cfg.xml");
        SessionFactory sessionfactory = cfg.buildSessionFactory();
        
        // step 2 - open session
        Session session = sessionfactory.openSession();
        
        // step 3 - start transaction
        Transaction transaction = session.beginTransaction(); // used only with insert, delte and update operation
        
        // step 4 - create and save entity
//        Student st = new Student();
//        st.setName("Moin");
//        st.setAge(27);
        
        // Step 5 - commit and close transaction
        
        // CRUD Operations
        // Save or insert operation
//        try {
//        	// to save data in Tables (Insert)
//        	session.save(st);
//        	transaction.commit();
//        }
//        catch(Exception e) {
//        	transaction.rollback();
//        	e.printStackTrace();
//        }
        
        // Get or Select operation here is no need of transaction object or methods
//        try {
//        	// to get data from the tables (Select)
//        	Student st1 = session.get(Student.class, 2L);
//        	if(st1 != null) {
//	        	System.out.println(st1.getStid());
//	        	System.out.println(st1.getName());
//	        	System.out.println(st1.getAge());
//        	}
//        	else {
//        		System.out.println("student not found");
//        	}
//        }
//        catch(Exception e) {
//        	e.printStackTrace();
//        }
        
        // update 
//        try {
//        	// to update the data
//        	Student st2 = session.get(Student.class, 2L);
//        	st2.setAge(30);
//        	
//        	session.saveOrUpdate(st2);
//        	transaction.commit();
//        	
//        	System.out.println("student details updated seccessfully");
//        }
//        catch(Exception e) {
//        	transaction.rollback();
//        	e.printStackTrace();
//        	
//        	System.out.println("Student details not updated");
//        }

        try {
        	// to delete the data
        	Student st3 = new Student();
        	st3.setStid(2);
        	
        	session.delete(st3);
        	transaction.commit();
        	
        	System.out.println("student details deleted seccessfully");
        }
        catch(Exception e) {
        	transaction.rollback();
        	e.printStackTrace();
        	
        	System.out.println("Student details not deleted");
        }
        
        
    }
}
