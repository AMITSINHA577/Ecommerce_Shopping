package com.Shooping_Cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Shooping_Cart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
