package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPiExampleController {
		
		@GetMapping("/welcome")
		public String display() {
			return "Welcome Jishan Shaikh";
		}
}
