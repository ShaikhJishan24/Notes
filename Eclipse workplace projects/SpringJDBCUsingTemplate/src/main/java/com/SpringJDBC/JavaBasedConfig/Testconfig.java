package com.SpringJDBC.JavaBasedConfig;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Testconfig {

	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		JdbcTemplate jd = (JdbcTemplate) context.getBean("getjdbctemplate");
		System.out.println(jd.getDataSource().getConnection());
	}

}
