package com.demo.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.domain.User;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.UserRepository;
import com.demo.ecommerce.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
	}

	@Override
	public User findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	}

	@Override
	public User add(User user) {
		return userRepository.save(user);
	}

	@Override
	public User update(User user) {
		return userRepository.save(user);
	}

	@Override
	public void delete(User user) {
		userRepository.delete(user);
	}

	@Override
	public User update(Long id, User user) {
		User u= new User();
		u.setUserName(user.getUserName());
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		u.setPassword(user.getPassword());
		return userRepository.save(u);
	}
	
	
	

}
