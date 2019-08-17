package com.demo.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.domain.Shipment;
import com.demo.ecommerce.domain.User;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.PaymentRepository;
import com.demo.ecommerce.repository.ShipmentRepository;
import com.demo.ecommerce.service.OrderService;
import com.demo.ecommerce.service.ShipmentService;

@Service
public class ShipmentServiceImpl implements ShipmentService{

	@Autowired
	private ShipmentRepository shipmentRepository;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private User user;
	
	@Override
	public List<Shipment> findAll() {
		return shipmentRepository.findAll();
	}

	@Override
	public Shipment findById(Long id) {
		return shipmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Shipment not found"));
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
	
	

}
