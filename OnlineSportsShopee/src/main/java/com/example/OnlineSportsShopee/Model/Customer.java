package com.example.OnlineSportsShopee.Model;

import com.example.OnlineSportsShopee.Model.Address;
import java.time.LocalDate;

public class Customer 
{
	private String userID;
	private String name;
	private String email;
	private String contactNo;
	private LocalDate doB;
	private Address address;
	
	public Customer(String userID, String name, String email, String contactNo, LocalDate doB, Address address) 
	{
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.doB = doB;
		this.address = address;
	}

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public LocalDate getDoB() {
		return doB;
	}
	public void setDoB(LocalDate doB) {
		this.doB = doB;
	}

	@Override
	public String toString() {
		return "Customer [userID=" + userID + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", doB=" + doB + ", address=" + address + "]";
	}
	
}
