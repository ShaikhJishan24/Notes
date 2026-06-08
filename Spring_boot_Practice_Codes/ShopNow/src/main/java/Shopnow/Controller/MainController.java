package Shopnow.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    
	@RequestMapping("home")
	public String HomePage(){
		return "index";
	}
	
	@RequestMapping("/fashion")
	public String FashionPage() {
		return "fashion";
	}
	
	@RequestMapping("/electronic")
	public String ElectronicPage() {
		return "electronic";
	}
	
	@RequestMapping("/jewellery")
	public String JewelleryPage() {
		return "jewellery";
	}
	
	@RequestMapping("/ex")
	public String ExamplePage() {
		return "example";
	}
}
