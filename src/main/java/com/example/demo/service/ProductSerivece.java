package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductSerivece {
	public Product getAllProducts();
	public Product readAllProducts();
	public String deletebyid(Integer id);
	public Product getProductsById(Integer id);
	public Product getProductsByName(String name);
	public Product deletebyname(String name);

}
