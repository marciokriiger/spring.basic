package com.mkriiger.spring.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkriiger.spring.basic.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
