package com.example.onlinesportshopee.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.Exception.ProductsException;
import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.model.Product;
import com.example.onlinesportshopee.services.IProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody ProductEntity product)
	{
		return productService.addProduct(product);
	}
	
	@DeleteMapping("/removeProduct/product/{productId}")
	public Product removeProduct(@PathVariable long productId)
	{
		return productService.removeProduct(productId);
	}
	
	@PutMapping("/updateProduct/{productId}")
	public Product updateProduct(@PathVariable long productId, @RequestBody ProductEntity product)
	{
		return productService.updateProduct(productId, product);
	}
	
	@GetMapping("/getProduct/{productId}")
	public Product getProduct(@PathVariable long productId)
	{
		return productService.getProduct(productId);
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct()
	{
		return productService.getAllProduct();
	}
	
	
	@GetMapping("/byname/{name}")
	public ResponseEntity<Object> getProductsByName(@PathVariable String name) throws ProductsException
	{
		ResponseEntity<Object> response = null;
		List<Product> products = productService.getProductsByName(name);
		response = new ResponseEntity<>(products,HttpStatus.ACCEPTED);	
		return response;
	}
	
	@GetMapping("/bysize/{size}")
	public ResponseEntity<Object> getProductsBySize(@PathVariable String size) throws ProductsException
	{
		List<Product> bysize = productService.getProductsBySize(size);
		ResponseEntity<Object> response = new ResponseEntity<>(bysize,HttpStatus.ACCEPTED);
		return response;
	}
	
	@GetMapping("/byprice/{price}")
	public ResponseEntity<Object> getProductsByPrice(@PathVariable double price) throws ProductsException
	{
		List<Product> byprice = productService.getProductsByPrice(price);
		ResponseEntity<Object> response = new ResponseEntity<>(byprice,HttpStatus.ACCEPTED);
		return response;
	}
	
	@GetMapping("/bycolor/{color}")
	public ResponseEntity<Object> getProductsByColor(@PathVariable String color) throws ProductsException
	{
		List<Product> bycolor = productService.getProductsByColor(color);
		ResponseEntity<Object> response = new ResponseEntity<>(bycolor,HttpStatus.ACCEPTED);
		return response;
	}

}
