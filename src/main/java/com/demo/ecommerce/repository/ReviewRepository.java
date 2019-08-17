package com.demo.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demo.ecommerce.domain.Review;
import com.demo.ecommerce.domain.User;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	Review findByReviewId(Long Id);

	Review findByUserName(User user);

	List<Review> findByUserName(String userName);

}
