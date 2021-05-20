package com.example.onlinesportshopee.entities;

import javax.persistence.*;

@Entity
@Table(name = "payment")
public class UserEntity {

	@Id
	//@Column(name = "userid")
	private String userid;
	@Column(name = "password")
	private String password;
	
	public UserEntity() {
		super();
	}
	
	public UserEntity(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "UserEntity [userid=" + userid + ", password=" + password + "]";
	}
	
	

}
