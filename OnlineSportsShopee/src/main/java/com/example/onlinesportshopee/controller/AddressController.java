package com.example.onlinesportshopee.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.example.onlinesportshopee.entities.AddressEntity;
import com.example.onlinesportshopee.exception.AddressNotFoundException;
import com.example.onlinesportshopee.model.Address;
import com.example.onlinesportshopee.services.AddressServiceImpl;
import com.example.onlinesportshopee.services.IAddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressServiceImpl addressServiceImpl;

	@PostMapping("/addAddress")
	public Address addAddress(@RequestBody AddressEntity address) throws AddressNotFoundException {
		return addressServiceImpl.addAddress(address);
	}

	@DeleteMapping("/removeAddress/Address/{custId}")
	public Address removeAddress(@PathVariable long custId) throws AddressNotFoundException {
		return addressServiceImpl.removeAddress(custId);
	}

	@PutMapping("/updateAddress/{custId}")
	public Address updateAddress(@PathVariable long custId,@RequestBody AddressEntity address) throws AddressNotFoundException {
		return addressServiceImpl.updateAddress(custId, address);
	}

	@GetMapping("/getAddressDetails/{custId}")
	public Address getAddress(@PathVariable long custId) throws AddressNotFoundException {
		return addressServiceImpl.getAddress(custId);
	}
	
	

}
