package com.example.onlinesportshopee.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.ICustomerRepository;
import com.example.onlinesportshopee.entities.CustomerEntity;
import com.example.onlinesportshopee.exception.CustomerNotFoundException;
import com.example.onlinesportshopee.model.Customer;
import com.example.onlinesportshopee.util.CustomerUtils;

@Service
public class CustomerServiceImpl implements ICustomerService {
//
		
	@Autowired
	private ICustomerRepository iCustomerRepository;
	
	@Override
	public Customer addCustomer(CustomerEntity customer) throws CustomerNotFoundException {
		CustomerEntity customerentity;
		if(customer == null)
			customerentity = null;
		else {
			customerentity = iCustomerRepository.save(customer);
		}
		return 
				CustomerUtils.convertToCustomer(customerentity);
	}

	@Override
	public Customer removeCustomer(long custId) throws CustomerNotFoundException{
		CustomerEntity existcustomer = iCustomerRepository.findById(custId).orElse(null);
		if(existcustomer == null)
		{
			throw new CustomerNotFoundException("CustomerNotFound");
		}
		else {
			iCustomerRepository.delete(existcustomer);
		}
		return CustomerUtils.convertToCustomer(existcustomer);
	}

	@Override
	public Customer updateCustomer(long custId, CustomerEntity customer) throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		CustomerEntity customerentity = null;
		CustomerEntity updatecustomer = iCustomerRepository.findById(custId).orElse(null);
		if(updatecustomer == null)
		{
			throw new CustomerNotFoundException("CustomerNotFound");
		}
		else {
			customerentity = iCustomerRepository.save(customer);
		}
		return CustomerUtils.convertToCustomer(customerentity);
	}

	@Override
	public Customer getCustomer(long custId) throws CustomerNotFoundException{
		CustomerEntity getCustomer = iCustomerRepository.findById(custId).orElse(null);
		if(getCustomer == null)
		{
			throw new CustomerNotFoundException("CustomerNotFound");
		}
		return CustomerUtils.convertToCustomer(getCustomer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<CustomerEntity> custlist = iCustomerRepository.findAll();
		return CustomerUtils.convertToCustomerList(custlist);
	}
}
