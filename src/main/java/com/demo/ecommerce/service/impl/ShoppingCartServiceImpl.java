package com.demo.ecommerce.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.ecommerce.domain.ShoppingCart;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.ShoppingCartRepository;
import com.demo.ecommerce.service.ShoppingCartService;
import com.demo.ecommerce.service.UserService;

    @Service
    public class ShoppingCartServiceImpl implements ShoppingCartService {
	@Autowired
	private ShoppingCartRepository shoppingCartRepository;
	
	@Autowired
	private UserService userService;

	@Override
	public ShoppingCart findById(Long id) {		
		return shoppingCartRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("ShoppingCart not found"));
	}

	@Override
	public ShoppingCart add(ShoppingCart shoppingCart) {
		return shoppingCartRepository.save(shoppingCart);
	}	

	@Override
	public void delete(ShoppingCart shoppingCart) {		
		shoppingCartRepository.delete(shoppingCart);
	}

	@Override
	public List<ShoppingCart> findAll() {	
		return shoppingCartRepository.findAll();
	}

	@Override
	public List<ShoppingCart> findShoppingCartByUserId(Long userId) throws Exception {
		return shoppingCartRepository.findByUser(userService.findById(userId));
	}

	@Override
	public ShoppingCart update(Long id, ShoppingCart shoppingCart) {
		ShoppingCart s = findById(id);
		s.setProducts(shoppingCart.getProducts());
		return shoppingCartRepository.save(s);
	}
    }
