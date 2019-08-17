package com.demo.ecommerce.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.demo.ecommerce.domain.Review;
import com.demo.ecommerce.domain.ShoppingCart;
import com.demo.ecommerce.service.ReviewService;



@RestController
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	@GetMapping("/reviews")
	public List<Review> hello1() {
		return reviewService.findAll();
	}
@GetMapping("/user/{userId}/reviews/")
public List<Review> findReviewByUserId( @PathVariable("userId") Long userId) throws Exception{
return reviewService.findReviewByUserId(userId);
}
@GetMapping("/product/{productId}/reviews/")
public List<Review> findReviewByProductId( @PathVariable("productId") Long productId) throws Exception{
	return reviewService.findReviewByProductId(productId);
	}
}
