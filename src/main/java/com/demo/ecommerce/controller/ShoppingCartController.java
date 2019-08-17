package com.demo.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.domain.ShoppingCart;
import com.demo.ecommerce.service.ShoppingCartService;

@RestController
public class ShoppingCartController {
	@Autowired
	private ShoppingCartService shoppingCartService;
	@GetMapping("/shoppingCarts")
	public List <ShoppingCart>findAll(){
		return shoppingCartService.findAll();
	}
	
	@GetMapping("/user/{userId}/shoppingCarts/")
	public List<ShoppingCart> findShoppingCartByUserId( @PathVariable("userId") Long userId) throws Exception{
		return shoppingCartService.findShoppingCartByUserId(userId);
	}
	
	
}
