package com.example.onlinesportshopee.entities;

import javax.persistence.*;


import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;


@Entity
@Table(name="card")
public class CardEntity {

	@Id
	//@Column(name = "cardId")
	private Long id;
	@Column(name = "cardName")
	private String cardName;
	@Column(name = "cardNumber")
	private String cardNumber;
	@Column(name = "expiryDate")
	private LocalDate expiryDate;
	@Column(name = "bankName")
	private String bankName;
	@ManyToOne
	@JoinColumn(name="id")
	private PaymentEntity paymentEntity;
	
	public CardEntity() {
		super();
	}
	public CardEntity(Long id, String cardName, String cardNumber, LocalDate expiryDate, String bankName,PaymentEntity paymentEntity) {
		super();
		this.id= id;
    	this.cardName= cardName;
		this.cardNumber= cardNumber;
		this.expiryDate= expiryDate;
		this.bankName= bankName;
		this.paymentEntity=paymentEntity;
	}
	public Long getID() {
		return id;
	}
	public void setID(Long id) {
		this.id = id;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {

		this.expiryDate = expiryDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
		
	}
	
	public PaymentEntity getPaymentEntity() {
		return paymentEntity;
	}
	public void setPaymentEntity(PaymentEntity paymentEntity) {
		this.paymentEntity = paymentEntity;
	}
	@Override
	public String toString() {
		return "CardEntity [id=" + id + ", cardName=" + cardName + ", cardNumber=" + cardNumber + ", expiryDate="
				+ expiryDate + ", bankName=" + bankName + ", paymentEntity=" + paymentEntity + "]";
	}

}