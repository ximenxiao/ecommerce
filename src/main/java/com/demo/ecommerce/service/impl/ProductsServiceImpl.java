package com.demo.ecommerce.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.domain.Product;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.ProductRepository;
import com.demo.ecommerce.service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService{

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAllProducts(String name, String description, BigDecimal price, Integer status) {
		return productRepository.findAll(name,description,price,status);
	}

	@Override
	public Product findById(Long id) {
		return productRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Product not found"));
	}

	@Override
	public List<Product> findByName(String name) {
		return productRepository.findByName(name);
	}

	@Override
	public Product add(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product,Long id) {
		Product p = findById(id);
		p.setDescription(product.getDescription());
		p.setImageUrl(product.getImageUrl());
		p.setName(product.getName());
		p.setPrice(product.getPrice());
		p.setStatus(product.getStatus());
		p.setUpdatedAt(new Date());
		return productRepository.save(p);
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(product);
	}
}
