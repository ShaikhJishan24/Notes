package com.springMVCLogin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.springMVCLogin.Service.UserService;
import com.springMVCLogin.UserBean.User;

@Controller
public class RegisterController {
     
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/Home")
	public String Home() {
		return "Home";
	}
	
	// This is for displaying registration form
	@RequestMapping("/register")
	public String register() {	
		return "register";
	}
	
	// This is for processing the form submission
	@RequestMapping(value = "/registerUser", method = {RequestMethod.POST, RequestMethod.GET})
	public String createUser(@ModelAttribute("u") User u, RedirectAttributes redirectAttributes) {		
		
		try {
			userservice.registeruser(u);
	        redirectAttributes.addFlashAttribute("successmsg", "Registration successful!");
	    } catch (Exception e) {
	        redirectAttributes.addFlashAttribute("errormsg", "Error occurred during registration: " + e.getMessage());
	    }
		return "redirect:/register";	
	}
	
	// @PathVariable Example 
	@RequestMapping("/empform/{id}")
	public String display(@PathVariable("id") int id) {
		System.out.println(id);
		return "Home";
	}
	
}
