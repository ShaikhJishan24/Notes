package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String HomePage() {
		return "home";
	}
	
	@GetMapping("/about")
	public String AboutPage() {
		return "about";
	}
	
	@GetMapping("/")        // jo bhi / url me enter karega wo index page used kar payega without login
	public String IndexPage() {
		return "index";
	}
	
	@GetMapping("/signin")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/invalid")
	public String invalid() {
		return "error";
	}

	@GetMapping("/userlogout")
	public String logout() {
		return "logout";
	}
}
