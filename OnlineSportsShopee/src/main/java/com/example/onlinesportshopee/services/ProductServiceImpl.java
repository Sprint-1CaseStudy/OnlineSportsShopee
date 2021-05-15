package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IProductRepository;
import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.model.Product;

@Service
public class ProductServiceImpl implements IProductService {
	
	
	@Autowired 
	private IProductRepository productRepository;
	
	@Override
	public Product addProduct(ProductEntity product) {

		return null;
	}

	@Override
	public Product removeProduct(long id) {
		
		return null;
	}

	@Override
	public Product updateProduct(long id, ProductEntity product) {
		
		return null;
	}

	@Override
	public Product getProduct(long id) {
		
		return null;
	}

	@Override
	public List<Product> getAllProduct() {

		return null;
	}
	
	
	
	@Override
	public List<Product> getProductsByName()
	{
		
		return null;
	}
	
	@Override
	public List<Product> getProductsBySize()
	{
		return null;
	}
	
	@Override
	public List<Product> getProductsByPrice()
	{
		return null;
		
	}
	
	@Override
	public List<Product> getProductsByColor()
	{
		return null;
	}

	
}
