package com.demo.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

	 @Query("select oc from User oc where (:userName is null or oc.userName = :userName) and "
		 		+ "(:status is null or oc.status = :status) and"
		 		+ "(:country is null or oc.country = :country) and"
		 		+ "(:email is null or oc.email = :email)"
		 		
		 		)
	List<User> findByConditions( 
			@Param("userName")String userName, 
			 @Param("status")Integer status, 
			 @Param("email")String email, 
			 @Param("country")String country);

}