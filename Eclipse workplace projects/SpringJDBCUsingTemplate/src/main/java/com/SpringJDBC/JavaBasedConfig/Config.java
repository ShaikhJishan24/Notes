package com.SpringJDBC.JavaBasedConfig;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {
      
	@Bean
	public DataSource getdatasource() {
		
		DriverManagerDataSource dm = new DriverManagerDataSource();
		dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dm.setUrl("jdbc:mysql://localhost/Ziyana");
		dm.setUsername("root");
		dm.setPassword("Jishan@9136");
		return dm;
	}
	
	@Bean
	public JdbcTemplate getjdbctemplate() {	
		JdbcTemplate jd = new JdbcTemplate();
		// Below line is used to inject object of JDBCTemple into DriverManagerDataSource uisng setter method(DI)
		jd.setDataSource(getdatasource());
		return jd;
	}
		
}
