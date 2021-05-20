package com.example.onlinesportshopee.model;

import java.time.LocalDate;

import com.example.onlinesportshopee.entities.CustomerEntity;

public class Order {

	private Long orderID;
	private Double amount;
	private LocalDate billingDate;
	private CustomerEntity customerEntity;
	private String paymentMethod;
	
	public Order() {
		super();
	}

	public Order(Long orderID, Double amount, LocalDate billingDate, CustomerEntity customerEntity, String paymentMethod) {
		super();
		this.orderID = orderID;
		this.amount = amount;
		this.billingDate = billingDate;
		this.customerEntity = customerEntity;
		this.paymentMethod = paymentMethod;
	}
	
	public Long getOrderID() {
		return orderID;
	}
	
	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}
	
	public Double getAmount() {
		return amount;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public LocalDate getBillingDate() {
		return billingDate;
	}
	
	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}
	
	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}
	
	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
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
				+ customerEntity + ", paymentMethod=" + paymentMethod + "]";
	}
	
	

}
