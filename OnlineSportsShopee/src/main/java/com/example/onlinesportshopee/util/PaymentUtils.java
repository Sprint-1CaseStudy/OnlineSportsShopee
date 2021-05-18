package com.example.onlinesportshopee.util;

import java.util.ArrayList;
import java.util.List;

import com.example.onlinesportshopee.entities.OrderEntity;
import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.model.Order;
import com.example.onlinesportshopee.model.Payment;

public class PaymentUtils {
	private PaymentUtils()
	{
		
	}
	public static List<Payment> convertToPaymentList(List<PaymentEntity> list){
		List<Payment> paymentlist = new ArrayList<>();
		for(PaymentEntity paymentEntity : list) 
			paymentlist.add(convertToPayment(paymentEntity));
		return paymentlist;
	}
	 public static PaymentEntity convertToPayment(Payment paymentlist) {
		 PaymentEntity payment= new PaymentEntity();
		 payment.setPaymentId(payment.getPaymentId());
		 payment.setType(payment.getType());
	     payment.setStatus(payment.getStatus());
	     payment.setCard(payment.getCard());
	     return payment;
	    }        
	    
	    public static Payment convertToPayment(PaymentEntity paymentEntity) {
	        Payment payment = new Payment();
	        payment.setPaymentId(paymentEntity.getPaymentId());
	        payment.setType(paymentEntity.getType());
	        payment.setStatus(paymentEntity.getStatus());
	        payment.setCard(paymentEntity.getCard());
	        return payment;
	    }
	 }