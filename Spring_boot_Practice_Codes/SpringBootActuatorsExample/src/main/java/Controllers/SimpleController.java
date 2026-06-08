package Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Entity.Student;

@RestController
@ComponentScan("Entity")
public class SimpleController {
        
		@Autowired
	    public Student st;
	
		@GetMapping("/welcome")
		public String display() {
			return " Welcome Jishan Shaikh";
		}
}
