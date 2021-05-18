package com.example.onlinesportshopee.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.Exception.CustomerNotFoundException;
import com.example.onlinesportshopee.dao.ICustomerRepository;
import com.example.onlinesportshopee.entities.CustomerEntity;
import com.example.onlinesportshopee.model.Customer;
import com.example.onlinesportshopee.util.CustomerUtils;

@Service
public class CustomerServiceImpl implements ICustomerService {
//
		
	@Autowired
	private ICustomerRepository CustRepo;
	
	@Override
	public Customer addCustomer(CustomerEntity customer) throws CustomerNotFoundException {
		CustomerEntity customerentity;
		if(customer == null)
			customerentity = null;
		else {
			customerentity = CustRepo.save(customer);
		}
		return 
				CustomerUtils.convertToCustomer(customerentity);
	}

	@Override
	public Customer removeCustomer(long custId) throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		CustomerEntity existcustomer = CustRepo.findById(custId).orElse(null);
		if(existcustomer == null)
		{
			
		}
		else {
			CustRepo.delete(existcustomer);
		}
		return CustomerUtils.convertToCustomer(existcustomer);
	}

	@Override
	public Customer updateCustomer(long custId, CustomerEntity customer) throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		CustomerEntity customerentity = null;
		CustomerEntity updatecustomer = CustRepo.findById(custId).orElse(null);
		if(updatecustomer == null)
		{
			
		}
		else {
			customerentity = CustRepo.save(customer);
		}
		return CustomerUtils.convertToCustomer(customerentity);
	}

	@Override
	public Customer getCustomer(long custId) throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		CustomerEntity getCustomer = CustRepo.findById(custId).orElse(null);
		if(getCustomer == null)
		{
			
		}
		return CustomerUtils.convertToCustomer(getCustomer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		List<CustomerEntity> custlist = CustRepo.findAll();
		return CustomerUtils.convertToCustomerList(custlist);
	}
}
