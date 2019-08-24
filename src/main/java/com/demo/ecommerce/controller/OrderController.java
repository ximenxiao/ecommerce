package com.demo.ecommerce.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.domain.Product;
import com.demo.ecommerce.domain.Shipment;
import com.demo.ecommerce.domain.User;
import com.demo.ecommerce.domain.UserOrder;
import com.demo.ecommerce.service.OrderService;
import com.demo.ecommerce.service.UserService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public List<UserOrder> findAllOrders(){
       return orderService.findAll();
	}
	/*
	 * public List<UserOrder> findAllOrders(
	 * 
	 * @RequestParam(value = "userOrderId", required = false)Long userOrderId,
	 * 
	 * @RequestParam(value = "totalPrice", required = false)BigDecimal totalPrice,
	 * 
	 * @RequestParam(value = "order_product", required = false)Set<Product>
	 * products,
	 * 
	 * @RequestParam(value = "discount", required = false)BigDecimal discount,
	 * 
	 * @RequestParam(value = "orderStatus", required = false)Integer orderStatus
	 * 
	 * ){
	 * 
	 * 
	 * return
	 * orderService.findAll(userOrderId,totalPrice,products,discount,orderStatus); }
	 */
	
	@GetMapping("/orders/{userOrderId}")
	public UserOrder findOrderById(@PathVariable("userOrderId") Long userOrderId) {
		return orderService.findByOrderId(userOrderId);
	}
	
	@GetMapping("/user/{userId}/orders")
	public List<UserOrder> findByUser(Long userId){
		return orderService.findByUser(userId);
	}
	
	@PostMapping("/orders")
	public UserOrder addOrder(@RequestBody UserOrder userOrder) {
		return orderService.add(userOrder);
	}
	
	
	@PutMapping("/orders/{id}")
	public UserOrder updateOrder(@PathVariable("id") Long id,@RequestBody UserOrder userOrder) {
				return orderService.update(id, userOrder);
		
	}
	
	@DeleteMapping("/orders/{id}")
	public void deleteOrder(@PathVariable("userOrderId") Long userOrderId) {
		orderService.delete(orderService.findByOrderId(userOrderId));
	}
	
	
	
	
	
}
