package com.example.OnlineSportsShopee.Services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.OnlineSportsShopee.Entities.CustomerEntity;
import com.example.OnlineSportsShopee.Model.Customer;
import com.example.OnlineSportsShopee.Dao.ICustomerRepository;
//
@Service
public class CustomerServiceImpl implements CustomerService {

	//static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	//static String CustomerNotFound = "No Customer found in given ID";
	
	//static String validationSuccessful = "Validation Successful";
	
	@Autowired
	private ICustomerRepository CustRepo;
	
	@Override
	public Customer addCustomer(CustomerEntity customer) {
		// TODO Auto-generated method stub
		LOGGER.info("addCustomer() Service is initiated");
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
