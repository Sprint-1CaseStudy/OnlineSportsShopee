package com.example.OnlineSportsShopee.Model;

public class Cart {
String imgageName;
String productName;
int quantity;
double price;
double total;



public Cart() {
	super();
}

public Cart(String imgageName, String productName, int quantity, double price, double total) {
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
	return "Cart [imgageName=" + imgageName + ", productName=" + productName + ", quantity=" + quantity + ", price="
			+ price + ", total=" + total + "]";
}


}
