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
	private ICustomerRepository icustomerRepository;
	
	@Override
	public Customer addCustomer(CustomerEntity customer) throws CustomerNotFoundException {
		CustomerEntity customerentity;
		if(customer == null)
			customerentity = null;
		else {
			customerentity = icustomerRepository.save(customer);
		}
		return 
				CustomerUtils.convertToCustomer(customerentity);
	}

	@Override
	public Customer removeCustomer(long custId) throws CustomerNotFoundException{
		CustomerEntity existcustomer = icustomerRepository.findById(custId).orElse(null);
		if(existcustomer == null)
		{
			throw new CustomerNotFoundException("CustomerNotFound");
		}
		else {
			icustomerRepository.delete(existcustomer);
		}
		return CustomerUtils.convertToCustomer(existcustomer);
	}

	@Override
	public Customer updateCustomer(long custId, CustomerEntity customer) throws CustomerNotFoundException{
		// TODO Auto-generated method stub
		CustomerEntity customerentity = null;
		CustomerEntity updatecustomer = icustomerRepository.findById(custId).orElse(null);
		if(updatecustomer == null)
		{
			throw new CustomerNotFoundException("CustomerNotFound");
		}
		else {
			customerentity = icustomerRepository.save(customer);
		}
		return CustomerUtils.convertToCustomer(customerentity);
	}

	@Override
	public Customer getCustomer(long custId) throws CustomerNotFoundException{
		CustomerEntity getCustomer = icustomerRepository.findById(custId).orElse(null);
		if(getCustomer == null)
		{
			throw new CustomerNotFoundException("CustomerNotFound");
		}
		return CustomerUtils.convertToCustomer(getCustomer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<CustomerEntity> custlist = icustomerRepository.findAll();
		return CustomerUtils.convertToCustomerList(custlist);
	}
}
