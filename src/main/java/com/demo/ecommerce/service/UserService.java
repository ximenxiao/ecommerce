package com.demo.ecommerce.service;
import java.util.List;
import com.demo.ecommerce.domain.User;

public interface UserService {
	
	List<User> findAll();
	User findById(Long id);
	User findByUserName(String userName);
	User add(User user);
	User update(User user);
	void delete(User user);
	
}
