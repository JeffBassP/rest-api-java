package com.jeff.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeff.api.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
