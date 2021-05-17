package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IProductRepository;
import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.model.Product;
import com.example.onlinesportshopee.util.ProductUtils;

@Service
public class ProductServiceImpl implements IProductService {
	
	
	@Autowired 
	private IProductRepository productRepository;
	
	@Override
	public Product addProduct(ProductEntity product) {
     ProductEntity productEntity;
     if(product == null)
    	 productEntity = null;
     else {
    	 productEntity = productRepository.save(product);
    	  }
     return ProductUtils.convertToProduct(productEntity);
     
	}

	@Override
	public Product removeProduct(long productId) {
		ProductEntity delproduct = productRepository.findById(productId).get();
		 productRepository.delete(delproduct);
		return ProductUtils.convertToProduct(delproduct);
	}

	
	@Override
	public Product updateProduct(long productId, ProductEntity product) {
		ProductEntity updateProduct = productRepository.findById(productId).get();
		updateProduct = productRepository.save(product);
		
		return ProductUtils.convertToProduct(updateProduct);
	}

	@Override
	public Product getProduct(long productId) {
		ProductEntity getProduct = productRepository.findById(productId).get();
		return ProductUtils.convertToProduct(getProduct);
	}

	@Override
	public List<Product> getAllProduct() {
		List<ProductEntity> getAllProduct = productRepository.findAll();

		return ProductUtils.convertToProductDtoList(getAllProduct);
	}
	
	@Override
	public List<Product> getProductsByName(String name)
	{
		List<ProductEntity> getProductName = productRepository.findByName(name);
		
		return ProductUtils.convertToProductDtoList(getProductName);
	}
	
	
	@Override
	public List<Product> getProductsBySize(String size)
	{
		List<ProductEntity> productSize = productRepository.findBySize(size);
		return ProductUtils.convertToProductDtoList(productSize);
	}
	
	@Override
	public List<Product> getProductsByPrice(double price)
	{
		List<ProductEntity> productPrice = productRepository.findByPrice(price);
		return ProductUtils.convertToProductDtoList(productPrice);
		
	}
	
	@Override
	public List<Product> getProductsByColor(String color)
	{
		List<ProductEntity> productColor = productRepository.findByColor(color);
		return ProductUtils.convertToProductDtoList(productColor);
	}

	
}
