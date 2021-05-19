package com.example.onlinesportshopee.entities;

import javax.persistence.*;


@Table(name="Cart")
public class CartEntity 
{
	
	@Column(name = "ImageName")
	private String imageName;
	@Id
	@Column(name = "ProductName")
	private String productName;
	@Column(name = "Quantity")
	private int quantity;
	@Column(name = "Price")
	private double price;
	@Column(name="ToatlBill")
	private double total;
	
	public CartEntity() {
		super();
	}
	
	public CartEntity(String imageName, String productName, int quantity, double price, double total) {
		super();
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

	@Override
	public String toString() {
		return "CartEntity [imageName=" + imageName + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", total=" + total + "]";
	}
	
	
	
}
