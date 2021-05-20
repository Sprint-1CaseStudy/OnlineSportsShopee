package com.example.onlinesportshopee.entities;

import java.time.LocalDate;


import javax.persistence.*;

import com.example.onlinesportshopee.model.Address;
import com.example.onlinesportshopee.entities.AddressEntity;

@Entity
//@Table(name = "Customer")
public class CustomerEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name = "user_id")
	private String userID;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "contactno")
	private String contactNo;
	@Column(name = "DateOfBirth")
	private LocalDate doB;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private AddressEntity addressEntity;
	@OneToOne(mappedBy="customerEntity",cascade=CascadeType.ALL)
	private OrderEntity orderEntity;
	
	
	public CustomerEntity() {
		super();
	}
	
	public CustomerEntity(String userID, String name, String email, String contactNo, LocalDate doB, AddressEntity addressEntity,OrderEntity orderEntity) 
	{
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.contactNo = contactNo;
		this.doB = doB;
		this.addressEntity = addressEntity;
		this.orderEntity=orderEntity;
		
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
	public AddressEntity getAddressEntity()
	{
		return addressEntity;
	}
	public void setAddressEntity(AddressEntity addressEntity)
	{
		this.addressEntity = addressEntity;
	}
	

	public OrderEntity getOrderEntity() {
		return orderEntity;
	}

	public void setOrderEntity(OrderEntity orderEntity) {
		this.orderEntity = orderEntity;
	}

	@Override
	public String toString() {
		return "CustomerEntity [userID=" + userID + ", name=" + name + ", email=" + email + ", contactNo=" + contactNo
				+ ", doB=" + doB + ", addressEntity=" + addressEntity + ", orderEntity=" + orderEntity + "]";
	}


}
