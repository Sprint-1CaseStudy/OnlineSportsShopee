package com.example.onlinesportshopee.entities;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "order")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "orderID")
	private long orderID;
	@Column(name = "amount")
	private double amount;
	@Column(name = "billingDate")
	private LocalDate billingDate;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cust_id")
	private CustomerEntity customerEntity;
	@Column(name = "paymentMethod")
	private String paymentMethod;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "product_orders", joinColumns = { @JoinColumn(name = "order_id") }, inverseJoinColumns = { @JoinColumn(name = "product_id") })
	private ProductEntity productEntity;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="payment id")
	private PaymentEntity paymentEntity;
	
	public OrderEntity() {
		super();
	}

	public OrderEntity(long orderID, double amount, LocalDate billingDate, CustomerEntity customerEntity, ProductEntity productEntity,String paymentMethod,PaymentEntity paymentEntity) {
		super();
		this.orderID = orderID;
		this.amount = amount;
		this.billingDate = billingDate;
		this.customerEntity = customerEntity;
		this.paymentMethod = paymentMethod;
		this.productEntity=productEntity;
		this.paymentEntity=paymentEntity;
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

	public ProductEntity getProductEntity() {
		return productEntity;
	}

	public void setProductEntity(ProductEntity productEntity) {
		this.productEntity = productEntity;
	}

	public PaymentEntity getPaymentEntity() {
		return paymentEntity;
	}

	public void setPaymentEntity(PaymentEntity paymentEntity) {
		this.paymentEntity = paymentEntity;
	}

	@Override
	public String toString() {
		return "OrderEntity [orderID=" + orderID + ", amount=" + amount + ", billingDate=" + billingDate
				+ ", customerEntity=" + customerEntity + ", paymentMethod=" + paymentMethod + ", productEntity="
				+ productEntity + ", paymentEntity=" + paymentEntity + "]";
	}
	
	
	
}

	
	