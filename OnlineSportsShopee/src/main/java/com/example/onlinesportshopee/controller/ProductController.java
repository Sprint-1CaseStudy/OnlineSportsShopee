package com.example.onlinesportshopee.controller;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.exception.ProductsException;
import com.example.onlinesportshopee.model.Product;
import com.example.onlinesportshopee.services.IProductService;



@RestController
@RequestMapping("onlinesportshopee/products")
public class ProductController {
	
	static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private IProductService iProductService;
	
	@PostMapping("/addproduct")
	public ResponseEntity<Object> addProduct(@RequestBody ProductEntity product) throws ProductsException
	{
		LOGGER.info("addProduct URL is opened");
		LOGGER.info("addProduct() is initiated");
		Product productDto = null;
		ResponseEntity<Object> productResponse = null;
		productDto = iProductService.addProduct(product);
		productResponse = new ResponseEntity<>(productDto, HttpStatus.ACCEPTED);
		LOGGER.info("addProduct() has Executed");
		return productResponse;
		
	}
	
	@DeleteMapping("/removeproduct/product/{productId}")
	public ResponseEntity<Object> removeProduct(@PathVariable long productId) throws ProductsException
	{
		LOGGER.info("removeProduct URL is opened");
		LOGGER.info("removeProduct() is initiated");
		Product productDto = null;
		ResponseEntity<Object> productResponse = null;
		productDto = iProductService.removeProduct(productId);
		productResponse = new ResponseEntity<>(productDto, HttpStatus.ACCEPTED);
		LOGGER.info("removeProduct() has Executed");
		return productResponse;
	 
	}
	
	@PutMapping("/updateproduct/{productId}")
	public ResponseEntity<Object> updateProduct(@PathVariable long productId, @RequestBody ProductEntity product)
	{
		LOGGER.info("updateProduct URL is opened");
		LOGGER.info("updateProduct() is initiated");
		Product productDto =null;
		ResponseEntity<Object> productResponse = null;
		productDto = iProductService.updateProduct(productId, product);
		productResponse = new ResponseEntity<>(productDto, HttpStatus.ACCEPTED);
		LOGGER.info("updateProduct() has Executed");
		return productResponse;
		
	}
	
	@GetMapping("/getproduct/{productId}")
	public ResponseEntity<Object> getProduct(@PathVariable long productId)
	{
		LOGGER.info("getProduct URL is opened");
		LOGGER.info("getProduct() is initiated");
		Product productDto =null;
		ResponseEntity<Object> productResponse = null;
		productDto = iProductService.getProduct(productId);
		productResponse = new ResponseEntity<>(productDto, HttpStatus.ACCEPTED);
		LOGGER.info("getProduct() has Executed");
		return productResponse;
	}
	
	@GetMapping("/getallproduct")
	public List<Product> getAllProduct()
	{
		LOGGER.info("getAllProducts URL is opened");
		LOGGER.info("getAllProducts() is initiated");
		return iProductService.getAllProduct();
	}
	
	
	@GetMapping("/byname/{name}")
	public ResponseEntity<Object> getProductsByName(@PathVariable String name) throws ProductsException
	{
		LOGGER.info("Productbyname URL is opened");
		LOGGER.info("Productbyname() is initiated");
		ResponseEntity<Object> response = null;
		List<Product> products = iProductService.getProductsByName(name);
		response = new ResponseEntity<>(products,HttpStatus.ACCEPTED);	
		LOGGER.info("Productbyname() has Executed");
		return response;
	}
	
	@GetMapping("/bysize/{size}")
	public ResponseEntity<Object> getProductsBySize(@PathVariable String size) throws ProductsException
	{
		LOGGER.info("Productbysize URL is opened");
		LOGGER.info("Productbysize() is initiated");
		List<Product> bysize = iProductService.getProductsBySize(size);
		ResponseEntity<Object> response = new ResponseEntity<>(bysize,HttpStatus.ACCEPTED);
		LOGGER.info("Productbysize() has Executed");
		return response;
	}
	
	@GetMapping("/byprice/{price}")
	public ResponseEntity<Object> getProductsByPrice(@PathVariable double price) throws ProductsException
	{
		LOGGER.info("Productbyprice URL is opened");
		LOGGER.info("Productbyprice() is initiated");
		List<Product> byprice = iProductService.getProductsByPrice(price);
		ResponseEntity<Object> response = new ResponseEntity<>(byprice,HttpStatus.ACCEPTED);
		LOGGER.info("Productbyprice() has Executed");
		return response;
	}
	
	@GetMapping("/bycolor/{color}")
	public ResponseEntity<Object> getProductsByColor(@PathVariable String color) throws ProductsException
	{
		LOGGER.info("Productbycolor URL is opened");
		LOGGER.info("Productbycolor() is initiated");
		List<Product> bycolor = iProductService.getProductsByColor(color);
		ResponseEntity<Object> response = new ResponseEntity<>(bycolor,HttpStatus.ACCEPTED);
		LOGGER.info("Productbycolor() has Executed");
		return response;
	}
}
