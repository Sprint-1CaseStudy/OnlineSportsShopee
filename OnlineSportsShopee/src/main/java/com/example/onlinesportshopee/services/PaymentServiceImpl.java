package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IPaymentRepository;
import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.exception.PaymentNotFoundException;
import com.example.onlinesportshopee.model.Payment;
import com.example.onlinesportshopee.util.*;

@Service
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentRepository iPaymentRepository;
	//ghhh
	@Override
	public Payment addPayment(PaymentEntity paymentPayment) {
		
		PaymentEntity paymentEntity=iPaymentRepository.save(paymentPayment);
		return PaymentUtils.convertToPayment(paymentEntity);
	}

	@Override
	public Payment removePayment(long paymentID) {
		
		PaymentEntity paymentEntity=iPaymentRepository.findById(paymentID).get();
		iPaymentRepository.delete(paymentEntity);
		return PaymentUtils.convertToPayment(paymentEntity);
		
	}

	@Override
	public Payment updatePayment(long paymentID, PaymentEntity payment) {
		PaymentEntity paymentEntity=iPaymentRepository.findById(paymentID).get();
		iPaymentRepository.save(paymentEntity);
		return PaymentUtils.convertToPayment(paymentEntity);
		
	}

	@Override
	public Payment getPaymentDetails(long paymentID) throws PaymentNotFoundException {
		PaymentEntity getPaymentDetails= iPaymentRepository.findById(paymentID).get();
		if (paymentID == 0)
			throw new PaymentNotFoundException("orderNotFound");
		return PaymentUtils.convertToPayment(getPaymentDetails);
		
	}

	@Override
	public List<Payment> getAllPaymentDetails(String name) {
		List<PaymentEntity> getAllPaymentDetails = iPaymentRepository.findAll();
		return PaymentUtils.convertToPaymentList(getAllPaymentDetails);
	}

}
