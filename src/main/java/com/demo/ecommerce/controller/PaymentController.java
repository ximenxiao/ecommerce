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

import com.demo.ecommerce.domain.Payment;
import com.demo.ecommerce.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	@GetMapping("/payments")
	public List<Payment> findAll(){
		return paymentService.findAll();
	}
	
	@GetMapping("/payments/{id}")
	public Payment findByPaymentId(@PathVariable("id") Long paymentId) {
		return paymentService.findByPaymentId(paymentId);
	}
	
	@GetMapping("/orders/{id}")
	public Payment findByOrder(Long orderId) {
		return paymentService.findByOrder(orderId);
	}
	
	@PostMapping("/payments")
	public Payment addPayment(@RequestBody Payment payment) {
		return paymentService.add(payment);
	}
	
	@PutMapping("/payments/{id}")
	public Payment updatePayment(@PathVariable("id") Long paymentId, Payment payment) {
		return paymentService.update(paymentId,payment );
	}

	@DeleteMapping("/payments/{id}")
	public Payment deletePayment(@PathVariable("id") Long paymentId) {
		paymentService.delete(paymentService.findByPaymentId(paymentId));
		return null;
	};
	

}
