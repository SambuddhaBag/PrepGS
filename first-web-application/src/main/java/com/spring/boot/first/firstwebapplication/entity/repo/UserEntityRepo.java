package com.spring.boot.first.firstwebapplication.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.first.firstwebapplication.entity.UserEntity;

public interface UserEntityRepo extends JpaRepository<UserEntity, Long>{

}
