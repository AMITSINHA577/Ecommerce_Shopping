package com.Shooping_Cart.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Shooping_Cart.model.Product;
import com.Shooping_Cart.repository.ProductRepository;
import com.Shooping_Cart.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub

		return productRepository.save(product);
	}

}
