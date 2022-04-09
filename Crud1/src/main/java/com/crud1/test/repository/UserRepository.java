package com.crud1.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud1.test.entity.User;

public interface UserRepository extends JpaRepository<User ,Integer>{
	User findByName(String name);
}
