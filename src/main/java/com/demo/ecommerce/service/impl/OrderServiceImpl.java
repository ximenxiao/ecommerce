package com.demo.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.domain.UserOrder;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.OrderRepository;
import com.demo.ecommerce.service.OrderService;
import com.demo.ecommerce.service.UserService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserService userService;
	
	@Override
	public List<UserOrder> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public UserOrder findByOrderId(Long userOrderId) {
		return orderRepository.findById(userOrderId).orElseThrow(() -> new ResourceNotFoundException("Order not found"));
	}
	

	@Override
	public List<UserOrder> findByUser(Long userId) {
		return orderRepository.findByUser(userService.findById(userId));
	}

	@Override
	public UserOrder add(UserOrder order) {
		return orderRepository.save(order);
	}

	@Override
	public UserOrder update(UserOrder order) {
		return orderRepository.save(order);
	}

	@Override
	public void delete(UserOrder order) {
		orderRepository.delete(order);
		
	}

	@Override
	public UserOrder update(Long userOrderId, UserOrder userOrder) {
		UserOrder uo= findByOrderId(userOrderId);
		uo.setProducts(userOrder.getProducts());
		uo.setTotalPrice(userOrder.getTotalPrice());
		uo.setDiscount(userOrder.getDiscount());
		return orderRepository.save(userOrder);
	}


}
