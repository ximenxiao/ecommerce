package com.demo.ecommerce.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/products/{id}")
	public Product findProductById(@PathVariable("id") Long id) {
		return ProductsService.findById(id);
	}
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return ProductsService.add(product);
	}
	
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
		return ProductsService.update(product,id);
	}
	
	@DeleteMapping("/products/{id}")
	public Product deleteProduct(@PathVariable("id") Long id) {
		ProductsService.delete(ProductsService.findById(id));
		 return null;
	}
}
