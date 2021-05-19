package com.example.onlinesportshopee.services;


import com.example.onlinesportshopee.Exception.UserException;
import com.example.onlinesportshopee.entities.UserEntity;
import com.example.onlinesportshopee.model.User;

public interface IUserService {

	public UserEntity signIn(UserEntity user) throws UserException;
	public String signOut(UserEntity user);
	public User changePassword(long id,UserEntity user) throws UserException;

}
