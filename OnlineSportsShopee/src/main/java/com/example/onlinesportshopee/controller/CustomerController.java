package com.example.onlinesportshopee.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.entities.CustomerEntity;
import com.example.onlinesportshopee.exception.CustomerNotFoundException;
import com.example.onlinesportshopee.model.Customer;
import com.example.onlinesportshopee.services.CustomerServiceImpl;
import com.example.onlinesportshopee.services.ICustomerService;

//
@RestController
@RequestMapping("/customers")
public class CustomerController 
{
	@Autowired
	private ICustomerService iCustomerService;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody CustomerEntity customer) throws CustomerNotFoundException {
		return iCustomerService.addCustomer(customer);
	}
	
	@DeleteMapping("/removeCustomer/Customer/{custId}")
	public Customer removeCustomer(@PathVariable long custId) throws CustomerNotFoundException {
		return iCustomerService.removeCustomer(custId);
	}

	@PutMapping("/updateCustomer/{custId}")
	public Customer updateCustomer(@PathVariable long custId,@RequestBody CustomerEntity customer) throws CustomerNotFoundException {
		return iCustomerService.updateCustomer(custId, customer);
	}

	@GetMapping("/getCustomerDetails/{custId}")
	public Customer getCustomer(@PathVariable long custId) throws CustomerNotFoundException {
		return iCustomerService.getCustomer(custId);
	}

	@GetMapping("/Customers/{name}")
	public List<Customer> getAllCustomers(@PathVariable String name) {
		return iCustomerService.getAllCustomers();
	}
	
}
