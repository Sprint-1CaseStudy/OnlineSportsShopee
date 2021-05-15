package com.example.onlinesportshopee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.ICustomerRepository;
import com.example.onlinesportshopee.entities.CustomerEntity;
import com.example.onlinesportshopee.model.Customer;
//
@Service
public class CustomerServiceImpl implements CustomerService {

	//static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	//
	//static String CustomerNotFound = "No Customer found in given ID";
	
	//static String validationSuccessful = "Validation Successful";
	
	@Autowired
	private ICustomerRepository CustRepo;
	
	@Override
	public Customer addCustomer(CustomerEntity customer) {
		CustomerEntity customerentity;
		if(customer == null)
			customerentity = null;
		else {
			//validateCustomer(customer);
		}
		return null;
	}

	@Override
	public Customer removeCustomer(long custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(long custId, CustomerEntity customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getCustomer(long custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
