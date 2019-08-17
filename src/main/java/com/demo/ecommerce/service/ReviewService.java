package com.demo.ecommerce.service;
import java.util.List;
import com.demo.ecommerce.domain.Review;
import com.demo.ecommerce.domain.User;

public interface ReviewService {
	List<Review> findAll();
	Review findById(Long id);
	Review  findByUserName(String userName);
	Review  add(Review  review );
	Review  update(Review  review );
	void delete(Review  review );
	List<Review> findReviewByUserId(Long userId)throws Exception;
	List<Review> findReviewByUserName(User user) throws Exception;
	List<Review> findReviewByUserName(String userName) throws Exception;
	List<Review> findReviewByProductId(Long productId);
}
