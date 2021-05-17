package com.example.onlinesportshopee.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.dao.IProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private IProductRepository productRepository;

}
