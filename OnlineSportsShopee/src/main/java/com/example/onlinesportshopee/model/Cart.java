package com.example.onlinesportshopee.model;

public class Cart {
	
	String imgageName;
	String productName;
	Integer quantity;
	Double price;
	Double total;



	public Cart() {
		super();
	}

	public Cart(String imgageName, String productName, Integer quantity, Double price, Double total) {
		super();
		this.imgageName = imgageName;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
	}

	public String getImgageName() {
		return imgageName;
	}
	
	public void setImgageName(String imgageName) {
		this.imgageName = imgageName;
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
	@Override
	public String toString() {
		return "Cart [imgageName=" + imgageName + ", productName=" + productName + ", quantity=" + quantity + ", price="
			+ price + ", total=" + total + "]";
	}


}
