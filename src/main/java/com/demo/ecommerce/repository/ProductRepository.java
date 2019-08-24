package com.demo.ecommerce.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findByProductId(String name);

	List<Product> findByName(String name);

	@Query("select oc from Product oc where (:name is null or oc.name = :name) and "
	 		+ "(:status is null or oc.status = :status) and"
	 		+ "(:description is null or oc.description LIKE CONCAT('%',:description,'%')) and"
	 		+ "(:price is null or oc.price = :price)"
	 		)
	List<Product> findAll(
			@Param("name")String name,
			@Param("description")String description,
			@Param("price")BigDecimal price, 
			@Param("status")Integer status);
}