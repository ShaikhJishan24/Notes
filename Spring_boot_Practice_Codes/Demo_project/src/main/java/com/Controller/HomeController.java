package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HomeController")
public class HomeController {
    
	@GetMapping("/about")
	public String Homepage() {
		System.out.println("About Page Method call");
		return "about";
	}
	
	
	
}
