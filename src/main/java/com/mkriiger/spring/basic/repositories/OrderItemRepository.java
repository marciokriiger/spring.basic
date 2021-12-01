package com.mkriiger.spring.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkriiger.spring.basic.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
