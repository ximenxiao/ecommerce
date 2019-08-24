package com.demo.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.domain.Shipment;
import com.demo.ecommerce.domain.UserOrder;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
	
	List<Shipment> findByUserOrder(UserOrder userOrder);

}
