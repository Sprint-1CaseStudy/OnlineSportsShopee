package com.example.OnlineSportsShopee.Model;

import java.time.LocalDate;

import com.example.OnlineSportsShopee.Entities.CustomerEntity;

public class Order {

	private long orderID;
	private double amount;
	private LocalDate billingDate;
	private Customer customer;
	private String paymentMethod;
	
	public Order() {
		super();
	}

	public Order(long orderID, double amount, LocalDate billingDate, Customer customer, String paymentMethod) {
		super();
		this.orderID = orderID;
		this.amount = amount;
		this.billingDate = billingDate;
		this.customer = customer;
		this.paymentMethod = paymentMethod;
	}
	
	public long getOrderID() {
		return orderID;
	}
	
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public LocalDate getBillingDate() {
		return billingDate;
	}
	
	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", amount=" + amount + ", billingDate=" + billingDate + ", customer="
				+ customer + ", paymentMethod=" + paymentMethod + "]";
	}

	
	

}
