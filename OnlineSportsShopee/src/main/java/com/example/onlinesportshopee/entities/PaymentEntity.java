package com.example.onlinesportshopee.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
//@Table(name = "payment")
public class PaymentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "paymentId")
	private Long paymentId;
	@Column(name = "type")
	private String type;
	@Column(name = "status")
	private String status;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "card_id")
	@Column(name = "cardEntity")
	private List<CardEntity> cards=new ArrayList<CardEntity>();

	public PaymentEntity() {
		super();
	}
	
	public PaymentEntity(Long paymentId, String type, String status, List<CardEntity> cards) {
		super();
		this.paymentId = paymentId;
		this.type = type;
		this.status = status;
		this.cards = cards;
	}

	public Long getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(Long paymentId) {
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
	
	/*
	 * public CardEntity getCardEntity() { return cardEntity; }
	 * 
	 * public void setCardEntity(CardEntity cardEntity) { this.cardEntity =
	 * cardEntity; }
	 */

	@Override
	public String toString() {
		return "PaymentEntity [paymentId=" + paymentId + ", type=" + type + ", status=" + status +  "]";
	}

	

}
