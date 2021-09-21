package com.jeff.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeff.api.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
