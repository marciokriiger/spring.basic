package com.mkriiger.spring.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkriiger.spring.basic.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
