package StereotypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Products {
	
	@Value("101")
	private int Product_id;
	
	@Value("Shoes")
	private String Product_name;
	
	public int getProduct_id() {
		return Product_id;
	}
	
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	
	public String getProduct_name() {
		return Product_name;
	}
	
	public void setProduct_name(String product_name) {
		Product_name = product_name;
	}

	@Override
	public String toString() {
		return "Products [Product_id=" + Product_id + ", Product_name=" + Product_name + "]";
	}
	
}
