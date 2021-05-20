package com.example.onlinesportshopee.entities;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "orderID")
	private Long orderID;
	@Column(name = "amount")
	private Double amount;
	@Column(name = "billingDate")
	private LocalDate billingDate;
    @Column(name = "paymentMethod")
	private String paymentMethod;
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="cust_id")
	private CustomerEntity customerEntity;
	@OneToMany(mappedBy="orderEntity",cascade = CascadeType.ALL)
	private List<ProductEntity> productEntity;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="paymentid")
	private PaymentEntity paymentEntity;
	
	public OrderEntity() {
		super();
	}

	public OrderEntity(Long orderID, Double amount, LocalDate billingDate, CustomerEntity customerEntity, List<ProductEntity> productEntity,String paymentMethod,PaymentEntity paymentEntity) {
		super();
		this.orderID = orderID;
		this.amount = amount;
		this.billingDate = billingDate;
		this.customerEntity = customerEntity;
		this.paymentMethod = paymentMethod;
		this.productEntity=productEntity;
		this.paymentEntity=paymentEntity;
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

	public List<ProductEntity> getProductEntity(){ 
		return productEntity;
	  }
	  
	  public void setProductEntity(List<ProductEntity> productEntity) {
	  this.productEntity = productEntity; }
	 
	 

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

	
	