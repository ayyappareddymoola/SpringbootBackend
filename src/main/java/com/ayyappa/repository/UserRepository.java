package com.ayyappa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayyappa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUserNameAndPassword(String userName,String password);
}
