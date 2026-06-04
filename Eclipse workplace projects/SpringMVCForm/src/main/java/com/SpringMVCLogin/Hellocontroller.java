package com.SpringMVCLogin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hellocontroller {
    
	@RequestMapping("/register") 
	public String register() {
		return "register"; 
	}
	 
	@RequestMapping(value= "/registrationprocess", method = { RequestMethod.GET, RequestMethod.POST })
	public String CreateUser(@ModelAttribute("st") Student st){
	    System.out.println(st);
//	    System.out.println(st.getName());
		return "register";
	}
	
	
	// Send data from controller to view pages using model interface but @ModelAttribute
	// used to recieve data from view page and bind to student bean class variable
//	@RequestMapping(value= "/registrationprocess", method = { RequestMethod.GET, RequestMethod.POST })
//	public String CreateUser(@ModelAttribute("st") Student st, Model m){
//		m.addAttribute("student_detail", st);
//		return "welcome";
//	}
	
}
