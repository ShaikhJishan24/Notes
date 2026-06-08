package com.Controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Entity.User;


@Controller
public class HomeController {
    
	@GetMapping("/")
	public String Index() {
		return "index";
	}
	
	@GetMapping("/messageExp")
	public String MessageExpression(){
		return "MessageExp";
	}
	
	@GetMapping("/variableExp")
	public String VariableExp(Model m) {
		m.addAttribute("Date", new Date());
		return "VariableExp";
	}
	
	@GetMapping("/selectionExp")
	public String SelectionExp(Model m) {		
		User u = new User();
		u.setId(1);
		u.setName("Shilpa");
		m.addAttribute("User", u);
		return "SelectionExp";
	}
	
	@GetMapping("/linkExp")
	public String LinkExp(){
		return "LinkExp";
	}
	
	@GetMapping("/profile")
	public String Profile(){
		return "profile";
	}
	
	@GetMapping("/profile/{id}")
	public String ProfileURL(@PathVariable("id") int id, Model m){
		m.addAttribute("Id", id);
		return "Profile";
	}
	
	@GetMapping("/fragmentExp")
	public String FragmentExp(){
		return "FragmentExp";
	}
	
	
	
}
