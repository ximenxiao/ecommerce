package com.demo.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.domain.UserOrder;
import com.demo.ecommerce.domain.User;
import com.demo.ecommerce.service.OrderService;
import com.demo.ecommerce.service.PaymentService;
import com.demo.ecommerce.service.ShipmentService;
import com.demo.ecommerce.service.UserService;

@RestController
public class ShoppingController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private PaymentService paymentService;
	@Autowired
	private ShipmentService shipmentService;
	
//	@GetMapping("/test")
//	public Object hello() {
//		UserOrder a = new UserOrder();
//		a = orderService.add(a);
//		return paymentService.findByOrderID(a.getOrderId());
//	}
	
}
