package com.example.onlinesportshopee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.onlinesportshopee.dao.IAddressRepository;
import com.example.onlinesportshopee.entities.AddressEntity;
import com.example.onlinesportshopee.exception.AddressNotFoundException;
import com.example.onlinesportshopee.model.Address;
import com.example.onlinesportshopee.util.AddressUtils;

@Service
public class AddressServiceImpl {

	@Autowired
	private IAddressRepository iaddressRepository;
	
	public Address addAddress(AddressEntity address) throws AddressNotFoundException {
		AddressEntity addressentity;
		if(address == null)
			addressentity = null;
		else {
			addressentity = iaddressRepository.save(address);
		}
		return 
				AddressUtils.convertToAddress(addressentity);
	}
	
	public Address removeAddress(long custId) throws AddressNotFoundException{
		AddressEntity existaddress = iaddressRepository.findById(custId).orElse(null);
		if(existaddress == null)
		{
			throw new AddressNotFoundException("AddressNotFound");
		}
		else {
			iaddressRepository.delete(existaddress);
		}
		return AddressUtils.convertToAddress(existaddress);
	}
	
	public Address updateAddress(long custId, AddressEntity address) throws AddressNotFoundException{
		// TODO Auto-generated method stub
		AddressEntity addressentity = null;
		AddressEntity updateaddress = iaddressRepository.findById(custId).orElse(null);
		if(updateaddress == null)
		{
			throw new AddressNotFoundException("AddressNotFound");
		}
		else {
			addressentity = iaddressRepository.save(address);
		}
		return AddressUtils.convertToAddress(addressentity);
	}
	
	public Address getAddress(long custId) throws AddressNotFoundException{
		AddressEntity getAddress = iaddressRepository.findById(custId).orElse(null);
		if(getAddress == null)
		{
			throw new AddressNotFoundException("AddressNotFound");
		}
		return AddressUtils.convertToAddress(getAddress);
	}
	
}
