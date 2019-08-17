package com.demo.ecommerce.service;

import java.util.List;

import com.demo.ecommerce.domain.Payment;



public interface PaymentService {

	List<Payment> findAll();
	Payment findByPaymentId(Long id);
	Payment findByOrderID(Long orderId);
	Payment add(Payment payment);
	Payment update(Payment payment);
	void delete(Payment payment);
}
