package Securityconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import Entities.Employee;
import Repositories.EmpRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	private EmpRepository emprepo;
	
	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		
		Employee emp = emprepo.findByName(name);

		if (emp == null) {
			throw new UsernameNotFoundException("user name not found");
		} else {
			CustomEmployee cm = new CustomEmployee(emp);
			return cm;
		}
	}

}
