package Service;

import org.springframework.stereotype.Service;

@Service
public class Userservice {

		public void createUser(String name) {
	        System.out.println("Creating user: " + name);
	    }
	
	    public void makepayment() {
	    	System.out.println("Amount debited");
	    }
}
