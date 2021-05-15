package com.example.OnlineSportsShopee.Services;

import java.util.List;

import com.example.OnlineSportsShopee.Model.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Override
	public List<Product> getProductsByName()
	{
		return list;
		
	}
	
	@Override
	public List<Product> getProductsBySize()
	{
		
	}
	
	@Override
	public List<Product> getProductsByPrice()
	{
		
	}
	
	@Override
	public List<Product> getProductsByColor()
	{
		
	}
	
}
