package com.samrat.microservices.repository;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.samrat.microservices.model.Coupon;

@Repository
public class CouponRepository {
	private Map<String, Coupon> coupons;
	
	@PostConstruct
	private void init() {
		Coupon coupon1 = new Coupon("c101", 15.0, 500.0, 5000.0);
		Coupon coupon2 = new Coupon("c102", 20.0, 750.0, 7500.0);
		Coupon coupon3 = new Coupon("c103", 25.0, 1000.0, 10000.0);
		Coupon coupon4 = new Coupon("c104", 30.0, 1500.0, 15000.0);
		//Create the object of the map
		coupons = new HashMap<>();
		//Put the coupons details in the HashMap
		coupons.put(coupon1.getCouponCode(), coupon1);
		coupons.put(coupon2.getCouponCode(), coupon2);
		coupons.put(coupon3.getCouponCode(), coupon3);
		coupons.put(coupon4.getCouponCode(), coupon4);
	}
	//Create a method that returns the coupon details by coupon id
	public Coupon getCouponByCouponCode(String couponCode) {
		return coupons.get(couponCode);
	}
}
