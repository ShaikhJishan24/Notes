package com.springMVCLogin.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springMVCLogin.Service.UserService;
//import com.springMVCLogin.UserBean.User;

@Controller
public class LoginController {
    
	@Autowired
	private UserService userservice;
	
	@RequestMapping("/login")
	public String LoginPage() {
		return "login";
	}
	
	@RequestMapping(value= "/loginprocess", method = {RequestMethod.POST, RequestMethod.GET})
	public String LoginProcess(@RequestParam("uname") String username, @RequestParam("passwd") String password ,Model m) {
		if (userservice.validateUser(username, password)) {
            m.addAttribute("successMessage", "Login successful!");
            return "Home"; // Success page
        } else {
            m.addAttribute("errorMessage", "Invalid username or password");
            return "login"; // Login page with error message
        }
	}
	
}
