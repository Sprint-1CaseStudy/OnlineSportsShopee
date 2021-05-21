package com.example.onlinesportshopee.model;

public class User {
	
	private Long id;

	private String password;
	
	public User() {
		super();
	}

	public User(Long id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public Long getID() {
		return id;
	}
	public void setID(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + "]";
	}

}
