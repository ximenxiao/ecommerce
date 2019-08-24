package com.demo.ecommerce.controller;

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

import com.demo.ecommerce.domain.User;
import com.demo.ecommerce.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> findAllUsers(
			@RequestParam(value = "userName", required = false)String userName,
			@RequestParam(value = "status", required = false) Integer status,
			@RequestParam(value = "email", required = false) String email,
			@RequestParam(value = "country", required = false)String country
			) {
		return userService.findAll(userName,status,email,country);
<<<<<<< HEAD
	}
	
	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable("id") Long id) {
		return userService.findById(id);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userService.add(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		return userService.update(id,user);
	}
	
=======
	}
	
	@GetMapping("/users/{id}")
	public User findUserById(@PathVariable("id") Long id) {
		return userService.findById(id);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userService.add(user);
	}
	
	@PutMapping("/users/{id}")
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		return userService.update(id,user);
	}
	
>>>>>>> upstream/master
	@DeleteMapping("/users/{id}")
	public User deleteUser(@PathVariable("id") Long id) {
		 userService.delete(userService.findById(id));
		 return null;
	}
	
	
	
	
	
<<<<<<< HEAD
}
=======
}
>>>>>>> upstream/master
