package com.SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {
	
//	@RequestMapping("/homepage")
	@RequestMapping(value="homepage", method = RequestMethod.POST)
	public String gethomepage() {
		return "home";  // this lines means it render the Home.jsp file here when you used the Controller
	}
	
	// Below two methods is for Redirection code
	@RequestMapping(value="Demo", method = RequestMethod.GET)
	public String getDemo(){
		return "Demo";
	}
	
	@RequestMapping(value="redirection", method = RequestMethod.GET)
	public String display(RedirectAttributes rd){
		rd.addFlashAttribute("name", "John");
		return "redirect:/Demo";
	}
}
