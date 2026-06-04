package com.example.demo;
 
import java.util.List;
 
import jakarta.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
@Transactional
public class ProductManagerImpl implements ProductManager {
     
    @Autowired
    private ProductRepository repository;
     
    public List<Product> listAll() {
        return repository.findAll();
    }
     
}
