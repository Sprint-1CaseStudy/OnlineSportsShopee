package com.example.onlinesportshopee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.model.Payment;
import com.example.onlinesportshopee.services.IPaymentService;

@RestController
@RequestMapping("/payments")

public class PaymentController {
	
	@Autowired
	private IPaymentService paymentService;
	
	@PostMapping("/addPayment")
	public Payment addPayment(@RequestBody PaymentEntity payment)
	{
		return paymentService.addPayment(payment);
	}
	
	@DeleteMapping("/removePayment/payment/{paymentId}")
	public Payment removePayment(@PathVariable long paymentId)
	{
		return paymentService.removeProduct(paymentId);
	}
	
	@PutMapping("/updatePayment/{paymentId}")
	public Payment updatePayment(@PathVariable long paymentId, @RequestBody PaymentEntity payment)
	{
		return paymentService.updatePayment(paymentId, payment);
	}
	
	@GetMapping("/getPaymentDetails/{paymentId}")
	public Payment getPaymentDetails(@PathVariable long paymentId)
	{
		return paymentService.getPaymentDetails(paymentId);
	}
	@GetMapping("/payment/{name}")
	public List<Payment> getAllPaymentByName(@PathVariable String name)
	{
		return paymentService.getAllPaymentByName(name); 		
	}
	
}
