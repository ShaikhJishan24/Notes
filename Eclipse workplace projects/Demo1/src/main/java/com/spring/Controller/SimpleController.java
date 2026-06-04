package com.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
    
	@GetMapping("/home")
	public String HomePage() {
		System.out.println("Home Method...");
		return "Home";
	}
}
