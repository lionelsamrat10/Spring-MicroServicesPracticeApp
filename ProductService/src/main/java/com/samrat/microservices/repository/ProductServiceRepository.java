package com.samrat.microservices.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.samrat.microservices.model.Product;

@Repository
public class ProductServiceRepository {
	Map<Long, Product> products;

	@PostConstruct
	private void init() {
		Product product1 = new Product(1, "Samsung Galaxy M21", 13500.0);
		Product product2 = new Product(2, "Samsung Galaxy M11", 8500.0);
		Product product3 = new Product(3, "Samsung Galaxy M01", 7500.0);
		Product product4 = new Product(4, "Samsung Galaxy M51", 23500.0);
		// Instantiate the Map
		products = new HashMap<>();
		// Put the products in the map
		products.put(product1.getProductId(), product1);
		products.put(product2.getProductId(), product2);
		products.put(product3.getProductId(), product3);
		products.put(product4.getProductId(), product4);
	}

	public Product getProductByProductId(Long productId) {
		return products.get(productId);
	}
}
