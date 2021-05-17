package com.example.onlinesportshopee.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.model.Product;

@Repository
public interface IProductRepository extends JpaRepository<ProductEntity,Long> {

	 @Query("select p FROM Product p WHERE productName = ?")
	 List<Product> findByName(String name);
	 
	 @Query("select p FROM Product p WHERE size = ?")
	 List<Product> findBySize(String size);

	 @Query("select p FROM Product p WHERE mrp = ?")
	 List<Product> findByPrice(double price);
	 
	 @Query("select p FROM Product p WHERE colour = ?")
	 List<Product> findByColor(String color);
}
