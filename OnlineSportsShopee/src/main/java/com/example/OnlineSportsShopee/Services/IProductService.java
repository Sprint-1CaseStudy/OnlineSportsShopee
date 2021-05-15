package com.example.OnlineSportsShopee.Services;

import java.util.List;

import com.example.OnlineSportsShopee.Model.Product;


public interface IProductService {
	
	public List<Product> getProductsByName();
	public List<Product> getProductsBySize(); 
	public List<Product> getProductsByPrice();
	public List<Product> getProductsByColor();

}
