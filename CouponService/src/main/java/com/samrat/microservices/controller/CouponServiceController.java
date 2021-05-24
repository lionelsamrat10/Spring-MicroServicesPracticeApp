package com.samrat.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samrat.microservices.model.Coupon;
import com.samrat.microservices.repository.CouponRepository;

@RestController
@RequestMapping("/coupons")
public class CouponServiceController {
	@Autowired
	CouponRepository couponRepository;
	
	@GetMapping("/coupon-code/{couponCode}")
	public Coupon getCouponBuCouponCode(@PathVariable String couponCode) {
		return couponRepository.getCouponByCouponCode(couponCode);
	}
}
