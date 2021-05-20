package com.example.onlinesportshopee.model;

public class Cart {

	private long productId;
	private String imageName;
	private String productName;
	private int quantity;
	private double price;
	private double total;



	public Cart() {
		super();
	}

	public Cart(long productId, String imageName, String productName, int quantity, double price, double total) {
		super();
		this.productId = productId;
		this.imageName = imageName;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.total = total;
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
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	@Override
	public String toString() {
		return "Cart [productId=" + productId + ", imageName=" + imageName + ", productName=" + productName
				+ ", quantity=" + quantity + ", price=" + price + ", total=" + total + "]";
	}

}
