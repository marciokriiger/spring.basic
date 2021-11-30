package com.mkriiger.spring.basic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mkriiger.spring.basic.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
