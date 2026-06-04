package SendDataFromControllerToView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {
	
	// 1) simple Home  controller
	@RequestMapping("/sentdatacontrollertoviewhomepage")
	public String getHomepage() {
		return "sentdatacontrollertoview"; // this returns the viwe page name
	}
	
	
//  2) Send data from view html form to controller(backend)
    // recieve form data from the view (JSP/HTML) and bind it to a Java model class (POJO) all at one time and make it accessible in the controller method.
	@RequestMapping(value = "senddatatocontroller", method=RequestMethod.GET)
	public String senddatatoController(@ModelAttribute("emp") Employee emp){
		emp.display();
		return "senddataviewtocontroller";
	}
	
	// to used below uncomment above method
	
	//	2.1) Send data from view html form to controller(backend)
	    // recieve form data from the view (JSP/HTML) and bind it to a Java model class (POJO) all at one time and make it accessible in the controller method.
	//	@RequestMapping(value = "example", method=RequestMethod.GET)
	//	public String senddatatoController(@RequestParam("emp_id") String id, @RequestParam("name") String name){
	//		System.out.println(id);
	//		System.out.println(name);
	//		return "welcome";
	//	}
	//	above method gives error
	
	
	// 2) send data from controller to view 
		@RequestMapping("/senddatatoviewwelcomepage")
		public String senddatatoview(Model m){
			m.addAttribute("name", "Jishan shaikh");
			return "senddatatoviewwelcomepage";
		}
		// to used below uncomment above method
		// 2.1) send data from controller to view using ModelAndView interface
//		@RequestMapping("/senddatatoviewwelcomepage")
//		public ModelAndView senddatatoview1() {
//			ModelAndView model = new ModelAndView();
//			model.addObject("name", "Moin Desai");
//			model.setViewName("senddatatoviewwelcomepage");
//			return model;
//		}
}

//model.addObject("name", "Moin Desai");
//model.setViewName("senddatatoviewwelcomepage");
//return model;

//or Wriitern in same line
//new ModelAndView("viewname", "AttributeName", "ValueOfAttribute");
