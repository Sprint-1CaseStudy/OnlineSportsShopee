package com.example.onlinesportshopee.entities;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class UserEntity {

	@Id
	//@Column(name = "userid")
	private Long id;
	@Column(name = "password")
	private String password;
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(Long id, String password) {
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
		return "UserEntity [id=" + id + ", password=" + password + "]";
	}
	
	

}
