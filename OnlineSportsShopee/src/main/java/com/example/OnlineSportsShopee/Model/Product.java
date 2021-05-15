package com.example.OnlineSportsShopee.Model;



import java.time.LocalDate;



public class Product {
	

	private long productId;

	private String productName;

	private String category;

	private String description;
	
	private String brand;
	
	private String colour;
	
	private String size;
	
	private double mrp;
	
	private double priceAfterDiscount;
	
	private boolean inStock;

	private LocalDate expectedDelivery;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getMrp() {
		return mrp;
	}
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}
	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount = priceAfterDiscount;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public LocalDate getExpectedDelivery() {
		return expectedDelivery;
	}
	public void setExpectedDelivery(LocalDate expectedDelivery) {
		this.expectedDelivery = expectedDelivery;
	}
	
	
	
	public Product(long productId, String productName, String category, String description, String brand, String colour,
			String size, double mrp, double priceAfterDiscount, boolean inStock, LocalDate expectedDelivery) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.category = category;
		this.description = description;
		this.brand = brand;
		this.colour = colour;
		this.size = size;
		this.mrp = mrp;
		this.priceAfterDiscount = priceAfterDiscount;
		this.inStock = inStock;
		this.expectedDelivery = expectedDelivery;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", category=" + category
				+ ", description=" + description + ", brand=" + brand + ", colour=" + colour + ", size=" + size
				+ ", mrp=" + mrp + ", priceAfterDiscount=" + priceAfterDiscount + ", inStock=" + inStock
				+ ", expectedDelivery=" + expectedDelivery + "]";
	}
	
	
}
