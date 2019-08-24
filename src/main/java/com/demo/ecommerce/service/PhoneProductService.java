package com.demo.ecommerce.service;

import java.util.List;

import com.demo.ecommerce.domain.PhoneProductDetail;
import com.demo.ecommerce.domain.Product;

public interface PhoneProductService {

	List<PhoneProductDetail> FindAll(String name, String wirelessCarrier, String productCondition, Integer memory,
			Integer ramSize, Integer status, Integer sellerId);
	PhoneProductDetail findByProductId(Long id);
	Product add(PhoneProductDetail phoneProductDetail);
	Product update(PhoneProductDetail phoneProductDetail,Long id);
	void delete(PhoneProductDetail phoneProductDetail);

}
