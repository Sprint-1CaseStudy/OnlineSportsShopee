package com.example.onlinesportshopee.util;

import java.util.ArrayList;
import java.util.List;
import com.example.onlinesportshopee.entities.CustomerEntity;
import com.example.onlinesportshopee.model.Customer;

public class CustomerUtils 
{
	private CustomerUtils()
	{
		
	}
	public static List<Customer> convertToCustomerList(List<CustomerEntity> list){
		List<Customer> Customerlist = new ArrayList<>();
		for(CustomerEntity cust : list) 
			Customerlist.add(convertToCustomer(cust));
		return Customerlist;
	}
	
	public static CustomerEntity convertToCustomerEntity(Customer customer) {
		CustomerEntity customerentity = new CustomerEntity();
		customerentity.setUserID(customer.getUserID());
		customerentity.setName(customer.getName());
		customerentity.setEmail(customer.getEmail());
		customerentity.setContactNo(customer.getContactNo());
		customerentity.setDoB(customer.getDoB());
		customerentity.setaddress(customer.getaddress());
		return customerentity;
	}		
	
	public static Customer convertToCustomer(CustomerEntity customerentity) {
		Customer customer = new Customer();
		customer.setUserID(customerentity.getUserID());
		customer.setName(customerentity.getName());
		customer.setEmail(customerentity.getEmail());
		customer.setContactNo(customerentity.getContactNo());
		customer.setDoB(customerentity.getDoB());
		customer.setaddress(customerentity.getaddress());
		return customer;
	}
}
