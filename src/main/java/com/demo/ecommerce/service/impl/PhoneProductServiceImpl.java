package com.demo.ecommerce.service.impl;

import java.util.List;

import com.demo.ecommerce.domain.PhoneProductDetail;
import com.demo.ecommerce.domain.Product;
import com.demo.ecommerce.service.PhoneProductService;

public class PhoneProductServiceImpl implements PhoneProductService{

	@Override
	public List<PhoneProductDetail> FindAll(String name, String wirelessCarrier, String productCondition,
			Integer memory, Integer ramSize, Integer status, Integer sellerId) {
		return null;
	}

	@Override
	public PhoneProductDetail findByProductId(Long id) {
		return null;
	}

	@Override
	public Product add(PhoneProductDetail phoneProductDetail) {
		return null;
	}

	@Override
	public Product update(PhoneProductDetail phoneProductDetail, Long id) {
		return null;
	}

	@Override
	public void delete(PhoneProductDetail phoneProductDetail) {
		
	}

}
