package com.example.OnlineSportsShopee.Entities;

import javax.persistence.*;  
@Entity
@Table(name = "payment")

public class PaymentEntity {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "paymentId")
	private long paymentId;
	@Column(name = "type")
	private String type;
	@Column(name = "status")
	private String status;
	@Column(name = "card")
	Card card;
	
	public PaymentEntity() {
		super();
	}
	
	public PaymentEntity(long paymentId, String type, String status, Card card) {
		super();
		this.paymentId = paymentId;
		this.type = type;
		this.status = status;
		this.card = card;
	}

	public long getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", type=" + type + ", status=" + status + "]";
	}

}
