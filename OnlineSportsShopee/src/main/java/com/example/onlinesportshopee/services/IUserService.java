package com.example.onlinesportshopee.services;


import com.example.onlinesportshopee.entities.UserEntity;
import com.example.onlinesportshopee.model.User;

public interface IUserService {

	public User signIn(UserEntity user);
	public User signOut(UserEntity user);
	public User changePassword(long id,UserEntity user);

}
