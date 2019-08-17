package com.demo.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.domain.Payment;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.PaymentRepository;
import com.demo.ecommerce.service.OrderService;
import com.demo.ecommerce.service.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Autowired
	private OrderService orderService;
	
	@Override
	public List<Payment> findAll() {
		return paymentRepository.findAll();
	}

	@Override
	public Payment findByPaymentId(Long id) {
		return paymentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Payment not found"));
	}

	@Override
	public Payment findByOrderID(Long orderId) {
		return paymentRepository.findByUserOrder(orderService.findById(orderId));
	}

	@Override
	public Payment add(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public Payment update(Payment payment) {
		return paymentRepository.save(payment);
	}

	@Override
	public void delete(Payment payment) {
		paymentRepository.delete(payment);
		
	}

}
