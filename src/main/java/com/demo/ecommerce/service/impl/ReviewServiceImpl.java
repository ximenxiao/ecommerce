package com.demo.ecommerce.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.ecommerce.domain.Review;
import com.demo.ecommerce.domain.User;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.ReviewRepository;
import com.demo.ecommerce.service.ReviewService;
import com.demo.ecommerce.service.UserService;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewRepository reviewRepository;
	@Autowired
	private UserService userService;
	@Override
	public List<Review> findAll() {
		// TODO Auto-generated method stub
		return reviewRepository.findAll();
	}

	@Override
	public Review findById(Long id) {
		// TODO Auto-generated method stub
		return reviewRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
	}

	@Override
	public Review add(Review review) {
		// TODO Auto-generated method stub
		return reviewRepository.save(review);
	}

	@Override
	public Review update(Review review) {
		// TODO Auto-generated method stub
		return reviewRepository.save(review);
	}

	@Override
	public void delete(Review review) {
		// TODO Auto-generated method stub
		reviewRepository.delete(review);
	}

	@Override
	public List<Review> findReviewByUserName(String userName) throws Exception {		
		return reviewRepository.findByUserName(userName);
	}

	@Override
	public List<Review> findReviewByUserId(Long userId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findReviewByUserName(User user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Review> findReviewByProductId(Long productId) {
		// TODO Auto-generated method stub
		//return reviewRepository.findByProductId(productService.findBy);
		return null;
	}

}
