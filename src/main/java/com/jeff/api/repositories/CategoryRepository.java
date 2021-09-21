package com.jeff.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeff.api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
