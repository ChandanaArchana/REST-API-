package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductServiceImpl {

    @Autowired
     ProductRepository productRepository;
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

	

	public Product readAllProducts(Product product) {
		return  productRepository.save(product);
	}

	public String deletebyid(Integer id) {
	    productRepository.deleteById(id);
	    return "deletion is done";    
	}




	public Product getProductsById(Integer id) {
		Optional<Product> product=productRepository.findById(id);
		return product.orElse(null);
	}



	public Product getProductsByName(String name) {
		
		Product product=productRepository.findByName(name);
		return product;
	}



	public Product deletebyname(String name) {
		Product product=productRepository.deleteByName(name);
		return product;
		
	
	}

}
