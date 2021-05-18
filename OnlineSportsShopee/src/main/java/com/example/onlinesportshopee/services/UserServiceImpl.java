package com.example.onlinesportshopee.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.Exception.UserException;
import com.example.onlinesportshopee.dao.IUserRepository;
import com.example.onlinesportshopee.entities.UserEntity;
import com.example.onlinesportshopee.model.User;
import com.example.onlinesportshopee.util.UserUtils;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IUserRepository Userrepo;

	@Override
	public User signIn(UserEntity user) throws UserException {
		userid = user.getUserid();
		String password = user.getPassword();
		UserEntity useridrepo = Userrepo.findById(userid).orElse(null);
		if (useridrepo == null)
		{
			String usernotfound = "No user found by the userid "+userid;
			throw new UserException(usernotfound);
		}
		else 
		{
			if(userid.equals(useridrepo.getUserid()) && password.equals(useridrepo.getPassword()))
			{
				return null;
			}
			else
			{
				return null;
			}
		}
	}

	@Override
	public User signOut(UserEntity user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User changePassword(long id, UserEntity user) {
		UserEntity userEnti;
		UserEntity changePassword = Userrepo.findById(id).orElse(null);
		if(changePassword == null)
		{
			String usernotfound = "No user found by the userid "+userid;
			throw new UserException(usernotfound);
		}
		else userEnti = Userrepo.save(user);
		return UserUtils.convertToOrder(userEnti);
	}

}
