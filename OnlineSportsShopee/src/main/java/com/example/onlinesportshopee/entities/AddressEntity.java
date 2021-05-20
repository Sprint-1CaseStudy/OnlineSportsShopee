package com.example.onlinesportshopee.entities;

import javax.persistence.*;

import com.example.onlinesportshopee.entities.CustomerEntity;

@Entity
@Table(name = "address")
public class AddressEntity 
{

	@Id
	//@Column(name = "doorNo")
	private String doorNo;
	@Column(name = "street")
	private String street;
	@Column(name = "area")
	private String area;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "pincode")
	private Integer pincode;
	
	@ManyToOne
    @JoinColumn(name = "userid" ) 
    private CustomerEntity customerEntity;

	public AddressEntity()
	{
		super();
	}
	
	public AddressEntity(String doorNo, String street, String area, String city, String state, Integer pincode,
			CustomerEntity customerEntity) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.customerEntity = customerEntity;

	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
		
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	@Override
	public String toString() {
		return "AddressEntity [doorNo=" + doorNo + ", street=" + street + ", area=" + area + ", city=" + city
				+ ", state=" + state + ", pincode=" + pincode + ", customerEntity=" + customerEntity + "]";
	}

	
	
}
