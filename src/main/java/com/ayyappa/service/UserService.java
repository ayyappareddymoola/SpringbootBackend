package com.ayyappa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ayyappa.model.User;
import com.ayyappa.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	public User getUser(String name,String password) {
		
		return userRepository.findByUserNameAndPassword(name, password);
		
	}
	

}
