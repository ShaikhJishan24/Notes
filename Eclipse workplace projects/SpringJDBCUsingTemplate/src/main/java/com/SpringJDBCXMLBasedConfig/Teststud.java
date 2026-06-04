package com.SpringJDBCXMLBasedConfig;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Teststud {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringJDBC/config.xml");
		
		JdbcTemplate jd = (JdbcTemplate) context.getBean("jdbcTemplate");
		System.out.println(jd.getDataSource().getConnection());  
		
		String sql = "Insert into stud values('101', 'Radha', 3)";
		
		int i = jd.update(sql);
        System.out.println(i);
	}

}
