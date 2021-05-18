package com.example.onlinesportshopee.services;

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
    public UserEntity signIn(UserEntity user) throws UserException {
        String userid = user.getUserid();
        String password = user.getPassword();
        UserEntity useridrepo = Userrepo.findById(Long.parseLong(userid)).orElse(null);
        if (useridrepo == null)
        {
            String usernotfound = "No user found by the userid "+userid;
            throw new UserException(usernotfound);
        }
        else 
        {
            if(userid.equals(useridrepo.getUserid()) && password.equals(useridrepo.getPassword()))
                return useridrepo;  
            else {
            	throw new UserException("User name and password are invalid");
            }
        }
    }

 

    @Override
    public String signOut(UserEntity user) {
        return "Signout Successfully";
    }

 

    @Override
    public User changePassword(long id, UserEntity user) throws UserException {
        UserEntity userEnti;
        UserEntity changePassword = Userrepo.findById(id).orElse(null);
        if(changePassword == null)
        {
            String usernotfound = "No user found by the userid ";
            throw new UserException(usernotfound);
        }
        else userEnti = Userrepo.save(user);
        return UserUtils.convertToOrder(userEnti);
    }

 

}