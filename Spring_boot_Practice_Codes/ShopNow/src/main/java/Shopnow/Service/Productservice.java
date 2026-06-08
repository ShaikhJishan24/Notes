package Shopnow.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Shopnow.Models.Product;
import Shopnow.Repository.ProductRepo;

@Service
public class Productservice {
    
	@Autowired
	public ProductRepo productrepo;

	public List<Product> findAllproduct(){
		return (List<Product>) productrepo.findAll();
	}
}
