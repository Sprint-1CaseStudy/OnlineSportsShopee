package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.model.Product;


public interface IProductService {
	
	
	

	public Product addProduct(ProductEntity product);
	public Product removeProduct(long productId);
	public Product updateProduct(long productId, ProductEntity product);
	public Product getProduct(long productId);
	public List<Product> getAllProduct();
	
	public List<Product> getProductsByName();
	public List<Product> getProductsBySize(); 
	public List<Product> getProductsByPrice();
	public List<Product> getProductsByColor();

}
