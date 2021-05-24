package com.samrat.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.samrat.microservices.model.Coupon;
import com.samrat.microservices.model.Order;
import com.samrat.microservices.model.Product;

@Service
public class OrderService {
	@Autowired
	RestTemplate restTemplate; //Create its Bean at main()
	//Service methods to get the Product and Coupon Details from the respective Microservices
	public Product getProduct(long productId) {
		Product product = restTemplate.getForObject("http://PRODUCT-SERVICE/products/product-id/" + productId, Product.class);
		return product;
	}
	public Coupon getCoupon(String couponCode) {
		Coupon coupon = restTemplate.getForObject("http://COUPON-SERVICE/coupons/coupon-code/" + couponCode, Coupon.class);
		return coupon;
	}
	//Calculate the order details
	public Order getOrder(long productId, String couponCode) {
		Product product = getProduct(productId);
		Coupon coupon = getCoupon(couponCode);
		double discount = 0.0;
		if(product.getPrice() >= coupon.getMinAmount()) {
			discount = product.getPrice() * (coupon.getDiscount() / 100.0);
			//Check for maxDiscount, whether its exceeded or not
			discount = discount > coupon.getMaxDiscount() ? coupon.getMaxDiscount() : discount;
		}
		//Calculate the final price of the product
		double finalPriceOfTheProduct = product.getPrice() - discount;
		//Create the object of Order and return it
		return new Order(product, coupon, discount, finalPriceOfTheProduct);
	}
}
