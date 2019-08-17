package com.demo.ecommerce.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.ecommerce.domain.ShoppingCart;
import com.demo.ecommerce.domain.User;


@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

	List<ShoppingCart> findByUser(User user);


}
