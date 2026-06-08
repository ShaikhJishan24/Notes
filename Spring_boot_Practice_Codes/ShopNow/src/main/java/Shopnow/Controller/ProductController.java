package Shopnow.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import Shopnow.Models.Product;
import Shopnow.Service.Productservice;

@Controller
@ComponentScan("Shopnow.Controller")
@ComponentScan("ShopNow.Service")
@EntityScan("Shopnow.Models")
@EnableJpaRepositories("Shopnow.Repository")

public class ProductController {
    
	@Autowired
	public Productservice productservice;
	
	@RequestMapping("/productList")
	public String ProductList(Model m) {
		List<Product> list = productservice.findAllproduct();
		m.addAttribute("ProductList", list);
		return "list";
	}
}
