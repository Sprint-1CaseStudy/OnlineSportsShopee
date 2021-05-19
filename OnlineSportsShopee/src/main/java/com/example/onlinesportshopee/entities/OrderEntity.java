package com.example.onlinesportshopee.entities;


import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "order")

public class OrderEntity {

	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "orderID")
	private long orderID;
	@Column(name = "amount")
	private double amount;
	@Column(name = "billingDate")
	private LocalDate billingDate;
	@Column(name = "customer")
	private CustomerEntity customerEntity;
	@Column(name = "paymentMethod")
	private String paymentMethod;
	
	public OrderEntity() {
		super();
	}

	public OrderEntity(long orderID, double amount, LocalDate billingDate, CustomerEntity customerEntity, String paymentMethod) {
		super();
		this.orderID = orderID;
		this.amount = amount;
		this.billingDate = billingDate;
		this.customerEntity = customerEntity;
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
