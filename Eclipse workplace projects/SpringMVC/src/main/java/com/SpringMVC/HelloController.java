package com.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
     
//	@RequestMapping("/Home")
//	public String Home(Model m) {		
//		m.addAttribute("name", "Kareena");   // Send data from controller to view using Model interface
//		return "Home";
//	}
	
	// similar to below without using any interface 
	@RequestMapping("/Login")
	public String loginPage(HttpServletRequest req, Model m) {
		
		// isme data form se uname tak aya but model tak nhi aya 
		String uname = req.getParameter("Uname");
		String password = req.getParameter("passwd");
		
		// isme form data model ke pass gaya 
		m.addAttribute("username", uname);
		m.addAttribute("password", password);		
		
		return "Login";
	}
	
	// using the interface or predefined method
	// Send data from view html form to controller(backend)
    // recieve form data from the view (JSP/HTML) and bind it to a Java model class (POJO) all at one time and make it accessible in the controller method.
	@RequestMapping(value="/register", method= RequestMethod.POST)
	public String Register(@ModelAttribute("st") Student st) {	
		// it gives value of model or bean class variables or filed
		System.out.println(st);
		return "register";
	}
	
	// Another example of above method
	@RequestMapping(value= "/Home", method= {RequestMethod.POST, RequestMethod.GET})
	public String display(@ModelAttribute("st") Student st) {
		System.out.println(st);
		return "Home";
	}
}



