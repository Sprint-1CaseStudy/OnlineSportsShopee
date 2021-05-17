package com.example.onlinesportshopee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IUserRepository;
import com.example.onlinesportshopee.entities.UserEntity;
import com.example.onlinesportshopee.model.User;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository UserServiceImpl;

	@Override
	public User signIn(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User signOut(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User changePassword(long id, UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

}
