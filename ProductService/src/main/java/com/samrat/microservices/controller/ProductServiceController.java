package com.samrat.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samrat.microservices.model.Product;
import com.samrat.microservices.repository.ProductServiceRepository;

@RestController
@RequestMapping("/products")
public class ProductServiceController {
	@Autowired
	ProductServiceRepository productServiceRepository;
	
	@GetMapping("/product-id/{productId}")
	public Product getProductById(@PathVariable Long productId) {
		return productServiceRepository.getProductByProductId(productId);
	}
}
