package com.example.onlinesportshopee.model;

import java.util.List;

import com.example.onlinesportshopee.entities.ProductEntity;

public class Cart {
	
	private Long id;
	private String imageName;
	private String productName;
	private Integer quantity;
	private Double price;
	private Double total;
	private List<ProductEntity> productEntity;

	public Cart() {
		super();
	}

	public Cart(Long id, String imageName, String productName, Integer quantity, Double price, Double total,List<ProductEntity> productEntity) {
		super();
		this.id = id;
		this.imageName = imageName;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
		this.productEntity=productEntity;
	}

	public Long getID() {
		return id;
	}
	public void setID(Long id) {
		this.id = id;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	

	public List<ProductEntity> getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(List<ProductEntity> productEntity) {
		this.productEntity = productEntity;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", imageName=" + imageName + ", productName=" + productName + ", quantity="
				+ quantity + ", price=" + price + ", total=" + total + ", productEntity=" + productEntity + "]";
	}


	
}
