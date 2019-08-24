package com.demo.ecommerce.service;

import java.util.List;
import com.demo.ecommerce.domain.Shipment;



public interface ShipmentService {
	List<Shipment> findAll();
	Shipment findById(Long shipmentId);
	List<Shipment> findByOrder(Long userOrderId);
	Shipment add(Shipment shipment);
	Shipment update(Shipment shipment);
	Shipment update(Long shipmentId, Shipment shipment);
	void delete(Shipment shipment);

}
