package com.demo.ecommerce.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ecommerce.domain.Review;
import com.demo.ecommerce.exception.ResourceNotFoundException;
import com.demo.ecommerce.repository.ReviewRepository;
import com.demo.ecommerce.service.ReviewService;
import com.demo.ecommerce.service.UserService;
//import com.demo.ecommerce.service.ProductService;

@Service
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	//private ProductService productService;
	
	@Override
	public List<Review> findAll() {	
		return reviewRepository.findAll();
	}

	@Override
	public Review findById(Long id) {
		return reviewRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Review not found"));
	}

	@Override
	public Review add(Review review) {		
		return reviewRepository.save(review);
	}

	@Override
	public Review update(Review review) {		
		return reviewRepository.save(review);
	}

	@Override
	public void delete(Review review) {		
		reviewRepository.delete(review);
	}	
	
	@Override
	public List<Review> findAll(String userName, String title, Integer rate) {
		return reviewRepository.findByConditions(userName,title,rate);
	}

	@Override
	public Review update(Long id, Review review) {
		Review R = findById(id);
		R.setUserName(review.getUserName());
		R.setUserAvatarUrl(review.getUserAvatarUrl());
		R.setTitle(review.getTitle());
		R.setContent(review.getContent());		
		R.setRate(review.getRate());
		return reviewRepository.save(R);
	}

	@Override
	public List<Review>  findByproductId(Long id) {	
		return reviewRepository.findByProduct(null);
	}

	@Override
	public List<Review> findByUser(String userName) {
		return reviewRepository.findByUser(userService.findByUserName(userName));
	}

	@Override
	public Review add(Review review, Long id, Long userId) {
		//productService.findById(id)
		//Set<Review> reviews = product.getReviews();
		//Review r = review;
		//r.setUser(userService.findById(userId));
		//r=save(r);
		//reviews.add(r)
		//product.setReviews(reviews)
		//productService.save(product);
		//return r;
		return null;
	}	

}
