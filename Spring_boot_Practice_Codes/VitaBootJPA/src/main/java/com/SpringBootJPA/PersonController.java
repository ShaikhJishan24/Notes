package com.SpringBootJPA;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

	@GetMapping("/showperson")
	public String viewPage() {
		return "person";
	}
	
	@PostMapping("/showview")
	public String GetData(@ModelAttribute Person per, Model m) {
		m.addAttribute("person", per);
		return "view";
	}
}
