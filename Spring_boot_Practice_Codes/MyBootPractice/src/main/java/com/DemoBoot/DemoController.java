package com.DemoBoot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DemoController {

	@GetMapping("/home")
	public String HomePage(RedirectAttributes rd) {
		rd.addFlashAttribute("key", "value");
		return "redirect:/about"; // it means Send the browser to /about (here Url mapping only)
	}
		
	@GetMapping("/about")   // this is when browser encounteers the /about then show this view Page
	public String AboutPage(Model m) {
		System.out.println("Flash Attribute received: " + m.getAttribute("key"));
		return "about";
	}

	@GetMapping("/map/{id}")
	public String mapping(@PathVariable("id") int i) {
		System.out.println(i);
		return "URLParam";
	}
}
