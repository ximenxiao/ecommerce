package com.demo.ecommerce.service;

import java.math.BigDecimal;
import java.util.List;

import com.demo.ecommerce.domain.Product;

public interface ProductsService {

	List<Product> findAllProducts(String name, String description, BigDecimal price, Integer status);
	Product findById(Long id);
	List<Product> findByName(String name);
	Product add(Product product);
	Product update(Product product,Long id);
	void delete(Product product);
}
