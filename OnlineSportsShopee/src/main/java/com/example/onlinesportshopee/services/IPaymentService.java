package com.example.onlinesportshopee.services;

import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.model.Payment;

import java.util.List;

public interface IPaymentService {
	
	public Payment addPayment(PaymentEntity payment);
	public Payment removePayment(long id);
	public Payment updatePayment(long id, PaymentEntity payment);
	public Payment getPaymentDetails(long id);
	public List<Payment> getAllPaymentDetails();
}
