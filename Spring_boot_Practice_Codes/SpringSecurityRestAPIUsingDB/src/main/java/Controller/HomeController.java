package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String HomePage() {
		return "Home Page";
	}
	
	@GetMapping("/about")
	public String AboutPage() {
		return "About Page";
	}
	
	@GetMapping("/")        // jo bhi / url me enter karega wo index page used kar payega without login
	public String IndexPage() {
		return "Index Page";
	}

}
