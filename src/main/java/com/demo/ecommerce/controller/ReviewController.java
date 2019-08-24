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

import com.demo.ecommerce.domain.Review;
import com.demo.ecommerce.service.ReviewService;

   @RestController
   public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping("/reviews")
	public List<Review> findAllReviews(
			@RequestParam(value = "userName", required = false)String userName,			
			@RequestParam(value = "title", required = false) String title,
			@RequestParam(value = "rate", required = false) Integer rate			
			) {
		return reviewService.findAll(userName,title,rate);
	}
	
	@GetMapping("/reviews/{id}")
	public Review findReviewById(@PathVariable("id") Long id) {
		return reviewService.findById(id);
	}
	//?
	@GetMapping("/product/{id}/reviews/{reviewId}")
	public List<Review> findReviewByproductId(@PathVariable("id") Long id) {
		return reviewService.findByproductId(id);
	}

	@PostMapping("/product/{id}/reviews/{userId}")
	public Review addReview(
			@RequestBody Review review,
			@PathVariable("id") Long id,
			@PathVariable("userId") Long userId) {
		return reviewService.add(review,id,userId);
	}
	
	@PutMapping("/reviews/{id}")
	public Review updateReview(@PathVariable("id") Long id, @RequestBody Review review) {
		return reviewService.update(id,review);
	}
	
	@DeleteMapping("/product/{id}/reviews/{reviewId}")
	public Review deleteReview(@PathVariable("id") Long id) {
		reviewService.delete(reviewService.findById(id));
		return null;
		 
	}
    }
