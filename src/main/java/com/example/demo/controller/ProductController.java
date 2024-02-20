package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Product;
import com.example.demo.serviceimpl.ProductServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductServiceImpl productService;
    //fetch details
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
    
    //fetching the data using id
    @GetMapping("/productsid/{id}")
    public Product getProductsById(@PathVariable Integer id) {
        return productService.getProductsById(id);
    }
    

   //fetching the data using name
   @GetMapping(value="/productsname/{name}")
    public Product getProductsByName(@PathVariable String name) {
        return productService.getProductsByName(name);
  }
    //delete the data by id
    @DeleteMapping(value="/delete/{id}")
    public String deletebyid(@PathVariable Integer id) {
        return productService.deletebyid(id);
    }
    
    
  //delete the data by id name
    @DeleteMapping(value="/deletename/{name}")
    public Product deletebyname(@PathVariable String name) {
        return productService.deletebyname(name);
    }
    //adding or inserting the data
    @PostMapping(value="/products")
    public Product readAllProducts(@RequestBody Product product) {
        return productService.readAllProducts(product);
    }
}