package com.example.onlinesportshopee.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IProductRepository;
import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.exception.ProductsException;
import com.example.onlinesportshopee.model.Product;
import com.example.onlinesportshopee.util.ProductUtils;

@Service
public class ProductServiceImpl implements IProductService {
	
	static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	static String productNotFound = "No product found in given Id";
	static String validationSuccessful = "Validation Succcessful";
	
	@Autowired 
	private IProductRepository iProductRepository;
	
	@Override
	public Product addProduct(ProductEntity product) {
		LOGGER.info("addProduct() service is initiated");
     ProductEntity productEntity;
     if(product == null)
    	 productEntity = null;
     else {
    	 productEntity = iProductRepository.save(product);
    	  }
     LOGGER.info("addProduct() service is executed");
     return ProductUtils.convertToProduct(productEntity);
     
	}

	@Override
	public Product removeProduct(long productId) {
		LOGGER.info("removeProduct() service is initiated");
		ProductEntity delproduct = iProductRepository.findById(productId).get();
		iProductRepository.delete(delproduct);
		LOGGER.info("removeProduct() service is executed");
		return ProductUtils.convertToProduct(delproduct);
	}

	
	@Override
	public Product updateProduct(long productId, ProductEntity product) {
		LOGGER.info("updateProduct() service is initiated");
		ProductEntity updateProduct = iProductRepository.findById(productId).get();
		updateProduct = iProductRepository.save(product);
		LOGGER.info("updateProduct() service is executed");
		return ProductUtils.convertToProduct(updateProduct);
	}

	@Override
	public Product getProduct(long productId) {
		LOGGER.info("getProduct() service is initiated");
		ProductEntity getProduct = iProductRepository.findById(productId).get();
		LOGGER.info("getProduct() service is executed");
		return ProductUtils.convertToProduct(getProduct);
	}

	@Override
	public List<Product> getAllProduct() {
		LOGGER.info("getAllProduct() service is initiated");
		List<ProductEntity> getAllProduct = iProductRepository.findAll();
		LOGGER.info("getAllProduct() service is executed");
		return ProductUtils.convertToProductDtoList(getAllProduct);
	}
	
	@Override
	public List<Product> getProductsByName(String name) throws ProductsException
	{
		LOGGER.info("getProductByName() service is initiated");
		List<ProductEntity> getProductName = iProductRepository.findByName(name);
		if (getProductName == null)
		{
			String namenotfound = "No products found by the name "+name;
			throw new ProductsException(namenotfound);
		}
		LOGGER.info("getProductByName() service is executed");
		return ProductUtils.convertToProductDtoList(getProductName);
	}
	
	
	@Override
	public List<Product> getProductsBySize(String size) throws ProductsException
	{
		LOGGER.info("getProductBySize() service is initiated");
		List<ProductEntity> productSize = iProductRepository.findBySize(size);
		if (productSize == null)
		{
			String sizenotfound = "No products found by the size "+size;
			throw new ProductsException(sizenotfound);
		}
		LOGGER.info("getProductBySize() service is executed");
		return ProductUtils.convertToProductDtoList(productSize);
	}
	
	@Override
	public List<Product> getProductsByPrice(double price) throws ProductsException
	{
		LOGGER.info("getProductByPrice() service is initiated");
		List<ProductEntity> productPrice = iProductRepository.findByPrice(price);
		if (productPrice == null)
		{
			String pricenotfound = "No products found by the price "+price;
			throw new ProductsException(pricenotfound);
		}
		LOGGER.info("getProductByPrice() service is executed");
		return ProductUtils.convertToProductDtoList(productPrice);
		
	}
	
	@Override
	public List<Product> getProductsByColor(String color) throws ProductsException
	{
		LOGGER.info("getProductByColor() service is initiated");
		List<ProductEntity> productColor = iProductRepository.findByColor(color);
		if (productColor == null)
		{
			String colornotfound = "No products found by the color "+color;
			throw new ProductsException(colornotfound);
		}
		LOGGER.info("getProductByColor() service is executed");
		return ProductUtils.convertToProductDtoList(productColor);
	}

	
}
