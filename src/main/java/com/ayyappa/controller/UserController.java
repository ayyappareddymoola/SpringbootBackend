package com.ayyappa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ayyappa.model.User;
import com.ayyappa.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	@GetMapping("/validateUser")
	public User login(@RequestParam String userName,@RequestParam String password) {
		return userService.getUser(userName, password);
	}

}
