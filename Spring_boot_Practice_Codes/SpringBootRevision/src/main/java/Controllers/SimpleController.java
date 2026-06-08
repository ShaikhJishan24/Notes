package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SimpleController {
	
	@GetMapping("/home")
	public String HomePage(){
		System.out.println("HomePage method call");
		return "Home";
	}
	
//	@GetMapping("/about/{id}")
//	public String Aboutpage(@PathVariable("id") int id){
//		System.out.println(id);
//		return "about";
//	}
}
