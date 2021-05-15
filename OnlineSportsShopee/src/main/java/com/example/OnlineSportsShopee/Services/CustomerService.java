package com.example.OnlineSportsShopee.Services;

import java.util.List;
import com.example.OnlineSportsShopee.Model.Customer;
import com.example.OnlineSportsShopee.Entities.CustomerEntity;

public interface CustomerService {
	
		public Customer addCustomer(Customer customer);
		public Customer removeCustomer(long custId);
		public Customer updateCustomer(long custId, Customer customer);
		public Customer getCustomer(long custId);
		public List<Customer> getAllCustomers(); 
}
