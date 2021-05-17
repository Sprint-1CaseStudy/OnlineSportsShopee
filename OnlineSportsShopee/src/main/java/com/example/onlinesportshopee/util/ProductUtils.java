package com.example.onlinesportshopee.util;

import java.util.ArrayList;
import java.util.List;

import com.example.onlinesportshopee.entities.ProductEntity;

import com.example.onlinesportshopee.model.Product;



public class ProductUtils {
	private ProductUtils() {
		
	}
	 public static List<Product> convertToProductDtoList(List<ProductEntity> list){
	        List<Product> dtolist = new ArrayList<>();
	        for(ProductEntity productEntity : list) 
	            dtolist.add(convertToProduct(productEntity));
	        return dtolist;
	    }
	 
	 public static ProductEntity convertToProduct(Product dto) {
	        ProductEntity product = new ProductEntity();
	        product.setProductId(dto.getProductId());
	        product.setProductName(dto.getProductName());
	        product.setCategory(dto.getCategory());
	        product.setDescription(dto.getDescription());
	        product.setBrand(dto.getBrand());
	        product.setColour(dto.getColour());
	        product.setSize(dto.getSize());
	        product.setMrp(dto.getMrp());
	        product.setPriceAfterDiscount(dto.getPriceAfterDiscount());
	        product.setInStock(dto.isInStock());
	        product.setExpectedDelivery(dto.getExpectedDelivery());
	        return product;
	     
	    }    
	 
	 public static Product convertToProduct(ProductEntity productEntity) {
		 Product dto = new Product();
		 dto.setProductId(productEntity.getProductId());
		 dto.setProductName(productEntity.getProductName());
		 dto.setCategory(productEntity.getCategory());
		 dto.setDescription(productEntity.getDescription());
		 dto.setBrand(productEntity.getBrand());
		 dto.setColour(productEntity.getColour());
		 dto.setSize(productEntity.getSize());
		 dto.setMrp(productEntity.getMrp());
		 dto.setPriceAfterDiscount(productEntity.getPriceAfterDiscount());
		 dto.setInStock(productEntity.isInStock());
		 dto.setExpectedDelivery(productEntity.getExpectedDelivery());
		 return dto;
	 }

}
