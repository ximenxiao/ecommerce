package com.demo.ecommerce.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.domain.PhoneProductDetail;
import com.demo.ecommerce.domain.Product;
import com.demo.ecommerce.service.PhoneProductService;
import com.demo.ecommerce.service.ProductsService;

@RestController
public class PhoneProductController {

@Autowired
private PhoneProductService PhoneProductService;

@GetMapping("/productdetails")
public List<PhoneProductDetail> findAllProducts(@RequestParam(value = "name", required = false)String name,
@RequestParam(value = "wirelessCarrier", required = false)String wirelessCarrier,
@RequestParam(value = "productCondition", required = false)String productCondition,
@RequestParam(value = "memory", required = false) Integer memory,
@RequestParam(value = "ramSize", required = false)Integer ramSize,
@RequestParam(value = "status", required = false)Integer status,
@RequestParam(value = "sellerId", required = false)Integer sellerId) {
return PhoneProductService.FindAll(name, wirelessCarrier, productCondition, memory, ramSize, status, sellerId);
}
}
