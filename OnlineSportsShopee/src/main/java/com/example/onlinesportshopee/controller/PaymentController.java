package com.example.onlinesportshopee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.entities.PaymentEntity;
import com.example.onlinesportshopee.model.Payment;
import com.example.onlinesportshopee.services.IPaymentService;
import com.example.onlinesportshopee.Exception.PaymentNotFoundException;

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
	public ResponseEntity<Object> removePayment(@PathVariable long paymentId) throws PaymentNotFoundException
	{
		Payment paymentDTO = null;
		ResponseEntity<Object> paymentResponse = null;
		paymentDTO = paymentService.removePayment(paymentId);
		paymentResponse = new ResponseEntity<>(paymentDTO, HttpStatus.ACCEPTED);
		return paymentResponse;
		}
	
	@PutMapping("/updatePayment/{paymentId}")
	public ResponseEntity<Object> updatePayment(@PathVariable long paymentId, @RequestBody PaymentEntity paymentEntity)  throws PaymentNotFoundException
	{
		Payment paymentDTO = null;
		ResponseEntity<Object> paymentResponse = null;
		paymentDTO = paymentService.updatePayment(paymentId,paymentEntity);
		paymentResponse = new ResponseEntity<>(paymentDTO, HttpStatus.ACCEPTED);
		
		return paymentResponse;
	}
	
	@GetMapping("/getPaymentDetails/{paymentId}")
	public ResponseEntity<Object> getPaymentDetails(@PathVariable long paymentId) throws PaymentNotFoundException
	{
		
		Payment paymentDTO =null;
		ResponseEntity<Object> paymentResponse = null;
		paymentDTO = paymentService.getPaymentDetails(paymentId);;
		paymentResponse = new ResponseEntity<>(paymentDTO, HttpStatus.ACCEPTED);
		return paymentResponse;
		}
	@GetMapping("/payment/{name}")
	public List<Payment> getAllPaymentByName(@PathVariable String name)
	{
		return paymentService.getAllPaymentDetails(name); 		
	}
	
}
