package com.demo.ecommerce.service;

import java.util.List;

import com.demo.ecommerce.domain.Payment;



public interface PaymentService {

	List<Payment> findAll();
	Payment findByPaymentId(Long paymentId);
	Payment findByOrder(Long orderId);
	Payment add(Payment payment);
	Payment update(Long paymentId, Payment payment);
	void delete(Payment payment);
}
