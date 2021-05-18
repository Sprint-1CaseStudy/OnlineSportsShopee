package com.example.onlinesportshopee.services;

import java.util.List;

import com.example.onlinesportshopee.entities.CustomerEntity;
import com.example.onlinesportshopee.model.Customer;

public interface CustomerService {

		public Customer addCustomer(CustomerEntity customer);
		public Customer removeCustomer(long custId);
		public Customer updateCustomer(long custId, CustomerEntity customer);
		public Customer getCustomer(long custId);
		public List<Customer> getAllCustomers(); 
}
