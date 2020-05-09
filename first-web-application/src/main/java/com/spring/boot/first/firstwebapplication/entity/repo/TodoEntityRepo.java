package com.spring.boot.first.firstwebapplication.entity.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.first.firstwebapplication.model.Todo;

public interface TodoEntityRepo extends JpaRepository<Todo, Integer>{
	
	List<Todo> findByUser(String user);
	void deleteById(Integer id);

}
