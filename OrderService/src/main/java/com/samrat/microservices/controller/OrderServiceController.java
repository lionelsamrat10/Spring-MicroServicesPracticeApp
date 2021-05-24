package com.samrat.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samrat.microservices.model.Order;
import com.samrat.microservices.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderServiceController {
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/product-id/{productId}/coupon-code/{couponCode}")
	public Order getOrderDetails(@PathVariable long productId, @PathVariable String couponCode) {
		return orderService.getOrder(productId, couponCode);
	}
}
