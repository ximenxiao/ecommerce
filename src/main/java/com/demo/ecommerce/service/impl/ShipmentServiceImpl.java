package com.demo.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.domain.Shipment;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.ShipmentRepository;
import com.demo.ecommerce.service.OrderService;
import com.demo.ecommerce.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService{

	@Autowired
	private ShipmentRepository shipmentRepository;
	
	@Autowired
	private OrderService orderService;

	
	@Override
	public List<Shipment> findAll() {
		return shipmentRepository.findAll();
	}

	@Override
	public Shipment findById(Long shipmentId) {
		return shipmentRepository.findById(shipmentId).orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
	}

	@Override
	public List<Shipment> findByOrder(Long userOrderId) {
		return shipmentRepository.findByUserOrder(orderService.findByOrderId(userOrderId));
	}
	
	@Override
	public Shipment add(Shipment shipment) {
		return shipmentRepository.save(shipment);
	}

	@Override
	public Shipment update(Shipment shipment) {
		return shipmentRepository.save(shipment);
	}

	@Override
	public void delete(Shipment shipment) {
		shipmentRepository.delete(shipment);
		
	}

	

	@Override
	public Shipment update(Long shipmentId, Shipment shipment) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
