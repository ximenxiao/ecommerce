package com.demo.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.domain.User;
import com.demo.ecommerce.domain.UserOrder;
import com.demo.ecommerce.service.OrderService;
import com.demo.ecommerce.service.UserService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/userOrders")
	public List<UserOrder> findAllOrders(){
		return orderService.findAll();
	}
	
	@GetMapping("/userOrders/{id}")
	public UserOrder findOrderById(@PathVariable("id") Long id) {
		return orderService.findById(id);
	}
	
	@PostMapping("/userOrders")
	public UserOrder addOrder(@RequestBody UserOrder userOrder) {
		return orderService.add(userOrder);
	}
	
	@PutMapping("/userOrders/{id}")
	public UserOrder updateOrder(@PathVariable("id") Long id,@RequestBody UserOrder userOrder) {
				return orderService.update(userOrder);
		
	}
	
	@DeleteMapping("/userOrders")
	public void deleteOrder(UserOrder userOrder) {
		orderService.delete(userOrder);
	}
	
	
	
	
	
}
