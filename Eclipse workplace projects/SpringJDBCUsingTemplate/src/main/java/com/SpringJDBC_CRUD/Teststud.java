package com.SpringJDBC_CRUD;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Teststud {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringJDBC_CRUD/config.xml");
		
		StudDao st = (StudDao) context.getBean("studdao");
		
		// Insert 
//		Student s = new Student();
//		s.setId(103);
//		s.setName("Pavy");
//		s.setRollNo(3);
//		int status = st.Savestud(s);
//		System.out.println(status);
		
		
		// Update 
//		Student s = new Student();
//		s.setId(103);
//		s.setName("Pavy");
//		int status = st.update(s);
//		System.out.println("Sucessfully updated" + status);
		
		// Delete
//		Student s = new Student();
//		s.setId(103);
//		int status = st.delete(s);
//		System.out.println("Deleted Sucessfully " + status);
		
		// getAllstudent
		List<Student> li = st.getAllStudent();
		for(Student s : li) {
			System.out.println(s);
		}
	}

}
