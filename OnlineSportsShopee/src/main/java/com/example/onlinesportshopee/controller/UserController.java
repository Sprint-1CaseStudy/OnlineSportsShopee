package com.example.onlinesportshopee.controller;


//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//import com.example.onlinesportshopee.model.User;
import com.example.onlinesportshopee.services.IUserService;

@RestController
public class UserController {
	
	@Autowired
	private IUserService userService;
	
	

	
}
