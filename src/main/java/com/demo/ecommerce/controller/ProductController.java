package com.demo.ecommerce.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.domain.Product;
import com.demo.ecommerce.service.ProductsService;

@RestController
public class ProductController {

	@Autowired
	private ProductsService ProductsService;
	
	@GetMapping("/products")
	public List<Product> findAllProducts(@RequestParam(value = "name", required = false)String name,
		@RequestParam(value = "description", required = false)String description,
		@RequestParam(value = "price", required = false)BigDecimal price,
		@RequestParam(value = "status", required = false)Integer status) {
		return ProductsService.findAllProducts(name,description,price,status);
		
	}
}
