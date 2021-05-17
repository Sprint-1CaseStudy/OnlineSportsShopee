package com.example.onlinesportshopee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.dao.IProductRepository;
import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.model.Product;
import com.example.onlinesportshopee.services.IProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private IProductRepository productRepository;
	
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
