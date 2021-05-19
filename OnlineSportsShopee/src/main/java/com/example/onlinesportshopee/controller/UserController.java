package com.example.onlinesportshopee.controller;


//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.entities.UserEntity;
import com.example.onlinesportshopee.exception.UserException;
import com.example.onlinesportshopee.model.User;
import com.example.onlinesportshopee.services.IUserService;

@RestController
@RequestMapping("/login")
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/signin/{userId}/{password}")
	public ResponseEntity<Object> signin(@PathVariable String userId,@PathVariable String Password) throws UserException
	{
		UserEntity userdata = new UserEntity(userId,Password);
		UserEntity user = userService.signIn(userdata);
		ResponseEntity<Object> response = new ResponseEntity<>(user,HttpStatus.ACCEPTED);
		return response;
	}
	
	
	@GetMapping("/signout")
	public ResponseEntity<Object> signOut() throws UserException
	{
		String signout = userService.signOut(null);
		ResponseEntity<Object> response = new ResponseEntity<>(signout,HttpStatus.ACCEPTED);
		return response;
	}
	
	@PutMapping("/changepassword/{userId}")
	public ResponseEntity<Object> signin(@PathVariable long userId, @RequestBody UserEntity User) throws UserException
	{
		User user = userService.changePassword(userId, User);
		ResponseEntity<Object> response = new ResponseEntity<>(user,HttpStatus.ACCEPTED);
		return response;
	}	
	
}
