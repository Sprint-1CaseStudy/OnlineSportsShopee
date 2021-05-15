package com.example.OnlineSportsShopee.Services;

import java.util.List;


import com.example.OnlineSportsShopee.Entities.CustomerEntity;
import com.example.OnlineSportsShopee.Model.Customer;

public interface CustomerService {
	//
	//
		public Customer addCustomer(CustomerEntity customer);
		public Customer removeCustomer(long custId);
		public Customer updateCustomer(long custId, CustomerEntity customer);
		public Customer getCustomer(long custId);
		public List<Customer> getAllCustomers(); 
}
