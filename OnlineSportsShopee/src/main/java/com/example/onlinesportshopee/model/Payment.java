package com.example.onlinesportshopee.model;

import com.example.onlinesportshopee.entities.CardEntity;

public class Payment {

	private long paymentId;
	private String type;
	private String status;
	CardEntity cardEntity;

	public Payment() {
		super();
	}
	
	public Payment(long paymentId, String type, String status, CardEntity cardEntity) {
		super();
		this.paymentId = paymentId;
		this.type = type;
		this.status = status;
		this.cardEntity = cardEntity;
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
	
	public CardEntity getCardEntity() {
		return cardEntity;
	}

	public void setCardEntity(CardEntity cardEntity) {
		this.cardEntity = cardEntity;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", type=" + type + ", status=" + status + "]";
	}	
	
}
