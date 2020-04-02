package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.User;
import com.example.demo.modelo.UserResponse;
import com.example.demo.service.UserService;

@RestController
public class AutenticacionController {
	
	@Autowired
	UserService userService;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@PostMapping("/api/authenticate")
	public UserResponse autenticacion(@RequestBody User user) {
		UserResponse userResponse = userService.validate(user);
		System.out.println(userResponse);
		return userResponse;
	}
}
