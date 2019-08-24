package com.demo.ecommerce.service;
import java.util.List;

import com.demo.ecommerce.domain.Review;

public interface ReviewService {
	List<Review> findAll();
	Review findById(Long id);	
	List<Review> findByUser(String userName);
	Review add(Review review);
	Review update(Review review);
	void delete(Review review);
	List<Review> findAll(String userName, String title, Integer rate);
	Review update(Long id, Review review);
	List<Review>  findByproductId(Long id);
	Review add(Review review, Long id, Long userId);


}
