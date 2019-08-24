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
	
	@GetMapping("/shoppingCarts/{id}")
	public ShoppingCart findShoppingCartById(@PathVariable("id") Long id) {
		return shoppingCartService.findById(id);
	}
	
	@GetMapping("/user/{userId}/shoppingCarts/{id}")
	public ShoppingCart findShoppingCartByUserId( @PathVariable("userId") Long userId) {
		return shoppingCartService.findById(userId);
	}
	
	@PutMapping("/shoppingCarts/{id}")
	public ShoppingCart  updateShoppingCart (@PathVariable("id") Long id, @RequestBody ShoppingCart  shoppingCart){
		return shoppingCartService.update(id,shoppingCart );
	}
	
	@PostMapping("/shoppingCarts")
	public ShoppingCart addShoppingCart(@RequestBody ShoppingCart shoppingCart) {
		return shoppingCartService.add(shoppingCart);
	}
	
	@DeleteMapping("/product/{id}/shoppingCarts/{id}")
	public ShoppingCart deleteShoppingCart(@PathVariable("id") Long id) {
		shoppingCartService.delete(shoppingCartService.findById(id));
		 return null;
	}	
    }
