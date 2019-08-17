package com.demo.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.domain.UserOrder;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.OrderRepository;
import com.demo.ecommerce.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public List<UserOrder> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public UserOrder findById(Long id) {
		return orderRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Order not found"));
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

}
