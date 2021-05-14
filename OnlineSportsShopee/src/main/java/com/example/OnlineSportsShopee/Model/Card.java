package com.example.OnlineSportsShopee.Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Card {
	private long id;
	private String cardName;
	private String cardNumber;
    private LocalDate cardExpiry;
    private String bankName;
    public Card(long id, String cardName, String cardNumber, LocalDate cardExpiry, String bankName) {
		this.id= id;
    	this.cardName= cardName;
		this.cardNumber= cardNumber;
		this.cardExpiry= cardExpiry;
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

	public LocalDate getCardExpiry() {
		return cardExpiry;
	}

	public void setCardExpiry(LocalDate cardExpiry) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM/yyyy");
		this.cardExpiry = cardExpiry;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	
    @Override
	public String toString() {
		return "Card [id=" + id + ", cardName=" + cardName + ", cardNumber=" + cardNumber + ", cardExpiry=" + cardExpiry
				+ ", bankName=" + bankName + "]";
	}

}
