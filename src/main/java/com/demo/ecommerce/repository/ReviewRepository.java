package com.demo.ecommerce.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.demo.ecommerce.domain.Product;
import com.demo.ecommerce.domain.Review;
import com.demo.ecommerce.domain.User;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	Review findByUserName(String userName);

	 @Query("select oc from Review oc where (:userName is null or oc.userName = :userName) and "
		 		+ "(:title is null or oc.title = :title) and"
		 		+ "(:rate is null or oc.rate = :rate)"
		 		
		 		)
	List<Review> findByConditions( 
			@Param("userName")String userName, 
			 @Param("title")String title, 
			 @Param("rate")Integer rate);

	List<Review> findByUser(User user);

	List<Review> findByProduct(Product product);
}