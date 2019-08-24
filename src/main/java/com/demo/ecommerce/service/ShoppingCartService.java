package com.demo.ecommerce.service;
import java.util.List;
import com.demo.ecommerce.domain.ShoppingCart;

public interface ShoppingCartService {
	List<ShoppingCart> findAll();
	ShoppingCart findById(Long id);	
	ShoppingCart  add(ShoppingCart shoppingCart );
	ShoppingCart  update(Long id, ShoppingCart shoppingCart );
	void delete(ShoppingCart shoppingCart );	
	List<ShoppingCart> findShoppingCartByUserId(Long userId) throws Exception;

    }
