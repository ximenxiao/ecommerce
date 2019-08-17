package com.demo.ecommerce.service;

import java.util.List;
import com.demo.ecommerce.domain.Shipment;



public interface ShipmentService {
	List<Shipment> findAll();
	Shipment findById(Long id);
	Shipment add(Shipment shipment);
	Shipment update(Shipment shipment);
	void delete(Shipment shipment);

}
