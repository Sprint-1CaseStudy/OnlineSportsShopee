package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.cars.util.PaymentUtils;
import com.example.onlinesportshopee.dao.IPaymentRepository;
import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.entities.ProductEntity;
import com.example.onlinesportshopee.model.Payment;
import com.example.onlinesportshopee.util.*;

@Service
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentRepository paymentRepository;
	
	@Override
	public Payment addPayment(PaymentEntity payment) {
		
		Payment paymentEntity=payment.save(payment);
		return PaymentUtils.convertToPayment(paymentEntity);
	}

	@Override
	public Payment removePayment(long paymentID) {
		PaymentServiceImpl.delete(PaymentUtils.convertToPayment(paymentID));
	}

	@Override
	public Payment updatePayment(long paymentID, PaymentEntity paymentEntity) {
		paymentRepository.save(PaymentUtils.convertToPayment(paymentEntity));
	}

	@Override
	public Payment getPaymentDetails(long paymentID) {
		PaymentEntity getPaymentDetails= paymentRepository.findById(paymentId).get();
		return PaymentUtils.convertToPayment(getPayment);
	}

	@Override
	public List<Payment> getAllPaymentDetails(String name) {
		List<PaymentEntity> getAllPaymentDetails = paymentRepository.findAll();
		return ProductUtils.convertToProductDtoList(getAllPaymentDetails);
	}

}
