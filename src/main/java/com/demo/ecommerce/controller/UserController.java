package com.demo.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ecommerce.domain.User;
import com.demo.ecommerce.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> findAllUsers() {
		//@RequestParam(value=)
		return userService.findAll();
	}
	
	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable("id") Long id) {
		return userService.findById(id);
	}
	
	@PostMapping("/users/")
	public User addUser(@RequestBody User user) {
		return userService.add(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable("id") Long id,@RequestBody User user) {
				return userService.update(user);
		
	}
	
	//@DeleteMapping("/users/")
	
	
	
}
