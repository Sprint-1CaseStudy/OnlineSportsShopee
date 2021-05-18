package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IPaymentRepository;
import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.model.Payment;
import com.example.onlinesportshopee.util.*;

@Service
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentRepository paymentRepository;
	//ghhh
	@Override
	public Payment addPayment(PaymentEntity payment) {
		
		PaymentEntity paymentEntity=paymentRepository.save(payment);
		return PaymentUtils.convertToPayment(payment);
	}

	@Override
	public Payment removePayment(long paymentID) {
		
		PaymentEntity paymentEntity=paymentRepository.findById(paymentID).get();
		paymentRepository.delete(paymentEntity);
		return PaymentUtils.convertToPayment(paymentEntity);
		
	}

	@Override
	public Payment updatePayment(long paymentID, PaymentEntity payment) {
		PaymentEntity paymentEntity=paymentRepository.findById(paymentID).get();
		paymentRepository.save(paymentEntity);
		return PaymentUtils.convertToPayment(paymentEntity);
		
	}

	@Override
	public Payment getPaymentDetails(long paymentID) {
		PaymentEntity getPaymentDetails= paymentRepository.findById(paymentID).get();
		return PaymentUtils.convertToPayment(getPaymentDetails);
		
	}

	@Override
	public List<Payment> getAllPaymentDetails(String name) {
		List<PaymentEntity> getAllPaymentDetails = paymentRepository.findAll();
		return PaymentUtils.convertToPaymentList(getAllPaymentDetails);
	}

}
