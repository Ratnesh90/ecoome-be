package com.chhah.ecomme.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chhah.ecomme.entity.Product;
import com.chhah.ecomme.repo.ProductRepo;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepo productRepo;
	
	  @PostMapping("/add-product")
	    public Product addProduct(@RequestBody Product product) {
		  if (product.getName() == null || product.getName().isEmpty()) {
		        throw new IllegalArgumentException("Product name is required.");
		    }
		    if (product.getPrice() == null) {
		        throw new IllegalArgumentException("Product price is required.");
		    }
		    if (product.getStock() == null || product.getStock().isEmpty()) {
		        throw new IllegalArgumentException("Product stock is required.");
		    }

		    return productRepo.save(product);
	    }

}
