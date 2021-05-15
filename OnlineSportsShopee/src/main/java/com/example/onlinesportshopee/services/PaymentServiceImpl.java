package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IPaymentRepository;
import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.model.Payment;

@Service
public class PaymentServiceImpl implements IPaymentService{

	@Autowired
	private IPaymentRepository PaymentServiceImpl;
	
	@Override
	public Payment addPayment(PaymentEntity payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment removePayment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePayment(long id, PaymentEntity payment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPaymentDetails(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Payment> getAllPaymentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
