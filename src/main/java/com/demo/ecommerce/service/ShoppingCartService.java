package com.demo.ecommerce.service;
import java.util.List;
import com.demo.ecommerce.domain.ShoppingCart;

public interface ShoppingCartService {
	ShoppingCart findById(Long id);	
	ShoppingCart  add(ShoppingCart shoppingCart );
	ShoppingCart  update(ShoppingCart shoppingCart );
	void delete(ShoppingCart shoppingCart );
	List<ShoppingCart> findAll();
	List<ShoppingCart> findShoppingCartByUserId(Long userId) throws Exception;

}
