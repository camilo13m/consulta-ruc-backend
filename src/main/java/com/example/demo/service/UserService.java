package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.modelo.User;
import com.example.demo.modelo.UserResponse;

@Service
public class UserService {

	public UserResponse validate(User user) {
		if (user.getUser().equalsIgnoreCase("cmedina") && user.getPass().equalsIgnoreCase("123")) {
			return new UserResponse(user.getUser(), "cXdlcnR5bGFt");
		} else {
			return new UserResponse();
		}
	}
}
