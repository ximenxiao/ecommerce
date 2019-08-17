package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.domain.UserOrder;
import com.demo.ecommerce.domain.Payment;
import com.demo.ecommerce.domain.User;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {


	Payment findByUserOrder(UserOrder userOrder);



}
