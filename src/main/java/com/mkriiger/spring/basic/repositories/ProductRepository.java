package com.mkriiger.spring.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkriiger.spring.basic.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
