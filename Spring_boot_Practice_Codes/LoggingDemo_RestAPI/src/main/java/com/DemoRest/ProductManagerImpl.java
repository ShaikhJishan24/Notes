package com.DemoRest;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManagerImpl implements ProductManager
{
	@Autowired
	ProductRepository repository;
	
	private static final Logger logger = LoggerFactory.getLogger(ProductManagerImpl.class);
	
	@Override
	public void addProduct(Product p) {
        logger.info("Creating product: {}", p);
		Product temp=repository.save(p);
		logger.info("Product created successfully: {}", temp);
		
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		logger.info("Fetching all products");
		List<Product> prodlist= repository.findAll();
		logger.info("Total products found: {}", prodlist);
		return prodlist;
	}

	@Override
	public void delete(int id) {
		logger.info("Deleting product with id: {}", id);
		if (repository.existsById(id)) {
            repository.deleteById(id);
            logger.info("Product with id {} deleted successfully", id);
        } else {
            logger.warn("Product with id {} not found to delete", id);
        }

	}

	@Override
	public void update(Product product,int id) {
		// TODO Auto-generated method stub
		logger.info("Updating product with id: {}", id);
		repository.update(product.getProname(),product.getCategory(),product.getPrice(),product.getQuantity(),id);
		logger.info("Updated product with id: {}", id);
	}

	@Override
	public Optional<Product> getProduct(int id) {
		// TODO Auto-generated method stub
        logger.info("Fetching product with id: {}", id);
        Optional<Product> product = repository.findById(id);
        if (product.isPresent()) {
            logger.info("Product found: {}", product.get());
        } else {
            logger.warn("Product with id {} not found", id);
        }
        return product;

	}

	@Override
	public List<Product> getSelected(String cat) {
		// TODO Auto-generated method stub
		logger.info("Fetching products based on category: {}", cat);
		List<Product> prodlist= repository.listCat(cat);
		if (!prodlist.isEmpty()) {
            logger.info("Products found: {}", prodlist);
        } else {
            logger.warn("Products with category {} not found", cat);
        }
        return prodlist;
	}
	
	

}
