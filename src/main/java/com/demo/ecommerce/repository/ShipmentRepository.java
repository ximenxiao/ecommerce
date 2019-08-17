package com.demo.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.domain.Shipment;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
	

}
