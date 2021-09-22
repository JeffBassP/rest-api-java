package com.jeff.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeff.api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
