package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.Exception.PaymentNotFoundException;
import com.example.onlinesportshopee.dao.IPaymentRepository;
import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.model.Payment;
import com.example.onlinesportshopee.util.*;

@Service
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentRepository paymentRepository;
	//ghhh
	@Override
	public Payment addPayment(PaymentEntity paymentPayment) {
		
		PaymentEntity paymentEntity=paymentRepository.save(paymentPayment);
		return PaymentUtils.convertToPayment(paymentEntity);
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
	public Payment getPaymentDetails(long paymentID) throws PaymentNotFoundException {
		PaymentEntity getPaymentDetails= paymentRepository.findById(paymentID).get();
		if (paymentID == 0)
			throw new PaymentNotFoundException("orderNotFound");
		return PaymentUtils.convertToPayment(getPaymentDetails);
		
	}

	@Override
	public List<Payment> getAllPaymentDetails(String name) {
		List<PaymentEntity> getAllPaymentDetails = paymentRepository.findAll();
		return PaymentUtils.convertToPaymentList(getAllPaymentDetails);
	}

}
