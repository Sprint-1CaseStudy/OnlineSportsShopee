package com.example.onlinesportshopee.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.exception.ProductsException;
import com.example.onlinesportshopee.model.Product;
import com.example.onlinesportshopee.services.IProductService;



@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@PostMapping("/addProduct")
	public ResponseEntity<Object> addProduct(@RequestBody ProductEntity product) throws ProductsException
	{
		Product productDto = null;
		ResponseEntity<Object> productResponse = null;
		productDto = productService.addProduct(product);
		productResponse = new ResponseEntity<>(productDto, HttpStatus.ACCEPTED);
		return productResponse;
		
	}
	
	@DeleteMapping("/removeProduct/product/{productId}")
	public ResponseEntity<Object> removeProduct(@PathVariable long productId) throws ProductsException
	{
		Product productDto = null;
		ResponseEntity<Object> productResponse = null;
		productDto = productService.removeProduct(productId);
		productResponse = new ResponseEntity<>(productDto, HttpStatus.ACCEPTED);
		return productResponse;
	 
	}
	
	@PutMapping("/updateProduct/{productId}")
	public ResponseEntity<Object> updateProduct(@PathVariable long productId, @RequestBody ProductEntity product)
	{
		Product productDto =null;
		ResponseEntity<Object> productResponse = null;
		productDto = productService.updateProduct(productId, product);
		productResponse = new ResponseEntity<>(productDto, HttpStatus.ACCEPTED);
		return productResponse;
		
	}
	
	@GetMapping("/getProduct/{productId}")
	public ResponseEntity<Object> getProduct(@PathVariable long productId)
	{
		Product productDto =null;
		ResponseEntity<Object> productResponse = null;
		productDto = productService.getProduct(productId);;
		productResponse = new ResponseEntity<>(productDto, HttpStatus.ACCEPTED);
		return productResponse;
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
		ResponseEntity<Object> response = null;
		response = new ResponseEntity<>(bysize,HttpStatus.ACCEPTED);
		return response;
	}
	
	@GetMapping("/byprice/{price}")
	public ResponseEntity<Object> getProductsByPrice(@PathVariable double price) throws ProductsException
	{
		List<Product> byprice = productService.getProductsByPrice(price);
		ResponseEntity<Object> response = null; 
		response = new ResponseEntity<>(byprice,HttpStatus.ACCEPTED);
		return response;
	}
	
	@GetMapping("/bycolor/{color}")
	public ResponseEntity<Object> getProductsByColor(@PathVariable String color) throws ProductsException
	{
		List<Product> bycolor = productService.getProductsByColor(color);
		ResponseEntity<Object> response = null;
		response = new ResponseEntity<>(bycolor,HttpStatus.ACCEPTED);
		return response;
	}
}
