package com.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.Entity.Employee;
import com.Entity.Mobile;
import com.Repository.EmpRepo;
import com.Repository.MobileRepo;


@SpringBootApplication
@EnableJpaRepositories("com.Repository")
@EntityScan("com.Entity")
public class SpringJpaMappingApplication implements CommandLineRunner{
    
	@Autowired
	private EmpRepo emprepo;
	
	@Autowired
	private MobileRepo mobilerepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	    
		Employee e = new Employee();
		e.setEmpname("Madhval");
		
		Mobile m = new Mobile();
		m.setMobilename("Iphone 14");
		
		e.setMobile(m);
		
		emprepo.save(e);
		mobilerepo.save(m);
		
	}

}
