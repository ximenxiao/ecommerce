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

import com.demo.ecommerce.domain.Shipment;
import com.demo.ecommerce.service.ShipmentService;

@RestController
public class ShipmentController {
	
	@Autowired
	private ShipmentService shipmentService;
	
	@GetMapping("/shipments")
	public List<Shipment> findAllShipment(){
		return shipmentService.findAll();
	}
	
	@GetMapping("shipments/{shipmentId}")
	public Shipment findShipmentById(@PathVariable("shipmentId")Long shipmentId) {
		return shipmentService.findById(shipmentId);
	}
	
	@GetMapping("/user/{userId}/shipments")
	public List<Shipment> findByOrder(Long userOrderId){
		return shipmentService.findByOrder(userOrderId);
	}
	
	@PostMapping("/shipments")
	public Shipment addShipment(@RequestBody Shipment shipment) {
		return shipmentService.add(shipment);
	}
	
	
	@PutMapping("/shipments/{shipmentId}")
	Shipment updateShipment(@PathVariable("shipmentId") Long shipmentId,Shipment shipment) {
		return shipmentService.update(shipmentId, shipment);
	}
	
	@DeleteMapping("/shipments/{shipmentId}")
	public Shipment deleteShipment(@PathVariable("shipmentId") Long shipmentId) {
		shipmentService.delete(shipmentService.findById(shipmentId));
		return null;
	}
	
	
	
	
	

}
