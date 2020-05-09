package com.spring.boot.first.firstwebapplication.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class UserEntity {
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	private String name;
	private String userRole;
	private String password;
	
	public UserEntity(String name, String password) {
		super();
		this.name = name;
		this.userRole = userRole;
		this.password = password;
	}
	
	public UserEntity() {

	}

	public long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}
	public String getUserRole() {
		return password;
	}

	@Override
	public String toString() {
		return "UserEntity [Id=" + Id + ", name=" + name + ", User Role"+ userRole+", password=" + password + "]";
	}
	
	
	
	

}
