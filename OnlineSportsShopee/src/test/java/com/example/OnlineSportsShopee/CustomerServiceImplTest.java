package com.example.OnlineSportsShopee;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.opentest4j.AssertionFailedError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.onlinesportshopee.entities.CustomerEntity;
import com.example.onlinesportshopee.entities.AddressEntity;
import com.example.onlinesportshopee.entities.OrderEntity;
import com.example.onlinesportshopee.exception.CustomerNotFoundException;
import com.example.onlinesportshopee.model.Customer;
import com.example.onlinesportshopee.services.ICustomerService;



@SpringBootTest
class CustomerServiceImplTest {

	final static Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImplTest.class);
	
	@Autowired
	ICustomerService icustomerservice;
	
	CustomerEntity customerentity = null;
	
	@BeforeAll
	public static void init()
	{
		LOGGER.info("Customer Testing Initiated");
	}
	
	void testaddCustomer01() throws CustomerNotFoundException {
		LOGGER.info("Testing testaddCustomer01()");
		AddressEntity addressentity = new AddressEntity();
		CustomerEntity customerentity = new CustomerEntity();
	}
	
	@AfterAll
	public static void end() {
		LOGGER.info("Customer Testing Terminated");
	}

}
//