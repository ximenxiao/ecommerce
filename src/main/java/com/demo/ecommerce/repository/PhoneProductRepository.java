package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.ecommerce.domain.PhoneProductDetail;

public interface PhoneProductRepository extends JpaRepository<PhoneProductDetail, Long> {

}
