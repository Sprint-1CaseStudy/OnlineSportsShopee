package com.example.onlinesportshopee.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.Exception.ProductsException;
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
	public List<Product> getProductsByName(String name) throws ProductsException
	{
		List<ProductEntity> getProductName = productRepository.findByName(name);
		if (getProductName == null)
		{
			String namenotfound = "No products found by the name "+name;
			throw new ProductsException(namenotfound);
		}
		return ProductUtils.convertToProductDtoList(getProductName);
	}
	
	
	@Override
	public List<Product> getProductsBySize(String size) throws ProductsException
	{
		List<ProductEntity> productSize = productRepository.findBySize(size);
		if (productSize == null)
		{
			String sizenotfound = "No products found by the size "+size;
			throw new ProductsException(sizenotfound);
		}
		return ProductUtils.convertToProductDtoList(productSize);
	}
	
	@Override
	public List<Product> getProductsByPrice(double price) throws ProductsException
	{
		List<ProductEntity> productPrice = productRepository.findByPrice(price);
		if (productPrice == null)
		{
			String pricenotfound = "No products found by the price "+price;
			throw new ProductsException(pricenotfound);
		}
		return ProductUtils.convertToProductDtoList(productPrice);
		
	}
	
	@Override
	public List<Product> getProductsByColor(String color) throws ProductsException
	{
		List<ProductEntity> productColor = productRepository.findByColor(color);
		if (productColor == null)
		{
			String colornotfound = "No products found by the color "+color;
			throw new ProductsException(colornotfound);
		}
		return ProductUtils.convertToProductDtoList(productColor);
	}

	
}
