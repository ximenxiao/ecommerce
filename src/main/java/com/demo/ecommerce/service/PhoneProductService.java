package com.demo.ecommerce.service;

import java.util.List;

import com.demo.ecommerce.domain.PhoneProductDetail;

public interface PhoneProductService {

	List<PhoneProductDetail> FindAll(String name, String wirelessCarrier, String productCondition, Integer memory,
			Integer ramSize, Integer status, Integer sellerId);

}
