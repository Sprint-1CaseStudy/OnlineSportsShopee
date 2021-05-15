package com.example.onlinesportshopee.entities;

import javax.persistence.*;
<<<<<<< HEAD
=======



>>>>>>> branch 'master' of https://github.com/Sprint-1CaseStudy/OnlineSportsShopee.git
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
<<<<<<< HEAD
=======


>>>>>>> branch 'master' of https://github.com/Sprint-1CaseStudy/OnlineSportsShopee.git
import javax.persistence.*;


@Entity
@Table(name="Card")

public class CardEntity {
	@Column(name = "id")
	private long id;
	@Column(name = "cardName")
	private String cardName;
	@Column(name = "cardNumber")
	private String cardNumber;
	@Column(name = "expiryDate")
	private LocalDate expiryDate;
	@Column(name = "bankName")
	private String bankName;
	
	public CardEntity() {
		super();
	}
	public CardEntity(long id, String cardName, String cardNumber, LocalDate expiryDate, String bankName) {
		super();
		this.id= id;
    	this.cardName= cardName;
		this.cardNumber= cardNumber;
		this.expiryDate= expiryDate;
		this.bankName= bankName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/yyyy");
		this.expiryDate = expiryDate;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "CardEntity [id=" + id + ", cardName=" + cardName + ", cardNumber=" + cardNumber + ", expiryDate="
				+ expiryDate + ", bankName=" + bankName + "]";
	}

}