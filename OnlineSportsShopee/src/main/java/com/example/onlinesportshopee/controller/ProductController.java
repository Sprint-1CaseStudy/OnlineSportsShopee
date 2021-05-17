package com.example.onlinesportshopee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.dao.IProductRepository;
import com.example.onlinesportshopee.model.Product;


@RestController
public class ProductController {
	
	@Autowired
	private IProductRepository productRepository;
	
	
	@GetMapping("/products/{name}")
	public List<Product> getProductsByName(@PathVariable String name)
	{
		return null;
		
	}
	
	@GetMapping("/products/{size}")
	public List<Product> getProductsBySize(@PathVariable String size)
	{
		return null;
		
	}
	
	@GetMapping("/products/{price}")
	public List<Product> getProductsByPrice(@PathVariable double price)
	{
		return null;
		
	}
	
	@GetMapping("/products/{color}")
	public List<Product> getProductsByColor(@PathVariable String color)
	{
		return null;
		
	}

}
