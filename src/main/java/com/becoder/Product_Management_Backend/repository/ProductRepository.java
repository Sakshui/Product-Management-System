package com.becoder.Product_Management_Backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.becoder.Product_Management_Backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
