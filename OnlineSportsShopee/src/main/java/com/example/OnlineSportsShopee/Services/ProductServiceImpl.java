package com.example.OnlineSportsShopee.Services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.OnlineSportsShopee.Dao.IProductRepository;
import com.example.OnlineSportsShopee.Entities.ProductEntity;
import com.example.OnlineSportsShopee.Model.Product;

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
