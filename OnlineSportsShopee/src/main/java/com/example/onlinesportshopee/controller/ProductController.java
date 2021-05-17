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
		
		return productRepository.findByName(name); 		
	}
	
	@GetMapping("/products/{size}")
	public List<Product> getProductsBySize(@PathVariable String size)
	{
		
		return productRepository.findBySize(size);
		
	}
	
	@GetMapping("/products/{price}")
	public List<Product> getProductsByPrice(@PathVariable double price)
	{
		return productRepository.findByPrice(price);
		
	}
	
	@GetMapping("/products/{color}")
	public List<Product> getProductsByColor(@PathVariable String color)
	{
		return productRepository.findByColor(color);
		
	}

}
