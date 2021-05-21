package com.example.onlinesportshopee.model;

import java.util.List;

import com.example.onlinesportshopee.entities.CardEntity;

public class Payment {

	private Long id;
	private String type;
	private String status;
	private List<CardEntity> cards;

	public Payment() {
		super();
	}
	
	public Payment(Long id, String type, String status, List<CardEntity> cards) {
		super();
		this.id = id;
		this.type = type;
		this.status = status;
		this.cards = cards;
	}

	public Long getID() {
		return id;
	}
	public void setID(Long id) {
		this.id = id;
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
	
	public List<CardEntity> getCardEntity() {
		return cards;
	}

	public void setCardEntity(List<CardEntity> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", type=" + type + ", status=" + status + ", cards=" + cards + "]";
	}

	
	
}
