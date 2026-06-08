package Shopnow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Shopnow.Models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long>{
       
	
}
