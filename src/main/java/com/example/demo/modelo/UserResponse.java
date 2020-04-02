package com.example.demo.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResponse {

	private String user;
	private String token;
	
	public UserResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public UserResponse(String user, String token) {
		super();
		this.user = user;
		this.token = token;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	@Override
	public String toString() {
		return "UserResponse [user=" + user + ", token=" + token + "]";
	}
	
	
}
