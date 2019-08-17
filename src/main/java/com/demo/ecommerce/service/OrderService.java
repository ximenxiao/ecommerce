package com.demo.ecommerce.service;
import java.util.List;

import com.demo.ecommerce.domain.UserOrder;


public interface OrderService {
	List<UserOrder> findAll();
	UserOrder findById(Long id);
	UserOrder add(UserOrder order);
	UserOrder update(UserOrder order);
	void delete(UserOrder order);

}
